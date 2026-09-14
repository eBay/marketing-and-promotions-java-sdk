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

package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.ad_group;

import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.ad_group.item.WithAdGroupItemRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.models.AdGroupPagedCollectionResponse;
import com.ebay.marketingandpromotions.generated.marketing.models.CreateAdGroupRequest;
import com.ebay.marketingandpromotions.generated.marketing.models.Error;
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
 * Builds and executes requests for operations under /ad_campaign/{campaign_id}/ad_group
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AdGroupRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.ad_group.item collection
     * @param ad_group_id This path parameter specifies the unique identifier of the ad group being retrieved.&lt;br&gt;&lt;br&gt; Use the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_group-getadgroups&quot;&gt;getAdGroups&lt;/a&gt; method to retrieve ad group IDs.
     * @return a {@link WithAdGroupItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithAdGroupItemRequestBuilder byAd_group_id(@jakarta.annotation.Nonnull final String ad_group_id) {
        Objects.requireNonNull(ad_group_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("ad_group_id", ad_group_id);
        return new WithAdGroupItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link AdGroupRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AdGroupRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/ad_group{?ad_group_status*,limit*,offset*}", pathParameters);
    }
    /**
     * Instantiates a new {@link AdGroupRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AdGroupRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/ad_group{?ad_group_status*,limit*,offset*}", rawUrl);
    }
    /**
     * This method retrieves ad groups for the specified campaign.&lt;br /&gt;&lt;br /&gt;Each campaign can only have &lt;b&gt;one&lt;/b&gt; ad group.&lt;br /&gt;&lt;br /&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; as the path parameter.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the current campaign IDs for a seller.
     * @return a {@link AdGroupPagedCollectionResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public AdGroupPagedCollectionResponse get() {
        return get(null);
    }
    /**
     * This method retrieves ad groups for the specified campaign.&lt;br /&gt;&lt;br /&gt;Each campaign can only have &lt;b&gt;one&lt;/b&gt; ad group.&lt;br /&gt;&lt;br /&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; as the path parameter.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the current campaign IDs for a seller.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AdGroupPagedCollectionResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public AdGroupPagedCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("409", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AdGroupPagedCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * This method adds an ad group to an existing priority strategy campaign that uses manual targeting.&lt;br /&gt;&lt;br /&gt;To create an ad group for a campaign, specify the &lt;b&gt;defaultBid&lt;/b&gt; for the ad group in the payload of the request. Then specify the campaign to which the ad group should be associated using the &lt;b&gt;campaign_id&lt;/b&gt; path parameter.&lt;br /&gt;&lt;br /&gt;Each campaign can have one or more associated ad groups.
     * @param body This type defines the fields for the &lt;b&gt;createAdGroup&lt;/b&gt; request.
     * @return a {@link AdGroupPostResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public AdGroupPostResponse post(@jakarta.annotation.Nonnull final CreateAdGroupRequest body) {
        return post(body, null);
    }
    /**
     * This method adds an ad group to an existing priority strategy campaign that uses manual targeting.&lt;br /&gt;&lt;br /&gt;To create an ad group for a campaign, specify the &lt;b&gt;defaultBid&lt;/b&gt; for the ad group in the payload of the request. Then specify the campaign to which the ad group should be associated using the &lt;b&gt;campaign_id&lt;/b&gt; path parameter.&lt;br /&gt;&lt;br /&gt;Each campaign can have one or more associated ad groups.
     * @param body This type defines the fields for the &lt;b&gt;createAdGroup&lt;/b&gt; request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AdGroupPostResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public AdGroupPostResponse post(@jakarta.annotation.Nonnull final CreateAdGroupRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("409", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AdGroupPostResponse::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves ad groups for the specified campaign.&lt;br /&gt;&lt;br /&gt;Each campaign can only have &lt;b&gt;one&lt;/b&gt; ad group.&lt;br /&gt;&lt;br /&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; as the path parameter.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the current campaign IDs for a seller.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves ad groups for the specified campaign.&lt;br /&gt;&lt;br /&gt;Each campaign can only have &lt;b&gt;one&lt;/b&gt; ad group.&lt;br /&gt;&lt;br /&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; as the path parameter.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the current campaign IDs for a seller.
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
     * This method adds an ad group to an existing priority strategy campaign that uses manual targeting.&lt;br /&gt;&lt;br /&gt;To create an ad group for a campaign, specify the &lt;b&gt;defaultBid&lt;/b&gt; for the ad group in the payload of the request. Then specify the campaign to which the ad group should be associated using the &lt;b&gt;campaign_id&lt;/b&gt; path parameter.&lt;br /&gt;&lt;br /&gt;Each campaign can have one or more associated ad groups.
     * @param body This type defines the fields for the &lt;b&gt;createAdGroup&lt;/b&gt; request.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateAdGroupRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method adds an ad group to an existing priority strategy campaign that uses manual targeting.&lt;br /&gt;&lt;br /&gt;To create an ad group for a campaign, specify the &lt;b&gt;defaultBid&lt;/b&gt; for the ad group in the payload of the request. Then specify the campaign to which the ad group should be associated using the &lt;b&gt;campaign_id&lt;/b&gt; path parameter.&lt;br /&gt;&lt;br /&gt;Each campaign can have one or more associated ad groups.
     * @param body This type defines the fields for the &lt;b&gt;createAdGroup&lt;/b&gt; request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateAdGroupRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link AdGroupRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AdGroupRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AdGroupRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method retrieves ad groups for the specified campaign.&lt;br /&gt;&lt;br /&gt;Each campaign can only have &lt;b&gt;one&lt;/b&gt; ad group.&lt;br /&gt;&lt;br /&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; as the path parameter.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the current campaign IDs for a seller.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * A comma-separated list of ad group statuses. The results will be filtered to only include the given statuses of the ad group.&lt;br&gt;&lt;br&gt; See &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_group-getadgroups.adgroupstatusenum&quot;&gt;AdGroupStatusEnum&lt;/a&gt; for supported values.
         */
        @jakarta.annotation.Nullable
        public String adGroupStatus;
        /**
         * The number of results, from the current result set, to be returned in a single page.
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * The number of results that will be skipped in the result set. This is used with the &lt;b&gt;limit&lt;/b&gt; field to control the pagination of the output.&lt;br /&gt;&lt;br /&gt;For example, if the &lt;b&gt;offset&lt;/b&gt; is set to &lt;code&gt;0&lt;/code&gt; and the &lt;b&gt;limit&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, the method will retrieve items 1 through 10 from the list of items returned. If the &lt;b&gt;offset&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt; and the &lt;b&gt;limit&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, the method will retrieve items 11 through 20 from the list of items returned.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default&lt;/b&gt;: &lt;code&gt;0&lt;/code&gt;
         */
        @jakarta.annotation.Nullable
        public String offset;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("ad_group_status", adGroupStatus);
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
