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
 * This container defines a coded coupon discount. It is required if the discount type is CODED_COUPON.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CouponConfiguration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A unique code that buyers can use during checkout to receive a discount. The code must be unique across eBay. &lt;br&gt;&lt;br&gt;The code must be from 8-15 alphanumeric characters and can contain no more than two dashes ( - ).&lt;br&gt;&lt;br&gt;This is required when the discount type is CODED_COUPON.
     */
    private String couponCode;
    /**
     * This indicates the type of Coded Coupon discount, and is required when the discount type is &lt;b&gt;CODED_COUPON&lt;/b&gt;.&lt;br&gt;&lt;br&gt;Supported types:&lt;ul&gt;&lt;li&gt;&lt;b&gt;PRIVATE_SINGLE_SELLER_COUPON:&lt;/b&gt; Anyone can use and share the coupon code, but it isn&apos;t posted on eBay.&lt;/li&gt;&lt;li&gt;&lt;b&gt;PUBLIC_SINGLE_SELLER_COUPON:&lt;/b&gt; Anyone can find the coupon code on eBay and use it.&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/sme:CouponTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String couponType;
    /**
     * This sets the limit on the number of times a buyer can use this coupon. The range of values is 1-10. If no value is provided, a buyer can use the coupon an unlimited number of times.
     */
    private Integer maxCouponRedemptionPerUser;
    /**
     * Instantiates a new {@link CouponConfiguration} and sets the default values.
     */
    public CouponConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CouponConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static CouponConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CouponConfiguration();
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
     * Gets the couponCode property value. A unique code that buyers can use during checkout to receive a discount. The code must be unique across eBay. &lt;br&gt;&lt;br&gt;The code must be from 8-15 alphanumeric characters and can contain no more than two dashes ( - ).&lt;br&gt;&lt;br&gt;This is required when the discount type is CODED_COUPON.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCouponCode() {
        return this.couponCode;
    }
    /**
     * Gets the couponType property value. This indicates the type of Coded Coupon discount, and is required when the discount type is &lt;b&gt;CODED_COUPON&lt;/b&gt;.&lt;br&gt;&lt;br&gt;Supported types:&lt;ul&gt;&lt;li&gt;&lt;b&gt;PRIVATE_SINGLE_SELLER_COUPON:&lt;/b&gt; Anyone can use and share the coupon code, but it isn&apos;t posted on eBay.&lt;/li&gt;&lt;li&gt;&lt;b&gt;PUBLIC_SINGLE_SELLER_COUPON:&lt;/b&gt; Anyone can find the coupon code on eBay and use it.&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/sme:CouponTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCouponType() {
        return this.couponType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("couponCode", (n) -> { this.setCouponCode(n.getStringValue()); });
        deserializerMap.put("couponType", (n) -> { this.setCouponType(n.getStringValue()); });
        deserializerMap.put("maxCouponRedemptionPerUser", (n) -> { this.setMaxCouponRedemptionPerUser(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maxCouponRedemptionPerUser property value. This sets the limit on the number of times a buyer can use this coupon. The range of values is 1-10. If no value is provided, a buyer can use the coupon an unlimited number of times.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaxCouponRedemptionPerUser() {
        return this.maxCouponRedemptionPerUser;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("couponCode", this.getCouponCode());
        writer.writeStringValue("couponType", this.getCouponType());
        writer.writeIntegerValue("maxCouponRedemptionPerUser", this.getMaxCouponRedemptionPerUser());
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
     * Sets the couponCode property value. A unique code that buyers can use during checkout to receive a discount. The code must be unique across eBay. &lt;br&gt;&lt;br&gt;The code must be from 8-15 alphanumeric characters and can contain no more than two dashes ( - ).&lt;br&gt;&lt;br&gt;This is required when the discount type is CODED_COUPON.
     * @param value Value to set for the couponCode property.
     */
    public void setCouponCode(@jakarta.annotation.Nullable final String value) {
        this.couponCode = value;
    }
    /**
     * Sets the couponType property value. This indicates the type of Coded Coupon discount, and is required when the discount type is &lt;b&gt;CODED_COUPON&lt;/b&gt;.&lt;br&gt;&lt;br&gt;Supported types:&lt;ul&gt;&lt;li&gt;&lt;b&gt;PRIVATE_SINGLE_SELLER_COUPON:&lt;/b&gt; Anyone can use and share the coupon code, but it isn&apos;t posted on eBay.&lt;/li&gt;&lt;li&gt;&lt;b&gt;PUBLIC_SINGLE_SELLER_COUPON:&lt;/b&gt; Anyone can find the coupon code on eBay and use it.&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/sme:CouponTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the couponType property.
     */
    public void setCouponType(@jakarta.annotation.Nullable final String value) {
        this.couponType = value;
    }
    /**
     * Sets the maxCouponRedemptionPerUser property value. This sets the limit on the number of times a buyer can use this coupon. The range of values is 1-10. If no value is provided, a buyer can use the coupon an unlimited number of times.
     * @param value Value to set for the maxCouponRedemptionPerUser property.
     */
    public void setMaxCouponRedemptionPerUser(@jakarta.annotation.Nullable final Integer value) {
        this.maxCouponRedemptionPerUser = value;
    }
}
