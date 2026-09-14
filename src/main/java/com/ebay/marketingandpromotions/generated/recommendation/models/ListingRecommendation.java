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

package com.ebay.marketingandpromotions.generated.recommendation.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A complex type that contains the ID of an actively listed item and a set of related listing recommendations. The recommendations contain information the seller can use to optimize their listing configurations.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListingRecommendation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An ID that identifies the active listing associated with the eBay recommendations.
     */
    private String listingId;
    /**
     * This return object provides the eBay recommendations and information related to the associated listing ID.  &lt;br&gt;&lt;br&gt;The container currently returns the &lt;code&gt;AD&lt;/code&gt; recommendation type, which contains information that sellers can use to configure Promoted Listings ad campaigns.  &lt;br&gt;&lt;br&gt;This container is returned with each &lt;b&gt;ListingRecommendation&lt;/b&gt; object, &lt;i&gt;except&lt;/i&gt; when: &lt;ul&gt;&lt;li&gt;The listing ID is not eligible for Promoted Listings&lt;/li&gt; &lt;li&gt;The listing ID is currently in a Promoted Listings campaign&lt;/li&gt; &lt;li&gt;The listing ID is invalid&lt;/li&gt;&lt;/ul&gt;
     */
    private MarketingRecommendation marketing;
    /**
     * Instantiates a new {@link ListingRecommendation} and sets the default values.
     */
    public ListingRecommendation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListingRecommendation}
     */
    @jakarta.annotation.Nonnull
    public static ListingRecommendation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListingRecommendation();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("listingId", (n) -> { this.setListingId(n.getStringValue()); });
        deserializerMap.put("marketing", (n) -> { this.setMarketing(n.getObjectValue(MarketingRecommendation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the listingId property value. An ID that identifies the active listing associated with the eBay recommendations.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getListingId() {
        return this.listingId;
    }
    /**
     * Gets the marketing property value. This return object provides the eBay recommendations and information related to the associated listing ID.  &lt;br&gt;&lt;br&gt;The container currently returns the &lt;code&gt;AD&lt;/code&gt; recommendation type, which contains information that sellers can use to configure Promoted Listings ad campaigns.  &lt;br&gt;&lt;br&gt;This container is returned with each &lt;b&gt;ListingRecommendation&lt;/b&gt; object, &lt;i&gt;except&lt;/i&gt; when: &lt;ul&gt;&lt;li&gt;The listing ID is not eligible for Promoted Listings&lt;/li&gt; &lt;li&gt;The listing ID is currently in a Promoted Listings campaign&lt;/li&gt; &lt;li&gt;The listing ID is invalid&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link MarketingRecommendation}
     */
    @jakarta.annotation.Nullable
    public MarketingRecommendation getMarketing() {
        return this.marketing;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("listingId", this.getListingId());
        writer.writeObjectValue("marketing", this.getMarketing());
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
     * Sets the listingId property value. An ID that identifies the active listing associated with the eBay recommendations.
     * @param value Value to set for the listingId property.
     */
    public void setListingId(@jakarta.annotation.Nullable final String value) {
        this.listingId = value;
    }
    /**
     * Sets the marketing property value. This return object provides the eBay recommendations and information related to the associated listing ID.  &lt;br&gt;&lt;br&gt;The container currently returns the &lt;code&gt;AD&lt;/code&gt; recommendation type, which contains information that sellers can use to configure Promoted Listings ad campaigns.  &lt;br&gt;&lt;br&gt;This container is returned with each &lt;b&gt;ListingRecommendation&lt;/b&gt; object, &lt;i&gt;except&lt;/i&gt; when: &lt;ul&gt;&lt;li&gt;The listing ID is not eligible for Promoted Listings&lt;/li&gt; &lt;li&gt;The listing ID is currently in a Promoted Listings campaign&lt;/li&gt; &lt;li&gt;The listing ID is invalid&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the marketing property.
     */
    public void setMarketing(@jakarta.annotation.Nullable final MarketingRecommendation value) {
        this.marketing = value;
    }
}
