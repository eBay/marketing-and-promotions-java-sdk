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

package com.ebay.marketingandpromotions.generated.marketing.seller_promotional_offers.activate_promotion;

import com.ebay.marketingandpromotions.generated.marketing.models.Error;
import com.ebay.marketingandpromotions.generated.marketing.models.PromotionSignUpRequest;
import com.ebay.marketingandpromotions.generated.marketing.models.PromotionSignUpResponse;
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
 * Activate a seller promotion
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ActivatePromotionRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ActivatePromotionRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ActivatePromotionRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/seller_promotional_offers/activate_promotion", pathParameters);
    }
    /**
     * Instantiates a new {@link ActivatePromotionRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ActivatePromotionRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/seller_promotional_offers/activate_promotion", rawUrl);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; When implementing the eBay Promotions API, partners are required to surface links to eBay&apos;s promotion terms and conditions for sellers before allowing sellers to activate the promotions. The link should remain surfaced once the promotion has been activated. eBay will provide the relevant promotion link(s) and instructions. Additionally, Partners are required to ask sellers to take action to activate a promotion themselves.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to activate a promotion on a seller&apos;s account.&lt;br&gt;&lt;br&gt;The promotion to activate is specified through its &lt;b&gt;promotionHash&lt;/b&gt; and &lt;b&gt;promotionId&lt;/b&gt; fields. The values can be retrieved using the &lt;a href=&quot;/api-docs/marketing-private/sell/marketing/resources/seller_promotional_offers/methods/getSellerPromotionalOffers&quot; target=&quot;_blank &quot;&gt;getSellerPromotionalOffers&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;If the call is successful, HTTP status code &lt;b&gt;200 OK&lt;/b&gt; will be returned, and the promotion will be activated on the seller&apos;s account.
     * @param body This type defines the fields required to activate a specific promotion for a seller.
     * @return a {@link PromotionSignUpResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public PromotionSignUpResponse post(@jakarta.annotation.Nonnull final PromotionSignUpRequest body) {
        return post(body, null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; When implementing the eBay Promotions API, partners are required to surface links to eBay&apos;s promotion terms and conditions for sellers before allowing sellers to activate the promotions. The link should remain surfaced once the promotion has been activated. eBay will provide the relevant promotion link(s) and instructions. Additionally, Partners are required to ask sellers to take action to activate a promotion themselves.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to activate a promotion on a seller&apos;s account.&lt;br&gt;&lt;br&gt;The promotion to activate is specified through its &lt;b&gt;promotionHash&lt;/b&gt; and &lt;b&gt;promotionId&lt;/b&gt; fields. The values can be retrieved using the &lt;a href=&quot;/api-docs/marketing-private/sell/marketing/resources/seller_promotional_offers/methods/getSellerPromotionalOffers&quot; target=&quot;_blank &quot;&gt;getSellerPromotionalOffers&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;If the call is successful, HTTP status code &lt;b&gt;200 OK&lt;/b&gt; will be returned, and the promotion will be activated on the seller&apos;s account.
     * @param body This type defines the fields required to activate a specific promotion for a seller.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PromotionSignUpResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public PromotionSignUpResponse post(@jakarta.annotation.Nonnull final PromotionSignUpRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PromotionSignUpResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; When implementing the eBay Promotions API, partners are required to surface links to eBay&apos;s promotion terms and conditions for sellers before allowing sellers to activate the promotions. The link should remain surfaced once the promotion has been activated. eBay will provide the relevant promotion link(s) and instructions. Additionally, Partners are required to ask sellers to take action to activate a promotion themselves.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to activate a promotion on a seller&apos;s account.&lt;br&gt;&lt;br&gt;The promotion to activate is specified through its &lt;b&gt;promotionHash&lt;/b&gt; and &lt;b&gt;promotionId&lt;/b&gt; fields. The values can be retrieved using the &lt;a href=&quot;/api-docs/marketing-private/sell/marketing/resources/seller_promotional_offers/methods/getSellerPromotionalOffers&quot; target=&quot;_blank &quot;&gt;getSellerPromotionalOffers&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;If the call is successful, HTTP status code &lt;b&gt;200 OK&lt;/b&gt; will be returned, and the promotion will be activated on the seller&apos;s account.
     * @param body This type defines the fields required to activate a specific promotion for a seller.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PromotionSignUpRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; When implementing the eBay Promotions API, partners are required to surface links to eBay&apos;s promotion terms and conditions for sellers before allowing sellers to activate the promotions. The link should remain surfaced once the promotion has been activated. eBay will provide the relevant promotion link(s) and instructions. Additionally, Partners are required to ask sellers to take action to activate a promotion themselves.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;This method can be used to activate a promotion on a seller&apos;s account.&lt;br&gt;&lt;br&gt;The promotion to activate is specified through its &lt;b&gt;promotionHash&lt;/b&gt; and &lt;b&gt;promotionId&lt;/b&gt; fields. The values can be retrieved using the &lt;a href=&quot;/api-docs/marketing-private/sell/marketing/resources/seller_promotional_offers/methods/getSellerPromotionalOffers&quot; target=&quot;_blank &quot;&gt;getSellerPromotionalOffers&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;If the call is successful, HTTP status code &lt;b&gt;200 OK&lt;/b&gt; will be returned, and the promotion will be activated on the seller&apos;s account.
     * @param body This type defines the fields required to activate a specific promotion for a seller.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PromotionSignUpRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link ActivatePromotionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ActivatePromotionRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ActivatePromotionRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
