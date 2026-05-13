package com.ebay.marketingandpromotions.generated.marketing.email_campaign.item.email_preview;

import com.ebay.marketingandpromotions.generated.marketing.models.GetEmailPreviewResponse;
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
 * Builds and executes requests for operations under /email_campaign/{email_campaign_id}/email_preview
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EmailPreviewRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link EmailPreviewRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EmailPreviewRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/email_campaign/{email_campaign_id}/email_preview", pathParameters);
    }
    /**
     * Instantiates a new {@link EmailPreviewRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EmailPreviewRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/email_campaign/{email_campaign_id}/email_preview", rawUrl);
    }
    /**
     * This method returns a preview of the email sent by the email campaign indicated by the &lt;b&gt;email_campaign_id&lt;/b&gt; path parameter.&lt;br&gt;&lt;br&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getEmailCampaigns&quot;&gt;getEmailCampaigns&lt;/a&gt; to obtain a list of email campaigns. Use the &lt;b&gt;emailCampaignId&lt;/b&gt; value of the desired email campaign as the &lt;b&gt;email_campaign_id&lt;/b&gt; path parameter value.&lt;br&gt;&lt;br&gt;If this call is executed successfully, the response returns a &lt;b&gt;content&lt;/b&gt; field that contains the raw HTML code of the email campaign that can then be rendered anywhere.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The eBay listings in the email are sorted according to the email campaign sort criteria. The individual listings can change over time, as well.&lt;br&gt;&lt;br&gt;The result of the email preview call can be treated as a snapshot of the email campaign taken at the date and time of the &lt;b&gt;renderDate&lt;/b&gt; value found in the results of the call.&lt;/span&gt;
     * @return a {@link GetEmailPreviewResponse}
     */
    @jakarta.annotation.Nullable
    public GetEmailPreviewResponse get() {
        return get(null);
    }
    /**
     * This method returns a preview of the email sent by the email campaign indicated by the &lt;b&gt;email_campaign_id&lt;/b&gt; path parameter.&lt;br&gt;&lt;br&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getEmailCampaigns&quot;&gt;getEmailCampaigns&lt;/a&gt; to obtain a list of email campaigns. Use the &lt;b&gt;emailCampaignId&lt;/b&gt; value of the desired email campaign as the &lt;b&gt;email_campaign_id&lt;/b&gt; path parameter value.&lt;br&gt;&lt;br&gt;If this call is executed successfully, the response returns a &lt;b&gt;content&lt;/b&gt; field that contains the raw HTML code of the email campaign that can then be rendered anywhere.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The eBay listings in the email are sorted according to the email campaign sort criteria. The individual listings can change over time, as well.&lt;br&gt;&lt;br&gt;The result of the email preview call can be treated as a snapshot of the email campaign taken at the date and time of the &lt;b&gt;renderDate&lt;/b&gt; value found in the results of the call.&lt;/span&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetEmailPreviewResponse}
     */
    @jakarta.annotation.Nullable
    public GetEmailPreviewResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, GetEmailPreviewResponse::createFromDiscriminatorValue);
    }
    /**
     * This method returns a preview of the email sent by the email campaign indicated by the &lt;b&gt;email_campaign_id&lt;/b&gt; path parameter.&lt;br&gt;&lt;br&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getEmailCampaigns&quot;&gt;getEmailCampaigns&lt;/a&gt; to obtain a list of email campaigns. Use the &lt;b&gt;emailCampaignId&lt;/b&gt; value of the desired email campaign as the &lt;b&gt;email_campaign_id&lt;/b&gt; path parameter value.&lt;br&gt;&lt;br&gt;If this call is executed successfully, the response returns a &lt;b&gt;content&lt;/b&gt; field that contains the raw HTML code of the email campaign that can then be rendered anywhere.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The eBay listings in the email are sorted according to the email campaign sort criteria. The individual listings can change over time, as well.&lt;br&gt;&lt;br&gt;The result of the email preview call can be treated as a snapshot of the email campaign taken at the date and time of the &lt;b&gt;renderDate&lt;/b&gt; value found in the results of the call.&lt;/span&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method returns a preview of the email sent by the email campaign indicated by the &lt;b&gt;email_campaign_id&lt;/b&gt; path parameter.&lt;br&gt;&lt;br&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getEmailCampaigns&quot;&gt;getEmailCampaigns&lt;/a&gt; to obtain a list of email campaigns. Use the &lt;b&gt;emailCampaignId&lt;/b&gt; value of the desired email campaign as the &lt;b&gt;email_campaign_id&lt;/b&gt; path parameter value.&lt;br&gt;&lt;br&gt;If this call is executed successfully, the response returns a &lt;b&gt;content&lt;/b&gt; field that contains the raw HTML code of the email campaign that can then be rendered anywhere.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The eBay listings in the email are sorted according to the email campaign sort criteria. The individual listings can change over time, as well.&lt;br&gt;&lt;br&gt;The result of the email preview call can be treated as a snapshot of the email campaign taken at the date and time of the &lt;b&gt;renderDate&lt;/b&gt; value found in the results of the call.&lt;/span&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link EmailPreviewRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EmailPreviewRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new EmailPreviewRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
