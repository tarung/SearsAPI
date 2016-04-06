package com.rnb.searsapi.impl;

import static com.rnb.searsapi.base.BaseCriteria.CONFIG;

import com.rnb.searsapi.DealsSearch;
import com.rnb.searsapi.deals.pojo.in.DealsSearchCriteria;
import com.rnb.searsapi.deals.pojo.out.DealCategoriesSearchResults;
import com.rnb.searsapi.deals.pojo.out.DealsSearchResults;

/**
 * The Deals Search Implementation class.
 *
 * @author tarung
 *
 */
public class DealsSearchImpl extends AbstractSearchImpl implements DealsSearch {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.rnb.searsapi.DealsSearch#searchDailySpecialDeals(java.lang.String)
	 */
	@Override
	public DealsSearchResults searchDailySpecialDeals(final String store) {
		final String path = CONFIG.getProperty("specialDeals_pathURI");
		return search(new DealsSearchCriteria(path, store),
				DealsSearchResults.class, 0);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.rnb.searsapi.DealsSearch#searchDailyDeals(java.lang.String)
	 */
	@Override
	public DealsSearchResults searchDailyDeals(final String store) {
		final String path = CONFIG.getProperty("allDeals_pathURI");
		return search(new DealsSearchCriteria(path, store), DealsSearchResults.class, 0);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.rnb.searsapi.DealsSearch#searchWeeklyDealsCategories(java.lang.String
	 * )
	 */
	@Override
	public DealCategoriesSearchResults searchWeeklyDealsCategories(final String store) {
		final String path = CONFIG.getProperty("weeklyDealsCategory_pathURI");
		return search(new DealsSearchCriteria(path, store), DealCategoriesSearchResults.class, 0);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.rnb.searsapi.DealsSearch#searchWeeklyDeals(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public DealsSearchResults searchWeeklyDeals(final String store, final String category) {
		final String path = CONFIG.getProperty("weeklyDeals_pathURI");
		return search(new DealsSearchCriteria(path, store, category), DealsSearchResults.class, 0);
	}

}
