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

package com.ebay.marketingandpromotions.clients.rest;

import com.ebay.marketingandpromotions.configuration.MarketingAndPromotionsConfiguration;
import com.ebay.marketingandpromotions.configuration.RequestOptions;
import com.ebay.marketingandpromotions.configuration.TokenContext;
import com.ebay.marketingandpromotions.generated.recommendation.RecommendationApiClient;
import com.ebay.marketingandpromotions.generated.recommendation.models.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Client for the Sell Recommendation API.
 * Provides methods to retrieve marketing recommendations for listings.
 */
public final class RecommendationClient {
    private final RecommendationApiClient kiota;
    private final MarketingAndPromotionsConfiguration config;

    public RecommendationClient(RecommendationApiClient kiota, MarketingAndPromotionsConfiguration config) {
        this.kiota = kiota;
        this.config = config;
    }

    /**
     * Merges default headers from config with per-call headers.
     * Per-call headers override defaults.
     */
    private Map<String, String> mergedHeaders(RequestOptions requestOptions) {
        Map<String, String> headers = new HashMap<>(config.getDefaultRequestOptions().getHeaders());
        if (requestOptions != null) {
            headers.putAll(requestOptions.getHeaders());
        }
        return headers;
    }

    /**
     * Retrieves marketing recommendations for listings.
     *
     * @param body Request body with listing criteria
     * @param filter Optional filter parameter
     * @param limit Maximum number of results to return
     * @param offset Number of results to skip
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers
     * @return Paged collection of listing recommendations
     */
    public CompletableFuture<PagedListingRecommendationCollection> findListingRecommendationsAsync(
            FindListingRecommendationRequest body, String filter, String limit, String offset,
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.find().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (filter != null) config.queryParameters.filter = filter;
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
            });
        });
    }
}
