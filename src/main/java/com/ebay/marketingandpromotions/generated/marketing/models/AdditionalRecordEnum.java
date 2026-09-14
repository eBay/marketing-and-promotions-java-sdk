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
 * An enumerated type that defines the kind of additional records that are provided for a report. | - **NON_PERFORMING_DATA**: This enum value indicates that the additional records provided for the report include non-performing data.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;  Non-performing data is only applicable for account-level reports with no &lt;i&gt;day level&lt;/i&gt; dimension. See &lt;a href=&quot;/api-docs/restricted/sell/static/pl-playbook/pl-reports.html#types&quot; target=&quot;_blank&quot;&gt;Report Types&lt;/a&gt; in the Promoted Listings Playbook to see which report types can include non-performing data.&lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AdditionalRecordEnum implements ValuedEnum {
    NON_PERFORMING_DATA("NON_PERFORMING_DATA");
    public final String value;
    AdditionalRecordEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AdditionalRecordEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "NON_PERFORMING_DATA": return NON_PERFORMING_DATA;
            default: return null;
        }
    }
}
