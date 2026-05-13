package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the name and data type of a metric.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MetricMetadata implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The data type of the returned metric value. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/plr:DataTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String dataType;
    /**
     * The name of the metric.
     */
    private String metricKey;
    /**
     * Instantiates a new {@link MetricMetadata} and sets the default values.
     */
    public MetricMetadata() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MetricMetadata}
     */
    @jakarta.annotation.Nonnull
    public static MetricMetadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MetricMetadata();
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
     * Gets the dataType property value. The data type of the returned metric value. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/plr:DataTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDataType() {
        return this.dataType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("dataType", (n) -> { this.setDataType(n.getStringValue()); });
        deserializerMap.put("metricKey", (n) -> { this.setMetricKey(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the metricKey property value. The name of the metric.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMetricKey() {
        return this.metricKey;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("dataType", this.getDataType());
        writer.writeStringValue("metricKey", this.getMetricKey());
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
     * Sets the dataType property value. The data type of the returned metric value. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/plr:DataTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the dataType property.
     */
    public void setDataType(@jakarta.annotation.Nullable final String value) {
        this.dataType = value;
    }
    /**
     * Sets the metricKey property value. The name of the metric.
     * @param value Value to set for the metricKey property.
     */
    public void setMetricKey(@jakarta.annotation.Nullable final String value) {
        this.metricKey = value;
    }
}
