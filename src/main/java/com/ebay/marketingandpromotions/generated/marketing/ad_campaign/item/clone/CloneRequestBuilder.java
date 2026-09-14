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

package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.clone;

import com.ebay.marketingandpromotions.generated.marketing.models.CloneCampaignRequest;
import com.ebay.marketingandpromotions.generated.marketing.models.Error;
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
 * Builds and executes requests for operations under /ad_campaign/{campaign_id}/clone
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloneRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link CloneRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CloneRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/clone", pathParameters);
    }
    /**
     * Instantiates a new {@link CloneRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CloneRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/clone", rawUrl);
    }
    /**
     * This method clones (makes a copy of) the specified campaign&apos;s &lt;b&gt;campaign criterion&lt;/b&gt;. The &lt;b&gt;campaign criterion&lt;/b&gt; is a container for the fields that define the criteria for a rule-based campaign.&lt;p&gt;To clone a campaign, supply the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter in your call. There is no request payload.&lt;/p&gt;  &lt;p&gt;The ID of the newly-cloned campaign is returned in the &lt;b&gt;Location&lt;/b&gt; response header.&lt;/p&gt;&lt;p&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a seller&apos;s current campaign IDs.&lt;/p&gt;  &lt;p&gt;&lt;b&gt;Requirement: &lt;/b&gt;In order to clone a campaign, the &lt;b&gt;campaignStatus&lt;/b&gt; must be &lt;code&gt;ENDED&lt;/code&gt; and the campaign must define a set of selection rules (it must be a rules-based campaign).&lt;/p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot; target=&quot;_blank&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @param body This type defines the fields for a clone campaign request.
     * @return a {@link ClonePostResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public ClonePostResponse post(@jakarta.annotation.Nonnull final CloneCampaignRequest body) {
        return post(body, null);
    }
    /**
     * This method clones (makes a copy of) the specified campaign&apos;s &lt;b&gt;campaign criterion&lt;/b&gt;. The &lt;b&gt;campaign criterion&lt;/b&gt; is a container for the fields that define the criteria for a rule-based campaign.&lt;p&gt;To clone a campaign, supply the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter in your call. There is no request payload.&lt;/p&gt;  &lt;p&gt;The ID of the newly-cloned campaign is returned in the &lt;b&gt;Location&lt;/b&gt; response header.&lt;/p&gt;&lt;p&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a seller&apos;s current campaign IDs.&lt;/p&gt;  &lt;p&gt;&lt;b&gt;Requirement: &lt;/b&gt;In order to clone a campaign, the &lt;b&gt;campaignStatus&lt;/b&gt; must be &lt;code&gt;ENDED&lt;/code&gt; and the campaign must define a set of selection rules (it must be a rules-based campaign).&lt;/p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot; target=&quot;_blank&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @param body This type defines the fields for a clone campaign request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ClonePostResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public ClonePostResponse post(@jakarta.annotation.Nonnull final CloneCampaignRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("409", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ClonePostResponse::createFromDiscriminatorValue);
    }
    /**
     * This method clones (makes a copy of) the specified campaign&apos;s &lt;b&gt;campaign criterion&lt;/b&gt;. The &lt;b&gt;campaign criterion&lt;/b&gt; is a container for the fields that define the criteria for a rule-based campaign.&lt;p&gt;To clone a campaign, supply the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter in your call. There is no request payload.&lt;/p&gt;  &lt;p&gt;The ID of the newly-cloned campaign is returned in the &lt;b&gt;Location&lt;/b&gt; response header.&lt;/p&gt;&lt;p&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a seller&apos;s current campaign IDs.&lt;/p&gt;  &lt;p&gt;&lt;b&gt;Requirement: &lt;/b&gt;In order to clone a campaign, the &lt;b&gt;campaignStatus&lt;/b&gt; must be &lt;code&gt;ENDED&lt;/code&gt; and the campaign must define a set of selection rules (it must be a rules-based campaign).&lt;/p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot; target=&quot;_blank&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @param body This type defines the fields for a clone campaign request.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CloneCampaignRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method clones (makes a copy of) the specified campaign&apos;s &lt;b&gt;campaign criterion&lt;/b&gt;. The &lt;b&gt;campaign criterion&lt;/b&gt; is a container for the fields that define the criteria for a rule-based campaign.&lt;p&gt;To clone a campaign, supply the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter in your call. There is no request payload.&lt;/p&gt;  &lt;p&gt;The ID of the newly-cloned campaign is returned in the &lt;b&gt;Location&lt;/b&gt; response header.&lt;/p&gt;&lt;p&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a seller&apos;s current campaign IDs.&lt;/p&gt;  &lt;p&gt;&lt;b&gt;Requirement: &lt;/b&gt;In order to clone a campaign, the &lt;b&gt;campaignStatus&lt;/b&gt; must be &lt;code&gt;ENDED&lt;/code&gt; and the campaign must define a set of selection rules (it must be a rules-based campaign).&lt;/p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot; target=&quot;_blank&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @param body This type defines the fields for a clone campaign request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CloneCampaignRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link CloneRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CloneRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CloneRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
