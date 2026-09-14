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
 * The email campaign type. See &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-email_campaign-getemailcampaigns.campaigntypeenum&quot;&gt;CampaignTypeEnum&lt;/a&gt; for definitions of email campaign types.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CampaignTypeEnum implements ValuedEnum {
    WELCOME("WELCOME"),
    ITEM_SHOWCASE("ITEM_SHOWCASE"),
    COUPON("COUPON"),
    SALE_EVENT("SALE_EVENT"),
    ORDER_DISCOUNT("ORDER_DISCOUNT"),
    VOLUME_PRICING("VOLUME_PRICING");
    public final String value;
    CampaignTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CampaignTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "WELCOME": return WELCOME;
            case "ITEM_SHOWCASE": return ITEM_SHOWCASE;
            case "COUPON": return COUPON;
            case "SALE_EVENT": return SALE_EVENT;
            case "ORDER_DISCOUNT": return ORDER_DISCOUNT;
            case "VOLUME_PRICING": return VOLUME_PRICING;
            default: return null;
        }
    }
}
