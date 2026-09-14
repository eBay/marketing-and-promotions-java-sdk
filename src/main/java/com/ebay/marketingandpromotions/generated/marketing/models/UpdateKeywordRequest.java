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
 * A type that defines the fields for the request to update a keyword.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateKeywordRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container is used to set or change the bid for the keyword. Each time a listing is retrieved in search results using this keyword and clicked on, the seller will be charged this amount. Each click goes toward the daily budget set up for the CPC campaign. If the bid is not provided, then the default bid associated with the ad group is used.
     */
    private Amount bid;
    /**
     * Include this field if you wish to change the status of the keyword. The status value specified here must be different than the keyword&apos;s current status. To confirm the current status of a keyword, you can use the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-keyword-getkeyword&quot;&gt;getKeyword&lt;/a&gt; method.&lt;/p&gt;&lt;p&gt;If the status of the ad is currently &lt;code&gt;ACTIVE&lt;/code&gt;, you can change status to &lt;code&gt;PAUSED&lt;/code&gt; or &lt;code&gt;ARCHIVED&lt;/code&gt;. If ad group is currently in &lt;code&gt;PAUSED&lt;/code&gt; status, you can change the status back to &lt;code&gt;ACTIVE&lt;/code&gt;. Ads that are currently in &lt;code&gt;ARCHIVED&lt;/code&gt; status cannot be made &lt;code&gt;ACTIVE&lt;/code&gt; again.
     */
    private KeywordStatusEnum keywordStatus;
    /**
     * Instantiates a new {@link UpdateKeywordRequest} and sets the default values.
     */
    public UpdateKeywordRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdateKeywordRequest}
     */
    @jakarta.annotation.Nonnull
    public static UpdateKeywordRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateKeywordRequest();
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
     * Gets the bid property value. This container is used to set or change the bid for the keyword. Each time a listing is retrieved in search results using this keyword and clicked on, the seller will be charged this amount. Each click goes toward the daily budget set up for the CPC campaign. If the bid is not provided, then the default bid associated with the ad group is used.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("bid", (n) -> { this.setBid(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("keywordStatus", (n) -> { this.setKeywordStatus(n.getEnumValue(KeywordStatusEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the keywordStatus property value. Include this field if you wish to change the status of the keyword. The status value specified here must be different than the keyword&apos;s current status. To confirm the current status of a keyword, you can use the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-keyword-getkeyword&quot;&gt;getKeyword&lt;/a&gt; method.&lt;/p&gt;&lt;p&gt;If the status of the ad is currently &lt;code&gt;ACTIVE&lt;/code&gt;, you can change status to &lt;code&gt;PAUSED&lt;/code&gt; or &lt;code&gt;ARCHIVED&lt;/code&gt;. If ad group is currently in &lt;code&gt;PAUSED&lt;/code&gt; status, you can change the status back to &lt;code&gt;ACTIVE&lt;/code&gt;. Ads that are currently in &lt;code&gt;ARCHIVED&lt;/code&gt; status cannot be made &lt;code&gt;ACTIVE&lt;/code&gt; again.
     * @return a {@link KeywordStatusEnum}
     */
    @jakarta.annotation.Nullable
    public KeywordStatusEnum getKeywordStatus() {
        return this.keywordStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("bid", this.getBid());
        writer.writeEnumValue("keywordStatus", this.getKeywordStatus());
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
     * Sets the bid property value. This container is used to set or change the bid for the keyword. Each time a listing is retrieved in search results using this keyword and clicked on, the seller will be charged this amount. Each click goes toward the daily budget set up for the CPC campaign. If the bid is not provided, then the default bid associated with the ad group is used.
     * @param value Value to set for the bid property.
     */
    public void setBid(@jakarta.annotation.Nullable final Amount value) {
        this.bid = value;
    }
    /**
     * Sets the keywordStatus property value. Include this field if you wish to change the status of the keyword. The status value specified here must be different than the keyword&apos;s current status. To confirm the current status of a keyword, you can use the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-keyword-getkeyword&quot;&gt;getKeyword&lt;/a&gt; method.&lt;/p&gt;&lt;p&gt;If the status of the ad is currently &lt;code&gt;ACTIVE&lt;/code&gt;, you can change status to &lt;code&gt;PAUSED&lt;/code&gt; or &lt;code&gt;ARCHIVED&lt;/code&gt;. If ad group is currently in &lt;code&gt;PAUSED&lt;/code&gt; status, you can change the status back to &lt;code&gt;ACTIVE&lt;/code&gt;. Ads that are currently in &lt;code&gt;ARCHIVED&lt;/code&gt; status cannot be made &lt;code&gt;ACTIVE&lt;/code&gt; again.
     * @param value Value to set for the keywordStatus property.
     */
    public void setKeywordStatus(@jakarta.annotation.Nullable final KeywordStatusEnum value) {
        this.keywordStatus = value;
    }
}
