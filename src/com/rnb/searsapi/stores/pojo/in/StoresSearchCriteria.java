package com.rnb.searsapi.stores.pojo.in;

import static com.rnb.searsapi.base.StaticUtil.isEmpty;

import java.io.UnsupportedEncodingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rnb.searsapi.base.BaseCriteria;
import com.rnb.searsapi.base.Constants;

/**
 * The Abstract Stores Search Criteria class, encapsulates common attributes and
 * methods.
 *
 * @author tarung
 */
public abstract class StoresSearchCriteria extends BaseCriteria {

	/** The logger. */
	private static final Logger logger = LoggerFactory.getLogger(StoresSearchCriteria.class);

	/** The store name. */
	private String storeName;

	/**
	 * The weekly ad - If true it will return stores for which weekly ad is
	 * available.
	 */
	private boolean weeklyAd;

	/** The search type - if specified filters out results by store type. */
	private String searchType;

	/** The sort flag - if specified sorts results by distance. Default : false */
	private boolean sortFlag;

	/**
	 * The mile radius - used to provide the range in terms of distance. Results
	 * will consist of stores in that particular distance radius. Default is 30.
	 */
	private int mileRadius;

	/**
	 * The custom data - used to filter results to return only specific
	 * information from the API. e.g. customData=StoreInfo|ContactDetails.
	 */
	private String customData;

	/**
	 * Instantiates a new top sellers search criteria.
	 *
	 * @param storeName the store name
	 */
	public StoresSearchCriteria(final String storeName) {

		super();
		setStoreName(storeName);
	}

	/**
	 * Gets the store name.
	 *
	 * @return the store name
	 */
	public String getStoreName() {
		return storeName;
	}

	/**
	 * Sets the store name.
	 *
	 * @param storeName the new store name
	 */
	public void setStoreName(final String storeName) {
		if (storeName == null || !storeName.equals(Constants.STORE_NAME_KMRT)
				&& !storeName.equals(Constants.STORE_NAME_SRS)) {
			throw new IllegalArgumentException("Invalid value of Store Name: " + storeName);
		}
		this.storeName = storeName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.rnb.searsapi.base.BaseCriteria#getFullURL()
	 */
	@Override
	public String getFullURL() {

		final String baseURL = CONFIG.getProperty("baseURL");
		final String path = CONFIG.getProperty("stores_pathURI");

		try {

			String urlStr = baseURL + path;
			urlStr += "/" + getStoreName();
			urlStr += "/" + getContent();
			urlStr += getRemainingPath();
			urlStr += "?apikey=" + getApiKey();

			if (mileRadius != 0) {
				urlStr += "&mileRadius=" + getMileRadius();
			}
			if (!isEmpty(searchType)) {
				urlStr += "&searchType=" + getSearchType();
			}
			if (sortFlag) {
				urlStr += "&sortFlag=" + getSortFlag();
			}
			if (!isEmpty(customData)) {
				urlStr += "&customData=" + getCustomData();
			}
			if (weeklyAd) {
				urlStr += "&weeklyAd=" + getWeeklyAd();
			}
			return urlStr;

		} catch (final UnsupportedEncodingException e) {
			logger.error("Error occurred while generating URL: " + e.getMessage(), e);
			return null;
		}
	}

	/**
	 * Gets the remaining path.
	 *
	 * @return the remaining path
	 * @throws UnsupportedEncodingException the unsupported encoding exception
	 */
	public abstract String getRemainingPath() throws UnsupportedEncodingException;

	/**
	 * Gets the weekly ad - If true it will return stores for which weekly ad is
	 * available.
	 *
	 * @return the weekly ad - If true it will return stores for which weekly ad
	 *         is available
	 */
	public boolean getWeeklyAd() {
		return weeklyAd;
	}

	/**
	 * Sets the weekly ad - If true it will return stores for which weekly ad is
	 * available.
	 *
	 * @param weeklyAd the new weekly ad - If true it will return stores for
	 *            which weekly ad is available
	 */
	public void setWeeklyAd(final boolean weeklyAd) {
		this.weeklyAd = weeklyAd;
	}

	/**
	 * Gets the search type - if specified filters out results by store type.
	 *
	 * @return the search type - if specified filters out results by store type
	 */
	public String getSearchType() {
		return searchType;
	}

	/**
	 * Sets the search type - if specified filters out results by store type.
	 *
	 * @param searchType the new search type - if specified filters out results
	 *            by store type
	 */
	public void setSearchType(final String searchType) {
		this.searchType = searchType;
	}

	/**
	 * Gets the sort flag - if specified sorts results by distance.
	 *
	 * @return the sort flag - if specified sorts results by distance
	 */
	public boolean getSortFlag() {
		return sortFlag;
	}

	/**
	 * Sets the sort flag - if specified sorts results by distance.
	 *
	 * @param sortFlag the new sort flag - if specified sorts results by
	 *            distance
	 */
	public void setSortFlag(final boolean sortFlag) {
		this.sortFlag = sortFlag;
	}

	/**
	 * Gets the mile radius - used to provide the range in terms of distance.
	 *
	 * @return the mile radius - used to provide the range in terms of distance
	 */
	public int getMileRadius() {
		return mileRadius;
	}

	/**
	 * Sets the mile radius - used to provide the range in terms of distance.
	 *
	 * @param mileRadius the new mile radius - used to provide the range in
	 *            terms of distance
	 */
	public void setMileRadius(final int mileRadius) {
		this.mileRadius = mileRadius;
	}

	/**
	 * Gets the custom data - used to filter results to return only specific
	 * information from the API.
	 *
	 * @return the custom data - used to filter results to return only specific
	 *         information from the API
	 */
	public String getCustomData() {
		return customData;
	}

	/**
	 * Sets the custom data - used to filter results to return only specific
	 * information from the API.
	 *
	 * @param customData the new custom data - used to filter results to return
	 *            only specific information from the API
	 */
	public void setCustomData(final String customData) {
		this.customData = customData;
	}

}
