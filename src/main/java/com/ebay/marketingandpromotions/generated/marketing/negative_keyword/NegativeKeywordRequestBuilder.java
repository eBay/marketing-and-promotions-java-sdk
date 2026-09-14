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

package com.ebay.marketingandpromotions.generated.marketing.negative_keyword;

import com.ebay.marketingandpromotions.generated.marketing.models.CreateNegativeKeywordRequest;
import com.ebay.marketingandpromotions.generated.marketing.models.Error;
import com.ebay.marketingandpromotions.generated.marketing.models.NegativeKeywordPagedCollectionResponse;
import com.ebay.marketingandpromotions.generated.marketing.negative_keyword.item.WithNegativeKeywordItemRequestBuilder;
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
 * Builds and executes requests for operations under /negative_keyword
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NegativeKeywordRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.marketingandpromotions.generated.marketing.negative_keyword.item collection
     * @param negative_keyword_id This path parameter specifies the unique identifier for the negative keyword being retrieved.&lt;br /&gt;&lt;br /&gt;Use the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-negative_keyword-getnegativekeywords&quot;&gt; getNegativeKeywords&lt;/a&gt; method to retrieve negative keyword IDs.
     * @return a {@link WithNegativeKeywordItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithNegativeKeywordItemRequestBuilder byNegative_keyword_id(@jakarta.annotation.Nonnull final String negative_keyword_id) {
        Objects.requireNonNull(negative_keyword_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("negative_keyword_id", negative_keyword_id);
        return new WithNegativeKeywordItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link NegativeKeywordRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NegativeKeywordRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/negative_keyword?ad_group_ids={ad_group_ids}{&campaign_ids*,limit*,negative_keyword_status*,offset*}", pathParameters);
    }
    /**
     * Instantiates a new {@link NegativeKeywordRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NegativeKeywordRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/negative_keyword?ad_group_ids={ad_group_ids}{&campaign_ids*,limit*,negative_keyword_status*,offset*}", rawUrl);
    }
    /**
     * This method can be used to retrieve all of the negative keywords for ad groups in priority strategy campaigns that use the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;The results can be filtered using the &lt;b&gt;campaign_ids&lt;/b&gt;, &lt;b&gt;ad_group_ids&lt;/b&gt;, and &lt;b&gt;negative_keyword_status&lt;/b&gt; query parameters.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller.
     * @return a {@link NegativeKeywordPagedCollectionResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public NegativeKeywordPagedCollectionResponse get() {
        return get(null);
    }
    /**
     * This method can be used to retrieve all of the negative keywords for ad groups in priority strategy campaigns that use the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;The results can be filtered using the &lt;b&gt;campaign_ids&lt;/b&gt;, &lt;b&gt;ad_group_ids&lt;/b&gt;, and &lt;b&gt;negative_keyword_status&lt;/b&gt; query parameters.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link NegativeKeywordPagedCollectionResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public NegativeKeywordPagedCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("403", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("409", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, NegativeKeywordPagedCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * This method adds a negative keyword to an existing ad group in a priority strategy campaign that uses manual targeting.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;campaignId&lt;/b&gt; and &lt;b&gt;adGroupId&lt;/b&gt; in the request body, along with the &lt;b&gt;negativeKeywordText&lt;/b&gt; and &lt;b&gt;negativeKeywordMatchType&lt;/b&gt;.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a specified seller.
     * @param body A type that defines the fields for the request to create a negative keyword.
     * @return a {@link NegativeKeywordPostResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public NegativeKeywordPostResponse post(@jakarta.annotation.Nonnull final CreateNegativeKeywordRequest body) {
        return post(body, null);
    }
    /**
     * This method adds a negative keyword to an existing ad group in a priority strategy campaign that uses manual targeting.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;campaignId&lt;/b&gt; and &lt;b&gt;adGroupId&lt;/b&gt; in the request body, along with the &lt;b&gt;negativeKeywordText&lt;/b&gt; and &lt;b&gt;negativeKeywordMatchType&lt;/b&gt;.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a specified seller.
     * @param body A type that defines the fields for the request to create a negative keyword.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link NegativeKeywordPostResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public NegativeKeywordPostResponse post(@jakarta.annotation.Nonnull final CreateNegativeKeywordRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("403", Error::createFromDiscriminatorValue);
        errorMapping.put("409", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, NegativeKeywordPostResponse::createFromDiscriminatorValue);
    }
    /**
     * This method can be used to retrieve all of the negative keywords for ad groups in priority strategy campaigns that use the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;The results can be filtered using the &lt;b&gt;campaign_ids&lt;/b&gt;, &lt;b&gt;ad_group_ids&lt;/b&gt;, and &lt;b&gt;negative_keyword_status&lt;/b&gt; query parameters.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method can be used to retrieve all of the negative keywords for ad groups in priority strategy campaigns that use the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;The results can be filtered using the &lt;b&gt;campaign_ids&lt;/b&gt;, &lt;b&gt;ad_group_ids&lt;/b&gt;, and &lt;b&gt;negative_keyword_status&lt;/b&gt; query parameters.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller.
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
     * This method adds a negative keyword to an existing ad group in a priority strategy campaign that uses manual targeting.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;campaignId&lt;/b&gt; and &lt;b&gt;adGroupId&lt;/b&gt; in the request body, along with the &lt;b&gt;negativeKeywordText&lt;/b&gt; and &lt;b&gt;negativeKeywordMatchType&lt;/b&gt;.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a specified seller.
     * @param body A type that defines the fields for the request to create a negative keyword.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateNegativeKeywordRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method adds a negative keyword to an existing ad group in a priority strategy campaign that uses manual targeting.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;campaignId&lt;/b&gt; and &lt;b&gt;adGroupId&lt;/b&gt; in the request body, along with the &lt;b&gt;negativeKeywordText&lt;/b&gt; and &lt;b&gt;negativeKeywordMatchType&lt;/b&gt;.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a specified seller.
     * @param body A type that defines the fields for the request to create a negative keyword.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateNegativeKeywordRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, "{+baseurl}/negative_keyword", pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link NegativeKeywordRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NegativeKeywordRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new NegativeKeywordRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method can be used to retrieve all of the negative keywords for ad groups in priority strategy campaigns that use the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;The results can be filtered using the &lt;b&gt;campaign_ids&lt;/b&gt;, &lt;b&gt;ad_group_ids&lt;/b&gt;, and &lt;b&gt;negative_keyword_status&lt;/b&gt; query parameters.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * A comma-separated list of ad group IDs.&lt;br /&gt;&lt;br /&gt;This query parameter is used if the seller wants to retrieve the negative keywords from one or more specific ad groups. The results might not include these ad group IDs if other search conditions exclude them.&lt;br /&gt;&lt;br /&gt;Use the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_group-getadgroups&quot;&gt;getAdGroups&lt;/a&gt; method to retrieve the ad group IDs for a seller.&lt;br /&gt;&lt;br /&gt;&lt;i&gt;Required if&lt;/i&gt; the search results must be filtered to include negative keywords created at the ad group level.
         */
        @jakarta.annotation.Nullable
        public String adGroupIds;
        /**
         * This path parameter specifies the unique eBay-assigned identifier of the ad campaign associated with the negative keywords being retrieved.&lt;br /&gt;&lt;br /&gt;This query parameter is used if the seller wants to retrieve the negative keywords from a specific campaign. The results might not include these campaign IDs if other search conditions exclude them.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, only one campaign ID value is supported for each request.&lt;/span&gt;&lt;br&gt;&lt;br&gt; Use the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve campaign IDs.
         */
        @jakarta.annotation.Nullable
        public String campaignIds;
        /**
         * The number of results, from the current result set, to be returned in a single page.
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * A comma-separated list of negative keyword statuses.&lt;br /&gt;&lt;br /&gt;This query parameter is used if the seller wants to filter the search results based on one or more negative keyword statuses.&lt;br&gt;&lt;br&gt; See &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-negative_keyword-getnegativekeywords.negativekeyword.negativekeywordtext&quot;&gt;NegativeKeywordStatusEnum&lt;/a&gt; for supported values.
         */
        @jakarta.annotation.Nullable
        public String negativeKeywordStatus;
        /**
         * The number of results that will be skipped in the result set. This is used with the &lt;b&gt;limit&lt;/b&gt; field to control the pagination of the output.&lt;br /&gt;&lt;br /&gt;For example, if the &lt;b&gt;offset&lt;/b&gt; is set to &lt;code&gt;0&lt;/code&gt; and the &lt;b&gt;limit&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, the method will retrieve items 1 through 10 from the list of items returned. If the &lt;b&gt;offset&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt; and the &lt;b&gt;limit&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, the method will retrieve items 11 through 20 from the list of items returned.
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
            allQueryParams.put("ad_group_ids", adGroupIds);
            allQueryParams.put("campaign_ids", campaignIds);
            allQueryParams.put("limit", limit);
            allQueryParams.put("negative_keyword_status", negativeKeywordStatus);
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
