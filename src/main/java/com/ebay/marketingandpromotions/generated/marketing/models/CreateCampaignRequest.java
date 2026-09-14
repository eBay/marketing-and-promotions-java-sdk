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
 * This type defines the fields needed to create a campaign. To create a campaign, you need to specify a name, start and end dates, funding, marketplace, and optionally the criterion (selection rules).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateCampaignRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The allocated daily budget for the Cost Per Click (CPC) Promoted Listings campaign.&lt;br&gt;&lt;br&gt;&lt;i&gt;Required if&lt;/i&gt; the campaign funding model is CPC.
     */
    private CampaignBudgetRequest budget;
    /**
     * This container is used if the seller wishes to create one or more rules for a rules-based campaign. If you populate the &lt;b&gt;campaignCriterion&lt;/b&gt; object in your &lt;b&gt;createCampaign&lt;/b&gt; request, ads for the campaign are created by rule for the listings that meet the criteria you specify, and these ads are associated with the campaign to be created.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Rules-based listing selection is only applicable for general strategy campaigns using the Cost-Per-Sale (CPS) funding model.&lt;/span&gt;
     */
    private CampaignCriterion campaignCriterion;
    /**
     * A seller-defined name for the campaign. This value must be unique for the seller. &lt;p&gt;You can use any alphanumeric characters in the name, except the less than (&amp;lt;) or greater than (&amp;gt;) characters.&lt;/p&gt;&lt;b&gt;Max length:&lt;/b&gt; 80 characters
     */
    private String campaignName;
    /**
     * The targeting type of the campaign. This value indicates whether the campaign is a manual targeting or smart targeting campaign.&lt;br&gt;&lt;br&gt;If not value is specified, this field will default to &lt;code&gt;MANUAL&lt;/code&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This feature is only supported for on-site campaigns that use the Cost Per Click (CPC) funding model.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;MANUAL&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;SMART&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;This field is required and must be set to &lt;/code&gt;SMART&lt;/code&gt; for a Smart Targeting campaign.
     */
    private CampaignTargetingTypeEnum campaignTargetingType;
    /**
     * The channel for the campaign. This value indicates whether the advertising campaign is an Onsite or Offsite.&lt;br&gt;&lt;br&gt;If no value is entered, this field will default to &lt;code&gt;ON_SITE&lt;/code&gt;. Multiple channels are not supported. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;b&gt;Channels&lt;/b&gt; is only applicable for campaigns that use the Cost Per Click (CPC) funding model.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ON_SITE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;OFF_SITE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;This field is required and must be set to &lt;code&gt;OFF_SITE&lt;/code&gt; for a Promoted Offsite campaign.
     */
    private java.util.List<ChannelEnum> channels;
    /**
     * The date and time the campaign ends, in UTC format (&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt;). If this field is omitted, the campaign will have no defined end date, and will not end until the seller makes a decision to end the campaign with an &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-endcampaign&quot;&gt;endCampaign&lt;/a&gt; call, or if they update the campaign at a later time with an end date.
     */
    private String endDate;
    /**
     * This container includes parameters that define an ad campaign funding strategy. The set of seller-configurable parameters depends on the selected &lt;b&gt;fundingModel&lt;/b&gt; value.
     */
    private FundingStrategy fundingStrategy;
    /**
     * The ID of the eBay marketplace where the campaign is hosted. See the &lt;b&gt;MarketplaceIdEnum&lt;/b&gt; type to get the appropriate enumeration value for the listing marketplace.
     */
    private MarketplaceIdEnum marketplaceId;
    /**
     * The date and time the campaign starts, in UTC format (&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt;). For display purposes, convert this time into the local time of the seller.  &lt;p&gt;On the date specified, the service derives the keywords for each listing in the campaign, creates an ad for each listing, and associates each new ad with the campaign. The campaign starts after this process is completed. The amount of time it takes the service to start the campaign depends on the number of listings in the campaign. Call &lt;b&gt;getCampaign&lt;/b&gt; to check the status of the campaign.&lt;/p&gt;
     */
    private String startDate;
    /**
     * Instantiates a new {@link CreateCampaignRequest} and sets the default values.
     */
    public CreateCampaignRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateCampaignRequest}
     */
    @jakarta.annotation.Nonnull
    public static CreateCampaignRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateCampaignRequest();
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
     * Gets the budget property value. The allocated daily budget for the Cost Per Click (CPC) Promoted Listings campaign.&lt;br&gt;&lt;br&gt;&lt;i&gt;Required if&lt;/i&gt; the campaign funding model is CPC.
     * @return a {@link CampaignBudgetRequest}
     */
    @jakarta.annotation.Nullable
    public CampaignBudgetRequest getBudget() {
        return this.budget;
    }
    /**
     * Gets the campaignCriterion property value. This container is used if the seller wishes to create one or more rules for a rules-based campaign. If you populate the &lt;b&gt;campaignCriterion&lt;/b&gt; object in your &lt;b&gt;createCampaign&lt;/b&gt; request, ads for the campaign are created by rule for the listings that meet the criteria you specify, and these ads are associated with the campaign to be created.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Rules-based listing selection is only applicable for general strategy campaigns using the Cost-Per-Sale (CPS) funding model.&lt;/span&gt;
     * @return a {@link CampaignCriterion}
     */
    @jakarta.annotation.Nullable
    public CampaignCriterion getCampaignCriterion() {
        return this.campaignCriterion;
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
     * Gets the campaignTargetingType property value. The targeting type of the campaign. This value indicates whether the campaign is a manual targeting or smart targeting campaign.&lt;br&gt;&lt;br&gt;If not value is specified, this field will default to &lt;code&gt;MANUAL&lt;/code&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This feature is only supported for on-site campaigns that use the Cost Per Click (CPC) funding model.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;MANUAL&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;SMART&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;This field is required and must be set to &lt;/code&gt;SMART&lt;/code&gt; for a Smart Targeting campaign.
     * @return a {@link CampaignTargetingTypeEnum}
     */
    @jakarta.annotation.Nullable
    public CampaignTargetingTypeEnum getCampaignTargetingType() {
        return this.campaignTargetingType;
    }
    /**
     * Gets the channels property value. The channel for the campaign. This value indicates whether the advertising campaign is an Onsite or Offsite.&lt;br&gt;&lt;br&gt;If no value is entered, this field will default to &lt;code&gt;ON_SITE&lt;/code&gt;. Multiple channels are not supported. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;b&gt;Channels&lt;/b&gt; is only applicable for campaigns that use the Cost Per Click (CPC) funding model.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ON_SITE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;OFF_SITE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;This field is required and must be set to &lt;code&gt;OFF_SITE&lt;/code&gt; for a Promoted Offsite campaign.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("budget", (n) -> { this.setBudget(n.getObjectValue(CampaignBudgetRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("campaignCriterion", (n) -> { this.setCampaignCriterion(n.getObjectValue(CampaignCriterion::createFromDiscriminatorValue)); });
        deserializerMap.put("campaignName", (n) -> { this.setCampaignName(n.getStringValue()); });
        deserializerMap.put("campaignTargetingType", (n) -> { this.setCampaignTargetingType(n.getEnumValue(CampaignTargetingTypeEnum::forValue)); });
        deserializerMap.put("channels", (n) -> { this.setChannels(n.getCollectionOfEnumValues(ChannelEnum::forValue)); });
        deserializerMap.put("endDate", (n) -> { this.setEndDate(n.getStringValue()); });
        deserializerMap.put("fundingStrategy", (n) -> { this.setFundingStrategy(n.getObjectValue(FundingStrategy::createFromDiscriminatorValue)); });
        deserializerMap.put("marketplaceId", (n) -> { this.setMarketplaceId(n.getEnumValue(MarketplaceIdEnum::forValue)); });
        deserializerMap.put("startDate", (n) -> { this.setStartDate(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fundingStrategy property value. This container includes parameters that define an ad campaign funding strategy. The set of seller-configurable parameters depends on the selected &lt;b&gt;fundingModel&lt;/b&gt; value.
     * @return a {@link FundingStrategy}
     */
    @jakarta.annotation.Nullable
    public FundingStrategy getFundingStrategy() {
        return this.fundingStrategy;
    }
    /**
     * Gets the marketplaceId property value. The ID of the eBay marketplace where the campaign is hosted. See the &lt;b&gt;MarketplaceIdEnum&lt;/b&gt; type to get the appropriate enumeration value for the listing marketplace.
     * @return a {@link MarketplaceIdEnum}
     */
    @jakarta.annotation.Nullable
    public MarketplaceIdEnum getMarketplaceId() {
        return this.marketplaceId;
    }
    /**
     * Gets the startDate property value. The date and time the campaign starts, in UTC format (&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt;). For display purposes, convert this time into the local time of the seller.  &lt;p&gt;On the date specified, the service derives the keywords for each listing in the campaign, creates an ad for each listing, and associates each new ad with the campaign. The campaign starts after this process is completed. The amount of time it takes the service to start the campaign depends on the number of listings in the campaign. Call &lt;b&gt;getCampaign&lt;/b&gt; to check the status of the campaign.&lt;/p&gt;
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
        writer.writeObjectValue("budget", this.getBudget());
        writer.writeObjectValue("campaignCriterion", this.getCampaignCriterion());
        writer.writeStringValue("campaignName", this.getCampaignName());
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
     * Sets the budget property value. The allocated daily budget for the Cost Per Click (CPC) Promoted Listings campaign.&lt;br&gt;&lt;br&gt;&lt;i&gt;Required if&lt;/i&gt; the campaign funding model is CPC.
     * @param value Value to set for the budget property.
     */
    public void setBudget(@jakarta.annotation.Nullable final CampaignBudgetRequest value) {
        this.budget = value;
    }
    /**
     * Sets the campaignCriterion property value. This container is used if the seller wishes to create one or more rules for a rules-based campaign. If you populate the &lt;b&gt;campaignCriterion&lt;/b&gt; object in your &lt;b&gt;createCampaign&lt;/b&gt; request, ads for the campaign are created by rule for the listings that meet the criteria you specify, and these ads are associated with the campaign to be created.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Rules-based listing selection is only applicable for general strategy campaigns using the Cost-Per-Sale (CPS) funding model.&lt;/span&gt;
     * @param value Value to set for the campaignCriterion property.
     */
    public void setCampaignCriterion(@jakarta.annotation.Nullable final CampaignCriterion value) {
        this.campaignCriterion = value;
    }
    /**
     * Sets the campaignName property value. A seller-defined name for the campaign. This value must be unique for the seller. &lt;p&gt;You can use any alphanumeric characters in the name, except the less than (&amp;lt;) or greater than (&amp;gt;) characters.&lt;/p&gt;&lt;b&gt;Max length:&lt;/b&gt; 80 characters
     * @param value Value to set for the campaignName property.
     */
    public void setCampaignName(@jakarta.annotation.Nullable final String value) {
        this.campaignName = value;
    }
    /**
     * Sets the campaignTargetingType property value. The targeting type of the campaign. This value indicates whether the campaign is a manual targeting or smart targeting campaign.&lt;br&gt;&lt;br&gt;If not value is specified, this field will default to &lt;code&gt;MANUAL&lt;/code&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This feature is only supported for on-site campaigns that use the Cost Per Click (CPC) funding model.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;MANUAL&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;SMART&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;This field is required and must be set to &lt;/code&gt;SMART&lt;/code&gt; for a Smart Targeting campaign.
     * @param value Value to set for the campaignTargetingType property.
     */
    public void setCampaignTargetingType(@jakarta.annotation.Nullable final CampaignTargetingTypeEnum value) {
        this.campaignTargetingType = value;
    }
    /**
     * Sets the channels property value. The channel for the campaign. This value indicates whether the advertising campaign is an Onsite or Offsite.&lt;br&gt;&lt;br&gt;If no value is entered, this field will default to &lt;code&gt;ON_SITE&lt;/code&gt;. Multiple channels are not supported. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;b&gt;Channels&lt;/b&gt; is only applicable for campaigns that use the Cost Per Click (CPC) funding model.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ON_SITE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;OFF_SITE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;This field is required and must be set to &lt;code&gt;OFF_SITE&lt;/code&gt; for a Promoted Offsite campaign.
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
     * Sets the fundingStrategy property value. This container includes parameters that define an ad campaign funding strategy. The set of seller-configurable parameters depends on the selected &lt;b&gt;fundingModel&lt;/b&gt; value.
     * @param value Value to set for the fundingStrategy property.
     */
    public void setFundingStrategy(@jakarta.annotation.Nullable final FundingStrategy value) {
        this.fundingStrategy = value;
    }
    /**
     * Sets the marketplaceId property value. The ID of the eBay marketplace where the campaign is hosted. See the &lt;b&gt;MarketplaceIdEnum&lt;/b&gt; type to get the appropriate enumeration value for the listing marketplace.
     * @param value Value to set for the marketplaceId property.
     */
    public void setMarketplaceId(@jakarta.annotation.Nullable final MarketplaceIdEnum value) {
        this.marketplaceId = value;
    }
    /**
     * Sets the startDate property value. The date and time the campaign starts, in UTC format (&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt;). For display purposes, convert this time into the local time of the seller.  &lt;p&gt;On the date specified, the service derives the keywords for each listing in the campaign, creates an ad for each listing, and associates each new ad with the campaign. The campaign starts after this process is completed. The amount of time it takes the service to start the campaign depends on the number of listings in the campaign. Call &lt;b&gt;getCampaign&lt;/b&gt; to check the status of the campaign.&lt;/p&gt;
     * @param value Value to set for the startDate property.
     */
    public void setStartDate(@jakarta.annotation.Nullable final String value) {
        this.startDate = value;
    }
}
