package com.rnb.searsapi.product.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Seller Information wrapper class.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SellerInfo
{

	/** The seller count - Market place seller count. */
	@JsonProperty("SellerCount")
	private String sellerCount;

	/** The store origin - Denotes by whom product is sold by. */
	@JsonProperty("StoreOrigin")
	private String storeOrigin;

	/**
	 * Gets the seller count - Market place seller count.
	 *
	 * @return the seller count - Market place seller count
	 */
	public String getSellerCount()
	{
		return sellerCount;
	}

	/**
	 * Sets the seller count - Market place seller count.
	 *
	 * @param sellerCount the new seller count - Market place seller count
	 */
	public void setSellerCount(final String sellerCount)
	{
		this.sellerCount = sellerCount;
	}

	/**
	 * Gets the store origin - Denotes by whom product is sold by.
	 *
	 * @return the store origin - Denotes by whom product is sold by
	 */
	public String getStoreOrigin()
	{
		return storeOrigin;
	}

	/**
	 * Sets the store origin - Denotes by whom product is sold by.
	 *
	 * @param storeOrigin the new store origin - Denotes by whom product is sold
	 *            by
	 */
	public void setStoreOrigin(final String storeOrigin)
	{
		this.storeOrigin = storeOrigin;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("SellerInfo [sellerCount=").append(sellerCount).append(", storeOrigin=").append(storeOrigin)
				.append("]");
		return builder.toString();
	}

}
