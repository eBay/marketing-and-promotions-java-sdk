package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that contains the details for keywords that are associated with an ad group.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This type only applies to the Cost Per Click (CPC) funding model; it does not apply to the Cost Per Sale (CPS) funding model.&lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Keyword implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field identifies the ad group that the keyword is associated with.
     */
    private String adGroupId;
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency.
     */
    private Amount bid;
    /**
     * The unique identifier of a keyword.
     */
    private String keywordId;
    /**
     * The status of the keyword.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ACTIVE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PAUSED&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;ARCHIVED&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:KeywordStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String keywordStatus;
    /**
     * The text of the keyword.
     */
    private String keywordText;
    /**
     * A field that defines the match type for the keyword.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;BROAD&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;EXACT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PHRASE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:MatchTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String matchType;
    /**
     * Instantiates a new {@link Keyword} and sets the default values.
     */
    public Keyword() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Keyword}
     */
    @jakarta.annotation.Nonnull
    public static Keyword createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Keyword();
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
     * Gets the adGroupId property value. This field identifies the ad group that the keyword is associated with.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAdGroupId() {
        return this.adGroupId;
    }
    /**
     * Gets the bid property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getBid() {
        return this.bid;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("adGroupId", (n) -> { this.setAdGroupId(n.getStringValue()); });
        deserializerMap.put("bid", (n) -> { this.setBid(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("keywordId", (n) -> { this.setKeywordId(n.getStringValue()); });
        deserializerMap.put("keywordStatus", (n) -> { this.setKeywordStatus(n.getStringValue()); });
        deserializerMap.put("keywordText", (n) -> { this.setKeywordText(n.getStringValue()); });
        deserializerMap.put("matchType", (n) -> { this.setMatchType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the keywordId property value. The unique identifier of a keyword.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKeywordId() {
        return this.keywordId;
    }
    /**
     * Gets the keywordStatus property value. The status of the keyword.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ACTIVE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PAUSED&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;ARCHIVED&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:KeywordStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKeywordStatus() {
        return this.keywordStatus;
    }
    /**
     * Gets the keywordText property value. The text of the keyword.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKeywordText() {
        return this.keywordText;
    }
    /**
     * Gets the matchType property value. A field that defines the match type for the keyword.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;BROAD&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;EXACT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PHRASE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:MatchTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMatchType() {
        return this.matchType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("adGroupId", this.getAdGroupId());
        writer.writeObjectValue("bid", this.getBid());
        writer.writeStringValue("keywordId", this.getKeywordId());
        writer.writeStringValue("keywordStatus", this.getKeywordStatus());
        writer.writeStringValue("keywordText", this.getKeywordText());
        writer.writeStringValue("matchType", this.getMatchType());
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
     * Sets the adGroupId property value. This field identifies the ad group that the keyword is associated with.
     * @param value Value to set for the adGroupId property.
     */
    public void setAdGroupId(@jakarta.annotation.Nullable final String value) {
        this.adGroupId = value;
    }
    /**
     * Sets the bid property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @param value Value to set for the bid property.
     */
    public void setBid(@jakarta.annotation.Nullable final Amount value) {
        this.bid = value;
    }
    /**
     * Sets the keywordId property value. The unique identifier of a keyword.
     * @param value Value to set for the keywordId property.
     */
    public void setKeywordId(@jakarta.annotation.Nullable final String value) {
        this.keywordId = value;
    }
    /**
     * Sets the keywordStatus property value. The status of the keyword.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ACTIVE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PAUSED&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;ARCHIVED&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:KeywordStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the keywordStatus property.
     */
    public void setKeywordStatus(@jakarta.annotation.Nullable final String value) {
        this.keywordStatus = value;
    }
    /**
     * Sets the keywordText property value. The text of the keyword.
     * @param value Value to set for the keywordText property.
     */
    public void setKeywordText(@jakarta.annotation.Nullable final String value) {
        this.keywordText = value;
    }
    /**
     * Sets the matchType property value. A field that defines the match type for the keyword.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;BROAD&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;EXACT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PHRASE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:MatchTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the matchType property.
     */
    public void setMatchType(@jakarta.annotation.Nullable final String value) {
        this.matchType = value;
    }
}
