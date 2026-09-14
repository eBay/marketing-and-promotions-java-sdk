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

package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.bulk_upsert_video_ads_preferences;

import com.ebay.marketingandpromotions.generated.marketing.models.BulkUpsertVideoAdsPreferencesRequest;
import com.ebay.marketingandpromotions.generated.marketing.models.BulkUpsertVideoAdsPreferencesResponse;
import com.ebay.marketingandpromotions.generated.marketing.models.ErrorDetailV3;
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
 * Builds and executes requests for operations under /ad_campaign/{campaign_id}/bulk_upsert_video_ads_preferences
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkUpsertVideoAdsPreferencesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link BulkUpsertVideoAdsPreferencesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkUpsertVideoAdsPreferencesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/bulk_upsert_video_ads_preferences", pathParameters);
    }
    /**
     * Instantiates a new {@link BulkUpsertVideoAdsPreferencesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkUpsertVideoAdsPreferencesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/bulk_upsert_video_ads_preferences", rawUrl);
    }
    /**
     * Call this method to create or update video ads preferences for multiple listings in a single ad campaign request. This operation is designed for bulk updates and accepts a &lt;b&gt;requests&lt;/b&gt; array, where each item identifies a &lt;b&gt;listingId&lt;/b&gt; and its &lt;b&gt;videoAdsPreferences&lt;/b&gt; settings, including &lt;b&gt;videoAdsEnabled&lt;/b&gt;. This request updates the seller&apos;s video ads preference, but a video ad is served only when the video is available and approved. If the video is unavailable or not approved, the ad may fall back to the static listing image. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;A maximum of 500 listing IDs is supported per call.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;Use &lt;b&gt;bulkUpsertVideoAdsPreferences&lt;/b&gt; when you want to enable or disable video ads across several listings efficiently, rather than sending one request per listing. Setting &lt;b&gt;videoAdsEnabled&lt;/b&gt; to &lt;code&gt;true&lt;/code&gt; enables video ads for ads associated with the specified listing IDs within the campaign, while &lt;code&gt;false&lt;/code&gt; opts those ads out of video ads.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Use this operation only for listings in Promoted Listings priority campaigns that use the Cost Per Click (CPC) funding model and already have a video attached to the listing. Video ads preferences are managed at the campaign level, not the ad group level. When a listing ID is opted into video ads for a given campaign, all ads associated with that listing ID within the campaign are opted into video ads.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;To confirm the updated state, retrieve the affected ad or ads with the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter set to &lt;code&gt;VIDEO&lt;/code&gt; so &lt;b&gt;videoAdsPreferences&lt;/b&gt; is included in the response.&lt;/p&gt;
     * @param body This request type defines the listing-level video ads preference create or update operations to perform in a single request across multiple Promoted Listings ads within a CPC campaign.
     * @return a {@link BulkUpsertVideoAdsPreferencesResponse}
     * @throws ErrorDetailV3 When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 404 status code
     * @throws ErrorDetailV3 When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public BulkUpsertVideoAdsPreferencesResponse put(@jakarta.annotation.Nonnull final BulkUpsertVideoAdsPreferencesRequest body) {
        return put(body, null);
    }
    /**
     * Call this method to create or update video ads preferences for multiple listings in a single ad campaign request. This operation is designed for bulk updates and accepts a &lt;b&gt;requests&lt;/b&gt; array, where each item identifies a &lt;b&gt;listingId&lt;/b&gt; and its &lt;b&gt;videoAdsPreferences&lt;/b&gt; settings, including &lt;b&gt;videoAdsEnabled&lt;/b&gt;. This request updates the seller&apos;s video ads preference, but a video ad is served only when the video is available and approved. If the video is unavailable or not approved, the ad may fall back to the static listing image. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;A maximum of 500 listing IDs is supported per call.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;Use &lt;b&gt;bulkUpsertVideoAdsPreferences&lt;/b&gt; when you want to enable or disable video ads across several listings efficiently, rather than sending one request per listing. Setting &lt;b&gt;videoAdsEnabled&lt;/b&gt; to &lt;code&gt;true&lt;/code&gt; enables video ads for ads associated with the specified listing IDs within the campaign, while &lt;code&gt;false&lt;/code&gt; opts those ads out of video ads.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Use this operation only for listings in Promoted Listings priority campaigns that use the Cost Per Click (CPC) funding model and already have a video attached to the listing. Video ads preferences are managed at the campaign level, not the ad group level. When a listing ID is opted into video ads for a given campaign, all ads associated with that listing ID within the campaign are opted into video ads.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;To confirm the updated state, retrieve the affected ad or ads with the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter set to &lt;code&gt;VIDEO&lt;/code&gt; so &lt;b&gt;videoAdsPreferences&lt;/b&gt; is included in the response.&lt;/p&gt;
     * @param body This request type defines the listing-level video ads preference create or update operations to perform in a single request across multiple Promoted Listings ads within a CPC campaign.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link BulkUpsertVideoAdsPreferencesResponse}
     * @throws ErrorDetailV3 When receiving a 400 status code
     * @throws ErrorDetailV3 When receiving a 404 status code
     * @throws ErrorDetailV3 When receiving a 409 status code
     * @throws ErrorDetailV3 When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public BulkUpsertVideoAdsPreferencesResponse put(@jakarta.annotation.Nonnull final BulkUpsertVideoAdsPreferencesRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("404", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("409", ErrorDetailV3::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorDetailV3::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, BulkUpsertVideoAdsPreferencesResponse::createFromDiscriminatorValue);
    }
    /**
     * Call this method to create or update video ads preferences for multiple listings in a single ad campaign request. This operation is designed for bulk updates and accepts a &lt;b&gt;requests&lt;/b&gt; array, where each item identifies a &lt;b&gt;listingId&lt;/b&gt; and its &lt;b&gt;videoAdsPreferences&lt;/b&gt; settings, including &lt;b&gt;videoAdsEnabled&lt;/b&gt;. This request updates the seller&apos;s video ads preference, but a video ad is served only when the video is available and approved. If the video is unavailable or not approved, the ad may fall back to the static listing image. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;A maximum of 500 listing IDs is supported per call.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;Use &lt;b&gt;bulkUpsertVideoAdsPreferences&lt;/b&gt; when you want to enable or disable video ads across several listings efficiently, rather than sending one request per listing. Setting &lt;b&gt;videoAdsEnabled&lt;/b&gt; to &lt;code&gt;true&lt;/code&gt; enables video ads for ads associated with the specified listing IDs within the campaign, while &lt;code&gt;false&lt;/code&gt; opts those ads out of video ads.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Use this operation only for listings in Promoted Listings priority campaigns that use the Cost Per Click (CPC) funding model and already have a video attached to the listing. Video ads preferences are managed at the campaign level, not the ad group level. When a listing ID is opted into video ads for a given campaign, all ads associated with that listing ID within the campaign are opted into video ads.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;To confirm the updated state, retrieve the affected ad or ads with the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter set to &lt;code&gt;VIDEO&lt;/code&gt; so &lt;b&gt;videoAdsPreferences&lt;/b&gt; is included in the response.&lt;/p&gt;
     * @param body This request type defines the listing-level video ads preference create or update operations to perform in a single request across multiple Promoted Listings ads within a CPC campaign.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final BulkUpsertVideoAdsPreferencesRequest body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Call this method to create or update video ads preferences for multiple listings in a single ad campaign request. This operation is designed for bulk updates and accepts a &lt;b&gt;requests&lt;/b&gt; array, where each item identifies a &lt;b&gt;listingId&lt;/b&gt; and its &lt;b&gt;videoAdsPreferences&lt;/b&gt; settings, including &lt;b&gt;videoAdsEnabled&lt;/b&gt;. This request updates the seller&apos;s video ads preference, but a video ad is served only when the video is available and approved. If the video is unavailable or not approved, the ad may fall back to the static listing image. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;A maximum of 500 listing IDs is supported per call.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;Use &lt;b&gt;bulkUpsertVideoAdsPreferences&lt;/b&gt; when you want to enable or disable video ads across several listings efficiently, rather than sending one request per listing. Setting &lt;b&gt;videoAdsEnabled&lt;/b&gt; to &lt;code&gt;true&lt;/code&gt; enables video ads for ads associated with the specified listing IDs within the campaign, while &lt;code&gt;false&lt;/code&gt; opts those ads out of video ads.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Use this operation only for listings in Promoted Listings priority campaigns that use the Cost Per Click (CPC) funding model and already have a video attached to the listing. Video ads preferences are managed at the campaign level, not the ad group level. When a listing ID is opted into video ads for a given campaign, all ads associated with that listing ID within the campaign are opted into video ads.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;To confirm the updated state, retrieve the affected ad or ads with the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter set to &lt;code&gt;VIDEO&lt;/code&gt; so &lt;b&gt;videoAdsPreferences&lt;/b&gt; is included in the response.&lt;/p&gt;
     * @param body This request type defines the listing-level video ads preference create or update operations to perform in a single request across multiple Promoted Listings ads within a CPC campaign.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final BulkUpsertVideoAdsPreferencesRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link BulkUpsertVideoAdsPreferencesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkUpsertVideoAdsPreferencesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BulkUpsertVideoAdsPreferencesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
