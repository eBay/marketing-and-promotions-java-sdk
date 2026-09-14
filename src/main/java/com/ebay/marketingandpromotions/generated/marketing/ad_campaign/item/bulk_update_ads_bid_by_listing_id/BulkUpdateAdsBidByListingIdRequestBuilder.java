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

package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.bulk_update_ads_bid_by_listing_id;

import com.ebay.marketingandpromotions.generated.marketing.models.BulkAdUpdateResponse;
import com.ebay.marketingandpromotions.generated.marketing.models.BulkCreateAdRequest;
import com.ebay.marketingandpromotions.generated.marketing.models.ErrorDetailV3;
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
 * Builds and executes requests for operations under /ad_campaign/{campaign_id}/bulk_update_ads_bid_by_listing_id
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkUpdateAdsBidByListingIdRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link BulkUpdateAdsBidByListingIdRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkUpdateAdsBidByListingIdRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/bulk_update_ads_bid_by_listing_id", pathParameters);
    }
    /**
     * Instantiates a new {@link BulkUpdateAdsBidByListingIdRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkUpdateAdsBidByListingIdRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/bulk_update_ads_bid_by_listing_id", rawUrl);
    }
    /**
     * This method works with listings created with either the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/index.html&quot; title=&quot;Trading API Reference&quot; target=&quot;_blank&quot;&gt;Trading API&lt;/a&gt; or the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot; target=&quot;_blank&quot;&gt;Inventory API&lt;/a&gt;.  &lt;p&gt;The method updates the &lt;b&gt;bidPercentage&lt;/b&gt; values for a set of ads associated with the specified campaign.&lt;/p&gt;  &lt;p&gt;Specify the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter and supply a set of listing IDs with their associated updated &lt;b&gt;bidPercentage&lt;/b&gt; values in the request body. An eBay listing ID is generated when a listing is created with the Trading API.&lt;/p&gt;  &lt;p&gt;Get the campaign IDs for a seller by calling &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; and call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad-getads&quot;&gt;getAds&lt;/a&gt; to get a list of the seller&apos;s inventory reference IDs.&lt;/p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot; target=&quot;_blank&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @param body This request object defines the fields for the &lt;b&gt;BulkCreateAdsByListingId&lt;/b&gt; request.
     * @return a {@link BulkAdUpdateResponse}
     * @throws ErrorDetailV3 When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 404 status code
     * @throws ErrorDetailV3 When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public BulkAdUpdateResponse post(@jakarta.annotation.Nonnull final BulkCreateAdRequest body) {
        return post(body, null);
    }
    /**
     * This method works with listings created with either the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/index.html&quot; title=&quot;Trading API Reference&quot; target=&quot;_blank&quot;&gt;Trading API&lt;/a&gt; or the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot; target=&quot;_blank&quot;&gt;Inventory API&lt;/a&gt;.  &lt;p&gt;The method updates the &lt;b&gt;bidPercentage&lt;/b&gt; values for a set of ads associated with the specified campaign.&lt;/p&gt;  &lt;p&gt;Specify the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter and supply a set of listing IDs with their associated updated &lt;b&gt;bidPercentage&lt;/b&gt; values in the request body. An eBay listing ID is generated when a listing is created with the Trading API.&lt;/p&gt;  &lt;p&gt;Get the campaign IDs for a seller by calling &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; and call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad-getads&quot;&gt;getAds&lt;/a&gt; to get a list of the seller&apos;s inventory reference IDs.&lt;/p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot; target=&quot;_blank&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @param body This request object defines the fields for the &lt;b&gt;BulkCreateAdsByListingId&lt;/b&gt; request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link BulkAdUpdateResponse}
     * @throws ErrorDetailV3 When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 404 status code
     * @throws ErrorDetailV3 When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public BulkAdUpdateResponse post(@jakarta.annotation.Nonnull final BulkCreateAdRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("404", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("409", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorDetailV3::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, BulkAdUpdateResponse::createFromDiscriminatorValue);
    }
    /**
     * This method works with listings created with either the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/index.html&quot; title=&quot;Trading API Reference&quot; target=&quot;_blank&quot;&gt;Trading API&lt;/a&gt; or the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot; target=&quot;_blank&quot;&gt;Inventory API&lt;/a&gt;.  &lt;p&gt;The method updates the &lt;b&gt;bidPercentage&lt;/b&gt; values for a set of ads associated with the specified campaign.&lt;/p&gt;  &lt;p&gt;Specify the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter and supply a set of listing IDs with their associated updated &lt;b&gt;bidPercentage&lt;/b&gt; values in the request body. An eBay listing ID is generated when a listing is created with the Trading API.&lt;/p&gt;  &lt;p&gt;Get the campaign IDs for a seller by calling &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; and call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad-getads&quot;&gt;getAds&lt;/a&gt; to get a list of the seller&apos;s inventory reference IDs.&lt;/p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot; target=&quot;_blank&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @param body This request object defines the fields for the &lt;b&gt;BulkCreateAdsByListingId&lt;/b&gt; request.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkCreateAdRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method works with listings created with either the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/index.html&quot; title=&quot;Trading API Reference&quot; target=&quot;_blank&quot;&gt;Trading API&lt;/a&gt; or the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot; target=&quot;_blank&quot;&gt;Inventory API&lt;/a&gt;.  &lt;p&gt;The method updates the &lt;b&gt;bidPercentage&lt;/b&gt; values for a set of ads associated with the specified campaign.&lt;/p&gt;  &lt;p&gt;Specify the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter and supply a set of listing IDs with their associated updated &lt;b&gt;bidPercentage&lt;/b&gt; values in the request body. An eBay listing ID is generated when a listing is created with the Trading API.&lt;/p&gt;  &lt;p&gt;Get the campaign IDs for a seller by calling &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; and call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad-getads&quot;&gt;getAds&lt;/a&gt; to get a list of the seller&apos;s inventory reference IDs.&lt;/p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot; target=&quot;_blank&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @param body This request object defines the fields for the &lt;b&gt;BulkCreateAdsByListingId&lt;/b&gt; request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkCreateAdRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link BulkUpdateAdsBidByListingIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkUpdateAdsBidByListingIdRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BulkUpdateAdsBidByListingIdRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
