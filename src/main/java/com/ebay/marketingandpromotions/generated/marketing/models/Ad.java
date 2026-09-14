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
 * A type that defines the fields for an ad.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Ad implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A unique eBay-assigned ID for an ad group in a campaign that uses the Cost Per Click (CPC) funding model. This ID is created after a successful &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_group-createadgroup&quot;&gt;createAdGroup&lt;/a&gt; call, and all ad groups must be associated with a CPC campaign.
     */
    private String adGroupId;
    /**
     * A unique eBay-assigned ID that is generated when the ad is created.
     */
    private String adId;
    /**
     * The current status of the CPC ad.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ACTIVE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PAUSED&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;ARCHIVED&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This type only applies to the Cost Per Click (CPC) funding model; it does not apply to the Cost Per Sale (CPS) funding model.&lt;/span&gt;
     */
    private AdStatusEnum adStatus;
    /**
     * An array containing alert messages for the ad.
     */
    private java.util.List<Alert> alerts;
    /**
     * The user-defined &lt;b&gt;bid percentage&lt;/b&gt; (also known as the &lt;i&gt;ad rate&lt;/i&gt;) sets the level that eBay increases the visibility in search results for the associated listing. The higher the &lt;b&gt;bidPercentage&lt;/b&gt; value, the more eBay promotes the listing.  &lt;br&gt;&lt;br&gt;The value specified here is also used to calculate the Promoted Listings fee. This percentage value is multiplied by the final sales price to determine the fee. &lt;br&gt;&lt;br&gt;The Promoted Listings fee is determined at the time the transaction completes and the seller is assessed the fee only when an item sells through a Promoted Listings ad campaign. &lt;br&gt;&lt;br&gt;The &lt;b&gt;bidPercentage&lt;/b&gt; is a single precision value that is guided by the following rules: &lt;ul&gt;&lt;li&gt;These values are &lt;b&gt;valid&lt;/b&gt;:&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;4.1&lt;/code&gt;, &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;5.0&lt;/code&gt;, &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;5.5&lt;/code&gt;, ...&lt;/li&gt;  &lt;li&gt;These values are &lt;b&gt;not valid&lt;/b&gt;:&lt;br /&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;0.01&lt;/code&gt;, &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;10.75&lt;/code&gt;, &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;99.99&lt;/code&gt;,&lt;br /&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;and so on.&lt;/li&gt;&lt;/ul&gt;This is default bid percentage for the campaigns using the Cost Per Sale (CPS) funding model, and this value will be overridden by any ads in the campaign that have their own set bid percentages.&lt;br /&gt;&lt;br /&gt;If a bid percentage is not provided for an ad, eBay uses the default bid percentage of the associated campaign.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;This field will always be returned for campaigns that use the Cost Per Sale (CPS) funding model. It will not be returned for campaigns that use the Cost Per Click (CPC) funding model.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field has a minimum value of &lt;code&gt;2.0&lt;/code&gt; and a maximum value of &lt;code&gt;100.0&lt;/code&gt;.&lt;/span&gt;
     */
    private String bidPercentage;
    /**
     * An ID that identifies a single-item listing or multiple-variation listing that is managed with the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot; target=&quot;_blank&quot;&gt;Inventory API&lt;/a&gt;. &lt;p&gt;The &lt;i&gt;inventory reference ID&lt;/i&gt; is a seller-defined value that can be either an &lt;b&gt;SKU&lt;/b&gt; for a single-item listing or an &lt;b&gt;inventoryItemGroupKey&lt;/b&gt; for a multiple-value listing.&lt;/p&gt;  &lt;p&gt;An &lt;i&gt;inventoryItemGroupKey&lt;/i&gt; is a value that the seller defines to indicate a listing that&apos;s the parent of an inventory item group (a multiple-variation listing, such as a listing for a shirt that&apos;s available in multiple sizes and colors).&lt;/p&gt;&lt;p&gt;This field is only returned if the ad is associated with a SKU or an inventory item group value.&lt;/p&gt;
     */
    private String inventoryReferenceId;
    /**
     * The enumeration value returned here indicates the type of listing the inventoryReferenceId references. The value returned here will be &lt;code&gt;INVENTORY_ITEM&lt;/code&gt; for a single-variation listing, or &lt;code&gt;INVENTORY_ITEM_GROUP&lt;/code&gt; for a multiple-variation listing. &lt;p&gt;This field is only returned if the ad is associated with a SKU or an inventory item group value.&lt;/p&gt;
     */
    private InventoryReferenceTypeEnum inventoryReferenceType;
    /**
     * A unique eBay-assigned ID that is generated when a listing is created.
     */
    private String listingId;
    /**
     * Instantiates a new {@link Ad} and sets the default values.
     */
    public Ad() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Ad}
     */
    @jakarta.annotation.Nonnull
    public static Ad createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Ad();
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
     * Gets the adGroupId property value. A unique eBay-assigned ID for an ad group in a campaign that uses the Cost Per Click (CPC) funding model. This ID is created after a successful &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_group-createadgroup&quot;&gt;createAdGroup&lt;/a&gt; call, and all ad groups must be associated with a CPC campaign.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAdGroupId() {
        return this.adGroupId;
    }
    /**
     * Gets the adId property value. A unique eBay-assigned ID that is generated when the ad is created.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAdId() {
        return this.adId;
    }
    /**
     * Gets the adStatus property value. The current status of the CPC ad.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ACTIVE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PAUSED&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;ARCHIVED&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This type only applies to the Cost Per Click (CPC) funding model; it does not apply to the Cost Per Sale (CPS) funding model.&lt;/span&gt;
     * @return a {@link AdStatusEnum}
     */
    @jakarta.annotation.Nullable
    public AdStatusEnum getAdStatus() {
        return this.adStatus;
    }
    /**
     * Gets the alerts property value. An array containing alert messages for the ad.
     * @return a {@link java.util.List<Alert>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Alert> getAlerts() {
        return this.alerts;
    }
    /**
     * Gets the bidPercentage property value. The user-defined &lt;b&gt;bid percentage&lt;/b&gt; (also known as the &lt;i&gt;ad rate&lt;/i&gt;) sets the level that eBay increases the visibility in search results for the associated listing. The higher the &lt;b&gt;bidPercentage&lt;/b&gt; value, the more eBay promotes the listing.  &lt;br&gt;&lt;br&gt;The value specified here is also used to calculate the Promoted Listings fee. This percentage value is multiplied by the final sales price to determine the fee. &lt;br&gt;&lt;br&gt;The Promoted Listings fee is determined at the time the transaction completes and the seller is assessed the fee only when an item sells through a Promoted Listings ad campaign. &lt;br&gt;&lt;br&gt;The &lt;b&gt;bidPercentage&lt;/b&gt; is a single precision value that is guided by the following rules: &lt;ul&gt;&lt;li&gt;These values are &lt;b&gt;valid&lt;/b&gt;:&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;4.1&lt;/code&gt;, &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;5.0&lt;/code&gt;, &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;5.5&lt;/code&gt;, ...&lt;/li&gt;  &lt;li&gt;These values are &lt;b&gt;not valid&lt;/b&gt;:&lt;br /&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;0.01&lt;/code&gt;, &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;10.75&lt;/code&gt;, &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;99.99&lt;/code&gt;,&lt;br /&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;and so on.&lt;/li&gt;&lt;/ul&gt;This is default bid percentage for the campaigns using the Cost Per Sale (CPS) funding model, and this value will be overridden by any ads in the campaign that have their own set bid percentages.&lt;br /&gt;&lt;br /&gt;If a bid percentage is not provided for an ad, eBay uses the default bid percentage of the associated campaign.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;This field will always be returned for campaigns that use the Cost Per Sale (CPS) funding model. It will not be returned for campaigns that use the Cost Per Click (CPC) funding model.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field has a minimum value of &lt;code&gt;2.0&lt;/code&gt; and a maximum value of &lt;code&gt;100.0&lt;/code&gt;.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBidPercentage() {
        return this.bidPercentage;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("adGroupId", (n) -> { this.setAdGroupId(n.getStringValue()); });
        deserializerMap.put("adId", (n) -> { this.setAdId(n.getStringValue()); });
        deserializerMap.put("adStatus", (n) -> { this.setAdStatus(n.getEnumValue(AdStatusEnum::forValue)); });
        deserializerMap.put("alerts", (n) -> { this.setAlerts(n.getCollectionOfObjectValues(Alert::createFromDiscriminatorValue)); });
        deserializerMap.put("bidPercentage", (n) -> { this.setBidPercentage(n.getStringValue()); });
        deserializerMap.put("inventoryReferenceId", (n) -> { this.setInventoryReferenceId(n.getStringValue()); });
        deserializerMap.put("inventoryReferenceType", (n) -> { this.setInventoryReferenceType(n.getEnumValue(InventoryReferenceTypeEnum::forValue)); });
        deserializerMap.put("listingId", (n) -> { this.setListingId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inventoryReferenceId property value. An ID that identifies a single-item listing or multiple-variation listing that is managed with the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot; target=&quot;_blank&quot;&gt;Inventory API&lt;/a&gt;. &lt;p&gt;The &lt;i&gt;inventory reference ID&lt;/i&gt; is a seller-defined value that can be either an &lt;b&gt;SKU&lt;/b&gt; for a single-item listing or an &lt;b&gt;inventoryItemGroupKey&lt;/b&gt; for a multiple-value listing.&lt;/p&gt;  &lt;p&gt;An &lt;i&gt;inventoryItemGroupKey&lt;/i&gt; is a value that the seller defines to indicate a listing that&apos;s the parent of an inventory item group (a multiple-variation listing, such as a listing for a shirt that&apos;s available in multiple sizes and colors).&lt;/p&gt;&lt;p&gt;This field is only returned if the ad is associated with a SKU or an inventory item group value.&lt;/p&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInventoryReferenceId() {
        return this.inventoryReferenceId;
    }
    /**
     * Gets the inventoryReferenceType property value. The enumeration value returned here indicates the type of listing the inventoryReferenceId references. The value returned here will be &lt;code&gt;INVENTORY_ITEM&lt;/code&gt; for a single-variation listing, or &lt;code&gt;INVENTORY_ITEM_GROUP&lt;/code&gt; for a multiple-variation listing. &lt;p&gt;This field is only returned if the ad is associated with a SKU or an inventory item group value.&lt;/p&gt;
     * @return a {@link InventoryReferenceTypeEnum}
     */
    @jakarta.annotation.Nullable
    public InventoryReferenceTypeEnum getInventoryReferenceType() {
        return this.inventoryReferenceType;
    }
    /**
     * Gets the listingId property value. A unique eBay-assigned ID that is generated when a listing is created.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getListingId() {
        return this.listingId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("adGroupId", this.getAdGroupId());
        writer.writeStringValue("adId", this.getAdId());
        writer.writeEnumValue("adStatus", this.getAdStatus());
        writer.writeCollectionOfObjectValues("alerts", this.getAlerts());
        writer.writeStringValue("bidPercentage", this.getBidPercentage());
        writer.writeStringValue("inventoryReferenceId", this.getInventoryReferenceId());
        writer.writeEnumValue("inventoryReferenceType", this.getInventoryReferenceType());
        writer.writeStringValue("listingId", this.getListingId());
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
     * Sets the adGroupId property value. A unique eBay-assigned ID for an ad group in a campaign that uses the Cost Per Click (CPC) funding model. This ID is created after a successful &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_group-createadgroup&quot;&gt;createAdGroup&lt;/a&gt; call, and all ad groups must be associated with a CPC campaign.
     * @param value Value to set for the adGroupId property.
     */
    public void setAdGroupId(@jakarta.annotation.Nullable final String value) {
        this.adGroupId = value;
    }
    /**
     * Sets the adId property value. A unique eBay-assigned ID that is generated when the ad is created.
     * @param value Value to set for the adId property.
     */
    public void setAdId(@jakarta.annotation.Nullable final String value) {
        this.adId = value;
    }
    /**
     * Sets the adStatus property value. The current status of the CPC ad.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ACTIVE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PAUSED&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;ARCHIVED&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This type only applies to the Cost Per Click (CPC) funding model; it does not apply to the Cost Per Sale (CPS) funding model.&lt;/span&gt;
     * @param value Value to set for the adStatus property.
     */
    public void setAdStatus(@jakarta.annotation.Nullable final AdStatusEnum value) {
        this.adStatus = value;
    }
    /**
     * Sets the alerts property value. An array containing alert messages for the ad.
     * @param value Value to set for the alerts property.
     */
    public void setAlerts(@jakarta.annotation.Nullable final java.util.List<Alert> value) {
        this.alerts = value;
    }
    /**
     * Sets the bidPercentage property value. The user-defined &lt;b&gt;bid percentage&lt;/b&gt; (also known as the &lt;i&gt;ad rate&lt;/i&gt;) sets the level that eBay increases the visibility in search results for the associated listing. The higher the &lt;b&gt;bidPercentage&lt;/b&gt; value, the more eBay promotes the listing.  &lt;br&gt;&lt;br&gt;The value specified here is also used to calculate the Promoted Listings fee. This percentage value is multiplied by the final sales price to determine the fee. &lt;br&gt;&lt;br&gt;The Promoted Listings fee is determined at the time the transaction completes and the seller is assessed the fee only when an item sells through a Promoted Listings ad campaign. &lt;br&gt;&lt;br&gt;The &lt;b&gt;bidPercentage&lt;/b&gt; is a single precision value that is guided by the following rules: &lt;ul&gt;&lt;li&gt;These values are &lt;b&gt;valid&lt;/b&gt;:&lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;4.1&lt;/code&gt;, &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;5.0&lt;/code&gt;, &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;5.5&lt;/code&gt;, ...&lt;/li&gt;  &lt;li&gt;These values are &lt;b&gt;not valid&lt;/b&gt;:&lt;br /&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;0.01&lt;/code&gt;, &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;10.75&lt;/code&gt;, &amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;99.99&lt;/code&gt;,&lt;br /&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;and so on.&lt;/li&gt;&lt;/ul&gt;This is default bid percentage for the campaigns using the Cost Per Sale (CPS) funding model, and this value will be overridden by any ads in the campaign that have their own set bid percentages.&lt;br /&gt;&lt;br /&gt;If a bid percentage is not provided for an ad, eBay uses the default bid percentage of the associated campaign.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;This field will always be returned for campaigns that use the Cost Per Sale (CPS) funding model. It will not be returned for campaigns that use the Cost Per Click (CPC) funding model.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field has a minimum value of &lt;code&gt;2.0&lt;/code&gt; and a maximum value of &lt;code&gt;100.0&lt;/code&gt;.&lt;/span&gt;
     * @param value Value to set for the bidPercentage property.
     */
    public void setBidPercentage(@jakarta.annotation.Nullable final String value) {
        this.bidPercentage = value;
    }
    /**
     * Sets the inventoryReferenceId property value. An ID that identifies a single-item listing or multiple-variation listing that is managed with the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot; target=&quot;_blank&quot;&gt;Inventory API&lt;/a&gt;. &lt;p&gt;The &lt;i&gt;inventory reference ID&lt;/i&gt; is a seller-defined value that can be either an &lt;b&gt;SKU&lt;/b&gt; for a single-item listing or an &lt;b&gt;inventoryItemGroupKey&lt;/b&gt; for a multiple-value listing.&lt;/p&gt;  &lt;p&gt;An &lt;i&gt;inventoryItemGroupKey&lt;/i&gt; is a value that the seller defines to indicate a listing that&apos;s the parent of an inventory item group (a multiple-variation listing, such as a listing for a shirt that&apos;s available in multiple sizes and colors).&lt;/p&gt;&lt;p&gt;This field is only returned if the ad is associated with a SKU or an inventory item group value.&lt;/p&gt;
     * @param value Value to set for the inventoryReferenceId property.
     */
    public void setInventoryReferenceId(@jakarta.annotation.Nullable final String value) {
        this.inventoryReferenceId = value;
    }
    /**
     * Sets the inventoryReferenceType property value. The enumeration value returned here indicates the type of listing the inventoryReferenceId references. The value returned here will be &lt;code&gt;INVENTORY_ITEM&lt;/code&gt; for a single-variation listing, or &lt;code&gt;INVENTORY_ITEM_GROUP&lt;/code&gt; for a multiple-variation listing. &lt;p&gt;This field is only returned if the ad is associated with a SKU or an inventory item group value.&lt;/p&gt;
     * @param value Value to set for the inventoryReferenceType property.
     */
    public void setInventoryReferenceType(@jakarta.annotation.Nullable final InventoryReferenceTypeEnum value) {
        this.inventoryReferenceType = value;
    }
    /**
     * Sets the listingId property value. A unique eBay-assigned ID that is generated when a listing is created.
     * @param value Value to set for the listingId property.
     */
    public void setListingId(@jakarta.annotation.Nullable final String value) {
        this.listingId = value;
    }
}
