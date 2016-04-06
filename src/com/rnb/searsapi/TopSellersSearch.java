package com.rnb.searsapi;

import com.rnb.searsapi.base.SearchException;
import com.rnb.searsapi.product.pojo.in.TopSellersSearchCriteria;
import com.rnb.searsapi.product.pojo.out.ProductSearchResults;

/**
 * This interface contains TopSellers v2.1 API - The Top Sellers API allows
 * developers to retrieve the top-selling or most-viewed products from a given
 * category within the Sears or Kmart catalog.
 *
 * @author tarung
 */
public interface TopSellersSearch {

	/**
	 * The Top Sellers API allows developers to retrieve the top-selling or
	 * most-viewed products from a given category within the Sears or Kmart
	 * catalog.
	 *
	 * @param criteria the search criteria
	 * @return the search results
	 * @throws SearchException a runtime exception thrown in case of any errors
	 *             encountered while performing search calls.
	 */
	public ProductSearchResults searchTopSellers(TopSellersSearchCriteria criteria);

}
