package com.rnb.searsapi.impl;

import com.rnb.searsapi.StoresSearch;
import com.rnb.searsapi.stores.pojo.in.StoresSearchByCity;
import com.rnb.searsapi.stores.pojo.in.StoresSearchByLocation;
import com.rnb.searsapi.stores.pojo.in.StoresSearchByUnitNumber;
import com.rnb.searsapi.stores.pojo.in.StoresSearchByZip;
import com.rnb.searsapi.stores.pojo.out.StoresSearchResults;

/**
 * The Stores Search Implementation class.
 *
 * @author tarung
 */
public class StoresSearchImpl extends AbstractSearchImpl implements StoresSearch {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.rnb.searsapi.StoresSearch#searchStoresByZipCode(com.rnb.searsapi.
	 * stores.pojo.in.StoresSearchByZip)
	 */
	@Override
	public StoresSearchResults searchStoresByZipCode(final StoresSearchByZip searchCriteria) {
		return search(searchCriteria, StoresSearchResults.class, 0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.rnb.searsapi.StoresSearch#searchStoresByCity(com.rnb.searsapi.stores
	 * .pojo.in.StoresSearchByCity)
	 */
	@Override
	public StoresSearchResults searchStoresByCity(final StoresSearchByCity searchCriteria) {
		return search(searchCriteria, StoresSearchResults.class, 0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.rnb.searsapi.StoresSearch#searchStoresByLocation(com.rnb.searsapi
	 * .stores.pojo.in.StoresSearchByLocation)
	 */
	@Override
	public StoresSearchResults searchStoresByLocation(final StoresSearchByLocation searchCriteria) {
		return search(searchCriteria, StoresSearchResults.class, 0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.rnb.searsapi.StoresSearch#searchStoresByUnitNumber(com.rnb.searsapi
	 * .stores.pojo.in.StoresSearchByUnitNumber)
	 */
	@Override
	public StoresSearchResults searchStoresByUnitNumber(final StoresSearchByUnitNumber searchCriteria) {
		return search(searchCriteria, StoresSearchResults.class, 0);
	}

}
