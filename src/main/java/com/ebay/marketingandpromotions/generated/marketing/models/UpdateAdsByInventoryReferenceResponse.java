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
 * A type that contains the response fields used by the &lt;b&gt;UpdateAdsByInventoryReference&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateAdsByInventoryReferenceResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A list of ad IDs and links to retrieve them.
     */
    private java.util.List<AdReference> ads;
    /**
     * A container for all of the errors associated with the specified inventory reference ID.
     */
    private java.util.List<ErrorDetailV3> errors;
    /**
     * The reference ID associated with the ad. The reference ID could be a SKU number or Inventory Item Group, depending on value of &lt;code&gt;inventoryReferenceType&lt;/code&gt;.
     */
    private String inventoryReferenceId;
    /**
     * The inventory reference type associated with the ad. The inventory reference type could be a SKU number or Inventory Item Group.
     */
    private InventoryReferenceTypeEnum inventoryReferenceType;
    /**
     * An HTTP status code that indicates whether or not the CPS ad was successfully updated.
     */
    private Integer statusCode;
    /**
     * Instantiates a new {@link UpdateAdsByInventoryReferenceResponse} and sets the default values.
     */
    public UpdateAdsByInventoryReferenceResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdateAdsByInventoryReferenceResponse}
     */
    @jakarta.annotation.Nonnull
    public static UpdateAdsByInventoryReferenceResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateAdsByInventoryReferenceResponse();
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
     * Gets the ads property value. A list of ad IDs and links to retrieve them.
     * @return a {@link java.util.List<AdReference>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AdReference> getAds() {
        return this.ads;
    }
    /**
     * Gets the errors property value. A container for all of the errors associated with the specified inventory reference ID.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("ads", (n) -> { this.setAds(n.getCollectionOfObjectValues(AdReference::createFromDiscriminatorValue)); });
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ErrorDetailV3::createFromDiscriminatorValue)); });
        deserializerMap.put("inventoryReferenceId", (n) -> { this.setInventoryReferenceId(n.getStringValue()); });
        deserializerMap.put("inventoryReferenceType", (n) -> { this.setInventoryReferenceType(n.getEnumValue(InventoryReferenceTypeEnum::forValue)); });
        deserializerMap.put("statusCode", (n) -> { this.setStatusCode(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inventoryReferenceId property value. The reference ID associated with the ad. The reference ID could be a SKU number or Inventory Item Group, depending on value of &lt;code&gt;inventoryReferenceType&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInventoryReferenceId() {
        return this.inventoryReferenceId;
    }
    /**
     * Gets the inventoryReferenceType property value. The inventory reference type associated with the ad. The inventory reference type could be a SKU number or Inventory Item Group.
     * @return a {@link InventoryReferenceTypeEnum}
     */
    @jakarta.annotation.Nullable
    public InventoryReferenceTypeEnum getInventoryReferenceType() {
        return this.inventoryReferenceType;
    }
    /**
     * Gets the statusCode property value. An HTTP status code that indicates whether or not the CPS ad was successfully updated.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getStatusCode() {
        return this.statusCode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("ads", this.getAds());
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
        writer.writeStringValue("inventoryReferenceId", this.getInventoryReferenceId());
        writer.writeEnumValue("inventoryReferenceType", this.getInventoryReferenceType());
        writer.writeIntegerValue("statusCode", this.getStatusCode());
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
     * Sets the ads property value. A list of ad IDs and links to retrieve them.
     * @param value Value to set for the ads property.
     */
    public void setAds(@jakarta.annotation.Nullable final java.util.List<AdReference> value) {
        this.ads = value;
    }
    /**
     * Sets the errors property value. A container for all of the errors associated with the specified inventory reference ID.
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<ErrorDetailV3> value) {
        this.errors = value;
    }
    /**
     * Sets the inventoryReferenceId property value. The reference ID associated with the ad. The reference ID could be a SKU number or Inventory Item Group, depending on value of &lt;code&gt;inventoryReferenceType&lt;/code&gt;.
     * @param value Value to set for the inventoryReferenceId property.
     */
    public void setInventoryReferenceId(@jakarta.annotation.Nullable final String value) {
        this.inventoryReferenceId = value;
    }
    /**
     * Sets the inventoryReferenceType property value. The inventory reference type associated with the ad. The inventory reference type could be a SKU number or Inventory Item Group.
     * @param value Value to set for the inventoryReferenceType property.
     */
    public void setInventoryReferenceType(@jakarta.annotation.Nullable final InventoryReferenceTypeEnum value) {
        this.inventoryReferenceType = value;
    }
    /**
     * Sets the statusCode property value. An HTTP status code that indicates whether or not the CPS ad was successfully updated.
     * @param value Value to set for the statusCode property.
     */
    public void setStatusCode(@jakarta.annotation.Nullable final Integer value) {
        this.statusCode = value;
    }
}
