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

package com.ebay.marketingandpromotions.generated.marketing.seller_promotional_offers;

import com.ebay.marketingandpromotions.generated.marketing.models.Error;
import com.ebay.marketingandpromotions.generated.marketing.models.SellerPromotionalOffersResponse;
import com.ebay.marketingandpromotions.generated.marketing.seller_promotional_offers.activate_promotion.ActivatePromotionRequestBuilder;
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
 * Seller promotional offers
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SellerPromotionalOffersRequestBuilder extends BaseRequestBuilder {
    /**
     * Activate a seller promotion
     * @return a {@link ActivatePromotionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ActivatePromotionRequestBuilder activatePromotion() {
        return new ActivatePromotionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link SellerPromotionalOffersRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SellerPromotionalOffersRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/seller_promotional_offers", pathParameters);
    }
    /**
     * Instantiates a new {@link SellerPromotionalOffersRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SellerPromotionalOffersRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/seller_promotional_offers", rawUrl);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; When implementing the eBay Promotions API, partners are required to surface links to eBay&apos;s promotion terms and conditions for sellers before allowing sellers to activate the promotions. The link should remain surfaced once the promotion has been activated. eBay will provide the relevant promotion link(s) and instructions. Additionally, Partners are required to ask sellers to take action to activate a promotion themselves.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to retrieve a list of promotional offers available to the seller on a specified marketplace.&lt;br&gt;&lt;br&gt;If a returned promotional offer is in &lt;code&gt;REQUIRES_ACTIVATION&lt;/code&gt; state, the returned &lt;b&gt;promotionHash&lt;/b&gt; and &lt;b&gt;promotionId&lt;/b&gt; values can be used with the &lt;a href=&quot;/api-docs/marketing-private/sell/marketing/resources/seller_promotional_offers/methods/activatePromotion&quot; target=&quot;_blank &quot;&gt;activatePromotion&lt;/a&gt; method to activate the promotion on the seller&apos;s account.
     * @return a {@link SellerPromotionalOffersResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public SellerPromotionalOffersResponse get() {
        return get(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; When implementing the eBay Promotions API, partners are required to surface links to eBay&apos;s promotion terms and conditions for sellers before allowing sellers to activate the promotions. The link should remain surfaced once the promotion has been activated. eBay will provide the relevant promotion link(s) and instructions. Additionally, Partners are required to ask sellers to take action to activate a promotion themselves.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to retrieve a list of promotional offers available to the seller on a specified marketplace.&lt;br&gt;&lt;br&gt;If a returned promotional offer is in &lt;code&gt;REQUIRES_ACTIVATION&lt;/code&gt; state, the returned &lt;b&gt;promotionHash&lt;/b&gt; and &lt;b&gt;promotionId&lt;/b&gt; values can be used with the &lt;a href=&quot;/api-docs/marketing-private/sell/marketing/resources/seller_promotional_offers/methods/activatePromotion&quot; target=&quot;_blank &quot;&gt;activatePromotion&lt;/a&gt; method to activate the promotion on the seller&apos;s account.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SellerPromotionalOffersResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public SellerPromotionalOffersResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SellerPromotionalOffersResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; When implementing the eBay Promotions API, partners are required to surface links to eBay&apos;s promotion terms and conditions for sellers before allowing sellers to activate the promotions. The link should remain surfaced once the promotion has been activated. eBay will provide the relevant promotion link(s) and instructions. Additionally, Partners are required to ask sellers to take action to activate a promotion themselves.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to retrieve a list of promotional offers available to the seller on a specified marketplace.&lt;br&gt;&lt;br&gt;If a returned promotional offer is in &lt;code&gt;REQUIRES_ACTIVATION&lt;/code&gt; state, the returned &lt;b&gt;promotionHash&lt;/b&gt; and &lt;b&gt;promotionId&lt;/b&gt; values can be used with the &lt;a href=&quot;/api-docs/marketing-private/sell/marketing/resources/seller_promotional_offers/methods/activatePromotion&quot; target=&quot;_blank &quot;&gt;activatePromotion&lt;/a&gt; method to activate the promotion on the seller&apos;s account.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; When implementing the eBay Promotions API, partners are required to surface links to eBay&apos;s promotion terms and conditions for sellers before allowing sellers to activate the promotions. The link should remain surfaced once the promotion has been activated. eBay will provide the relevant promotion link(s) and instructions. Additionally, Partners are required to ask sellers to take action to activate a promotion themselves.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to retrieve a list of promotional offers available to the seller on a specified marketplace.&lt;br&gt;&lt;br&gt;If a returned promotional offer is in &lt;code&gt;REQUIRES_ACTIVATION&lt;/code&gt; state, the returned &lt;b&gt;promotionHash&lt;/b&gt; and &lt;b&gt;promotionId&lt;/b&gt; values can be used with the &lt;a href=&quot;/api-docs/marketing-private/sell/marketing/resources/seller_promotional_offers/methods/activatePromotion&quot; target=&quot;_blank &quot;&gt;activatePromotion&lt;/a&gt; method to activate the promotion on the seller&apos;s account.
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link SellerPromotionalOffersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SellerPromotionalOffersRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SellerPromotionalOffersRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
