package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.suggest_budget;

import com.ebay.marketingandpromotions.generated.marketing.models.SuggestBudgetResponse;
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
 * Builds and executes requests for operations under /ad_campaign/suggest_budget
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SuggestBudgetRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link SuggestBudgetRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SuggestBudgetRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/suggest_budget", pathParameters);
    }
    /**
     * Instantiates a new {@link SuggestBudgetRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SuggestBudgetRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/suggest_budget", rawUrl);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only supported for Promoted Offsite campaigns. Sellers can use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility&quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method of the &lt;a href=&quot;//api-docs/sell/account/overview.html&quot; target=&quot;_blank &quot;&gt;Account API v1&lt;/a&gt; to determine if they are eligible for offsite campaigns.&lt;/span&gt;&lt;br&gt;This method allows sellers to retrieve the suggested budget for an offsite campaign.
     * @return a {@link SuggestBudgetResponse}
     */
    @jakarta.annotation.Nullable
    public SuggestBudgetResponse get() {
        return get(null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only supported for Promoted Offsite campaigns. Sellers can use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility&quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method of the &lt;a href=&quot;//api-docs/sell/account/overview.html&quot; target=&quot;_blank &quot;&gt;Account API v1&lt;/a&gt; to determine if they are eligible for offsite campaigns.&lt;/span&gt;&lt;br&gt;This method allows sellers to retrieve the suggested budget for an offsite campaign.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SuggestBudgetResponse}
     */
    @jakarta.annotation.Nullable
    public SuggestBudgetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, SuggestBudgetResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only supported for Promoted Offsite campaigns. Sellers can use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility&quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method of the &lt;a href=&quot;//api-docs/sell/account/overview.html&quot; target=&quot;_blank &quot;&gt;Account API v1&lt;/a&gt; to determine if they are eligible for offsite campaigns.&lt;/span&gt;&lt;br&gt;This method allows sellers to retrieve the suggested budget for an offsite campaign.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only supported for Promoted Offsite campaigns. Sellers can use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility&quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method of the &lt;a href=&quot;//api-docs/sell/account/overview.html&quot; target=&quot;_blank &quot;&gt;Account API v1&lt;/a&gt; to determine if they are eligible for offsite campaigns.&lt;/span&gt;&lt;br&gt;This method allows sellers to retrieve the suggested budget for an offsite campaign.
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
     * @return a {@link SuggestBudgetRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SuggestBudgetRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SuggestBudgetRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
