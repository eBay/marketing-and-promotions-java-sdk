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

package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.update_bidding_strategy;

import com.ebay.marketingandpromotions.generated.marketing.models.Error;
import com.ebay.marketingandpromotions.generated.marketing.models.UpdateBiddingStrategyRequest;
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
 * Builds and executes requests for operations under /ad_campaign/{campaign_id}/update_bidding_strategy
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateBiddingStrategyRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link UpdateBiddingStrategyRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdateBiddingStrategyRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/update_bidding_strategy", pathParameters);
    }
    /**
     * Instantiates a new {@link UpdateBiddingStrategyRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdateBiddingStrategyRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/update_bidding_strategy", rawUrl);
    }
    /**
     * This method allows sellers to change the bidding strategy for a specified Cost Per Click (CPC) campaign that uses manual targeting. Available bidding strategies are:&lt;ul&gt;&lt;li&gt;&lt;code&gt;FIXED&lt;/code&gt;&lt;br&gt;&lt;br&gt;When using a fixed bidding strategy, sellers manually assign and adjust keyword bids for the CPC campaign.&lt;/li&gt;&lt;li&gt;&lt;code&gt;DYNAMIC&lt;/code&gt;&lt;br&gt;&lt;br&gt;When using a dynamic bidding strategy, eBay will manage a campaign&apos;s keyword bids and automatically update them daily to the suggested bid.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For a CPC campaign using dynamic bidding, sellers can continue to manually add keywords for the campaign, but they are no longer able to manually adjust their associated bid values. In order to manually adjust bid values, sellers must use the &lt;code&gt;FIXED&lt;/code&gt; bidding strategy.&lt;/span&gt;&lt;/li&gt;&lt;/ul&gt;In addition, this method allows sellers to modify the &lt;b&gt;maxCPC&lt;/b&gt; value of a smart targeting campaign.&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Click (CPC) funding model; it does not apply to the Cost Per Sale (CPS) funding model. Refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot; target=&quot;_blank&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @param body This type specifies the new value for the bidding strategy.
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    public void post(@jakarta.annotation.Nonnull final UpdateBiddingStrategyRequest body) {
        post(body, null);
    }
    /**
     * This method allows sellers to change the bidding strategy for a specified Cost Per Click (CPC) campaign that uses manual targeting. Available bidding strategies are:&lt;ul&gt;&lt;li&gt;&lt;code&gt;FIXED&lt;/code&gt;&lt;br&gt;&lt;br&gt;When using a fixed bidding strategy, sellers manually assign and adjust keyword bids for the CPC campaign.&lt;/li&gt;&lt;li&gt;&lt;code&gt;DYNAMIC&lt;/code&gt;&lt;br&gt;&lt;br&gt;When using a dynamic bidding strategy, eBay will manage a campaign&apos;s keyword bids and automatically update them daily to the suggested bid.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For a CPC campaign using dynamic bidding, sellers can continue to manually add keywords for the campaign, but they are no longer able to manually adjust their associated bid values. In order to manually adjust bid values, sellers must use the &lt;code&gt;FIXED&lt;/code&gt; bidding strategy.&lt;/span&gt;&lt;/li&gt;&lt;/ul&gt;In addition, this method allows sellers to modify the &lt;b&gt;maxCPC&lt;/b&gt; value of a smart targeting campaign.&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Click (CPC) funding model; it does not apply to the Cost Per Sale (CPS) funding model. Refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot; target=&quot;_blank&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @param body This type specifies the new value for the bidding strategy.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    public void post(@jakarta.annotation.Nonnull final UpdateBiddingStrategyRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("409", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * This method allows sellers to change the bidding strategy for a specified Cost Per Click (CPC) campaign that uses manual targeting. Available bidding strategies are:&lt;ul&gt;&lt;li&gt;&lt;code&gt;FIXED&lt;/code&gt;&lt;br&gt;&lt;br&gt;When using a fixed bidding strategy, sellers manually assign and adjust keyword bids for the CPC campaign.&lt;/li&gt;&lt;li&gt;&lt;code&gt;DYNAMIC&lt;/code&gt;&lt;br&gt;&lt;br&gt;When using a dynamic bidding strategy, eBay will manage a campaign&apos;s keyword bids and automatically update them daily to the suggested bid.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For a CPC campaign using dynamic bidding, sellers can continue to manually add keywords for the campaign, but they are no longer able to manually adjust their associated bid values. In order to manually adjust bid values, sellers must use the &lt;code&gt;FIXED&lt;/code&gt; bidding strategy.&lt;/span&gt;&lt;/li&gt;&lt;/ul&gt;In addition, this method allows sellers to modify the &lt;b&gt;maxCPC&lt;/b&gt; value of a smart targeting campaign.&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Click (CPC) funding model; it does not apply to the Cost Per Sale (CPS) funding model. Refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot; target=&quot;_blank&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @param body This type specifies the new value for the bidding strategy.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdateBiddingStrategyRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method allows sellers to change the bidding strategy for a specified Cost Per Click (CPC) campaign that uses manual targeting. Available bidding strategies are:&lt;ul&gt;&lt;li&gt;&lt;code&gt;FIXED&lt;/code&gt;&lt;br&gt;&lt;br&gt;When using a fixed bidding strategy, sellers manually assign and adjust keyword bids for the CPC campaign.&lt;/li&gt;&lt;li&gt;&lt;code&gt;DYNAMIC&lt;/code&gt;&lt;br&gt;&lt;br&gt;When using a dynamic bidding strategy, eBay will manage a campaign&apos;s keyword bids and automatically update them daily to the suggested bid.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; For a CPC campaign using dynamic bidding, sellers can continue to manually add keywords for the campaign, but they are no longer able to manually adjust their associated bid values. In order to manually adjust bid values, sellers must use the &lt;code&gt;FIXED&lt;/code&gt; bidding strategy.&lt;/span&gt;&lt;/li&gt;&lt;/ul&gt;In addition, this method allows sellers to modify the &lt;b&gt;maxCPC&lt;/b&gt; value of a smart targeting campaign.&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Click (CPC) funding model; it does not apply to the Cost Per Sale (CPS) funding model. Refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot; target=&quot;_blank&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @param body This type specifies the new value for the bidding strategy.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdateBiddingStrategyRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link UpdateBiddingStrategyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdateBiddingStrategyRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UpdateBiddingStrategyRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
