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
     * @param report_id This path parameter specifies the unique ID of the Promoted Listings report being retrieved.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/marketing/resources/ad_report_task/methods/getReportTasks&quot;&gt;getReportTasks&lt;/a&gt; method to retrieve report IDs.
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
