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

package com.ebay.marketingandpromotions.generated.marketing.email_campaign.item;

import com.ebay.marketingandpromotions.generated.marketing.email_campaign.item.email_preview.EmailPreviewRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.models.DeleteEmailCampaignResponse;
import com.ebay.marketingandpromotions.generated.marketing.models.GetEmailCampaignResponse;
import com.ebay.marketingandpromotions.generated.marketing.models.UpdateCampaignRequest;
import com.ebay.marketingandpromotions.generated.marketing.models.UpdateEmailCampaignResponse;
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
 * Builds and executes requests for operations under /email_campaign/{email_campaign_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithEmailCampaignItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The email_preview property
     * @return a {@link EmailPreviewRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EmailPreviewRequestBuilder emailPreview() {
        return new EmailPreviewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithEmailCampaignItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithEmailCampaignItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/email_campaign/{email_campaign_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithEmailCampaignItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithEmailCampaignItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/email_campaign/{email_campaign_id}", rawUrl);
    }
    /**
     * This method deletes the email campaign specified by the &lt;b&gt;email_campaign_id&lt;/b&gt; path parameter.&lt;br&gt;&lt;br&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/email_campaign/methods/getEmailCampaigns&quot;&gt;getEmailCampaigns&lt;/a&gt; to retrieve all of the seller&apos;s email campaigns. Use the &lt;b&gt;email_campaign_id&lt;/b&gt; of the desired email campaign in the response as the path parameter for this request.
     * @return a {@link DeleteEmailCampaignResponse}
     */
    @jakarta.annotation.Nullable
    public DeleteEmailCampaignResponse delete() {
        return delete(null);
    }
    /**
     * This method deletes the email campaign specified by the &lt;b&gt;email_campaign_id&lt;/b&gt; path parameter.&lt;br&gt;&lt;br&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/email_campaign/methods/getEmailCampaigns&quot;&gt;getEmailCampaigns&lt;/a&gt; to retrieve all of the seller&apos;s email campaigns. Use the &lt;b&gt;email_campaign_id&lt;/b&gt; of the desired email campaign in the response as the path parameter for this request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DeleteEmailCampaignResponse}
     */
    @jakarta.annotation.Nullable
    public DeleteEmailCampaignResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, DeleteEmailCampaignResponse::createFromDiscriminatorValue);
    }
    /**
     * This method returns the details of a single email campaign specified by the &lt;b&gt;email_campaign_id&lt;/b&gt; path parameter.&lt;br&gt;&lt;br&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getEmailCampaigns&quot;&gt;getEmailCampaigns&lt;/a&gt; to retrieve a list of all email campaigns from a seller&apos;s eBay store.
     * @return a {@link GetEmailCampaignResponse}
     */
    @jakarta.annotation.Nullable
    public GetEmailCampaignResponse get() {
        return get(null);
    }
    /**
     * This method returns the details of a single email campaign specified by the &lt;b&gt;email_campaign_id&lt;/b&gt; path parameter.&lt;br&gt;&lt;br&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getEmailCampaigns&quot;&gt;getEmailCampaigns&lt;/a&gt; to retrieve a list of all email campaigns from a seller&apos;s eBay store.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetEmailCampaignResponse}
     */
    @jakarta.annotation.Nullable
    public GetEmailCampaignResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, GetEmailCampaignResponse::createFromDiscriminatorValue);
    }
    /**
     * This method lets users update an existing email campaign. Pass the &lt;b&gt;emailCampaignId&lt;/b&gt; in the request URL and specify the changes to field values in the request payload.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;You can only update the custom fields of an email campaign. Fixed values, such as the &lt;b&gt;emailCampaignType&lt;/b&gt;, cannot be changed. For full specifications of fixed values for each email campaign type, see the &lt;a href=&quot;/api-docs/sell/marketing/resources/email_campaign/methods/createEmailCampaign&quot;&gt;createEmailCampaign&lt;/a&gt; method documentation.&lt;/span&gt;
     * @param body The update email campaign request payload
     * @return a {@link UpdateEmailCampaignResponse}
     */
    @jakarta.annotation.Nullable
    public UpdateEmailCampaignResponse put(@jakarta.annotation.Nonnull final UpdateCampaignRequest body) {
        return put(body, null);
    }
    /**
     * This method lets users update an existing email campaign. Pass the &lt;b&gt;emailCampaignId&lt;/b&gt; in the request URL and specify the changes to field values in the request payload.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;You can only update the custom fields of an email campaign. Fixed values, such as the &lt;b&gt;emailCampaignType&lt;/b&gt;, cannot be changed. For full specifications of fixed values for each email campaign type, see the &lt;a href=&quot;/api-docs/sell/marketing/resources/email_campaign/methods/createEmailCampaign&quot;&gt;createEmailCampaign&lt;/a&gt; method documentation.&lt;/span&gt;
     * @param body The update email campaign request payload
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link UpdateEmailCampaignResponse}
     */
    @jakarta.annotation.Nullable
    public UpdateEmailCampaignResponse put(@jakarta.annotation.Nonnull final UpdateCampaignRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, UpdateEmailCampaignResponse::createFromDiscriminatorValue);
    }
    /**
     * This method deletes the email campaign specified by the &lt;b&gt;email_campaign_id&lt;/b&gt; path parameter.&lt;br&gt;&lt;br&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/email_campaign/methods/getEmailCampaigns&quot;&gt;getEmailCampaigns&lt;/a&gt; to retrieve all of the seller&apos;s email campaigns. Use the &lt;b&gt;email_campaign_id&lt;/b&gt; of the desired email campaign in the response as the path parameter for this request.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * This method deletes the email campaign specified by the &lt;b&gt;email_campaign_id&lt;/b&gt; path parameter.&lt;br&gt;&lt;br&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/email_campaign/methods/getEmailCampaigns&quot;&gt;getEmailCampaigns&lt;/a&gt; to retrieve all of the seller&apos;s email campaigns. Use the &lt;b&gt;email_campaign_id&lt;/b&gt; of the desired email campaign in the response as the path parameter for this request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * This method returns the details of a single email campaign specified by the &lt;b&gt;email_campaign_id&lt;/b&gt; path parameter.&lt;br&gt;&lt;br&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getEmailCampaigns&quot;&gt;getEmailCampaigns&lt;/a&gt; to retrieve a list of all email campaigns from a seller&apos;s eBay store.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method returns the details of a single email campaign specified by the &lt;b&gt;email_campaign_id&lt;/b&gt; path parameter.&lt;br&gt;&lt;br&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getEmailCampaigns&quot;&gt;getEmailCampaigns&lt;/a&gt; to retrieve a list of all email campaigns from a seller&apos;s eBay store.
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
     * This method lets users update an existing email campaign. Pass the &lt;b&gt;emailCampaignId&lt;/b&gt; in the request URL and specify the changes to field values in the request payload.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;You can only update the custom fields of an email campaign. Fixed values, such as the &lt;b&gt;emailCampaignType&lt;/b&gt;, cannot be changed. For full specifications of fixed values for each email campaign type, see the &lt;a href=&quot;/api-docs/sell/marketing/resources/email_campaign/methods/createEmailCampaign&quot;&gt;createEmailCampaign&lt;/a&gt; method documentation.&lt;/span&gt;
     * @param body The update email campaign request payload
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UpdateCampaignRequest body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * This method lets users update an existing email campaign. Pass the &lt;b&gt;emailCampaignId&lt;/b&gt; in the request URL and specify the changes to field values in the request payload.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;You can only update the custom fields of an email campaign. Fixed values, such as the &lt;b&gt;emailCampaignType&lt;/b&gt;, cannot be changed. For full specifications of fixed values for each email campaign type, see the &lt;a href=&quot;/api-docs/sell/marketing/resources/email_campaign/methods/createEmailCampaign&quot;&gt;createEmailCampaign&lt;/a&gt; method documentation.&lt;/span&gt;
     * @param body The update email campaign request payload
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UpdateCampaignRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a {@link WithEmailCampaignItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithEmailCampaignItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithEmailCampaignItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
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
