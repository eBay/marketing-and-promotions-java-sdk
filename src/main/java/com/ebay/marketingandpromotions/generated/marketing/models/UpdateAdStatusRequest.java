package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that contains the fields for the &lt;b&gt;UpdateAdStatus&lt;/b&gt; request.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateAdStatusRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A unique eBay-assigned identifier for an ad that belongs to the specified campaign.&lt;br&gt;&lt;br&gt; Use the &lt;a href=&quot;/api-docs/sell/marketing/resources/ad/methods/getAds&quot;&gt;getAds&lt;/a&gt; method to retrieve ad IDs.
     */
    private String adId;
    /**
     * An enumeration value representing the status you wish to update the specified ad to.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ACTIVE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PAUSED&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;ARCHIVED&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:AdStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String adStatus;
    /**
     * Instantiates a new {@link UpdateAdStatusRequest} and sets the default values.
     */
    public UpdateAdStatusRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdateAdStatusRequest}
     */
    @jakarta.annotation.Nonnull
    public static UpdateAdStatusRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateAdStatusRequest();
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
     * Gets the adId property value. A unique eBay-assigned identifier for an ad that belongs to the specified campaign.&lt;br&gt;&lt;br&gt; Use the &lt;a href=&quot;/api-docs/sell/marketing/resources/ad/methods/getAds&quot;&gt;getAds&lt;/a&gt; method to retrieve ad IDs.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAdId() {
        return this.adId;
    }
    /**
     * Gets the adStatus property value. An enumeration value representing the status you wish to update the specified ad to.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ACTIVE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PAUSED&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;ARCHIVED&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:AdStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAdStatus() {
        return this.adStatus;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("adId", (n) -> { this.setAdId(n.getStringValue()); });
        deserializerMap.put("adStatus", (n) -> { this.setAdStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("adId", this.getAdId());
        writer.writeStringValue("adStatus", this.getAdStatus());
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
     * Sets the adId property value. A unique eBay-assigned identifier for an ad that belongs to the specified campaign.&lt;br&gt;&lt;br&gt; Use the &lt;a href=&quot;/api-docs/sell/marketing/resources/ad/methods/getAds&quot;&gt;getAds&lt;/a&gt; method to retrieve ad IDs.
     * @param value Value to set for the adId property.
     */
    public void setAdId(@jakarta.annotation.Nullable final String value) {
        this.adId = value;
    }
    /**
     * Sets the adStatus property value. An enumeration value representing the status you wish to update the specified ad to.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;ACTIVE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PAUSED&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;ARCHIVED&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/pls:AdStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the adStatus property.
     */
    public void setAdStatus(@jakarta.annotation.Nullable final String value) {
        this.adStatus = value;
    }
}
