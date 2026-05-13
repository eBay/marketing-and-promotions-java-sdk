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
