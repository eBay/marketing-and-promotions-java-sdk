package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A container for the details of a Promoted Listings campaign that uses the Cost Per Click (CPC) funding model.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CampaignBudgetRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A container for the budget details of a Promoted Listings campaign that uses the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This container will only be returned for campaigns using the CPC funding model; it does not apply to the Cost Per Sale (CPS) funding model.&lt;/span&gt;
     */
    private BudgetRequest daily;
    /**
     * Instantiates a new {@link CampaignBudgetRequest} and sets the default values.
     */
    public CampaignBudgetRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CampaignBudgetRequest}
     */
    @jakarta.annotation.Nonnull
    public static CampaignBudgetRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CampaignBudgetRequest();
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
     * Gets the daily property value. A container for the budget details of a Promoted Listings campaign that uses the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This container will only be returned for campaigns using the CPC funding model; it does not apply to the Cost Per Sale (CPS) funding model.&lt;/span&gt;
     * @return a {@link BudgetRequest}
     */
    @jakarta.annotation.Nullable
    public BudgetRequest getDaily() {
        return this.daily;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("daily", (n) -> { this.setDaily(n.getObjectValue(BudgetRequest::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("daily", this.getDaily());
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
     * Sets the daily property value. A container for the budget details of a Promoted Listings campaign that uses the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This container will only be returned for campaigns using the CPC funding model; it does not apply to the Cost Per Sale (CPS) funding model.&lt;/span&gt;
     * @param value Value to set for the daily property.
     */
    public void setDaily(@jakarta.annotation.Nullable final BudgetRequest value) {
        this.daily = value;
    }
}
