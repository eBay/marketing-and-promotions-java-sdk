package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.keyword.item;

import com.ebay.marketingandpromotions.generated.marketing.models.Keyword;
import com.ebay.marketingandpromotions.generated.marketing.models.UpdateKeywordRequest;
import com.ebay.marketingandpromotions.generated.marketing.models.UpdateKeywordResponse;
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
 * Builds and executes requests for operations under /ad_campaign/{campaign_id}/keyword/{keyword_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithKeywordItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithKeywordItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithKeywordItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/keyword/{keyword_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithKeywordItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithKeywordItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/keyword/{keyword_id}", rawUrl);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method retrieves details on a specific keyword from an ad group within a priority strategy campaign that uses the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;keyword_id&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller and call the &lt;a href=&quot;/api-docs/sell/marketing/resources/keyword/methods/getKeywords&quot;&gt;getKeywords&lt;/a&gt; method to retrieve their keyword IDs.
     * @return a {@link Keyword}
     */
    @jakarta.annotation.Nullable
    public Keyword get() {
        return get(null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method retrieves details on a specific keyword from an ad group within a priority strategy campaign that uses the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;keyword_id&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller and call the &lt;a href=&quot;/api-docs/sell/marketing/resources/keyword/methods/getKeywords&quot;&gt;getKeywords&lt;/a&gt; method to retrieve their keyword IDs.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Keyword}
     */
    @jakarta.annotation.Nullable
    public Keyword get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Keyword::createFromDiscriminatorValue);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method updates keywords using a campaign ID and keyword ID for an existing priority strategy campaign.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;keyword_id&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller and call the &lt;a href=&quot;/api-docs/sell/marketing/resources/keyword/methods/getKeywords&quot;&gt;getKeywords&lt;/a&gt; method to retrieve their keyword IDs.
     * @param body A type that contains the fields for the &lt;b&gt;UpdateKeyword&lt;/b&gt; request.
     * @return a {@link UpdateKeywordResponse}
     */
    @jakarta.annotation.Nullable
    public UpdateKeywordResponse put(@jakarta.annotation.Nonnull final UpdateKeywordRequest body) {
        return put(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method updates keywords using a campaign ID and keyword ID for an existing priority strategy campaign.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;keyword_id&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller and call the &lt;a href=&quot;/api-docs/sell/marketing/resources/keyword/methods/getKeywords&quot;&gt;getKeywords&lt;/a&gt; method to retrieve their keyword IDs.
     * @param body A type that contains the fields for the &lt;b&gt;UpdateKeyword&lt;/b&gt; request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link UpdateKeywordResponse}
     */
    @jakarta.annotation.Nullable
    public UpdateKeywordResponse put(@jakarta.annotation.Nonnull final UpdateKeywordRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, UpdateKeywordResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method retrieves details on a specific keyword from an ad group within a priority strategy campaign that uses the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;keyword_id&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller and call the &lt;a href=&quot;/api-docs/sell/marketing/resources/keyword/methods/getKeywords&quot;&gt;getKeywords&lt;/a&gt; method to retrieve their keyword IDs.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method retrieves details on a specific keyword from an ad group within a priority strategy campaign that uses the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;keyword_id&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller and call the &lt;a href=&quot;/api-docs/sell/marketing/resources/keyword/methods/getKeywords&quot;&gt;getKeywords&lt;/a&gt; method to retrieve their keyword IDs.
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
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method updates keywords using a campaign ID and keyword ID for an existing priority strategy campaign.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;keyword_id&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller and call the &lt;a href=&quot;/api-docs/sell/marketing/resources/keyword/methods/getKeywords&quot;&gt;getKeywords&lt;/a&gt; method to retrieve their keyword IDs.
     * @param body A type that contains the fields for the &lt;b&gt;UpdateKeyword&lt;/b&gt; request.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UpdateKeywordRequest body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method updates keywords using a campaign ID and keyword ID for an existing priority strategy campaign.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;keyword_id&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller and call the &lt;a href=&quot;/api-docs/sell/marketing/resources/keyword/methods/getKeywords&quot;&gt;getKeywords&lt;/a&gt; method to retrieve their keyword IDs.
     * @param body A type that contains the fields for the &lt;b&gt;UpdateKeyword&lt;/b&gt; request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UpdateKeywordRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithKeywordItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithKeywordItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithKeywordItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
