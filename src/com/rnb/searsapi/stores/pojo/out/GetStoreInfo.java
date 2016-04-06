package com.rnb.searsapi.stores.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Store Info wrapper.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetStoreInfo {

	/** The stores. */
	@JsonProperty("stores")
	private Stores stores;

	/** The store count. */
	@JsonProperty("storeCount")
	private int storeCount;

	/**
	 * Gets the stores.
	 *
	 * @return the stores
	 */
	public Stores getStores() {
		return stores;
	}

	/**
	 * Sets the stores.
	 *
	 * @param stores the new stores
	 */
	public void setStores(final Stores stores) {
		this.stores = stores;
	}

	/**
	 * Gets the store count.
	 *
	 * @return the store count
	 */
	public int getStoreCount() {
		return storeCount;
	}

	/**
	 * Sets the store count.
	 *
	 * @param storeCount the new store count
	 */
	public void setStoreCount(final int storeCount) {
		this.storeCount = storeCount;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("GetStoreInfo [stores=").append(stores).append(", storeCount=").append(storeCount).append("]");
		return builder.toString();
	}

}
