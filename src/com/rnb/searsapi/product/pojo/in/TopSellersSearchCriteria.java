package com.rnb.searsapi.product.pojo.in;

import static com.rnb.searsapi.base.Constants.SEARCH_TYPE_RVN;
import static com.rnb.searsapi.base.Constants.SEARCH_TYPE_UNT;
import static com.rnb.searsapi.base.Constants.SEARCH_TYPE_VW;
import static com.rnb.searsapi.base.StaticUtil.isBlank;
import static java.net.URLEncoder.encode;

import java.io.UnsupportedEncodingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rnb.searsapi.base.BaseCriteria;
import com.rnb.searsapi.base.Constants;

/**
 * The TopSellers Search Criteria data wrapper.
 *
 * @author tarung
 */
public class TopSellersSearchCriteria extends BaseCriteria {

	/** The logger. */
	private static final Logger logger = LoggerFactory.getLogger(TopSellersSearchCriteria.class);

	/**
	 * The search type - defines the type of search (unit – number of units
	 * sold; view – number of product views; revenue – amount of revenue
	 * generated).
	 */
	private String searchType;

	/** The store name - Sears/Kmart. */
	private String storeName;

	/** The category - Selected n-Level category list separated by ‘|’ symbol. */
	private String category;

	/**
	 * The filter - Filter pattern can be based on ‘price’, ‘userating’ or
	 * ‘brand’ or ‘color’.
	 */
	private String filter;

	/** The Start Index of the products. */
	private int startIndex;

	/** The End index of the products. */
	private int endIndex;

	/**
	 * The Used to filter results to return only specific information from the
	 * API.
	 */
	private String customData;

	/**
	 * Instantiates a new top sellers search criteria.
	 *
	 * @param searchType the search type
	 * @param storeName the store name
	 * @param category the category
	 */
	public TopSellersSearchCriteria(final String searchType, final String storeName, final String category) {
		super();

		setSearchType(searchType);
		setStoreName(storeName);

		this.category = category;
	}

	/**
	 * Gets the search type - defines the type of search (unit – number of units
	 * sold; view – number of product views; revenue – amount of revenue
	 * generated).
	 *
	 * @return the search type - defines the type of search (unit – number of
	 *         units sold; view – number of product views; revenue – amount of
	 *         revenue generated)
	 */
	public String getSearchType() {
		return searchType;
	}

	/**
	 * Sets the search type - defines the type of search (unit – number of units
	 * sold; view – number of product views; revenue – amount of revenue
	 * generated).
	 *
	 * @param searchType the new search type - defines the type of search (unit
	 *            – number of units sold; view – number of product views;
	 *            revenue – amount of revenue generated)
	 */
	public void setSearchType(final String searchType) {
		if (searchType == null || !searchType.equals(SEARCH_TYPE_UNT)
				&& !searchType.equals(SEARCH_TYPE_VW) && !searchType.equals(SEARCH_TYPE_RVN)) {
			throw new IllegalArgumentException("Invalid value of Search Type: " + searchType);
		}
		this.searchType = searchType;
	}

	/**
	 * Gets the store name - Sears/Kmart.
	 *
	 * @return the store name - Sears/Kmart
	 */
	public String getStoreName() {
		return storeName;
	}

	/**
	 * Sets the store name - Sears/Kmart.
	 *
	 * @param storeName the new store name - Sears/Kmart
	 */
	public void setStoreName(final String storeName) {
		if (storeName == null || !storeName.equals(Constants.STORE_NAME_KMRT)
				&& !storeName.equals(Constants.STORE_NAME_SRS)) {
			throw new IllegalArgumentException("Invalid value of Store Name: " + storeName);
		}
		this.storeName = storeName;
	}

	/**
	 * Gets the category - Selected n-Level category list separated by ‘|’
	 * symbol.
	 *
	 * @return the category - Selected n-Level category list separated by ‘|’
	 *         symbol
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Sets the category - Selected n-Level category list separated by ‘|’
	 * symbol.
	 *
	 * @param category the new category - Selected n-Level category list
	 *            separated by ‘|’ symbol
	 */
	public void setCategory(final String category) {
		this.category = category;
	}

	/**
	 * Gets the filter - Filter pattern can be based on ‘price’, ‘userating’ or
	 * ‘brand’ or ‘color’.
	 *
	 * @return the filter - Filter pattern can be based on ‘price’, ‘userating’
	 *         or ‘brand’ or ‘color’
	 */
	public String getFilter() {
		return filter;
	}

	/**
	 * Sets the filter - Filter pattern can be based on ‘price’, ‘userating’ or
	 * ‘brand’ or ‘color’.
	 *
	 * @param filter the new filter - Filter pattern can be based on ‘price’,
	 *            ‘userating’ or ‘brand’ or ‘color’
	 */
	public void setFilter(final String filter) {
		this.filter = filter;
	}

	/**
	 * Gets the Start Index of the products.
	 *
	 * @return the Start Index of the products
	 */
	public int getStartIndex() {
		return startIndex;
	}

	/**
	 * Sets the Start Index of the products.
	 *
	 * @param startIndex the new Start Index of the products
	 */
	public void setStartIndex(final int startIndex) {
		this.startIndex = startIndex;
	}

	/**
	 * Gets the End index of the products.
	 *
	 * @return the End index of the products
	 */
	public int getEndIndex() {
		return endIndex;
	}

	/**
	 * Sets the End index of the products.
	 *
	 * @param endIndex the new End index of the products
	 */
	public void setEndIndex(final int endIndex) {
		this.endIndex = endIndex;
	}

	/**
	 * Gets the Used to filter results to return only specific information from
	 * the API.
	 *
	 * @return the Used to filter results to return only specific information
	 *         from the API
	 */
	public String getCustomData() {
		return customData;
	}

	/**
	 * Sets the Used to filter results to return only specific information from
	 * the API.
	 *
	 * @param customData the new Used to filter results to return only specific
	 *            information from the API
	 */
	public void setCustomData(final String customData) {
		this.customData = customData;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.rnb.searsapi.base.BaseCriteria#getFullURL()
	 */
	@Override
	public String getFullURL() {

		final String baseURL = CONFIG.getProperty("baseURL");
		final String path = CONFIG.getProperty("topseller_pathURI");

		char seperator = '?';
		try {

			String urlStr = baseURL + path + storeName + '/' + getContent();
			urlStr += "/searchType/" + getSearchType();

			if (!isBlank(getCategory())) {
				urlStr += "?category=" + encode(getCategory(), "UTF-8");
				seperator = '&';
			}
			urlStr += seperator + "apikey=" + getApiKey();
			urlStr += !isBlank(getFilter()) ? "&filter=" + encode(getFilter(), "UTF-8") : "";
			urlStr += getStartIndex() > 0 ? "&startIndex=" + getStartIndex() : "";
			urlStr += getEndIndex() > 0 ? "&endIndex=" + getEndIndex() : "";
			urlStr += !isBlank(getCustomData()) ? "&customData=" + encode(getCustomData(), "UTF-8") : "";

			return urlStr;

		} catch (final UnsupportedEncodingException e) {
			logger.error("Error occurred while generating URL: " + e.getMessage(), e);
			return null;
		}
	}

}
