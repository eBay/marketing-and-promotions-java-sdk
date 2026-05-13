package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that contains the response fields for the bulk request to create keywords.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkCreateKeywordResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A list of keywords that have been processed by the request.
     */
    private java.util.List<KeywordResponse> responses;
    /**
     * Instantiates a new {@link BulkCreateKeywordResponse} and sets the default values.
     */
    public BulkCreateKeywordResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BulkCreateKeywordResponse}
     */
    @jakarta.annotation.Nonnull
    public static BulkCreateKeywordResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BulkCreateKeywordResponse();
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
        deserializerMap.put("responses", (n) -> { this.setResponses(n.getCollectionOfObjectValues(KeywordResponse::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the responses property value. A list of keywords that have been processed by the request.
     * @return a {@link java.util.List<KeywordResponse>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeywordResponse> getResponses() {
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
     * Sets the responses property value. A list of keywords that have been processed by the request.
     * @param value Value to set for the responses property.
     */
    public void setResponses(@jakarta.annotation.Nullable final java.util.List<KeywordResponse> value) {
        this.responses = value;
    }
}
