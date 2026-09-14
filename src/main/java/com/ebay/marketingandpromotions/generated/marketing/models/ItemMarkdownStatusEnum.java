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
 * Indicates the state assigned to the markdown discount using one of the &lt;b&gt;status&lt;/b&gt; values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ItemMarkdownStatusEnum implements ValuedEnum {
    PENDING("PENDING"),
    MARKED_DOWN("MARKED_DOWN"),
    MARKED_UP("MARKED_UP"),
    SKIPPED("SKIPPED"),
    FAILED("FAILED");
    public final String value;
    ItemMarkdownStatusEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ItemMarkdownStatusEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "PENDING": return PENDING;
            case "MARKED_DOWN": return MARKED_DOWN;
            case "MARKED_UP": return MARKED_UP;
            case "SKIPPED": return SKIPPED;
            case "FAILED": return FAILED;
            default: return null;
        }
    }
}
