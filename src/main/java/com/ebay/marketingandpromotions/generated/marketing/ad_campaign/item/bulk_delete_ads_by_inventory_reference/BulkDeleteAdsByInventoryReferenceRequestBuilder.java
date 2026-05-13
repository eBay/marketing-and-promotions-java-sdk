package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.bulk_delete_ads_by_inventory_reference;

import com.ebay.marketingandpromotions.generated.marketing.models.BulkDeleteAdsByInventoryReferenceRequest;
import com.ebay.marketingandpromotions.generated.marketing.models.BulkDeleteAdsByInventoryReferenceResponse;
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
 * Builds and executes requests for operations under /ad_campaign/{campaign_id}/bulk_delete_ads_by_inventory_reference
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkDeleteAdsByInventoryReferenceRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link BulkDeleteAdsByInventoryReferenceRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkDeleteAdsByInventoryReferenceRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/bulk_delete_ads_by_inventory_reference", pathParameters);
    }
    /**
     * Instantiates a new {@link BulkDeleteAdsByInventoryReferenceRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkDeleteAdsByInventoryReferenceRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/bulk_delete_ads_by_inventory_reference", rawUrl);
    }
    /**
     * This method works with listings created with the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot;&gt;Inventory API&lt;/a&gt;.&lt;br /&gt;&lt;br /&gt;The method deletes a set of ads, as specified by a list of inventory reference IDs, from the specified campaign. &lt;i&gt;Inventory reference IDs&lt;/i&gt; are seller-defined IDs that are used with the Inventory API&lt;/a&gt;.&lt;br /&gt;&lt;br /&gt;Pass the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter and populate the payload with a list of &lt;b&gt;inventoryReferenceId&lt;/b&gt; and &lt;b&gt;inventoryReferenceType&lt;/b&gt; pairs that you want to delete.&lt;br /&gt;&lt;br /&gt;Get the campaign IDs for a seller by calling &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; and call &lt;a href=&quot;/api-docs/sell/marketing/resources/ad/methods/getAds&quot;&gt;getAds&lt;/a&gt; to get a list of the seller&apos;s inventory reference IDs.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @param body This type defines the request fields that &lt;b&gt;bulkDeleteAdsByInventoryReference&lt;/b&gt; uses to delete ads in bulk.
     * @return a {@link BulkDeleteAdsByInventoryReferenceResponse}
     */
    @jakarta.annotation.Nullable
    public BulkDeleteAdsByInventoryReferenceResponse post(@jakarta.annotation.Nonnull final BulkDeleteAdsByInventoryReferenceRequest body) {
        return post(body, null);
    }
    /**
     * This method works with listings created with the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot;&gt;Inventory API&lt;/a&gt;.&lt;br /&gt;&lt;br /&gt;The method deletes a set of ads, as specified by a list of inventory reference IDs, from the specified campaign. &lt;i&gt;Inventory reference IDs&lt;/i&gt; are seller-defined IDs that are used with the Inventory API&lt;/a&gt;.&lt;br /&gt;&lt;br /&gt;Pass the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter and populate the payload with a list of &lt;b&gt;inventoryReferenceId&lt;/b&gt; and &lt;b&gt;inventoryReferenceType&lt;/b&gt; pairs that you want to delete.&lt;br /&gt;&lt;br /&gt;Get the campaign IDs for a seller by calling &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; and call &lt;a href=&quot;/api-docs/sell/marketing/resources/ad/methods/getAds&quot;&gt;getAds&lt;/a&gt; to get a list of the seller&apos;s inventory reference IDs.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @param body This type defines the request fields that &lt;b&gt;bulkDeleteAdsByInventoryReference&lt;/b&gt; uses to delete ads in bulk.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link BulkDeleteAdsByInventoryReferenceResponse}
     */
    @jakarta.annotation.Nullable
    public BulkDeleteAdsByInventoryReferenceResponse post(@jakarta.annotation.Nonnull final BulkDeleteAdsByInventoryReferenceRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, BulkDeleteAdsByInventoryReferenceResponse::createFromDiscriminatorValue);
    }
    /**
     * This method works with listings created with the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot;&gt;Inventory API&lt;/a&gt;.&lt;br /&gt;&lt;br /&gt;The method deletes a set of ads, as specified by a list of inventory reference IDs, from the specified campaign. &lt;i&gt;Inventory reference IDs&lt;/i&gt; are seller-defined IDs that are used with the Inventory API&lt;/a&gt;.&lt;br /&gt;&lt;br /&gt;Pass the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter and populate the payload with a list of &lt;b&gt;inventoryReferenceId&lt;/b&gt; and &lt;b&gt;inventoryReferenceType&lt;/b&gt; pairs that you want to delete.&lt;br /&gt;&lt;br /&gt;Get the campaign IDs for a seller by calling &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; and call &lt;a href=&quot;/api-docs/sell/marketing/resources/ad/methods/getAds&quot;&gt;getAds&lt;/a&gt; to get a list of the seller&apos;s inventory reference IDs.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @param body This type defines the request fields that &lt;b&gt;bulkDeleteAdsByInventoryReference&lt;/b&gt; uses to delete ads in bulk.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkDeleteAdsByInventoryReferenceRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method works with listings created with the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot;&gt;Inventory API&lt;/a&gt;.&lt;br /&gt;&lt;br /&gt;The method deletes a set of ads, as specified by a list of inventory reference IDs, from the specified campaign. &lt;i&gt;Inventory reference IDs&lt;/i&gt; are seller-defined IDs that are used with the Inventory API&lt;/a&gt;.&lt;br /&gt;&lt;br /&gt;Pass the &lt;b&gt;campaign_id&lt;/b&gt; as a path parameter and populate the payload with a list of &lt;b&gt;inventoryReferenceId&lt;/b&gt; and &lt;b&gt;inventoryReferenceType&lt;/b&gt; pairs that you want to delete.&lt;br /&gt;&lt;br /&gt;Get the campaign IDs for a seller by calling &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; and call &lt;a href=&quot;/api-docs/sell/marketing/resources/ad/methods/getAds&quot;&gt;getAds&lt;/a&gt; to get a list of the seller&apos;s inventory reference IDs.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;
     * @param body This type defines the request fields that &lt;b&gt;bulkDeleteAdsByInventoryReference&lt;/b&gt; uses to delete ads in bulk.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkDeleteAdsByInventoryReferenceRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link BulkDeleteAdsByInventoryReferenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BulkDeleteAdsByInventoryReferenceRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BulkDeleteAdsByInventoryReferenceRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
