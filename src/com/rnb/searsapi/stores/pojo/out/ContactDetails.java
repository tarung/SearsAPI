package com.rnb.searsapi.stores.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Contact Details wrapper class.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactDetails {

	/** The store phones. */
	@JsonProperty("storePhones")
	private StorePhones storePhones;

	/** The store working hours. */
	@JsonProperty("storeWorkingHours")
	private StoreWorkingHours storeWorkingHours;

	/**
	 * Gets the store phones.
	 *
	 * @return the store phones
	 */
	public StorePhones getStorePhones() {
		return storePhones;
	}

	/**
	 * Sets the store phones.
	 *
	 * @param storePhones the new store phones
	 */
	public void setStorePhones(final StorePhones storePhones) {
		this.storePhones = storePhones;
	}

	/**
	 * Gets the store working hours.
	 *
	 * @return the store working hours
	 */
	public StoreWorkingHours getStoreWorkingHours() {
		return storeWorkingHours;
	}

	/**
	 * Sets the store working hours.
	 *
	 * @param storeWorkingHours the new store working hours
	 */
	public void setStoreWorkingHours(final StoreWorkingHours storeWorkingHours) {
		this.storeWorkingHours = storeWorkingHours;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("ContactDetails [storePhones=").append(storePhones).append(", storeWorkingHours=")
		.append(storeWorkingHours).append("]");
		return builder.toString();
	}

}
