package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the annotation values associated with a dimension. Annotations are metadata of the dimension. For example, annotations for a listing ID could be &lt;code&gt;listing_title&lt;/code&gt; or &lt;code&gt;listing_quantity_sold&lt;/code&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DimensionKeyAnnotation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An annotation key associated with the dimension.
     */
    private String annotationKey;
    /**
     * The data type of the annotation key value. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/plr:DataTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String dataType;
    /**
     * Instantiates a new {@link DimensionKeyAnnotation} and sets the default values.
     */
    public DimensionKeyAnnotation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DimensionKeyAnnotation}
     */
    @jakarta.annotation.Nonnull
    public static DimensionKeyAnnotation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DimensionKeyAnnotation();
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
     * Gets the annotationKey property value. An annotation key associated with the dimension.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAnnotationKey() {
        return this.annotationKey;
    }
    /**
     * Gets the dataType property value. The data type of the annotation key value. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/plr:DataTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
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
        deserializerMap.put("annotationKey", (n) -> { this.setAnnotationKey(n.getStringValue()); });
        deserializerMap.put("dataType", (n) -> { this.setDataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("annotationKey", this.getAnnotationKey());
        writer.writeStringValue("dataType", this.getDataType());
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
     * Sets the annotationKey property value. An annotation key associated with the dimension.
     * @param value Value to set for the annotationKey property.
     */
    public void setAnnotationKey(@jakarta.annotation.Nullable final String value) {
        this.annotationKey = value;
    }
    /**
     * Sets the dataType property value. The data type of the annotation key value. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/plr:DataTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the dataType property.
     */
    public void setDataType(@jakarta.annotation.Nullable final String value) {
        this.dataType = value;
    }
}
