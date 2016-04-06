package com.rnb.searsapi;

import com.rnb.searsapi.base.SearchException;
import com.rnb.searsapi.product.pojo.in.CategorySearchCriteria;
import com.rnb.searsapi.product.pojo.in.KeywordSearchCriteria;
import com.rnb.searsapi.product.pojo.in.SubCategoriesSearchCriteria;
import com.rnb.searsapi.product.pojo.out.ProductSearchResults;

/**
 * The Interface ProductSearch - The Product Search API allows developers to
 * search and browse sears.com and kmart.com catalogs.
 *
 * @author tarung
 */
public interface ProductSearch {

	/**
	 * To fetch products based on keyword search, such as to retrieve all of the
	 * products with the keyword “cribs”.
	 *
	 * @param criteria the search criteria
	 * @return the search results
	 * @throws SearchException a runtime exception thrown in case of any errors
	 *             encountered while performing search calls.
	 */
	public ProductSearchResults searchKeywords(KeywordSearchCriteria criteria);

	/**
	 * To fetch products from an nth-level category, such as to retrieve all of
	 * the products in the Refrigerators second-level category under the
	 * Appliances top-level category.
	 *
	 * @param criteria the search criteria
	 * @return the search result
	 * @throws SearchException a runtime exception thrown in case of any errors
	 *             encountered while performing search calls.
	 */
	public ProductSearchResults searchCategories(CategorySearchCriteria criteria);

	/**
	 * To fetch category-related information from top-level and nth-level
	 * categories, such as the list of second-level categories under the
	 * Appliances top-level category, or a range of prices of products in the
	 * Refrigerators second-level category under the Appliances top-level
	 * category.
	 *
	 * @param criteria the search criteria
	 * @return the search result
	 * @throws SearchException a runtime exception thrown in case of any errors
	 *             encountered while performing search calls.
	 */
	public ProductSearchResults searchSubCategories(SubCategoriesSearchCriteria criteria);

}
