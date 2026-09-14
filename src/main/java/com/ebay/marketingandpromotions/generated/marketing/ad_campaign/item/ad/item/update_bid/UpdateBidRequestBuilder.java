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

package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.ad.item.update_bid;

import com.ebay.marketingandpromotions.generated.marketing.models.ErrorDetailV3;
import com.ebay.marketingandpromotions.generated.marketing.models.UpdateBidPercentageRequest;
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
 * Builds and executes requests for operations under /ad_campaign/{campaign_id}/ad/{ad_id}/update_bid
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateBidRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link UpdateBidRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdateBidRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/ad/{ad_id}/update_bid", pathParameters);
    }
    /**
     * Instantiates a new {@link UpdateBidRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdateBidRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/ad/{ad_id}/update_bid", rawUrl);
    }
    /**
     * This method updates the bid percentage (also known as the &quot;ad rate&quot;) for the specified ad in the specified campaign. &lt;p&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;ad_id&lt;/b&gt; as path parameters, and supply the new &lt;b&gt;bidPercentage&lt;/b&gt; value in the payload of the call.&lt;/p&gt;  &lt;p&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a seller&apos;s current campaign IDs and call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad-getads&quot;&gt;getAds&lt;/a&gt; to get their ad IDs.&lt;/p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot; target=&quot;_blank&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @param body This type defines the fields for the &lt;b&gt;updateBid&lt;/b&gt; request.
     * @throws ErrorDetailV3 When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 404 status code
     * @throws ErrorDetailV3 When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    public void post(@jakarta.annotation.Nonnull final UpdateBidPercentageRequest body) {
        post(body, null);
    }
    /**
     * This method updates the bid percentage (also known as the &quot;ad rate&quot;) for the specified ad in the specified campaign. &lt;p&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;ad_id&lt;/b&gt; as path parameters, and supply the new &lt;b&gt;bidPercentage&lt;/b&gt; value in the payload of the call.&lt;/p&gt;  &lt;p&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a seller&apos;s current campaign IDs and call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad-getads&quot;&gt;getAds&lt;/a&gt; to get their ad IDs.&lt;/p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot; target=&quot;_blank&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @param body This type defines the fields for the &lt;b&gt;updateBid&lt;/b&gt; request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ErrorDetailV3 When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 404 status code
     * @throws ErrorDetailV3 When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    public void post(@jakarta.annotation.Nonnull final UpdateBidPercentageRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("404", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("409", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorDetailV3::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * This method updates the bid percentage (also known as the &quot;ad rate&quot;) for the specified ad in the specified campaign. &lt;p&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;ad_id&lt;/b&gt; as path parameters, and supply the new &lt;b&gt;bidPercentage&lt;/b&gt; value in the payload of the call.&lt;/p&gt;  &lt;p&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a seller&apos;s current campaign IDs and call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad-getads&quot;&gt;getAds&lt;/a&gt; to get their ad IDs.&lt;/p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot; target=&quot;_blank&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @param body This type defines the fields for the &lt;b&gt;updateBid&lt;/b&gt; request.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdateBidPercentageRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method updates the bid percentage (also known as the &quot;ad rate&quot;) for the specified ad in the specified campaign. &lt;p&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;ad_id&lt;/b&gt; as path parameters, and supply the new &lt;b&gt;bidPercentage&lt;/b&gt; value in the payload of the call.&lt;/p&gt;  &lt;p&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a seller&apos;s current campaign IDs and call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad-getads&quot;&gt;getAds&lt;/a&gt; to get their ad IDs.&lt;/p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot; target=&quot;_blank&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @param body This type defines the fields for the &lt;b&gt;updateBid&lt;/b&gt; request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdateBidPercentageRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link UpdateBidRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdateBidRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UpdateBidRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
