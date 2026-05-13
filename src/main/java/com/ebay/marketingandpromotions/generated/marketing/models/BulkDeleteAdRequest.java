package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the fields that the call uses to remove ads in bulk.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkDeleteAdRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An array of the listing IDs that identify the ads to remove.
     */
    private java.util.List<DeleteAdRequest> requests;
    /**
     * Instantiates a new {@link BulkDeleteAdRequest} and sets the default values.
     */
    public BulkDeleteAdRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BulkDeleteAdRequest}
     */
    @jakarta.annotation.Nonnull
    public static BulkDeleteAdRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BulkDeleteAdRequest();
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
        deserializerMap.put("requests", (n) -> { this.setRequests(n.getCollectionOfObjectValues(DeleteAdRequest::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the requests property value. An array of the listing IDs that identify the ads to remove.
     * @return a {@link java.util.List<DeleteAdRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeleteAdRequest> getRequests() {
        return this.requests;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("requests", this.getRequests());
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
     * Sets the requests property value. An array of the listing IDs that identify the ads to remove.
     * @param value Value to set for the requests property.
     */
    public void setRequests(@jakarta.annotation.Nullable final java.util.List<DeleteAdRequest> value) {
        this.requests = value;
    }
}
