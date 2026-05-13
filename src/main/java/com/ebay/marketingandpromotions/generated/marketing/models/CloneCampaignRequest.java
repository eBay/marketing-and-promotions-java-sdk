package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the fields needed for a clone-campaign request.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloneCampaignRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A seller-defined name for the newly-cloned campaign. This value must be unique for the seller.&lt;br&gt;&lt;br&gt;You can use any alphanumeric characters in the name, except the less than (&amp;lt;) or greater than (&amp;gt;) characters.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length: &lt;/b&gt;80 characters
     */
    private String campaignName;
    /**
     * The date and time the campaign ends, in UTC format (&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt;). If this field is omitted, the campaign will have no defined end date, and will not end until the seller makes a decision to end the campaign with an &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/endCampaign&quot;&gt;endCampaign&lt;/a&gt; call, or if they update the campaign at a later time with an end date.
     */
    private String endDate;
    /**
     * This type defines how the Promoted Listings fee is calculated for a Promoted Listings ad campaign.
     */
    private FundingStrategy fundingStrategy;
    /**
     * The date and time the cloned campaign starts, in UTC format (&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt;). For display purposes, convert this time into the local time of the seller.  &lt;p&gt;On the date specified, the service derives the keywords for each listing in the campaign, creates an ad for each listing, and associates each new ad with the campaign. The campaign starts after this process is completed. The amount of time it takes the service to start the campaign depends on the number of listings in the campaign. Call &lt;b&gt;getCampaign&lt;/b&gt; to check the status of the campaign.&lt;/p&gt;
     */
    private String startDate;
    /**
     * Instantiates a new {@link CloneCampaignRequest} and sets the default values.
     */
    public CloneCampaignRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloneCampaignRequest}
     */
    @jakarta.annotation.Nonnull
    public static CloneCampaignRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloneCampaignRequest();
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
     * Gets the campaignName property value. A seller-defined name for the newly-cloned campaign. This value must be unique for the seller.&lt;br&gt;&lt;br&gt;You can use any alphanumeric characters in the name, except the less than (&amp;lt;) or greater than (&amp;gt;) characters.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length: &lt;/b&gt;80 characters
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCampaignName() {
        return this.campaignName;
    }
    /**
     * Gets the endDate property value. The date and time the campaign ends, in UTC format (&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt;). If this field is omitted, the campaign will have no defined end date, and will not end until the seller makes a decision to end the campaign with an &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/endCampaign&quot;&gt;endCampaign&lt;/a&gt; call, or if they update the campaign at a later time with an end date.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("campaignName", (n) -> { this.setCampaignName(n.getStringValue()); });
        deserializerMap.put("endDate", (n) -> { this.setEndDate(n.getStringValue()); });
        deserializerMap.put("fundingStrategy", (n) -> { this.setFundingStrategy(n.getObjectValue(FundingStrategy::createFromDiscriminatorValue)); });
        deserializerMap.put("startDate", (n) -> { this.setStartDate(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fundingStrategy property value. This type defines how the Promoted Listings fee is calculated for a Promoted Listings ad campaign.
     * @return a {@link FundingStrategy}
     */
    @jakarta.annotation.Nullable
    public FundingStrategy getFundingStrategy() {
        return this.fundingStrategy;
    }
    /**
     * Gets the startDate property value. The date and time the cloned campaign starts, in UTC format (&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt;). For display purposes, convert this time into the local time of the seller.  &lt;p&gt;On the date specified, the service derives the keywords for each listing in the campaign, creates an ad for each listing, and associates each new ad with the campaign. The campaign starts after this process is completed. The amount of time it takes the service to start the campaign depends on the number of listings in the campaign. Call &lt;b&gt;getCampaign&lt;/b&gt; to check the status of the campaign.&lt;/p&gt;
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
        writer.writeObjectValue("fundingStrategy", this.getFundingStrategy());
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
     * Sets the campaignName property value. A seller-defined name for the newly-cloned campaign. This value must be unique for the seller.&lt;br&gt;&lt;br&gt;You can use any alphanumeric characters in the name, except the less than (&amp;lt;) or greater than (&amp;gt;) characters.&lt;br&gt;&lt;br&gt;&lt;b&gt;Max length: &lt;/b&gt;80 characters
     * @param value Value to set for the campaignName property.
     */
    public void setCampaignName(@jakarta.annotation.Nullable final String value) {
        this.campaignName = value;
    }
    /**
     * Sets the endDate property value. The date and time the campaign ends, in UTC format (&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt;). If this field is omitted, the campaign will have no defined end date, and will not end until the seller makes a decision to end the campaign with an &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/endCampaign&quot;&gt;endCampaign&lt;/a&gt; call, or if they update the campaign at a later time with an end date.
     * @param value Value to set for the endDate property.
     */
    public void setEndDate(@jakarta.annotation.Nullable final String value) {
        this.endDate = value;
    }
    /**
     * Sets the fundingStrategy property value. This type defines how the Promoted Listings fee is calculated for a Promoted Listings ad campaign.
     * @param value Value to set for the fundingStrategy property.
     */
    public void setFundingStrategy(@jakarta.annotation.Nullable final FundingStrategy value) {
        this.fundingStrategy = value;
    }
    /**
     * Sets the startDate property value. The date and time the cloned campaign starts, in UTC format (&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt;). For display purposes, convert this time into the local time of the seller.  &lt;p&gt;On the date specified, the service derives the keywords for each listing in the campaign, creates an ad for each listing, and associates each new ad with the campaign. The campaign starts after this process is completed. The amount of time it takes the service to start the campaign depends on the number of listings in the campaign. Call &lt;b&gt;getCampaign&lt;/b&gt; to check the status of the campaign.&lt;/p&gt;
     * @param value Value to set for the startDate property.
     */
    public void setStartDate(@jakarta.annotation.Nullable final String value) {
        this.startDate = value;
    }
}
