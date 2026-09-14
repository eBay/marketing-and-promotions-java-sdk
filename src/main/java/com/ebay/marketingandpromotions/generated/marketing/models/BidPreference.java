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
 * This type indicates the bidding preferences of a Smart Targeting campaign.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This type is only supported for CPC funding model campaigns with on-site channels.&lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BidPreference implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The maximum amount for which the eBay suggested bid can be adjusted. This value represents the most a seller is willing to pay for each click on their ad. The adjusted bid will never exceed this amount.&lt;br&gt;&lt;br&gt;This field is required for smart targeting campaigns.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The maximum cost-per-click has a minimum value of 0.02 and a maximum value of 100.&lt;/span&gt;
     */
    private MaxCpc maxCpc;
    /**
     * Instantiates a new {@link BidPreference} and sets the default values.
     */
    public BidPreference() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BidPreference}
     */
    @jakarta.annotation.Nonnull
    public static BidPreference createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BidPreference();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("maxCpc", (n) -> { this.setMaxCpc(n.getObjectValue(MaxCpc::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the maxCpc property value. The maximum amount for which the eBay suggested bid can be adjusted. This value represents the most a seller is willing to pay for each click on their ad. The adjusted bid will never exceed this amount.&lt;br&gt;&lt;br&gt;This field is required for smart targeting campaigns.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The maximum cost-per-click has a minimum value of 0.02 and a maximum value of 100.&lt;/span&gt;
     * @return a {@link MaxCpc}
     */
    @jakarta.annotation.Nullable
    public MaxCpc getMaxCpc() {
        return this.maxCpc;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("maxCpc", this.getMaxCpc());
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
     * Sets the maxCpc property value. The maximum amount for which the eBay suggested bid can be adjusted. This value represents the most a seller is willing to pay for each click on their ad. The adjusted bid will never exceed this amount.&lt;br&gt;&lt;br&gt;This field is required for smart targeting campaigns.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The maximum cost-per-click has a minimum value of 0.02 and a maximum value of 100.&lt;/span&gt;
     * @param value Value to set for the maxCpc property.
     */
    public void setMaxCpc(@jakarta.annotation.Nullable final MaxCpc value) {
        this.maxCpc = value;
    }
}
