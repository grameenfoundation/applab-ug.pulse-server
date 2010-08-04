/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class User  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String accountId;

    private java.lang.String alias;

    private java.lang.String callCenterId;

    private java.lang.String city;

    private java.lang.String communityNickname;

    private java.lang.String companyName;

    private com.sforce.soap.enterprise.sobject.Contact contact;

    private java.lang.String contactId;

    private com.sforce.soap.enterprise.QueryResult contractsSigned;

    private java.lang.String country;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String delegatedApproverId;

    private com.sforce.soap.enterprise.QueryResult delegatedUsers;

    private java.lang.String department;

    private java.lang.String division;

    private java.lang.String email;

    private java.lang.String emailEncodingKey;

    private java.lang.String employeeNumber;

    private java.lang.String extension;

    private java.lang.String fax;

    private java.lang.String firstName;

    private java.lang.Boolean forecastEnabled;

    private java.lang.Boolean isActive;

    private java.lang.String languageLocaleKey;

    private java.util.Calendar lastLoginDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String lastName;

    private java.lang.String localeSidKey;

    private com.sforce.soap.enterprise.sobject.User manager;

    private java.lang.String managerId;

    private java.lang.String mobilePhone;

    private java.lang.String name;

    private java.lang.String nonprofit_Template_Version__c;

    private java.util.Calendar offlinePdaTrialExpirationDate;

    private java.util.Calendar offlineTrialExpirationDate;

    private java.lang.String phone;

    private java.lang.String postalCode;

    private com.sforce.soap.enterprise.sobject.Profile profile;

    private java.lang.String profileId;

    private java.lang.Boolean receivesAdminInfoEmails;

    private java.lang.Boolean receivesInfoEmails;

    private java.lang.String state;

    private java.lang.String street;

    private java.util.Calendar systemModstamp;

    private java.lang.String timeZoneSidKey;

    private java.lang.String title;

    private java.lang.Boolean userPermissionsAvantgoUser;

    private java.lang.Boolean userPermissionsCallCenterAutoLogin;

    private java.lang.Boolean userPermissionsMarketingUser;

    private java.lang.Boolean userPermissionsMobileUser;

    private java.lang.Boolean userPermissionsOfflineUser;

    private java.lang.Boolean userPermissionsSFContentUser;

    private java.lang.Boolean userPermissionsWirelessUser;

    private com.sforce.soap.enterprise.QueryResult userPreferences;

    private java.lang.Boolean userPreferencesActivityRemindersPopup;

    private java.lang.Boolean userPreferencesApexPagesDeveloperMode;

    private java.lang.Boolean userPreferencesEventRemindersCheckboxDefault;

    private java.lang.Boolean userPreferencesReminderSoundOff;

    private java.lang.Boolean userPreferencesTaskRemindersCheckboxDefault;

    private com.sforce.soap.enterprise.sobject.UserRole userRole;

    private java.lang.String userRoleId;

    private java.lang.String userType;

    private java.lang.String username;

    public User() {
    }

    public User(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String accountId,
           java.lang.String alias,
           java.lang.String callCenterId,
           java.lang.String city,
           java.lang.String communityNickname,
           java.lang.String companyName,
           com.sforce.soap.enterprise.sobject.Contact contact,
           java.lang.String contactId,
           com.sforce.soap.enterprise.QueryResult contractsSigned,
           java.lang.String country,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String delegatedApproverId,
           com.sforce.soap.enterprise.QueryResult delegatedUsers,
           java.lang.String department,
           java.lang.String division,
           java.lang.String email,
           java.lang.String emailEncodingKey,
           java.lang.String employeeNumber,
           java.lang.String extension,
           java.lang.String fax,
           java.lang.String firstName,
           java.lang.Boolean forecastEnabled,
           java.lang.Boolean isActive,
           java.lang.String languageLocaleKey,
           java.util.Calendar lastLoginDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String lastName,
           java.lang.String localeSidKey,
           com.sforce.soap.enterprise.sobject.User manager,
           java.lang.String managerId,
           java.lang.String mobilePhone,
           java.lang.String name,
           java.lang.String nonprofit_Template_Version__c,
           java.util.Calendar offlinePdaTrialExpirationDate,
           java.util.Calendar offlineTrialExpirationDate,
           java.lang.String phone,
           java.lang.String postalCode,
           com.sforce.soap.enterprise.sobject.Profile profile,
           java.lang.String profileId,
           java.lang.Boolean receivesAdminInfoEmails,
           java.lang.Boolean receivesInfoEmails,
           java.lang.String state,
           java.lang.String street,
           java.util.Calendar systemModstamp,
           java.lang.String timeZoneSidKey,
           java.lang.String title,
           java.lang.Boolean userPermissionsAvantgoUser,
           java.lang.Boolean userPermissionsCallCenterAutoLogin,
           java.lang.Boolean userPermissionsMarketingUser,
           java.lang.Boolean userPermissionsMobileUser,
           java.lang.Boolean userPermissionsOfflineUser,
           java.lang.Boolean userPermissionsSFContentUser,
           java.lang.Boolean userPermissionsWirelessUser,
           com.sforce.soap.enterprise.QueryResult userPreferences,
           java.lang.Boolean userPreferencesActivityRemindersPopup,
           java.lang.Boolean userPreferencesApexPagesDeveloperMode,
           java.lang.Boolean userPreferencesEventRemindersCheckboxDefault,
           java.lang.Boolean userPreferencesReminderSoundOff,
           java.lang.Boolean userPreferencesTaskRemindersCheckboxDefault,
           com.sforce.soap.enterprise.sobject.UserRole userRole,
           java.lang.String userRoleId,
           java.lang.String userType,
           java.lang.String username) {
        super(
            fieldsToNull,
            id);
        this.accountId = accountId;
        this.alias = alias;
        this.callCenterId = callCenterId;
        this.city = city;
        this.communityNickname = communityNickname;
        this.companyName = companyName;
        this.contact = contact;
        this.contactId = contactId;
        this.contractsSigned = contractsSigned;
        this.country = country;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.delegatedApproverId = delegatedApproverId;
        this.delegatedUsers = delegatedUsers;
        this.department = department;
        this.division = division;
        this.email = email;
        this.emailEncodingKey = emailEncodingKey;
        this.employeeNumber = employeeNumber;
        this.extension = extension;
        this.fax = fax;
        this.firstName = firstName;
        this.forecastEnabled = forecastEnabled;
        this.isActive = isActive;
        this.languageLocaleKey = languageLocaleKey;
        this.lastLoginDate = lastLoginDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.lastName = lastName;
        this.localeSidKey = localeSidKey;
        this.manager = manager;
        this.managerId = managerId;
        this.mobilePhone = mobilePhone;
        this.name = name;
        this.nonprofit_Template_Version__c = nonprofit_Template_Version__c;
        this.offlinePdaTrialExpirationDate = offlinePdaTrialExpirationDate;
        this.offlineTrialExpirationDate = offlineTrialExpirationDate;
        this.phone = phone;
        this.postalCode = postalCode;
        this.profile = profile;
        this.profileId = profileId;
        this.receivesAdminInfoEmails = receivesAdminInfoEmails;
        this.receivesInfoEmails = receivesInfoEmails;
        this.state = state;
        this.street = street;
        this.systemModstamp = systemModstamp;
        this.timeZoneSidKey = timeZoneSidKey;
        this.title = title;
        this.userPermissionsAvantgoUser = userPermissionsAvantgoUser;
        this.userPermissionsCallCenterAutoLogin = userPermissionsCallCenterAutoLogin;
        this.userPermissionsMarketingUser = userPermissionsMarketingUser;
        this.userPermissionsMobileUser = userPermissionsMobileUser;
        this.userPermissionsOfflineUser = userPermissionsOfflineUser;
        this.userPermissionsSFContentUser = userPermissionsSFContentUser;
        this.userPermissionsWirelessUser = userPermissionsWirelessUser;
        this.userPreferences = userPreferences;
        this.userPreferencesActivityRemindersPopup = userPreferencesActivityRemindersPopup;
        this.userPreferencesApexPagesDeveloperMode = userPreferencesApexPagesDeveloperMode;
        this.userPreferencesEventRemindersCheckboxDefault = userPreferencesEventRemindersCheckboxDefault;
        this.userPreferencesReminderSoundOff = userPreferencesReminderSoundOff;
        this.userPreferencesTaskRemindersCheckboxDefault = userPreferencesTaskRemindersCheckboxDefault;
        this.userRole = userRole;
        this.userRoleId = userRoleId;
        this.userType = userType;
        this.username = username;
    }


    /**
     * Gets the accountId value for this User.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this User.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the alias value for this User.
     * 
     * @return alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this User.
     * 
     * @param alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the callCenterId value for this User.
     * 
     * @return callCenterId
     */
    public java.lang.String getCallCenterId() {
        return callCenterId;
    }


    /**
     * Sets the callCenterId value for this User.
     * 
     * @param callCenterId
     */
    public void setCallCenterId(java.lang.String callCenterId) {
        this.callCenterId = callCenterId;
    }


    /**
     * Gets the city value for this User.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this User.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the communityNickname value for this User.
     * 
     * @return communityNickname
     */
    public java.lang.String getCommunityNickname() {
        return communityNickname;
    }


    /**
     * Sets the communityNickname value for this User.
     * 
     * @param communityNickname
     */
    public void setCommunityNickname(java.lang.String communityNickname) {
        this.communityNickname = communityNickname;
    }


    /**
     * Gets the companyName value for this User.
     * 
     * @return companyName
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this User.
     * 
     * @param companyName
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the contact value for this User.
     * 
     * @return contact
     */
    public com.sforce.soap.enterprise.sobject.Contact getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this User.
     * 
     * @param contact
     */
    public void setContact(com.sforce.soap.enterprise.sobject.Contact contact) {
        this.contact = contact;
    }


    /**
     * Gets the contactId value for this User.
     * 
     * @return contactId
     */
    public java.lang.String getContactId() {
        return contactId;
    }


    /**
     * Sets the contactId value for this User.
     * 
     * @param contactId
     */
    public void setContactId(java.lang.String contactId) {
        this.contactId = contactId;
    }


    /**
     * Gets the contractsSigned value for this User.
     * 
     * @return contractsSigned
     */
    public com.sforce.soap.enterprise.QueryResult getContractsSigned() {
        return contractsSigned;
    }


    /**
     * Sets the contractsSigned value for this User.
     * 
     * @param contractsSigned
     */
    public void setContractsSigned(com.sforce.soap.enterprise.QueryResult contractsSigned) {
        this.contractsSigned = contractsSigned;
    }


    /**
     * Gets the country value for this User.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this User.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the createdBy value for this User.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this User.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this User.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this User.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this User.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this User.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the delegatedApproverId value for this User.
     * 
     * @return delegatedApproverId
     */
    public java.lang.String getDelegatedApproverId() {
        return delegatedApproverId;
    }


    /**
     * Sets the delegatedApproverId value for this User.
     * 
     * @param delegatedApproverId
     */
    public void setDelegatedApproverId(java.lang.String delegatedApproverId) {
        this.delegatedApproverId = delegatedApproverId;
    }


    /**
     * Gets the delegatedUsers value for this User.
     * 
     * @return delegatedUsers
     */
    public com.sforce.soap.enterprise.QueryResult getDelegatedUsers() {
        return delegatedUsers;
    }


    /**
     * Sets the delegatedUsers value for this User.
     * 
     * @param delegatedUsers
     */
    public void setDelegatedUsers(com.sforce.soap.enterprise.QueryResult delegatedUsers) {
        this.delegatedUsers = delegatedUsers;
    }


    /**
     * Gets the department value for this User.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this User.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the division value for this User.
     * 
     * @return division
     */
    public java.lang.String getDivision() {
        return division;
    }


    /**
     * Sets the division value for this User.
     * 
     * @param division
     */
    public void setDivision(java.lang.String division) {
        this.division = division;
    }


    /**
     * Gets the email value for this User.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this User.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the emailEncodingKey value for this User.
     * 
     * @return emailEncodingKey
     */
    public java.lang.String getEmailEncodingKey() {
        return emailEncodingKey;
    }


    /**
     * Sets the emailEncodingKey value for this User.
     * 
     * @param emailEncodingKey
     */
    public void setEmailEncodingKey(java.lang.String emailEncodingKey) {
        this.emailEncodingKey = emailEncodingKey;
    }


    /**
     * Gets the employeeNumber value for this User.
     * 
     * @return employeeNumber
     */
    public java.lang.String getEmployeeNumber() {
        return employeeNumber;
    }


    /**
     * Sets the employeeNumber value for this User.
     * 
     * @param employeeNumber
     */
    public void setEmployeeNumber(java.lang.String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }


    /**
     * Gets the extension value for this User.
     * 
     * @return extension
     */
    public java.lang.String getExtension() {
        return extension;
    }


    /**
     * Sets the extension value for this User.
     * 
     * @param extension
     */
    public void setExtension(java.lang.String extension) {
        this.extension = extension;
    }


    /**
     * Gets the fax value for this User.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this User.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the firstName value for this User.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this User.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the forecastEnabled value for this User.
     * 
     * @return forecastEnabled
     */
    public java.lang.Boolean getForecastEnabled() {
        return forecastEnabled;
    }


    /**
     * Sets the forecastEnabled value for this User.
     * 
     * @param forecastEnabled
     */
    public void setForecastEnabled(java.lang.Boolean forecastEnabled) {
        this.forecastEnabled = forecastEnabled;
    }


    /**
     * Gets the isActive value for this User.
     * 
     * @return isActive
     */
    public java.lang.Boolean getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this User.
     * 
     * @param isActive
     */
    public void setIsActive(java.lang.Boolean isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the languageLocaleKey value for this User.
     * 
     * @return languageLocaleKey
     */
    public java.lang.String getLanguageLocaleKey() {
        return languageLocaleKey;
    }


    /**
     * Sets the languageLocaleKey value for this User.
     * 
     * @param languageLocaleKey
     */
    public void setLanguageLocaleKey(java.lang.String languageLocaleKey) {
        this.languageLocaleKey = languageLocaleKey;
    }


    /**
     * Gets the lastLoginDate value for this User.
     * 
     * @return lastLoginDate
     */
    public java.util.Calendar getLastLoginDate() {
        return lastLoginDate;
    }


    /**
     * Sets the lastLoginDate value for this User.
     * 
     * @param lastLoginDate
     */
    public void setLastLoginDate(java.util.Calendar lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }


    /**
     * Gets the lastModifiedBy value for this User.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this User.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this User.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this User.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this User.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this User.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastName value for this User.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this User.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the localeSidKey value for this User.
     * 
     * @return localeSidKey
     */
    public java.lang.String getLocaleSidKey() {
        return localeSidKey;
    }


    /**
     * Sets the localeSidKey value for this User.
     * 
     * @param localeSidKey
     */
    public void setLocaleSidKey(java.lang.String localeSidKey) {
        this.localeSidKey = localeSidKey;
    }


    /**
     * Gets the manager value for this User.
     * 
     * @return manager
     */
    public com.sforce.soap.enterprise.sobject.User getManager() {
        return manager;
    }


    /**
     * Sets the manager value for this User.
     * 
     * @param manager
     */
    public void setManager(com.sforce.soap.enterprise.sobject.User manager) {
        this.manager = manager;
    }


    /**
     * Gets the managerId value for this User.
     * 
     * @return managerId
     */
    public java.lang.String getManagerId() {
        return managerId;
    }


    /**
     * Sets the managerId value for this User.
     * 
     * @param managerId
     */
    public void setManagerId(java.lang.String managerId) {
        this.managerId = managerId;
    }


    /**
     * Gets the mobilePhone value for this User.
     * 
     * @return mobilePhone
     */
    public java.lang.String getMobilePhone() {
        return mobilePhone;
    }


    /**
     * Sets the mobilePhone value for this User.
     * 
     * @param mobilePhone
     */
    public void setMobilePhone(java.lang.String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }


    /**
     * Gets the name value for this User.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this User.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the nonprofit_Template_Version__c value for this User.
     * 
     * @return nonprofit_Template_Version__c
     */
    public java.lang.String getNonprofit_Template_Version__c() {
        return nonprofit_Template_Version__c;
    }


    /**
     * Sets the nonprofit_Template_Version__c value for this User.
     * 
     * @param nonprofit_Template_Version__c
     */
    public void setNonprofit_Template_Version__c(java.lang.String nonprofit_Template_Version__c) {
        this.nonprofit_Template_Version__c = nonprofit_Template_Version__c;
    }


    /**
     * Gets the offlinePdaTrialExpirationDate value for this User.
     * 
     * @return offlinePdaTrialExpirationDate
     */
    public java.util.Calendar getOfflinePdaTrialExpirationDate() {
        return offlinePdaTrialExpirationDate;
    }


    /**
     * Sets the offlinePdaTrialExpirationDate value for this User.
     * 
     * @param offlinePdaTrialExpirationDate
     */
    public void setOfflinePdaTrialExpirationDate(java.util.Calendar offlinePdaTrialExpirationDate) {
        this.offlinePdaTrialExpirationDate = offlinePdaTrialExpirationDate;
    }


    /**
     * Gets the offlineTrialExpirationDate value for this User.
     * 
     * @return offlineTrialExpirationDate
     */
    public java.util.Calendar getOfflineTrialExpirationDate() {
        return offlineTrialExpirationDate;
    }


    /**
     * Sets the offlineTrialExpirationDate value for this User.
     * 
     * @param offlineTrialExpirationDate
     */
    public void setOfflineTrialExpirationDate(java.util.Calendar offlineTrialExpirationDate) {
        this.offlineTrialExpirationDate = offlineTrialExpirationDate;
    }


    /**
     * Gets the phone value for this User.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this User.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the postalCode value for this User.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this User.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the profile value for this User.
     * 
     * @return profile
     */
    public com.sforce.soap.enterprise.sobject.Profile getProfile() {
        return profile;
    }


    /**
     * Sets the profile value for this User.
     * 
     * @param profile
     */
    public void setProfile(com.sforce.soap.enterprise.sobject.Profile profile) {
        this.profile = profile;
    }


    /**
     * Gets the profileId value for this User.
     * 
     * @return profileId
     */
    public java.lang.String getProfileId() {
        return profileId;
    }


    /**
     * Sets the profileId value for this User.
     * 
     * @param profileId
     */
    public void setProfileId(java.lang.String profileId) {
        this.profileId = profileId;
    }


    /**
     * Gets the receivesAdminInfoEmails value for this User.
     * 
     * @return receivesAdminInfoEmails
     */
    public java.lang.Boolean getReceivesAdminInfoEmails() {
        return receivesAdminInfoEmails;
    }


    /**
     * Sets the receivesAdminInfoEmails value for this User.
     * 
     * @param receivesAdminInfoEmails
     */
    public void setReceivesAdminInfoEmails(java.lang.Boolean receivesAdminInfoEmails) {
        this.receivesAdminInfoEmails = receivesAdminInfoEmails;
    }


    /**
     * Gets the receivesInfoEmails value for this User.
     * 
     * @return receivesInfoEmails
     */
    public java.lang.Boolean getReceivesInfoEmails() {
        return receivesInfoEmails;
    }


    /**
     * Sets the receivesInfoEmails value for this User.
     * 
     * @param receivesInfoEmails
     */
    public void setReceivesInfoEmails(java.lang.Boolean receivesInfoEmails) {
        this.receivesInfoEmails = receivesInfoEmails;
    }


    /**
     * Gets the state value for this User.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this User.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the street value for this User.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this User.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the systemModstamp value for this User.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this User.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the timeZoneSidKey value for this User.
     * 
     * @return timeZoneSidKey
     */
    public java.lang.String getTimeZoneSidKey() {
        return timeZoneSidKey;
    }


    /**
     * Sets the timeZoneSidKey value for this User.
     * 
     * @param timeZoneSidKey
     */
    public void setTimeZoneSidKey(java.lang.String timeZoneSidKey) {
        this.timeZoneSidKey = timeZoneSidKey;
    }


    /**
     * Gets the title value for this User.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this User.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the userPermissionsAvantgoUser value for this User.
     * 
     * @return userPermissionsAvantgoUser
     */
    public java.lang.Boolean getUserPermissionsAvantgoUser() {
        return userPermissionsAvantgoUser;
    }


    /**
     * Sets the userPermissionsAvantgoUser value for this User.
     * 
     * @param userPermissionsAvantgoUser
     */
    public void setUserPermissionsAvantgoUser(java.lang.Boolean userPermissionsAvantgoUser) {
        this.userPermissionsAvantgoUser = userPermissionsAvantgoUser;
    }


    /**
     * Gets the userPermissionsCallCenterAutoLogin value for this User.
     * 
     * @return userPermissionsCallCenterAutoLogin
     */
    public java.lang.Boolean getUserPermissionsCallCenterAutoLogin() {
        return userPermissionsCallCenterAutoLogin;
    }


    /**
     * Sets the userPermissionsCallCenterAutoLogin value for this User.
     * 
     * @param userPermissionsCallCenterAutoLogin
     */
    public void setUserPermissionsCallCenterAutoLogin(java.lang.Boolean userPermissionsCallCenterAutoLogin) {
        this.userPermissionsCallCenterAutoLogin = userPermissionsCallCenterAutoLogin;
    }


    /**
     * Gets the userPermissionsMarketingUser value for this User.
     * 
     * @return userPermissionsMarketingUser
     */
    public java.lang.Boolean getUserPermissionsMarketingUser() {
        return userPermissionsMarketingUser;
    }


    /**
     * Sets the userPermissionsMarketingUser value for this User.
     * 
     * @param userPermissionsMarketingUser
     */
    public void setUserPermissionsMarketingUser(java.lang.Boolean userPermissionsMarketingUser) {
        this.userPermissionsMarketingUser = userPermissionsMarketingUser;
    }


    /**
     * Gets the userPermissionsMobileUser value for this User.
     * 
     * @return userPermissionsMobileUser
     */
    public java.lang.Boolean getUserPermissionsMobileUser() {
        return userPermissionsMobileUser;
    }


    /**
     * Sets the userPermissionsMobileUser value for this User.
     * 
     * @param userPermissionsMobileUser
     */
    public void setUserPermissionsMobileUser(java.lang.Boolean userPermissionsMobileUser) {
        this.userPermissionsMobileUser = userPermissionsMobileUser;
    }


    /**
     * Gets the userPermissionsOfflineUser value for this User.
     * 
     * @return userPermissionsOfflineUser
     */
    public java.lang.Boolean getUserPermissionsOfflineUser() {
        return userPermissionsOfflineUser;
    }


    /**
     * Sets the userPermissionsOfflineUser value for this User.
     * 
     * @param userPermissionsOfflineUser
     */
    public void setUserPermissionsOfflineUser(java.lang.Boolean userPermissionsOfflineUser) {
        this.userPermissionsOfflineUser = userPermissionsOfflineUser;
    }


    /**
     * Gets the userPermissionsSFContentUser value for this User.
     * 
     * @return userPermissionsSFContentUser
     */
    public java.lang.Boolean getUserPermissionsSFContentUser() {
        return userPermissionsSFContentUser;
    }


    /**
     * Sets the userPermissionsSFContentUser value for this User.
     * 
     * @param userPermissionsSFContentUser
     */
    public void setUserPermissionsSFContentUser(java.lang.Boolean userPermissionsSFContentUser) {
        this.userPermissionsSFContentUser = userPermissionsSFContentUser;
    }


    /**
     * Gets the userPermissionsWirelessUser value for this User.
     * 
     * @return userPermissionsWirelessUser
     */
    public java.lang.Boolean getUserPermissionsWirelessUser() {
        return userPermissionsWirelessUser;
    }


    /**
     * Sets the userPermissionsWirelessUser value for this User.
     * 
     * @param userPermissionsWirelessUser
     */
    public void setUserPermissionsWirelessUser(java.lang.Boolean userPermissionsWirelessUser) {
        this.userPermissionsWirelessUser = userPermissionsWirelessUser;
    }


    /**
     * Gets the userPreferences value for this User.
     * 
     * @return userPreferences
     */
    public com.sforce.soap.enterprise.QueryResult getUserPreferences() {
        return userPreferences;
    }


    /**
     * Sets the userPreferences value for this User.
     * 
     * @param userPreferences
     */
    public void setUserPreferences(com.sforce.soap.enterprise.QueryResult userPreferences) {
        this.userPreferences = userPreferences;
    }


    /**
     * Gets the userPreferencesActivityRemindersPopup value for this User.
     * 
     * @return userPreferencesActivityRemindersPopup
     */
    public java.lang.Boolean getUserPreferencesActivityRemindersPopup() {
        return userPreferencesActivityRemindersPopup;
    }


    /**
     * Sets the userPreferencesActivityRemindersPopup value for this User.
     * 
     * @param userPreferencesActivityRemindersPopup
     */
    public void setUserPreferencesActivityRemindersPopup(java.lang.Boolean userPreferencesActivityRemindersPopup) {
        this.userPreferencesActivityRemindersPopup = userPreferencesActivityRemindersPopup;
    }


    /**
     * Gets the userPreferencesApexPagesDeveloperMode value for this User.
     * 
     * @return userPreferencesApexPagesDeveloperMode
     */
    public java.lang.Boolean getUserPreferencesApexPagesDeveloperMode() {
        return userPreferencesApexPagesDeveloperMode;
    }


    /**
     * Sets the userPreferencesApexPagesDeveloperMode value for this User.
     * 
     * @param userPreferencesApexPagesDeveloperMode
     */
    public void setUserPreferencesApexPagesDeveloperMode(java.lang.Boolean userPreferencesApexPagesDeveloperMode) {
        this.userPreferencesApexPagesDeveloperMode = userPreferencesApexPagesDeveloperMode;
    }


    /**
     * Gets the userPreferencesEventRemindersCheckboxDefault value for this User.
     * 
     * @return userPreferencesEventRemindersCheckboxDefault
     */
    public java.lang.Boolean getUserPreferencesEventRemindersCheckboxDefault() {
        return userPreferencesEventRemindersCheckboxDefault;
    }


    /**
     * Sets the userPreferencesEventRemindersCheckboxDefault value for this User.
     * 
     * @param userPreferencesEventRemindersCheckboxDefault
     */
    public void setUserPreferencesEventRemindersCheckboxDefault(java.lang.Boolean userPreferencesEventRemindersCheckboxDefault) {
        this.userPreferencesEventRemindersCheckboxDefault = userPreferencesEventRemindersCheckboxDefault;
    }


    /**
     * Gets the userPreferencesReminderSoundOff value for this User.
     * 
     * @return userPreferencesReminderSoundOff
     */
    public java.lang.Boolean getUserPreferencesReminderSoundOff() {
        return userPreferencesReminderSoundOff;
    }


    /**
     * Sets the userPreferencesReminderSoundOff value for this User.
     * 
     * @param userPreferencesReminderSoundOff
     */
    public void setUserPreferencesReminderSoundOff(java.lang.Boolean userPreferencesReminderSoundOff) {
        this.userPreferencesReminderSoundOff = userPreferencesReminderSoundOff;
    }


    /**
     * Gets the userPreferencesTaskRemindersCheckboxDefault value for this User.
     * 
     * @return userPreferencesTaskRemindersCheckboxDefault
     */
    public java.lang.Boolean getUserPreferencesTaskRemindersCheckboxDefault() {
        return userPreferencesTaskRemindersCheckboxDefault;
    }


    /**
     * Sets the userPreferencesTaskRemindersCheckboxDefault value for this User.
     * 
     * @param userPreferencesTaskRemindersCheckboxDefault
     */
    public void setUserPreferencesTaskRemindersCheckboxDefault(java.lang.Boolean userPreferencesTaskRemindersCheckboxDefault) {
        this.userPreferencesTaskRemindersCheckboxDefault = userPreferencesTaskRemindersCheckboxDefault;
    }


    /**
     * Gets the userRole value for this User.
     * 
     * @return userRole
     */
    public com.sforce.soap.enterprise.sobject.UserRole getUserRole() {
        return userRole;
    }


    /**
     * Sets the userRole value for this User.
     * 
     * @param userRole
     */
    public void setUserRole(com.sforce.soap.enterprise.sobject.UserRole userRole) {
        this.userRole = userRole;
    }


    /**
     * Gets the userRoleId value for this User.
     * 
     * @return userRoleId
     */
    public java.lang.String getUserRoleId() {
        return userRoleId;
    }


    /**
     * Sets the userRoleId value for this User.
     * 
     * @param userRoleId
     */
    public void setUserRoleId(java.lang.String userRoleId) {
        this.userRoleId = userRoleId;
    }


    /**
     * Gets the userType value for this User.
     * 
     * @return userType
     */
    public java.lang.String getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this User.
     * 
     * @param userType
     */
    public void setUserType(java.lang.String userType) {
        this.userType = userType;
    }


    /**
     * Gets the username value for this User.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this User.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              this.alias.equals(other.getAlias()))) &&
            ((this.callCenterId==null && other.getCallCenterId()==null) || 
             (this.callCenterId!=null &&
              this.callCenterId.equals(other.getCallCenterId()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.communityNickname==null && other.getCommunityNickname()==null) || 
             (this.communityNickname!=null &&
              this.communityNickname.equals(other.getCommunityNickname()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.contactId==null && other.getContactId()==null) || 
             (this.contactId!=null &&
              this.contactId.equals(other.getContactId()))) &&
            ((this.contractsSigned==null && other.getContractsSigned()==null) || 
             (this.contractsSigned!=null &&
              this.contractsSigned.equals(other.getContractsSigned()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.delegatedApproverId==null && other.getDelegatedApproverId()==null) || 
             (this.delegatedApproverId!=null &&
              this.delegatedApproverId.equals(other.getDelegatedApproverId()))) &&
            ((this.delegatedUsers==null && other.getDelegatedUsers()==null) || 
             (this.delegatedUsers!=null &&
              this.delegatedUsers.equals(other.getDelegatedUsers()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.division==null && other.getDivision()==null) || 
             (this.division!=null &&
              this.division.equals(other.getDivision()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.emailEncodingKey==null && other.getEmailEncodingKey()==null) || 
             (this.emailEncodingKey!=null &&
              this.emailEncodingKey.equals(other.getEmailEncodingKey()))) &&
            ((this.employeeNumber==null && other.getEmployeeNumber()==null) || 
             (this.employeeNumber!=null &&
              this.employeeNumber.equals(other.getEmployeeNumber()))) &&
            ((this.extension==null && other.getExtension()==null) || 
             (this.extension!=null &&
              this.extension.equals(other.getExtension()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.forecastEnabled==null && other.getForecastEnabled()==null) || 
             (this.forecastEnabled!=null &&
              this.forecastEnabled.equals(other.getForecastEnabled()))) &&
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive()))) &&
            ((this.languageLocaleKey==null && other.getLanguageLocaleKey()==null) || 
             (this.languageLocaleKey!=null &&
              this.languageLocaleKey.equals(other.getLanguageLocaleKey()))) &&
            ((this.lastLoginDate==null && other.getLastLoginDate()==null) || 
             (this.lastLoginDate!=null &&
              this.lastLoginDate.equals(other.getLastLoginDate()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.localeSidKey==null && other.getLocaleSidKey()==null) || 
             (this.localeSidKey!=null &&
              this.localeSidKey.equals(other.getLocaleSidKey()))) &&
            ((this.manager==null && other.getManager()==null) || 
             (this.manager!=null &&
              this.manager.equals(other.getManager()))) &&
            ((this.managerId==null && other.getManagerId()==null) || 
             (this.managerId!=null &&
              this.managerId.equals(other.getManagerId()))) &&
            ((this.mobilePhone==null && other.getMobilePhone()==null) || 
             (this.mobilePhone!=null &&
              this.mobilePhone.equals(other.getMobilePhone()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.nonprofit_Template_Version__c==null && other.getNonprofit_Template_Version__c()==null) || 
             (this.nonprofit_Template_Version__c!=null &&
              this.nonprofit_Template_Version__c.equals(other.getNonprofit_Template_Version__c()))) &&
            ((this.offlinePdaTrialExpirationDate==null && other.getOfflinePdaTrialExpirationDate()==null) || 
             (this.offlinePdaTrialExpirationDate!=null &&
              this.offlinePdaTrialExpirationDate.equals(other.getOfflinePdaTrialExpirationDate()))) &&
            ((this.offlineTrialExpirationDate==null && other.getOfflineTrialExpirationDate()==null) || 
             (this.offlineTrialExpirationDate!=null &&
              this.offlineTrialExpirationDate.equals(other.getOfflineTrialExpirationDate()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.profile==null && other.getProfile()==null) || 
             (this.profile!=null &&
              this.profile.equals(other.getProfile()))) &&
            ((this.profileId==null && other.getProfileId()==null) || 
             (this.profileId!=null &&
              this.profileId.equals(other.getProfileId()))) &&
            ((this.receivesAdminInfoEmails==null && other.getReceivesAdminInfoEmails()==null) || 
             (this.receivesAdminInfoEmails!=null &&
              this.receivesAdminInfoEmails.equals(other.getReceivesAdminInfoEmails()))) &&
            ((this.receivesInfoEmails==null && other.getReceivesInfoEmails()==null) || 
             (this.receivesInfoEmails!=null &&
              this.receivesInfoEmails.equals(other.getReceivesInfoEmails()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.timeZoneSidKey==null && other.getTimeZoneSidKey()==null) || 
             (this.timeZoneSidKey!=null &&
              this.timeZoneSidKey.equals(other.getTimeZoneSidKey()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.userPermissionsAvantgoUser==null && other.getUserPermissionsAvantgoUser()==null) || 
             (this.userPermissionsAvantgoUser!=null &&
              this.userPermissionsAvantgoUser.equals(other.getUserPermissionsAvantgoUser()))) &&
            ((this.userPermissionsCallCenterAutoLogin==null && other.getUserPermissionsCallCenterAutoLogin()==null) || 
             (this.userPermissionsCallCenterAutoLogin!=null &&
              this.userPermissionsCallCenterAutoLogin.equals(other.getUserPermissionsCallCenterAutoLogin()))) &&
            ((this.userPermissionsMarketingUser==null && other.getUserPermissionsMarketingUser()==null) || 
             (this.userPermissionsMarketingUser!=null &&
              this.userPermissionsMarketingUser.equals(other.getUserPermissionsMarketingUser()))) &&
            ((this.userPermissionsMobileUser==null && other.getUserPermissionsMobileUser()==null) || 
             (this.userPermissionsMobileUser!=null &&
              this.userPermissionsMobileUser.equals(other.getUserPermissionsMobileUser()))) &&
            ((this.userPermissionsOfflineUser==null && other.getUserPermissionsOfflineUser()==null) || 
             (this.userPermissionsOfflineUser!=null &&
              this.userPermissionsOfflineUser.equals(other.getUserPermissionsOfflineUser()))) &&
            ((this.userPermissionsSFContentUser==null && other.getUserPermissionsSFContentUser()==null) || 
             (this.userPermissionsSFContentUser!=null &&
              this.userPermissionsSFContentUser.equals(other.getUserPermissionsSFContentUser()))) &&
            ((this.userPermissionsWirelessUser==null && other.getUserPermissionsWirelessUser()==null) || 
             (this.userPermissionsWirelessUser!=null &&
              this.userPermissionsWirelessUser.equals(other.getUserPermissionsWirelessUser()))) &&
            ((this.userPreferences==null && other.getUserPreferences()==null) || 
             (this.userPreferences!=null &&
              this.userPreferences.equals(other.getUserPreferences()))) &&
            ((this.userPreferencesActivityRemindersPopup==null && other.getUserPreferencesActivityRemindersPopup()==null) || 
             (this.userPreferencesActivityRemindersPopup!=null &&
              this.userPreferencesActivityRemindersPopup.equals(other.getUserPreferencesActivityRemindersPopup()))) &&
            ((this.userPreferencesApexPagesDeveloperMode==null && other.getUserPreferencesApexPagesDeveloperMode()==null) || 
             (this.userPreferencesApexPagesDeveloperMode!=null &&
              this.userPreferencesApexPagesDeveloperMode.equals(other.getUserPreferencesApexPagesDeveloperMode()))) &&
            ((this.userPreferencesEventRemindersCheckboxDefault==null && other.getUserPreferencesEventRemindersCheckboxDefault()==null) || 
             (this.userPreferencesEventRemindersCheckboxDefault!=null &&
              this.userPreferencesEventRemindersCheckboxDefault.equals(other.getUserPreferencesEventRemindersCheckboxDefault()))) &&
            ((this.userPreferencesReminderSoundOff==null && other.getUserPreferencesReminderSoundOff()==null) || 
             (this.userPreferencesReminderSoundOff!=null &&
              this.userPreferencesReminderSoundOff.equals(other.getUserPreferencesReminderSoundOff()))) &&
            ((this.userPreferencesTaskRemindersCheckboxDefault==null && other.getUserPreferencesTaskRemindersCheckboxDefault()==null) || 
             (this.userPreferencesTaskRemindersCheckboxDefault!=null &&
              this.userPreferencesTaskRemindersCheckboxDefault.equals(other.getUserPreferencesTaskRemindersCheckboxDefault()))) &&
            ((this.userRole==null && other.getUserRole()==null) || 
             (this.userRole!=null &&
              this.userRole.equals(other.getUserRole()))) &&
            ((this.userRoleId==null && other.getUserRoleId()==null) || 
             (this.userRoleId!=null &&
              this.userRoleId.equals(other.getUserRoleId()))) &&
            ((this.userType==null && other.getUserType()==null) || 
             (this.userType!=null &&
              this.userType.equals(other.getUserType()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername())));
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        if (getCallCenterId() != null) {
            _hashCode += getCallCenterId().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCommunityNickname() != null) {
            _hashCode += getCommunityNickname().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getContactId() != null) {
            _hashCode += getContactId().hashCode();
        }
        if (getContractsSigned() != null) {
            _hashCode += getContractsSigned().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
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
        if (getDelegatedApproverId() != null) {
            _hashCode += getDelegatedApproverId().hashCode();
        }
        if (getDelegatedUsers() != null) {
            _hashCode += getDelegatedUsers().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getDivision() != null) {
            _hashCode += getDivision().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getEmailEncodingKey() != null) {
            _hashCode += getEmailEncodingKey().hashCode();
        }
        if (getEmployeeNumber() != null) {
            _hashCode += getEmployeeNumber().hashCode();
        }
        if (getExtension() != null) {
            _hashCode += getExtension().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getForecastEnabled() != null) {
            _hashCode += getForecastEnabled().hashCode();
        }
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
        }
        if (getLanguageLocaleKey() != null) {
            _hashCode += getLanguageLocaleKey().hashCode();
        }
        if (getLastLoginDate() != null) {
            _hashCode += getLastLoginDate().hashCode();
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
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getLocaleSidKey() != null) {
            _hashCode += getLocaleSidKey().hashCode();
        }
        if (getManager() != null) {
            _hashCode += getManager().hashCode();
        }
        if (getManagerId() != null) {
            _hashCode += getManagerId().hashCode();
        }
        if (getMobilePhone() != null) {
            _hashCode += getMobilePhone().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNonprofit_Template_Version__c() != null) {
            _hashCode += getNonprofit_Template_Version__c().hashCode();
        }
        if (getOfflinePdaTrialExpirationDate() != null) {
            _hashCode += getOfflinePdaTrialExpirationDate().hashCode();
        }
        if (getOfflineTrialExpirationDate() != null) {
            _hashCode += getOfflineTrialExpirationDate().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getProfile() != null) {
            _hashCode += getProfile().hashCode();
        }
        if (getProfileId() != null) {
            _hashCode += getProfileId().hashCode();
        }
        if (getReceivesAdminInfoEmails() != null) {
            _hashCode += getReceivesAdminInfoEmails().hashCode();
        }
        if (getReceivesInfoEmails() != null) {
            _hashCode += getReceivesInfoEmails().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTimeZoneSidKey() != null) {
            _hashCode += getTimeZoneSidKey().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getUserPermissionsAvantgoUser() != null) {
            _hashCode += getUserPermissionsAvantgoUser().hashCode();
        }
        if (getUserPermissionsCallCenterAutoLogin() != null) {
            _hashCode += getUserPermissionsCallCenterAutoLogin().hashCode();
        }
        if (getUserPermissionsMarketingUser() != null) {
            _hashCode += getUserPermissionsMarketingUser().hashCode();
        }
        if (getUserPermissionsMobileUser() != null) {
            _hashCode += getUserPermissionsMobileUser().hashCode();
        }
        if (getUserPermissionsOfflineUser() != null) {
            _hashCode += getUserPermissionsOfflineUser().hashCode();
        }
        if (getUserPermissionsSFContentUser() != null) {
            _hashCode += getUserPermissionsSFContentUser().hashCode();
        }
        if (getUserPermissionsWirelessUser() != null) {
            _hashCode += getUserPermissionsWirelessUser().hashCode();
        }
        if (getUserPreferences() != null) {
            _hashCode += getUserPreferences().hashCode();
        }
        if (getUserPreferencesActivityRemindersPopup() != null) {
            _hashCode += getUserPreferencesActivityRemindersPopup().hashCode();
        }
        if (getUserPreferencesApexPagesDeveloperMode() != null) {
            _hashCode += getUserPreferencesApexPagesDeveloperMode().hashCode();
        }
        if (getUserPreferencesEventRemindersCheckboxDefault() != null) {
            _hashCode += getUserPreferencesEventRemindersCheckboxDefault().hashCode();
        }
        if (getUserPreferencesReminderSoundOff() != null) {
            _hashCode += getUserPreferencesReminderSoundOff().hashCode();
        }
        if (getUserPreferencesTaskRemindersCheckboxDefault() != null) {
            _hashCode += getUserPreferencesTaskRemindersCheckboxDefault().hashCode();
        }
        if (getUserRole() != null) {
            _hashCode += getUserRole().hashCode();
        }
        if (getUserRoleId() != null) {
            _hashCode += getUserRoleId().hashCode();
        }
        if (getUserType() != null) {
            _hashCode += getUserType().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(User.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callCenterId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CallCenterId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communityNickname");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CommunityNickname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContactId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractsSigned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContractsSigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("delegatedApproverId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DelegatedApproverId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delegatedUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DelegatedUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("division");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Division"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailEncodingKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailEncodingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmployeeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extension");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Extension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ForecastEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageLocaleKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LanguageLocaleKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastLoginDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastLoginDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localeSidKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LocaleSidKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Manager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ManagerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobilePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MobilePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("nonprofit_Template_Version__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Nonprofit_Template_Version__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offlinePdaTrialExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OfflinePdaTrialExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offlineTrialExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OfflineTrialExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Profile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Profile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivesAdminInfoEmails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ReceivesAdminInfoEmails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivesInfoEmails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ReceivesInfoEmails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Street"));
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
        elemField.setFieldName("timeZoneSidKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TimeZoneSidKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsAvantgoUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsAvantgoUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsCallCenterAutoLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsCallCenterAutoLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsMarketingUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsMarketingUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsMobileUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsMobileUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsOfflineUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsOfflineUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsSFContentUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsSFContentUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsWirelessUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsWirelessUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferences");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesActivityRemindersPopup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesActivityRemindersPopup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesApexPagesDeveloperMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesApexPagesDeveloperMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesEventRemindersCheckboxDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesEventRemindersCheckboxDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesReminderSoundOff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesReminderSoundOff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesTaskRemindersCheckboxDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesTaskRemindersCheckboxDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserRole"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userRoleId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserRoleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Username"));
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
