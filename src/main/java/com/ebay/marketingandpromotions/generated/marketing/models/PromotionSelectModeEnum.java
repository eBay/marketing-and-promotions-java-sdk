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
 * The selection mode for the discount used if the &lt;b&gt;emailCampaignType&lt;/b&gt; is set to &lt;code&gt;COUPON&lt;/code&gt;, &lt;code&gt;SALE_EVENT&lt;/code&gt;, or &lt;code&gt;ORDER_DISCOUNT&lt;/code&gt;.&lt;br&gt;&lt;br&gt;If &lt;b&gt;promotionSelectModeEnum&lt;/b&gt; is set to &lt;code&gt;AUTO&lt;/code&gt;, eBay will choose the discount to include in the email campaign. If set to &lt;code&gt;MANUAL&lt;/code&gt;, the seller must specify the discount in the &lt;b&gt;promotionId&lt;/b&gt; field.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PromotionSelectModeEnum implements ValuedEnum {
    AUTO("AUTO"),
    MANUAL("MANUAL");
    public final String value;
    PromotionSelectModeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PromotionSelectModeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "AUTO": return AUTO;
            case "MANUAL": return MANUAL;
            default: return null;
        }
    }
}
