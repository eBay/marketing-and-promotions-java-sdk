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

package com.ebay.marketingandpromotions.generated.marketing.promotion.item.get_listing_set;

import com.ebay.marketingandpromotions.generated.marketing.models.Error;
import com.ebay.marketingandpromotions.generated.marketing.models.ItemMarkdownStatusEnum;
import com.ebay.marketingandpromotions.generated.marketing.models.ItemsPagedCollection;
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
 * Builds and executes requests for operations under /promotion/{promotion_id}/get_listing_set
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetListingSetRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetListingSetRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetListingSetRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/promotion/{promotion_id}/get_listing_set{?limit*,offset*,q*,sort*,status*}", pathParameters);
    }
    /**
     * Instantiates a new {@link GetListingSetRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetListingSetRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/promotion/{promotion_id}/get_listing_set{?limit*,offset*,q*,sort*,status*}", rawUrl);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method returns the set of listings associated with the &lt;b&gt;promotion_id&lt;/b&gt; specified in the path parameter. Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-promotion-getpromotions&quot;&gt;getPromotions&lt;/a&gt; to retrieve the IDs of a seller&apos;s discounts.  &lt;p&gt;The listing details are returned in a paginated set and you can control and results returned using the following query parameters: &lt;b&gt;limit&lt;/b&gt;, &lt;b&gt;offset&lt;/b&gt;, &lt;b&gt;q&lt;/b&gt;, &lt;b&gt;sort&lt;/b&gt;, and &lt;b&gt;status&lt;/b&gt;.&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;&lt;b&gt;Maximum associated listings returned:&lt;/b&gt; 200&lt;/li&gt;  &lt;li&gt;&lt;b&gt;Default number of listings returned:&lt;/b&gt; 200&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link ItemsPagedCollection}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public ItemsPagedCollection get() {
        return get(null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method returns the set of listings associated with the &lt;b&gt;promotion_id&lt;/b&gt; specified in the path parameter. Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-promotion-getpromotions&quot;&gt;getPromotions&lt;/a&gt; to retrieve the IDs of a seller&apos;s discounts.  &lt;p&gt;The listing details are returned in a paginated set and you can control and results returned using the following query parameters: &lt;b&gt;limit&lt;/b&gt;, &lt;b&gt;offset&lt;/b&gt;, &lt;b&gt;q&lt;/b&gt;, &lt;b&gt;sort&lt;/b&gt;, and &lt;b&gt;status&lt;/b&gt;.&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;&lt;b&gt;Maximum associated listings returned:&lt;/b&gt; 200&lt;/li&gt;  &lt;li&gt;&lt;b&gt;Default number of listings returned:&lt;/b&gt; 200&lt;/li&gt;&lt;/ul&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ItemsPagedCollection}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public ItemsPagedCollection get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ItemsPagedCollection::createFromDiscriminatorValue);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method returns the set of listings associated with the &lt;b&gt;promotion_id&lt;/b&gt; specified in the path parameter. Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-promotion-getpromotions&quot;&gt;getPromotions&lt;/a&gt; to retrieve the IDs of a seller&apos;s discounts.  &lt;p&gt;The listing details are returned in a paginated set and you can control and results returned using the following query parameters: &lt;b&gt;limit&lt;/b&gt;, &lt;b&gt;offset&lt;/b&gt;, &lt;b&gt;q&lt;/b&gt;, &lt;b&gt;sort&lt;/b&gt;, and &lt;b&gt;status&lt;/b&gt;.&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;&lt;b&gt;Maximum associated listings returned:&lt;/b&gt; 200&lt;/li&gt;  &lt;li&gt;&lt;b&gt;Default number of listings returned:&lt;/b&gt; 200&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method returns the set of listings associated with the &lt;b&gt;promotion_id&lt;/b&gt; specified in the path parameter. Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-promotion-getpromotions&quot;&gt;getPromotions&lt;/a&gt; to retrieve the IDs of a seller&apos;s discounts.  &lt;p&gt;The listing details are returned in a paginated set and you can control and results returned using the following query parameters: &lt;b&gt;limit&lt;/b&gt;, &lt;b&gt;offset&lt;/b&gt;, &lt;b&gt;q&lt;/b&gt;, &lt;b&gt;sort&lt;/b&gt;, and &lt;b&gt;status&lt;/b&gt;.&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;&lt;b&gt;Maximum associated listings returned:&lt;/b&gt; 200&lt;/li&gt;  &lt;li&gt;&lt;b&gt;Default number of listings returned:&lt;/b&gt; 200&lt;/li&gt;&lt;/ul&gt;
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
     * @return a {@link GetListingSetRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetListingSetRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetListingSetRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method returns the set of listings associated with the &lt;b&gt;promotion_id&lt;/b&gt; specified in the path parameter. Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-promotion-getpromotions&quot;&gt;getPromotions&lt;/a&gt; to retrieve the IDs of a seller&apos;s discounts.  &lt;p&gt;The listing details are returned in a paginated set and you can control and results returned using the following query parameters: &lt;b&gt;limit&lt;/b&gt;, &lt;b&gt;offset&lt;/b&gt;, &lt;b&gt;q&lt;/b&gt;, &lt;b&gt;sort&lt;/b&gt;, and &lt;b&gt;status&lt;/b&gt;.&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;&lt;b&gt;Maximum associated listings returned:&lt;/b&gt; 200&lt;/li&gt;  &lt;li&gt;&lt;b&gt;Default number of listings returned:&lt;/b&gt; 200&lt;/li&gt;&lt;/ul&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Specifies the maximum number of discounts returned on a page from the result set. &lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; 200&lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 200
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * Specifies the number of discounts to skip in the result set before returning the first discount in the paginated response.  &lt;p&gt;Combine &lt;b&gt;offset&lt;/b&gt; with the &lt;b&gt;limit&lt;/b&gt; query parameter to control the items returned in the response. For example, if you supply an &lt;b&gt;offset&lt;/b&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;b&gt;limit&lt;/b&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If &lt;b&gt;offset&lt;/b&gt; is &lt;code&gt;10&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is &lt;code&gt;20&lt;/code&gt;, the first page of the response contains items 11-30 from the complete result set.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Default:&lt;/b&gt; 0&lt;/p&gt;
         */
        @jakarta.annotation.Nullable
        public String offset;
        /**
         * Reserved for future use.
         */
        @jakarta.annotation.Nullable
        public String q;
        /**
         * Specifies the order in which to sort the associated listings in the response. If you precede the supplied value with a dash, the response is sorted in reverse order.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;sort=PRICE&lt;/code&gt; - Sorts the associated listings by their current price in ascending order &lt;br&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;code&gt;sort=-TITLE&lt;/code&gt; - Sorts the associated listings by their title in descending alphabetical order (Z-Az-a)  &lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul class=&quot;compact&quot;&gt;&lt;li&gt;AVAILABLE&lt;/li&gt; &lt;li&gt;PRICE&lt;/li&gt; &lt;li&gt;TITLE&lt;/li&gt;&lt;/ul&gt;
         */
        @jakarta.annotation.Nullable
        public String sort;
        /**
         * This query parameter applies only to markdown discounts. It filters the response based on the indicated status of the discount.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, the only supported value for this parameter is &lt;code&gt;MARKED_DOWN&lt;/code&gt;, which indicates active markdown discounts.&lt;/span&gt;
         */
        @jakarta.annotation.Nullable
        public ItemMarkdownStatusEnum status;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("status", status);
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
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
