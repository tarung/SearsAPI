package com.rnb.searsapi.stores.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Store Info data wrapper class.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShowStoreInfo {

	/** The get store info. */
	@JsonProperty("getStoreInfo")
	private GetStoreInfo getStoreInfo;

	/** The status. */
	@JsonProperty("status")
	private Status status;

	/** The api tracking. */
	@JsonProperty("apiTracking")
	private String apiTracking;

	/**
	 * Gets the get store info.
	 *
	 * @return the get store info
	 */
	public GetStoreInfo getGetStoreInfo() {
		return getStoreInfo;
	}

	/**
	 * Sets the get store info.
	 *
	 * @param getStoreInfo the new get store info
	 */
	public void setGetStoreInfo(final GetStoreInfo getStoreInfo) {
		this.getStoreInfo = getStoreInfo;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(final Status status) {
		this.status = status;
	}

	/**
	 * Gets the api tracking.
	 *
	 * @return the api tracking
	 */
	public String getApiTracking() {
		return apiTracking;
	}

	/**
	 * Sets the api tracking.
	 *
	 * @param apiTracking the new api tracking
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
		builder.append("ShowStoreInfo [getStoreInfo=").append(getStoreInfo).append(", status=").append(status)
				.append(", apiTracking=").append(apiTracking).append("]");
		return builder.toString();
	}

}
