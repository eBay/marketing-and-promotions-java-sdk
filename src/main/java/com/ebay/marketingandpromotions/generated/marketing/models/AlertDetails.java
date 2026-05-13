package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that contains the alert detail fields.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AlertDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A type that contains the aspect fields.
     */
    private Aspect aspect;
    /**
     * A type that contains the dimension fields.
     */
    private AlertDimension dimension;
    /**
     * Instantiates a new {@link AlertDetails} and sets the default values.
     */
    public AlertDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AlertDetails}
     */
    @jakarta.annotation.Nonnull
    public static AlertDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AlertDetails();
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
     * Gets the aspect property value. A type that contains the aspect fields.
     * @return a {@link Aspect}
     */
    @jakarta.annotation.Nullable
    public Aspect getAspect() {
        return this.aspect;
    }
    /**
     * Gets the dimension property value. A type that contains the dimension fields.
     * @return a {@link AlertDimension}
     */
    @jakarta.annotation.Nullable
    public AlertDimension getDimension() {
        return this.dimension;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("aspect", (n) -> { this.setAspect(n.getObjectValue(Aspect::createFromDiscriminatorValue)); });
        deserializerMap.put("dimension", (n) -> { this.setDimension(n.getObjectValue(AlertDimension::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("aspect", this.getAspect());
        writer.writeObjectValue("dimension", this.getDimension());
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
     * Sets the aspect property value. A type that contains the aspect fields.
     * @param value Value to set for the aspect property.
     */
    public void setAspect(@jakarta.annotation.Nullable final Aspect value) {
        this.aspect = value;
    }
    /**
     * Sets the dimension property value. A type that contains the dimension fields.
     * @param value Value to set for the dimension property.
     */
    public void setDimension(@jakarta.annotation.Nullable final AlertDimension value) {
        this.dimension = value;
    }
}
