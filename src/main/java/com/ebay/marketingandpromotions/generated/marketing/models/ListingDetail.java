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
 * This type defines the fields that describe a listing that is in a discount.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListingDetail implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency.
     */
    private Amount currentPrice;
    /**
     * If set to &lt;code&gt;true&lt;/code&gt;, the seller pays for the shipping (or that the item is marked for local pickup only) In this case, the listing does not have an associated shipping cost for the first listed domestic-shipping option (even if the first domestic-shipping option specifies a flat-rate or calculated shipping option). If &lt;code&gt;false&lt;/code&gt;, the buyer is required to pay for a flat-rate or calculated cost shipping service.
     */
    private Boolean freeShipping;
    /**
     * The seller&apos;s inventory reference ID for a listing. Also known as the &quot;SKU&quot; or &quot;custom label,&quot; an inventory reference ID is either the ID of the listing or, if the listing has variations (such as a shirt that&apos;s available in multiple sizes and colors), the ID of the parent listing.
     */
    private String inventoryReferenceId;
    /**
     * Indicates the type of the &lt;b&gt;inventoryReferenceId&lt;/b&gt;, which can be either a single-SKU or a multi-SKU listing (&lt;code&gt;INVENTORY_ITEM&lt;/code&gt; and &lt;code&gt;INVENTORY_ITEM_GROUP&lt;/code&gt;, respectively).  &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; This value is not currently returned in the response.
     */
    private String inventoryReferenceType;
    /**
     * The ID of the category that listing belongs to. The ID is a numeric and unique identifier for the category that is assigned by eBay.
     */
    private String listingCategoryId;
    /**
     * An eBay-assigned value that indicates condition of the associated item. For more information, see &lt;a href=&quot;/api-docs/sell/static/metadata/condition-id-values.html&quot;&gt;Item condition ID and name values&lt;/a&gt;.
     */
    private String listingCondition;
    /**
     * The ID of the condition associated with the item. For more information, see &lt;a href=&quot;/api-docs/sell/static/metadata/condition-id-values.html&quot;&gt;Item condition ID and name values&lt;/a&gt;.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt; This value is not currently returned in the response.&lt;/span&gt;
     */
    private String listingConditionId;
    /**
     * A unique eBay-assigned ID that is generated when the item is listed.
     */
    private String listingId;
    /**
     * A list of the status values assigned to the item and the date that each new status was assigned.
     */
    private java.util.List<ItemMarkdownStatus> listingPromotionStatuses;
    /**
     * The number of items being sold in the listing.
     */
    private Integer quantity;
    /**
     * Store CategoryId (if any) that to which the listing belongs. This field is blank if there is no seller Store category ID.
     */
    private String storeCategoryId;
    /**
     * The seller-defined title of the listing that a seller can use to identify the item.  This label is not displayed in end-user flows.
     */
    private String title;
    /**
     * Instantiates a new {@link ListingDetail} and sets the default values.
     */
    public ListingDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListingDetail}
     */
    @jakarta.annotation.Nonnull
    public static ListingDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListingDetail();
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
     * Gets the currentPrice property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getCurrentPrice() {
        return this.currentPrice;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("currentPrice", (n) -> { this.setCurrentPrice(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("freeShipping", (n) -> { this.setFreeShipping(n.getBooleanValue()); });
        deserializerMap.put("inventoryReferenceId", (n) -> { this.setInventoryReferenceId(n.getStringValue()); });
        deserializerMap.put("inventoryReferenceType", (n) -> { this.setInventoryReferenceType(n.getStringValue()); });
        deserializerMap.put("listingCategoryId", (n) -> { this.setListingCategoryId(n.getStringValue()); });
        deserializerMap.put("listingCondition", (n) -> { this.setListingCondition(n.getStringValue()); });
        deserializerMap.put("listingConditionId", (n) -> { this.setListingConditionId(n.getStringValue()); });
        deserializerMap.put("listingId", (n) -> { this.setListingId(n.getStringValue()); });
        deserializerMap.put("listingPromotionStatuses", (n) -> { this.setListingPromotionStatuses(n.getCollectionOfObjectValues(ItemMarkdownStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("quantity", (n) -> { this.setQuantity(n.getIntegerValue()); });
        deserializerMap.put("storeCategoryId", (n) -> { this.setStoreCategoryId(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the freeShipping property value. If set to &lt;code&gt;true&lt;/code&gt;, the seller pays for the shipping (or that the item is marked for local pickup only) In this case, the listing does not have an associated shipping cost for the first listed domestic-shipping option (even if the first domestic-shipping option specifies a flat-rate or calculated shipping option). If &lt;code&gt;false&lt;/code&gt;, the buyer is required to pay for a flat-rate or calculated cost shipping service.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getFreeShipping() {
        return this.freeShipping;
    }
    /**
     * Gets the inventoryReferenceId property value. The seller&apos;s inventory reference ID for a listing. Also known as the &quot;SKU&quot; or &quot;custom label,&quot; an inventory reference ID is either the ID of the listing or, if the listing has variations (such as a shirt that&apos;s available in multiple sizes and colors), the ID of the parent listing.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInventoryReferenceId() {
        return this.inventoryReferenceId;
    }
    /**
     * Gets the inventoryReferenceType property value. Indicates the type of the &lt;b&gt;inventoryReferenceId&lt;/b&gt;, which can be either a single-SKU or a multi-SKU listing (&lt;code&gt;INVENTORY_ITEM&lt;/code&gt; and &lt;code&gt;INVENTORY_ITEM_GROUP&lt;/code&gt;, respectively).  &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; This value is not currently returned in the response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInventoryReferenceType() {
        return this.inventoryReferenceType;
    }
    /**
     * Gets the listingCategoryId property value. The ID of the category that listing belongs to. The ID is a numeric and unique identifier for the category that is assigned by eBay.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getListingCategoryId() {
        return this.listingCategoryId;
    }
    /**
     * Gets the listingCondition property value. An eBay-assigned value that indicates condition of the associated item. For more information, see &lt;a href=&quot;/api-docs/sell/static/metadata/condition-id-values.html&quot;&gt;Item condition ID and name values&lt;/a&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getListingCondition() {
        return this.listingCondition;
    }
    /**
     * Gets the listingConditionId property value. The ID of the condition associated with the item. For more information, see &lt;a href=&quot;/api-docs/sell/static/metadata/condition-id-values.html&quot;&gt;Item condition ID and name values&lt;/a&gt;.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt; This value is not currently returned in the response.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getListingConditionId() {
        return this.listingConditionId;
    }
    /**
     * Gets the listingId property value. A unique eBay-assigned ID that is generated when the item is listed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getListingId() {
        return this.listingId;
    }
    /**
     * Gets the listingPromotionStatuses property value. A list of the status values assigned to the item and the date that each new status was assigned.
     * @return a {@link java.util.List<ItemMarkdownStatus>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ItemMarkdownStatus> getListingPromotionStatuses() {
        return this.listingPromotionStatuses;
    }
    /**
     * Gets the quantity property value. The number of items being sold in the listing.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getQuantity() {
        return this.quantity;
    }
    /**
     * Gets the storeCategoryId property value. Store CategoryId (if any) that to which the listing belongs. This field is blank if there is no seller Store category ID.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStoreCategoryId() {
        return this.storeCategoryId;
    }
    /**
     * Gets the title property value. The seller-defined title of the listing that a seller can use to identify the item.  This label is not displayed in end-user flows.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("currentPrice", this.getCurrentPrice());
        writer.writeBooleanValue("freeShipping", this.getFreeShipping());
        writer.writeStringValue("inventoryReferenceId", this.getInventoryReferenceId());
        writer.writeStringValue("inventoryReferenceType", this.getInventoryReferenceType());
        writer.writeStringValue("listingCategoryId", this.getListingCategoryId());
        writer.writeStringValue("listingCondition", this.getListingCondition());
        writer.writeStringValue("listingConditionId", this.getListingConditionId());
        writer.writeStringValue("listingId", this.getListingId());
        writer.writeCollectionOfObjectValues("listingPromotionStatuses", this.getListingPromotionStatuses());
        writer.writeIntegerValue("quantity", this.getQuantity());
        writer.writeStringValue("storeCategoryId", this.getStoreCategoryId());
        writer.writeStringValue("title", this.getTitle());
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
     * Sets the currentPrice property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @param value Value to set for the currentPrice property.
     */
    public void setCurrentPrice(@jakarta.annotation.Nullable final Amount value) {
        this.currentPrice = value;
    }
    /**
     * Sets the freeShipping property value. If set to &lt;code&gt;true&lt;/code&gt;, the seller pays for the shipping (or that the item is marked for local pickup only) In this case, the listing does not have an associated shipping cost for the first listed domestic-shipping option (even if the first domestic-shipping option specifies a flat-rate or calculated shipping option). If &lt;code&gt;false&lt;/code&gt;, the buyer is required to pay for a flat-rate or calculated cost shipping service.
     * @param value Value to set for the freeShipping property.
     */
    public void setFreeShipping(@jakarta.annotation.Nullable final Boolean value) {
        this.freeShipping = value;
    }
    /**
     * Sets the inventoryReferenceId property value. The seller&apos;s inventory reference ID for a listing. Also known as the &quot;SKU&quot; or &quot;custom label,&quot; an inventory reference ID is either the ID of the listing or, if the listing has variations (such as a shirt that&apos;s available in multiple sizes and colors), the ID of the parent listing.
     * @param value Value to set for the inventoryReferenceId property.
     */
    public void setInventoryReferenceId(@jakarta.annotation.Nullable final String value) {
        this.inventoryReferenceId = value;
    }
    /**
     * Sets the inventoryReferenceType property value. Indicates the type of the &lt;b&gt;inventoryReferenceId&lt;/b&gt;, which can be either a single-SKU or a multi-SKU listing (&lt;code&gt;INVENTORY_ITEM&lt;/code&gt; and &lt;code&gt;INVENTORY_ITEM_GROUP&lt;/code&gt;, respectively).  &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; This value is not currently returned in the response.
     * @param value Value to set for the inventoryReferenceType property.
     */
    public void setInventoryReferenceType(@jakarta.annotation.Nullable final String value) {
        this.inventoryReferenceType = value;
    }
    /**
     * Sets the listingCategoryId property value. The ID of the category that listing belongs to. The ID is a numeric and unique identifier for the category that is assigned by eBay.
     * @param value Value to set for the listingCategoryId property.
     */
    public void setListingCategoryId(@jakarta.annotation.Nullable final String value) {
        this.listingCategoryId = value;
    }
    /**
     * Sets the listingCondition property value. An eBay-assigned value that indicates condition of the associated item. For more information, see &lt;a href=&quot;/api-docs/sell/static/metadata/condition-id-values.html&quot;&gt;Item condition ID and name values&lt;/a&gt;.
     * @param value Value to set for the listingCondition property.
     */
    public void setListingCondition(@jakarta.annotation.Nullable final String value) {
        this.listingCondition = value;
    }
    /**
     * Sets the listingConditionId property value. The ID of the condition associated with the item. For more information, see &lt;a href=&quot;/api-docs/sell/static/metadata/condition-id-values.html&quot;&gt;Item condition ID and name values&lt;/a&gt;.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt; This value is not currently returned in the response.&lt;/span&gt;
     * @param value Value to set for the listingConditionId property.
     */
    public void setListingConditionId(@jakarta.annotation.Nullable final String value) {
        this.listingConditionId = value;
    }
    /**
     * Sets the listingId property value. A unique eBay-assigned ID that is generated when the item is listed.
     * @param value Value to set for the listingId property.
     */
    public void setListingId(@jakarta.annotation.Nullable final String value) {
        this.listingId = value;
    }
    /**
     * Sets the listingPromotionStatuses property value. A list of the status values assigned to the item and the date that each new status was assigned.
     * @param value Value to set for the listingPromotionStatuses property.
     */
    public void setListingPromotionStatuses(@jakarta.annotation.Nullable final java.util.List<ItemMarkdownStatus> value) {
        this.listingPromotionStatuses = value;
    }
    /**
     * Sets the quantity property value. The number of items being sold in the listing.
     * @param value Value to set for the quantity property.
     */
    public void setQuantity(@jakarta.annotation.Nullable final Integer value) {
        this.quantity = value;
    }
    /**
     * Sets the storeCategoryId property value. Store CategoryId (if any) that to which the listing belongs. This field is blank if there is no seller Store category ID.
     * @param value Value to set for the storeCategoryId property.
     */
    public void setStoreCategoryId(@jakarta.annotation.Nullable final String value) {
        this.storeCategoryId = value;
    }
    /**
     * Sets the title property value. The seller-defined title of the listing that a seller can use to identify the item.  This label is not displayed in end-user flows.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
}
