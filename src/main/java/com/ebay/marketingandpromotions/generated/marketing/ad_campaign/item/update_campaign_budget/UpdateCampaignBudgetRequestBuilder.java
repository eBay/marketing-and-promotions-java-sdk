package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.update_campaign_budget;

import com.ebay.marketingandpromotions.generated.marketing.models.UpdateCampaignBudgetRequest;
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
 * Builds and executes requests for operations under /ad_campaign/{campaign_id}/update_campaign_budget
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateCampaignBudgetRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link UpdateCampaignBudgetRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdateCampaignBudgetRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/update_campaign_budget", pathParameters);
    }
    /**
     * Instantiates a new {@link UpdateCampaignBudgetRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdateCampaignBudgetRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/update_campaign_budget", rawUrl);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method updates the daily budget for a priority strategy campaign that uses the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;A click occurs when an eBay user finds and clicks on the sellers listing (within the search results) after using a keyword that the seller has created for the campaign. For each ad in an ad group in the campaign, each click triggers a cost, which gets subtracted from the campaigns daily budget. If the cost of the clicks exceeds the daily budget, the Promoted Listings campaign will be paused until the next day.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter. You can retrieve the campaign IDs for a seller by calling the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The daily budget for a campaign can only be updated 15 times per day. If this limit is exceeded, an error will occur and you will be blocked from updating the  budget until the next day.&lt;/span&gt;
     * @param body A type that contains the fields for the &lt;b&gt;UpdateCampaignBudget&lt;/b&gt; request.
     * @return a {@link UpdateCampaignBudgetPostResponse}
     */
    @jakarta.annotation.Nullable
    public UpdateCampaignBudgetPostResponse post(@jakarta.annotation.Nonnull final UpdateCampaignBudgetRequest body) {
        return post(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method updates the daily budget for a priority strategy campaign that uses the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;A click occurs when an eBay user finds and clicks on the sellers listing (within the search results) after using a keyword that the seller has created for the campaign. For each ad in an ad group in the campaign, each click triggers a cost, which gets subtracted from the campaigns daily budget. If the cost of the clicks exceeds the daily budget, the Promoted Listings campaign will be paused until the next day.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter. You can retrieve the campaign IDs for a seller by calling the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The daily budget for a campaign can only be updated 15 times per day. If this limit is exceeded, an error will occur and you will be blocked from updating the  budget until the next day.&lt;/span&gt;
     * @param body A type that contains the fields for the &lt;b&gt;UpdateCampaignBudget&lt;/b&gt; request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link UpdateCampaignBudgetPostResponse}
     */
    @jakarta.annotation.Nullable
    public UpdateCampaignBudgetPostResponse post(@jakarta.annotation.Nonnull final UpdateCampaignBudgetRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, UpdateCampaignBudgetPostResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method updates the daily budget for a priority strategy campaign that uses the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;A click occurs when an eBay user finds and clicks on the sellers listing (within the search results) after using a keyword that the seller has created for the campaign. For each ad in an ad group in the campaign, each click triggers a cost, which gets subtracted from the campaigns daily budget. If the cost of the clicks exceeds the daily budget, the Promoted Listings campaign will be paused until the next day.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter. You can retrieve the campaign IDs for a seller by calling the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The daily budget for a campaign can only be updated 15 times per day. If this limit is exceeded, an error will occur and you will be blocked from updating the  budget until the next day.&lt;/span&gt;
     * @param body A type that contains the fields for the &lt;b&gt;UpdateCampaignBudget&lt;/b&gt; request.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdateCampaignBudgetRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is only available for select partners who have been approved for the eBay priority strategy program. For information about how to request access to this program, refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-verify-eligibility.html#access-requests &quot; target=&quot;_blank &quot;&gt; Priority Strategy Access Requests&lt;/a&gt; in the Promoted Listings Playbook. To determine if a seller qualifies for priority strategy, use the &lt;a href=&quot;/api-docs/sell/account/resources/advertising_eligibility/methods/getAdvertisingEligibility &quot; target=&quot;_blank &quot;&gt;getAdvertisingEligibility&lt;/a&gt; method in Account API.&lt;/span&gt;&lt;br /&gt;This method updates the daily budget for a priority strategy campaign that uses the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;A click occurs when an eBay user finds and clicks on the sellers listing (within the search results) after using a keyword that the seller has created for the campaign. For each ad in an ad group in the campaign, each click triggers a cost, which gets subtracted from the campaigns daily budget. If the cost of the clicks exceeds the daily budget, the Promoted Listings campaign will be paused until the next day.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter. You can retrieve the campaign IDs for a seller by calling the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The daily budget for a campaign can only be updated 15 times per day. If this limit is exceeded, an error will occur and you will be blocked from updating the  budget until the next day.&lt;/span&gt;
     * @param body A type that contains the fields for the &lt;b&gt;UpdateCampaignBudget&lt;/b&gt; request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdateCampaignBudgetRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link UpdateCampaignBudgetRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdateCampaignBudgetRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UpdateCampaignBudgetRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
