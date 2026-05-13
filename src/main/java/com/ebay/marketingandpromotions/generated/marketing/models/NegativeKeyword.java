package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that defines the fields for a negative keyword.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NegativeKeyword implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An ad group ID that is generated when an ad group is first created and associated with a campaign.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; You can call the &lt;a href=&quot;/api-docs/sell/marketing/resources/adgroup/methods/getAdGroups&quot;&gt;getAdGroups&lt;/a&gt; method to retrieve the ad group IDs for a seller.&lt;/span&gt;
     */
    private String adGroupId;
    /**
     * A unique eBay-assigned ID for a campaign. This ID is generated when a campaign is created.
     */
    private String campaignId;
    /**
     * A unique eBay-assigned ID for a negative keyword. This keyword ID will be generated for each successfully created negative keyword.
     */
    private String negativeKeywordId;
    /**
     * A field that defines the match type for the negative keyword.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; Broad matching of negative keywords is not currently supported.&lt;/span&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;EXACT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PHRASE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:NegativeKeywordMatchTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String negativeKeywordMatchType;
    /**
     * A field that defines the status of the negative keyword. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:NegativeKeywordStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String negativeKeywordStatus;
    /**
     * The text for the negative keyword.
     */
    private String negativeKeywordText;
    /**
     * Instantiates a new {@link NegativeKeyword} and sets the default values.
     */
    public NegativeKeyword() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link NegativeKeyword}
     */
    @jakarta.annotation.Nonnull
    public static NegativeKeyword createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NegativeKeyword();
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
     * Gets the adGroupId property value. An ad group ID that is generated when an ad group is first created and associated with a campaign.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; You can call the &lt;a href=&quot;/api-docs/sell/marketing/resources/adgroup/methods/getAdGroups&quot;&gt;getAdGroups&lt;/a&gt; method to retrieve the ad group IDs for a seller.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAdGroupId() {
        return this.adGroupId;
    }
    /**
     * Gets the campaignId property value. A unique eBay-assigned ID for a campaign. This ID is generated when a campaign is created.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCampaignId() {
        return this.campaignId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("adGroupId", (n) -> { this.setAdGroupId(n.getStringValue()); });
        deserializerMap.put("campaignId", (n) -> { this.setCampaignId(n.getStringValue()); });
        deserializerMap.put("negativeKeywordId", (n) -> { this.setNegativeKeywordId(n.getStringValue()); });
        deserializerMap.put("negativeKeywordMatchType", (n) -> { this.setNegativeKeywordMatchType(n.getStringValue()); });
        deserializerMap.put("negativeKeywordStatus", (n) -> { this.setNegativeKeywordStatus(n.getStringValue()); });
        deserializerMap.put("negativeKeywordText", (n) -> { this.setNegativeKeywordText(n.getStringValue()); });
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
     * Gets the negativeKeywordMatchType property value. A field that defines the match type for the negative keyword.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; Broad matching of negative keywords is not currently supported.&lt;/span&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;EXACT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PHRASE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:NegativeKeywordMatchTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNegativeKeywordMatchType() {
        return this.negativeKeywordMatchType;
    }
    /**
     * Gets the negativeKeywordStatus property value. A field that defines the status of the negative keyword. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:NegativeKeywordStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNegativeKeywordStatus() {
        return this.negativeKeywordStatus;
    }
    /**
     * Gets the negativeKeywordText property value. The text for the negative keyword.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNegativeKeywordText() {
        return this.negativeKeywordText;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("adGroupId", this.getAdGroupId());
        writer.writeStringValue("campaignId", this.getCampaignId());
        writer.writeStringValue("negativeKeywordId", this.getNegativeKeywordId());
        writer.writeStringValue("negativeKeywordMatchType", this.getNegativeKeywordMatchType());
        writer.writeStringValue("negativeKeywordStatus", this.getNegativeKeywordStatus());
        writer.writeStringValue("negativeKeywordText", this.getNegativeKeywordText());
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
     * Sets the adGroupId property value. An ad group ID that is generated when an ad group is first created and associated with a campaign.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; You can call the &lt;a href=&quot;/api-docs/sell/marketing/resources/adgroup/methods/getAdGroups&quot;&gt;getAdGroups&lt;/a&gt; method to retrieve the ad group IDs for a seller.&lt;/span&gt;
     * @param value Value to set for the adGroupId property.
     */
    public void setAdGroupId(@jakarta.annotation.Nullable final String value) {
        this.adGroupId = value;
    }
    /**
     * Sets the campaignId property value. A unique eBay-assigned ID for a campaign. This ID is generated when a campaign is created.
     * @param value Value to set for the campaignId property.
     */
    public void setCampaignId(@jakarta.annotation.Nullable final String value) {
        this.campaignId = value;
    }
    /**
     * Sets the negativeKeywordId property value. A unique eBay-assigned ID for a negative keyword. This keyword ID will be generated for each successfully created negative keyword.
     * @param value Value to set for the negativeKeywordId property.
     */
    public void setNegativeKeywordId(@jakarta.annotation.Nullable final String value) {
        this.negativeKeywordId = value;
    }
    /**
     * Sets the negativeKeywordMatchType property value. A field that defines the match type for the negative keyword.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; Broad matching of negative keywords is not currently supported.&lt;/span&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;EXACT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PHRASE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:NegativeKeywordMatchTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the negativeKeywordMatchType property.
     */
    public void setNegativeKeywordMatchType(@jakarta.annotation.Nullable final String value) {
        this.negativeKeywordMatchType = value;
    }
    /**
     * Sets the negativeKeywordStatus property value. A field that defines the status of the negative keyword. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:NegativeKeywordStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the negativeKeywordStatus property.
     */
    public void setNegativeKeywordStatus(@jakarta.annotation.Nullable final String value) {
        this.negativeKeywordStatus = value;
    }
    /**
     * Sets the negativeKeywordText property value. The text for the negative keyword.
     * @param value Value to set for the negativeKeywordText property.
     */
    public void setNegativeKeywordText(@jakarta.annotation.Nullable final String value) {
        this.negativeKeywordText = value;
    }
}
