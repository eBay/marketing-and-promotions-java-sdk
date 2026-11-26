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
 * The current state of the promotional offer.&lt;br&gt;&lt;br&gt;If the offer state is returned as &lt;code&gt;REQUIRES_ACTIVATION&lt;/code&gt;, use the &lt;a href=/develop/api/sell/marketing_api#sell-marketing_api-seller_promotional_offers-activatepromotion&quot;&gt;activatePromotion&lt;/a&gt; method to activate the promotion for the seller.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OfferStateEnum implements ValuedEnum {
    REQUIRES_ACTIVATION("REQUIRES_ACTIVATION"),
    ACTIVATED("ACTIVATED"),
    ELIGIBLE("ELIGIBLE"),
    ACTIVE("ACTIVE"),
    EXPIRED("EXPIRED");
    public final String value;
    OfferStateEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OfferStateEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "REQUIRES_ACTIVATION": return REQUIRES_ACTIVATION;
            case "ACTIVATED": return ACTIVATED;
            case "ELIGIBLE": return ELIGIBLE;
            case "ACTIVE": return ACTIVE;
            case "EXPIRED": return EXPIRED;
            default: return null;
        }
    }
}
