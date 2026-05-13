package com.ebay.marketingandpromotions.exceptions;

/**
 * Base exception for Marketing and Promotions SDK errors.
 */
public class MarketingAndPromotionsException extends RuntimeException {
    public MarketingAndPromotionsException(String message) {
        super(message);
    }

    public MarketingAndPromotionsException(String message, Throwable cause) {
        super(message, cause);
    }
}
