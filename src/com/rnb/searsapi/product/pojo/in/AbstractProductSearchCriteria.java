package com.rnb.searsapi.product.pojo.in;

import static com.rnb.searsapi.base.Constants.UTF_8;
import static com.rnb.searsapi.base.StaticUtil.isBlank;
import static java.net.URLEncoder.encode;

import java.io.UnsupportedEncodingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rnb.searsapi.base.BaseCriteria;
import com.rnb.searsapi.base.Constants;

/**
 *
 * Base Product search Input Criteria.
 *
 * @author tarung
 *
 */
public abstract class AbstractProductSearchCriteria extends BaseCriteria {

	/** The logger. */
	private static final Logger logger = LoggerFactory.getLogger(AbstractProductSearchCriteria.class);

	/**
	 * The search type - search, browse/categories (for category search),
	 * browse/products (for nth-level category search).
	 */
	private String searchType;

	/** The store name - Sears/Kmart. */
	private String storeName;

	/** The keyword. */
	private String keyWord;

	/** The category. */
	private String category;

	/**
	 * The filter - Filter pattern can be based on ‘price’, ‘userating’ or
	 * ‘brand’ or ‘color’.
	 */
	private String filter;

	/** The sort by field - sorts product results. */
	private ProductSearchSortBy sortBy;

	/**
	 * This parameter is a unique number which defines the search group details
	 * such as the searchType and category.
	 */
	private String catGroupId;

	/** Start Index of the products. */
	private int startIndex;

	/** End index of the products. */
	private int endIndex;

	/** Used to filter results to return only specific information from the API. */
	private String customData;

	/**
	 * Instantiates a new abstract product search criteria.
	 *
	 * @param searchType the search type
	 * @param storeName the store name
	 * @param keyWord the keyword
	 * @param category the category
	 */
	public AbstractProductSearchCriteria(final String searchType, final String storeName, final String keyWord,
			final String category) {

		super();

		setSearchType(searchType);
		setStoreName(storeName);

		this.keyWord = keyWord;
		this.category = category;
	}

	/**
	 * Gets the search type - search, browse/categories (for category search),
	 * browse/products (for nth-level category search).
	 *
	 * @return the search type - search, browse/categories (for category
	 *         search), browse/products (for nth-level category search)
	 */
	public String getSearchType() {
		return searchType;
	}

	/**
	 * Sets the search type - search, browse/categories (for category search),
	 * browse/products (for nth-level category search).
	 *
	 * @param searchType the new search type - search, browse/categories (for
	 *            category search), browse/products (for nth-level category
	 *            search)
	 */
	public void setSearchType(final String searchType) {
		if (searchType == null || !searchType.equals(Constants.SEARCH_TYPE_CAT)
				&& !searchType.equals(Constants.SEARCH_TYPE_KY_WD) && !searchType.equals(Constants.SEARCH_TYPE_PRD)) {
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
	 * Gets the keyword.
	 *
	 * @return the keyword
	 */
	public String getKeyWord() {
		return keyWord;
	}

	/**
	 * Sets the keyword.
	 *
	 * @param keyWord the new keyword
	 */
	public void setKeyWord(final String keyWord) {
		this.keyWord = keyWord;
	}

	/**
	 * Gets the category.
	 *
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Sets the category.
	 *
	 * @param category the new category
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
	 * Gets the sort by field - sorts product results.
	 *
	 * @return the sort by field - sorts product results
	 */
	public ProductSearchSortBy getSortBy() {
		return sortBy;
	}

	/**
	 * Sets the sort by field - sorts product results.
	 *
	 * @param sortBy the new sort by field - sorts product results
	 */
	public void setSortBy(final ProductSearchSortBy sortBy) {
		this.sortBy = sortBy;
	}

	/**
	 * Gets the this parameter is a unique number which defines the search group
	 * details such as the searchType and category.
	 *
	 * @return the this parameter is a unique number which defines the search
	 *         group details such as the searchType and category
	 */
	public String getCatGroupId() {
		return catGroupId;
	}

	/**
	 * Sets the this parameter is a unique number which defines the search group
	 * details such as the searchType and category.
	 *
	 * @param catGroupId the new this parameter is a unique number which defines
	 *            the search group details such as the searchType and category
	 */
	public void setCatGroupId(final String catGroupId) {
		this.catGroupId = catGroupId;
	}

	/**
	 * Gets the start Index of the products.
	 *
	 * @return the start Index of the products
	 */
	public int getStartIndex() {
		return startIndex;
	}

	/**
	 * Sets the start Index of the products.
	 *
	 * @param startIndex the new start Index of the products
	 */
	public void setStartIndex(final int startIndex) {
		this.startIndex = startIndex;
	}

	/**
	 * Gets the end index of the products.
	 *
	 * @return the end index of the products
	 */
	public int getEndIndex() {
		return endIndex;
	}

	/**
	 * Sets the end index of the products.
	 *
	 * @param endIndex the new end index of the products
	 */
	public void setEndIndex(final int endIndex) {
		this.endIndex = endIndex;
	}

	/**
	 * Gets the used to filter results to return only specific information from
	 * the API.
	 *
	 * @return the used to filter results to return only specific information
	 *         from the API
	 */
	public String getCustomData() {
		return customData;
	}

	/**
	 * Sets the used to filter results to return only specific information from
	 * the API.
	 *
	 * @param customData the new used to filter results to return only specific
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
		final String path = CONFIG.getProperty("products_pathURI");
		char seperator = '?';
		try {

			String urlStr = baseURL + path + getSearchType() + '/' + storeName + '/' + getContent();
			urlStr += !isBlank(getKeyWord()) ? "/keyword/" + encode(getKeyWord(), UTF_8) : "";

			if (!isBlank(getCategory())) {
				urlStr += "?category=" + encode(getCategory(), UTF_8);
				seperator = '&';
			}
			urlStr += seperator + "apikey=" + getApiKey();
			urlStr += !isBlank(getFilter()) ? "&filter=" + encode(getFilter(), UTF_8) : "";
			urlStr += !isBlank(getCatGroupId()) ? "&catGroupId=" + encode(getCatGroupId(), UTF_8) : "";
			urlStr += getStartIndex() > 0 ? "&startIndex=" + getStartIndex() : "";
			urlStr += getEndIndex() > 0 ? "&endIndex=" + getEndIndex() : "";
			urlStr += !isBlank(getCustomData()) ? "&customData=" + encode(getCustomData(), UTF_8) : "";

			return urlStr;

		} catch (final UnsupportedEncodingException e) {
			logger.error("Error occurred while generating URL: " + e.getMessage(), e);
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("BaseSearchCriteria [searchType=").append(searchType).append(", storeName=").append(storeName)
		.append(", keyWord=").append(keyWord).append(", category=").append(category).append(", filter=")
		.append(filter).append(", sortBy=").append(sortBy).append(", catGroupId=").append(catGroupId)
		.append(", startIndex=").append(startIndex).append(", endIndex=").append(endIndex)
		.append(", customData=").append(customData).append(", ").append(super.toString())
		.append("]");
		return builder.toString();
	}
}
