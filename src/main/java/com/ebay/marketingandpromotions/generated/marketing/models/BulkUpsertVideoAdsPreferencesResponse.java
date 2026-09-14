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
 * The base response container returned by the &lt;b&gt;bulkUpsertVideoAdsPreferences&lt;/b&gt; operation. It contains the per-listing results for each attempted video ads preference update in the bulk request.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkUpsertVideoAdsPreferencesResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An array of per-listing results for the bulk request. Each element contains the outcome of the attempted video ads preference update for one listing.
     */
    private java.util.List<UpsertVideoAdsPreferencesResponse> responses;
    /**
     * Instantiates a new {@link BulkUpsertVideoAdsPreferencesResponse} and sets the default values.
     */
    public BulkUpsertVideoAdsPreferencesResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BulkUpsertVideoAdsPreferencesResponse}
     */
    @jakarta.annotation.Nonnull
    public static BulkUpsertVideoAdsPreferencesResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BulkUpsertVideoAdsPreferencesResponse();
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
        deserializerMap.put("responses", (n) -> { this.setResponses(n.getCollectionOfObjectValues(UpsertVideoAdsPreferencesResponse::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the responses property value. An array of per-listing results for the bulk request. Each element contains the outcome of the attempted video ads preference update for one listing.
     * @return a {@link java.util.List<UpsertVideoAdsPreferencesResponse>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UpsertVideoAdsPreferencesResponse> getResponses() {
        return this.responses;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("responses", this.getResponses());
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
     * Sets the responses property value. An array of per-listing results for the bulk request. Each element contains the outcome of the attempted video ads preference update for one listing.
     * @param value Value to set for the responses property.
     */
    public void setResponses(@jakarta.annotation.Nullable final java.util.List<UpsertVideoAdsPreferencesResponse> value) {
        this.responses = value;
    }
}
