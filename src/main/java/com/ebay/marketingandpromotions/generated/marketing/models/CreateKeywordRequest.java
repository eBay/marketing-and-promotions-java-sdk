package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that defines the fields for the &lt;b&gt;CreateKeyword&lt;/b&gt; request.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateKeywordRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This &lt;b&gt;adGroupId&lt;/b&gt; is created when an ad group is first created and associated with a campaign. This is the ad group that the corresponding keyword will be added to. This ad group must be a part of the campaign that is specified in the call URI. Use the &lt;a href=&quot;/api-docs/sell/marketing/resources/adgroup/methods/getAdGroups&quot;&gt;getAdGroups&lt;/a&gt; method to retrieve the ad group IDs for a seller, and &lt;a href=&quot;/api-docs/sell/marketing/resources/keywords/methods/getKeywords&quot;&gt;getKeywords&lt;/a&gt; to retrieve the keyword IDs for a seller&apos;s keywords.
     */
    private String adGroupId;
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency.
     */
    private Amount bid;
    /**
     * The text of the keyword. Keywords are not case sensitive and compound words can be used without additional encoding (for example, tennis ball).&lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum number of characters:&lt;/b&gt; 100&lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum number of words:&lt;/b&gt; 10
     */
    private String keywordText;
    /**
     * A field that defines the match type for the keyword.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;BROAD&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;EXACT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PHRASE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:MatchTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String matchType;
    /**
     * Instantiates a new {@link CreateKeywordRequest} and sets the default values.
     */
    public CreateKeywordRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateKeywordRequest}
     */
    @jakarta.annotation.Nonnull
    public static CreateKeywordRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateKeywordRequest();
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
     * Gets the adGroupId property value. This &lt;b&gt;adGroupId&lt;/b&gt; is created when an ad group is first created and associated with a campaign. This is the ad group that the corresponding keyword will be added to. This ad group must be a part of the campaign that is specified in the call URI. Use the &lt;a href=&quot;/api-docs/sell/marketing/resources/adgroup/methods/getAdGroups&quot;&gt;getAdGroups&lt;/a&gt; method to retrieve the ad group IDs for a seller, and &lt;a href=&quot;/api-docs/sell/marketing/resources/keywords/methods/getKeywords&quot;&gt;getKeywords&lt;/a&gt; to retrieve the keyword IDs for a seller&apos;s keywords.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("adGroupId", (n) -> { this.setAdGroupId(n.getStringValue()); });
        deserializerMap.put("bid", (n) -> { this.setBid(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("keywordText", (n) -> { this.setKeywordText(n.getStringValue()); });
        deserializerMap.put("matchType", (n) -> { this.setMatchType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the keywordText property value. The text of the keyword. Keywords are not case sensitive and compound words can be used without additional encoding (for example, tennis ball).&lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum number of characters:&lt;/b&gt; 100&lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum number of words:&lt;/b&gt; 10
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
     * Sets the adGroupId property value. This &lt;b&gt;adGroupId&lt;/b&gt; is created when an ad group is first created and associated with a campaign. This is the ad group that the corresponding keyword will be added to. This ad group must be a part of the campaign that is specified in the call URI. Use the &lt;a href=&quot;/api-docs/sell/marketing/resources/adgroup/methods/getAdGroups&quot;&gt;getAdGroups&lt;/a&gt; method to retrieve the ad group IDs for a seller, and &lt;a href=&quot;/api-docs/sell/marketing/resources/keywords/methods/getKeywords&quot;&gt;getKeywords&lt;/a&gt; to retrieve the keyword IDs for a seller&apos;s keywords.
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
     * Sets the keywordText property value. The text of the keyword. Keywords are not case sensitive and compound words can be used without additional encoding (for example, tennis ball).&lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum number of characters:&lt;/b&gt; 100&lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum number of words:&lt;/b&gt; 10
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
