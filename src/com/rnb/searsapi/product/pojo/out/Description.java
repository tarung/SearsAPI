package com.rnb.searsapi.product.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Description data wrapper - All description related attributes of a
 * product are wrapped in this class.
 *
 * @author tarung.
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Description
{

	/** Name of the product. */
	@JsonProperty("Name")
	private String name;

	/** The url of product image. */
	@JsonProperty("ImageURL")
	private String imageURL;

	/**
	 * The pbType - This attribute is used to identify is the product has
	 * variants or not.
	 */
	@JsonProperty("PbType")
	private String pbType;

	/** The Review and rating details are provided under this node. */
	@JsonProperty("ReviewRating")
	private ReviewRating reviewRating;

	/** The Product Brand Name. */
	@JsonProperty("BrandName")
	private String brandName;

	/**
	 * Gets the name of the product.
	 *
	 * @return the name of the product
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the name of the product.
	 *
	 * @param name the new name of the product
	 */
	public void setName(final String name)
	{
		this.name = name;
	}

	/**
	 * Gets the url of product image.
	 *
	 * @return the url of product image
	 */
	public String getImageURL()
	{
		return imageURL;
	}

	/**
	 * Sets the url of product image.
	 *
	 * @param imageURL the new url of product image
	 */
	public void setImageURL(final String imageURL)
	{
		this.imageURL = imageURL;
	}

	/**
	 * Gets the pbType - This attribute is used to identify is the product has
	 * variants or not.
	 *
	 * @return the pbType - This attribute is used to identify is the product
	 *         has variants or not
	 */
	public String getPbType()
	{
		return pbType;
	}

	/**
	 * Sets the pbType - This attribute is used to identify is the product has
	 * variants or not.
	 *
	 * @param pbType the new pbType - This attribute is used to identify is the
	 *            product has variants or not
	 */
	public void setPbType(final String pbType)
	{
		this.pbType = pbType;
	}

	/**
	 * Gets the Review and rating details are provided under this node.
	 *
	 * @return the Review and rating details are provided under this node
	 */
	public ReviewRating getReviewRating()
	{
		return reviewRating;
	}

	/**
	 * Sets the Review and rating details are provided under this node.
	 *
	 * @param reviewRating the new Review and rating details are provided under
	 *            this node
	 */
	public void setReviewRating(final ReviewRating reviewRating)
	{
		this.reviewRating = reviewRating;
	}

	/**
	 * Gets the Product Brand Name.
	 *
	 * @return the Product Brand Name
	 */
	public String getBrandName()
	{
		return brandName;
	}

	/**
	 * Sets the Product Brand Name.
	 *
	 * @param brandName the new Product Brand Name
	 */
	public void setBrandName(final String brandName)
	{
		this.brandName = brandName;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Description [name=").append(name).append(", imageURL=").append(imageURL).append(", pbType=")
				.append(pbType).append(", reviewRating=").append(reviewRating).append(", brandName=").append(brandName)
				.append("]");
		return builder.toString();
	}

}
