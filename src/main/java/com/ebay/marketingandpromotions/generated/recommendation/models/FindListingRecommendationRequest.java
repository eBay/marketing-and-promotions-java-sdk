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
 * An list of listing ID values for which you want Promoted Listings ad configuration information.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FindListingRecommendationRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A comma-separated list of listing IDs for which you want Promoted Listings ad configuration information.  &lt;p&gt;Currently, this method accepts only &lt;b&gt;listingId&lt;/b&gt; values from the Trading API.&lt;/p&gt;  &lt;p&gt;&lt;b&gt;Max:&lt;/b&gt; 500 listing IDs&lt;/p&gt;
     */
    private java.util.List<String> listingIds;
    /**
     * Instantiates a new {@link FindListingRecommendationRequest} and sets the default values.
     */
    public FindListingRecommendationRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FindListingRecommendationRequest}
     */
    @jakarta.annotation.Nonnull
    public static FindListingRecommendationRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FindListingRecommendationRequest();
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
        deserializerMap.put("listingIds", (n) -> { this.setListingIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the listingIds property value. A comma-separated list of listing IDs for which you want Promoted Listings ad configuration information.  &lt;p&gt;Currently, this method accepts only &lt;b&gt;listingId&lt;/b&gt; values from the Trading API.&lt;/p&gt;  &lt;p&gt;&lt;b&gt;Max:&lt;/b&gt; 500 listing IDs&lt;/p&gt;
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getListingIds() {
        return this.listingIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("listingIds", this.getListingIds());
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
     * Sets the listingIds property value. A comma-separated list of listing IDs for which you want Promoted Listings ad configuration information.  &lt;p&gt;Currently, this method accepts only &lt;b&gt;listingId&lt;/b&gt; values from the Trading API.&lt;/p&gt;  &lt;p&gt;&lt;b&gt;Max:&lt;/b&gt; 500 listing IDs&lt;/p&gt;
     * @param value Value to set for the listingIds property.
     */
    public void setListingIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.listingIds = value;
    }
}
