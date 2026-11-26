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
 * This type returns the details of a promotional offer for which a seller is eligible.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SellerPromotionalOffer implements AdditionalDataHolder, Parsable {
    /**
     * This container returns activation information for the promotion that contains one or more offers, including if activation is required and the &lt;b&gt;promotionHash&lt;/b&gt; value needed for activation.&lt;br&gt;&lt;br&gt;This field is only returned for RSVP promotions that require activation.
     */
    private Activation activation;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container shows the budget remaining in the promotional offer period.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This container is only returned if the promotional offer is budget based.&lt;/span&gt;
     */
    private Amount budgetAmountRemaining;
    /**
     * This container shows the budget that has been used so far during the promotional offer period.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This container is only returned if the promotional offer is budget based.&lt;/span&gt;
     */
    private Amount budgetAmountUsed;
    /**
     * The description of the promotion.
     */
    private String description;
    /**
     * The URL for the webpage that explains more details about the particular promotion, including the Terms and Conditions for the promotion.
     */
    private String learnMoreUrl;
    /**
     * The eBay marketplace associated with the promotion.
     */
    private MarketplaceIdEnum marketplaceId;
    /**
     * A timestamp that indicates the date and time when the promotional offer is no longer active for the seller. This value is returned in UTC format (&lt;code&gt;yyyy-MM-ddTHH:mm:ssZ&lt;/code&gt;), which can be converted into the local time of the buyer.
     */
    private String offerEndDate;
    /**
     * A timestamp that indicates the date and time when the promotional offer becomes active for the seller. This value is returned in UTC format (&lt;code&gt;yyyy-MM-ddTHH:mm:ssZ&lt;/code&gt;), which can be converted into the local time of the buyer.
     */
    private String offerStartDate;
    /**
     * The current state of the promotional offer.&lt;br&gt;&lt;br&gt;If the offer state is returned as &lt;code&gt;REQUIRES_ACTIVATION&lt;/code&gt;, use the &lt;a href=/develop/api/sell/marketing_api#sell-marketing_api-seller_promotional_offers-activatepromotion&quot;&gt;activatePromotion&lt;/a&gt; method to activate the promotion for the seller.
     */
    private OfferStateEnum offerState;
    /**
     * The promotional offer type. This field specifies if a promotional offer is associated with an RSVP promotion that needs to be activated before use.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;RSVP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;NON_RSVP&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     */
    private OfferTypeEnum offerType;
    /**
     * A timestamp that indicates the date and time when the seller promotion ends.&lt;br&gt;&lt;br&gt;This value is returned in UTC format (&lt;code&gt;yyyy-MM-ddTHH:mm:ssZ&lt;/code&gt;), which can be converted into the local time of the buyer.
     */
    private String promotionEndDate;
    /**
     * The unique identifier of the promotion.
     */
    private String promotionId;
    /**
     * A timestamp indicating the date and time when the seller promotion began.&lt;br&gt;&lt;br&gt;This value is returned in UTC format (&lt;code&gt;yyyy-MM-ddTHH:mm:ssZ&lt;/code&gt;), which can be converted into the local time of the buyer.
     */
    private String promotionStartDate;
    /**
     * The title of the promotion.
     */
    private String title;
    /**
     * The number of transactions remaining in the promotional offer period.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is only returned if the promotional offer is transaction based.&lt;/span&gt;
     */
    private Integer transactionsRemaining;
    /**
     * The number of transactions that have been used so far during the promotional offer period.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is only returned if the promotional offer is transaction based.&lt;/span&gt;
     */
    private Integer transactionsUsed;
    /**
     * This boolean field indicates whether the promotional offer has unlimited transactions or a limited cap on transactions.&lt;br&gt;&lt;br&gt;If returned as &lt;code&gt;true&lt;/code&gt;, the seller can receive benefits from the promotional offer for all eligible transactions or charges.
     */
    private Boolean unlimitedTransactions;
    /**
     * Instantiates a new {@link SellerPromotionalOffer} and sets the default values.
     */
    public SellerPromotionalOffer() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SellerPromotionalOffer}
     */
    @jakarta.annotation.Nonnull
    public static SellerPromotionalOffer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SellerPromotionalOffer();
    }
    /**
     * Gets the activation property value. This container returns activation information for the promotion that contains one or more offers, including if activation is required and the &lt;b&gt;promotionHash&lt;/b&gt; value needed for activation.&lt;br&gt;&lt;br&gt;This field is only returned for RSVP promotions that require activation.
     * @return a {@link Activation}
     */
    @jakarta.annotation.Nullable
    public Activation getActivation() {
        return this.activation;
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
     * Gets the budgetAmountRemaining property value. This container shows the budget remaining in the promotional offer period.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This container is only returned if the promotional offer is budget based.&lt;/span&gt;
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getBudgetAmountRemaining() {
        return this.budgetAmountRemaining;
    }
    /**
     * Gets the budgetAmountUsed property value. This container shows the budget that has been used so far during the promotional offer period.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This container is only returned if the promotional offer is budget based.&lt;/span&gt;
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getBudgetAmountUsed() {
        return this.budgetAmountUsed;
    }
    /**
     * Gets the description property value. The description of the promotion.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(17);
        deserializerMap.put("activation", (n) -> { this.setActivation(n.getObjectValue(Activation::createFromDiscriminatorValue)); });
        deserializerMap.put("budgetAmountRemaining", (n) -> { this.setBudgetAmountRemaining(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("budgetAmountUsed", (n) -> { this.setBudgetAmountUsed(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("learnMoreUrl", (n) -> { this.setLearnMoreUrl(n.getStringValue()); });
        deserializerMap.put("marketplaceId", (n) -> { this.setMarketplaceId(n.getEnumValue(MarketplaceIdEnum::forValue)); });
        deserializerMap.put("offerEndDate", (n) -> { this.setOfferEndDate(n.getStringValue()); });
        deserializerMap.put("offerStartDate", (n) -> { this.setOfferStartDate(n.getStringValue()); });
        deserializerMap.put("offerState", (n) -> { this.setOfferState(n.getEnumValue(OfferStateEnum::forValue)); });
        deserializerMap.put("offerType", (n) -> { this.setOfferType(n.getEnumValue(OfferTypeEnum::forValue)); });
        deserializerMap.put("promotionEndDate", (n) -> { this.setPromotionEndDate(n.getStringValue()); });
        deserializerMap.put("promotionId", (n) -> { this.setPromotionId(n.getStringValue()); });
        deserializerMap.put("promotionStartDate", (n) -> { this.setPromotionStartDate(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("transactionsRemaining", (n) -> { this.setTransactionsRemaining(n.getIntegerValue()); });
        deserializerMap.put("transactionsUsed", (n) -> { this.setTransactionsUsed(n.getIntegerValue()); });
        deserializerMap.put("unlimitedTransactions", (n) -> { this.setUnlimitedTransactions(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the learnMoreUrl property value. The URL for the webpage that explains more details about the particular promotion, including the Terms and Conditions for the promotion.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLearnMoreUrl() {
        return this.learnMoreUrl;
    }
    /**
     * Gets the marketplaceId property value. The eBay marketplace associated with the promotion.
     * @return a {@link MarketplaceIdEnum}
     */
    @jakarta.annotation.Nullable
    public MarketplaceIdEnum getMarketplaceId() {
        return this.marketplaceId;
    }
    /**
     * Gets the offerEndDate property value. A timestamp that indicates the date and time when the promotional offer is no longer active for the seller. This value is returned in UTC format (&lt;code&gt;yyyy-MM-ddTHH:mm:ssZ&lt;/code&gt;), which can be converted into the local time of the buyer.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOfferEndDate() {
        return this.offerEndDate;
    }
    /**
     * Gets the offerStartDate property value. A timestamp that indicates the date and time when the promotional offer becomes active for the seller. This value is returned in UTC format (&lt;code&gt;yyyy-MM-ddTHH:mm:ssZ&lt;/code&gt;), which can be converted into the local time of the buyer.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOfferStartDate() {
        return this.offerStartDate;
    }
    /**
     * Gets the offerState property value. The current state of the promotional offer.&lt;br&gt;&lt;br&gt;If the offer state is returned as &lt;code&gt;REQUIRES_ACTIVATION&lt;/code&gt;, use the &lt;a href=/develop/api/sell/marketing_api#sell-marketing_api-seller_promotional_offers-activatepromotion&quot;&gt;activatePromotion&lt;/a&gt; method to activate the promotion for the seller.
     * @return a {@link OfferStateEnum}
     */
    @jakarta.annotation.Nullable
    public OfferStateEnum getOfferState() {
        return this.offerState;
    }
    /**
     * Gets the offerType property value. The promotional offer type. This field specifies if a promotional offer is associated with an RSVP promotion that needs to be activated before use.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;RSVP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;NON_RSVP&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link OfferTypeEnum}
     */
    @jakarta.annotation.Nullable
    public OfferTypeEnum getOfferType() {
        return this.offerType;
    }
    /**
     * Gets the promotionEndDate property value. A timestamp that indicates the date and time when the seller promotion ends.&lt;br&gt;&lt;br&gt;This value is returned in UTC format (&lt;code&gt;yyyy-MM-ddTHH:mm:ssZ&lt;/code&gt;), which can be converted into the local time of the buyer.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPromotionEndDate() {
        return this.promotionEndDate;
    }
    /**
     * Gets the promotionId property value. The unique identifier of the promotion.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPromotionId() {
        return this.promotionId;
    }
    /**
     * Gets the promotionStartDate property value. A timestamp indicating the date and time when the seller promotion began.&lt;br&gt;&lt;br&gt;This value is returned in UTC format (&lt;code&gt;yyyy-MM-ddTHH:mm:ssZ&lt;/code&gt;), which can be converted into the local time of the buyer.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPromotionStartDate() {
        return this.promotionStartDate;
    }
    /**
     * Gets the title property value. The title of the promotion.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Gets the transactionsRemaining property value. The number of transactions remaining in the promotional offer period.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is only returned if the promotional offer is transaction based.&lt;/span&gt;
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTransactionsRemaining() {
        return this.transactionsRemaining;
    }
    /**
     * Gets the transactionsUsed property value. The number of transactions that have been used so far during the promotional offer period.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is only returned if the promotional offer is transaction based.&lt;/span&gt;
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTransactionsUsed() {
        return this.transactionsUsed;
    }
    /**
     * Gets the unlimitedTransactions property value. This boolean field indicates whether the promotional offer has unlimited transactions or a limited cap on transactions.&lt;br&gt;&lt;br&gt;If returned as &lt;code&gt;true&lt;/code&gt;, the seller can receive benefits from the promotional offer for all eligible transactions or charges.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getUnlimitedTransactions() {
        return this.unlimitedTransactions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("activation", this.getActivation());
        writer.writeObjectValue("budgetAmountRemaining", this.getBudgetAmountRemaining());
        writer.writeObjectValue("budgetAmountUsed", this.getBudgetAmountUsed());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("learnMoreUrl", this.getLearnMoreUrl());
        writer.writeEnumValue("marketplaceId", this.getMarketplaceId());
        writer.writeStringValue("offerEndDate", this.getOfferEndDate());
        writer.writeStringValue("offerStartDate", this.getOfferStartDate());
        writer.writeEnumValue("offerState", this.getOfferState());
        writer.writeEnumValue("offerType", this.getOfferType());
        writer.writeStringValue("promotionEndDate", this.getPromotionEndDate());
        writer.writeStringValue("promotionId", this.getPromotionId());
        writer.writeStringValue("promotionStartDate", this.getPromotionStartDate());
        writer.writeStringValue("title", this.getTitle());
        writer.writeIntegerValue("transactionsRemaining", this.getTransactionsRemaining());
        writer.writeIntegerValue("transactionsUsed", this.getTransactionsUsed());
        writer.writeBooleanValue("unlimitedTransactions", this.getUnlimitedTransactions());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activation property value. This container returns activation information for the promotion that contains one or more offers, including if activation is required and the &lt;b&gt;promotionHash&lt;/b&gt; value needed for activation.&lt;br&gt;&lt;br&gt;This field is only returned for RSVP promotions that require activation.
     * @param value Value to set for the activation property.
     */
    public void setActivation(@jakarta.annotation.Nullable final Activation value) {
        this.activation = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the budgetAmountRemaining property value. This container shows the budget remaining in the promotional offer period.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This container is only returned if the promotional offer is budget based.&lt;/span&gt;
     * @param value Value to set for the budgetAmountRemaining property.
     */
    public void setBudgetAmountRemaining(@jakarta.annotation.Nullable final Amount value) {
        this.budgetAmountRemaining = value;
    }
    /**
     * Sets the budgetAmountUsed property value. This container shows the budget that has been used so far during the promotional offer period.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This container is only returned if the promotional offer is budget based.&lt;/span&gt;
     * @param value Value to set for the budgetAmountUsed property.
     */
    public void setBudgetAmountUsed(@jakarta.annotation.Nullable final Amount value) {
        this.budgetAmountUsed = value;
    }
    /**
     * Sets the description property value. The description of the promotion.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the learnMoreUrl property value. The URL for the webpage that explains more details about the particular promotion, including the Terms and Conditions for the promotion.
     * @param value Value to set for the learnMoreUrl property.
     */
    public void setLearnMoreUrl(@jakarta.annotation.Nullable final String value) {
        this.learnMoreUrl = value;
    }
    /**
     * Sets the marketplaceId property value. The eBay marketplace associated with the promotion.
     * @param value Value to set for the marketplaceId property.
     */
    public void setMarketplaceId(@jakarta.annotation.Nullable final MarketplaceIdEnum value) {
        this.marketplaceId = value;
    }
    /**
     * Sets the offerEndDate property value. A timestamp that indicates the date and time when the promotional offer is no longer active for the seller. This value is returned in UTC format (&lt;code&gt;yyyy-MM-ddTHH:mm:ssZ&lt;/code&gt;), which can be converted into the local time of the buyer.
     * @param value Value to set for the offerEndDate property.
     */
    public void setOfferEndDate(@jakarta.annotation.Nullable final String value) {
        this.offerEndDate = value;
    }
    /**
     * Sets the offerStartDate property value. A timestamp that indicates the date and time when the promotional offer becomes active for the seller. This value is returned in UTC format (&lt;code&gt;yyyy-MM-ddTHH:mm:ssZ&lt;/code&gt;), which can be converted into the local time of the buyer.
     * @param value Value to set for the offerStartDate property.
     */
    public void setOfferStartDate(@jakarta.annotation.Nullable final String value) {
        this.offerStartDate = value;
    }
    /**
     * Sets the offerState property value. The current state of the promotional offer.&lt;br&gt;&lt;br&gt;If the offer state is returned as &lt;code&gt;REQUIRES_ACTIVATION&lt;/code&gt;, use the &lt;a href=/develop/api/sell/marketing_api#sell-marketing_api-seller_promotional_offers-activatepromotion&quot;&gt;activatePromotion&lt;/a&gt; method to activate the promotion for the seller.
     * @param value Value to set for the offerState property.
     */
    public void setOfferState(@jakarta.annotation.Nullable final OfferStateEnum value) {
        this.offerState = value;
    }
    /**
     * Sets the offerType property value. The promotional offer type. This field specifies if a promotional offer is associated with an RSVP promotion that needs to be activated before use.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;RSVP&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;NON_RSVP&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the offerType property.
     */
    public void setOfferType(@jakarta.annotation.Nullable final OfferTypeEnum value) {
        this.offerType = value;
    }
    /**
     * Sets the promotionEndDate property value. A timestamp that indicates the date and time when the seller promotion ends.&lt;br&gt;&lt;br&gt;This value is returned in UTC format (&lt;code&gt;yyyy-MM-ddTHH:mm:ssZ&lt;/code&gt;), which can be converted into the local time of the buyer.
     * @param value Value to set for the promotionEndDate property.
     */
    public void setPromotionEndDate(@jakarta.annotation.Nullable final String value) {
        this.promotionEndDate = value;
    }
    /**
     * Sets the promotionId property value. The unique identifier of the promotion.
     * @param value Value to set for the promotionId property.
     */
    public void setPromotionId(@jakarta.annotation.Nullable final String value) {
        this.promotionId = value;
    }
    /**
     * Sets the promotionStartDate property value. A timestamp indicating the date and time when the seller promotion began.&lt;br&gt;&lt;br&gt;This value is returned in UTC format (&lt;code&gt;yyyy-MM-ddTHH:mm:ssZ&lt;/code&gt;), which can be converted into the local time of the buyer.
     * @param value Value to set for the promotionStartDate property.
     */
    public void setPromotionStartDate(@jakarta.annotation.Nullable final String value) {
        this.promotionStartDate = value;
    }
    /**
     * Sets the title property value. The title of the promotion.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
    /**
     * Sets the transactionsRemaining property value. The number of transactions remaining in the promotional offer period.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is only returned if the promotional offer is transaction based.&lt;/span&gt;
     * @param value Value to set for the transactionsRemaining property.
     */
    public void setTransactionsRemaining(@jakarta.annotation.Nullable final Integer value) {
        this.transactionsRemaining = value;
    }
    /**
     * Sets the transactionsUsed property value. The number of transactions that have been used so far during the promotional offer period.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field is only returned if the promotional offer is transaction based.&lt;/span&gt;
     * @param value Value to set for the transactionsUsed property.
     */
    public void setTransactionsUsed(@jakarta.annotation.Nullable final Integer value) {
        this.transactionsUsed = value;
    }
    /**
     * Sets the unlimitedTransactions property value. This boolean field indicates whether the promotional offer has unlimited transactions or a limited cap on transactions.&lt;br&gt;&lt;br&gt;If returned as &lt;code&gt;true&lt;/code&gt;, the seller can receive benefits from the promotional offer for all eligible transactions or charges.
     * @param value Value to set for the unlimitedTransactions property.
     */
    public void setUnlimitedTransactions(@jakarta.annotation.Nullable final Boolean value) {
        this.unlimitedTransactions = value;
    }
}
