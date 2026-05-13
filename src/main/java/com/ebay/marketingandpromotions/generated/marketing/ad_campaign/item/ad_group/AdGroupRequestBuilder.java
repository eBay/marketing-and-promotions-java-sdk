package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.ad_group;

import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.ad_group.item.WithAdGroupItemRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.models.AdGroupPagedCollectionResponse;
import com.ebay.marketingandpromotions.generated.marketing.models.CreateAdGroupRequest;
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
     * @param ad_group_id This path parameter specifies the unique identifier of the ad group being retrieved.&lt;br&gt;&lt;br&gt; Use the &lt;a href=&quot;/api-docs/sell/marketing/resources/ad_group/methods/getAdGroups&quot; target=&quot;_blank&quot;&gt;getAdGroups&lt;/a&gt; method to retrieve ad group IDs.
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
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method retrieves ad groups for the specified campaigns.&lt;br /&gt;&lt;br /&gt;Each campaign can only have &lt;b&gt;one&lt;/b&gt; ad group.&lt;br /&gt;&lt;br /&gt;In the request, supply the &lt;b&gt;campaign_ids&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the current campaign IDs for a seller.
     * @return a {@link AdGroupPagedCollectionResponse}
     */
    @jakarta.annotation.Nullable
    public AdGroupPagedCollectionResponse get() {
        return get(null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method retrieves ad groups for the specified campaigns.&lt;br /&gt;&lt;br /&gt;Each campaign can only have &lt;b&gt;one&lt;/b&gt; ad group.&lt;br /&gt;&lt;br /&gt;In the request, supply the &lt;b&gt;campaign_ids&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the current campaign IDs for a seller.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AdGroupPagedCollectionResponse}
     */
    @jakarta.annotation.Nullable
    public AdGroupPagedCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AdGroupPagedCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method adds an ad group to an existing priority strategy campaign that uses manual targeting.&lt;br /&gt;&lt;br /&gt;To create an ad group for a campaign, specify the &lt;b&gt;defaultBid&lt;/b&gt; for the ad group in the payload of the request. Then specify the campaign to which the ad group should be associated using the &lt;b&gt;campaign_id&lt;/b&gt; path parameter.&lt;br /&gt;&lt;br /&gt;Each campaign can have one or more associated ad groups.
     * @param body A type that defines the fields for the &lt;b&gt;CreateAdGroup&lt;/b&gt; request.
     * @return a {@link AdGroupPostResponse}
     */
    @jakarta.annotation.Nullable
    public AdGroupPostResponse post(@jakarta.annotation.Nonnull final CreateAdGroupRequest body) {
        return post(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method adds an ad group to an existing priority strategy campaign that uses manual targeting.&lt;br /&gt;&lt;br /&gt;To create an ad group for a campaign, specify the &lt;b&gt;defaultBid&lt;/b&gt; for the ad group in the payload of the request. Then specify the campaign to which the ad group should be associated using the &lt;b&gt;campaign_id&lt;/b&gt; path parameter.&lt;br /&gt;&lt;br /&gt;Each campaign can have one or more associated ad groups.
     * @param body A type that defines the fields for the &lt;b&gt;CreateAdGroup&lt;/b&gt; request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AdGroupPostResponse}
     */
    @jakarta.annotation.Nullable
    public AdGroupPostResponse post(@jakarta.annotation.Nonnull final CreateAdGroupRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AdGroupPostResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method retrieves ad groups for the specified campaigns.&lt;br /&gt;&lt;br /&gt;Each campaign can only have &lt;b&gt;one&lt;/b&gt; ad group.&lt;br /&gt;&lt;br /&gt;In the request, supply the &lt;b&gt;campaign_ids&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the current campaign IDs for a seller.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method retrieves ad groups for the specified campaigns.&lt;br /&gt;&lt;br /&gt;Each campaign can only have &lt;b&gt;one&lt;/b&gt; ad group.&lt;br /&gt;&lt;br /&gt;In the request, supply the &lt;b&gt;campaign_ids&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the current campaign IDs for a seller.
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
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method adds an ad group to an existing priority strategy campaign that uses manual targeting.&lt;br /&gt;&lt;br /&gt;To create an ad group for a campaign, specify the &lt;b&gt;defaultBid&lt;/b&gt; for the ad group in the payload of the request. Then specify the campaign to which the ad group should be associated using the &lt;b&gt;campaign_id&lt;/b&gt; path parameter.&lt;br /&gt;&lt;br /&gt;Each campaign can have one or more associated ad groups.
     * @param body A type that defines the fields for the &lt;b&gt;CreateAdGroup&lt;/b&gt; request.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateAdGroupRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method adds an ad group to an existing priority strategy campaign that uses manual targeting.&lt;br /&gt;&lt;br /&gt;To create an ad group for a campaign, specify the &lt;b&gt;defaultBid&lt;/b&gt; for the ad group in the payload of the request. Then specify the campaign to which the ad group should be associated using the &lt;b&gt;campaign_id&lt;/b&gt; path parameter.&lt;br /&gt;&lt;br /&gt;Each campaign can have one or more associated ad groups.
     * @param body A type that defines the fields for the &lt;b&gt;CreateAdGroup&lt;/b&gt; request.
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
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method retrieves ad groups for the specified campaigns.&lt;br /&gt;&lt;br /&gt;Each campaign can only have &lt;b&gt;one&lt;/b&gt; ad group.&lt;br /&gt;&lt;br /&gt;In the request, supply the &lt;b&gt;campaign_ids&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the current campaign IDs for a seller.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * A comma-separated list of ad group statuses. The results will be filtered to only include the given statuses of the ad group.&lt;br&gt;&lt;br&gt; See &lt;a href=&quot;/api-docs/sell/marketing/types/pls:AdGroupStatusEnum&quot; target=&quot;_blank&quot;&gt;AdGroupStatusEnum&lt;/a&gt; for supported values.
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
