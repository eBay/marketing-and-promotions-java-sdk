# ChangeLog

## 2.0.0 (09/14/2026)

**Breaking changes**
- The following operations changed signature on `MarketingClient`:
  - `findCampaignByAdReferenceAsync`: `(String, String, String, String, RequestOptions)` → `(String, com.ebay.marketingandpromotions.generated.marketing.ad_campaign.find_campaign_by_ad_reference.GetInventoryReferenceTypeQueryParameterType, String, String, RequestOptions)`
  - `getAdAsync`: `(String adId, String campaignId, String accessToken, RequestOptions requestOptions)` → `(String adId, String campaignId, com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.ad.item.GetFieldgroupsQueryParameterType fieldgroups, String accessToken, RequestOptions requestOptions)`
  - `getAdGroupsAsync`: `(String, String, String, String, String, RequestOptions)` → `(String, com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.ad_group.GetAdGroupStatusQueryParameterType, String, String, String, RequestOptions)`
  - `getAdsAsync`: `(String campaignId, String adGroupIds, String adStatus, String limit, String listingIds, String offset, String accessToken, RequestOptions requestOptions)` → `(String campaignId, String adGroupIds, com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.ad.GetAdStatusQueryParameterType adStatus, String limit, String listingIds, String offset, com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.ad.GetFieldgroupsQueryParameterType fieldgroups, String accessToken, RequestOptions requestOptions)`
  - `getAdsByInventoryReferenceAsync`: `(String, String, String, String, RequestOptions)` → `(String, String, com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.get_ads_by_inventory_reference.GetInventoryReferenceTypeQueryParameterType, String, RequestOptions)`
  - `getCampaignsAsync`: `(String campaignName, String campaignStatus, String campaignTargetingTypes, String channels, String endDateRange, String fundingStrategy, String limit, String offset, String startDateRange, String accessToken, RequestOptions requestOptions)` → `(String campaignName, com.ebay.marketingandpromotions.generated.marketing.ad_campaign.GetCampaignStatusQueryParameterType campaignStatus, com.ebay.marketingandpromotions.generated.marketing.ad_campaign.GetCampaignTargetingTypesQueryParameterType campaignTargetingTypes, com.ebay.marketingandpromotions.generated.marketing.ad_campaign.GetChannelsQueryParameterType channels, String endDateRange, com.ebay.marketingandpromotions.generated.marketing.ad_campaign.GetFundingStrategyQueryParameterType fundingStrategy, String limit, String offset, String startDateRange, String marketplaceId, String accessToken, RequestOptions requestOptions)`
  - `getKeywordsAsync`: `(String, String, String, String, String, String, RequestOptions)` → `(String, String, com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.keyword.GetKeywordStatusQueryParameterType, String, String, String, RequestOptions)`
  - `getListingSetAsync`: `(String, String, String, String, String, String, String, RequestOptions)` → `(String, String, String, String, String, com.ebay.marketingandpromotions.generated.marketing.models.ItemMarkdownStatusEnum, String, RequestOptions)`
  - `getNegativeKeywordsAsync`: `(String, String, String, String, String, String, RequestOptions)` → `(String, String, String, com.ebay.marketingandpromotions.generated.marketing.negative_keyword.GetNegativeKeywordStatusQueryParameterType, String, String, RequestOptions)`
- The following operations changed signature on `RecommendationClient`:
  - `findListingRecommendationsAsync`: `(FindListingRecommendationRequest, String, String, String, String, String, RequestOptions)` → `(FindListingRecommendationRequest, String, Integer, Integer, String, String, RequestOptions)`

- The following operations were added to `MarketingClient`:
  - `bulkUpsertVideoAdsPreferencesAsync`
  - `upsertVideoAdsPreferencesAsync`

## 1.0.0 (09/14/2026)

**Breaking changes**
- The following operations were removed from `MarketingClient`:
  - `createItemPriceMarkdownAsync`
  - `getItemPriceMarkdownAsync`
- The following operations changed signature on `MarketingClient`:
  - `createEmailCampaignAsync`: `(CreateEmailCampaignRequest, String, RequestOptions)` → `(CreateEmailCampaignRequest, String, String, RequestOptions)`
  - `getAdsAsync`: `(String, String, String, String, String, RequestOptions)` → `(String, String, String, String, String, String, String, RequestOptions)`
  - `getCampaignsAsync`: `(String, String, String, String, String, RequestOptions)` → `(String, String, String, String, String, String, String, String, String, String, RequestOptions)`
  - `getEmailCampaignsAsync`: `(String, String, String, String, RequestOptions)` → `(String, String, String, String, String, RequestOptions)`
  - `getKeywordsAsync`: `(String, String, String, String, String, RequestOptions)` → `(String, String, String, String, String, String, RequestOptions)`
  - `getNegativeKeywordsAsync`: `(String, String, String, String, String, RequestOptions)` → `(String, String, String, String, String, String, RequestOptions)`
  - `getPromotionReportsAsync`: `(String, String, String, String, String, RequestOptions)` → `(String, String, String, String, String, String, String, RequestOptions)`
  - `getPromotionsAsync`: `(String, String, String, String, String, RequestOptions)` → `(String, String, String, String, String, String, String, String, RequestOptions)`
- The following operations changed signature on `RecommendationClient`:
  - `findListingRecommendationsAsync`: `(FindListingRecommendationRequest, String, String, String, String, RequestOptions)` → `(FindListingRecommendationRequest, String, String, String, String, String, RequestOptions)`

- The following operations were added to `MarketingClient`:
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
  - `cloneCampaignAsync`
  - `createAdGroupAsync`
  - `createAdsByInventoryReferenceAsync`
  - `createItemPriceMarkdownPromotionAsync`
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
  - `getItemPriceMarkdownPromotionAsync`
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
