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
 * This field must be set when applying an email campaign to a specific eBay category or store category. The enumeration value used indicates which type of category the &lt;b&gt;categoryId&lt;/b&gt; belongs to.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CategoryTypeEnum implements ValuedEnum {
    EBAY("EBAY"),
    STORE("STORE");
    public final String value;
    CategoryTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CategoryTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "EBAY": return EBAY;
            case "STORE": return STORE;
            default: return null;
        }
    }
}
