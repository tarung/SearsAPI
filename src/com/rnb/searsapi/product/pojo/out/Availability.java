package com.rnb.searsapi.product.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Availability data wrapper.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Availability
{

	/** The source. */
	@JsonProperty("Source")
	private String source;

	/** The free shipping threshold. */
	@JsonProperty("FreeShippingThreshold")
	private String freeShippingThreshold;

	/** The STS type - Denotes if product is ship to store item. */
	@JsonProperty("StsType")
	private String stsType;

	/** The spu indicator - if product is available for Store Pickup or not. */
	@JsonProperty("SpuInd")
	private String spuInd;

	/** The free shipping eligible. */
	@JsonProperty("FreeShippingEligible")
	private String freeShippingEligible;

	/**
	 * The Res indicator - Indicates if the product can be reserved in Store for
	 * a pickup or not.
	 */
	@JsonProperty("ResInd")
	private String resInd;

	/** The stock indicator - Indicates stock for the product. */
	@JsonProperty("StockIndicator")
	private String stockIndicator;

	/** The sale indicator. */
	@JsonProperty("SaleIndicator")
	private String saleIndicator;

	/**
	 * Gets the source.
	 *
	 * @return the source
	 */
	public String getSource()
	{
		return source;
	}

	/**
	 * Sets the source.
	 *
	 * @param source the new source
	 */
	public void setSource(final String source)
	{
		this.source = source;
	}

	/**
	 * Gets the free shipping threshold.
	 *
	 * @return the free shipping threshold
	 */
	public String getFreeShippingThreshold()
	{
		return freeShippingThreshold;
	}

	/**
	 * Sets the free shipping threshold.
	 *
	 * @param freeShippingThreshold the new free shipping threshold
	 */
	public void setFreeShippingThreshold(final String freeShippingThreshold)
	{
		this.freeShippingThreshold = freeShippingThreshold;
	}

	/**
	 * Gets the STS type - Denotes if product is ship to store item.
	 *
	 * @return the STS type - Denotes if product is ship to store item
	 */
	public String getStsType()
	{
		return stsType;
	}

	/**
	 * Sets the STS type - Denotes if product is ship to store item.
	 *
	 * @param stsType the new STS type - Denotes if product is ship to store
	 *            item
	 */
	public void setStsType(final String stsType)
	{
		this.stsType = stsType;
	}

	/**
	 * Gets the spu indicator - if product is available for Store Pickup or not.
	 *
	 * @return the spu indicator - if product is available for Store Pickup or
	 *         not
	 */
	public String getSpuInd()
	{
		return spuInd;
	}

	/**
	 * Sets the spu indicator - if product is available for Store Pickup or not.
	 *
	 * @param spuInd the new spu indicator - if product is available for Store
	 *            Pickup or not
	 */
	public void setSpuInd(final String spuInd)
	{
		this.spuInd = spuInd;
	}

	/**
	 * Gets the free shipping eligible.
	 *
	 * @return the free shipping eligible
	 */
	public String getFreeShippingEligible()
	{
		return freeShippingEligible;
	}

	/**
	 * Sets the free shipping eligible.
	 *
	 * @param freeShippingEligible the new free shipping eligible
	 */
	public void setFreeShippingEligible(final String freeShippingEligible)
	{
		this.freeShippingEligible = freeShippingEligible;
	}

	/**
	 * Gets the Res indicator - Indicates if the product can be reserved in
	 * Store for a pickup or not.
	 *
	 * @return the Res indicator - Indicates if the product can be reserved in
	 *         Store for a pickup or not
	 */
	public String getResInd()
	{
		return resInd;
	}

	/**
	 * Sets the Res indicator - Indicates if the product can be reserved in
	 * Store for a pickup or not.
	 *
	 * @param resInd the new Res indicator - Indicates if the product can be
	 *            reserved in Store for a pickup or not
	 */
	public void setResInd(final String resInd)
	{
		this.resInd = resInd;
	}

	/**
	 * Gets the stock indicator - Indicates stock for the product.
	 *
	 * @return the stock indicator - Indicates stock for the product
	 */
	public String getStockIndicator()
	{
		return stockIndicator;
	}

	/**
	 * Sets the stock indicator - Indicates stock for the product.
	 *
	 * @param stockIndicator the new stock indicator - Indicates stock for the
	 *            product
	 */
	public void setStockIndicator(final String stockIndicator)
	{
		this.stockIndicator = stockIndicator;
	}

	/**
	 * Gets the sale indicator.
	 *
	 * @return the sale indicator
	 */
	public String getSaleIndicator() {
		return saleIndicator;
	}

	/**
	 * Sets the sale indicator.
	 *
	 * @param saleIndicator the new sale indicator
	 */
	public void setSaleIndicator(final String saleIndicator) {
		this.saleIndicator = saleIndicator;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Availability [source=").append(source).append(", freeShippingThreshold=")
				.append(freeShippingThreshold).append(", stsType=").append(stsType).append(", spuInd=").append(spuInd)
				.append(", freeShippingEligible=").append(freeShippingEligible).append(", resInd=").append(resInd)
				.append(", stockIndicator=").append(stockIndicator).append(", saleIndicator=").append(saleIndicator)
				.append("]");
		return builder.toString();
	}
}
