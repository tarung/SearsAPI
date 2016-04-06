package com.rnb.searsapi.base;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/**
 * The Parser Utility class.
 */
public class ParserUtil {

	/** The logger. */
	private static final Logger logger = LoggerFactory.getLogger(ParserUtil.class);

	final com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();

	/**
	 * Parses the response json
	 *
	 * @param <T> the generic type defined by the class passed to this method.
	 * @param jsonParser the json parser
	 * @param clazz the class
	 * @param nestedLevels the nested levels
	 * @return the parsed object of type T.
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private <T> T parse(final JsonParser jsonParser, final Class<T> clazz, final int nestedLevels) throws IOException {

		final com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
		for (int i = 0; i < nestedLevels; i++) {
			jsonParser.nextToken();
		}
		if (jsonParser.nextToken() == JsonToken.START_OBJECT) {
			return mapper.readValue(jsonParser, clazz);
		}
		return null;
	}

	/**
	 * Actually makes the HTTP server call, and parses the search results.
	 *
	 * @param <T> the generic type defined by the class passed to this method.
	 * @param criteria the search criteria
	 * @param clazz the type of result object.
	 * @param nestedLevels the level at which the desired object will be present
	 *            in the response object.
	 * @return the parsed object of type T
	 * @throws Exception the exception
	 */
	@SuppressWarnings("deprecation")
	public <T> T performSearch(final BaseCriteria criteria, final Class<T> clazz, final int nestedLevels)
			throws Exception {

		final String completeUrl = criteria.getFullURL();
		HttpURLConnection con = null;
		mapper.configure(FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {

			logger.debug("Actual URL formed is: " + completeUrl);

			final URL u = new URL(completeUrl);
			con = (HttpURLConnection) u.openConnection();
			con.setRequestMethod("GET");
			if (con.getResponseCode() != 200) {
				throw new Exception("HTTP connection request to API failed for URL: " + completeUrl
						+ "\n HTTP error code: "
						+ con.getResponseCode());
			}
			final BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			final JsonFactory f = new JsonFactory();
			final JsonParser parser = f.createJsonParser(br);

			return parse(parser, clazz, nestedLevels);

		} catch (final MalformedURLException e) {
			final String msg = " Unable to connect to API service for URL: " + completeUrl;
			logger.error(msg, e);
			throw new Exception(msg, e);
		} catch (final IOException e) {
			final String msg = " Unable to connect to API service for URL: " + completeUrl;
			logger.error(msg, e);
			throw new Exception(msg, e);
		} finally {
			if (con != null) {
				con.disconnect();
			}
		}
	}
}
