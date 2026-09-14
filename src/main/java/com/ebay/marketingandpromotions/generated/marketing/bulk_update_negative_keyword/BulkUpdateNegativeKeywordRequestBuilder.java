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

package com.ebay.marketingandpromotions.generated.marketing.bulk_update_negative_keyword;

import com.ebay.marketingandpromotions.generated.marketing.models.BulkUpdateNegativeKeywordRequest;
import com.ebay.marketingandpromotions.generated.marketing.models.BulkUpdateNegativeKeywordResponse;
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
 * Builds and executes requests for operations under /bulk_update_negative_keyword
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkUpdateNegativeKeywordRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link BulkUpdateNegativeKeywordRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkUpdateNegativeKeywordRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/bulk_update_negative_keyword", pathParameters);
    }
    /**
     * Instantiates a new {@link BulkUpdateNegativeKeywordRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkUpdateNegativeKeywordRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/bulk_update_negative_keyword", rawUrl);
    }
    /**
     * This method updates the statuses of existing negative keywords, in bulk.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;negativeKeywordId&lt;/b&gt; and &lt;b&gt;negativeKeywordStatus&lt;/b&gt; in the request body.
     * @param body A type that defines the fields for the bulk request to update negative keyword statuses.
     * @return a {@link BulkUpdateNegativeKeywordResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public BulkUpdateNegativeKeywordResponse post(@jakarta.annotation.Nonnull final BulkUpdateNegativeKeywordRequest body) {
        return post(body, null);
    }
    /**
     * This method updates the statuses of existing negative keywords, in bulk.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;negativeKeywordId&lt;/b&gt; and &lt;b&gt;negativeKeywordStatus&lt;/b&gt; in the request body.
     * @param body A type that defines the fields for the bulk request to update negative keyword statuses.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link BulkUpdateNegativeKeywordResponse}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public BulkUpdateNegativeKeywordResponse post(@jakarta.annotation.Nonnull final BulkUpdateNegativeKeywordRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("403", Error::createFromDiscriminatorValue);
        errorMapping.put("409", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, BulkUpdateNegativeKeywordResponse::createFromDiscriminatorValue);
    }
    /**
     * This method updates the statuses of existing negative keywords, in bulk.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;negativeKeywordId&lt;/b&gt; and &lt;b&gt;negativeKeywordStatus&lt;/b&gt; in the request body.
     * @param body A type that defines the fields for the bulk request to update negative keyword statuses.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkUpdateNegativeKeywordRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method updates the statuses of existing negative keywords, in bulk.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;negativeKeywordId&lt;/b&gt; and &lt;b&gt;negativeKeywordStatus&lt;/b&gt; in the request body.
     * @param body A type that defines the fields for the bulk request to update negative keyword statuses.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkUpdateNegativeKeywordRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link BulkUpdateNegativeKeywordRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkUpdateNegativeKeywordRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BulkUpdateNegativeKeywordRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
