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
 * A container that defines either the listing IDs or the selection rules that specify the items to include in the discount. Listing IDs can be either eBay listing IDs or a list of the seller&apos;s inventory reference IDs (know as SKUs or custom labels). See the &lt;b&gt;selectionRules&lt;/b&gt; container for the rule criteria you can use to select inventory.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; All listings in Discounts Manager discounts must support an electronic payment method.&lt;/p&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InventoryCriterion implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates how the items to be discounted are selected. You can include inventory by ID, using rules, or globally include all your inventory. 
     */
    private InventoryCriterionEnum inventoryCriterionType;
    /**
     * An array of containers for the seller&apos;s inventory reference IDs (also known as an &quot;SKU&quot; or &quot;custom label&quot;) to be added to the discount.&lt;br&gt;&lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The request can have either &lt;b&gt;inventoryItems&lt;/b&gt; or &lt;b&gt;listingIds&lt;/b&gt;, but not both.&lt;/p&gt;&lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 2000 parent items &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum SKU or custom label length:&lt;/b&gt; 50 characters &lt;br&gt;&lt;br&gt;&lt;i&gt;Required if&lt;/i&gt; &lt;b&gt;InventoryCriterionType&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_VALUE&lt;/code&gt;, you must specify either &lt;b&gt;inventoryItems&lt;/b&gt; or &lt;b&gt;listingIds&lt;/b&gt;.
     */
    private java.util.List<InventoryItem> inventoryItems;
    /**
     * An array of eBay listing IDs to be discounted. &lt;br&gt;&lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The request can have either &lt;b&gt;inventoryItems&lt;/b&gt; or &lt;b&gt;listingIds&lt;/b&gt;, but not both.&lt;/p&gt;  &lt;br&gt;&lt;b&gt;Required:&lt;/b&gt; All listings being discounted must offer an electronic payment method.&lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 2000 parent items &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum SKU or custom label length:&lt;/b&gt; 50 characters &lt;br&gt;&lt;br&gt;&lt;i&gt;Required if&lt;/i&gt; &lt;b&gt;InventoryCriterionType&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_VALUE&lt;/code&gt;, you must specify either &lt;b&gt;inventoryItems&lt;/b&gt; or &lt;b&gt;listingIds&lt;/b&gt;.
     */
    private java.util.List<String> listingIds;
    /**
     * This container defines a set of inventory selection rules for a discount.  &lt;br&gt;&lt;br&gt;When defining rule criteria, you must limit item exclusions to 100 IDs when you choose from live inventory.  &lt;br&gt;&lt;br&gt;Required if  &lt;b&gt;InventoryCriterionEnum&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_RULE&lt;/code&gt; or &lt;code&gt;INVENTORY_ANY&lt;/code&gt;.
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
        deserializerMap.put("inventoryCriterionType", (n) -> { this.setInventoryCriterionType(n.getEnumValue(InventoryCriterionEnum::forValue)); });
        deserializerMap.put("inventoryItems", (n) -> { this.setInventoryItems(n.getCollectionOfObjectValues(InventoryItem::createFromDiscriminatorValue)); });
        deserializerMap.put("listingIds", (n) -> { this.setListingIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("ruleCriteria", (n) -> { this.setRuleCriteria(n.getObjectValue(RuleCriteria::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the inventoryCriterionType property value. Indicates how the items to be discounted are selected. You can include inventory by ID, using rules, or globally include all your inventory. 
     * @return a {@link InventoryCriterionEnum}
     */
    @jakarta.annotation.Nullable
    public InventoryCriterionEnum getInventoryCriterionType() {
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
     * Gets the ruleCriteria property value. This container defines a set of inventory selection rules for a discount.  &lt;br&gt;&lt;br&gt;When defining rule criteria, you must limit item exclusions to 100 IDs when you choose from live inventory.  &lt;br&gt;&lt;br&gt;Required if  &lt;b&gt;InventoryCriterionEnum&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_RULE&lt;/code&gt; or &lt;code&gt;INVENTORY_ANY&lt;/code&gt;.
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
        writer.writeEnumValue("inventoryCriterionType", this.getInventoryCriterionType());
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
     * Sets the inventoryCriterionType property value. Indicates how the items to be discounted are selected. You can include inventory by ID, using rules, or globally include all your inventory. 
     * @param value Value to set for the inventoryCriterionType property.
     */
    public void setInventoryCriterionType(@jakarta.annotation.Nullable final InventoryCriterionEnum value) {
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
     * Sets the ruleCriteria property value. This container defines a set of inventory selection rules for a discount.  &lt;br&gt;&lt;br&gt;When defining rule criteria, you must limit item exclusions to 100 IDs when you choose from live inventory.  &lt;br&gt;&lt;br&gt;Required if  &lt;b&gt;InventoryCriterionEnum&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_RULE&lt;/code&gt; or &lt;code&gt;INVENTORY_ANY&lt;/code&gt;.
     * @param value Value to set for the ruleCriteria property.
     */
    public void setRuleCriteria(@jakarta.annotation.Nullable final RuleCriteria value) {
        this.ruleCriteria = value;
    }
}
