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
 * A type that contains the fields for the &lt;b&gt;UpdateCampaignBudget&lt;/b&gt; request.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateCampaignBudgetRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The daily budget limit for the Cost Per Click (CPC) Promoted Listings campaign. This will be a dollar value. All clicks using the keywords defined for the campaign will go towards expending the daily budget. Once the daily budget is exceeded for the campaign, all Promoted Listings under the campaign will be turned off until the next day.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;50.00&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;100.00&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     */
    private BudgetRequest daily;
    /**
     * Instantiates a new {@link UpdateCampaignBudgetRequest} and sets the default values.
     */
    public UpdateCampaignBudgetRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdateCampaignBudgetRequest}
     */
    @jakarta.annotation.Nonnull
    public static UpdateCampaignBudgetRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateCampaignBudgetRequest();
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
     * Gets the daily property value. The daily budget limit for the Cost Per Click (CPC) Promoted Listings campaign. This will be a dollar value. All clicks using the keywords defined for the campaign will go towards expending the daily budget. Once the daily budget is exceeded for the campaign, all Promoted Listings under the campaign will be turned off until the next day.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;50.00&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;100.00&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link BudgetRequest}
     */
    @jakarta.annotation.Nullable
    public BudgetRequest getDaily() {
        return this.daily;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("daily", (n) -> { this.setDaily(n.getObjectValue(BudgetRequest::createFromDiscriminatorValue)); });
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
     * Sets the daily property value. The daily budget limit for the Cost Per Click (CPC) Promoted Listings campaign. This will be a dollar value. All clicks using the keywords defined for the campaign will go towards expending the daily budget. Once the daily budget is exceeded for the campaign, all Promoted Listings under the campaign will be turned off until the next day.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;50.00&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;100.00&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the daily property.
     */
    public void setDaily(@jakarta.annotation.Nullable final BudgetRequest value) {
        this.daily = value;
    }
}
