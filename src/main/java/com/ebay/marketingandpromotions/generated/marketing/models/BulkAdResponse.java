package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the fields for the create ads in bulk response.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkAdResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array displays the list of ads that were successfully created. For any ads that were not created successfully, the errors array may provide more detail about why creation of one or more ads failed.
     */
    private java.util.List<AdResponse> responses;
    /**
     * Instantiates a new {@link BulkAdResponse} and sets the default values.
     */
    public BulkAdResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BulkAdResponse}
     */
    @jakarta.annotation.Nonnull
    public static BulkAdResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BulkAdResponse();
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
        deserializerMap.put("responses", (n) -> { this.setResponses(n.getCollectionOfObjectValues(AdResponse::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the responses property value. This array displays the list of ads that were successfully created. For any ads that were not created successfully, the errors array may provide more detail about why creation of one or more ads failed.
     * @return a {@link java.util.List<AdResponse>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AdResponse> getResponses() {
        return this.responses;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("responses", this.getResponses());
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
     * Sets the responses property value. This array displays the list of ads that were successfully created. For any ads that were not created successfully, the errors array may provide more detail about why creation of one or more ads failed.
     * @param value Value to set for the responses property.
     */
    public void setResponses(@jakarta.annotation.Nullable final java.util.List<AdResponse> value) {
        this.responses = value;
    }
}
