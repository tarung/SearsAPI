package com.rnb.searsapi.impl;

import com.rnb.searsapi.TopSellersSearch;
import com.rnb.searsapi.product.pojo.in.TopSellersSearchCriteria;
import com.rnb.searsapi.product.pojo.out.ProductSearchResults;

/**
 * The Top Sellers Search Implementation class.
 *
 * @author tarung
 */
public class TopSellersSearchImpl extends AbstractSearchImpl implements TopSellersSearch {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.rnb.searsapi.TopSellersSearch#searchTopSellers(com.rnb.searsapi.product
	 * .pojo.in.TopSellersSearchCriteria)
	 */
	@Override
	public ProductSearchResults searchTopSellers(final TopSellersSearchCriteria criteria) {
		return search(criteria, ProductSearchResults.class, 2);
	}

}
