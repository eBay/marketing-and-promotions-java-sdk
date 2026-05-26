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

package com.ebay.marketingandpromotions.generated.marketing.promotion.item.pause;

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
 * Builds and executes requests for operations under /promotion/{promotion_id}/pause
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PauseRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link PauseRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PauseRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/promotion/{promotion_id}/pause", pathParameters);
    }
    /**
     * Instantiates a new {@link PauseRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PauseRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/promotion/{promotion_id}/pause", rawUrl);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method pauses a currently-active (RUNNING) threshold discount and changes the state of the discount from &lt;code&gt;RUNNING&lt;/code&gt; to &lt;code&gt;PAUSED&lt;/code&gt;. Pausing a discount makes the discount temporarily unavailable to buyers and any currently-incomplete transactions will not receive the offer until the discount is resumed. Also, discount teasers are not displayed when a discount is paused.  &lt;br&gt;&lt;br&gt;Pass the ID of the discount you want to pause using the &lt;b&gt;promotion_id&lt;/b&gt; path parameter. Call &lt;a href=&quot;/api-docs/sell/marketing/resources/promotion/methods/getPromotions&quot;&gt;getPromotions&lt;/a&gt; to retrieve the IDs of the seller&apos;s discounts. &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; You can only pause threshold discounts (you cannot pause markdown discounts).
     */
    public void post() {
        post(null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method pauses a currently-active (RUNNING) threshold discount and changes the state of the discount from &lt;code&gt;RUNNING&lt;/code&gt; to &lt;code&gt;PAUSED&lt;/code&gt;. Pausing a discount makes the discount temporarily unavailable to buyers and any currently-incomplete transactions will not receive the offer until the discount is resumed. Also, discount teasers are not displayed when a discount is paused.  &lt;br&gt;&lt;br&gt;Pass the ID of the discount you want to pause using the &lt;b&gt;promotion_id&lt;/b&gt; path parameter. Call &lt;a href=&quot;/api-docs/sell/marketing/resources/promotion/methods/getPromotions&quot;&gt;getPromotions&lt;/a&gt; to retrieve the IDs of the seller&apos;s discounts. &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; You can only pause threshold discounts (you cannot pause markdown discounts).
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method pauses a currently-active (RUNNING) threshold discount and changes the state of the discount from &lt;code&gt;RUNNING&lt;/code&gt; to &lt;code&gt;PAUSED&lt;/code&gt;. Pausing a discount makes the discount temporarily unavailable to buyers and any currently-incomplete transactions will not receive the offer until the discount is resumed. Also, discount teasers are not displayed when a discount is paused.  &lt;br&gt;&lt;br&gt;Pass the ID of the discount you want to pause using the &lt;b&gt;promotion_id&lt;/b&gt; path parameter. Call &lt;a href=&quot;/api-docs/sell/marketing/resources/promotion/methods/getPromotions&quot;&gt;getPromotions&lt;/a&gt; to retrieve the IDs of the seller&apos;s discounts. &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; You can only pause threshold discounts (you cannot pause markdown discounts).
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method pauses a currently-active (RUNNING) threshold discount and changes the state of the discount from &lt;code&gt;RUNNING&lt;/code&gt; to &lt;code&gt;PAUSED&lt;/code&gt;. Pausing a discount makes the discount temporarily unavailable to buyers and any currently-incomplete transactions will not receive the offer until the discount is resumed. Also, discount teasers are not displayed when a discount is paused.  &lt;br&gt;&lt;br&gt;Pass the ID of the discount you want to pause using the &lt;b&gt;promotion_id&lt;/b&gt; path parameter. Call &lt;a href=&quot;/api-docs/sell/marketing/resources/promotion/methods/getPromotions&quot;&gt;getPromotions&lt;/a&gt; to retrieve the IDs of the seller&apos;s discounts. &lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; You can only pause threshold discounts (you cannot pause markdown discounts).
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link PauseRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PauseRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PauseRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
