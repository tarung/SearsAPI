package com.rnb.searsapi.stores.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Holidays wrapper class.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Holidays {

	/** The holiday start time. */
	@JsonProperty("holidayStartTime")
	private String holidayStartTime;

	/** The holiday date. */
	@JsonProperty("holidayDate")
	private String holidayDate;

	/** The holiday close time. */
	@JsonProperty("holidayCloseTime")
	private String holidayCloseTime;

	/**
	 * Gets the holiday start time.
	 *
	 * @return the holiday start time
	 */
	public String getHolidayStartTime() {
		return holidayStartTime;
	}

	/**
	 * Sets the holiday start time.
	 *
	 * @param holidayStartTime the new holiday start time
	 */
	public void setHolidayStartTime(final String holidayStartTime) {
		this.holidayStartTime = holidayStartTime;
	}

	/**
	 * Gets the holiday date.
	 *
	 * @return the holiday date
	 */
	public String getHolidayDate() {
		return holidayDate;
	}

	/**
	 * Sets the holiday date.
	 *
	 * @param holidayDate the new holiday date
	 */
	public void setHolidayDate(final String holidayDate) {
		this.holidayDate = holidayDate;
	}

	/**
	 * Gets the holiday close time.
	 *
	 * @return the holiday close time
	 */
	public String getHolidayCloseTime() {
		return holidayCloseTime;
	}

	/**
	 * Sets the holiday close time.
	 *
	 * @param holidayCloseTime the new holiday close time
	 */
	public void setHolidayCloseTime(final String holidayCloseTime) {
		this.holidayCloseTime = holidayCloseTime;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Holidays [holidayStartTime=").append(holidayStartTime).append(", holidayDate=")
		.append(holidayDate).append(", holidayCloseTime=").append(holidayCloseTime).append("]");
		return builder.toString();
	}

}
