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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetEmailReportResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The number of item listing links clicked from the body of campaign emails for the time range specified by the query.
     */
    private Integer clickCount;
    /**
     * The total email opened count for all email campaigns from a seller for the time range specified by the query.
     */
    private Integer openCount;
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency.
     */
    private Amount totalSales;
    /**
     * Instantiates a new {@link GetEmailReportResponse} and sets the default values.
     */
    public GetEmailReportResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetEmailReportResponse}
     */
    @jakarta.annotation.Nonnull
    public static GetEmailReportResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetEmailReportResponse();
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
     * Gets the clickCount property value. The number of item listing links clicked from the body of campaign emails for the time range specified by the query.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getClickCount() {
        return this.clickCount;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("clickCount", (n) -> { this.setClickCount(n.getIntegerValue()); });
        deserializerMap.put("openCount", (n) -> { this.setOpenCount(n.getIntegerValue()); });
        deserializerMap.put("totalSales", (n) -> { this.setTotalSales(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the openCount property value. The total email opened count for all email campaigns from a seller for the time range specified by the query.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOpenCount() {
        return this.openCount;
    }
    /**
     * Gets the totalSales property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getTotalSales() {
        return this.totalSales;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("clickCount", this.getClickCount());
        writer.writeIntegerValue("openCount", this.getOpenCount());
        writer.writeObjectValue("totalSales", this.getTotalSales());
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
     * Sets the clickCount property value. The number of item listing links clicked from the body of campaign emails for the time range specified by the query.
     * @param value Value to set for the clickCount property.
     */
    public void setClickCount(@jakarta.annotation.Nullable final Integer value) {
        this.clickCount = value;
    }
    /**
     * Sets the openCount property value. The total email opened count for all email campaigns from a seller for the time range specified by the query.
     * @param value Value to set for the openCount property.
     */
    public void setOpenCount(@jakarta.annotation.Nullable final Integer value) {
        this.openCount = value;
    }
    /**
     * Sets the totalSales property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @param value Value to set for the totalSales property.
     */
    public void setTotalSales(@jakarta.annotation.Nullable final Amount value) {
        this.totalSales = value;
    }
}
