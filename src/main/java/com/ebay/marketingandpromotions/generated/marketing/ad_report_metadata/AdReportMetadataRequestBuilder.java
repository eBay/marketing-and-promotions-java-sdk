package com.ebay.marketingandpromotions.generated.marketing.ad_report_metadata;

import com.ebay.marketingandpromotions.generated.marketing.ad_report_metadata.item.WithReportTypeItemRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.models.ReportMetadatas;
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
 * Builds and executes requests for operations under /ad_report_metadata
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AdReportMetadataRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.marketingandpromotions.generated.marketing.ad_report_metadata.item collection
     * @param report_type This path parameter specifies the name of the report type whose metadata you want to retrieve.&lt;br /&gt;&lt;br /&gt;For details about available report types and their descriptions, refer to the &lt;a href=&quot;/api-docs/sell/marketing/types/plr:ReportTypeEnum&quot; target=&quot;_blank&quot;&gt;ReportTypeEnum&lt;/a&gt;.
     * @return a {@link WithReportTypeItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithReportTypeItemRequestBuilder byReport_type(@jakarta.annotation.Nonnull final String report_type) {
        Objects.requireNonNull(report_type);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("report_type", report_type);
        return new WithReportTypeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link AdReportMetadataRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AdReportMetadataRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_report_metadata{?channel*,funding_model*}", pathParameters);
    }
    /**
     * Instantiates a new {@link AdReportMetadataRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AdReportMetadataRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_report_metadata{?channel*,funding_model*}", rawUrl);
    }
    /**
     * This call retrieves information that details the fields used in each of the Promoted Listings reports. Use the returned information to configure the different types of Promoted Listings reports.&lt;/br&gt;&lt;/br&gt; You can retrieve metadata for all report types,funding models and channels, or you can filter based on funding model and/or channel.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The reporting of some data related to sales and ad-fees may require a 72-hour (&lt;b&gt;maximum&lt;/b&gt;) adjustment period which is often referred to as the &lt;i&gt;Reconciliation Period&lt;/i&gt;. Such adjustment periods should, on average, be minimal. However, at any given time, the &lt;b&gt;payments&lt;/b&gt; tab may be used to view those amounts that have actually been charged.&lt;/span&gt;
     * @return a {@link ReportMetadatas}
     */
    @jakarta.annotation.Nullable
    public ReportMetadatas get() {
        return get(null);
    }
    /**
     * This call retrieves information that details the fields used in each of the Promoted Listings reports. Use the returned information to configure the different types of Promoted Listings reports.&lt;/br&gt;&lt;/br&gt; You can retrieve metadata for all report types,funding models and channels, or you can filter based on funding model and/or channel.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The reporting of some data related to sales and ad-fees may require a 72-hour (&lt;b&gt;maximum&lt;/b&gt;) adjustment period which is often referred to as the &lt;i&gt;Reconciliation Period&lt;/i&gt;. Such adjustment periods should, on average, be minimal. However, at any given time, the &lt;b&gt;payments&lt;/b&gt; tab may be used to view those amounts that have actually been charged.&lt;/span&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ReportMetadatas}
     */
    @jakarta.annotation.Nullable
    public ReportMetadatas get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ReportMetadatas::createFromDiscriminatorValue);
    }
    /**
     * This call retrieves information that details the fields used in each of the Promoted Listings reports. Use the returned information to configure the different types of Promoted Listings reports.&lt;/br&gt;&lt;/br&gt; You can retrieve metadata for all report types,funding models and channels, or you can filter based on funding model and/or channel.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The reporting of some data related to sales and ad-fees may require a 72-hour (&lt;b&gt;maximum&lt;/b&gt;) adjustment period which is often referred to as the &lt;i&gt;Reconciliation Period&lt;/i&gt;. Such adjustment periods should, on average, be minimal. However, at any given time, the &lt;b&gt;payments&lt;/b&gt; tab may be used to view those amounts that have actually been charged.&lt;/span&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This call retrieves information that details the fields used in each of the Promoted Listings reports. Use the returned information to configure the different types of Promoted Listings reports.&lt;/br&gt;&lt;/br&gt; You can retrieve metadata for all report types,funding models and channels, or you can filter based on funding model and/or channel.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The reporting of some data related to sales and ad-fees may require a 72-hour (&lt;b&gt;maximum&lt;/b&gt;) adjustment period which is often referred to as the &lt;i&gt;Reconciliation Period&lt;/i&gt;. Such adjustment periods should, on average, be minimal. However, at any given time, the &lt;b&gt;payments&lt;/b&gt; tab may be used to view those amounts that have actually been charged.&lt;/span&gt;
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
     * @return a {@link AdReportMetadataRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AdReportMetadataRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AdReportMetadataRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This call retrieves information that details the fields used in each of the Promoted Listings reports. Use the returned information to configure the different types of Promoted Listings reports.&lt;/br&gt;&lt;/br&gt; You can retrieve metadata for all report types,funding models and channels, or you can filter based on funding model and/or channel.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The reporting of some data related to sales and ad-fees may require a 72-hour (&lt;b&gt;maximum&lt;/b&gt;) adjustment period which is often referred to as the &lt;i&gt;Reconciliation Period&lt;/i&gt;. Such adjustment periods should, on average, be minimal. However, at any given time, the &lt;b&gt;payments&lt;/b&gt; tab may be used to view those amounts that have actually been charged.&lt;/span&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This query parameter is used only if the user wants to see COST_PER_CLICK report metadata for a specific channel. Refer to the &lt;a href=&quot;/api-docs/sell/marketing/types/pls:ChannelEnum&quot;&gt;ChannelEnum&lt;/a&gt; type for supported values.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The channel parameter is only applicable for COST_PER_CLICK funding model.&lt;/span&gt;
         */
        @jakarta.annotation.Nullable
        public String channel;
        /**
         * This query parameter is used only if the user wants to see report metadata for a specific funding model. Refer to the &lt;a href=&quot;/api-docs/sell/marketing/types/pls:FundingModelEnum&quot;&gt;FundingModelEnum&lt;/a&gt; type for supported values.
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
