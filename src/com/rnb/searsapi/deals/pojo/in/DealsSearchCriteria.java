package com.rnb.searsapi.deals.pojo.in;

import static com.rnb.searsapi.base.StaticUtil.isBlank;
import static java.net.URLEncoder.encode;

import java.io.UnsupportedEncodingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rnb.searsapi.base.BaseCriteria;
import com.rnb.searsapi.base.Constants;

/**
 * This class wraps all the parameters passed to Deals search API.
 *
 * @author tarung
 */
public class DealsSearchCriteria extends BaseCriteria {

	/** The logger. */
	private static final Logger logger = LoggerFactory.getLogger(DealsSearchCriteria.class);

	/** The store name. */
	private String storeName;

	/** The Category for the deal item. */
	private String category;

	/** The path (internal parameter that defines the API). */
	private final String path;

	/**
	 * Instantiates a new top sellers search criteria.
	 *
	 * @param path the path
	 * @param storeName the store name
	 * @param category the category
	 */
	public DealsSearchCriteria(final String path, final String storeName, final String category) {

		super();
		setStoreName(storeName);
		this.category = category;
		this.path = path;
	}

	/**
	 * Instantiates a new deals search criteria.
	 *
	 * @param path the path
	 * @param storeName the store name
	 */
	public DealsSearchCriteria(final String path, final String storeName) {
		this(path, storeName, null);
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

	/**
	 * Gets the Category for the deal item.
	 *
	 * @return the Category for the deal item
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Sets the Category for the deal item.
	 *
	 * @param category the new Category for the deal item
	 */
	public void setCategory(final String category) {
		this.category = category;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.rnb.searsapi.base.BaseCriteria#getFullURL()
	 */
	@Override
	public String getFullURL() {

		final String baseURL = CONFIG.getProperty("baseURL");

		try {

			String urlStr = baseURL + path;
			urlStr += "?store=" + getStoreName();
			urlStr += "&apikey=" + getApiKey();
			if (!isBlank(getCategory())) {
				urlStr += "&category=" + encode(getCategory(), "UTF-8");
			}
			return urlStr;

		} catch (final UnsupportedEncodingException e) {
			logger.error("Error occurred while generating URL: " + e.getMessage(), e);
			return null;
		}
	}

}
