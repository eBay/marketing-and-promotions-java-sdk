package com.ebay.marketingandpromotions.generated.marketing.bulk_create_negative_keyword;

import com.ebay.marketingandpromotions.generated.marketing.models.BulkCreateNegativeKeywordRequest;
import com.ebay.marketingandpromotions.generated.marketing.models.BulkCreateNegativeKeywordResponse;
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
 * Builds and executes requests for operations under /bulk_create_negative_keyword
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkCreateNegativeKeywordRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link BulkCreateNegativeKeywordRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkCreateNegativeKeywordRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/bulk_create_negative_keyword", pathParameters);
    }
    /**
     * Instantiates a new {@link BulkCreateNegativeKeywordRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkCreateNegativeKeywordRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/bulk_create_negative_keyword", rawUrl);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method adds negative keywords, in bulk, to an existing ad group in a priority strategy campaign that uses manual targeting.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;campaignId&lt;/b&gt; and &lt;b&gt;adGroupId&lt;/b&gt; in the request body, along with the &lt;b&gt;negativeKeywordText&lt;/b&gt; and &lt;b&gt;negativeKeywordMatchType&lt;/b&gt;.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a specified seller.
     * @param body A type that contains the fields for the bulk request to create negative keywords.
     * @return a {@link BulkCreateNegativeKeywordResponse}
     */
    @jakarta.annotation.Nullable
    public BulkCreateNegativeKeywordResponse post(@jakarta.annotation.Nonnull final BulkCreateNegativeKeywordRequest body) {
        return post(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method adds negative keywords, in bulk, to an existing ad group in a priority strategy campaign that uses manual targeting.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;campaignId&lt;/b&gt; and &lt;b&gt;adGroupId&lt;/b&gt; in the request body, along with the &lt;b&gt;negativeKeywordText&lt;/b&gt; and &lt;b&gt;negativeKeywordMatchType&lt;/b&gt;.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a specified seller.
     * @param body A type that contains the fields for the bulk request to create negative keywords.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link BulkCreateNegativeKeywordResponse}
     */
    @jakarta.annotation.Nullable
    public BulkCreateNegativeKeywordResponse post(@jakarta.annotation.Nonnull final BulkCreateNegativeKeywordRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, BulkCreateNegativeKeywordResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method adds negative keywords, in bulk, to an existing ad group in a priority strategy campaign that uses manual targeting.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;campaignId&lt;/b&gt; and &lt;b&gt;adGroupId&lt;/b&gt; in the request body, along with the &lt;b&gt;negativeKeywordText&lt;/b&gt; and &lt;b&gt;negativeKeywordMatchType&lt;/b&gt;.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a specified seller.
     * @param body A type that contains the fields for the bulk request to create negative keywords.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkCreateNegativeKeywordRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method adds negative keywords, in bulk, to an existing ad group in a priority strategy campaign that uses manual targeting.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;campaignId&lt;/b&gt; and &lt;b&gt;adGroupId&lt;/b&gt; in the request body, along with the &lt;b&gt;negativeKeywordText&lt;/b&gt; and &lt;b&gt;negativeKeywordMatchType&lt;/b&gt;.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a specified seller.
     * @param body A type that contains the fields for the bulk request to create negative keywords.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkCreateNegativeKeywordRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link BulkCreateNegativeKeywordRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkCreateNegativeKeywordRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BulkCreateNegativeKeywordRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
