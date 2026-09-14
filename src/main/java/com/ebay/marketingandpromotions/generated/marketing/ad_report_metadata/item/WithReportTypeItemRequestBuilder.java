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

package com.ebay.marketingandpromotions.generated.marketing.ad_report_metadata.item;

import com.ebay.marketingandpromotions.generated.marketing.models.Error;
import com.ebay.marketingandpromotions.generated.marketing.models.ReportMetadata;
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
 * Builds and executes requests for operations under /ad_report_metadata/{report_type}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithReportTypeItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithReportTypeItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithReportTypeItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_report_metadata/{report_type}{?channel*,funding_model*}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithReportTypeItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithReportTypeItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_report_metadata/{report_type}{?channel*,funding_model*}", rawUrl);
    }
    /**
     * This call retrieves metadata that details the fields used by a specific Promoted Listings report type. Use the &lt;b&gt;report_type&lt;/b&gt; path parameter to indicate metadata to retrieve.&lt;br/&gt;&lt;br/&gt;This method does not use a request payload.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The reporting of some data related to sales and ad-fees may require a 72-hour (&lt;b&gt;maximum&lt;/b&gt;) adjustment period which is often referred to as the &lt;i&gt;Reconciliation Period&lt;/i&gt;. Such adjustment periods should, on average, be minimal. However, at any given time, the &lt;b&gt;payments&lt;/b&gt; tab may be used to view those amounts that have actually been charged.&lt;/span&gt;
     * @return a {@link ReportMetadata}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public ReportMetadata get() {
        return get(null);
    }
    /**
     * This call retrieves metadata that details the fields used by a specific Promoted Listings report type. Use the &lt;b&gt;report_type&lt;/b&gt; path parameter to indicate metadata to retrieve.&lt;br/&gt;&lt;br/&gt;This method does not use a request payload.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The reporting of some data related to sales and ad-fees may require a 72-hour (&lt;b&gt;maximum&lt;/b&gt;) adjustment period which is often referred to as the &lt;i&gt;Reconciliation Period&lt;/i&gt;. Such adjustment periods should, on average, be minimal. However, at any given time, the &lt;b&gt;payments&lt;/b&gt; tab may be used to view those amounts that have actually been charged.&lt;/span&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ReportMetadata}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public ReportMetadata get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("403", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ReportMetadata::createFromDiscriminatorValue);
    }
    /**
     * This call retrieves metadata that details the fields used by a specific Promoted Listings report type. Use the &lt;b&gt;report_type&lt;/b&gt; path parameter to indicate metadata to retrieve.&lt;br/&gt;&lt;br/&gt;This method does not use a request payload.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The reporting of some data related to sales and ad-fees may require a 72-hour (&lt;b&gt;maximum&lt;/b&gt;) adjustment period which is often referred to as the &lt;i&gt;Reconciliation Period&lt;/i&gt;. Such adjustment periods should, on average, be minimal. However, at any given time, the &lt;b&gt;payments&lt;/b&gt; tab may be used to view those amounts that have actually been charged.&lt;/span&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This call retrieves metadata that details the fields used by a specific Promoted Listings report type. Use the &lt;b&gt;report_type&lt;/b&gt; path parameter to indicate metadata to retrieve.&lt;br/&gt;&lt;br/&gt;This method does not use a request payload.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The reporting of some data related to sales and ad-fees may require a 72-hour (&lt;b&gt;maximum&lt;/b&gt;) adjustment period which is often referred to as the &lt;i&gt;Reconciliation Period&lt;/i&gt;. Such adjustment periods should, on average, be minimal. However, at any given time, the &lt;b&gt;payments&lt;/b&gt; tab may be used to view those amounts that have actually been charged.&lt;/span&gt;
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
     * @return a {@link WithReportTypeItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithReportTypeItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithReportTypeItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This call retrieves metadata that details the fields used by a specific Promoted Listings report type. Use the &lt;b&gt;report_type&lt;/b&gt; path parameter to indicate metadata to retrieve.&lt;br/&gt;&lt;br/&gt;This method does not use a request payload.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The reporting of some data related to sales and ad-fees may require a 72-hour (&lt;b&gt;maximum&lt;/b&gt;) adjustment period which is often referred to as the &lt;i&gt;Reconciliation Period&lt;/i&gt;. Such adjustment periods should, on average, be minimal. However, at any given time, the &lt;b&gt;payments&lt;/b&gt; tab may be used to view those amounts that have actually been charged.&lt;/span&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * The channel used in the report. The channel must be compatible with the report type specified in the path parameter. Refer to the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_report_task-getreporttasks.channelenum&quot;&gt;ChannelEnum&lt;/a&gt; type for supported values. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The channel parameter is only applicable for COST_PER_CLICK funding model.&lt;/span&gt;
         */
        @jakarta.annotation.Nullable
        public String channel;
        /**
         * The funding model used in the report. The funding model must be compatible with the report type specified in the path parameter. Refer to the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_report_task-getreporttasks.fundingmodelenum&quot;&gt;FundingModelEnum&lt;/a&gt; type for supported values.
         */
        @jakarta.annotation.Nullable
        public String fundingModel;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("channel", channel);
            allQueryParams.put("funding_model", fundingModel);
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
