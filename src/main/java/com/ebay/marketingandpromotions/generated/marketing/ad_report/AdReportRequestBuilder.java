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

package com.ebay.marketingandpromotions.generated.marketing.ad_report;

import com.ebay.marketingandpromotions.generated.marketing.ad_report.item.WithReportItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /ad_report
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AdReportRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.marketingandpromotions.generated.marketing.ad_report.item collection
     * @param report_id This path parameter specifies the unique ID of the Promoted Listings report being retrieved.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad_report_task-getreporttasks&quot;&gt;getReportTasks&lt;/a&gt; method to retrieve report IDs.
     * @return a {@link WithReportItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithReportItemRequestBuilder byReport_id(@jakarta.annotation.Nonnull final String report_id) {
        Objects.requireNonNull(report_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("report_id", report_id);
        return new WithReportItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link AdReportRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AdReportRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_report", pathParameters);
    }
    /**
     * Instantiates a new {@link AdReportRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AdReportRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_report", rawUrl);
    }
}
