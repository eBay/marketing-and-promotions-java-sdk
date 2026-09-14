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
 * The schedule type used for sending the email campaign. See &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-email_campaign-getemailcampaigns.scheduledatetypeenum&quot;&gt;ScheduleDateTypeEnum&lt;/a&gt; for available schedule types.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ScheduleDateTypeEnum implements ValuedEnum {
    SYSTEM("SYSTEM"),
    CUSTOM("CUSTOM");
    public final String value;
    ScheduleDateTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ScheduleDateTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "SYSTEM": return SYSTEM;
            case "CUSTOM": return CUSTOM;
            default: return null;
        }
    }
}
