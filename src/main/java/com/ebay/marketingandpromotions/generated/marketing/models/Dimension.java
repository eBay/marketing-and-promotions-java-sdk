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
 * This type defines the annotation and dimension key used by the report. For information on how to set these values, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-reports.html&quot; target=&quot;_blank&quot;&gt;Promoted Listings reporting&lt;/a&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Dimension implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A list of annotations associated with the dimension of the report.
     */
    private java.util.List<String> annotationKeys;
    /**
     * The name of the dimension on which the report is based. &lt;p&gt;A dimension is an attribute to which the report data applies.&lt;/p&gt;
     */
    private String dimensionKey;
    /**
     * Instantiates a new {@link Dimension} and sets the default values.
     */
    public Dimension() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Dimension}
     */
    @jakarta.annotation.Nonnull
    public static Dimension createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Dimension();
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
     * Gets the annotationKeys property value. A list of annotations associated with the dimension of the report.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAnnotationKeys() {
        return this.annotationKeys;
    }
    /**
     * Gets the dimensionKey property value. The name of the dimension on which the report is based. &lt;p&gt;A dimension is an attribute to which the report data applies.&lt;/p&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDimensionKey() {
        return this.dimensionKey;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("annotationKeys", (n) -> { this.setAnnotationKeys(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("dimensionKey", (n) -> { this.setDimensionKey(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("annotationKeys", this.getAnnotationKeys());
        writer.writeStringValue("dimensionKey", this.getDimensionKey());
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
     * Sets the annotationKeys property value. A list of annotations associated with the dimension of the report.
     * @param value Value to set for the annotationKeys property.
     */
    public void setAnnotationKeys(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.annotationKeys = value;
    }
    /**
     * Sets the dimensionKey property value. The name of the dimension on which the report is based. &lt;p&gt;A dimension is an attribute to which the report data applies.&lt;/p&gt;
     * @param value Value to set for the dimensionKey property.
     */
    public void setDimensionKey(@jakarta.annotation.Nullable final String value) {
        this.dimensionKey = value;
    }
}
