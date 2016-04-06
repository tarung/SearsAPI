package com.rnb.searsapi.product.pojo.in;

import com.rnb.searsapi.base.Constants;

/**
 * Keyword search input Criteria - To fetch products based on keyword search,
 * such as to retrieve all of the products with the keyword “cribs”.
 *
 * @author tarung
 */
public class KeywordSearchCriteria extends AbstractProductSearchCriteria {

	/**
	 * Instantiates a new keyword search criteria.
	 *
	 * @param storeName the store name
	 * @param keyWord the key word
	 */
	public KeywordSearchCriteria(final String storeName, final String keyWord) {
		super(Constants.SEARCH_TYPE_KY_WD, storeName, keyWord, null);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("KeywordSearchCriteria [").append(super.toString()).append("]");
		return builder.toString();
	}

}
