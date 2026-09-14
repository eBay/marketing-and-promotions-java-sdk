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
import java.io.InputStream;
import com.microsoft.kiota.serialization.UntypedNode;

public final class RecommendationClient {
    private final RecommendationApiClient kiota;
    private final MarketingAndPromotionsConfiguration config;

    public RecommendationClient(RecommendationApiClient kiota, MarketingAndPromotionsConfiguration config) {
        this.kiota = kiota;
        this.config = config;
    }

    private Map<String, String> mergedHeaders(RequestOptions requestOptions) {
        Map<String, String> headers = new HashMap<>(config.getDefaultRequestOptions().getHeaders());
        if (requestOptions != null) {
            headers.putAll(requestOptions.getHeaders());
        }
        return headers;
    }

    public CompletableFuture<Void> findListingRecommendationsAsync(
            FindListingRecommendationRequest body, String filter, Integer limit, Integer offset, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.find().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (filter != null) config.queryParameters.filter = filter;
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
                if (xEBAYCMARKETPLACEID != null) config.headers.add("X-EBAY-C-MARKETPLACE-ID", xEBAYCMARKETPLACEID);
            });
            return null;
        }));
    }
}
