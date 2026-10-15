# ChangeLog

## 0.2.2 (10/15/2026)

### Dependencies

- DCCOMICS-21031: Bumped transitive `com.google.guava:guava` from 33.4.0-jre to 33.7.2-jre for Error Prone and NullAway to fix CVE-2026-102554 (SNYK-JAVA-COMGOOGLEGUAVA-20825054), an allocation of resources without limits vulnerability during deserialization.

## 0.2.1 (09/25/2026)

### Dependencies

- Bumped `com.fasterxml.jackson.core:jackson-databind` from 2.22.2 to 2.22.3.


## 0.2.0 (09/14/2026)

### Breaking changes

#### Renamed operations

| Previous | Current |
| --- | --- |
| `MarketingClient.createItemPriceMarkdownAsync` | `MarketingClient.createItemPriceMarkdownPromotionAsync` |
| `MarketingClient.getItemPriceMarkdownAsync` | `MarketingClient.getItemPriceMarkdownPromotionAsync` |

#### Changed signatures

`MarketingClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `createEmailCampaignAsync` | `(CreateEmailCampaignRequest body, String accessToken, RequestOptions requestOptions)` | `(CreateEmailCampaignRequest body, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` |
| `findCampaignByAdReferenceAsync` | `(String inventoryReferenceId, String inventoryReferenceType, String listingId, String accessToken, RequestOptions requestOptions)` | `(String inventoryReferenceId, FindCampaignInventoryReferenceType inventoryReferenceType, String listingId, String accessToken, RequestOptions requestOptions)` |
| `getAdAsync` | `(String adId, String campaignId, String accessToken, RequestOptions requestOptions)` | `(String adId, String campaignId, AdFieldgroups fieldgroups, String accessToken, RequestOptions requestOptions)` |
| `getAdGroupsAsync` | `(String campaignId, String adGroupStatus, String limit, String offset, String accessToken, RequestOptions requestOptions)` | `(String campaignId, AdGroupStatus adGroupStatus, String limit, String offset, String accessToken, RequestOptions requestOptions)` |
| `getAdsAsync` | `(String campaignId, String adStatus, String limit, String offset, String accessToken, RequestOptions requestOptions)` | `(String campaignId, String adGroupIds, AdStatus adStatus, String limit, String listingIds, String offset, AdListFieldgroups fieldgroups, String accessToken, RequestOptions requestOptions)` |
| `getAdsByInventoryReferenceAsync` | `(String campaignId, String inventoryReferenceId, String inventoryReferenceType, String accessToken, RequestOptions requestOptions)` | `(String campaignId, String inventoryReferenceId, AdsInventoryReferenceType inventoryReferenceType, String accessToken, RequestOptions requestOptions)` |
| `getCampaignsAsync` | `(String campaignName, String campaignStatus, String limit, String offset, String accessToken, RequestOptions requestOptions)` | `(String campaignName, CampaignStatus campaignStatus, CampaignTargetingTypes campaignTargetingTypes, Channels channels, String endDateRange, FundingStrategy fundingStrategy, String limit, String offset, String startDateRange, String marketplaceId, String accessToken, RequestOptions requestOptions)` |
| `getEmailCampaignsAsync` | `(String query, String limit, String offset, String accessToken, RequestOptions requestOptions)` | `(String limit, String offset, String q, String sort, String accessToken, RequestOptions requestOptions)` |
| `getKeywordsAsync` | `(String campaignId, String keywordStatus, String limit, String offset, String accessToken, RequestOptions requestOptions)` | `(String campaignId, String adGroupIds, KeywordStatus keywordStatus, String limit, String offset, String accessToken, RequestOptions requestOptions)` |
| `getListingSetAsync` | `(String promotionId, String limit, String offset, String q, String sort, String status, String accessToken, RequestOptions requestOptions)` | `(String promotionId, String limit, String offset, String q, String sort, ItemMarkdownStatusEnum status, String accessToken, RequestOptions requestOptions)` |
| `getNegativeKeywordsAsync` | `(String campaignIds, String adGroupIds, String limit, String offset, String accessToken, RequestOptions requestOptions)` | `(String adGroupIds, String campaignIds, String limit, NegativeKeywordStatus negativeKeywordStatus, String offset, String accessToken, RequestOptions requestOptions)` |
| `getPromotionReportsAsync` | `(String marketplaceId, String limit, String offset, String promotionStatus, String accessToken, RequestOptions requestOptions)` | `(String limit, String marketplaceId, String offset, String promotionStatus, String promotionType, String q, String accessToken, RequestOptions requestOptions)` |
| `getPromotionsAsync` | `(String marketplaceId, String limit, String offset, String promotionStatus, String accessToken, RequestOptions requestOptions)` | `(String limit, String marketplaceId, String offset, String promotionStatus, String promotionType, String q, String sort, String accessToken, RequestOptions requestOptions)` |

`RecommendationClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `findListingRecommendationsAsync` | `(FindListingRecommendationRequest body, String filter, String limit, String offset, String accessToken, RequestOptions requestOptions)` | `(FindListingRecommendationRequest body, String filter, Integer limit, Integer offset, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` |

Type aliases used in the table:

| Alias | Generated type |
| --- | --- |
| `AdFieldgroups` | `marketing.ad_campaign.item.ad.item.GetFieldgroupsQueryParameterType` |
| `AdGroupStatus` | `marketing.ad_campaign.item.ad_group.GetAdGroupStatusQueryParameterType` |
| `AdListFieldgroups` | `marketing.ad_campaign.item.ad.GetFieldgroupsQueryParameterType` |
| `AdStatus` | `marketing.ad_campaign.item.ad.GetAdStatusQueryParameterType` |
| `CampaignStatus` | `marketing.ad_campaign.GetCampaignStatusQueryParameterType` |
| `CampaignTargetingTypes` | `marketing.ad_campaign.GetCampaignTargetingTypesQueryParameterType` |
| `Channels` | `marketing.ad_campaign.GetChannelsQueryParameterType` |
| `FundingStrategy` | `marketing.ad_campaign.GetFundingStrategyQueryParameterType` |
| `AdsInventoryReferenceType` | `marketing.ad_campaign.item.get_ads_by_inventory_reference.GetInventoryReferenceTypeQueryParameterType` |
| `FindCampaignInventoryReferenceType` | `marketing.ad_campaign.find_campaign_by_ad_reference.GetInventoryReferenceTypeQueryParameterType` |
| `KeywordStatus` | `marketing.ad_campaign.item.keyword.GetKeywordStatusQueryParameterType` |
| `NegativeKeywordStatus` | `marketing.negative_keyword.GetNegativeKeywordStatusQueryParameterType` |
| `ItemMarkdownStatusEnum` | `marketing.models.ItemMarkdownStatusEnum` |

All generated type paths are relative to `com.ebay.marketingandpromotions.generated`.

### Added

#### `MarketingClient`

- `bulkCreateAdsByInventoryReferenceAsync`
- `bulkCreateAdsByListingIdAsync`
- `bulkCreateKeywordAsync`
- `bulkCreateNegativeKeywordAsync`
- `bulkDeleteAdsByInventoryReferenceAsync`
- `bulkDeleteAdsByListingIdAsync`
- `bulkUpdateAdsBidByInventoryReferenceAsync`
- `bulkUpdateAdsBidByListingIdAsync`
- `bulkUpdateAdsStatusAsync`
- `bulkUpdateAdsStatusByListingIdAsync`
- `bulkUpdateKeywordAsync`
- `bulkUpdateNegativeKeywordAsync`
- `bulkUpsertVideoAdsPreferencesAsync`
- `cloneCampaignAsync`
- `createAdGroupAsync`
- `createAdsByInventoryReferenceAsync`
- `createReportTaskAsync`
- `deleteAdsByInventoryReferenceAsync`
- `deleteItemPriceMarkdownPromotionAsync`
- `deleteItemPromotionAsync`
- `deleteReportTaskAsync`
- `findCampaignByAdReferenceAsync`
- `getAdGroupAsync`
- `getAdGroupsAsync`
- `getAdsByInventoryReferenceAsync`
- `getAudiencesAsync`
- `getCampaignByNameAsync`
- `getEmailPreviewAsync`
- `getEmailReportAsync`
- `getListingSetAsync`
- `getReportAsync`
- `getReportMetadataForReportTypeAsync`
- `getReportTaskAsync`
- `getReportTasksAsync`
- `suggestBidsAsync`
- `suggestBudgetAsync`
- `suggestItemsAsync`
- `suggestKeywordsAsync`
- `suggestMaxCpcAsync`
- `updateAdGroupAsync`
- `updateAdRateStrategyAsync`
- `updateBidAsync`
- `updateBiddingStrategyAsync`
- `updateCampaignBudgetAsync`
- `updateCampaignIdentificationAsync`
- `updateEmailCampaignAsync`
- `updateItemPriceMarkdownPromotionAsync`
- `updateItemPromotionAsync`
- `updateKeywordAsync`
- `updateNegativeKeywordAsync`
- `upsertVideoAdsPreferencesAsync`