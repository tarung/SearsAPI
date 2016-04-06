package com.rnb.searsapi.product.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Product Categories data wrapper.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Categories
{

	/** The name. */
	@JsonProperty("Name")
	private String name;

	/** The category. */
	@JsonProperty("Category")
	private String category;

	/** Total number of products under this category. */
	@JsonProperty("ProdCountAggr")
	private String prodCountAggr;

	/** The keyword. */
	@JsonProperty("KeyWord")
	private String keyWord;

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
	 * Gets the category.
	 *
	 * @return the category
	 */
	public String getCategory()
	{
		return category;
	}

	/**
	 * Sets the category.
	 *
	 * @param category the new category
	 */
	public void setCategory(final String category)
	{
		this.category = category;
	}

	/**
	 * Gets the total number of products under this category.
	 *
	 * @return the total number of products under this category
	 */
	public String getProdCountAggr()
	{
		return prodCountAggr;
	}

	/**
	 * Sets the total number of products under this category.
	 *
	 * @param prodCountAggr the new total number of products under this category
	 */
	public void setProdCountAggr(final String prodCountAggr)
	{
		this.prodCountAggr = prodCountAggr;
	}

	/**
	 * Gets the keyword.
	 *
	 * @return the keyword
	 */
	public String getKeyWord()
	{
		return keyWord;
	}

	/**
	 * Sets the keyword.
	 *
	 * @param keyWord the new keyword
	 */
	public void setKeyWord(final String keyWord)
	{
		this.keyWord = keyWord;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Categories [name=").append(name).append(", category=").append(category)
				.append(", prodCountAggr=").append(prodCountAggr).append(", keyWord=").append(keyWord).append("]");
		return builder.toString();
	}

}
