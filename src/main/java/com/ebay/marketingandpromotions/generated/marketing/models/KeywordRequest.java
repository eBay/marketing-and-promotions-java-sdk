package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that defines the fields used by the &lt;b&gt;Keyword&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class KeywordRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The text of the keyword. Keywords are not case sensitive and compound words can be used without additional encoding (for example, tennis ball).&lt;br&gt;&lt;br&gt;You can use the &lt;a href=&quot;/api-docs/sell/marketing/resources/keyword/methods/getKeywords&quot;&gt;getKeywords&lt;/a&gt; method to retrieve keyword values currently associated with the specified ad group.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum number of characters: &lt;/b&gt;100 &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum number of words: &lt;/b&gt;10 
     */
    private String keywordText;
    /**
     * A field that defines the match type for the keyword.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;BROAD&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;EXACT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PHRASE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:MatchTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String matchType;
    /**
     * Instantiates a new {@link KeywordRequest} and sets the default values.
     */
    public KeywordRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link KeywordRequest}
     */
    @jakarta.annotation.Nonnull
    public static KeywordRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KeywordRequest();
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
        deserializerMap.put("keywordText", (n) -> { this.setKeywordText(n.getStringValue()); });
        deserializerMap.put("matchType", (n) -> { this.setMatchType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the keywordText property value. The text of the keyword. Keywords are not case sensitive and compound words can be used without additional encoding (for example, tennis ball).&lt;br&gt;&lt;br&gt;You can use the &lt;a href=&quot;/api-docs/sell/marketing/resources/keyword/methods/getKeywords&quot;&gt;getKeywords&lt;/a&gt; method to retrieve keyword values currently associated with the specified ad group.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum number of characters: &lt;/b&gt;100 &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum number of words: &lt;/b&gt;10 
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
     * Sets the keywordText property value. The text of the keyword. Keywords are not case sensitive and compound words can be used without additional encoding (for example, tennis ball).&lt;br&gt;&lt;br&gt;You can use the &lt;a href=&quot;/api-docs/sell/marketing/resources/keyword/methods/getKeywords&quot;&gt;getKeywords&lt;/a&gt; method to retrieve keyword values currently associated with the specified ad group.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum number of characters: &lt;/b&gt;100 &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum number of words: &lt;/b&gt;10 
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
