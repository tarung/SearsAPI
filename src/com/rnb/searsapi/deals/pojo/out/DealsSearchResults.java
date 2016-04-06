package com.rnb.searsapi.deals.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Search Results wrapper for Deals searches other than Deals category
 * search.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DealsSearchResults {

	/** The sub header. */
	@JsonProperty("sub_header")
	private String subHeader;

	/** The Time of the day when the deals ends. */
	@JsonProperty("end_time")
	private String endTime;

	/** The related header. */
	@JsonProperty("related_header")
	private String relatedHeader;

	/** The future title. */
	@JsonProperty("future_title")
	private String futureTitle;

	/** The future option. */
	@JsonProperty("future_option")
	private String futureOption;

	/** The Time of the day when the deals start. */
	@JsonProperty("start_time")
	private String startTime;

	/** The future deals. */
	@JsonProperty("future_deals")
	private FutureDeals[] futureDeals;

	/** The Sneak peak image to the actual deals. */
	@JsonProperty("sneak_peak_img")
	private String sneakPeakImg;

	/** The social header. */
	@JsonProperty("social_header")
	private String socialHeader;

	/** The products. */
	@JsonProperty("products")
	private Products[] products;

	/**
	 * Gets the sub header.
	 *
	 * @return the sub header
	 */
	public String getSubHeader() {
		return subHeader;
	}

	/**
	 * Sets the sub header.
	 *
	 * @param subHeader the new sub header
	 */
	public void setSubHeader(final String subHeader) {
		this.subHeader = subHeader;
	}

	/**
	 * Gets the Time of the day when the deals ends.
	 *
	 * @return the Time of the day when the deals ends
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * Sets the Time of the day when the deals ends.
	 *
	 * @param endTime the new Time of the day when the deals ends
	 */
	public void setEndTime(final String endTime) {
		this.endTime = endTime;
	}

	/**
	 * Gets the related header.
	 *
	 * @return the related header
	 */
	public String getRelatedHeader() {
		return relatedHeader;
	}

	/**
	 * Sets the related header.
	 *
	 * @param relatedHeader the new related header
	 */
	public void setRelatedHeader(final String relatedHeader) {
		this.relatedHeader = relatedHeader;
	}

	/**
	 * Gets the future title.
	 *
	 * @return the future title
	 */
	public String getFutureTitle() {
		return futureTitle;
	}

	/**
	 * Sets the future title.
	 *
	 * @param futureTitle the new future title
	 */
	public void setFutureTitle(final String futureTitle) {
		this.futureTitle = futureTitle;
	}

	/**
	 * Gets the future option.
	 *
	 * @return the future option
	 */
	public String getFutureOption() {
		return futureOption;
	}

	/**
	 * Sets the future option.
	 *
	 * @param futureOption the new future option
	 */
	public void setFutureOption(final String futureOption) {
		this.futureOption = futureOption;
	}

	/**
	 * Gets the Time of the day when the deals start.
	 *
	 * @return the Time of the day when the deals start
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * Sets the Time of the day when the deals start.
	 *
	 * @param startTime the new Time of the day when the deals start
	 */
	public void setStartTime(final String startTime) {
		this.startTime = startTime;
	}

	/**
	 * Gets the future deals.
	 *
	 * @return the future deals
	 */
	public FutureDeals[] getFutureDeals() {
		return futureDeals;
	}

	/**
	 * Sets the future deals.
	 *
	 * @param futureDeals the new future deals
	 */
	public void setFutureDeals(final FutureDeals[] futureDeals) {
		this.futureDeals = futureDeals;
	}

	/**
	 * Gets the Sneak peak image to the actual deals.
	 *
	 * @return the Sneak peak image to the actual deals
	 */
	public String getSneakPeakImg() {
		return sneakPeakImg;
	}

	/**
	 * Sets the Sneak peak image to the actual deals.
	 *
	 * @param sneakPeakImg the new Sneak peak image to the actual deals
	 */
	public void setSneakPeakImg(final String sneakPeakImg) {
		this.sneakPeakImg = sneakPeakImg;
	}

	/**
	 * Gets the social header.
	 *
	 * @return the social header
	 */
	public String getSocialHeader() {
		return socialHeader;
	}

	/**
	 * Sets the social header.
	 *
	 * @param socialHeader the new social header
	 */
	public void setSocialHeader(final String socialHeader) {
		this.socialHeader = socialHeader;
	}

	/**
	 * Gets the products.
	 *
	 * @return the products
	 */
	public Products[] getProducts() {
		return products;
	}

	/**
	 * Sets the products.
	 *
	 * @param products the new products
	 */
	public void setProducts(final Products[] products) {
		this.products = products;
	}

}
