package com.rnb.searsapi.base;

import static com.rnb.searsapi.base.Constants.ACCEPT_JSON;
import static com.rnb.searsapi.base.Constants.ACCEPT_XML;
import static com.rnb.searsapi.base.Constants.API_KEY;
import static com.rnb.searsapi.base.Constants.CONTENT_JSON;
import static com.rnb.searsapi.base.Constants.CONTENT_XML;

import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The BaseCriteria, encapsulates common attributes and methods for all search
 * criteria classes
 *
 * @author tarung
 */
public abstract class BaseCriteria {

	/** The logger. */
	private static final Logger logger = LoggerFactory.getLogger(BaseCriteria.class);

	/** The configuration properties. */
	public static Properties CONFIG;

	/** The content. */
	private String content;

	/** The accept */
	private String accept;

	/** The api key. */
	private final String apiKey;

	static {
		InputStream is = null;
		try {
			CONFIG = new Properties();
			is = BaseCriteria.class.getClassLoader().getResourceAsStream("config.properties");
			CONFIG.load(is);
		} catch (final Exception e) {
			logger.error("Fatal errror: " + e.getMessage(), e);
		}
	}

	/**
	 * Instantiates a new base criteria default values.
	 */
	public BaseCriteria() {
		content = CONTENT_JSON;
		accept = ACCEPT_JSON;
		apiKey = CONFIG.getProperty(API_KEY);
	}

	/**
	 * Instantiates a new base criteria.
	 *
	 * @param content the content
	 * @param accept the accept
	 */
	public BaseCriteria(final String content, final String accept) {
		setContent(content);
		setAccept(accept);
		apiKey = CONFIG.getProperty(API_KEY);
	}

	/**
	 * Method that returns the full url formed by including all the parameters
	 * of this search criteria object.
	 *
	 * @return the full url as a String.
	 */
	public abstract String getFullURL();

	/**
	 * Gets the content type json/xml
	 *
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Sets the content type json/xml.
	 *
	 * @param content the new content json/xml
	 */
	public void setContent(final String content) {
		if (content == null || !content.equals(CONTENT_JSON) && !content.equals(CONTENT_XML)) {
			throw new IllegalArgumentException("Invalid value of Content Type: " + content);
		}
		this.content = content;
	}

	/**
	 * Gets the accept type application/json or application/xml
	 *
	 * @return the accept type
	 */
	public String getAccept() {
		return accept;
	}

	/**
	 * Sets the accept type application/json or application/xml.
	 *
	 * @param accept the new accept type
	 */
	public void setAccept(final String accept) {
		if (accept == null || !accept.equals(ACCEPT_JSON) && !accept.equals(ACCEPT_XML)) {
			throw new IllegalArgumentException("Invalid value of HTTP accept header parameter : " + content);
		}
		this.accept = accept;
	}

	/**
	 * Gets the API key to be used for the API.
	 *
	 * @return the API key
	 */
	public String getApiKey() {
		return apiKey;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("BaseCriteria [content=").append(content).append(", accept=").append(accept).append(", apiKey=")
				.append(apiKey).append("]");
		return builder.toString();
	}

}
