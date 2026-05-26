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
 * This type defines the fields for a set of inventory selection rules.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Required:&lt;/b&gt; When &lt;b&gt;inventoryCriterionType&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_RULE&lt;/code&gt; or &lt;code&gt;INVENTORY_ANY&lt;/code&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RuleCriteria implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A list of seller inventory reference IDs to exclude from the discount.&lt;br&gt;&lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The request can have either &lt;b&gt;excludeInventoryItems&lt;/b&gt; or &lt;b&gt;excludeListingIds&lt;/b&gt; but not both.&lt;/p&gt; &lt;b&gt;Maximum:&lt;/b&gt; 100 parent items&lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum SKU or custom label length:&lt;/b&gt; 50 characters
     */
    private java.util.List<InventoryItem> excludeInventoryItems;
    /**
     * A list of eBay listing IDs to exclude from the discount.  &lt;br&gt;&lt;br&gt;&lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The request can have either &lt;b&gt;excludeInventoryItems&lt;/b&gt; or &lt;b&gt;excludeListingIds&lt;/b&gt; but not both.&lt;/p&gt; &lt;b&gt;Maximum:&lt;/b&gt; 100 parent items &lt;br&gt;&lt;b&gt;Maximum SKU or custom label length:&lt;/b&gt; 50 characters
     */
    private java.util.List<String> excludeListingIds;
    /**
     * A list of SKUs to remove from a markdown discount. The listed SKUs are &apos;marked up&apos; to their standard price after being part of the markdown discount.
     */
    private java.util.List<InventoryItem> markupInventoryItems;
    /**
     * A list of listing IDs to remove from a markdown discount. The listed items are &apos;marked up&apos; to their standard price after being part of the markdown discount.
     */
    private java.util.List<String> markupListingIds;
    /**
     * The container for the rules that select the items to be discounted.  &lt;br&gt;&lt;br&gt;&lt;i&gt;Required if &lt;/i&gt; &lt;b&gt;inventoryCriterionType&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_RULE&lt;/code&gt;. &lt;br&gt;&lt;br&gt;For information on using the contained fields, see &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Promotio &quot;&gt;Item discounts&lt;/a&gt;.
     */
    private java.util.List<SelectionRule> selectionRules;
    /**
     * Instantiates a new {@link RuleCriteria} and sets the default values.
     */
    public RuleCriteria() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RuleCriteria}
     */
    @jakarta.annotation.Nonnull
    public static RuleCriteria createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RuleCriteria();
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
     * Gets the excludeInventoryItems property value. A list of seller inventory reference IDs to exclude from the discount.&lt;br&gt;&lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The request can have either &lt;b&gt;excludeInventoryItems&lt;/b&gt; or &lt;b&gt;excludeListingIds&lt;/b&gt; but not both.&lt;/p&gt; &lt;b&gt;Maximum:&lt;/b&gt; 100 parent items&lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum SKU or custom label length:&lt;/b&gt; 50 characters
     * @return a {@link java.util.List<InventoryItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<InventoryItem> getExcludeInventoryItems() {
        return this.excludeInventoryItems;
    }
    /**
     * Gets the excludeListingIds property value. A list of eBay listing IDs to exclude from the discount.  &lt;br&gt;&lt;br&gt;&lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The request can have either &lt;b&gt;excludeInventoryItems&lt;/b&gt; or &lt;b&gt;excludeListingIds&lt;/b&gt; but not both.&lt;/p&gt; &lt;b&gt;Maximum:&lt;/b&gt; 100 parent items &lt;br&gt;&lt;b&gt;Maximum SKU or custom label length:&lt;/b&gt; 50 characters
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExcludeListingIds() {
        return this.excludeListingIds;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("excludeInventoryItems", (n) -> { this.setExcludeInventoryItems(n.getCollectionOfObjectValues(InventoryItem::createFromDiscriminatorValue)); });
        deserializerMap.put("excludeListingIds", (n) -> { this.setExcludeListingIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("markupInventoryItems", (n) -> { this.setMarkupInventoryItems(n.getCollectionOfObjectValues(InventoryItem::createFromDiscriminatorValue)); });
        deserializerMap.put("markupListingIds", (n) -> { this.setMarkupListingIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("selectionRules", (n) -> { this.setSelectionRules(n.getCollectionOfObjectValues(SelectionRule::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the markupInventoryItems property value. A list of SKUs to remove from a markdown discount. The listed SKUs are &apos;marked up&apos; to their standard price after being part of the markdown discount.
     * @return a {@link java.util.List<InventoryItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<InventoryItem> getMarkupInventoryItems() {
        return this.markupInventoryItems;
    }
    /**
     * Gets the markupListingIds property value. A list of listing IDs to remove from a markdown discount. The listed items are &apos;marked up&apos; to their standard price after being part of the markdown discount.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMarkupListingIds() {
        return this.markupListingIds;
    }
    /**
     * Gets the selectionRules property value. The container for the rules that select the items to be discounted.  &lt;br&gt;&lt;br&gt;&lt;i&gt;Required if &lt;/i&gt; &lt;b&gt;inventoryCriterionType&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_RULE&lt;/code&gt;. &lt;br&gt;&lt;br&gt;For information on using the contained fields, see &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Promotio &quot;&gt;Item discounts&lt;/a&gt;.
     * @return a {@link java.util.List<SelectionRule>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SelectionRule> getSelectionRules() {
        return this.selectionRules;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("excludeInventoryItems", this.getExcludeInventoryItems());
        writer.writeCollectionOfPrimitiveValues("excludeListingIds", this.getExcludeListingIds());
        writer.writeCollectionOfObjectValues("markupInventoryItems", this.getMarkupInventoryItems());
        writer.writeCollectionOfPrimitiveValues("markupListingIds", this.getMarkupListingIds());
        writer.writeCollectionOfObjectValues("selectionRules", this.getSelectionRules());
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
     * Sets the excludeInventoryItems property value. A list of seller inventory reference IDs to exclude from the discount.&lt;br&gt;&lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The request can have either &lt;b&gt;excludeInventoryItems&lt;/b&gt; or &lt;b&gt;excludeListingIds&lt;/b&gt; but not both.&lt;/p&gt; &lt;b&gt;Maximum:&lt;/b&gt; 100 parent items&lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum SKU or custom label length:&lt;/b&gt; 50 characters
     * @param value Value to set for the excludeInventoryItems property.
     */
    public void setExcludeInventoryItems(@jakarta.annotation.Nullable final java.util.List<InventoryItem> value) {
        this.excludeInventoryItems = value;
    }
    /**
     * Sets the excludeListingIds property value. A list of eBay listing IDs to exclude from the discount.  &lt;br&gt;&lt;br&gt;&lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The request can have either &lt;b&gt;excludeInventoryItems&lt;/b&gt; or &lt;b&gt;excludeListingIds&lt;/b&gt; but not both.&lt;/p&gt; &lt;b&gt;Maximum:&lt;/b&gt; 100 parent items &lt;br&gt;&lt;b&gt;Maximum SKU or custom label length:&lt;/b&gt; 50 characters
     * @param value Value to set for the excludeListingIds property.
     */
    public void setExcludeListingIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.excludeListingIds = value;
    }
    /**
     * Sets the markupInventoryItems property value. A list of SKUs to remove from a markdown discount. The listed SKUs are &apos;marked up&apos; to their standard price after being part of the markdown discount.
     * @param value Value to set for the markupInventoryItems property.
     */
    public void setMarkupInventoryItems(@jakarta.annotation.Nullable final java.util.List<InventoryItem> value) {
        this.markupInventoryItems = value;
    }
    /**
     * Sets the markupListingIds property value. A list of listing IDs to remove from a markdown discount. The listed items are &apos;marked up&apos; to their standard price after being part of the markdown discount.
     * @param value Value to set for the markupListingIds property.
     */
    public void setMarkupListingIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.markupListingIds = value;
    }
    /**
     * Sets the selectionRules property value. The container for the rules that select the items to be discounted.  &lt;br&gt;&lt;br&gt;&lt;i&gt;Required if &lt;/i&gt; &lt;b&gt;inventoryCriterionType&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_RULE&lt;/code&gt;. &lt;br&gt;&lt;br&gt;For information on using the contained fields, see &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Promotio &quot;&gt;Item discounts&lt;/a&gt;.
     * @param value Value to set for the selectionRules property.
     */
    public void setSelectionRules(@jakarta.annotation.Nullable final java.util.List<SelectionRule> value) {
        this.selectionRules = value;
    }
}
