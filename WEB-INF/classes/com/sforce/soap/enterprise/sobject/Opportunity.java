/**
 * Opportunity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Opportunity  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.Account account;

    private java.lang.String accountId;

    private com.sforce.soap.enterprise.QueryResult accountPartners;

    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private java.lang.Double amount;

    private java.lang.Boolean anonymous__c;

    private java.util.Date application_Deadline__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private com.sforce.soap.enterprise.QueryResult CKWs__r;

    private com.sforce.soap.enterprise.sobject.Campaign campaign;

    private java.lang.String campaignId;

    private java.util.Date check_Date__c;

    private java.lang.Double check_Number__c;

    private java.util.Date closeDate;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String dedication_Acknowledgement_Type__c;

    private java.lang.String dedication_Honoree_Name__c;

    private java.lang.String dedication_Personal_Note__c;

    private java.lang.String dedication_Recipient_Address__c;

    private java.lang.String dedication_Recipient_Email_Address__c;

    private java.lang.String dedication_Recipient_First_Name__c;

    private java.lang.String dedication_Recipient_Last_Name__c;

    private java.lang.String dedication_Type__c;

    private java.lang.String description;

    private com.sforce.soap.enterprise.QueryResult events;

    private java.lang.String fiscal;

    private java.lang.Integer fiscalQuarter;

    private java.lang.Integer fiscalYear;

    private java.lang.String forecastCategory;

    private java.lang.String forecastCategoryName;

    private java.lang.String fund__c;

    private java.lang.Boolean gift_Aid__c;

    private java.lang.Double gift_Aided_Amount__c;

    private java.lang.Double grant_Amount__c;

    private java.lang.Boolean hasOpportunityLineItem;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.Boolean isClosed;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean isWon;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String leadSource;

    private java.lang.Double matching_Amount__c;

    private java.util.Date matching_Close_Date__c;

    private java.lang.String matching_Status__c;

    private java.lang.Double matching__c;

    private java.util.Date membership_End_Date__c;

    private java.lang.Double membership_Length__c;

    private java.util.Date membership_Start_Date__c;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private com.sforce.soap.enterprise.QueryResult opportunityCompetitors;

    private com.sforce.soap.enterprise.QueryResult opportunityContactRoles;

    private com.sforce.soap.enterprise.QueryResult opportunityHistories;

    private com.sforce.soap.enterprise.QueryResult opportunityLineItems;

    private com.sforce.soap.enterprise.QueryResult opportunityPartnersFrom;

    private com.sforce.soap.enterprise.sobject.User owner;

    private java.lang.String ownerId;

    private com.sforce.soap.enterprise.QueryResult partners;

    private java.lang.String payment_Type__c;

    private java.lang.String pledge__c;

    private com.sforce.soap.enterprise.sobject.Pledges__c pledge__r;

    private com.sforce.soap.enterprise.sobject.Pricebook2 pricebook2;

    private java.lang.String pricebook2Id;

    private java.lang.Double probability;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String program_Designation__c;

    private com.sforce.soap.enterprise.sobject.RecordType recordType;

    private java.lang.String recordTypeId;

    private java.lang.String recurring_Donation__c;

    private com.sforce.soap.enterprise.sobject.Recurring_Donation__c recurring_Donation__r;

    private java.util.Date reporting_Deadline__c;

    private java.lang.String reporting_Requirements__c;

    private com.sforce.soap.enterprise.QueryResult shares;

    private java.lang.String stageName;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private java.lang.Double total_Amount__c;

    private java.lang.String type;

    public Opportunity() {
    }

    public Opportunity(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.Account account,
           java.lang.String accountId,
           com.sforce.soap.enterprise.QueryResult accountPartners,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           java.lang.Double amount,
           java.lang.Boolean anonymous__c,
           java.util.Date application_Deadline__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           com.sforce.soap.enterprise.QueryResult CKWs__r,
           com.sforce.soap.enterprise.sobject.Campaign campaign,
           java.lang.String campaignId,
           java.util.Date check_Date__c,
           java.lang.Double check_Number__c,
           java.util.Date closeDate,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String dedication_Acknowledgement_Type__c,
           java.lang.String dedication_Honoree_Name__c,
           java.lang.String dedication_Personal_Note__c,
           java.lang.String dedication_Recipient_Address__c,
           java.lang.String dedication_Recipient_Email_Address__c,
           java.lang.String dedication_Recipient_First_Name__c,
           java.lang.String dedication_Recipient_Last_Name__c,
           java.lang.String dedication_Type__c,
           java.lang.String description,
           com.sforce.soap.enterprise.QueryResult events,
           java.lang.String fiscal,
           java.lang.Integer fiscalQuarter,
           java.lang.Integer fiscalYear,
           java.lang.String forecastCategory,
           java.lang.String forecastCategoryName,
           java.lang.String fund__c,
           java.lang.Boolean gift_Aid__c,
           java.lang.Double gift_Aided_Amount__c,
           java.lang.Double grant_Amount__c,
           java.lang.Boolean hasOpportunityLineItem,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.Boolean isClosed,
           java.lang.Boolean isDeleted,
           java.lang.Boolean isWon,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String leadSource,
           java.lang.Double matching_Amount__c,
           java.util.Date matching_Close_Date__c,
           java.lang.String matching_Status__c,
           java.lang.Double matching__c,
           java.util.Date membership_End_Date__c,
           java.lang.Double membership_Length__c,
           java.util.Date membership_Start_Date__c,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           com.sforce.soap.enterprise.QueryResult openActivities,
           com.sforce.soap.enterprise.QueryResult opportunityCompetitors,
           com.sforce.soap.enterprise.QueryResult opportunityContactRoles,
           com.sforce.soap.enterprise.QueryResult opportunityHistories,
           com.sforce.soap.enterprise.QueryResult opportunityLineItems,
           com.sforce.soap.enterprise.QueryResult opportunityPartnersFrom,
           com.sforce.soap.enterprise.sobject.User owner,
           java.lang.String ownerId,
           com.sforce.soap.enterprise.QueryResult partners,
           java.lang.String payment_Type__c,
           java.lang.String pledge__c,
           com.sforce.soap.enterprise.sobject.Pledges__c pledge__r,
           com.sforce.soap.enterprise.sobject.Pricebook2 pricebook2,
           java.lang.String pricebook2Id,
           java.lang.Double probability,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String program_Designation__c,
           com.sforce.soap.enterprise.sobject.RecordType recordType,
           java.lang.String recordTypeId,
           java.lang.String recurring_Donation__c,
           com.sforce.soap.enterprise.sobject.Recurring_Donation__c recurring_Donation__r,
           java.util.Date reporting_Deadline__c,
           java.lang.String reporting_Requirements__c,
           com.sforce.soap.enterprise.QueryResult shares,
           java.lang.String stageName,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           java.lang.Double total_Amount__c,
           java.lang.String type) {
        super(
            fieldsToNull,
            id);
        this.account = account;
        this.accountId = accountId;
        this.accountPartners = accountPartners;
        this.activityHistories = activityHistories;
        this.amount = amount;
        this.anonymous__c = anonymous__c;
        this.application_Deadline__c = application_Deadline__c;
        this.attachments = attachments;
        this.CKWs__r = CKWs__r;
        this.campaign = campaign;
        this.campaignId = campaignId;
        this.check_Date__c = check_Date__c;
        this.check_Number__c = check_Number__c;
        this.closeDate = closeDate;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.dedication_Acknowledgement_Type__c = dedication_Acknowledgement_Type__c;
        this.dedication_Honoree_Name__c = dedication_Honoree_Name__c;
        this.dedication_Personal_Note__c = dedication_Personal_Note__c;
        this.dedication_Recipient_Address__c = dedication_Recipient_Address__c;
        this.dedication_Recipient_Email_Address__c = dedication_Recipient_Email_Address__c;
        this.dedication_Recipient_First_Name__c = dedication_Recipient_First_Name__c;
        this.dedication_Recipient_Last_Name__c = dedication_Recipient_Last_Name__c;
        this.dedication_Type__c = dedication_Type__c;
        this.description = description;
        this.events = events;
        this.fiscal = fiscal;
        this.fiscalQuarter = fiscalQuarter;
        this.fiscalYear = fiscalYear;
        this.forecastCategory = forecastCategory;
        this.forecastCategoryName = forecastCategoryName;
        this.fund__c = fund__c;
        this.gift_Aid__c = gift_Aid__c;
        this.gift_Aided_Amount__c = gift_Aided_Amount__c;
        this.grant_Amount__c = grant_Amount__c;
        this.hasOpportunityLineItem = hasOpportunityLineItem;
        this.histories = histories;
        this.isClosed = isClosed;
        this.isDeleted = isDeleted;
        this.isWon = isWon;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.leadSource = leadSource;
        this.matching_Amount__c = matching_Amount__c;
        this.matching_Close_Date__c = matching_Close_Date__c;
        this.matching_Status__c = matching_Status__c;
        this.matching__c = matching__c;
        this.membership_End_Date__c = membership_End_Date__c;
        this.membership_Length__c = membership_Length__c;
        this.membership_Start_Date__c = membership_Start_Date__c;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.openActivities = openActivities;
        this.opportunityCompetitors = opportunityCompetitors;
        this.opportunityContactRoles = opportunityContactRoles;
        this.opportunityHistories = opportunityHistories;
        this.opportunityLineItems = opportunityLineItems;
        this.opportunityPartnersFrom = opportunityPartnersFrom;
        this.owner = owner;
        this.ownerId = ownerId;
        this.partners = partners;
        this.payment_Type__c = payment_Type__c;
        this.pledge__c = pledge__c;
        this.pledge__r = pledge__r;
        this.pricebook2 = pricebook2;
        this.pricebook2Id = pricebook2Id;
        this.probability = probability;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.program_Designation__c = program_Designation__c;
        this.recordType = recordType;
        this.recordTypeId = recordTypeId;
        this.recurring_Donation__c = recurring_Donation__c;
        this.recurring_Donation__r = recurring_Donation__r;
        this.reporting_Deadline__c = reporting_Deadline__c;
        this.reporting_Requirements__c = reporting_Requirements__c;
        this.shares = shares;
        this.stageName = stageName;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.total_Amount__c = total_Amount__c;
        this.type = type;
    }


    /**
     * Gets the account value for this Opportunity.
     * 
     * @return account
     */
    public com.sforce.soap.enterprise.sobject.Account getAccount() {
        return account;
    }


    /**
     * Sets the account value for this Opportunity.
     * 
     * @param account
     */
    public void setAccount(com.sforce.soap.enterprise.sobject.Account account) {
        this.account = account;
    }


    /**
     * Gets the accountId value for this Opportunity.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this Opportunity.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the accountPartners value for this Opportunity.
     * 
     * @return accountPartners
     */
    public com.sforce.soap.enterprise.QueryResult getAccountPartners() {
        return accountPartners;
    }


    /**
     * Sets the accountPartners value for this Opportunity.
     * 
     * @param accountPartners
     */
    public void setAccountPartners(com.sforce.soap.enterprise.QueryResult accountPartners) {
        this.accountPartners = accountPartners;
    }


    /**
     * Gets the activityHistories value for this Opportunity.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Opportunity.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the amount value for this Opportunity.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this Opportunity.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the anonymous__c value for this Opportunity.
     * 
     * @return anonymous__c
     */
    public java.lang.Boolean getAnonymous__c() {
        return anonymous__c;
    }


    /**
     * Sets the anonymous__c value for this Opportunity.
     * 
     * @param anonymous__c
     */
    public void setAnonymous__c(java.lang.Boolean anonymous__c) {
        this.anonymous__c = anonymous__c;
    }


    /**
     * Gets the application_Deadline__c value for this Opportunity.
     * 
     * @return application_Deadline__c
     */
    public java.util.Date getApplication_Deadline__c() {
        return application_Deadline__c;
    }


    /**
     * Sets the application_Deadline__c value for this Opportunity.
     * 
     * @param application_Deadline__c
     */
    public void setApplication_Deadline__c(java.util.Date application_Deadline__c) {
        this.application_Deadline__c = application_Deadline__c;
    }


    /**
     * Gets the attachments value for this Opportunity.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Opportunity.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the CKWs__r value for this Opportunity.
     * 
     * @return CKWs__r
     */
    public com.sforce.soap.enterprise.QueryResult getCKWs__r() {
        return CKWs__r;
    }


    /**
     * Sets the CKWs__r value for this Opportunity.
     * 
     * @param CKWs__r
     */
    public void setCKWs__r(com.sforce.soap.enterprise.QueryResult CKWs__r) {
        this.CKWs__r = CKWs__r;
    }


    /**
     * Gets the campaign value for this Opportunity.
     * 
     * @return campaign
     */
    public com.sforce.soap.enterprise.sobject.Campaign getCampaign() {
        return campaign;
    }


    /**
     * Sets the campaign value for this Opportunity.
     * 
     * @param campaign
     */
    public void setCampaign(com.sforce.soap.enterprise.sobject.Campaign campaign) {
        this.campaign = campaign;
    }


    /**
     * Gets the campaignId value for this Opportunity.
     * 
     * @return campaignId
     */
    public java.lang.String getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this Opportunity.
     * 
     * @param campaignId
     */
    public void setCampaignId(java.lang.String campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the check_Date__c value for this Opportunity.
     * 
     * @return check_Date__c
     */
    public java.util.Date getCheck_Date__c() {
        return check_Date__c;
    }


    /**
     * Sets the check_Date__c value for this Opportunity.
     * 
     * @param check_Date__c
     */
    public void setCheck_Date__c(java.util.Date check_Date__c) {
        this.check_Date__c = check_Date__c;
    }


    /**
     * Gets the check_Number__c value for this Opportunity.
     * 
     * @return check_Number__c
     */
    public java.lang.Double getCheck_Number__c() {
        return check_Number__c;
    }


    /**
     * Sets the check_Number__c value for this Opportunity.
     * 
     * @param check_Number__c
     */
    public void setCheck_Number__c(java.lang.Double check_Number__c) {
        this.check_Number__c = check_Number__c;
    }


    /**
     * Gets the closeDate value for this Opportunity.
     * 
     * @return closeDate
     */
    public java.util.Date getCloseDate() {
        return closeDate;
    }


    /**
     * Sets the closeDate value for this Opportunity.
     * 
     * @param closeDate
     */
    public void setCloseDate(java.util.Date closeDate) {
        this.closeDate = closeDate;
    }


    /**
     * Gets the createdBy value for this Opportunity.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Opportunity.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Opportunity.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Opportunity.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Opportunity.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Opportunity.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the dedication_Acknowledgement_Type__c value for this Opportunity.
     * 
     * @return dedication_Acknowledgement_Type__c
     */
    public java.lang.String getDedication_Acknowledgement_Type__c() {
        return dedication_Acknowledgement_Type__c;
    }


    /**
     * Sets the dedication_Acknowledgement_Type__c value for this Opportunity.
     * 
     * @param dedication_Acknowledgement_Type__c
     */
    public void setDedication_Acknowledgement_Type__c(java.lang.String dedication_Acknowledgement_Type__c) {
        this.dedication_Acknowledgement_Type__c = dedication_Acknowledgement_Type__c;
    }


    /**
     * Gets the dedication_Honoree_Name__c value for this Opportunity.
     * 
     * @return dedication_Honoree_Name__c
     */
    public java.lang.String getDedication_Honoree_Name__c() {
        return dedication_Honoree_Name__c;
    }


    /**
     * Sets the dedication_Honoree_Name__c value for this Opportunity.
     * 
     * @param dedication_Honoree_Name__c
     */
    public void setDedication_Honoree_Name__c(java.lang.String dedication_Honoree_Name__c) {
        this.dedication_Honoree_Name__c = dedication_Honoree_Name__c;
    }


    /**
     * Gets the dedication_Personal_Note__c value for this Opportunity.
     * 
     * @return dedication_Personal_Note__c
     */
    public java.lang.String getDedication_Personal_Note__c() {
        return dedication_Personal_Note__c;
    }


    /**
     * Sets the dedication_Personal_Note__c value for this Opportunity.
     * 
     * @param dedication_Personal_Note__c
     */
    public void setDedication_Personal_Note__c(java.lang.String dedication_Personal_Note__c) {
        this.dedication_Personal_Note__c = dedication_Personal_Note__c;
    }


    /**
     * Gets the dedication_Recipient_Address__c value for this Opportunity.
     * 
     * @return dedication_Recipient_Address__c
     */
    public java.lang.String getDedication_Recipient_Address__c() {
        return dedication_Recipient_Address__c;
    }


    /**
     * Sets the dedication_Recipient_Address__c value for this Opportunity.
     * 
     * @param dedication_Recipient_Address__c
     */
    public void setDedication_Recipient_Address__c(java.lang.String dedication_Recipient_Address__c) {
        this.dedication_Recipient_Address__c = dedication_Recipient_Address__c;
    }


    /**
     * Gets the dedication_Recipient_Email_Address__c value for this Opportunity.
     * 
     * @return dedication_Recipient_Email_Address__c
     */
    public java.lang.String getDedication_Recipient_Email_Address__c() {
        return dedication_Recipient_Email_Address__c;
    }


    /**
     * Sets the dedication_Recipient_Email_Address__c value for this Opportunity.
     * 
     * @param dedication_Recipient_Email_Address__c
     */
    public void setDedication_Recipient_Email_Address__c(java.lang.String dedication_Recipient_Email_Address__c) {
        this.dedication_Recipient_Email_Address__c = dedication_Recipient_Email_Address__c;
    }


    /**
     * Gets the dedication_Recipient_First_Name__c value for this Opportunity.
     * 
     * @return dedication_Recipient_First_Name__c
     */
    public java.lang.String getDedication_Recipient_First_Name__c() {
        return dedication_Recipient_First_Name__c;
    }


    /**
     * Sets the dedication_Recipient_First_Name__c value for this Opportunity.
     * 
     * @param dedication_Recipient_First_Name__c
     */
    public void setDedication_Recipient_First_Name__c(java.lang.String dedication_Recipient_First_Name__c) {
        this.dedication_Recipient_First_Name__c = dedication_Recipient_First_Name__c;
    }


    /**
     * Gets the dedication_Recipient_Last_Name__c value for this Opportunity.
     * 
     * @return dedication_Recipient_Last_Name__c
     */
    public java.lang.String getDedication_Recipient_Last_Name__c() {
        return dedication_Recipient_Last_Name__c;
    }


    /**
     * Sets the dedication_Recipient_Last_Name__c value for this Opportunity.
     * 
     * @param dedication_Recipient_Last_Name__c
     */
    public void setDedication_Recipient_Last_Name__c(java.lang.String dedication_Recipient_Last_Name__c) {
        this.dedication_Recipient_Last_Name__c = dedication_Recipient_Last_Name__c;
    }


    /**
     * Gets the dedication_Type__c value for this Opportunity.
     * 
     * @return dedication_Type__c
     */
    public java.lang.String getDedication_Type__c() {
        return dedication_Type__c;
    }


    /**
     * Sets the dedication_Type__c value for this Opportunity.
     * 
     * @param dedication_Type__c
     */
    public void setDedication_Type__c(java.lang.String dedication_Type__c) {
        this.dedication_Type__c = dedication_Type__c;
    }


    /**
     * Gets the description value for this Opportunity.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Opportunity.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the events value for this Opportunity.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Opportunity.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the fiscal value for this Opportunity.
     * 
     * @return fiscal
     */
    public java.lang.String getFiscal() {
        return fiscal;
    }


    /**
     * Sets the fiscal value for this Opportunity.
     * 
     * @param fiscal
     */
    public void setFiscal(java.lang.String fiscal) {
        this.fiscal = fiscal;
    }


    /**
     * Gets the fiscalQuarter value for this Opportunity.
     * 
     * @return fiscalQuarter
     */
    public java.lang.Integer getFiscalQuarter() {
        return fiscalQuarter;
    }


    /**
     * Sets the fiscalQuarter value for this Opportunity.
     * 
     * @param fiscalQuarter
     */
    public void setFiscalQuarter(java.lang.Integer fiscalQuarter) {
        this.fiscalQuarter = fiscalQuarter;
    }


    /**
     * Gets the fiscalYear value for this Opportunity.
     * 
     * @return fiscalYear
     */
    public java.lang.Integer getFiscalYear() {
        return fiscalYear;
    }


    /**
     * Sets the fiscalYear value for this Opportunity.
     * 
     * @param fiscalYear
     */
    public void setFiscalYear(java.lang.Integer fiscalYear) {
        this.fiscalYear = fiscalYear;
    }


    /**
     * Gets the forecastCategory value for this Opportunity.
     * 
     * @return forecastCategory
     */
    public java.lang.String getForecastCategory() {
        return forecastCategory;
    }


    /**
     * Sets the forecastCategory value for this Opportunity.
     * 
     * @param forecastCategory
     */
    public void setForecastCategory(java.lang.String forecastCategory) {
        this.forecastCategory = forecastCategory;
    }


    /**
     * Gets the forecastCategoryName value for this Opportunity.
     * 
     * @return forecastCategoryName
     */
    public java.lang.String getForecastCategoryName() {
        return forecastCategoryName;
    }


    /**
     * Sets the forecastCategoryName value for this Opportunity.
     * 
     * @param forecastCategoryName
     */
    public void setForecastCategoryName(java.lang.String forecastCategoryName) {
        this.forecastCategoryName = forecastCategoryName;
    }


    /**
     * Gets the fund__c value for this Opportunity.
     * 
     * @return fund__c
     */
    public java.lang.String getFund__c() {
        return fund__c;
    }


    /**
     * Sets the fund__c value for this Opportunity.
     * 
     * @param fund__c
     */
    public void setFund__c(java.lang.String fund__c) {
        this.fund__c = fund__c;
    }


    /**
     * Gets the gift_Aid__c value for this Opportunity.
     * 
     * @return gift_Aid__c
     */
    public java.lang.Boolean getGift_Aid__c() {
        return gift_Aid__c;
    }


    /**
     * Sets the gift_Aid__c value for this Opportunity.
     * 
     * @param gift_Aid__c
     */
    public void setGift_Aid__c(java.lang.Boolean gift_Aid__c) {
        this.gift_Aid__c = gift_Aid__c;
    }


    /**
     * Gets the gift_Aided_Amount__c value for this Opportunity.
     * 
     * @return gift_Aided_Amount__c
     */
    public java.lang.Double getGift_Aided_Amount__c() {
        return gift_Aided_Amount__c;
    }


    /**
     * Sets the gift_Aided_Amount__c value for this Opportunity.
     * 
     * @param gift_Aided_Amount__c
     */
    public void setGift_Aided_Amount__c(java.lang.Double gift_Aided_Amount__c) {
        this.gift_Aided_Amount__c = gift_Aided_Amount__c;
    }


    /**
     * Gets the grant_Amount__c value for this Opportunity.
     * 
     * @return grant_Amount__c
     */
    public java.lang.Double getGrant_Amount__c() {
        return grant_Amount__c;
    }


    /**
     * Sets the grant_Amount__c value for this Opportunity.
     * 
     * @param grant_Amount__c
     */
    public void setGrant_Amount__c(java.lang.Double grant_Amount__c) {
        this.grant_Amount__c = grant_Amount__c;
    }


    /**
     * Gets the hasOpportunityLineItem value for this Opportunity.
     * 
     * @return hasOpportunityLineItem
     */
    public java.lang.Boolean getHasOpportunityLineItem() {
        return hasOpportunityLineItem;
    }


    /**
     * Sets the hasOpportunityLineItem value for this Opportunity.
     * 
     * @param hasOpportunityLineItem
     */
    public void setHasOpportunityLineItem(java.lang.Boolean hasOpportunityLineItem) {
        this.hasOpportunityLineItem = hasOpportunityLineItem;
    }


    /**
     * Gets the histories value for this Opportunity.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Opportunity.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the isClosed value for this Opportunity.
     * 
     * @return isClosed
     */
    public java.lang.Boolean getIsClosed() {
        return isClosed;
    }


    /**
     * Sets the isClosed value for this Opportunity.
     * 
     * @param isClosed
     */
    public void setIsClosed(java.lang.Boolean isClosed) {
        this.isClosed = isClosed;
    }


    /**
     * Gets the isDeleted value for this Opportunity.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Opportunity.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isWon value for this Opportunity.
     * 
     * @return isWon
     */
    public java.lang.Boolean getIsWon() {
        return isWon;
    }


    /**
     * Sets the isWon value for this Opportunity.
     * 
     * @param isWon
     */
    public void setIsWon(java.lang.Boolean isWon) {
        this.isWon = isWon;
    }


    /**
     * Gets the lastActivityDate value for this Opportunity.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Opportunity.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Opportunity.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Opportunity.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Opportunity.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Opportunity.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Opportunity.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Opportunity.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the leadSource value for this Opportunity.
     * 
     * @return leadSource
     */
    public java.lang.String getLeadSource() {
        return leadSource;
    }


    /**
     * Sets the leadSource value for this Opportunity.
     * 
     * @param leadSource
     */
    public void setLeadSource(java.lang.String leadSource) {
        this.leadSource = leadSource;
    }


    /**
     * Gets the matching_Amount__c value for this Opportunity.
     * 
     * @return matching_Amount__c
     */
    public java.lang.Double getMatching_Amount__c() {
        return matching_Amount__c;
    }


    /**
     * Sets the matching_Amount__c value for this Opportunity.
     * 
     * @param matching_Amount__c
     */
    public void setMatching_Amount__c(java.lang.Double matching_Amount__c) {
        this.matching_Amount__c = matching_Amount__c;
    }


    /**
     * Gets the matching_Close_Date__c value for this Opportunity.
     * 
     * @return matching_Close_Date__c
     */
    public java.util.Date getMatching_Close_Date__c() {
        return matching_Close_Date__c;
    }


    /**
     * Sets the matching_Close_Date__c value for this Opportunity.
     * 
     * @param matching_Close_Date__c
     */
    public void setMatching_Close_Date__c(java.util.Date matching_Close_Date__c) {
        this.matching_Close_Date__c = matching_Close_Date__c;
    }


    /**
     * Gets the matching_Status__c value for this Opportunity.
     * 
     * @return matching_Status__c
     */
    public java.lang.String getMatching_Status__c() {
        return matching_Status__c;
    }


    /**
     * Sets the matching_Status__c value for this Opportunity.
     * 
     * @param matching_Status__c
     */
    public void setMatching_Status__c(java.lang.String matching_Status__c) {
        this.matching_Status__c = matching_Status__c;
    }


    /**
     * Gets the matching__c value for this Opportunity.
     * 
     * @return matching__c
     */
    public java.lang.Double getMatching__c() {
        return matching__c;
    }


    /**
     * Sets the matching__c value for this Opportunity.
     * 
     * @param matching__c
     */
    public void setMatching__c(java.lang.Double matching__c) {
        this.matching__c = matching__c;
    }


    /**
     * Gets the membership_End_Date__c value for this Opportunity.
     * 
     * @return membership_End_Date__c
     */
    public java.util.Date getMembership_End_Date__c() {
        return membership_End_Date__c;
    }


    /**
     * Sets the membership_End_Date__c value for this Opportunity.
     * 
     * @param membership_End_Date__c
     */
    public void setMembership_End_Date__c(java.util.Date membership_End_Date__c) {
        this.membership_End_Date__c = membership_End_Date__c;
    }


    /**
     * Gets the membership_Length__c value for this Opportunity.
     * 
     * @return membership_Length__c
     */
    public java.lang.Double getMembership_Length__c() {
        return membership_Length__c;
    }


    /**
     * Sets the membership_Length__c value for this Opportunity.
     * 
     * @param membership_Length__c
     */
    public void setMembership_Length__c(java.lang.Double membership_Length__c) {
        this.membership_Length__c = membership_Length__c;
    }


    /**
     * Gets the membership_Start_Date__c value for this Opportunity.
     * 
     * @return membership_Start_Date__c
     */
    public java.util.Date getMembership_Start_Date__c() {
        return membership_Start_Date__c;
    }


    /**
     * Sets the membership_Start_Date__c value for this Opportunity.
     * 
     * @param membership_Start_Date__c
     */
    public void setMembership_Start_Date__c(java.util.Date membership_Start_Date__c) {
        this.membership_Start_Date__c = membership_Start_Date__c;
    }


    /**
     * Gets the name value for this Opportunity.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Opportunity.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Opportunity.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Opportunity.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Opportunity.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Opportunity.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this Opportunity.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Opportunity.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the opportunityCompetitors value for this Opportunity.
     * 
     * @return opportunityCompetitors
     */
    public com.sforce.soap.enterprise.QueryResult getOpportunityCompetitors() {
        return opportunityCompetitors;
    }


    /**
     * Sets the opportunityCompetitors value for this Opportunity.
     * 
     * @param opportunityCompetitors
     */
    public void setOpportunityCompetitors(com.sforce.soap.enterprise.QueryResult opportunityCompetitors) {
        this.opportunityCompetitors = opportunityCompetitors;
    }


    /**
     * Gets the opportunityContactRoles value for this Opportunity.
     * 
     * @return opportunityContactRoles
     */
    public com.sforce.soap.enterprise.QueryResult getOpportunityContactRoles() {
        return opportunityContactRoles;
    }


    /**
     * Sets the opportunityContactRoles value for this Opportunity.
     * 
     * @param opportunityContactRoles
     */
    public void setOpportunityContactRoles(com.sforce.soap.enterprise.QueryResult opportunityContactRoles) {
        this.opportunityContactRoles = opportunityContactRoles;
    }


    /**
     * Gets the opportunityHistories value for this Opportunity.
     * 
     * @return opportunityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getOpportunityHistories() {
        return opportunityHistories;
    }


    /**
     * Sets the opportunityHistories value for this Opportunity.
     * 
     * @param opportunityHistories
     */
    public void setOpportunityHistories(com.sforce.soap.enterprise.QueryResult opportunityHistories) {
        this.opportunityHistories = opportunityHistories;
    }


    /**
     * Gets the opportunityLineItems value for this Opportunity.
     * 
     * @return opportunityLineItems
     */
    public com.sforce.soap.enterprise.QueryResult getOpportunityLineItems() {
        return opportunityLineItems;
    }


    /**
     * Sets the opportunityLineItems value for this Opportunity.
     * 
     * @param opportunityLineItems
     */
    public void setOpportunityLineItems(com.sforce.soap.enterprise.QueryResult opportunityLineItems) {
        this.opportunityLineItems = opportunityLineItems;
    }


    /**
     * Gets the opportunityPartnersFrom value for this Opportunity.
     * 
     * @return opportunityPartnersFrom
     */
    public com.sforce.soap.enterprise.QueryResult getOpportunityPartnersFrom() {
        return opportunityPartnersFrom;
    }


    /**
     * Sets the opportunityPartnersFrom value for this Opportunity.
     * 
     * @param opportunityPartnersFrom
     */
    public void setOpportunityPartnersFrom(com.sforce.soap.enterprise.QueryResult opportunityPartnersFrom) {
        this.opportunityPartnersFrom = opportunityPartnersFrom;
    }


    /**
     * Gets the owner value for this Opportunity.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.User getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Opportunity.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.User owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Opportunity.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Opportunity.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the partners value for this Opportunity.
     * 
     * @return partners
     */
    public com.sforce.soap.enterprise.QueryResult getPartners() {
        return partners;
    }


    /**
     * Sets the partners value for this Opportunity.
     * 
     * @param partners
     */
    public void setPartners(com.sforce.soap.enterprise.QueryResult partners) {
        this.partners = partners;
    }


    /**
     * Gets the payment_Type__c value for this Opportunity.
     * 
     * @return payment_Type__c
     */
    public java.lang.String getPayment_Type__c() {
        return payment_Type__c;
    }


    /**
     * Sets the payment_Type__c value for this Opportunity.
     * 
     * @param payment_Type__c
     */
    public void setPayment_Type__c(java.lang.String payment_Type__c) {
        this.payment_Type__c = payment_Type__c;
    }


    /**
     * Gets the pledge__c value for this Opportunity.
     * 
     * @return pledge__c
     */
    public java.lang.String getPledge__c() {
        return pledge__c;
    }


    /**
     * Sets the pledge__c value for this Opportunity.
     * 
     * @param pledge__c
     */
    public void setPledge__c(java.lang.String pledge__c) {
        this.pledge__c = pledge__c;
    }


    /**
     * Gets the pledge__r value for this Opportunity.
     * 
     * @return pledge__r
     */
    public com.sforce.soap.enterprise.sobject.Pledges__c getPledge__r() {
        return pledge__r;
    }


    /**
     * Sets the pledge__r value for this Opportunity.
     * 
     * @param pledge__r
     */
    public void setPledge__r(com.sforce.soap.enterprise.sobject.Pledges__c pledge__r) {
        this.pledge__r = pledge__r;
    }


    /**
     * Gets the pricebook2 value for this Opportunity.
     * 
     * @return pricebook2
     */
    public com.sforce.soap.enterprise.sobject.Pricebook2 getPricebook2() {
        return pricebook2;
    }


    /**
     * Sets the pricebook2 value for this Opportunity.
     * 
     * @param pricebook2
     */
    public void setPricebook2(com.sforce.soap.enterprise.sobject.Pricebook2 pricebook2) {
        this.pricebook2 = pricebook2;
    }


    /**
     * Gets the pricebook2Id value for this Opportunity.
     * 
     * @return pricebook2Id
     */
    public java.lang.String getPricebook2Id() {
        return pricebook2Id;
    }


    /**
     * Sets the pricebook2Id value for this Opportunity.
     * 
     * @param pricebook2Id
     */
    public void setPricebook2Id(java.lang.String pricebook2Id) {
        this.pricebook2Id = pricebook2Id;
    }


    /**
     * Gets the probability value for this Opportunity.
     * 
     * @return probability
     */
    public java.lang.Double getProbability() {
        return probability;
    }


    /**
     * Sets the probability value for this Opportunity.
     * 
     * @param probability
     */
    public void setProbability(java.lang.Double probability) {
        this.probability = probability;
    }


    /**
     * Gets the processInstances value for this Opportunity.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Opportunity.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Opportunity.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Opportunity.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the program_Designation__c value for this Opportunity.
     * 
     * @return program_Designation__c
     */
    public java.lang.String getProgram_Designation__c() {
        return program_Designation__c;
    }


    /**
     * Sets the program_Designation__c value for this Opportunity.
     * 
     * @param program_Designation__c
     */
    public void setProgram_Designation__c(java.lang.String program_Designation__c) {
        this.program_Designation__c = program_Designation__c;
    }


    /**
     * Gets the recordType value for this Opportunity.
     * 
     * @return recordType
     */
    public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this Opportunity.
     * 
     * @param recordType
     */
    public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this Opportunity.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this Opportunity.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the recurring_Donation__c value for this Opportunity.
     * 
     * @return recurring_Donation__c
     */
    public java.lang.String getRecurring_Donation__c() {
        return recurring_Donation__c;
    }


    /**
     * Sets the recurring_Donation__c value for this Opportunity.
     * 
     * @param recurring_Donation__c
     */
    public void setRecurring_Donation__c(java.lang.String recurring_Donation__c) {
        this.recurring_Donation__c = recurring_Donation__c;
    }


    /**
     * Gets the recurring_Donation__r value for this Opportunity.
     * 
     * @return recurring_Donation__r
     */
    public com.sforce.soap.enterprise.sobject.Recurring_Donation__c getRecurring_Donation__r() {
        return recurring_Donation__r;
    }


    /**
     * Sets the recurring_Donation__r value for this Opportunity.
     * 
     * @param recurring_Donation__r
     */
    public void setRecurring_Donation__r(com.sforce.soap.enterprise.sobject.Recurring_Donation__c recurring_Donation__r) {
        this.recurring_Donation__r = recurring_Donation__r;
    }


    /**
     * Gets the reporting_Deadline__c value for this Opportunity.
     * 
     * @return reporting_Deadline__c
     */
    public java.util.Date getReporting_Deadline__c() {
        return reporting_Deadline__c;
    }


    /**
     * Sets the reporting_Deadline__c value for this Opportunity.
     * 
     * @param reporting_Deadline__c
     */
    public void setReporting_Deadline__c(java.util.Date reporting_Deadline__c) {
        this.reporting_Deadline__c = reporting_Deadline__c;
    }


    /**
     * Gets the reporting_Requirements__c value for this Opportunity.
     * 
     * @return reporting_Requirements__c
     */
    public java.lang.String getReporting_Requirements__c() {
        return reporting_Requirements__c;
    }


    /**
     * Sets the reporting_Requirements__c value for this Opportunity.
     * 
     * @param reporting_Requirements__c
     */
    public void setReporting_Requirements__c(java.lang.String reporting_Requirements__c) {
        this.reporting_Requirements__c = reporting_Requirements__c;
    }


    /**
     * Gets the shares value for this Opportunity.
     * 
     * @return shares
     */
    public com.sforce.soap.enterprise.QueryResult getShares() {
        return shares;
    }


    /**
     * Sets the shares value for this Opportunity.
     * 
     * @param shares
     */
    public void setShares(com.sforce.soap.enterprise.QueryResult shares) {
        this.shares = shares;
    }


    /**
     * Gets the stageName value for this Opportunity.
     * 
     * @return stageName
     */
    public java.lang.String getStageName() {
        return stageName;
    }


    /**
     * Sets the stageName value for this Opportunity.
     * 
     * @param stageName
     */
    public void setStageName(java.lang.String stageName) {
        this.stageName = stageName;
    }


    /**
     * Gets the systemModstamp value for this Opportunity.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Opportunity.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Opportunity.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Opportunity.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the total_Amount__c value for this Opportunity.
     * 
     * @return total_Amount__c
     */
    public java.lang.Double getTotal_Amount__c() {
        return total_Amount__c;
    }


    /**
     * Sets the total_Amount__c value for this Opportunity.
     * 
     * @param total_Amount__c
     */
    public void setTotal_Amount__c(java.lang.Double total_Amount__c) {
        this.total_Amount__c = total_Amount__c;
    }


    /**
     * Gets the type value for this Opportunity.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Opportunity.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Opportunity)) return false;
        Opportunity other = (Opportunity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.accountPartners==null && other.getAccountPartners()==null) || 
             (this.accountPartners!=null &&
              this.accountPartners.equals(other.getAccountPartners()))) &&
            ((this.activityHistories==null && other.getActivityHistories()==null) || 
             (this.activityHistories!=null &&
              this.activityHistories.equals(other.getActivityHistories()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.anonymous__c==null && other.getAnonymous__c()==null) || 
             (this.anonymous__c!=null &&
              this.anonymous__c.equals(other.getAnonymous__c()))) &&
            ((this.application_Deadline__c==null && other.getApplication_Deadline__c()==null) || 
             (this.application_Deadline__c!=null &&
              this.application_Deadline__c.equals(other.getApplication_Deadline__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.CKWs__r==null && other.getCKWs__r()==null) || 
             (this.CKWs__r!=null &&
              this.CKWs__r.equals(other.getCKWs__r()))) &&
            ((this.campaign==null && other.getCampaign()==null) || 
             (this.campaign!=null &&
              this.campaign.equals(other.getCampaign()))) &&
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.check_Date__c==null && other.getCheck_Date__c()==null) || 
             (this.check_Date__c!=null &&
              this.check_Date__c.equals(other.getCheck_Date__c()))) &&
            ((this.check_Number__c==null && other.getCheck_Number__c()==null) || 
             (this.check_Number__c!=null &&
              this.check_Number__c.equals(other.getCheck_Number__c()))) &&
            ((this.closeDate==null && other.getCloseDate()==null) || 
             (this.closeDate!=null &&
              this.closeDate.equals(other.getCloseDate()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.dedication_Acknowledgement_Type__c==null && other.getDedication_Acknowledgement_Type__c()==null) || 
             (this.dedication_Acknowledgement_Type__c!=null &&
              this.dedication_Acknowledgement_Type__c.equals(other.getDedication_Acknowledgement_Type__c()))) &&
            ((this.dedication_Honoree_Name__c==null && other.getDedication_Honoree_Name__c()==null) || 
             (this.dedication_Honoree_Name__c!=null &&
              this.dedication_Honoree_Name__c.equals(other.getDedication_Honoree_Name__c()))) &&
            ((this.dedication_Personal_Note__c==null && other.getDedication_Personal_Note__c()==null) || 
             (this.dedication_Personal_Note__c!=null &&
              this.dedication_Personal_Note__c.equals(other.getDedication_Personal_Note__c()))) &&
            ((this.dedication_Recipient_Address__c==null && other.getDedication_Recipient_Address__c()==null) || 
             (this.dedication_Recipient_Address__c!=null &&
              this.dedication_Recipient_Address__c.equals(other.getDedication_Recipient_Address__c()))) &&
            ((this.dedication_Recipient_Email_Address__c==null && other.getDedication_Recipient_Email_Address__c()==null) || 
             (this.dedication_Recipient_Email_Address__c!=null &&
              this.dedication_Recipient_Email_Address__c.equals(other.getDedication_Recipient_Email_Address__c()))) &&
            ((this.dedication_Recipient_First_Name__c==null && other.getDedication_Recipient_First_Name__c()==null) || 
             (this.dedication_Recipient_First_Name__c!=null &&
              this.dedication_Recipient_First_Name__c.equals(other.getDedication_Recipient_First_Name__c()))) &&
            ((this.dedication_Recipient_Last_Name__c==null && other.getDedication_Recipient_Last_Name__c()==null) || 
             (this.dedication_Recipient_Last_Name__c!=null &&
              this.dedication_Recipient_Last_Name__c.equals(other.getDedication_Recipient_Last_Name__c()))) &&
            ((this.dedication_Type__c==null && other.getDedication_Type__c()==null) || 
             (this.dedication_Type__c!=null &&
              this.dedication_Type__c.equals(other.getDedication_Type__c()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.fiscal==null && other.getFiscal()==null) || 
             (this.fiscal!=null &&
              this.fiscal.equals(other.getFiscal()))) &&
            ((this.fiscalQuarter==null && other.getFiscalQuarter()==null) || 
             (this.fiscalQuarter!=null &&
              this.fiscalQuarter.equals(other.getFiscalQuarter()))) &&
            ((this.fiscalYear==null && other.getFiscalYear()==null) || 
             (this.fiscalYear!=null &&
              this.fiscalYear.equals(other.getFiscalYear()))) &&
            ((this.forecastCategory==null && other.getForecastCategory()==null) || 
             (this.forecastCategory!=null &&
              this.forecastCategory.equals(other.getForecastCategory()))) &&
            ((this.forecastCategoryName==null && other.getForecastCategoryName()==null) || 
             (this.forecastCategoryName!=null &&
              this.forecastCategoryName.equals(other.getForecastCategoryName()))) &&
            ((this.fund__c==null && other.getFund__c()==null) || 
             (this.fund__c!=null &&
              this.fund__c.equals(other.getFund__c()))) &&
            ((this.gift_Aid__c==null && other.getGift_Aid__c()==null) || 
             (this.gift_Aid__c!=null &&
              this.gift_Aid__c.equals(other.getGift_Aid__c()))) &&
            ((this.gift_Aided_Amount__c==null && other.getGift_Aided_Amount__c()==null) || 
             (this.gift_Aided_Amount__c!=null &&
              this.gift_Aided_Amount__c.equals(other.getGift_Aided_Amount__c()))) &&
            ((this.grant_Amount__c==null && other.getGrant_Amount__c()==null) || 
             (this.grant_Amount__c!=null &&
              this.grant_Amount__c.equals(other.getGrant_Amount__c()))) &&
            ((this.hasOpportunityLineItem==null && other.getHasOpportunityLineItem()==null) || 
             (this.hasOpportunityLineItem!=null &&
              this.hasOpportunityLineItem.equals(other.getHasOpportunityLineItem()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.isClosed==null && other.getIsClosed()==null) || 
             (this.isClosed!=null &&
              this.isClosed.equals(other.getIsClosed()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.isWon==null && other.getIsWon()==null) || 
             (this.isWon!=null &&
              this.isWon.equals(other.getIsWon()))) &&
            ((this.lastActivityDate==null && other.getLastActivityDate()==null) || 
             (this.lastActivityDate!=null &&
              this.lastActivityDate.equals(other.getLastActivityDate()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.leadSource==null && other.getLeadSource()==null) || 
             (this.leadSource!=null &&
              this.leadSource.equals(other.getLeadSource()))) &&
            ((this.matching_Amount__c==null && other.getMatching_Amount__c()==null) || 
             (this.matching_Amount__c!=null &&
              this.matching_Amount__c.equals(other.getMatching_Amount__c()))) &&
            ((this.matching_Close_Date__c==null && other.getMatching_Close_Date__c()==null) || 
             (this.matching_Close_Date__c!=null &&
              this.matching_Close_Date__c.equals(other.getMatching_Close_Date__c()))) &&
            ((this.matching_Status__c==null && other.getMatching_Status__c()==null) || 
             (this.matching_Status__c!=null &&
              this.matching_Status__c.equals(other.getMatching_Status__c()))) &&
            ((this.matching__c==null && other.getMatching__c()==null) || 
             (this.matching__c!=null &&
              this.matching__c.equals(other.getMatching__c()))) &&
            ((this.membership_End_Date__c==null && other.getMembership_End_Date__c()==null) || 
             (this.membership_End_Date__c!=null &&
              this.membership_End_Date__c.equals(other.getMembership_End_Date__c()))) &&
            ((this.membership_Length__c==null && other.getMembership_Length__c()==null) || 
             (this.membership_Length__c!=null &&
              this.membership_Length__c.equals(other.getMembership_Length__c()))) &&
            ((this.membership_Start_Date__c==null && other.getMembership_Start_Date__c()==null) || 
             (this.membership_Start_Date__c!=null &&
              this.membership_Start_Date__c.equals(other.getMembership_Start_Date__c()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
            ((this.opportunityCompetitors==null && other.getOpportunityCompetitors()==null) || 
             (this.opportunityCompetitors!=null &&
              this.opportunityCompetitors.equals(other.getOpportunityCompetitors()))) &&
            ((this.opportunityContactRoles==null && other.getOpportunityContactRoles()==null) || 
             (this.opportunityContactRoles!=null &&
              this.opportunityContactRoles.equals(other.getOpportunityContactRoles()))) &&
            ((this.opportunityHistories==null && other.getOpportunityHistories()==null) || 
             (this.opportunityHistories!=null &&
              this.opportunityHistories.equals(other.getOpportunityHistories()))) &&
            ((this.opportunityLineItems==null && other.getOpportunityLineItems()==null) || 
             (this.opportunityLineItems!=null &&
              this.opportunityLineItems.equals(other.getOpportunityLineItems()))) &&
            ((this.opportunityPartnersFrom==null && other.getOpportunityPartnersFrom()==null) || 
             (this.opportunityPartnersFrom!=null &&
              this.opportunityPartnersFrom.equals(other.getOpportunityPartnersFrom()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.partners==null && other.getPartners()==null) || 
             (this.partners!=null &&
              this.partners.equals(other.getPartners()))) &&
            ((this.payment_Type__c==null && other.getPayment_Type__c()==null) || 
             (this.payment_Type__c!=null &&
              this.payment_Type__c.equals(other.getPayment_Type__c()))) &&
            ((this.pledge__c==null && other.getPledge__c()==null) || 
             (this.pledge__c!=null &&
              this.pledge__c.equals(other.getPledge__c()))) &&
            ((this.pledge__r==null && other.getPledge__r()==null) || 
             (this.pledge__r!=null &&
              this.pledge__r.equals(other.getPledge__r()))) &&
            ((this.pricebook2==null && other.getPricebook2()==null) || 
             (this.pricebook2!=null &&
              this.pricebook2.equals(other.getPricebook2()))) &&
            ((this.pricebook2Id==null && other.getPricebook2Id()==null) || 
             (this.pricebook2Id!=null &&
              this.pricebook2Id.equals(other.getPricebook2Id()))) &&
            ((this.probability==null && other.getProbability()==null) || 
             (this.probability!=null &&
              this.probability.equals(other.getProbability()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.program_Designation__c==null && other.getProgram_Designation__c()==null) || 
             (this.program_Designation__c!=null &&
              this.program_Designation__c.equals(other.getProgram_Designation__c()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.recordTypeId==null && other.getRecordTypeId()==null) || 
             (this.recordTypeId!=null &&
              this.recordTypeId.equals(other.getRecordTypeId()))) &&
            ((this.recurring_Donation__c==null && other.getRecurring_Donation__c()==null) || 
             (this.recurring_Donation__c!=null &&
              this.recurring_Donation__c.equals(other.getRecurring_Donation__c()))) &&
            ((this.recurring_Donation__r==null && other.getRecurring_Donation__r()==null) || 
             (this.recurring_Donation__r!=null &&
              this.recurring_Donation__r.equals(other.getRecurring_Donation__r()))) &&
            ((this.reporting_Deadline__c==null && other.getReporting_Deadline__c()==null) || 
             (this.reporting_Deadline__c!=null &&
              this.reporting_Deadline__c.equals(other.getReporting_Deadline__c()))) &&
            ((this.reporting_Requirements__c==null && other.getReporting_Requirements__c()==null) || 
             (this.reporting_Requirements__c!=null &&
              this.reporting_Requirements__c.equals(other.getReporting_Requirements__c()))) &&
            ((this.shares==null && other.getShares()==null) || 
             (this.shares!=null &&
              this.shares.equals(other.getShares()))) &&
            ((this.stageName==null && other.getStageName()==null) || 
             (this.stageName!=null &&
              this.stageName.equals(other.getStageName()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.total_Amount__c==null && other.getTotal_Amount__c()==null) || 
             (this.total_Amount__c!=null &&
              this.total_Amount__c.equals(other.getTotal_Amount__c()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAccountPartners() != null) {
            _hashCode += getAccountPartners().hashCode();
        }
        if (getActivityHistories() != null) {
            _hashCode += getActivityHistories().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAnonymous__c() != null) {
            _hashCode += getAnonymous__c().hashCode();
        }
        if (getApplication_Deadline__c() != null) {
            _hashCode += getApplication_Deadline__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getCKWs__r() != null) {
            _hashCode += getCKWs__r().hashCode();
        }
        if (getCampaign() != null) {
            _hashCode += getCampaign().hashCode();
        }
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getCheck_Date__c() != null) {
            _hashCode += getCheck_Date__c().hashCode();
        }
        if (getCheck_Number__c() != null) {
            _hashCode += getCheck_Number__c().hashCode();
        }
        if (getCloseDate() != null) {
            _hashCode += getCloseDate().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getDedication_Acknowledgement_Type__c() != null) {
            _hashCode += getDedication_Acknowledgement_Type__c().hashCode();
        }
        if (getDedication_Honoree_Name__c() != null) {
            _hashCode += getDedication_Honoree_Name__c().hashCode();
        }
        if (getDedication_Personal_Note__c() != null) {
            _hashCode += getDedication_Personal_Note__c().hashCode();
        }
        if (getDedication_Recipient_Address__c() != null) {
            _hashCode += getDedication_Recipient_Address__c().hashCode();
        }
        if (getDedication_Recipient_Email_Address__c() != null) {
            _hashCode += getDedication_Recipient_Email_Address__c().hashCode();
        }
        if (getDedication_Recipient_First_Name__c() != null) {
            _hashCode += getDedication_Recipient_First_Name__c().hashCode();
        }
        if (getDedication_Recipient_Last_Name__c() != null) {
            _hashCode += getDedication_Recipient_Last_Name__c().hashCode();
        }
        if (getDedication_Type__c() != null) {
            _hashCode += getDedication_Type__c().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getFiscal() != null) {
            _hashCode += getFiscal().hashCode();
        }
        if (getFiscalQuarter() != null) {
            _hashCode += getFiscalQuarter().hashCode();
        }
        if (getFiscalYear() != null) {
            _hashCode += getFiscalYear().hashCode();
        }
        if (getForecastCategory() != null) {
            _hashCode += getForecastCategory().hashCode();
        }
        if (getForecastCategoryName() != null) {
            _hashCode += getForecastCategoryName().hashCode();
        }
        if (getFund__c() != null) {
            _hashCode += getFund__c().hashCode();
        }
        if (getGift_Aid__c() != null) {
            _hashCode += getGift_Aid__c().hashCode();
        }
        if (getGift_Aided_Amount__c() != null) {
            _hashCode += getGift_Aided_Amount__c().hashCode();
        }
        if (getGrant_Amount__c() != null) {
            _hashCode += getGrant_Amount__c().hashCode();
        }
        if (getHasOpportunityLineItem() != null) {
            _hashCode += getHasOpportunityLineItem().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getIsClosed() != null) {
            _hashCode += getIsClosed().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIsWon() != null) {
            _hashCode += getIsWon().hashCode();
        }
        if (getLastActivityDate() != null) {
            _hashCode += getLastActivityDate().hashCode();
        }
        if (getLastModifiedBy() != null) {
            _hashCode += getLastModifiedBy().hashCode();
        }
        if (getLastModifiedById() != null) {
            _hashCode += getLastModifiedById().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getLeadSource() != null) {
            _hashCode += getLeadSource().hashCode();
        }
        if (getMatching_Amount__c() != null) {
            _hashCode += getMatching_Amount__c().hashCode();
        }
        if (getMatching_Close_Date__c() != null) {
            _hashCode += getMatching_Close_Date__c().hashCode();
        }
        if (getMatching_Status__c() != null) {
            _hashCode += getMatching_Status__c().hashCode();
        }
        if (getMatching__c() != null) {
            _hashCode += getMatching__c().hashCode();
        }
        if (getMembership_End_Date__c() != null) {
            _hashCode += getMembership_End_Date__c().hashCode();
        }
        if (getMembership_Length__c() != null) {
            _hashCode += getMembership_Length__c().hashCode();
        }
        if (getMembership_Start_Date__c() != null) {
            _hashCode += getMembership_Start_Date__c().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getNotesAndAttachments() != null) {
            _hashCode += getNotesAndAttachments().hashCode();
        }
        if (getOpenActivities() != null) {
            _hashCode += getOpenActivities().hashCode();
        }
        if (getOpportunityCompetitors() != null) {
            _hashCode += getOpportunityCompetitors().hashCode();
        }
        if (getOpportunityContactRoles() != null) {
            _hashCode += getOpportunityContactRoles().hashCode();
        }
        if (getOpportunityHistories() != null) {
            _hashCode += getOpportunityHistories().hashCode();
        }
        if (getOpportunityLineItems() != null) {
            _hashCode += getOpportunityLineItems().hashCode();
        }
        if (getOpportunityPartnersFrom() != null) {
            _hashCode += getOpportunityPartnersFrom().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getPartners() != null) {
            _hashCode += getPartners().hashCode();
        }
        if (getPayment_Type__c() != null) {
            _hashCode += getPayment_Type__c().hashCode();
        }
        if (getPledge__c() != null) {
            _hashCode += getPledge__c().hashCode();
        }
        if (getPledge__r() != null) {
            _hashCode += getPledge__r().hashCode();
        }
        if (getPricebook2() != null) {
            _hashCode += getPricebook2().hashCode();
        }
        if (getPricebook2Id() != null) {
            _hashCode += getPricebook2Id().hashCode();
        }
        if (getProbability() != null) {
            _hashCode += getProbability().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getProgram_Designation__c() != null) {
            _hashCode += getProgram_Designation__c().hashCode();
        }
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getRecordTypeId() != null) {
            _hashCode += getRecordTypeId().hashCode();
        }
        if (getRecurring_Donation__c() != null) {
            _hashCode += getRecurring_Donation__c().hashCode();
        }
        if (getRecurring_Donation__r() != null) {
            _hashCode += getRecurring_Donation__r().hashCode();
        }
        if (getReporting_Deadline__c() != null) {
            _hashCode += getReporting_Deadline__c().hashCode();
        }
        if (getReporting_Requirements__c() != null) {
            _hashCode += getReporting_Requirements__c().hashCode();
        }
        if (getShares() != null) {
            _hashCode += getShares().hashCode();
        }
        if (getStageName() != null) {
            _hashCode += getStageName().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getTotal_Amount__c() != null) {
            _hashCode += getTotal_Amount__c().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Opportunity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Opportunity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountPartners");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountPartners"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityHistories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActivityHistories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anonymous__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Anonymous__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("application_Deadline__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Application_Deadline__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CKWs__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CKWs__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaign");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campaign"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campaign"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CampaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("check_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Check_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("check_Number__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Check_Number__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CloseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dedication_Acknowledgement_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dedication_Acknowledgement_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dedication_Honoree_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dedication_Honoree_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dedication_Personal_Note__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dedication_Personal_Note__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dedication_Recipient_Address__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dedication_Recipient_Address__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dedication_Recipient_Email_Address__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dedication_Recipient_Email_Address__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dedication_Recipient_First_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dedication_Recipient_First_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dedication_Recipient_Last_Name__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dedication_Recipient_Last_Name__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dedication_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dedication_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Events"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fiscal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fiscal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fiscalQuarter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FiscalQuarter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fiscalYear");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FiscalYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ForecastCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastCategoryName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ForecastCategoryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fund__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fund__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gift_Aid__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Gift_Aid__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gift_Aided_Amount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Gift_Aided_Amount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grant_Amount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Grant_Amount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasOpportunityLineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HasOpportunityLineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("histories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Histories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDeleted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDeleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isWon");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsWon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastActivityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastActivityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LeadSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matching_Amount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Matching_Amount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matching_Close_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Matching_Close_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matching_Status__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Matching_Status__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matching__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Matching__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("membership_End_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Membership_End_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("membership_Length__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Membership_Length__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("membership_Start_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Membership_Start_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notesAndAttachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NotesAndAttachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openActivities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpenActivities"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityCompetitors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityCompetitors"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityContactRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityContactRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityHistories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityHistories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityLineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityLineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityPartnersFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityPartnersFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OwnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partners");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Partners"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Payment_Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pledge__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pledge__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pledge__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pledge__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pledges__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricebook2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pricebook2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pricebook2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricebook2Id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pricebook2Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("probability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Probability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processInstances");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstances"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processSteps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessSteps"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("program_Designation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Program_Designation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurring_Donation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Recurring_Donation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurring_Donation__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Recurring_Donation__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Recurring_Donation__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reporting_Deadline__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reporting_Deadline__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reporting_Requirements__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reporting_Requirements__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shares");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Shares"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stageName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "StageName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemModstamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SystemModstamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tasks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_Amount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_Amount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
