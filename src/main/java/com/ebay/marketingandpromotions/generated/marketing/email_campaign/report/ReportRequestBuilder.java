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

package com.ebay.marketingandpromotions.generated.marketing.email_campaign.report;

import com.ebay.marketingandpromotions.generated.marketing.models.GetEmailReportResponse;
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
 * Builds and executes requests for operations under /email_campaign/report
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReportRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ReportRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReportRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/email_campaign/report?endDate={endDate}&startDate={startDate}", pathParameters);
    }
    /**
     * Instantiates a new {@link ReportRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReportRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/email_campaign/report?endDate={endDate}&startDate={startDate}", rawUrl);
    }
    /**
     * This method returns the seller&apos;s email campaign performance report for a time period specified by the &lt;b&gt;startDate&lt;/b&gt; and &lt;b&gt;endDate&lt;/b&gt; path parameters. The maximum date range for a report retrieved by this method is one year. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;The &lt;b&gt;startDate&lt;/b&gt; and &lt;b&gt;endDate&lt;/b&gt; must be given in UTC format, as shown in the following example: &lt;br&gt;&lt;code&gt;sell/marketing/v1/email_campaign/report?startDate=2022-11-01T19:09:02.768Z&amp;endDate=2022-12-28T19:09:02.768Z&lt;/code&gt;&lt;/span&gt;&lt;br&gt;The email report returns a list of metrics, such as the number of times an email report has been opened and resulted in clicks.
     * @return a {@link GetEmailReportResponse}
     */
    @jakarta.annotation.Nullable
    public GetEmailReportResponse get() {
        return get(null);
    }
    /**
     * This method returns the seller&apos;s email campaign performance report for a time period specified by the &lt;b&gt;startDate&lt;/b&gt; and &lt;b&gt;endDate&lt;/b&gt; path parameters. The maximum date range for a report retrieved by this method is one year. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;The &lt;b&gt;startDate&lt;/b&gt; and &lt;b&gt;endDate&lt;/b&gt; must be given in UTC format, as shown in the following example: &lt;br&gt;&lt;code&gt;sell/marketing/v1/email_campaign/report?startDate=2022-11-01T19:09:02.768Z&amp;endDate=2022-12-28T19:09:02.768Z&lt;/code&gt;&lt;/span&gt;&lt;br&gt;The email report returns a list of metrics, such as the number of times an email report has been opened and resulted in clicks.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetEmailReportResponse}
     */
    @jakarta.annotation.Nullable
    public GetEmailReportResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, GetEmailReportResponse::createFromDiscriminatorValue);
    }
    /**
     * This method returns the seller&apos;s email campaign performance report for a time period specified by the &lt;b&gt;startDate&lt;/b&gt; and &lt;b&gt;endDate&lt;/b&gt; path parameters. The maximum date range for a report retrieved by this method is one year. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;The &lt;b&gt;startDate&lt;/b&gt; and &lt;b&gt;endDate&lt;/b&gt; must be given in UTC format, as shown in the following example: &lt;br&gt;&lt;code&gt;sell/marketing/v1/email_campaign/report?startDate=2022-11-01T19:09:02.768Z&amp;endDate=2022-12-28T19:09:02.768Z&lt;/code&gt;&lt;/span&gt;&lt;br&gt;The email report returns a list of metrics, such as the number of times an email report has been opened and resulted in clicks.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method returns the seller&apos;s email campaign performance report for a time period specified by the &lt;b&gt;startDate&lt;/b&gt; and &lt;b&gt;endDate&lt;/b&gt; path parameters. The maximum date range for a report retrieved by this method is one year. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;The &lt;b&gt;startDate&lt;/b&gt; and &lt;b&gt;endDate&lt;/b&gt; must be given in UTC format, as shown in the following example: &lt;br&gt;&lt;code&gt;sell/marketing/v1/email_campaign/report?startDate=2022-11-01T19:09:02.768Z&amp;endDate=2022-12-28T19:09:02.768Z&lt;/code&gt;&lt;/span&gt;&lt;br&gt;The email report returns a list of metrics, such as the number of times an email report has been opened and resulted in clicks.
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
     * @return a {@link ReportRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReportRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ReportRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method returns the seller&apos;s email campaign performance report for a time period specified by the &lt;b&gt;startDate&lt;/b&gt; and &lt;b&gt;endDate&lt;/b&gt; path parameters. The maximum date range for a report retrieved by this method is one year. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;The &lt;b&gt;startDate&lt;/b&gt; and &lt;b&gt;endDate&lt;/b&gt; must be given in UTC format, as shown in the following example: &lt;br&gt;&lt;code&gt;sell/marketing/v1/email_campaign/report?startDate=2022-11-01T19:09:02.768Z&amp;endDate=2022-12-28T19:09:02.768Z&lt;/code&gt;&lt;/span&gt;&lt;br&gt;The email report returns a list of metrics, such as the number of times an email report has been opened and resulted in clicks.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * The end date for the report, given in UTC format. The maximum date range for a report retrieved by this method is one year.
         */
        @jakarta.annotation.Nullable
        public String endDate;
        /**
         * The start date for the report, given in UTC format. The maximum date range for a report retrieved by this method is one year.
         */
        @jakarta.annotation.Nullable
        public String startDate;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("endDate", endDate);
            allQueryParams.put("startDate", startDate);
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
