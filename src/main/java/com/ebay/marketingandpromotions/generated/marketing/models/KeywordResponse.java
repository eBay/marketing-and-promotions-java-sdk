// Copyright 2026 eBay Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that defines the response fields used by the &lt;b&gt;Keyword&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class KeywordResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The identifier of the ad group that the keyword was added to.
     */
    private String adGroupId;
    /**
     * This container will be returned if there is an issue creating the corresponding keyword and/or adding that keyword to the corresponding ad group.
     */
    private java.util.List<ErrorDetailV3> errors;
    /**
     * The getKeyword URI for the keyword, which is used to retrieve the keyword. This URI will be returned for each successfully created keyword.
     */
    private String href;
    /**
     * A unique eBay-assigned ID for a keyword that is generated for an ad group. This keyword ID will be generated for each successfully created keyword.
     */
    private String keywordId;
    /**
     * The text of the keyword.
     */
    private String keywordText;
    /**
     * A field that defines the match type for the keyword.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;BROAD&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;EXACT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PHRASE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     */
    private MatchTypeEnum matchType;
    /**
     * An HTTP status code is returned for each keyword to indicate the success or failure of adding that keyword to the ad group.
     */
    private Integer statusCode;
    /**
     * List of warnings associated with this operation
     */
    private java.util.List<ErrorDetailV3> warnings;
    /**
     * Instantiates a new {@link KeywordResponse} and sets the default values.
     */
    public KeywordResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link KeywordResponse}
     */
    @jakarta.annotation.Nonnull
    public static KeywordResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KeywordResponse();
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
     * Gets the adGroupId property value. The identifier of the ad group that the keyword was added to.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAdGroupId() {
        return this.adGroupId;
    }
    /**
     * Gets the errors property value. This container will be returned if there is an issue creating the corresponding keyword and/or adding that keyword to the corresponding ad group.
     * @return a {@link java.util.List<ErrorDetailV3>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ErrorDetailV3> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("adGroupId", (n) -> { this.setAdGroupId(n.getStringValue()); });
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ErrorDetailV3::createFromDiscriminatorValue)); });
        deserializerMap.put("href", (n) -> { this.setHref(n.getStringValue()); });
        deserializerMap.put("keywordId", (n) -> { this.setKeywordId(n.getStringValue()); });
        deserializerMap.put("keywordText", (n) -> { this.setKeywordText(n.getStringValue()); });
        deserializerMap.put("matchType", (n) -> { this.setMatchType(n.getEnumValue(MatchTypeEnum::forValue)); });
        deserializerMap.put("statusCode", (n) -> { this.setStatusCode(n.getIntegerValue()); });
        deserializerMap.put("warnings", (n) -> { this.setWarnings(n.getCollectionOfObjectValues(ErrorDetailV3::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the href property value. The getKeyword URI for the keyword, which is used to retrieve the keyword. This URI will be returned for each successfully created keyword.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHref() {
        return this.href;
    }
    /**
     * Gets the keywordId property value. A unique eBay-assigned ID for a keyword that is generated for an ad group. This keyword ID will be generated for each successfully created keyword.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKeywordId() {
        return this.keywordId;
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
     * Gets the matchType property value. A field that defines the match type for the keyword.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;BROAD&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;EXACT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PHRASE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link MatchTypeEnum}
     */
    @jakarta.annotation.Nullable
    public MatchTypeEnum getMatchType() {
        return this.matchType;
    }
    /**
     * Gets the statusCode property value. An HTTP status code is returned for each keyword to indicate the success or failure of adding that keyword to the ad group.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getStatusCode() {
        return this.statusCode;
    }
    /**
     * Gets the warnings property value. List of warnings associated with this operation
     * @return a {@link java.util.List<ErrorDetailV3>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ErrorDetailV3> getWarnings() {
        return this.warnings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("adGroupId", this.getAdGroupId());
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("href", this.getHref());
        writer.writeStringValue("keywordId", this.getKeywordId());
        writer.writeStringValue("keywordText", this.getKeywordText());
        writer.writeEnumValue("matchType", this.getMatchType());
        writer.writeIntegerValue("statusCode", this.getStatusCode());
        writer.writeCollectionOfObjectValues("warnings", this.getWarnings());
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
     * Sets the adGroupId property value. The identifier of the ad group that the keyword was added to.
     * @param value Value to set for the adGroupId property.
     */
    public void setAdGroupId(@jakarta.annotation.Nullable final String value) {
        this.adGroupId = value;
    }
    /**
     * Sets the errors property value. This container will be returned if there is an issue creating the corresponding keyword and/or adding that keyword to the corresponding ad group.
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<ErrorDetailV3> value) {
        this.errors = value;
    }
    /**
     * Sets the href property value. The getKeyword URI for the keyword, which is used to retrieve the keyword. This URI will be returned for each successfully created keyword.
     * @param value Value to set for the href property.
     */
    public void setHref(@jakarta.annotation.Nullable final String value) {
        this.href = value;
    }
    /**
     * Sets the keywordId property value. A unique eBay-assigned ID for a keyword that is generated for an ad group. This keyword ID will be generated for each successfully created keyword.
     * @param value Value to set for the keywordId property.
     */
    public void setKeywordId(@jakarta.annotation.Nullable final String value) {
        this.keywordId = value;
    }
    /**
     * Sets the keywordText property value. The text of the keyword.
     * @param value Value to set for the keywordText property.
     */
    public void setKeywordText(@jakarta.annotation.Nullable final String value) {
        this.keywordText = value;
    }
    /**
     * Sets the matchType property value. A field that defines the match type for the keyword.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;BROAD&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;EXACT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PHRASE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the matchType property.
     */
    public void setMatchType(@jakarta.annotation.Nullable final MatchTypeEnum value) {
        this.matchType = value;
    }
    /**
     * Sets the statusCode property value. An HTTP status code is returned for each keyword to indicate the success or failure of adding that keyword to the ad group.
     * @param value Value to set for the statusCode property.
     */
    public void setStatusCode(@jakarta.annotation.Nullable final Integer value) {
        this.statusCode = value;
    }
    /**
     * Sets the warnings property value. List of warnings associated with this operation
     * @param value Value to set for the warnings property.
     */
    public void setWarnings(@jakarta.annotation.Nullable final java.util.List<ErrorDetailV3> value) {
        this.warnings = value;
    }
}
