# Marketing and Promotions Java SDK

Java SDK for eBay Marketing and Promotions APIs. Provides type-safe clients for managing campaigns, ads, keywords, promotions, and email campaigns.

## Features

- Marketing API - Campaign, ad, keyword, promotion, and email campaign management
- Recommendation API - Listing recommendations
- Per-call token support for multi-tenant applications
- RequestOptions for custom headers (marketplace IDs, correlation IDs, etc.)
- Maven-based build (Java 17+)
- Kiota 1.9.2 generated clients

## Installation

### Local Development

```bash
mvn clean install -DskipTests
```

### Maven Dependency

```xml
<dependency>
    <groupId>com.ebay</groupId>
    <artifactId>marketing-and-promotions-java-sdk</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Quick Start

### Basic Usage

```java
import com.ebay.marketingandpromotions.MarketingAndPromotionsClient;
import com.ebay.marketingandpromotions.configuration.MarketingAndPromotionsConfiguration;

var config = new MarketingAndPromotionsConfiguration();
config.setAccessToken("your-oauth-token");

try (var sdk = new MarketingAndPromotionsClient(config)) {
    // Get campaigns
    var campaigns = sdk.marketing.getCampaigns(null, "ACTIVE", "10", "0", null, null).join();
    System.out.println("Campaigns: " + campaigns);
    
    // Get recommendations
    var body = new FindListingRecommendationRequest();
    var recommendations = sdk.recommendation.findListingRecommendations(
        body, null, "10", "0", null, null
    ).join();
    System.out.println("Recommendations: " + recommendations);
}
```

### Per-Call Tokens (Multi-Tenant)

```java
var config = new MarketingAndPromotionsConfiguration();
// No default token set

try (var sdk = new MarketingAndPromotionsClient(config)) {
    // Pass different token per user
    var campaigns1 = sdk.marketing.getCampaigns(null, null, "10", "0", userToken1, null).join();
    var campaigns2 = sdk.marketing.getCampaigns(null, null, "10", "0", userToken2, null).join();
}
```

### Custom Headers

```java
import com.ebay.marketingandpromotions.configuration.RequestOptions;

var options = new RequestOptions();
options.addHeader("X-EBAY-C-MARKETPLACE-ID", "EBAY_US");
options.addHeader("X-Request-ID", "correlation-123");

try (var sdk = new MarketingAndPromotionsClient(config)) {
    var campaigns = sdk.marketing.getCampaigns(null, null, "10", "0", null, options).join();
}
```

### Global Headers

```java
var config = new MarketingAndPromotionsConfiguration();
config.getDefaultRequestOptions().addHeader("X-EBAY-C-MARKETPLACE-ID", "EBAY_US");

try (var sdk = new MarketingAndPromotionsClient(config)) {
    // All requests include the global header
    var campaigns = sdk.marketing.getCampaigns(null, null, "10", "0", null, null).join();
}
```

## API Coverage

### Marketing API

**Campaigns:**
- `createCampaign()` - Create a new ad campaign
- `getCampaign()` - Get campaign by ID
- `getCampaigns()` - List campaigns with filters
- `deleteCampaign()` - Delete a campaign
- `pauseCampaign()` - Pause a campaign
- `resumeCampaign()` - Resume a paused campaign
- `endCampaign()` - End a campaign

**Ads:**
- `createAdByListingId()` - Create ad for a listing
- `getAd()` - Get ad by ID
- `getAds()` - List ads in a campaign
- `deleteAd()` - Delete an ad

**Keywords:**
- `createKeyword()` - Add keyword to campaign
- `getKeyword()` - Get keyword by ID
- `getKeywords()` - List keywords in campaign

**Negative Keywords:**
- `createNegativeKeyword()` - Add negative keyword
- `getNegativeKeyword()` - Get negative keyword by ID
- `getNegativeKeywords()` - List negative keywords

**Promotions:**
- `getPromotions()` - List promotions
- `pausePromotion()` - Pause a promotion
- `resumePromotion()` - Resume a promotion

**Item Price Markdown:**
- `createItemPriceMarkdown()` - Create price markdown promotion
- `getItemPriceMarkdown()` - Get price markdown by ID

**Item Promotion:**
- `createItemPromotion()` - Create item promotion
- `getItemPromotion()` - Get item promotion by ID

**Email Campaigns:**
- `createEmailCampaign()` - Create email campaign
- `getEmailCampaign()` - Get email campaign by ID
- `getEmailCampaigns()` - List email campaigns
- `deleteEmailCampaign()` - Delete email campaign

**Reports:**
- `getPromotionReports()` - Get promotion performance reports
- `getPromotionSummaryReport()` - Get summary report

### Recommendation API

- `findListingRecommendations()` - Get marketing recommendations for listings

## Configuration

### Base URLs

Default URLs point to production:

```java
config.setMarketingBaseUrl("https://api.ebay.com/sell/marketing/v1");
config.setRecommendationBaseUrl("https://api.ebay.com/sell/recommendation/v1");
```

For sandbox:

```java
config.setMarketingBaseUrl("https://api.sandbox.ebay.com/sell/marketing/v1");
config.setRecommendationBaseUrl("https://api.sandbox.ebay.com/sell/recommendation/v1");
```

### Authentication

The SDK supports two authentication patterns:

1. **Static token** - Set once in configuration, used for all requests
2. **Per-call token** - Pass token with each request (overrides static token)

```java
// Static token (fallback)
config.setAccessToken("static-token");

// Per-call token (takes precedence)
sdk.marketing.getCampaigns(null, null, "10", "0", "per-call-token", null);
```

## Examples

### Create and Manage Campaign

```java
import com.ebay.marketingandpromotions.generated.marketing.models.*;

var createRequest = new CreateCampaignRequest();
// Set campaign details...

try (var sdk = new MarketingAndPromotionsClient(config)) {
    // Create campaign
    var campaign = sdk.marketing.createCampaign(createRequest, token, null).join();
    String campaignId = extractId(campaign);
    
    // Pause campaign
    sdk.marketing.pauseCampaign(campaignId, token, null).join();
    
    // Resume campaign
    sdk.marketing.resumeCampaign(campaignId, token, null).join();
    
    // End campaign
    sdk.marketing.endCampaign(campaignId, token, null).join();
}
```

### Get Recommendations

```java
var body = new FindListingRecommendationRequest();
// Set criteria...

try (var sdk = new MarketingAndPromotionsClient(config)) {
    var recommendations = sdk.recommendation.findListingRecommendations(
        body, 
        null,  // filter
        "20",  // limit
        "0",   // offset
        token, 
        null
    ).join();
    
    recommendations.getListingRecommendations().forEach(rec -> {
        System.out.println("Recommendation: " + rec);
    });
}
```

## Development

### Build

```bash
mvn clean compile
```

### Install Locally

```bash
mvn clean install -DskipTests
```

### Regenerate Kiota Clients

```bash
./generate.sh
```

## Architecture

- `MarketingAndPromotionsClient` - Main facade, exposes `marketing` and `recommendation` properties
- `MarketingClient` - Wrapper over Kiota-generated Marketing API client
- `RecommendationClient` - Wrapper over Kiota-generated Recommendation API client
- `MarketingAndPromotionsConfiguration` - Base URLs, auth, and default headers
- `TokenContext` - ThreadLocal carrier for per-call tokens
- `RequestOptions` - Per-call custom headers
- `KiotaAuthProvider` - Bridges TokenContext + config into Kiota auth

## Requirements

- Java 17+
- Maven 3.6+

## License

Proprietary - eBay Inc.
