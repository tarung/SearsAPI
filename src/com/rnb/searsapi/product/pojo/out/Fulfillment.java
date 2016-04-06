package com.rnb.searsapi.product.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The All fulfillment options available for a product is provided under this
 * wrapper class.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Fulfillment
{

	/**
	 * The default fulfillment - Provides information about the available
	 * fulfillment options for the product.
	 */
	@JsonProperty("DefaultFullfillment")
	private String defaultFullfillment;

	/**
	 * The direct delivery - Indicates if the product is available for direct
	 * delivery or not.
	 */
	@JsonProperty("DirectDelivery")
	private String directDelivery;

	/**
	 * The international shipping eligible indicator - Indicates whether product
	 * is eligible for international shipping.
	 */
	@JsonProperty("IntShipEligible")
	private String intShipEligible;

	/**
	 * Gets the default fulfillment - Provides information about the available
	 * fulfillment options for the product.
	 *
	 * @return the default fulfillment - Provides information about the
	 *         available fulfillment options for the product
	 */
	public String getDefaultFullfillment()
	{
		return defaultFullfillment;
	}

	/**
	 * Sets the default fulfillment - Provides information about the available
	 * fulfillment options for the product.
	 *
	 * @param defaultFullfillment the new default fulfillment - Provides
	 *            information about the available fulfillment options for the
	 *            product
	 */
	public void setDefaultFullfillment(final String defaultFullfillment)
	{
		this.defaultFullfillment = defaultFullfillment;
	}

	/**
	 * Gets the direct delivery - Indicates if the product is available for
	 * direct delivery or not.
	 *
	 * @return the direct delivery - Indicates if the product is available for
	 *         direct delivery or not
	 */
	public String getDirectDelivery()
	{
		return directDelivery;
	}

	/**
	 * Sets the direct delivery - Indicates if the product is available for
	 * direct delivery or not.
	 *
	 * @param directDelivery the new direct delivery - Indicates if the product
	 *            is available for direct delivery or not
	 */
	public void setDirectDelivery(final String directDelivery)
	{
		this.directDelivery = directDelivery;
	}

	/**
	 * Gets the international shipping eligible indicator - Indicates whether
	 * product is eligible for international shipping.
	 *
	 * @return the international shipping eligible indicator - Indicates whether
	 *         product is eligible for international shipping
	 */
	public String getIntShipEligible()
	{
		return intShipEligible;
	}

	/**
	 * Sets the international shipping eligible indicator - Indicates whether
	 * product is eligible for international shipping.
	 *
	 * @param intShipEligible the new international shipping eligible indicator
	 *            - Indicates whether product is eligible for international
	 *            shipping
	 */
	public void setIntShipEligible(final String intShipEligible)
	{
		this.intShipEligible = intShipEligible;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Fulfillment [defaultFullfillment=").append(defaultFullfillment).append(", directDelivery=")
				.append(directDelivery).append(", intShipEligible=").append(intShipEligible).append("]");
		return builder.toString();
	}

}
