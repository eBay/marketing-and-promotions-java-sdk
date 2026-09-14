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

package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.ad.item;

import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.ad.item.update_bid.UpdateBidRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.models.Ad;
import com.ebay.marketingandpromotions.generated.marketing.models.Error;
import com.ebay.marketingandpromotions.generated.marketing.models.ErrorDetailV3;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/ad/{ad_id}{?fieldgroups*}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithAdItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithAdItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/ad/{ad_id}{?fieldgroups*}", rawUrl);
    }
    /**
     * This method removes the specified ad from the specified campaign.&lt;br /&gt;&lt;br /&gt;Pass the ID of the ad to delete with the ID of the campaign associated with the ad as path parameters to the call.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to get the current list of the seller&apos;s campaign IDs.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot; target=&quot;_blank&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;&lt;br /&gt;When using the CPC funding model, use the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad-bulkupdateadsstatusbylistingid&quot;&gt;bulkUpdateAdsStatusByListingId&lt;/a&gt; method to change the status of ads to &lt;code&gt;ARCHIVED&lt;/code&gt;.
     * @throws ErrorDetailV3 When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 404 status code
     * @throws ErrorDetailV3 When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * This method removes the specified ad from the specified campaign.&lt;br /&gt;&lt;br /&gt;Pass the ID of the ad to delete with the ID of the campaign associated with the ad as path parameters to the call.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to get the current list of the seller&apos;s campaign IDs.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot; target=&quot;_blank&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;&lt;br /&gt;When using the CPC funding model, use the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad-bulkupdateadsstatusbylistingid&quot;&gt;bulkUpdateAdsStatusByListingId&lt;/a&gt; method to change the status of ads to &lt;code&gt;ARCHIVED&lt;/code&gt;.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ErrorDetailV3 When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 404 status code
     * @throws ErrorDetailV3 When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("404", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("409", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorDetailV3::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * This method retrieves the specified ad from the specified campaign.  &lt;p&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;ad_id&lt;/b&gt; as path parameters.&lt;/p&gt;&lt;p&gt;To retrieve video ads preference information for the ad, set the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter to &lt;code&gt;VIDEO&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the seller&apos;s current campaign IDs and call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad-getads&quot;&gt;getAds&lt;/a&gt; to retrieve their current ad IDs.&lt;/p&gt;
     * @return a {@link Ad}
     * @throws ErrorDetailV3 When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public Ad get() {
        return get(null);
    }
    /**
     * This method retrieves the specified ad from the specified campaign.  &lt;p&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;ad_id&lt;/b&gt; as path parameters.&lt;/p&gt;&lt;p&gt;To retrieve video ads preference information for the ad, set the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter to &lt;code&gt;VIDEO&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the seller&apos;s current campaign IDs and call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad-getads&quot;&gt;getAds&lt;/a&gt; to retrieve their current ad IDs.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Ad}
     * @throws ErrorDetailV3 When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public Ad get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("404", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("409", Error::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorDetailV3::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Ad::createFromDiscriminatorValue);
    }
    /**
     * This method removes the specified ad from the specified campaign.&lt;br /&gt;&lt;br /&gt;Pass the ID of the ad to delete with the ID of the campaign associated with the ad as path parameters to the call.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to get the current list of the seller&apos;s campaign IDs.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot; target=&quot;_blank&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;&lt;br /&gt;When using the CPC funding model, use the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad-bulkupdateadsstatusbylistingid&quot;&gt;bulkUpdateAdsStatusByListingId&lt;/a&gt; method to change the status of ads to &lt;code&gt;ARCHIVED&lt;/code&gt;.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * This method removes the specified ad from the specified campaign.&lt;br /&gt;&lt;br /&gt;Pass the ID of the ad to delete with the ID of the campaign associated with the ad as path parameters to the call.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to get the current list of the seller&apos;s campaign IDs.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot; target=&quot;_blank&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;&lt;br /&gt;When using the CPC funding model, use the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad-bulkupdateadsstatusbylistingid&quot;&gt;bulkUpdateAdsStatusByListingId&lt;/a&gt; method to change the status of ads to &lt;code&gt;ARCHIVED&lt;/code&gt;.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * This method retrieves the specified ad from the specified campaign.  &lt;p&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;ad_id&lt;/b&gt; as path parameters.&lt;/p&gt;&lt;p&gt;To retrieve video ads preference information for the ad, set the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter to &lt;code&gt;VIDEO&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the seller&apos;s current campaign IDs and call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad-getads&quot;&gt;getAds&lt;/a&gt; to retrieve their current ad IDs.&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves the specified ad from the specified campaign.  &lt;p&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;ad_id&lt;/b&gt; as path parameters.&lt;/p&gt;&lt;p&gt;To retrieve video ads preference information for the ad, set the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter to &lt;code&gt;VIDEO&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the seller&apos;s current campaign IDs and call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad-getads&quot;&gt;getAds&lt;/a&gt; to retrieve their current ad IDs.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
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
     * This method retrieves the specified ad from the specified campaign.  &lt;p&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;ad_id&lt;/b&gt; as path parameters.&lt;/p&gt;&lt;p&gt;To retrieve video ads preference information for the ad, set the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter to &lt;code&gt;VIDEO&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the seller&apos;s current campaign IDs and call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad-getads&quot;&gt;getAds&lt;/a&gt; to retrieve their current ad IDs.&lt;/p&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * A comma-separated list of values that controls what is returned in the response. If not provided, standard ad fields are returned. &lt;ul&gt;&lt;li&gt;&lt;b&gt;DEFAULT&lt;/b&gt;: Returns the standard ad fields. The &lt;b&gt;videoAdsPreferences&lt;/b&gt; container is not included in the response.&lt;/li&gt;&lt;li&gt;&lt;b&gt;VIDEO&lt;/b&gt;: Adds the &lt;b&gt;videoAdsPreferences&lt;/b&gt; container to the response, including video ads preferences for each ad.&lt;/li&gt;&lt;/ul&gt;
         */
        @jakarta.annotation.Nullable
        public GetFieldgroupsQueryParameterType fieldgroups;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("fieldgroups", fieldgroups);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}
