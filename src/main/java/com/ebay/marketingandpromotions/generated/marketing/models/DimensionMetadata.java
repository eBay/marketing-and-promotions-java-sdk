package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the dimension used to create the report and the annotation keys associated with that dimension.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DimensionMetadata implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The data type of the dimension value used to create the report. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/plr:DataTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String dataType;
    /**
     * The name of the dimension used to create the report.
     */
    private String dimensionKey;
    /**
     * An list of annotation keys associated with the specified dimension of the report.
     */
    private java.util.List<DimensionKeyAnnotation> dimensionKeyAnnotations;
    /**
     * Instantiates a new {@link DimensionMetadata} and sets the default values.
     */
    public DimensionMetadata() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DimensionMetadata}
     */
    @jakarta.annotation.Nonnull
    public static DimensionMetadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DimensionMetadata();
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
     * Gets the dataType property value. The data type of the dimension value used to create the report. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/plr:DataTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDataType() {
        return this.dataType;
    }
    /**
     * Gets the dimensionKey property value. The name of the dimension used to create the report.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDimensionKey() {
        return this.dimensionKey;
    }
    /**
     * Gets the dimensionKeyAnnotations property value. An list of annotation keys associated with the specified dimension of the report.
     * @return a {@link java.util.List<DimensionKeyAnnotation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DimensionKeyAnnotation> getDimensionKeyAnnotations() {
        return this.dimensionKeyAnnotations;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("dataType", (n) -> { this.setDataType(n.getStringValue()); });
        deserializerMap.put("dimensionKey", (n) -> { this.setDimensionKey(n.getStringValue()); });
        deserializerMap.put("dimensionKeyAnnotations", (n) -> { this.setDimensionKeyAnnotations(n.getCollectionOfObjectValues(DimensionKeyAnnotation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("dataType", this.getDataType());
        writer.writeStringValue("dimensionKey", this.getDimensionKey());
        writer.writeCollectionOfObjectValues("dimensionKeyAnnotations", this.getDimensionKeyAnnotations());
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
     * Sets the dataType property value. The data type of the dimension value used to create the report. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/plr:DataTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the dataType property.
     */
    public void setDataType(@jakarta.annotation.Nullable final String value) {
        this.dataType = value;
    }
    /**
     * Sets the dimensionKey property value. The name of the dimension used to create the report.
     * @param value Value to set for the dimensionKey property.
     */
    public void setDimensionKey(@jakarta.annotation.Nullable final String value) {
        this.dimensionKey = value;
    }
    /**
     * Sets the dimensionKeyAnnotations property value. An list of annotation keys associated with the specified dimension of the report.
     * @param value Value to set for the dimensionKeyAnnotations property.
     */
    public void setDimensionKeyAnnotations(@jakarta.annotation.Nullable final java.util.List<DimensionKeyAnnotation> value) {
        this.dimensionKeyAnnotations = value;
    }
}
