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

package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.ad;

import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.ad.item.WithAdItemRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.models.AdPagedCollectionResponse;
import com.ebay.marketingandpromotions.generated.marketing.models.CreateAdRequest;
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
 * Builds and executes requests for operations under /ad_campaign/{campaign_id}/ad
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AdRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.ad.item collection
     * @param ad_id This path parameter specifies the unique identifier of the ad being retrieved.&lt;br&gt;&lt;br&gt; Use the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad-getads&quot;&gt;getAds&lt;/a&gt; method to retrieve ad IDs.
     * @return a {@link WithAdItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithAdItemRequestBuilder byAd_id(@jakarta.annotation.Nonnull final String ad_id) {
        Objects.requireNonNull(ad_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("ad_id", ad_id);
        return new WithAdItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link AdRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AdRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/ad{?ad_group_ids*,ad_status*,fieldgroups*,limit*,listing_ids*,offset*}", pathParameters);
    }
    /**
     * Instantiates a new {@link AdRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AdRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/ad{?ad_group_ids*,ad_status*,fieldgroups*,limit*,listing_ids*,offset*}", rawUrl);
    }
    /**
     * This method retrieves Promoted Listings ads that are associated with listings created with either the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/index.html&quot; title=&quot;Trading API Reference&quot; target=&quot;_blank&quot;&gt;Trading API&lt;/a&gt; or the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot; target=&quot;_blank&quot;&gt;Inventory API&lt;/a&gt;. &lt;p&gt;The method retrieves ads related to the specified campaign. Specify the Promoted Listings campaign to target with the &lt;b&gt;campaign_id&lt;/b&gt; path parameter.&lt;/p&gt;  &lt;p&gt;Because of the large number of possible results, you can use query parameters to paginate the result set by specifying a &lt;b&gt;limit&lt;/b&gt;, which dictates how many ads to return on each page of the response. You can also specify how many ads to skip in the result set before returning the first result using the &lt;b&gt;offset&lt;/b&gt; path parameter.&lt;/p&gt;&lt;p&gt;To retrieve video ads preference information for each ad, set the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter to &lt;code&gt;VIDEO&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve the current campaign IDs for the seller.&lt;/p&gt;
     * @return a {@link AdPagedCollectionResponse}
     * @throws ErrorDetailV3 When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 404 status code
     * @throws ErrorDetailV3 When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public AdPagedCollectionResponse get() {
        return get(null);
    }
    /**
     * This method retrieves Promoted Listings ads that are associated with listings created with either the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/index.html&quot; title=&quot;Trading API Reference&quot; target=&quot;_blank&quot;&gt;Trading API&lt;/a&gt; or the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot; target=&quot;_blank&quot;&gt;Inventory API&lt;/a&gt;. &lt;p&gt;The method retrieves ads related to the specified campaign. Specify the Promoted Listings campaign to target with the &lt;b&gt;campaign_id&lt;/b&gt; path parameter.&lt;/p&gt;  &lt;p&gt;Because of the large number of possible results, you can use query parameters to paginate the result set by specifying a &lt;b&gt;limit&lt;/b&gt;, which dictates how many ads to return on each page of the response. You can also specify how many ads to skip in the result set before returning the first result using the &lt;b&gt;offset&lt;/b&gt; path parameter.&lt;/p&gt;&lt;p&gt;To retrieve video ads preference information for each ad, set the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter to &lt;code&gt;VIDEO&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve the current campaign IDs for the seller.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AdPagedCollectionResponse}
     * @throws ErrorDetailV3 When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 404 status code
     * @throws ErrorDetailV3 When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public AdPagedCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("404", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("409", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorDetailV3::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AdPagedCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * This method adds a listing to an existing Promoted Listings campaign using a &lt;b&gt;listingId&lt;/b&gt; value generated by the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/index.html&quot; title=&quot;Trading API Reference&quot; target=&quot;_blank&quot;&gt;Trading API&lt;/a&gt; or &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot; target=&quot;_blank&quot;&gt;Inventory API&lt;/a&gt;, or using a value generated by an ad group ID. &lt;p&gt;For general strategy campaigns using the Cost Per Sale (CPS) funding model, an ad may be directly created for the listing.&lt;/p&gt;&lt;p&gt;For the listing ID specified in the request, this method:&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;Creates an ad for the listing.&lt;/li&gt; &lt;li&gt;Sets the bid percentage (also known as the &lt;i&gt;ad rate&lt;/i&gt;) for the ad.&lt;/li&gt; &lt;li&gt;Associates the ad with the specified campaign.&lt;/li&gt;&lt;/ul&gt;  &lt;p&gt;To create an ad for a listing, specify its &lt;b&gt;listingId&lt;/b&gt;, plus the &lt;b&gt;bidPercentage&lt;/b&gt; for the ad in the payload of the request. Specify the campaign to associate the ad with using the &lt;b&gt;campaign_id&lt;/b&gt; path parameter. Listing IDs are generated by eBay when a seller creates listings with the Trading API.&lt;/p&gt;&lt;p&gt;For manual targeting priority strategy campaigns using the Cost Per Click (CPC) funding model, an ad group must be created first. If no ad group has been created for the campaign, ads cannot be created.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Ad groups are not required when adding listings to a smart targeting campaign.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;For the ad group specified in the request, this method associates the ad with the specified ad group.&lt;/p&gt;&lt;p&gt;To create an ad for an ad group, specify the name of the ad group in the payload of the request. Specify the campaign to associate the ads with using the &lt;b&gt;campaign_id&lt;/b&gt; path parameter. Ad groups are generated using the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_group-createadgroup&quot;&gt;createAdGroup&lt;/a&gt; method.&lt;/p&gt; &lt;p&gt;You can specify one or more ad groups per campaign.&lt;/p&gt;&lt;p&gt;Use &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-createcampaign&quot;&gt;createCampaign&lt;/a&gt; to create a new campaign and use &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to get a list of existing campaigns.&lt;/p&gt;&lt;p&gt;This call has no response payload. If the ad is successfully created, a &lt;code&gt;201 Created&lt;/code&gt; HTTP status code and the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad-getad&quot;&gt;getAd&lt;/a&gt; URI of the ad are returned in the location header.&lt;/p&gt;
     * @param body This request object defines the fields used in the &lt;b&gt;createAdByListingId&lt;/b&gt; request.
     * @return a {@link AdPostResponse}
     * @throws ErrorDetailV3 When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 404 status code
     * @throws ErrorDetailV3 When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public AdPostResponse post(@jakarta.annotation.Nonnull final CreateAdRequest body) {
        return post(body, null);
    }
    /**
     * This method adds a listing to an existing Promoted Listings campaign using a &lt;b&gt;listingId&lt;/b&gt; value generated by the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/index.html&quot; title=&quot;Trading API Reference&quot; target=&quot;_blank&quot;&gt;Trading API&lt;/a&gt; or &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot; target=&quot;_blank&quot;&gt;Inventory API&lt;/a&gt;, or using a value generated by an ad group ID. &lt;p&gt;For general strategy campaigns using the Cost Per Sale (CPS) funding model, an ad may be directly created for the listing.&lt;/p&gt;&lt;p&gt;For the listing ID specified in the request, this method:&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;Creates an ad for the listing.&lt;/li&gt; &lt;li&gt;Sets the bid percentage (also known as the &lt;i&gt;ad rate&lt;/i&gt;) for the ad.&lt;/li&gt; &lt;li&gt;Associates the ad with the specified campaign.&lt;/li&gt;&lt;/ul&gt;  &lt;p&gt;To create an ad for a listing, specify its &lt;b&gt;listingId&lt;/b&gt;, plus the &lt;b&gt;bidPercentage&lt;/b&gt; for the ad in the payload of the request. Specify the campaign to associate the ad with using the &lt;b&gt;campaign_id&lt;/b&gt; path parameter. Listing IDs are generated by eBay when a seller creates listings with the Trading API.&lt;/p&gt;&lt;p&gt;For manual targeting priority strategy campaigns using the Cost Per Click (CPC) funding model, an ad group must be created first. If no ad group has been created for the campaign, ads cannot be created.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Ad groups are not required when adding listings to a smart targeting campaign.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;For the ad group specified in the request, this method associates the ad with the specified ad group.&lt;/p&gt;&lt;p&gt;To create an ad for an ad group, specify the name of the ad group in the payload of the request. Specify the campaign to associate the ads with using the &lt;b&gt;campaign_id&lt;/b&gt; path parameter. Ad groups are generated using the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_group-createadgroup&quot;&gt;createAdGroup&lt;/a&gt; method.&lt;/p&gt; &lt;p&gt;You can specify one or more ad groups per campaign.&lt;/p&gt;&lt;p&gt;Use &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-createcampaign&quot;&gt;createCampaign&lt;/a&gt; to create a new campaign and use &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to get a list of existing campaigns.&lt;/p&gt;&lt;p&gt;This call has no response payload. If the ad is successfully created, a &lt;code&gt;201 Created&lt;/code&gt; HTTP status code and the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad-getad&quot;&gt;getAd&lt;/a&gt; URI of the ad are returned in the location header.&lt;/p&gt;
     * @param body This request object defines the fields used in the &lt;b&gt;createAdByListingId&lt;/b&gt; request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AdPostResponse}
     * @throws ErrorDetailV3 When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 404 status code
     * @throws ErrorDetailV3 When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public AdPostResponse post(@jakarta.annotation.Nonnull final CreateAdRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("404", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("409", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorDetailV3::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AdPostResponse::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves Promoted Listings ads that are associated with listings created with either the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/index.html&quot; title=&quot;Trading API Reference&quot; target=&quot;_blank&quot;&gt;Trading API&lt;/a&gt; or the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot; target=&quot;_blank&quot;&gt;Inventory API&lt;/a&gt;. &lt;p&gt;The method retrieves ads related to the specified campaign. Specify the Promoted Listings campaign to target with the &lt;b&gt;campaign_id&lt;/b&gt; path parameter.&lt;/p&gt;  &lt;p&gt;Because of the large number of possible results, you can use query parameters to paginate the result set by specifying a &lt;b&gt;limit&lt;/b&gt;, which dictates how many ads to return on each page of the response. You can also specify how many ads to skip in the result set before returning the first result using the &lt;b&gt;offset&lt;/b&gt; path parameter.&lt;/p&gt;&lt;p&gt;To retrieve video ads preference information for each ad, set the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter to &lt;code&gt;VIDEO&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve the current campaign IDs for the seller.&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves Promoted Listings ads that are associated with listings created with either the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/index.html&quot; title=&quot;Trading API Reference&quot; target=&quot;_blank&quot;&gt;Trading API&lt;/a&gt; or the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot; target=&quot;_blank&quot;&gt;Inventory API&lt;/a&gt;. &lt;p&gt;The method retrieves ads related to the specified campaign. Specify the Promoted Listings campaign to target with the &lt;b&gt;campaign_id&lt;/b&gt; path parameter.&lt;/p&gt;  &lt;p&gt;Because of the large number of possible results, you can use query parameters to paginate the result set by specifying a &lt;b&gt;limit&lt;/b&gt;, which dictates how many ads to return on each page of the response. You can also specify how many ads to skip in the result set before returning the first result using the &lt;b&gt;offset&lt;/b&gt; path parameter.&lt;/p&gt;&lt;p&gt;To retrieve video ads preference information for each ad, set the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter to &lt;code&gt;VIDEO&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve the current campaign IDs for the seller.&lt;/p&gt;
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
     * This method adds a listing to an existing Promoted Listings campaign using a &lt;b&gt;listingId&lt;/b&gt; value generated by the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/index.html&quot; title=&quot;Trading API Reference&quot; target=&quot;_blank&quot;&gt;Trading API&lt;/a&gt; or &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot; target=&quot;_blank&quot;&gt;Inventory API&lt;/a&gt;, or using a value generated by an ad group ID. &lt;p&gt;For general strategy campaigns using the Cost Per Sale (CPS) funding model, an ad may be directly created for the listing.&lt;/p&gt;&lt;p&gt;For the listing ID specified in the request, this method:&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;Creates an ad for the listing.&lt;/li&gt; &lt;li&gt;Sets the bid percentage (also known as the &lt;i&gt;ad rate&lt;/i&gt;) for the ad.&lt;/li&gt; &lt;li&gt;Associates the ad with the specified campaign.&lt;/li&gt;&lt;/ul&gt;  &lt;p&gt;To create an ad for a listing, specify its &lt;b&gt;listingId&lt;/b&gt;, plus the &lt;b&gt;bidPercentage&lt;/b&gt; for the ad in the payload of the request. Specify the campaign to associate the ad with using the &lt;b&gt;campaign_id&lt;/b&gt; path parameter. Listing IDs are generated by eBay when a seller creates listings with the Trading API.&lt;/p&gt;&lt;p&gt;For manual targeting priority strategy campaigns using the Cost Per Click (CPC) funding model, an ad group must be created first. If no ad group has been created for the campaign, ads cannot be created.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Ad groups are not required when adding listings to a smart targeting campaign.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;For the ad group specified in the request, this method associates the ad with the specified ad group.&lt;/p&gt;&lt;p&gt;To create an ad for an ad group, specify the name of the ad group in the payload of the request. Specify the campaign to associate the ads with using the &lt;b&gt;campaign_id&lt;/b&gt; path parameter. Ad groups are generated using the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_group-createadgroup&quot;&gt;createAdGroup&lt;/a&gt; method.&lt;/p&gt; &lt;p&gt;You can specify one or more ad groups per campaign.&lt;/p&gt;&lt;p&gt;Use &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-createcampaign&quot;&gt;createCampaign&lt;/a&gt; to create a new campaign and use &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to get a list of existing campaigns.&lt;/p&gt;&lt;p&gt;This call has no response payload. If the ad is successfully created, a &lt;code&gt;201 Created&lt;/code&gt; HTTP status code and the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad-getad&quot;&gt;getAd&lt;/a&gt; URI of the ad are returned in the location header.&lt;/p&gt;
     * @param body This request object defines the fields used in the &lt;b&gt;createAdByListingId&lt;/b&gt; request.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateAdRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method adds a listing to an existing Promoted Listings campaign using a &lt;b&gt;listingId&lt;/b&gt; value generated by the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/index.html&quot; title=&quot;Trading API Reference&quot; target=&quot;_blank&quot;&gt;Trading API&lt;/a&gt; or &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot; target=&quot;_blank&quot;&gt;Inventory API&lt;/a&gt;, or using a value generated by an ad group ID. &lt;p&gt;For general strategy campaigns using the Cost Per Sale (CPS) funding model, an ad may be directly created for the listing.&lt;/p&gt;&lt;p&gt;For the listing ID specified in the request, this method:&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;Creates an ad for the listing.&lt;/li&gt; &lt;li&gt;Sets the bid percentage (also known as the &lt;i&gt;ad rate&lt;/i&gt;) for the ad.&lt;/li&gt; &lt;li&gt;Associates the ad with the specified campaign.&lt;/li&gt;&lt;/ul&gt;  &lt;p&gt;To create an ad for a listing, specify its &lt;b&gt;listingId&lt;/b&gt;, plus the &lt;b&gt;bidPercentage&lt;/b&gt; for the ad in the payload of the request. Specify the campaign to associate the ad with using the &lt;b&gt;campaign_id&lt;/b&gt; path parameter. Listing IDs are generated by eBay when a seller creates listings with the Trading API.&lt;/p&gt;&lt;p&gt;For manual targeting priority strategy campaigns using the Cost Per Click (CPC) funding model, an ad group must be created first. If no ad group has been created for the campaign, ads cannot be created.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Ad groups are not required when adding listings to a smart targeting campaign.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;For the ad group specified in the request, this method associates the ad with the specified ad group.&lt;/p&gt;&lt;p&gt;To create an ad for an ad group, specify the name of the ad group in the payload of the request. Specify the campaign to associate the ads with using the &lt;b&gt;campaign_id&lt;/b&gt; path parameter. Ad groups are generated using the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_group-createadgroup&quot;&gt;createAdGroup&lt;/a&gt; method.&lt;/p&gt; &lt;p&gt;You can specify one or more ad groups per campaign.&lt;/p&gt;&lt;p&gt;Use &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-createcampaign&quot;&gt;createCampaign&lt;/a&gt; to create a new campaign and use &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to get a list of existing campaigns.&lt;/p&gt;&lt;p&gt;This call has no response payload. If the ad is successfully created, a &lt;code&gt;201 Created&lt;/code&gt; HTTP status code and the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad-getad&quot;&gt;getAd&lt;/a&gt; URI of the ad are returned in the location header.&lt;/p&gt;
     * @param body This request object defines the fields used in the &lt;b&gt;createAdByListingId&lt;/b&gt; request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateAdRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link AdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AdRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AdRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method retrieves Promoted Listings ads that are associated with listings created with either the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/index.html&quot; title=&quot;Trading API Reference&quot; target=&quot;_blank&quot;&gt;Trading API&lt;/a&gt; or the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot; target=&quot;_blank&quot;&gt;Inventory API&lt;/a&gt;. &lt;p&gt;The method retrieves ads related to the specified campaign. Specify the Promoted Listings campaign to target with the &lt;b&gt;campaign_id&lt;/b&gt; path parameter.&lt;/p&gt;  &lt;p&gt;Because of the large number of possible results, you can use query parameters to paginate the result set by specifying a &lt;b&gt;limit&lt;/b&gt;, which dictates how many ads to return on each page of the response. You can also specify how many ads to skip in the result set before returning the first result using the &lt;b&gt;offset&lt;/b&gt; path parameter.&lt;/p&gt;&lt;p&gt;To retrieve video ads preference information for each ad, set the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter to &lt;code&gt;VIDEO&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve the current campaign IDs for the seller.&lt;/p&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * A comma-separated list of ad group IDs. The results will be filtered to only include active ads for these ad groups.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_group-getadgroups&quot;&gt;getAdGroups&lt;/a&gt; method to retrieve the ad group ID for the ad group.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field only applies to the Cost Per Click (CPC) funding model; it does not apply to the Cost Per Sale (CPS) funding model.&lt;/span&gt;
         */
        @jakarta.annotation.Nullable
        public String adGroupIds;
        /**
         * A comma-separated list of ad statuses. The results will be filtered to only include the given statuses of the ad. If none are provided, all ads are returned.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad-getads.adstatusenum&quot;&gt;AdStatusEnum&lt;/a&gt; for supported values.
         */
        @jakarta.annotation.Nullable
        public GetAdStatusQueryParameterType adStatus;
        /**
         * A comma-separated list of values that controls what is returned in the response. If not provided, standard ad fields are returned. &lt;ul&gt;&lt;li&gt;&lt;b&gt;DEFAULT&lt;/b&gt;: Returns the standard ad fields. The &lt;b&gt;videoAdsPreferences&lt;/b&gt; container is not included in the response.&lt;/li&gt;&lt;li&gt;&lt;b&gt;VIDEO&lt;/b&gt;: Adds the &lt;b&gt;videoAdsPreferences&lt;/b&gt; container to the response, including video ads preferences for each ad.&lt;/li&gt;&lt;/ul&gt;
         */
        @jakarta.annotation.Nullable
        public GetFieldgroupsQueryParameterType fieldgroups;
        /**
         * Specifies the maximum number of ads to return on a page in the paginated response.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default: &lt;/b&gt;10 &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 500
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * A comma-separated list of listing IDs. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The response includes only active ads. The results do not include listing IDs that are excluded by other conditions.&lt;/span&gt;
         */
        @jakarta.annotation.Nullable
        public String listingIds;
        /**
         * Specifies the number of ads to skip in the result set before returning the first ad in the paginated response.  &lt;p&gt;Combine &lt;b&gt;offset&lt;/b&gt; with the &lt;b&gt;limit&lt;/b&gt; query parameter to control the items returned in the response. For example, if you supply an &lt;b&gt;offset&lt;/b&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;b&gt;limit&lt;/b&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If &lt;b&gt;offset&lt;/b&gt; is &lt;code&gt;10&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is &lt;code&gt;20&lt;/code&gt;, the first page of the response contains items 11-30 from the complete result set.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Default:&lt;/b&gt; 0&lt;/p&gt;
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
            allQueryParams.put("ad_status", adStatus);
            allQueryParams.put("fieldgroups", fieldgroups);
            allQueryParams.put("ad_group_ids", adGroupIds);
            allQueryParams.put("limit", limit);
            allQueryParams.put("listing_ids", listingIds);
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
