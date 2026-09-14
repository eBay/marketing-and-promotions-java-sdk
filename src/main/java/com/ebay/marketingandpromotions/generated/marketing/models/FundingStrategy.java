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
 * This type defines how the Promoted Listings fee is calculated for a Promoted Listings ad campaign.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FundingStrategy implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field is used to set the ad rate strategy for a Cost Per Sale (CPS) campaign.&lt;br&gt;&lt;br&gt;The default value for this field is &lt;code&gt;FIXED&lt;/code&gt;. If this field is omitted, the default value will be used.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is not applicable for Cost Per Click (CPC) or offsite campaigns.&lt;/span&gt;
     */
    private AdRateStrategyEnum adRateStrategy;
    /**
     * Indicates the bidding strategy for an onsite Cost Per Click (CPC) campaign that uses manual targeting.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is not applicable for smart targeting campaigns.&lt;/span&gt;&lt;br&gt;Valid values are:&lt;ul&gt;&lt;li&gt;&lt;code&gt;FIXED&lt;/code&gt;&lt;br&gt;&lt;br&gt;When using a fixed bidding strategy, sellers manually assign and adjust keyword bids for the CPC campaign.&lt;/li&gt;&lt;li&gt;&lt;code&gt;DYNAMIC&lt;/code&gt;&lt;br&gt;&lt;br&gt;When using a dynamic bidding strategy, eBay manages the campaign&apos;s keyword bids and automatically updates them daily to the suggested bid.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For a CPC campaign using dynamic bidding, sellers can continue to manually add keywords for the campaign, but they are no longer able to manually adjust their associated bid values. In order to manually adjust bid values, sellers must use the &lt;code&gt;FIXED&lt;/code&gt; bidding strategy.&lt;/span&gt;&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;b&gt;Default value:&lt;/b&gt; FIXED
     */
    private BiddingStrategyEnum biddingStrategy;
    /**
     * The user-defined &lt;b&gt;bid percentage&lt;/b&gt; (also known as the &lt;i&gt;ad rate&lt;/i&gt;) sets the level that eBay increases the visibility in search results for the associated listing. The higher the &lt;b&gt;bidPercentage&lt;/b&gt; value, the more eBay promotes the listing.  &lt;br&gt;&lt;br&gt;The value specified here is also used to calculate the Promoted Listings fee. This percentage value is multiplied by the final sales price to determine the fee. &lt;br&gt;&lt;br&gt;The Promoted Listings fee is determined at the time the transaction completes and the seller is assessed the fee only when an item sells through a Promoted Listings ad campaign. &lt;br&gt;&lt;br&gt;The &lt;b&gt;bidPercentage&lt;/b&gt; is a single precision value that is guided by the following rules: &lt;ul&gt;&lt;li&gt;These values are &lt;b&gt;valid&lt;/b&gt;:&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;4.1&lt;/code&gt;, &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;5.0&lt;/code&gt;, &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;5.5&lt;/code&gt;, ...&lt;/li&gt;  &lt;li&gt;These values are &lt;b&gt;not valid&lt;/b&gt;:&lt;br /&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;0.01&lt;/code&gt;, &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;10.75&lt;/code&gt;, &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;99.99&lt;/code&gt;,&lt;br /&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;and so on.&lt;/li&gt;&lt;/ul&gt;This is the default bid percentage for the campaigns using the Cost Per Sale (CPS) funding model, and this value will be overridden by any ads in the campaign that have their own set bid percentages.&lt;br /&gt;&lt;br /&gt;If a bid percentage is not provided for an ad, eBay uses the default bid percentage of the associated campaign.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;This field is only relevant for campaigns that use the CPS funding model and a fixed ad rate. It is not used for campaigns that use the Cost Per Click (CPC) funding model and should not be provided when the selected adRateStrategy for the campaign is dynamic.&lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field has a minimum value of &lt;code&gt;2.0&lt;/code&gt; and a maximum value of &lt;code&gt;100.0&lt;/code&gt;.&lt;/span&gt;
     */
    private String bidPercentage;
    /**
     * This container indicates the bidding preferences of the campaign, such as the maximum CPC amount.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This container is only applicable for smart targeting campaigns.&lt;/span&gt;&lt;br&gt;This container is required if the user wants to create a Smart Targeting campaign.
     */
    private java.util.List<BidPreference> bidPreferences;
    /**
     * A field that indicates whether a single, user-defined bid percentage (also known as the &lt;i&gt;ad rate&lt;/i&gt;) should be used, or whether eBay should automatically adjust listings to maintain the daily suggested bid percentage.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; Dynamic adjustment is only applicable when the &lt;b&gt;adRateStrategy&lt;/b&gt; is set to &lt;code&gt;DYNAMIC&lt;/code&gt; This field is not applicable for offsite campaigns.&lt;/span&gt;&lt;br /&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;FIXED&lt;/code&gt;
     */
    private java.util.List<DynamicAdRatePreference> dynamicAdRatePreferences;
    /**
     * Indicates the model that eBay uses to calculate the Promoted Listings fee. &lt;p&gt;For a description of the funding model types, refer to &lt;b&gt;FundingModelTypeEnum&lt;/b&gt;.
     */
    private FundingModelEnum fundingModel;
    /**
     * Instantiates a new {@link FundingStrategy} and sets the default values.
     */
    public FundingStrategy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FundingStrategy}
     */
    @jakarta.annotation.Nonnull
    public static FundingStrategy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FundingStrategy();
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
     * Gets the adRateStrategy property value. This field is used to set the ad rate strategy for a Cost Per Sale (CPS) campaign.&lt;br&gt;&lt;br&gt;The default value for this field is &lt;code&gt;FIXED&lt;/code&gt;. If this field is omitted, the default value will be used.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is not applicable for Cost Per Click (CPC) or offsite campaigns.&lt;/span&gt;
     * @return a {@link AdRateStrategyEnum}
     */
    @jakarta.annotation.Nullable
    public AdRateStrategyEnum getAdRateStrategy() {
        return this.adRateStrategy;
    }
    /**
     * Gets the biddingStrategy property value. Indicates the bidding strategy for an onsite Cost Per Click (CPC) campaign that uses manual targeting.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is not applicable for smart targeting campaigns.&lt;/span&gt;&lt;br&gt;Valid values are:&lt;ul&gt;&lt;li&gt;&lt;code&gt;FIXED&lt;/code&gt;&lt;br&gt;&lt;br&gt;When using a fixed bidding strategy, sellers manually assign and adjust keyword bids for the CPC campaign.&lt;/li&gt;&lt;li&gt;&lt;code&gt;DYNAMIC&lt;/code&gt;&lt;br&gt;&lt;br&gt;When using a dynamic bidding strategy, eBay manages the campaign&apos;s keyword bids and automatically updates them daily to the suggested bid.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For a CPC campaign using dynamic bidding, sellers can continue to manually add keywords for the campaign, but they are no longer able to manually adjust their associated bid values. In order to manually adjust bid values, sellers must use the &lt;code&gt;FIXED&lt;/code&gt; bidding strategy.&lt;/span&gt;&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;b&gt;Default value:&lt;/b&gt; FIXED
     * @return a {@link BiddingStrategyEnum}
     */
    @jakarta.annotation.Nullable
    public BiddingStrategyEnum getBiddingStrategy() {
        return this.biddingStrategy;
    }
    /**
     * Gets the bidPercentage property value. The user-defined &lt;b&gt;bid percentage&lt;/b&gt; (also known as the &lt;i&gt;ad rate&lt;/i&gt;) sets the level that eBay increases the visibility in search results for the associated listing. The higher the &lt;b&gt;bidPercentage&lt;/b&gt; value, the more eBay promotes the listing.  &lt;br&gt;&lt;br&gt;The value specified here is also used to calculate the Promoted Listings fee. This percentage value is multiplied by the final sales price to determine the fee. &lt;br&gt;&lt;br&gt;The Promoted Listings fee is determined at the time the transaction completes and the seller is assessed the fee only when an item sells through a Promoted Listings ad campaign. &lt;br&gt;&lt;br&gt;The &lt;b&gt;bidPercentage&lt;/b&gt; is a single precision value that is guided by the following rules: &lt;ul&gt;&lt;li&gt;These values are &lt;b&gt;valid&lt;/b&gt;:&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;4.1&lt;/code&gt;, &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;5.0&lt;/code&gt;, &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;5.5&lt;/code&gt;, ...&lt;/li&gt;  &lt;li&gt;These values are &lt;b&gt;not valid&lt;/b&gt;:&lt;br /&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;0.01&lt;/code&gt;, &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;10.75&lt;/code&gt;, &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;99.99&lt;/code&gt;,&lt;br /&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;and so on.&lt;/li&gt;&lt;/ul&gt;This is the default bid percentage for the campaigns using the Cost Per Sale (CPS) funding model, and this value will be overridden by any ads in the campaign that have their own set bid percentages.&lt;br /&gt;&lt;br /&gt;If a bid percentage is not provided for an ad, eBay uses the default bid percentage of the associated campaign.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;This field is only relevant for campaigns that use the CPS funding model and a fixed ad rate. It is not used for campaigns that use the Cost Per Click (CPC) funding model and should not be provided when the selected adRateStrategy for the campaign is dynamic.&lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field has a minimum value of &lt;code&gt;2.0&lt;/code&gt; and a maximum value of &lt;code&gt;100.0&lt;/code&gt;.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBidPercentage() {
        return this.bidPercentage;
    }
    /**
     * Gets the bidPreferences property value. This container indicates the bidding preferences of the campaign, such as the maximum CPC amount.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This container is only applicable for smart targeting campaigns.&lt;/span&gt;&lt;br&gt;This container is required if the user wants to create a Smart Targeting campaign.
     * @return a {@link java.util.List<BidPreference>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<BidPreference> getBidPreferences() {
        return this.bidPreferences;
    }
    /**
     * Gets the dynamicAdRatePreferences property value. A field that indicates whether a single, user-defined bid percentage (also known as the &lt;i&gt;ad rate&lt;/i&gt;) should be used, or whether eBay should automatically adjust listings to maintain the daily suggested bid percentage.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; Dynamic adjustment is only applicable when the &lt;b&gt;adRateStrategy&lt;/b&gt; is set to &lt;code&gt;DYNAMIC&lt;/code&gt; This field is not applicable for offsite campaigns.&lt;/span&gt;&lt;br /&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;FIXED&lt;/code&gt;
     * @return a {@link java.util.List<DynamicAdRatePreference>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DynamicAdRatePreference> getDynamicAdRatePreferences() {
        return this.dynamicAdRatePreferences;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("adRateStrategy", (n) -> { this.setAdRateStrategy(n.getEnumValue(AdRateStrategyEnum::forValue)); });
        deserializerMap.put("biddingStrategy", (n) -> { this.setBiddingStrategy(n.getEnumValue(BiddingStrategyEnum::forValue)); });
        deserializerMap.put("bidPercentage", (n) -> { this.setBidPercentage(n.getStringValue()); });
        deserializerMap.put("bidPreferences", (n) -> { this.setBidPreferences(n.getCollectionOfObjectValues(BidPreference::createFromDiscriminatorValue)); });
        deserializerMap.put("dynamicAdRatePreferences", (n) -> { this.setDynamicAdRatePreferences(n.getCollectionOfObjectValues(DynamicAdRatePreference::createFromDiscriminatorValue)); });
        deserializerMap.put("fundingModel", (n) -> { this.setFundingModel(n.getEnumValue(FundingModelEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fundingModel property value. Indicates the model that eBay uses to calculate the Promoted Listings fee. &lt;p&gt;For a description of the funding model types, refer to &lt;b&gt;FundingModelTypeEnum&lt;/b&gt;.
     * @return a {@link FundingModelEnum}
     */
    @jakarta.annotation.Nullable
    public FundingModelEnum getFundingModel() {
        return this.fundingModel;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("adRateStrategy", this.getAdRateStrategy());
        writer.writeEnumValue("biddingStrategy", this.getBiddingStrategy());
        writer.writeStringValue("bidPercentage", this.getBidPercentage());
        writer.writeCollectionOfObjectValues("bidPreferences", this.getBidPreferences());
        writer.writeCollectionOfObjectValues("dynamicAdRatePreferences", this.getDynamicAdRatePreferences());
        writer.writeEnumValue("fundingModel", this.getFundingModel());
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
     * Sets the adRateStrategy property value. This field is used to set the ad rate strategy for a Cost Per Sale (CPS) campaign.&lt;br&gt;&lt;br&gt;The default value for this field is &lt;code&gt;FIXED&lt;/code&gt;. If this field is omitted, the default value will be used.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is not applicable for Cost Per Click (CPC) or offsite campaigns.&lt;/span&gt;
     * @param value Value to set for the adRateStrategy property.
     */
    public void setAdRateStrategy(@jakarta.annotation.Nullable final AdRateStrategyEnum value) {
        this.adRateStrategy = value;
    }
    /**
     * Sets the biddingStrategy property value. Indicates the bidding strategy for an onsite Cost Per Click (CPC) campaign that uses manual targeting.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is not applicable for smart targeting campaigns.&lt;/span&gt;&lt;br&gt;Valid values are:&lt;ul&gt;&lt;li&gt;&lt;code&gt;FIXED&lt;/code&gt;&lt;br&gt;&lt;br&gt;When using a fixed bidding strategy, sellers manually assign and adjust keyword bids for the CPC campaign.&lt;/li&gt;&lt;li&gt;&lt;code&gt;DYNAMIC&lt;/code&gt;&lt;br&gt;&lt;br&gt;When using a dynamic bidding strategy, eBay manages the campaign&apos;s keyword bids and automatically updates them daily to the suggested bid.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For a CPC campaign using dynamic bidding, sellers can continue to manually add keywords for the campaign, but they are no longer able to manually adjust their associated bid values. In order to manually adjust bid values, sellers must use the &lt;code&gt;FIXED&lt;/code&gt; bidding strategy.&lt;/span&gt;&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;b&gt;Default value:&lt;/b&gt; FIXED
     * @param value Value to set for the biddingStrategy property.
     */
    public void setBiddingStrategy(@jakarta.annotation.Nullable final BiddingStrategyEnum value) {
        this.biddingStrategy = value;
    }
    /**
     * Sets the bidPercentage property value. The user-defined &lt;b&gt;bid percentage&lt;/b&gt; (also known as the &lt;i&gt;ad rate&lt;/i&gt;) sets the level that eBay increases the visibility in search results for the associated listing. The higher the &lt;b&gt;bidPercentage&lt;/b&gt; value, the more eBay promotes the listing.  &lt;br&gt;&lt;br&gt;The value specified here is also used to calculate the Promoted Listings fee. This percentage value is multiplied by the final sales price to determine the fee. &lt;br&gt;&lt;br&gt;The Promoted Listings fee is determined at the time the transaction completes and the seller is assessed the fee only when an item sells through a Promoted Listings ad campaign. &lt;br&gt;&lt;br&gt;The &lt;b&gt;bidPercentage&lt;/b&gt; is a single precision value that is guided by the following rules: &lt;ul&gt;&lt;li&gt;These values are &lt;b&gt;valid&lt;/b&gt;:&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;4.1&lt;/code&gt;, &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;5.0&lt;/code&gt;, &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;5.5&lt;/code&gt;, ...&lt;/li&gt;  &lt;li&gt;These values are &lt;b&gt;not valid&lt;/b&gt;:&lt;br /&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;0.01&lt;/code&gt;, &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;10.75&lt;/code&gt;, &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;99.99&lt;/code&gt;,&lt;br /&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;and so on.&lt;/li&gt;&lt;/ul&gt;This is the default bid percentage for the campaigns using the Cost Per Sale (CPS) funding model, and this value will be overridden by any ads in the campaign that have their own set bid percentages.&lt;br /&gt;&lt;br /&gt;If a bid percentage is not provided for an ad, eBay uses the default bid percentage of the associated campaign.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;This field is only relevant for campaigns that use the CPS funding model and a fixed ad rate. It is not used for campaigns that use the Cost Per Click (CPC) funding model and should not be provided when the selected adRateStrategy for the campaign is dynamic.&lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field has a minimum value of &lt;code&gt;2.0&lt;/code&gt; and a maximum value of &lt;code&gt;100.0&lt;/code&gt;.&lt;/span&gt;
     * @param value Value to set for the bidPercentage property.
     */
    public void setBidPercentage(@jakarta.annotation.Nullable final String value) {
        this.bidPercentage = value;
    }
    /**
     * Sets the bidPreferences property value. This container indicates the bidding preferences of the campaign, such as the maximum CPC amount.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This container is only applicable for smart targeting campaigns.&lt;/span&gt;&lt;br&gt;This container is required if the user wants to create a Smart Targeting campaign.
     * @param value Value to set for the bidPreferences property.
     */
    public void setBidPreferences(@jakarta.annotation.Nullable final java.util.List<BidPreference> value) {
        this.bidPreferences = value;
    }
    /**
     * Sets the dynamicAdRatePreferences property value. A field that indicates whether a single, user-defined bid percentage (also known as the &lt;i&gt;ad rate&lt;/i&gt;) should be used, or whether eBay should automatically adjust listings to maintain the daily suggested bid percentage.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; Dynamic adjustment is only applicable when the &lt;b&gt;adRateStrategy&lt;/b&gt; is set to &lt;code&gt;DYNAMIC&lt;/code&gt; This field is not applicable for offsite campaigns.&lt;/span&gt;&lt;br /&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;FIXED&lt;/code&gt;
     * @param value Value to set for the dynamicAdRatePreferences property.
     */
    public void setDynamicAdRatePreferences(@jakarta.annotation.Nullable final java.util.List<DynamicAdRatePreference> value) {
        this.dynamicAdRatePreferences = value;
    }
    /**
     * Sets the fundingModel property value. Indicates the model that eBay uses to calculate the Promoted Listings fee. &lt;p&gt;For a description of the funding model types, refer to &lt;b&gt;FundingModelTypeEnum&lt;/b&gt;.
     * @param value Value to set for the fundingModel property.
     */
    public void setFundingModel(@jakarta.annotation.Nullable final FundingModelEnum value) {
        this.fundingModel = value;
    }
}
