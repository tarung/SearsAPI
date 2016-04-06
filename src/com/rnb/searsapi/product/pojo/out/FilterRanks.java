package com.rnb.searsapi.product.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Filter Ranks data wrapper.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FilterRanks
{

	/** The name. */
	@JsonProperty("Name")
	private String name;

	/** The rank. */
	@JsonProperty("Rank")
	private String rank;

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(final String name)
	{
		this.name = name;
	}

	/**
	 * Gets the rank.
	 *
	 * @return the rank
	 */
	public String getRank()
	{
		return rank;
	}

	/**
	 * Sets the rank.
	 *
	 * @param rank the new rank
	 */
	public void setRank(final String rank)
	{
		this.rank = rank;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("FilterRanks [name=").append(name).append(", rank=").append(rank).append("]");
		return builder.toString();
	}

}
