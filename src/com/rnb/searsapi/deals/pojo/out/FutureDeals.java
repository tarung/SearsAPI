package com.rnb.searsapi.deals.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Future Deals wrapper.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FutureDeals {

	/** The Image URL of the product or deal. */
	@JsonProperty("MainImageUrl")
	private String mainImageUrl;

	/** The category_date. */
	@JsonProperty("Category_date")
	private String category_date;

	/** The Description of the product. */
	@JsonProperty("DescriptionName")
	private String descriptionName;

	/** The Brand name of the product. */
	@JsonProperty("BrandName")
	private String brandName;

	/**
	 * Gets the Image URL of the product or deal.
	 *
	 * @return the Image URL of the product or deal
	 */
	public String getMainImageUrl() {
		return mainImageUrl;
	}

	/**
	 * Sets the Image URL of the product or deal.
	 *
	 * @param mainImageUrl the new Image URL of the product or deal
	 */
	public void setMainImageUrl(final String mainImageUrl) {
		this.mainImageUrl = mainImageUrl;
	}

	/**
	 * Gets the category_date.
	 *
	 * @return the category_date
	 */
	public String getCategory_date() {
		return category_date;
	}

	/**
	 * Sets the category_date.
	 *
	 * @param category_date the new category_date
	 */
	public void setCategory_date(final String category_date) {
		this.category_date = category_date;
	}

	/**
	 * Gets the Description of the product.
	 *
	 * @return the Description of the product
	 */
	public String getDescriptionName() {
		return descriptionName;
	}

	/**
	 * Sets the Description of the product.
	 *
	 * @param descriptionName the new Description of the product
	 */
	public void setDescriptionName(final String descriptionName) {
		this.descriptionName = descriptionName;
	}

	/**
	 * Gets the Brand name of the product.
	 *
	 * @return the Brand name of the product
	 */
	public String getBrandName() {
		return brandName;
	}

	/**
	 * Sets the Brand name of the product.
	 *
	 * @param brandName the new Brand name of the product
	 */
	public void setBrandName(final String brandName) {
		this.brandName = brandName;
	}

}
