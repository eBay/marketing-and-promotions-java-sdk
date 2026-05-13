package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the fields in an Discounts Manager Summary report. Reports are formatted in JSON. For more details, see &lt;a href=&quot;/api-docs/sell/static/marketing/pm-summary-reports.html&quot;&gt;Reading item discount Summary reports&lt;/a&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SummaryReportResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency.
     */
    private Amount baseSale;
    /**
     * The date the report was generated.
     */
    private String lastUpdated;
    /**
     * The percentage of the total dollar amount gained due to discounts. This value is calculated as follows:  &lt;br&gt;&lt;br&gt;&lt;b&gt;precentageSalesLift&lt;/b&gt; = &lt;b&gt;promotionSale&lt;/b&gt; / (&lt;b&gt;baseSale&lt;/b&gt; + &lt;b&gt;promotionSale&lt;/b&gt;)
     */
    private String percentageSalesLift;
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency.
     */
    private Amount promotionSale;
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency.
     */
    private Amount totalSale;
    /**
     * Instantiates a new {@link SummaryReportResponse} and sets the default values.
     */
    public SummaryReportResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SummaryReportResponse}
     */
    @jakarta.annotation.Nonnull
    public static SummaryReportResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SummaryReportResponse();
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
     * Gets the baseSale property value. A complex type that describes the value of a monetary amount as represented by a global currency.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("baseSale", (n) -> { this.setBaseSale(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("lastUpdated", (n) -> { this.setLastUpdated(n.getStringValue()); });
        deserializerMap.put("percentageSalesLift", (n) -> { this.setPercentageSalesLift(n.getStringValue()); });
        deserializerMap.put("promotionSale", (n) -> { this.setPromotionSale(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("totalSale", (n) -> { this.setTotalSale(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastUpdated property value. The date the report was generated.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastUpdated() {
        return this.lastUpdated;
    }
    /**
     * Gets the percentageSalesLift property value. The percentage of the total dollar amount gained due to discounts. This value is calculated as follows:  &lt;br&gt;&lt;br&gt;&lt;b&gt;precentageSalesLift&lt;/b&gt; = &lt;b&gt;promotionSale&lt;/b&gt; / (&lt;b&gt;baseSale&lt;/b&gt; + &lt;b&gt;promotionSale&lt;/b&gt;)
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPercentageSalesLift() {
        return this.percentageSalesLift;
    }
    /**
     * Gets the promotionSale property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getPromotionSale() {
        return this.promotionSale;
    }
    /**
     * Gets the totalSale property value. A complex type that describes the value of a monetary amount as represented by a global currency.
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
        writer.writeObjectValue("baseSale", this.getBaseSale());
        writer.writeStringValue("lastUpdated", this.getLastUpdated());
        writer.writeStringValue("percentageSalesLift", this.getPercentageSalesLift());
        writer.writeObjectValue("promotionSale", this.getPromotionSale());
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
     * Sets the baseSale property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @param value Value to set for the baseSale property.
     */
    public void setBaseSale(@jakarta.annotation.Nullable final Amount value) {
        this.baseSale = value;
    }
    /**
     * Sets the lastUpdated property value. The date the report was generated.
     * @param value Value to set for the lastUpdated property.
     */
    public void setLastUpdated(@jakarta.annotation.Nullable final String value) {
        this.lastUpdated = value;
    }
    /**
     * Sets the percentageSalesLift property value. The percentage of the total dollar amount gained due to discounts. This value is calculated as follows:  &lt;br&gt;&lt;br&gt;&lt;b&gt;precentageSalesLift&lt;/b&gt; = &lt;b&gt;promotionSale&lt;/b&gt; / (&lt;b&gt;baseSale&lt;/b&gt; + &lt;b&gt;promotionSale&lt;/b&gt;)
     * @param value Value to set for the percentageSalesLift property.
     */
    public void setPercentageSalesLift(@jakarta.annotation.Nullable final String value) {
        this.percentageSalesLift = value;
    }
    /**
     * Sets the promotionSale property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @param value Value to set for the promotionSale property.
     */
    public void setPromotionSale(@jakarta.annotation.Nullable final Amount value) {
        this.promotionSale = value;
    }
    /**
     * Sets the totalSale property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @param value Value to set for the totalSale property.
     */
    public void setTotalSale(@jakarta.annotation.Nullable final Amount value) {
        this.totalSale = value;
    }
}
