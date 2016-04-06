package com.rnb.searsapi.deals.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Search Results Wrapper for Hot Weekly Deals search.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DealCategoriesSearchResults {

	/** The Categories for the Hot Weekly Deals API. */
	@JsonProperty("category")
	private Category[] category;

	/**
	 * Gets the Categories for the Hot Weekly Deals API.
	 *
	 * @return the Categories for the Hot Weekly Deals API
	 */
	public Category[] getCategory() {
		return category;
	}

	/**
	 * Sets the Categories for the Hot Weekly Deals API.
	 *
	 * @param category the new Categories for the Hot Weekly Deals API
	 */
	public void setCategory(final Category[] category) {
		this.category = category;
	}

}
