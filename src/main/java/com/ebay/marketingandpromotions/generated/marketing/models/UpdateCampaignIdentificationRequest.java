package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type specifies the updated name, and start and end dates for an update-campaign request.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateCampaignIdentificationRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The new seller-defined name for the campaign. This value must be unique for the seller. &lt;p&gt;If you don&apos;t want to change the name of the campaign, specify the current campaign name in this field.&lt;p&gt;You can use any alphanumeric characters in the name, except the less than (&amp;lt;) or greater than (&amp;gt;) characters.&lt;/p&gt;&lt;b&gt;Max length: &lt;/b&gt;80 characters.
     */
    private String campaignName;
    /**
     * The date and time the campaign ends, in UTC format (&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt;). If this field is omitted, the campaign will have no defined end date, and will not end until the seller makes a decision to end the campaign with an &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/endCampaign&quot;&gt;endCampaign&lt;/a&gt; call, or if they update the campaign at a later time with an end date.&lt;p&gt;If you want to change only the end date of the campaign, you must specify the current campaign name, set the &lt;b&gt;endDate&lt;/b&gt; as desired, and set the &lt;b&gt;startDate&lt;/b&gt; to the actual start date of the campaign. This applies if the campaign status is &lt;code&gt;RUNNING&lt;/code&gt; or &lt;code&gt;PAUSED&lt;/code&gt;. You can retrieve the &lt;b&gt;startDate&lt;/b&gt; using the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaign#response.startDate&quot;&gt;getCampaign&lt;/a&gt; method.&lt;/p&gt; &lt;p&gt;Note that if you do not set a new end date in this call, any current endDate value will be set to null. To preserve the currently-set end date, you must specify the value again in your request.&lt;/p&gt;
     */
    private String endDate;
    /**
     * The new start date for the campaign, in UTC format (&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt;).&lt;p&gt;If the campaign status is &lt;code&gt;RUNNING&lt;/code&gt; or &lt;code&gt;PAUSED&lt;/code&gt;, the &lt;b&gt;startDate&lt;/b&gt; must be specified and must be the actual start date of the campaign, even if you are only changing the &lt;b&gt;endDate&lt;/b&gt;. You can retrieve the campaign&apos;s &lt;b&gt;startDate&lt;/b&gt; using the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaign#response.startDate&quot;&gt;getCampaign&lt;/a&gt; method.&lt;/p&gt;&lt;p&gt;On the date specified, the service derives the keywords for each listing in the campaign, creates an ad for each listing, and associates each new ad with the campaign. The campaign starts after this process is completed. The amount of time it takes the service to start the campaign depends on the number of listings in the campaign.&lt;/p&gt;  &lt;p&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve the &lt;b&gt;campaign_id&lt;/b&gt; and the campaign status (&lt;code&gt;RUNNING&lt;/code&gt;, &lt;code&gt;PAUSED&lt;/code&gt;, &lt;code&gt;ENDED&lt;/code&gt;, and so on) for all the seller&apos;s campaigns.&lt;/p&gt;
     */
    private String startDate;
    /**
     * Instantiates a new {@link UpdateCampaignIdentificationRequest} and sets the default values.
     */
    public UpdateCampaignIdentificationRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdateCampaignIdentificationRequest}
     */
    @jakarta.annotation.Nonnull
    public static UpdateCampaignIdentificationRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateCampaignIdentificationRequest();
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
     * Gets the campaignName property value. The new seller-defined name for the campaign. This value must be unique for the seller. &lt;p&gt;If you don&apos;t want to change the name of the campaign, specify the current campaign name in this field.&lt;p&gt;You can use any alphanumeric characters in the name, except the less than (&amp;lt;) or greater than (&amp;gt;) characters.&lt;/p&gt;&lt;b&gt;Max length: &lt;/b&gt;80 characters.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCampaignName() {
        return this.campaignName;
    }
    /**
     * Gets the endDate property value. The date and time the campaign ends, in UTC format (&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt;). If this field is omitted, the campaign will have no defined end date, and will not end until the seller makes a decision to end the campaign with an &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/endCampaign&quot;&gt;endCampaign&lt;/a&gt; call, or if they update the campaign at a later time with an end date.&lt;p&gt;If you want to change only the end date of the campaign, you must specify the current campaign name, set the &lt;b&gt;endDate&lt;/b&gt; as desired, and set the &lt;b&gt;startDate&lt;/b&gt; to the actual start date of the campaign. This applies if the campaign status is &lt;code&gt;RUNNING&lt;/code&gt; or &lt;code&gt;PAUSED&lt;/code&gt;. You can retrieve the &lt;b&gt;startDate&lt;/b&gt; using the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaign#response.startDate&quot;&gt;getCampaign&lt;/a&gt; method.&lt;/p&gt; &lt;p&gt;Note that if you do not set a new end date in this call, any current endDate value will be set to null. To preserve the currently-set end date, you must specify the value again in your request.&lt;/p&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEndDate() {
        return this.endDate;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("campaignName", (n) -> { this.setCampaignName(n.getStringValue()); });
        deserializerMap.put("endDate", (n) -> { this.setEndDate(n.getStringValue()); });
        deserializerMap.put("startDate", (n) -> { this.setStartDate(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the startDate property value. The new start date for the campaign, in UTC format (&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt;).&lt;p&gt;If the campaign status is &lt;code&gt;RUNNING&lt;/code&gt; or &lt;code&gt;PAUSED&lt;/code&gt;, the &lt;b&gt;startDate&lt;/b&gt; must be specified and must be the actual start date of the campaign, even if you are only changing the &lt;b&gt;endDate&lt;/b&gt;. You can retrieve the campaign&apos;s &lt;b&gt;startDate&lt;/b&gt; using the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaign#response.startDate&quot;&gt;getCampaign&lt;/a&gt; method.&lt;/p&gt;&lt;p&gt;On the date specified, the service derives the keywords for each listing in the campaign, creates an ad for each listing, and associates each new ad with the campaign. The campaign starts after this process is completed. The amount of time it takes the service to start the campaign depends on the number of listings in the campaign.&lt;/p&gt;  &lt;p&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve the &lt;b&gt;campaign_id&lt;/b&gt; and the campaign status (&lt;code&gt;RUNNING&lt;/code&gt;, &lt;code&gt;PAUSED&lt;/code&gt;, &lt;code&gt;ENDED&lt;/code&gt;, and so on) for all the seller&apos;s campaigns.&lt;/p&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStartDate() {
        return this.startDate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("campaignName", this.getCampaignName());
        writer.writeStringValue("endDate", this.getEndDate());
        writer.writeStringValue("startDate", this.getStartDate());
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
     * Sets the campaignName property value. The new seller-defined name for the campaign. This value must be unique for the seller. &lt;p&gt;If you don&apos;t want to change the name of the campaign, specify the current campaign name in this field.&lt;p&gt;You can use any alphanumeric characters in the name, except the less than (&amp;lt;) or greater than (&amp;gt;) characters.&lt;/p&gt;&lt;b&gt;Max length: &lt;/b&gt;80 characters.
     * @param value Value to set for the campaignName property.
     */
    public void setCampaignName(@jakarta.annotation.Nullable final String value) {
        this.campaignName = value;
    }
    /**
     * Sets the endDate property value. The date and time the campaign ends, in UTC format (&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt;). If this field is omitted, the campaign will have no defined end date, and will not end until the seller makes a decision to end the campaign with an &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/endCampaign&quot;&gt;endCampaign&lt;/a&gt; call, or if they update the campaign at a later time with an end date.&lt;p&gt;If you want to change only the end date of the campaign, you must specify the current campaign name, set the &lt;b&gt;endDate&lt;/b&gt; as desired, and set the &lt;b&gt;startDate&lt;/b&gt; to the actual start date of the campaign. This applies if the campaign status is &lt;code&gt;RUNNING&lt;/code&gt; or &lt;code&gt;PAUSED&lt;/code&gt;. You can retrieve the &lt;b&gt;startDate&lt;/b&gt; using the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaign#response.startDate&quot;&gt;getCampaign&lt;/a&gt; method.&lt;/p&gt; &lt;p&gt;Note that if you do not set a new end date in this call, any current endDate value will be set to null. To preserve the currently-set end date, you must specify the value again in your request.&lt;/p&gt;
     * @param value Value to set for the endDate property.
     */
    public void setEndDate(@jakarta.annotation.Nullable final String value) {
        this.endDate = value;
    }
    /**
     * Sets the startDate property value. The new start date for the campaign, in UTC format (&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt;).&lt;p&gt;If the campaign status is &lt;code&gt;RUNNING&lt;/code&gt; or &lt;code&gt;PAUSED&lt;/code&gt;, the &lt;b&gt;startDate&lt;/b&gt; must be specified and must be the actual start date of the campaign, even if you are only changing the &lt;b&gt;endDate&lt;/b&gt;. You can retrieve the campaign&apos;s &lt;b&gt;startDate&lt;/b&gt; using the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaign#response.startDate&quot;&gt;getCampaign&lt;/a&gt; method.&lt;/p&gt;&lt;p&gt;On the date specified, the service derives the keywords for each listing in the campaign, creates an ad for each listing, and associates each new ad with the campaign. The campaign starts after this process is completed. The amount of time it takes the service to start the campaign depends on the number of listings in the campaign.&lt;/p&gt;  &lt;p&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve the &lt;b&gt;campaign_id&lt;/b&gt; and the campaign status (&lt;code&gt;RUNNING&lt;/code&gt;, &lt;code&gt;PAUSED&lt;/code&gt;, &lt;code&gt;ENDED&lt;/code&gt;, and so on) for all the seller&apos;s campaigns.&lt;/p&gt;
     * @param value Value to set for the startDate property.
     */
    public void setStartDate(@jakarta.annotation.Nullable final String value) {
        this.startDate = value;
    }
}
