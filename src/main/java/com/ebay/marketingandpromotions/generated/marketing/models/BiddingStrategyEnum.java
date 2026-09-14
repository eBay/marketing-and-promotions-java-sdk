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
 * Indicates the bidding strategy for an onsite Cost Per Click (CPC) campaign that uses manual targeting.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is not applicable for smart targeting campaigns.&lt;/span&gt;&lt;br&gt;Valid values are:&lt;ul&gt;&lt;li&gt;&lt;code&gt;FIXED&lt;/code&gt;&lt;br&gt;&lt;br&gt;When using a fixed bidding strategy, sellers manually assign and adjust keyword bids for the CPC campaign.&lt;/li&gt;&lt;li&gt;&lt;code&gt;DYNAMIC&lt;/code&gt;&lt;br&gt;&lt;br&gt;When using a dynamic bidding strategy, eBay manages the campaign&apos;s keyword bids and automatically updates them daily to the suggested bid.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For a CPC campaign using dynamic bidding, sellers can continue to manually add keywords for the campaign, but they are no longer able to manually adjust their associated bid values. In order to manually adjust bid values, sellers must use the &lt;code&gt;FIXED&lt;/code&gt; bidding strategy.&lt;/span&gt;&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;b&gt;Default value:&lt;/b&gt; FIXED
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BiddingStrategyEnum implements ValuedEnum {
    FIXED("FIXED"),
    DYNAMIC("DYNAMIC");
    public final String value;
    BiddingStrategyEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BiddingStrategyEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "FIXED": return FIXED;
            case "DYNAMIC": return DYNAMIC;
            default: return null;
        }
    }
}
