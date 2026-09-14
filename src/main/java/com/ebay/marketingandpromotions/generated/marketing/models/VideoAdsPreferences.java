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
 * This request type defines the video ads preference settings to apply to a single listing in a Promoted Listings campaign that uses the CPC funding model. It is used as the &lt;b&gt;videoAdsPreferences&lt;/b&gt; field value in both &lt;b&gt;bulkUpsertVideoAdsPreferences&lt;/b&gt; and &lt;b&gt;upsertVideoAdsPreferences&lt;/b&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VideoAdsPreferences implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * When &lt;code&gt;true&lt;/code&gt;, video ads are enabled for the specified listing in the campaign, and any ads associated with that listing ID within the campaign are opted into video ads. When &lt;code&gt;false&lt;/code&gt;, any ads associated with the specified listing ID within the campaign are opted out of video ads.
     */
    private Boolean videoAdsEnabled;
    /**
     * Instantiates a new {@link VideoAdsPreferences} and sets the default values.
     */
    public VideoAdsPreferences() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VideoAdsPreferences}
     */
    @jakarta.annotation.Nonnull
    public static VideoAdsPreferences createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VideoAdsPreferences();
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
        deserializerMap.put("videoAdsEnabled", (n) -> { this.setVideoAdsEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the videoAdsEnabled property value. When &lt;code&gt;true&lt;/code&gt;, video ads are enabled for the specified listing in the campaign, and any ads associated with that listing ID within the campaign are opted into video ads. When &lt;code&gt;false&lt;/code&gt;, any ads associated with the specified listing ID within the campaign are opted out of video ads.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getVideoAdsEnabled() {
        return this.videoAdsEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("videoAdsEnabled", this.getVideoAdsEnabled());
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
     * Sets the videoAdsEnabled property value. When &lt;code&gt;true&lt;/code&gt;, video ads are enabled for the specified listing in the campaign, and any ads associated with that listing ID within the campaign are opted into video ads. When &lt;code&gt;false&lt;/code&gt;, any ads associated with the specified listing ID within the campaign are opted out of video ads.
     * @param value Value to set for the videoAdsEnabled property.
     */
    public void setVideoAdsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.videoAdsEnabled = value;
    }
}
