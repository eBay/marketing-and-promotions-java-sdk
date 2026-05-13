package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A container for details regarding the basis for an item.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemBasis implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The estimated value of the search impressions for items based on the provided dimensions. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Duration:&lt;/b&gt; 17 days&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Total slots:&lt;/b&gt; 200 &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Channel:&lt;/b&gt; Dweb, Mweb, Native
     */
    private Integer estimatedValue;
    /**
     * The basis of the statistics. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:TargetingMetricsEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String metric;
    /**
     * Instantiates a new {@link ItemBasis} and sets the default values.
     */
    public ItemBasis() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ItemBasis}
     */
    @jakarta.annotation.Nonnull
    public static ItemBasis createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemBasis();
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
     * Gets the estimatedValue property value. The estimated value of the search impressions for items based on the provided dimensions. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Duration:&lt;/b&gt; 17 days&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Total slots:&lt;/b&gt; 200 &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Channel:&lt;/b&gt; Dweb, Mweb, Native
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getEstimatedValue() {
        return this.estimatedValue;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("estimatedValue", (n) -> { this.setEstimatedValue(n.getIntegerValue()); });
        deserializerMap.put("metric", (n) -> { this.setMetric(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the metric property value. The basis of the statistics. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:TargetingMetricsEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMetric() {
        return this.metric;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("estimatedValue", this.getEstimatedValue());
        writer.writeStringValue("metric", this.getMetric());
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
     * Sets the estimatedValue property value. The estimated value of the search impressions for items based on the provided dimensions. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Duration:&lt;/b&gt; 17 days&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Total slots:&lt;/b&gt; 200 &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Channel:&lt;/b&gt; Dweb, Mweb, Native
     * @param value Value to set for the estimatedValue property.
     */
    public void setEstimatedValue(@jakarta.annotation.Nullable final Integer value) {
        this.estimatedValue = value;
    }
    /**
     * Sets the metric property value. The basis of the statistics. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:TargetingMetricsEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the metric property.
     */
    public void setMetric(@jakarta.annotation.Nullable final String value) {
        this.metric = value;
    }
}
