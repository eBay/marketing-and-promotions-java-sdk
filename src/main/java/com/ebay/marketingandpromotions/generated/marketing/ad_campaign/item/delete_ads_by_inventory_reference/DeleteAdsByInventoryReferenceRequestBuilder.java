package com.ebay.marketingandpromotions.generated.marketing.ad_campaign.item.delete_ads_by_inventory_reference;

import com.ebay.marketingandpromotions.generated.marketing.models.AdIds;
import com.ebay.marketingandpromotions.generated.marketing.models.DeleteAdsByInventoryReferenceRequest;
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
 * Builds and executes requests for operations under /ad_campaign/{campaign_id}/delete_ads_by_inventory_reference
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeleteAdsByInventoryReferenceRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link DeleteAdsByInventoryReferenceRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeleteAdsByInventoryReferenceRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/delete_ads_by_inventory_reference", pathParameters);
    }
    /**
     * Instantiates a new {@link DeleteAdsByInventoryReferenceRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeleteAdsByInventoryReferenceRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/ad_campaign/{campaign_id}/delete_ads_by_inventory_reference", rawUrl);
    }
    /**
     * This method works with listings that are managed with the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot;&gt;Inventory API&lt;/a&gt;.  &lt;p&gt;The method deletes ads using a list of seller-defined inventory reference IDs, used with the Inventory API, that are associated with the specified campaign ID.&lt;/p&gt; &lt;p&gt;Specify the campaign ID (as a path parameter) and a list of &lt;b&gt;inventoryReferenceId&lt;/b&gt; and &lt;b&gt;inventoryReferenceType&lt;/b&gt; pairs to be deleted.&lt;/p&gt;  &lt;p&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to get a list of the seller&apos;s current campaign IDs.&lt;/p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;&lt;br /&gt;When using the CPC funding model, use the bulkUpdateAdsStatusByInventoryReference method to change the status of ads to ARCHIVED.
     * @param body This type defines the fields needed to delete an ad by its inventory reference ID.  You must always supply both &lt;b&gt;inventory_reference_id&lt;/b&gt; and &lt;b&gt;inventory_reference_type&lt;/b&gt;.
     * @return a {@link AdIds}
     */
    @jakarta.annotation.Nullable
    public AdIds post(@jakarta.annotation.Nonnull final DeleteAdsByInventoryReferenceRequest body) {
        return post(body, null);
    }
    /**
     * This method works with listings that are managed with the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot;&gt;Inventory API&lt;/a&gt;.  &lt;p&gt;The method deletes ads using a list of seller-defined inventory reference IDs, used with the Inventory API, that are associated with the specified campaign ID.&lt;/p&gt; &lt;p&gt;Specify the campaign ID (as a path parameter) and a list of &lt;b&gt;inventoryReferenceId&lt;/b&gt; and &lt;b&gt;inventoryReferenceType&lt;/b&gt; pairs to be deleted.&lt;/p&gt;  &lt;p&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to get a list of the seller&apos;s current campaign IDs.&lt;/p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;&lt;br /&gt;When using the CPC funding model, use the bulkUpdateAdsStatusByInventoryReference method to change the status of ads to ARCHIVED.
     * @param body This type defines the fields needed to delete an ad by its inventory reference ID.  You must always supply both &lt;b&gt;inventory_reference_id&lt;/b&gt; and &lt;b&gt;inventory_reference_type&lt;/b&gt;.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AdIds}
     */
    @jakarta.annotation.Nullable
    public AdIds post(@jakarta.annotation.Nonnull final DeleteAdsByInventoryReferenceRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AdIds::createFromDiscriminatorValue);
    }
    /**
     * This method works with listings that are managed with the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot;&gt;Inventory API&lt;/a&gt;.  &lt;p&gt;The method deletes ads using a list of seller-defined inventory reference IDs, used with the Inventory API, that are associated with the specified campaign ID.&lt;/p&gt; &lt;p&gt;Specify the campaign ID (as a path parameter) and a list of &lt;b&gt;inventoryReferenceId&lt;/b&gt; and &lt;b&gt;inventoryReferenceType&lt;/b&gt; pairs to be deleted.&lt;/p&gt;  &lt;p&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to get a list of the seller&apos;s current campaign IDs.&lt;/p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;&lt;br /&gt;When using the CPC funding model, use the bulkUpdateAdsStatusByInventoryReference method to change the status of ads to ARCHIVED.
     * @param body This type defines the fields needed to delete an ad by its inventory reference ID.  You must always supply both &lt;b&gt;inventory_reference_id&lt;/b&gt; and &lt;b&gt;inventory_reference_type&lt;/b&gt;.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DeleteAdsByInventoryReferenceRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method works with listings that are managed with the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot; title=&quot;Inventory API Reference&quot;&gt;Inventory API&lt;/a&gt;.  &lt;p&gt;The method deletes ads using a list of seller-defined inventory reference IDs, used with the Inventory API, that are associated with the specified campaign ID.&lt;/p&gt; &lt;p&gt;Specify the campaign ID (as a path parameter) and a list of &lt;b&gt;inventoryReferenceId&lt;/b&gt; and &lt;b&gt;inventoryReferenceType&lt;/b&gt; pairs to be deleted.&lt;/p&gt;  &lt;p&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot;&gt;getCampaigns&lt;/a&gt; to get a list of the seller&apos;s current campaign IDs.&lt;/p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only applies to the Cost Per Sale (CPS) funding model; it does not apply to the Cost Per Click (CPC) funding model. See &lt;a href=&quot;/api-docs/sell/static/marketing/pl-overview.html#funding-model&quot;&gt;Funding Models&lt;/a&gt; in the &lt;i&gt;Promoted Listings Playbook&lt;/i&gt; for more information.&lt;/span&gt;&lt;br /&gt;When using the CPC funding model, use the bulkUpdateAdsStatusByInventoryReference method to change the status of ads to ARCHIVED.
     * @param body This type defines the fields needed to delete an ad by its inventory reference ID.  You must always supply both &lt;b&gt;inventory_reference_id&lt;/b&gt; and &lt;b&gt;inventory_reference_type&lt;/b&gt;.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DeleteAdsByInventoryReferenceRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link DeleteAdsByInventoryReferenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeleteAdsByInventoryReferenceRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DeleteAdsByInventoryReferenceRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
