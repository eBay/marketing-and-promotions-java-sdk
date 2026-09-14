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
 * The dimension information of the alert including keys and values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AlertDimension implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The key field of the applied dimension. For example, the marketplace Id.
     */
    private DimensionKeyEnum key;
    /**
     * The value field of the applied dimension. For example, if the key is a &lt;code&gt;MARKETPLACE_ID&lt;/code&gt;, the value would be from &lt;a href=&apos;/develop/api/sell/request_headers#marketplace-id-values&apos; target=&quot;_blank&quot;&gt;Marketplace ID values&lt;/a&gt;.
     */
    private String value;
    /**
     * Instantiates a new {@link AlertDimension} and sets the default values.
     */
    public AlertDimension() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AlertDimension}
     */
    @jakarta.annotation.Nonnull
    public static AlertDimension createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AlertDimension();
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
        deserializerMap.put("key", (n) -> { this.setKey(n.getEnumValue(DimensionKeyEnum::forValue)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the key property value. The key field of the applied dimension. For example, the marketplace Id.
     * @return a {@link DimensionKeyEnum}
     */
    @jakarta.annotation.Nullable
    public DimensionKeyEnum getKey() {
        return this.key;
    }
    /**
     * Gets the value property value. The value field of the applied dimension. For example, if the key is a &lt;code&gt;MARKETPLACE_ID&lt;/code&gt;, the value would be from &lt;a href=&apos;/develop/api/sell/request_headers#marketplace-id-values&apos; target=&quot;_blank&quot;&gt;Marketplace ID values&lt;/a&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("key", this.getKey());
        writer.writeStringValue("value", this.getValue());
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
     * Sets the key property value. The key field of the applied dimension. For example, the marketplace Id.
     * @param value Value to set for the key property.
     */
    public void setKey(@jakarta.annotation.Nullable final DimensionKeyEnum value) {
        this.key = value;
    }
    /**
     * Sets the value property value. The value field of the applied dimension. For example, if the key is a &lt;code&gt;MARKETPLACE_ID&lt;/code&gt;, the value would be from &lt;a href=&apos;/develop/api/sell/request_headers#marketplace-id-values&apos; target=&quot;_blank&quot;&gt;Marketplace ID values&lt;/a&gt;.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
