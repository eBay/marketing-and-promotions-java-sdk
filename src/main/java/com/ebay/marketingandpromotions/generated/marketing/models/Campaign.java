// Copyright 2026 eBay Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the fields that describe an ad campaign.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Campaign implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array contains alert messages for the campaign.
     */
    private java.util.List<Alert> alerts;
    /**
     * The allocated budget for the Cost Per Click (CPC) Promoted Listings campaign.&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field will only be returned for campaigns using the CPC funding model; it does not apply to the Cost Per Sale (CPS) funding model.&lt;/span&gt;
     */
    private CampaignBudget budget;
    /**
     * The selection rules (criterion) used to select the listings for a campaign. If you populate the &lt;b&gt;campaignCriterion&lt;/b&gt; object in your &lt;b&gt;createCampaign&lt;/b&gt; request, ads for the campaign are created by rule for the listings that meet the criteria you specify, and these ads are associated with the campaign.&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This container is only returned for rules-based campaigns using the Cost Per Sale (CPS) funding model.&lt;/span&gt;
     */
    private CampaignCriterion campaignCriterion;
    /**
     * A unique eBay-assigned ID for a campaign. This ID is generated when a campaign is created.
     */
    private String campaignId;
    /**
     * A seller-defined name for the campaign. This value must be unique for the seller. &lt;p&gt;You can use any alphanumeric characters in the name, except the less than (&amp;lt;) or greater than (&amp;gt;) characters.&lt;/p&gt;&lt;b&gt;Max length:&lt;/b&gt; 80 characters
     */
    private String campaignName;
    /**
     * Indicates the status of the campaign, such as &lt;code&gt;RUNNING&lt;/code&gt;, &lt;code&gt;PAUSED&lt;/code&gt;, and &lt;code&gt;ENDED&lt;/code&gt;.
     */
    private CampaignStatusEnum campaignStatus;
    /**
     * The targeting type of the campaign. This value indicates whether the campaign is a manual targeting or smart targeting ad campaign.
     */
    private CampaignTargetingTypeEnum campaignTargetingType;
    /**
     * The channel for the campaign. This value indicates whether the campaign is an Onsite or Offsite advertising campaign. &lt;br&gt;&lt;br&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ON_SITE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;OFF_SITE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     */
    private java.util.List<ChannelEnum> channels;
    /**
     * The date and time the campaign ends, in UTC format (&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt;). If this field is omitted, the campaign will have no defined end date, and will not end until the seller makes a decision to end the campaign with an &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-endcampaign&quot;&gt;endCampaign&lt;/a&gt; call, or if they update the campaign at a later time with an end date.
     */
    private String endDate;
    /**
     * This container includes parameters that define an ad campaign funding strategy. The set of seller-configurable parameters depends on the selected &lt;b&gt;fundingModel&lt;/b&gt; value.&lt;br/&gt;&lt;br/&gt;Currently, the supported funding models are &lt;code&gt;COST_PER_SALE&lt;/code&gt; (CPS) and &lt;code&gt;COST_PER_CLICK&lt;/code&gt; (CPC). For onsite ads, the CPC model supports two bidding strategies: &lt;code&gt;FIXED&lt;/code&gt; and &lt;code&gt;DYNAMIC&lt;/code&gt;.
     */
    private FundingStrategy fundingStrategy;
    /**
     * The ID of the eBay marketplace where the campaign is hosted.
     */
    private MarketplaceIdEnum marketplaceId;
    /**
     * The date and time the campaign starts, in UTC format (&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt;). For display purposes, convert this time into the local time of the seller.  &lt;p&gt;On the date specified, the service derives the keywords for each listing in the campaign, creates an ad for each listing, and associates each new ad with the campaign. The campaign starts after this process is completed. The amount of time it takes the service to start the campaign depends on the number of listings in the campaign. Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaign&quot;&gt;getCampaign&lt;/a&gt; to check the status of the campaign.&lt;/p&gt;
     */
    private String startDate;
    /**
     * Instantiates a new {@link Campaign} and sets the default values.
     */
    public Campaign() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Campaign}
     */
    @jakarta.annotation.Nonnull
    public static Campaign createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Campaign();
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
     * Gets the alerts property value. This array contains alert messages for the campaign.
     * @return a {@link java.util.List<Alert>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Alert> getAlerts() {
        return this.alerts;
    }
    /**
     * Gets the budget property value. The allocated budget for the Cost Per Click (CPC) Promoted Listings campaign.&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field will only be returned for campaigns using the CPC funding model; it does not apply to the Cost Per Sale (CPS) funding model.&lt;/span&gt;
     * @return a {@link CampaignBudget}
     */
    @jakarta.annotation.Nullable
    public CampaignBudget getBudget() {
        return this.budget;
    }
    /**
     * Gets the campaignCriterion property value. The selection rules (criterion) used to select the listings for a campaign. If you populate the &lt;b&gt;campaignCriterion&lt;/b&gt; object in your &lt;b&gt;createCampaign&lt;/b&gt; request, ads for the campaign are created by rule for the listings that meet the criteria you specify, and these ads are associated with the campaign.&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This container is only returned for rules-based campaigns using the Cost Per Sale (CPS) funding model.&lt;/span&gt;
     * @return a {@link CampaignCriterion}
     */
    @jakarta.annotation.Nullable
    public CampaignCriterion getCampaignCriterion() {
        return this.campaignCriterion;
    }
    /**
     * Gets the campaignId property value. A unique eBay-assigned ID for a campaign. This ID is generated when a campaign is created.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCampaignId() {
        return this.campaignId;
    }
    /**
     * Gets the campaignName property value. A seller-defined name for the campaign. This value must be unique for the seller. &lt;p&gt;You can use any alphanumeric characters in the name, except the less than (&amp;lt;) or greater than (&amp;gt;) characters.&lt;/p&gt;&lt;b&gt;Max length:&lt;/b&gt; 80 characters
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCampaignName() {
        return this.campaignName;
    }
    /**
     * Gets the campaignStatus property value. Indicates the status of the campaign, such as &lt;code&gt;RUNNING&lt;/code&gt;, &lt;code&gt;PAUSED&lt;/code&gt;, and &lt;code&gt;ENDED&lt;/code&gt;.
     * @return a {@link CampaignStatusEnum}
     */
    @jakarta.annotation.Nullable
    public CampaignStatusEnum getCampaignStatus() {
        return this.campaignStatus;
    }
    /**
     * Gets the campaignTargetingType property value. The targeting type of the campaign. This value indicates whether the campaign is a manual targeting or smart targeting ad campaign.
     * @return a {@link CampaignTargetingTypeEnum}
     */
    @jakarta.annotation.Nullable
    public CampaignTargetingTypeEnum getCampaignTargetingType() {
        return this.campaignTargetingType;
    }
    /**
     * Gets the channels property value. The channel for the campaign. This value indicates whether the campaign is an Onsite or Offsite advertising campaign. &lt;br&gt;&lt;br&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ON_SITE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;OFF_SITE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link java.util.List<ChannelEnum>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ChannelEnum> getChannels() {
        return this.channels;
    }
    /**
     * Gets the endDate property value. The date and time the campaign ends, in UTC format (&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt;). If this field is omitted, the campaign will have no defined end date, and will not end until the seller makes a decision to end the campaign with an &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-endcampaign&quot;&gt;endCampaign&lt;/a&gt; call, or if they update the campaign at a later time with an end date.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEndDate() {
        return this.endDate;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("alerts", (n) -> { this.setAlerts(n.getCollectionOfObjectValues(Alert::createFromDiscriminatorValue)); });
        deserializerMap.put("budget", (n) -> { this.setBudget(n.getObjectValue(CampaignBudget::createFromDiscriminatorValue)); });
        deserializerMap.put("campaignCriterion", (n) -> { this.setCampaignCriterion(n.getObjectValue(CampaignCriterion::createFromDiscriminatorValue)); });
        deserializerMap.put("campaignId", (n) -> { this.setCampaignId(n.getStringValue()); });
        deserializerMap.put("campaignName", (n) -> { this.setCampaignName(n.getStringValue()); });
        deserializerMap.put("campaignStatus", (n) -> { this.setCampaignStatus(n.getEnumValue(CampaignStatusEnum::forValue)); });
        deserializerMap.put("campaignTargetingType", (n) -> { this.setCampaignTargetingType(n.getEnumValue(CampaignTargetingTypeEnum::forValue)); });
        deserializerMap.put("channels", (n) -> { this.setChannels(n.getCollectionOfEnumValues(ChannelEnum::forValue)); });
        deserializerMap.put("endDate", (n) -> { this.setEndDate(n.getStringValue()); });
        deserializerMap.put("fundingStrategy", (n) -> { this.setFundingStrategy(n.getObjectValue(FundingStrategy::createFromDiscriminatorValue)); });
        deserializerMap.put("marketplaceId", (n) -> { this.setMarketplaceId(n.getEnumValue(MarketplaceIdEnum::forValue)); });
        deserializerMap.put("startDate", (n) -> { this.setStartDate(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fundingStrategy property value. This container includes parameters that define an ad campaign funding strategy. The set of seller-configurable parameters depends on the selected &lt;b&gt;fundingModel&lt;/b&gt; value.&lt;br/&gt;&lt;br/&gt;Currently, the supported funding models are &lt;code&gt;COST_PER_SALE&lt;/code&gt; (CPS) and &lt;code&gt;COST_PER_CLICK&lt;/code&gt; (CPC). For onsite ads, the CPC model supports two bidding strategies: &lt;code&gt;FIXED&lt;/code&gt; and &lt;code&gt;DYNAMIC&lt;/code&gt;.
     * @return a {@link FundingStrategy}
     */
    @jakarta.annotation.Nullable
    public FundingStrategy getFundingStrategy() {
        return this.fundingStrategy;
    }
    /**
     * Gets the marketplaceId property value. The ID of the eBay marketplace where the campaign is hosted.
     * @return a {@link MarketplaceIdEnum}
     */
    @jakarta.annotation.Nullable
    public MarketplaceIdEnum getMarketplaceId() {
        return this.marketplaceId;
    }
    /**
     * Gets the startDate property value. The date and time the campaign starts, in UTC format (&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt;). For display purposes, convert this time into the local time of the seller.  &lt;p&gt;On the date specified, the service derives the keywords for each listing in the campaign, creates an ad for each listing, and associates each new ad with the campaign. The campaign starts after this process is completed. The amount of time it takes the service to start the campaign depends on the number of listings in the campaign. Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaign&quot;&gt;getCampaign&lt;/a&gt; to check the status of the campaign.&lt;/p&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStartDate() {
        return this.startDate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("alerts", this.getAlerts());
        writer.writeObjectValue("budget", this.getBudget());
        writer.writeObjectValue("campaignCriterion", this.getCampaignCriterion());
        writer.writeStringValue("campaignId", this.getCampaignId());
        writer.writeStringValue("campaignName", this.getCampaignName());
        writer.writeEnumValue("campaignStatus", this.getCampaignStatus());
        writer.writeEnumValue("campaignTargetingType", this.getCampaignTargetingType());
        writer.writeCollectionOfEnumValues("channels", this.getChannels());
        writer.writeStringValue("endDate", this.getEndDate());
        writer.writeObjectValue("fundingStrategy", this.getFundingStrategy());
        writer.writeEnumValue("marketplaceId", this.getMarketplaceId());
        writer.writeStringValue("startDate", this.getStartDate());
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
     * Sets the alerts property value. This array contains alert messages for the campaign.
     * @param value Value to set for the alerts property.
     */
    public void setAlerts(@jakarta.annotation.Nullable final java.util.List<Alert> value) {
        this.alerts = value;
    }
    /**
     * Sets the budget property value. The allocated budget for the Cost Per Click (CPC) Promoted Listings campaign.&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field will only be returned for campaigns using the CPC funding model; it does not apply to the Cost Per Sale (CPS) funding model.&lt;/span&gt;
     * @param value Value to set for the budget property.
     */
    public void setBudget(@jakarta.annotation.Nullable final CampaignBudget value) {
        this.budget = value;
    }
    /**
     * Sets the campaignCriterion property value. The selection rules (criterion) used to select the listings for a campaign. If you populate the &lt;b&gt;campaignCriterion&lt;/b&gt; object in your &lt;b&gt;createCampaign&lt;/b&gt; request, ads for the campaign are created by rule for the listings that meet the criteria you specify, and these ads are associated with the campaign.&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This container is only returned for rules-based campaigns using the Cost Per Sale (CPS) funding model.&lt;/span&gt;
     * @param value Value to set for the campaignCriterion property.
     */
    public void setCampaignCriterion(@jakarta.annotation.Nullable final CampaignCriterion value) {
        this.campaignCriterion = value;
    }
    /**
     * Sets the campaignId property value. A unique eBay-assigned ID for a campaign. This ID is generated when a campaign is created.
     * @param value Value to set for the campaignId property.
     */
    public void setCampaignId(@jakarta.annotation.Nullable final String value) {
        this.campaignId = value;
    }
    /**
     * Sets the campaignName property value. A seller-defined name for the campaign. This value must be unique for the seller. &lt;p&gt;You can use any alphanumeric characters in the name, except the less than (&amp;lt;) or greater than (&amp;gt;) characters.&lt;/p&gt;&lt;b&gt;Max length:&lt;/b&gt; 80 characters
     * @param value Value to set for the campaignName property.
     */
    public void setCampaignName(@jakarta.annotation.Nullable final String value) {
        this.campaignName = value;
    }
    /**
     * Sets the campaignStatus property value. Indicates the status of the campaign, such as &lt;code&gt;RUNNING&lt;/code&gt;, &lt;code&gt;PAUSED&lt;/code&gt;, and &lt;code&gt;ENDED&lt;/code&gt;.
     * @param value Value to set for the campaignStatus property.
     */
    public void setCampaignStatus(@jakarta.annotation.Nullable final CampaignStatusEnum value) {
        this.campaignStatus = value;
    }
    /**
     * Sets the campaignTargetingType property value. The targeting type of the campaign. This value indicates whether the campaign is a manual targeting or smart targeting ad campaign.
     * @param value Value to set for the campaignTargetingType property.
     */
    public void setCampaignTargetingType(@jakarta.annotation.Nullable final CampaignTargetingTypeEnum value) {
        this.campaignTargetingType = value;
    }
    /**
     * Sets the channels property value. The channel for the campaign. This value indicates whether the campaign is an Onsite or Offsite advertising campaign. &lt;br&gt;&lt;br&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ON_SITE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;OFF_SITE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the channels property.
     */
    public void setChannels(@jakarta.annotation.Nullable final java.util.List<ChannelEnum> value) {
        this.channels = value;
    }
    /**
     * Sets the endDate property value. The date and time the campaign ends, in UTC format (&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt;). If this field is omitted, the campaign will have no defined end date, and will not end until the seller makes a decision to end the campaign with an &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-endcampaign&quot;&gt;endCampaign&lt;/a&gt; call, or if they update the campaign at a later time with an end date.
     * @param value Value to set for the endDate property.
     */
    public void setEndDate(@jakarta.annotation.Nullable final String value) {
        this.endDate = value;
    }
    /**
     * Sets the fundingStrategy property value. This container includes parameters that define an ad campaign funding strategy. The set of seller-configurable parameters depends on the selected &lt;b&gt;fundingModel&lt;/b&gt; value.&lt;br/&gt;&lt;br/&gt;Currently, the supported funding models are &lt;code&gt;COST_PER_SALE&lt;/code&gt; (CPS) and &lt;code&gt;COST_PER_CLICK&lt;/code&gt; (CPC). For onsite ads, the CPC model supports two bidding strategies: &lt;code&gt;FIXED&lt;/code&gt; and &lt;code&gt;DYNAMIC&lt;/code&gt;.
     * @param value Value to set for the fundingStrategy property.
     */
    public void setFundingStrategy(@jakarta.annotation.Nullable final FundingStrategy value) {
        this.fundingStrategy = value;
    }
    /**
     * Sets the marketplaceId property value. The ID of the eBay marketplace where the campaign is hosted.
     * @param value Value to set for the marketplaceId property.
     */
    public void setMarketplaceId(@jakarta.annotation.Nullable final MarketplaceIdEnum value) {
        this.marketplaceId = value;
    }
    /**
     * Sets the startDate property value. The date and time the campaign starts, in UTC format (&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt;). For display purposes, convert this time into the local time of the seller.  &lt;p&gt;On the date specified, the service derives the keywords for each listing in the campaign, creates an ad for each listing, and associates each new ad with the campaign. The campaign starts after this process is completed. The amount of time it takes the service to start the campaign depends on the number of listings in the campaign. Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaign&quot;&gt;getCampaign&lt;/a&gt; to check the status of the campaign.&lt;/p&gt;
     * @param value Value to set for the startDate property.
     */
    public void setStartDate(@jakarta.annotation.Nullable final String value) {
        this.startDate = value;
    }
}
