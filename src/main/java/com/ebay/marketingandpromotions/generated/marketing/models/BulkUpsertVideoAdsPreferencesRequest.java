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
 * This request type defines the listing-level video ads preference create or update operations to perform in a single request across multiple Promoted Listings ads within a CPC campaign.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkUpsertVideoAdsPreferencesRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An array of listing-level video ads preference updates. Include one object for each listing you want to create or update. You can specify up to 500 listing IDs in a single call, and the array must contain at least one item. &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 500 IDs per call
     */
    private java.util.List<UpsertVideoAdsPreferencesRequest> requests;
    /**
     * Instantiates a new {@link BulkUpsertVideoAdsPreferencesRequest} and sets the default values.
     */
    public BulkUpsertVideoAdsPreferencesRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BulkUpsertVideoAdsPreferencesRequest}
     */
    @jakarta.annotation.Nonnull
    public static BulkUpsertVideoAdsPreferencesRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BulkUpsertVideoAdsPreferencesRequest();
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
        deserializerMap.put("requests", (n) -> { this.setRequests(n.getCollectionOfObjectValues(UpsertVideoAdsPreferencesRequest::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the requests property value. An array of listing-level video ads preference updates. Include one object for each listing you want to create or update. You can specify up to 500 listing IDs in a single call, and the array must contain at least one item. &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 500 IDs per call
     * @return a {@link java.util.List<UpsertVideoAdsPreferencesRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UpsertVideoAdsPreferencesRequest> getRequests() {
        return this.requests;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("requests", this.getRequests());
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
     * Sets the requests property value. An array of listing-level video ads preference updates. Include one object for each listing you want to create or update. You can specify up to 500 listing IDs in a single call, and the array must contain at least one item. &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 500 IDs per call
     * @param value Value to set for the requests property.
     */
    public void setRequests(@jakarta.annotation.Nullable final java.util.List<UpsertVideoAdsPreferencesRequest> value) {
        this.requests = value;
    }
}
