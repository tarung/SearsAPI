package com.rnb.searsapi.product.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All miscellaneous data is gathered here.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OtherInfo
{

	/**
	 * The automotive division - Indicates whether product is part of Automotive
	 * division/category.
	 */
	@JsonProperty("AutomotiveDivision")
	private String automotiveDivision;

	/** ProductBean is for Products and ItemBean is for SKUs within a product. */
	@JsonProperty("BeanType")
	private String beanType;

	/**
	 * The new bundle experience - Indicates whether this bundle product has a
	 * new customer experience on online flow.
	 */
	@JsonProperty("NewBundleExperience")
	private String newBundleExperience;

	/**
	 * Gets the automotive division - Indicates whether product is part of
	 * Automotive division/category.
	 *
	 * @return the automotive division - Indicates whether product is part of
	 *         Automotive division/category
	 */
	public String getAutomotiveDivision()
	{
		return automotiveDivision;
	}

	/**
	 * Sets the automotive division - Indicates whether product is part of
	 * Automotive division/category.
	 *
	 * @param automotiveDivision the new automotive division - Indicates whether
	 *            product is part of Automotive division/category
	 */
	public void setAutomotiveDivision(final String automotiveDivision)
	{
		this.automotiveDivision = automotiveDivision;
	}

	/**
	 * Gets the productBean is for Products and ItemBean is for SKUs within a
	 * product.
	 *
	 * @return the productBean is for Products and ItemBean is for SKUs within a
	 *         product
	 */
	public String getBeanType()
	{
		return beanType;
	}

	/**
	 * Sets the productBean is for Products and ItemBean is for SKUs within a
	 * product.
	 *
	 * @param beanType the new productBean is for Products and ItemBean is for
	 *            SKUs within a product
	 */
	public void setBeanType(final String beanType)
	{
		this.beanType = beanType;
	}

	/**
	 * Gets the new bundle experience - Indicates whether this bundle product
	 * has a new customer experience on online flow.
	 *
	 * @return the new bundle experience - Indicates whether this bundle product
	 *         has a new customer experience on online flow
	 */
	public String getNewBundleExperience()
	{
		return newBundleExperience;
	}

	/**
	 * Sets the new bundle experience - Indicates whether this bundle product
	 * has a new customer experience on online flow.
	 *
	 * @param newBundleExperience the new new bundle experience - Indicates
	 *            whether this bundle product has a new customer experience on
	 *            online flow
	 */
	public void setNewBundleExperience(final String newBundleExperience)
	{
		this.newBundleExperience = newBundleExperience;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("OtherInfo [automotiveDivision=").append(automotiveDivision).append(", beanType=")
				.append(beanType).append(", newBundleExperience=").append(newBundleExperience).append("]");
		return builder.toString();
	}

}
