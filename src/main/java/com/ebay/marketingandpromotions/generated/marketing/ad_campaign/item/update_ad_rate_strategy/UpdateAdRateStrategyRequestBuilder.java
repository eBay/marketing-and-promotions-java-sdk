package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.update_ad_rate_strategy;

import com.ebay.marketingandpromotions.generated.marketing.models.UpdateAdrateStrategyRequest;
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
 * Builds and executes requests for operations under /ad_campaign/{campaign_id}/update_ad_rate_strategy
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateAdRateStrategyRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link UpdateAdRateStrategyRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdateAdRateStrategyRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/update_ad_rate_strategy", pathParameters);
    }
    /**
     * Instantiates a new {@link UpdateAdRateStrategyRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdateAdRateStrategyRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/update_ad_rate_strategy", rawUrl);
    }
    /**
     * This method updates the ad rate strategy for an existing rules-based general strategy ad campaign that uses the Cost Per Sale (CPS) funding model.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter. You can retrieve the campaign IDs for a seller by calling the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; method.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the CPS funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @param body A type that defines the request fields used to update the ad rate strategy for a Promoted Listings ad campaign.
     */
    public void post(@jakarta.annotation.Nonnull final UpdateAdrateStrategyRequest body) {
        post(body, null);
    }
    /**
     * This method updates the ad rate strategy for an existing rules-based general strategy ad campaign that uses the Cost Per Sale (CPS) funding model.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter. You can retrieve the campaign IDs for a seller by calling the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; method.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the CPS funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @param body A type that defines the request fields used to update the ad rate strategy for a Promoted Listings ad campaign.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void post(@jakarta.annotation.Nonnull final UpdateAdrateStrategyRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method updates the ad rate strategy for an existing rules-based general strategy ad campaign that uses the Cost Per Sale (CPS) funding model.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter. You can retrieve the campaign IDs for a seller by calling the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; method.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the CPS funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @param body A type that defines the request fields used to update the ad rate strategy for a Promoted Listings ad campaign.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdateAdrateStrategyRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method updates the ad rate strategy for an existing rules-based general strategy ad campaign that uses the Cost Per Sale (CPS) funding model.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter. You can retrieve the campaign IDs for a seller by calling the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; method.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the CPS funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @param body A type that defines the request fields used to update the ad rate strategy for a Promoted Listings ad campaign.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdateAdrateStrategyRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link UpdateAdRateStrategyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdateAdRateStrategyRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UpdateAdRateStrategyRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
