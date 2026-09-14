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
 * This enumerated type defines the funding models that specify how the Promoted Listing fee is calculated.&lt;br /&gt;&lt;br /&gt;The seller is assessed a Promoted Listing fee only if an item sells via a &lt;i&gt;Promoted Listing action&lt;/i&gt;. For more information, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot; target=&quot;_blank&quot;&gt;Funding Models&lt;/a&gt;. | - **COST_PER_SALE**: This enum value indicates that the Promoted Listing fee is calculated by multiplying the &lt;b&gt;bidPercentage&lt;/b&gt; by the final sales price of a transaction. - **COST_PER_CLICK**: This enum value indicates that the Promoted Listing fee is calculated on a Cost Per Click (CPC) basis.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FundingModelEnum implements ValuedEnum {
    COST_PER_SALE("COST_PER_SALE"),
    COST_PER_CLICK("COST_PER_CLICK");
    public final String value;
    FundingModelEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FundingModelEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "COST_PER_SALE": return COST_PER_SALE;
            case "COST_PER_CLICK": return COST_PER_CLICK;
            default: return null;
        }
    }
}
