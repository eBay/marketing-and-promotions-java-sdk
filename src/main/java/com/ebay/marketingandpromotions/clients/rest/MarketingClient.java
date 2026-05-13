package com.ebay.marketingandpromotions.clients.rest;

import com.ebay.marketingandpromotions.configuration.MarketingAndPromotionsConfiguration;
import com.ebay.marketingandpromotions.configuration.RequestOptions;
import com.ebay.marketingandpromotions.configuration.TokenContext;
import com.ebay.marketingandpromotions.generated.marketing.MarketingApiClient;
import com.ebay.marketingandpromotions.generated.marketing.models.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Client for the Sell Marketing API.
 * Provides methods for managing campaigns, ads, keywords, promotions, and email campaigns.
 */
public final class MarketingClient {
    private final MarketingApiClient kiota;
    private final MarketingAndPromotionsConfiguration config;

    public MarketingClient(MarketingApiClient kiota, MarketingAndPromotionsConfiguration config) {
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

    // ── Campaign Management ────────────────────────────────────────────────

    public CompletableFuture<Object> createCampaignAsync(
            CreateCampaignRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    public CompletableFuture<Campaign> getCampaignAsync(
            String campaignId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(campaignId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    public CompletableFuture<CampaignPagedCollectionResponse> getCampaignsAsync(
            String campaignName, String campaignStatus, String limit, String offset,
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (campaignName != null) config.queryParameters.campaignName = campaignName;
                if (campaignStatus != null) config.queryParameters.campaignStatus = campaignStatus;
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
            });
        });
    }

    public CompletableFuture<Void> deleteCampaignAsync(
            String campaignId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.adCampaign().byCampaign_id(campaignId).delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        });
    }

    public CompletableFuture<Void> pauseCampaignAsync(
            String campaignId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.adCampaign().byCampaign_id(campaignId).pause().post(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        });
    }

    public CompletableFuture<Void> resumeCampaignAsync(
            String campaignId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.adCampaign().byCampaign_id(campaignId).resume().post(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        });
    }

    public CompletableFuture<Void> endCampaignAsync(
            String campaignId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.adCampaign().byCampaign_id(campaignId).end().post(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        });
    }

    // ── Ad Management ──────────────────────────────────────────────────────

    public CompletableFuture<Object> createAdByListingIdAsync(
            String campaignId, CreateAdRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(campaignId).ad().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    public CompletableFuture<Ad> getAdAsync(
            String campaignId, String adId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(campaignId).ad().byAd_id(adId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    public CompletableFuture<AdPagedCollectionResponse> getAdsAsync(
            String campaignId, String adStatus, String limit, String offset,
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(campaignId).ad().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (adStatus != null) config.queryParameters.adStatus = adStatus;
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
            });
        });
    }

    public CompletableFuture<Void> deleteAdAsync(
            String campaignId, String adId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.adCampaign().byCampaign_id(campaignId).ad().byAd_id(adId).delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        });
    }

    // ── Keyword Management ─────────────────────────────────────────────────

    public CompletableFuture<Object> createKeywordAsync(
            String campaignId, CreateKeywordRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(campaignId).keyword().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    public CompletableFuture<Keyword> getKeywordAsync(
            String campaignId, String keywordId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(campaignId).keyword().byKeyword_id(keywordId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    public CompletableFuture<KeywordPagedCollectionResponse> getKeywordsAsync(
            String campaignId, String keywordStatus, String limit, String offset,
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adCampaign().byCampaign_id(campaignId).keyword().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (keywordStatus != null) config.queryParameters.keywordStatus = keywordStatus;
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
            });
        });
    }

    // ── Negative Keyword Management ────────────────────────────────────────

    public CompletableFuture<Object> createNegativeKeywordAsync(
            CreateNegativeKeywordRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.negativeKeyword().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    public CompletableFuture<NegativeKeyword> getNegativeKeywordAsync(
            String negativeKeywordId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.negativeKeyword().byNegative_keyword_id(negativeKeywordId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    public CompletableFuture<NegativeKeywordPagedCollectionResponse> getNegativeKeywordsAsync(
            String campaignIds, String adGroupIds, String limit, String offset,
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.negativeKeyword().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (campaignIds != null) config.queryParameters.campaignIds = campaignIds;
                if (adGroupIds != null) config.queryParameters.adGroupIds = adGroupIds;
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
            });
        });
    }

    // ── Promotion Management ───────────────────────────────────────────────

    public CompletableFuture<PromotionsPagedCollection> getPromotionsAsync(
            String marketplaceId, String limit, String offset, String promotionStatus,
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.promotion().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (marketplaceId != null) config.queryParameters.marketplaceId = marketplaceId;
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
                if (promotionStatus != null) config.queryParameters.promotionStatus = promotionStatus;
            });
        });
    }

    public CompletableFuture<Void> pausePromotionAsync(
            String promotionId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.promotion().byPromotion_id(promotionId).pause().post(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        });
    }

    public CompletableFuture<Void> resumePromotionAsync(
            String promotionId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.promotion().byPromotion_id(promotionId).resume().post(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        });
    }

    // ── Item Price Markdown ────────────────────────────────────────────────

    public CompletableFuture<Object> createItemPriceMarkdownAsync(
            ItemPriceMarkdown body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.itemPriceMarkdown().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    public CompletableFuture<ItemPriceMarkdown> getItemPriceMarkdownAsync(
            String promotionId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.itemPriceMarkdown().byPromotion_id(promotionId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    // ── Item Promotion ─────────────────────────────────────────────────────

    public CompletableFuture<Object> createItemPromotionAsync(
            ItemPromotion body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.itemPromotion().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    public CompletableFuture<ItemPromotionResponse> getItemPromotionAsync(
            String promotionId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.itemPromotion().byPromotion_id(promotionId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    // ── Email Campaign Management ──────────────────────────────────────────

    public CompletableFuture<Object> createEmailCampaignAsync(
            CreateEmailCampaignRequest body, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.emailCampaign().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    public CompletableFuture<GetEmailCampaignResponse> getEmailCampaignAsync(
            String emailCampaignId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.emailCampaign().byEmail_campaign_id(emailCampaignId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    public CompletableFuture<GetEmailCampaignsResponse> getEmailCampaignsAsync(
            String query, String limit, String offset,
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.emailCampaign().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (query != null) config.queryParameters.q = query;
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
            });
        });
    }

    public CompletableFuture<Void> deleteEmailCampaignAsync(
            String emailCampaignId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            kiota.emailCampaign().byEmail_campaign_id(emailCampaignId).delete(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
            return null;
        });
    }

    // ── Reports ────────────────────────────────────────────────────────────

    public CompletableFuture<ReportMetadatas> getReportMetadataAsync(
            String channel, String fundingModel,
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.adReportMetadata().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (channel != null) config.queryParameters.channel = channel;
                if (fundingModel != null) config.queryParameters.fundingModel = fundingModel;
            });
        });
    }

    public CompletableFuture<PromotionsReportPagedCollection> getPromotionReportsAsync(
            String marketplaceId, String limit, String offset, String promotionStatus,
            String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.promotionReport().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (marketplaceId != null) config.queryParameters.marketplaceId = marketplaceId;
                if (limit != null) config.queryParameters.limit = limit;
                if (offset != null) config.queryParameters.offset = offset;
                if (promotionStatus != null) config.queryParameters.promotionStatus = promotionStatus;
            });
        });
    }

    public CompletableFuture<SummaryReportResponse> getPromotionSummaryReportAsync(
            String marketplaceId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.promotionSummaryReport().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (marketplaceId != null) config.queryParameters.marketplaceId = marketplaceId;
            });
        });
    }
}
