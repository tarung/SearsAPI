package com.rnb.searsapi.stores.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Search Results wrapper class for results from Stores Search API.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class StoresSearchResults {

	/** The show store info. */
	@JsonProperty("showStoreInfo")
	private ShowStoreInfo showStoreInfo;

	/** The status data - In case when exception is thrown by the server */
	@JsonProperty("statusData")
	private StatusData statusData;

	/** The api tracking - In case when exception is thrown by the server */
	@JsonProperty("apiTracking")
	private String apiTracking;

	/**
	 * Gets the show store info.
	 *
	 * @return the show store info
	 */
	public ShowStoreInfo getShowStoreInfo() {
		return showStoreInfo;
	}

	/**
	 * Sets the show store info.
	 *
	 * @param showStoreInfo the new show store info
	 */
	public void setShowStoreInfo(final ShowStoreInfo showStoreInfo) {
		this.showStoreInfo = showStoreInfo;
	}

	/**
	 * @return the statusData
	 */
	public StatusData getStatusData() {
		return statusData;
	}

	/**
	 * @param statusData the statusData to set
	 */
	public void setStatusData(final StatusData statusData) {
		this.statusData = statusData;
	}

	/**
	 * @return the apiTracking
	 */
	public String getApiTracking() {
		return apiTracking;
	}

	/**
	 * @param apiTracking the apiTracking to set
	 */
	public void setApiTracking(final String apiTracking) {
		this.apiTracking = apiTracking;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("SearchResults [showStoreInfo=").append(showStoreInfo).append(", statusData=")
		.append(statusData).append(", apiTracking=").append(apiTracking).append("]");
		return builder.toString();
	}

}
