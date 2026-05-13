package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.ad_group.item;

import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.ad_group.item.suggest_bids.SuggestBidsRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.ad_group.item.suggest_keywords.SuggestKeywordsRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.models.AdGroup;
import com.ebay.marketingandpromotions.generated.marketing.models.UpdateAdGroupRequest;
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
 * Builds and executes requests for operations under /ad_campaign/{campaign_id}/ad_group/{ad_group_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithAdGroupItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The suggest_bids property
     * @return a {@link SuggestBidsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SuggestBidsRequestBuilder suggestBids() {
        return new SuggestBidsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The suggest_keywords property
     * @return a {@link SuggestKeywordsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SuggestKeywordsRequestBuilder suggestKeywords() {
        return new SuggestKeywordsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithAdGroupItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithAdGroupItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/ad_group/{ad_group_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithAdGroupItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithAdGroupItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/ad_group/{ad_group_id}", rawUrl);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method retrieves the details of a specified ad group, such as the ad groups default bid and status.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;ad_group_id&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the current campaign IDs for a seller and call &lt;a href=&quot;/api-docs/sell/marketing/resources/adgroup/methods/getAdGroups&quot;&gt;getAdGroups&lt;/a&gt; for the ad group ID of the ad group you wish to retrieve.
     * @return a {@link AdGroup}
     */
    @jakarta.annotation.Nullable
    public AdGroup get() {
        return get(null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method retrieves the details of a specified ad group, such as the ad groups default bid and status.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;ad_group_id&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the current campaign IDs for a seller and call &lt;a href=&quot;/api-docs/sell/marketing/resources/adgroup/methods/getAdGroups&quot;&gt;getAdGroups&lt;/a&gt; for the ad group ID of the ad group you wish to retrieve.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AdGroup}
     */
    @jakarta.annotation.Nullable
    public AdGroup get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AdGroup::createFromDiscriminatorValue);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method updates the ad group associated with a campaign.&lt;br /&gt;&lt;br /&gt;With this method, you can modify the &lt;b&gt;default bid&lt;/b&gt; for the ad group, change the state of the ad group, or change the name of the ad group. Pass the &lt;b&gt;ad_group_id&lt;/b&gt; you want to update as a URI parameter, and configure the &lt;b&gt;adGroupStatus&lt;/b&gt; and &lt;b&gt;defaultBid&lt;/b&gt; in the request payload.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/adgroup/methods/getAdGroup&quot;&gt;getAdGroup&lt;/a&gt; to retrieve the current default bid and status of the ad group that you would like to update.
     * @param body A type that contains the fields used by the &lt;b&gt;UpdateAdGroup&lt;/b&gt; request.
     */
    public void put(@jakarta.annotation.Nonnull final UpdateAdGroupRequest body) {
        put(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method updates the ad group associated with a campaign.&lt;br /&gt;&lt;br /&gt;With this method, you can modify the &lt;b&gt;default bid&lt;/b&gt; for the ad group, change the state of the ad group, or change the name of the ad group. Pass the &lt;b&gt;ad_group_id&lt;/b&gt; you want to update as a URI parameter, and configure the &lt;b&gt;adGroupStatus&lt;/b&gt; and &lt;b&gt;defaultBid&lt;/b&gt; in the request payload.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/adgroup/methods/getAdGroup&quot;&gt;getAdGroup&lt;/a&gt; to retrieve the current default bid and status of the ad group that you would like to update.
     * @param body A type that contains the fields used by the &lt;b&gt;UpdateAdGroup&lt;/b&gt; request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void put(@jakarta.annotation.Nonnull final UpdateAdGroupRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method retrieves the details of a specified ad group, such as the ad groups default bid and status.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;ad_group_id&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the current campaign IDs for a seller and call &lt;a href=&quot;/api-docs/sell/marketing/resources/adgroup/methods/getAdGroups&quot;&gt;getAdGroups&lt;/a&gt; for the ad group ID of the ad group you wish to retrieve.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method retrieves the details of a specified ad group, such as the ad groups default bid and status.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;ad_group_id&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the current campaign IDs for a seller and call &lt;a href=&quot;/api-docs/sell/marketing/resources/adgroup/methods/getAdGroups&quot;&gt;getAdGroups&lt;/a&gt; for the ad group ID of the ad group you wish to retrieve.
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
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method updates the ad group associated with a campaign.&lt;br /&gt;&lt;br /&gt;With this method, you can modify the &lt;b&gt;default bid&lt;/b&gt; for the ad group, change the state of the ad group, or change the name of the ad group. Pass the &lt;b&gt;ad_group_id&lt;/b&gt; you want to update as a URI parameter, and configure the &lt;b&gt;adGroupStatus&lt;/b&gt; and &lt;b&gt;defaultBid&lt;/b&gt; in the request payload.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/adgroup/methods/getAdGroup&quot;&gt;getAdGroup&lt;/a&gt; to retrieve the current default bid and status of the ad group that you would like to update.
     * @param body A type that contains the fields used by the &lt;b&gt;UpdateAdGroup&lt;/b&gt; request.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UpdateAdGroupRequest body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method updates the ad group associated with a campaign.&lt;br /&gt;&lt;br /&gt;With this method, you can modify the &lt;b&gt;default bid&lt;/b&gt; for the ad group, change the state of the ad group, or change the name of the ad group. Pass the &lt;b&gt;ad_group_id&lt;/b&gt; you want to update as a URI parameter, and configure the &lt;b&gt;adGroupStatus&lt;/b&gt; and &lt;b&gt;defaultBid&lt;/b&gt; in the request payload.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/adgroup/methods/getAdGroup&quot;&gt;getAdGroup&lt;/a&gt; to retrieve the current default bid and status of the ad group that you would like to update.
     * @param body A type that contains the fields used by the &lt;b&gt;UpdateAdGroup&lt;/b&gt; request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UpdateAdGroupRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithAdGroupItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithAdGroupItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithAdGroupItemRequestBuilder(rawUrl, requestAdapter);
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
