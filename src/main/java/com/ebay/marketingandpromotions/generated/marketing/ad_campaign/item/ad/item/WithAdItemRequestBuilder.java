package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.ad.item;

import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.ad.item.update_bid.UpdateBidRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.models.Ad;
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
 * Builds and executes requests for operations under /ad_campaign/{campaign_id}/ad/{ad_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithAdItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The update_bid property
     * @return a {@link UpdateBidRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdateBidRequestBuilder updateBid() {
        return new UpdateBidRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithAdItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithAdItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/ad/{ad_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithAdItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithAdItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/ad/{ad_id}", rawUrl);
    }
    /**
     * This method removes the specified ad from the specified campaign.&lt;br /&gt;&lt;br /&gt;Pass the ID of the ad to delete with the ID of the campaign associated with the ad as path parameters to the call.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to get the current list of the seller&apos;s campaign IDs.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;When using the CPC funding model, use the &lt;b&gt;bulkUpdateAdsStatusByListingId&lt;/b&gt; method to change the status of ads to ARCHIVED.
     */
    public void delete() {
        delete(null);
    }
    /**
     * This method removes the specified ad from the specified campaign.&lt;br /&gt;&lt;br /&gt;Pass the ID of the ad to delete with the ID of the campaign associated with the ad as path parameters to the call.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to get the current list of the seller&apos;s campaign IDs.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;When using the CPC funding model, use the &lt;b&gt;bulkUpdateAdsStatusByListingId&lt;/b&gt; method to change the status of ads to ARCHIVED.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method retrieves the specified ad from the specified campaign.  &lt;p&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;ad_id&lt;/b&gt; as path parameters.&lt;/p&gt; &lt;p&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the seller&apos;s current campaign IDs and call &lt;a href=&quot;/api-docs/sell/marketing/resources/ad/methods/getAds&quot;&gt;getAds&lt;/a&gt; to retrieve their current ad IDs.&lt;/p&gt;
     * @return a {@link Ad}
     */
    @jakarta.annotation.Nullable
    public Ad get() {
        return get(null);
    }
    /**
     * This method retrieves the specified ad from the specified campaign.  &lt;p&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;ad_id&lt;/b&gt; as path parameters.&lt;/p&gt; &lt;p&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the seller&apos;s current campaign IDs and call &lt;a href=&quot;/api-docs/sell/marketing/resources/ad/methods/getAds&quot;&gt;getAds&lt;/a&gt; to retrieve their current ad IDs.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Ad}
     */
    @jakarta.annotation.Nullable
    public Ad get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Ad::createFromDiscriminatorValue);
    }
    /**
     * This method removes the specified ad from the specified campaign.&lt;br /&gt;&lt;br /&gt;Pass the ID of the ad to delete with the ID of the campaign associated with the ad as path parameters to the call.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to get the current list of the seller&apos;s campaign IDs.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;When using the CPC funding model, use the &lt;b&gt;bulkUpdateAdsStatusByListingId&lt;/b&gt; method to change the status of ads to ARCHIVED.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * This method removes the specified ad from the specified campaign.&lt;br /&gt;&lt;br /&gt;Pass the ID of the ad to delete with the ID of the campaign associated with the ad as path parameters to the call.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to get the current list of the seller&apos;s campaign IDs.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;When using the CPC funding model, use the &lt;b&gt;bulkUpdateAdsStatusByListingId&lt;/b&gt; method to change the status of ads to ARCHIVED.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * This method retrieves the specified ad from the specified campaign.  &lt;p&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;ad_id&lt;/b&gt; as path parameters.&lt;/p&gt; &lt;p&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the seller&apos;s current campaign IDs and call &lt;a href=&quot;/api-docs/sell/marketing/resources/ad/methods/getAds&quot;&gt;getAds&lt;/a&gt; to retrieve their current ad IDs.&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves the specified ad from the specified campaign.  &lt;p&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;ad_id&lt;/b&gt; as path parameters.&lt;/p&gt; &lt;p&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the seller&apos;s current campaign IDs and call &lt;a href=&quot;/api-docs/sell/marketing/resources/ad/methods/getAds&quot;&gt;getAds&lt;/a&gt; to retrieve their current ad IDs.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithAdItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithAdItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithAdItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
