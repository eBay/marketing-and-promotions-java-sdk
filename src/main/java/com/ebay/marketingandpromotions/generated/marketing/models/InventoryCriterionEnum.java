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
 * Indicates how the items to be discounted are selected. You can include inventory by ID, using rules, or globally include all your inventory. 
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum InventoryCriterionEnum implements ValuedEnum {
    INVENTORY_BY_RULE("INVENTORY_BY_RULE"),
    INVENTORY_BY_VALUE("INVENTORY_BY_VALUE"),
    INVENTORY_ANY("INVENTORY_ANY");
    public final String value;
    InventoryCriterionEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static InventoryCriterionEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "INVENTORY_BY_RULE": return INVENTORY_BY_RULE;
            case "INVENTORY_BY_VALUE": return INVENTORY_BY_VALUE;
            case "INVENTORY_ANY": return INVENTORY_ANY;
            default: return null;
        }
    }
}
