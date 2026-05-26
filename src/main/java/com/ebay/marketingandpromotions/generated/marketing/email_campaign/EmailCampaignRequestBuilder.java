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

package com.ebay.marketingandpromotions.generated.marketing.email_campaign;

import com.ebay.marketingandpromotions.generated.marketing.email_campaign.audience.AudienceRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.email_campaign.item.WithEmailCampaignItemRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.email_campaign.report.ReportRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.models.CreateEmailCampaignRequest;
import com.ebay.marketingandpromotions.generated.marketing.models.CreateEmailCampaignResponse;
import com.ebay.marketingandpromotions.generated.marketing.models.GetEmailCampaignsResponse;
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
 * Builds and executes requests for operations under /email_campaign
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EmailCampaignRequestBuilder extends BaseRequestBuilder {
    /**
     * The audience property
     * @return a {@link AudienceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AudienceRequestBuilder audience() {
        return new AudienceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The report property
     * @return a {@link ReportRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReportRequestBuilder report() {
        return new ReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.ebay.marketingandpromotions.generated.marketing.email_campaign.item collection
     * @param email_campaign_id This path parameter specifies the unique eBay-assigned identifier of the email campaign being retrieved.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getEmailCampaigns&quot;&gt;getEmailCampaigns&lt;/a&gt; method to retrieve a list of email campaign IDs for a seller.
     * @return a {@link WithEmailCampaignItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithEmailCampaignItemRequestBuilder byEmail_campaign_id(@jakarta.annotation.Nonnull final String email_campaign_id) {
        Objects.requireNonNull(email_campaign_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("email_campaign_id", email_campaign_id);
        return new WithEmailCampaignItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link EmailCampaignRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EmailCampaignRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/email_campaign{?limit*,offset*,q*,sort*}", pathParameters);
    }
    /**
     * Instantiates a new {@link EmailCampaignRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EmailCampaignRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/email_campaign{?limit*,offset*,q*,sort*}", rawUrl);
    }
    /**
     * This method retrieves a list of email campaigns from a seller&apos;s eBay store.&lt;br&gt;&lt;br&gt;Users can filter the results by &lt;a href=&quot;/api-docs/sell/marketing/types/api:CampaignTypeEnum&quot;&gt;email campaign type&lt;/a&gt;, &lt;a href=&quot;/api-docs/sell/marketing/types/api:EmailCampaignStatusEnum&quot;&gt;email campaign status&lt;/a&gt;, and &lt;a href=&quot;/api-docs/sell/marketing/types/ba:MarketplaceIdEnum&quot;&gt;marketplace ID&lt;/a&gt; using the &lt;code&gt;q&lt;/code&gt; query parameter.
     * @return a {@link GetEmailCampaignsResponse}
     */
    @jakarta.annotation.Nullable
    public GetEmailCampaignsResponse get() {
        return get(null);
    }
    /**
     * This method retrieves a list of email campaigns from a seller&apos;s eBay store.&lt;br&gt;&lt;br&gt;Users can filter the results by &lt;a href=&quot;/api-docs/sell/marketing/types/api:CampaignTypeEnum&quot;&gt;email campaign type&lt;/a&gt;, &lt;a href=&quot;/api-docs/sell/marketing/types/api:EmailCampaignStatusEnum&quot;&gt;email campaign status&lt;/a&gt;, and &lt;a href=&quot;/api-docs/sell/marketing/types/ba:MarketplaceIdEnum&quot;&gt;marketplace ID&lt;/a&gt; using the &lt;code&gt;q&lt;/code&gt; query parameter.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetEmailCampaignsResponse}
     */
    @jakarta.annotation.Nullable
    public GetEmailCampaignsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, GetEmailCampaignsResponse::createFromDiscriminatorValue);
    }
    /**
     * This method creates a new email campaign. An eBay store owner can create six different types of email campaigns: Welcome, New products &amp; collections, Coupon, Sale event + markdown, Order discount, and Volume pricing.&lt;br&gt;&lt;br&gt;A successful &lt;b&gt;createEmailCampaign&lt;/b&gt; request returns the &lt;b&gt;emailCampaignId&lt;/b&gt; assigned to the new email campaign.&lt;br&gt;&lt;br&gt;The fields &lt;b&gt;emailCampaignType&lt;/b&gt;, &lt;b&gt;audienceCodes&lt;/b&gt;, &lt;b&gt;itemSelectMode&lt;/b&gt;, &lt;b&gt;subject&lt;/b&gt;, and &lt;b&gt;personalizedMessage&lt;/b&gt; are required for all email campaign types. &lt;br&gt;&lt;br&gt;Specific email campaign types have required values for additional fields. For more information on the email campaign types, see the &lt;a href=&quot;/api-docs/sell/static/marketing/store-email-campaigns.html#email-campain-types&quot; target=&quot;_blank&quot;&gt;Store Email Campaigns&lt;/a&gt; section of the Selling Integration Guide. 
     * @param body create email campaign request payload
     * @return a {@link CreateEmailCampaignResponse}
     */
    @jakarta.annotation.Nullable
    public CreateEmailCampaignResponse post(@jakarta.annotation.Nonnull final CreateEmailCampaignRequest body) {
        return post(body, null);
    }
    /**
     * This method creates a new email campaign. An eBay store owner can create six different types of email campaigns: Welcome, New products &amp; collections, Coupon, Sale event + markdown, Order discount, and Volume pricing.&lt;br&gt;&lt;br&gt;A successful &lt;b&gt;createEmailCampaign&lt;/b&gt; request returns the &lt;b&gt;emailCampaignId&lt;/b&gt; assigned to the new email campaign.&lt;br&gt;&lt;br&gt;The fields &lt;b&gt;emailCampaignType&lt;/b&gt;, &lt;b&gt;audienceCodes&lt;/b&gt;, &lt;b&gt;itemSelectMode&lt;/b&gt;, &lt;b&gt;subject&lt;/b&gt;, and &lt;b&gt;personalizedMessage&lt;/b&gt; are required for all email campaign types. &lt;br&gt;&lt;br&gt;Specific email campaign types have required values for additional fields. For more information on the email campaign types, see the &lt;a href=&quot;/api-docs/sell/static/marketing/store-email-campaigns.html#email-campain-types&quot; target=&quot;_blank&quot;&gt;Store Email Campaigns&lt;/a&gt; section of the Selling Integration Guide. 
     * @param body create email campaign request payload
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CreateEmailCampaignResponse}
     */
    @jakarta.annotation.Nullable
    public CreateEmailCampaignResponse post(@jakarta.annotation.Nonnull final CreateEmailCampaignRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, CreateEmailCampaignResponse::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves a list of email campaigns from a seller&apos;s eBay store.&lt;br&gt;&lt;br&gt;Users can filter the results by &lt;a href=&quot;/api-docs/sell/marketing/types/api:CampaignTypeEnum&quot;&gt;email campaign type&lt;/a&gt;, &lt;a href=&quot;/api-docs/sell/marketing/types/api:EmailCampaignStatusEnum&quot;&gt;email campaign status&lt;/a&gt;, and &lt;a href=&quot;/api-docs/sell/marketing/types/ba:MarketplaceIdEnum&quot;&gt;marketplace ID&lt;/a&gt; using the &lt;code&gt;q&lt;/code&gt; query parameter.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves a list of email campaigns from a seller&apos;s eBay store.&lt;br&gt;&lt;br&gt;Users can filter the results by &lt;a href=&quot;/api-docs/sell/marketing/types/api:CampaignTypeEnum&quot;&gt;email campaign type&lt;/a&gt;, &lt;a href=&quot;/api-docs/sell/marketing/types/api:EmailCampaignStatusEnum&quot;&gt;email campaign status&lt;/a&gt;, and &lt;a href=&quot;/api-docs/sell/marketing/types/ba:MarketplaceIdEnum&quot;&gt;marketplace ID&lt;/a&gt; using the &lt;code&gt;q&lt;/code&gt; query parameter.
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
     * This method creates a new email campaign. An eBay store owner can create six different types of email campaigns: Welcome, New products &amp; collections, Coupon, Sale event + markdown, Order discount, and Volume pricing.&lt;br&gt;&lt;br&gt;A successful &lt;b&gt;createEmailCampaign&lt;/b&gt; request returns the &lt;b&gt;emailCampaignId&lt;/b&gt; assigned to the new email campaign.&lt;br&gt;&lt;br&gt;The fields &lt;b&gt;emailCampaignType&lt;/b&gt;, &lt;b&gt;audienceCodes&lt;/b&gt;, &lt;b&gt;itemSelectMode&lt;/b&gt;, &lt;b&gt;subject&lt;/b&gt;, and &lt;b&gt;personalizedMessage&lt;/b&gt; are required for all email campaign types. &lt;br&gt;&lt;br&gt;Specific email campaign types have required values for additional fields. For more information on the email campaign types, see the &lt;a href=&quot;/api-docs/sell/static/marketing/store-email-campaigns.html#email-campain-types&quot; target=&quot;_blank&quot;&gt;Store Email Campaigns&lt;/a&gt; section of the Selling Integration Guide. 
     * @param body create email campaign request payload
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateEmailCampaignRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method creates a new email campaign. An eBay store owner can create six different types of email campaigns: Welcome, New products &amp; collections, Coupon, Sale event + markdown, Order discount, and Volume pricing.&lt;br&gt;&lt;br&gt;A successful &lt;b&gt;createEmailCampaign&lt;/b&gt; request returns the &lt;b&gt;emailCampaignId&lt;/b&gt; assigned to the new email campaign.&lt;br&gt;&lt;br&gt;The fields &lt;b&gt;emailCampaignType&lt;/b&gt;, &lt;b&gt;audienceCodes&lt;/b&gt;, &lt;b&gt;itemSelectMode&lt;/b&gt;, &lt;b&gt;subject&lt;/b&gt;, and &lt;b&gt;personalizedMessage&lt;/b&gt; are required for all email campaign types. &lt;br&gt;&lt;br&gt;Specific email campaign types have required values for additional fields. For more information on the email campaign types, see the &lt;a href=&quot;/api-docs/sell/static/marketing/store-email-campaigns.html#email-campain-types&quot; target=&quot;_blank&quot;&gt;Store Email Campaigns&lt;/a&gt; section of the Selling Integration Guide. 
     * @param body create email campaign request payload
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateEmailCampaignRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link EmailCampaignRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EmailCampaignRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new EmailCampaignRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method retrieves a list of email campaigns from a seller&apos;s eBay store.&lt;br&gt;&lt;br&gt;Users can filter the results by &lt;a href=&quot;/api-docs/sell/marketing/types/api:CampaignTypeEnum&quot;&gt;email campaign type&lt;/a&gt;, &lt;a href=&quot;/api-docs/sell/marketing/types/api:EmailCampaignStatusEnum&quot;&gt;email campaign status&lt;/a&gt;, and &lt;a href=&quot;/api-docs/sell/marketing/types/ba:MarketplaceIdEnum&quot;&gt;marketplace ID&lt;/a&gt; using the &lt;code&gt;q&lt;/code&gt; query parameter.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * The maximum number of email campaigns returned in a page.&lt;br&gt;&lt;br&gt;&lt;b&gt;Min value&lt;/b&gt;: 1&lt;br&gt;&lt;br&gt;&lt;b&gt;Max value&lt;/b&gt;: 200
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * The number of results to skip in a pagination query. This value cannot be less than zero.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default value&lt;/b&gt;: 0
         */
        @jakarta.annotation.Nullable
        public String offset;
        /**
         * This field contains filter criteria for the results returned. Filter by &lt;a href=&quot;/api-docs/sell/marketing/types/api:CampaignTypeEnum&quot;&gt;email campaign type&lt;/a&gt;, &lt;a href=&quot;/api-docs/sell/marketing/types/api:EmailCampaignStatusEnum&quot;&gt;email campaign status&lt;/a&gt;, and &lt;a href=&quot;/api-docs/sell/marketing/types/ba:MarketplaceIdEnum&quot;&gt;marketplace ID&lt;/a&gt;.&lt;br&gt;&lt;br&gt;For example, setting &lt;code&gt;q=campaignType:WELCOME,ITEM_SHOWCASE&lt;/code&gt; will return only Welcome and Item Showcase email campaigns.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; At least one &lt;code&gt;campaignType&lt;/code&gt; value must be set through the &lt;code&gt;q&lt;/code&gt; query parameter. If no other filters are set, all email campaigns for the specified campaign type(s) will be returned in the results set.&lt;/span&gt;
         */
        @jakarta.annotation.Nullable
        public String q;
        /**
         * The criteria for sorting email campaign results. See &lt;a href=&quot;/api-docs/sell/marketing/types/api:ItemSortEnum&quot; target=&quot;_blank&quot;&gt;ItemSortEnum&lt;/a&gt; for sorting options and their enum values.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default&lt;/b&gt;: &lt;code&gt;NEWLY_LISTED&lt;/code&gt;
         */
        @jakarta.annotation.Nullable
        public String sort;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
            allQueryParams.put("q", q);
            allQueryParams.put("sort", sort);
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
