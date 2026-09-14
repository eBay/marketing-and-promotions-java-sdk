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
 * This type defines the object for a single email campaign audience.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CampaignAudience implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This enum value indicates the audience type. For the complete list of audience types and their associated enum values, see &lt;b&gt;AudienceTypeEnum&lt;/b&gt;.
     */
    private AudienceTypeEnum audienceType;
    /**
     * The unique code for an audience. 
     */
    private String code;
    /**
     * The display name for an audience.
     */
    private String name;
    /**
     * Instantiates a new {@link CampaignAudience} and sets the default values.
     */
    public CampaignAudience() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CampaignAudience}
     */
    @jakarta.annotation.Nonnull
    public static CampaignAudience createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CampaignAudience();
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
     * Gets the audienceType property value. This enum value indicates the audience type. For the complete list of audience types and their associated enum values, see &lt;b&gt;AudienceTypeEnum&lt;/b&gt;.
     * @return a {@link AudienceTypeEnum}
     */
    @jakarta.annotation.Nullable
    public AudienceTypeEnum getAudienceType() {
        return this.audienceType;
    }
    /**
     * Gets the code property value. The unique code for an audience. 
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCode() {
        return this.code;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("audienceType", (n) -> { this.setAudienceType(n.getEnumValue(AudienceTypeEnum::forValue)); });
        deserializerMap.put("code", (n) -> { this.setCode(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The display name for an audience.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("audienceType", this.getAudienceType());
        writer.writeStringValue("code", this.getCode());
        writer.writeStringValue("name", this.getName());
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
     * Sets the audienceType property value. This enum value indicates the audience type. For the complete list of audience types and their associated enum values, see &lt;b&gt;AudienceTypeEnum&lt;/b&gt;.
     * @param value Value to set for the audienceType property.
     */
    public void setAudienceType(@jakarta.annotation.Nullable final AudienceTypeEnum value) {
        this.audienceType = value;
    }
    /**
     * Sets the code property value. The unique code for an audience. 
     * @param value Value to set for the code property.
     */
    public void setCode(@jakarta.annotation.Nullable final String value) {
        this.code = value;
    }
    /**
     * Sets the name property value. The display name for an audience.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
}
