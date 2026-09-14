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
 * A type that defines the budget details for a Cost Per Click (CPC) Promoted Listings campaign.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CampaignBudget implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The daily budget limit for the Cost Per Click (CPC) Promoted Listings campaign.&lt;br&gt;&lt;br&gt;&lt;i&gt;Required if&lt;/i&gt; the campaign&apos;s funding model is CPC.&lt;br&gt;&lt;br&gt;This will be a dollar value. All clicks using the keywords defined for the campaign will go towards expending the daily budget. Once the daily budget is exceeded for the campaign, all Promoted Listings under the campaign will be turned off until the next day.&lt;br&gt;&lt;br&gt;When running an offsite campaign, eBay may spend more or less than the seller&apos;s daily budget to capitalize on interested buyers, but will not exceed 2x the daily budget. The average over the course of the campaign will not exceed the provided daily budget. This value is used to calculate a total monthly budget by multiplying 30.4 by the provided daily budget. Over the course of the campaign, eBay will not charge more than this total budget per month.&lt;br&gt;&lt;br&gt;If a campaign ends prematurely, however, the seller may be charged up to 2x their daily budget on a daily basis, as the campaign may have not had the chance to average the budget out over time.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid Values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;50.00&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;100.00&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     */
    private Budget daily;
    /**
     * Instantiates a new {@link CampaignBudget} and sets the default values.
     */
    public CampaignBudget() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CampaignBudget}
     */
    @jakarta.annotation.Nonnull
    public static CampaignBudget createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CampaignBudget();
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
     * Gets the daily property value. The daily budget limit for the Cost Per Click (CPC) Promoted Listings campaign.&lt;br&gt;&lt;br&gt;&lt;i&gt;Required if&lt;/i&gt; the campaign&apos;s funding model is CPC.&lt;br&gt;&lt;br&gt;This will be a dollar value. All clicks using the keywords defined for the campaign will go towards expending the daily budget. Once the daily budget is exceeded for the campaign, all Promoted Listings under the campaign will be turned off until the next day.&lt;br&gt;&lt;br&gt;When running an offsite campaign, eBay may spend more or less than the seller&apos;s daily budget to capitalize on interested buyers, but will not exceed 2x the daily budget. The average over the course of the campaign will not exceed the provided daily budget. This value is used to calculate a total monthly budget by multiplying 30.4 by the provided daily budget. Over the course of the campaign, eBay will not charge more than this total budget per month.&lt;br&gt;&lt;br&gt;If a campaign ends prematurely, however, the seller may be charged up to 2x their daily budget on a daily basis, as the campaign may have not had the chance to average the budget out over time.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid Values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;50.00&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;100.00&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link Budget}
     */
    @jakarta.annotation.Nullable
    public Budget getDaily() {
        return this.daily;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("daily", (n) -> { this.setDaily(n.getObjectValue(Budget::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("daily", this.getDaily());
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
     * Sets the daily property value. The daily budget limit for the Cost Per Click (CPC) Promoted Listings campaign.&lt;br&gt;&lt;br&gt;&lt;i&gt;Required if&lt;/i&gt; the campaign&apos;s funding model is CPC.&lt;br&gt;&lt;br&gt;This will be a dollar value. All clicks using the keywords defined for the campaign will go towards expending the daily budget. Once the daily budget is exceeded for the campaign, all Promoted Listings under the campaign will be turned off until the next day.&lt;br&gt;&lt;br&gt;When running an offsite campaign, eBay may spend more or less than the seller&apos;s daily budget to capitalize on interested buyers, but will not exceed 2x the daily budget. The average over the course of the campaign will not exceed the provided daily budget. This value is used to calculate a total monthly budget by multiplying 30.4 by the provided daily budget. Over the course of the campaign, eBay will not charge more than this total budget per month.&lt;br&gt;&lt;br&gt;If a campaign ends prematurely, however, the seller may be charged up to 2x their daily budget on a daily basis, as the campaign may have not had the chance to average the budget out over time.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid Values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;50.00&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;100.00&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the daily property.
     */
    public void setDaily(@jakarta.annotation.Nullable final Budget value) {
        this.daily = value;
    }
}
