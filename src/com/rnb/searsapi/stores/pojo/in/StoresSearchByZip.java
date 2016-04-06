package com.rnb.searsapi.stores.pojo.in;

import static com.rnb.searsapi.base.Constants.UTF_8;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.rnb.searsapi.base.StaticUtil;

/**
 * The Stores Search By Zip code search criteria wrapper class.
 *
 * @author tarung
 */
public class StoresSearchByZip extends StoresSearchCriteria {

	/** The zip code. */
	private String zipCode;

	/**
	 * Instantiates a new stores search by zip.
	 *
	 * @param storeName the store name, can't be null or empty.
	 * @param zipCode the zip code, can't be null or empty.
	 */
	public StoresSearchByZip(final String storeName, final String zipCode) {
		super(storeName);
		if (StaticUtil.isBlank(zipCode)) {
			throw new IllegalArgumentException("Invalid value of zip code:" + zipCode);
		}
		this.zipCode = zipCode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.rnb.searsapi.stores.pojo.in.StoresSearchCriteria#getRemainingPath()
	 */
	@Override
	public String getRemainingPath() throws UnsupportedEncodingException {
		return "/zip/" + URLEncoder.encode(zipCode, UTF_8);
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

}
