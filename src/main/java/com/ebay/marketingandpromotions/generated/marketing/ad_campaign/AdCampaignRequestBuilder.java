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

package com.ebay.marketingandpromotions.generated.marketing.ad_campaign;

import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.find_campaign_by_ad_reference.FindCampaignByAdReferenceRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.get_campaign_by_name.GetCampaignByNameRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.WithCampaignItemRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.suggest_budget.SuggestBudgetRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.suggest_max_cpc.SuggestMaxCpcRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.models.CampaignPagedCollectionResponse;
import com.ebay.marketingandpromotions.generated.marketing.models.CreateCampaignRequest;
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
 * Builds and executes requests for operations under /ad_campaign
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AdCampaignRequestBuilder extends BaseRequestBuilder {
    /**
     * The find_campaign_by_ad_reference property
     * @return a {@link FindCampaignByAdReferenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FindCampaignByAdReferenceRequestBuilder findCampaignByAdReference() {
        return new FindCampaignByAdReferenceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_campaign_by_name property
     * @return a {@link GetCampaignByNameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetCampaignByNameRequestBuilder getCampaignByName() {
        return new GetCampaignByNameRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The suggest_budget property
     * @return a {@link SuggestBudgetRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SuggestBudgetRequestBuilder suggestBudget() {
        return new SuggestBudgetRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The suggest_max_cpc property
     * @return a {@link SuggestMaxCpcRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SuggestMaxCpcRequestBuilder suggestMaxCpc() {
        return new SuggestMaxCpcRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item collection
     * @param campaign_id This path parameter specifies the unique eBay-assigned identifier of the ad campaign being retrieved.&lt;br&gt;&lt;br&gt; Use the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve campaign IDs.
     * @return a {@link WithCampaignItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithCampaignItemRequestBuilder byCampaign_id(@jakarta.annotation.Nonnull final String campaign_id) {
        Objects.requireNonNull(campaign_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("campaign_id", campaign_id);
        return new WithCampaignItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link AdCampaignRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AdCampaignRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign{?campaign_name*,campaign_status*,campaign_targeting_types*,channels*,end_date_range*,funding_strategy*,limit*,marketplace_id*,offset*,start_date_range*}", pathParameters);
    }
    /**
     * Instantiates a new {@link AdCampaignRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AdCampaignRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign{?campaign_name*,campaign_status*,campaign_targeting_types*,channels*,end_date_range*,funding_strategy*,limit*,marketplace_id*,offset*,start_date_range*}", rawUrl);
    }
    /**
     * This method retrieves the details for all of the seller&apos;s defined campaigns. Request parameters can be used to retrieve a specific campaign, such as the campaign&apos;s name, the start and end date, the channel, the status, and the funding model (i.e., Cost Per Sale (CPS) or Cost Per Click (CPC)). &lt;p&gt;You can filter the result set by a campaign name, end date range, start date range, campaign channel, or campaign status. You can also paginate the records returned from the result set using the &lt;b&gt;limit&lt;/b&gt; query parameter, and control which records to return using the  &lt;b&gt;offset&lt;/b&gt; parameter.&lt;/p&gt;
     * @return a {@link CampaignPagedCollectionResponse}
     * @throws ErrorDetailV3 When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public CampaignPagedCollectionResponse get() {
        return get(null);
    }
    /**
     * This method retrieves the details for all of the seller&apos;s defined campaigns. Request parameters can be used to retrieve a specific campaign, such as the campaign&apos;s name, the start and end date, the channel, the status, and the funding model (i.e., Cost Per Sale (CPS) or Cost Per Click (CPC)). &lt;p&gt;You can filter the result set by a campaign name, end date range, start date range, campaign channel, or campaign status. You can also paginate the records returned from the result set using the &lt;b&gt;limit&lt;/b&gt; query parameter, and control which records to return using the  &lt;b&gt;offset&lt;/b&gt; parameter.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CampaignPagedCollectionResponse}
     * @throws ErrorDetailV3 When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public CampaignPagedCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("409", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorDetailV3::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CampaignPagedCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * This method can be used to create a Promoted Listings general, priority, or offsite campaign.&lt;br&gt;&lt;br&gt;A Promoted Listings &lt;i&gt;campaign&lt;/i&gt; is the structure in which you place the ads or ad group for the listings you wish to promote.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Campaigns can only contain ads for a maximum of 50,000 items.&lt;/span&gt;&lt;br&gt;General strategy campaigns utilize a Cost Per Sale (CPS) funding model. Sellers can set the ad rate and bidding strategies that are right for their business through the &lt;b&gt;adRateStrategy&lt;/b&gt;, &lt;b&gt;biddingStrategy&lt;/b&gt;, &lt;b&gt;bidPercentage&lt;/b&gt; fields. For more information on general strategy campaigns, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-campaign-flow-pls.html&quot; target=&quot;_blank &quot;&gt;Promoted Listings general strategy campaign flow&lt;/a&gt;.&lt;br&gt;&lt;br&gt;Priority strategy campaigns utilize a Cost per Click (CPC) funding model. Sellers can create a daily budget through the &lt;b&gt;budget&lt;/b&gt; container and choose what &lt;b&gt;channel&lt;/b&gt; that their ads appear on. In addition, priority strategy campaigns give sellers the ability to create ad groups and specify keywords to ensure their ads reach their intended audience. For more information on priority strategy campaigns, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-campaign-flow-pla.html&quot; target=&quot;_blank &quot;&gt;Promoted listings priority strategy campaign flow&lt;/a&gt;.&lt;br&gt;&lt;br&gt;Promoted Offsite campaigns give sellers the ability to create their own advertising campaign and promote their eBay listing in leading external search channels. For more information on Promoted Offsite campaigns, see &lt;a href=&quot;/api-docs/sell/static/marketing/offsite-ads.html&quot; target=&quot;_blank &quot;&gt;Promoted Offsite&lt;/a&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sellers can use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility&quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method of the &lt;a href=&quot;/api-docs/sell/account/overview.html&quot; target=&quot;_blank &quot;&gt;Account API v1&lt;/a&gt; to determine their eligibility status for eBay advertising programs.&lt;/span&gt;&lt;br&gt;To create a basic campaign, supply: &lt;ul&gt;&lt;li&gt;The user-defined campaign name&lt;/li&gt; &lt;li&gt;The start date (and optionally the end date) of the campaign&lt;/li&gt; &lt;li&gt;The eBay marketplace on which the campaign is hosted&lt;/li&gt; &lt;li&gt;Details on the campaign funding model&lt;/li&gt;&lt;/ul&gt;For details on creating Promoted Listings campaigns and how to select the items to be included in your campaigns, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-create-campaign.html&quot; target=&quot;_blank&quot;&gt;Promoted Listings campaign creation&lt;/a&gt;.
     * @param body This type defines the fields for the create campaign request.
     * @return a {@link AdCampaignPostResponse}
     * @throws ErrorDetailV3 When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public AdCampaignPostResponse post(@jakarta.annotation.Nonnull final CreateCampaignRequest body) {
        return post(body, null);
    }
    /**
     * This method can be used to create a Promoted Listings general, priority, or offsite campaign.&lt;br&gt;&lt;br&gt;A Promoted Listings &lt;i&gt;campaign&lt;/i&gt; is the structure in which you place the ads or ad group for the listings you wish to promote.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Campaigns can only contain ads for a maximum of 50,000 items.&lt;/span&gt;&lt;br&gt;General strategy campaigns utilize a Cost Per Sale (CPS) funding model. Sellers can set the ad rate and bidding strategies that are right for their business through the &lt;b&gt;adRateStrategy&lt;/b&gt;, &lt;b&gt;biddingStrategy&lt;/b&gt;, &lt;b&gt;bidPercentage&lt;/b&gt; fields. For more information on general strategy campaigns, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-campaign-flow-pls.html&quot; target=&quot;_blank &quot;&gt;Promoted Listings general strategy campaign flow&lt;/a&gt;.&lt;br&gt;&lt;br&gt;Priority strategy campaigns utilize a Cost per Click (CPC) funding model. Sellers can create a daily budget through the &lt;b&gt;budget&lt;/b&gt; container and choose what &lt;b&gt;channel&lt;/b&gt; that their ads appear on. In addition, priority strategy campaigns give sellers the ability to create ad groups and specify keywords to ensure their ads reach their intended audience. For more information on priority strategy campaigns, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-campaign-flow-pla.html&quot; target=&quot;_blank &quot;&gt;Promoted listings priority strategy campaign flow&lt;/a&gt;.&lt;br&gt;&lt;br&gt;Promoted Offsite campaigns give sellers the ability to create their own advertising campaign and promote their eBay listing in leading external search channels. For more information on Promoted Offsite campaigns, see &lt;a href=&quot;/api-docs/sell/static/marketing/offsite-ads.html&quot; target=&quot;_blank &quot;&gt;Promoted Offsite&lt;/a&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sellers can use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility&quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method of the &lt;a href=&quot;/api-docs/sell/account/overview.html&quot; target=&quot;_blank &quot;&gt;Account API v1&lt;/a&gt; to determine their eligibility status for eBay advertising programs.&lt;/span&gt;&lt;br&gt;To create a basic campaign, supply: &lt;ul&gt;&lt;li&gt;The user-defined campaign name&lt;/li&gt; &lt;li&gt;The start date (and optionally the end date) of the campaign&lt;/li&gt; &lt;li&gt;The eBay marketplace on which the campaign is hosted&lt;/li&gt; &lt;li&gt;Details on the campaign funding model&lt;/li&gt;&lt;/ul&gt;For details on creating Promoted Listings campaigns and how to select the items to be included in your campaigns, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-create-campaign.html&quot; target=&quot;_blank&quot;&gt;Promoted Listings campaign creation&lt;/a&gt;.
     * @param body This type defines the fields for the create campaign request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AdCampaignPostResponse}
     * @throws ErrorDetailV3 When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public AdCampaignPostResponse post(@jakarta.annotation.Nonnull final CreateCampaignRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("409", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorDetailV3::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AdCampaignPostResponse::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves the details for all of the seller&apos;s defined campaigns. Request parameters can be used to retrieve a specific campaign, such as the campaign&apos;s name, the start and end date, the channel, the status, and the funding model (i.e., Cost Per Sale (CPS) or Cost Per Click (CPC)). &lt;p&gt;You can filter the result set by a campaign name, end date range, start date range, campaign channel, or campaign status. You can also paginate the records returned from the result set using the &lt;b&gt;limit&lt;/b&gt; query parameter, and control which records to return using the  &lt;b&gt;offset&lt;/b&gt; parameter.&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves the details for all of the seller&apos;s defined campaigns. Request parameters can be used to retrieve a specific campaign, such as the campaign&apos;s name, the start and end date, the channel, the status, and the funding model (i.e., Cost Per Sale (CPS) or Cost Per Click (CPC)). &lt;p&gt;You can filter the result set by a campaign name, end date range, start date range, campaign channel, or campaign status. You can also paginate the records returned from the result set using the &lt;b&gt;limit&lt;/b&gt; query parameter, and control which records to return using the  &lt;b&gt;offset&lt;/b&gt; parameter.&lt;/p&gt;
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
     * This method can be used to create a Promoted Listings general, priority, or offsite campaign.&lt;br&gt;&lt;br&gt;A Promoted Listings &lt;i&gt;campaign&lt;/i&gt; is the structure in which you place the ads or ad group for the listings you wish to promote.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Campaigns can only contain ads for a maximum of 50,000 items.&lt;/span&gt;&lt;br&gt;General strategy campaigns utilize a Cost Per Sale (CPS) funding model. Sellers can set the ad rate and bidding strategies that are right for their business through the &lt;b&gt;adRateStrategy&lt;/b&gt;, &lt;b&gt;biddingStrategy&lt;/b&gt;, &lt;b&gt;bidPercentage&lt;/b&gt; fields. For more information on general strategy campaigns, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-campaign-flow-pls.html&quot; target=&quot;_blank &quot;&gt;Promoted Listings general strategy campaign flow&lt;/a&gt;.&lt;br&gt;&lt;br&gt;Priority strategy campaigns utilize a Cost per Click (CPC) funding model. Sellers can create a daily budget through the &lt;b&gt;budget&lt;/b&gt; container and choose what &lt;b&gt;channel&lt;/b&gt; that their ads appear on. In addition, priority strategy campaigns give sellers the ability to create ad groups and specify keywords to ensure their ads reach their intended audience. For more information on priority strategy campaigns, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-campaign-flow-pla.html&quot; target=&quot;_blank &quot;&gt;Promoted listings priority strategy campaign flow&lt;/a&gt;.&lt;br&gt;&lt;br&gt;Promoted Offsite campaigns give sellers the ability to create their own advertising campaign and promote their eBay listing in leading external search channels. For more information on Promoted Offsite campaigns, see &lt;a href=&quot;/api-docs/sell/static/marketing/offsite-ads.html&quot; target=&quot;_blank &quot;&gt;Promoted Offsite&lt;/a&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sellers can use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility&quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method of the &lt;a href=&quot;/api-docs/sell/account/overview.html&quot; target=&quot;_blank &quot;&gt;Account API v1&lt;/a&gt; to determine their eligibility status for eBay advertising programs.&lt;/span&gt;&lt;br&gt;To create a basic campaign, supply: &lt;ul&gt;&lt;li&gt;The user-defined campaign name&lt;/li&gt; &lt;li&gt;The start date (and optionally the end date) of the campaign&lt;/li&gt; &lt;li&gt;The eBay marketplace on which the campaign is hosted&lt;/li&gt; &lt;li&gt;Details on the campaign funding model&lt;/li&gt;&lt;/ul&gt;For details on creating Promoted Listings campaigns and how to select the items to be included in your campaigns, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-create-campaign.html&quot; target=&quot;_blank&quot;&gt;Promoted Listings campaign creation&lt;/a&gt;.
     * @param body This type defines the fields for the create campaign request.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateCampaignRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method can be used to create a Promoted Listings general, priority, or offsite campaign.&lt;br&gt;&lt;br&gt;A Promoted Listings &lt;i&gt;campaign&lt;/i&gt; is the structure in which you place the ads or ad group for the listings you wish to promote.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Campaigns can only contain ads for a maximum of 50,000 items.&lt;/span&gt;&lt;br&gt;General strategy campaigns utilize a Cost Per Sale (CPS) funding model. Sellers can set the ad rate and bidding strategies that are right for their business through the &lt;b&gt;adRateStrategy&lt;/b&gt;, &lt;b&gt;biddingStrategy&lt;/b&gt;, &lt;b&gt;bidPercentage&lt;/b&gt; fields. For more information on general strategy campaigns, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-campaign-flow-pls.html&quot; target=&quot;_blank &quot;&gt;Promoted Listings general strategy campaign flow&lt;/a&gt;.&lt;br&gt;&lt;br&gt;Priority strategy campaigns utilize a Cost per Click (CPC) funding model. Sellers can create a daily budget through the &lt;b&gt;budget&lt;/b&gt; container and choose what &lt;b&gt;channel&lt;/b&gt; that their ads appear on. In addition, priority strategy campaigns give sellers the ability to create ad groups and specify keywords to ensure their ads reach their intended audience. For more information on priority strategy campaigns, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-campaign-flow-pla.html&quot; target=&quot;_blank &quot;&gt;Promoted listings priority strategy campaign flow&lt;/a&gt;.&lt;br&gt;&lt;br&gt;Promoted Offsite campaigns give sellers the ability to create their own advertising campaign and promote their eBay listing in leading external search channels. For more information on Promoted Offsite campaigns, see &lt;a href=&quot;/api-docs/sell/static/marketing/offsite-ads.html&quot; target=&quot;_blank &quot;&gt;Promoted Offsite&lt;/a&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sellers can use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility&quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method of the &lt;a href=&quot;/api-docs/sell/account/overview.html&quot; target=&quot;_blank &quot;&gt;Account API v1&lt;/a&gt; to determine their eligibility status for eBay advertising programs.&lt;/span&gt;&lt;br&gt;To create a basic campaign, supply: &lt;ul&gt;&lt;li&gt;The user-defined campaign name&lt;/li&gt; &lt;li&gt;The start date (and optionally the end date) of the campaign&lt;/li&gt; &lt;li&gt;The eBay marketplace on which the campaign is hosted&lt;/li&gt; &lt;li&gt;Details on the campaign funding model&lt;/li&gt;&lt;/ul&gt;For details on creating Promoted Listings campaigns and how to select the items to be included in your campaigns, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-create-campaign.html&quot; target=&quot;_blank&quot;&gt;Promoted Listings campaign creation&lt;/a&gt;.
     * @param body This type defines the fields for the create campaign request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateCampaignRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link AdCampaignRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AdCampaignRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AdCampaignRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method retrieves the details for all of the seller&apos;s defined campaigns. Request parameters can be used to retrieve a specific campaign, such as the campaign&apos;s name, the start and end date, the channel, the status, and the funding model (i.e., Cost Per Sale (CPS) or Cost Per Click (CPC)). &lt;p&gt;You can filter the result set by a campaign name, end date range, start date range, campaign channel, or campaign status. You can also paginate the records returned from the result set using the &lt;b&gt;limit&lt;/b&gt; query parameter, and control which records to return using the  &lt;b&gt;offset&lt;/b&gt; parameter.&lt;/p&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This query parameter specifies the name of the campaign being retrieved. The results are filtered to include only the campaign by the specified name.&lt;br&gt;&lt;br&gt; Use the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of a seller&apos;s campaign names.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Note: &lt;/b&gt;The results might be null if other filters exclude the campaign with this name. &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum: &lt;/b&gt; 1 campaign name
         */
        @jakarta.annotation.Nullable
        public String campaignName;
        /**
         * This query parameter specifies the status of the campaign(s) being retrieved.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The results might not include all the campaigns with this status if other filters exclude them.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt; See &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns.campaignstatusenum&quot;&gt;CampaignStatusEnum&lt;/a&gt; &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum: &lt;/b&gt; 1 status
         */
        @jakarta.annotation.Nullable
        public GetCampaignStatusQueryParameterType campaignStatus;
        /**
         * This query parameter specifies the targeting type of the campaign(s) to be retrieved.&lt;br&gt;&lt;br&gt;The results will be filtered to only include campaigns with the specified targeting type. If not specified, all campaigns matching other filter parameters will be returned. The results might not include these campaigns if other search conditions exclude them.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt; See &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns.campaigntargetingtypeenum&quot;&gt;CampaignTargetingTypeEnum&lt;/a&gt;
         */
        @jakarta.annotation.Nullable
        public GetCampaignTargetingTypesQueryParameterType campaignTargetingTypes;
        /**
         * This query parameter specifies the channel for the campaign(s) being retrieved.&lt;br&gt;&lt;br&gt;The results will be filtered to only include campaigns with the specified channel. If not specified, all campaigns matching other filter parameters will be returned. The results might not include these campaigns if other search conditions exclude them.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt; See &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns.channelenum&quot;&gt;ChannelEnum&lt;/a&gt;
         */
        @jakarta.annotation.Nullable
        public GetChannelsQueryParameterType channels;
        /**
         * This query parameter specifies the range of a campaign&apos;s end date. The results are filtered to include only campaigns with an end date that is within specified range. &lt;br&gt;&lt;br&gt;&lt;b&gt;Valid format (UTC)&lt;/b&gt;: &lt;ul&gt;&lt;li&gt;&lt;code&gt; yyyy-MM-ddThh:mm:ssZ..yyyy-MM-ddThh:mm:ssZ &lt;/code&gt;  (campaign ends within this range)&lt;/li&gt;&lt;li&gt;&lt;code&gt;yyyy-MM-ddThh:mm:ssZ..&lt;/code&gt; (campaign ends on or after this date)&lt;/li&gt;&lt;li&gt;&lt;code&gt;..yyyy-MM-ddThh:mm:ssZ &lt;/code&gt; (campaign ends on or before this date)&lt;/li&gt;&lt;li&gt;&lt;code&gt;2016-09-08T00:00.00.000Z..2016-09-09T00:00:00Z&lt;/code&gt; (campaign ends on September 08, 2016)&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt;The results might not include all the campaigns ending on this date if other filters exclude them.&lt;/span&gt;
         */
        @jakarta.annotation.Nullable
        public String endDateRange;
        /**
         * This query parameter specifies the funding strategy for the campaign(s) being retrieved.&lt;br /&gt;&lt;br /&gt;The results will be filtered to only include campaigns with the specified funding model. If not specified, all campaigns matching the other filter parameters will be returned. The results might not include these campaigns if other search conditions exclude them.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt; See &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_report_task-getreporttasks.fundingmodelenum&quot;&gt;FundingModelEnum&lt;/a&gt;
         */
        @jakarta.annotation.Nullable
        public GetFundingStrategyQueryParameterType fundingStrategy;
        /**
         * &lt;p&gt;This query parameter specifies the maximum number of campaigns to return on a page in the paginated response.&lt;/p&gt;  &lt;b&gt;Default: &lt;/b&gt;10&lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum: &lt;/b&gt; 500
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * This parameter specifies the eBay marketplace ID of the site for which you want to retrieve campaigns.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/develop/api/sell/request_headers#marketplace-id-values&quot; target=&quot;_blank&quot;&gt;Marketplace ID values&lt;/a&gt; for supported Marketplace ID values.
         */
        @jakarta.annotation.Nullable
        public String marketplaceId;
        /**
         * This query parameter specifies the number of campaigns to skip in the result set before returning the first report in the paginated response.&lt;br&gt;&lt;br&gt;Combine &lt;b&gt;offset&lt;/b&gt; with the &lt;b&gt;limit&lt;/b&gt; query parameter to control the items returned in the response. For example, if you supply an &lt;b&gt;offset&lt;/b&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;b&gt;limit&lt;/b&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If &lt;b&gt;offset&lt;/b&gt; is &lt;code&gt;10&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is &lt;code&gt;20&lt;/code&gt;, the first page of the response contains items 11-30 from the complete result set.&lt;br&gt;&lt;br&gt; &lt;b&gt;Default:&lt;/b&gt; 0
         */
        @jakarta.annotation.Nullable
        public String offset;
        /**
         * This query parameter specifies the range of a campaign&apos;s start date in which to filter the results. The results are filtered to include only campaigns with a start date that is equal to this date or is within specified range.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid format (UTC): &lt;/b&gt; &lt;ul&gt;&lt;li&gt;&lt;code&gt;yyyy-MM-ddThh:mm:ssZ..yyyy-MM-ddThh:mm:ssZ&lt;/code&gt; (starts within this range)&lt;/li&gt;&lt;li&gt;&lt;code&gt;yyyy-MM-ddThh:mm:ssZ&lt;/code&gt; (campaign starts on or after this date)&lt;/li&gt;&lt;li&gt;&lt;code&gt;..yyyy-MM-ddThh:mm:ssZ &lt;/code&gt;(campaign starts on or before this date)&lt;/li&gt;&lt;li&gt;&lt;code&gt;2016-09-08T00:00.00.000Z..2016-09-09T00:00:00Z&lt;/code&gt; (campaign starts on September 08, 2016)&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The results might not include all the campaigns with this start date if other filters exclude them.&lt;/span&gt;
         */
        @jakarta.annotation.Nullable
        public String startDateRange;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("campaign_status", campaignStatus);
            allQueryParams.put("campaign_targeting_types", campaignTargetingTypes);
            allQueryParams.put("channels", channels);
            allQueryParams.put("funding_strategy", fundingStrategy);
            allQueryParams.put("campaign_name", campaignName);
            allQueryParams.put("end_date_range", endDateRange);
            allQueryParams.put("limit", limit);
            allQueryParams.put("marketplace_id", marketplaceId);
            allQueryParams.put("offset", offset);
            allQueryParams.put("start_date_range", startDateRange);
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
