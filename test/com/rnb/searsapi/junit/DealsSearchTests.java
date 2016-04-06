package com.rnb.searsapi.junit;

import org.junit.Assert;
import org.junit.Test;

import com.rnb.searsapi.DealsSearch;
import com.rnb.searsapi.deals.pojo.out.DealCategoriesSearchResults;
import com.rnb.searsapi.deals.pojo.out.DealsSearchResults;
import com.rnb.searsapi.impl.DealsSearchImpl;

/**
 * The Class DealsSearchTests.
 */
public class DealsSearchTests {

	/**
	 * Test search daily special deals.
	 */
	@Test
	public void testSearchDailySpecialDeals() {
		final DealsSearch ds = new DealsSearchImpl();
		final DealsSearchResults results = ds.searchDailySpecialDeals("Sears");
		Assert.assertNotNull(results);
	}

	/**
	 * Test search daily deals.
	 */
	@Test
	public void testSearchDailyDeals() {
		final DealsSearch ds = new DealsSearchImpl();
		final DealsSearchResults results = ds.searchDailyDeals("Sears");
		Assert.assertNotNull(results);
	}

	/**
	 * Test search weekly deals categories.
	 */
	@Test
	public void testSearchWeeklyDealsCategories() {
		final DealsSearch ds = new DealsSearchImpl();
		final DealCategoriesSearchResults results = ds.searchWeeklyDealsCategories("Sears");
		Assert.assertNotNull(results);
	}

	/**
	 * Test search weekly deals.
	 */
	@Test
	public void testSearchWeeklyDeals() {
		final DealsSearch ds = new DealsSearchImpl();
		final DealsSearchResults results = ds.searchWeeklyDeals("Sears", "Sears_Appliance");
		Assert.assertNotNull(results);
	}

}
