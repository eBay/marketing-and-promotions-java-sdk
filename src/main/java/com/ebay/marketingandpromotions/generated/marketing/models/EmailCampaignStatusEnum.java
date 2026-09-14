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
 * The email campaign status. See &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-email_campaign-getemailcampaigns.emailcampaignstatusenum&quot;&gt;EmailCampaignStatusEnum&lt;/a&gt; for information on statuses.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EmailCampaignStatusEnum implements ValuedEnum {
    ACTIVE("ACTIVE"),
    SENT("SENT"),
    ERROR("ERROR");
    public final String value;
    EmailCampaignStatusEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EmailCampaignStatusEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ACTIVE": return ACTIVE;
            case "SENT": return SENT;
            case "ERROR": return ERROR;
            default: return null;
        }
    }
}
