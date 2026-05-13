package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the fields that describe the discounts applied to a set of inventory items and the order in which the selection rules are applied.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SelectedInventoryDiscount implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container defines the discount as either a monetary amount or a percentage of the sales price.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Important!:&lt;/b&gt; You must populate one and only one of the fields in this container: &lt;ul&gt;&lt;li&gt;&lt;b&gt;amountOffItem&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;amountOffOrder&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;percentageOffItem&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;percentageOffOrder&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; Refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pm-specifying-discounts.html&quot;&gt;Configuring discounts for threshold discounts&lt;/a&gt; for information and examples on how to combine &lt;b&gt;discountBenefit&lt;/b&gt; and &lt;b&gt;discountSpecification&lt;/b&gt; values to create different types of discounts.&lt;/p&gt;
     */
    private DiscountBenefit discountBenefit;
    /**
     * A unique, eBay-generated ID that you can use to identify the discount. This field is ignored in POST and PUT operations.
     */
    private String discountId;
    /**
     * This type defines either the selections rules or the list of listing IDs for the discount. The &quot;listing IDs&quot; are are either the seller&apos;s item IDs or the eBay listing IDs.
     */
    private InventoryCriterion inventoryCriterion;
    /**
     * For markdown discounts, this field is reserved for future use. &lt;!--This field specifies the precedence of this set of inventory criteria, which is taken into account if an item is selected for multiple discounts by different sets of criteria. The criteria with the highest priority (lowest ruleOrder value) takes precedence over criteria with a lower precedence.--&gt;
     */
    private Integer ruleOrder;
    /**
     * Instantiates a new {@link SelectedInventoryDiscount} and sets the default values.
     */
    public SelectedInventoryDiscount() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SelectedInventoryDiscount}
     */
    @jakarta.annotation.Nonnull
    public static SelectedInventoryDiscount createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SelectedInventoryDiscount();
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
     * Gets the discountId property value. A unique, eBay-generated ID that you can use to identify the discount. This field is ignored in POST and PUT operations.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDiscountId() {
        return this.discountId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("discountBenefit", (n) -> { this.setDiscountBenefit(n.getObjectValue(DiscountBenefit::createFromDiscriminatorValue)); });
        deserializerMap.put("discountId", (n) -> { this.setDiscountId(n.getStringValue()); });
        deserializerMap.put("inventoryCriterion", (n) -> { this.setInventoryCriterion(n.getObjectValue(InventoryCriterion::createFromDiscriminatorValue)); });
        deserializerMap.put("ruleOrder", (n) -> { this.setRuleOrder(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inventoryCriterion property value. This type defines either the selections rules or the list of listing IDs for the discount. The &quot;listing IDs&quot; are are either the seller&apos;s item IDs or the eBay listing IDs.
     * @return a {@link InventoryCriterion}
     */
    @jakarta.annotation.Nullable
    public InventoryCriterion getInventoryCriterion() {
        return this.inventoryCriterion;
    }
    /**
     * Gets the ruleOrder property value. For markdown discounts, this field is reserved for future use. &lt;!--This field specifies the precedence of this set of inventory criteria, which is taken into account if an item is selected for multiple discounts by different sets of criteria. The criteria with the highest priority (lowest ruleOrder value) takes precedence over criteria with a lower precedence.--&gt;
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
        writer.writeStringValue("discountId", this.getDiscountId());
        writer.writeObjectValue("inventoryCriterion", this.getInventoryCriterion());
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
     * Sets the discountId property value. A unique, eBay-generated ID that you can use to identify the discount. This field is ignored in POST and PUT operations.
     * @param value Value to set for the discountId property.
     */
    public void setDiscountId(@jakarta.annotation.Nullable final String value) {
        this.discountId = value;
    }
    /**
     * Sets the inventoryCriterion property value. This type defines either the selections rules or the list of listing IDs for the discount. The &quot;listing IDs&quot; are are either the seller&apos;s item IDs or the eBay listing IDs.
     * @param value Value to set for the inventoryCriterion property.
     */
    public void setInventoryCriterion(@jakarta.annotation.Nullable final InventoryCriterion value) {
        this.inventoryCriterion = value;
    }
    /**
     * Sets the ruleOrder property value. For markdown discounts, this field is reserved for future use. &lt;!--This field specifies the precedence of this set of inventory criteria, which is taken into account if an item is selected for multiple discounts by different sets of criteria. The criteria with the highest priority (lowest ruleOrder value) takes precedence over criteria with a lower precedence.--&gt;
     * @param value Value to set for the ruleOrder property.
     */
    public void setRuleOrder(@jakarta.annotation.Nullable final Integer value) {
        this.ruleOrder = value;
    }
}
