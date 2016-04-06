package com.rnb.searsapi.stores.pojo.out;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class Stores.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stores {

	/** The store location. */
	@JsonProperty("storeLocation")
	private StoreLocation[] storeLocation;

	/**
	 * Gets the store location.
	 *
	 * @return the store location
	 */
	public StoreLocation[] getStoreLocation() {
		return storeLocation;
	}

	/**
	 * Sets the store location.
	 *
	 * @param storeLocation the new store location
	 */
	public void setStoreLocation(final StoreLocation[] storeLocation) {
		this.storeLocation = storeLocation;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Stores [storeLocation=").append(Arrays.toString(storeLocation)).append("]");
		return builder.toString();
	}

}
