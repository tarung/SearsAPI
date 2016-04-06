package com.rnb.searsapi.product.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All Price related attributes are grouped here.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Price
{

	/** The show AKHI message. */
	@JsonProperty("ShowAKHIMessage")
	private String showAKHIMessage;

	/**
	 * The Promo indicator - Indicates if there is a promotion running for the
	 * product.
	 */
	@JsonProperty("PromoInd")
	private String promoInd;

	/** The is zip code required. */
	@JsonProperty("IsZipCodeRequired")
	private String isZipCodeRequired;

	/** The clearance indicator - Indicate whether the product is on Clearance. */
	@JsonProperty("ClearanceIndicator")
	private String clearanceIndicator;

	/**
	 * The display price - Sale Price after applying discounts, as shown on
	 * website product detail page.
	 */
	@JsonProperty("DisplayPrice")
	private String displayPrice;

	/**
	 * The cut price - Regular price of the product, which is displayed in a cut
	 * (crossed-out) price format when the product is available on sale.
	 */
	@JsonProperty("CutPrice")
	private String cutPrice;

	/**
	 * Gets the show AKHI message.
	 *
	 * @return the show AKHI message
	 */
	public String getShowAKHIMessage()
	{
		return showAKHIMessage;
	}

	/**
	 * Sets the show AKHI message.
	 *
	 * @param showAKHIMessage the new show AKHI message
	 */
	public void setShowAKHIMessage(final String showAKHIMessage)
	{
		this.showAKHIMessage = showAKHIMessage;
	}

	/**
	 * Gets the Promo indicator - Indicates if there is a promotion running for
	 * the product.
	 *
	 * @return the Promo indicator - Indicates if there is a promotion running
	 *         for the product
	 */
	public String getPromoInd()
	{
		return promoInd;
	}

	/**
	 * Sets the Promo indicator - Indicates if there is a promotion running for
	 * the product.
	 *
	 * @param promoInd the new Promo indicator - Indicates if there is a
	 *            promotion running for the product
	 */
	public void setPromoInd(final String promoInd)
	{
		this.promoInd = promoInd;
	}

	/**
	 * Gets the checks if is zip code required.
	 *
	 * @return the checks if is zip code required
	 */
	public String getIsZipCodeRequired()
	{
		return isZipCodeRequired;
	}

	/**
	 * Sets the checks if is zip code required.
	 *
	 * @param isZipCodeRequired the new checks if is zip code required
	 */
	public void setIsZipCodeRequired(final String isZipCodeRequired)
	{
		this.isZipCodeRequired = isZipCodeRequired;
	}

	/**
	 * Gets the clearance indicator - Indicate whether the product is on
	 * Clearance.
	 *
	 * @return the clearance indicator - Indicate whether the product is on
	 *         Clearance
	 */
	public String getClearanceIndicator()
	{
		return clearanceIndicator;
	}

	/**
	 * Sets the clearance indicator - Indicate whether the product is on
	 * Clearance.
	 *
	 * @param clearanceIndicator the new clearance indicator - Indicate whether
	 *            the product is on Clearance
	 */
	public void setClearanceIndicator(final String clearanceIndicator)
	{
		this.clearanceIndicator = clearanceIndicator;
	}

	/**
	 * Gets the display price - Sale Price after applying discounts, as shown on
	 * website product detail page.
	 *
	 * @return the display price - Sale Price after applying discounts, as shown
	 *         on website product detail page
	 */
	public String getDisplayPrice()
	{
		return displayPrice;
	}

	/**
	 * Sets the display price - Sale Price after applying discounts, as shown on
	 * website product detail page.
	 *
	 * @param displayPrice the new display price - Sale Price after applying
	 *            discounts, as shown on website product detail page
	 */
	public void setDisplayPrice(final String displayPrice)
	{
		this.displayPrice = displayPrice;
	}

	/**
	 * Gets the cut price - Regular price of the product, which is displayed in
	 * a cut (crossed-out) price format when the product is available on sale.
	 *
	 * @return the cut price - Regular price of the product, which is displayed
	 *         in a cut (crossed-out) price format when the product is available
	 *         on sale
	 */
	public String getCutPrice() {
		return cutPrice;
	}

	/**
	 * Sets the cut price - Regular price of the product, which is displayed in
	 * a cut (crossed-out) price format when the product is available on sale.
	 *
	 * @param cutPrice the new cut price - Regular price of the product, which
	 *            is displayed in a cut (crossed-out) price format when the
	 *            product is available on sale
	 */
	public void setCutPrice(final String cutPrice) {
		this.cutPrice = cutPrice;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Price [showAKHIMessage=").append(showAKHIMessage).append(", promoInd=").append(promoInd)
		.append(", isZipCodeRequired=").append(isZipCodeRequired).append(", clearanceIndicator=")
		.append(clearanceIndicator).append(", displayPrice=").append(displayPrice).append(", cutPrice=")
		.append(cutPrice).append("]");
		return builder.toString();
	}
}
