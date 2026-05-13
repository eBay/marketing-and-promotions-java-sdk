package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.get_ads_by_inventory_reference;

import com.ebay.marketingandpromotions.generated.marketing.models.Ads;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Builds and executes requests for operations under /ad_campaign/{campaign_id}/get_ads_by_inventory_reference
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetAdsByInventoryReferenceRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetAdsByInventoryReferenceRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetAdsByInventoryReferenceRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/get_ads_by_inventory_reference?inventory_reference_id={inventory_reference_id}&inventory_reference_type={inventory_reference_type}", pathParameters);
    }
    /**
     * Instantiates a new {@link GetAdsByInventoryReferenceRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetAdsByInventoryReferenceRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/get_ads_by_inventory_reference?inventory_reference_id={inventory_reference_id}&inventory_reference_type={inventory_reference_type}", rawUrl);
    }
    /**
     * This method retrieves Promoted Listings ads associated with listings that are managed with the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot;&gt;Inventory API&lt;/a&gt; from the specified campaign.&lt;br /&gt;&lt;br /&gt;Supply the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter and use query parameters to specify the &lt;b&gt;inventory_reference_id&lt;/b&gt; and &lt;b&gt;inventory_reference_type&lt;/b&gt; pairs.&lt;br /&gt;&lt;br /&gt;In the Inventory API, an &lt;i&gt;inventory reference ID&lt;/i&gt; is either a seller-defined &lt;b&gt;SKU&lt;/b&gt; value or an &lt;b&gt;inventoryItemGroupKey&lt;/b&gt; (a seller-defined ID for an inventory item group, which is an entity that&apos;s used in the Inventory API to create a multiple-variation listing). To indicate a listing managed by the Inventory API, you must always specify both an &lt;b&gt;inventory_reference_id&lt;/b&gt; and the associated &lt;b&gt;inventory_reference_type&lt;/b&gt;.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve all of the seller&apos;s the current campaign IDs.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @return a {@link Ads}
     */
    @jakarta.annotation.Nullable
    public Ads get() {
        return get(null);
    }
    /**
     * This method retrieves Promoted Listings ads associated with listings that are managed with the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot;&gt;Inventory API&lt;/a&gt; from the specified campaign.&lt;br /&gt;&lt;br /&gt;Supply the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter and use query parameters to specify the &lt;b&gt;inventory_reference_id&lt;/b&gt; and &lt;b&gt;inventory_reference_type&lt;/b&gt; pairs.&lt;br /&gt;&lt;br /&gt;In the Inventory API, an &lt;i&gt;inventory reference ID&lt;/i&gt; is either a seller-defined &lt;b&gt;SKU&lt;/b&gt; value or an &lt;b&gt;inventoryItemGroupKey&lt;/b&gt; (a seller-defined ID for an inventory item group, which is an entity that&apos;s used in the Inventory API to create a multiple-variation listing). To indicate a listing managed by the Inventory API, you must always specify both an &lt;b&gt;inventory_reference_id&lt;/b&gt; and the associated &lt;b&gt;inventory_reference_type&lt;/b&gt;.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve all of the seller&apos;s the current campaign IDs.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Ads}
     */
    @jakarta.annotation.Nullable
    public Ads get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Ads::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves Promoted Listings ads associated with listings that are managed with the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot;&gt;Inventory API&lt;/a&gt; from the specified campaign.&lt;br /&gt;&lt;br /&gt;Supply the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter and use query parameters to specify the &lt;b&gt;inventory_reference_id&lt;/b&gt; and &lt;b&gt;inventory_reference_type&lt;/b&gt; pairs.&lt;br /&gt;&lt;br /&gt;In the Inventory API, an &lt;i&gt;inventory reference ID&lt;/i&gt; is either a seller-defined &lt;b&gt;SKU&lt;/b&gt; value or an &lt;b&gt;inventoryItemGroupKey&lt;/b&gt; (a seller-defined ID for an inventory item group, which is an entity that&apos;s used in the Inventory API to create a multiple-variation listing). To indicate a listing managed by the Inventory API, you must always specify both an &lt;b&gt;inventory_reference_id&lt;/b&gt; and the associated &lt;b&gt;inventory_reference_type&lt;/b&gt;.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve all of the seller&apos;s the current campaign IDs.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves Promoted Listings ads associated with listings that are managed with the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot;&gt;Inventory API&lt;/a&gt; from the specified campaign.&lt;br /&gt;&lt;br /&gt;Supply the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter and use query parameters to specify the &lt;b&gt;inventory_reference_id&lt;/b&gt; and &lt;b&gt;inventory_reference_type&lt;/b&gt; pairs.&lt;br /&gt;&lt;br /&gt;In the Inventory API, an &lt;i&gt;inventory reference ID&lt;/i&gt; is either a seller-defined &lt;b&gt;SKU&lt;/b&gt; value or an &lt;b&gt;inventoryItemGroupKey&lt;/b&gt; (a seller-defined ID for an inventory item group, which is an entity that&apos;s used in the Inventory API to create a multiple-variation listing). To indicate a listing managed by the Inventory API, you must always specify both an &lt;b&gt;inventory_reference_id&lt;/b&gt; and the associated &lt;b&gt;inventory_reference_type&lt;/b&gt;.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve all of the seller&apos;s the current campaign IDs.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link GetAdsByInventoryReferenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetAdsByInventoryReferenceRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetAdsByInventoryReferenceRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method retrieves Promoted Listings ads associated with listings that are managed with the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot;&gt;Inventory API&lt;/a&gt; from the specified campaign.&lt;br /&gt;&lt;br /&gt;Supply the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter and use query parameters to specify the &lt;b&gt;inventory_reference_id&lt;/b&gt; and &lt;b&gt;inventory_reference_type&lt;/b&gt; pairs.&lt;br /&gt;&lt;br /&gt;In the Inventory API, an &lt;i&gt;inventory reference ID&lt;/i&gt; is either a seller-defined &lt;b&gt;SKU&lt;/b&gt; value or an &lt;b&gt;inventoryItemGroupKey&lt;/b&gt; (a seller-defined ID for an inventory item group, which is an entity that&apos;s used in the Inventory API to create a multiple-variation listing). To indicate a listing managed by the Inventory API, you must always specify both an &lt;b&gt;inventory_reference_id&lt;/b&gt; and the associated &lt;b&gt;inventory_reference_type&lt;/b&gt;.&lt;br /&gt;&lt;br /&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to retrieve all of the seller&apos;s the current campaign IDs.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This query parameter specifies the unique identifier of a single-item listing or a multi-variation listing.&lt;br&gt;&lt;br&gt;To retrieve an ad for a single-item listing, set the &lt;b&gt;inventoryReferenceType&lt;/b&gt; value to &lt;code&gt;INVENTORY_ITEM&lt;/code&gt; and specify an item ID or a SKU (if the SKU is defined in the listing).&lt;br&gt;&lt;br&gt;To retrieve an ad for a multi-variation listing, set the &lt;b&gt;inventoryReferenceType&lt;/b&gt; value to &lt;code&gt;INVENTORY_ITEM_GROUP&lt;/code&gt; and specify the item ID for the multi-variation listing or the &lt;b&gt;inventoryitemGroupKey&lt;/b&gt; value as defined in the Inventory API.
         */
        @jakarta.annotation.Nullable
        public String inventoryReferenceId;
        /**
         * This query parameter specifies the type of the item the &lt;b&gt;inventory_reference_id&lt;/b&gt; references.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/api-docs/sell/marketing/types/pls:InventoryReferenceTypeEnum&quot; target=&quot;_blank&quot;&gt;InventoryReferenceType&lt;/a&gt; for supported values.
         */
        @jakarta.annotation.Nullable
        public String inventoryReferenceType;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("inventory_reference_id", inventoryReferenceId);
            allQueryParams.put("inventory_reference_type", inventoryReferenceType);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}
