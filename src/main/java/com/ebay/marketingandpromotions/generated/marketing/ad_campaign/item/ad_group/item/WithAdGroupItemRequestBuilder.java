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

package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.ad_group.item;

import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.ad_group.item.suggest_bids.SuggestBidsRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.ad_group.item.suggest_keywords.SuggestKeywordsRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.models.AdGroup;
import com.ebay.marketingandpromotions.generated.marketing.models.Error;
import com.ebay.marketingandpromotions.generated.marketing.models.ErrorDetailV3;
import com.ebay.marketingandpromotions.generated.marketing.models.UpdateAdGroupRequest;
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
 * Builds and executes requests for operations under /ad_campaign/{campaign_id}/ad_group/{ad_group_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithAdGroupItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The suggest_bids property
     * @return a {@link SuggestBidsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SuggestBidsRequestBuilder suggestBids() {
        return new SuggestBidsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The suggest_keywords property
     * @return a {@link SuggestKeywordsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SuggestKeywordsRequestBuilder suggestKeywords() {
        return new SuggestKeywordsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithAdGroupItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithAdGroupItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/ad_group/{ad_group_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithAdGroupItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithAdGroupItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/ad_group/{ad_group_id}", rawUrl);
    }
    /**
     * This method retrieves the details of a specified ad group, such as the ad groups default bid and status.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;ad_group_id&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the current campaign IDs for a seller and call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_group-getadgroups&quot;&gt;getAdGroups&lt;/a&gt; for the ad group ID of the ad group you wish to retrieve.
     * @return a {@link AdGroup}
     * @throws Error When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 404 status code
     * @throws ErrorDetailV3 When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public AdGroup get() {
        return get(null);
    }
    /**
     * This method retrieves the details of a specified ad group, such as the ad groups default bid and status.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;ad_group_id&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the current campaign IDs for a seller and call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_group-getadgroups&quot;&gt;getAdGroups&lt;/a&gt; for the ad group ID of the ad group you wish to retrieve.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AdGroup}
     * @throws Error When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 404 status code
     * @throws ErrorDetailV3 When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public AdGroup get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("409", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorDetailV3::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AdGroup::createFromDiscriminatorValue);
    }
    /**
     * This method updates the ad group associated with a campaign.&lt;br /&gt;&lt;br /&gt;With this method, you can modify the &lt;b&gt;default bid&lt;/b&gt; for the ad group, change the state of the ad group, or change the name of the ad group. Pass the &lt;b&gt;ad_group_id&lt;/b&gt; you want to update as a URI parameter, and configure the &lt;b&gt;adGroupStatus&lt;/b&gt; and &lt;b&gt;defaultBid&lt;/b&gt; in the request payload.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_group-getadgroup&quot;&gt;getAdGroup&lt;/a&gt; to retrieve the current default bid and status of the ad group that you would like to update.
     * @param body This type defines the fields for the &lt;b&gt;UpdateAdGroup&lt;/b&gt; request.
     * @throws ErrorDetailV3 When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 404 status code
     * @throws ErrorDetailV3 When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    public void put(@jakarta.annotation.Nonnull final UpdateAdGroupRequest body) {
        put(body, null);
    }
    /**
     * This method updates the ad group associated with a campaign.&lt;br /&gt;&lt;br /&gt;With this method, you can modify the &lt;b&gt;default bid&lt;/b&gt; for the ad group, change the state of the ad group, or change the name of the ad group. Pass the &lt;b&gt;ad_group_id&lt;/b&gt; you want to update as a URI parameter, and configure the &lt;b&gt;adGroupStatus&lt;/b&gt; and &lt;b&gt;defaultBid&lt;/b&gt; in the request payload.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_group-getadgroup&quot;&gt;getAdGroup&lt;/a&gt; to retrieve the current default bid and status of the ad group that you would like to update.
     * @param body This type defines the fields for the &lt;b&gt;UpdateAdGroup&lt;/b&gt; request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ErrorDetailV3 When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 404 status code
     * @throws ErrorDetailV3 When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    public void put(@jakarta.annotation.Nonnull final UpdateAdGroupRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("404", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("409", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorDetailV3::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * This method retrieves the details of a specified ad group, such as the ad groups default bid and status.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;ad_group_id&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the current campaign IDs for a seller and call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_group-getadgroups&quot;&gt;getAdGroups&lt;/a&gt; for the ad group ID of the ad group you wish to retrieve.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves the details of a specified ad group, such as the ad groups default bid and status.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;ad_group_id&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the current campaign IDs for a seller and call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_group-getadgroups&quot;&gt;getAdGroups&lt;/a&gt; for the ad group ID of the ad group you wish to retrieve.
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
     * This method updates the ad group associated with a campaign.&lt;br /&gt;&lt;br /&gt;With this method, you can modify the &lt;b&gt;default bid&lt;/b&gt; for the ad group, change the state of the ad group, or change the name of the ad group. Pass the &lt;b&gt;ad_group_id&lt;/b&gt; you want to update as a URI parameter, and configure the &lt;b&gt;adGroupStatus&lt;/b&gt; and &lt;b&gt;defaultBid&lt;/b&gt; in the request payload.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_group-getadgroup&quot;&gt;getAdGroup&lt;/a&gt; to retrieve the current default bid and status of the ad group that you would like to update.
     * @param body This type defines the fields for the &lt;b&gt;UpdateAdGroup&lt;/b&gt; request.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UpdateAdGroupRequest body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * This method updates the ad group associated with a campaign.&lt;br /&gt;&lt;br /&gt;With this method, you can modify the &lt;b&gt;default bid&lt;/b&gt; for the ad group, change the state of the ad group, or change the name of the ad group. Pass the &lt;b&gt;ad_group_id&lt;/b&gt; you want to update as a URI parameter, and configure the &lt;b&gt;adGroupStatus&lt;/b&gt; and &lt;b&gt;defaultBid&lt;/b&gt; in the request payload.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_group-getadgroup&quot;&gt;getAdGroup&lt;/a&gt; to retrieve the current default bid and status of the ad group that you would like to update.
     * @param body This type defines the fields for the &lt;b&gt;UpdateAdGroup&lt;/b&gt; request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UpdateAdGroupRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithAdGroupItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithAdGroupItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithAdGroupItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
