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
 * A type that defines the fields for the &lt;b&gt;CreateNegativeKeyword&lt;/b&gt; request.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateNegativeKeywordRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This adGroupId is created when an ad group is first created and associated with a campaign. This is the ad group to which the corresponding negative keyword will be added.&lt;br /&gt;&lt;br /&gt;Use the  &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_group-getadgroups&quot;&gt;getAdGroups&lt;/a&gt; method to retrieve the ad group IDs for a seller.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;i&gt;Required if&lt;/i&gt; the negative keyword is being created at the ad group level.
     */
    private String adGroupId;
    /**
     * This path parameter specifies the unique eBay-assigned identifier of the ad campaign associated with the set of negative keywords being created. &lt;br&gt;&lt;br&gt; Use the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve campaign IDs.&lt;br /&gt;&lt;br /&gt;&lt;i&gt;Required if&lt;/i&gt; the negative keyword is being created at the ad group level.
     */
    private String campaignId;
    /**
     * A field that defines the match type for the negative keyword.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; Broad matching of negative keywords is not currently supported.&lt;/span&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;EXACT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PHRASE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     */
    private NegativeKeywordMatchTypeEnum negativeKeywordMatchType;
    /**
     * The negative keyword text.
     */
    private String negativeKeywordText;
    /**
     * Instantiates a new {@link CreateNegativeKeywordRequest} and sets the default values.
     */
    public CreateNegativeKeywordRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateNegativeKeywordRequest}
     */
    @jakarta.annotation.Nonnull
    public static CreateNegativeKeywordRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateNegativeKeywordRequest();
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
     * Gets the adGroupId property value. This adGroupId is created when an ad group is first created and associated with a campaign. This is the ad group to which the corresponding negative keyword will be added.&lt;br /&gt;&lt;br /&gt;Use the  &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_group-getadgroups&quot;&gt;getAdGroups&lt;/a&gt; method to retrieve the ad group IDs for a seller.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;i&gt;Required if&lt;/i&gt; the negative keyword is being created at the ad group level.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAdGroupId() {
        return this.adGroupId;
    }
    /**
     * Gets the campaignId property value. This path parameter specifies the unique eBay-assigned identifier of the ad campaign associated with the set of negative keywords being created. &lt;br&gt;&lt;br&gt; Use the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve campaign IDs.&lt;br /&gt;&lt;br /&gt;&lt;i&gt;Required if&lt;/i&gt; the negative keyword is being created at the ad group level.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("adGroupId", (n) -> { this.setAdGroupId(n.getStringValue()); });
        deserializerMap.put("campaignId", (n) -> { this.setCampaignId(n.getStringValue()); });
        deserializerMap.put("negativeKeywordMatchType", (n) -> { this.setNegativeKeywordMatchType(n.getEnumValue(NegativeKeywordMatchTypeEnum::forValue)); });
        deserializerMap.put("negativeKeywordText", (n) -> { this.setNegativeKeywordText(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the negativeKeywordMatchType property value. A field that defines the match type for the negative keyword.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; Broad matching of negative keywords is not currently supported.&lt;/span&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;EXACT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PHRASE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link NegativeKeywordMatchTypeEnum}
     */
    @jakarta.annotation.Nullable
    public NegativeKeywordMatchTypeEnum getNegativeKeywordMatchType() {
        return this.negativeKeywordMatchType;
    }
    /**
     * Gets the negativeKeywordText property value. The negative keyword text.
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
        writer.writeEnumValue("negativeKeywordMatchType", this.getNegativeKeywordMatchType());
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
     * Sets the adGroupId property value. This adGroupId is created when an ad group is first created and associated with a campaign. This is the ad group to which the corresponding negative keyword will be added.&lt;br /&gt;&lt;br /&gt;Use the  &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_group-getadgroups&quot;&gt;getAdGroups&lt;/a&gt; method to retrieve the ad group IDs for a seller.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;i&gt;Required if&lt;/i&gt; the negative keyword is being created at the ad group level.
     * @param value Value to set for the adGroupId property.
     */
    public void setAdGroupId(@jakarta.annotation.Nullable final String value) {
        this.adGroupId = value;
    }
    /**
     * Sets the campaignId property value. This path parameter specifies the unique eBay-assigned identifier of the ad campaign associated with the set of negative keywords being created. &lt;br&gt;&lt;br&gt; Use the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve campaign IDs.&lt;br /&gt;&lt;br /&gt;&lt;i&gt;Required if&lt;/i&gt; the negative keyword is being created at the ad group level.
     * @param value Value to set for the campaignId property.
     */
    public void setCampaignId(@jakarta.annotation.Nullable final String value) {
        this.campaignId = value;
    }
    /**
     * Sets the negativeKeywordMatchType property value. A field that defines the match type for the negative keyword.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; Broad matching of negative keywords is not currently supported.&lt;/span&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;EXACT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PHRASE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the negativeKeywordMatchType property.
     */
    public void setNegativeKeywordMatchType(@jakarta.annotation.Nullable final NegativeKeywordMatchTypeEnum value) {
        this.negativeKeywordMatchType = value;
    }
    /**
     * Sets the negativeKeywordText property value. The negative keyword text.
     * @param value Value to set for the negativeKeywordText property.
     */
    public void setNegativeKeywordText(@jakarta.annotation.Nullable final String value) {
        this.negativeKeywordText = value;
    }
}
