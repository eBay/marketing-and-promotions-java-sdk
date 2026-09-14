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
 * Applicable for only &lt;b&gt;ORDER_DISCOUNT&lt;/b&gt; discount, this field indicates the precedence of the discount, which is used to determine the position of a discount on the seller&apos;s &lt;b&gt;All Offers&lt;/b&gt; page. If an item is associated with multiple discounts, the discount with the higher priority takes precedence.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PromotionPriorityEnum implements ValuedEnum {
    PRIORITY_1("PRIORITY_1"),
    PRIORITY_2("PRIORITY_2"),
    PRIORITY_3("PRIORITY_3"),
    PRIORITY_4("PRIORITY_4"),
    INVALID("INVALID");
    public final String value;
    PromotionPriorityEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PromotionPriorityEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "PRIORITY_1": return PRIORITY_1;
            case "PRIORITY_2": return PRIORITY_2;
            case "PRIORITY_3": return PRIORITY_3;
            case "PRIORITY_4": return PRIORITY_4;
            case "INVALID": return INVALID;
            default: return null;
        }
    }
}
