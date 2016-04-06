package com.rnb.searsapi.stores.pojo.in;

import static com.rnb.searsapi.base.Constants.UTF_8;
import static java.net.URLEncoder.encode;

import java.io.UnsupportedEncodingException;

import com.rnb.searsapi.base.StaticUtil;

/**
 * The Stores Search By City search criteria wrapper class.
 *
 * @author tarung
 */
public class StoresSearchByCity extends StoresSearchCriteria {

	/** The city. */
	private final String city;

	/** The state. */
	private final String state;

	/**
	 * Instantiates a new stores search by city.
	 *
	 * @param storeName the store name, can't be null or empty.
	 * @param city the city, can't be null or empty.
	 * @param state the state, can't be null or empty.
	 */
	public StoresSearchByCity(final String storeName, final String city, final String state) {
		super(storeName);
		if (StaticUtil.isBlank(city) || StaticUtil.isBlank(state)) {
			throw new IllegalArgumentException("Invalid value for city: " + city + " or state: " + state);
		}
		this.city = city;
		this.state = state;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.rnb.searsapi.stores.pojo.in.StoresSearchCriteria#getRemainingPath()
	 */
	@Override
	public String getRemainingPath() throws UnsupportedEncodingException {
		return "/city/" + encode(city, UTF_8) + "/state/" + encode(state, UTF_8);
	}

}
