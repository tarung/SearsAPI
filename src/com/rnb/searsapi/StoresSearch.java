package com.rnb.searsapi;

import com.rnb.searsapi.base.SearchException;
import com.rnb.searsapi.stores.pojo.in.StoresSearchByCity;
import com.rnb.searsapi.stores.pojo.in.StoresSearchByLocation;
import com.rnb.searsapi.stores.pojo.in.StoresSearchByUnitNumber;
import com.rnb.searsapi.stores.pojo.in.StoresSearchByZip;
import com.rnb.searsapi.stores.pojo.out.StoresSearchResults;

/**
 * This API is used to retrieve store information , such as basic details of a
 * store, working hours and services offered. This API will allow developers to
 * get information on Sears / Kmart stores available for a city and state, ZIP
 * code, or latitude and longitude given as input. This interface provides
 * following methods :
 *
 * 1. Fetch stores for given zip code <br>
 * 2. Fetch stores for given city and state<br>
 * 3. Fetch stores for given longitude and latitude<br>
 * 4. Fetch stores for given store number <br>
 *
 * @author tarung
 *
 */
public interface StoresSearch {

	/**
	 * Search stores by zip code.
	 *
	 * @param searchCriteria the search criteria
	 * @return the search results
	 * @throws SearchException a runtime exception thrown in case of any errors
	 *             encountered while performing search calls.
	 */
	public StoresSearchResults searchStoresByZipCode(StoresSearchByZip searchCriteria);

	/**
	 * Search stores by city and state.
	 *
	 * @param searchCriteria the search criteria
	 * @return the search results
	 * @throws SearchException a runtime exception thrown in case of any errors
	 *             encountered while performing search calls.
	 */
	public StoresSearchResults searchStoresByCity(StoresSearchByCity searchCriteria);

	/**
	 * Search stores by location.
	 *
	 * @param searchCriteria the search criteria
	 * @return the search results
	 * @throws SearchException a runtime exception thrown in case of any errors
	 *             encountered while performing search calls.
	 */
	public StoresSearchResults searchStoresByLocation(StoresSearchByLocation searchCriteria);

	/**
	 * Search stores by unit number.
	 *
	 * @param searchCriteria the search criteria
	 * @return the search results
	 * @throws SearchException a runtime exception thrown in case of any errors
	 *             encountered while performing search calls.
	 */
	public StoresSearchResults searchStoresByUnitNumber(StoresSearchByUnitNumber searchCriteria);

}
