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
 * This type defines the status of a markdown discount.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemMarkdownStatus implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates the state assigned to the markdown discount using one of the &lt;b&gt;status&lt;/b&gt; values. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/sme:ItemMarkdownStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String listingMarkdownStatus;
    /**
     * Identifies the date the last time the state of the discount changed. Both both markdown and markup events can trigger a status change.
     */
    private String statusChangedDate;
    /**
     * An eBay-assigned text string that describes the status of the discount.
     */
    private String statusMessage;
    /**
     * Instantiates a new {@link ItemMarkdownStatus} and sets the default values.
     */
    public ItemMarkdownStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ItemMarkdownStatus}
     */
    @jakarta.annotation.Nonnull
    public static ItemMarkdownStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemMarkdownStatus();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("listingMarkdownStatus", (n) -> { this.setListingMarkdownStatus(n.getStringValue()); });
        deserializerMap.put("statusChangedDate", (n) -> { this.setStatusChangedDate(n.getStringValue()); });
        deserializerMap.put("statusMessage", (n) -> { this.setStatusMessage(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the listingMarkdownStatus property value. Indicates the state assigned to the markdown discount using one of the &lt;b&gt;status&lt;/b&gt; values. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/sme:ItemMarkdownStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getListingMarkdownStatus() {
        return this.listingMarkdownStatus;
    }
    /**
     * Gets the statusChangedDate property value. Identifies the date the last time the state of the discount changed. Both both markdown and markup events can trigger a status change.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatusChangedDate() {
        return this.statusChangedDate;
    }
    /**
     * Gets the statusMessage property value. An eBay-assigned text string that describes the status of the discount.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatusMessage() {
        return this.statusMessage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("listingMarkdownStatus", this.getListingMarkdownStatus());
        writer.writeStringValue("statusChangedDate", this.getStatusChangedDate());
        writer.writeStringValue("statusMessage", this.getStatusMessage());
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
     * Sets the listingMarkdownStatus property value. Indicates the state assigned to the markdown discount using one of the &lt;b&gt;status&lt;/b&gt; values. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/sme:ItemMarkdownStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the listingMarkdownStatus property.
     */
    public void setListingMarkdownStatus(@jakarta.annotation.Nullable final String value) {
        this.listingMarkdownStatus = value;
    }
    /**
     * Sets the statusChangedDate property value. Identifies the date the last time the state of the discount changed. Both both markdown and markup events can trigger a status change.
     * @param value Value to set for the statusChangedDate property.
     */
    public void setStatusChangedDate(@jakarta.annotation.Nullable final String value) {
        this.statusChangedDate = value;
    }
    /**
     * Sets the statusMessage property value. An eBay-assigned text string that describes the status of the discount.
     * @param value Value to set for the statusMessage property.
     */
    public void setStatusMessage(@jakarta.annotation.Nullable final String value) {
        this.statusMessage = value;
    }
}
