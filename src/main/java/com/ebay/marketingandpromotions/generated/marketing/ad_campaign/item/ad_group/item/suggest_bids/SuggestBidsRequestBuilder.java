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

package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.ad_group.item.suggest_bids;

import com.ebay.marketingandpromotions.generated.marketing.models.ErrorDetailV3;
import com.ebay.marketingandpromotions.generated.marketing.models.TargetedBidRequest;
import com.ebay.marketingandpromotions.generated.marketing.models.TargetedBidsPagedCollection;
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
 * Builds and executes requests for operations under /ad_campaign/{campaign_id}/ad_group/{ad_group_id}/suggest_bids
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SuggestBidsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link SuggestBidsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SuggestBidsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/ad_group/{ad_group_id}/suggest_bids", pathParameters);
    }
    /**
     * Instantiates a new {@link SuggestBidsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SuggestBidsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/ad_group/{ad_group_id}/suggest_bids", rawUrl);
    }
    /**
     * This method allows sellers to retrieve the suggested bids for input keywords and match type.
     * @param body The data requested to retrieve the suggested bids.
     * @return a {@link TargetedBidsPagedCollection}
     * @throws ErrorDetailV3 When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 404 status code
     * @throws ErrorDetailV3 When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public TargetedBidsPagedCollection post(@jakarta.annotation.Nonnull final TargetedBidRequest body) {
        return post(body, null);
    }
    /**
     * This method allows sellers to retrieve the suggested bids for input keywords and match type.
     * @param body The data requested to retrieve the suggested bids.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link TargetedBidsPagedCollection}
     * @throws ErrorDetailV3 When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 404 status code
     * @throws ErrorDetailV3 When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public TargetedBidsPagedCollection post(@jakarta.annotation.Nonnull final TargetedBidRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("404", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("409", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorDetailV3::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, TargetedBidsPagedCollection::createFromDiscriminatorValue);
    }
    /**
     * This method allows sellers to retrieve the suggested bids for input keywords and match type.
     * @param body The data requested to retrieve the suggested bids.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final TargetedBidRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method allows sellers to retrieve the suggested bids for input keywords and match type.
     * @param body The data requested to retrieve the suggested bids.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final TargetedBidRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link SuggestBidsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SuggestBidsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SuggestBidsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
