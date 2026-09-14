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
 * A complex type that returns data related to Promoted Listings bid percentages.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BidPercentages implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The basis by which the ad rate is calculated.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt; &lt;code&gt;ITEM&lt;/code&gt; and &lt;code&gt;TRENDING&lt;/code&gt;
     */
    private Basis basis;
    /**
     * The bid percentage data is a single precision value, as calculated by the associated basis. &lt;p&gt;In Promoted listings ad campaigns, the &lt;b&gt;bid percentage&lt;/b&gt; (also known as the &lt;i&gt;ad rate&lt;/i&gt;) is a user-defined value that sets the level that eBay raises the visibility of the listing in the marketplace. It is also the rate that is used to calculate the Promoted Listings fee.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Minimum value:&lt;/b&gt; 1.0 &amp;nbsp; &lt;b&gt;Maximum value:&lt;/b&gt; 100.0&lt;/p&gt;
     */
    private String value;
    /**
     * Instantiates a new {@link BidPercentages} and sets the default values.
     */
    public BidPercentages() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BidPercentages}
     */
    @jakarta.annotation.Nonnull
    public static BidPercentages createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BidPercentages();
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
     * Gets the basis property value. The basis by which the ad rate is calculated.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt; &lt;code&gt;ITEM&lt;/code&gt; and &lt;code&gt;TRENDING&lt;/code&gt;
     * @return a {@link Basis}
     */
    @jakarta.annotation.Nullable
    public Basis getBasis() {
        return this.basis;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("basis", (n) -> { this.setBasis(n.getEnumValue(Basis::forValue)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The bid percentage data is a single precision value, as calculated by the associated basis. &lt;p&gt;In Promoted listings ad campaigns, the &lt;b&gt;bid percentage&lt;/b&gt; (also known as the &lt;i&gt;ad rate&lt;/i&gt;) is a user-defined value that sets the level that eBay raises the visibility of the listing in the marketplace. It is also the rate that is used to calculate the Promoted Listings fee.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Minimum value:&lt;/b&gt; 1.0 &amp;nbsp; &lt;b&gt;Maximum value:&lt;/b&gt; 100.0&lt;/p&gt;
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
        writer.writeEnumValue("basis", this.getBasis());
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
     * Sets the basis property value. The basis by which the ad rate is calculated.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt; &lt;code&gt;ITEM&lt;/code&gt; and &lt;code&gt;TRENDING&lt;/code&gt;
     * @param value Value to set for the basis property.
     */
    public void setBasis(@jakarta.annotation.Nullable final Basis value) {
        this.basis = value;
    }
    /**
     * Sets the value property value. The bid percentage data is a single precision value, as calculated by the associated basis. &lt;p&gt;In Promoted listings ad campaigns, the &lt;b&gt;bid percentage&lt;/b&gt; (also known as the &lt;i&gt;ad rate&lt;/i&gt;) is a user-defined value that sets the level that eBay raises the visibility of the listing in the marketplace. It is also the rate that is used to calculate the Promoted Listings fee.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Minimum value:&lt;/b&gt; 1.0 &amp;nbsp; &lt;b&gt;Maximum value:&lt;/b&gt; 100.0&lt;/p&gt;
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
