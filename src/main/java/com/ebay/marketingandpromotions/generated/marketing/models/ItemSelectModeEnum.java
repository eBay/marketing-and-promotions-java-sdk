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
 * Determines whether listings featured in an email campaign are selected by the seller or by eBay.&lt;br&gt;&lt;br&gt;If &lt;b&gt;itemSelectMode&lt;/b&gt; is set to &lt;code&gt;AUTO&lt;/code&gt;, eBay automatically choses listings based on values set for &lt;b&gt;sort&lt;/b&gt;, &lt;b&gt;categoryType&lt;/b&gt;, &lt;b&gt;categoryId&lt;/b&gt;, and &lt;b&gt;priceRange&lt;/b&gt;.&lt;br&gt;&lt;br&gt;If &lt;b&gt;itemSelectMode&lt;/b&gt; is set to &lt;code&gt;MANUAL&lt;/code&gt;, listings are set by the seller by populating the &lt;b&gt;itemIds&lt;/b&gt; array.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;&lt;b&gt;itemSelectMode&lt;/b&gt; is always set to &lt;code&gt;AUTO&lt;/code&gt; for &lt;code&gt;WELCOME&lt;/code&gt; email campaigns.&lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ItemSelectModeEnum implements ValuedEnum {
    AUTO("AUTO"),
    MANUAL("MANUAL");
    public final String value;
    ItemSelectModeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ItemSelectModeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "AUTO": return AUTO;
            case "MANUAL": return MANUAL;
            default: return null;
        }
    }
}
