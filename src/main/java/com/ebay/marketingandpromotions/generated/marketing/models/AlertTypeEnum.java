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
 * The type of alert message. For example, an invalid bid percentage.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AlertTypeEnum implements ValuedEnum {
    INVALID_BID_PERCENTAGE("INVALID_BID_PERCENTAGE"),
    INVALID_CAP_PERCENTAGE("INVALID_CAP_PERCENTAGE");
    public final String value;
    AlertTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AlertTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "INVALID_BID_PERCENTAGE": return INVALID_BID_PERCENTAGE;
            case "INVALID_CAP_PERCENTAGE": return INVALID_CAP_PERCENTAGE;
            default: return null;
        }
    }
}
