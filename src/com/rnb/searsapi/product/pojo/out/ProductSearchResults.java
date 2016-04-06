/*
 *
 */
package com.rnb.searsapi.product.pojo.out;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All Search results for the product search API and TopSeller API are wrapped
 * in this class
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductSearchResults
{

	/** The search status. */
	@JsonProperty("Status")
	private Status status;

	/** The products - Keyword Searches only */
	@JsonProperty("Products")
	private Products[] products;

	/** The filter ranks - Keyword Searches only */
	@JsonProperty("FilterRanks")
	private FilterRanks[] filterRanks;

	/** The filter products Keyword Searches only */
	@JsonProperty("FilterProducts")
	private FilterProducts[] filterProducts;

	/** The api tracking. */
	@JsonProperty("ApiTracking")
	private String apiTracking;

	/** The categories - Keyword Searches only */
	@JsonProperty("Categories")
	private Categories[] categories;

	/** The product count - Keyword Searches only */
	@JsonProperty("ProductCount")
	private int productCount;

	/**
	 * FeaturedCategories are returned for category searches only.
	 */
	@JsonProperty("FeaturedCategories")
	private FeaturedCategories[] featuredCategories;

	/**
	 * NavGroups are returned for category searches only.
	 */
	@JsonProperty("NavGroups")
	private NavGroups[] navGroups;

	/** The Verticals. */
	@JsonProperty("Verticals")
	private Verticals[] verticals;

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public Status getStatus()
	{
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(final Status status)
	{
		this.status = status;
	}

	/**
	 * Gets the products.
	 *
	 * @return the products
	 */
	public Products[] getProducts()
	{
		return products;
	}

	/**
	 * Sets the products.
	 *
	 * @param products the new products
	 */
	public void setProducts(final Products[] products)
	{
		this.products = products;
	}

	/**
	 * Gets the filter ranks.
	 *
	 * @return the filter ranks
	 */
	public FilterRanks[] getFilterRanks()
	{
		return filterRanks;
	}

	/**
	 * Sets the filter ranks.
	 *
	 * @param filterRanks the new filter ranks
	 */
	public void setFilterRanks(final FilterRanks[] filterRanks)
	{
		this.filterRanks = filterRanks;
	}

	/**
	 * Gets the filter products.
	 *
	 * @return the filter products
	 */
	public FilterProducts[] getFilterProducts()
	{
		return filterProducts;
	}

	/**
	 * Sets the filter products.
	 *
	 * @param filterProducts the new filter products
	 */
	public void setFilterProducts(final FilterProducts[] filterProducts)
	{
		this.filterProducts = filterProducts;
	}

	/**
	 * Gets the api tracking.
	 *
	 * @return the api tracking
	 */
	public String getApiTracking()
	{
		return apiTracking;
	}

	/**
	 * Sets the api tracking.
	 *
	 * @param apiTracking the new api tracking
	 */
	public void setApiTracking(final String apiTracking)
	{
		this.apiTracking = apiTracking;
	}

	/**
	 * Gets the categories.
	 *
	 * @return the categories
	 */
	public Categories[] getCategories()
	{
		return categories;
	}

	/**
	 * Sets the categories.
	 *
	 * @param categories the new categories
	 */
	public void setCategories(final Categories[] categories)
	{
		this.categories = categories;
	}

	/**
	 * Gets the product count.
	 *
	 * @return the product count
	 */
	public int getProductCount()
	{
		return productCount;
	}

	/**
	 * Sets the product count.
	 *
	 * @param productCount the new product count
	 */
	public void setProductCount(final int productCount)
	{
		this.productCount = productCount;
	}

	/**
	 * Gets the featuredCategories are returned for category searches only.
	 *
	 * @return the featuredCategories are returned for category searches only
	 */
	public FeaturedCategories[] getFeaturedCategories() {
		return featuredCategories;
	}

	/**
	 * Sets the featuredCategories are returned for category searches only.
	 *
	 * @param featuredCategories the new featuredCategories are returned for
	 *            category searches only
	 */
	public void setFeaturedCategories(final FeaturedCategories[] featuredCategories) {
		this.featuredCategories = featuredCategories;
	}

	/**
	 * Gets the navGroups are returned for category searches only.
	 *
	 * @return the navGroups are returned for category searches only
	 */
	public NavGroups[] getNavGroups() {
		return navGroups;
	}

	/**
	 * Sets the navGroups are returned for category searches only.
	 *
	 * @param navGroups the new navGroups are returned for category searches
	 *            only
	 */
	public void setNavGroups(final NavGroups[] navGroups) {
		this.navGroups = navGroups;
	}

	/**
	 * @return the verticals
	 */
	public Verticals[] getVerticals() {
		return verticals;
	}

	/**
	 * @param verticals the verticals to set
	 */
	public void setVerticals(final Verticals[] verticals) {
		this.verticals = verticals;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("SearchResults [status=").append(status).append(", products=").append(Arrays.toString(products))
				.append(", filterRanks=").append(Arrays.toString(filterRanks)).append(", filterProducts=")
				.append(Arrays.toString(filterProducts)).append(", apiTracking=").append(apiTracking)
				.append(", categories=").append(Arrays.toString(categories)).append(", productCount=")
				.append(productCount).append(", featuredCategories=").append(Arrays.toString(featuredCategories))
				.append(", navGroups=").append(Arrays.toString(navGroups)).append(", verticals=")
				.append(Arrays.toString(verticals)).append("]");
		return builder.toString();
	}

}
