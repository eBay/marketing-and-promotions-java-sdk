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
 * The data type of the dimension value used to create the report.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DataTypeEnum implements ValuedEnum {
    DATE("DATE"),
    INTEGER("INTEGER"),
    DOUBLE("DOUBLE"),
    STRING("STRING"),
    LONG("LONG");
    public final String value;
    DataTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DataTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "DATE": return DATE;
            case "INTEGER": return INTEGER;
            case "DOUBLE": return DOUBLE;
            case "STRING": return STRING;
            case "LONG": return LONG;
            default: return null;
        }
    }
}
