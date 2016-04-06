package com.rnb.searsapi.product.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Shop By XGroups data wrapper.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopByXGroups {

	/** The name. */
	@JsonProperty("Name")
	private String name;

	/** The filter attribute. */
	@JsonProperty("FilterAttribute")
	private String filterAttribute;

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Gets the filter attribute.
	 *
	 * @return the filter attribute
	 */
	public String getFilterAttribute() {
		return filterAttribute;
	}

	/**
	 * Sets the filter attribute.
	 *
	 * @param filterAttribute the new filter attribute
	 */
	public void setFilterAttribute(final String filterAttribute) {
		this.filterAttribute = filterAttribute;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("ShopByXGroups [name=").append(name).append(", filterAttribute=").append(filterAttribute)
		.append("]");
		return builder.toString();
	}

}
