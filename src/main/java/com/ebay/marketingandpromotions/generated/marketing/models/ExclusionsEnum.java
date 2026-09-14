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
 * An enumerated type used to filter keyword recommendations. | - **ADOPTED_KEYWORDS**: This enum value indicates that the keywords currently used for seller listings shall be considered in requests for keyword suggestions so that only new and unique keyword recommendations are provided.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ExclusionsEnum implements ValuedEnum {
    ADOPTED_KEYWORDS("ADOPTED_KEYWORDS");
    public final String value;
    ExclusionsEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ExclusionsEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ADOPTED_KEYWORDS": return ADOPTED_KEYWORDS;
            default: return null;
        }
    }
}
