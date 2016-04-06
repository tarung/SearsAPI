package com.rnb.searsapi.stores.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class StoreLocation.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class StoreLocation {

	/** The store services. */
	@JsonProperty("storeServices")
	private StoreServices storeServices;

	/** The store info. */
	@JsonProperty("storeInfo")
	private StoreInfo storeInfo;

	/** The location. */
	@JsonProperty("location")
	private Location location;

	/** The contact details. */
	@JsonProperty("contactDetails")
	private ContactDetails contactDetails;

	/**
	 * Gets the store services.
	 *
	 * @return the store services
	 */
	public StoreServices getStoreServices() {
		return storeServices;
	}

	/**
	 * Sets the store services.
	 *
	 * @param storeServices the new store services
	 */
	public void setStoreServices(final StoreServices storeServices) {
		this.storeServices = storeServices;
	}

	/**
	 * Gets the store info.
	 *
	 * @return the store info
	 */
	public StoreInfo getStoreInfo() {
		return storeInfo;
	}

	/**
	 * Sets the store info.
	 *
	 * @param storeInfo the new store info
	 */
	public void setStoreInfo(final StoreInfo storeInfo) {
		this.storeInfo = storeInfo;
	}

	/**
	 * Gets the location.
	 *
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * Sets the location.
	 *
	 * @param location the new location
	 */
	public void setLocation(final Location location) {
		this.location = location;
	}

	/**
	 * Gets the contact details.
	 *
	 * @return the contact details
	 */
	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	/**
	 * Sets the contact details.
	 *
	 * @param contactDetails the new contact details
	 */
	public void setContactDetails(final ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("StoreLocation [storeServices=").append(storeServices).append(", storeInfo=").append(storeInfo)
				.append(", location=").append(location).append(", contactDetails=").append(contactDetails).append("]");
		return builder.toString();
	}

}
