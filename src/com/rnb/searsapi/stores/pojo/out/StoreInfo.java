package com.rnb.searsapi.stores.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class StoreInfo.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class StoreInfo {

	/** The start date - Date this store opened. */
	@JsonProperty("startDate")
	private String startDate;

	/** The store number - unique store number. */
	@JsonProperty("storeNumber")
	private String storeNumber;

	/** The store name e.g. OAKBROOK-A, SEARS AUTO CENTER */
	@JsonProperty("storeName")
	private String storeName;

	/** The close date - date this store closed - 9999-12-31. */
	@JsonProperty("closeDate")
	private String closeDate;

	/** The store holidays. */
	@JsonProperty("storeHolidays")
	private StoreHolidays storeHolidays;

	/** The store type - Sears_Stores, Sears_Auto_Centers. */
	@JsonProperty("storeType")
	private String storeType;

	/**
	 * Gets the start date - Date this store opened.
	 *
	 * @return the start date - Date this store opened
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * Sets the start date - Date this store opened.
	 *
	 * @param startDate the new start date - Date this store opened
	 */
	public void setStartDate(final String startDate) {
		this.startDate = startDate;
	}

	/**
	 * Gets the store number - unique store number.
	 *
	 * @return the store number - unique store number
	 */
	public String getStoreNumber() {
		return storeNumber;
	}

	/**
	 * Sets the store number - unique store number.
	 *
	 * @param storeNumber the new store number - unique store number
	 */
	public void setStoreNumber(final String storeNumber) {
		this.storeNumber = storeNumber;
	}

	/**
	 * Gets the store name e.
	 *
	 * @return the store name e
	 */
	public String getStoreName() {
		return storeName;
	}

	/**
	 * Sets the store name e.
	 *
	 * @param storeName the new store name e
	 */
	public void setStoreName(final String storeName) {
		this.storeName = storeName;
	}

	/**
	 * Gets the close date - date this store closed - 9999-12-31.
	 *
	 * @return the close date - date this store closed - 9999-12-31
	 */
	public String getCloseDate() {
		return closeDate;
	}

	/**
	 * Sets the close date - date this store closed - 9999-12-31.
	 *
	 * @param closeDate the new close date - date this store closed - 9999-12-31
	 */
	public void setCloseDate(final String closeDate) {
		this.closeDate = closeDate;
	}

	/**
	 * Gets the store holidays.
	 *
	 * @return the store holidays
	 */
	public StoreHolidays getStoreHolidays() {
		return storeHolidays;
	}

	/**
	 * Sets the store holidays.
	 *
	 * @param storeHolidays the new store holidays
	 */
	public void setStoreHolidays(final StoreHolidays storeHolidays) {
		this.storeHolidays = storeHolidays;
	}

	/**
	 * Gets the store type - Sears_Stores, Sears_Auto_Centers.
	 *
	 * @return the store type - Sears_Stores, Sears_Auto_Centers
	 */
	public String getStoreType() {
		return storeType;
	}

	/**
	 * Sets the store type - Sears_Stores, Sears_Auto_Centers.
	 *
	 * @param storeType the new store type - Sears_Stores, Sears_Auto_Centers
	 */
	public void setStoreType(final String storeType) {
		this.storeType = storeType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("StoreInfo [startDate=").append(startDate).append(", storeNumber=").append(storeNumber)
		.append(", storeName=").append(storeName).append(", closeDate=").append(closeDate)
		.append(", storeHolidays=").append(storeHolidays).append(", storeType=").append(storeType).append("]");
		return builder.toString();
	}

}
