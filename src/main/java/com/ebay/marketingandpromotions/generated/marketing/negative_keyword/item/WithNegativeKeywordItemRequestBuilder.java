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

package com.ebay.marketingandpromotions.generated.marketing.negative_keyword.item;

import com.ebay.marketingandpromotions.generated.marketing.models.Error;
import com.ebay.marketingandpromotions.generated.marketing.models.NegativeKeyword;
import com.ebay.marketingandpromotions.generated.marketing.models.UpdateNegativeKeywordRequest;
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
 * Builds and executes requests for operations under /negative_keyword/{negative_keyword_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithNegativeKeywordItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithNegativeKeywordItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithNegativeKeywordItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/negative_keyword/{negative_keyword_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithNegativeKeywordItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithNegativeKeywordItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/negative_keyword/{negative_keyword_id}", rawUrl);
    }
    /**
     * This method retrieves details on a specific negative keyword.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;negative_keyword_id&lt;/b&gt; as a path parameter.
     * @return a {@link NegativeKeyword}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public NegativeKeyword get() {
        return get(null);
    }
    /**
     * This method retrieves details on a specific negative keyword.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;negative_keyword_id&lt;/b&gt; as a path parameter.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link NegativeKeyword}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public NegativeKeyword get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("403", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("409", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, NegativeKeyword::createFromDiscriminatorValue);
    }
    /**
     * This method updates the status of an existing negative keyword.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;negative_keyword_id&lt;/b&gt; as a path parameter, and specify the &lt;b&gt;negativeKeywordStatus&lt;/b&gt; in the request body.
     * @param body A type that defines the fields for the request to update a negative keyword.
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    public void put(@jakarta.annotation.Nonnull final UpdateNegativeKeywordRequest body) {
        put(body, null);
    }
    /**
     * This method updates the status of an existing negative keyword.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;negative_keyword_id&lt;/b&gt; as a path parameter, and specify the &lt;b&gt;negativeKeywordStatus&lt;/b&gt; in the request body.
     * @param body A type that defines the fields for the request to update a negative keyword.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    public void put(@jakarta.annotation.Nonnull final UpdateNegativeKeywordRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("403", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("409", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * This method retrieves details on a specific negative keyword.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;negative_keyword_id&lt;/b&gt; as a path parameter.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves details on a specific negative keyword.&lt;br /&gt;&lt;br /&gt;In the request, specify the &lt;b&gt;negative_keyword_id&lt;/b&gt; as a path parameter.
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
     * This method updates the status of an existing negative keyword.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;negative_keyword_id&lt;/b&gt; as a path parameter, and specify the &lt;b&gt;negativeKeywordStatus&lt;/b&gt; in the request body.
     * @param body A type that defines the fields for the request to update a negative keyword.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UpdateNegativeKeywordRequest body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * This method updates the status of an existing negative keyword.&lt;br /&gt;&lt;br /&gt;Specify the &lt;b&gt;negative_keyword_id&lt;/b&gt; as a path parameter, and specify the &lt;b&gt;negativeKeywordStatus&lt;/b&gt; in the request body.
     * @param body A type that defines the fields for the request to update a negative keyword.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final UpdateNegativeKeywordRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a {@link WithNegativeKeywordItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithNegativeKeywordItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithNegativeKeywordItemRequestBuilder(rawUrl, requestAdapter);
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
