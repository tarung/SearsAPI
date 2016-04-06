package com.rnb.searsapi.stores.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Store Working Hours data wrapper class.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class StoreWorkingHours {

	/** The Thursday open time. */
	@JsonProperty("thuOpenTime")
	private String thuOpenTime;

	/** The Saturday open time. */
	@JsonProperty("satOpenTime")
	private String satOpenTime;

	/** The Thursday close time. */
	@JsonProperty("thuCloseTime")
	private String thuCloseTime;

	/** The Monday close time. */
	@JsonProperty("monCloseTime")
	private String monCloseTime;

	/** The weekday close time. */
	@JsonProperty("weekdayCloseTime")
	private String weekdayCloseTime;

	/** The weekday open time. */
	@JsonProperty("weekdayOpenTime")
	private String weekdayOpenTime;

	/** The Sunday close time. */
	@JsonProperty("sunCloseTime")
	private String sunCloseTime;

	/** The Wednesday open time. */
	@JsonProperty("wedOpenTime")
	private String wedOpenTime;

	/** The Tuesday open time. */
	@JsonProperty("tueOpenTime")
	private String tueOpenTime;

	/** The Friday open time. */
	@JsonProperty("friOpenTime")
	private String friOpenTime;

	/** The Friday close time. */
	@JsonProperty("friCloseTime")
	private String friCloseTime;

	/** The Monday open time. */
	@JsonProperty("monOpenTime")
	private String monOpenTime;

	/** The Tuesday close time. */
	@JsonProperty("tueCloseTime")
	private String tueCloseTime;

	/** The Wednesday close time. */
	@JsonProperty("wedCloseTime")
	private String wedCloseTime;

	/** The Saturday close time. */
	@JsonProperty("satCloseTime")
	private String satCloseTime;

	/** The Sunday open time. */
	@JsonProperty("sunOpenTime")
	private String sunOpenTime;

	/**
	 * Gets the Thursday open time.
	 *
	 * @return the Thursday open time
	 */
	public String getThuOpenTime() {
		return thuOpenTime;
	}

	/**
	 * Sets the Thursday open time.
	 *
	 * @param thuOpenTime the new Thursday open time
	 */
	public void setThuOpenTime(final String thuOpenTime) {
		this.thuOpenTime = thuOpenTime;
	}

	/**
	 * Gets the Saturday open time.
	 *
	 * @return the Saturday open time
	 */
	public String getSatOpenTime() {
		return satOpenTime;
	}

	/**
	 * Sets the Saturday open time.
	 *
	 * @param satOpenTime the new Saturday open time
	 */
	public void setSatOpenTime(final String satOpenTime) {
		this.satOpenTime = satOpenTime;
	}

	/**
	 * Gets the Thursday close time.
	 *
	 * @return the Thursday close time
	 */
	public String getThuCloseTime() {
		return thuCloseTime;
	}

	/**
	 * Sets the Thursday close time.
	 *
	 * @param thuCloseTime the new Thursday close time
	 */
	public void setThuCloseTime(final String thuCloseTime) {
		this.thuCloseTime = thuCloseTime;
	}

	/**
	 * Gets the Monday close time.
	 *
	 * @return the Monday close time
	 */
	public String getMonCloseTime() {
		return monCloseTime;
	}

	/**
	 * Sets the Monday close time.
	 *
	 * @param monCloseTime the new Monday close time
	 */
	public void setMonCloseTime(final String monCloseTime) {
		this.monCloseTime = monCloseTime;
	}

	/**
	 * Gets the weekday close time.
	 *
	 * @return the weekday close time
	 */
	public String getWeekdayCloseTime() {
		return weekdayCloseTime;
	}

	/**
	 * Sets the weekday close time.
	 *
	 * @param weekdayCloseTime the new weekday close time
	 */
	public void setWeekdayCloseTime(final String weekdayCloseTime) {
		this.weekdayCloseTime = weekdayCloseTime;
	}

	/**
	 * Gets the weekday open time.
	 *
	 * @return the weekday open time
	 */
	public String getWeekdayOpenTime() {
		return weekdayOpenTime;
	}

	/**
	 * Sets the weekday open time.
	 *
	 * @param weekdayOpenTime the new weekday open time
	 */
	public void setWeekdayOpenTime(final String weekdayOpenTime) {
		this.weekdayOpenTime = weekdayOpenTime;
	}

	/**
	 * Gets the Sunday close time.
	 *
	 * @return the Sunday close time
	 */
	public String getSunCloseTime() {
		return sunCloseTime;
	}

	/**
	 * Sets the Sunday close time.
	 *
	 * @param sunCloseTime the new Sunday close time
	 */
	public void setSunCloseTime(final String sunCloseTime) {
		this.sunCloseTime = sunCloseTime;
	}

	/**
	 * Gets the Wednesday open time.
	 *
	 * @return the Wednesday open time
	 */
	public String getWedOpenTime() {
		return wedOpenTime;
	}

	/**
	 * Sets the Wednesday open time.
	 *
	 * @param wedOpenTime the new Wednesday open time
	 */
	public void setWedOpenTime(final String wedOpenTime) {
		this.wedOpenTime = wedOpenTime;
	}

	/**
	 * Gets the Tuesday open time.
	 *
	 * @return the Tuesday open time
	 */
	public String getTueOpenTime() {
		return tueOpenTime;
	}

	/**
	 * Sets the Tuesday open time.
	 *
	 * @param tueOpenTime the new Tuesday open time
	 */
	public void setTueOpenTime(final String tueOpenTime) {
		this.tueOpenTime = tueOpenTime;
	}

	/**
	 * Gets the Friday open time.
	 *
	 * @return the Friday open time
	 */
	public String getFriOpenTime() {
		return friOpenTime;
	}

	/**
	 * Sets the Friday open time.
	 *
	 * @param friOpenTime the new Friday open time
	 */
	public void setFriOpenTime(final String friOpenTime) {
		this.friOpenTime = friOpenTime;
	}

	/**
	 * Gets the Friday close time.
	 *
	 * @return the Friday close time
	 */
	public String getFriCloseTime() {
		return friCloseTime;
	}

	/**
	 * Sets the Friday close time.
	 *
	 * @param friCloseTime the new Friday close time
	 */
	public void setFriCloseTime(final String friCloseTime) {
		this.friCloseTime = friCloseTime;
	}

	/**
	 * Gets the Monday open time.
	 *
	 * @return the Monday open time
	 */
	public String getMonOpenTime() {
		return monOpenTime;
	}

	/**
	 * Sets the Monday open time.
	 *
	 * @param monOpenTime the new Monday open time
	 */
	public void setMonOpenTime(final String monOpenTime) {
		this.monOpenTime = monOpenTime;
	}

	/**
	 * Gets the Tuesday close time.
	 *
	 * @return the Tuesday close time
	 */
	public String getTueCloseTime() {
		return tueCloseTime;
	}

	/**
	 * Sets the Tuesday close time.
	 *
	 * @param tueCloseTime the new Tuesday close time
	 */
	public void setTueCloseTime(final String tueCloseTime) {
		this.tueCloseTime = tueCloseTime;
	}

	/**
	 * Gets the Wednesday close time.
	 *
	 * @return the Wednesday close time
	 */
	public String getWedCloseTime() {
		return wedCloseTime;
	}

	/**
	 * Sets the Wednesday close time.
	 *
	 * @param wedCloseTime the new Wednesday close time
	 */
	public void setWedCloseTime(final String wedCloseTime) {
		this.wedCloseTime = wedCloseTime;
	}

	/**
	 * Gets the Saturday close time.
	 *
	 * @return the Saturday close time
	 */
	public String getSatCloseTime() {
		return satCloseTime;
	}

	/**
	 * Sets the Saturday close time.
	 *
	 * @param satCloseTime the new Saturday close time
	 */
	public void setSatCloseTime(final String satCloseTime) {
		this.satCloseTime = satCloseTime;
	}

	/**
	 * Gets the Sunday open time.
	 *
	 * @return the Sunday open time
	 */
	public String getSunOpenTime() {
		return sunOpenTime;
	}

	/**
	 * Sets the Sunday open time.
	 *
	 * @param sunOpenTime the new Sunday open time
	 */
	public void setSunOpenTime(final String sunOpenTime) {
		this.sunOpenTime = sunOpenTime;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("StoreWorkingHours [thuOpenTime=").append(thuOpenTime).append(", satOpenTime=")
				.append(satOpenTime).append(", thuCloseTime=").append(thuCloseTime).append(", monCloseTime=")
				.append(monCloseTime).append(", weekdayCloseTime=").append(weekdayCloseTime)
				.append(", weekdayOpenTime=").append(weekdayOpenTime).append(", sunCloseTime=").append(sunCloseTime)
				.append(", wedOpenTime=").append(wedOpenTime).append(", tueOpenTime=").append(tueOpenTime)
				.append(", friOpenTime=").append(friOpenTime).append(", friCloseTime=").append(friCloseTime)
				.append(", monOpenTime=").append(monOpenTime).append(", tueCloseTime=").append(tueCloseTime)
				.append(", wedCloseTime=").append(wedCloseTime).append(", satCloseTime=").append(satCloseTime)
				.append(", sunOpenTime=").append(sunOpenTime).append("]");
		return builder.toString();
	}

}
