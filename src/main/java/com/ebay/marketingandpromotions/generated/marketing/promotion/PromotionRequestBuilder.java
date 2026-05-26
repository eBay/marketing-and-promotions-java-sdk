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

package com.ebay.marketingandpromotions.generated.marketing.promotion;

import com.ebay.marketingandpromotions.generated.marketing.models.PromotionsPagedCollection;
import com.ebay.marketingandpromotions.generated.marketing.promotion.item.WithPromotionItemRequestBuilder;
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
 * Builds and executes requests for operations under /promotion
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PromotionRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.marketingandpromotions.generated.marketing.promotion.item collection
     * @param promotion_id This path parameter takes a concatenation of the ID of the discount associated with the listing set plus the marketplace ID on which the discount is hosted. Concatenate the two values by separating them with an &quot;at sign&quot; (&lt;b&gt;@&lt;/b&gt;). &lt;br&gt;&lt;br&gt;The ID of the discount (&lt;b&gt;promotionId&lt;/b&gt;) is a unique eBay-assigned value that&apos;s generated when the discount is created. The Marketplace ID is the ENUM value of eBay marketplace where the discount is hosted.&lt;br&gt;&lt;br&gt; Use the &lt;a href=&quot;/api-docs/sell/marketing/resources/promotion/methods/getPromotions&quot;&gt;getPromotions&lt;/a&gt; method to retrieve promotion Ids. See &lt;a href=&quot;/api-docs/sell/marketing/types/ba:MarketplaceIdEnum&quot;&gt;MarketplaceIdEnum&lt;/a&gt; for supported Marketplace ID values.&lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;1********5@EBAY_US&lt;/code&gt;
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
     * Instantiates a new {@link PromotionRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PromotionRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/promotion?marketplace_id={marketplace_id}{&limit*,offset*,promotion_status*,promotion_type*,q*,sort*}", pathParameters);
    }
    /**
     * Instantiates a new {@link PromotionRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PromotionRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/promotion?marketplace_id={marketplace_id}{&limit*,offset*,promotion_status*,promotion_type*,q*,sort*}", rawUrl);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method returns a list of a seller&apos;s undeleted discounts. &lt;p&gt;The call returns up to 200 currently-available discounts on the specified marketplace. While the response body does not include the discount&apos;s &lt;b&gt;discountRules&lt;/b&gt; or &lt;b&gt;inventoryCriterion&lt;/b&gt; containers, it does include the &lt;b&gt;promotionHref&lt;/b&gt; (which you can use to retrieve the complete details of the discount).&lt;/p&gt;  &lt;p&gt;Use query parameters to sort and filter the results by the number of discounts to return, the discount state or type, and the eBay marketplace. You can also supply keywords to limit the response to the discounts that contain that keywords in the title of the discount.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Maximum returned:&lt;/b&gt; 200&lt;/p&gt;
     * @return a {@link PromotionsPagedCollection}
     */
    @jakarta.annotation.Nullable
    public PromotionsPagedCollection get() {
        return get(null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method returns a list of a seller&apos;s undeleted discounts. &lt;p&gt;The call returns up to 200 currently-available discounts on the specified marketplace. While the response body does not include the discount&apos;s &lt;b&gt;discountRules&lt;/b&gt; or &lt;b&gt;inventoryCriterion&lt;/b&gt; containers, it does include the &lt;b&gt;promotionHref&lt;/b&gt; (which you can use to retrieve the complete details of the discount).&lt;/p&gt;  &lt;p&gt;Use query parameters to sort and filter the results by the number of discounts to return, the discount state or type, and the eBay marketplace. You can also supply keywords to limit the response to the discounts that contain that keywords in the title of the discount.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Maximum returned:&lt;/b&gt; 200&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PromotionsPagedCollection}
     */
    @jakarta.annotation.Nullable
    public PromotionsPagedCollection get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, PromotionsPagedCollection::createFromDiscriminatorValue);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method returns a list of a seller&apos;s undeleted discounts. &lt;p&gt;The call returns up to 200 currently-available discounts on the specified marketplace. While the response body does not include the discount&apos;s &lt;b&gt;discountRules&lt;/b&gt; or &lt;b&gt;inventoryCriterion&lt;/b&gt; containers, it does include the &lt;b&gt;promotionHref&lt;/b&gt; (which you can use to retrieve the complete details of the discount).&lt;/p&gt;  &lt;p&gt;Use query parameters to sort and filter the results by the number of discounts to return, the discount state or type, and the eBay marketplace. You can also supply keywords to limit the response to the discounts that contain that keywords in the title of the discount.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Maximum returned:&lt;/b&gt; 200&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method returns a list of a seller&apos;s undeleted discounts. &lt;p&gt;The call returns up to 200 currently-available discounts on the specified marketplace. While the response body does not include the discount&apos;s &lt;b&gt;discountRules&lt;/b&gt; or &lt;b&gt;inventoryCriterion&lt;/b&gt; containers, it does include the &lt;b&gt;promotionHref&lt;/b&gt; (which you can use to retrieve the complete details of the discount).&lt;/p&gt;  &lt;p&gt;Use query parameters to sort and filter the results by the number of discounts to return, the discount state or type, and the eBay marketplace. You can also supply keywords to limit the response to the discounts that contain that keywords in the title of the discount.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Maximum returned:&lt;/b&gt; 200&lt;/p&gt;
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link PromotionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PromotionRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PromotionRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method returns a list of a seller&apos;s undeleted discounts. &lt;p&gt;The call returns up to 200 currently-available discounts on the specified marketplace. While the response body does not include the discount&apos;s &lt;b&gt;discountRules&lt;/b&gt; or &lt;b&gt;inventoryCriterion&lt;/b&gt; containers, it does include the &lt;b&gt;promotionHref&lt;/b&gt; (which you can use to retrieve the complete details of the discount).&lt;/p&gt;  &lt;p&gt;Use query parameters to sort and filter the results by the number of discounts to return, the discount state or type, and the eBay marketplace. You can also supply keywords to limit the response to the discounts that contain that keywords in the title of the discount.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Maximum returned:&lt;/b&gt; 200&lt;/p&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Specifies the maximum number of discounts returned on a page from the result set.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; 200 &lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 200
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * This parameter specifies eBay marketplace ID of the site where the discount is hosted.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/api-docs/sell/marketing/types/ba:MarketplaceIdEnum&quot;&gt;MarketplaceIdEnum&lt;/a&gt; for supported Marketplace ID values.
         */
        @jakarta.annotation.Nullable
        public String marketplaceId;
        /**
         * Specifies the number of discounts to skip in the result set before returning the first discount in the paginated response.  &lt;p&gt;Combine &lt;b&gt;offset&lt;/b&gt; with the &lt;b&gt;limit&lt;/b&gt; query parameter to control the items returned in the response. For example, if you supply an &lt;b&gt;offset&lt;/b&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;b&gt;limit&lt;/b&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If &lt;b&gt;offset&lt;/b&gt; is &lt;code&gt;10&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is &lt;code&gt;20&lt;/code&gt;, the first page of the response contains items 11-30 from the complete result set.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Default:&lt;/b&gt; 0&lt;/p&gt;
         */
        @jakarta.annotation.Nullable
        public String offset;
        /**
         * This parameter specifies the discount state by which you want to filter the results. The response contains only those discounts that match the state you specify. &lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/api-docs/sell/marketing/types/sme:PromotionStatusEnum&quot; target=&quot;_blank&quot;&gt;PromotionStatusEnum&lt;/a&gt; for supported values.&lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum number of input values:&lt;/b&gt; 1
         */
        @jakarta.annotation.Nullable
        public String promotionStatus;
        /**
         * This parameter specifies the campaign discounts type by which you want to filter the results.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/api-docs/sell/marketing/types/sme:PromotionTypeEnum&quot; target=&quot;_blank&quot;&gt;PromotionTypeEnum&lt;/a&gt; for supported values.
         */
        @jakarta.annotation.Nullable
        public String promotionType;
        /**
         * A string consisting of one or more &lt;i&gt;keywords&lt;/i&gt;. eBay filters the response by returning only the discounts that contain the supplied keywords in the title.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &quot;iPhone&quot; or &quot;Harry Potter.&quot;  &lt;br&gt;&lt;br&gt;Commas that separate keywords are ignored. For example, a keyword string of &quot;iPhone, iPad&quot; equals &quot;iPhone iPad&quot;, and each results in a response that contains discounts with both &quot;iPhone&quot; and &quot;iPad&quot; in the title.
         */
        @jakarta.annotation.Nullable
        public String q;
        /**
         * Specifies the order for how to sort the response. If you precede the supplied value with a dash, the response is sorted in reverse order.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;sort=END_DATE&lt;/code&gt; &amp;nbsp; Sorts the discounts in the response by their end dates in ascending order &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;sort=-PROMOTION_NAME&lt;/code&gt; &amp;nbsp; Sorts the discounts by their name in descending alphabetical order (Z-Az-a)  &lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;START_DATE&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;END_DATE&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;PROMOTION_NAME&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/marketing/types/csb:SortField
         */
        @jakarta.annotation.Nullable
        public String sort;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("limit", limit);
            allQueryParams.put("marketplace_id", marketplaceId);
            allQueryParams.put("offset", offset);
            allQueryParams.put("promotion_status", promotionStatus);
            allQueryParams.put("promotion_type", promotionType);
            allQueryParams.put("q", q);
            allQueryParams.put("sort", sort);
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
}
