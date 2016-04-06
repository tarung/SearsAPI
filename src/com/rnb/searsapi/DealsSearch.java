package com.rnb.searsapi;

import com.rnb.searsapi.base.SearchException;
import com.rnb.searsapi.deals.pojo.out.DealCategoriesSearchResults;
import com.rnb.searsapi.deals.pojo.out.DealsSearchResults;

/**
 * The Interface DealsSearch this API retrieves : <br>
 * 1. The Daily special Deals for Sears and KMART stores. <br>
 * 2. The Daily all Deals for Sears and KMART stores. <br>
 * 3. The Weekly deals categories for Sears and KMART stores. <br>
 * 4. The Weekly deals for Sears and KMART stores.
 */
public interface DealsSearch {

	/**
	 * The Daily special Deals (WOW deals) for Sears and KMART stores.
	 *
	 * @param store the store - Sears/Kmart
	 * @return the search results
	 * @throws SearchException a runtime exception thrown in case of any errors
	 *             encountered while performing search calls.
	 */
	public DealsSearchResults searchDailySpecialDeals(String store);

	/**
	 * The Daily all Deals (non-WOW) for Sears and KMART stores.
	 *
	 * @param store the store name
	 * @return the search results
	 */
	public DealsSearchResults searchDailyDeals(String store);

	/**
	 * The Weekly deals categories for Sears and KMART stores. This will
	 * retrieve all available categories for the Hot Weekly Deals for the store
	 * specified.
	 *
	 * @param store the store - Sears/Kmart
	 * @return the search results
	 * @throws SearchException a runtime exception thrown in case of any errors
	 *             encountered while performing search calls.
	 */
	public DealCategoriesSearchResults searchWeeklyDealsCategories(String store);

	/**
	 * The Weekly deals categories for Sears and KMART stores.
	 *
	 * @param store the store - Sears/Kmart
	 * @param category the Category for the deal item
	 * @return the search results
	 * @throws SearchException a runtime exception thrown in case of any errors
	 *             encountered while performing search calls.
	 */
	public DealsSearchResults searchWeeklyDeals(String store, String category);

}
