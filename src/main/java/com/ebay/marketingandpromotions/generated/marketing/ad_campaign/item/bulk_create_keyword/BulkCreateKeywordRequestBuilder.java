package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.bulk_create_keyword;

import com.ebay.marketingandpromotions.generated.marketing.models.BulkCreateKeywordRequest;
import com.ebay.marketingandpromotions.generated.marketing.models.BulkCreateKeywordResponse;
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
 * Builds and executes requests for operations under /ad_campaign/{campaign_id}/bulk_create_keyword
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkCreateKeywordRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link BulkCreateKeywordRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkCreateKeywordRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/bulk_create_keyword", pathParameters);
    }
    /**
     * Instantiates a new {@link BulkCreateKeywordRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkCreateKeywordRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/bulk_create_keyword", rawUrl);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method adds keywords, in bulk, to an existing priority strategy ad group in a campaign that uses manual targeting.&lt;br&gt;&lt;br&gt;This method also sets the CPC rate for each keyword, depending on the selected bidding strategy, as follows:&lt;br&gt;&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;FIXED&lt;/code&gt;: If the seller provides a keyword bid, that bid value will be used.&lt;br&gt;&lt;br&gt;If no bid is provided, the adgroup&apos;s default bid value will be used.&lt;/li&gt;&lt;li&gt;&lt;code&gt;DYNAMIC&lt;/code&gt;: The eBay suggested bid will be used.&lt;br&gt;&lt;br&gt;If the seller passes in a value, a warning will be returned.&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a specified seller.
     * @param body A type that contains the fields for the bulk request to create keywords.
     * @return a {@link BulkCreateKeywordResponse}
     */
    @jakarta.annotation.Nullable
    public BulkCreateKeywordResponse post(@jakarta.annotation.Nonnull final BulkCreateKeywordRequest body) {
        return post(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method adds keywords, in bulk, to an existing priority strategy ad group in a campaign that uses manual targeting.&lt;br&gt;&lt;br&gt;This method also sets the CPC rate for each keyword, depending on the selected bidding strategy, as follows:&lt;br&gt;&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;FIXED&lt;/code&gt;: If the seller provides a keyword bid, that bid value will be used.&lt;br&gt;&lt;br&gt;If no bid is provided, the adgroup&apos;s default bid value will be used.&lt;/li&gt;&lt;li&gt;&lt;code&gt;DYNAMIC&lt;/code&gt;: The eBay suggested bid will be used.&lt;br&gt;&lt;br&gt;If the seller passes in a value, a warning will be returned.&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a specified seller.
     * @param body A type that contains the fields for the bulk request to create keywords.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link BulkCreateKeywordResponse}
     */
    @jakarta.annotation.Nullable
    public BulkCreateKeywordResponse post(@jakarta.annotation.Nonnull final BulkCreateKeywordRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, BulkCreateKeywordResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method adds keywords, in bulk, to an existing priority strategy ad group in a campaign that uses manual targeting.&lt;br&gt;&lt;br&gt;This method also sets the CPC rate for each keyword, depending on the selected bidding strategy, as follows:&lt;br&gt;&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;FIXED&lt;/code&gt;: If the seller provides a keyword bid, that bid value will be used.&lt;br&gt;&lt;br&gt;If no bid is provided, the adgroup&apos;s default bid value will be used.&lt;/li&gt;&lt;li&gt;&lt;code&gt;DYNAMIC&lt;/code&gt;: The eBay suggested bid will be used.&lt;br&gt;&lt;br&gt;If the seller passes in a value, a warning will be returned.&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a specified seller.
     * @param body A type that contains the fields for the bulk request to create keywords.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkCreateKeywordRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method adds keywords, in bulk, to an existing priority strategy ad group in a campaign that uses manual targeting.&lt;br&gt;&lt;br&gt;This method also sets the CPC rate for each keyword, depending on the selected bidding strategy, as follows:&lt;br&gt;&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;FIXED&lt;/code&gt;: If the seller provides a keyword bid, that bid value will be used.&lt;br&gt;&lt;br&gt;If no bid is provided, the adgroup&apos;s default bid value will be used.&lt;/li&gt;&lt;li&gt;&lt;code&gt;DYNAMIC&lt;/code&gt;: The eBay suggested bid will be used.&lt;br&gt;&lt;br&gt;If the seller passes in a value, a warning will be returned.&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;In the request, supply the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a specified seller.
     * @param body A type that contains the fields for the bulk request to create keywords.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkCreateKeywordRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link BulkCreateKeywordRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkCreateKeywordRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BulkCreateKeywordRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
