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
 *  This type defines the email campaign instance body.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CampaignDTO implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The audiences that the email campaign is being sent to. See &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-email_campaign-getemailcampaigns.audiencetypeenum&quot;&gt;AudienceTypeEnum&lt;/a&gt; for a list of audience types.
     */
    private java.util.List<CampaignAudience> audiences;
    /**
     * The date and time that the email campaign was created, given in UTC format.
     */
    private String creationDate;
    /**
     * The unique eBay identifier for the email campaign assigned automatically when the email campaign is created.
     */
    private String emailCampaignId;
    /**
     * The email campaign status. See &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-email_campaign-getemailcampaigns.emailcampaignstatusenum&quot;&gt;EmailCampaignStatusEnum&lt;/a&gt; for information on statuses.
     */
    private EmailCampaignStatusEnum emailCampaignStatus;
    /**
     * The email campaign type. See &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-email_campaign-getemailcampaigns.campaigntypeenum&quot;&gt;CampaignTypeEnum&lt;/a&gt; for definitions of email campaign types.
     */
    private CampaignTypeEnum emailCampaignType;
    /**
     * The eBay marketplace where the email campaign is active.
     */
    private String marketplaceId;
    /**
     * The date and time the email campaign was last modified, given in UTC format.
     */
    private String modificationDate;
    /**
     * The date and time that the email campaign newsletter is scheduled to send, given in UTC format.
     */
    private String scheduleDate;
    /**
     * The schedule type used for sending the email campaign. See &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-email_campaign-getemailcampaigns.scheduledatetypeenum&quot;&gt;ScheduleDateTypeEnum&lt;/a&gt; for available schedule types.
     */
    private ScheduleDateTypeEnum scheduleDateType;
    /**
     * The date and time that the email campaign was last sent, given in UTC format.
     */
    private String sentDate;
    /**
     * The email campaign subject line..
     */
    private String subject;
    /**
     * Instantiates a new {@link CampaignDTO} and sets the default values.
     */
    public CampaignDTO() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CampaignDTO}
     */
    @jakarta.annotation.Nonnull
    public static CampaignDTO createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CampaignDTO();
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
     * Gets the audiences property value. The audiences that the email campaign is being sent to. See &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-email_campaign-getemailcampaigns.audiencetypeenum&quot;&gt;AudienceTypeEnum&lt;/a&gt; for a list of audience types.
     * @return a {@link java.util.List<CampaignAudience>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CampaignAudience> getAudiences() {
        return this.audiences;
    }
    /**
     * Gets the creationDate property value. The date and time that the email campaign was created, given in UTC format.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreationDate() {
        return this.creationDate;
    }
    /**
     * Gets the emailCampaignId property value. The unique eBay identifier for the email campaign assigned automatically when the email campaign is created.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmailCampaignId() {
        return this.emailCampaignId;
    }
    /**
     * Gets the emailCampaignStatus property value. The email campaign status. See &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-email_campaign-getemailcampaigns.emailcampaignstatusenum&quot;&gt;EmailCampaignStatusEnum&lt;/a&gt; for information on statuses.
     * @return a {@link EmailCampaignStatusEnum}
     */
    @jakarta.annotation.Nullable
    public EmailCampaignStatusEnum getEmailCampaignStatus() {
        return this.emailCampaignStatus;
    }
    /**
     * Gets the emailCampaignType property value. The email campaign type. See &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-email_campaign-getemailcampaigns.campaigntypeenum&quot;&gt;CampaignTypeEnum&lt;/a&gt; for definitions of email campaign types.
     * @return a {@link CampaignTypeEnum}
     */
    @jakarta.annotation.Nullable
    public CampaignTypeEnum getEmailCampaignType() {
        return this.emailCampaignType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("audiences", (n) -> { this.setAudiences(n.getCollectionOfObjectValues(CampaignAudience::createFromDiscriminatorValue)); });
        deserializerMap.put("creationDate", (n) -> { this.setCreationDate(n.getStringValue()); });
        deserializerMap.put("emailCampaignId", (n) -> { this.setEmailCampaignId(n.getStringValue()); });
        deserializerMap.put("emailCampaignStatus", (n) -> { this.setEmailCampaignStatus(n.getEnumValue(EmailCampaignStatusEnum::forValue)); });
        deserializerMap.put("emailCampaignType", (n) -> { this.setEmailCampaignType(n.getEnumValue(CampaignTypeEnum::forValue)); });
        deserializerMap.put("marketplaceId", (n) -> { this.setMarketplaceId(n.getStringValue()); });
        deserializerMap.put("modificationDate", (n) -> { this.setModificationDate(n.getStringValue()); });
        deserializerMap.put("scheduleDate", (n) -> { this.setScheduleDate(n.getStringValue()); });
        deserializerMap.put("scheduleDateType", (n) -> { this.setScheduleDateType(n.getEnumValue(ScheduleDateTypeEnum::forValue)); });
        deserializerMap.put("sentDate", (n) -> { this.setSentDate(n.getStringValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the marketplaceId property value. The eBay marketplace where the email campaign is active.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMarketplaceId() {
        return this.marketplaceId;
    }
    /**
     * Gets the modificationDate property value. The date and time the email campaign was last modified, given in UTC format.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getModificationDate() {
        return this.modificationDate;
    }
    /**
     * Gets the scheduleDate property value. The date and time that the email campaign newsletter is scheduled to send, given in UTC format.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScheduleDate() {
        return this.scheduleDate;
    }
    /**
     * Gets the scheduleDateType property value. The schedule type used for sending the email campaign. See &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-email_campaign-getemailcampaigns.scheduledatetypeenum&quot;&gt;ScheduleDateTypeEnum&lt;/a&gt; for available schedule types.
     * @return a {@link ScheduleDateTypeEnum}
     */
    @jakarta.annotation.Nullable
    public ScheduleDateTypeEnum getScheduleDateType() {
        return this.scheduleDateType;
    }
    /**
     * Gets the sentDate property value. The date and time that the email campaign was last sent, given in UTC format.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSentDate() {
        return this.sentDate;
    }
    /**
     * Gets the subject property value. The email campaign subject line..
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.subject;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("audiences", this.getAudiences());
        writer.writeStringValue("creationDate", this.getCreationDate());
        writer.writeStringValue("emailCampaignId", this.getEmailCampaignId());
        writer.writeEnumValue("emailCampaignStatus", this.getEmailCampaignStatus());
        writer.writeEnumValue("emailCampaignType", this.getEmailCampaignType());
        writer.writeStringValue("marketplaceId", this.getMarketplaceId());
        writer.writeStringValue("modificationDate", this.getModificationDate());
        writer.writeStringValue("scheduleDate", this.getScheduleDate());
        writer.writeEnumValue("scheduleDateType", this.getScheduleDateType());
        writer.writeStringValue("sentDate", this.getSentDate());
        writer.writeStringValue("subject", this.getSubject());
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
     * Sets the audiences property value. The audiences that the email campaign is being sent to. See &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-email_campaign-getemailcampaigns.audiencetypeenum&quot;&gt;AudienceTypeEnum&lt;/a&gt; for a list of audience types.
     * @param value Value to set for the audiences property.
     */
    public void setAudiences(@jakarta.annotation.Nullable final java.util.List<CampaignAudience> value) {
        this.audiences = value;
    }
    /**
     * Sets the creationDate property value. The date and time that the email campaign was created, given in UTC format.
     * @param value Value to set for the creationDate property.
     */
    public void setCreationDate(@jakarta.annotation.Nullable final String value) {
        this.creationDate = value;
    }
    /**
     * Sets the emailCampaignId property value. The unique eBay identifier for the email campaign assigned automatically when the email campaign is created.
     * @param value Value to set for the emailCampaignId property.
     */
    public void setEmailCampaignId(@jakarta.annotation.Nullable final String value) {
        this.emailCampaignId = value;
    }
    /**
     * Sets the emailCampaignStatus property value. The email campaign status. See &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-email_campaign-getemailcampaigns.emailcampaignstatusenum&quot;&gt;EmailCampaignStatusEnum&lt;/a&gt; for information on statuses.
     * @param value Value to set for the emailCampaignStatus property.
     */
    public void setEmailCampaignStatus(@jakarta.annotation.Nullable final EmailCampaignStatusEnum value) {
        this.emailCampaignStatus = value;
    }
    /**
     * Sets the emailCampaignType property value. The email campaign type. See &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-email_campaign-getemailcampaigns.campaigntypeenum&quot;&gt;CampaignTypeEnum&lt;/a&gt; for definitions of email campaign types.
     * @param value Value to set for the emailCampaignType property.
     */
    public void setEmailCampaignType(@jakarta.annotation.Nullable final CampaignTypeEnum value) {
        this.emailCampaignType = value;
    }
    /**
     * Sets the marketplaceId property value. The eBay marketplace where the email campaign is active.
     * @param value Value to set for the marketplaceId property.
     */
    public void setMarketplaceId(@jakarta.annotation.Nullable final String value) {
        this.marketplaceId = value;
    }
    /**
     * Sets the modificationDate property value. The date and time the email campaign was last modified, given in UTC format.
     * @param value Value to set for the modificationDate property.
     */
    public void setModificationDate(@jakarta.annotation.Nullable final String value) {
        this.modificationDate = value;
    }
    /**
     * Sets the scheduleDate property value. The date and time that the email campaign newsletter is scheduled to send, given in UTC format.
     * @param value Value to set for the scheduleDate property.
     */
    public void setScheduleDate(@jakarta.annotation.Nullable final String value) {
        this.scheduleDate = value;
    }
    /**
     * Sets the scheduleDateType property value. The schedule type used for sending the email campaign. See &lt;a href=&quot;/develop/api/sell/marketing_api#sell-marketing_api-email_campaign-getemailcampaigns.scheduledatetypeenum&quot;&gt;ScheduleDateTypeEnum&lt;/a&gt; for available schedule types.
     * @param value Value to set for the scheduleDateType property.
     */
    public void setScheduleDateType(@jakarta.annotation.Nullable final ScheduleDateTypeEnum value) {
        this.scheduleDateType = value;
    }
    /**
     * Sets the sentDate property value. The date and time that the email campaign was last sent, given in UTC format.
     * @param value Value to set for the sentDate property.
     */
    public void setSentDate(@jakarta.annotation.Nullable final String value) {
        this.sentDate = value;
    }
    /**
     * Sets the subject property value. The email campaign subject line..
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.subject = value;
    }
}
