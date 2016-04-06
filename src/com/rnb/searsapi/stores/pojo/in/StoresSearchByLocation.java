package com.rnb.searsapi.stores.pojo.in;

import java.io.UnsupportedEncodingException;

/**
 * The Stores Search By Location search criteria wrapper class.
 *
 * @author tarung
 */
public class StoresSearchByLocation extends StoresSearchCriteria {

	/** The minimum allowed latitude. */
	public static double MIN_LATITUDE = Double.valueOf("-90.0000");

	/** The maximum allowed latitude. */
	public static double MAX_LATITUDE = Double.valueOf("90.0000");

	/** The minimum allowed longitude. */
	public static double MIN_LONGITUDE = Double.valueOf("-180.0000");

	/** The maximum allowed longitude. */
	public static double MAX_LONGITUDE = Double.valueOf("180.0000");

	/** The longitude. */
	private double longitude;

	/** The latitude. */
	private double latitude;

	/**
	 * Instantiates a new stores search by location.
	 *
	 * @param storeName the store name
	 * @param longitude the longitude - must be within the MIN(-180) and
	 *            MAX(180)
	 * @param latitude the latitude - must be within MIN(-90) and MAX(90)
	 */
	public StoresSearchByLocation(final String storeName, final double longitude, final double latitude) {
		super(storeName);
		if (isValidLatitude(latitude) == true && isValidLongitude(longitude) == true) {
			this.latitude = latitude;
			this.longitude = longitude;
		} else {
			throw new IllegalArgumentException(
					"Invalid parameter(s) longitued: " + longitude + " and/or latitude: " + latitude);
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.rnb.searsapi.stores.pojo.in.StoresSearchCriteria#getRemainingPath()
	 */
	@Override
	public String getRemainingPath() throws UnsupportedEncodingException {
		return "/longitude/" + longitude + "/latitude/" + latitude;
	}

	/**
	 * A method to validate a latitude value.
	 *
	 * @param latitude the latitude to check is valid
	 * @return true if, and only if, the latitude is within the MIN(-90) and
	 *         MAX(90) latitude
	 */
	private static boolean isValidLatitude(final double latitude) {
		if (latitude >= MIN_LATITUDE && latitude <= MAX_LATITUDE) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * A method to validate a longitude value.
	 *
	 * @param longitude the longitude to check is valid
	 * @return true if, and only if, the longitude is between the MIN(-180) and
	 *         MAX(180) longitude
	 */
	private static boolean isValidLongitude(final double longitude) {
		if (longitude >= MIN_LONGITUDE && longitude <= MAX_LONGITUDE) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Gets the longitude.
	 *
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * Sets the longitude.
	 *
	 * @param longitude the new longitude
	 */
	public void setLongitude(final float longitude) {
		this.longitude = longitude;
	}

	/**
	 * Gets the latitude.
	 *
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * Sets the latitude.
	 *
	 * @param latitude the new latitude
	 */
	public void setLatitude(final float latitude) {
		this.latitude = latitude;
	}

}
