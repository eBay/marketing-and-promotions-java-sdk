# eBay Marketing and Promotions Java SDK

A production-ready Java SDK for eBay Marketing and Promotions APIs, providing unified access to Marketing and Recommendation REST APIs.

## Features

- **Marketing API**: Campaigns, ads, keywords, promotions, and email campaign management (30 operations)
- **Recommendation API**: Listing recommendations for marketing (1 operation)
- **Strong Typing**: Internal Kiota-generated types with public client wrappers
- **Per-call Overrides**: Pass per-request headers and access tokens alongside SDK-wide defaults

## Architecture

```
src/main/java/com/ebay/marketingandpromotions/
├── generated/                              # Kiota-generated REST clients (internal)
│   ├── marketing/
│   └── recommendation/
├── clients/
│   └── rest/
│       ├── MarketingClient.java            # REST client wrappers (public API)
│       └── RecommendationClient.java
├── configuration/                          # SDK configuration and auth
├── exceptions/                             # SDK exceptions
└── MarketingAndPromotionsClient.java       # Main SDK facade
```

## Requirements

- Java 17+
- Maven

## Installation

```xml
<dependency>
    <groupId>com.ebay</groupId>
    <artifactId>marketing-and-promotions-java-sdk</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Quick Start

```java
var config = new MarketingAndPromotionsConfiguration();
config.setAccessToken("your-oauth-token");

try (var sdk = new MarketingAndPromotionsClient(config)) {
    var campaigns = sdk.marketing.getCampaigns(null, "ACTIVE", "10", "0", null, null).join();

    var body = new FindListingRecommendationRequest();
    var recommendations = sdk.recommendation.findListingRecommendations(
        body, null, "10", "0", null, null).join();
}
```

Per-request headers and tokens can be passed to any method:

```java
var options = new RequestOptions();
options.addHeader("X-EBAY-C-MARKETPLACE-ID", "EBAY_US");

sdk.marketing.getCampaigns(null, null, "10", "0", "per-call-token", options).join();
```

## API Operations

### Marketing API

| Method | Description |
|---|---|
| `createCampaign` | Create a new ad campaign |
| `getCampaign` | Get a campaign by ID |
| `getCampaigns` | List campaigns with filters |
| `deleteCampaign` | Delete a campaign |
| `pauseCampaign` | Pause a campaign |
| `resumeCampaign` | Resume a paused campaign |
| `endCampaign` | End a campaign |
| `createAdByListingId` | Create an ad for a listing |
| `getAd` | Get an ad by ID |
| `getAds` | List ads in a campaign |
| `deleteAd` | Delete an ad |
| `createKeyword` | Add a keyword to a campaign |
| `getKeyword` | Get a keyword by ID |
| `getKeywords` | List keywords in a campaign |
| `createNegativeKeyword` | Add a negative keyword |
| `getNegativeKeyword` | Get a negative keyword by ID |
| `getNegativeKeywords` | List negative keywords |
| `getPromotions` | List promotions |
| `pausePromotion` | Pause a promotion |
| `resumePromotion` | Resume a promotion |
| `createItemPriceMarkdown` | Create a price markdown promotion |
| `getItemPriceMarkdown` | Get a price markdown by ID |
| `createItemPromotion` | Create an item promotion |
| `getItemPromotion` | Get an item promotion by ID |
| `createEmailCampaign` | Create an email campaign |
| `getEmailCampaign` | Get an email campaign by ID |
| `getEmailCampaigns` | List email campaigns |
| `deleteEmailCampaign` | Delete an email campaign |
| `getPromotionReports` | Get promotion performance reports |
| `getPromotionSummaryReport` | Get a promotion summary report |

### Recommendation API

| Method | Description |
|---|---|
| `findListingRecommendations` | Get marketing recommendations for listings |

## Error Handling

```java
try {
    var campaigns = sdk.marketing.getCampaigns(null, null, "10", "0", null, null).join();
} catch (MarketingAndPromotionsException ex) {
    System.err.println("SDK error: " + ex.getMessage());
}
```

## Configuration Options

| Property | Default | Description |
|---|---|---|
| `marketingBaseUrl` | `https://api.ebay.com/sell/marketing/v1` | Marketing API base URL |
| `recommendationBaseUrl` | `https://api.ebay.com/sell/recommendation/v1` | Recommendation API base URL |
| `accessToken` | `null` | Static fallback token; per-call token takes precedence |
| `defaultRequestOptions` | `RequestOptions()` | Default headers applied to all SDK calls |
| `diagnosticLogging` | `false` | Enable diagnostic request/response logging |

## Regenerating the SDK

```bash
./generate.sh
mvn clean install
```

## Development

```bash
mvn clean install   # Build and install
mvn test            # Run tests
mvn package         # Package
```

## Specs

- `sell_marketing_v1_oas3.yaml` — Marketing V1
- `sell_recommendation_v1_oas3.yaml` — Recommendation V1

## Dependencies

- **microsoft-kiota-bundle**: REST client generation and runtime
- **okhttp3**: HTTP client
- **jackson-databind**: JSON processing
- **slf4j-api**: Logging facade

## License

Apache 2.0 © 2026 eBay Inc. See [LICENSE](LICENSE) for details.
