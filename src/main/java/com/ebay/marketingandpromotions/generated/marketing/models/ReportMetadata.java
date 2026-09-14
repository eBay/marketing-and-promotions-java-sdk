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
 * This type defines the fields included in the report.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReportMetadata implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field indicates whether a &lt;code&gt;COST_PER_CLICK&lt;/code&gt; report type is related to an &lt;code&gt;ON_SITE&lt;/code&gt; or &lt;code&gt;OFF_SITE&lt;/code&gt; Promoted Listings campaign. This field is not returned for &lt;code&gt;COST_PER_SALE&lt;/code&gt; report types since &lt;code&gt;COST_PER_SALE&lt;/code&gt; campaigns are only available &lt;code&gt;ON_SITE&lt;/code&gt;.
     */
    private ChannelEnum channel;
    /**
     * A list containing the metadata for the dimension used in the report.
     */
    private java.util.List<DimensionMetadata> dimensionMetadata;
    /**
     * The maximum number of dimensions that can be requested for the specified report type.
     */
    private Integer maxNumberOfDimensionsToRequest;
    /**
     * The maximum number of metrics that can be requested for the specified report type.
     */
    private Integer maxNumberOfMetricsToRequest;
    /**
     * A list containing the metadata for the metrics in the report.
     */
    private java.util.List<MetricMetadata> metricMetadata;
    /**
     * The &lt;b&gt;report_type&lt;/b&gt;, as specified in the request to create the report task.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; INVENTORY_PERFORMANCE_REPORT is not currently available; availability date is pending.&lt;/span&gt;
     */
    private ReportTypeEnum reportType;
    /**
     * Instantiates a new {@link ReportMetadata} and sets the default values.
     */
    public ReportMetadata() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ReportMetadata}
     */
    @jakarta.annotation.Nonnull
    public static ReportMetadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReportMetadata();
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
     * Gets the channel property value. This field indicates whether a &lt;code&gt;COST_PER_CLICK&lt;/code&gt; report type is related to an &lt;code&gt;ON_SITE&lt;/code&gt; or &lt;code&gt;OFF_SITE&lt;/code&gt; Promoted Listings campaign. This field is not returned for &lt;code&gt;COST_PER_SALE&lt;/code&gt; report types since &lt;code&gt;COST_PER_SALE&lt;/code&gt; campaigns are only available &lt;code&gt;ON_SITE&lt;/code&gt;.
     * @return a {@link ChannelEnum}
     */
    @jakarta.annotation.Nullable
    public ChannelEnum getChannel() {
        return this.channel;
    }
    /**
     * Gets the dimensionMetadata property value. A list containing the metadata for the dimension used in the report.
     * @return a {@link java.util.List<DimensionMetadata>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DimensionMetadata> getDimensionMetadata() {
        return this.dimensionMetadata;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("channel", (n) -> { this.setChannel(n.getEnumValue(ChannelEnum::forValue)); });
        deserializerMap.put("dimensionMetadata", (n) -> { this.setDimensionMetadata(n.getCollectionOfObjectValues(DimensionMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("maxNumberOfDimensionsToRequest", (n) -> { this.setMaxNumberOfDimensionsToRequest(n.getIntegerValue()); });
        deserializerMap.put("maxNumberOfMetricsToRequest", (n) -> { this.setMaxNumberOfMetricsToRequest(n.getIntegerValue()); });
        deserializerMap.put("metricMetadata", (n) -> { this.setMetricMetadata(n.getCollectionOfObjectValues(MetricMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("reportType", (n) -> { this.setReportType(n.getEnumValue(ReportTypeEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the maxNumberOfDimensionsToRequest property value. The maximum number of dimensions that can be requested for the specified report type.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaxNumberOfDimensionsToRequest() {
        return this.maxNumberOfDimensionsToRequest;
    }
    /**
     * Gets the maxNumberOfMetricsToRequest property value. The maximum number of metrics that can be requested for the specified report type.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaxNumberOfMetricsToRequest() {
        return this.maxNumberOfMetricsToRequest;
    }
    /**
     * Gets the metricMetadata property value. A list containing the metadata for the metrics in the report.
     * @return a {@link java.util.List<MetricMetadata>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MetricMetadata> getMetricMetadata() {
        return this.metricMetadata;
    }
    /**
     * Gets the reportType property value. The &lt;b&gt;report_type&lt;/b&gt;, as specified in the request to create the report task.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; INVENTORY_PERFORMANCE_REPORT is not currently available; availability date is pending.&lt;/span&gt;
     * @return a {@link ReportTypeEnum}
     */
    @jakarta.annotation.Nullable
    public ReportTypeEnum getReportType() {
        return this.reportType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("channel", this.getChannel());
        writer.writeCollectionOfObjectValues("dimensionMetadata", this.getDimensionMetadata());
        writer.writeIntegerValue("maxNumberOfDimensionsToRequest", this.getMaxNumberOfDimensionsToRequest());
        writer.writeIntegerValue("maxNumberOfMetricsToRequest", this.getMaxNumberOfMetricsToRequest());
        writer.writeCollectionOfObjectValues("metricMetadata", this.getMetricMetadata());
        writer.writeEnumValue("reportType", this.getReportType());
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
     * Sets the channel property value. This field indicates whether a &lt;code&gt;COST_PER_CLICK&lt;/code&gt; report type is related to an &lt;code&gt;ON_SITE&lt;/code&gt; or &lt;code&gt;OFF_SITE&lt;/code&gt; Promoted Listings campaign. This field is not returned for &lt;code&gt;COST_PER_SALE&lt;/code&gt; report types since &lt;code&gt;COST_PER_SALE&lt;/code&gt; campaigns are only available &lt;code&gt;ON_SITE&lt;/code&gt;.
     * @param value Value to set for the channel property.
     */
    public void setChannel(@jakarta.annotation.Nullable final ChannelEnum value) {
        this.channel = value;
    }
    /**
     * Sets the dimensionMetadata property value. A list containing the metadata for the dimension used in the report.
     * @param value Value to set for the dimensionMetadata property.
     */
    public void setDimensionMetadata(@jakarta.annotation.Nullable final java.util.List<DimensionMetadata> value) {
        this.dimensionMetadata = value;
    }
    /**
     * Sets the maxNumberOfDimensionsToRequest property value. The maximum number of dimensions that can be requested for the specified report type.
     * @param value Value to set for the maxNumberOfDimensionsToRequest property.
     */
    public void setMaxNumberOfDimensionsToRequest(@jakarta.annotation.Nullable final Integer value) {
        this.maxNumberOfDimensionsToRequest = value;
    }
    /**
     * Sets the maxNumberOfMetricsToRequest property value. The maximum number of metrics that can be requested for the specified report type.
     * @param value Value to set for the maxNumberOfMetricsToRequest property.
     */
    public void setMaxNumberOfMetricsToRequest(@jakarta.annotation.Nullable final Integer value) {
        this.maxNumberOfMetricsToRequest = value;
    }
    /**
     * Sets the metricMetadata property value. A list containing the metadata for the metrics in the report.
     * @param value Value to set for the metricMetadata property.
     */
    public void setMetricMetadata(@jakarta.annotation.Nullable final java.util.List<MetricMetadata> value) {
        this.metricMetadata = value;
    }
    /**
     * Sets the reportType property value. The &lt;b&gt;report_type&lt;/b&gt;, as specified in the request to create the report task.&lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; INVENTORY_PERFORMANCE_REPORT is not currently available; availability date is pending.&lt;/span&gt;
     * @param value Value to set for the reportType property.
     */
    public void setReportType(@jakarta.annotation.Nullable final ReportTypeEnum value) {
        this.reportType = value;
    }
}
