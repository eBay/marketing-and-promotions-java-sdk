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

package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.bulk_update_ads_status_by_listing_id;

import com.ebay.marketingandpromotions.generated.marketing.models.BulkAdUpdateStatusByListingIdResponse;
import com.ebay.marketingandpromotions.generated.marketing.models.BulkUpdateAdStatusByListingIdRequest;
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
 * Builds and executes requests for operations under /ad_campaign/{campaign_id}/bulk_update_ads_status_by_listing_id
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkUpdateAdsStatusByListingIdRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link BulkUpdateAdsStatusByListingIdRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkUpdateAdsStatusByListingIdRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/bulk_update_ads_status_by_listing_id", pathParameters);
    }
    /**
     * Instantiates a new {@link BulkUpdateAdsStatusByListingIdRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkUpdateAdsStatusByListingIdRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/bulk_update_ads_status_by_listing_id", rawUrl);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method works with listings created with either the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/index.html&quot;&gt;Trading API&lt;/a&gt; or the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot;&gt;Inventory API&lt;/a&gt;.&lt;br /&gt;&lt;br /&gt;The method updates the status of ads in bulk, based on listing ID values.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter and supply a set of listing IDs with their updated &lt;b&gt;adStatus&lt;/b&gt; values in the request body. An eBay listing ID is generated when a listing is created with the Trading API.&lt;br /&gt;&lt;br /&gt;Get the campaign IDs for a seller by calling &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; and call &lt;a href=&quot;/api-docs/sell/marketing/resources/ad/methods/getAds&quot;&gt;getAds&lt;/a&gt; to retrieve a list of seller inventory reference IDs.
     * @param body A type that defines the fields for the &lt;b&gt;BulkUpdateAdStatusByListingId&lt;/b&gt; request.
     * @return a {@link BulkAdUpdateStatusByListingIdResponse}
     */
    @jakarta.annotation.Nullable
    public BulkAdUpdateStatusByListingIdResponse post(@jakarta.annotation.Nonnull final BulkUpdateAdStatusByListingIdRequest body) {
        return post(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method works with listings created with either the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/index.html&quot;&gt;Trading API&lt;/a&gt; or the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot;&gt;Inventory API&lt;/a&gt;.&lt;br /&gt;&lt;br /&gt;The method updates the status of ads in bulk, based on listing ID values.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter and supply a set of listing IDs with their updated &lt;b&gt;adStatus&lt;/b&gt; values in the request body. An eBay listing ID is generated when a listing is created with the Trading API.&lt;br /&gt;&lt;br /&gt;Get the campaign IDs for a seller by calling &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; and call &lt;a href=&quot;/api-docs/sell/marketing/resources/ad/methods/getAds&quot;&gt;getAds&lt;/a&gt; to retrieve a list of seller inventory reference IDs.
     * @param body A type that defines the fields for the &lt;b&gt;BulkUpdateAdStatusByListingId&lt;/b&gt; request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link BulkAdUpdateStatusByListingIdResponse}
     */
    @jakarta.annotation.Nullable
    public BulkAdUpdateStatusByListingIdResponse post(@jakarta.annotation.Nonnull final BulkUpdateAdStatusByListingIdRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, BulkAdUpdateStatusByListingIdResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method works with listings created with either the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/index.html&quot;&gt;Trading API&lt;/a&gt; or the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot;&gt;Inventory API&lt;/a&gt;.&lt;br /&gt;&lt;br /&gt;The method updates the status of ads in bulk, based on listing ID values.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter and supply a set of listing IDs with their updated &lt;b&gt;adStatus&lt;/b&gt; values in the request body. An eBay listing ID is generated when a listing is created with the Trading API.&lt;br /&gt;&lt;br /&gt;Get the campaign IDs for a seller by calling &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; and call &lt;a href=&quot;/api-docs/sell/marketing/resources/ad/methods/getAds&quot;&gt;getAds&lt;/a&gt; to retrieve a list of seller inventory reference IDs.
     * @param body A type that defines the fields for the &lt;b&gt;BulkUpdateAdStatusByListingId&lt;/b&gt; request.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkUpdateAdStatusByListingIdRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method works with listings created with either the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/index.html&quot;&gt;Trading API&lt;/a&gt; or the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot;&gt;Inventory API&lt;/a&gt;.&lt;br /&gt;&lt;br /&gt;The method updates the status of ads in bulk, based on listing ID values.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter and supply a set of listing IDs with their updated &lt;b&gt;adStatus&lt;/b&gt; values in the request body. An eBay listing ID is generated when a listing is created with the Trading API.&lt;br /&gt;&lt;br /&gt;Get the campaign IDs for a seller by calling &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; and call &lt;a href=&quot;/api-docs/sell/marketing/resources/ad/methods/getAds&quot;&gt;getAds&lt;/a&gt; to retrieve a list of seller inventory reference IDs.
     * @param body A type that defines the fields for the &lt;b&gt;BulkUpdateAdStatusByListingId&lt;/b&gt; request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkUpdateAdStatusByListingIdRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link BulkUpdateAdsStatusByListingIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkUpdateAdsStatusByListingIdRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BulkUpdateAdsStatusByListingIdRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
