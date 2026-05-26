// Copyright 2026 eBay Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.update_campaign_identification;

import com.ebay.marketingandpromotions.generated.marketing.models.UpdateCampaignIdentificationRequest;
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
 * Builds and executes requests for operations under /ad_campaign/{campaign_id}/update_campaign_identification
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateCampaignIdentificationRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link UpdateCampaignIdentificationRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdateCampaignIdentificationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/update_campaign_identification", pathParameters);
    }
    /**
     * Instantiates a new {@link UpdateCampaignIdentificationRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdateCampaignIdentificationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/update_campaign_identification", rawUrl);
    }
    /**
     * This method can be used to change the name of a campaign, as well as modify the start or end dates. &lt;p&gt;Specify the &lt;b&gt;campaign_id&lt;/b&gt; you want to update as a URI parameter, and configure the &lt;b&gt;campaignName&lt;/b&gt; and &lt;b&gt;startDate&lt;/b&gt; in the request payload.  &lt;p&gt;If you want to change only the end date of the campaign, specify the current campaign name, set &lt;b&gt;endDate&lt;/b&gt; as desired, and set &lt;b&gt;startDate&lt;/b&gt; to the actual start date of the campaign. This applies if the campaign status is &lt;code&gt;RUNNING&lt;/code&gt; or &lt;code&gt;PAUSED&lt;/code&gt;. You can retrieve the &lt;b&gt;startDate&lt;/b&gt; using the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaign#response.startDate&quot;&gt;getCampaign&lt;/a&gt; method.&lt;/p&gt; &lt;p&gt;Note that if you do not set a new end date in this call, any current &lt;b&gt;endDate&lt;/b&gt; value will be set to &lt;code&gt;null&lt;/code&gt;. To preserve the currently-set end date, you must specify the value again in your request.&lt;/p&gt;  &lt;p&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a seller&apos;s campaign details, including the campaign ID, campaign name, and the start and end dates of the campaign.
     * @param body This type specifies the updated name, and start and end dates for an update-campaign request.
     */
    public void post(@jakarta.annotation.Nonnull final UpdateCampaignIdentificationRequest body) {
        post(body, null);
    }
    /**
     * This method can be used to change the name of a campaign, as well as modify the start or end dates. &lt;p&gt;Specify the &lt;b&gt;campaign_id&lt;/b&gt; you want to update as a URI parameter, and configure the &lt;b&gt;campaignName&lt;/b&gt; and &lt;b&gt;startDate&lt;/b&gt; in the request payload.  &lt;p&gt;If you want to change only the end date of the campaign, specify the current campaign name, set &lt;b&gt;endDate&lt;/b&gt; as desired, and set &lt;b&gt;startDate&lt;/b&gt; to the actual start date of the campaign. This applies if the campaign status is &lt;code&gt;RUNNING&lt;/code&gt; or &lt;code&gt;PAUSED&lt;/code&gt;. You can retrieve the &lt;b&gt;startDate&lt;/b&gt; using the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaign#response.startDate&quot;&gt;getCampaign&lt;/a&gt; method.&lt;/p&gt; &lt;p&gt;Note that if you do not set a new end date in this call, any current &lt;b&gt;endDate&lt;/b&gt; value will be set to &lt;code&gt;null&lt;/code&gt;. To preserve the currently-set end date, you must specify the value again in your request.&lt;/p&gt;  &lt;p&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a seller&apos;s campaign details, including the campaign ID, campaign name, and the start and end dates of the campaign.
     * @param body This type specifies the updated name, and start and end dates for an update-campaign request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void post(@jakarta.annotation.Nonnull final UpdateCampaignIdentificationRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method can be used to change the name of a campaign, as well as modify the start or end dates. &lt;p&gt;Specify the &lt;b&gt;campaign_id&lt;/b&gt; you want to update as a URI parameter, and configure the &lt;b&gt;campaignName&lt;/b&gt; and &lt;b&gt;startDate&lt;/b&gt; in the request payload.  &lt;p&gt;If you want to change only the end date of the campaign, specify the current campaign name, set &lt;b&gt;endDate&lt;/b&gt; as desired, and set &lt;b&gt;startDate&lt;/b&gt; to the actual start date of the campaign. This applies if the campaign status is &lt;code&gt;RUNNING&lt;/code&gt; or &lt;code&gt;PAUSED&lt;/code&gt;. You can retrieve the &lt;b&gt;startDate&lt;/b&gt; using the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaign#response.startDate&quot;&gt;getCampaign&lt;/a&gt; method.&lt;/p&gt; &lt;p&gt;Note that if you do not set a new end date in this call, any current &lt;b&gt;endDate&lt;/b&gt; value will be set to &lt;code&gt;null&lt;/code&gt;. To preserve the currently-set end date, you must specify the value again in your request.&lt;/p&gt;  &lt;p&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a seller&apos;s campaign details, including the campaign ID, campaign name, and the start and end dates of the campaign.
     * @param body This type specifies the updated name, and start and end dates for an update-campaign request.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdateCampaignIdentificationRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method can be used to change the name of a campaign, as well as modify the start or end dates. &lt;p&gt;Specify the &lt;b&gt;campaign_id&lt;/b&gt; you want to update as a URI parameter, and configure the &lt;b&gt;campaignName&lt;/b&gt; and &lt;b&gt;startDate&lt;/b&gt; in the request payload.  &lt;p&gt;If you want to change only the end date of the campaign, specify the current campaign name, set &lt;b&gt;endDate&lt;/b&gt; as desired, and set &lt;b&gt;startDate&lt;/b&gt; to the actual start date of the campaign. This applies if the campaign status is &lt;code&gt;RUNNING&lt;/code&gt; or &lt;code&gt;PAUSED&lt;/code&gt;. You can retrieve the &lt;b&gt;startDate&lt;/b&gt; using the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaign#response.startDate&quot;&gt;getCampaign&lt;/a&gt; method.&lt;/p&gt; &lt;p&gt;Note that if you do not set a new end date in this call, any current &lt;b&gt;endDate&lt;/b&gt; value will be set to &lt;code&gt;null&lt;/code&gt;. To preserve the currently-set end date, you must specify the value again in your request.&lt;/p&gt;  &lt;p&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a seller&apos;s campaign details, including the campaign ID, campaign name, and the start and end dates of the campaign.
     * @param body This type specifies the updated name, and start and end dates for an update-campaign request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdateCampaignIdentificationRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link UpdateCampaignIdentificationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdateCampaignIdentificationRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UpdateCampaignIdentificationRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
