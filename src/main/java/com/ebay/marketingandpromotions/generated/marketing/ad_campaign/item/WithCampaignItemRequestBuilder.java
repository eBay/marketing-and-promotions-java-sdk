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

package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item;

import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.ad_group.AdGroupRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.ad.AdRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.bulk_create_ads_by_inventory_reference.BulkCreateAdsByInventoryReferenceRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.bulk_create_ads_by_listing_id.BulkCreateAdsByListingIdRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.bulk_create_keyword.BulkCreateKeywordRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.bulk_delete_ads_by_inventory_reference.BulkDeleteAdsByInventoryReferenceRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.bulk_delete_ads_by_listing_id.BulkDeleteAdsByListingIdRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.bulk_update_ads_bid_by_inventory_reference.BulkUpdateAdsBidByInventoryReferenceRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.bulk_update_ads_bid_by_listing_id.BulkUpdateAdsBidByListingIdRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.bulk_update_ads_status_by_listing_id.BulkUpdateAdsStatusByListingIdRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.bulk_update_ads_status.BulkUpdateAdsStatusRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.bulk_update_keyword.BulkUpdateKeywordRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.clone.CloneRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.create_ads_by_inventory_reference.CreateAdsByInventoryReferenceRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.delete_ads_by_inventory_reference.DeleteAdsByInventoryReferenceRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.end.EndRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.get_ads_by_inventory_reference.GetAdsByInventoryReferenceRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.keyword.KeywordRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.pause.PauseRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.resume.ResumeRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.suggest_items.SuggestItemsRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.update_ad_rate_strategy.UpdateAdRateStrategyRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.update_bidding_strategy.UpdateBiddingStrategyRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.update_campaign_budget.UpdateCampaignBudgetRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.update_campaign_identification.UpdateCampaignIdentificationRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.models.Campaign;
import com.ebay.marketingandpromotions.generated.marketing.models.Error;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /ad_campaign/{campaign_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithCampaignItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The ad property
     * @return a {@link AdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AdRequestBuilder ad() {
        return new AdRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The ad_group property
     * @return a {@link AdGroupRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AdGroupRequestBuilder adGroup() {
        return new AdGroupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The bulk_create_ads_by_inventory_reference property
     * @return a {@link BulkCreateAdsByInventoryReferenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkCreateAdsByInventoryReferenceRequestBuilder bulkCreateAdsByInventoryReference() {
        return new BulkCreateAdsByInventoryReferenceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The bulk_create_ads_by_listing_id property
     * @return a {@link BulkCreateAdsByListingIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkCreateAdsByListingIdRequestBuilder bulkCreateAdsByListingId() {
        return new BulkCreateAdsByListingIdRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The bulk_create_keyword property
     * @return a {@link BulkCreateKeywordRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkCreateKeywordRequestBuilder bulkCreateKeyword() {
        return new BulkCreateKeywordRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The bulk_delete_ads_by_inventory_reference property
     * @return a {@link BulkDeleteAdsByInventoryReferenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkDeleteAdsByInventoryReferenceRequestBuilder bulkDeleteAdsByInventoryReference() {
        return new BulkDeleteAdsByInventoryReferenceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The bulk_delete_ads_by_listing_id property
     * @return a {@link BulkDeleteAdsByListingIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkDeleteAdsByListingIdRequestBuilder bulkDeleteAdsByListingId() {
        return new BulkDeleteAdsByListingIdRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The bulk_update_ads_bid_by_inventory_reference property
     * @return a {@link BulkUpdateAdsBidByInventoryReferenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkUpdateAdsBidByInventoryReferenceRequestBuilder bulkUpdateAdsBidByInventoryReference() {
        return new BulkUpdateAdsBidByInventoryReferenceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The bulk_update_ads_bid_by_listing_id property
     * @return a {@link BulkUpdateAdsBidByListingIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkUpdateAdsBidByListingIdRequestBuilder bulkUpdateAdsBidByListingId() {
        return new BulkUpdateAdsBidByListingIdRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The bulk_update_ads_status property
     * @return a {@link BulkUpdateAdsStatusRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkUpdateAdsStatusRequestBuilder bulkUpdateAdsStatus() {
        return new BulkUpdateAdsStatusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The bulk_update_ads_status_by_listing_id property
     * @return a {@link BulkUpdateAdsStatusByListingIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkUpdateAdsStatusByListingIdRequestBuilder bulkUpdateAdsStatusByListingId() {
        return new BulkUpdateAdsStatusByListingIdRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The bulk_update_keyword property
     * @return a {@link BulkUpdateKeywordRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkUpdateKeywordRequestBuilder bulkUpdateKeyword() {
        return new BulkUpdateKeywordRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The clone property
     * @return a {@link CloneRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CloneRequestBuilder clone() {
        return new CloneRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The create_ads_by_inventory_reference property
     * @return a {@link CreateAdsByInventoryReferenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreateAdsByInventoryReferenceRequestBuilder createAdsByInventoryReference() {
        return new CreateAdsByInventoryReferenceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The delete_ads_by_inventory_reference property
     * @return a {@link DeleteAdsByInventoryReferenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeleteAdsByInventoryReferenceRequestBuilder deleteAdsByInventoryReference() {
        return new DeleteAdsByInventoryReferenceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The end property
     * @return a {@link EndRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EndRequestBuilder end() {
        return new EndRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_ads_by_inventory_reference property
     * @return a {@link GetAdsByInventoryReferenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetAdsByInventoryReferenceRequestBuilder getAdsByInventoryReference() {
        return new GetAdsByInventoryReferenceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The keyword property
     * @return a {@link KeywordRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public KeywordRequestBuilder keyword() {
        return new KeywordRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The pause property
     * @return a {@link PauseRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PauseRequestBuilder pause() {
        return new PauseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The resume property
     * @return a {@link ResumeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ResumeRequestBuilder resume() {
        return new ResumeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The suggest_items property
     * @return a {@link SuggestItemsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SuggestItemsRequestBuilder suggestItems() {
        return new SuggestItemsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The update_ad_rate_strategy property
     * @return a {@link UpdateAdRateStrategyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdateAdRateStrategyRequestBuilder updateAdRateStrategy() {
        return new UpdateAdRateStrategyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The update_bidding_strategy property
     * @return a {@link UpdateBiddingStrategyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdateBiddingStrategyRequestBuilder updateBiddingStrategy() {
        return new UpdateBiddingStrategyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The update_campaign_budget property
     * @return a {@link UpdateCampaignBudgetRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdateCampaignBudgetRequestBuilder updateCampaignBudget() {
        return new UpdateCampaignBudgetRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The update_campaign_identification property
     * @return a {@link UpdateCampaignIdentificationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdateCampaignIdentificationRequestBuilder updateCampaignIdentification() {
        return new UpdateCampaignIdentificationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithCampaignItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCampaignItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithCampaignItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCampaignItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}", rawUrl);
    }
    /**
     * This method deletes the campaign specified by the &lt;code&gt;campaign_id&lt;/code&gt; query parameter.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt; You can only delete campaigns that have ended.&lt;/span&gt;&lt;br /&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve the &lt;b&gt;campaign_id&lt;/b&gt; and the campaign status (&lt;code&gt;RUNNING&lt;/code&gt;, &lt;code&gt;PAUSED&lt;/code&gt;, &lt;code&gt;ENDED&lt;/code&gt;, and so on) for all the seller&apos;s campaigns.
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * This method deletes the campaign specified by the &lt;code&gt;campaign_id&lt;/code&gt; query parameter.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt; You can only delete campaigns that have ended.&lt;/span&gt;&lt;br /&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve the &lt;b&gt;campaign_id&lt;/b&gt; and the campaign status (&lt;code&gt;RUNNING&lt;/code&gt;, &lt;code&gt;PAUSED&lt;/code&gt;, &lt;code&gt;ENDED&lt;/code&gt;, and so on) for all the seller&apos;s campaigns.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("409", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * This method retrieves the details of a single campaign, as specified with the &lt;b&gt;campaign_id&lt;/b&gt; query parameter.  &lt;p&gt;This method returns all the details of a campaign (including the campaign&apos;s the selection rules), except the for the listing IDs or inventory reference IDs included in the campaign. These IDs are returned by &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad-getads&quot;&gt;getAds&lt;/a&gt;.&lt;/p&gt;  &lt;p&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the seller&apos;s campaign IDs.&lt;/p&gt;
     * @return a {@link Campaign}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public Campaign get() {
        return get(null);
    }
    /**
     * This method retrieves the details of a single campaign, as specified with the &lt;b&gt;campaign_id&lt;/b&gt; query parameter.  &lt;p&gt;This method returns all the details of a campaign (including the campaign&apos;s the selection rules), except the for the listing IDs or inventory reference IDs included in the campaign. These IDs are returned by &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad-getads&quot;&gt;getAds&lt;/a&gt;.&lt;/p&gt;  &lt;p&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the seller&apos;s campaign IDs.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Campaign}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 409 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public Campaign get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("409", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Campaign::createFromDiscriminatorValue);
    }
    /**
     * This method deletes the campaign specified by the &lt;code&gt;campaign_id&lt;/code&gt; query parameter.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt; You can only delete campaigns that have ended.&lt;/span&gt;&lt;br /&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve the &lt;b&gt;campaign_id&lt;/b&gt; and the campaign status (&lt;code&gt;RUNNING&lt;/code&gt;, &lt;code&gt;PAUSED&lt;/code&gt;, &lt;code&gt;ENDED&lt;/code&gt;, and so on) for all the seller&apos;s campaigns.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * This method deletes the campaign specified by the &lt;code&gt;campaign_id&lt;/code&gt; query parameter.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt; You can only delete campaigns that have ended.&lt;/span&gt;&lt;br /&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve the &lt;b&gt;campaign_id&lt;/b&gt; and the campaign status (&lt;code&gt;RUNNING&lt;/code&gt;, &lt;code&gt;PAUSED&lt;/code&gt;, &lt;code&gt;ENDED&lt;/code&gt;, and so on) for all the seller&apos;s campaigns.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * This method retrieves the details of a single campaign, as specified with the &lt;b&gt;campaign_id&lt;/b&gt; query parameter.  &lt;p&gt;This method returns all the details of a campaign (including the campaign&apos;s the selection rules), except the for the listing IDs or inventory reference IDs included in the campaign. These IDs are returned by &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad-getads&quot;&gt;getAds&lt;/a&gt;.&lt;/p&gt;  &lt;p&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the seller&apos;s campaign IDs.&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves the details of a single campaign, as specified with the &lt;b&gt;campaign_id&lt;/b&gt; query parameter.  &lt;p&gt;This method returns all the details of a campaign (including the campaign&apos;s the selection rules), except the for the listing IDs or inventory reference IDs included in the campaign. These IDs are returned by &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-ad-getads&quot;&gt;getAds&lt;/a&gt;.&lt;/p&gt;  &lt;p&gt;Call &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-campaign-getcampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve a list of the seller&apos;s campaign IDs.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithCampaignItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithCampaignItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithCampaignItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
