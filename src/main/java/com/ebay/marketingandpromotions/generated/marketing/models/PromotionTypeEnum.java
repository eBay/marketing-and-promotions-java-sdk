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
 * Indicates the type of the discount, either &lt;code&gt;CODED_COUPON&lt;/code&gt;, &lt;code&gt;MARKDOWN_SALE&lt;/code&gt;, &lt;code&gt;ORDER_DISCOUNT&lt;/code&gt;, or &lt;code&gt;VOLUME_DISCOUNT&lt;/code&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PromotionTypeEnum implements ValuedEnum {
    CODED_COUPON("CODED_COUPON"),
    MARKDOWN_SALE("MARKDOWN_SALE"),
    ORDER_DISCOUNT("ORDER_DISCOUNT"),
    VOLUME_DISCOUNT("VOLUME_DISCOUNT");
    public final String value;
    PromotionTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PromotionTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "CODED_COUPON": return CODED_COUPON;
            case "MARKDOWN_SALE": return MARKDOWN_SALE;
            case "ORDER_DISCOUNT": return ORDER_DISCOUNT;
            case "VOLUME_DISCOUNT": return VOLUME_DISCOUNT;
            default: return null;
        }
    }
}
