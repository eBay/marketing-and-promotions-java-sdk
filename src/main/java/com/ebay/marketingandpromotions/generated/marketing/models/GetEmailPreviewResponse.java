package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetEmailPreviewResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The raw HTML code of the email campaign contents. The client side can use this HTML output directly.&lt;br&gt;&lt;br&gt;Because the contents of an email campaign are subject to change, these contents are a &quot;snapshot&quot; of the email campaign at a specific time and date, indicated by the &lt;b&gt;renderDate&lt;/b&gt; field.
     */
    private String content;
    /**
     * The date and time when a &quot;snapshot&quot; of the email campaign contents contained in the &lt;b&gt;content&lt;/b&gt; result was taken. Given in UTC format.
     */
    private String renderDate;
    /**
     * Instantiates a new {@link GetEmailPreviewResponse} and sets the default values.
     */
    public GetEmailPreviewResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetEmailPreviewResponse}
     */
    @jakarta.annotation.Nonnull
    public static GetEmailPreviewResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetEmailPreviewResponse();
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
     * Gets the content property value. The raw HTML code of the email campaign contents. The client side can use this HTML output directly.&lt;br&gt;&lt;br&gt;Because the contents of an email campaign are subject to change, these contents are a &quot;snapshot&quot; of the email campaign at a specific time and date, indicated by the &lt;b&gt;renderDate&lt;/b&gt; field.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContent() {
        return this.content;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("content", (n) -> { this.setContent(n.getStringValue()); });
        deserializerMap.put("renderDate", (n) -> { this.setRenderDate(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the renderDate property value. The date and time when a &quot;snapshot&quot; of the email campaign contents contained in the &lt;b&gt;content&lt;/b&gt; result was taken. Given in UTC format.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRenderDate() {
        return this.renderDate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("content", this.getContent());
        writer.writeStringValue("renderDate", this.getRenderDate());
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
     * Sets the content property value. The raw HTML code of the email campaign contents. The client side can use this HTML output directly.&lt;br&gt;&lt;br&gt;Because the contents of an email campaign are subject to change, these contents are a &quot;snapshot&quot; of the email campaign at a specific time and date, indicated by the &lt;b&gt;renderDate&lt;/b&gt; field.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final String value) {
        this.content = value;
    }
    /**
     * Sets the renderDate property value. The date and time when a &quot;snapshot&quot; of the email campaign contents contained in the &lt;b&gt;content&lt;/b&gt; result was taken. Given in UTC format.
     * @param value Value to set for the renderDate property.
     */
    public void setRenderDate(@jakarta.annotation.Nullable final String value) {
        this.renderDate = value;
    }
}
