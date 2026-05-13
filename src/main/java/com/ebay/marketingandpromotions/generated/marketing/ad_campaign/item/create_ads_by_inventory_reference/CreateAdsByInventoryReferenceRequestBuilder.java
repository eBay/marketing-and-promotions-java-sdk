package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.create_ads_by_inventory_reference;

import com.ebay.marketingandpromotions.generated.marketing.models.AdReferences;
import com.ebay.marketingandpromotions.generated.marketing.models.CreateAdsByInventoryReferenceRequest;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /ad_campaign/{campaign_id}/create_ads_by_inventory_reference
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateAdsByInventoryReferenceRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link CreateAdsByInventoryReferenceRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreateAdsByInventoryReferenceRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/create_ads_by_inventory_reference", pathParameters);
    }
    /**
     * Instantiates a new {@link CreateAdsByInventoryReferenceRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreateAdsByInventoryReferenceRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/create_ads_by_inventory_reference", rawUrl);
    }
    /**
     * This method adds a listing that is managed with the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot;&gt;Inventory API&lt;/a&gt; to an existing Promoted Listings campaign.&lt;br /&gt;&lt;br /&gt;For general strategy campaigns using the Cost Per Sale (CPS) funding model, an ad may be directly created for the listing.&lt;br /&gt;&lt;br /&gt;For each listing specified in the request, this method:&lt;br /&gt;&lt;ul&gt;&lt;li&gt;Creates an ad for the listing.&lt;/li&gt; &lt;li&gt;Sets the bid percentage (also known as the &lt;i&gt;ad rate&lt;/i&gt;) for the ads created.&lt;/li&gt; &lt;li&gt;Associates the created ad with the specified campaign.&lt;/li&gt;&lt;/ul&gt;&lt;br /&gt;To create an ad for a listing, specify its &lt;b&gt;inventoryReferenceId&lt;/b&gt; and &lt;b&gt;inventoryReferenceType&lt;/b&gt;, plus the &lt;b&gt;bidPercentage&lt;/b&gt; for the ad in the payload of the request. Specify the campaign to associate the ad with using the &lt;b&gt;campaign_id&lt;/b&gt; path parameter.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;Use &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/createCampaign&quot;&gt;createCampaign&lt;/a&gt; to create a new campaign and use &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to get a list of existing campaigns.
     * @param body This type defines the fields needed to create ads by inventory reference ID request.
     * @return a {@link AdReferences}
     */
    @jakarta.annotation.Nullable
    public AdReferences post(@jakarta.annotation.Nonnull final CreateAdsByInventoryReferenceRequest body) {
        return post(body, null);
    }
    /**
     * This method adds a listing that is managed with the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot;&gt;Inventory API&lt;/a&gt; to an existing Promoted Listings campaign.&lt;br /&gt;&lt;br /&gt;For general strategy campaigns using the Cost Per Sale (CPS) funding model, an ad may be directly created for the listing.&lt;br /&gt;&lt;br /&gt;For each listing specified in the request, this method:&lt;br /&gt;&lt;ul&gt;&lt;li&gt;Creates an ad for the listing.&lt;/li&gt; &lt;li&gt;Sets the bid percentage (also known as the &lt;i&gt;ad rate&lt;/i&gt;) for the ads created.&lt;/li&gt; &lt;li&gt;Associates the created ad with the specified campaign.&lt;/li&gt;&lt;/ul&gt;&lt;br /&gt;To create an ad for a listing, specify its &lt;b&gt;inventoryReferenceId&lt;/b&gt; and &lt;b&gt;inventoryReferenceType&lt;/b&gt;, plus the &lt;b&gt;bidPercentage&lt;/b&gt; for the ad in the payload of the request. Specify the campaign to associate the ad with using the &lt;b&gt;campaign_id&lt;/b&gt; path parameter.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;Use &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/createCampaign&quot;&gt;createCampaign&lt;/a&gt; to create a new campaign and use &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to get a list of existing campaigns.
     * @param body This type defines the fields needed to create ads by inventory reference ID request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AdReferences}
     */
    @jakarta.annotation.Nullable
    public AdReferences post(@jakarta.annotation.Nonnull final CreateAdsByInventoryReferenceRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AdReferences::createFromDiscriminatorValue);
    }
    /**
     * This method adds a listing that is managed with the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot;&gt;Inventory API&lt;/a&gt; to an existing Promoted Listings campaign.&lt;br /&gt;&lt;br /&gt;For general strategy campaigns using the Cost Per Sale (CPS) funding model, an ad may be directly created for the listing.&lt;br /&gt;&lt;br /&gt;For each listing specified in the request, this method:&lt;br /&gt;&lt;ul&gt;&lt;li&gt;Creates an ad for the listing.&lt;/li&gt; &lt;li&gt;Sets the bid percentage (also known as the &lt;i&gt;ad rate&lt;/i&gt;) for the ads created.&lt;/li&gt; &lt;li&gt;Associates the created ad with the specified campaign.&lt;/li&gt;&lt;/ul&gt;&lt;br /&gt;To create an ad for a listing, specify its &lt;b&gt;inventoryReferenceId&lt;/b&gt; and &lt;b&gt;inventoryReferenceType&lt;/b&gt;, plus the &lt;b&gt;bidPercentage&lt;/b&gt; for the ad in the payload of the request. Specify the campaign to associate the ad with using the &lt;b&gt;campaign_id&lt;/b&gt; path parameter.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;Use &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/createCampaign&quot;&gt;createCampaign&lt;/a&gt; to create a new campaign and use &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to get a list of existing campaigns.
     * @param body This type defines the fields needed to create ads by inventory reference ID request.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateAdsByInventoryReferenceRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method adds a listing that is managed with the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot;&gt;Inventory API&lt;/a&gt; to an existing Promoted Listings campaign.&lt;br /&gt;&lt;br /&gt;For general strategy campaigns using the Cost Per Sale (CPS) funding model, an ad may be directly created for the listing.&lt;br /&gt;&lt;br /&gt;For each listing specified in the request, this method:&lt;br /&gt;&lt;ul&gt;&lt;li&gt;Creates an ad for the listing.&lt;/li&gt; &lt;li&gt;Sets the bid percentage (also known as the &lt;i&gt;ad rate&lt;/i&gt;) for the ads created.&lt;/li&gt; &lt;li&gt;Associates the created ad with the specified campaign.&lt;/li&gt;&lt;/ul&gt;&lt;br /&gt;To create an ad for a listing, specify its &lt;b&gt;inventoryReferenceId&lt;/b&gt; and &lt;b&gt;inventoryReferenceType&lt;/b&gt;, plus the &lt;b&gt;bidPercentage&lt;/b&gt; for the ad in the payload of the request. Specify the campaign to associate the ad with using the &lt;b&gt;campaign_id&lt;/b&gt; path parameter.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;Use &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/createCampaign&quot;&gt;createCampaign&lt;/a&gt; to create a new campaign and use &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to get a list of existing campaigns.
     * @param body This type defines the fields needed to create ads by inventory reference ID request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateAdsByInventoryReferenceRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link CreateAdsByInventoryReferenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreateAdsByInventoryReferenceRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CreateAdsByInventoryReferenceRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
