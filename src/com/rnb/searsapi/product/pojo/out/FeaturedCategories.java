package com.rnb.searsapi.product.pojo.out;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All featured categories data is wrapped in this class.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeaturedCategories
{

	/** The category. */
	@JsonProperty("Category")
	private String category;

	/**
	 * All products available under featured categories are provided in this
	 * array.
	 */
	@JsonProperty("Products")
	private ListProduct[] products;

	/** The rank of featured category. */
	@JsonProperty("Rank")
	private String rank;

	/** The Category Display Name. */
	@JsonProperty("DisplayName")
	private String displayName;

	/** The list product. */
	@JsonProperty("ListProduct")
	private ListProduct[] listProduct;

	/** The URL of preview image. */
	@JsonProperty("PreviewImageUrl")
	private String previewImageUrl;

	/**
	 * Gets the category.
	 *
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Sets the category.
	 *
	 * @param category the new category
	 */
	public void setCategory(final String category) {
		this.category = category;
	}

	/**
	 * Gets the all products available under featured categories are provided in
	 * this array.
	 *
	 * @return the all products available under featured categories are provided
	 *         in this array
	 */
	public ListProduct[] getProducts() {
		return products;
	}

	/**
	 * Sets the all products available under featured categories are provided in
	 * this array.
	 *
	 * @param products the new all products available under featured categories
	 *            are provided in this array
	 */
	public void setProducts(final ListProduct[] products) {
		this.products = products;
	}

	/**
	 * Gets the rank of featured category.
	 *
	 * @return the rank of featured category
	 */
	public String getRank() {
		return rank;
	}

	/**
	 * Sets the rank of featured category.
	 *
	 * @param rank the new rank of featured category
	 */
	public void setRank(final String rank) {
		this.rank = rank;
	}

	/**
	 * Gets the Category Display Name.
	 *
	 * @return the Category Display Name
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * Sets the Category Display Name.
	 *
	 * @param displayName the new Category Display Name
	 */
	public void setDisplayName(final String displayName) {
		this.displayName = displayName;
	}

	/**
	 * Gets the list product.
	 *
	 * @return the list product
	 */
	public ListProduct[] getListProduct() {
		return listProduct;
	}

	/**
	 * Sets the list product.
	 *
	 * @param listProduct the new list product
	 */
	public void setListProduct(final ListProduct[] listProduct) {
		this.listProduct = listProduct;
	}

	/**
	 * Gets the URL of preview image.
	 *
	 * @return the URL of preview image
	 */
	public String getPreviewImageUrl() {
		return previewImageUrl;
	}

	/**
	 * Sets the URL of preview image.
	 *
	 * @param previewImageUrl the new URL of preview image
	 */
	public void setPreviewImageUrl(final String previewImageUrl) {
		this.previewImageUrl = previewImageUrl;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("FeaturedCategories [category=").append(category).append(", products=")
				.append(Arrays.toString(products)).append(", rank=").append(rank).append(", displayName=")
				.append(displayName).append(", listProduct=").append(Arrays.toString(listProduct))
				.append(", previewImageUrl=").append(previewImageUrl).append("]");
		return builder.toString();
	}

}
