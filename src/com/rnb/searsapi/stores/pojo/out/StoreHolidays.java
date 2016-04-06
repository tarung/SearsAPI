package com.rnb.searsapi.stores.pojo.out;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Store Holidays related data wrapper class.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class StoreHolidays {

	/** The holidays. */
	@JsonProperty("holidays")
	private Holidays[] holidays;

	/**
	 * Gets the holidays.
	 *
	 * @return the holidays
	 */
	public Holidays[] getHolidays() {
		return holidays;
	}

	/**
	 * Sets the holidays.
	 *
	 * @param holidays the new holidays
	 */
	public void setHolidays(final Holidays[] holidays) {
		this.holidays = holidays;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("StoreHolidays [holidays=").append(Arrays.toString(holidays)).append("]");
		return builder.toString();
	}

}
