package com.rnb.searsapi.product.pojo.in;

import com.rnb.searsapi.base.Constants;

/**
 * To fetch products from an nth-level category, such as to retrieve all of the
 * products in the Refrigerators second-level category under the Appliances
 * top-level category.
 *
 * @author tarung
 *
 */
public class CategorySearchCriteria extends AbstractProductSearchCriteria {

	/**
	 * Instantiates a new category search criteria.
	 *
	 * @param storeName the store name
	 * @param category the category
	 */
	public CategorySearchCriteria(final String storeName, final String category) {
		super(Constants.SEARCH_TYPE_CAT, storeName, null, category);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("CategorySearchCriteria [").append(super.toString()).append("]");
		return builder.toString();
	}

}
