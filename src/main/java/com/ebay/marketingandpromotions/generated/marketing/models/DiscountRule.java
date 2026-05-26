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
 * This complex type defines a discount as being either a monetary amount or a percentage of a sales price that&apos;s subtracted from the price of an item or order. &lt;p&gt;Set the amount of the discount and the rules that govern when the discount triggers using the &lt;b&gt;discountBenefit&lt;/b&gt; and &lt;b&gt;discountSpecification&lt;/b&gt; fields.&lt;/p&gt;  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; In &lt;b&gt;volume pricing discounts&lt;/b&gt;, you must configure at least two &lt;b&gt;discountRule&lt;/b&gt; containers and at most four.&lt;/p&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DiscountRule implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container defines the discount as either a monetary amount or a percentage of the sales price.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Important!:&lt;/b&gt; You must populate one and only one of the fields in this container: &lt;ul&gt;&lt;li&gt;&lt;b&gt;amountOffItem&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;amountOffOrder&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;percentageOffItem&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;percentageOffOrder&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; Refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pm-specifying-discounts.html&quot;&gt;Configuring discounts for threshold discounts&lt;/a&gt; for information and examples on how to combine &lt;b&gt;discountBenefit&lt;/b&gt; and &lt;b&gt;discountSpecification&lt;/b&gt; values to create different types of discounts.&lt;/p&gt;
     */
    private DiscountBenefit discountBenefit;
    /**
     * This container defines the criteria for when the discounts trigger, such as the minimum quantity the buyer must purchase before the discount kicks in. The discount is applied each time the criteria defined by this container is met.  &lt;p&gt;&lt;b&gt;Note:&lt;/b&gt; When configuring the rules that govern when the discounts are applied, populate just one of the following fields in the &lt;b&gt;discountSpecification&lt;/b&gt; container:&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;&lt;b&gt;minAmount&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;minQuantity&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;forEachQuantity&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;forEachAmount&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt; &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; Refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pm-specifying-discounts.html&quot;&gt;Configuring threshold discounts&lt;/a&gt; for information and examples on how to combine &lt;b&gt;discountBenefit&lt;/b&gt; and &lt;b&gt;discountSpecification&lt;/b&gt; to create different types of discounts.&lt;/p&gt;
     */
    private DiscountSpecification discountSpecification;
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency.
     */
    private Amount maxDiscountAmount;
    /**
     * This field indicates the order in which the &lt;b&gt;discountRules&lt;/b&gt; are presented. The value specified for this field must equal the associated &lt;b&gt;minQuantity&lt;/b&gt; value. &lt;br&gt;&lt;br&gt;&lt;i&gt;Required if &lt;/i&gt; you are creating a volume pricing discount.
     */
    private Integer ruleOrder;
    /**
     * Instantiates a new {@link DiscountRule} and sets the default values.
     */
    public DiscountRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DiscountRule}
     */
    @jakarta.annotation.Nonnull
    public static DiscountRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DiscountRule();
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
     * Gets the discountBenefit property value. This container defines the discount as either a monetary amount or a percentage of the sales price.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Important!:&lt;/b&gt; You must populate one and only one of the fields in this container: &lt;ul&gt;&lt;li&gt;&lt;b&gt;amountOffItem&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;amountOffOrder&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;percentageOffItem&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;percentageOffOrder&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; Refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pm-specifying-discounts.html&quot;&gt;Configuring discounts for threshold discounts&lt;/a&gt; for information and examples on how to combine &lt;b&gt;discountBenefit&lt;/b&gt; and &lt;b&gt;discountSpecification&lt;/b&gt; values to create different types of discounts.&lt;/p&gt;
     * @return a {@link DiscountBenefit}
     */
    @jakarta.annotation.Nullable
    public DiscountBenefit getDiscountBenefit() {
        return this.discountBenefit;
    }
    /**
     * Gets the discountSpecification property value. This container defines the criteria for when the discounts trigger, such as the minimum quantity the buyer must purchase before the discount kicks in. The discount is applied each time the criteria defined by this container is met.  &lt;p&gt;&lt;b&gt;Note:&lt;/b&gt; When configuring the rules that govern when the discounts are applied, populate just one of the following fields in the &lt;b&gt;discountSpecification&lt;/b&gt; container:&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;&lt;b&gt;minAmount&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;minQuantity&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;forEachQuantity&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;forEachAmount&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt; &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; Refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pm-specifying-discounts.html&quot;&gt;Configuring threshold discounts&lt;/a&gt; for information and examples on how to combine &lt;b&gt;discountBenefit&lt;/b&gt; and &lt;b&gt;discountSpecification&lt;/b&gt; to create different types of discounts.&lt;/p&gt;
     * @return a {@link DiscountSpecification}
     */
    @jakarta.annotation.Nullable
    public DiscountSpecification getDiscountSpecification() {
        return this.discountSpecification;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("discountBenefit", (n) -> { this.setDiscountBenefit(n.getObjectValue(DiscountBenefit::createFromDiscriminatorValue)); });
        deserializerMap.put("discountSpecification", (n) -> { this.setDiscountSpecification(n.getObjectValue(DiscountSpecification::createFromDiscriminatorValue)); });
        deserializerMap.put("maxDiscountAmount", (n) -> { this.setMaxDiscountAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("ruleOrder", (n) -> { this.setRuleOrder(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maxDiscountAmount property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getMaxDiscountAmount() {
        return this.maxDiscountAmount;
    }
    /**
     * Gets the ruleOrder property value. This field indicates the order in which the &lt;b&gt;discountRules&lt;/b&gt; are presented. The value specified for this field must equal the associated &lt;b&gt;minQuantity&lt;/b&gt; value. &lt;br&gt;&lt;br&gt;&lt;i&gt;Required if &lt;/i&gt; you are creating a volume pricing discount.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRuleOrder() {
        return this.ruleOrder;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("discountBenefit", this.getDiscountBenefit());
        writer.writeObjectValue("discountSpecification", this.getDiscountSpecification());
        writer.writeObjectValue("maxDiscountAmount", this.getMaxDiscountAmount());
        writer.writeIntegerValue("ruleOrder", this.getRuleOrder());
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
     * Sets the discountBenefit property value. This container defines the discount as either a monetary amount or a percentage of the sales price.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Important!:&lt;/b&gt; You must populate one and only one of the fields in this container: &lt;ul&gt;&lt;li&gt;&lt;b&gt;amountOffItem&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;amountOffOrder&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;percentageOffItem&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;percentageOffOrder&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; Refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pm-specifying-discounts.html&quot;&gt;Configuring discounts for threshold discounts&lt;/a&gt; for information and examples on how to combine &lt;b&gt;discountBenefit&lt;/b&gt; and &lt;b&gt;discountSpecification&lt;/b&gt; values to create different types of discounts.&lt;/p&gt;
     * @param value Value to set for the discountBenefit property.
     */
    public void setDiscountBenefit(@jakarta.annotation.Nullable final DiscountBenefit value) {
        this.discountBenefit = value;
    }
    /**
     * Sets the discountSpecification property value. This container defines the criteria for when the discounts trigger, such as the minimum quantity the buyer must purchase before the discount kicks in. The discount is applied each time the criteria defined by this container is met.  &lt;p&gt;&lt;b&gt;Note:&lt;/b&gt; When configuring the rules that govern when the discounts are applied, populate just one of the following fields in the &lt;b&gt;discountSpecification&lt;/b&gt; container:&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;&lt;b&gt;minAmount&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;minQuantity&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;forEachQuantity&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;forEachAmount&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt; &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; Refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pm-specifying-discounts.html&quot;&gt;Configuring threshold discounts&lt;/a&gt; for information and examples on how to combine &lt;b&gt;discountBenefit&lt;/b&gt; and &lt;b&gt;discountSpecification&lt;/b&gt; to create different types of discounts.&lt;/p&gt;
     * @param value Value to set for the discountSpecification property.
     */
    public void setDiscountSpecification(@jakarta.annotation.Nullable final DiscountSpecification value) {
        this.discountSpecification = value;
    }
    /**
     * Sets the maxDiscountAmount property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @param value Value to set for the maxDiscountAmount property.
     */
    public void setMaxDiscountAmount(@jakarta.annotation.Nullable final Amount value) {
        this.maxDiscountAmount = value;
    }
    /**
     * Sets the ruleOrder property value. This field indicates the order in which the &lt;b&gt;discountRules&lt;/b&gt; are presented. The value specified for this field must equal the associated &lt;b&gt;minQuantity&lt;/b&gt; value. &lt;br&gt;&lt;br&gt;&lt;i&gt;Required if &lt;/i&gt; you are creating a volume pricing discount.
     * @param value Value to set for the ruleOrder property.
     */
    public void setRuleOrder(@jakarta.annotation.Nullable final Integer value) {
        this.ruleOrder = value;
    }
}
