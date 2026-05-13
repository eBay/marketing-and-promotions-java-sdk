package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that defines the fields used to update a negative keyword.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateNegativeKeywordIdRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A unique eBay-assigned ID for a negative keyword. This keyword ID will be generated for each successfully created negative keyword.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/marketing/resources/negative_keyword/methods/getNegativeKeywords&quot; target=&quot;_blank&quot;&gt;getNegativeKeywords&lt;/a&gt; method to retrieve negative keyword IDs.
     */
    private String negativeKeywordId;
    /**
     * A field that defines the status of the negative keyword.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/api-docs/sell/marketing/types/pls:NegativeKeywordStatusEnum&quot; target=&quot;_blank&quot;&gt;NegativeKeywordStatusEnum&lt;/a&gt; for supported values. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:NegativeKeywordStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String negativeKeywordStatus;
    /**
     * Instantiates a new {@link UpdateNegativeKeywordIdRequest} and sets the default values.
     */
    public UpdateNegativeKeywordIdRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdateNegativeKeywordIdRequest}
     */
    @jakarta.annotation.Nonnull
    public static UpdateNegativeKeywordIdRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateNegativeKeywordIdRequest();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("negativeKeywordId", (n) -> { this.setNegativeKeywordId(n.getStringValue()); });
        deserializerMap.put("negativeKeywordStatus", (n) -> { this.setNegativeKeywordStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the negativeKeywordId property value. A unique eBay-assigned ID for a negative keyword. This keyword ID will be generated for each successfully created negative keyword.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/marketing/resources/negative_keyword/methods/getNegativeKeywords&quot; target=&quot;_blank&quot;&gt;getNegativeKeywords&lt;/a&gt; method to retrieve negative keyword IDs.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNegativeKeywordId() {
        return this.negativeKeywordId;
    }
    /**
     * Gets the negativeKeywordStatus property value. A field that defines the status of the negative keyword.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/api-docs/sell/marketing/types/pls:NegativeKeywordStatusEnum&quot; target=&quot;_blank&quot;&gt;NegativeKeywordStatusEnum&lt;/a&gt; for supported values. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:NegativeKeywordStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNegativeKeywordStatus() {
        return this.negativeKeywordStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("negativeKeywordId", this.getNegativeKeywordId());
        writer.writeStringValue("negativeKeywordStatus", this.getNegativeKeywordStatus());
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
     * Sets the negativeKeywordId property value. A unique eBay-assigned ID for a negative keyword. This keyword ID will be generated for each successfully created negative keyword.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/marketing/resources/negative_keyword/methods/getNegativeKeywords&quot; target=&quot;_blank&quot;&gt;getNegativeKeywords&lt;/a&gt; method to retrieve negative keyword IDs.
     * @param value Value to set for the negativeKeywordId property.
     */
    public void setNegativeKeywordId(@jakarta.annotation.Nullable final String value) {
        this.negativeKeywordId = value;
    }
    /**
     * Sets the negativeKeywordStatus property value. A field that defines the status of the negative keyword.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/api-docs/sell/marketing/types/pls:NegativeKeywordStatusEnum&quot; target=&quot;_blank&quot;&gt;NegativeKeywordStatusEnum&lt;/a&gt; for supported values. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:NegativeKeywordStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the negativeKeywordStatus property.
     */
    public void setNegativeKeywordStatus(@jakarta.annotation.Nullable final String value) {
        this.negativeKeywordStatus = value;
    }
}
