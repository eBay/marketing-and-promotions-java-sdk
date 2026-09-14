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

package com.ebay.marketingandpromotions.generated.marketing.item_promotion;

import com.ebay.marketingandpromotions.generated.marketing.item_promotion.item.WithPromotionItemRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.models.BaseResponse;
import com.ebay.marketingandpromotions.generated.marketing.models.Error;
import com.ebay.marketingandpromotions.generated.marketing.models.ItemPromotion;
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
 * Builds and executes requests for operations under /item_promotion
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemPromotionRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.marketingandpromotions.generated.marketing.item_promotion.item collection
     * @param promotion_id This path parameter takes a concatenation of the ID of the discount you want to retrieve plus the marketplace ID on which the discount is hosted. Concatenate the two values by separating them with an &quot;at sign&quot; (&lt;b&gt;@&lt;/b&gt;). &lt;br&gt;&lt;br&gt;The ID of the discount (&lt;b&gt;promotionId&lt;/b&gt;) is a unique eBay-assigned value that&apos;s generated when the discount is created. The Marketplace ID is the ENUM value of eBay marketplace where the discount is hosted.&lt;br&gt;&lt;br&gt; Use the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-promotion-getpromotions&quot;&gt;getPromotions&lt;/a&gt; method to retrieve promotion Ids. See &lt;a href=&quot;/develop/api/sell/request_headers#marketplace-id-values&quot; target=&quot;_blank&quot;&gt;Marketplace ID values&lt;/a&gt; for supported Marketplace ID values.&lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;1********5@EBAY_US&lt;/code&gt;
     * @return a {@link WithPromotionItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithPromotionItemRequestBuilder byPromotion_id(@jakarta.annotation.Nonnull final String promotion_id) {
        Objects.requireNonNull(promotion_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("promotion_id", promotion_id);
        return new WithPromotionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ItemPromotionRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ItemPromotionRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/item_promotion", pathParameters);
    }
    /**
     * Instantiates a new {@link ItemPromotionRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ItemPromotionRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/item_promotion", rawUrl);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method creates an &lt;b&gt;item discount&lt;/b&gt;, where the buyer receives a discount when they meet the specific buying criteria. Known here as &quot;threshold discounts&quot;, these discounts trigger when a threshold is met.  &lt;p&gt;eBay highlights discounted items by placing teasers for the discounted items throughout the online buyer flows.&lt;/p&gt;  &lt;p&gt;&lt;i&gt;Discounts&lt;/i&gt; are specified as either a monetary amount or a percentage off the standard sales price of a listing, letting you offer deals such as &quot;Buy 1 Get 1&quot; and &quot;Buy $50, get 20% off&quot;.&lt;/p&gt; &lt;p&gt;&lt;i&gt;Volume pricing&lt;/i&gt; discounts increase the value of the discount as the buyer increases the quantity they purchase.&lt;/p&gt; &lt;p&gt;&lt;i&gt;Coded Coupons&lt;/i&gt; provide unique codes that a buyer can use during checkout to receive a discount. The seller can specify the number of times a buyer can use the coupon and the maximum amount across all purchases that can be discounted using the coupon. The coupon code can also be made public (appearing on the seller&apos;s Offer page, search pages, the item listing, and the checkout page) or private (only on the seller&apos;s Offer page, but the seller can include the code in email and social media).&lt;/p&gt; &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: Coded Coupons are currently available in the US, UK, DE, FR, IT, ES, and AU marketplaces.&lt;/p&gt;&lt;p&gt;There are two ways to add items to a threshold discount:&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;&lt;b&gt;Key-based discounts&lt;/b&gt; select items using either the listing IDs or inventory reference IDs of the items you want to discount. Note that if you use inventory reference IDs, you must specify both the &lt;b&gt;inventoryReferenceId&lt;/b&gt; and the associated &lt;b&gt;inventoryReferenceType&lt;/b&gt; of the item(s) you want to be discounted.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Rule-based discounts&lt;/b&gt; select items using a list of eBay category IDs or seller Store category IDs. Rules can further constrain the items being discounted by minimum and maximum prices, brands, and item conditions.&lt;/li&gt;&lt;/ul&gt;  &lt;p&gt;You must create a new discount in either a &lt;code&gt;DRAFT&lt;/code&gt; or &lt;code&gt;SCHEDULED&lt;/code&gt; state. Use the DRAFT state when you are initially creating a discount and you want to be sure it&apos;s correctly configured before scheduling it to run. When you create a discount, the promotion ID is returned in the &lt;b&gt;Location&lt;/b&gt; response header. Use this ID to reference the discount in subsequent requests.&lt;/p&gt;  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; Refer to the &lt;a href=&quot;/api-docs/sell/static/marketing/promotions-manager.html&quot; target=&quot;_blank&quot;&gt;Selling Integration Guide&lt;/a&gt; for details and examples showing how to create and manage threshold discounts using the Discounts Manager.&lt;/p&gt;  &lt;p&gt;For information on the eBay marketplaces that support item discounts, see &lt;a href=&quot;/api-docs/sell/static/marketing/pm-requirements.html&quot; target=&quot;_blank&quot;&gt;Discounts Manager requirements and restrictions&lt;/a&gt;.&lt;/p&gt;
     * @param body This type defines the fields that describe an item discount.
     * @return a {@link BaseResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public BaseResponse post(@jakarta.annotation.Nonnull final ItemPromotion body) {
        return post(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method creates an &lt;b&gt;item discount&lt;/b&gt;, where the buyer receives a discount when they meet the specific buying criteria. Known here as &quot;threshold discounts&quot;, these discounts trigger when a threshold is met.  &lt;p&gt;eBay highlights discounted items by placing teasers for the discounted items throughout the online buyer flows.&lt;/p&gt;  &lt;p&gt;&lt;i&gt;Discounts&lt;/i&gt; are specified as either a monetary amount or a percentage off the standard sales price of a listing, letting you offer deals such as &quot;Buy 1 Get 1&quot; and &quot;Buy $50, get 20% off&quot;.&lt;/p&gt; &lt;p&gt;&lt;i&gt;Volume pricing&lt;/i&gt; discounts increase the value of the discount as the buyer increases the quantity they purchase.&lt;/p&gt; &lt;p&gt;&lt;i&gt;Coded Coupons&lt;/i&gt; provide unique codes that a buyer can use during checkout to receive a discount. The seller can specify the number of times a buyer can use the coupon and the maximum amount across all purchases that can be discounted using the coupon. The coupon code can also be made public (appearing on the seller&apos;s Offer page, search pages, the item listing, and the checkout page) or private (only on the seller&apos;s Offer page, but the seller can include the code in email and social media).&lt;/p&gt; &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: Coded Coupons are currently available in the US, UK, DE, FR, IT, ES, and AU marketplaces.&lt;/p&gt;&lt;p&gt;There are two ways to add items to a threshold discount:&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;&lt;b&gt;Key-based discounts&lt;/b&gt; select items using either the listing IDs or inventory reference IDs of the items you want to discount. Note that if you use inventory reference IDs, you must specify both the &lt;b&gt;inventoryReferenceId&lt;/b&gt; and the associated &lt;b&gt;inventoryReferenceType&lt;/b&gt; of the item(s) you want to be discounted.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Rule-based discounts&lt;/b&gt; select items using a list of eBay category IDs or seller Store category IDs. Rules can further constrain the items being discounted by minimum and maximum prices, brands, and item conditions.&lt;/li&gt;&lt;/ul&gt;  &lt;p&gt;You must create a new discount in either a &lt;code&gt;DRAFT&lt;/code&gt; or &lt;code&gt;SCHEDULED&lt;/code&gt; state. Use the DRAFT state when you are initially creating a discount and you want to be sure it&apos;s correctly configured before scheduling it to run. When you create a discount, the promotion ID is returned in the &lt;b&gt;Location&lt;/b&gt; response header. Use this ID to reference the discount in subsequent requests.&lt;/p&gt;  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; Refer to the &lt;a href=&quot;/api-docs/sell/static/marketing/promotions-manager.html&quot; target=&quot;_blank&quot;&gt;Selling Integration Guide&lt;/a&gt; for details and examples showing how to create and manage threshold discounts using the Discounts Manager.&lt;/p&gt;  &lt;p&gt;For information on the eBay marketplaces that support item discounts, see &lt;a href=&quot;/api-docs/sell/static/marketing/pm-requirements.html&quot; target=&quot;_blank&quot;&gt;Discounts Manager requirements and restrictions&lt;/a&gt;.&lt;/p&gt;
     * @param body This type defines the fields that describe an item discount.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link BaseResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public BaseResponse post(@jakarta.annotation.Nonnull final ItemPromotion body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("409", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, BaseResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method creates an &lt;b&gt;item discount&lt;/b&gt;, where the buyer receives a discount when they meet the specific buying criteria. Known here as &quot;threshold discounts&quot;, these discounts trigger when a threshold is met.  &lt;p&gt;eBay highlights discounted items by placing teasers for the discounted items throughout the online buyer flows.&lt;/p&gt;  &lt;p&gt;&lt;i&gt;Discounts&lt;/i&gt; are specified as either a monetary amount or a percentage off the standard sales price of a listing, letting you offer deals such as &quot;Buy 1 Get 1&quot; and &quot;Buy $50, get 20% off&quot;.&lt;/p&gt; &lt;p&gt;&lt;i&gt;Volume pricing&lt;/i&gt; discounts increase the value of the discount as the buyer increases the quantity they purchase.&lt;/p&gt; &lt;p&gt;&lt;i&gt;Coded Coupons&lt;/i&gt; provide unique codes that a buyer can use during checkout to receive a discount. The seller can specify the number of times a buyer can use the coupon and the maximum amount across all purchases that can be discounted using the coupon. The coupon code can also be made public (appearing on the seller&apos;s Offer page, search pages, the item listing, and the checkout page) or private (only on the seller&apos;s Offer page, but the seller can include the code in email and social media).&lt;/p&gt; &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: Coded Coupons are currently available in the US, UK, DE, FR, IT, ES, and AU marketplaces.&lt;/p&gt;&lt;p&gt;There are two ways to add items to a threshold discount:&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;&lt;b&gt;Key-based discounts&lt;/b&gt; select items using either the listing IDs or inventory reference IDs of the items you want to discount. Note that if you use inventory reference IDs, you must specify both the &lt;b&gt;inventoryReferenceId&lt;/b&gt; and the associated &lt;b&gt;inventoryReferenceType&lt;/b&gt; of the item(s) you want to be discounted.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Rule-based discounts&lt;/b&gt; select items using a list of eBay category IDs or seller Store category IDs. Rules can further constrain the items being discounted by minimum and maximum prices, brands, and item conditions.&lt;/li&gt;&lt;/ul&gt;  &lt;p&gt;You must create a new discount in either a &lt;code&gt;DRAFT&lt;/code&gt; or &lt;code&gt;SCHEDULED&lt;/code&gt; state. Use the DRAFT state when you are initially creating a discount and you want to be sure it&apos;s correctly configured before scheduling it to run. When you create a discount, the promotion ID is returned in the &lt;b&gt;Location&lt;/b&gt; response header. Use this ID to reference the discount in subsequent requests.&lt;/p&gt;  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; Refer to the &lt;a href=&quot;/api-docs/sell/static/marketing/promotions-manager.html&quot; target=&quot;_blank&quot;&gt;Selling Integration Guide&lt;/a&gt; for details and examples showing how to create and manage threshold discounts using the Discounts Manager.&lt;/p&gt;  &lt;p&gt;For information on the eBay marketplaces that support item discounts, see &lt;a href=&quot;/api-docs/sell/static/marketing/pm-requirements.html&quot; target=&quot;_blank&quot;&gt;Discounts Manager requirements and restrictions&lt;/a&gt;.&lt;/p&gt;
     * @param body This type defines the fields that describe an item discount.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ItemPromotion body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method creates an &lt;b&gt;item discount&lt;/b&gt;, where the buyer receives a discount when they meet the specific buying criteria. Known here as &quot;threshold discounts&quot;, these discounts trigger when a threshold is met.  &lt;p&gt;eBay highlights discounted items by placing teasers for the discounted items throughout the online buyer flows.&lt;/p&gt;  &lt;p&gt;&lt;i&gt;Discounts&lt;/i&gt; are specified as either a monetary amount or a percentage off the standard sales price of a listing, letting you offer deals such as &quot;Buy 1 Get 1&quot; and &quot;Buy $50, get 20% off&quot;.&lt;/p&gt; &lt;p&gt;&lt;i&gt;Volume pricing&lt;/i&gt; discounts increase the value of the discount as the buyer increases the quantity they purchase.&lt;/p&gt; &lt;p&gt;&lt;i&gt;Coded Coupons&lt;/i&gt; provide unique codes that a buyer can use during checkout to receive a discount. The seller can specify the number of times a buyer can use the coupon and the maximum amount across all purchases that can be discounted using the coupon. The coupon code can also be made public (appearing on the seller&apos;s Offer page, search pages, the item listing, and the checkout page) or private (only on the seller&apos;s Offer page, but the seller can include the code in email and social media).&lt;/p&gt; &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: Coded Coupons are currently available in the US, UK, DE, FR, IT, ES, and AU marketplaces.&lt;/p&gt;&lt;p&gt;There are two ways to add items to a threshold discount:&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;&lt;b&gt;Key-based discounts&lt;/b&gt; select items using either the listing IDs or inventory reference IDs of the items you want to discount. Note that if you use inventory reference IDs, you must specify both the &lt;b&gt;inventoryReferenceId&lt;/b&gt; and the associated &lt;b&gt;inventoryReferenceType&lt;/b&gt; of the item(s) you want to be discounted.&lt;/li&gt; &lt;li&gt;&lt;b&gt;Rule-based discounts&lt;/b&gt; select items using a list of eBay category IDs or seller Store category IDs. Rules can further constrain the items being discounted by minimum and maximum prices, brands, and item conditions.&lt;/li&gt;&lt;/ul&gt;  &lt;p&gt;You must create a new discount in either a &lt;code&gt;DRAFT&lt;/code&gt; or &lt;code&gt;SCHEDULED&lt;/code&gt; state. Use the DRAFT state when you are initially creating a discount and you want to be sure it&apos;s correctly configured before scheduling it to run. When you create a discount, the promotion ID is returned in the &lt;b&gt;Location&lt;/b&gt; response header. Use this ID to reference the discount in subsequent requests.&lt;/p&gt;  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; Refer to the &lt;a href=&quot;/api-docs/sell/static/marketing/promotions-manager.html&quot; target=&quot;_blank&quot;&gt;Selling Integration Guide&lt;/a&gt; for details and examples showing how to create and manage threshold discounts using the Discounts Manager.&lt;/p&gt;  &lt;p&gt;For information on the eBay marketplaces that support item discounts, see &lt;a href=&quot;/api-docs/sell/static/marketing/pm-requirements.html&quot; target=&quot;_blank&quot;&gt;Discounts Manager requirements and restrictions&lt;/a&gt;.&lt;/p&gt;
     * @param body This type defines the fields that describe an item discount.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ItemPromotion body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link ItemPromotionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ItemPromotionRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ItemPromotionRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
