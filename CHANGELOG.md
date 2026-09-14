# ChangeLog

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
| `createEmailCampaignAsync` | `(CreateEmailCampaignRequest, String, RequestOptions)` | `(CreateEmailCampaignRequest, String, String, RequestOptions)` |
| `findCampaignByAdReferenceAsync` | `(String, String, String, String, RequestOptions)` | `(String, FindCampaignInventoryReferenceType, String, String, RequestOptions)` |
| `getAdAsync` | `(String adId, String campaignId, String accessToken, RequestOptions requestOptions)` | `(String adId, String campaignId, AdFieldgroups, String accessToken, RequestOptions requestOptions)` |
| `getAdGroupsAsync` | `(String, String, String, String, String, RequestOptions)` | `(String, AdGroupStatus, String, String, String, RequestOptions)` |
| `getAdsAsync` | `(String, String, String, String, String, RequestOptions)` | `(String campaignId, String adGroupIds, AdStatus adStatus, String limit, String listingIds, String offset, AdListFieldgroups fieldgroups, String accessToken, RequestOptions requestOptions)` |
| `getAdsByInventoryReferenceAsync` | `(String, String, String, String, RequestOptions)` | `(String, String, AdsInventoryReferenceType, String, RequestOptions)` |
| `getCampaignsAsync` | `(String, String, String, String, String, RequestOptions)` | `(String campaignName, CampaignStatus campaignStatus, CampaignTargetingTypes campaignTargetingTypes, Channels channels, String endDateRange, FundingStrategy fundingStrategy, String limit, String offset, String startDateRange, String marketplaceId, String accessToken, RequestOptions requestOptions)` |
| `getEmailCampaignsAsync` | `(String, String, String, String, RequestOptions)` | `(String, String, String, String, String, RequestOptions)` |
| `getKeywordsAsync` | `(String, String, String, String, String, RequestOptions)` | `(String, String, KeywordStatus, String, String, String, RequestOptions)` |
| `getListingSetAsync` | `(String, String, String, String, String, String, String, RequestOptions)` | `(String, String, String, String, String, ItemMarkdownStatusEnum, String, RequestOptions)` |
| `getNegativeKeywordsAsync` | `(String, String, String, String, String, RequestOptions)` | `(String, String, String, NegativeKeywordStatus, String, String, RequestOptions)` |
| `getPromotionReportsAsync` | `(String, String, String, String, String, RequestOptions)` | `(String, String, String, String, String, String, RequestOptions)` |
| `getPromotionsAsync` | `(String, String, String, String, String, RequestOptions)` | `(String, String, String, String, String, String, String, String, RequestOptions)` |

`RecommendationClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `findListingRecommendationsAsync` | `(FindListingRecommendationRequest, String, String, String, String, RequestOptions)` | `(FindListingRecommendationRequest, String, Integer, Integer, String, String, RequestOptions)` |

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
