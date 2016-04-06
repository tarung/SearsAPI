package com.rnb.searsapi.deals.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Category for the Hot Weekly Deals API.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Category {

	/** The Category name. */
	private String name;

	/** The Category value. */
	private String value;

	/** The feed. */
	private String feed;

	/**
	 * Gets the Category name.
	 *
	 * @return the Category name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the Category name.
	 *
	 * @param name the new Category name
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Gets the Category value.
	 *
	 * @return the Category value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the Category value.
	 *
	 * @param value the new Category value
	 */
	public void setValue(final String value) {
		this.value = value;
	}

	/**
	 * Gets the feed.
	 *
	 * @return the feed
	 */
	public String getFeed() {
		return feed;
	}

	/**
	 * Sets the feed.
	 *
	 * @param feed the new feed
	 */
	public void setFeed(final String feed) {
		this.feed = feed;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Category [name=").append(name).append(", value=").append(value).append(", feed=").append(feed)
				.append("]");
		return builder.toString();
	}

}
