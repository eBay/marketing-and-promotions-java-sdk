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
 * This request type defines the video ads preference create or update settings for a single listing in a campaign that uses the CPC funding model. It is used both for each listing item in the &lt;b&gt;bulkUpsertVideoAdsPreferences&lt;/b&gt; request and as the request body for &lt;b&gt;upsertVideoAdsPreferences&lt;/b&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpsertVideoAdsPreferencesRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique eBay listing ID of the listing whose video ads preferences you want to create or update. This value is generated when a listing is created with the &lt;b&gt;Trading API&lt;/b&gt; or the &lt;b&gt;Inventory API&lt;/b&gt;.
     */
    private String listingId;
    /**
     * The video ads preference settings to apply to the specified listing in a campaign that uses the CPC funding model.
     */
    private VideoAdsPreferences videoAdsPreferences;
    /**
     * Instantiates a new {@link UpsertVideoAdsPreferencesRequest} and sets the default values.
     */
    public UpsertVideoAdsPreferencesRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpsertVideoAdsPreferencesRequest}
     */
    @jakarta.annotation.Nonnull
    public static UpsertVideoAdsPreferencesRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpsertVideoAdsPreferencesRequest();
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
        deserializerMap.put("videoAdsPreferences", (n) -> { this.setVideoAdsPreferences(n.getObjectValue(VideoAdsPreferences::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the listingId property value. The unique eBay listing ID of the listing whose video ads preferences you want to create or update. This value is generated when a listing is created with the &lt;b&gt;Trading API&lt;/b&gt; or the &lt;b&gt;Inventory API&lt;/b&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getListingId() {
        return this.listingId;
    }
    /**
     * Gets the videoAdsPreferences property value. The video ads preference settings to apply to the specified listing in a campaign that uses the CPC funding model.
     * @return a {@link VideoAdsPreferences}
     */
    @jakarta.annotation.Nullable
    public VideoAdsPreferences getVideoAdsPreferences() {
        return this.videoAdsPreferences;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("listingId", this.getListingId());
        writer.writeObjectValue("videoAdsPreferences", this.getVideoAdsPreferences());
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
     * Sets the listingId property value. The unique eBay listing ID of the listing whose video ads preferences you want to create or update. This value is generated when a listing is created with the &lt;b&gt;Trading API&lt;/b&gt; or the &lt;b&gt;Inventory API&lt;/b&gt;.
     * @param value Value to set for the listingId property.
     */
    public void setListingId(@jakarta.annotation.Nullable final String value) {
        this.listingId = value;
    }
    /**
     * Sets the videoAdsPreferences property value. The video ads preference settings to apply to the specified listing in a campaign that uses the CPC funding model.
     * @param value Value to set for the videoAdsPreferences property.
     */
    public void setVideoAdsPreferences(@jakarta.annotation.Nullable final VideoAdsPreferences value) {
        this.videoAdsPreferences = value;
    }
}
