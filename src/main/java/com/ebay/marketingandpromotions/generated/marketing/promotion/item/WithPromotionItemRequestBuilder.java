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

package com.ebay.marketingandpromotions.generated.marketing.promotion.item;

import com.ebay.marketingandpromotions.generated.marketing.promotion.item.get_listing_set.GetListingSetRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.promotion.item.pause.PauseRequestBuilder;
import com.ebay.marketingandpromotions.generated.marketing.promotion.item.resume.ResumeRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /promotion/{promotion_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithPromotionItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The get_listing_set property
     * @return a {@link GetListingSetRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetListingSetRequestBuilder getListingSet() {
        return new GetListingSetRequestBuilder(pathParameters, requestAdapter);
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
     * Instantiates a new {@link WithPromotionItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPromotionItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/promotion/{promotion_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithPromotionItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPromotionItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/promotion/{promotion_id}", rawUrl);
    }
}
