package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * create email campaign request payload
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateEmailCampaignRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An array of audience codes for the audiences of the email campaign. At least one audience code is required. There is no upper limit to the number of audience codes.&lt;br&gt;&lt;br&gt;To retrieve seller audiences, call &lt;a href=&quot;/api-docs/sell/marketing/resources/email_campaign/methods/getAudiences&quot; target=&quot;_blank&quot;&gt;getAudiences&lt;/a&gt;. Use the &lt;b&gt;code&lt;/b&gt; values in the response to populate &lt;b&gt;audienceCodes&lt;/b&gt;.
     */
    private java.util.List<String> audienceCodes;
    /**
     * The unique identifier of either an eBay category or a store category.&lt;br&gt;&lt;br&gt;This field is used if a seller wants to apply an email campaign to a specific eBay category or store category. The &lt;b&gt;categoryType&lt;/b&gt; determines whether the &lt;b&gt;categoryId&lt;/b&gt; value is an eBay category or store category.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/commerce/taxonomy/overview.html&quot;  target=&quot;_blank&quot;&gt;Taxonomy API&lt;/a&gt; to retrieve eBay categories. To retrieve seller store categories, use the &lt;a href=&quot;https://developer.ebay.com/devzone/xml/docs/reference/ebay/GetStore.html&quot; target=&quot;_blank&quot;&gt;getStore&lt;/a&gt; call. Use the &lt;b&gt;categoryId&lt;/b&gt; value of the desired category from the results as the value in the request.&lt;br&gt;&lt;br&gt;&lt;b&gt;itemSelectMode&lt;/b&gt; must be set to &lt;code&gt;AUTO&lt;/code&gt; in order to use a category ID.
     */
    private String categoryId;
    /**
     * This field must be set when applying an email campaign to a specific eBay category or store category. The enumeration value used indicates which type of category the &lt;b&gt;categoryId&lt;/b&gt; belongs to. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:CategoryTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String categoryType;
    /**
     * The email campaign type of the email campaign being created. There are six &lt;a href=&quot;/api-docs/sell/marketing/types/api:CampaignTypeEnum&quot;&gt;email campaigns&lt;/a&gt; that a user can create:&lt;ul&gt;&lt;li&gt;&lt;code&gt;WELCOME&lt;/code&gt; - an email sent automatically to new subscribers.&lt;/li&gt;&lt;li&gt;&lt;code&gt;ITEM_SHOWCASE&lt;/code&gt; - an email featuring new products &amp; collections that the seller wants to highlight.&lt;/li&gt;&lt;li&gt;&lt;code&gt;COUPON&lt;/code&gt; - an email containing a coupon code and up to 4 items that this coupon can be applied to.&lt;/li&gt;&lt;li&gt;&lt;code&gt;ORDER_DISCOUNT&lt;/code&gt; - an email containing an order discount and up to 10 items that this discount can be applied to.&lt;/li&gt;&lt;li&gt;&lt;code&gt;SALE_EVENT&lt;/code&gt; - an email about a sale event and up to 10 items that the sale can be applied to.&lt;/li&gt;&lt;li&gt;&lt;code&gt;VOLUME_PRICING&lt;/code&gt; - an email containing up to 10 items that are eligible for volume pricing.&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;b&gt;emailCampaignType&lt;/b&gt; cannot be updated once the email campaign is created.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:CampaignTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String emailCampaignType;
    /**
     * An array of unique identifiers for the listings displayed in an email campaign. Used if the seller wishes to select the eBay listings in the email campaign rather than have eBay automatically select them. &lt;br&gt;&lt;br&gt;Call &lt;a href=&quot;/DevZone/XML/docs/Reference/eBay/GetSellerList.html#GetSellerList&quot;&gt;getSellerList&lt;/a&gt; to retrieve all seller listings. Each &lt;b&gt;Item&lt;/b&gt; result contains an &lt;b&gt;ItemID&lt;/b&gt; value. Use this value in &lt;b&gt;itemIds&lt;/b&gt; to feature that listing.&lt;br&gt;&lt;br&gt;The maximum number of &lt;b&gt;itemIds&lt;/b&gt; for the &lt;code&gt;COUPON&lt;/code&gt; campaign type is 4, and for every other campaign type is 10&lt;br&gt;&lt;br&gt;&lt;b&gt;itemSelectMode&lt;/b&gt; must be set to &lt;code&gt;MANUAL&lt;/code&gt; in order to use this field.
     */
    private java.util.List<String> itemIds;
    /**
     * Determines whether listings featured in an email campaign are selected by the seller or by eBay.&lt;br&gt;&lt;br&gt;If &lt;b&gt;itemSelectMode&lt;/b&gt; is set to &lt;code&gt;AUTO&lt;/code&gt;, eBay automatically choses listings based on values set for &lt;b&gt;sort&lt;/b&gt;, &lt;b&gt;categoryType&lt;/b&gt;, &lt;b&gt;categoryId&lt;/b&gt;, and &lt;b&gt;priceRange&lt;/b&gt;.&lt;br&gt;&lt;br&gt;If &lt;b&gt;itemSelectMode&lt;/b&gt; is set to &lt;code&gt;MANUAL&lt;/code&gt;, listings are set by the seller by populating the &lt;b&gt;itemIds&lt;/b&gt; array.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;&lt;b&gt;itemSelectMode&lt;/b&gt; is always set to &lt;code&gt;AUTO&lt;/code&gt; for &lt;code&gt;WELCOME&lt;/code&gt; email campaigns.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:ItemSelectModeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String itemSelectMode;
    /**
     * The body of the email campaign. Accepts HTML and CSS.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 1000
     */
    private String personalizedMessage;
    /**
     * The price range.
     */
    private PriceRange priceRange;
    /**
     * The unique identifier of the discount used for an email campaign if the &lt;b&gt;emailCampaignType&lt;/b&gt; is set to &lt;code&gt;COUPON&lt;/code&gt;, &lt;code&gt;SALE_EVENT&lt;/code&gt;, or &lt;code&gt;ORDER_DISCOUNT&lt;/code&gt;. &lt;b&gt;promotionSelectModeEnum&lt;/b&gt; must set to &lt;code&gt;MANUAL&lt;/code&gt; if a discount is selected.&lt;br&gt;&lt;br&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/promotion/methods/getPromotions&quot; target=&quot;_blank&quot;&gt;getPromotions&lt;/a&gt; to retrieve a list of the seller&apos;s discounts. Use the &lt;b&gt;promotionId&lt;/b&gt; from an individual &lt;b&gt;PromotionDetail&lt;/b&gt; in the result to populate the request.
     */
    private String promotionId;
    /**
     * The selection mode for the discount used if the &lt;b&gt;emailCampaignType&lt;/b&gt; is set to &lt;code&gt;COUPON&lt;/code&gt;, &lt;code&gt;SALE_EVENT&lt;/code&gt;, or &lt;code&gt;ORDER_DISCOUNT&lt;/code&gt;.&lt;br&gt;&lt;br&gt;If &lt;b&gt;promotionSelectModeEnum&lt;/b&gt; is set to &lt;code&gt;AUTO&lt;/code&gt;, eBay will choose the discount to include in the email campaign. If set to &lt;code&gt;MANUAL&lt;/code&gt;, the seller must specify the discount in the &lt;b&gt;promotionId&lt;/b&gt; field. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:PromotionSelectModeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String promotionSelectModeEnum;
    /**
     * The date and time that the email campaign newsletter will be sent, given in UTC format. Example: 2023-05-20T03:13:35Z&lt;br&gt;&lt;br&gt;This field should be used if the seller wishes to send the email campaign on a future date. If no &lt;b&gt;scheduleDate&lt;/b&gt; is set, the email campaign will send once it is created or updated.
     */
    private String scheduleDate;
    /**
     * The sort rule is used to display the listings featured in the email campaign.&lt;br&gt;&lt;br&gt;Sort rules are only used if &lt;b&gt;itemSelectMode&lt;/b&gt; is set to &lt;code&gt;AUTO&lt;/code&gt;. If &lt;b&gt;itemSelectMode&lt;/b&gt; is &lt;code&gt;MANUAL&lt;/code&gt;, listings are displayed in the order in which they are listed in the &lt;b&gt;itemIds&lt;/b&gt; array. The following sort rules are available:&lt;ul&gt;&lt;li&gt;&lt;code&gt;ENDING_FIRST&lt;/code&gt; displays listings by ending date, from soonest to latest.&lt;/li&gt;&lt;li&gt;&lt;code&gt;LOWEST_PRICED&lt;/code&gt; displays listings by price, from lowest to highest.&lt;/li&gt;&lt;li&gt;&lt;code&gt;HIGHEST_PRICED&lt;/code&gt; displays listings by price, from highest to lowest.&lt;/li&gt;&lt;li&gt;&lt;code&gt;NEWLY_LISTED&lt;/code&gt; displays listings by date listed, with the newest first.&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;br&gt;The default sort rule is &lt;code&gt;NEWLY_LISTED&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:ItemSortEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String sort;
    /**
     * The subject line of the email campaign.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 70
     */
    private String subject;
    /**
     * Instantiates a new {@link CreateEmailCampaignRequest} and sets the default values.
     */
    public CreateEmailCampaignRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateEmailCampaignRequest}
     */
    @jakarta.annotation.Nonnull
    public static CreateEmailCampaignRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateEmailCampaignRequest();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the audienceCodes property value. An array of audience codes for the audiences of the email campaign. At least one audience code is required. There is no upper limit to the number of audience codes.&lt;br&gt;&lt;br&gt;To retrieve seller audiences, call &lt;a href=&quot;/api-docs/sell/marketing/resources/email_campaign/methods/getAudiences&quot; target=&quot;_blank&quot;&gt;getAudiences&lt;/a&gt;. Use the &lt;b&gt;code&lt;/b&gt; values in the response to populate &lt;b&gt;audienceCodes&lt;/b&gt;.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAudienceCodes() {
        return this.audienceCodes;
    }
    /**
     * Gets the categoryId property value. The unique identifier of either an eBay category or a store category.&lt;br&gt;&lt;br&gt;This field is used if a seller wants to apply an email campaign to a specific eBay category or store category. The &lt;b&gt;categoryType&lt;/b&gt; determines whether the &lt;b&gt;categoryId&lt;/b&gt; value is an eBay category or store category.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/commerce/taxonomy/overview.html&quot;  target=&quot;_blank&quot;&gt;Taxonomy API&lt;/a&gt; to retrieve eBay categories. To retrieve seller store categories, use the &lt;a href=&quot;https://developer.ebay.com/devzone/xml/docs/reference/ebay/GetStore.html&quot; target=&quot;_blank&quot;&gt;getStore&lt;/a&gt; call. Use the &lt;b&gt;categoryId&lt;/b&gt; value of the desired category from the results as the value in the request.&lt;br&gt;&lt;br&gt;&lt;b&gt;itemSelectMode&lt;/b&gt; must be set to &lt;code&gt;AUTO&lt;/code&gt; in order to use a category ID.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryId() {
        return this.categoryId;
    }
    /**
     * Gets the categoryType property value. This field must be set when applying an email campaign to a specific eBay category or store category. The enumeration value used indicates which type of category the &lt;b&gt;categoryId&lt;/b&gt; belongs to. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:CategoryTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryType() {
        return this.categoryType;
    }
    /**
     * Gets the emailCampaignType property value. The email campaign type of the email campaign being created. There are six &lt;a href=&quot;/api-docs/sell/marketing/types/api:CampaignTypeEnum&quot;&gt;email campaigns&lt;/a&gt; that a user can create:&lt;ul&gt;&lt;li&gt;&lt;code&gt;WELCOME&lt;/code&gt; - an email sent automatically to new subscribers.&lt;/li&gt;&lt;li&gt;&lt;code&gt;ITEM_SHOWCASE&lt;/code&gt; - an email featuring new products &amp; collections that the seller wants to highlight.&lt;/li&gt;&lt;li&gt;&lt;code&gt;COUPON&lt;/code&gt; - an email containing a coupon code and up to 4 items that this coupon can be applied to.&lt;/li&gt;&lt;li&gt;&lt;code&gt;ORDER_DISCOUNT&lt;/code&gt; - an email containing an order discount and up to 10 items that this discount can be applied to.&lt;/li&gt;&lt;li&gt;&lt;code&gt;SALE_EVENT&lt;/code&gt; - an email about a sale event and up to 10 items that the sale can be applied to.&lt;/li&gt;&lt;li&gt;&lt;code&gt;VOLUME_PRICING&lt;/code&gt; - an email containing up to 10 items that are eligible for volume pricing.&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;b&gt;emailCampaignType&lt;/b&gt; cannot be updated once the email campaign is created.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:CampaignTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmailCampaignType() {
        return this.emailCampaignType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("audienceCodes", (n) -> { this.setAudienceCodes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("categoryId", (n) -> { this.setCategoryId(n.getStringValue()); });
        deserializerMap.put("categoryType", (n) -> { this.setCategoryType(n.getStringValue()); });
        deserializerMap.put("emailCampaignType", (n) -> { this.setEmailCampaignType(n.getStringValue()); });
        deserializerMap.put("itemIds", (n) -> { this.setItemIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("itemSelectMode", (n) -> { this.setItemSelectMode(n.getStringValue()); });
        deserializerMap.put("personalizedMessage", (n) -> { this.setPersonalizedMessage(n.getStringValue()); });
        deserializerMap.put("priceRange", (n) -> { this.setPriceRange(n.getObjectValue(PriceRange::createFromDiscriminatorValue)); });
        deserializerMap.put("promotionId", (n) -> { this.setPromotionId(n.getStringValue()); });
        deserializerMap.put("promotionSelectModeEnum", (n) -> { this.setPromotionSelectModeEnum(n.getStringValue()); });
        deserializerMap.put("scheduleDate", (n) -> { this.setScheduleDate(n.getStringValue()); });
        deserializerMap.put("sort", (n) -> { this.setSort(n.getStringValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the itemIds property value. An array of unique identifiers for the listings displayed in an email campaign. Used if the seller wishes to select the eBay listings in the email campaign rather than have eBay automatically select them. &lt;br&gt;&lt;br&gt;Call &lt;a href=&quot;/DevZone/XML/docs/Reference/eBay/GetSellerList.html#GetSellerList&quot;&gt;getSellerList&lt;/a&gt; to retrieve all seller listings. Each &lt;b&gt;Item&lt;/b&gt; result contains an &lt;b&gt;ItemID&lt;/b&gt; value. Use this value in &lt;b&gt;itemIds&lt;/b&gt; to feature that listing.&lt;br&gt;&lt;br&gt;The maximum number of &lt;b&gt;itemIds&lt;/b&gt; for the &lt;code&gt;COUPON&lt;/code&gt; campaign type is 4, and for every other campaign type is 10&lt;br&gt;&lt;br&gt;&lt;b&gt;itemSelectMode&lt;/b&gt; must be set to &lt;code&gt;MANUAL&lt;/code&gt; in order to use this field.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getItemIds() {
        return this.itemIds;
    }
    /**
     * Gets the itemSelectMode property value. Determines whether listings featured in an email campaign are selected by the seller or by eBay.&lt;br&gt;&lt;br&gt;If &lt;b&gt;itemSelectMode&lt;/b&gt; is set to &lt;code&gt;AUTO&lt;/code&gt;, eBay automatically choses listings based on values set for &lt;b&gt;sort&lt;/b&gt;, &lt;b&gt;categoryType&lt;/b&gt;, &lt;b&gt;categoryId&lt;/b&gt;, and &lt;b&gt;priceRange&lt;/b&gt;.&lt;br&gt;&lt;br&gt;If &lt;b&gt;itemSelectMode&lt;/b&gt; is set to &lt;code&gt;MANUAL&lt;/code&gt;, listings are set by the seller by populating the &lt;b&gt;itemIds&lt;/b&gt; array.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;&lt;b&gt;itemSelectMode&lt;/b&gt; is always set to &lt;code&gt;AUTO&lt;/code&gt; for &lt;code&gt;WELCOME&lt;/code&gt; email campaigns.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:ItemSelectModeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getItemSelectMode() {
        return this.itemSelectMode;
    }
    /**
     * Gets the personalizedMessage property value. The body of the email campaign. Accepts HTML and CSS.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 1000
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPersonalizedMessage() {
        return this.personalizedMessage;
    }
    /**
     * Gets the priceRange property value. The price range.
     * @return a {@link PriceRange}
     */
    @jakarta.annotation.Nullable
    public PriceRange getPriceRange() {
        return this.priceRange;
    }
    /**
     * Gets the promotionId property value. The unique identifier of the discount used for an email campaign if the &lt;b&gt;emailCampaignType&lt;/b&gt; is set to &lt;code&gt;COUPON&lt;/code&gt;, &lt;code&gt;SALE_EVENT&lt;/code&gt;, or &lt;code&gt;ORDER_DISCOUNT&lt;/code&gt;. &lt;b&gt;promotionSelectModeEnum&lt;/b&gt; must set to &lt;code&gt;MANUAL&lt;/code&gt; if a discount is selected.&lt;br&gt;&lt;br&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/promotion/methods/getPromotions&quot; target=&quot;_blank&quot;&gt;getPromotions&lt;/a&gt; to retrieve a list of the seller&apos;s discounts. Use the &lt;b&gt;promotionId&lt;/b&gt; from an individual &lt;b&gt;PromotionDetail&lt;/b&gt; in the result to populate the request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPromotionId() {
        return this.promotionId;
    }
    /**
     * Gets the promotionSelectModeEnum property value. The selection mode for the discount used if the &lt;b&gt;emailCampaignType&lt;/b&gt; is set to &lt;code&gt;COUPON&lt;/code&gt;, &lt;code&gt;SALE_EVENT&lt;/code&gt;, or &lt;code&gt;ORDER_DISCOUNT&lt;/code&gt;.&lt;br&gt;&lt;br&gt;If &lt;b&gt;promotionSelectModeEnum&lt;/b&gt; is set to &lt;code&gt;AUTO&lt;/code&gt;, eBay will choose the discount to include in the email campaign. If set to &lt;code&gt;MANUAL&lt;/code&gt;, the seller must specify the discount in the &lt;b&gt;promotionId&lt;/b&gt; field. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:PromotionSelectModeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPromotionSelectModeEnum() {
        return this.promotionSelectModeEnum;
    }
    /**
     * Gets the scheduleDate property value. The date and time that the email campaign newsletter will be sent, given in UTC format. Example: 2023-05-20T03:13:35Z&lt;br&gt;&lt;br&gt;This field should be used if the seller wishes to send the email campaign on a future date. If no &lt;b&gt;scheduleDate&lt;/b&gt; is set, the email campaign will send once it is created or updated.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScheduleDate() {
        return this.scheduleDate;
    }
    /**
     * Gets the sort property value. The sort rule is used to display the listings featured in the email campaign.&lt;br&gt;&lt;br&gt;Sort rules are only used if &lt;b&gt;itemSelectMode&lt;/b&gt; is set to &lt;code&gt;AUTO&lt;/code&gt;. If &lt;b&gt;itemSelectMode&lt;/b&gt; is &lt;code&gt;MANUAL&lt;/code&gt;, listings are displayed in the order in which they are listed in the &lt;b&gt;itemIds&lt;/b&gt; array. The following sort rules are available:&lt;ul&gt;&lt;li&gt;&lt;code&gt;ENDING_FIRST&lt;/code&gt; displays listings by ending date, from soonest to latest.&lt;/li&gt;&lt;li&gt;&lt;code&gt;LOWEST_PRICED&lt;/code&gt; displays listings by price, from lowest to highest.&lt;/li&gt;&lt;li&gt;&lt;code&gt;HIGHEST_PRICED&lt;/code&gt; displays listings by price, from highest to lowest.&lt;/li&gt;&lt;li&gt;&lt;code&gt;NEWLY_LISTED&lt;/code&gt; displays listings by date listed, with the newest first.&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;br&gt;The default sort rule is &lt;code&gt;NEWLY_LISTED&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:ItemSortEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSort() {
        return this.sort;
    }
    /**
     * Gets the subject property value. The subject line of the email campaign.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 70
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.subject;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("audienceCodes", this.getAudienceCodes());
        writer.writeStringValue("categoryId", this.getCategoryId());
        writer.writeStringValue("categoryType", this.getCategoryType());
        writer.writeStringValue("emailCampaignType", this.getEmailCampaignType());
        writer.writeCollectionOfPrimitiveValues("itemIds", this.getItemIds());
        writer.writeStringValue("itemSelectMode", this.getItemSelectMode());
        writer.writeStringValue("personalizedMessage", this.getPersonalizedMessage());
        writer.writeObjectValue("priceRange", this.getPriceRange());
        writer.writeStringValue("promotionId", this.getPromotionId());
        writer.writeStringValue("promotionSelectModeEnum", this.getPromotionSelectModeEnum());
        writer.writeStringValue("scheduleDate", this.getScheduleDate());
        writer.writeStringValue("sort", this.getSort());
        writer.writeStringValue("subject", this.getSubject());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the audienceCodes property value. An array of audience codes for the audiences of the email campaign. At least one audience code is required. There is no upper limit to the number of audience codes.&lt;br&gt;&lt;br&gt;To retrieve seller audiences, call &lt;a href=&quot;/api-docs/sell/marketing/resources/email_campaign/methods/getAudiences&quot; target=&quot;_blank&quot;&gt;getAudiences&lt;/a&gt;. Use the &lt;b&gt;code&lt;/b&gt; values in the response to populate &lt;b&gt;audienceCodes&lt;/b&gt;.
     * @param value Value to set for the audienceCodes property.
     */
    public void setAudienceCodes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.audienceCodes = value;
    }
    /**
     * Sets the categoryId property value. The unique identifier of either an eBay category or a store category.&lt;br&gt;&lt;br&gt;This field is used if a seller wants to apply an email campaign to a specific eBay category or store category. The &lt;b&gt;categoryType&lt;/b&gt; determines whether the &lt;b&gt;categoryId&lt;/b&gt; value is an eBay category or store category.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/commerce/taxonomy/overview.html&quot;  target=&quot;_blank&quot;&gt;Taxonomy API&lt;/a&gt; to retrieve eBay categories. To retrieve seller store categories, use the &lt;a href=&quot;https://developer.ebay.com/devzone/xml/docs/reference/ebay/GetStore.html&quot; target=&quot;_blank&quot;&gt;getStore&lt;/a&gt; call. Use the &lt;b&gt;categoryId&lt;/b&gt; value of the desired category from the results as the value in the request.&lt;br&gt;&lt;br&gt;&lt;b&gt;itemSelectMode&lt;/b&gt; must be set to &lt;code&gt;AUTO&lt;/code&gt; in order to use a category ID.
     * @param value Value to set for the categoryId property.
     */
    public void setCategoryId(@jakarta.annotation.Nullable final String value) {
        this.categoryId = value;
    }
    /**
     * Sets the categoryType property value. This field must be set when applying an email campaign to a specific eBay category or store category. The enumeration value used indicates which type of category the &lt;b&gt;categoryId&lt;/b&gt; belongs to. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:CategoryTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the categoryType property.
     */
    public void setCategoryType(@jakarta.annotation.Nullable final String value) {
        this.categoryType = value;
    }
    /**
     * Sets the emailCampaignType property value. The email campaign type of the email campaign being created. There are six &lt;a href=&quot;/api-docs/sell/marketing/types/api:CampaignTypeEnum&quot;&gt;email campaigns&lt;/a&gt; that a user can create:&lt;ul&gt;&lt;li&gt;&lt;code&gt;WELCOME&lt;/code&gt; - an email sent automatically to new subscribers.&lt;/li&gt;&lt;li&gt;&lt;code&gt;ITEM_SHOWCASE&lt;/code&gt; - an email featuring new products &amp; collections that the seller wants to highlight.&lt;/li&gt;&lt;li&gt;&lt;code&gt;COUPON&lt;/code&gt; - an email containing a coupon code and up to 4 items that this coupon can be applied to.&lt;/li&gt;&lt;li&gt;&lt;code&gt;ORDER_DISCOUNT&lt;/code&gt; - an email containing an order discount and up to 10 items that this discount can be applied to.&lt;/li&gt;&lt;li&gt;&lt;code&gt;SALE_EVENT&lt;/code&gt; - an email about a sale event and up to 10 items that the sale can be applied to.&lt;/li&gt;&lt;li&gt;&lt;code&gt;VOLUME_PRICING&lt;/code&gt; - an email containing up to 10 items that are eligible for volume pricing.&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;b&gt;emailCampaignType&lt;/b&gt; cannot be updated once the email campaign is created.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:CampaignTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the emailCampaignType property.
     */
    public void setEmailCampaignType(@jakarta.annotation.Nullable final String value) {
        this.emailCampaignType = value;
    }
    /**
     * Sets the itemIds property value. An array of unique identifiers for the listings displayed in an email campaign. Used if the seller wishes to select the eBay listings in the email campaign rather than have eBay automatically select them. &lt;br&gt;&lt;br&gt;Call &lt;a href=&quot;/DevZone/XML/docs/Reference/eBay/GetSellerList.html#GetSellerList&quot;&gt;getSellerList&lt;/a&gt; to retrieve all seller listings. Each &lt;b&gt;Item&lt;/b&gt; result contains an &lt;b&gt;ItemID&lt;/b&gt; value. Use this value in &lt;b&gt;itemIds&lt;/b&gt; to feature that listing.&lt;br&gt;&lt;br&gt;The maximum number of &lt;b&gt;itemIds&lt;/b&gt; for the &lt;code&gt;COUPON&lt;/code&gt; campaign type is 4, and for every other campaign type is 10&lt;br&gt;&lt;br&gt;&lt;b&gt;itemSelectMode&lt;/b&gt; must be set to &lt;code&gt;MANUAL&lt;/code&gt; in order to use this field.
     * @param value Value to set for the itemIds property.
     */
    public void setItemIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.itemIds = value;
    }
    /**
     * Sets the itemSelectMode property value. Determines whether listings featured in an email campaign are selected by the seller or by eBay.&lt;br&gt;&lt;br&gt;If &lt;b&gt;itemSelectMode&lt;/b&gt; is set to &lt;code&gt;AUTO&lt;/code&gt;, eBay automatically choses listings based on values set for &lt;b&gt;sort&lt;/b&gt;, &lt;b&gt;categoryType&lt;/b&gt;, &lt;b&gt;categoryId&lt;/b&gt;, and &lt;b&gt;priceRange&lt;/b&gt;.&lt;br&gt;&lt;br&gt;If &lt;b&gt;itemSelectMode&lt;/b&gt; is set to &lt;code&gt;MANUAL&lt;/code&gt;, listings are set by the seller by populating the &lt;b&gt;itemIds&lt;/b&gt; array.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;&lt;b&gt;itemSelectMode&lt;/b&gt; is always set to &lt;code&gt;AUTO&lt;/code&gt; for &lt;code&gt;WELCOME&lt;/code&gt; email campaigns.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:ItemSelectModeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the itemSelectMode property.
     */
    public void setItemSelectMode(@jakarta.annotation.Nullable final String value) {
        this.itemSelectMode = value;
    }
    /**
     * Sets the personalizedMessage property value. The body of the email campaign. Accepts HTML and CSS.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 1000
     * @param value Value to set for the personalizedMessage property.
     */
    public void setPersonalizedMessage(@jakarta.annotation.Nullable final String value) {
        this.personalizedMessage = value;
    }
    /**
     * Sets the priceRange property value. The price range.
     * @param value Value to set for the priceRange property.
     */
    public void setPriceRange(@jakarta.annotation.Nullable final PriceRange value) {
        this.priceRange = value;
    }
    /**
     * Sets the promotionId property value. The unique identifier of the discount used for an email campaign if the &lt;b&gt;emailCampaignType&lt;/b&gt; is set to &lt;code&gt;COUPON&lt;/code&gt;, &lt;code&gt;SALE_EVENT&lt;/code&gt;, or &lt;code&gt;ORDER_DISCOUNT&lt;/code&gt;. &lt;b&gt;promotionSelectModeEnum&lt;/b&gt; must set to &lt;code&gt;MANUAL&lt;/code&gt; if a discount is selected.&lt;br&gt;&lt;br&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/promotion/methods/getPromotions&quot; target=&quot;_blank&quot;&gt;getPromotions&lt;/a&gt; to retrieve a list of the seller&apos;s discounts. Use the &lt;b&gt;promotionId&lt;/b&gt; from an individual &lt;b&gt;PromotionDetail&lt;/b&gt; in the result to populate the request.
     * @param value Value to set for the promotionId property.
     */
    public void setPromotionId(@jakarta.annotation.Nullable final String value) {
        this.promotionId = value;
    }
    /**
     * Sets the promotionSelectModeEnum property value. The selection mode for the discount used if the &lt;b&gt;emailCampaignType&lt;/b&gt; is set to &lt;code&gt;COUPON&lt;/code&gt;, &lt;code&gt;SALE_EVENT&lt;/code&gt;, or &lt;code&gt;ORDER_DISCOUNT&lt;/code&gt;.&lt;br&gt;&lt;br&gt;If &lt;b&gt;promotionSelectModeEnum&lt;/b&gt; is set to &lt;code&gt;AUTO&lt;/code&gt;, eBay will choose the discount to include in the email campaign. If set to &lt;code&gt;MANUAL&lt;/code&gt;, the seller must specify the discount in the &lt;b&gt;promotionId&lt;/b&gt; field. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:PromotionSelectModeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the promotionSelectModeEnum property.
     */
    public void setPromotionSelectModeEnum(@jakarta.annotation.Nullable final String value) {
        this.promotionSelectModeEnum = value;
    }
    /**
     * Sets the scheduleDate property value. The date and time that the email campaign newsletter will be sent, given in UTC format. Example: 2023-05-20T03:13:35Z&lt;br&gt;&lt;br&gt;This field should be used if the seller wishes to send the email campaign on a future date. If no &lt;b&gt;scheduleDate&lt;/b&gt; is set, the email campaign will send once it is created or updated.
     * @param value Value to set for the scheduleDate property.
     */
    public void setScheduleDate(@jakarta.annotation.Nullable final String value) {
        this.scheduleDate = value;
    }
    /**
     * Sets the sort property value. The sort rule is used to display the listings featured in the email campaign.&lt;br&gt;&lt;br&gt;Sort rules are only used if &lt;b&gt;itemSelectMode&lt;/b&gt; is set to &lt;code&gt;AUTO&lt;/code&gt;. If &lt;b&gt;itemSelectMode&lt;/b&gt; is &lt;code&gt;MANUAL&lt;/code&gt;, listings are displayed in the order in which they are listed in the &lt;b&gt;itemIds&lt;/b&gt; array. The following sort rules are available:&lt;ul&gt;&lt;li&gt;&lt;code&gt;ENDING_FIRST&lt;/code&gt; displays listings by ending date, from soonest to latest.&lt;/li&gt;&lt;li&gt;&lt;code&gt;LOWEST_PRICED&lt;/code&gt; displays listings by price, from lowest to highest.&lt;/li&gt;&lt;li&gt;&lt;code&gt;HIGHEST_PRICED&lt;/code&gt; displays listings by price, from highest to lowest.&lt;/li&gt;&lt;li&gt;&lt;code&gt;NEWLY_LISTED&lt;/code&gt; displays listings by date listed, with the newest first.&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;br&gt;The default sort rule is &lt;code&gt;NEWLY_LISTED&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:ItemSortEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the sort property.
     */
    public void setSort(@jakarta.annotation.Nullable final String value) {
        this.sort = value;
    }
    /**
     * Sets the subject property value. The subject line of the email campaign.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length:&lt;/b&gt; 70
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.subject = value;
    }
}
