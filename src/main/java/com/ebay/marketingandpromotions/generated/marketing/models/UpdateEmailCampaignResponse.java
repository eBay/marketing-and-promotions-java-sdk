package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateEmailCampaignResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique eBay-assigned ID to the email campaign that is generated when the email campaign is created.
     */
    private String emailCampaignId;
    /**
     * The email campaign status. See &lt;a href=&quot;/api-docs/sell/marketing/types/api:EmailCampaignStatusEnum&quot;&gt;EmailCampaignStatusEnum&lt;/a&gt; for a list of email campaign statuses and their descriptions. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:EmailCampaignStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String emailCampaignStatus;
    /**
     * Instantiates a new {@link UpdateEmailCampaignResponse} and sets the default values.
     */
    public UpdateEmailCampaignResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdateEmailCampaignResponse}
     */
    @jakarta.annotation.Nonnull
    public static UpdateEmailCampaignResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateEmailCampaignResponse();
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
     * Gets the emailCampaignId property value. The unique eBay-assigned ID to the email campaign that is generated when the email campaign is created.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmailCampaignId() {
        return this.emailCampaignId;
    }
    /**
     * Gets the emailCampaignStatus property value. The email campaign status. See &lt;a href=&quot;/api-docs/sell/marketing/types/api:EmailCampaignStatusEnum&quot;&gt;EmailCampaignStatusEnum&lt;/a&gt; for a list of email campaign statuses and their descriptions. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:EmailCampaignStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmailCampaignStatus() {
        return this.emailCampaignStatus;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("emailCampaignId", (n) -> { this.setEmailCampaignId(n.getStringValue()); });
        deserializerMap.put("emailCampaignStatus", (n) -> { this.setEmailCampaignStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("emailCampaignId", this.getEmailCampaignId());
        writer.writeStringValue("emailCampaignStatus", this.getEmailCampaignStatus());
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
     * Sets the emailCampaignId property value. The unique eBay-assigned ID to the email campaign that is generated when the email campaign is created.
     * @param value Value to set for the emailCampaignId property.
     */
    public void setEmailCampaignId(@jakarta.annotation.Nullable final String value) {
        this.emailCampaignId = value;
    }
    /**
     * Sets the emailCampaignStatus property value. The email campaign status. See &lt;a href=&quot;/api-docs/sell/marketing/types/api:EmailCampaignStatusEnum&quot;&gt;EmailCampaignStatusEnum&lt;/a&gt; for a list of email campaign statuses and their descriptions. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/api:EmailCampaignStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the emailCampaignStatus property.
     */
    public void setEmailCampaignStatus(@jakarta.annotation.Nullable final String value) {
        this.emailCampaignStatus = value;
    }
}
