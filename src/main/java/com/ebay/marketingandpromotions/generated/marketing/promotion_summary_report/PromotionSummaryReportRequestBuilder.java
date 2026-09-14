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

package com.ebay.marketingandpromotions.generated.marketing.promotion_summary_report;

import com.ebay.marketingandpromotions.generated.marketing.models.Error;
import com.ebay.marketingandpromotions.generated.marketing.models.SummaryReportResponse;
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
 * Builds and executes requests for operations under /promotion_summary_report
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PromotionSummaryReportRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link PromotionSummaryReportRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PromotionSummaryReportRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/promotion_summary_report?marketplace_id={marketplace_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link PromotionSummaryReportRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PromotionSummaryReportRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/promotion_summary_report?marketplace_id={marketplace_id}", rawUrl);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method generates a report that summarizes the seller&apos;s discounts for the specified eBay marketplace. The report returns information on &lt;code&gt;RUNNING&lt;/code&gt;, &lt;code&gt;PAUSED&lt;/code&gt;, and &lt;code&gt;ENDED&lt;/code&gt; discounts (deleted reports are not returned) and summarizes the seller&apos;s campaign performance for all discounts on a given site.  &lt;br&gt;&lt;br&gt;For information about summary reports, see &lt;a href=&quot;/api-docs/sell/static/marketing/pm-summary-report.html&quot; target=&quot;_blank&quot;&gt;Reading the item discount Summary report&lt;/a&gt;.
     * @return a {@link SummaryReportResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public SummaryReportResponse get() {
        return get(null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method generates a report that summarizes the seller&apos;s discounts for the specified eBay marketplace. The report returns information on &lt;code&gt;RUNNING&lt;/code&gt;, &lt;code&gt;PAUSED&lt;/code&gt;, and &lt;code&gt;ENDED&lt;/code&gt; discounts (deleted reports are not returned) and summarizes the seller&apos;s campaign performance for all discounts on a given site.  &lt;br&gt;&lt;br&gt;For information about summary reports, see &lt;a href=&quot;/api-docs/sell/static/marketing/pm-summary-report.html&quot; target=&quot;_blank&quot;&gt;Reading the item discount Summary report&lt;/a&gt;.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SummaryReportResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public SummaryReportResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SummaryReportResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method generates a report that summarizes the seller&apos;s discounts for the specified eBay marketplace. The report returns information on &lt;code&gt;RUNNING&lt;/code&gt;, &lt;code&gt;PAUSED&lt;/code&gt;, and &lt;code&gt;ENDED&lt;/code&gt; discounts (deleted reports are not returned) and summarizes the seller&apos;s campaign performance for all discounts on a given site.  &lt;br&gt;&lt;br&gt;For information about summary reports, see &lt;a href=&quot;/api-docs/sell/static/marketing/pm-summary-report.html&quot; target=&quot;_blank&quot;&gt;Reading the item discount Summary report&lt;/a&gt;.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method generates a report that summarizes the seller&apos;s discounts for the specified eBay marketplace. The report returns information on &lt;code&gt;RUNNING&lt;/code&gt;, &lt;code&gt;PAUSED&lt;/code&gt;, and &lt;code&gt;ENDED&lt;/code&gt; discounts (deleted reports are not returned) and summarizes the seller&apos;s campaign performance for all discounts on a given site.  &lt;br&gt;&lt;br&gt;For information about summary reports, see &lt;a href=&quot;/api-docs/sell/static/marketing/pm-summary-report.html&quot; target=&quot;_blank&quot;&gt;Reading the item discount Summary report&lt;/a&gt;.
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
     * @return a {@link PromotionSummaryReportRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PromotionSummaryReportRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PromotionSummaryReportRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method generates a report that summarizes the seller&apos;s discounts for the specified eBay marketplace. The report returns information on &lt;code&gt;RUNNING&lt;/code&gt;, &lt;code&gt;PAUSED&lt;/code&gt;, and &lt;code&gt;ENDED&lt;/code&gt; discounts (deleted reports are not returned) and summarizes the seller&apos;s campaign performance for all discounts on a given site.  &lt;br&gt;&lt;br&gt;For information about summary reports, see &lt;a href=&quot;/api-docs/sell/static/marketing/pm-summary-report.html&quot; target=&quot;_blank&quot;&gt;Reading the item discount Summary report&lt;/a&gt;.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This parameter specifies the eBay marketplace ID of the site for which you want a discount summary report.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/develop/api/sell/request_headers#marketplace-id-values&quot; target=&quot;_blank&quot;&gt;Marketplace ID values&lt;/a&gt; for supported Marketplace ID values.
         */
        @jakarta.annotation.Nullable
        public String marketplaceId;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("marketplace_id", marketplaceId);
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
