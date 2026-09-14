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

package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.find_campaign_by_ad_reference;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum GetInventoryReferenceTypeQueryParameterType implements ValuedEnum {
    INVENTORY_ITEM("INVENTORY_ITEM"),
    INVENTORY_ITEM_GROUP("INVENTORY_ITEM_GROUP");
    public final String value;
    GetInventoryReferenceTypeQueryParameterType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static GetInventoryReferenceTypeQueryParameterType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "INVENTORY_ITEM": return INVENTORY_ITEM;
            case "INVENTORY_ITEM_GROUP": return INVENTORY_ITEM_GROUP;
            default: return null;
        }
    }
}
