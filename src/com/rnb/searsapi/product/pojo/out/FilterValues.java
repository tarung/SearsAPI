package com.rnb.searsapi.product.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Filter Values Data wrapper.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FilterValues
{

	/** The name. */
	@JsonProperty("Name")
	private String name;

	/** The content count. */
	@JsonProperty("ContentCount")
	private String contentCount;

	/** The filter index. */
	@JsonProperty("FilterIndex")
	private String filterIndex;

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
	 * Gets the content count.
	 *
	 * @return the content count
	 */
	public String getContentCount()
	{
		return contentCount;
	}

	/**
	 * Sets the content count.
	 *
	 * @param contentCount the new content count
	 */
	public void setContentCount(final String contentCount)
	{
		this.contentCount = contentCount;
	}

	/**
	 * Gets the filter index.
	 *
	 * @return the filter index
	 */
	public String getFilterIndex()
	{
		return filterIndex;
	}

	/**
	 * Sets the filter index.
	 *
	 * @param filterIndex the new filter index
	 */
	public void setFilterIndex(final String filterIndex)
	{
		this.filterIndex = filterIndex;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("FilterValues [name=").append(name).append(", contentCount=").append(contentCount)
				.append(", filterIndex=").append(filterIndex).append("]");
		return builder.toString();
	}

}
