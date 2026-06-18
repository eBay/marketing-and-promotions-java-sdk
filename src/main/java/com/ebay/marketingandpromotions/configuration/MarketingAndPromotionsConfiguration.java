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

package com.ebay.marketingandpromotions.configuration;

import java.net.URI;
import java.util.Set;
import java.util.HashSet;

/**
 * Configuration for the Marketing and Promotions SDK.
 * Provides base URLs for Marketing and Recommendation APIs and optional fallback access token.
 */
public final class MarketingAndPromotionsConfiguration {
    // Base URLs for each API
    private final String marketingBaseUrl;
    private final String recommendationBaseUrl;

    private String accessToken;  // static fallback; per-call token takes precedence
    private boolean diagnosticLogging = false;

    /**
     * Default request options (headers) applied to all SDK calls.
     * Per-call RequestOptions will override these.
     */
    private RequestOptions defaultRequestOptions = new RequestOptions();

    /** Default constructor using production eBay API endpoints. */
    public MarketingAndPromotionsConfiguration() {
        this.marketingBaseUrl = "https://api.ebay.com";
        this.recommendationBaseUrl = "https://api.ebay.com";
    }

    /**
     * Constructor accepting custom base URLs. Each URL is validated against the allowed-host list.
     *
     * @param marketingBaseUrl       Base URL for the Marketing API
     * @param recommendationBaseUrl  Base URL for the Recommendation API
     */
    public MarketingAndPromotionsConfiguration(String marketingBaseUrl, String recommendationBaseUrl) {
        this.marketingBaseUrl = validateHost(marketingBaseUrl);
        this.recommendationBaseUrl = validateHost(recommendationBaseUrl);
    }

    private static final Set<String> STATIC_ALLOWED_HOSTS = new HashSet<>(java.util.Arrays.asList(
            "api.ebay.com", "api.sandbox.ebay.com"));

    private String validateHost(String url) {
        try {
            String host = new java.net.URI(url).getHost();
            if (host == null || !STATIC_ALLOWED_HOSTS.contains(host)) {
                throw new IllegalArgumentException("URL host not in allowed list: " + url);
            }
        } catch (java.net.URISyntaxException e) {
            throw new IllegalArgumentException("Invalid URL: " + url, e);
        }
        return url;
    }

    // Getters
    public String getMarketingBaseUrl() { return marketingBaseUrl; }

    public String getRecommendationBaseUrl() { return recommendationBaseUrl; }

    /**
     * Sets the static fallback access token.
     *
     * <p><strong>Security note:</strong> Access tokens are stored as plain {@code String} objects on
     * the heap. Avoid logging or serialising instances of this class; clear the token reference when
     * no longer needed.
     */
    public String getAccessToken() { return accessToken; }
    public void setAccessToken(String accessToken) { this.accessToken = accessToken; }

    public boolean isDiagnosticLogging() { return diagnosticLogging; }
    public void setDiagnosticLogging(boolean diagnosticLogging) { this.diagnosticLogging = diagnosticLogging; }

    public RequestOptions getDefaultRequestOptions() { return defaultRequestOptions; }
    public void setDefaultRequestOptions(RequestOptions defaultRequestOptions) { this.defaultRequestOptions = defaultRequestOptions; }

    /**
     * All hostnames tokens may be sent to; used by AllowedHostsValidator.
     */
    public Set<String> getAllowedHosts() {
        Set<String> hosts = new HashSet<>();
        hosts.add(extractHost(marketingBaseUrl));
        hosts.add(extractHost(recommendationBaseUrl));
        return hosts;
    }

    private String extractHost(String url) {
        try {
            return URI.create(url).getHost();
        } catch (Exception e) {
            return "api.ebay.com"; // fallback
        }
    }
}
