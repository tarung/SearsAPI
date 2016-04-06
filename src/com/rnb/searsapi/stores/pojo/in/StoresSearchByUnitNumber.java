package com.rnb.searsapi.stores.pojo.in;

import static com.rnb.searsapi.base.Constants.UTF_8;
import static java.net.URLEncoder.encode;

import java.io.UnsupportedEncodingException;

import com.rnb.searsapi.base.StaticUtil;

/**
 * The Stores Search By UnitNumber search criteria wrapper class.
 *
 * @author tarung
 */
public class StoresSearchByUnitNumber extends StoresSearchCriteria {

	/** The unit number. */
	private String unitNumber;

	/**
	 * Instantiates a new stores search by unit number.
	 *
	 * @param storeName the store name
	 * @param unitNumber the unit number
	 */
	public StoresSearchByUnitNumber(final String storeName, final String unitNumber) {
		super(storeName);
		if (StaticUtil.isBlank(unitNumber)) {
			throw new IllegalArgumentException("Invalid value of zip code:" + unitNumber);
		}
		this.unitNumber = unitNumber;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.rnb.searsapi.stores.pojo.in.StoresSearchCriteria#getRemainingPath()
	 */
	@Override
	public String getRemainingPath() throws UnsupportedEncodingException {
		return "/unitnumber/" + encode(unitNumber, UTF_8);
	}

	/**
	 * Gets the unit number.
	 *
	 * @return the unit number
	 */
	public String getUnitNumber() {
		return unitNumber;
	}

	/**
	 * Sets the unit number.
	 *
	 * @param unitNumber the new unit number
	 */
	public void setUnitNumber(final String unitNumber) {
		this.unitNumber = unitNumber;
	}

}
