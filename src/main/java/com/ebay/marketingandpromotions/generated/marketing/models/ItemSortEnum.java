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
 * The sort rule is used to display the listings featured in the email campaign.&lt;br&gt;&lt;br&gt;Sort rules are only used if &lt;b&gt;itemSelectMode&lt;/b&gt; is set to &lt;code&gt;AUTO&lt;/code&gt;. If &lt;b&gt;itemSelectMode&lt;/b&gt; is &lt;code&gt;MANUAL&lt;/code&gt;, listings are displayed in the order in which they are listed in the &lt;b&gt;itemIds&lt;/b&gt; array. The following sort rules are available:&lt;ul&gt;&lt;li&gt;&lt;code&gt;ENDING_FIRST&lt;/code&gt; displays listings by ending date, from soonest to latest.&lt;/li&gt;&lt;li&gt;&lt;code&gt;LOWEST_PRICED&lt;/code&gt; displays listings by price, from lowest to highest.&lt;/li&gt;&lt;li&gt;&lt;code&gt;HIGHEST_PRICED&lt;/code&gt; displays listings by price, from highest to lowest.&lt;/li&gt;&lt;li&gt;&lt;code&gt;NEWLY_LISTED&lt;/code&gt; displays listings by date listed, with the newest first.&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;br&gt;The default sort rule is &lt;code&gt;NEWLY_LISTED&lt;/code&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ItemSortEnum implements ValuedEnum {
    ENDING_FIRST("ENDING_FIRST"),
    HIGHEST_PRICED("HIGHEST_PRICED"),
    LOWEST_PRICED("LOWEST_PRICED"),
    NEWLY_LISTED("NEWLY_LISTED");
    public final String value;
    ItemSortEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ItemSortEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ENDING_FIRST": return ENDING_FIRST;
            case "HIGHEST_PRICED": return HIGHEST_PRICED;
            case "LOWEST_PRICED": return LOWEST_PRICED;
            case "NEWLY_LISTED": return NEWLY_LISTED;
            default: return null;
        }
    }
}
