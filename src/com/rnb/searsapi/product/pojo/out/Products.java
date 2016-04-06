package com.rnb.searsapi.product.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Products information wrapper class.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Products
{

	/** The product description. */
	@JsonProperty("Description")
	private Description description;

	/** The fulfillment - All fulfillment options available for this product. */
	@JsonProperty("Fulfillment")
	private Fulfillment fulfillment;

	/** The availability - All information regarding product availability. */
	@JsonProperty("Availability")
	private Availability availability;

	/** The other info - All miscellaneous data about this product. */
	@JsonProperty("OtherInfo")
	private OtherInfo otherInfo;

	/** The price - All price related data about this product. */
	@JsonProperty("Price")
	private Price price;

	/** The id - All identification related attributes of a product. */
	@JsonProperty("Id")
	private Id id;

	/** The seller info - All seller information. */
	@JsonProperty("SellerInfo")
	private SellerInfo sellerInfo;

	/**
	 * Gets the product description.
	 *
	 * @return the product description
	 */
	public Description getDescription()
	{
		return description;
	}

	/**
	 * Sets the product description.
	 *
	 * @param description the new product description
	 */
	public void setDescription(final Description description)
	{
		this.description = description;
	}

	/**
	 * Gets the fulfillment - All fulfillment options available for this
	 * product.
	 *
	 * @return the fulfillment - All fulfillment options available for this
	 *         product
	 */
	public Fulfillment getFulfillment()
	{
		return fulfillment;
	}

	/**
	 * Sets the fulfillment - All fulfillment options available for this
	 * product.
	 *
	 * @param fulfillment the new fulfillment - All fulfillment options
	 *            available for this product
	 */
	public void setFulfillment(final Fulfillment fulfillment)
	{
		this.fulfillment = fulfillment;
	}

	/**
	 * Gets the availability - All information regarding product availability.
	 *
	 * @return the availability - All information regarding product availability
	 */
	public Availability getAvailability()
	{
		return availability;
	}

	/**
	 * Sets the availability - All information regarding product availability.
	 *
	 * @param availability the new availability - All information regarding
	 *            product availability
	 */
	public void setAvailability(final Availability availability)
	{
		this.availability = availability;
	}

	/**
	 * Gets the other info - All miscellaneous data about this product.
	 *
	 * @return the other info - All miscellaneous data about this product
	 */
	public OtherInfo getOtherInfo()
	{
		return otherInfo;
	}

	/**
	 * Sets the other info - All miscellaneous data about this product.
	 *
	 * @param otherInfo the new other info - All miscellaneous data about this
	 *            product
	 */
	public void setOtherInfo(final OtherInfo otherInfo)
	{
		this.otherInfo = otherInfo;
	}

	/**
	 * Gets the price - All price related data about this product.
	 *
	 * @return the price - All price related data about this product
	 */
	public Price getPrice()
	{
		return price;
	}

	/**
	 * Sets the price - All price related data about this product.
	 *
	 * @param price the new price - All price related data about this product
	 */
	public void setPrice(final Price price)
	{
		this.price = price;
	}

	/**
	 * Gets the id - All identification related attributes of a product.
	 *
	 * @return the id - All identification related attributes of a product
	 */
	public Id getId()
	{
		return id;
	}

	/**
	 * Sets the id - All identification related attributes of a product.
	 *
	 * @param id the new id - All identification related attributes of a product
	 */
	public void setId(final Id id)
	{
		this.id = id;
	}

	/**
	 * Gets the seller info - All seller information.
	 *
	 * @return the seller info - All seller information
	 */
	public SellerInfo getSellerInfo()
	{
		return sellerInfo;
	}

	/**
	 * Sets the seller info - All seller information.
	 *
	 * @param sellerInfo the new seller info - All seller information
	 */
	public void setSellerInfo(final SellerInfo sellerInfo)
	{
		this.sellerInfo = sellerInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Products [description=").append(description).append(", fulfillment=").append(fulfillment)
		.append(", availability=").append(availability).append(", otherInfo=").append(otherInfo)
		.append(", price=").append(price).append(", id=").append(id).append(", sellerInfo=").append(sellerInfo)
		.append("]");
		return builder.toString();
	}

}
