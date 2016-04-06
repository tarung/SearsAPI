package com.rnb.searsapi.stores.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Location data wrapper.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {

	/** The distance. */
	@JsonProperty("distance")
	private String distance;

	/** The address. */
	@JsonProperty("address")
	private Address address;

	/** The longitude. */
	@JsonProperty("longitude")
	private String longitude;

	/** The latitude. */
	@JsonProperty("latitude")
	private String latitude;

	/**
	 * Gets the distance.
	 *
	 * @return the distance
	 */
	public String getDistance() {
		return distance;
	}

	/**
	 * Sets the distance.
	 *
	 * @param distance the new distance
	 */
	public void setDistance(final String distance) {
		this.distance = distance;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(final Address address) {
		this.address = address;
	}

	/**
	 * Gets the longitude.
	 *
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * Sets the longitude.
	 *
	 * @param longitude the new longitude
	 */
	public void setLongitude(final String longitude) {
		this.longitude = longitude;
	}

	/**
	 * Gets the latitude.
	 *
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * Sets the latitude.
	 *
	 * @param latitude the new latitude
	 */
	public void setLatitude(final String latitude) {
		this.latitude = latitude;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Location [distance=").append(distance).append(", address=").append(address)
		.append(", longitude=").append(longitude).append(", latitude=").append(latitude).append("]");
		return builder.toString();
	}

}
