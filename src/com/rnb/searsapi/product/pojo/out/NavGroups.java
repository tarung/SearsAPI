package com.rnb.searsapi.product.pojo.out;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All available navigation groups information is wrapped in this class.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class NavGroups {

	/**
	 * The group type - Group Type Indicator: ShopByCategoryGroup, ShopByXGroup.
	 */
	@JsonProperty("GroupType")
	private String groupType;

	/** The shop by categories. */
	@JsonProperty("ShopByCategories")
	private ShopByCategories[] shopByCategories;

	/** The Group Display Name. */
	@JsonProperty("DisplayName")
	private String displayName;

	/** The shop by x groups. */
	@JsonProperty("ShopByXGroups")
	private ShopByXGroups[] shopByXGroups;

	/**
	 * The related links - Additional HTTP URLs to the pages which are related
	 * to the product.
	 */
	@JsonProperty("RelatedLinks")
	private RelatedLinks[] relatedLinks;

	/**
	 * Gets the group type - Group Type Indicator: ShopByCategoryGroup,
	 * ShopByXGroup.
	 *
	 * @return the group type - Group Type Indicator: ShopByCategoryGroup,
	 *         ShopByXGroup
	 */
	public String getGroupType() {
		return groupType;
	}

	/**
	 * Sets the group type - Group Type Indicator: ShopByCategoryGroup,
	 * ShopByXGroup.
	 *
	 * @param groupType the new group type - Group Type Indicator:
	 *            ShopByCategoryGroup, ShopByXGroup
	 */
	public void setGroupType(final String groupType) {
		this.groupType = groupType;
	}

	/**
	 * Gets the shop by categories.
	 *
	 * @return the shop by categories
	 */
	public ShopByCategories[] getShopByCategories() {
		return shopByCategories;
	}

	/**
	 * Sets the shop by categories.
	 *
	 * @param shopByCategories the new shop by categories
	 */
	public void setShopByCategories(final ShopByCategories[] shopByCategories) {
		this.shopByCategories = shopByCategories;
	}

	/**
	 * Gets the Group Display Name.
	 *
	 * @return the Group Display Name
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * Sets the Group Display Name.
	 *
	 * @param displayName the new Group Display Name
	 */
	public void setDisplayName(final String displayName) {
		this.displayName = displayName;
	}

	/**
	 * Gets the shop by x groups.
	 *
	 * @return the shop by x groups
	 */
	public ShopByXGroups[] getShopByXGroups() {
		return shopByXGroups;
	}

	/**
	 * Sets the shop by x groups.
	 *
	 * @param shopByXGroups the new shop by x groups
	 */
	public void setShopByXGroups(final ShopByXGroups[] shopByXGroups) {
		this.shopByXGroups = shopByXGroups;
	}

	/**
	 * Gets the related links - Additional HTTP URLs to the pages which are
	 * related to the product.
	 *
	 * @return the related links - Additional HTTP URLs to the pages which are
	 *         related to the product
	 */
	public RelatedLinks[] getRelatedLinks() {
		return relatedLinks;
	}

	/**
	 * Sets the related links - Additional HTTP URLs to the pages which are
	 * related to the product.
	 *
	 * @param relatedLinks the new related links - Additional HTTP URLs to the
	 *            pages which are related to the product
	 */
	public void setRelatedLinks(final RelatedLinks[] relatedLinks) {
		this.relatedLinks = relatedLinks;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("NavGroups [groupType=").append(groupType).append(", shopByCategories=")
		.append(Arrays.toString(shopByCategories)).append(", displayName=").append(displayName)
		.append(", shopByXGroups=").append(Arrays.toString(shopByXGroups)).append(", relatedLinks=")
		.append(Arrays.toString(relatedLinks)).append("]");
		return builder.toString();
	}

}
