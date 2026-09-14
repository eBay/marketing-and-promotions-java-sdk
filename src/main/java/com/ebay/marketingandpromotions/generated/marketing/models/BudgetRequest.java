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
 * The daily budget limit for a CPC Promoted Listings campaign.&lt;br&gt;&lt;br&gt;When running an offsite campaign, eBay may spend more or less than the seller&apos;s daily budget to capitalize on interested buyers, but will not exceed 2x the daily budget. The average over the course of the campaign will not exceed the provided daily budget. This value is used to calculate a total monthly budget by multiplying 30.4 by the provided daily budget. Over the course of the campaign, eBay will not charge more than this total budget per month.&lt;br&gt;&lt;br&gt;If a campaign ends prematurely, however, the seller may be charged up to 2x their daily budget on a daily basis, as the campaign may have not had the chance to average the budget out over time.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BudgetRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The allocated budget amount for a CPC Promoted Listings campaign. Both the &lt;b&gt;currency&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; must be specified.
     */
    private Amount amount;
    /**
     * Instantiates a new {@link BudgetRequest} and sets the default values.
     */
    public BudgetRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BudgetRequest}
     */
    @jakarta.annotation.Nonnull
    public static BudgetRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BudgetRequest();
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
     * Gets the amount property value. The allocated budget amount for a CPC Promoted Listings campaign. Both the &lt;b&gt;currency&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; must be specified.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAmount() {
        return this.amount;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("amount", this.getAmount());
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
     * Sets the amount property value. The allocated budget amount for a CPC Promoted Listings campaign. Both the &lt;b&gt;currency&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; must be specified.
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final Amount value) {
        this.amount = value;
    }
}
