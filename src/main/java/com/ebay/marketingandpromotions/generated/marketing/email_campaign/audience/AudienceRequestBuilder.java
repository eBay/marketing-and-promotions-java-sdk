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

package com.ebay.marketingandpromotions.generated.marketing.email_campaign.audience;

import com.ebay.marketingandpromotions.generated.marketing.models.Error;
import com.ebay.marketingandpromotions.generated.marketing.models.GetEmailCampaignAudiencesResponse;
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
 * Builds and executes requests for operations under /email_campaign/audience
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AudienceRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link AudienceRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AudienceRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/email_campaign/audience?emailCampaignType={emailCampaignType}{&limit*,offset*}", pathParameters);
    }
    /**
     * Instantiates a new {@link AudienceRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AudienceRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/email_campaign/audience?emailCampaignType={emailCampaignType}{&limit*,offset*}", rawUrl);
    }
    /**
     * This method retrieves all available email newsletter audiences for the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-email_campaign-getemailcampaigns.campaigntypeenum&quot;&gt;email campaign type&lt;/a&gt; specified by the &lt;b&gt;emailCampaignType&lt;/b&gt; path parameter.&lt;br&gt;&lt;br&gt;Use the optional &lt;b&gt;limit&lt;/b&gt; and &lt;b&gt;offset&lt;/b&gt; path parameters to paginate the results and to control which records are returned, respectively.
     * @return a {@link GetEmailCampaignAudiencesResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public GetEmailCampaignAudiencesResponse get() {
        return get(null);
    }
    /**
     * This method retrieves all available email newsletter audiences for the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-email_campaign-getemailcampaigns.campaigntypeenum&quot;&gt;email campaign type&lt;/a&gt; specified by the &lt;b&gt;emailCampaignType&lt;/b&gt; path parameter.&lt;br&gt;&lt;br&gt;Use the optional &lt;b&gt;limit&lt;/b&gt; and &lt;b&gt;offset&lt;/b&gt; path parameters to paginate the results and to control which records are returned, respectively.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetEmailCampaignAudiencesResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public GetEmailCampaignAudiencesResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("409", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, GetEmailCampaignAudiencesResponse::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves all available email newsletter audiences for the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-email_campaign-getemailcampaigns.campaigntypeenum&quot;&gt;email campaign type&lt;/a&gt; specified by the &lt;b&gt;emailCampaignType&lt;/b&gt; path parameter.&lt;br&gt;&lt;br&gt;Use the optional &lt;b&gt;limit&lt;/b&gt; and &lt;b&gt;offset&lt;/b&gt; path parameters to paginate the results and to control which records are returned, respectively.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves all available email newsletter audiences for the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-email_campaign-getemailcampaigns.campaigntypeenum&quot;&gt;email campaign type&lt;/a&gt; specified by the &lt;b&gt;emailCampaignType&lt;/b&gt; path parameter.&lt;br&gt;&lt;br&gt;Use the optional &lt;b&gt;limit&lt;/b&gt; and &lt;b&gt;offset&lt;/b&gt; path parameters to paginate the results and to control which records are returned, respectively.
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
     * @return a {@link AudienceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AudienceRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AudienceRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method retrieves all available email newsletter audiences for the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-email_campaign-getemailcampaigns.campaigntypeenum&quot;&gt;email campaign type&lt;/a&gt; specified by the &lt;b&gt;emailCampaignType&lt;/b&gt; path parameter.&lt;br&gt;&lt;br&gt;Use the optional &lt;b&gt;limit&lt;/b&gt; and &lt;b&gt;offset&lt;/b&gt; path parameters to paginate the results and to control which records are returned, respectively.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * The email campaign type to search against.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-email_campaign-getemailcampaigns.campaigntypeenum&quot;&gt;CampaignTypeEnum&lt;/a&gt; for the full list of available email campaign types and associated enum values.
         */
        @jakarta.annotation.Nullable
        public String emailCampaignType;
        /**
         * The maximum number of audience groups returned per page in the results set.&lt;br&gt;&lt;br&gt;&lt;b&gt;Min value&lt;/b&gt;: 1&lt;br&gt;&lt;br&gt;&lt;b&gt;Max value&lt;/b&gt;: 200&lt;br&gt;&lt;br&gt;&lt;b&gt;Default value&lt;/b&gt;: 100
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * The number of results to skip in a pagination query. This value cannot be less than 0.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default value&lt;/b&gt;: 0
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
            allQueryParams.put("emailCampaignType", emailCampaignType);
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
}
