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

package com.ebay.marketingandpromotions.generated.recommendation.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * An enum whose values describe whether or not eBay recommends you place the associated listing in a Promoted Listings ad campaign.  &lt;br&gt;&lt;br&gt;IDs deemed &lt;code&gt;RECOMMENDED&lt;/code&gt; by eBay are the listings with the highest potential of benefiting from being promoted. The recommendation calculation is based on marketplace trends, like buyer demand and the competition in the items category.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; A &lt;b&gt;promoteWithAd&lt;/b&gt; value cannot be calculated for listings that are part of Promoted Listings campaigns.  &lt;br&gt;&lt;br&gt;Because of this, if you call &lt;b&gt;findListingRecommendations&lt;/b&gt; with a specific set of listing IDs, the &lt;b&gt;promoteWithAd&lt;/b&gt; field is not returned for any of the listings that are involved in a promotion. However, as long as they are eligible, the trending &lt;b&gt;bidPercentage&lt;/b&gt; &lt;i&gt;is&lt;/i&gt; returned for all specified listings, even if they are part of an ad campaign.&lt;/p&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PromoteWithAd implements ValuedEnum {
    RECOMMENDED("RECOMMENDED"),
    UNDETERMINED("UNDETERMINED");
    public final String value;
    PromoteWithAd(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PromoteWithAd forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "RECOMMENDED": return RECOMMENDED;
            case "UNDETERMINED": return UNDETERMINED;
            default: return null;
        }
    }
}
