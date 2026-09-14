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
 * The &lt;b&gt;report_type&lt;/b&gt;, as specified in the request to create the report task.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; INVENTORY_PERFORMANCE_REPORT is not currently available; availability date is pending.&lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ReportTypeEnum implements ValuedEnum {
    ACCOUNT_PERFORMANCE_REPORT("ACCOUNT_PERFORMANCE_REPORT"),
    ALL_CAMPAIGN_PERFORMANCE_SUMMARY_REPORT("ALL_CAMPAIGN_PERFORMANCE_SUMMARY_REPORT"),
    CAMPAIGN_PERFORMANCE_REPORT("CAMPAIGN_PERFORMANCE_REPORT"),
    CAMPAIGN_PERFORMANCE_SUMMARY_REPORT("CAMPAIGN_PERFORMANCE_SUMMARY_REPORT"),
    INVENTORY_PERFORMANCE_REPORT("INVENTORY_PERFORMANCE_REPORT"),
    LISTING_PERFORMANCE_REPORT("LISTING_PERFORMANCE_REPORT"),
    KEYWORD_PERFORMANCE_REPORT("KEYWORD_PERFORMANCE_REPORT"),
    TRANSACTION_REPORT("TRANSACTION_REPORT"),
    SEARCH_QUERY_PERFORMANCE_REPORT("SEARCH_QUERY_PERFORMANCE_REPORT");
    public final String value;
    ReportTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ReportTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ACCOUNT_PERFORMANCE_REPORT": return ACCOUNT_PERFORMANCE_REPORT;
            case "ALL_CAMPAIGN_PERFORMANCE_SUMMARY_REPORT": return ALL_CAMPAIGN_PERFORMANCE_SUMMARY_REPORT;
            case "CAMPAIGN_PERFORMANCE_REPORT": return CAMPAIGN_PERFORMANCE_REPORT;
            case "CAMPAIGN_PERFORMANCE_SUMMARY_REPORT": return CAMPAIGN_PERFORMANCE_SUMMARY_REPORT;
            case "INVENTORY_PERFORMANCE_REPORT": return INVENTORY_PERFORMANCE_REPORT;
            case "LISTING_PERFORMANCE_REPORT": return LISTING_PERFORMANCE_REPORT;
            case "KEYWORD_PERFORMANCE_REPORT": return KEYWORD_PERFORMANCE_REPORT;
            case "TRANSACTION_REPORT": return TRANSACTION_REPORT;
            case "SEARCH_QUERY_PERFORMANCE_REPORT": return SEARCH_QUERY_PERFORMANCE_REPORT;
            default: return null;
        }
    }
}
