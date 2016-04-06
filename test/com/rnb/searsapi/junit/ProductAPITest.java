package com.rnb.searsapi.junit;

import static com.rnb.searsapi.base.Constants.ACCEPT_JSON;
import static com.rnb.searsapi.base.Constants.CONTENT_JSON;
import static com.rnb.searsapi.base.Constants.SEARCH_TYPE_RVN;
import static com.rnb.searsapi.base.Constants.SEARCH_TYPE_UNT;
import static com.rnb.searsapi.base.Constants.SEARCH_TYPE_VW;
import static com.rnb.searsapi.base.Constants.STORE_NAME_SRS;
import static com.rnb.searsapi.product.pojo.in.ProductSearchSortBy.PRICE_LOW_TO_HIGH;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rnb.searsapi.ProductSearch;
import com.rnb.searsapi.TopSellersSearch;
import com.rnb.searsapi.base.Constants;
import com.rnb.searsapi.base.ParserUtil;
import com.rnb.searsapi.impl.ProductSearchImpl;
import com.rnb.searsapi.impl.TopSellersSearchImpl;
import com.rnb.searsapi.product.pojo.in.CategorySearchCriteria;
import com.rnb.searsapi.product.pojo.in.KeywordSearchCriteria;
import com.rnb.searsapi.product.pojo.in.SubCategoriesSearchCriteria;
import com.rnb.searsapi.product.pojo.in.TopSellersSearchCriteria;
import com.rnb.searsapi.product.pojo.out.FeaturedCategories;
import com.rnb.searsapi.product.pojo.out.ProductSearchResults;

public class ProductAPITest {

	/** The logger. */
	private static final Logger logger = LoggerFactory.getLogger(ParserUtil.class);

	@Rule
	public TestName name = new TestName();

	@Test
	public void testBaseCriteria() {
		final KeywordSearchCriteria base = new KeywordSearchCriteria(Constants.STORE_NAME_KMRT, "Test");
		assertEquals(base.getAccept(), ACCEPT_JSON);
		assertEquals(base.getContent(), CONTENT_JSON);
		assertNotNull(base.getApiKey());
	}

	// //////////////////////////
	//
	// Keyword search tests
	//
	// //////////////////////////

	@Test
	public void testKeywordLaptops() {
		final KeywordSearchCriteria searchCriteria = new KeywordSearchCriteria(Constants.STORE_NAME_SRS, "laptops");
		performKeywordTest(searchCriteria);
	}

	@Test
	public void testKeywordPhotoFrames() {
		// keyword with space.
		final KeywordSearchCriteria searchCriteria = new KeywordSearchCriteria(Constants.STORE_NAME_SRS, "photo frames");
		performKeywordTest(searchCriteria);
	}

	@Test
	public void testKeywordPhotoP_G() {
		// keyword with special char.
		final KeywordSearchCriteria searchCriteria = new KeywordSearchCriteria(Constants.STORE_NAME_SRS, "P&G");
		performKeywordTest(searchCriteria, false);// records retrieved are
		// likely to be less than 25
	}

	@Test
	public void testKeywordLaptops100Results() {
		final KeywordSearchCriteria searchCriteria = new KeywordSearchCriteria(Constants.STORE_NAME_SRS, "laptops");
		searchCriteria.setStartIndex(1);
		searchCriteria.setEndIndex(100);
		performKeywordTest(searchCriteria);
	}

	@Test
	public void testKeywordLaptopsNext100Results() {
		final KeywordSearchCriteria searchCriteria = new KeywordSearchCriteria(Constants.STORE_NAME_SRS, "laptops");
		searchCriteria.setStartIndex(101);
		searchCriteria.setEndIndex(200);
		performKeywordTest(searchCriteria);
	}

	@Test
	public void testKeywordLaptopsSortedByPrice() {
		final KeywordSearchCriteria searchCriteria = new KeywordSearchCriteria(Constants.STORE_NAME_SRS, "laptops");
		searchCriteria.setStartIndex(1);
		searchCriteria.setEndIndex(100);
		searchCriteria.setSortBy(PRICE_LOW_TO_HIGH);
		performKeywordTest(searchCriteria);
	}

	@Test
	public void testKeywordLaptopsFilterByBrand() {
		final KeywordSearchCriteria searchCriteria = new KeywordSearchCriteria(Constants.STORE_NAME_SRS, "laptops");
		searchCriteria.setFilter("brand|Dell");
		performKeywordTest(searchCriteria);
	}

	private void performKeywordTest(final KeywordSearchCriteria searchCriteria, final boolean checkResultsSize) {

		final int expectedRecords = searchCriteria.getStartIndex() == 0 && searchCriteria.getEndIndex() == 0 ? 25
				: searchCriteria.getEndIndex() - searchCriteria.getStartIndex() + 1;

		final ProductSearch searchInterface = new ProductSearchImpl();
		final ProductSearchResults results = searchInterface.searchKeywords(searchCriteria);
		logger.debug(name.getMethodName() + " results: " + results);
		assertNotNull(results);
		// assert status
		assertNotNull(results.getStatus());
		assertEquals("Successful", results.getStatus().getRespMessage());
		// assert at least one result
		assertTrue(results.getProductCount() > 0);
		// White spaces are replaced by '+' and converted to lower case
		final String keyWord = searchCriteria.getKeyWord().trim().replaceAll("\\s", "+").toLowerCase();
		assertEquals(keyWord, results.getCategories()[0].getKeyWord());
		if (checkResultsSize) {
			assertEquals(expectedRecords, results.getProducts().length);
		}

	}

	private void performKeywordTest(final KeywordSearchCriteria searchCriteria) {
		performKeywordTest(searchCriteria, true);
	}

	// //////////////////////////
	//
	// Categories search tests
	//
	// //////////////////////////

	@Test
	public void testCategoriesAppliances() {
		final CategorySearchCriteria searchCriteria = new CategorySearchCriteria(Constants.STORE_NAME_SRS, "Appliances");
		performCategoryTest(searchCriteria);
	}

	@Test
	public void testCategoriesHome() {
		final CategorySearchCriteria searchCriteria = new CategorySearchCriteria(Constants.STORE_NAME_SRS, "Home");
		performCategoryTest(searchCriteria);
	}

	@Test
	public void testCategoriesNull() {

		// When category is not specified in Category Search, a list of
		// verticals (departments ) are returned
		final CategorySearchCriteria searchCriteria = new CategorySearchCriteria(Constants.STORE_NAME_SRS, null);
		final ProductSearch searchInterface = new ProductSearchImpl();
		final ProductSearchResults results = searchInterface.searchCategories(searchCriteria);
		logger.debug("testCategoriesNull results: " + results);
		assertNotNull(results);
		assertNotNull(results.getVerticals());
	}

	private void performCategoryTest(final CategorySearchCriteria searchCriteria, final boolean checkResultsSize) {

		final ProductSearch searchInterface = new ProductSearchImpl();
		final ProductSearchResults results = searchInterface.searchCategories(searchCriteria);
		logger.debug(name.getMethodName() + " results: " + results);
		assertNotNull(results);
		// assert status
		assertNotNull(results.getStatus());
		assertEquals("Successful", results.getStatus().getRespMessage());
		assertNotNull(results.getFeaturedCategories());

		for (final FeaturedCategories cat : results.getFeaturedCategories()) {
			assertTrue(cat.getCategory().startsWith(searchCriteria.getCategory()));
		}
	}

	private void performCategoryTest(final CategorySearchCriteria searchCriteria) {
		performCategoryTest(searchCriteria, true);
	}

	// //////////////////////////
	//
	// Sub-Categories search tests
	//
	// //////////////////////////

	@Test
	public void testSubCategoriesSearch() {

		final SubCategoriesSearchCriteria searchCriteria = new SubCategoriesSearchCriteria(Constants.STORE_NAME_SRS,
				"Appliances|Accessories");

		final ProductSearch searchInterface = new ProductSearchImpl();
		final ProductSearchResults results = searchInterface.searchSubCategories(searchCriteria);

		logger.debug(name.getMethodName() + " results: " + results);
		assertNotNull(results);

		// assert status
		assertNotNull(results.getStatus());
		assertEquals("Successful", results.getStatus().getRespMessage());

	}

	// //////////////////////////
	//
	// Top sellers search tests
	//
	// //////////////////////////

	@Test
	public void testTopSellersSearch() {
		final TopSellersSearchCriteria searchCriteria = new TopSellersSearchCriteria(SEARCH_TYPE_UNT, STORE_NAME_SRS,
				"Appliances");
		performTopSellersSearch(searchCriteria);
	}

	@Test
	public void testTopSellersSearch100Results() {
		final TopSellersSearchCriteria searchCriteria = new TopSellersSearchCriteria(SEARCH_TYPE_UNT, STORE_NAME_SRS,
				"Appliances");
		searchCriteria.setStartIndex(1);
		searchCriteria.setEndIndex(100);
		performTopSellersSearch(searchCriteria);
	}

	@Test
	public void testTopSellersSearchView() {
		final TopSellersSearchCriteria searchCriteria = new TopSellersSearchCriteria(SEARCH_TYPE_VW,
				STORE_NAME_SRS,
				"Appliances");
		performTopSellersSearch(searchCriteria);
	}

	@Test
	public void testTopSellersSearchRevenue() {
		final TopSellersSearchCriteria searchCriteria = new TopSellersSearchCriteria(SEARCH_TYPE_RVN,
				STORE_NAME_SRS,
				"Appliances");
		performTopSellersSearch(searchCriteria);
	}

	@Test
	public void testTopSellersSearchSubCategory() {
		final TopSellersSearchCriteria searchCriteria = new TopSellersSearchCriteria(SEARCH_TYPE_RVN,
				STORE_NAME_SRS,
				"Appliances|Accessories");
		performTopSellersSearch(searchCriteria);
	}

	private void performTopSellersSearch(final TopSellersSearchCriteria searchCriteria) {

		final TopSellersSearch searchInterface = new TopSellersSearchImpl();
		final ProductSearchResults results = searchInterface.searchTopSellers(searchCriteria);

		final int expectedRecords = searchCriteria.getStartIndex() == 0 && searchCriteria.getEndIndex() == 0 ? 25
				: searchCriteria.getEndIndex() - searchCriteria.getStartIndex() + 1;

		logger.debug(name.getMethodName() + " results: " + results);
		assertNotNull(results);

		// assert status
		assertNotNull(results.getStatus());
		assertEquals("Successful", results.getStatus().getRespMessage());
		// assert at least one result
		assertTrue(results.getProductCount() > 0);
		// White spaces are replaced by '+' and converted to lower case
		assertEquals(expectedRecords, results.getProducts().length);
	}

}
