package com.rnb.searsapi.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rnb.searsapi.ProductSearch;
import com.rnb.searsapi.product.pojo.in.CategorySearchCriteria;
import com.rnb.searsapi.product.pojo.in.KeywordSearchCriteria;
import com.rnb.searsapi.product.pojo.in.SubCategoriesSearchCriteria;
import com.rnb.searsapi.product.pojo.out.ProductSearchResults;

/**
 * The Product Search Implementation.
 *
 * @author tarung
 */
public class ProductSearchImpl extends AbstractSearchImpl implements ProductSearch {

	/** The logger. */
	static final Logger logger = LoggerFactory.getLogger(ProductSearchImpl.class);

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.rnb.searsapi.ProductSearch#searchKeywords(com.rnb.searsapi.product
	 * .pojo.in.KeywordSearchCriteria)
	 */
	@Override
	public ProductSearchResults searchKeywords(final KeywordSearchCriteria criteria) {
		return search(criteria, ProductSearchResults.class, 2);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.rnb.searsapi.ProductSearch#searchCategories(com.rnb.searsapi.product
	 * .pojo.in.CategorySearchCriteria)
	 */
	@Override
	public ProductSearchResults searchCategories(final CategorySearchCriteria criteria) {
		return search(criteria, ProductSearchResults.class, 2);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.rnb.searsapi.ProductSearch#searchProducts(com.rnb.searsapi.product
	 * .pojo.in.ProductSearchCriteria)
	 */
	@Override
	public ProductSearchResults searchSubCategories(final SubCategoriesSearchCriteria criteria) {
		return search(criteria, ProductSearchResults.class, 2);
	}

}
