package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines either the selections rules or the list of listing IDs for the discount. The &quot;listing IDs&quot; are are either the seller&apos;s item IDs or the eBay listing IDs.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InventoryCriterion implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates how the items to be discounted are selected. You can include inventory by ID, using rules, or globally include all your inventory.  For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/sme:InventoryCriterionEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String inventoryCriterionType;
    /**
     * An array of containers for the seller&apos;s inventory reference IDs (also known as an &quot;SKU&quot; or &quot;custom label&quot;) to be added to the discount.&lt;br&gt;&lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The request can have either &lt;b&gt;inventoryItems&lt;/b&gt; or &lt;b&gt;listingIds&lt;/b&gt;, but not both.&lt;/p&gt;&lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 2000 parent items &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum SKU or custom label length:&lt;/b&gt; 50 characters &lt;br&gt;&lt;br&gt;&lt;i&gt;Required if&lt;/i&gt; &lt;b&gt;InventoryCriterionType&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_VALUE&lt;/code&gt;, you must specify either &lt;b&gt;inventoryItems&lt;/b&gt; or &lt;b&gt;listingIds&lt;/b&gt;.
     */
    private java.util.List<InventoryItem> inventoryItems;
    /**
     * An array of eBay listing IDs to be discounted. &lt;br&gt;&lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The request can have either &lt;b&gt;inventoryItems&lt;/b&gt; or &lt;b&gt;listingIds&lt;/b&gt;, but not both.&lt;/p&gt;  &lt;br&gt;&lt;b&gt;Required:&lt;/b&gt; All listings being discounted must offer an electronic payment method.&lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 2000 parent items &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum SKU or custom label length:&lt;/b&gt; 50 characters &lt;br&gt;&lt;br&gt;&lt;i&gt;Required if&lt;/i&gt; &lt;b&gt;InventoryCriterionType&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_VALUE&lt;/code&gt;, you must specify either &lt;b&gt;inventoryItems&lt;/b&gt; or &lt;b&gt;listingIds&lt;/b&gt;.
     */
    private java.util.List<String> listingIds;
    /**
     * This type defines the fields for a set of inventory selection rules.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Required:&lt;/b&gt; When &lt;b&gt;inventoryCriterionType&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_RULE&lt;/code&gt; or &lt;code&gt;INVENTORY_ANY&lt;/code&gt;.
     */
    private RuleCriteria ruleCriteria;
    /**
     * Instantiates a new {@link InventoryCriterion} and sets the default values.
     */
    public InventoryCriterion() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InventoryCriterion}
     */
    @jakarta.annotation.Nonnull
    public static InventoryCriterion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InventoryCriterion();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("inventoryCriterionType", (n) -> { this.setInventoryCriterionType(n.getStringValue()); });
        deserializerMap.put("inventoryItems", (n) -> { this.setInventoryItems(n.getCollectionOfObjectValues(InventoryItem::createFromDiscriminatorValue)); });
        deserializerMap.put("listingIds", (n) -> { this.setListingIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("ruleCriteria", (n) -> { this.setRuleCriteria(n.getObjectValue(RuleCriteria::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the inventoryCriterionType property value. Indicates how the items to be discounted are selected. You can include inventory by ID, using rules, or globally include all your inventory.  For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/sme:InventoryCriterionEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInventoryCriterionType() {
        return this.inventoryCriterionType;
    }
    /**
     * Gets the inventoryItems property value. An array of containers for the seller&apos;s inventory reference IDs (also known as an &quot;SKU&quot; or &quot;custom label&quot;) to be added to the discount.&lt;br&gt;&lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The request can have either &lt;b&gt;inventoryItems&lt;/b&gt; or &lt;b&gt;listingIds&lt;/b&gt;, but not both.&lt;/p&gt;&lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 2000 parent items &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum SKU or custom label length:&lt;/b&gt; 50 characters &lt;br&gt;&lt;br&gt;&lt;i&gt;Required if&lt;/i&gt; &lt;b&gt;InventoryCriterionType&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_VALUE&lt;/code&gt;, you must specify either &lt;b&gt;inventoryItems&lt;/b&gt; or &lt;b&gt;listingIds&lt;/b&gt;.
     * @return a {@link java.util.List<InventoryItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<InventoryItem> getInventoryItems() {
        return this.inventoryItems;
    }
    /**
     * Gets the listingIds property value. An array of eBay listing IDs to be discounted. &lt;br&gt;&lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The request can have either &lt;b&gt;inventoryItems&lt;/b&gt; or &lt;b&gt;listingIds&lt;/b&gt;, but not both.&lt;/p&gt;  &lt;br&gt;&lt;b&gt;Required:&lt;/b&gt; All listings being discounted must offer an electronic payment method.&lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 2000 parent items &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum SKU or custom label length:&lt;/b&gt; 50 characters &lt;br&gt;&lt;br&gt;&lt;i&gt;Required if&lt;/i&gt; &lt;b&gt;InventoryCriterionType&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_VALUE&lt;/code&gt;, you must specify either &lt;b&gt;inventoryItems&lt;/b&gt; or &lt;b&gt;listingIds&lt;/b&gt;.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getListingIds() {
        return this.listingIds;
    }
    /**
     * Gets the ruleCriteria property value. This type defines the fields for a set of inventory selection rules.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Required:&lt;/b&gt; When &lt;b&gt;inventoryCriterionType&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_RULE&lt;/code&gt; or &lt;code&gt;INVENTORY_ANY&lt;/code&gt;.
     * @return a {@link RuleCriteria}
     */
    @jakarta.annotation.Nullable
    public RuleCriteria getRuleCriteria() {
        return this.ruleCriteria;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("inventoryCriterionType", this.getInventoryCriterionType());
        writer.writeCollectionOfObjectValues("inventoryItems", this.getInventoryItems());
        writer.writeCollectionOfPrimitiveValues("listingIds", this.getListingIds());
        writer.writeObjectValue("ruleCriteria", this.getRuleCriteria());
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
     * Sets the inventoryCriterionType property value. Indicates how the items to be discounted are selected. You can include inventory by ID, using rules, or globally include all your inventory.  For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/sme:InventoryCriterionEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the inventoryCriterionType property.
     */
    public void setInventoryCriterionType(@jakarta.annotation.Nullable final String value) {
        this.inventoryCriterionType = value;
    }
    /**
     * Sets the inventoryItems property value. An array of containers for the seller&apos;s inventory reference IDs (also known as an &quot;SKU&quot; or &quot;custom label&quot;) to be added to the discount.&lt;br&gt;&lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The request can have either &lt;b&gt;inventoryItems&lt;/b&gt; or &lt;b&gt;listingIds&lt;/b&gt;, but not both.&lt;/p&gt;&lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 2000 parent items &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum SKU or custom label length:&lt;/b&gt; 50 characters &lt;br&gt;&lt;br&gt;&lt;i&gt;Required if&lt;/i&gt; &lt;b&gt;InventoryCriterionType&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_VALUE&lt;/code&gt;, you must specify either &lt;b&gt;inventoryItems&lt;/b&gt; or &lt;b&gt;listingIds&lt;/b&gt;.
     * @param value Value to set for the inventoryItems property.
     */
    public void setInventoryItems(@jakarta.annotation.Nullable final java.util.List<InventoryItem> value) {
        this.inventoryItems = value;
    }
    /**
     * Sets the listingIds property value. An array of eBay listing IDs to be discounted. &lt;br&gt;&lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The request can have either &lt;b&gt;inventoryItems&lt;/b&gt; or &lt;b&gt;listingIds&lt;/b&gt;, but not both.&lt;/p&gt;  &lt;br&gt;&lt;b&gt;Required:&lt;/b&gt; All listings being discounted must offer an electronic payment method.&lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 2000 parent items &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum SKU or custom label length:&lt;/b&gt; 50 characters &lt;br&gt;&lt;br&gt;&lt;i&gt;Required if&lt;/i&gt; &lt;b&gt;InventoryCriterionType&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_VALUE&lt;/code&gt;, you must specify either &lt;b&gt;inventoryItems&lt;/b&gt; or &lt;b&gt;listingIds&lt;/b&gt;.
     * @param value Value to set for the listingIds property.
     */
    public void setListingIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.listingIds = value;
    }
    /**
     * Sets the ruleCriteria property value. This type defines the fields for a set of inventory selection rules.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Required:&lt;/b&gt; When &lt;b&gt;inventoryCriterionType&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_RULE&lt;/code&gt; or &lt;code&gt;INVENTORY_ANY&lt;/code&gt;.
     * @param value Value to set for the ruleCriteria property.
     */
    public void setRuleCriteria(@jakarta.annotation.Nullable final RuleCriteria value) {
        this.ruleCriteria = value;
    }
}
