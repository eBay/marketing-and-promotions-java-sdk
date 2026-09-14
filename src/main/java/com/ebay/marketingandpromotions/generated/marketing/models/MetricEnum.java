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
 * The metric used to provide additional information for the suggested keyword.&lt;br /&gt;&lt;br /&gt;&lt;strong&gt;Valid Values:&lt;/strong&gt; &lt;ul&gt;&lt;li&gt;&lt;code&gt;ACTIVE_SELLER_COUNT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;SEARCH_VOLUME&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MetricEnum implements ValuedEnum {
    ACTIVE_SELLER_COUNT("ACTIVE_SELLER_COUNT"),
    SEARCH_VOLUME("SEARCH_VOLUME");
    public final String value;
    MetricEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MetricEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ACTIVE_SELLER_COUNT": return ACTIVE_SELLER_COUNT;
            case "SEARCH_VOLUME": return SEARCH_VOLUME;
            default: return null;
        }
    }
}
