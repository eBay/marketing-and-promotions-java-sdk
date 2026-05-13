package com.ebay.marketingandpromotions.generated.marketing.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the fields in a report task.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReportTask implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A list of IDs for the campaigns that are included in the report. A campaign ID is a unique eBay-assigned identifier of the campaign that&apos;s generated when the campaign is created.&lt;br /&gt;&lt;br /&gt;Call &lt;b&gt;getCampaigns&lt;/b&gt; to return the current campaign IDs for a seller.
     */
    private java.util.List<String> campaignIds;
    /**
     * The channel for the advertising campaign that will be included in the report task. This value indicates whether the data included in the report task is for an Onsite or Offsite advertising campaign.
     */
    private java.util.List<String> channels;
    /**
     * The date defining the start of the timespan covered by the report, formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; timestamp.
     */
    private String dateFrom;
    /**
     * The date defining the end of the timespan covered by the report, formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; timestamp.
     */
    private String dateTo;
    /**
     * A list containing the dimension in the report.
     */
    private java.util.List<Dimension> dimensions;
    /**
     * The funding model for the campaign that shall be included in the report.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; The default funding model for Promoted Listings reports is &lt;code&gt;COST_PER_SALE&lt;/code&gt;.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;COST_PER_SALE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;COST_PER_CLICK&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     */
    private java.util.List<String> fundingModels;
    /**
     * If supplied in the request, this field returns a list of the seller&apos;s inventory reference IDs included in the report.  &lt;p&gt;Each item is referenced by a pair of &lt;b&gt;inventoryRefernceID&lt;/b&gt; and &lt;b&gt;inventoryReferenceType&lt;/b&gt; values, where an inventory reference ID can be either a seller-defined &lt;b&gt;SKU&lt;/b&gt; value or an &lt;b&gt;inventoryItemGroupKey&lt;/b&gt;. An &lt;b&gt;inventoryItemGroupKey&lt;/b&gt; is seller-defined ID for an inventory item group (a multiple-variation listing), and is created and used by the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot;&gt;Inventory API&lt;/a&gt;.&lt;/p&gt;
     */
    private java.util.List<InventoryReference> inventoryReferences;
    /**
     * If supplied in the request, this field returns a list of the listing IDs included in the report. A listing ID is an eBay-assigned ID that&apos;s generated when a listing is created.
     */
    private java.util.List<String> listingIds;
    /**
     * The ID of the eBay marketplace used by the report task. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/ba:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String marketplaceId;
    /**
     * A list of metrics for the report task.
     */
    private java.util.List<String> metricKeys;
    /**
     * The date after which the report is no longer be available. Reports are available for 30 days and you cannot download a report after it has expired.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format (UTC): &lt;/b&gt; yyyy-MM-ddThh:mm:ss.sssZ
     */
    private String reportExpirationDate;
    /**
     * Indicates the format of the report. Currently, only &lt;code&gt;TSV_GZIP&lt;/code&gt; is supported. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/plr:ReportFormatEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String reportFormat;
    /**
     * The URL of the generated report, which can be used to download the report once it has been generated.
     */
    private String reportHref;
    /**
     * A unique eBay-assigned ID for the report.
     */
    private String reportId;
    /**
     * An eBay-assigned name for the report that&apos;s created by the &lt;b&gt;createReportTask&lt;/b&gt; call. This name is unique for the seller.
     */
    private String reportName;
    /**
     * The date the report task completed the report generation.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format (UTC): &lt;/b&gt; yyyy-MM-ddThh:mm:ss.sssZ
     */
    private String reportTaskCompletionDate;
    /**
     * The date the report task was created.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format (UTC): &lt;/b&gt; yyyy-MM-ddThh:mm:ss.sssZ
     */
    private String reportTaskCreationDate;
    /**
     * The date the report task is expected to complete the report generation.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format (UTC): &lt;/b&gt; yyyy-MM-ddThh:mm:ss.sssZ
     */
    private String reportTaskExpectedCompletionDate;
    /**
     * The unique eBay-assigned ID of the report task. This value is generated when the report task is created with a call to &lt;b&gt;createReportTask&lt;/b&gt;.
     */
    private String reportTaskId;
    /**
     * Indicates the current state of the report task. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/plr:TaskStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String reportTaskStatus;
    /**
     * A status message with additional information about the report task.
     */
    private String reportTaskStatusMessage;
    /**
     * Indicates type of report associated with the report task.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; INVENTORY_PERFORMANCE_REPORT is not currently available; availability date is pending.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/plr:ReportTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String reportType;
    /**
     * Instantiates a new {@link ReportTask} and sets the default values.
     */
    public ReportTask() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ReportTask}
     */
    @jakarta.annotation.Nonnull
    public static ReportTask createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReportTask();
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
     * Gets the campaignIds property value. A list of IDs for the campaigns that are included in the report. A campaign ID is a unique eBay-assigned identifier of the campaign that&apos;s generated when the campaign is created.&lt;br /&gt;&lt;br /&gt;Call &lt;b&gt;getCampaigns&lt;/b&gt; to return the current campaign IDs for a seller.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCampaignIds() {
        return this.campaignIds;
    }
    /**
     * Gets the channels property value. The channel for the advertising campaign that will be included in the report task. This value indicates whether the data included in the report task is for an Onsite or Offsite advertising campaign.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getChannels() {
        return this.channels;
    }
    /**
     * Gets the dateFrom property value. The date defining the start of the timespan covered by the report, formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; timestamp.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDateFrom() {
        return this.dateFrom;
    }
    /**
     * Gets the dateTo property value. The date defining the end of the timespan covered by the report, formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; timestamp.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDateTo() {
        return this.dateTo;
    }
    /**
     * Gets the dimensions property value. A list containing the dimension in the report.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(22);
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
        deserializerMap.put("reportExpirationDate", (n) -> { this.setReportExpirationDate(n.getStringValue()); });
        deserializerMap.put("reportFormat", (n) -> { this.setReportFormat(n.getStringValue()); });
        deserializerMap.put("reportHref", (n) -> { this.setReportHref(n.getStringValue()); });
        deserializerMap.put("reportId", (n) -> { this.setReportId(n.getStringValue()); });
        deserializerMap.put("reportName", (n) -> { this.setReportName(n.getStringValue()); });
        deserializerMap.put("reportTaskCompletionDate", (n) -> { this.setReportTaskCompletionDate(n.getStringValue()); });
        deserializerMap.put("reportTaskCreationDate", (n) -> { this.setReportTaskCreationDate(n.getStringValue()); });
        deserializerMap.put("reportTaskExpectedCompletionDate", (n) -> { this.setReportTaskExpectedCompletionDate(n.getStringValue()); });
        deserializerMap.put("reportTaskId", (n) -> { this.setReportTaskId(n.getStringValue()); });
        deserializerMap.put("reportTaskStatus", (n) -> { this.setReportTaskStatus(n.getStringValue()); });
        deserializerMap.put("reportTaskStatusMessage", (n) -> { this.setReportTaskStatusMessage(n.getStringValue()); });
        deserializerMap.put("reportType", (n) -> { this.setReportType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fundingModels property value. The funding model for the campaign that shall be included in the report.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; The default funding model for Promoted Listings reports is &lt;code&gt;COST_PER_SALE&lt;/code&gt;.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;COST_PER_SALE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;COST_PER_CLICK&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getFundingModels() {
        return this.fundingModels;
    }
    /**
     * Gets the inventoryReferences property value. If supplied in the request, this field returns a list of the seller&apos;s inventory reference IDs included in the report.  &lt;p&gt;Each item is referenced by a pair of &lt;b&gt;inventoryRefernceID&lt;/b&gt; and &lt;b&gt;inventoryReferenceType&lt;/b&gt; values, where an inventory reference ID can be either a seller-defined &lt;b&gt;SKU&lt;/b&gt; value or an &lt;b&gt;inventoryItemGroupKey&lt;/b&gt;. An &lt;b&gt;inventoryItemGroupKey&lt;/b&gt; is seller-defined ID for an inventory item group (a multiple-variation listing), and is created and used by the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot;&gt;Inventory API&lt;/a&gt;.&lt;/p&gt;
     * @return a {@link java.util.List<InventoryReference>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<InventoryReference> getInventoryReferences() {
        return this.inventoryReferences;
    }
    /**
     * Gets the listingIds property value. If supplied in the request, this field returns a list of the listing IDs included in the report. A listing ID is an eBay-assigned ID that&apos;s generated when a listing is created.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getListingIds() {
        return this.listingIds;
    }
    /**
     * Gets the marketplaceId property value. The ID of the eBay marketplace used by the report task. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/ba:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMarketplaceId() {
        return this.marketplaceId;
    }
    /**
     * Gets the metricKeys property value. A list of metrics for the report task.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMetricKeys() {
        return this.metricKeys;
    }
    /**
     * Gets the reportExpirationDate property value. The date after which the report is no longer be available. Reports are available for 30 days and you cannot download a report after it has expired.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format (UTC): &lt;/b&gt; yyyy-MM-ddThh:mm:ss.sssZ
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReportExpirationDate() {
        return this.reportExpirationDate;
    }
    /**
     * Gets the reportFormat property value. Indicates the format of the report. Currently, only &lt;code&gt;TSV_GZIP&lt;/code&gt; is supported. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/plr:ReportFormatEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReportFormat() {
        return this.reportFormat;
    }
    /**
     * Gets the reportHref property value. The URL of the generated report, which can be used to download the report once it has been generated.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReportHref() {
        return this.reportHref;
    }
    /**
     * Gets the reportId property value. A unique eBay-assigned ID for the report.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReportId() {
        return this.reportId;
    }
    /**
     * Gets the reportName property value. An eBay-assigned name for the report that&apos;s created by the &lt;b&gt;createReportTask&lt;/b&gt; call. This name is unique for the seller.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReportName() {
        return this.reportName;
    }
    /**
     * Gets the reportTaskCompletionDate property value. The date the report task completed the report generation.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format (UTC): &lt;/b&gt; yyyy-MM-ddThh:mm:ss.sssZ
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReportTaskCompletionDate() {
        return this.reportTaskCompletionDate;
    }
    /**
     * Gets the reportTaskCreationDate property value. The date the report task was created.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format (UTC): &lt;/b&gt; yyyy-MM-ddThh:mm:ss.sssZ
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReportTaskCreationDate() {
        return this.reportTaskCreationDate;
    }
    /**
     * Gets the reportTaskExpectedCompletionDate property value. The date the report task is expected to complete the report generation.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format (UTC): &lt;/b&gt; yyyy-MM-ddThh:mm:ss.sssZ
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReportTaskExpectedCompletionDate() {
        return this.reportTaskExpectedCompletionDate;
    }
    /**
     * Gets the reportTaskId property value. The unique eBay-assigned ID of the report task. This value is generated when the report task is created with a call to &lt;b&gt;createReportTask&lt;/b&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReportTaskId() {
        return this.reportTaskId;
    }
    /**
     * Gets the reportTaskStatus property value. Indicates the current state of the report task. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/plr:TaskStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReportTaskStatus() {
        return this.reportTaskStatus;
    }
    /**
     * Gets the reportTaskStatusMessage property value. A status message with additional information about the report task.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReportTaskStatusMessage() {
        return this.reportTaskStatusMessage;
    }
    /**
     * Gets the reportType property value. Indicates type of report associated with the report task.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; INVENTORY_PERFORMANCE_REPORT is not currently available; availability date is pending.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/plr:ReportTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
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
        writer.writeStringValue("reportExpirationDate", this.getReportExpirationDate());
        writer.writeStringValue("reportFormat", this.getReportFormat());
        writer.writeStringValue("reportHref", this.getReportHref());
        writer.writeStringValue("reportId", this.getReportId());
        writer.writeStringValue("reportName", this.getReportName());
        writer.writeStringValue("reportTaskCompletionDate", this.getReportTaskCompletionDate());
        writer.writeStringValue("reportTaskCreationDate", this.getReportTaskCreationDate());
        writer.writeStringValue("reportTaskExpectedCompletionDate", this.getReportTaskExpectedCompletionDate());
        writer.writeStringValue("reportTaskId", this.getReportTaskId());
        writer.writeStringValue("reportTaskStatus", this.getReportTaskStatus());
        writer.writeStringValue("reportTaskStatusMessage", this.getReportTaskStatusMessage());
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
     * Sets the campaignIds property value. A list of IDs for the campaigns that are included in the report. A campaign ID is a unique eBay-assigned identifier of the campaign that&apos;s generated when the campaign is created.&lt;br /&gt;&lt;br /&gt;Call &lt;b&gt;getCampaigns&lt;/b&gt; to return the current campaign IDs for a seller.
     * @param value Value to set for the campaignIds property.
     */
    public void setCampaignIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.campaignIds = value;
    }
    /**
     * Sets the channels property value. The channel for the advertising campaign that will be included in the report task. This value indicates whether the data included in the report task is for an Onsite or Offsite advertising campaign.
     * @param value Value to set for the channels property.
     */
    public void setChannels(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.channels = value;
    }
    /**
     * Sets the dateFrom property value. The date defining the start of the timespan covered by the report, formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; timestamp.
     * @param value Value to set for the dateFrom property.
     */
    public void setDateFrom(@jakarta.annotation.Nullable final String value) {
        this.dateFrom = value;
    }
    /**
     * Sets the dateTo property value. The date defining the end of the timespan covered by the report, formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; timestamp.
     * @param value Value to set for the dateTo property.
     */
    public void setDateTo(@jakarta.annotation.Nullable final String value) {
        this.dateTo = value;
    }
    /**
     * Sets the dimensions property value. A list containing the dimension in the report.
     * @param value Value to set for the dimensions property.
     */
    public void setDimensions(@jakarta.annotation.Nullable final java.util.List<Dimension> value) {
        this.dimensions = value;
    }
    /**
     * Sets the fundingModels property value. The funding model for the campaign that shall be included in the report.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; The default funding model for Promoted Listings reports is &lt;code&gt;COST_PER_SALE&lt;/code&gt;.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;COST_PER_SALE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;COST_PER_CLICK&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the fundingModels property.
     */
    public void setFundingModels(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.fundingModels = value;
    }
    /**
     * Sets the inventoryReferences property value. If supplied in the request, this field returns a list of the seller&apos;s inventory reference IDs included in the report.  &lt;p&gt;Each item is referenced by a pair of &lt;b&gt;inventoryRefernceID&lt;/b&gt; and &lt;b&gt;inventoryReferenceType&lt;/b&gt; values, where an inventory reference ID can be either a seller-defined &lt;b&gt;SKU&lt;/b&gt; value or an &lt;b&gt;inventoryItemGroupKey&lt;/b&gt;. An &lt;b&gt;inventoryItemGroupKey&lt;/b&gt; is seller-defined ID for an inventory item group (a multiple-variation listing), and is created and used by the &lt;a href=&quot;/api-docs/sell/inventory/resources/methods&quot;&gt;Inventory API&lt;/a&gt;.&lt;/p&gt;
     * @param value Value to set for the inventoryReferences property.
     */
    public void setInventoryReferences(@jakarta.annotation.Nullable final java.util.List<InventoryReference> value) {
        this.inventoryReferences = value;
    }
    /**
     * Sets the listingIds property value. If supplied in the request, this field returns a list of the listing IDs included in the report. A listing ID is an eBay-assigned ID that&apos;s generated when a listing is created.
     * @param value Value to set for the listingIds property.
     */
    public void setListingIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.listingIds = value;
    }
    /**
     * Sets the marketplaceId property value. The ID of the eBay marketplace used by the report task. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/ba:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the marketplaceId property.
     */
    public void setMarketplaceId(@jakarta.annotation.Nullable final String value) {
        this.marketplaceId = value;
    }
    /**
     * Sets the metricKeys property value. A list of metrics for the report task.
     * @param value Value to set for the metricKeys property.
     */
    public void setMetricKeys(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.metricKeys = value;
    }
    /**
     * Sets the reportExpirationDate property value. The date after which the report is no longer be available. Reports are available for 30 days and you cannot download a report after it has expired.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format (UTC): &lt;/b&gt; yyyy-MM-ddThh:mm:ss.sssZ
     * @param value Value to set for the reportExpirationDate property.
     */
    public void setReportExpirationDate(@jakarta.annotation.Nullable final String value) {
        this.reportExpirationDate = value;
    }
    /**
     * Sets the reportFormat property value. Indicates the format of the report. Currently, only &lt;code&gt;TSV_GZIP&lt;/code&gt; is supported. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/plr:ReportFormatEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the reportFormat property.
     */
    public void setReportFormat(@jakarta.annotation.Nullable final String value) {
        this.reportFormat = value;
    }
    /**
     * Sets the reportHref property value. The URL of the generated report, which can be used to download the report once it has been generated.
     * @param value Value to set for the reportHref property.
     */
    public void setReportHref(@jakarta.annotation.Nullable final String value) {
        this.reportHref = value;
    }
    /**
     * Sets the reportId property value. A unique eBay-assigned ID for the report.
     * @param value Value to set for the reportId property.
     */
    public void setReportId(@jakarta.annotation.Nullable final String value) {
        this.reportId = value;
    }
    /**
     * Sets the reportName property value. An eBay-assigned name for the report that&apos;s created by the &lt;b&gt;createReportTask&lt;/b&gt; call. This name is unique for the seller.
     * @param value Value to set for the reportName property.
     */
    public void setReportName(@jakarta.annotation.Nullable final String value) {
        this.reportName = value;
    }
    /**
     * Sets the reportTaskCompletionDate property value. The date the report task completed the report generation.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format (UTC): &lt;/b&gt; yyyy-MM-ddThh:mm:ss.sssZ
     * @param value Value to set for the reportTaskCompletionDate property.
     */
    public void setReportTaskCompletionDate(@jakarta.annotation.Nullable final String value) {
        this.reportTaskCompletionDate = value;
    }
    /**
     * Sets the reportTaskCreationDate property value. The date the report task was created.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format (UTC): &lt;/b&gt; yyyy-MM-ddThh:mm:ss.sssZ
     * @param value Value to set for the reportTaskCreationDate property.
     */
    public void setReportTaskCreationDate(@jakarta.annotation.Nullable final String value) {
        this.reportTaskCreationDate = value;
    }
    /**
     * Sets the reportTaskExpectedCompletionDate property value. The date the report task is expected to complete the report generation.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Format (UTC): &lt;/b&gt; yyyy-MM-ddThh:mm:ss.sssZ
     * @param value Value to set for the reportTaskExpectedCompletionDate property.
     */
    public void setReportTaskExpectedCompletionDate(@jakarta.annotation.Nullable final String value) {
        this.reportTaskExpectedCompletionDate = value;
    }
    /**
     * Sets the reportTaskId property value. The unique eBay-assigned ID of the report task. This value is generated when the report task is created with a call to &lt;b&gt;createReportTask&lt;/b&gt;.
     * @param value Value to set for the reportTaskId property.
     */
    public void setReportTaskId(@jakarta.annotation.Nullable final String value) {
        this.reportTaskId = value;
    }
    /**
     * Sets the reportTaskStatus property value. Indicates the current state of the report task. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/plr:TaskStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the reportTaskStatus property.
     */
    public void setReportTaskStatus(@jakarta.annotation.Nullable final String value) {
        this.reportTaskStatus = value;
    }
    /**
     * Sets the reportTaskStatusMessage property value. A status message with additional information about the report task.
     * @param value Value to set for the reportTaskStatusMessage property.
     */
    public void setReportTaskStatusMessage(@jakarta.annotation.Nullable final String value) {
        this.reportTaskStatusMessage = value;
    }
    /**
     * Sets the reportType property value. Indicates type of report associated with the report task.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; INVENTORY_PERFORMANCE_REPORT is not currently available; availability date is pending.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/marketing/types/plr:ReportTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the reportType property.
     */
    public void setReportType(@jakarta.annotation.Nullable final String value) {
        this.reportType = value;
    }
}
