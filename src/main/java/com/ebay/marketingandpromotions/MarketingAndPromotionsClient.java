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

package com.ebay.marketingandpromotions;

import com.ebay.marketingandpromotions.clients.rest.MarketingClient;
import com.ebay.marketingandpromotions.clients.rest.RecommendationClient;
import com.ebay.marketingandpromotions.configuration.KiotaAuthProvider;
import com.ebay.marketingandpromotions.configuration.MarketingAndPromotionsConfiguration;
import com.ebay.marketingandpromotions.generated.marketing.MarketingApiClient;
import com.ebay.marketingandpromotions.generated.recommendation.RecommendationApiClient;
import com.microsoft.kiota.authentication.BaseBearerTokenAuthenticationProvider;
import com.microsoft.kiota.http.OkHttpRequestAdapter;
import okhttp3.OkHttpClient;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/**
 * Main facade for the Marketing and Promotions SDK.
 * Provides unified access to Marketing and Recommendation APIs.
 *
 * <pre>{@code
 * var config = new MarketingAndPromotionsConfiguration();
 * config.setAccessToken("your-token");
 *
 * try (var sdk = new MarketingAndPromotionsClient(config)) {
 *     var campaigns = sdk.marketing.getCampaigns(null, null, "10", "0", null, null).join();
 *     System.out.println(campaigns);
 * }
 * }</pre>
 */
public final class MarketingAndPromotionsClient implements Closeable {
    private final OkHttpClient sharedHttpClient;

    public final MarketingClient marketing;
    public final RecommendationClient recommendation;

    public MarketingAndPromotionsClient(MarketingAndPromotionsConfiguration config) {
        // Shared OkHttpClient for all REST clients
        this.sharedHttpClient = new OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .build();

        var authProvider = new BaseBearerTokenAuthenticationProvider(new KiotaAuthProvider(config));

        // Marketing API client
        var marketingAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        marketingAdapter.setBaseUrl(config.getMarketingBaseUrl());
        this.marketing = new MarketingClient(new MarketingApiClient(marketingAdapter), config);

        // Recommendation API client
        var recommendationAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        recommendationAdapter.setBaseUrl(config.getRecommendationBaseUrl());
        this.recommendation = new RecommendationClient(new RecommendationApiClient(recommendationAdapter), config);
    }

    /**
     * Constructor with custom OkHttpClient.
     * Useful for testing or custom HTTP configuration.
     */
    public MarketingAndPromotionsClient(MarketingAndPromotionsConfiguration config, OkHttpClient httpClient) {
        this.sharedHttpClient = httpClient;

        var authProvider = new BaseBearerTokenAuthenticationProvider(new KiotaAuthProvider(config));

        var marketingAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        marketingAdapter.setBaseUrl(config.getMarketingBaseUrl());
        this.marketing = new MarketingClient(new MarketingApiClient(marketingAdapter), config);

        var recommendationAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        recommendationAdapter.setBaseUrl(config.getRecommendationBaseUrl());
        this.recommendation = new RecommendationClient(new RecommendationApiClient(recommendationAdapter), config);
    }

    @Override
    public void close() {
        sharedHttpClient.dispatcher().executorService().shutdown();
        sharedHttpClient.connectionPool().evictAll();
    }
}
