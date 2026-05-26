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
 * This type indicates the suggested daily keyword budget for an offsite campaign.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BudgetRecommendationResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A type that defines the budget details for a Cost Per Click (CPC) Promoted Listings campaign.
     */
    private CampaignBudget budget;
    /**
     * The unique eBay-assigned ID for a campaign. This ID is generated when a campaign is created.
     */
    private String campaignId;
    /**
     * The channel for the campaign. This value indicates whether the campaign is an Onsite or Offsite advertising campaign.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ON_SITE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;OFF_SITE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     */
    private java.util.List<String> channels;
    /**
     * Instantiates a new {@link BudgetRecommendationResponse} and sets the default values.
     */
    public BudgetRecommendationResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BudgetRecommendationResponse}
     */
    @jakarta.annotation.Nonnull
    public static BudgetRecommendationResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BudgetRecommendationResponse();
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
     * Gets the budget property value. A type that defines the budget details for a Cost Per Click (CPC) Promoted Listings campaign.
     * @return a {@link CampaignBudget}
     */
    @jakarta.annotation.Nullable
    public CampaignBudget getBudget() {
        return this.budget;
    }
    /**
     * Gets the campaignId property value. The unique eBay-assigned ID for a campaign. This ID is generated when a campaign is created.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCampaignId() {
        return this.campaignId;
    }
    /**
     * Gets the channels property value. The channel for the campaign. This value indicates whether the campaign is an Onsite or Offsite advertising campaign.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ON_SITE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;OFF_SITE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getChannels() {
        return this.channels;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("budget", (n) -> { this.setBudget(n.getObjectValue(CampaignBudget::createFromDiscriminatorValue)); });
        deserializerMap.put("campaignId", (n) -> { this.setCampaignId(n.getStringValue()); });
        deserializerMap.put("channels", (n) -> { this.setChannels(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("budget", this.getBudget());
        writer.writeStringValue("campaignId", this.getCampaignId());
        writer.writeCollectionOfPrimitiveValues("channels", this.getChannels());
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
     * Sets the budget property value. A type that defines the budget details for a Cost Per Click (CPC) Promoted Listings campaign.
     * @param value Value to set for the budget property.
     */
    public void setBudget(@jakarta.annotation.Nullable final CampaignBudget value) {
        this.budget = value;
    }
    /**
     * Sets the campaignId property value. The unique eBay-assigned ID for a campaign. This ID is generated when a campaign is created.
     * @param value Value to set for the campaignId property.
     */
    public void setCampaignId(@jakarta.annotation.Nullable final String value) {
        this.campaignId = value;
    }
    /**
     * Sets the channels property value. The channel for the campaign. This value indicates whether the campaign is an Onsite or Offsite advertising campaign.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ON_SITE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;OFF_SITE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the channels property.
     */
    public void setChannels(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.channels = value;
    }
}
