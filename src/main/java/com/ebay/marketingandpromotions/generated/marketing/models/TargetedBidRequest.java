package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that defines the targeted bid.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TargetedBidRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An array of keywords for which bids will be required. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum number of keywords: &lt;/b&gt;500
     */
    private java.util.List<KeywordRequest> keywords;
    /**
     * Instantiates a new {@link TargetedBidRequest} and sets the default values.
     */
    public TargetedBidRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TargetedBidRequest}
     */
    @jakarta.annotation.Nonnull
    public static TargetedBidRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TargetedBidRequest();
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
        deserializerMap.put("keywords", (n) -> { this.setKeywords(n.getCollectionOfObjectValues(KeywordRequest::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the keywords property value. An array of keywords for which bids will be required. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum number of keywords: &lt;/b&gt;500
     * @return a {@link java.util.List<KeywordRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeywordRequest> getKeywords() {
        return this.keywords;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("keywords", this.getKeywords());
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
     * Sets the keywords property value. An array of keywords for which bids will be required. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum number of keywords: &lt;/b&gt;500
     * @param value Value to set for the keywords property.
     */
    public void setKeywords(@jakarta.annotation.Nullable final java.util.List<KeywordRequest> value) {
        this.keywords = value;
    }
}
