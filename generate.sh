#!/bin/bash
set -e
echo "Generating Marketing and Promotions Java SDK with Kiota..."
rm -rf src/main/java/com/ebay/marketingandpromotions/generated

echo "Generating Marketing API client..."
kiota generate -l java -d specs/sell_marketing_v1_oas3.yaml \
  -c MarketingApiClient -n com.ebay.marketingandpromotions.generated.marketing \
  -o src/main/java/com/ebay/marketingandpromotions/generated/marketing --ebc --co

echo "Generating Recommendation API client..."
kiota generate -l java -d specs/sell_recommendation_v1_oas3.yaml \
  -c RecommendationApiClient -n com.ebay.marketingandpromotions.generated.recommendation \
  -o src/main/java/com/ebay/marketingandpromotions/generated/recommendation --ebc --co

echo "Adding license headers to generated files..."
./add-license-headers.sh ./src

echo "Code generation complete!"
