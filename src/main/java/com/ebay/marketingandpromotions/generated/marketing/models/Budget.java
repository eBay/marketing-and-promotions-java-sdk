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
 * The daily budget limit for the Cost Per Click (CPC) Promoted Listings campaign.&lt;br&gt;&lt;br&gt;&lt;i&gt;Required if&lt;/i&gt; the campaign&apos;s funding model is CPC.&lt;br&gt;&lt;br&gt;This will be a dollar value. All clicks using the keywords defined for the campaign will go towards expending the daily budget. Once the daily budget is exceeded for the campaign, all Promoted Listings under the campaign will be turned off until the next day.&lt;br&gt;&lt;br&gt;When running an offsite campaign, eBay may spend more or less than the seller&apos;s daily budget to capitalize on interested buyers, but will not exceed 2x the daily budget. The average over the course of the campaign will not exceed the provided daily budget. This value is used to calculate a total monthly budget by multiplying 30.4 by the provided daily budget. Over the course of the campaign, eBay will not charge more than this total budget per month.&lt;br&gt;&lt;br&gt;If a campaign ends prematurely, however, the seller may be charged up to 2x their daily budget on a daily basis, as the campaign may have not had the chance to average the budget out over time.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid Values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;50.00&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;100.00&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Budget implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The allocated budget amount for a CPC Promoted Listings campaign.
     */
    private Amount amount;
    /**
     * The budget status for a CPC Promoted Listings campaign.
     */
    private BudgetStatusEnum budgetStatus;
    /**
     * Instantiates a new {@link Budget} and sets the default values.
     */
    public Budget() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Budget}
     */
    @jakarta.annotation.Nonnull
    public static Budget createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Budget();
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
     * Gets the amount property value. The allocated budget amount for a CPC Promoted Listings campaign.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAmount() {
        return this.amount;
    }
    /**
     * Gets the budgetStatus property value. The budget status for a CPC Promoted Listings campaign.
     * @return a {@link BudgetStatusEnum}
     */
    @jakarta.annotation.Nullable
    public BudgetStatusEnum getBudgetStatus() {
        return this.budgetStatus;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("budgetStatus", (n) -> { this.setBudgetStatus(n.getEnumValue(BudgetStatusEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("amount", this.getAmount());
        writer.writeEnumValue("budgetStatus", this.getBudgetStatus());
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
     * Sets the amount property value. The allocated budget amount for a CPC Promoted Listings campaign.
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final Amount value) {
        this.amount = value;
    }
    /**
     * Sets the budgetStatus property value. The budget status for a CPC Promoted Listings campaign.
     * @param value Value to set for the budgetStatus property.
     */
    public void setBudgetStatus(@jakarta.annotation.Nullable final BudgetStatusEnum value) {
        this.budgetStatus = value;
    }
}
