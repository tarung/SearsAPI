package com.rnb.searsapi.product.pojo.out;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Filter Products related data wrapper.
 *
 * @author tarung
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FilterProducts
{

	/** The filter key. */
	@JsonProperty("FilterKey")
	private String filterKey;

	/** The filter values. */
	@JsonProperty("FilterValues")
	private FilterValues[] filterValues;

	/**
	 * Gets the filter key.
	 *
	 * @return the filter key
	 */
	public String getFilterKey()
	{
		return filterKey;
	}

	/**
	 * Sets the filter key.
	 *
	 * @param filterKey the new filter key
	 */
	public void setFilterKey(final String filterKey)
	{
		this.filterKey = filterKey;
	}

	/**
	 * Gets the filter values.
	 *
	 * @return the filter values
	 */
	public FilterValues[] getFilterValues()
	{
		return filterValues;
	}

	/**
	 * Sets the filter values.
	 *
	 * @param filterValues the new filter values
	 */
	public void setFilterValues(final FilterValues[] filterValues)
	{
		this.filterValues = filterValues;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("FilterProducts [filterKey=").append(filterKey).append(", filterValues=")
				.append(Arrays.toString(filterValues)).append("]");
		return builder.toString();
	}

}
