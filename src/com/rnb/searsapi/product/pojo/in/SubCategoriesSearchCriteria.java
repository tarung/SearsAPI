package com.rnb.searsapi.product.pojo.in;

import com.rnb.searsapi.base.Constants;

/**
 *
 * To fetch category-related information from top-level and nth-level
 * categories, such as the list of second-level categories under the Appliances
 * top-level category, or a range of prices of products in the Refrigerators
 * second-level category under the Appliances top-level category.
 *
 * @author tarung
 *
 */
public class SubCategoriesSearchCriteria extends AbstractProductSearchCriteria {

	/**
	 * Instantiates a new sub categories search criteria.
	 *
	 * @param storeName the store name
	 * @param category the category
	 */
	public SubCategoriesSearchCriteria(final String storeName, final String category) {
		super(Constants.SEARCH_TYPE_PRD, storeName, null, category);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("ProductSearchCriteria [").append(super.toString()).append("]");
		return builder.toString();
	}

}
