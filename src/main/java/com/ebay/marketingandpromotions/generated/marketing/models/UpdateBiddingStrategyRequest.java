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
 * This type defines the fields used in the &lt;b&gt;updatedBiddingStrategy&lt;/b&gt; request.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateBiddingStrategyRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The new bidding strategy for the specified Cost Per Click (CPC) campaign. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:BiddingStrategyEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String biddingStrategy;
    /**
     * This container indicates the bidding preferences of the campaign, such as the maximum CPC amount.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This container is only applicable for smart targeting campaigns.&lt;/span&gt;&lt;br&gt;This container is required if the user wants to create a Smart Targeting campaign.
     */
    private java.util.List<BidPreference> bidPreferences;
    /**
     * Instantiates a new {@link UpdateBiddingStrategyRequest} and sets the default values.
     */
    public UpdateBiddingStrategyRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdateBiddingStrategyRequest}
     */
    @jakarta.annotation.Nonnull
    public static UpdateBiddingStrategyRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateBiddingStrategyRequest();
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
     * Gets the biddingStrategy property value. The new bidding strategy for the specified Cost Per Click (CPC) campaign. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:BiddingStrategyEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBiddingStrategy() {
        return this.biddingStrategy;
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("biddingStrategy", (n) -> { this.setBiddingStrategy(n.getStringValue()); });
        deserializerMap.put("bidPreferences", (n) -> { this.setBidPreferences(n.getCollectionOfObjectValues(BidPreference::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("biddingStrategy", this.getBiddingStrategy());
        writer.writeCollectionOfObjectValues("bidPreferences", this.getBidPreferences());
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
     * Sets the biddingStrategy property value. The new bidding strategy for the specified Cost Per Click (CPC) campaign. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:BiddingStrategyEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the biddingStrategy property.
     */
    public void setBiddingStrategy(@jakarta.annotation.Nullable final String value) {
        this.biddingStrategy = value;
    }
    /**
     * Sets the bidPreferences property value. This container indicates the bidding preferences of the campaign, such as the maximum CPC amount.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This container is only applicable for smart targeting campaigns.&lt;/span&gt;&lt;br&gt;This container is required if the user wants to create a Smart Targeting campaign.
     * @param value Value to set for the bidPreferences property.
     */
    public void setBidPreferences(@jakarta.annotation.Nullable final java.util.List<BidPreference> value) {
        this.bidPreferences = value;
    }
}
