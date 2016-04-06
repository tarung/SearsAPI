package com.rnb.searsapi.stores.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Store Address data wrapper class.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {

	/** The street address. */
	@JsonProperty("streetAddress")
	private String streetAddress;

	/** The county. */
	@JsonProperty("county")
	private String county;

	/** The zip code. */
	@JsonProperty("zipCode")
	private String zipCode;

	/** The state. */
	@JsonProperty("state")
	private String state;

	/** The full state name. */
	@JsonProperty("fullStateName")
	private String fullStateName;

	/** The country. */
	@JsonProperty("country")
	private String country;

	/** The city. */
	@JsonProperty("city")
	private String city;

	/**
	 * Gets the street address.
	 *
	 * @return the street address
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * Sets the street address.
	 *
	 * @param streetAddress the new street address
	 */
	public void setStreetAddress(final String streetAddress) {
		this.streetAddress = streetAddress;
	}

	/**
	 * Gets the county.
	 *
	 * @return the county
	 */
	public String getCounty() {
		return county;
	}

	/**
	 * Sets the county.
	 *
	 * @param county the new county
	 */
	public void setCounty(final String county) {
		this.county = county;
	}

	/**
	 * Gets the zip code.
	 *
	 * @return the zip code
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * Sets the zip code.
	 *
	 * @param zipCode the new zip code
	 */
	public void setZipCode(final String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets the state.
	 *
	 * @param state the new state
	 */
	public void setState(final String state) {
		this.state = state;
	}

	/**
	 * Gets the full state name.
	 *
	 * @return the full state name
	 */
	public String getFullStateName() {
		return fullStateName;
	}

	/**
	 * Sets the full state name.
	 *
	 * @param fullStateName the new full state name
	 */
	public void setFullStateName(final String fullStateName) {
		this.fullStateName = fullStateName;
	}

	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the country.
	 *
	 * @param country the new country
	 */
	public void setCountry(final String country) {
		this.country = country;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(final String city) {
		this.city = city;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Address [streetAddress=").append(streetAddress).append(", county=").append(county)
		.append(", zipCode=").append(zipCode).append(", state=").append(state).append(", fullStateName=")
		.append(fullStateName).append(", country=").append(country).append(", city=").append(city).append("]");
		return builder.toString();
	}

}
