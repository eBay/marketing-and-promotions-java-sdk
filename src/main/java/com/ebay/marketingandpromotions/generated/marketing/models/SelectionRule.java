package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines all rules/inclusion filters used to add listings to campaigns or discounts. Use of the specific fields is different for campaigns or discounts. See &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html &quot;&gt;Using the selectionRules container&lt;/a&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SelectionRule implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An array of product brands. For more details, see &lt;a href=&quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html &quot;&gt;Using the selectionRules container&lt;/a&gt;.
     */
    private java.util.List<String> brands;
    /**
     * This field contains an array of the associated category ID(s).&lt;br&gt;&lt;br&gt;For &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Promotio &quot;&gt;Item discounts&lt;/a&gt;, a single-item array containing the category ID associated with the discounts. Required when used in an Item discount and either specifying a &lt;b&gt;selectionRules&lt;/b&gt; container or when &lt;b&gt;inventoryCriterionType&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_RULE&lt;/code&gt;.&lt;br&gt;&lt;br&gt;For &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Campaign &quot;&gt;Promoted Listing campaigns&lt;/a&gt;, an array of category ID(s) associated with the campaign. &lt;br&gt;&lt;br&gt;For information on how to get category IDs, see &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#eBay &quot;&gt;eBay Marketplace category IDs&lt;/a&gt; and &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Seller &quot;&gt;Seller store category IDs&lt;/a&gt;
     */
    private java.util.List<String> categoryIds;
    /**
     * This enumerated value indicates if the category ID for the item is an identifier for eBay categories or for a seller&apos;s eBay store categories. &lt;br&gt;&lt;br&gt;For &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Campaign &quot;&gt;Promoted Listing campaigns&lt;/a&gt;, this field includes the type of the category ID for the item(s) to be included in the campaign.&lt;br&gt;&lt;br&gt;For &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Promotio &quot;&gt;Item discounts&lt;/a&gt;, this field identifies the scope for the corresponding array as eBay categories or for a seller&apos;s eBay store categories. Required when used in an Item discount and &lt;b&gt;inventoryCriterionType&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_RULE&lt;/code&gt;.  For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:CategoryScopeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String categoryScope;
    /**
     * A comma-separated list of unique identifiers for the conditions of listings to be included&lt;br&gt;&lt;br&gt;For &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Campaign &quot;&gt;Promoted Listing campaigns&lt;/a&gt;, refer to &lt;a href= &quot;/api-docs/sell/static/marketing/pl-campaign-flow-pls.html#add-by-rule &quot;&gt;Add items to the campaign&lt;/a&gt;. Up to four IDs can be specified.&lt;br&gt;&lt;br&gt;For &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Promotio &quot;&gt;Item discounts&lt;/a&gt;, refer to &lt;a href= &quot;/api-docs/sell/static/metadata/condition-id-values.html &quot;&gt;Item condition ID and name values&lt;/a&gt;.
     */
    private java.util.List<String> listingConditionIds;
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency.
     */
    private Amount maxPrice;
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency.
     */
    private Amount minPrice;
    /**
     * Instantiates a new {@link SelectionRule} and sets the default values.
     */
    public SelectionRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SelectionRule}
     */
    @jakarta.annotation.Nonnull
    public static SelectionRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SelectionRule();
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
     * Gets the brands property value. An array of product brands. For more details, see &lt;a href=&quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html &quot;&gt;Using the selectionRules container&lt;/a&gt;.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getBrands() {
        return this.brands;
    }
    /**
     * Gets the categoryIds property value. This field contains an array of the associated category ID(s).&lt;br&gt;&lt;br&gt;For &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Promotio &quot;&gt;Item discounts&lt;/a&gt;, a single-item array containing the category ID associated with the discounts. Required when used in an Item discount and either specifying a &lt;b&gt;selectionRules&lt;/b&gt; container or when &lt;b&gt;inventoryCriterionType&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_RULE&lt;/code&gt;.&lt;br&gt;&lt;br&gt;For &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Campaign &quot;&gt;Promoted Listing campaigns&lt;/a&gt;, an array of category ID(s) associated with the campaign. &lt;br&gt;&lt;br&gt;For information on how to get category IDs, see &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#eBay &quot;&gt;eBay Marketplace category IDs&lt;/a&gt; and &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Seller &quot;&gt;Seller store category IDs&lt;/a&gt;
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCategoryIds() {
        return this.categoryIds;
    }
    /**
     * Gets the categoryScope property value. This enumerated value indicates if the category ID for the item is an identifier for eBay categories or for a seller&apos;s eBay store categories. &lt;br&gt;&lt;br&gt;For &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Campaign &quot;&gt;Promoted Listing campaigns&lt;/a&gt;, this field includes the type of the category ID for the item(s) to be included in the campaign.&lt;br&gt;&lt;br&gt;For &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Promotio &quot;&gt;Item discounts&lt;/a&gt;, this field identifies the scope for the corresponding array as eBay categories or for a seller&apos;s eBay store categories. Required when used in an Item discount and &lt;b&gt;inventoryCriterionType&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_RULE&lt;/code&gt;.  For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:CategoryScopeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryScope() {
        return this.categoryScope;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("brands", (n) -> { this.setBrands(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("categoryIds", (n) -> { this.setCategoryIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("categoryScope", (n) -> { this.setCategoryScope(n.getStringValue()); });
        deserializerMap.put("listingConditionIds", (n) -> { this.setListingConditionIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("maxPrice", (n) -> { this.setMaxPrice(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("minPrice", (n) -> { this.setMinPrice(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the listingConditionIds property value. A comma-separated list of unique identifiers for the conditions of listings to be included&lt;br&gt;&lt;br&gt;For &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Campaign &quot;&gt;Promoted Listing campaigns&lt;/a&gt;, refer to &lt;a href= &quot;/api-docs/sell/static/marketing/pl-campaign-flow-pls.html#add-by-rule &quot;&gt;Add items to the campaign&lt;/a&gt;. Up to four IDs can be specified.&lt;br&gt;&lt;br&gt;For &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Promotio &quot;&gt;Item discounts&lt;/a&gt;, refer to &lt;a href= &quot;/api-docs/sell/static/metadata/condition-id-values.html &quot;&gt;Item condition ID and name values&lt;/a&gt;.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getListingConditionIds() {
        return this.listingConditionIds;
    }
    /**
     * Gets the maxPrice property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getMaxPrice() {
        return this.maxPrice;
    }
    /**
     * Gets the minPrice property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getMinPrice() {
        return this.minPrice;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("brands", this.getBrands());
        writer.writeCollectionOfPrimitiveValues("categoryIds", this.getCategoryIds());
        writer.writeStringValue("categoryScope", this.getCategoryScope());
        writer.writeCollectionOfPrimitiveValues("listingConditionIds", this.getListingConditionIds());
        writer.writeObjectValue("maxPrice", this.getMaxPrice());
        writer.writeObjectValue("minPrice", this.getMinPrice());
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
     * Sets the brands property value. An array of product brands. For more details, see &lt;a href=&quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html &quot;&gt;Using the selectionRules container&lt;/a&gt;.
     * @param value Value to set for the brands property.
     */
    public void setBrands(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.brands = value;
    }
    /**
     * Sets the categoryIds property value. This field contains an array of the associated category ID(s).&lt;br&gt;&lt;br&gt;For &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Promotio &quot;&gt;Item discounts&lt;/a&gt;, a single-item array containing the category ID associated with the discounts. Required when used in an Item discount and either specifying a &lt;b&gt;selectionRules&lt;/b&gt; container or when &lt;b&gt;inventoryCriterionType&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_RULE&lt;/code&gt;.&lt;br&gt;&lt;br&gt;For &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Campaign &quot;&gt;Promoted Listing campaigns&lt;/a&gt;, an array of category ID(s) associated with the campaign. &lt;br&gt;&lt;br&gt;For information on how to get category IDs, see &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#eBay &quot;&gt;eBay Marketplace category IDs&lt;/a&gt; and &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Seller &quot;&gt;Seller store category IDs&lt;/a&gt;
     * @param value Value to set for the categoryIds property.
     */
    public void setCategoryIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.categoryIds = value;
    }
    /**
     * Sets the categoryScope property value. This enumerated value indicates if the category ID for the item is an identifier for eBay categories or for a seller&apos;s eBay store categories. &lt;br&gt;&lt;br&gt;For &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Campaign &quot;&gt;Promoted Listing campaigns&lt;/a&gt;, this field includes the type of the category ID for the item(s) to be included in the campaign.&lt;br&gt;&lt;br&gt;For &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Promotio &quot;&gt;Item discounts&lt;/a&gt;, this field identifies the scope for the corresponding array as eBay categories or for a seller&apos;s eBay store categories. Required when used in an Item discount and &lt;b&gt;inventoryCriterionType&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_RULE&lt;/code&gt;.  For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:CategoryScopeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the categoryScope property.
     */
    public void setCategoryScope(@jakarta.annotation.Nullable final String value) {
        this.categoryScope = value;
    }
    /**
     * Sets the listingConditionIds property value. A comma-separated list of unique identifiers for the conditions of listings to be included&lt;br&gt;&lt;br&gt;For &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Campaign &quot;&gt;Promoted Listing campaigns&lt;/a&gt;, refer to &lt;a href= &quot;/api-docs/sell/static/marketing/pl-campaign-flow-pls.html#add-by-rule &quot;&gt;Add items to the campaign&lt;/a&gt;. Up to four IDs can be specified.&lt;br&gt;&lt;br&gt;For &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Promotio &quot;&gt;Item discounts&lt;/a&gt;, refer to &lt;a href= &quot;/api-docs/sell/static/metadata/condition-id-values.html &quot;&gt;Item condition ID and name values&lt;/a&gt;.
     * @param value Value to set for the listingConditionIds property.
     */
    public void setListingConditionIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.listingConditionIds = value;
    }
    /**
     * Sets the maxPrice property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @param value Value to set for the maxPrice property.
     */
    public void setMaxPrice(@jakarta.annotation.Nullable final Amount value) {
        this.maxPrice = value;
    }
    /**
     * Sets the minPrice property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @param value Value to set for the minPrice property.
     */
    public void setMinPrice(@jakarta.annotation.Nullable final Amount value) {
        this.minPrice = value;
    }
}
