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

package com.ebay.marketingandpromotions.generated.marketing.ad_report_task;

import com.ebay.marketingandpromotions.generated.marketing.ad_report_task.item.WithReportTaskItemRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.models.CreateReportTask;
import com.ebay.marketingandpromotions.generated.marketing.models.Error;
import com.ebay.marketingandpromotions.generated.marketing.models.ReportTaskPagedCollection;
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
 * Builds and executes requests for operations under /ad_report_task
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AdReportTaskRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.marketingandpromotions.generated.marketing.ad_report_task.item collection
     * @param report_task_id This path parameter specifies the unique identifier of the report task being retrieved.&lt;br&gt;&lt;br&gt; Use the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_report_task-getreporttasks&quot;&gt;getReportTasks&lt;/a&gt; method to retrieve report task Ids.
     * @return a {@link WithReportTaskItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithReportTaskItemRequestBuilder byReport_task_id(@jakarta.annotation.Nonnull final String report_task_id) {
        Objects.requireNonNull(report_task_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("report_task_id", report_task_id);
        return new WithReportTaskItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link AdReportTaskRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AdReportTaskRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_report_task{?limit*,offset*,report_task_statuses*}", pathParameters);
    }
    /**
     * Instantiates a new {@link AdReportTaskRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AdReportTaskRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_report_task{?limit*,offset*,report_task_statuses*}", rawUrl);
    }
    /**
     * This method returns information on all the existing report tasks related to a seller. &lt;p&gt;Use the &lt;b&gt;report_task_statuses&lt;/b&gt; query parameter to control which reports to return. You can paginate the result set by specifying a &lt;b&gt;limit&lt;/b&gt;, which dictates how many report tasks to return on each page of the response. Use the &lt;b&gt;offset&lt;/b&gt; parameter to specify how many reports to skip in the result set before returning the first result.&lt;/p&gt;&lt;br/&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;For &lt;b&gt;ad_report&lt;/b&gt; and &lt;b&gt;ad_report_task&lt;/b&gt; methods, the API call limit is subject to a per user quota. These API calls can &lt;b&gt;only&lt;/b&gt; be executed a maximum of 200 times per hour for each seller/user. If the number of calls per hour exceeds this limit, any new calls will be blocked for the next hour.&lt;/p&gt;&lt;/div&gt;
     * @return a {@link ReportTaskPagedCollection}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public ReportTaskPagedCollection get() {
        return get(null);
    }
    /**
     * This method returns information on all the existing report tasks related to a seller. &lt;p&gt;Use the &lt;b&gt;report_task_statuses&lt;/b&gt; query parameter to control which reports to return. You can paginate the result set by specifying a &lt;b&gt;limit&lt;/b&gt;, which dictates how many report tasks to return on each page of the response. Use the &lt;b&gt;offset&lt;/b&gt; parameter to specify how many reports to skip in the result set before returning the first result.&lt;/p&gt;&lt;br/&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;For &lt;b&gt;ad_report&lt;/b&gt; and &lt;b&gt;ad_report_task&lt;/b&gt; methods, the API call limit is subject to a per user quota. These API calls can &lt;b&gt;only&lt;/b&gt; be executed a maximum of 200 times per hour for each seller/user. If the number of calls per hour exceeds this limit, any new calls will be blocked for the next hour.&lt;/p&gt;&lt;/div&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ReportTaskPagedCollection}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public ReportTaskPagedCollection get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ReportTaskPagedCollection::createFromDiscriminatorValue);
    }
    /**
     * This method creates a &lt;i&gt;report task&lt;/i&gt;, which generates a Promoted Listings report based on the values specified in the call.&lt;br /&gt;&lt;br /&gt;The report is generated based on the criteria you specify, including the report type, the report&apos;s dimensions and metrics, the report&apos;s start and end dates, the listings to include in the report, and more. &lt;i&gt;Metrics &lt;/i&gt;are the quantitative measurements in the report while &lt;i&gt;dimensions&lt;/i&gt; specify the attributes of the data included in the reports.&lt;br /&gt;&lt;br /&gt;When creating a report task, you can specify the items you want included in the report. The items you specify, using either &lt;b&gt;listingId&lt;/b&gt; or &lt;b&gt;inventoryReference&lt;/b&gt; values, must be in a Promoted Listings campaign for them to be included in the report.&lt;br /&gt;&lt;br /&gt;For details on the required and optional fields for each report type, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-reports.html&quot; target=&quot;_blank&quot;&gt;Promoted Listings reporting&lt;/a&gt;.&lt;br /&gt;&lt;br /&gt;This call returns the URL to the report task in the &lt;b&gt;Location&lt;/b&gt; response header, and the URL includes the report-task ID.&lt;br /&gt;&lt;br /&gt;Reports often take time to generate and it&apos;s common for this call to return an HTTP status of &lt;code&gt;202&lt;/code&gt;, which indicates the report is being generated. Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_report_task-getreporttasks&quot;&gt;getReportTasks&lt;/a&gt; (or &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_report_task-getreporttask&quot;&gt;getReportTask&lt;/a&gt; with the report-task ID) to determine the status of a Promoted Listings report. When a report is complete, eBay sets its status to &lt;b&gt;SUCCESS&lt;/b&gt; and you can download it using the URL returned in the &lt;b&gt;reportHref&lt;/b&gt; field of the &lt;b&gt;getReportTask&lt;/b&gt; call. Report files are tab-separated value gzip files with a file extension of &lt;code&gt;.tsv.gz&lt;/code&gt;.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The reporting of some data related to sales and ad-fees may require a 72-hour (&lt;b&gt;maximum&lt;/b&gt;) adjustment period which is often referred to as the &lt;i&gt;Reconciliation Period&lt;/i&gt;. Such adjustment periods should, on average, be minimal. However, at any given time, the &lt;b&gt;payments&lt;/b&gt; tab may be used to view those amounts that have actually been charged.&lt;/span&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; This call fails if you don&apos;t submit all the required fields for the specified report type. Fields not supported by the specified report type are ignored. Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_report_metadata-getreportmetadata&quot;&gt;getReportMetadata&lt;/a&gt; to retrieve a list of the fields you need to configure for each Promoted Listings report type.&lt;/span&gt;&lt;br/&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;For &lt;b&gt;ad_report&lt;/b&gt; and &lt;b&gt;ad_report_task&lt;/b&gt; methods, the API call limit is subject to a per user quota. These API calls can &lt;b&gt;only&lt;/b&gt; be executed a maximum of 200 times per hour for each seller/user. If the number of calls per hour exceeds this limit, any new calls will be blocked for the next hour.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; The data threshold for a single report is currently 1 million records; if this threshold is exceeded, the report will fail.&lt;/p&gt;&lt;/div&gt;
     * @param body The container for the fields that define the report task.
     * @return a {@link Error}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public Error post(@jakarta.annotation.Nonnull final CreateReportTask body) {
        return post(body, null);
    }
    /**
     * This method creates a &lt;i&gt;report task&lt;/i&gt;, which generates a Promoted Listings report based on the values specified in the call.&lt;br /&gt;&lt;br /&gt;The report is generated based on the criteria you specify, including the report type, the report&apos;s dimensions and metrics, the report&apos;s start and end dates, the listings to include in the report, and more. &lt;i&gt;Metrics &lt;/i&gt;are the quantitative measurements in the report while &lt;i&gt;dimensions&lt;/i&gt; specify the attributes of the data included in the reports.&lt;br /&gt;&lt;br /&gt;When creating a report task, you can specify the items you want included in the report. The items you specify, using either &lt;b&gt;listingId&lt;/b&gt; or &lt;b&gt;inventoryReference&lt;/b&gt; values, must be in a Promoted Listings campaign for them to be included in the report.&lt;br /&gt;&lt;br /&gt;For details on the required and optional fields for each report type, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-reports.html&quot; target=&quot;_blank&quot;&gt;Promoted Listings reporting&lt;/a&gt;.&lt;br /&gt;&lt;br /&gt;This call returns the URL to the report task in the &lt;b&gt;Location&lt;/b&gt; response header, and the URL includes the report-task ID.&lt;br /&gt;&lt;br /&gt;Reports often take time to generate and it&apos;s common for this call to return an HTTP status of &lt;code&gt;202&lt;/code&gt;, which indicates the report is being generated. Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_report_task-getreporttasks&quot;&gt;getReportTasks&lt;/a&gt; (or &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_report_task-getreporttask&quot;&gt;getReportTask&lt;/a&gt; with the report-task ID) to determine the status of a Promoted Listings report. When a report is complete, eBay sets its status to &lt;b&gt;SUCCESS&lt;/b&gt; and you can download it using the URL returned in the &lt;b&gt;reportHref&lt;/b&gt; field of the &lt;b&gt;getReportTask&lt;/b&gt; call. Report files are tab-separated value gzip files with a file extension of &lt;code&gt;.tsv.gz&lt;/code&gt;.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The reporting of some data related to sales and ad-fees may require a 72-hour (&lt;b&gt;maximum&lt;/b&gt;) adjustment period which is often referred to as the &lt;i&gt;Reconciliation Period&lt;/i&gt;. Such adjustment periods should, on average, be minimal. However, at any given time, the &lt;b&gt;payments&lt;/b&gt; tab may be used to view those amounts that have actually been charged.&lt;/span&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; This call fails if you don&apos;t submit all the required fields for the specified report type. Fields not supported by the specified report type are ignored. Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_report_metadata-getreportmetadata&quot;&gt;getReportMetadata&lt;/a&gt; to retrieve a list of the fields you need to configure for each Promoted Listings report type.&lt;/span&gt;&lt;br/&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;For &lt;b&gt;ad_report&lt;/b&gt; and &lt;b&gt;ad_report_task&lt;/b&gt; methods, the API call limit is subject to a per user quota. These API calls can &lt;b&gt;only&lt;/b&gt; be executed a maximum of 200 times per hour for each seller/user. If the number of calls per hour exceeds this limit, any new calls will be blocked for the next hour.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; The data threshold for a single report is currently 1 million records; if this threshold is exceeded, the report will fail.&lt;/p&gt;&lt;/div&gt;
     * @param body The container for the fields that define the report task.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Error}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public Error post(@jakarta.annotation.Nonnull final CreateReportTask body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("403", Error::createFromDiscriminatorValue);
        errorMapping.put("409", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Error::createFromDiscriminatorValue);
    }
    /**
     * This method returns information on all the existing report tasks related to a seller. &lt;p&gt;Use the &lt;b&gt;report_task_statuses&lt;/b&gt; query parameter to control which reports to return. You can paginate the result set by specifying a &lt;b&gt;limit&lt;/b&gt;, which dictates how many report tasks to return on each page of the response. Use the &lt;b&gt;offset&lt;/b&gt; parameter to specify how many reports to skip in the result set before returning the first result.&lt;/p&gt;&lt;br/&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;For &lt;b&gt;ad_report&lt;/b&gt; and &lt;b&gt;ad_report_task&lt;/b&gt; methods, the API call limit is subject to a per user quota. These API calls can &lt;b&gt;only&lt;/b&gt; be executed a maximum of 200 times per hour for each seller/user. If the number of calls per hour exceeds this limit, any new calls will be blocked for the next hour.&lt;/p&gt;&lt;/div&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method returns information on all the existing report tasks related to a seller. &lt;p&gt;Use the &lt;b&gt;report_task_statuses&lt;/b&gt; query parameter to control which reports to return. You can paginate the result set by specifying a &lt;b&gt;limit&lt;/b&gt;, which dictates how many report tasks to return on each page of the response. Use the &lt;b&gt;offset&lt;/b&gt; parameter to specify how many reports to skip in the result set before returning the first result.&lt;/p&gt;&lt;br/&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;For &lt;b&gt;ad_report&lt;/b&gt; and &lt;b&gt;ad_report_task&lt;/b&gt; methods, the API call limit is subject to a per user quota. These API calls can &lt;b&gt;only&lt;/b&gt; be executed a maximum of 200 times per hour for each seller/user. If the number of calls per hour exceeds this limit, any new calls will be blocked for the next hour.&lt;/p&gt;&lt;/div&gt;
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
     * This method creates a &lt;i&gt;report task&lt;/i&gt;, which generates a Promoted Listings report based on the values specified in the call.&lt;br /&gt;&lt;br /&gt;The report is generated based on the criteria you specify, including the report type, the report&apos;s dimensions and metrics, the report&apos;s start and end dates, the listings to include in the report, and more. &lt;i&gt;Metrics &lt;/i&gt;are the quantitative measurements in the report while &lt;i&gt;dimensions&lt;/i&gt; specify the attributes of the data included in the reports.&lt;br /&gt;&lt;br /&gt;When creating a report task, you can specify the items you want included in the report. The items you specify, using either &lt;b&gt;listingId&lt;/b&gt; or &lt;b&gt;inventoryReference&lt;/b&gt; values, must be in a Promoted Listings campaign for them to be included in the report.&lt;br /&gt;&lt;br /&gt;For details on the required and optional fields for each report type, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-reports.html&quot; target=&quot;_blank&quot;&gt;Promoted Listings reporting&lt;/a&gt;.&lt;br /&gt;&lt;br /&gt;This call returns the URL to the report task in the &lt;b&gt;Location&lt;/b&gt; response header, and the URL includes the report-task ID.&lt;br /&gt;&lt;br /&gt;Reports often take time to generate and it&apos;s common for this call to return an HTTP status of &lt;code&gt;202&lt;/code&gt;, which indicates the report is being generated. Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_report_task-getreporttasks&quot;&gt;getReportTasks&lt;/a&gt; (or &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_report_task-getreporttask&quot;&gt;getReportTask&lt;/a&gt; with the report-task ID) to determine the status of a Promoted Listings report. When a report is complete, eBay sets its status to &lt;b&gt;SUCCESS&lt;/b&gt; and you can download it using the URL returned in the &lt;b&gt;reportHref&lt;/b&gt; field of the &lt;b&gt;getReportTask&lt;/b&gt; call. Report files are tab-separated value gzip files with a file extension of &lt;code&gt;.tsv.gz&lt;/code&gt;.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The reporting of some data related to sales and ad-fees may require a 72-hour (&lt;b&gt;maximum&lt;/b&gt;) adjustment period which is often referred to as the &lt;i&gt;Reconciliation Period&lt;/i&gt;. Such adjustment periods should, on average, be minimal. However, at any given time, the &lt;b&gt;payments&lt;/b&gt; tab may be used to view those amounts that have actually been charged.&lt;/span&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; This call fails if you don&apos;t submit all the required fields for the specified report type. Fields not supported by the specified report type are ignored. Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_report_metadata-getreportmetadata&quot;&gt;getReportMetadata&lt;/a&gt; to retrieve a list of the fields you need to configure for each Promoted Listings report type.&lt;/span&gt;&lt;br/&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;For &lt;b&gt;ad_report&lt;/b&gt; and &lt;b&gt;ad_report_task&lt;/b&gt; methods, the API call limit is subject to a per user quota. These API calls can &lt;b&gt;only&lt;/b&gt; be executed a maximum of 200 times per hour for each seller/user. If the number of calls per hour exceeds this limit, any new calls will be blocked for the next hour.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; The data threshold for a single report is currently 1 million records; if this threshold is exceeded, the report will fail.&lt;/p&gt;&lt;/div&gt;
     * @param body The container for the fields that define the report task.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateReportTask body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method creates a &lt;i&gt;report task&lt;/i&gt;, which generates a Promoted Listings report based on the values specified in the call.&lt;br /&gt;&lt;br /&gt;The report is generated based on the criteria you specify, including the report type, the report&apos;s dimensions and metrics, the report&apos;s start and end dates, the listings to include in the report, and more. &lt;i&gt;Metrics &lt;/i&gt;are the quantitative measurements in the report while &lt;i&gt;dimensions&lt;/i&gt; specify the attributes of the data included in the reports.&lt;br /&gt;&lt;br /&gt;When creating a report task, you can specify the items you want included in the report. The items you specify, using either &lt;b&gt;listingId&lt;/b&gt; or &lt;b&gt;inventoryReference&lt;/b&gt; values, must be in a Promoted Listings campaign for them to be included in the report.&lt;br /&gt;&lt;br /&gt;For details on the required and optional fields for each report type, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-reports.html&quot; target=&quot;_blank&quot;&gt;Promoted Listings reporting&lt;/a&gt;.&lt;br /&gt;&lt;br /&gt;This call returns the URL to the report task in the &lt;b&gt;Location&lt;/b&gt; response header, and the URL includes the report-task ID.&lt;br /&gt;&lt;br /&gt;Reports often take time to generate and it&apos;s common for this call to return an HTTP status of &lt;code&gt;202&lt;/code&gt;, which indicates the report is being generated. Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_report_task-getreporttasks&quot;&gt;getReportTasks&lt;/a&gt; (or &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_report_task-getreporttask&quot;&gt;getReportTask&lt;/a&gt; with the report-task ID) to determine the status of a Promoted Listings report. When a report is complete, eBay sets its status to &lt;b&gt;SUCCESS&lt;/b&gt; and you can download it using the URL returned in the &lt;b&gt;reportHref&lt;/b&gt; field of the &lt;b&gt;getReportTask&lt;/b&gt; call. Report files are tab-separated value gzip files with a file extension of &lt;code&gt;.tsv.gz&lt;/code&gt;.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The reporting of some data related to sales and ad-fees may require a 72-hour (&lt;b&gt;maximum&lt;/b&gt;) adjustment period which is often referred to as the &lt;i&gt;Reconciliation Period&lt;/i&gt;. Such adjustment periods should, on average, be minimal. However, at any given time, the &lt;b&gt;payments&lt;/b&gt; tab may be used to view those amounts that have actually been charged.&lt;/span&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; This call fails if you don&apos;t submit all the required fields for the specified report type. Fields not supported by the specified report type are ignored. Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_report_metadata-getreportmetadata&quot;&gt;getReportMetadata&lt;/a&gt; to retrieve a list of the fields you need to configure for each Promoted Listings report type.&lt;/span&gt;&lt;br/&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;For &lt;b&gt;ad_report&lt;/b&gt; and &lt;b&gt;ad_report_task&lt;/b&gt; methods, the API call limit is subject to a per user quota. These API calls can &lt;b&gt;only&lt;/b&gt; be executed a maximum of 200 times per hour for each seller/user. If the number of calls per hour exceeds this limit, any new calls will be blocked for the next hour.&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; The data threshold for a single report is currently 1 million records; if this threshold is exceeded, the report will fail.&lt;/p&gt;&lt;/div&gt;
     * @param body The container for the fields that define the report task.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateReportTask body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link AdReportTaskRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AdReportTaskRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AdReportTaskRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method returns information on all the existing report tasks related to a seller. &lt;p&gt;Use the &lt;b&gt;report_task_statuses&lt;/b&gt; query parameter to control which reports to return. You can paginate the result set by specifying a &lt;b&gt;limit&lt;/b&gt;, which dictates how many report tasks to return on each page of the response. Use the &lt;b&gt;offset&lt;/b&gt; parameter to specify how many reports to skip in the result set before returning the first result.&lt;/p&gt;&lt;br/&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt;For &lt;b&gt;ad_report&lt;/b&gt; and &lt;b&gt;ad_report_task&lt;/b&gt; methods, the API call limit is subject to a per user quota. These API calls can &lt;b&gt;only&lt;/b&gt; be executed a maximum of 200 times per hour for each seller/user. If the number of calls per hour exceeds this limit, any new calls will be blocked for the next hour.&lt;/p&gt;&lt;/div&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Specifies the maximum number of report tasks to return on a page in the paginated response.&lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; 10&lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 500
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * Specifies the number of report tasks to skip in the result set before returning the first report in the paginated response.  &lt;p&gt;Combine &lt;b&gt;offset&lt;/b&gt; with the &lt;b&gt;limit&lt;/b&gt; query parameter to control the reports returned in the response. For example, if you supply an &lt;b&gt;offset&lt;/b&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;b&gt;limit&lt;/b&gt; of &lt;code&gt;10&lt;/code&gt;, the response contains the first 10 reports from the complete list of report tasks retrieved by the call. If &lt;b&gt;offset&lt;/b&gt; is &lt;code&gt;10&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is &lt;code&gt;10&lt;/code&gt;, the first page of the response contains reports 11-20 from the complete result set.&lt;/p&gt; &lt;b&gt;Default:&lt;/b&gt; 0
         */
        @jakarta.annotation.Nullable
        public String offset;
        /**
         * This query parameter filters the returned report tasks by their status. Supply a comma-separated list of the report statuses you want returned. The results are filtered to include only the report statuses you specify.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; The results might not include some report tasks if other search conditions exclude them.&lt;/span&gt;&lt;br /&gt;See &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_report_task-getreporttasks.reporttask.reporttaskstatus&quot;&gt;TaskStatusEnum&lt;/a&gt; for supported values.
         */
        @jakarta.annotation.Nullable
        public String reportTaskStatuses;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
            allQueryParams.put("report_task_statuses", reportTaskStatuses);
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
