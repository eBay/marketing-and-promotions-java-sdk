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
 * Indicates the status of the campaign, such as &lt;code&gt;RUNNING&lt;/code&gt;, &lt;code&gt;PAUSED&lt;/code&gt;, and &lt;code&gt;ENDED&lt;/code&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CampaignStatusEnum implements ValuedEnum {
    DELETED("DELETED"),
    DRAFT("DRAFT"),
    ENDED("ENDED"),
    ENDING_SOON("ENDING_SOON"),
    PAUSED("PAUSED"),
    PENDING("PENDING"),
    RUNNING("RUNNING"),
    SCHEDULED("SCHEDULED"),
    SYSTEM_PAUSED("SYSTEM_PAUSED");
    public final String value;
    CampaignStatusEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CampaignStatusEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "DELETED": return DELETED;
            case "DRAFT": return DRAFT;
            case "ENDED": return ENDED;
            case "ENDING_SOON": return ENDING_SOON;
            case "PAUSED": return PAUSED;
            case "PENDING": return PENDING;
            case "RUNNING": return RUNNING;
            case "SCHEDULED": return SCHEDULED;
            case "SYSTEM_PAUSED": return SYSTEM_PAUSED;
            default: return null;
        }
    }
}
