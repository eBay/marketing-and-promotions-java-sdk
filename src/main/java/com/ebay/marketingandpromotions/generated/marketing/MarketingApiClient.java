package com.ebay.marketingandpromotions.generated.marketing;

import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.AdCampaignRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_report_metadata.AdReportMetadataRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_report_task.AdReportTaskRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_report.AdReportRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.bulk_create_negative_keyword.BulkCreateNegativeKeywordRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.bulk_update_negative_keyword.BulkUpdateNegativeKeywordRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.email_campaign.EmailCampaignRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.item_price_markdown.ItemPriceMarkdownRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.item_promotion.ItemPromotionRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.negative_keyword.NegativeKeywordRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.promotion_report.PromotionReportRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.promotion_summary_report.PromotionSummaryReportRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.promotion.PromotionRequestBuilder;
import com.microsoft.kiota.ApiClientBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.FormParseNodeFactory;
import com.microsoft.kiota.serialization.FormSerializationWriterFactory;
import com.microsoft.kiota.serialization.JsonParseNodeFactory;
import com.microsoft.kiota.serialization.JsonSerializationWriterFactory;
import com.microsoft.kiota.serialization.MultipartSerializationWriterFactory;
import com.microsoft.kiota.serialization.ParseNodeFactoryRegistry;
import com.microsoft.kiota.serialization.SerializationWriterFactoryRegistry;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import java.util.HashMap;
import java.util.Objects;
/**
 * The main entry point of the SDK, exposes the configuration and the fluent API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MarketingApiClient extends BaseRequestBuilder {
    /**
     * The ad_campaign property
     * @return a {@link AdCampaignRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AdCampaignRequestBuilder adCampaign() {
        return new AdCampaignRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The ad_report property
     * @return a {@link AdReportRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AdReportRequestBuilder adReport() {
        return new AdReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The ad_report_metadata property
     * @return a {@link AdReportMetadataRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AdReportMetadataRequestBuilder adReportMetadata() {
        return new AdReportMetadataRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The ad_report_task property
     * @return a {@link AdReportTaskRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AdReportTaskRequestBuilder adReportTask() {
        return new AdReportTaskRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The bulk_create_negative_keyword property
     * @return a {@link BulkCreateNegativeKeywordRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkCreateNegativeKeywordRequestBuilder bulkCreateNegativeKeyword() {
        return new BulkCreateNegativeKeywordRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The bulk_update_negative_keyword property
     * @return a {@link BulkUpdateNegativeKeywordRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkUpdateNegativeKeywordRequestBuilder bulkUpdateNegativeKeyword() {
        return new BulkUpdateNegativeKeywordRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The email_campaign property
     * @return a {@link EmailCampaignRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EmailCampaignRequestBuilder emailCampaign() {
        return new EmailCampaignRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The item_price_markdown property
     * @return a {@link ItemPriceMarkdownRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ItemPriceMarkdownRequestBuilder itemPriceMarkdown() {
        return new ItemPriceMarkdownRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The item_promotion property
     * @return a {@link ItemPromotionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ItemPromotionRequestBuilder itemPromotion() {
        return new ItemPromotionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The negative_keyword property
     * @return a {@link NegativeKeywordRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NegativeKeywordRequestBuilder negativeKeyword() {
        return new NegativeKeywordRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The promotion property
     * @return a {@link PromotionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PromotionRequestBuilder promotion() {
        return new PromotionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The promotion_report property
     * @return a {@link PromotionReportRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PromotionReportRequestBuilder promotionReport() {
        return new PromotionReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The promotion_summary_report property
     * @return a {@link PromotionSummaryReportRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PromotionSummaryReportRequestBuilder promotionSummaryReport() {
        return new PromotionSummaryReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link MarketingApiClient} and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MarketingApiClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}");
        this.pathParameters = new HashMap<>();
        ApiClientBuilder.registerDefaultSerializer(() -> new JsonSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new TextSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new FormSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new MultipartSerializationWriterFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new JsonParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new FormParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new TextParseNodeFactory());
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://api.ebay.com{basePath}");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
}
