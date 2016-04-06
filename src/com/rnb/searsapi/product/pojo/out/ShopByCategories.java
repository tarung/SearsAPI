package com.rnb.searsapi.product.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class ShopByCategories.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopByCategories {

	/** The category url. */
	@JsonProperty("CategoryUrl")
	private String categoryUrl;

	/** The category name. */
	@JsonProperty("CategoryName")
	private String categoryName;

	/** The ASAP enabled. */
	@JsonProperty("AsapEnabled")
	private String asapEnabled;

	/** The Agg Prod count - Total number of products under this category */
	@JsonProperty("AggProdCount")
	private String aggProdCount;

	/**
	 * The cat group id - a unique number which defines the search group details
	 * such as the searchType and category
	 */
	@JsonProperty("CatGroupId")
	private String catGroupId;

	@JsonProperty("IsLeafNode")
	private boolean leafNode;

	/**
	 * Gets the category url.
	 *
	 * @return the category url
	 */
	public String getCategoryUrl() {
		return categoryUrl;
	}

	/**
	 * Sets the category url.
	 *
	 * @param categoryUrl the new category url
	 */
	public void setCategoryUrl(final String categoryUrl) {
		this.categoryUrl = categoryUrl;
	}

	/**
	 * Gets the category name.
	 *
	 * @return the category name
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * Sets the category name.
	 *
	 * @param categoryName the new category name
	 */
	public void setCategoryName(final String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * Gets the asap enabled.
	 *
	 * @return the asap enabled
	 */
	public String getAsapEnabled() {
		return asapEnabled;
	}

	/**
	 * Sets the asap enabled.
	 *
	 * @param asapEnabled the new asap enabled
	 */
	public void setAsapEnabled(final String asapEnabled) {
		this.asapEnabled = asapEnabled;
	}

	/**
	 * Gets the agg prod count.
	 *
	 * @return the agg prod count
	 */
	public String getAggProdCount() {
		return aggProdCount;
	}

	/**
	 * Sets the agg prod count.
	 *
	 * @param aggProdCount the new agg prod count
	 */
	public void setAggProdCount(final String aggProdCount) {
		this.aggProdCount = aggProdCount;
	}

	/**
	 * Gets the cat group id.
	 *
	 * @return the cat group id
	 */
	public String getCatGroupId() {
		return catGroupId;
	}

	/**
	 * Sets the cat group id.
	 *
	 * @param catGroupId the new cat group id
	 */
	public void setCatGroupId(final String catGroupId) {
		this.catGroupId = catGroupId;
	}

	/**
	 * @return the leafNode
	 */
	public boolean isLeafNode() {
		return leafNode;
	}

	/**
	 * @param leafNode the leafNode to set
	 */
	public void setLeafNode(final boolean leafNode) {
		this.leafNode = leafNode;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("ShopByCategories [categoryUrl=").append(categoryUrl).append(", categoryName=")
				.append(categoryName).append(", asapEnabled=").append(asapEnabled).append(", aggProdCount=")
				.append(aggProdCount).append(", catGroupId=").append(catGroupId).append(", leafNode=").append(leafNode)
				.append("]");
		return builder.toString();
	}

}
