package com.rnb.searsapi.junit;

import static java.net.URLEncoder.encode;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.UnsupportedEncodingException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rnb.searsapi.StoresSearch;
import com.rnb.searsapi.impl.StoresSearchImpl;
import com.rnb.searsapi.stores.pojo.in.StoresSearchByCity;
import com.rnb.searsapi.stores.pojo.in.StoresSearchByLocation;
import com.rnb.searsapi.stores.pojo.in.StoresSearchByUnitNumber;
import com.rnb.searsapi.stores.pojo.in.StoresSearchByZip;
import com.rnb.searsapi.stores.pojo.out.StoresSearchResults;

public class StoreSearchTest {

	/** The logger. */
	private static final Logger logger = LoggerFactory.getLogger(StoreSearchTest.class);

	@Rule
	public TestName name = new TestName();

	@Test
	public void testURLs() {

		final StoresSearchByCity s1 = new StoresSearchByCity("Sears", "Chicago", "IL");
		assertTrue(s1.getFullURL().indexOf("Sears") != -1);
		assertTrue(s1.getFullURL().indexOf("/city/Chicago/") != -1);
		assertTrue(s1.getFullURL().indexOf("/state/IL") != -1);

		final StoresSearchByZip s2 = new StoresSearchByZip("Sears", "60606");
		assertTrue(s2.getFullURL().indexOf("Sears") != -1);
		assertTrue(s2.getFullURL().indexOf("/zip/60606") != -1);

		// /longitude/-122.345379/latitude/47.744337
		final StoresSearchByLocation s3 = new StoresSearchByLocation("Sears", -122.345379, 47.744337);
		assertTrue(s3.getFullURL().indexOf("Sears") != -1);
		assertTrue(s3.getFullURL().indexOf("/longitude/-122.345379") != -1);
		assertTrue(s3.getFullURL().indexOf("/latitude/47.744337") != -1);

		// Test url encoding
		final StoresSearchByCity s4 = new StoresSearchByCity("Sears", "New York City", "NY");
		assertTrue(s4.getFullURL().indexOf("Sears") != -1);
		try {
			assertTrue(s4.getFullURL().indexOf("/city/" + encode("New York City", "UTF-8")) != -1);
		} catch (final UnsupportedEncodingException e) {
		}
		assertTrue(s4.getFullURL().indexOf("/state/NY") != -1);

	}

	@Test
	public void testSearchByZipCode() {

		final StoresSearchByZip s = new StoresSearchByZip("Sears", "60602");
		final StoresSearch search = new StoresSearchImpl();
		final StoresSearchResults results = search.searchStoresByZipCode(s);
		assertStatus(results);

		final int storeCount = results.getShowStoreInfo().getGetStoreInfo().getStoreCount();
		assertTrue(storeCount > 0);
		logger.debug(name.getMethodName() + " Number of stores in results- " + storeCount);
	}

	@Test
	public void testSearchByCity() {

		final StoresSearchByCity s = new StoresSearchByCity("Sears", "Chicago", "IL");
		final StoresSearch search = new StoresSearchImpl();
		final StoresSearchResults results = search.searchStoresByCity(s);
		assertStatus(results);

		final int storeCount = results.getShowStoreInfo().getGetStoreInfo().getStoreCount();
		assertTrue(storeCount > 0);
		logger.debug(name.getMethodName() + " Number of stores in results- " + storeCount);
	}

	@Test
	public void testSearchByLocation() {
		final StoresSearchByLocation s = new StoresSearchByLocation("Sears", -122.34537987, 47.744337);
		final StoresSearch search = new StoresSearchImpl();
		final StoresSearchResults results = search.searchStoresByLocation(s);
		assertStatus(results);

		final int storeCount = results.getShowStoreInfo().getGetStoreInfo().getStoreCount();
		assertTrue(storeCount > 0);
		logger.debug(name.getMethodName() + " Number of stores in results- " + storeCount);
	}

	@Test
	public void testSearchByLocationAndRadius() {
		final StoresSearchByLocation s = new StoresSearchByLocation("Sears", -122.34537987, 47.744337);
		s.setMileRadius(50);
		final StoresSearch search = new StoresSearchImpl();
		final StoresSearchResults results = search.searchStoresByLocation(s);
		assertStatus(results);

		final int storeCount = results.getShowStoreInfo().getGetStoreInfo().getStoreCount();
		assertTrue(storeCount > 0);
		logger.debug(name.getMethodName() + " Number of stores in 50 miles radius- " + storeCount);
	}

	@Test
	public void testSearchByLocationAndAds() {
		final StoresSearchByLocation s = new StoresSearchByLocation("Sears", -122.34537987, 47.744337);
		s.setMileRadius(50);
		s.setWeeklyAd(true);
		final StoresSearch search = new StoresSearchImpl();
		final StoresSearchResults results = search.searchStoresByLocation(s);
		assertStatus(results);

		final int storeCount = results.getShowStoreInfo().getGetStoreInfo().getStoreCount();
		assertTrue(storeCount > 0);
		logger.debug(name.getMethodName() + " Number of stores in 50 miles radius with weekly ads " + storeCount);
	}

	@Test
	public void testSearchByLocationAndSearchType() {
		final StoresSearchByLocation s = new StoresSearchByLocation("Sears", -122.34537987, 47.744337);
		s.setMileRadius(100);
		s.setSearchType("Sears_Stores");
		final StoresSearch search = new StoresSearchImpl();
		final StoresSearchResults results = search.searchStoresByLocation(s);
		assertStatus(results);

		final int storeCount = results.getShowStoreInfo().getGetStoreInfo().getStoreCount();
		assertTrue(storeCount > 0);
		logger.debug(name.getMethodName() + " Number of stores in 100 miles and Sears_Stores " + storeCount);
	}

	@Test
	public void testSearchByLocationSortByDistance() {
		final StoresSearchByLocation s = new StoresSearchByLocation("Sears", -122.34537987, 47.744337);
		s.setMileRadius(100);
		s.setSortFlag(true);
		final StoresSearch search = new StoresSearchImpl();
		final StoresSearchResults results = search.searchStoresByLocation(s);
		assertStatus(results);

		final int storeCount = results.getShowStoreInfo().getGetStoreInfo().getStoreCount();
		assertTrue(storeCount > 0);
		logger.debug(name.getMethodName() + " Number of stores in 100 miles and Sears_Stores " + storeCount);
	}

	@Test
	public void testSearchByUnitNumber() {
		final StoresSearchByUnitNumber s = new StoresSearchByUnitNumber("Sears", "3124");
		final StoresSearch search = new StoresSearchImpl();
		final StoresSearchResults results = search.searchStoresByUnitNumber(s);
		assertStatus(results);

		final int storeCount = results.getShowStoreInfo().getGetStoreInfo().getStoreCount();
		assertTrue(storeCount > 0);
		logger.debug(name.getMethodName() + " Number of stores in 50 miles radius " + storeCount);
	}

	private void assertStatus(final StoresSearchResults results) {
		logger.debug(name.getMethodName() + " results: " + results);
		assertNotNull(results);
		assertNotNull(results.getShowStoreInfo());
		assertNotNull(results.getShowStoreInfo().getStatus());
		assertEquals("Successful", results.getShowStoreInfo().getStatus().getRespMessage());
	}
}
