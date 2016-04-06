package com.rnb.searsapi.stores.pojo.out;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Store Services wrapper class.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class StoreServices {

	/** The store service. */
	@JsonProperty("storeService")
	private StoreService[] storeService;

	/**
	 * Gets the store service.
	 *
	 * @return the store service
	 */
	public StoreService[] getStoreService() {
		return storeService;
	}

	/**
	 * Sets the store service.
	 *
	 * @param storeService the new store service
	 */
	public void setStoreService(final StoreService[] storeService) {
		this.storeService = storeService;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("StoreServices [storeService=").append(Arrays.toString(storeService)).append("]");
		return builder.toString();
	}

}
