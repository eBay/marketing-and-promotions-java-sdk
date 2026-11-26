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

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the activation information for a promotion.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Activation implements AdditionalDataHolder, Parsable {
    /**
     * This boolean indicates if activation is required for the promotion.&lt;br&gt;&lt;br&gt;If returned as &lt;code&gt;true&lt;/code&gt;, activation is required for the promotion. Use the &lt;a href=/develop/api/sell/marketing_api#sell-marketing_api-seller_promotional_offers-activatepromotion&quot;&gt;activatePromotion&lt;/a&gt; method to activate a promotion.
     */
    private Boolean activationRequired;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique hash associated with the promotion that is required for activation.&lt;br&gt;&lt;br&gt;This value, alongside the promotion&apos;s &lt;b&gt;promotionId&lt;/b&gt;, can be passed in the &lt;a href=/develop/api/sell/marketing_api#sell-marketing_api-seller_promotional_offers-activatepromotion&quot;&gt;activatePromotion&lt;/a&gt; method to activate a promotion for a seller.
     */
    private String promotionHash;
    /**
     * Instantiates a new {@link Activation} and sets the default values.
     */
    public Activation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Activation}
     */
    @jakarta.annotation.Nonnull
    public static Activation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Activation();
    }
    /**
     * Gets the activationRequired property value. This boolean indicates if activation is required for the promotion.&lt;br&gt;&lt;br&gt;If returned as &lt;code&gt;true&lt;/code&gt;, activation is required for the promotion. Use the &lt;a href=/develop/api/sell/marketing_api#sell-marketing_api-seller_promotional_offers-activatepromotion&quot;&gt;activatePromotion&lt;/a&gt; method to activate a promotion.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getActivationRequired() {
        return this.activationRequired;
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("activationRequired", (n) -> { this.setActivationRequired(n.getBooleanValue()); });
        deserializerMap.put("promotionHash", (n) -> { this.setPromotionHash(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the promotionHash property value. The unique hash associated with the promotion that is required for activation.&lt;br&gt;&lt;br&gt;This value, alongside the promotion&apos;s &lt;b&gt;promotionId&lt;/b&gt;, can be passed in the &lt;a href=/develop/api/sell/marketing_api#sell-marketing_api-seller_promotional_offers-activatepromotion&quot;&gt;activatePromotion&lt;/a&gt; method to activate a promotion for a seller.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPromotionHash() {
        return this.promotionHash;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("activationRequired", this.getActivationRequired());
        writer.writeStringValue("promotionHash", this.getPromotionHash());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activationRequired property value. This boolean indicates if activation is required for the promotion.&lt;br&gt;&lt;br&gt;If returned as &lt;code&gt;true&lt;/code&gt;, activation is required for the promotion. Use the &lt;a href=/develop/api/sell/marketing_api#sell-marketing_api-seller_promotional_offers-activatepromotion&quot;&gt;activatePromotion&lt;/a&gt; method to activate a promotion.
     * @param value Value to set for the activationRequired property.
     */
    public void setActivationRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.activationRequired = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the promotionHash property value. The unique hash associated with the promotion that is required for activation.&lt;br&gt;&lt;br&gt;This value, alongside the promotion&apos;s &lt;b&gt;promotionId&lt;/b&gt;, can be passed in the &lt;a href=/develop/api/sell/marketing_api#sell-marketing_api-seller_promotional_offers-activatepromotion&quot;&gt;activatePromotion&lt;/a&gt; method to activate a promotion for a seller.
     * @param value Value to set for the promotionHash property.
     */
    public void setPromotionHash(@jakarta.annotation.Nullable final String value) {
        this.promotionHash = value;
    }
}
