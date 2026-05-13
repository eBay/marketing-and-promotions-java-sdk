package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that contains the fields for the ad update status by listing ID response.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AdUpdateStatusByListingIdResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A unique eBay-assigned ID for an ad group in a campaign that uses the Cost Per Click (CPC) funding model.
     */
    private String adGroupId;
    /**
     * A list of errors associated with the specified listing ID.
     */
    private java.util.List<Error> errors;
    /**
     * The URI for the ad, which can be used to retrieve the ad.
     */
    private String href;
    /**
     * A unique eBay-assigned ID that is generated when the listing is created.
     */
    private String listingId;
    /**
     * An HTTP status code that indicates the response-status of the request.
     */
    private Integer statusCode;
    /**
     * Instantiates a new {@link AdUpdateStatusByListingIdResponse} and sets the default values.
     */
    public AdUpdateStatusByListingIdResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AdUpdateStatusByListingIdResponse}
     */
    @jakarta.annotation.Nonnull
    public static AdUpdateStatusByListingIdResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AdUpdateStatusByListingIdResponse();
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
     * Gets the adGroupId property value. A unique eBay-assigned ID for an ad group in a campaign that uses the Cost Per Click (CPC) funding model.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAdGroupId() {
        return this.adGroupId;
    }
    /**
     * Gets the errors property value. A list of errors associated with the specified listing ID.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("adGroupId", (n) -> { this.setAdGroupId(n.getStringValue()); });
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(Error::createFromDiscriminatorValue)); });
        deserializerMap.put("href", (n) -> { this.setHref(n.getStringValue()); });
        deserializerMap.put("listingId", (n) -> { this.setListingId(n.getStringValue()); });
        deserializerMap.put("statusCode", (n) -> { this.setStatusCode(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the href property value. The URI for the ad, which can be used to retrieve the ad.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHref() {
        return this.href;
    }
    /**
     * Gets the listingId property value. A unique eBay-assigned ID that is generated when the listing is created.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getListingId() {
        return this.listingId;
    }
    /**
     * Gets the statusCode property value. An HTTP status code that indicates the response-status of the request.
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
        writer.writeStringValue("adGroupId", this.getAdGroupId());
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("href", this.getHref());
        writer.writeStringValue("listingId", this.getListingId());
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
     * Sets the adGroupId property value. A unique eBay-assigned ID for an ad group in a campaign that uses the Cost Per Click (CPC) funding model.
     * @param value Value to set for the adGroupId property.
     */
    public void setAdGroupId(@jakarta.annotation.Nullable final String value) {
        this.adGroupId = value;
    }
    /**
     * Sets the errors property value. A list of errors associated with the specified listing ID.
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<Error> value) {
        this.errors = value;
    }
    /**
     * Sets the href property value. The URI for the ad, which can be used to retrieve the ad.
     * @param value Value to set for the href property.
     */
    public void setHref(@jakarta.annotation.Nullable final String value) {
        this.href = value;
    }
    /**
     * Sets the listingId property value. A unique eBay-assigned ID that is generated when the listing is created.
     * @param value Value to set for the listingId property.
     */
    public void setListingId(@jakarta.annotation.Nullable final String value) {
        this.listingId = value;
    }
    /**
     * Sets the statusCode property value. An HTTP status code that indicates the response-status of the request.
     * @param value Value to set for the statusCode property.
     */
    public void setStatusCode(@jakarta.annotation.Nullable final Integer value) {
        this.statusCode = value;
    }
}
