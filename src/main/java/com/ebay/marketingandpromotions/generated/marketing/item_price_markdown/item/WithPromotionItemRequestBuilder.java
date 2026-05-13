package com.ebay.marketingandpromotions.generated.marketing.item_price_markdown.item;

import com.ebay.marketingandpromotions.generated.marketing.models.ItemPriceMarkdown;
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
 * Builds and executes requests for operations under /item_price_markdown/{promotion_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithPromotionItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithPromotionItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPromotionItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/item_price_markdown/{promotion_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithPromotionItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPromotionItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/item_price_markdown/{promotion_id}", rawUrl);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method deletes the item price markdown discount specified by the &lt;b&gt;promotion_id&lt;/b&gt; path parameter. Call &lt;a href=&quot;/api-docs/sell/marketing/resources/promotion/methods/getPromotions&quot;&gt;getPromotions&lt;/a&gt; to retrieve the IDs of a seller&apos;s discounts.  &lt;br&gt;&lt;br&gt;You can delete any discount with the exception of those that are currently active (RUNNING). To end a running discount, call &lt;a href=&quot;/api-docs/sell/marketing/resources/item_price_markdown/methods/updateItemPriceMarkdownPromotion&quot;&gt;updateItemPriceMarkdownPromotion&lt;/a&gt; and adjust the &lt;b&gt;endDate&lt;/b&gt; field as appropriate.
     */
    public void delete() {
        delete(null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method deletes the item price markdown discount specified by the &lt;b&gt;promotion_id&lt;/b&gt; path parameter. Call &lt;a href=&quot;/api-docs/sell/marketing/resources/promotion/methods/getPromotions&quot;&gt;getPromotions&lt;/a&gt; to retrieve the IDs of a seller&apos;s discounts.  &lt;br&gt;&lt;br&gt;You can delete any discount with the exception of those that are currently active (RUNNING). To end a running discount, call &lt;a href=&quot;/api-docs/sell/marketing/resources/item_price_markdown/methods/updateItemPriceMarkdownPromotion&quot;&gt;updateItemPriceMarkdownPromotion&lt;/a&gt; and adjust the &lt;b&gt;endDate&lt;/b&gt; field as appropriate.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method returns the complete details of the item price markdown discounnt that&apos;s indicated by the &lt;b&gt;promotion_id&lt;/b&gt; path parameter. &lt;br&gt;&lt;br&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/promotion/methods/getPromotions&quot;&gt;getPromotions&lt;/a&gt; to retrieve the IDs of a seller&apos;s discounts.
     * @return a {@link ItemPriceMarkdown}
     */
    @jakarta.annotation.Nullable
    public ItemPriceMarkdown get() {
        return get(null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method returns the complete details of the item price markdown discounnt that&apos;s indicated by the &lt;b&gt;promotion_id&lt;/b&gt; path parameter. &lt;br&gt;&lt;br&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/promotion/methods/getPromotions&quot;&gt;getPromotions&lt;/a&gt; to retrieve the IDs of a seller&apos;s discounts.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ItemPriceMarkdown}
     */
    @jakarta.annotation.Nullable
    public ItemPriceMarkdown get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ItemPriceMarkdown::createFromDiscriminatorValue);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method updates the specified item price markdown discount with the new configuration that you supply in the payload of the request. Specify the discount you want to update using the &lt;b&gt;promotion_id&lt;/b&gt; path parameter. Call &lt;a href=&quot;/api-docs/sell/marketing/resources/promotion/methods/getPromotions&quot;&gt;getPromotions&lt;/a&gt; to retrieve the IDs of a seller&apos;s discounts.&lt;br&gt;&lt;br&gt;When updating a discount, supply all the fields that you used to configure the original discount (and not just the fields you are updating). eBay replaces the specified discount with the values you supply in the update request and if you don&apos;t pass a field that currently has a value, the update request fails.  &lt;br&gt;&lt;br&gt;The parameters you are allowed to update with this request depend on the status of the discount you&apos;re updating:  &lt;ul&gt;&lt;li&gt;DRAFT or SCHEDULED discounts: You can update any of the parameters in these discounts that have not yet started to run, including the &lt;b&gt;discountRules&lt;/b&gt;.&lt;/li&gt; &lt;li&gt;RUNNING discounts: You can change the &lt;b&gt;endDate&lt;/b&gt; and the item&apos;s inventory but you cannot change the discount or the start date.&lt;/li&gt; &lt;li&gt;ENDED discounts: Nothing can be changed.&lt;/li&gt;&lt;/ul&gt;
     * @param body This type defines the fields used to describe an item price markdown discount.
     * @return a {@link WithPromotionPutResponse}
     */
    @jakarta.annotation.Nullable
    public WithPromotionPutResponse put(@jakarta.annotation.Nonnull final ItemPriceMarkdown body) {
        return put(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method updates the specified item price markdown discount with the new configuration that you supply in the payload of the request. Specify the discount you want to update using the &lt;b&gt;promotion_id&lt;/b&gt; path parameter. Call &lt;a href=&quot;/api-docs/sell/marketing/resources/promotion/methods/getPromotions&quot;&gt;getPromotions&lt;/a&gt; to retrieve the IDs of a seller&apos;s discounts.&lt;br&gt;&lt;br&gt;When updating a discount, supply all the fields that you used to configure the original discount (and not just the fields you are updating). eBay replaces the specified discount with the values you supply in the update request and if you don&apos;t pass a field that currently has a value, the update request fails.  &lt;br&gt;&lt;br&gt;The parameters you are allowed to update with this request depend on the status of the discount you&apos;re updating:  &lt;ul&gt;&lt;li&gt;DRAFT or SCHEDULED discounts: You can update any of the parameters in these discounts that have not yet started to run, including the &lt;b&gt;discountRules&lt;/b&gt;.&lt;/li&gt; &lt;li&gt;RUNNING discounts: You can change the &lt;b&gt;endDate&lt;/b&gt; and the item&apos;s inventory but you cannot change the discount or the start date.&lt;/li&gt; &lt;li&gt;ENDED discounts: Nothing can be changed.&lt;/li&gt;&lt;/ul&gt;
     * @param body This type defines the fields used to describe an item price markdown discount.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link WithPromotionPutResponse}
     */
    @jakarta.annotation.Nullable
    public WithPromotionPutResponse put(@jakarta.annotation.Nonnull final ItemPriceMarkdown body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, WithPromotionPutResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method deletes the item price markdown discount specified by the &lt;b&gt;promotion_id&lt;/b&gt; path parameter. Call &lt;a href=&quot;/api-docs/sell/marketing/resources/promotion/methods/getPromotions&quot;&gt;getPromotions&lt;/a&gt; to retrieve the IDs of a seller&apos;s discounts.  &lt;br&gt;&lt;br&gt;You can delete any discount with the exception of those that are currently active (RUNNING). To end a running discount, call &lt;a href=&quot;/api-docs/sell/marketing/resources/item_price_markdown/methods/updateItemPriceMarkdownPromotion&quot;&gt;updateItemPriceMarkdownPromotion&lt;/a&gt; and adjust the &lt;b&gt;endDate&lt;/b&gt; field as appropriate.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method deletes the item price markdown discount specified by the &lt;b&gt;promotion_id&lt;/b&gt; path parameter. Call &lt;a href=&quot;/api-docs/sell/marketing/resources/promotion/methods/getPromotions&quot;&gt;getPromotions&lt;/a&gt; to retrieve the IDs of a seller&apos;s discounts.  &lt;br&gt;&lt;br&gt;You can delete any discount with the exception of those that are currently active (RUNNING). To end a running discount, call &lt;a href=&quot;/api-docs/sell/marketing/resources/item_price_markdown/methods/updateItemPriceMarkdownPromotion&quot;&gt;updateItemPriceMarkdownPromotion&lt;/a&gt; and adjust the &lt;b&gt;endDate&lt;/b&gt; field as appropriate.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method returns the complete details of the item price markdown discounnt that&apos;s indicated by the &lt;b&gt;promotion_id&lt;/b&gt; path parameter. &lt;br&gt;&lt;br&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/promotion/methods/getPromotions&quot;&gt;getPromotions&lt;/a&gt; to retrieve the IDs of a seller&apos;s discounts.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method returns the complete details of the item price markdown discounnt that&apos;s indicated by the &lt;b&gt;promotion_id&lt;/b&gt; path parameter. &lt;br&gt;&lt;br&gt;Call &lt;a href=&quot;/api-docs/sell/marketing/resources/promotion/methods/getPromotions&quot;&gt;getPromotions&lt;/a&gt; to retrieve the IDs of a seller&apos;s discounts.
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
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method updates the specified item price markdown discount with the new configuration that you supply in the payload of the request. Specify the discount you want to update using the &lt;b&gt;promotion_id&lt;/b&gt; path parameter. Call &lt;a href=&quot;/api-docs/sell/marketing/resources/promotion/methods/getPromotions&quot;&gt;getPromotions&lt;/a&gt; to retrieve the IDs of a seller&apos;s discounts.&lt;br&gt;&lt;br&gt;When updating a discount, supply all the fields that you used to configure the original discount (and not just the fields you are updating). eBay replaces the specified discount with the values you supply in the update request and if you don&apos;t pass a field that currently has a value, the update request fails.  &lt;br&gt;&lt;br&gt;The parameters you are allowed to update with this request depend on the status of the discount you&apos;re updating:  &lt;ul&gt;&lt;li&gt;DRAFT or SCHEDULED discounts: You can update any of the parameters in these discounts that have not yet started to run, including the &lt;b&gt;discountRules&lt;/b&gt;.&lt;/li&gt; &lt;li&gt;RUNNING discounts: You can change the &lt;b&gt;endDate&lt;/b&gt; and the item&apos;s inventory but you cannot change the discount or the start date.&lt;/li&gt; &lt;li&gt;ENDED discounts: Nothing can be changed.&lt;/li&gt;&lt;/ul&gt;
     * @param body This type defines the fields used to describe an item price markdown discount.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ItemPriceMarkdown body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; As of July 8th 2024, &lt;i&gt;promotions&lt;/i&gt; are now being referred to as &lt;i&gt;discounts&lt;/i&gt; on Seller Hub and eBay help pages. Sell Marketing API documentation has been updated to reflect this product name change, but note that no API interface changes have been made.&lt;/span&gt;&lt;br&gt;This method updates the specified item price markdown discount with the new configuration that you supply in the payload of the request. Specify the discount you want to update using the &lt;b&gt;promotion_id&lt;/b&gt; path parameter. Call &lt;a href=&quot;/api-docs/sell/marketing/resources/promotion/methods/getPromotions&quot;&gt;getPromotions&lt;/a&gt; to retrieve the IDs of a seller&apos;s discounts.&lt;br&gt;&lt;br&gt;When updating a discount, supply all the fields that you used to configure the original discount (and not just the fields you are updating). eBay replaces the specified discount with the values you supply in the update request and if you don&apos;t pass a field that currently has a value, the update request fails.  &lt;br&gt;&lt;br&gt;The parameters you are allowed to update with this request depend on the status of the discount you&apos;re updating:  &lt;ul&gt;&lt;li&gt;DRAFT or SCHEDULED discounts: You can update any of the parameters in these discounts that have not yet started to run, including the &lt;b&gt;discountRules&lt;/b&gt;.&lt;/li&gt; &lt;li&gt;RUNNING discounts: You can change the &lt;b&gt;endDate&lt;/b&gt; and the item&apos;s inventory but you cannot change the discount or the start date.&lt;/li&gt; &lt;li&gt;ENDED discounts: Nothing can be changed.&lt;/li&gt;&lt;/ul&gt;
     * @param body This type defines the fields used to describe an item price markdown discount.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final ItemPriceMarkdown body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a {@link WithPromotionItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithPromotionItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithPromotionItemRequestBuilder(rawUrl, requestAdapter);
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
