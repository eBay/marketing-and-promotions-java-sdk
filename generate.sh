#!/usr/bin/env bash

# Copyright 2026 eBay Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

set -euo pipefail

echo "Generating Marketing and Promotions Java SDK with Kiota..."
rm -rf src/main/java/com/ebay/marketingandpromotions/generated

echo "Generating MarketingApiClient..."
kiota generate -l java -d specs/openapi/marketing.json \
  -c MarketingApiClient -n com.ebay.marketingandpromotions.generated.marketing \
  -o src/main/java/com/ebay/marketingandpromotions/generated/marketing --ebc --co

echo "Generating RecommendationApiClient..."
kiota generate -l java -d specs/openapi/recommendation.json \
  -c RecommendationApiClient -n com.ebay.marketingandpromotions.generated.recommendation \
  -o src/main/java/com/ebay/marketingandpromotions/generated/recommendation --ebc --co

echo "Adding license headers to generated files..."
./add-license-headers.sh ./src
echo "Code generation complete!"
