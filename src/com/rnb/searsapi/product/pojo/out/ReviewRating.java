package com.rnb.searsapi.product.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Review and rating details are provided under this wrapper class.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewRating
{

	/** The rating. */
	@JsonProperty("Rating")
	private String rating;

	/** The Number of reviews for this product. */
	@JsonProperty("NumReview")
	private String numReview;

	/**
	 * Gets the rating.
	 *
	 * @return the rating
	 */
	public String getRating()
	{
		return rating;
	}

	/**
	 * Sets the rating.
	 *
	 * @param rating the new rating
	 */
	public void setRating(final String rating)
	{
		this.rating = rating;
	}

	/**
	 * Gets the Number of reviews for this product.
	 *
	 * @return the Number of reviews for this product
	 */
	public String getNumReview()
	{
		return numReview;
	}

	/**
	 * Sets the Number of reviews for this product.
	 *
	 * @param numReview the new Number of reviews for this product
	 */
	public void setNumReview(final String numReview)
	{
		this.numReview = numReview;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("ReviewRating [rating=").append(rating).append(", numReview=").append(numReview).append("]");
		return builder.toString();
	}

}
