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
 * This field is used to set the ad rate strategy for a Cost Per Sale (CPS) campaign.&lt;br&gt;&lt;br&gt;The default value for this field is &lt;code&gt;FIXED&lt;/code&gt;. If this field is omitted, the default value will be used.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is not applicable for Cost Per Click (CPC) or offsite campaigns.&lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AdRateStrategyEnum implements ValuedEnum {
    DYNAMIC("DYNAMIC"),
    FIXED("FIXED");
    public final String value;
    AdRateStrategyEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AdRateStrategyEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "DYNAMIC": return DYNAMIC;
            case "FIXED": return FIXED;
            default: return null;
        }
    }
}
