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
 * The selection rules (criterion) used to select the listings for a campaign. If you populate the &lt;b&gt;campaignCriterion&lt;/b&gt; object in your &lt;b&gt;createCampaign&lt;/b&gt; request, ads for the campaign are created by rule for the listings that meet the criteria you specify, and these ads are associated with the campaign.&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This container is only returned for rules-based campaigns using the Cost Per Sale (CPS) funding model.&lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CampaignCriterion implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A field used to indicate whether listings shall be automatically added to, or removed from, a Promoted Listings campaign based on the rules that have been configured for the campaign.&lt;br /&gt;&lt;br /&gt;If set to &lt;code&gt;true&lt;/code&gt;, eBay adds all listings matching the campaign criterion to the campaign, including any new listings created from the items in a seller&apos;s inventory.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;false&lt;/code&gt;
     */
    private Boolean autoSelectFutureInventory;
    /**
     * This enum defines the criterion (selection rule) types. Currently, the only criterion type supported is &lt;code&gt;INVENTORY_PARTITION&lt;/code&gt;, and you must specify this value if you manage your items with the Inventory API and you want to include items based on their inventory reference IDs.  &lt;br&gt;&lt;br&gt;Do not include this field if you manage your listings with Trading API/legacy model.
     */
    private CriterionTypeEnum criterionType;
    /**
     * This container shows all of the rules/inclusion filters used to add listings to the campaign. For information on using the contained fields, see &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Campaign &quot; target=&quot;_blank&quot;&gt;Promoted Listing campaigns&lt;/a&gt;.
     */
    private java.util.List<SelectionRule> selectionRules;
    /**
     * Instantiates a new {@link CampaignCriterion} and sets the default values.
     */
    public CampaignCriterion() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CampaignCriterion}
     */
    @jakarta.annotation.Nonnull
    public static CampaignCriterion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CampaignCriterion();
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
     * Gets the autoSelectFutureInventory property value. A field used to indicate whether listings shall be automatically added to, or removed from, a Promoted Listings campaign based on the rules that have been configured for the campaign.&lt;br /&gt;&lt;br /&gt;If set to &lt;code&gt;true&lt;/code&gt;, eBay adds all listings matching the campaign criterion to the campaign, including any new listings created from the items in a seller&apos;s inventory.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;false&lt;/code&gt;
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoSelectFutureInventory() {
        return this.autoSelectFutureInventory;
    }
    /**
     * Gets the criterionType property value. This enum defines the criterion (selection rule) types. Currently, the only criterion type supported is &lt;code&gt;INVENTORY_PARTITION&lt;/code&gt;, and you must specify this value if you manage your items with the Inventory API and you want to include items based on their inventory reference IDs.  &lt;br&gt;&lt;br&gt;Do not include this field if you manage your listings with Trading API/legacy model.
     * @return a {@link CriterionTypeEnum}
     */
    @jakarta.annotation.Nullable
    public CriterionTypeEnum getCriterionType() {
        return this.criterionType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("autoSelectFutureInventory", (n) -> { this.setAutoSelectFutureInventory(n.getBooleanValue()); });
        deserializerMap.put("criterionType", (n) -> { this.setCriterionType(n.getEnumValue(CriterionTypeEnum::forValue)); });
        deserializerMap.put("selectionRules", (n) -> { this.setSelectionRules(n.getCollectionOfObjectValues(SelectionRule::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the selectionRules property value. This container shows all of the rules/inclusion filters used to add listings to the campaign. For information on using the contained fields, see &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Campaign &quot; target=&quot;_blank&quot;&gt;Promoted Listing campaigns&lt;/a&gt;.
     * @return a {@link java.util.List<SelectionRule>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SelectionRule> getSelectionRules() {
        return this.selectionRules;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("autoSelectFutureInventory", this.getAutoSelectFutureInventory());
        writer.writeEnumValue("criterionType", this.getCriterionType());
        writer.writeCollectionOfObjectValues("selectionRules", this.getSelectionRules());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the autoSelectFutureInventory property value. A field used to indicate whether listings shall be automatically added to, or removed from, a Promoted Listings campaign based on the rules that have been configured for the campaign.&lt;br /&gt;&lt;br /&gt;If set to &lt;code&gt;true&lt;/code&gt;, eBay adds all listings matching the campaign criterion to the campaign, including any new listings created from the items in a seller&apos;s inventory.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;false&lt;/code&gt;
     * @param value Value to set for the autoSelectFutureInventory property.
     */
    public void setAutoSelectFutureInventory(@jakarta.annotation.Nullable final Boolean value) {
        this.autoSelectFutureInventory = value;
    }
    /**
     * Sets the criterionType property value. This enum defines the criterion (selection rule) types. Currently, the only criterion type supported is &lt;code&gt;INVENTORY_PARTITION&lt;/code&gt;, and you must specify this value if you manage your items with the Inventory API and you want to include items based on their inventory reference IDs.  &lt;br&gt;&lt;br&gt;Do not include this field if you manage your listings with Trading API/legacy model.
     * @param value Value to set for the criterionType property.
     */
    public void setCriterionType(@jakarta.annotation.Nullable final CriterionTypeEnum value) {
        this.criterionType = value;
    }
    /**
     * Sets the selectionRules property value. This container shows all of the rules/inclusion filters used to add listings to the campaign. For information on using the contained fields, see &lt;a href= &quot;/api-docs/sell/static/marketing/using-the-selectionrules-container.html#Campaign &quot; target=&quot;_blank&quot;&gt;Promoted Listing campaigns&lt;/a&gt;.
     * @param value Value to set for the selectionRules property.
     */
    public void setSelectionRules(@jakarta.annotation.Nullable final java.util.List<SelectionRule> value) {
        this.selectionRules = value;
    }
}
