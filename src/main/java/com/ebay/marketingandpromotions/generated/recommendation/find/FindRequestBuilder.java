package com.ebay.marketingandpromotions.generated.recommendation.find;

import com.ebay.marketingandpromotions.generated.recommendation.models.FindListingRecommendationRequest;
import com.ebay.marketingandpromotions.generated.recommendation.models.PagedListingRecommendationCollection;
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
 * Builds and executes requests for operations under /find
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FindRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link FindRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FindRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/find{?filter*,limit*,offset*}", pathParameters);
    }
    /**
     * Instantiates a new {@link FindRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FindRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/find{?filter*,limit*,offset*}", rawUrl);
    }
    /**
     * The &lt;b&gt;find&lt;/b&gt; method currently returns information for a single recommendation type (&lt;code&gt;AD&lt;/code&gt;) which contains information that sellers can use to configure &lt;a href=&quot;/api-docs/sell/static/marketing/promoted-listings.html&quot; title=&quot;Selling Integration Guide&quot;&gt;Promoted Listings&lt;/a&gt; ad campaigns. &lt;p&gt;The response from this method includes an array of the seller&apos;s listing IDs, where each element in the array contains recommendations related to the associated listing ID. For details on how to use this method, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-reco-api.html&quot; title=&quot;Selling Integration Guide&quot;&gt;Using the Recommendation API to help configure campaigns&lt;/a&gt;.&lt;/p&gt;  &lt;h3&gt;The AD recommendation type&lt;/h3&gt;  &lt;/p&gt;  &lt;p&gt;The &lt;code&gt;AD&lt;/code&gt; type contains two sets of information:&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;&lt;b&gt;The promoteWithAd indicator&lt;/b&gt; &lt;br&gt;The &lt;b&gt;promoteWithAd&lt;/b&gt; response field indicates whether or not eBay recommends you place the associated listing in a Promoted Listings ad campaign. &lt;p&gt;The returned value is set to either &lt;code&gt;RECOMMENDED&lt;/code&gt; or &lt;code&gt;UNDETERMINED&lt;/code&gt;, where &lt;code&gt;RECOMMENDED&lt;/code&gt; identifies the listings that will benefit the most from having them included in an ad campaign.&lt;/p&gt;&lt;/li&gt;  &lt;li&gt;&lt;b&gt;The bid percentage&lt;/b&gt; &lt;br&gt;Also known as the &quot;ad rate,&quot; the &lt;b&gt;bidPercentage&lt;/b&gt; field provides the current trending bid percentage of similarly promoted items in the marketplace. &lt;p&gt;The ad rate is a user-specified value that indicates the level of promotion that eBay applies to the campaign across the marketplace. The value is also used to calculate the Promotion Listings fee, which is assessed to the seller if a Promoted Listings action results in the sale of an item.&lt;/p&gt;&lt;/li&gt;&lt;/ul&gt;  &lt;h3&gt;Configuring the request&lt;/h3&gt; &lt;p&gt;You can configure a request to review all of a seller&apos;s currently active listings, or just a subset of them.&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;&lt;b&gt;All active listings&lt;/b&gt; &amp;ndash; If you leave the request body empty, the request targets &lt;i&gt;all&lt;/i&gt; the items currently listed by the seller. &lt;p&gt;Here, the response is filtered to contain only the items where &lt;b&gt;promoteWithAd&lt;/b&gt; equals &lt;code&gt;RECOMMENDED&lt;/code&gt;. In this case, eBay recommends that all the returned listings should be included in a Promoted Listings ad campaign.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;Selected listing IDs&lt;/b&gt; &amp;ndash; If you populate the request body with a set of &lt;b&gt;listingIds&lt;/b&gt;, the response contains data for all the specified listing IDs. &lt;p&gt;In this scenario, the response provides you with information on listings where the &lt;b&gt;promoteWithAd&lt;/b&gt; can be either &lt;code&gt;RECOMMENDED&lt;/code&gt; or &lt;code&gt;UNDETERMINED&lt;/code&gt;.&lt;/li&gt;&lt;/ul&gt;  &lt;h3&gt;The paginated response&lt;/h3&gt;  &lt;p&gt;Because the response can contain many listing IDs, the &lt;b&gt;findListingRecommendations&lt;/b&gt; method paginates the response set.&lt;/p&gt; &lt;p&gt;You can control size of the returned pages, as well as an offset that dictates where to start the pagination, using query parameters in the request.
     * @param body An list of listing ID values for which you want Promoted Listings ad configuration information.
     * @return a {@link PagedListingRecommendationCollection}
     */
    @jakarta.annotation.Nullable
    public PagedListingRecommendationCollection post(@jakarta.annotation.Nonnull final FindListingRecommendationRequest body) {
        return post(body, null);
    }
    /**
     * The &lt;b&gt;find&lt;/b&gt; method currently returns information for a single recommendation type (&lt;code&gt;AD&lt;/code&gt;) which contains information that sellers can use to configure &lt;a href=&quot;/api-docs/sell/static/marketing/promoted-listings.html&quot; title=&quot;Selling Integration Guide&quot;&gt;Promoted Listings&lt;/a&gt; ad campaigns. &lt;p&gt;The response from this method includes an array of the seller&apos;s listing IDs, where each element in the array contains recommendations related to the associated listing ID. For details on how to use this method, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-reco-api.html&quot; title=&quot;Selling Integration Guide&quot;&gt;Using the Recommendation API to help configure campaigns&lt;/a&gt;.&lt;/p&gt;  &lt;h3&gt;The AD recommendation type&lt;/h3&gt;  &lt;/p&gt;  &lt;p&gt;The &lt;code&gt;AD&lt;/code&gt; type contains two sets of information:&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;&lt;b&gt;The promoteWithAd indicator&lt;/b&gt; &lt;br&gt;The &lt;b&gt;promoteWithAd&lt;/b&gt; response field indicates whether or not eBay recommends you place the associated listing in a Promoted Listings ad campaign. &lt;p&gt;The returned value is set to either &lt;code&gt;RECOMMENDED&lt;/code&gt; or &lt;code&gt;UNDETERMINED&lt;/code&gt;, where &lt;code&gt;RECOMMENDED&lt;/code&gt; identifies the listings that will benefit the most from having them included in an ad campaign.&lt;/p&gt;&lt;/li&gt;  &lt;li&gt;&lt;b&gt;The bid percentage&lt;/b&gt; &lt;br&gt;Also known as the &quot;ad rate,&quot; the &lt;b&gt;bidPercentage&lt;/b&gt; field provides the current trending bid percentage of similarly promoted items in the marketplace. &lt;p&gt;The ad rate is a user-specified value that indicates the level of promotion that eBay applies to the campaign across the marketplace. The value is also used to calculate the Promotion Listings fee, which is assessed to the seller if a Promoted Listings action results in the sale of an item.&lt;/p&gt;&lt;/li&gt;&lt;/ul&gt;  &lt;h3&gt;Configuring the request&lt;/h3&gt; &lt;p&gt;You can configure a request to review all of a seller&apos;s currently active listings, or just a subset of them.&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;&lt;b&gt;All active listings&lt;/b&gt; &amp;ndash; If you leave the request body empty, the request targets &lt;i&gt;all&lt;/i&gt; the items currently listed by the seller. &lt;p&gt;Here, the response is filtered to contain only the items where &lt;b&gt;promoteWithAd&lt;/b&gt; equals &lt;code&gt;RECOMMENDED&lt;/code&gt;. In this case, eBay recommends that all the returned listings should be included in a Promoted Listings ad campaign.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;Selected listing IDs&lt;/b&gt; &amp;ndash; If you populate the request body with a set of &lt;b&gt;listingIds&lt;/b&gt;, the response contains data for all the specified listing IDs. &lt;p&gt;In this scenario, the response provides you with information on listings where the &lt;b&gt;promoteWithAd&lt;/b&gt; can be either &lt;code&gt;RECOMMENDED&lt;/code&gt; or &lt;code&gt;UNDETERMINED&lt;/code&gt;.&lt;/li&gt;&lt;/ul&gt;  &lt;h3&gt;The paginated response&lt;/h3&gt;  &lt;p&gt;Because the response can contain many listing IDs, the &lt;b&gt;findListingRecommendations&lt;/b&gt; method paginates the response set.&lt;/p&gt; &lt;p&gt;You can control size of the returned pages, as well as an offset that dictates where to start the pagination, using query parameters in the request.
     * @param body An list of listing ID values for which you want Promoted Listings ad configuration information.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PagedListingRecommendationCollection}
     */
    @jakarta.annotation.Nullable
    public PagedListingRecommendationCollection post(@jakarta.annotation.Nonnull final FindListingRecommendationRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, PagedListingRecommendationCollection::createFromDiscriminatorValue);
    }
    /**
     * The &lt;b&gt;find&lt;/b&gt; method currently returns information for a single recommendation type (&lt;code&gt;AD&lt;/code&gt;) which contains information that sellers can use to configure &lt;a href=&quot;/api-docs/sell/static/marketing/promoted-listings.html&quot; title=&quot;Selling Integration Guide&quot;&gt;Promoted Listings&lt;/a&gt; ad campaigns. &lt;p&gt;The response from this method includes an array of the seller&apos;s listing IDs, where each element in the array contains recommendations related to the associated listing ID. For details on how to use this method, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-reco-api.html&quot; title=&quot;Selling Integration Guide&quot;&gt;Using the Recommendation API to help configure campaigns&lt;/a&gt;.&lt;/p&gt;  &lt;h3&gt;The AD recommendation type&lt;/h3&gt;  &lt;/p&gt;  &lt;p&gt;The &lt;code&gt;AD&lt;/code&gt; type contains two sets of information:&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;&lt;b&gt;The promoteWithAd indicator&lt;/b&gt; &lt;br&gt;The &lt;b&gt;promoteWithAd&lt;/b&gt; response field indicates whether or not eBay recommends you place the associated listing in a Promoted Listings ad campaign. &lt;p&gt;The returned value is set to either &lt;code&gt;RECOMMENDED&lt;/code&gt; or &lt;code&gt;UNDETERMINED&lt;/code&gt;, where &lt;code&gt;RECOMMENDED&lt;/code&gt; identifies the listings that will benefit the most from having them included in an ad campaign.&lt;/p&gt;&lt;/li&gt;  &lt;li&gt;&lt;b&gt;The bid percentage&lt;/b&gt; &lt;br&gt;Also known as the &quot;ad rate,&quot; the &lt;b&gt;bidPercentage&lt;/b&gt; field provides the current trending bid percentage of similarly promoted items in the marketplace. &lt;p&gt;The ad rate is a user-specified value that indicates the level of promotion that eBay applies to the campaign across the marketplace. The value is also used to calculate the Promotion Listings fee, which is assessed to the seller if a Promoted Listings action results in the sale of an item.&lt;/p&gt;&lt;/li&gt;&lt;/ul&gt;  &lt;h3&gt;Configuring the request&lt;/h3&gt; &lt;p&gt;You can configure a request to review all of a seller&apos;s currently active listings, or just a subset of them.&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;&lt;b&gt;All active listings&lt;/b&gt; &amp;ndash; If you leave the request body empty, the request targets &lt;i&gt;all&lt;/i&gt; the items currently listed by the seller. &lt;p&gt;Here, the response is filtered to contain only the items where &lt;b&gt;promoteWithAd&lt;/b&gt; equals &lt;code&gt;RECOMMENDED&lt;/code&gt;. In this case, eBay recommends that all the returned listings should be included in a Promoted Listings ad campaign.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;Selected listing IDs&lt;/b&gt; &amp;ndash; If you populate the request body with a set of &lt;b&gt;listingIds&lt;/b&gt;, the response contains data for all the specified listing IDs. &lt;p&gt;In this scenario, the response provides you with information on listings where the &lt;b&gt;promoteWithAd&lt;/b&gt; can be either &lt;code&gt;RECOMMENDED&lt;/code&gt; or &lt;code&gt;UNDETERMINED&lt;/code&gt;.&lt;/li&gt;&lt;/ul&gt;  &lt;h3&gt;The paginated response&lt;/h3&gt;  &lt;p&gt;Because the response can contain many listing IDs, the &lt;b&gt;findListingRecommendations&lt;/b&gt; method paginates the response set.&lt;/p&gt; &lt;p&gt;You can control size of the returned pages, as well as an offset that dictates where to start the pagination, using query parameters in the request.
     * @param body An list of listing ID values for which you want Promoted Listings ad configuration information.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final FindListingRecommendationRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * The &lt;b&gt;find&lt;/b&gt; method currently returns information for a single recommendation type (&lt;code&gt;AD&lt;/code&gt;) which contains information that sellers can use to configure &lt;a href=&quot;/api-docs/sell/static/marketing/promoted-listings.html&quot; title=&quot;Selling Integration Guide&quot;&gt;Promoted Listings&lt;/a&gt; ad campaigns. &lt;p&gt;The response from this method includes an array of the seller&apos;s listing IDs, where each element in the array contains recommendations related to the associated listing ID. For details on how to use this method, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-reco-api.html&quot; title=&quot;Selling Integration Guide&quot;&gt;Using the Recommendation API to help configure campaigns&lt;/a&gt;.&lt;/p&gt;  &lt;h3&gt;The AD recommendation type&lt;/h3&gt;  &lt;/p&gt;  &lt;p&gt;The &lt;code&gt;AD&lt;/code&gt; type contains two sets of information:&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;&lt;b&gt;The promoteWithAd indicator&lt;/b&gt; &lt;br&gt;The &lt;b&gt;promoteWithAd&lt;/b&gt; response field indicates whether or not eBay recommends you place the associated listing in a Promoted Listings ad campaign. &lt;p&gt;The returned value is set to either &lt;code&gt;RECOMMENDED&lt;/code&gt; or &lt;code&gt;UNDETERMINED&lt;/code&gt;, where &lt;code&gt;RECOMMENDED&lt;/code&gt; identifies the listings that will benefit the most from having them included in an ad campaign.&lt;/p&gt;&lt;/li&gt;  &lt;li&gt;&lt;b&gt;The bid percentage&lt;/b&gt; &lt;br&gt;Also known as the &quot;ad rate,&quot; the &lt;b&gt;bidPercentage&lt;/b&gt; field provides the current trending bid percentage of similarly promoted items in the marketplace. &lt;p&gt;The ad rate is a user-specified value that indicates the level of promotion that eBay applies to the campaign across the marketplace. The value is also used to calculate the Promotion Listings fee, which is assessed to the seller if a Promoted Listings action results in the sale of an item.&lt;/p&gt;&lt;/li&gt;&lt;/ul&gt;  &lt;h3&gt;Configuring the request&lt;/h3&gt; &lt;p&gt;You can configure a request to review all of a seller&apos;s currently active listings, or just a subset of them.&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;&lt;b&gt;All active listings&lt;/b&gt; &amp;ndash; If you leave the request body empty, the request targets &lt;i&gt;all&lt;/i&gt; the items currently listed by the seller. &lt;p&gt;Here, the response is filtered to contain only the items where &lt;b&gt;promoteWithAd&lt;/b&gt; equals &lt;code&gt;RECOMMENDED&lt;/code&gt;. In this case, eBay recommends that all the returned listings should be included in a Promoted Listings ad campaign.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;Selected listing IDs&lt;/b&gt; &amp;ndash; If you populate the request body with a set of &lt;b&gt;listingIds&lt;/b&gt;, the response contains data for all the specified listing IDs. &lt;p&gt;In this scenario, the response provides you with information on listings where the &lt;b&gt;promoteWithAd&lt;/b&gt; can be either &lt;code&gt;RECOMMENDED&lt;/code&gt; or &lt;code&gt;UNDETERMINED&lt;/code&gt;.&lt;/li&gt;&lt;/ul&gt;  &lt;h3&gt;The paginated response&lt;/h3&gt;  &lt;p&gt;Because the response can contain many listing IDs, the &lt;b&gt;findListingRecommendations&lt;/b&gt; method paginates the response set.&lt;/p&gt; &lt;p&gt;You can control size of the returned pages, as well as an offset that dictates where to start the pagination, using query parameters in the request.
     * @param body An list of listing ID values for which you want Promoted Listings ad configuration information.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final FindListingRecommendationRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json;charset=UTF-8");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link FindRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FindRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new FindRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * The &lt;b&gt;find&lt;/b&gt; method currently returns information for a single recommendation type (&lt;code&gt;AD&lt;/code&gt;) which contains information that sellers can use to configure &lt;a href=&quot;/api-docs/sell/static/marketing/promoted-listings.html&quot; title=&quot;Selling Integration Guide&quot;&gt;Promoted Listings&lt;/a&gt; ad campaigns. &lt;p&gt;The response from this method includes an array of the seller&apos;s listing IDs, where each element in the array contains recommendations related to the associated listing ID. For details on how to use this method, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-reco-api.html&quot; title=&quot;Selling Integration Guide&quot;&gt;Using the Recommendation API to help configure campaigns&lt;/a&gt;.&lt;/p&gt;  &lt;h3&gt;The AD recommendation type&lt;/h3&gt;  &lt;/p&gt;  &lt;p&gt;The &lt;code&gt;AD&lt;/code&gt; type contains two sets of information:&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;&lt;b&gt;The promoteWithAd indicator&lt;/b&gt; &lt;br&gt;The &lt;b&gt;promoteWithAd&lt;/b&gt; response field indicates whether or not eBay recommends you place the associated listing in a Promoted Listings ad campaign. &lt;p&gt;The returned value is set to either &lt;code&gt;RECOMMENDED&lt;/code&gt; or &lt;code&gt;UNDETERMINED&lt;/code&gt;, where &lt;code&gt;RECOMMENDED&lt;/code&gt; identifies the listings that will benefit the most from having them included in an ad campaign.&lt;/p&gt;&lt;/li&gt;  &lt;li&gt;&lt;b&gt;The bid percentage&lt;/b&gt; &lt;br&gt;Also known as the &quot;ad rate,&quot; the &lt;b&gt;bidPercentage&lt;/b&gt; field provides the current trending bid percentage of similarly promoted items in the marketplace. &lt;p&gt;The ad rate is a user-specified value that indicates the level of promotion that eBay applies to the campaign across the marketplace. The value is also used to calculate the Promotion Listings fee, which is assessed to the seller if a Promoted Listings action results in the sale of an item.&lt;/p&gt;&lt;/li&gt;&lt;/ul&gt;  &lt;h3&gt;Configuring the request&lt;/h3&gt; &lt;p&gt;You can configure a request to review all of a seller&apos;s currently active listings, or just a subset of them.&lt;/p&gt;  &lt;ul&gt;&lt;li&gt;&lt;b&gt;All active listings&lt;/b&gt; &amp;ndash; If you leave the request body empty, the request targets &lt;i&gt;all&lt;/i&gt; the items currently listed by the seller. &lt;p&gt;Here, the response is filtered to contain only the items where &lt;b&gt;promoteWithAd&lt;/b&gt; equals &lt;code&gt;RECOMMENDED&lt;/code&gt;. In this case, eBay recommends that all the returned listings should be included in a Promoted Listings ad campaign.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;Selected listing IDs&lt;/b&gt; &amp;ndash; If you populate the request body with a set of &lt;b&gt;listingIds&lt;/b&gt;, the response contains data for all the specified listing IDs. &lt;p&gt;In this scenario, the response provides you with information on listings where the &lt;b&gt;promoteWithAd&lt;/b&gt; can be either &lt;code&gt;RECOMMENDED&lt;/code&gt; or &lt;code&gt;UNDETERMINED&lt;/code&gt;.&lt;/li&gt;&lt;/ul&gt;  &lt;h3&gt;The paginated response&lt;/h3&gt;  &lt;p&gt;Because the response can contain many listing IDs, the &lt;b&gt;findListingRecommendations&lt;/b&gt; method paginates the response set.&lt;/p&gt; &lt;p&gt;You can control size of the returned pages, as well as an offset that dictates where to start the pagination, using query parameters in the request.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostQueryParameters implements QueryParameters {
        /**
         * Provide a list of key-value pairs to specify the criteria you want to use to filter the response.  &lt;br&gt;&lt;br&gt;In the list, separate each filter key from its associated value with a colon (&quot;&lt;code&gt;:&lt;/code&gt;&quot;).  &lt;br&gt;&lt;br&gt;Currently, the only supported filter value is &lt;b&gt;recommendationTypes&lt;/b&gt; and it supports only the (&quot;&lt;code&gt;AD&lt;/code&gt;&quot;) type. Follow the &lt;b&gt;recommendationTypes&lt;/b&gt; specifier with the filter type(s) enclosed in curly braces (&quot;&lt;code&gt;{ }&lt;/code&gt;&quot;), and separate multiple types with commas.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;filter=recommendationTypes:{AD}&lt;/code&gt;  &lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;recommendationTypes:{AD}&lt;/code&gt;
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Use this query parameter to set the maximum number of ads to return on a page from the paginated response.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Default: &lt;/b&gt;10 &lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 500
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * Specifies the number of ads to skip in the result set before returning the first ad in the paginated response.  &lt;p&gt;Combine &lt;b&gt;offset&lt;/b&gt; with the &lt;b&gt;limit&lt;/b&gt; query parameter to control the items returned in the response. For example, if you supply an &lt;b&gt;offset&lt;/b&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;b&gt;limit&lt;/b&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 items from the complete list of items retrieved by the call. If &lt;b&gt;offset&lt;/b&gt; is &lt;code&gt;10&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is &lt;code&gt;20&lt;/code&gt;, the first page of the response contains items 11-30 from the complete result set.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Default:&lt;/b&gt; 0&lt;/p&gt;
         */
        @jakarta.annotation.Nullable
        public String offset;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("filter", filter);
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public PostQueryParameters queryParameters = new PostQueryParameters();
    }
}
