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
 * The price range.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PriceRange implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Specifies the currency of the listings in an email campaign using one of the three-digit codes of the &lt;a href=&quot;/api-docs/sell/marketing/types/ba:CurrencyCodeEnum&quot; target=&quot;_blank&quot;&gt;CurrencyCodeEnum&lt;/a&gt; type.
     */
    private String currency;
    /**
     * The listings selected will be greater than or equal to this value. The value entered must be given in number format, such as 20.00.&lt;br&gt;&lt;br&gt;Either &lt;code&gt;gte&lt;/code&gt;, &lt;code&gt;lte&lt;/code&gt;, or both must contain a value if the seller wishes to use a price range.
     */
    private Double gte;
    /**
     * The listings selected will be less than or equal to this value. The value entered must be given in number format, such as 100.00.&lt;br&gt;&lt;br&gt;Either &lt;code&gt;gte&lt;/code&gt;, &lt;code&gt;lte&lt;/code&gt;, or both must contain a value if the seller wishes to use a price range.
     */
    private Double lte;
    /**
     * Instantiates a new {@link PriceRange} and sets the default values.
     */
    public PriceRange() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PriceRange}
     */
    @jakarta.annotation.Nonnull
    public static PriceRange createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PriceRange();
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
     * Gets the currency property value. Specifies the currency of the listings in an email campaign using one of the three-digit codes of the &lt;a href=&quot;/api-docs/sell/marketing/types/ba:CurrencyCodeEnum&quot; target=&quot;_blank&quot;&gt;CurrencyCodeEnum&lt;/a&gt; type.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCurrency() {
        return this.currency;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("gte", (n) -> { this.setGte(n.getDoubleValue()); });
        deserializerMap.put("lte", (n) -> { this.setLte(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the gte property value. The listings selected will be greater than or equal to this value. The value entered must be given in number format, such as 20.00.&lt;br&gt;&lt;br&gt;Either &lt;code&gt;gte&lt;/code&gt;, &lt;code&gt;lte&lt;/code&gt;, or both must contain a value if the seller wishes to use a price range.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getGte() {
        return this.gte;
    }
    /**
     * Gets the lte property value. The listings selected will be less than or equal to this value. The value entered must be given in number format, such as 100.00.&lt;br&gt;&lt;br&gt;Either &lt;code&gt;gte&lt;/code&gt;, &lt;code&gt;lte&lt;/code&gt;, or both must contain a value if the seller wishes to use a price range.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getLte() {
        return this.lte;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeDoubleValue("gte", this.getGte());
        writer.writeDoubleValue("lte", this.getLte());
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
     * Sets the currency property value. Specifies the currency of the listings in an email campaign using one of the three-digit codes of the &lt;a href=&quot;/api-docs/sell/marketing/types/ba:CurrencyCodeEnum&quot; target=&quot;_blank&quot;&gt;CurrencyCodeEnum&lt;/a&gt; type.
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final String value) {
        this.currency = value;
    }
    /**
     * Sets the gte property value. The listings selected will be greater than or equal to this value. The value entered must be given in number format, such as 20.00.&lt;br&gt;&lt;br&gt;Either &lt;code&gt;gte&lt;/code&gt;, &lt;code&gt;lte&lt;/code&gt;, or both must contain a value if the seller wishes to use a price range.
     * @param value Value to set for the gte property.
     */
    public void setGte(@jakarta.annotation.Nullable final Double value) {
        this.gte = value;
    }
    /**
     * Sets the lte property value. The listings selected will be less than or equal to this value. The value entered must be given in number format, such as 100.00.&lt;br&gt;&lt;br&gt;Either &lt;code&gt;gte&lt;/code&gt;, &lt;code&gt;lte&lt;/code&gt;, or both must contain a value if the seller wishes to use a price range.
     * @param value Value to set for the lte property.
     */
    public void setLte(@jakarta.annotation.Nullable final Double value) {
        this.lte = value;
    }
}
