package com.ebay.marketingandpromotions.generated.recommendation.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A complex type that contains recommendations and information on how to configure Promoted Listings ad campaigns.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Ad implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field returns information that you can use to configure the &lt;b&gt;bidPercentage&lt;/b&gt; field in a Promoted Listings campaign.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, &lt;code&gt;ITEM&lt;/code&gt; and &lt;code&gt;TRENDING&lt;/code&gt; are the only supported bid percentage types.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;The &lt;code&gt;ITEM&lt;/code&gt; suggested bid percentages are tailored to each of your items and are designed to help you stay competitive while finding an optimal balance between performance and cost. The recommendations are calculated based on a variety of factors that may include item attributes, seasonality, past performance, and current competition for each of your listings.&lt;br /&gt;&lt;br /&gt;The &lt;code&gt;TRENDING&lt;/code&gt; suggested bid percentages are calculated by reviewing the category level average ad rates in the marketplace.&lt;br /&gt;&lt;br /&gt;Setting the &lt;b&gt;bidPercentage&lt;/b&gt; of your ad campaign based on these rate recommendations will help the items in the campaign be competitive with other items in the marketplace by improving their chances of being displayed more often in the marketplace.
     */
    private java.util.List<BidPercentages> bidPercentages;
    /**
     * An enum whose values describe whether or not eBay recommends you place the associated listing in a Promoted Listings ad campaign.  &lt;br&gt;&lt;br&gt;IDs deemed &lt;code&gt;RECOMMENDED&lt;/code&gt; by eBay are the listings with the highest potential of benefiting from being promoted. The recommendation calculation is based on marketplace trends, like buyer demand and the competition in the items category.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; A &lt;b&gt;promoteWithAd&lt;/b&gt; value cannot be calculated for listings that are part of Promoted Listings campaigns.  &lt;br&gt;&lt;br&gt;Because of this, if you call &lt;b&gt;findListingRecommendations&lt;/b&gt; with a specific set of listing IDs, the &lt;b&gt;promoteWithAd&lt;/b&gt; field is not returned for any of the listings that are involved in a promotion. However, as long as they are eligible, the trending &lt;b&gt;bidPercentage&lt;/b&gt; &lt;i&gt;is&lt;/i&gt; returned for all specified listings, even if they are part of an ad campaign.&lt;/p&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/recommendation/types/api:PromoteWithAd&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String promoteWithAd;
    /**
     * Instantiates a new {@link Ad} and sets the default values.
     */
    public Ad() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Ad}
     */
    @jakarta.annotation.Nonnull
    public static Ad createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Ad();
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
     * Gets the bidPercentages property value. This field returns information that you can use to configure the &lt;b&gt;bidPercentage&lt;/b&gt; field in a Promoted Listings campaign.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, &lt;code&gt;ITEM&lt;/code&gt; and &lt;code&gt;TRENDING&lt;/code&gt; are the only supported bid percentage types.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;The &lt;code&gt;ITEM&lt;/code&gt; suggested bid percentages are tailored to each of your items and are designed to help you stay competitive while finding an optimal balance between performance and cost. The recommendations are calculated based on a variety of factors that may include item attributes, seasonality, past performance, and current competition for each of your listings.&lt;br /&gt;&lt;br /&gt;The &lt;code&gt;TRENDING&lt;/code&gt; suggested bid percentages are calculated by reviewing the category level average ad rates in the marketplace.&lt;br /&gt;&lt;br /&gt;Setting the &lt;b&gt;bidPercentage&lt;/b&gt; of your ad campaign based on these rate recommendations will help the items in the campaign be competitive with other items in the marketplace by improving their chances of being displayed more often in the marketplace.
     * @return a {@link java.util.List<BidPercentages>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<BidPercentages> getBidPercentages() {
        return this.bidPercentages;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("bidPercentages", (n) -> { this.setBidPercentages(n.getCollectionOfObjectValues(BidPercentages::createFromDiscriminatorValue)); });
        deserializerMap.put("promoteWithAd", (n) -> { this.setPromoteWithAd(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the promoteWithAd property value. An enum whose values describe whether or not eBay recommends you place the associated listing in a Promoted Listings ad campaign.  &lt;br&gt;&lt;br&gt;IDs deemed &lt;code&gt;RECOMMENDED&lt;/code&gt; by eBay are the listings with the highest potential of benefiting from being promoted. The recommendation calculation is based on marketplace trends, like buyer demand and the competition in the items category.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; A &lt;b&gt;promoteWithAd&lt;/b&gt; value cannot be calculated for listings that are part of Promoted Listings campaigns.  &lt;br&gt;&lt;br&gt;Because of this, if you call &lt;b&gt;findListingRecommendations&lt;/b&gt; with a specific set of listing IDs, the &lt;b&gt;promoteWithAd&lt;/b&gt; field is not returned for any of the listings that are involved in a promotion. However, as long as they are eligible, the trending &lt;b&gt;bidPercentage&lt;/b&gt; &lt;i&gt;is&lt;/i&gt; returned for all specified listings, even if they are part of an ad campaign.&lt;/p&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/recommendation/types/api:PromoteWithAd&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPromoteWithAd() {
        return this.promoteWithAd;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("bidPercentages", this.getBidPercentages());
        writer.writeStringValue("promoteWithAd", this.getPromoteWithAd());
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
     * Sets the bidPercentages property value. This field returns information that you can use to configure the &lt;b&gt;bidPercentage&lt;/b&gt; field in a Promoted Listings campaign.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, &lt;code&gt;ITEM&lt;/code&gt; and &lt;code&gt;TRENDING&lt;/code&gt; are the only supported bid percentage types.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;The &lt;code&gt;ITEM&lt;/code&gt; suggested bid percentages are tailored to each of your items and are designed to help you stay competitive while finding an optimal balance between performance and cost. The recommendations are calculated based on a variety of factors that may include item attributes, seasonality, past performance, and current competition for each of your listings.&lt;br /&gt;&lt;br /&gt;The &lt;code&gt;TRENDING&lt;/code&gt; suggested bid percentages are calculated by reviewing the category level average ad rates in the marketplace.&lt;br /&gt;&lt;br /&gt;Setting the &lt;b&gt;bidPercentage&lt;/b&gt; of your ad campaign based on these rate recommendations will help the items in the campaign be competitive with other items in the marketplace by improving their chances of being displayed more often in the marketplace.
     * @param value Value to set for the bidPercentages property.
     */
    public void setBidPercentages(@jakarta.annotation.Nullable final java.util.List<BidPercentages> value) {
        this.bidPercentages = value;
    }
    /**
     * Sets the promoteWithAd property value. An enum whose values describe whether or not eBay recommends you place the associated listing in a Promoted Listings ad campaign.  &lt;br&gt;&lt;br&gt;IDs deemed &lt;code&gt;RECOMMENDED&lt;/code&gt; by eBay are the listings with the highest potential of benefiting from being promoted. The recommendation calculation is based on marketplace trends, like buyer demand and the competition in the items category.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; A &lt;b&gt;promoteWithAd&lt;/b&gt; value cannot be calculated for listings that are part of Promoted Listings campaigns.  &lt;br&gt;&lt;br&gt;Because of this, if you call &lt;b&gt;findListingRecommendations&lt;/b&gt; with a specific set of listing IDs, the &lt;b&gt;promoteWithAd&lt;/b&gt; field is not returned for any of the listings that are involved in a promotion. However, as long as they are eligible, the trending &lt;b&gt;bidPercentage&lt;/b&gt; &lt;i&gt;is&lt;/i&gt; returned for all specified listings, even if they are part of an ad campaign.&lt;/p&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/recommendation/types/api:PromoteWithAd&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the promoteWithAd property.
     */
    public void setPromoteWithAd(@jakarta.annotation.Nullable final String value) {
        this.promoteWithAd = value;
    }
}
