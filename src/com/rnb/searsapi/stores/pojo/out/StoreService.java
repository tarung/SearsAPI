package com.rnb.searsapi.stores.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The StoreService data wrapper class.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class StoreService {

	/** The service rank - Services offered by this store */
	@JsonProperty("serviceRank")
	private String serviceRank;

	/** The service icon. */
	@JsonProperty("serviceIcon")
	private String serviceIcon;

	/** The service name - Services offered by this store. */
	@JsonProperty("serviceName")
	private String serviceName;

	/**
	 * Gets the service rank.
	 *
	 * @return the service rank
	 */
	public String getServiceRank() {
		return serviceRank;
	}

	/**
	 * Sets the service rank.
	 *
	 * @param serviceRank the new service rank
	 */
	public void setServiceRank(final String serviceRank) {
		this.serviceRank = serviceRank;
	}

	/**
	 * Gets the service icon.
	 *
	 * @return the service icon
	 */
	public String getServiceIcon() {
		return serviceIcon;
	}

	/**
	 * Sets the service icon.
	 *
	 * @param serviceIcon the new service icon
	 */
	public void setServiceIcon(final String serviceIcon) {
		this.serviceIcon = serviceIcon;
	}

	/**
	 * Gets the service name.
	 *
	 * @return the service name
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * Sets the service name.
	 *
	 * @param serviceName the new service name
	 */
	public void setServiceName(final String serviceName) {
		this.serviceName = serviceName;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("StoreService [serviceRank=").append(serviceRank).append(", serviceIcon=").append(serviceIcon)
				.append(", serviceName=").append(serviceName).append("]");
		return builder.toString();
	}

}
