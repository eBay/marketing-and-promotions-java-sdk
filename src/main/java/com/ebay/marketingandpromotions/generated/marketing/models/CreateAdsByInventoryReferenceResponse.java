package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the fields returned when you create an ad by inventory reference ID.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateAdsByInventoryReferenceResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A unique eBay-assigned ID for an ad group in a priority strategy campaign that uses the Cost Per Click (CPC) funding model.&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field will always be returned for campaigns that use the CPC funding model. It will not be returned for campaigns that use the Cost Per Sale (CPS) funding model.&lt;/span&gt;
     */
    private String adGroupId;
    /**
     * A list of ad IDs. An ad ID is generated for each successfully created ad.
     */
    private java.util.List<AdReference> ads;
    /**
     * An array of errors or warnings associated with the create-ads request.
     */
    private java.util.List<Error> errors;
    /**
     * An ID that identifies a single-item listing or multiple-variation listing that is managed with the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot;&gt;Inventory API&lt;/a&gt;. &lt;p&gt;The &lt;i&gt;inventory reference ID&lt;/i&gt; is a seller-defined value that can be either an &lt;b&gt;SKU&lt;/b&gt; for a single-item listing or an &lt;b&gt;inventoryItemGroupKey&lt;/b&gt; for a multiple-value listing.&lt;/p&gt;
     */
    private String inventoryReferenceId;
    /**
     * Indicates the type of item the &lt;b&gt;inventoryReferenceId&lt;/b&gt; references. The item can be either an &lt;code&gt;INVENTORY_ITEM&lt;/code&gt; or an &lt;code&gt;INVENTORY_ITEM_GROUP&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:InventoryReferenceTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String inventoryReferenceType;
    /**
     * An HTTP status code that indicates the response-status of the request. Check this code to see if the ads were successfully created.
     */
    private Integer statusCode;
    /**
     * Instantiates a new {@link CreateAdsByInventoryReferenceResponse} and sets the default values.
     */
    public CreateAdsByInventoryReferenceResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateAdsByInventoryReferenceResponse}
     */
    @jakarta.annotation.Nonnull
    public static CreateAdsByInventoryReferenceResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateAdsByInventoryReferenceResponse();
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
     * Gets the adGroupId property value. A unique eBay-assigned ID for an ad group in a priority strategy campaign that uses the Cost Per Click (CPC) funding model.&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field will always be returned for campaigns that use the CPC funding model. It will not be returned for campaigns that use the Cost Per Sale (CPS) funding model.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAdGroupId() {
        return this.adGroupId;
    }
    /**
     * Gets the ads property value. A list of ad IDs. An ad ID is generated for each successfully created ad.
     * @return a {@link java.util.List<AdReference>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AdReference> getAds() {
        return this.ads;
    }
    /**
     * Gets the errors property value. An array of errors or warnings associated with the create-ads request.
     * @return a {@link java.util.List<Error>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Error> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("adGroupId", (n) -> { this.setAdGroupId(n.getStringValue()); });
        deserializerMap.put("ads", (n) -> { this.setAds(n.getCollectionOfObjectValues(AdReference::createFromDiscriminatorValue)); });
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(Error::createFromDiscriminatorValue)); });
        deserializerMap.put("inventoryReferenceId", (n) -> { this.setInventoryReferenceId(n.getStringValue()); });
        deserializerMap.put("inventoryReferenceType", (n) -> { this.setInventoryReferenceType(n.getStringValue()); });
        deserializerMap.put("statusCode", (n) -> { this.setStatusCode(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inventoryReferenceId property value. An ID that identifies a single-item listing or multiple-variation listing that is managed with the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot;&gt;Inventory API&lt;/a&gt;. &lt;p&gt;The &lt;i&gt;inventory reference ID&lt;/i&gt; is a seller-defined value that can be either an &lt;b&gt;SKU&lt;/b&gt; for a single-item listing or an &lt;b&gt;inventoryItemGroupKey&lt;/b&gt; for a multiple-value listing.&lt;/p&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInventoryReferenceId() {
        return this.inventoryReferenceId;
    }
    /**
     * Gets the inventoryReferenceType property value. Indicates the type of item the &lt;b&gt;inventoryReferenceId&lt;/b&gt; references. The item can be either an &lt;code&gt;INVENTORY_ITEM&lt;/code&gt; or an &lt;code&gt;INVENTORY_ITEM_GROUP&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:InventoryReferenceTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInventoryReferenceType() {
        return this.inventoryReferenceType;
    }
    /**
     * Gets the statusCode property value. An HTTP status code that indicates the response-status of the request. Check this code to see if the ads were successfully created.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getStatusCode() {
        return this.statusCode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("adGroupId", this.getAdGroupId());
        writer.writeCollectionOfObjectValues("ads", this.getAds());
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("inventoryReferenceId", this.getInventoryReferenceId());
        writer.writeStringValue("inventoryReferenceType", this.getInventoryReferenceType());
        writer.writeIntegerValue("statusCode", this.getStatusCode());
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
     * Sets the adGroupId property value. A unique eBay-assigned ID for an ad group in a priority strategy campaign that uses the Cost Per Click (CPC) funding model.&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field will always be returned for campaigns that use the CPC funding model. It will not be returned for campaigns that use the Cost Per Sale (CPS) funding model.&lt;/span&gt;
     * @param value Value to set for the adGroupId property.
     */
    public void setAdGroupId(@jakarta.annotation.Nullable final String value) {
        this.adGroupId = value;
    }
    /**
     * Sets the ads property value. A list of ad IDs. An ad ID is generated for each successfully created ad.
     * @param value Value to set for the ads property.
     */
    public void setAds(@jakarta.annotation.Nullable final java.util.List<AdReference> value) {
        this.ads = value;
    }
    /**
     * Sets the errors property value. An array of errors or warnings associated with the create-ads request.
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<Error> value) {
        this.errors = value;
    }
    /**
     * Sets the inventoryReferenceId property value. An ID that identifies a single-item listing or multiple-variation listing that is managed with the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot;&gt;Inventory API&lt;/a&gt;. &lt;p&gt;The &lt;i&gt;inventory reference ID&lt;/i&gt; is a seller-defined value that can be either an &lt;b&gt;SKU&lt;/b&gt; for a single-item listing or an &lt;b&gt;inventoryItemGroupKey&lt;/b&gt; for a multiple-value listing.&lt;/p&gt;
     * @param value Value to set for the inventoryReferenceId property.
     */
    public void setInventoryReferenceId(@jakarta.annotation.Nullable final String value) {
        this.inventoryReferenceId = value;
    }
    /**
     * Sets the inventoryReferenceType property value. Indicates the type of item the &lt;b&gt;inventoryReferenceId&lt;/b&gt; references. The item can be either an &lt;code&gt;INVENTORY_ITEM&lt;/code&gt; or an &lt;code&gt;INVENTORY_ITEM_GROUP&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:InventoryReferenceTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the inventoryReferenceType property.
     */
    public void setInventoryReferenceType(@jakarta.annotation.Nullable final String value) {
        this.inventoryReferenceType = value;
    }
    /**
     * Sets the statusCode property value. An HTTP status code that indicates the response-status of the request. Check this code to see if the ads were successfully created.
     * @param value Value to set for the statusCode property.
     */
    public void setStatusCode(@jakarta.annotation.Nullable final Integer value) {
        this.statusCode = value;
    }
}
