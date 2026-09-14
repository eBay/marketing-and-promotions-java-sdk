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
 * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This type defines the fields in a discount-level report.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PromotionReportDetail implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The &lt;i&gt;average item discount&lt;/i&gt; is the average discount that has been applied to each item being discounted. This value is calculated as follows:  &lt;br&gt;&lt;br&gt;&lt;b&gt;totalDiscount&lt;/b&gt; / &lt;b&gt;itemsSoldQuantity&lt;/b&gt; = &lt;b&gt;averageItemDiscount&lt;/b&gt;
     */
    private Amount averageItemDiscount;
    /**
     * The &lt;i&gt;average item revenue&lt;/i&gt; is the average revenue that has been received for each item being discounted.. This value is calculated as follows:  &lt;br&gt;&lt;br&gt;&lt;b&gt;totalSales&lt;/b&gt; / &lt;b&gt;itemsSoldQuantity&lt;/b&gt; = &lt;b&gt;averageItemRevenue&lt;/b&gt;
     */
    private Amount averageItemRevenue;
    /**
     * The &lt;i&gt;average order discount&lt;/i&gt; is the average discount that has been applied to each order that has an active discount. This value is calculated as follows:  &lt;br&gt;&lt;br&gt;&lt;b&gt;totalDiscount&lt;/b&gt; / &lt;b&gt;numberOfOrdersSold&lt;/b&gt; = &lt;b&gt;averageOrderDiscount&lt;/b&gt;
     */
    private Amount averageOrderDiscount;
    /**
     * The &lt;i&gt;average order revenue&lt;/i&gt; is the average revenue that has been received for each order that has an active discount. This value is calculated as follows:  &lt;br&gt;&lt;br&gt;&lt;b&gt;totalSales&lt;/b&gt; / &lt;b&gt;numberOfOrdersSold&lt;/b&gt; = &lt;b&gt;averageOrderRevenue&lt;/b&gt;
     */
    private Amount averageOrderRevenue;
    /**
     * The &lt;i&gt;average order size&lt;/i&gt; is the average number of items that each order contained that have an active discount. This value is calculated as follows:  &lt;br&gt;&lt;br&gt;&lt;b&gt;itemsSoldQuantity&lt;/b&gt; / &lt;b&gt;numberOfOrdersSold&lt;/b&gt; = &lt;b&gt;averageOrderSize&lt;/b&gt; 
     */
    private String averageOrderSize;
    /**
     * This is the monetary amount of items purchased that have been discounted where the threshold &lt;i&gt;wasn&apos;t met&lt;/i&gt;, so the discount was not applied.  &lt;br&gt;&lt;br&gt;For example, suppose you&apos;re running a &quot;Buy 1, get 1 at 50%&quot; discount on $5 socks. One buyer purchased only one pair of socks, so they pay the full price of $5. Here, your &lt;b&gt;baseSale&lt;/b&gt; amount would be $5.
     */
    private Amount baseSale;
    /**
     * This is the quantity of items purchased in a threshold discount where the threshold &lt;i&gt;has been met&lt;/i&gt; and the discount was applied. &lt;br&gt;&lt;br&gt;For example, suppose you&apos;re running a &quot;Buy 1, get 1 at 50%&quot; discount on $5 socks. One buyer purchases two pairs of socks, so they pay $7.50 for both pairs (rather than the full price of $10). Your number of items sold (&lt;b&gt;itemsSoldQuantity&lt;/b&gt;) would be 2 and you number of orders sold (&lt;b&gt;numberOfOrdersSold&lt;/b&gt;) would be 1.
     */
    private Integer itemsSoldQuantity;
    /**
     * This is the number of orders sold in a threshold discount where the threshold &lt;i&gt;has been met&lt;/i&gt; and the discount was applied. &lt;br&gt;&lt;br&gt;For example, suppose you&apos;re running a &quot;Buy 1, get 1 at 50%&quot; discount on $5 socks. One buyer purchases two pairs of socks, so they pay $7.50 for both pairs (rather than the full price of $10). Your &lt;b&gt;numberOfOrdersSold&lt;/b&gt; would be 1 and your &lt;b&gt;itemsSoldQuantity&lt;/b&gt; would be 2.
     */
    private Integer numberOfOrdersSold;
    /**
     * The &lt;i&gt;percentage sales lift&lt;/i&gt; is the total dollar amount gained due to discounts. This value is calculated as follows:  &lt;br&gt;&lt;br&gt; &lt;b&gt;promotionSale&lt;/b&gt; / &lt;b&gt;totalSale&lt;/b&gt; =  &lt;b&gt;percentageSalesLift&lt;/b&gt; 
     */
    private String percentageSalesLift;
    /**
     * The URI of the discount report.
     */
    private String promotionHref;
    /**
     * A unique eBay-assigned ID for the discount that&apos;s generated when the discount is created.
     */
    private String promotionId;
    /**
     * The unique eBay-assigned ID of the discount report that is generated when the report is created.
     */
    private String promotionReportId;
    /**
     * This is the monetary amount of the items sold in a threshold discount where the threshold &lt;i&gt;has been met&lt;/i&gt; and the discount was applied.  &lt;br&gt;&lt;br&gt;For example, suppose you&apos;re running a &quot;Buy 1, get 1 at 50%&quot; discount on $5 socks. One buyer purchases two pairs of socks, so they pay $7.50 for both pairs (rather than the full price of $10). Your &lt;b&gt;promotionSale&lt;/b&gt; amount would be $7.50.
     */
    private Amount promotionSale;
    /**
     * Indicates the type of the discount, either &lt;code&gt;CODED_COUPON&lt;/code&gt;, &lt;code&gt;MARKDOWN_SALE&lt;/code&gt;, &lt;code&gt;ORDER_DISCOUNT&lt;/code&gt;, or &lt;code&gt;VOLUME_DISCOUNT&lt;/code&gt;.
     */
    private PromotionTypeEnum promotionType;
    /**
     * This is the monetary discount amount applied to the sale of items in a threshold discount where the threshold &lt;i&gt;has been met&lt;/i&gt; and the discount was applied.  &lt;br&gt;&lt;br&gt;For example, suppose you&apos;re running a &quot;Buy 1, get 1 at 50%&quot; discount on $5 socks. One buyer purchases two pairs of socks, so they pay $7.50 for both pairs (rather than the full price of $10). Your &lt;b&gt;totalDiscount&lt;/b&gt; amount would be $2.50.
     */
    private Amount totalDiscount;
    /**
     * This is the total monetary sales amount of all items sold that were discounted. &lt;br&gt;&lt;br&gt;For example, suppose you&apos;re running a &quot;Buy 1, get 1 at 50%&quot; discount on $5 socks. You make one sale where the buyer purchases only one pair of socks and they pay the full price of $5 (&lt;b&gt;baseSale&lt;/b&gt;). You make a second sale where the buyer purchases two pairs of socks and they pay $7.50, for both pairs (&lt;b&gt;promotionSale&lt;/b&gt;). Your &lt;b&gt;totalSale&lt;/b&gt; would be $12.50. This value is calculated as follows:  &lt;br&gt;&lt;br&gt;&lt;b&gt;baseSale&lt;/b&gt; + &lt;b&gt;promotionSale&lt;/b&gt; = &lt;b&gt;totalSale&lt;/b&gt;
     */
    private Amount totalSale;
    /**
     * Instantiates a new {@link PromotionReportDetail} and sets the default values.
     */
    public PromotionReportDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PromotionReportDetail}
     */
    @jakarta.annotation.Nonnull
    public static PromotionReportDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PromotionReportDetail();
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
     * Gets the averageItemDiscount property value. The &lt;i&gt;average item discount&lt;/i&gt; is the average discount that has been applied to each item being discounted. This value is calculated as follows:  &lt;br&gt;&lt;br&gt;&lt;b&gt;totalDiscount&lt;/b&gt; / &lt;b&gt;itemsSoldQuantity&lt;/b&gt; = &lt;b&gt;averageItemDiscount&lt;/b&gt;
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAverageItemDiscount() {
        return this.averageItemDiscount;
    }
    /**
     * Gets the averageItemRevenue property value. The &lt;i&gt;average item revenue&lt;/i&gt; is the average revenue that has been received for each item being discounted.. This value is calculated as follows:  &lt;br&gt;&lt;br&gt;&lt;b&gt;totalSales&lt;/b&gt; / &lt;b&gt;itemsSoldQuantity&lt;/b&gt; = &lt;b&gt;averageItemRevenue&lt;/b&gt;
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAverageItemRevenue() {
        return this.averageItemRevenue;
    }
    /**
     * Gets the averageOrderDiscount property value. The &lt;i&gt;average order discount&lt;/i&gt; is the average discount that has been applied to each order that has an active discount. This value is calculated as follows:  &lt;br&gt;&lt;br&gt;&lt;b&gt;totalDiscount&lt;/b&gt; / &lt;b&gt;numberOfOrdersSold&lt;/b&gt; = &lt;b&gt;averageOrderDiscount&lt;/b&gt;
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAverageOrderDiscount() {
        return this.averageOrderDiscount;
    }
    /**
     * Gets the averageOrderRevenue property value. The &lt;i&gt;average order revenue&lt;/i&gt; is the average revenue that has been received for each order that has an active discount. This value is calculated as follows:  &lt;br&gt;&lt;br&gt;&lt;b&gt;totalSales&lt;/b&gt; / &lt;b&gt;numberOfOrdersSold&lt;/b&gt; = &lt;b&gt;averageOrderRevenue&lt;/b&gt;
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAverageOrderRevenue() {
        return this.averageOrderRevenue;
    }
    /**
     * Gets the averageOrderSize property value. The &lt;i&gt;average order size&lt;/i&gt; is the average number of items that each order contained that have an active discount. This value is calculated as follows:  &lt;br&gt;&lt;br&gt;&lt;b&gt;itemsSoldQuantity&lt;/b&gt; / &lt;b&gt;numberOfOrdersSold&lt;/b&gt; = &lt;b&gt;averageOrderSize&lt;/b&gt; 
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAverageOrderSize() {
        return this.averageOrderSize;
    }
    /**
     * Gets the baseSale property value. This is the monetary amount of items purchased that have been discounted where the threshold &lt;i&gt;wasn&apos;t met&lt;/i&gt;, so the discount was not applied.  &lt;br&gt;&lt;br&gt;For example, suppose you&apos;re running a &quot;Buy 1, get 1 at 50%&quot; discount on $5 socks. One buyer purchased only one pair of socks, so they pay the full price of $5. Here, your &lt;b&gt;baseSale&lt;/b&gt; amount would be $5.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getBaseSale() {
        return this.baseSale;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(16);
        deserializerMap.put("averageItemDiscount", (n) -> { this.setAverageItemDiscount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("averageItemRevenue", (n) -> { this.setAverageItemRevenue(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("averageOrderDiscount", (n) -> { this.setAverageOrderDiscount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("averageOrderRevenue", (n) -> { this.setAverageOrderRevenue(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("averageOrderSize", (n) -> { this.setAverageOrderSize(n.getStringValue()); });
        deserializerMap.put("baseSale", (n) -> { this.setBaseSale(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("itemsSoldQuantity", (n) -> { this.setItemsSoldQuantity(n.getIntegerValue()); });
        deserializerMap.put("numberOfOrdersSold", (n) -> { this.setNumberOfOrdersSold(n.getIntegerValue()); });
        deserializerMap.put("percentageSalesLift", (n) -> { this.setPercentageSalesLift(n.getStringValue()); });
        deserializerMap.put("promotionHref", (n) -> { this.setPromotionHref(n.getStringValue()); });
        deserializerMap.put("promotionId", (n) -> { this.setPromotionId(n.getStringValue()); });
        deserializerMap.put("promotionReportId", (n) -> { this.setPromotionReportId(n.getStringValue()); });
        deserializerMap.put("promotionSale", (n) -> { this.setPromotionSale(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("promotionType", (n) -> { this.setPromotionType(n.getEnumValue(PromotionTypeEnum::forValue)); });
        deserializerMap.put("totalDiscount", (n) -> { this.setTotalDiscount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("totalSale", (n) -> { this.setTotalSale(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the itemsSoldQuantity property value. This is the quantity of items purchased in a threshold discount where the threshold &lt;i&gt;has been met&lt;/i&gt; and the discount was applied. &lt;br&gt;&lt;br&gt;For example, suppose you&apos;re running a &quot;Buy 1, get 1 at 50%&quot; discount on $5 socks. One buyer purchases two pairs of socks, so they pay $7.50 for both pairs (rather than the full price of $10). Your number of items sold (&lt;b&gt;itemsSoldQuantity&lt;/b&gt;) would be 2 and you number of orders sold (&lt;b&gt;numberOfOrdersSold&lt;/b&gt;) would be 1.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getItemsSoldQuantity() {
        return this.itemsSoldQuantity;
    }
    /**
     * Gets the numberOfOrdersSold property value. This is the number of orders sold in a threshold discount where the threshold &lt;i&gt;has been met&lt;/i&gt; and the discount was applied. &lt;br&gt;&lt;br&gt;For example, suppose you&apos;re running a &quot;Buy 1, get 1 at 50%&quot; discount on $5 socks. One buyer purchases two pairs of socks, so they pay $7.50 for both pairs (rather than the full price of $10). Your &lt;b&gt;numberOfOrdersSold&lt;/b&gt; would be 1 and your &lt;b&gt;itemsSoldQuantity&lt;/b&gt; would be 2.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfOrdersSold() {
        return this.numberOfOrdersSold;
    }
    /**
     * Gets the percentageSalesLift property value. The &lt;i&gt;percentage sales lift&lt;/i&gt; is the total dollar amount gained due to discounts. This value is calculated as follows:  &lt;br&gt;&lt;br&gt; &lt;b&gt;promotionSale&lt;/b&gt; / &lt;b&gt;totalSale&lt;/b&gt; =  &lt;b&gt;percentageSalesLift&lt;/b&gt; 
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPercentageSalesLift() {
        return this.percentageSalesLift;
    }
    /**
     * Gets the promotionHref property value. The URI of the discount report.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPromotionHref() {
        return this.promotionHref;
    }
    /**
     * Gets the promotionId property value. A unique eBay-assigned ID for the discount that&apos;s generated when the discount is created.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPromotionId() {
        return this.promotionId;
    }
    /**
     * Gets the promotionReportId property value. The unique eBay-assigned ID of the discount report that is generated when the report is created.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPromotionReportId() {
        return this.promotionReportId;
    }
    /**
     * Gets the promotionSale property value. This is the monetary amount of the items sold in a threshold discount where the threshold &lt;i&gt;has been met&lt;/i&gt; and the discount was applied.  &lt;br&gt;&lt;br&gt;For example, suppose you&apos;re running a &quot;Buy 1, get 1 at 50%&quot; discount on $5 socks. One buyer purchases two pairs of socks, so they pay $7.50 for both pairs (rather than the full price of $10). Your &lt;b&gt;promotionSale&lt;/b&gt; amount would be $7.50.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getPromotionSale() {
        return this.promotionSale;
    }
    /**
     * Gets the promotionType property value. Indicates the type of the discount, either &lt;code&gt;CODED_COUPON&lt;/code&gt;, &lt;code&gt;MARKDOWN_SALE&lt;/code&gt;, &lt;code&gt;ORDER_DISCOUNT&lt;/code&gt;, or &lt;code&gt;VOLUME_DISCOUNT&lt;/code&gt;.
     * @return a {@link PromotionTypeEnum}
     */
    @jakarta.annotation.Nullable
    public PromotionTypeEnum getPromotionType() {
        return this.promotionType;
    }
    /**
     * Gets the totalDiscount property value. This is the monetary discount amount applied to the sale of items in a threshold discount where the threshold &lt;i&gt;has been met&lt;/i&gt; and the discount was applied.  &lt;br&gt;&lt;br&gt;For example, suppose you&apos;re running a &quot;Buy 1, get 1 at 50%&quot; discount on $5 socks. One buyer purchases two pairs of socks, so they pay $7.50 for both pairs (rather than the full price of $10). Your &lt;b&gt;totalDiscount&lt;/b&gt; amount would be $2.50.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getTotalDiscount() {
        return this.totalDiscount;
    }
    /**
     * Gets the totalSale property value. This is the total monetary sales amount of all items sold that were discounted. &lt;br&gt;&lt;br&gt;For example, suppose you&apos;re running a &quot;Buy 1, get 1 at 50%&quot; discount on $5 socks. You make one sale where the buyer purchases only one pair of socks and they pay the full price of $5 (&lt;b&gt;baseSale&lt;/b&gt;). You make a second sale where the buyer purchases two pairs of socks and they pay $7.50, for both pairs (&lt;b&gt;promotionSale&lt;/b&gt;). Your &lt;b&gt;totalSale&lt;/b&gt; would be $12.50. This value is calculated as follows:  &lt;br&gt;&lt;br&gt;&lt;b&gt;baseSale&lt;/b&gt; + &lt;b&gt;promotionSale&lt;/b&gt; = &lt;b&gt;totalSale&lt;/b&gt;
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getTotalSale() {
        return this.totalSale;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("averageItemDiscount", this.getAverageItemDiscount());
        writer.writeObjectValue("averageItemRevenue", this.getAverageItemRevenue());
        writer.writeObjectValue("averageOrderDiscount", this.getAverageOrderDiscount());
        writer.writeObjectValue("averageOrderRevenue", this.getAverageOrderRevenue());
        writer.writeStringValue("averageOrderSize", this.getAverageOrderSize());
        writer.writeObjectValue("baseSale", this.getBaseSale());
        writer.writeIntegerValue("itemsSoldQuantity", this.getItemsSoldQuantity());
        writer.writeIntegerValue("numberOfOrdersSold", this.getNumberOfOrdersSold());
        writer.writeStringValue("percentageSalesLift", this.getPercentageSalesLift());
        writer.writeStringValue("promotionHref", this.getPromotionHref());
        writer.writeStringValue("promotionId", this.getPromotionId());
        writer.writeStringValue("promotionReportId", this.getPromotionReportId());
        writer.writeObjectValue("promotionSale", this.getPromotionSale());
        writer.writeEnumValue("promotionType", this.getPromotionType());
        writer.writeObjectValue("totalDiscount", this.getTotalDiscount());
        writer.writeObjectValue("totalSale", this.getTotalSale());
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
     * Sets the averageItemDiscount property value. The &lt;i&gt;average item discount&lt;/i&gt; is the average discount that has been applied to each item being discounted. This value is calculated as follows:  &lt;br&gt;&lt;br&gt;&lt;b&gt;totalDiscount&lt;/b&gt; / &lt;b&gt;itemsSoldQuantity&lt;/b&gt; = &lt;b&gt;averageItemDiscount&lt;/b&gt;
     * @param value Value to set for the averageItemDiscount property.
     */
    public void setAverageItemDiscount(@jakarta.annotation.Nullable final Amount value) {
        this.averageItemDiscount = value;
    }
    /**
     * Sets the averageItemRevenue property value. The &lt;i&gt;average item revenue&lt;/i&gt; is the average revenue that has been received for each item being discounted.. This value is calculated as follows:  &lt;br&gt;&lt;br&gt;&lt;b&gt;totalSales&lt;/b&gt; / &lt;b&gt;itemsSoldQuantity&lt;/b&gt; = &lt;b&gt;averageItemRevenue&lt;/b&gt;
     * @param value Value to set for the averageItemRevenue property.
     */
    public void setAverageItemRevenue(@jakarta.annotation.Nullable final Amount value) {
        this.averageItemRevenue = value;
    }
    /**
     * Sets the averageOrderDiscount property value. The &lt;i&gt;average order discount&lt;/i&gt; is the average discount that has been applied to each order that has an active discount. This value is calculated as follows:  &lt;br&gt;&lt;br&gt;&lt;b&gt;totalDiscount&lt;/b&gt; / &lt;b&gt;numberOfOrdersSold&lt;/b&gt; = &lt;b&gt;averageOrderDiscount&lt;/b&gt;
     * @param value Value to set for the averageOrderDiscount property.
     */
    public void setAverageOrderDiscount(@jakarta.annotation.Nullable final Amount value) {
        this.averageOrderDiscount = value;
    }
    /**
     * Sets the averageOrderRevenue property value. The &lt;i&gt;average order revenue&lt;/i&gt; is the average revenue that has been received for each order that has an active discount. This value is calculated as follows:  &lt;br&gt;&lt;br&gt;&lt;b&gt;totalSales&lt;/b&gt; / &lt;b&gt;numberOfOrdersSold&lt;/b&gt; = &lt;b&gt;averageOrderRevenue&lt;/b&gt;
     * @param value Value to set for the averageOrderRevenue property.
     */
    public void setAverageOrderRevenue(@jakarta.annotation.Nullable final Amount value) {
        this.averageOrderRevenue = value;
    }
    /**
     * Sets the averageOrderSize property value. The &lt;i&gt;average order size&lt;/i&gt; is the average number of items that each order contained that have an active discount. This value is calculated as follows:  &lt;br&gt;&lt;br&gt;&lt;b&gt;itemsSoldQuantity&lt;/b&gt; / &lt;b&gt;numberOfOrdersSold&lt;/b&gt; = &lt;b&gt;averageOrderSize&lt;/b&gt; 
     * @param value Value to set for the averageOrderSize property.
     */
    public void setAverageOrderSize(@jakarta.annotation.Nullable final String value) {
        this.averageOrderSize = value;
    }
    /**
     * Sets the baseSale property value. This is the monetary amount of items purchased that have been discounted where the threshold &lt;i&gt;wasn&apos;t met&lt;/i&gt;, so the discount was not applied.  &lt;br&gt;&lt;br&gt;For example, suppose you&apos;re running a &quot;Buy 1, get 1 at 50%&quot; discount on $5 socks. One buyer purchased only one pair of socks, so they pay the full price of $5. Here, your &lt;b&gt;baseSale&lt;/b&gt; amount would be $5.
     * @param value Value to set for the baseSale property.
     */
    public void setBaseSale(@jakarta.annotation.Nullable final Amount value) {
        this.baseSale = value;
    }
    /**
     * Sets the itemsSoldQuantity property value. This is the quantity of items purchased in a threshold discount where the threshold &lt;i&gt;has been met&lt;/i&gt; and the discount was applied. &lt;br&gt;&lt;br&gt;For example, suppose you&apos;re running a &quot;Buy 1, get 1 at 50%&quot; discount on $5 socks. One buyer purchases two pairs of socks, so they pay $7.50 for both pairs (rather than the full price of $10). Your number of items sold (&lt;b&gt;itemsSoldQuantity&lt;/b&gt;) would be 2 and you number of orders sold (&lt;b&gt;numberOfOrdersSold&lt;/b&gt;) would be 1.
     * @param value Value to set for the itemsSoldQuantity property.
     */
    public void setItemsSoldQuantity(@jakarta.annotation.Nullable final Integer value) {
        this.itemsSoldQuantity = value;
    }
    /**
     * Sets the numberOfOrdersSold property value. This is the number of orders sold in a threshold discount where the threshold &lt;i&gt;has been met&lt;/i&gt; and the discount was applied. &lt;br&gt;&lt;br&gt;For example, suppose you&apos;re running a &quot;Buy 1, get 1 at 50%&quot; discount on $5 socks. One buyer purchases two pairs of socks, so they pay $7.50 for both pairs (rather than the full price of $10). Your &lt;b&gt;numberOfOrdersSold&lt;/b&gt; would be 1 and your &lt;b&gt;itemsSoldQuantity&lt;/b&gt; would be 2.
     * @param value Value to set for the numberOfOrdersSold property.
     */
    public void setNumberOfOrdersSold(@jakarta.annotation.Nullable final Integer value) {
        this.numberOfOrdersSold = value;
    }
    /**
     * Sets the percentageSalesLift property value. The &lt;i&gt;percentage sales lift&lt;/i&gt; is the total dollar amount gained due to discounts. This value is calculated as follows:  &lt;br&gt;&lt;br&gt; &lt;b&gt;promotionSale&lt;/b&gt; / &lt;b&gt;totalSale&lt;/b&gt; =  &lt;b&gt;percentageSalesLift&lt;/b&gt; 
     * @param value Value to set for the percentageSalesLift property.
     */
    public void setPercentageSalesLift(@jakarta.annotation.Nullable final String value) {
        this.percentageSalesLift = value;
    }
    /**
     * Sets the promotionHref property value. The URI of the discount report.
     * @param value Value to set for the promotionHref property.
     */
    public void setPromotionHref(@jakarta.annotation.Nullable final String value) {
        this.promotionHref = value;
    }
    /**
     * Sets the promotionId property value. A unique eBay-assigned ID for the discount that&apos;s generated when the discount is created.
     * @param value Value to set for the promotionId property.
     */
    public void setPromotionId(@jakarta.annotation.Nullable final String value) {
        this.promotionId = value;
    }
    /**
     * Sets the promotionReportId property value. The unique eBay-assigned ID of the discount report that is generated when the report is created.
     * @param value Value to set for the promotionReportId property.
     */
    public void setPromotionReportId(@jakarta.annotation.Nullable final String value) {
        this.promotionReportId = value;
    }
    /**
     * Sets the promotionSale property value. This is the monetary amount of the items sold in a threshold discount where the threshold &lt;i&gt;has been met&lt;/i&gt; and the discount was applied.  &lt;br&gt;&lt;br&gt;For example, suppose you&apos;re running a &quot;Buy 1, get 1 at 50%&quot; discount on $5 socks. One buyer purchases two pairs of socks, so they pay $7.50 for both pairs (rather than the full price of $10). Your &lt;b&gt;promotionSale&lt;/b&gt; amount would be $7.50.
     * @param value Value to set for the promotionSale property.
     */
    public void setPromotionSale(@jakarta.annotation.Nullable final Amount value) {
        this.promotionSale = value;
    }
    /**
     * Sets the promotionType property value. Indicates the type of the discount, either &lt;code&gt;CODED_COUPON&lt;/code&gt;, &lt;code&gt;MARKDOWN_SALE&lt;/code&gt;, &lt;code&gt;ORDER_DISCOUNT&lt;/code&gt;, or &lt;code&gt;VOLUME_DISCOUNT&lt;/code&gt;.
     * @param value Value to set for the promotionType property.
     */
    public void setPromotionType(@jakarta.annotation.Nullable final PromotionTypeEnum value) {
        this.promotionType = value;
    }
    /**
     * Sets the totalDiscount property value. This is the monetary discount amount applied to the sale of items in a threshold discount where the threshold &lt;i&gt;has been met&lt;/i&gt; and the discount was applied.  &lt;br&gt;&lt;br&gt;For example, suppose you&apos;re running a &quot;Buy 1, get 1 at 50%&quot; discount on $5 socks. One buyer purchases two pairs of socks, so they pay $7.50 for both pairs (rather than the full price of $10). Your &lt;b&gt;totalDiscount&lt;/b&gt; amount would be $2.50.
     * @param value Value to set for the totalDiscount property.
     */
    public void setTotalDiscount(@jakarta.annotation.Nullable final Amount value) {
        this.totalDiscount = value;
    }
    /**
     * Sets the totalSale property value. This is the total monetary sales amount of all items sold that were discounted. &lt;br&gt;&lt;br&gt;For example, suppose you&apos;re running a &quot;Buy 1, get 1 at 50%&quot; discount on $5 socks. You make one sale where the buyer purchases only one pair of socks and they pay the full price of $5 (&lt;b&gt;baseSale&lt;/b&gt;). You make a second sale where the buyer purchases two pairs of socks and they pay $7.50, for both pairs (&lt;b&gt;promotionSale&lt;/b&gt;). Your &lt;b&gt;totalSale&lt;/b&gt; would be $12.50. This value is calculated as follows:  &lt;br&gt;&lt;br&gt;&lt;b&gt;baseSale&lt;/b&gt; + &lt;b&gt;promotionSale&lt;/b&gt; = &lt;b&gt;totalSale&lt;/b&gt;
     * @param value Value to set for the totalSale property.
     */
    public void setTotalSale(@jakarta.annotation.Nullable final Amount value) {
        this.totalSale = value;
    }
}
