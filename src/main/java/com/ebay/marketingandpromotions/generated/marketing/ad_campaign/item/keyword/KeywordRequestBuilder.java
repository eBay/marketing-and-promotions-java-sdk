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

package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.keyword;

import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.keyword.item.WithKeywordItemRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.models.CreateKeywordRequest;
import com.ebay.marketingandpromotions.generated.marketing.models.ErrorDetailV3;
import com.ebay.marketingandpromotions.generated.marketing.models.KeywordPagedCollectionResponse;
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
 * Builds and executes requests for operations under /ad_campaign/{campaign_id}/keyword
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class KeywordRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.keyword.item collection
     * @param keyword_id This path parameter specifies the unique identifier of the keyword being retrieved.&lt;br&gt;&lt;br&gt; Use the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-keyword-getkeywords&quot;&gt;getKeywords&lt;/a&gt; method to retrieve keyword IDs.
     * @return a {@link WithKeywordItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithKeywordItemRequestBuilder byKeyword_id(@jakarta.annotation.Nonnull final String keyword_id) {
        Objects.requireNonNull(keyword_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("keyword_id", keyword_id);
        return new WithKeywordItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link KeywordRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public KeywordRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/keyword{?ad_group_ids*,keyword_status*,limit*,offset*}", pathParameters);
    }
    /**
     * Instantiates a new {@link KeywordRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public KeywordRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/keyword{?ad_group_ids*,keyword_status*,limit*,offset*}", rawUrl);
    }
    /**
     * This method can be used to retrieve all of the keywords for ad groups in priority strategy campaigns that use the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter. If one or more &lt;b&gt;ad_group_ids&lt;/b&gt; are passed in the request body, the keywords for those ad groups will be returned. If &lt;b&gt;ad_group_ids&lt;/b&gt; are not passed in the response body, the call will return all the keywords in the campaign.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller.
     * @return a {@link KeywordPagedCollectionResponse}
     * @throws ErrorDetailV3 When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 404 status code
     * @throws ErrorDetailV3 When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public KeywordPagedCollectionResponse get() {
        return get(null);
    }
    /**
     * This method can be used to retrieve all of the keywords for ad groups in priority strategy campaigns that use the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter. If one or more &lt;b&gt;ad_group_ids&lt;/b&gt; are passed in the request body, the keywords for those ad groups will be returned. If &lt;b&gt;ad_group_ids&lt;/b&gt; are not passed in the response body, the call will return all the keywords in the campaign.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link KeywordPagedCollectionResponse}
     * @throws ErrorDetailV3 When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 404 status code
     * @throws ErrorDetailV3 When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public KeywordPagedCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("404", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("409", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorDetailV3::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, KeywordPagedCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * This method creates keywords using a specified campaign ID for an existing priority strategy campaign that uses manual targeting.&lt;br /&gt;&lt;br /&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_group-suggestkeywords&quot;&gt;suggestKeywords&lt;/a&gt; method to retrieve a list of keyword ideas to be targeted for priority strategy campaigns, and call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller.
     * @param body A type that defines the fields for the request to create a keyword.
     * @return a {@link KeywordPostResponse}
     * @throws ErrorDetailV3 When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 404 status code
     * @throws ErrorDetailV3 When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public KeywordPostResponse post(@jakarta.annotation.Nonnull final CreateKeywordRequest body) {
        return post(body, null);
    }
    /**
     * This method creates keywords using a specified campaign ID for an existing priority strategy campaign that uses manual targeting.&lt;br /&gt;&lt;br /&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_group-suggestkeywords&quot;&gt;suggestKeywords&lt;/a&gt; method to retrieve a list of keyword ideas to be targeted for priority strategy campaigns, and call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller.
     * @param body A type that defines the fields for the request to create a keyword.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link KeywordPostResponse}
     * @throws ErrorDetailV3 When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 404 status code
     * @throws ErrorDetailV3 When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public KeywordPostResponse post(@jakarta.annotation.Nonnull final CreateKeywordRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("404", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("409", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorDetailV3::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, KeywordPostResponse::createFromDiscriminatorValue);
    }
    /**
     * This method can be used to retrieve all of the keywords for ad groups in priority strategy campaigns that use the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter. If one or more &lt;b&gt;ad_group_ids&lt;/b&gt; are passed in the request body, the keywords for those ad groups will be returned. If &lt;b&gt;ad_group_ids&lt;/b&gt; are not passed in the response body, the call will return all the keywords in the campaign.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method can be used to retrieve all of the keywords for ad groups in priority strategy campaigns that use the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter. If one or more &lt;b&gt;ad_group_ids&lt;/b&gt; are passed in the request body, the keywords for those ad groups will be returned. If &lt;b&gt;ad_group_ids&lt;/b&gt; are not passed in the response body, the call will return all the keywords in the campaign.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller.
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
     * This method creates keywords using a specified campaign ID for an existing priority strategy campaign that uses manual targeting.&lt;br /&gt;&lt;br /&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_group-suggestkeywords&quot;&gt;suggestKeywords&lt;/a&gt; method to retrieve a list of keyword ideas to be targeted for priority strategy campaigns, and call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller.
     * @param body A type that defines the fields for the request to create a keyword.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateKeywordRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method creates keywords using a specified campaign ID for an existing priority strategy campaign that uses manual targeting.&lt;br /&gt;&lt;br /&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_group-suggestkeywords&quot;&gt;suggestKeywords&lt;/a&gt; method to retrieve a list of keyword ideas to be targeted for priority strategy campaigns, and call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller.
     * @param body A type that defines the fields for the request to create a keyword.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateKeywordRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link KeywordRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public KeywordRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new KeywordRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method can be used to retrieve all of the keywords for ad groups in priority strategy campaigns that use the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter. If one or more &lt;b&gt;ad_group_ids&lt;/b&gt; are passed in the request body, the keywords for those ad groups will be returned. If &lt;b&gt;ad_group_ids&lt;/b&gt; are not passed in the response body, the call will return all the keywords in the campaign.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * A comma-separated list of ad group IDs. This query parameter is used if the seller wants to retrieve keywords from one or more specific ad groups. If this query parameter is not used, all keywords that are part of the CPC campaign are returned.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_group-getadgroups&quot;&gt;getAdGroups&lt;/a&gt; method to retrieve the ad group IDs for a seller.
         */
        @jakarta.annotation.Nullable
        public String adGroupIds;
        /**
         * A comma-separated list of keyword statuses. The results will be filtered to only include the given statuses of the keyword. If none are provided, all keywords are returned.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-keyword-getkeywords.keywordstatusenum&quot;&gt;KeywordStatusEnum&lt;/a&gt; for supported values.
         */
        @jakarta.annotation.Nullable
        public GetKeywordStatusQueryParameterType keywordStatus;
        /**
         * &lt;p&gt;Specifies the maximum number of results to return on a page in the paginated response.&lt;/p&gt;  &lt;b&gt;Default: &lt;/b&gt;10 &lt;br&gt;&lt;b&gt;Maximum: &lt;/b&gt; 500
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * Specifies the number of results to skip in the result set before returning the first report in the paginated response.  &lt;p&gt;Combine &lt;b&gt;offset&lt;/b&gt; with the &lt;b&gt;limit&lt;/b&gt; query parameter to control the items returned in the response. For example, if you supply an &lt;b&gt;offset&lt;/b&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;b&gt;limit&lt;/b&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If &lt;b&gt;offset&lt;/b&gt; is &lt;code&gt;10&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is &lt;code&gt;20&lt;/code&gt;, the first page of the response contains items 11-30 from the complete result set.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Default:&lt;/b&gt; 0&lt;/p&gt;
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
            allQueryParams.put("keyword_status", keywordStatus);
            allQueryParams.put("ad_group_ids", adGroupIds);
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
