package com.rnb.searsapi.junit;

import static junit.framework.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.rnb.searsapi.product.pojo.out.ProductSearchResults;

public class JacksonTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testFileParsing() {
		try {
			final JsonFactory f = new JsonFactory();
			final JsonParser jp = f.createJsonParser(new File(".\\bin\\productSearchResults.json"));
			final com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
			jp.nextToken();
			jp.nextToken();
			while (jp.nextToken() == JsonToken.START_OBJECT) {
				final ProductSearchResults res = mapper.readValue(jp, ProductSearchResults.class);
				assertEquals(res.getProductCount(), 737);
				System.out.println(res);
			}
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
}
