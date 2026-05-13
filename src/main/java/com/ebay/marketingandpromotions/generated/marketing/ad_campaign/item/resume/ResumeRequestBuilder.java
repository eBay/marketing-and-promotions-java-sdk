package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.resume;

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
 * Builds and executes requests for operations under /ad_campaign/{campaign_id}/resume
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ResumeRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ResumeRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ResumeRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/resume", pathParameters);
    }
    /**
     * Instantiates a new {@link ResumeRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ResumeRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/resume", rawUrl);
    }
    /**
     * This method resumes a paused campaign, as long as its end date is in the future. Supply the &lt;b&gt;campaign_id&lt;/b&gt; for the campaign you want to restart as a query parameter in the request.  &lt;p&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve the &lt;b&gt;campaign_id&lt;/b&gt; and the campaign status (&lt;code&gt;RUNNING&lt;/code&gt;, &lt;code&gt;PAUSED&lt;/code&gt;, &lt;code&gt;ENDED&lt;/code&gt;, and so on) for all the seller&apos;s campaigns.&lt;/p&gt;
     */
    public void post() {
        post(null);
    }
    /**
     * This method resumes a paused campaign, as long as its end date is in the future. Supply the &lt;b&gt;campaign_id&lt;/b&gt; for the campaign you want to restart as a query parameter in the request.  &lt;p&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve the &lt;b&gt;campaign_id&lt;/b&gt; and the campaign status (&lt;code&gt;RUNNING&lt;/code&gt;, &lt;code&gt;PAUSED&lt;/code&gt;, &lt;code&gt;ENDED&lt;/code&gt;, and so on) for all the seller&apos;s campaigns.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method resumes a paused campaign, as long as its end date is in the future. Supply the &lt;b&gt;campaign_id&lt;/b&gt; for the campaign you want to restart as a query parameter in the request.  &lt;p&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve the &lt;b&gt;campaign_id&lt;/b&gt; and the campaign status (&lt;code&gt;RUNNING&lt;/code&gt;, &lt;code&gt;PAUSED&lt;/code&gt;, &lt;code&gt;ENDED&lt;/code&gt;, and so on) for all the seller&apos;s campaigns.&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * This method resumes a paused campaign, as long as its end date is in the future. Supply the &lt;b&gt;campaign_id&lt;/b&gt; for the campaign you want to restart as a query parameter in the request.  &lt;p&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve the &lt;b&gt;campaign_id&lt;/b&gt; and the campaign status (&lt;code&gt;RUNNING&lt;/code&gt;, &lt;code&gt;PAUSED&lt;/code&gt;, &lt;code&gt;ENDED&lt;/code&gt;, and so on) for all the seller&apos;s campaigns.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ResumeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ResumeRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ResumeRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
