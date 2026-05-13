package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that contains the fields for the &lt;b&gt;UpdateNegativeKeyword&lt;/b&gt; response.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateNegativeKeywordResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A container that will be returned if there are one or more issues associated with modifying the corresponding negative keyword.
     */
    private java.util.List<Error> errors;
    /**
     * A unique eBay-assigned ID for a negative keyword. This keyword ID will be generated for each successfully created negative keyword.
     */
    private String negativeKeywordId;
    /**
     * An HTTP status code that indicates the success or failure of updating that negative keyword.
     */
    private Integer statusCode;
    /**
     * Instantiates a new {@link UpdateNegativeKeywordResponse} and sets the default values.
     */
    public UpdateNegativeKeywordResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdateNegativeKeywordResponse}
     */
    @jakarta.annotation.Nonnull
    public static UpdateNegativeKeywordResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateNegativeKeywordResponse();
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
     * Gets the errors property value. A container that will be returned if there are one or more issues associated with modifying the corresponding negative keyword.
     * @return a {@link java.util.List<Error>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Error> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(Error::createFromDiscriminatorValue)); });
        deserializerMap.put("negativeKeywordId", (n) -> { this.setNegativeKeywordId(n.getStringValue()); });
        deserializerMap.put("statusCode", (n) -> { this.setStatusCode(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the negativeKeywordId property value. A unique eBay-assigned ID for a negative keyword. This keyword ID will be generated for each successfully created negative keyword.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNegativeKeywordId() {
        return this.negativeKeywordId;
    }
    /**
     * Gets the statusCode property value. An HTTP status code that indicates the success or failure of updating that negative keyword.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getStatusCode() {
        return this.statusCode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("negativeKeywordId", this.getNegativeKeywordId());
        writer.writeIntegerValue("statusCode", this.getStatusCode());
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
     * Sets the errors property value. A container that will be returned if there are one or more issues associated with modifying the corresponding negative keyword.
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<Error> value) {
        this.errors = value;
    }
    /**
     * Sets the negativeKeywordId property value. A unique eBay-assigned ID for a negative keyword. This keyword ID will be generated for each successfully created negative keyword.
     * @param value Value to set for the negativeKeywordId property.
     */
    public void setNegativeKeywordId(@jakarta.annotation.Nullable final String value) {
        this.negativeKeywordId = value;
    }
    /**
     * Sets the statusCode property value. An HTTP status code that indicates the success or failure of updating that negative keyword.
     * @param value Value to set for the statusCode property.
     */
    public void setStatusCode(@jakarta.annotation.Nullable final Integer value) {
        this.statusCode = value;
    }
}
