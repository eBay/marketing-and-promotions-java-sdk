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
