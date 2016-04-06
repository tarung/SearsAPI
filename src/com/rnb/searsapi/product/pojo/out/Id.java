package com.rnb.searsapi.product.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All identification related attributes of a product are found below this
 * wrapper class.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Id
{

	/**
	 * The KSN value - the product number as used in the physical stores. Part
	 * Number is the product number used in the online version
	 */
	@JsonProperty("KsnValue")
	private String ksnValue;

	/**
	 * The cat entry id - It is used to uniquely identify a product in commerce
	 * table. This is used while adding an item to the cart.
	 */
	@JsonProperty("CatEntryId")
	private String catEntryId;

	/** The SKU part number - Manufacturer part number of SKU. */
	@JsonProperty("SkuPartNumber")
	private String skuPartNumber;

	/** The MFG part number - Manufacturing part number of a product. */
	@JsonProperty("MfgPartNumber")
	private String mfgPartNumber;

	/** The part number - Unique identifier of a product. */
	@JsonProperty("PartNumber")
	private String partNumber;

	/**
	 * Gets the KSN value - the product number as used in the physical stores.
	 *
	 * @return the KSN value - the product number as used in the physical stores
	 */
	public String getKsnValue()
	{
		return ksnValue;
	}

	/**
	 * Sets the KSN value - the product number as used in the physical stores.
	 *
	 * @param ksnValue the new KSN value - the product number as used in the
	 *            physical stores
	 */
	public void setKsnValue(final String ksnValue)
	{
		this.ksnValue = ksnValue;
	}

	/**
	 * Gets the cat entry id - It is used to uniquely identify a product in
	 * commerce table.
	 *
	 * @return the cat entry id - It is used to uniquely identify a product in
	 *         commerce table
	 */
	public String getCatEntryId()
	{
		return catEntryId;
	}

	/**
	 * Sets the cat entry id - It is used to uniquely identify a product in
	 * commerce table.
	 *
	 * @param catEntryId the new cat entry id - It is used to uniquely identify
	 *            a product in commerce table
	 */
	public void setCatEntryId(final String catEntryId)
	{
		this.catEntryId = catEntryId;
	}

	/**
	 * Gets the SKU part number - Manufacturer part number of SKU.
	 *
	 * @return the SKU part number - Manufacturer part number of SKU
	 */
	public String getSkuPartNumber()
	{
		return skuPartNumber;
	}

	/**
	 * Sets the SKU part number - Manufacturer part number of SKU.
	 *
	 * @param skuPartNumber the new SKU part number - Manufacturer part number
	 *            of SKU
	 */
	public void setSkuPartNumber(final String skuPartNumber)
	{
		this.skuPartNumber = skuPartNumber;
	}

	/**
	 * Gets the MFG part number - Manufacturing part number of a product.
	 *
	 * @return the MFG part number - Manufacturing part number of a product
	 */
	public String getMfgPartNumber()
	{
		return mfgPartNumber;
	}

	/**
	 * Sets the MFG part number - Manufacturing part number of a product.
	 *
	 * @param mfgPartNumber the new MFG part number - Manufacturing part number
	 *            of a product
	 */
	public void setMfgPartNumber(final String mfgPartNumber)
	{
		this.mfgPartNumber = mfgPartNumber;
	}

	/**
	 * Gets the part number - Unique identifier of a product.
	 *
	 * @return the part number - Unique identifier of a product
	 */
	public String getPartNumber()
	{
		return partNumber;
	}

	/**
	 * Sets the part number - Unique identifier of a product.
	 *
	 * @param partNumber the new part number - Unique identifier of a product
	 */
	public void setPartNumber(final String partNumber)
	{
		this.partNumber = partNumber;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Id [ksnValue=").append(ksnValue).append(", catEntryId=").append(catEntryId)
				.append(", skuPartNumber=").append(skuPartNumber).append(", mfgPartNumber=").append(mfgPartNumber)
				.append(", partNumber=").append(partNumber).append("]");
		return builder.toString();
	}

}
