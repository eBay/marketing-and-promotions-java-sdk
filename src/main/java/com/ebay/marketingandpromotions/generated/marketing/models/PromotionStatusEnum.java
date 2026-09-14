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
 * The current status of the discount. When creating a new discount, you must set this value to either &lt;code&gt;DRAFT&lt;/code&gt; or &lt;code&gt;SCHEDULED&lt;/code&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PromotionStatusEnum implements ValuedEnum {
    SCHEDULED("SCHEDULED"),
    RUNNING("RUNNING"),
    PAUSED("PAUSED"),
    DRAFT("DRAFT"),
    ENDED("ENDED"),
    INVALID("INVALID");
    public final String value;
    PromotionStatusEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PromotionStatusEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "SCHEDULED": return SCHEDULED;
            case "RUNNING": return RUNNING;
            case "PAUSED": return PAUSED;
            case "DRAFT": return DRAFT;
            case "ENDED": return ENDED;
            case "INVALID": return INVALID;
            default: return null;
        }
    }
}
