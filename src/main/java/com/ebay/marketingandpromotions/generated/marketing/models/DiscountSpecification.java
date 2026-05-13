package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This container defines the criteria for when the discounts trigger, such as the minimum quantity the buyer must purchase before the discount kicks in. The discount is applied each time the criteria defined by this container is met.  &lt;p&gt;&lt;b&gt;Note:&lt;/b&gt; When configuring the rules that govern when the discounts are applied, populate just one of the following fields in the &lt;b&gt;discountSpecification&lt;/b&gt; container:&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;&lt;b&gt;minAmount&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;minQuantity&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;forEachQuantity&lt;/b&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;forEachAmount&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt; &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; Refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pm-specifying-discounts.html&quot;&gt;Configuring threshold discounts&lt;/a&gt; for information and examples on how to combine &lt;b&gt;discountBenefit&lt;/b&gt; and &lt;b&gt;discountSpecification&lt;/b&gt; to create different types of discounts.&lt;/p&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DiscountSpecification implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency.
     */
    private Amount forEachAmount;
    /**
     * The number of items that must be purchased in order to qualify for the discount.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt; &lt;br&gt;&lt;code&gt; &amp;nbsp; 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, &lt;br&gt; &amp;nbsp; 12, 13, 14, 15, 16, 17, 18, 19 &lt;br&gt; &amp;nbsp; 20, 25, 50, 75, 100&lt;/code&gt;
     */
    private Integer forEachQuantity;
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency.
     */
    private Amount minAmount;
    /**
     * The minimum quantity of discounted items that needs to be bought in order to qualify for the discount.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt; &lt;br&gt;&lt;code&gt; &amp;nbsp; 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, &lt;br&gt; &amp;nbsp; 12, 13, 14, 15, 16, 17, 18, 19 &lt;br&gt; &amp;nbsp; 20, 25, 50, 75, 100&lt;/code&gt;
     */
    private Integer minQuantity;
    /**
     * Use this field to configure &quot;Buy One Get One&quot; (or &lt;b&gt;BOGO&lt;/b&gt;) discounts.  &lt;br&gt;&lt;br&gt;You must couple this field with &lt;b&gt;forEachQuantity&lt;/b&gt; and an &lt;b&gt;amountOffItem&lt;/b&gt; or &lt;b&gt;percentOffItem&lt;/b&gt; field to configure your BOGO discount. This field is not valid with order-based discounts. &lt;br&gt;&lt;br&gt;The value of this field represents the number of items to be discounted when other discount criteria is met. For example, when the buyer adds the number of items identified by the &lt;b&gt;forEachQuantity&lt;/b&gt; value to their cart, they are then eligible to receive the stated discount from an additional number of like items (the number of which is identified by this field) when they add those items to their cart. To receive the discount, the buyer must purchase the number of items indicated by  &lt;b&gt;forEachQuantity&lt;/b&gt; &lt;i&gt;plus&lt;/i&gt; the number indicated by this field.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt; &lt;br&gt;&lt;code&gt; &amp;nbsp; 1, 2, 3, 4, 5, 6, 7, 8, 9, 10&lt;/code&gt;
     */
    private Integer numberOfDiscountedItems;
    /**
     * Instantiates a new {@link DiscountSpecification} and sets the default values.
     */
    public DiscountSpecification() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DiscountSpecification}
     */
    @jakarta.annotation.Nonnull
    public static DiscountSpecification createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DiscountSpecification();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("forEachAmount", (n) -> { this.setForEachAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("forEachQuantity", (n) -> { this.setForEachQuantity(n.getIntegerValue()); });
        deserializerMap.put("minAmount", (n) -> { this.setMinAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("minQuantity", (n) -> { this.setMinQuantity(n.getIntegerValue()); });
        deserializerMap.put("numberOfDiscountedItems", (n) -> { this.setNumberOfDiscountedItems(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the forEachAmount property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getForEachAmount() {
        return this.forEachAmount;
    }
    /**
     * Gets the forEachQuantity property value. The number of items that must be purchased in order to qualify for the discount.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt; &lt;br&gt;&lt;code&gt; &amp;nbsp; 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, &lt;br&gt; &amp;nbsp; 12, 13, 14, 15, 16, 17, 18, 19 &lt;br&gt; &amp;nbsp; 20, 25, 50, 75, 100&lt;/code&gt;
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getForEachQuantity() {
        return this.forEachQuantity;
    }
    /**
     * Gets the minAmount property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getMinAmount() {
        return this.minAmount;
    }
    /**
     * Gets the minQuantity property value. The minimum quantity of discounted items that needs to be bought in order to qualify for the discount.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt; &lt;br&gt;&lt;code&gt; &amp;nbsp; 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, &lt;br&gt; &amp;nbsp; 12, 13, 14, 15, 16, 17, 18, 19 &lt;br&gt; &amp;nbsp; 20, 25, 50, 75, 100&lt;/code&gt;
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMinQuantity() {
        return this.minQuantity;
    }
    /**
     * Gets the numberOfDiscountedItems property value. Use this field to configure &quot;Buy One Get One&quot; (or &lt;b&gt;BOGO&lt;/b&gt;) discounts.  &lt;br&gt;&lt;br&gt;You must couple this field with &lt;b&gt;forEachQuantity&lt;/b&gt; and an &lt;b&gt;amountOffItem&lt;/b&gt; or &lt;b&gt;percentOffItem&lt;/b&gt; field to configure your BOGO discount. This field is not valid with order-based discounts. &lt;br&gt;&lt;br&gt;The value of this field represents the number of items to be discounted when other discount criteria is met. For example, when the buyer adds the number of items identified by the &lt;b&gt;forEachQuantity&lt;/b&gt; value to their cart, they are then eligible to receive the stated discount from an additional number of like items (the number of which is identified by this field) when they add those items to their cart. To receive the discount, the buyer must purchase the number of items indicated by  &lt;b&gt;forEachQuantity&lt;/b&gt; &lt;i&gt;plus&lt;/i&gt; the number indicated by this field.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt; &lt;br&gt;&lt;code&gt; &amp;nbsp; 1, 2, 3, 4, 5, 6, 7, 8, 9, 10&lt;/code&gt;
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfDiscountedItems() {
        return this.numberOfDiscountedItems;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("forEachAmount", this.getForEachAmount());
        writer.writeIntegerValue("forEachQuantity", this.getForEachQuantity());
        writer.writeObjectValue("minAmount", this.getMinAmount());
        writer.writeIntegerValue("minQuantity", this.getMinQuantity());
        writer.writeIntegerValue("numberOfDiscountedItems", this.getNumberOfDiscountedItems());
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
     * Sets the forEachAmount property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @param value Value to set for the forEachAmount property.
     */
    public void setForEachAmount(@jakarta.annotation.Nullable final Amount value) {
        this.forEachAmount = value;
    }
    /**
     * Sets the forEachQuantity property value. The number of items that must be purchased in order to qualify for the discount.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt; &lt;br&gt;&lt;code&gt; &amp;nbsp; 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, &lt;br&gt; &amp;nbsp; 12, 13, 14, 15, 16, 17, 18, 19 &lt;br&gt; &amp;nbsp; 20, 25, 50, 75, 100&lt;/code&gt;
     * @param value Value to set for the forEachQuantity property.
     */
    public void setForEachQuantity(@jakarta.annotation.Nullable final Integer value) {
        this.forEachQuantity = value;
    }
    /**
     * Sets the minAmount property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @param value Value to set for the minAmount property.
     */
    public void setMinAmount(@jakarta.annotation.Nullable final Amount value) {
        this.minAmount = value;
    }
    /**
     * Sets the minQuantity property value. The minimum quantity of discounted items that needs to be bought in order to qualify for the discount.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt; &lt;br&gt;&lt;code&gt; &amp;nbsp; 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, &lt;br&gt; &amp;nbsp; 12, 13, 14, 15, 16, 17, 18, 19 &lt;br&gt; &amp;nbsp; 20, 25, 50, 75, 100&lt;/code&gt;
     * @param value Value to set for the minQuantity property.
     */
    public void setMinQuantity(@jakarta.annotation.Nullable final Integer value) {
        this.minQuantity = value;
    }
    /**
     * Sets the numberOfDiscountedItems property value. Use this field to configure &quot;Buy One Get One&quot; (or &lt;b&gt;BOGO&lt;/b&gt;) discounts.  &lt;br&gt;&lt;br&gt;You must couple this field with &lt;b&gt;forEachQuantity&lt;/b&gt; and an &lt;b&gt;amountOffItem&lt;/b&gt; or &lt;b&gt;percentOffItem&lt;/b&gt; field to configure your BOGO discount. This field is not valid with order-based discounts. &lt;br&gt;&lt;br&gt;The value of this field represents the number of items to be discounted when other discount criteria is met. For example, when the buyer adds the number of items identified by the &lt;b&gt;forEachQuantity&lt;/b&gt; value to their cart, they are then eligible to receive the stated discount from an additional number of like items (the number of which is identified by this field) when they add those items to their cart. To receive the discount, the buyer must purchase the number of items indicated by  &lt;b&gt;forEachQuantity&lt;/b&gt; &lt;i&gt;plus&lt;/i&gt; the number indicated by this field.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt; &lt;br&gt;&lt;code&gt; &amp;nbsp; 1, 2, 3, 4, 5, 6, 7, 8, 9, 10&lt;/code&gt;
     * @param value Value to set for the numberOfDiscountedItems property.
     */
    public void setNumberOfDiscountedItems(@jakarta.annotation.Nullable final Integer value) {
        this.numberOfDiscountedItems = value;
    }
}
