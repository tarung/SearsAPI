package com.rnb.searsapi.product.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class ListProduct.
 *
 * @author tarung
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListProduct {

	/** The name of the product. */
	@JsonProperty("Name")
	private String name;

	/** The url of product image. */
	@JsonProperty("ImageURL")
	private String imageURL;

	/** The store origin - Denotes by whom product is sold by. */
	@JsonProperty("StoreOrigin")
	private String storeOrigin;

	/** The part number - Unique identifier of a product. */
	@JsonProperty("PartNumber")
	private String partNumber;

	/** The brand name - Product Brand Name. */
	@JsonProperty("BrandName")
	private String brandName;

	/** The stock indicator - Indicates stock for the product. */
	@JsonProperty("StockIndicator")
	private String stockIndicator;

	/** The SPU indicator - if product is available for Store Pickup or not. */
	@JsonProperty("SpuInd")
	private String spuInd;

	/** The STS type - Denotes if product is ship to store item. */
	@JsonProperty("StsType")
	private String stsType;

	/**
	 * The Res indicator - Indicates if the product can be reserved in Store for
	 * a pickup or not.
	 */
	@JsonProperty("ResInd")
	private String resInd;

	/** The sale indicator. */
	@JsonProperty("SaleIndicator")
	private String saleIndicator;

	/**
	 * The pbType - This attribute is used to identify is the product has
	 * variants or not.
	 */
	@JsonProperty("PbType")
	private String pbType;

	/**
	 * Gets the name of the product.
	 *
	 * @return the name of the product
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the product.
	 *
	 * @param name the new name of the product
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Gets the url of product image.
	 *
	 * @return the url of product image
	 */
	public String getImageURL() {
		return imageURL;
	}

	/**
	 * Sets the url of product image.
	 *
	 * @param imageURL the new url of product image
	 */
	public void setImageURL(final String imageURL) {
		this.imageURL = imageURL;
	}

	/**
	 * Gets the store origin - Denotes by whom product is sold by.
	 *
	 * @return the store origin - Denotes by whom product is sold by
	 */
	public String getStoreOrigin() {
		return storeOrigin;
	}

	/**
	 * Sets the store origin - Denotes by whom product is sold by.
	 *
	 * @param storeOrigin the new store origin - Denotes by whom product is sold
	 *            by
	 */
	public void setStoreOrigin(final String storeOrigin) {
		this.storeOrigin = storeOrigin;
	}

	/**
	 * Gets the part number - Unique identifier of a product.
	 *
	 * @return the part number - Unique identifier of a product
	 */
	public String getPartNumber() {
		return partNumber;
	}

	/**
	 * Sets the part number - Unique identifier of a product.
	 *
	 * @param partNumber the new part number - Unique identifier of a product
	 */
	public void setPartNumber(final String partNumber) {
		this.partNumber = partNumber;
	}

	/**
	 * Gets the brand name - Product Brand Name.
	 *
	 * @return the brand name - Product Brand Name
	 */
	public String getBrandName() {
		return brandName;
	}

	/**
	 * Sets the brand name - Product Brand Name.
	 *
	 * @param brandName the new brand name - Product Brand Name
	 */
	public void setBrandName(final String brandName) {
		this.brandName = brandName;
	}

	/**
	 * Gets the stock indicator - Indicates stock for the product.
	 *
	 * @return the stock indicator - Indicates stock for the product
	 */
	public String getStockIndicator() {
		return stockIndicator;
	}

	/**
	 * Sets the stock indicator - Indicates stock for the product.
	 *
	 * @param stockIndicator the new stock indicator - Indicates stock for the
	 *            product
	 */
	public void setStockIndicator(final String stockIndicator) {
		this.stockIndicator = stockIndicator;
	}

	/**
	 * Gets the SPU indicator - if product is available for Store Pickup or not.
	 *
	 * @return the SPU indicator - if product is available for Store Pickup or
	 *         not
	 */
	public String getSpuInd() {
		return spuInd;
	}

	/**
	 * Sets the SPU indicator - if product is available for Store Pickup or not.
	 *
	 * @param spuInd the new SPU indicator - if product is available for Store
	 *            Pickup or not
	 */
	public void setSpuInd(final String spuInd) {
		this.spuInd = spuInd;
	}

	/**
	 * Gets the STS type - Denotes if product is ship to store item.
	 *
	 * @return the STS type - Denotes if product is ship to store item
	 */
	public String getStsType() {
		return stsType;
	}

	/**
	 * Sets the STS type - Denotes if product is ship to store item.
	 *
	 * @param stsType the new STS type - Denotes if product is ship to store
	 *            item
	 */
	public void setStsType(final String stsType) {
		this.stsType = stsType;
	}

	/**
	 * Gets the Res indicator - Indicates if the product can be reserved in
	 * Store for a pickup or not.
	 *
	 * @return the Res indicator - Indicates if the product can be reserved in
	 *         Store for a pickup or not
	 */
	public String getResInd() {
		return resInd;
	}

	/**
	 * Sets the Res indicator - Indicates if the product can be reserved in
	 * Store for a pickup or not.
	 *
	 * @param resInd the new Res indicator - Indicates if the product can be
	 *            reserved in Store for a pickup or not
	 */
	public void setResInd(final String resInd) {
		this.resInd = resInd;
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

}
