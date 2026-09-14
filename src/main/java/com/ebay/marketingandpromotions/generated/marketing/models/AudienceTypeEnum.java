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
 * This enum value indicates the audience type. For the complete list of audience types and their associated enum values, see &lt;b&gt;AudienceTypeEnum&lt;/b&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AudienceTypeEnum implements ValuedEnum {
    ALL_SUBSCRIBERS("ALL_SUBSCRIBERS"),
    NEW_SUBSCRIBERS("NEW_SUBSCRIBERS"),
    CUSTOM("CUSTOM"),
    BUYER_GROUP("BUYER_GROUP"),
    FIRST_TIME_BUYERS("FIRST_TIME_BUYERS"),
    RECENT_BUYERS("RECENT_BUYERS"),
    MOST_RECENT_BUYERS("MOST_RECENT_BUYERS"),
    FOLLOWERS("FOLLOWERS"),
    INTERESTED_BUYERS("INTERESTED_BUYERS"),
    NEW_FOLLOWERS("NEW_FOLLOWERS"),
    POST_CMPGN_NEW_BUYERS("POST_CMPGN_NEW_BUYERS");
    public final String value;
    AudienceTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AudienceTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ALL_SUBSCRIBERS": return ALL_SUBSCRIBERS;
            case "NEW_SUBSCRIBERS": return NEW_SUBSCRIBERS;
            case "CUSTOM": return CUSTOM;
            case "BUYER_GROUP": return BUYER_GROUP;
            case "FIRST_TIME_BUYERS": return FIRST_TIME_BUYERS;
            case "RECENT_BUYERS": return RECENT_BUYERS;
            case "MOST_RECENT_BUYERS": return MOST_RECENT_BUYERS;
            case "FOLLOWERS": return FOLLOWERS;
            case "INTERESTED_BUYERS": return INTERESTED_BUYERS;
            case "NEW_FOLLOWERS": return NEW_FOLLOWERS;
            case "POST_CMPGN_NEW_BUYERS": return POST_CMPGN_NEW_BUYERS;
            default: return null;
        }
    }
}
