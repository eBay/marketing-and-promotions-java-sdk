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
 * The required data to retrieve suggested keywords.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TargetedKeywordRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A field used to indicate whether additional information and insight data shall be provided for suggested keywords.&lt;br&gt;&lt;br&gt;Use this array to retrieve keyword insights, including active seller count and search volume.&lt;br /&gt;&lt;br /&gt;&lt;strong&gt;Valid Value:&lt;/strong&gt; &lt;code&gt;KEYWORD_INSIGHTS&lt;/code&gt;
     */
    private java.util.List<AdditionalInfoEnum> additionalInfo;
    /**
     * A field used to indicate that the keywords already selected by sellers for the specified listing IDs should be filtered out of the response, and only new and unique keyword recommendations shall be returned.&lt;br /&gt;&lt;br /&gt;&lt;strong&gt;Valid Value:&lt;/strong&gt; &lt;code&gt;ADOPTED_KEYWORDS&lt;/code&gt;
     */
    private java.util.List<ExclusionsEnum> exclusions;
    /**
     * A set of comma-separated listing IDs for the specific listings you wish to retrieve suggested keywords. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum number of listings requested: &lt;/b&gt;300
     */
    private java.util.List<String> listingIds;
    /**
     * A field that defines the match type for the keyword.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;BROAD&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;EXACT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PHRASE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     */
    private MatchTypeEnum matchType;
    /**
     * Instantiates a new {@link TargetedKeywordRequest} and sets the default values.
     */
    public TargetedKeywordRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TargetedKeywordRequest}
     */
    @jakarta.annotation.Nonnull
    public static TargetedKeywordRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TargetedKeywordRequest();
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
     * Gets the additionalInfo property value. A field used to indicate whether additional information and insight data shall be provided for suggested keywords.&lt;br&gt;&lt;br&gt;Use this array to retrieve keyword insights, including active seller count and search volume.&lt;br /&gt;&lt;br /&gt;&lt;strong&gt;Valid Value:&lt;/strong&gt; &lt;code&gt;KEYWORD_INSIGHTS&lt;/code&gt;
     * @return a {@link java.util.List<AdditionalInfoEnum>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AdditionalInfoEnum> getAdditionalInfo() {
        return this.additionalInfo;
    }
    /**
     * Gets the exclusions property value. A field used to indicate that the keywords already selected by sellers for the specified listing IDs should be filtered out of the response, and only new and unique keyword recommendations shall be returned.&lt;br /&gt;&lt;br /&gt;&lt;strong&gt;Valid Value:&lt;/strong&gt; &lt;code&gt;ADOPTED_KEYWORDS&lt;/code&gt;
     * @return a {@link java.util.List<ExclusionsEnum>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExclusionsEnum> getExclusions() {
        return this.exclusions;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("additionalInfo", (n) -> { this.setAdditionalInfo(n.getCollectionOfEnumValues(AdditionalInfoEnum::forValue)); });
        deserializerMap.put("exclusions", (n) -> { this.setExclusions(n.getCollectionOfEnumValues(ExclusionsEnum::forValue)); });
        deserializerMap.put("listingIds", (n) -> { this.setListingIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("matchType", (n) -> { this.setMatchType(n.getEnumValue(MatchTypeEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the listingIds property value. A set of comma-separated listing IDs for the specific listings you wish to retrieve suggested keywords. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum number of listings requested: &lt;/b&gt;300
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getListingIds() {
        return this.listingIds;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfEnumValues("additionalInfo", this.getAdditionalInfo());
        writer.writeCollectionOfEnumValues("exclusions", this.getExclusions());
        writer.writeCollectionOfPrimitiveValues("listingIds", this.getListingIds());
        writer.writeEnumValue("matchType", this.getMatchType());
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
     * Sets the additionalInfo property value. A field used to indicate whether additional information and insight data shall be provided for suggested keywords.&lt;br&gt;&lt;br&gt;Use this array to retrieve keyword insights, including active seller count and search volume.&lt;br /&gt;&lt;br /&gt;&lt;strong&gt;Valid Value:&lt;/strong&gt; &lt;code&gt;KEYWORD_INSIGHTS&lt;/code&gt;
     * @param value Value to set for the additionalInfo property.
     */
    public void setAdditionalInfo(@jakarta.annotation.Nullable final java.util.List<AdditionalInfoEnum> value) {
        this.additionalInfo = value;
    }
    /**
     * Sets the exclusions property value. A field used to indicate that the keywords already selected by sellers for the specified listing IDs should be filtered out of the response, and only new and unique keyword recommendations shall be returned.&lt;br /&gt;&lt;br /&gt;&lt;strong&gt;Valid Value:&lt;/strong&gt; &lt;code&gt;ADOPTED_KEYWORDS&lt;/code&gt;
     * @param value Value to set for the exclusions property.
     */
    public void setExclusions(@jakarta.annotation.Nullable final java.util.List<ExclusionsEnum> value) {
        this.exclusions = value;
    }
    /**
     * Sets the listingIds property value. A set of comma-separated listing IDs for the specific listings you wish to retrieve suggested keywords. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum number of listings requested: &lt;/b&gt;300
     * @param value Value to set for the listingIds property.
     */
    public void setListingIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.listingIds = value;
    }
    /**
     * Sets the matchType property value. A field that defines the match type for the keyword.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;BROAD&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;EXACT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PHRASE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the matchType property.
     */
    public void setMatchType(@jakarta.annotation.Nullable final MatchTypeEnum value) {
        this.matchType = value;
    }
}
