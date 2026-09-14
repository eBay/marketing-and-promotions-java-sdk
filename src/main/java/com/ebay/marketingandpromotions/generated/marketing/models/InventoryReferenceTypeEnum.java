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
 * Indicates the type of item indicated by the &lt;b&gt;inventoryReferenceId&lt;/b&gt;.&lt;br&gt;&lt;br&gt;This value can be set to either &lt;code&gt;INVENTORY_ITEM&lt;/code&gt; or &lt;code&gt;INVENTORY_ITEM_GROUP&lt;/code&gt;.&lt;br&gt;&lt;br&gt;&lt;i&gt;Required if &lt;/i&gt; if you supply an &lt;b&gt;inventoryReferenceId&lt;/b&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum InventoryReferenceTypeEnum implements ValuedEnum {
    INVENTORY_ITEM("INVENTORY_ITEM"),
    INVENTORY_ITEM_GROUP("INVENTORY_ITEM_GROUP");
    public final String value;
    InventoryReferenceTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static InventoryReferenceTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "INVENTORY_ITEM": return INVENTORY_ITEM;
            case "INVENTORY_ITEM_GROUP": return INVENTORY_ITEM_GROUP;
            default: return null;
        }
    }
}
