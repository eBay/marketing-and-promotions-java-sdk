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

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * This indicates the type of Coded Coupon discount, and is required when the discount type is &lt;b&gt;CODED_COUPON&lt;/b&gt;.&lt;br&gt;&lt;br&gt;Supported types:&lt;ul&gt;&lt;li&gt;&lt;b&gt;PRIVATE_SINGLE_SELLER_COUPON:&lt;/b&gt; Anyone can use and share the coupon code, but it isn&apos;t posted on eBay.&lt;/li&gt;&lt;li&gt;&lt;b&gt;PUBLIC_SINGLE_SELLER_COUPON:&lt;/b&gt; Anyone can find the coupon code on eBay and use it.&lt;/li&gt;&lt;/ul&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CouponTypeEnum implements ValuedEnum {
    PRIVATE_SINGLE_SELLER_COUPON("PRIVATE_SINGLE_SELLER_COUPON"),
    PUBLIC_SINGLE_SELLER_COUPON("PUBLIC_SINGLE_SELLER_COUPON");
    public final String value;
    CouponTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CouponTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "PRIVATE_SINGLE_SELLER_COUPON": return PRIVATE_SINGLE_SELLER_COUPON;
            case "PUBLIC_SINGLE_SELLER_COUPON": return PUBLIC_SINGLE_SELLER_COUPON;
            default: return null;
        }
    }
}
