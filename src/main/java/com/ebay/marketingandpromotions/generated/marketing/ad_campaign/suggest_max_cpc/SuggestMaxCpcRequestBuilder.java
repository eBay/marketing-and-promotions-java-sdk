package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.suggest_max_cpc;

import com.ebay.marketingandpromotions.generated.marketing.models.SuggestMaxCpcRequest;
import com.ebay.marketingandpromotions.generated.marketing.models.SuggestMaxCpcResponse;
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
 * Builds and executes requests for operations under /ad_campaign/suggest_max_cpc
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SuggestMaxCpcRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link SuggestMaxCpcRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SuggestMaxCpcRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/suggest_max_cpc", pathParameters);
    }
    /**
     * Instantiates a new {@link SuggestMaxCpcRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SuggestMaxCpcRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/suggest_max_cpc", rawUrl);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only supported for smart targeting priority strategy campaigns. Sellers can use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method of the Account API v1 to determine if they are eligible for a priority strategy campaign.&lt;/span&gt;&lt;br /&gt;This method allows sellers to retrieve the suggested maximum cost-per-click value for a smart targeting campaign. This value is required when creating a smart targeting campaign and indicates the maximum amount for which the eBay suggested bid can be adjusted.
     * @param body This type defines the fields used in the &lt;b&gt;suggestMaxCpc&lt;/b&gt; request. To retrieve the suggested &lt;b&gt;maxCpc&lt;/b&gt; value for a smart targeting campaign, a seller must specify the listings associated with the campaign, as well as the marketplace on which the campaign is hosted.
     * @return a {@link SuggestMaxCpcResponse}
     */
    @jakarta.annotation.Nullable
    public SuggestMaxCpcResponse post(@jakarta.annotation.Nonnull final SuggestMaxCpcRequest body) {
        return post(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only supported for smart targeting priority strategy campaigns. Sellers can use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method of the Account API v1 to determine if they are eligible for a priority strategy campaign.&lt;/span&gt;&lt;br /&gt;This method allows sellers to retrieve the suggested maximum cost-per-click value for a smart targeting campaign. This value is required when creating a smart targeting campaign and indicates the maximum amount for which the eBay suggested bid can be adjusted.
     * @param body This type defines the fields used in the &lt;b&gt;suggestMaxCpc&lt;/b&gt; request. To retrieve the suggested &lt;b&gt;maxCpc&lt;/b&gt; value for a smart targeting campaign, a seller must specify the listings associated with the campaign, as well as the marketplace on which the campaign is hosted.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SuggestMaxCpcResponse}
     */
    @jakarta.annotation.Nullable
    public SuggestMaxCpcResponse post(@jakarta.annotation.Nonnull final SuggestMaxCpcRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, SuggestMaxCpcResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only supported for smart targeting priority strategy campaigns. Sellers can use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method of the Account API v1 to determine if they are eligible for a priority strategy campaign.&lt;/span&gt;&lt;br /&gt;This method allows sellers to retrieve the suggested maximum cost-per-click value for a smart targeting campaign. This value is required when creating a smart targeting campaign and indicates the maximum amount for which the eBay suggested bid can be adjusted.
     * @param body This type defines the fields used in the &lt;b&gt;suggestMaxCpc&lt;/b&gt; request. To retrieve the suggested &lt;b&gt;maxCpc&lt;/b&gt; value for a smart targeting campaign, a seller must specify the listings associated with the campaign, as well as the marketplace on which the campaign is hosted.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SuggestMaxCpcRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only supported for smart targeting priority strategy campaigns. Sellers can use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method of the Account API v1 to determine if they are eligible for a priority strategy campaign.&lt;/span&gt;&lt;br /&gt;This method allows sellers to retrieve the suggested maximum cost-per-click value for a smart targeting campaign. This value is required when creating a smart targeting campaign and indicates the maximum amount for which the eBay suggested bid can be adjusted.
     * @param body This type defines the fields used in the &lt;b&gt;suggestMaxCpc&lt;/b&gt; request. To retrieve the suggested &lt;b&gt;maxCpc&lt;/b&gt; value for a smart targeting campaign, a seller must specify the listings associated with the campaign, as well as the marketplace on which the campaign is hosted.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SuggestMaxCpcRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link SuggestMaxCpcRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SuggestMaxCpcRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SuggestMaxCpcRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
