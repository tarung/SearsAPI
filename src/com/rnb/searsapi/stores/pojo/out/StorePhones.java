package com.rnb.searsapi.stores.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Store Phones data wrapper.
 *
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class StorePhones {

	/** The Pharm phone - Pharmacy phone number. */
	@JsonProperty("pharmPhone")
	private String pharmPhone;

	/** The store phone. */
	@JsonProperty("storePhone")
	private String storePhone;

	/**
	 * Gets the Pharm phone - Pharmacy phone number.
	 *
	 * @return the Pharm phone - Pharmacy phone number
	 */
	public String getPharmPhone() {
		return pharmPhone;
	}

	/**
	 * Sets the Pharm phone - Pharmacy phone number.
	 *
	 * @param pharmPhone the new Pharm phone - Pharmacy phone number
	 */
	public void setPharmPhone(final String pharmPhone) {
		this.pharmPhone = pharmPhone;
	}

	/**
	 * Gets the store phone.
	 *
	 * @return the store phone
	 */
	public String getStorePhone() {
		return storePhone;
	}

	/**
	 * Sets the store phone.
	 *
	 * @param storePhone the new store phone
	 */
	public void setStorePhone(final String storePhone) {
		this.storePhone = storePhone;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("StorePhones [pharmPhone=").append(pharmPhone).append(", storePhone=").append(storePhone)
		.append("]");
		return builder.toString();
	}

}
