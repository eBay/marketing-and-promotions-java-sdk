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
 * This response type contains the result of a video ads preference create or update operation for a single listing. It is returned as the response body for &lt;b&gt;upsertVideoAdsPreferences&lt;/b&gt; and as the per-listing result type in &lt;b&gt;bulkUpsertVideoAdsPreferences&lt;/b&gt;. It contains the outcome of the attempted video ads preference create or update operation for a single listing, including the listing ID, status code, and any errors associated with that listing.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpsertVideoAdsPreferencesResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A list of errors associated with the specified listing ID for the attempted video ads preference update. In a bulk response, this value applies to the individual listing result item.
     */
    private java.util.List<ErrorDetailV3> errors;
    /**
     * The unique eBay listing ID for the listing that was updated or attempted (this ID was generated when the listing was created).
     */
    private String listingId;
    /**
     * The HTTP status code returned for each listing that the seller attempted to update, whether for a single listing or for an individual listing within a bulk response.
     */
    private Integer statusCode;
    /**
     * Instantiates a new {@link UpsertVideoAdsPreferencesResponse} and sets the default values.
     */
    public UpsertVideoAdsPreferencesResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpsertVideoAdsPreferencesResponse}
     */
    @jakarta.annotation.Nonnull
    public static UpsertVideoAdsPreferencesResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpsertVideoAdsPreferencesResponse();
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
     * Gets the errors property value. A list of errors associated with the specified listing ID for the attempted video ads preference update. In a bulk response, this value applies to the individual listing result item.
     * @return a {@link java.util.List<ErrorDetailV3>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ErrorDetailV3> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ErrorDetailV3::createFromDiscriminatorValue)); });
        deserializerMap.put("listingId", (n) -> { this.setListingId(n.getStringValue()); });
        deserializerMap.put("statusCode", (n) -> { this.setStatusCode(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the listingId property value. The unique eBay listing ID for the listing that was updated or attempted (this ID was generated when the listing was created).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getListingId() {
        return this.listingId;
    }
    /**
     * Gets the statusCode property value. The HTTP status code returned for each listing that the seller attempted to update, whether for a single listing or for an individual listing within a bulk response.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getStatusCode() {
        return this.statusCode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("listingId", this.getListingId());
        writer.writeIntegerValue("statusCode", this.getStatusCode());
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
     * Sets the errors property value. A list of errors associated with the specified listing ID for the attempted video ads preference update. In a bulk response, this value applies to the individual listing result item.
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<ErrorDetailV3> value) {
        this.errors = value;
    }
    /**
     * Sets the listingId property value. The unique eBay listing ID for the listing that was updated or attempted (this ID was generated when the listing was created).
     * @param value Value to set for the listingId property.
     */
    public void setListingId(@jakarta.annotation.Nullable final String value) {
        this.listingId = value;
    }
    /**
     * Sets the statusCode property value. The HTTP status code returned for each listing that the seller attempted to update, whether for a single listing or for an individual listing within a bulk response.
     * @param value Value to set for the statusCode property.
     */
    public void setStatusCode(@jakarta.annotation.Nullable final Integer value) {
        this.statusCode = value;
    }
}
