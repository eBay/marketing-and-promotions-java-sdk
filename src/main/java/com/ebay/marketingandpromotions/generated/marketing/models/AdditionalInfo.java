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
 * A type that provides additional information for suggested keywords.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AdditionalInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The type of additional information provided for the suggested keyword.&lt;br /&gt;&lt;br /&gt;&lt;strong&gt;Valid Value:&lt;/strong&gt; &lt;code&gt;KEYWORD_INSIGHTS&lt;/code&gt;
     */
    private AdditionalInfoEnum infoType;
    /**
     * A list of additional data provided for the suggested keyword.
     */
    private java.util.List<AdditionalInfoData> metrics;
    /**
     * Instantiates a new {@link AdditionalInfo} and sets the default values.
     */
    public AdditionalInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AdditionalInfo}
     */
    @jakarta.annotation.Nonnull
    public static AdditionalInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AdditionalInfo();
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
        deserializerMap.put("infoType", (n) -> { this.setInfoType(n.getEnumValue(AdditionalInfoEnum::forValue)); });
        deserializerMap.put("metrics", (n) -> { this.setMetrics(n.getCollectionOfObjectValues(AdditionalInfoData::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the infoType property value. The type of additional information provided for the suggested keyword.&lt;br /&gt;&lt;br /&gt;&lt;strong&gt;Valid Value:&lt;/strong&gt; &lt;code&gt;KEYWORD_INSIGHTS&lt;/code&gt;
     * @return a {@link AdditionalInfoEnum}
     */
    @jakarta.annotation.Nullable
    public AdditionalInfoEnum getInfoType() {
        return this.infoType;
    }
    /**
     * Gets the metrics property value. A list of additional data provided for the suggested keyword.
     * @return a {@link java.util.List<AdditionalInfoData>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AdditionalInfoData> getMetrics() {
        return this.metrics;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("infoType", this.getInfoType());
        writer.writeCollectionOfObjectValues("metrics", this.getMetrics());
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
     * Sets the infoType property value. The type of additional information provided for the suggested keyword.&lt;br /&gt;&lt;br /&gt;&lt;strong&gt;Valid Value:&lt;/strong&gt; &lt;code&gt;KEYWORD_INSIGHTS&lt;/code&gt;
     * @param value Value to set for the infoType property.
     */
    public void setInfoType(@jakarta.annotation.Nullable final AdditionalInfoEnum value) {
        this.infoType = value;
    }
    /**
     * Sets the metrics property value. A list of additional data provided for the suggested keyword.
     * @param value Value to set for the metrics property.
     */
    public void setMetrics(@jakarta.annotation.Nullable final java.util.List<AdditionalInfoData> value) {
        this.metrics = value;
    }
}
