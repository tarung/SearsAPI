package com.rnb.searsapi.product.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Additional HTTP URLs to the pages which are related to the product.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RelatedLinks {

	/** The Related name. */
	private String name;

	/** The url - Provides url to related item. */
	private String url;

	/**
	 * Gets the Related name.
	 *
	 * @return the Related name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the Related name.
	 *
	 * @param name the new Related name
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Gets the url - Provides url to related item.
	 *
	 * @return the url - Provides url to related item
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Sets the url - Provides url to related item.
	 *
	 * @param url the new url - Provides url to related item
	 */
	public void setUrl(final String url) {
		this.url = url;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("RelatedLinks [name=").append(name).append(", url=").append(url).append("]");
		return builder.toString();
	}

}
