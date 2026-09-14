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
 * This enumerated value indicates if the category ID for the item is an identifier for eBay categories or for a seller&apos;s eBay store categories. &lt;br&gt;&lt;br&gt;For &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Campaign &quot; target=&quot;_blank&quot;&gt;Promoted Listing campaigns&lt;/a&gt;, this field includes the type of the category ID for the item(s) to be included in the campaign.&lt;br&gt;&lt;br&gt;For &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Promotio &quot; target=&quot;_blank&quot;&gt;Item discounts&lt;/a&gt;, this field identifies the scope for the corresponding array as eBay categories or for a seller&apos;s eBay store categories. Required when used in an Item discount and &lt;b&gt;inventoryCriterionType&lt;/b&gt; is set to &lt;code&gt;INVENTORY_BY_RULE&lt;/code&gt;. 
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CategoryScopeEnum implements ValuedEnum {
    MARKETPLACE("MARKETPLACE"),
    STORE("STORE");
    public final String value;
    CategoryScopeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CategoryScopeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "MARKETPLACE": return MARKETPLACE;
            case "STORE": return STORE;
            default: return null;
        }
    }
}
