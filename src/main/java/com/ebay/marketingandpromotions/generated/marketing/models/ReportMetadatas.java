package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the metadata used by the all report types.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReportMetadatas implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A list of the metadata for the associated report type.
     */
    private java.util.List<ReportMetadata> reportMetadata;
    /**
     * Instantiates a new {@link ReportMetadatas} and sets the default values.
     */
    public ReportMetadatas() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ReportMetadatas}
     */
    @jakarta.annotation.Nonnull
    public static ReportMetadatas createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReportMetadatas();
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
        deserializerMap.put("reportMetadata", (n) -> { this.setReportMetadata(n.getCollectionOfObjectValues(ReportMetadata::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the reportMetadata property value. A list of the metadata for the associated report type.
     * @return a {@link java.util.List<ReportMetadata>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ReportMetadata> getReportMetadata() {
        return this.reportMetadata;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("reportMetadata", this.getReportMetadata());
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
     * Sets the reportMetadata property value. A list of the metadata for the associated report type.
     * @param value Value to set for the reportMetadata property.
     */
    public void setReportMetadata(@jakarta.annotation.Nullable final java.util.List<ReportMetadata> value) {
        this.reportMetadata = value;
    }
}
