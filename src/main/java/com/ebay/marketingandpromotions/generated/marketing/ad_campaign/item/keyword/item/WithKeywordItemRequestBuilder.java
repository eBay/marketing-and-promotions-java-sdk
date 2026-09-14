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

package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.keyword.item;

import com.ebay.marketingandpromotions.generated.marketing.models.Error;
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
     * This method retrieves details on a specific keyword from an ad group within a priority strategy campaign that uses the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;keyword_id&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller and call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-keyword-getkeywords&quot;&gt;getKeywords&lt;/a&gt; method to retrieve their keyword IDs.
     * @return a {@link Keyword}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public Keyword get() {
        return get(null);
    }
    /**
     * This method retrieves details on a specific keyword from an ad group within a priority strategy campaign that uses the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;keyword_id&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller and call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-keyword-getkeywords&quot;&gt;getKeywords&lt;/a&gt; method to retrieve their keyword IDs.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Keyword}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public Keyword get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("409", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Keyword::createFromDiscriminatorValue);
    }
    /**
     * This method updates keywords using a campaign ID and keyword ID for an existing priority strategy campaign.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;keyword_id&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller and call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-keyword-getkeywords&quot;&gt;getKeywords&lt;/a&gt; method to retrieve their keyword IDs.
     * @param body A type that defines the fields for the request to update a keyword.
     * @return a {@link UpdateKeywordResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public UpdateKeywordResponse put(@jakarta.annotation.Nonnull final UpdateKeywordRequest body) {
        return put(body, null);
    }
    /**
     * This method updates keywords using a campaign ID and keyword ID for an existing priority strategy campaign.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;keyword_id&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller and call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-keyword-getkeywords&quot;&gt;getKeywords&lt;/a&gt; method to retrieve their keyword IDs.
     * @param body A type that defines the fields for the request to update a keyword.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link UpdateKeywordResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public UpdateKeywordResponse put(@jakarta.annotation.Nonnull final UpdateKeywordRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("409", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, UpdateKeywordResponse::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves details on a specific keyword from an ad group within a priority strategy campaign that uses the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;keyword_id&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller and call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-keyword-getkeywords&quot;&gt;getKeywords&lt;/a&gt; method to retrieve their keyword IDs.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves details on a specific keyword from an ad group within a priority strategy campaign that uses the Cost Per Click (CPC) funding model.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;keyword_id&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller and call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-keyword-getkeywords&quot;&gt;getKeywords&lt;/a&gt; method to retrieve their keyword IDs.
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
     * This method updates keywords using a campaign ID and keyword ID for an existing priority strategy campaign.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;keyword_id&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller and call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-keyword-getkeywords&quot;&gt;getKeywords&lt;/a&gt; method to retrieve their keyword IDs.
     * @param body A type that defines the fields for the request to update a keyword.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UpdateKeywordRequest body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * This method updates keywords using a campaign ID and keyword ID for an existing priority strategy campaign.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;campaign_id&lt;/b&gt; and &lt;b&gt;keyword_id&lt;/b&gt; as path parameters.&lt;br /&gt;&lt;br /&gt;Call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of current campaign IDs for a seller and call the &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-keyword-getkeywords&quot;&gt;getKeywords&lt;/a&gt; method to retrieve their keyword IDs.
     * @param body A type that defines the fields for the request to update a keyword.
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
