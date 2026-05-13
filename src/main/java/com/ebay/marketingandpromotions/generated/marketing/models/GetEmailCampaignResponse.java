package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetEmailCampaignResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An array of one or more audiences associated with the email campaign.
     */
    private java.util.List<CampaignAudience> audiences;
    /**
     * The unique identifier of an eBay category or an eBay store category. This field is returned if a seller has applied the email campaign to a specific category.&lt;br&gt;&lt;br&gt;The &lt;b&gt;categoryType&lt;/b&gt; value will indicate if the category ID is for an eBay category or an eBay store category.
     */
    private String categoryId;
    /**
     * The enumeration value returned here indicates if the &lt;b&gt;categoryId&lt;/b&gt; value is the identifier of an eBay category or an eBay store category.&lt;br&gt;&lt;br&gt;This field is returned if a seller has applied the email campaign to a specific category. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:CategoryTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String categoryType;
    /**
     * The date and time that the email campaign was created, given in UTC format.
     */
    private String creationDate;
    /**
     * The unique identifier of the email campaign.
     */
    private String emailCampaignId;
    /**
     * The email campaign status. See &lt;a href=&quot;/api-docs/sell/marketing/types/api:EmailCampaignStatusEnum&quot;&gt;EmailCampaignStatusEnum&lt;/a&gt; for a list of valid statuses. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:EmailCampaignStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String emailCampaignStatus;
    /**
     * The email campaign type. See &lt;a href=&quot;/api-docs/sell/marketing/types/api:CampaignTypeEnum&quot;&gt;CampaignTypeEnum&lt;/a&gt; for valid email campaign types. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:CampaignTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String emailCampaignType;
    /**
     * The listing IDs of the items that were manually added to the email campaign.&lt;br&gt;&lt;br&gt;Only listings added manually by the seller are returned. Returns a null array if no listings were added.
     */
    private java.util.List<String> itemIds;
    /**
     * The mode used to select the items listed in the email campaign. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:ItemSelectModeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String itemSelectMode;
    /**
     * The eBay marketplace where the email campaign is active. See &lt;a href=&quot;/api-docs/sell/marketing/types/ba:MarketplaceIdEnum&quot;&gt;MarketplaceIdEnum&lt;/a&gt; for a list of marketplace IDs.
     */
    private String marketplaceId;
    /**
     * The date and time the email campaign was last modified, given in UTC format.
     */
    private String modificationDate;
    /**
     * The body of the email campaign sent to the audience.
     */
    private String personalizedMessage;
    /**
     * The price range.
     */
    private PriceRange priceRange;
    /**
     * The ID of the discount that was assigned to the email campaign.
     */
    private String promotionId;
    /**
     * Indicates whether the listings that the discount was applied to were selected manually or automatically.&lt;br&gt;&lt;br&gt;This field will only return if a discount was applied. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:PromotionSelectModeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String promotionSelectMode;
    /**
     * The date and time that the email campaign newsletter is scheduled to send, given in UTC format. This field is only returned if the seller set the start of the email campaign to a date in the future.
     */
    private String scheduleDate;
    /**
     * The schedule type of the email campaign. See &lt;a href=&quot;/api-docs/sell/marketing/types/api:ScheduleDateTypeEnum&quot;&gt;ScheduleDateTypeEnum&lt;/a&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:ScheduleDateTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String scheduleDateType;
    /**
     * The date and time that the email campaign was sent, given in UTC format.
     */
    private String sentDate;
    /**
     * The sort rule is used to display the items in the email campaign. If no sort rule was selected, the default will be &lt;code&gt;NEWLY_LISTED&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:ItemSortEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String sort;
    /**
     * The email campaign subject.
     */
    private String subject;
    /**
     * Instantiates a new {@link GetEmailCampaignResponse} and sets the default values.
     */
    public GetEmailCampaignResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetEmailCampaignResponse}
     */
    @jakarta.annotation.Nonnull
    public static GetEmailCampaignResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetEmailCampaignResponse();
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
     * Gets the audiences property value. An array of one or more audiences associated with the email campaign.
     * @return a {@link java.util.List<CampaignAudience>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CampaignAudience> getAudiences() {
        return this.audiences;
    }
    /**
     * Gets the categoryId property value. The unique identifier of an eBay category or an eBay store category. This field is returned if a seller has applied the email campaign to a specific category.&lt;br&gt;&lt;br&gt;The &lt;b&gt;categoryType&lt;/b&gt; value will indicate if the category ID is for an eBay category or an eBay store category.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryId() {
        return this.categoryId;
    }
    /**
     * Gets the categoryType property value. The enumeration value returned here indicates if the &lt;b&gt;categoryId&lt;/b&gt; value is the identifier of an eBay category or an eBay store category.&lt;br&gt;&lt;br&gt;This field is returned if a seller has applied the email campaign to a specific category. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:CategoryTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryType() {
        return this.categoryType;
    }
    /**
     * Gets the creationDate property value. The date and time that the email campaign was created, given in UTC format.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreationDate() {
        return this.creationDate;
    }
    /**
     * Gets the emailCampaignId property value. The unique identifier of the email campaign.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmailCampaignId() {
        return this.emailCampaignId;
    }
    /**
     * Gets the emailCampaignStatus property value. The email campaign status. See &lt;a href=&quot;/api-docs/sell/marketing/types/api:EmailCampaignStatusEnum&quot;&gt;EmailCampaignStatusEnum&lt;/a&gt; for a list of valid statuses. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:EmailCampaignStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmailCampaignStatus() {
        return this.emailCampaignStatus;
    }
    /**
     * Gets the emailCampaignType property value. The email campaign type. See &lt;a href=&quot;/api-docs/sell/marketing/types/api:CampaignTypeEnum&quot;&gt;CampaignTypeEnum&lt;/a&gt; for valid email campaign types. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:CampaignTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(20);
        deserializerMap.put("audiences", (n) -> { this.setAudiences(n.getCollectionOfObjectValues(CampaignAudience::createFromDiscriminatorValue)); });
        deserializerMap.put("categoryId", (n) -> { this.setCategoryId(n.getStringValue()); });
        deserializerMap.put("categoryType", (n) -> { this.setCategoryType(n.getStringValue()); });
        deserializerMap.put("creationDate", (n) -> { this.setCreationDate(n.getStringValue()); });
        deserializerMap.put("emailCampaignId", (n) -> { this.setEmailCampaignId(n.getStringValue()); });
        deserializerMap.put("emailCampaignStatus", (n) -> { this.setEmailCampaignStatus(n.getStringValue()); });
        deserializerMap.put("emailCampaignType", (n) -> { this.setEmailCampaignType(n.getStringValue()); });
        deserializerMap.put("itemIds", (n) -> { this.setItemIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("itemSelectMode", (n) -> { this.setItemSelectMode(n.getStringValue()); });
        deserializerMap.put("marketplaceId", (n) -> { this.setMarketplaceId(n.getStringValue()); });
        deserializerMap.put("modificationDate", (n) -> { this.setModificationDate(n.getStringValue()); });
        deserializerMap.put("personalizedMessage", (n) -> { this.setPersonalizedMessage(n.getStringValue()); });
        deserializerMap.put("priceRange", (n) -> { this.setPriceRange(n.getObjectValue(PriceRange::createFromDiscriminatorValue)); });
        deserializerMap.put("promotionId", (n) -> { this.setPromotionId(n.getStringValue()); });
        deserializerMap.put("promotionSelectMode", (n) -> { this.setPromotionSelectMode(n.getStringValue()); });
        deserializerMap.put("scheduleDate", (n) -> { this.setScheduleDate(n.getStringValue()); });
        deserializerMap.put("scheduleDateType", (n) -> { this.setScheduleDateType(n.getStringValue()); });
        deserializerMap.put("sentDate", (n) -> { this.setSentDate(n.getStringValue()); });
        deserializerMap.put("sort", (n) -> { this.setSort(n.getStringValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the itemIds property value. The listing IDs of the items that were manually added to the email campaign.&lt;br&gt;&lt;br&gt;Only listings added manually by the seller are returned. Returns a null array if no listings were added.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getItemIds() {
        return this.itemIds;
    }
    /**
     * Gets the itemSelectMode property value. The mode used to select the items listed in the email campaign. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:ItemSelectModeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getItemSelectMode() {
        return this.itemSelectMode;
    }
    /**
     * Gets the marketplaceId property value. The eBay marketplace where the email campaign is active. See &lt;a href=&quot;/api-docs/sell/marketing/types/ba:MarketplaceIdEnum&quot;&gt;MarketplaceIdEnum&lt;/a&gt; for a list of marketplace IDs.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMarketplaceId() {
        return this.marketplaceId;
    }
    /**
     * Gets the modificationDate property value. The date and time the email campaign was last modified, given in UTC format.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getModificationDate() {
        return this.modificationDate;
    }
    /**
     * Gets the personalizedMessage property value. The body of the email campaign sent to the audience.
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
     * Gets the promotionId property value. The ID of the discount that was assigned to the email campaign.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPromotionId() {
        return this.promotionId;
    }
    /**
     * Gets the promotionSelectMode property value. Indicates whether the listings that the discount was applied to were selected manually or automatically.&lt;br&gt;&lt;br&gt;This field will only return if a discount was applied. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:PromotionSelectModeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPromotionSelectMode() {
        return this.promotionSelectMode;
    }
    /**
     * Gets the scheduleDate property value. The date and time that the email campaign newsletter is scheduled to send, given in UTC format. This field is only returned if the seller set the start of the email campaign to a date in the future.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScheduleDate() {
        return this.scheduleDate;
    }
    /**
     * Gets the scheduleDateType property value. The schedule type of the email campaign. See &lt;a href=&quot;/api-docs/sell/marketing/types/api:ScheduleDateTypeEnum&quot;&gt;ScheduleDateTypeEnum&lt;/a&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:ScheduleDateTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScheduleDateType() {
        return this.scheduleDateType;
    }
    /**
     * Gets the sentDate property value. The date and time that the email campaign was sent, given in UTC format.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSentDate() {
        return this.sentDate;
    }
    /**
     * Gets the sort property value. The sort rule is used to display the items in the email campaign. If no sort rule was selected, the default will be &lt;code&gt;NEWLY_LISTED&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:ItemSortEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSort() {
        return this.sort;
    }
    /**
     * Gets the subject property value. The email campaign subject.
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
        writer.writeCollectionOfObjectValues("audiences", this.getAudiences());
        writer.writeStringValue("categoryId", this.getCategoryId());
        writer.writeStringValue("categoryType", this.getCategoryType());
        writer.writeStringValue("creationDate", this.getCreationDate());
        writer.writeStringValue("emailCampaignId", this.getEmailCampaignId());
        writer.writeStringValue("emailCampaignStatus", this.getEmailCampaignStatus());
        writer.writeStringValue("emailCampaignType", this.getEmailCampaignType());
        writer.writeCollectionOfPrimitiveValues("itemIds", this.getItemIds());
        writer.writeStringValue("itemSelectMode", this.getItemSelectMode());
        writer.writeStringValue("marketplaceId", this.getMarketplaceId());
        writer.writeStringValue("modificationDate", this.getModificationDate());
        writer.writeStringValue("personalizedMessage", this.getPersonalizedMessage());
        writer.writeObjectValue("priceRange", this.getPriceRange());
        writer.writeStringValue("promotionId", this.getPromotionId());
        writer.writeStringValue("promotionSelectMode", this.getPromotionSelectMode());
        writer.writeStringValue("scheduleDate", this.getScheduleDate());
        writer.writeStringValue("scheduleDateType", this.getScheduleDateType());
        writer.writeStringValue("sentDate", this.getSentDate());
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
     * Sets the audiences property value. An array of one or more audiences associated with the email campaign.
     * @param value Value to set for the audiences property.
     */
    public void setAudiences(@jakarta.annotation.Nullable final java.util.List<CampaignAudience> value) {
        this.audiences = value;
    }
    /**
     * Sets the categoryId property value. The unique identifier of an eBay category or an eBay store category. This field is returned if a seller has applied the email campaign to a specific category.&lt;br&gt;&lt;br&gt;The &lt;b&gt;categoryType&lt;/b&gt; value will indicate if the category ID is for an eBay category or an eBay store category.
     * @param value Value to set for the categoryId property.
     */
    public void setCategoryId(@jakarta.annotation.Nullable final String value) {
        this.categoryId = value;
    }
    /**
     * Sets the categoryType property value. The enumeration value returned here indicates if the &lt;b&gt;categoryId&lt;/b&gt; value is the identifier of an eBay category or an eBay store category.&lt;br&gt;&lt;br&gt;This field is returned if a seller has applied the email campaign to a specific category. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:CategoryTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the categoryType property.
     */
    public void setCategoryType(@jakarta.annotation.Nullable final String value) {
        this.categoryType = value;
    }
    /**
     * Sets the creationDate property value. The date and time that the email campaign was created, given in UTC format.
     * @param value Value to set for the creationDate property.
     */
    public void setCreationDate(@jakarta.annotation.Nullable final String value) {
        this.creationDate = value;
    }
    /**
     * Sets the emailCampaignId property value. The unique identifier of the email campaign.
     * @param value Value to set for the emailCampaignId property.
     */
    public void setEmailCampaignId(@jakarta.annotation.Nullable final String value) {
        this.emailCampaignId = value;
    }
    /**
     * Sets the emailCampaignStatus property value. The email campaign status. See &lt;a href=&quot;/api-docs/sell/marketing/types/api:EmailCampaignStatusEnum&quot;&gt;EmailCampaignStatusEnum&lt;/a&gt; for a list of valid statuses. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:EmailCampaignStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the emailCampaignStatus property.
     */
    public void setEmailCampaignStatus(@jakarta.annotation.Nullable final String value) {
        this.emailCampaignStatus = value;
    }
    /**
     * Sets the emailCampaignType property value. The email campaign type. See &lt;a href=&quot;/api-docs/sell/marketing/types/api:CampaignTypeEnum&quot;&gt;CampaignTypeEnum&lt;/a&gt; for valid email campaign types. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:CampaignTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the emailCampaignType property.
     */
    public void setEmailCampaignType(@jakarta.annotation.Nullable final String value) {
        this.emailCampaignType = value;
    }
    /**
     * Sets the itemIds property value. The listing IDs of the items that were manually added to the email campaign.&lt;br&gt;&lt;br&gt;Only listings added manually by the seller are returned. Returns a null array if no listings were added.
     * @param value Value to set for the itemIds property.
     */
    public void setItemIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.itemIds = value;
    }
    /**
     * Sets the itemSelectMode property value. The mode used to select the items listed in the email campaign. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:ItemSelectModeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the itemSelectMode property.
     */
    public void setItemSelectMode(@jakarta.annotation.Nullable final String value) {
        this.itemSelectMode = value;
    }
    /**
     * Sets the marketplaceId property value. The eBay marketplace where the email campaign is active. See &lt;a href=&quot;/api-docs/sell/marketing/types/ba:MarketplaceIdEnum&quot;&gt;MarketplaceIdEnum&lt;/a&gt; for a list of marketplace IDs.
     * @param value Value to set for the marketplaceId property.
     */
    public void setMarketplaceId(@jakarta.annotation.Nullable final String value) {
        this.marketplaceId = value;
    }
    /**
     * Sets the modificationDate property value. The date and time the email campaign was last modified, given in UTC format.
     * @param value Value to set for the modificationDate property.
     */
    public void setModificationDate(@jakarta.annotation.Nullable final String value) {
        this.modificationDate = value;
    }
    /**
     * Sets the personalizedMessage property value. The body of the email campaign sent to the audience.
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
     * Sets the promotionId property value. The ID of the discount that was assigned to the email campaign.
     * @param value Value to set for the promotionId property.
     */
    public void setPromotionId(@jakarta.annotation.Nullable final String value) {
        this.promotionId = value;
    }
    /**
     * Sets the promotionSelectMode property value. Indicates whether the listings that the discount was applied to were selected manually or automatically.&lt;br&gt;&lt;br&gt;This field will only return if a discount was applied. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:PromotionSelectModeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the promotionSelectMode property.
     */
    public void setPromotionSelectMode(@jakarta.annotation.Nullable final String value) {
        this.promotionSelectMode = value;
    }
    /**
     * Sets the scheduleDate property value. The date and time that the email campaign newsletter is scheduled to send, given in UTC format. This field is only returned if the seller set the start of the email campaign to a date in the future.
     * @param value Value to set for the scheduleDate property.
     */
    public void setScheduleDate(@jakarta.annotation.Nullable final String value) {
        this.scheduleDate = value;
    }
    /**
     * Sets the scheduleDateType property value. The schedule type of the email campaign. See &lt;a href=&quot;/api-docs/sell/marketing/types/api:ScheduleDateTypeEnum&quot;&gt;ScheduleDateTypeEnum&lt;/a&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:ScheduleDateTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the scheduleDateType property.
     */
    public void setScheduleDateType(@jakarta.annotation.Nullable final String value) {
        this.scheduleDateType = value;
    }
    /**
     * Sets the sentDate property value. The date and time that the email campaign was sent, given in UTC format.
     * @param value Value to set for the sentDate property.
     */
    public void setSentDate(@jakarta.annotation.Nullable final String value) {
        this.sentDate = value;
    }
    /**
     * Sets the sort property value. The sort rule is used to display the items in the email campaign. If no sort rule was selected, the default will be &lt;code&gt;NEWLY_LISTED&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:ItemSortEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the sort property.
     */
    public void setSort(@jakarta.annotation.Nullable final String value) {
        this.sort = value;
    }
    /**
     * Sets the subject property value. The email campaign subject.
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.subject = value;
    }
}
