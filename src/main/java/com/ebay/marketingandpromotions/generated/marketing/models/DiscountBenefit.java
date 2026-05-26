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
 * This container defines the discount as either a monetary amount or a percentage of the sales price.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Important!:&lt;/b&gt; You must populate one and only one of the fields in this container: &lt;ul&gt;&lt;li&gt;&lt;b&gt;amountOffItem&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;amountOffOrder&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;percentageOffItem&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;percentageOffOrder&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; Refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pm-specifying-discounts.html&quot;&gt;Configuring discounts for threshold discounts&lt;/a&gt; for information and examples on how to combine &lt;b&gt;discountBenefit&lt;/b&gt; and &lt;b&gt;discountSpecification&lt;/b&gt; values to create different types of discounts.&lt;/p&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DiscountBenefit implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency.
     */
    private Amount amountOffItem;
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency.
     */
    private Amount amountOffOrder;
    /**
     * The percentage applied to the sales price that is discounted off the discounted item (or items) when the discount criteria is met.  &lt;br&gt;&lt;br&gt;Valid integer values for percentage off: &amp;nbsp;&amp;nbsp;&lt;b&gt;Min:&lt;/b&gt; &lt;code&gt;5&lt;/code&gt; &amp;nbsp;&amp;nbsp;&lt;b&gt;Max:&lt;/b&gt; &lt;code&gt;80&lt;/code&gt;
     */
    private String percentageOffItem;
    /**
     * Used for threshold discounts, this is the percentage of the order price that is discounted off the order when the discount criteria is met. This field is not value for markdown discounts.  &lt;br&gt;&lt;br&gt;Valid integer values for ORDER_DISCOUNT discounts: &amp;nbsp;&amp;nbsp;&lt;b&gt;Min:&lt;/b&gt; &lt;code&gt;5&lt;/code&gt; &amp;nbsp;&amp;nbsp;&lt;b&gt;Max:&lt;/b&gt; &lt;code&gt;80&lt;/code&gt;  &lt;br&gt;&lt;br&gt;For VOLUME_DISCOUNT discounts: Must be set to &lt;code&gt;0&lt;/code&gt; for the first discount rule.
     */
    private String percentageOffOrder;
    /**
     * Instantiates a new {@link DiscountBenefit} and sets the default values.
     */
    public DiscountBenefit() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DiscountBenefit}
     */
    @jakarta.annotation.Nonnull
    public static DiscountBenefit createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DiscountBenefit();
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
     * Gets the amountOffItem property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAmountOffItem() {
        return this.amountOffItem;
    }
    /**
     * Gets the amountOffOrder property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAmountOffOrder() {
        return this.amountOffOrder;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("amountOffItem", (n) -> { this.setAmountOffItem(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("amountOffOrder", (n) -> { this.setAmountOffOrder(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("percentageOffItem", (n) -> { this.setPercentageOffItem(n.getStringValue()); });
        deserializerMap.put("percentageOffOrder", (n) -> { this.setPercentageOffOrder(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the percentageOffItem property value. The percentage applied to the sales price that is discounted off the discounted item (or items) when the discount criteria is met.  &lt;br&gt;&lt;br&gt;Valid integer values for percentage off: &amp;nbsp;&amp;nbsp;&lt;b&gt;Min:&lt;/b&gt; &lt;code&gt;5&lt;/code&gt; &amp;nbsp;&amp;nbsp;&lt;b&gt;Max:&lt;/b&gt; &lt;code&gt;80&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPercentageOffItem() {
        return this.percentageOffItem;
    }
    /**
     * Gets the percentageOffOrder property value. Used for threshold discounts, this is the percentage of the order price that is discounted off the order when the discount criteria is met. This field is not value for markdown discounts.  &lt;br&gt;&lt;br&gt;Valid integer values for ORDER_DISCOUNT discounts: &amp;nbsp;&amp;nbsp;&lt;b&gt;Min:&lt;/b&gt; &lt;code&gt;5&lt;/code&gt; &amp;nbsp;&amp;nbsp;&lt;b&gt;Max:&lt;/b&gt; &lt;code&gt;80&lt;/code&gt;  &lt;br&gt;&lt;br&gt;For VOLUME_DISCOUNT discounts: Must be set to &lt;code&gt;0&lt;/code&gt; for the first discount rule.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPercentageOffOrder() {
        return this.percentageOffOrder;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("amountOffItem", this.getAmountOffItem());
        writer.writeObjectValue("amountOffOrder", this.getAmountOffOrder());
        writer.writeStringValue("percentageOffItem", this.getPercentageOffItem());
        writer.writeStringValue("percentageOffOrder", this.getPercentageOffOrder());
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
     * Sets the amountOffItem property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @param value Value to set for the amountOffItem property.
     */
    public void setAmountOffItem(@jakarta.annotation.Nullable final Amount value) {
        this.amountOffItem = value;
    }
    /**
     * Sets the amountOffOrder property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @param value Value to set for the amountOffOrder property.
     */
    public void setAmountOffOrder(@jakarta.annotation.Nullable final Amount value) {
        this.amountOffOrder = value;
    }
    /**
     * Sets the percentageOffItem property value. The percentage applied to the sales price that is discounted off the discounted item (or items) when the discount criteria is met.  &lt;br&gt;&lt;br&gt;Valid integer values for percentage off: &amp;nbsp;&amp;nbsp;&lt;b&gt;Min:&lt;/b&gt; &lt;code&gt;5&lt;/code&gt; &amp;nbsp;&amp;nbsp;&lt;b&gt;Max:&lt;/b&gt; &lt;code&gt;80&lt;/code&gt;
     * @param value Value to set for the percentageOffItem property.
     */
    public void setPercentageOffItem(@jakarta.annotation.Nullable final String value) {
        this.percentageOffItem = value;
    }
    /**
     * Sets the percentageOffOrder property value. Used for threshold discounts, this is the percentage of the order price that is discounted off the order when the discount criteria is met. This field is not value for markdown discounts.  &lt;br&gt;&lt;br&gt;Valid integer values for ORDER_DISCOUNT discounts: &amp;nbsp;&amp;nbsp;&lt;b&gt;Min:&lt;/b&gt; &lt;code&gt;5&lt;/code&gt; &amp;nbsp;&amp;nbsp;&lt;b&gt;Max:&lt;/b&gt; &lt;code&gt;80&lt;/code&gt;  &lt;br&gt;&lt;br&gt;For VOLUME_DISCOUNT discounts: Must be set to &lt;code&gt;0&lt;/code&gt; for the first discount rule.
     * @param value Value to set for the percentageOffOrder property.
     */
    public void setPercentageOffOrder(@jakarta.annotation.Nullable final String value) {
        this.percentageOffOrder = value;
    }
}
