package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the fields for the seller inventory reference IDs (also known as an &quot;SKU&quot; or &quot;custom label&quot;).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InventoryItem implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of a single-item listing or a multi-variation listing.&lt;br&gt;&lt;br&gt;To create an ad for a single-item listing, set the &lt;b&gt;inventoryReferenceType&lt;/b&gt; value to &lt;code&gt;INVENTORY_ITEM&lt;/code&gt; and specify and item ID or a SKU (if the SKU is defined in the listing)&lt;br&gt;&lt;br&gt;To create an ad for a multi-variation listing, set the &lt;b&gt;inventoryReferenceType&lt;/b&gt; value to &lt;code&gt;INVENTORY_ITEM_GROUP&lt;/code&gt; and specify the item ID for the multi-variation listing or the &lt;b&gt;inventoryitemGroupKey&lt;/b&gt; value as defined in the Inventory API.
     */
    private String inventoryReferenceId;
    /**
     * Instantiates a new {@link InventoryItem} and sets the default values.
     */
    public InventoryItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InventoryItem}
     */
    @jakarta.annotation.Nonnull
    public static InventoryItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InventoryItem();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("inventoryReferenceId", (n) -> { this.setInventoryReferenceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inventoryReferenceId property value. The unique identifier of a single-item listing or a multi-variation listing.&lt;br&gt;&lt;br&gt;To create an ad for a single-item listing, set the &lt;b&gt;inventoryReferenceType&lt;/b&gt; value to &lt;code&gt;INVENTORY_ITEM&lt;/code&gt; and specify and item ID or a SKU (if the SKU is defined in the listing)&lt;br&gt;&lt;br&gt;To create an ad for a multi-variation listing, set the &lt;b&gt;inventoryReferenceType&lt;/b&gt; value to &lt;code&gt;INVENTORY_ITEM_GROUP&lt;/code&gt; and specify the item ID for the multi-variation listing or the &lt;b&gt;inventoryitemGroupKey&lt;/b&gt; value as defined in the Inventory API.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInventoryReferenceId() {
        return this.inventoryReferenceId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("inventoryReferenceId", this.getInventoryReferenceId());
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
     * Sets the inventoryReferenceId property value. The unique identifier of a single-item listing or a multi-variation listing.&lt;br&gt;&lt;br&gt;To create an ad for a single-item listing, set the &lt;b&gt;inventoryReferenceType&lt;/b&gt; value to &lt;code&gt;INVENTORY_ITEM&lt;/code&gt; and specify and item ID or a SKU (if the SKU is defined in the listing)&lt;br&gt;&lt;br&gt;To create an ad for a multi-variation listing, set the &lt;b&gt;inventoryReferenceType&lt;/b&gt; value to &lt;code&gt;INVENTORY_ITEM_GROUP&lt;/code&gt; and specify the item ID for the multi-variation listing or the &lt;b&gt;inventoryitemGroupKey&lt;/b&gt; value as defined in the Inventory API.
     * @param value Value to set for the inventoryReferenceId property.
     */
    public void setInventoryReferenceId(@jakarta.annotation.Nullable final String value) {
        this.inventoryReferenceId = value;
    }
}
