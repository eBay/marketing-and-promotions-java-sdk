package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that defines the keywords of the paged collection.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TargetedBidsPagedCollection implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A list of bids in the paginated collection.
     */
    private java.util.List<SuggestedBids> suggestedBids;
    /**
     * Instantiates a new {@link TargetedBidsPagedCollection} and sets the default values.
     */
    public TargetedBidsPagedCollection() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TargetedBidsPagedCollection}
     */
    @jakarta.annotation.Nonnull
    public static TargetedBidsPagedCollection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TargetedBidsPagedCollection();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("suggestedBids", (n) -> { this.setSuggestedBids(n.getCollectionOfObjectValues(SuggestedBids::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the suggestedBids property value. A list of bids in the paginated collection.
     * @return a {@link java.util.List<SuggestedBids>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SuggestedBids> getSuggestedBids() {
        return this.suggestedBids;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("suggestedBids", this.getSuggestedBids());
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
     * Sets the suggestedBids property value. A list of bids in the paginated collection.
     * @param value Value to set for the suggestedBids property.
     */
    public void setSuggestedBids(@jakarta.annotation.Nullable final java.util.List<SuggestedBids> value) {
        this.suggestedBids = value;
    }
}
