package com.rnb.searsapi.deals.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Products data wrapper class.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Products {

	/** The Sold by store name. */
	@JsonProperty("SoldBy")
	private String soldBy;

	/**
	 * The Indicates if the item is eligible for Shop Your Max Free Shipping
	 * offer.
	 */
	@JsonProperty("ShipVantage")
	private String shipVantage;

	/** The add to cart. */
	@JsonProperty("AddToCart")
	private String addToCart;

	/** Extra description of the deal if any. */
	@JsonProperty("ExtraDescription")
	private String extraDescription;

	/**
	 * Indicates if the product is eligible for Shop Your Way rewards. 1 if
	 * product is eligible for SYWR, 0 otherwise
	 */
	@JsonProperty("SYWR")
	private String SYWR;

	/** Part number of the product. */
	@JsonProperty("PartNumber")
	private String partNumber;

	/** The flag color. */
	@JsonProperty("FlagColor")
	private String flagColor;

	/** The bonus member messaging. */
	@JsonProperty("BonusMemberMessaging")
	private String bonusMemberMessaging;

	/** The sub heading. */
	@JsonProperty("Subheading")
	private String subHeading;

	/** The long description. */
	@JsonProperty("LongDescription")
	private String longDescription;

	/** The flag text. */
	@JsonProperty("FlagText")
	private String flagText;

	/** The SYWR exclusions. */
	@JsonProperty("SYWRExclusions")
	private String SYWRExclusions;

	/** The regular price. */
	@JsonProperty("RegularPrice")
	private String regularPrice;

	/** The storepickupeligible. */
	@JsonProperty("Storepickupeligible")
	private String storepickupeligible;

	/** The sold out. */
	@JsonProperty("SoldOut")
	private String soldOut;

	/** The image ur ls. */
	@JsonProperty("ImageURLs")
	private String imageURLs;

	/** The description name. */
	@JsonProperty("DescriptionName")
	private String descriptionName;

	/** The member price. */
	@JsonProperty("MemberPrice")
	private String memberPrice;

	/** The occasion. */
	@JsonProperty("Occasion")
	private String occasion;

	/** The start time. */
	@JsonProperty("StartTime")
	private String startTime;

	/** The craftsman club exclusions. */
	@JsonProperty("CraftsmanClubExclusions")
	private String craftsmanClubExclusions;

	/** The add to cart link. */
	@JsonProperty("AddToCartLink")
	private String addToCartLink;

	/** The SRES eligible. */
	@JsonProperty("SRESEligible")
	private String SRESEligible;

	/** The free shipping. */
	@JsonProperty("FreeShipping")
	private String freeShipping;

	/** The free shipping exclusions. */
	@JsonProperty("FreeShippingExclusions")
	private String freeShippingExclusions;

	/** The category. */
	@JsonProperty("Category")
	private String category;

	/** The link. */
	@JsonProperty("Link")
	private String link;

	/** The main image url. */
	@JsonProperty("MainImageUrl")
	private String mainImageUrl;

	/** The sale price. */
	@JsonProperty("SalePrice")
	private String salePrice;

	/** The headline. */
	@JsonProperty("Headline")
	private String headline;

	/** The deal type. */
	@JsonProperty("DealType")
	private String dealType;

	/** The is market placeitem. */
	@JsonProperty("IsMarketPlaceitem")
	private String isMarketPlaceitem;

	/** The craftsman club. */
	@JsonProperty("CraftsmanClub")
	private String craftsmanClub;

	/** The SP option. */
	@JsonProperty("SPOption")
	private String SPOption;

	/** The brand name. */
	@JsonProperty("BrandName")
	private String brandName;

	/** The ship vantage exclusions. */
	@JsonProperty("ShipVantageExclusions")
	private String shipVantageExclusions;

	/** The PID. */
	@JsonProperty("PID")
	private String PID;

	/** The Rating. */
	@JsonProperty("Rating")
	private String rating;

	/** The in stock. */
	@JsonProperty("InStock")
	private int inStock;

	/** The where to purchase. */
	@JsonProperty("WhereToPurchase")
	private String whereToPurchase;

	/** The savings. */
	@JsonProperty("Savings")
	private String savings;

	/** The deal flash start date. */
	@JsonProperty("DealFlashStartDate")
	private String dealFlashStartDate;

	/** The product url. */
	@JsonProperty("ProductURL")
	private String productURL;

	/** The timed deals start. */
	@JsonProperty("TimedDealsStart")
	private String timedDealsStart;

	/** The free delivery. */
	@JsonProperty("FreeDelivery")
	private String freeDelivery;

	/** The mail in rebate. */
	@JsonProperty("MailInRebate")
	private String mailInRebate;

	/** The mapped price indicator. */
	@JsonProperty("MappedPriceIndicator")
	private String mappedPriceIndicator;

	/** The department. */
	@JsonProperty("Department")
	private String department;

	/** The deal flash end date. */
	@JsonProperty("DealFlashEndDate")
	private String dealFlashEndDate;

	/** The deal flash. */
	@JsonProperty("DealFlash")
	private String dealFlash;

	/** The highlighted text. */
	@JsonProperty("HighlightedText")
	private String highlightedText;

	/** The color. */
	@JsonProperty("Color")
	private String color;

	/** The timed deals end. */
	@JsonProperty("TimedDealsEnd")
	private String timedDealsEnd;

	/** The map price. */
	@JsonProperty("MapPrice")
	private String mapPrice;

	/** The timed deals. */
	@JsonProperty("TimedDeals")
	private String timedDeals;

	/** The online only. */
	@JsonProperty("OnlineOnly")
	private String onlineOnly;

	/** The ksr. */
	@JsonProperty("KSR")
	private String KSR;

	/** The num review. */
	@JsonProperty("NumReview")
	private String numReview;

	/** The sub category. */
	@JsonProperty("SubCategory")
	private String subCategory;

	/** The syw link. */
	@JsonProperty("sywLink")
	private String sywLink;

	/** The price filter. */
	@JsonProperty("PriceFilter")
	private String priceFilter;

	/**
	 * Gets the Sold by store name.
	 *
	 * @return the Sold by store name
	 */
	public String getSoldBy() {
		return soldBy;
	}

	/**
	 * Sets the Sold by store name.
	 *
	 * @param soldBy the new Sold by store name
	 */
	public void setSoldBy(final String soldBy) {
		this.soldBy = soldBy;
	}

	/**
	 * Gets the Indicates if the item is eligible for Shop Your Max Free
	 * Shipping offer.
	 *
	 * @return the Indicates if the item is eligible for Shop Your Max Free
	 *         Shipping offer
	 */
	public String getShipVantage() {
		return shipVantage;
	}

	/**
	 * Sets the Indicates if the item is eligible for Shop Your Max Free
	 * Shipping offer.
	 *
	 * @param shipVantage the new Indicates if the item is eligible for Shop
	 *            Your Max Free Shipping offer
	 */
	public void setShipVantage(final String shipVantage) {
		this.shipVantage = shipVantage;
	}

	/**
	 * Gets the add to cart.
	 *
	 * @return the add to cart
	 */
	public String getAddToCart() {
		return addToCart;
	}

	/**
	 * Sets the add to cart.
	 *
	 * @param addToCart the new add to cart
	 */
	public void setAddToCart(final String addToCart) {
		this.addToCart = addToCart;
	}

	/**
	 * Gets the extra description of the deal if any.
	 *
	 * @return the extra description of the deal if any
	 */
	public String getExtraDescription() {
		return extraDescription;
	}

	/**
	 * Sets the extra description of the deal if any.
	 *
	 * @param extraDescription the new extra description of the deal if any
	 */
	public void setExtraDescription(final String extraDescription) {
		this.extraDescription = extraDescription;
	}

	/**
	 * Gets the sywr.
	 *
	 * @return the sywr
	 */
	public String getSYWR() {
		return SYWR;
	}

	/**
	 * Sets the sywr.
	 *
	 * @param sYWR the new sywr
	 */
	public void setSYWR(final String sYWR) {
		SYWR = sYWR;
	}

	/**
	 * Gets the part number of the product.
	 *
	 * @return the part number of the product
	 */
	public String getPartNumber() {
		return partNumber;
	}

	/**
	 * Sets the part number of the product.
	 *
	 * @param partNumber the new part number of the product
	 */
	public void setPartNumber(final String partNumber) {
		this.partNumber = partNumber;
	}

	/**
	 * Gets the flag color.
	 *
	 * @return the flag color
	 */
	public String getFlagColor() {
		return flagColor;
	}

	/**
	 * Sets the flag color.
	 *
	 * @param flagColor the new flag color
	 */
	public void setFlagColor(final String flagColor) {
		this.flagColor = flagColor;
	}

	/**
	 * Gets the bonus member messaging.
	 *
	 * @return the bonus member messaging
	 */
	public String getBonusMemberMessaging() {
		return bonusMemberMessaging;
	}

	/**
	 * Sets the bonus member messaging.
	 *
	 * @param bonusMemberMessaging the new bonus member messaging
	 */
	public void setBonusMemberMessaging(final String bonusMemberMessaging) {
		this.bonusMemberMessaging = bonusMemberMessaging;
	}

	/**
	 * Gets the subheading.
	 *
	 * @return the subheading
	 */
	public String getSubheading() {
		return subHeading;
	}

	/**
	 * Sets the subheading.
	 *
	 * @param subheading the new subheading
	 */
	public void setSubheading(final String subheading) {
		subHeading = subheading;
	}

	/**
	 * Gets the long description.
	 *
	 * @return the long description
	 */
	public String getLongDescription() {
		return longDescription;
	}

	/**
	 * Sets the long description.
	 *
	 * @param longDescription the new long description
	 */
	public void setLongDescription(final String longDescription) {
		this.longDescription = longDescription;
	}

	/**
	 * Gets the flag text.
	 *
	 * @return the flag text
	 */
	public String getFlagText() {
		return flagText;
	}

	/**
	 * Sets the flag text.
	 *
	 * @param flagText the new flag text
	 */
	public void setFlagText(final String flagText) {
		this.flagText = flagText;
	}

	/**
	 * Gets the SYWR exclusions.
	 *
	 * @return the SYWR exclusions
	 */
	public String getSYWRExclusions() {
		return SYWRExclusions;
	}

	/**
	 * Sets the SYWR exclusions.
	 *
	 * @param sYWRExclusions the new SYWR exclusions
	 */
	public void setSYWRExclusions(final String sYWRExclusions) {
		SYWRExclusions = sYWRExclusions;
	}

	/**
	 * Gets the regular price.
	 *
	 * @return the regular price
	 */
	public String getRegularPrice() {
		return regularPrice;
	}

	/**
	 * Sets the regular price.
	 *
	 * @param regularPrice the new regular price
	 */
	public void setRegularPrice(final String regularPrice) {
		this.regularPrice = regularPrice;
	}

	/**
	 * Gets the storepickupeligible.
	 *
	 * @return the storepickupeligible
	 */
	public String getStorepickupeligible() {
		return storepickupeligible;
	}

	/**
	 * Sets the storepickupeligible.
	 *
	 * @param storepickupeligible the new storepickupeligible
	 */
	public void setStorepickupeligible(final String storepickupeligible) {
		this.storepickupeligible = storepickupeligible;
	}

	/**
	 * Gets the sold out.
	 *
	 * @return the sold out
	 */
	public String getSoldOut() {
		return soldOut;
	}

	/**
	 * Sets the sold out.
	 *
	 * @param soldOut the new sold out
	 */
	public void setSoldOut(final String soldOut) {
		this.soldOut = soldOut;
	}

	/**
	 * Gets the image ur ls.
	 *
	 * @return the image ur ls
	 */
	public String getImageURLs() {
		return imageURLs;
	}

	/**
	 * Sets the image ur ls.
	 *
	 * @param imageURLs the new image ur ls
	 */
	public void setImageURLs(final String imageURLs) {
		this.imageURLs = imageURLs;
	}

	/**
	 * Gets the description name.
	 *
	 * @return the description name
	 */
	public String getDescriptionName() {
		return descriptionName;
	}

	/**
	 * Sets the description name.
	 *
	 * @param descriptionName the new description name
	 */
	public void setDescriptionName(final String descriptionName) {
		this.descriptionName = descriptionName;
	}

	/**
	 * Gets the member price.
	 *
	 * @return the member price
	 */
	public String getMemberPrice() {
		return memberPrice;
	}

	/**
	 * Sets the member price.
	 *
	 * @param memberPrice the new member price
	 */
	public void setMemberPrice(final String memberPrice) {
		this.memberPrice = memberPrice;
	}

	/**
	 * Gets the occasion.
	 *
	 * @return the occasion
	 */
	public String getOccasion() {
		return occasion;
	}

	/**
	 * Sets the occasion.
	 *
	 * @param occasion the new occasion
	 */
	public void setOccasion(final String occasion) {
		this.occasion = occasion;
	}

	/**
	 * Gets the start time.
	 *
	 * @return the start time
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * Sets the start time.
	 *
	 * @param startTime the new start time
	 */
	public void setStartTime(final String startTime) {
		this.startTime = startTime;
	}

	/**
	 * Gets the craftsman club exclusions.
	 *
	 * @return the craftsman club exclusions
	 */
	public String getCraftsmanClubExclusions() {
		return craftsmanClubExclusions;
	}

	/**
	 * Sets the craftsman club exclusions.
	 *
	 * @param craftsmanClubExclusions the new craftsman club exclusions
	 */
	public void setCraftsmanClubExclusions(final String craftsmanClubExclusions) {
		this.craftsmanClubExclusions = craftsmanClubExclusions;
	}

	/**
	 * Gets the add to cart link.
	 *
	 * @return the add to cart link
	 */
	public String getAddToCartLink() {
		return addToCartLink;
	}

	/**
	 * Sets the add to cart link.
	 *
	 * @param addToCartLink the new add to cart link
	 */
	public void setAddToCartLink(final String addToCartLink) {
		this.addToCartLink = addToCartLink;
	}

	/**
	 * Gets the SRES eligible.
	 *
	 * @return the SRES eligible
	 */
	public String getSRESEligible() {
		return SRESEligible;
	}

	/**
	 * Sets the SRES eligible.
	 *
	 * @param sRESEligible the new SRES eligible
	 */
	public void setSRESEligible(final String sRESEligible) {
		SRESEligible = sRESEligible;
	}

	/**
	 * Gets the free shipping.
	 *
	 * @return the free shipping
	 */
	public String getFreeShipping() {
		return freeShipping;
	}

	/**
	 * Sets the free shipping.
	 *
	 * @param freeShipping the new free shipping
	 */
	public void setFreeShipping(final String freeShipping) {
		this.freeShipping = freeShipping;
	}

	/**
	 * Gets the free shipping exclusions.
	 *
	 * @return the free shipping exclusions
	 */
	public String getFreeShippingExclusions() {
		return freeShippingExclusions;
	}

	/**
	 * Sets the free shipping exclusions.
	 *
	 * @param freeShippingExclusions the new free shipping exclusions
	 */
	public void setFreeShippingExclusions(final String freeShippingExclusions) {
		this.freeShippingExclusions = freeShippingExclusions;
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
	 * Gets the link.
	 *
	 * @return the link
	 */
	public String getLink() {
		return link;
	}

	/**
	 * Sets the link.
	 *
	 * @param link the new link
	 */
	public void setLink(final String link) {
		this.link = link;
	}

	/**
	 * Gets the main image url.
	 *
	 * @return the main image url
	 */
	public String getMainImageUrl() {
		return mainImageUrl;
	}

	/**
	 * Sets the main image url.
	 *
	 * @param mainImageUrl the new main image url
	 */
	public void setMainImageUrl(final String mainImageUrl) {
		this.mainImageUrl = mainImageUrl;
	}

	/**
	 * Gets the sale price.
	 *
	 * @return the sale price
	 */
	public String getSalePrice() {
		return salePrice;
	}

	/**
	 * Sets the sale price.
	 *
	 * @param salePrice the new sale price
	 */
	public void setSalePrice(final String salePrice) {
		this.salePrice = salePrice;
	}

	/**
	 * Gets the headline.
	 *
	 * @return the headline
	 */
	public String getHeadline() {
		return headline;
	}

	/**
	 * Sets the headline.
	 *
	 * @param headline the new headline
	 */
	public void setHeadline(final String headline) {
		this.headline = headline;
	}

	/**
	 * Gets the deal type.
	 *
	 * @return the deal type
	 */
	public String getDealType() {
		return dealType;
	}

	/**
	 * Sets the deal type.
	 *
	 * @param dealType the new deal type
	 */
	public void setDealType(final String dealType) {
		this.dealType = dealType;
	}

	/**
	 * Gets the is market placeitem.
	 *
	 * @return the is market placeitem
	 */
	public String getIsMarketPlaceitem() {
		return isMarketPlaceitem;
	}

	/**
	 * Sets the is market placeitem.
	 *
	 * @param isMarketPlaceitem the new is market placeitem
	 */
	public void setIsMarketPlaceitem(final String isMarketPlaceitem) {
		this.isMarketPlaceitem = isMarketPlaceitem;
	}

	/**
	 * Gets the craftsman club.
	 *
	 * @return the craftsman club
	 */
	public String getCraftsmanClub() {
		return craftsmanClub;
	}

	/**
	 * Sets the craftsman club.
	 *
	 * @param craftsmanClub the new craftsman club
	 */
	public void setCraftsmanClub(final String craftsmanClub) {
		this.craftsmanClub = craftsmanClub;
	}

	/**
	 * Gets the SP option.
	 *
	 * @return the SP option
	 */
	public String getSPOption() {
		return SPOption;
	}

	/**
	 * Sets the SP option.
	 *
	 * @param sPOption the new SP option
	 */
	public void setSPOption(final String sPOption) {
		SPOption = sPOption;
	}

	/**
	 * Gets the brand name.
	 *
	 * @return the brand name
	 */
	public String getBrandName() {
		return brandName;
	}

	/**
	 * Sets the brand name.
	 *
	 * @param brandName the new brand name
	 */
	public void setBrandName(final String brandName) {
		this.brandName = brandName;
	}

	/**
	 * Gets the ship vantage exclusions.
	 *
	 * @return the ship vantage exclusions
	 */
	public String getShipVantageExclusions() {
		return shipVantageExclusions;
	}

	/**
	 * Sets the ship vantage exclusions.
	 *
	 * @param shipVantageExclusions the new ship vantage exclusions
	 */
	public void setShipVantageExclusions(final String shipVantageExclusions) {
		this.shipVantageExclusions = shipVantageExclusions;
	}

	/**
	 * Gets the sub heading.
	 *
	 * @return the sub heading
	 */
	public String getSubHeading() {
		return subHeading;
	}

	/**
	 * Sets the sub heading.
	 *
	 * @param subHeading the new sub heading
	 */
	public void setSubHeading(final String subHeading) {
		this.subHeading = subHeading;
	}

	/**
	 * Gets the pid.
	 *
	 * @return the pid
	 */
	public String getPID() {
		return PID;
	}

	/**
	 * Sets the pid.
	 *
	 * @param pID the new pid
	 */
	public void setPID(final String pID) {
		PID = pID;
	}

	/**
	 * Gets the Rating.
	 *
	 * @return the Rating
	 */
	public String getRating() {
		return rating;
	}

	/**
	 * Sets the Rating.
	 *
	 * @param rating the new Rating
	 */
	public void setRating(final String rating) {
		this.rating = rating;
	}

	/**
	 * Gets the in stock.
	 *
	 * @return the in stock
	 */
	public int getInStock() {
		return inStock;
	}

	/**
	 * Sets the in stock.
	 *
	 * @param inStock the new in stock
	 */
	public void setInStock(final int inStock) {
		this.inStock = inStock;
	}

	/**
	 * Gets the where to purchase.
	 *
	 * @return the where to purchase
	 */
	public String getWhereToPurchase() {
		return whereToPurchase;
	}

	/**
	 * Sets the where to purchase.
	 *
	 * @param whereToPurchase the new where to purchase
	 */
	public void setWhereToPurchase(final String whereToPurchase) {
		this.whereToPurchase = whereToPurchase;
	}

	/**
	 * Gets the savings.
	 *
	 * @return the savings
	 */
	public String getSavings() {
		return savings;
	}

	/**
	 * Sets the savings.
	 *
	 * @param savings the new savings
	 */
	public void setSavings(final String savings) {
		this.savings = savings;
	}

	/**
	 * Gets the deal flash start date.
	 *
	 * @return the deal flash start date
	 */
	public String getDealFlashStartDate() {
		return dealFlashStartDate;
	}

	/**
	 * Sets the deal flash start date.
	 *
	 * @param dealFlashStartDate the new deal flash start date
	 */
	public void setDealFlashStartDate(final String dealFlashStartDate) {
		this.dealFlashStartDate = dealFlashStartDate;
	}

	/**
	 * Gets the product url.
	 *
	 * @return the product url
	 */
	public String getProductURL() {
		return productURL;
	}

	/**
	 * Sets the product url.
	 *
	 * @param productURL the new product url
	 */
	public void setProductURL(final String productURL) {
		this.productURL = productURL;
	}

	/**
	 * Gets the timed deals start.
	 *
	 * @return the timed deals start
	 */
	public String getTimedDealsStart() {
		return timedDealsStart;
	}

	/**
	 * Sets the timed deals start.
	 *
	 * @param timedDealsStart the new timed deals start
	 */
	public void setTimedDealsStart(final String timedDealsStart) {
		this.timedDealsStart = timedDealsStart;
	}

	/**
	 * Gets the free delivery.
	 *
	 * @return the free delivery
	 */
	public String getFreeDelivery() {
		return freeDelivery;
	}

	/**
	 * Sets the free delivery.
	 *
	 * @param freeDelivery the new free delivery
	 */
	public void setFreeDelivery(final String freeDelivery) {
		this.freeDelivery = freeDelivery;
	}

	/**
	 * Gets the mail in rebate.
	 *
	 * @return the mail in rebate
	 */
	public String getMailInRebate() {
		return mailInRebate;
	}

	/**
	 * Sets the mail in rebate.
	 *
	 * @param mailInRebate the new mail in rebate
	 */
	public void setMailInRebate(final String mailInRebate) {
		this.mailInRebate = mailInRebate;
	}

	/**
	 * Gets the mapped price indicator.
	 *
	 * @return the mapped price indicator
	 */
	public String getMappedPriceIndicator() {
		return mappedPriceIndicator;
	}

	/**
	 * Sets the mapped price indicator.
	 *
	 * @param mappedPriceIndicator the new mapped price indicator
	 */
	public void setMappedPriceIndicator(final String mappedPriceIndicator) {
		this.mappedPriceIndicator = mappedPriceIndicator;
	}

	/**
	 * Gets the department.
	 *
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * Sets the department.
	 *
	 * @param department the new department
	 */
	public void setDepartment(final String department) {
		this.department = department;
	}

	/**
	 * Gets the deal flash end date.
	 *
	 * @return the deal flash end date
	 */
	public String getDealFlashEndDate() {
		return dealFlashEndDate;
	}

	/**
	 * Sets the deal flash end date.
	 *
	 * @param dealFlashEndDate the new deal flash end date
	 */
	public void setDealFlashEndDate(final String dealFlashEndDate) {
		this.dealFlashEndDate = dealFlashEndDate;
	}

	/**
	 * Gets the deal flash.
	 *
	 * @return the deal flash
	 */
	public String getDealFlash() {
		return dealFlash;
	}

	/**
	 * Sets the deal flash.
	 *
	 * @param dealFlash the new deal flash
	 */
	public void setDealFlash(final String dealFlash) {
		this.dealFlash = dealFlash;
	}

	/**
	 * Gets the highlighted text.
	 *
	 * @return the highlighted text
	 */
	public String getHighlightedText() {
		return highlightedText;
	}

	/**
	 * Sets the highlighted text.
	 *
	 * @param highlightedText the new highlighted text
	 */
	public void setHighlightedText(final String highlightedText) {
		this.highlightedText = highlightedText;
	}

	/**
	 * Gets the color.
	 *
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Sets the color.
	 *
	 * @param color the new color
	 */
	public void setColor(final String color) {
		this.color = color;
	}

	/**
	 * Gets the timed deals end.
	 *
	 * @return the timed deals end
	 */
	public String getTimedDealsEnd() {
		return timedDealsEnd;
	}

	/**
	 * Sets the timed deals end.
	 *
	 * @param timedDealsEnd the new timed deals end
	 */
	public void setTimedDealsEnd(final String timedDealsEnd) {
		this.timedDealsEnd = timedDealsEnd;
	}

	/**
	 * Gets the map price.
	 *
	 * @return the map price
	 */
	public String getMapPrice() {
		return mapPrice;
	}

	/**
	 * Sets the map price.
	 *
	 * @param mapPrice the new map price
	 */
	public void setMapPrice(final String mapPrice) {
		this.mapPrice = mapPrice;
	}

	/**
	 * Gets the timed deals.
	 *
	 * @return the timed deals
	 */
	public String getTimedDeals() {
		return timedDeals;
	}

	/**
	 * Sets the timed deals.
	 *
	 * @param timedDeals the new timed deals
	 */
	public void setTimedDeals(final String timedDeals) {
		this.timedDeals = timedDeals;
	}

	/**
	 * Gets the online only.
	 *
	 * @return the online only
	 */
	public String getOnlineOnly() {
		return onlineOnly;
	}

	/**
	 * Sets the online only.
	 *
	 * @param onlineOnly the new online only
	 */
	public void setOnlineOnly(final String onlineOnly) {
		this.onlineOnly = onlineOnly;
	}

	/**
	 * Gets the ksr.
	 *
	 * @return the ksr
	 */
	public String getKSR() {
		return KSR;
	}

	/**
	 * Sets the ksr.
	 *
	 * @param kSR the new ksr
	 */
	public void setKSR(final String kSR) {
		KSR = kSR;
	}

	/**
	 * Gets the num review.
	 *
	 * @return the num review
	 */
	public String getNumReview() {
		return numReview;
	}

	/**
	 * Sets the num review.
	 *
	 * @param numReview the new num review
	 */
	public void setNumReview(final String numReview) {
		this.numReview = numReview;
	}

	/**
	 * Gets the sub category.
	 *
	 * @return the sub category
	 */
	public String getSubCategory() {
		return subCategory;
	}

	/**
	 * Sets the sub category.
	 *
	 * @param subCategory the new sub category
	 */
	public void setSubCategory(final String subCategory) {
		this.subCategory = subCategory;
	}

	/**
	 * Gets the syw link.
	 *
	 * @return the syw link
	 */
	public String getSywLink() {
		return sywLink;
	}

	/**
	 * Sets the syw link.
	 *
	 * @param sywLink the new syw link
	 */
	public void setSywLink(final String sywLink) {
		this.sywLink = sywLink;
	}

	/**
	 * Gets the price filter.
	 *
	 * @return the price filter
	 */
	public String getPriceFilter() {
		return priceFilter;
	}

	/**
	 * Sets the price filter.
	 *
	 * @param priceFilter the new price filter
	 */
	public void setPriceFilter(final String priceFilter) {
		this.priceFilter = priceFilter;
	}

}
