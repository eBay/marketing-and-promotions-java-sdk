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
 * This enum defines the criterion (selection rule) types. Currently, the only criterion type supported is &lt;code&gt;INVENTORY_PARTITION&lt;/code&gt;, and you must specify this value if you manage your items with the Inventory API and you want to include items based on their inventory reference IDs.  &lt;br&gt;&lt;br&gt;Do not include this field if you manage your listings with Trading API/legacy model.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CriterionTypeEnum implements ValuedEnum {
    INVENTORY_PARTITION("INVENTORY_PARTITION");
    public final String value;
    CriterionTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CriterionTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "INVENTORY_PARTITION": return INVENTORY_PARTITION;
            default: return null;
        }
    }
}
