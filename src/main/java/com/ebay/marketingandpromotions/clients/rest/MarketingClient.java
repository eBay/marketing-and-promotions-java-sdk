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
import com.ebay.marketingandpromotions.generated.marketing.MarketingApiClient;
import com.ebay.marketingandpromotions.generated.marketing.models.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public final class MarketingClient {
    private final MarketingApiClient kiota;
    private final MarketingAndPromotionsConfiguration config;

    public MarketingClient(MarketingApiClient kiota, MarketingAndPromotionsConfiguration config) {
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

    public CompletableFuture<BulkCreateAdsByInventoryReferenceResponse> bulkCreateAdsByInventoryReferenceAsync(
            String campaignId, BulkCreateAdsByInventoryReferenceRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).bulkCreateAdsByInventoryReference().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<BulkAdResponse> bulkCreateAdsByListingIdAsync(
            String campaignId, BulkCreateAdRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).bulkCreateAdsByListingId().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<BulkDeleteAdsByInventoryReferenceResponse> bulkDeleteAdsByInventoryReferenceAsync(
            String campaignId, BulkDeleteAdsByInventoryReferenceRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).bulkDeleteAdsByInventoryReference().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<BulkDeleteAdResponse> bulkDeleteAdsByListingIdAsync(
            String campaignId, BulkDeleteAdRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).bulkDeleteAdsByListingId().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<BulkUpdateAdsByInventoryReferenceResponse> bulkUpdateAdsBidByInventoryReferenceAsync(
            String campaignId, BulkCreateAdsByInventoryReferenceRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).bulkUpdateAdsBidByInventoryReference().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<BulkAdUpdateResponse> bulkUpdateAdsBidByListingIdAsync(
            String campaignId, BulkCreateAdRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).bulkUpdateAdsBidByListingId().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<BulkAdUpdateStatusResponse> bulkUpdateAdsStatusAsync(
            String campaignId, BulkUpdateAdStatusRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).bulkUpdateAdsStatus().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<BulkAdUpdateStatusByListingIdResponse> bulkUpdateAdsStatusByListingIdAsync(
            String campaignId, BulkUpdateAdStatusByListingIdRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).bulkUpdateAdsStatusByListingId().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<AdPagedCollectionResponse> getAdsAsync(
            String campaignId, String adGroupIds, String adStatus, String limit, String listingIds, String offset, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).ad().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (adGroupIds != null) config.queryParameters.adGroupIds = adGroupIds;
                if (adStatus != null) config.queryParameters.adStatus = adStatus;
                if (limit != null) config.queryParameters.limit = limit;
                if (listingIds != null) config.queryParameters.listingIds = listingIds;
                if (offset != null) config.queryParameters.offset = offset;
            });
        }));
    }

    public CompletableFuture<Object> createAdByListingIdAsync(
            String campaignId, CreateAdRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).ad().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<AdReferences> createAdsByInventoryReferenceAsync(
            String campaignId, CreateAdsByInventoryReferenceRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).createAdsByInventoryReference().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Ad> getAdAsync(
            String adId, String campaignId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).ad().byAd_id(Params.requireValid("adId", adId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> deleteAdAsync(
            String adId, String campaignId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).ad().byAd_id(Params.requireValid("adId", adId)).delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<AdIds> deleteAdsByInventoryReferenceAsync(
            String campaignId, DeleteAdsByInventoryReferenceRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).deleteAdsByInventoryReference().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Ads> getAdsByInventoryReferenceAsync(
            String campaignId, String inventoryReferenceId, String inventoryReferenceType, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).getAdsByInventoryReference().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (inventoryReferenceId != null) config.queryParameters.inventoryReferenceId = inventoryReferenceId;
                if (inventoryReferenceType != null) config.queryParameters.inventoryReferenceType = inventoryReferenceType;
            });
        }));
    }

    public CompletableFuture<Void> updateBidAsync(
            String adId, String campaignId, UpdateBidPercentageRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).ad().byAd_id(Params.requireValid("adId", adId)).updateBid().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<AdGroupPagedCollectionResponse> getAdGroupsAsync(
            String campaignId, String adGroupStatus, String limit, String offset, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).adGroup().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (adGroupStatus != null) config.queryParameters.adGroupStatus = adGroupStatus;
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
            });
        }));
    }

    public CompletableFuture<Object> createAdGroupAsync(
            String campaignId, CreateAdGroupRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).adGroup().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<AdGroup> getAdGroupAsync(
            String adGroupId, String campaignId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).adGroup().byAd_group_id(Params.requireValid("adGroupId", adGroupId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> updateAdGroupAsync(
            String adGroupId, String campaignId, UpdateAdGroupRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).adGroup().byAd_group_id(Params.requireValid("adGroupId", adGroupId)).put(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<TargetedBidsPagedCollection> suggestBidsAsync(
            String adGroupId, String campaignId, TargetedBidRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).adGroup().byAd_group_id(Params.requireValid("adGroupId", adGroupId)).suggestBids().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<TargetedKeywordsPagedCollection> suggestKeywordsAsync(
            String adGroupId, String campaignId, TargetedKeywordRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).adGroup().byAd_group_id(Params.requireValid("adGroupId", adGroupId)).suggestKeywords().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Object> cloneCampaignAsync(
            String campaignId, CloneCampaignRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).clone().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<CampaignPagedCollectionResponse> getCampaignsAsync(
            String campaignName, String campaignStatus, String campaignTargetingTypes, String channels, String endDateRange, String fundingStrategy, String limit, String offset, String startDateRange, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (campaignName != null) config.queryParameters.campaignName = campaignName;
                if (campaignStatus != null) config.queryParameters.campaignStatus = campaignStatus;
                if (campaignTargetingTypes != null) config.queryParameters.campaignTargetingTypes = campaignTargetingTypes;
                if (channels != null) config.queryParameters.channels = channels;
                if (endDateRange != null) config.queryParameters.endDateRange = endDateRange;
                if (fundingStrategy != null) config.queryParameters.fundingStrategy = fundingStrategy;
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
                if (startDateRange != null) config.queryParameters.startDateRange = startDateRange;
            });
        }));
    }

    public CompletableFuture<Object> createCampaignAsync(
            CreateCampaignRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Campaign> getCampaignAsync(
            String campaignId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> deleteCampaignAsync(
            String campaignId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> endCampaignAsync(
            String campaignId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).end().post(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Campaigns> findCampaignByAdReferenceAsync(
            String inventoryReferenceId, String inventoryReferenceType, String listingId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().findCampaignByAdReference().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (inventoryReferenceId != null) config.queryParameters.inventoryReferenceId = inventoryReferenceId;
                if (inventoryReferenceType != null) config.queryParameters.inventoryReferenceType = inventoryReferenceType;
                if (listingId != null) config.queryParameters.listingId = listingId;
            });
        }));
    }

    public CompletableFuture<Campaign> getCampaignByNameAsync(
            String campaignName, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().getCampaignByName().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (campaignName != null) config.queryParameters.campaignName = campaignName;
            });
        }));
    }

    public CompletableFuture<Void> pauseCampaignAsync(
            String campaignId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).pause().post(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> resumeCampaignAsync(
            String campaignId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).resume().post(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<SuggestBudgetResponse> suggestBudgetAsync(
            String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().suggestBudget().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (xEBAYCMARKETPLACEID != null) config.headers.add("X-EBAY-C-MARKETPLACE-ID", xEBAYCMARKETPLACEID);
            });
        }));
    }

    public CompletableFuture<TargetedAdsPagedCollection> suggestItemsAsync(
            String campaignId, String categoryIds, String limit, String offset, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).suggestItems().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (categoryIds != null) config.queryParameters.categoryIds = categoryIds;
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
            });
        }));
    }

    public CompletableFuture<SuggestMaxCpcResponse> suggestMaxCpcAsync(
            SuggestMaxCpcRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().suggestMaxCpc().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> updateAdRateStrategyAsync(
            String campaignId, UpdateAdrateStrategyRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).updateAdRateStrategy().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> updateBiddingStrategyAsync(
            String campaignId, UpdateBiddingStrategyRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).updateBiddingStrategy().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Object> updateCampaignBudgetAsync(
            String campaignId, UpdateCampaignBudgetRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).updateCampaignBudget().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> updateCampaignIdentificationAsync(
            String campaignId, UpdateCampaignIdentificationRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).updateCampaignIdentification().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<BulkCreateKeywordResponse> bulkCreateKeywordAsync(
            String campaignId, BulkCreateKeywordRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).bulkCreateKeyword().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<BulkUpdateKeywordResponse> bulkUpdateKeywordAsync(
            String campaignId, BulkUpdateKeywordRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).bulkUpdateKeyword().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<KeywordPagedCollectionResponse> getKeywordsAsync(
            String campaignId, String adGroupIds, String keywordStatus, String limit, String offset, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).keyword().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (adGroupIds != null) config.queryParameters.adGroupIds = adGroupIds;
                if (keywordStatus != null) config.queryParameters.keywordStatus = keywordStatus;
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
            });
        }));
    }

    public CompletableFuture<Object> createKeywordAsync(
            String campaignId, CreateKeywordRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).keyword().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Keyword> getKeywordAsync(
            String campaignId, String keywordId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).keyword().byKeyword_id(Params.requireValid("keywordId", keywordId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<UpdateKeywordResponse> updateKeywordAsync(
            String campaignId, String keywordId, UpdateKeywordRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(Params.requireValid("campaignId", campaignId)).keyword().byKeyword_id(Params.requireValid("keywordId", keywordId)).put(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<BulkCreateNegativeKeywordResponse> bulkCreateNegativeKeywordAsync(
            BulkCreateNegativeKeywordRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.bulkCreateNegativeKeyword().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<BulkUpdateNegativeKeywordResponse> bulkUpdateNegativeKeywordAsync(
            BulkUpdateNegativeKeywordRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.bulkUpdateNegativeKeyword().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<NegativeKeywordPagedCollectionResponse> getNegativeKeywordsAsync(
            String adGroupIds, String campaignIds, String limit, String negativeKeywordStatus, String offset, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.negativeKeyword().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (adGroupIds != null) config.queryParameters.adGroupIds = adGroupIds;
                if (campaignIds != null) config.queryParameters.campaignIds = campaignIds;
                if (limit != null) config.queryParameters.limit = limit;
                if (negativeKeywordStatus != null) config.queryParameters.negativeKeywordStatus = negativeKeywordStatus;
                if (offset != null) config.queryParameters.offset = offset;
            });
        }));
    }

    public CompletableFuture<Object> createNegativeKeywordAsync(
            CreateNegativeKeywordRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.negativeKeyword().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<NegativeKeyword> getNegativeKeywordAsync(
            String negativeKeywordId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.negativeKeyword().byNegative_keyword_id(Params.requireValid("negativeKeywordId", negativeKeywordId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> updateNegativeKeywordAsync(
            String negativeKeywordId, UpdateNegativeKeywordRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.negativeKeyword().byNegative_keyword_id(Params.requireValid("negativeKeywordId", negativeKeywordId)).put(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> getReportAsync(
            String reportId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.adReport().byReport_id(Params.requireValid("reportId", reportId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<ReportMetadatas> getReportMetadataAsync(
            String fundingModel, String channel, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adReportMetadata().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (fundingModel != null) config.queryParameters.fundingModel = fundingModel;
                if (channel != null) config.queryParameters.channel = channel;
            });
        }));
    }

    public CompletableFuture<ReportMetadata> getReportMetadataForReportTypeAsync(
            String reportType, String fundingModel, String channel, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adReportMetadata().byReport_type(Params.requireValid("reportType", reportType)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (fundingModel != null) config.queryParameters.fundingModel = fundingModel;
                if (channel != null) config.queryParameters.channel = channel;
            });
        }));
    }

    public CompletableFuture<ReportTaskPagedCollection> getReportTasksAsync(
            String limit, String offset, String reportTaskStatuses, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adReportTask().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
                if (reportTaskStatuses != null) config.queryParameters.reportTaskStatuses = reportTaskStatuses;
            });
        }));
    }

    public CompletableFuture<com.ebay.marketingandpromotions.generated.marketing.models.Error> createReportTaskAsync(
            CreateReportTask body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adReportTask().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<ReportTask> getReportTaskAsync(
            String reportTaskId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adReportTask().byReport_task_id(Params.requireValid("reportTaskId", reportTaskId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> deleteReportTaskAsync(
            String reportTaskId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.adReportTask().byReport_task_id(Params.requireValid("reportTaskId", reportTaskId)).delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Object> createItemPriceMarkdownPromotionAsync(
            ItemPriceMarkdown body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.itemPriceMarkdown().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<ItemPriceMarkdown> getItemPriceMarkdownPromotionAsync(
            String promotionId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.itemPriceMarkdown().byPromotion_id(Params.requireValid("promotionId", promotionId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Object> updateItemPriceMarkdownPromotionAsync(
            String promotionId, ItemPriceMarkdown body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.itemPriceMarkdown().byPromotion_id(Params.requireValid("promotionId", promotionId)).put(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> deleteItemPriceMarkdownPromotionAsync(
            String promotionId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.itemPriceMarkdown().byPromotion_id(Params.requireValid("promotionId", promotionId)).delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<BaseResponse> createItemPromotionAsync(
            ItemPromotion body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.itemPromotion().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<ItemPromotionResponse> getItemPromotionAsync(
            String promotionId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.itemPromotion().byPromotion_id(Params.requireValid("promotionId", promotionId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<BaseResponse> updateItemPromotionAsync(
            String promotionId, ItemPromotion body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.itemPromotion().byPromotion_id(Params.requireValid("promotionId", promotionId)).put(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<Void> deleteItemPromotionAsync(
            String promotionId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.itemPromotion().byPromotion_id(Params.requireValid("promotionId", promotionId)).delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<ItemsPagedCollection> getListingSetAsync(
            String promotionId, String limit, String offset, String q, String sort, String status, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.promotion().byPromotion_id(Params.requireValid("promotionId", promotionId)).getListingSet().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
                if (q != null) config.queryParameters.q = q;
                if (sort != null) config.queryParameters.sort = sort;
                if (status != null) config.queryParameters.status = status;
            });
        }));
    }

    public CompletableFuture<PromotionsPagedCollection> getPromotionsAsync(
            String limit, String marketplaceId, String offset, String promotionStatus, String promotionType, String q, String sort, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.promotion().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (limit != null) config.queryParameters.limit = limit;
                if (marketplaceId != null) config.queryParameters.marketplaceId = marketplaceId;
                if (offset != null) config.queryParameters.offset = offset;
                if (promotionStatus != null) config.queryParameters.promotionStatus = promotionStatus;
                if (promotionType != null) config.queryParameters.promotionType = promotionType;
                if (q != null) config.queryParameters.q = q;
                if (sort != null) config.queryParameters.sort = sort;
            });
        }));
    }

    public CompletableFuture<Void> pausePromotionAsync(
            String promotionId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.promotion().byPromotion_id(Params.requireValid("promotionId", promotionId)).pause().post(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<Void> resumePromotionAsync(
            String promotionId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.promotion().byPromotion_id(Params.requireValid("promotionId", promotionId)).resume().post(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        }));
    }

    public CompletableFuture<PromotionsReportPagedCollection> getPromotionReportsAsync(
            String limit, String marketplaceId, String offset, String promotionStatus, String promotionType, String q, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.promotionReport().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (limit != null) config.queryParameters.limit = limit;
                if (marketplaceId != null) config.queryParameters.marketplaceId = marketplaceId;
                if (offset != null) config.queryParameters.offset = offset;
                if (promotionStatus != null) config.queryParameters.promotionStatus = promotionStatus;
                if (promotionType != null) config.queryParameters.promotionType = promotionType;
                if (q != null) config.queryParameters.q = q;
            });
        }));
    }

    public CompletableFuture<SummaryReportResponse> getPromotionSummaryReportAsync(
            String marketplaceId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.promotionSummaryReport().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (marketplaceId != null) config.queryParameters.marketplaceId = marketplaceId;
            });
        }));
    }

    public CompletableFuture<GetEmailCampaignsResponse> getEmailCampaignsAsync(
            String limit, String offset, String q, String sort, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.emailCampaign().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
                if (q != null) config.queryParameters.q = q;
                if (sort != null) config.queryParameters.sort = sort;
            });
        }));
    }

    public CompletableFuture<CreateEmailCampaignResponse> createEmailCampaignAsync(
            CreateEmailCampaignRequest body, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.emailCampaign().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (xEBAYCMARKETPLACEID != null) config.headers.add("X-EBAY-C-MARKETPLACE-ID", xEBAYCMARKETPLACEID);
            });
        }));
    }

    public CompletableFuture<GetEmailCampaignResponse> getEmailCampaignAsync(
            String emailCampaignId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.emailCampaign().byEmail_campaign_id(Params.requireValid("emailCampaignId", emailCampaignId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<UpdateEmailCampaignResponse> updateEmailCampaignAsync(
            String emailCampaignId, UpdateCampaignRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.emailCampaign().byEmail_campaign_id(Params.requireValid("emailCampaignId", emailCampaignId)).put(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<DeleteEmailCampaignResponse> deleteEmailCampaignAsync(
            String emailCampaignId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.emailCampaign().byEmail_campaign_id(Params.requireValid("emailCampaignId", emailCampaignId)).delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<GetEmailCampaignAudiencesResponse> getAudiencesAsync(
            String emailCampaignType, String limit, String offset, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.emailCampaign().audience().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (emailCampaignType != null) config.queryParameters.emailCampaignType = emailCampaignType;
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
            });
        }));
    }

    public CompletableFuture<GetEmailPreviewResponse> getEmailPreviewAsync(
            String emailCampaignId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.emailCampaign().byEmail_campaign_id(Params.requireValid("emailCampaignId", emailCampaignId)).emailPreview().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<GetEmailReportResponse> getEmailReportAsync(
            String endDate, String startDate, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.emailCampaign().report().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (endDate != null) config.queryParameters.endDate = endDate;
                if (startDate != null) config.queryParameters.startDate = startDate;
            });
        }));
    }
}
