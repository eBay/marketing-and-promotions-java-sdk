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

package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the rules that govern the generation of a report task and the criteria that&apos;s used to create the report. The report-generation rules include the starting and ending dates for the report. Report-task criteria includes the report dimensions, metrics, listings covered in the report, and so on. For information on the required and optional fields for each report type, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-reports.html&quot;&gt;Promoted Listings reporting&lt;/a&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateReportTask implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A list of additional records that shall be included in the report, such as non-performing data.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; Additional records are only applicable to Promoted Listings priority strategy campaigns that use the Cost Per Click (CPC) funding model.&lt;/span&gt;&lt;br /&gt;&lt;b&gt;Valid Value:&lt;/b&gt; &lt;code&gt;NON_PERFORMING_DATA&lt;/code&gt;
     */
    private java.util.List<String> additionalRecords;
    /**
     * A list of campaign IDs to be included in the report task. Use the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot; target=&quot;_blank&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of the current campaign IDs for a seller.&lt;br /&gt;&lt;br /&gt;For general campaign strategy sellers, this field is required if the &lt;b&gt;reportType&lt;/b&gt; is set to &lt;code&gt;CAMPAIGN_PERFORMANCE_REPORT&lt;/code&gt; or &lt;code&gt;CAMPAIGN_PERFORMANCE_SUMMARY_REPORT&lt;/code&gt;.&lt;br /&gt;&lt;br /&gt;For priority strategy campaign sellers, leave this request field blank to retrieve the details for all campaigns associated with your account, or specify the campaign IDs for which you would like to retrieve the campaign-specific details.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; There is a maximum data limit that cannot be exceeded when generating reports. If this threshold is exceeded, the report will fail. Refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-reports.html#creation&quot;&gt;Promoted Listings reporting&lt;/a&gt; in the Selling Integration Guide for details.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum:&lt;/b&gt; 1,000 IDs&lt;/li&gt;&lt;/ul&gt;
     */
    private java.util.List<String> campaignIds;
    /**
     * The channel for the advertising campaign that will be included in the report task. This value indicates whether the data included in the report task is for an Onsite or Offsite advertising campaign.&lt;br&gt;&lt;br&gt;If no value is entered, this field will default to &lt;code&gt;ON_SITE&lt;/code&gt;. Multiple channels are not supported.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Channels are only applicable for campaigns that use the Cost Per Click (CPC) funding model.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Valid Values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt; &lt;code&gt;ON_SITE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;OFF_SITE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;This field is required and must be set to &lt;code&gt;OFF_SITE&lt;/code&gt; if the report is for a Offsite Ads campaign.
     */
    private java.util.List<String> channels;
    /**
     * The date defining the start of the timespan covered by the report.&lt;br /&gt;&lt;br /&gt;Format the timestamp as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock with local offset.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; The date specified cannot be a future date.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2021-03-15T13:00:00-07:00&lt;/code&gt;
     */
    private String dateFrom;
    /**
     * The date defining the end of the timespan covered by the report.&lt;br /&gt;&lt;br /&gt;As with the &lt;b&gt;dateFrom&lt;/b&gt; field, format the timestamp as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; The date specified cannot be a future date. Additionally, the time specified must be a later time than that specified in the &lt;b&gt;dateFrom&lt;/b&gt; field.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2021-03-17T13:00:00-07:00&lt;/code&gt;
     */
    private String dateTo;
    /**
     * The list of the dimensions applied to the report.  &lt;p&gt;A dimension is an attribute to which the report data applies. For example, if you set &lt;b&gt;dimensionKey&lt;/b&gt; to &lt;code&gt;campaign_id&lt;/code&gt; in a Campaign Performance Report, the data will apply to the entire ad campaign. For information on the dimensions and how to specify them, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-reports.html&quot;&gt;Promoted Listings reporting&lt;/a&gt;.&lt;/p&gt;
     */
    private java.util.List<Dimension> dimensions;
    /**
     * The funding model for the campaign that shall be included in the report.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; The default funding model for Promoted Listings reports is &lt;code&gt;COST_PER_SALE&lt;/code&gt;.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; Multiple value support for the &lt;b&gt;fundingModels&lt;/b&gt; array has been deprecated. See &lt;a href =&quot;/develop/apis/api-deprecation-status &quot;&gt;API&amp;nbsp;Deprecation&amp;nbsp;Status&lt;/a&gt; for information.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;COST_PER_SALE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;COST_PER_CLICK&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;&lt;i&gt;Required if&lt;/i&gt; the campaign funding model is Cost Per Click (CPC).
     */
    private java.util.List<String> fundingModels;
    /**
     * You can use this field to supply an array of items to include in the report if you manage your inventory with the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot;&gt;Inventory API&lt;/a&gt;.  &lt;br&gt;&lt;br&gt;This field is mutually exclusive with the &lt;b&gt;listingIds&lt;/b&gt; field; if you populate this field, &lt;i&gt;do not&lt;/i&gt; populate the &lt;b&gt;listingIds&lt;/b&gt; field.  &lt;br&gt;&lt;br&gt;An inventory reference identifies an item in your inventory using a pair of values, where the &lt;b&gt;inventoryReferenceId&lt;/b&gt; can be either a seller-defined &lt;b&gt;SKU&lt;/b&gt; value or an &lt;b&gt;inventoryItemGroupKey&lt;/b&gt;, where an &lt;b&gt;inventoryItemGroupKey&lt;/b&gt; is seller-defined ID for an inventory item group (a multiple-variation listing). &lt;br&gt;&lt;br&gt;Couple the &lt;b&gt;inventoryReferenceId&lt;/b&gt; with an &lt;b&gt;inventoryReferenceType&lt;/b&gt; identifier to fully identify an item in your inventory.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum: &lt;/b&gt; 500 items &lt;br&gt;&lt;br&gt;&lt;i&gt;Required if &lt;/i&gt; you do not supply an array of &lt;b&gt;listingId&lt;/b&gt; values or if you set &lt;b&gt;reportType&lt;/b&gt; to &lt;code&gt;INVENTORY_PERFORMANCE_REPORT&lt;/code&gt;.
     */
    private java.util.List<InventoryReference> inventoryReferences;
    /**
     * Use this field to supply an array of eBay listing IDs you want to include in the report.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#FF0000&quot;&gt;&lt;strong&gt;Important:&lt;/strong&gt;&lt;/span&gt; This field is mutually exclusive with the &lt;b&gt;inventoryReferences&lt;/b&gt; field; if you populate this field, &lt;i&gt;do not&lt;/i&gt; populate the &lt;b&gt;inventoryReferences&lt;/b&gt; field.&lt;/span&gt;&lt;br /&gt;For general campaign strategy sellers, this field is required if you do not supply an array of &lt;b&gt;inventoryReferences&lt;/b&gt; values or if you set the &lt;b&gt;reportType&lt;/b&gt; to &lt;code&gt;LISTING_PERFORMANCE_REPORT&lt;/code&gt;.&lt;br /&gt;&lt;br /&gt;For priority strategy campaign sellers, leave this field blank to retrieve the details for all listings associated with the specified campaign IDs (or all campaigns associated with your account, if no campaign IDs are specified), or specify the listing IDs for which you would like to retrieve the listing-specific details.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; There is a maximum data limit that cannot be exceeded when generating reports. If this threshold is exceeded, the report will fail. Refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-reports.html#creation&quot;&gt;Promoted Listings reporting&lt;/a&gt; in the Selling Integration Guide for details.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum:&lt;/b&gt; 500 listings
     */
    private java.util.List<String> listingIds;
    /**
     * The unique identifier for the eBay marketplace on which the report is based. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/ba:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String marketplaceId;
    /**
     * The list of metrics to be included in the report.  &lt;p&gt;Metrics are the quantitative measurements compiled into the report and the data returned is based on the specified dimension of the report. For example, if the dimension is &lt;code&gt;campaign&lt;/code&gt;, the metrics for &lt;b&gt;number of sales&lt;/b&gt; would be the number of sales in the campaign. However, if the dimension is &lt;code&gt;listing&lt;/code&gt;, the &lt;b&gt;number of sales&lt;/b&gt; represents the number of items sold in that listing.&lt;/p&gt;  &lt;p&gt;For information on metric keys and how to set them, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-reports.html&quot;&gt;Promoted Listings reporting&lt;/a&gt;.&lt;/p&gt;&lt;b&gt;Minimum: &lt;/b&gt; 1
     */
    private java.util.List<String> metricKeys;
    /**
     * The file format of the report. Currently, the only supported format is &lt;code&gt;TSV_GZIP&lt;/code&gt;, which is a gzip file with tab separated values. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/plr:ReportFormatEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String reportFormat;
    /**
     * The type of report to be generated, such as &lt;code&gt;ACCOUNT_PERFORMANCE_REPORT&lt;/code&gt; or &lt;code&gt;CAMPAIGN_PERFORMANCE_REPORT&lt;/code&gt;.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; INVENTORY_PERFORMANCE_REPORT is not currently available; availability date is pending.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum:&lt;/b&gt; 1 For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/plr:ReportTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String reportType;
    /**
     * Instantiates a new {@link CreateReportTask} and sets the default values.
     */
    public CreateReportTask() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateReportTask}
     */
    @jakarta.annotation.Nonnull
    public static CreateReportTask createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateReportTask();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the additionalRecords property value. A list of additional records that shall be included in the report, such as non-performing data.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; Additional records are only applicable to Promoted Listings priority strategy campaigns that use the Cost Per Click (CPC) funding model.&lt;/span&gt;&lt;br /&gt;&lt;b&gt;Valid Value:&lt;/b&gt; &lt;code&gt;NON_PERFORMING_DATA&lt;/code&gt;
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAdditionalRecords() {
        return this.additionalRecords;
    }
    /**
     * Gets the campaignIds property value. A list of campaign IDs to be included in the report task. Use the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot; target=&quot;_blank&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of the current campaign IDs for a seller.&lt;br /&gt;&lt;br /&gt;For general campaign strategy sellers, this field is required if the &lt;b&gt;reportType&lt;/b&gt; is set to &lt;code&gt;CAMPAIGN_PERFORMANCE_REPORT&lt;/code&gt; or &lt;code&gt;CAMPAIGN_PERFORMANCE_SUMMARY_REPORT&lt;/code&gt;.&lt;br /&gt;&lt;br /&gt;For priority strategy campaign sellers, leave this request field blank to retrieve the details for all campaigns associated with your account, or specify the campaign IDs for which you would like to retrieve the campaign-specific details.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; There is a maximum data limit that cannot be exceeded when generating reports. If this threshold is exceeded, the report will fail. Refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-reports.html#creation&quot;&gt;Promoted Listings reporting&lt;/a&gt; in the Selling Integration Guide for details.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum:&lt;/b&gt; 1,000 IDs&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCampaignIds() {
        return this.campaignIds;
    }
    /**
     * Gets the channels property value. The channel for the advertising campaign that will be included in the report task. This value indicates whether the data included in the report task is for an Onsite or Offsite advertising campaign.&lt;br&gt;&lt;br&gt;If no value is entered, this field will default to &lt;code&gt;ON_SITE&lt;/code&gt;. Multiple channels are not supported.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Channels are only applicable for campaigns that use the Cost Per Click (CPC) funding model.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Valid Values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt; &lt;code&gt;ON_SITE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;OFF_SITE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;This field is required and must be set to &lt;code&gt;OFF_SITE&lt;/code&gt; if the report is for a Offsite Ads campaign.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getChannels() {
        return this.channels;
    }
    /**
     * Gets the dateFrom property value. The date defining the start of the timespan covered by the report.&lt;br /&gt;&lt;br /&gt;Format the timestamp as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock with local offset.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; The date specified cannot be a future date.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2021-03-15T13:00:00-07:00&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDateFrom() {
        return this.dateFrom;
    }
    /**
     * Gets the dateTo property value. The date defining the end of the timespan covered by the report.&lt;br /&gt;&lt;br /&gt;As with the &lt;b&gt;dateFrom&lt;/b&gt; field, format the timestamp as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; The date specified cannot be a future date. Additionally, the time specified must be a later time than that specified in the &lt;b&gt;dateFrom&lt;/b&gt; field.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2021-03-17T13:00:00-07:00&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDateTo() {
        return this.dateTo;
    }
    /**
     * Gets the dimensions property value. The list of the dimensions applied to the report.  &lt;p&gt;A dimension is an attribute to which the report data applies. For example, if you set &lt;b&gt;dimensionKey&lt;/b&gt; to &lt;code&gt;campaign_id&lt;/code&gt; in a Campaign Performance Report, the data will apply to the entire ad campaign. For information on the dimensions and how to specify them, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-reports.html&quot;&gt;Promoted Listings reporting&lt;/a&gt;.&lt;/p&gt;
     * @return a {@link java.util.List<Dimension>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Dimension> getDimensions() {
        return this.dimensions;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("additionalRecords", (n) -> { this.setAdditionalRecords(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("campaignIds", (n) -> { this.setCampaignIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("channels", (n) -> { this.setChannels(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("dateFrom", (n) -> { this.setDateFrom(n.getStringValue()); });
        deserializerMap.put("dateTo", (n) -> { this.setDateTo(n.getStringValue()); });
        deserializerMap.put("dimensions", (n) -> { this.setDimensions(n.getCollectionOfObjectValues(Dimension::createFromDiscriminatorValue)); });
        deserializerMap.put("fundingModels", (n) -> { this.setFundingModels(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("inventoryReferences", (n) -> { this.setInventoryReferences(n.getCollectionOfObjectValues(InventoryReference::createFromDiscriminatorValue)); });
        deserializerMap.put("listingIds", (n) -> { this.setListingIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("marketplaceId", (n) -> { this.setMarketplaceId(n.getStringValue()); });
        deserializerMap.put("metricKeys", (n) -> { this.setMetricKeys(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("reportFormat", (n) -> { this.setReportFormat(n.getStringValue()); });
        deserializerMap.put("reportType", (n) -> { this.setReportType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fundingModels property value. The funding model for the campaign that shall be included in the report.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; The default funding model for Promoted Listings reports is &lt;code&gt;COST_PER_SALE&lt;/code&gt;.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; Multiple value support for the &lt;b&gt;fundingModels&lt;/b&gt; array has been deprecated. See &lt;a href =&quot;/develop/apis/api-deprecation-status &quot;&gt;API&amp;nbsp;Deprecation&amp;nbsp;Status&lt;/a&gt; for information.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;COST_PER_SALE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;COST_PER_CLICK&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;&lt;i&gt;Required if&lt;/i&gt; the campaign funding model is Cost Per Click (CPC).
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getFundingModels() {
        return this.fundingModels;
    }
    /**
     * Gets the inventoryReferences property value. You can use this field to supply an array of items to include in the report if you manage your inventory with the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot;&gt;Inventory API&lt;/a&gt;.  &lt;br&gt;&lt;br&gt;This field is mutually exclusive with the &lt;b&gt;listingIds&lt;/b&gt; field; if you populate this field, &lt;i&gt;do not&lt;/i&gt; populate the &lt;b&gt;listingIds&lt;/b&gt; field.  &lt;br&gt;&lt;br&gt;An inventory reference identifies an item in your inventory using a pair of values, where the &lt;b&gt;inventoryReferenceId&lt;/b&gt; can be either a seller-defined &lt;b&gt;SKU&lt;/b&gt; value or an &lt;b&gt;inventoryItemGroupKey&lt;/b&gt;, where an &lt;b&gt;inventoryItemGroupKey&lt;/b&gt; is seller-defined ID for an inventory item group (a multiple-variation listing). &lt;br&gt;&lt;br&gt;Couple the &lt;b&gt;inventoryReferenceId&lt;/b&gt; with an &lt;b&gt;inventoryReferenceType&lt;/b&gt; identifier to fully identify an item in your inventory.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum: &lt;/b&gt; 500 items &lt;br&gt;&lt;br&gt;&lt;i&gt;Required if &lt;/i&gt; you do not supply an array of &lt;b&gt;listingId&lt;/b&gt; values or if you set &lt;b&gt;reportType&lt;/b&gt; to &lt;code&gt;INVENTORY_PERFORMANCE_REPORT&lt;/code&gt;.
     * @return a {@link java.util.List<InventoryReference>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<InventoryReference> getInventoryReferences() {
        return this.inventoryReferences;
    }
    /**
     * Gets the listingIds property value. Use this field to supply an array of eBay listing IDs you want to include in the report.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#FF0000&quot;&gt;&lt;strong&gt;Important:&lt;/strong&gt;&lt;/span&gt; This field is mutually exclusive with the &lt;b&gt;inventoryReferences&lt;/b&gt; field; if you populate this field, &lt;i&gt;do not&lt;/i&gt; populate the &lt;b&gt;inventoryReferences&lt;/b&gt; field.&lt;/span&gt;&lt;br /&gt;For general campaign strategy sellers, this field is required if you do not supply an array of &lt;b&gt;inventoryReferences&lt;/b&gt; values or if you set the &lt;b&gt;reportType&lt;/b&gt; to &lt;code&gt;LISTING_PERFORMANCE_REPORT&lt;/code&gt;.&lt;br /&gt;&lt;br /&gt;For priority strategy campaign sellers, leave this field blank to retrieve the details for all listings associated with the specified campaign IDs (or all campaigns associated with your account, if no campaign IDs are specified), or specify the listing IDs for which you would like to retrieve the listing-specific details.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; There is a maximum data limit that cannot be exceeded when generating reports. If this threshold is exceeded, the report will fail. Refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-reports.html#creation&quot;&gt;Promoted Listings reporting&lt;/a&gt; in the Selling Integration Guide for details.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum:&lt;/b&gt; 500 listings
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getListingIds() {
        return this.listingIds;
    }
    /**
     * Gets the marketplaceId property value. The unique identifier for the eBay marketplace on which the report is based. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/ba:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMarketplaceId() {
        return this.marketplaceId;
    }
    /**
     * Gets the metricKeys property value. The list of metrics to be included in the report.  &lt;p&gt;Metrics are the quantitative measurements compiled into the report and the data returned is based on the specified dimension of the report. For example, if the dimension is &lt;code&gt;campaign&lt;/code&gt;, the metrics for &lt;b&gt;number of sales&lt;/b&gt; would be the number of sales in the campaign. However, if the dimension is &lt;code&gt;listing&lt;/code&gt;, the &lt;b&gt;number of sales&lt;/b&gt; represents the number of items sold in that listing.&lt;/p&gt;  &lt;p&gt;For information on metric keys and how to set them, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-reports.html&quot;&gt;Promoted Listings reporting&lt;/a&gt;.&lt;/p&gt;&lt;b&gt;Minimum: &lt;/b&gt; 1
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMetricKeys() {
        return this.metricKeys;
    }
    /**
     * Gets the reportFormat property value. The file format of the report. Currently, the only supported format is &lt;code&gt;TSV_GZIP&lt;/code&gt;, which is a gzip file with tab separated values. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/plr:ReportFormatEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReportFormat() {
        return this.reportFormat;
    }
    /**
     * Gets the reportType property value. The type of report to be generated, such as &lt;code&gt;ACCOUNT_PERFORMANCE_REPORT&lt;/code&gt; or &lt;code&gt;CAMPAIGN_PERFORMANCE_REPORT&lt;/code&gt;.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; INVENTORY_PERFORMANCE_REPORT is not currently available; availability date is pending.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum:&lt;/b&gt; 1 For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/plr:ReportTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReportType() {
        return this.reportType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("additionalRecords", this.getAdditionalRecords());
        writer.writeCollectionOfPrimitiveValues("campaignIds", this.getCampaignIds());
        writer.writeCollectionOfPrimitiveValues("channels", this.getChannels());
        writer.writeStringValue("dateFrom", this.getDateFrom());
        writer.writeStringValue("dateTo", this.getDateTo());
        writer.writeCollectionOfObjectValues("dimensions", this.getDimensions());
        writer.writeCollectionOfPrimitiveValues("fundingModels", this.getFundingModels());
        writer.writeCollectionOfObjectValues("inventoryReferences", this.getInventoryReferences());
        writer.writeCollectionOfPrimitiveValues("listingIds", this.getListingIds());
        writer.writeStringValue("marketplaceId", this.getMarketplaceId());
        writer.writeCollectionOfPrimitiveValues("metricKeys", this.getMetricKeys());
        writer.writeStringValue("reportFormat", this.getReportFormat());
        writer.writeStringValue("reportType", this.getReportType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the additionalRecords property value. A list of additional records that shall be included in the report, such as non-performing data.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; Additional records are only applicable to Promoted Listings priority strategy campaigns that use the Cost Per Click (CPC) funding model.&lt;/span&gt;&lt;br /&gt;&lt;b&gt;Valid Value:&lt;/b&gt; &lt;code&gt;NON_PERFORMING_DATA&lt;/code&gt;
     * @param value Value to set for the additionalRecords property.
     */
    public void setAdditionalRecords(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.additionalRecords = value;
    }
    /**
     * Sets the campaignIds property value. A list of campaign IDs to be included in the report task. Use the &lt;a href=&quot;/api-docs/sell/marketing/resources/campaign/methods/getCampaigns&quot; target=&quot;_blank&quot;&gt;getCampaigns&lt;/a&gt; method to retrieve a list of the current campaign IDs for a seller.&lt;br /&gt;&lt;br /&gt;For general campaign strategy sellers, this field is required if the &lt;b&gt;reportType&lt;/b&gt; is set to &lt;code&gt;CAMPAIGN_PERFORMANCE_REPORT&lt;/code&gt; or &lt;code&gt;CAMPAIGN_PERFORMANCE_SUMMARY_REPORT&lt;/code&gt;.&lt;br /&gt;&lt;br /&gt;For priority strategy campaign sellers, leave this request field blank to retrieve the details for all campaigns associated with your account, or specify the campaign IDs for which you would like to retrieve the campaign-specific details.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; There is a maximum data limit that cannot be exceeded when generating reports. If this threshold is exceeded, the report will fail. Refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-reports.html#creation&quot;&gt;Promoted Listings reporting&lt;/a&gt; in the Selling Integration Guide for details.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum:&lt;/b&gt; 1,000 IDs&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the campaignIds property.
     */
    public void setCampaignIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.campaignIds = value;
    }
    /**
     * Sets the channels property value. The channel for the advertising campaign that will be included in the report task. This value indicates whether the data included in the report task is for an Onsite or Offsite advertising campaign.&lt;br&gt;&lt;br&gt;If no value is entered, this field will default to &lt;code&gt;ON_SITE&lt;/code&gt;. Multiple channels are not supported.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Channels are only applicable for campaigns that use the Cost Per Click (CPC) funding model.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Valid Values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt; &lt;code&gt;ON_SITE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;OFF_SITE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;This field is required and must be set to &lt;code&gt;OFF_SITE&lt;/code&gt; if the report is for a Offsite Ads campaign.
     * @param value Value to set for the channels property.
     */
    public void setChannels(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.channels = value;
    }
    /**
     * Sets the dateFrom property value. The date defining the start of the timespan covered by the report.&lt;br /&gt;&lt;br /&gt;Format the timestamp as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock with local offset.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; The date specified cannot be a future date.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2021-03-15T13:00:00-07:00&lt;/code&gt;
     * @param value Value to set for the dateFrom property.
     */
    public void setDateFrom(@jakarta.annotation.Nullable final String value) {
        this.dateFrom = value;
    }
    /**
     * Sets the dateTo property value. The date defining the end of the timespan covered by the report.&lt;br /&gt;&lt;br /&gt;As with the &lt;b&gt;dateFrom&lt;/b&gt; field, format the timestamp as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; The date specified cannot be a future date. Additionally, the time specified must be a later time than that specified in the &lt;b&gt;dateFrom&lt;/b&gt; field.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2021-03-17T13:00:00-07:00&lt;/code&gt;
     * @param value Value to set for the dateTo property.
     */
    public void setDateTo(@jakarta.annotation.Nullable final String value) {
        this.dateTo = value;
    }
    /**
     * Sets the dimensions property value. The list of the dimensions applied to the report.  &lt;p&gt;A dimension is an attribute to which the report data applies. For example, if you set &lt;b&gt;dimensionKey&lt;/b&gt; to &lt;code&gt;campaign_id&lt;/code&gt; in a Campaign Performance Report, the data will apply to the entire ad campaign. For information on the dimensions and how to specify them, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-reports.html&quot;&gt;Promoted Listings reporting&lt;/a&gt;.&lt;/p&gt;
     * @param value Value to set for the dimensions property.
     */
    public void setDimensions(@jakarta.annotation.Nullable final java.util.List<Dimension> value) {
        this.dimensions = value;
    }
    /**
     * Sets the fundingModels property value. The funding model for the campaign that shall be included in the report.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; The default funding model for Promoted Listings reports is &lt;code&gt;COST_PER_SALE&lt;/code&gt;.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; Multiple value support for the &lt;b&gt;fundingModels&lt;/b&gt; array has been deprecated. See &lt;a href =&quot;/develop/apis/api-deprecation-status &quot;&gt;API&amp;nbsp;Deprecation&amp;nbsp;Status&lt;/a&gt; for information.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;COST_PER_SALE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;COST_PER_CLICK&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;&lt;i&gt;Required if&lt;/i&gt; the campaign funding model is Cost Per Click (CPC).
     * @param value Value to set for the fundingModels property.
     */
    public void setFundingModels(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.fundingModels = value;
    }
    /**
     * Sets the inventoryReferences property value. You can use this field to supply an array of items to include in the report if you manage your inventory with the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot;&gt;Inventory API&lt;/a&gt;.  &lt;br&gt;&lt;br&gt;This field is mutually exclusive with the &lt;b&gt;listingIds&lt;/b&gt; field; if you populate this field, &lt;i&gt;do not&lt;/i&gt; populate the &lt;b&gt;listingIds&lt;/b&gt; field.  &lt;br&gt;&lt;br&gt;An inventory reference identifies an item in your inventory using a pair of values, where the &lt;b&gt;inventoryReferenceId&lt;/b&gt; can be either a seller-defined &lt;b&gt;SKU&lt;/b&gt; value or an &lt;b&gt;inventoryItemGroupKey&lt;/b&gt;, where an &lt;b&gt;inventoryItemGroupKey&lt;/b&gt; is seller-defined ID for an inventory item group (a multiple-variation listing). &lt;br&gt;&lt;br&gt;Couple the &lt;b&gt;inventoryReferenceId&lt;/b&gt; with an &lt;b&gt;inventoryReferenceType&lt;/b&gt; identifier to fully identify an item in your inventory.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum: &lt;/b&gt; 500 items &lt;br&gt;&lt;br&gt;&lt;i&gt;Required if &lt;/i&gt; you do not supply an array of &lt;b&gt;listingId&lt;/b&gt; values or if you set &lt;b&gt;reportType&lt;/b&gt; to &lt;code&gt;INVENTORY_PERFORMANCE_REPORT&lt;/code&gt;.
     * @param value Value to set for the inventoryReferences property.
     */
    public void setInventoryReferences(@jakarta.annotation.Nullable final java.util.List<InventoryReference> value) {
        this.inventoryReferences = value;
    }
    /**
     * Sets the listingIds property value. Use this field to supply an array of eBay listing IDs you want to include in the report.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#FF0000&quot;&gt;&lt;strong&gt;Important:&lt;/strong&gt;&lt;/span&gt; This field is mutually exclusive with the &lt;b&gt;inventoryReferences&lt;/b&gt; field; if you populate this field, &lt;i&gt;do not&lt;/i&gt; populate the &lt;b&gt;inventoryReferences&lt;/b&gt; field.&lt;/span&gt;&lt;br /&gt;For general campaign strategy sellers, this field is required if you do not supply an array of &lt;b&gt;inventoryReferences&lt;/b&gt; values or if you set the &lt;b&gt;reportType&lt;/b&gt; to &lt;code&gt;LISTING_PERFORMANCE_REPORT&lt;/code&gt;.&lt;br /&gt;&lt;br /&gt;For priority strategy campaign sellers, leave this field blank to retrieve the details for all listings associated with the specified campaign IDs (or all campaigns associated with your account, if no campaign IDs are specified), or specify the listing IDs for which you would like to retrieve the listing-specific details.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; There is a maximum data limit that cannot be exceeded when generating reports. If this threshold is exceeded, the report will fail. Refer to &lt;a href=&quot;/api-docs/sell/static/marketing/pl-reports.html#creation&quot;&gt;Promoted Listings reporting&lt;/a&gt; in the Selling Integration Guide for details.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum:&lt;/b&gt; 500 listings
     * @param value Value to set for the listingIds property.
     */
    public void setListingIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.listingIds = value;
    }
    /**
     * Sets the marketplaceId property value. The unique identifier for the eBay marketplace on which the report is based. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/ba:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the marketplaceId property.
     */
    public void setMarketplaceId(@jakarta.annotation.Nullable final String value) {
        this.marketplaceId = value;
    }
    /**
     * Sets the metricKeys property value. The list of metrics to be included in the report.  &lt;p&gt;Metrics are the quantitative measurements compiled into the report and the data returned is based on the specified dimension of the report. For example, if the dimension is &lt;code&gt;campaign&lt;/code&gt;, the metrics for &lt;b&gt;number of sales&lt;/b&gt; would be the number of sales in the campaign. However, if the dimension is &lt;code&gt;listing&lt;/code&gt;, the &lt;b&gt;number of sales&lt;/b&gt; represents the number of items sold in that listing.&lt;/p&gt;  &lt;p&gt;For information on metric keys and how to set them, see &lt;a href=&quot;/api-docs/sell/static/marketing/pl-reports.html&quot;&gt;Promoted Listings reporting&lt;/a&gt;.&lt;/p&gt;&lt;b&gt;Minimum: &lt;/b&gt; 1
     * @param value Value to set for the metricKeys property.
     */
    public void setMetricKeys(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.metricKeys = value;
    }
    /**
     * Sets the reportFormat property value. The file format of the report. Currently, the only supported format is &lt;code&gt;TSV_GZIP&lt;/code&gt;, which is a gzip file with tab separated values. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/plr:ReportFormatEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the reportFormat property.
     */
    public void setReportFormat(@jakarta.annotation.Nullable final String value) {
        this.reportFormat = value;
    }
    /**
     * Sets the reportType property value. The type of report to be generated, such as &lt;code&gt;ACCOUNT_PERFORMANCE_REPORT&lt;/code&gt; or &lt;code&gt;CAMPAIGN_PERFORMANCE_REPORT&lt;/code&gt;.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; INVENTORY_PERFORMANCE_REPORT is not currently available; availability date is pending.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum:&lt;/b&gt; 1 For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/plr:ReportTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the reportType property.
     */
    public void setReportType(@jakarta.annotation.Nullable final String value) {
        this.reportType = value;
    }
}
