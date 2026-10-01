package org.bouncycastle.jce;

import net.sf.scuba.smartcards.BuildConfig;
import org.bouncycastle.jce.X509LDAPCertStoreParameters;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class X509LDAPCertStoreParameters$Builder {
    private String aACertificateAttribute;
    private String aACertificateSubjectAttributeName;
    private String attributeAuthorityRevocationListAttribute;
    private String attributeAuthorityRevocationListIssuerAttributeName;
    private String attributeCertificateAttributeAttribute;
    private String attributeCertificateAttributeSubjectAttributeName;
    private String attributeCertificateRevocationListAttribute;
    private String attributeCertificateRevocationListIssuerAttributeName;
    private String attributeDescriptorCertificateAttribute;
    private String attributeDescriptorCertificateSubjectAttributeName;
    private String authorityRevocationListAttribute;
    private String authorityRevocationListIssuerAttributeName;
    private String baseDN;
    private String cACertificateAttribute;
    private String cACertificateSubjectAttributeName;
    private String certificateRevocationListAttribute;
    private String certificateRevocationListIssuerAttributeName;
    private String crossCertificateAttribute;
    private String crossCertificateSubjectAttributeName;
    private String deltaRevocationListAttribute;
    private String deltaRevocationListIssuerAttributeName;
    private String ldapAACertificateAttributeName;
    private String ldapAttributeAuthorityRevocationListAttributeName;
    private String ldapAttributeCertificateAttributeAttributeName;
    private String ldapAttributeCertificateRevocationListAttributeName;
    private String ldapAttributeDescriptorCertificateAttributeName;
    private String ldapAuthorityRevocationListAttributeName;
    private String ldapCACertificateAttributeName;
    private String ldapCertificateRevocationListAttributeName;
    private String ldapCrossCertificateAttributeName;
    private String ldapDeltaRevocationListAttributeName;
    private String ldapURL;
    private String ldapUserCertificateAttributeName;
    private String searchForSerialNumberIn;
    private String userCertificateAttribute;
    private String userCertificateSubjectAttributeName;

    public X509LDAPCertStoreParameters$Builder() {
        this("ldap://localhost:389", BuildConfig.FLAVOR);
    }

    public X509LDAPCertStoreParameters$Builder(String str, String str2) {
        this.ldapURL = str;
        if (str2 == null) {
            this.baseDN = BuildConfig.FLAVOR;
        } else {
            this.baseDN = str2;
        }
        this.userCertificateAttribute = "userCertificate";
        this.cACertificateAttribute = "cACertificate";
        this.crossCertificateAttribute = "crossCertificatePair";
        this.certificateRevocationListAttribute = "certificateRevocationList";
        this.deltaRevocationListAttribute = "deltaRevocationList";
        this.authorityRevocationListAttribute = "authorityRevocationList";
        this.attributeCertificateAttributeAttribute = "attributeCertificateAttribute";
        this.aACertificateAttribute = "aACertificate";
        this.attributeDescriptorCertificateAttribute = "attributeDescriptorCertificate";
        this.attributeCertificateRevocationListAttribute = "attributeCertificateRevocationList";
        this.attributeAuthorityRevocationListAttribute = "attributeAuthorityRevocationList";
        this.ldapUserCertificateAttributeName = "cn";
        this.ldapCACertificateAttributeName = "cn ou o";
        this.ldapCrossCertificateAttributeName = "cn ou o";
        this.ldapCertificateRevocationListAttributeName = "cn ou o";
        this.ldapDeltaRevocationListAttributeName = "cn ou o";
        this.ldapAuthorityRevocationListAttributeName = "cn ou o";
        this.ldapAttributeCertificateAttributeAttributeName = "cn";
        this.ldapAACertificateAttributeName = "cn o ou";
        this.ldapAttributeDescriptorCertificateAttributeName = "cn o ou";
        this.ldapAttributeCertificateRevocationListAttributeName = "cn o ou";
        this.ldapAttributeAuthorityRevocationListAttributeName = "cn o ou";
        this.userCertificateSubjectAttributeName = "cn";
        this.cACertificateSubjectAttributeName = "o ou";
        this.crossCertificateSubjectAttributeName = "o ou";
        this.certificateRevocationListIssuerAttributeName = "o ou";
        this.deltaRevocationListIssuerAttributeName = "o ou";
        this.authorityRevocationListIssuerAttributeName = "o ou";
        this.attributeCertificateAttributeSubjectAttributeName = "cn";
        this.aACertificateSubjectAttributeName = "o ou";
        this.attributeDescriptorCertificateSubjectAttributeName = "o ou";
        this.attributeCertificateRevocationListIssuerAttributeName = "o ou";
        this.attributeAuthorityRevocationListIssuerAttributeName = "o ou";
        this.searchForSerialNumberIn = "uid serialNumber cn";
    }

    public X509LDAPCertStoreParameters build() {
        if (this.ldapUserCertificateAttributeName == null || this.ldapCACertificateAttributeName == null || this.ldapCrossCertificateAttributeName == null || this.ldapCertificateRevocationListAttributeName == null || this.ldapDeltaRevocationListAttributeName == null || this.ldapAuthorityRevocationListAttributeName == null || this.ldapAttributeCertificateAttributeAttributeName == null || this.ldapAACertificateAttributeName == null || this.ldapAttributeDescriptorCertificateAttributeName == null || this.ldapAttributeCertificateRevocationListAttributeName == null || this.ldapAttributeAuthorityRevocationListAttributeName == null || this.userCertificateSubjectAttributeName == null || this.cACertificateSubjectAttributeName == null || this.crossCertificateSubjectAttributeName == null || this.certificateRevocationListIssuerAttributeName == null || this.deltaRevocationListIssuerAttributeName == null || this.authorityRevocationListIssuerAttributeName == null || this.attributeCertificateAttributeSubjectAttributeName == null || this.aACertificateSubjectAttributeName == null || this.attributeDescriptorCertificateSubjectAttributeName == null || this.attributeCertificateRevocationListIssuerAttributeName == null || this.attributeAuthorityRevocationListIssuerAttributeName == null) {
            throw new IllegalArgumentException("Necessary parameters not specified.");
        }
        return new X509LDAPCertStoreParameters(this, (X509LDAPCertStoreParameters.1) null);
    }

    public X509LDAPCertStoreParameters$Builder setAACertificateAttribute(String str) {
        this.aACertificateAttribute = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setAACertificateSubjectAttributeName(String str) {
        this.aACertificateSubjectAttributeName = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setAttributeAuthorityRevocationListAttribute(String str) {
        this.attributeAuthorityRevocationListAttribute = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setAttributeAuthorityRevocationListIssuerAttributeName(String str) {
        this.attributeAuthorityRevocationListIssuerAttributeName = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setAttributeCertificateAttributeAttribute(String str) {
        this.attributeCertificateAttributeAttribute = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setAttributeCertificateAttributeSubjectAttributeName(String str) {
        this.attributeCertificateAttributeSubjectAttributeName = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setAttributeCertificateRevocationListAttribute(String str) {
        this.attributeCertificateRevocationListAttribute = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setAttributeCertificateRevocationListIssuerAttributeName(String str) {
        this.attributeCertificateRevocationListIssuerAttributeName = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setAttributeDescriptorCertificateAttribute(String str) {
        this.attributeDescriptorCertificateAttribute = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setAttributeDescriptorCertificateSubjectAttributeName(String str) {
        this.attributeDescriptorCertificateSubjectAttributeName = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setAuthorityRevocationListAttribute(String str) {
        this.authorityRevocationListAttribute = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setAuthorityRevocationListIssuerAttributeName(String str) {
        this.authorityRevocationListIssuerAttributeName = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setCACertificateAttribute(String str) {
        this.cACertificateAttribute = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setCACertificateSubjectAttributeName(String str) {
        this.cACertificateSubjectAttributeName = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setCertificateRevocationListAttribute(String str) {
        this.certificateRevocationListAttribute = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setCertificateRevocationListIssuerAttributeName(String str) {
        this.certificateRevocationListIssuerAttributeName = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setCrossCertificateAttribute(String str) {
        this.crossCertificateAttribute = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setCrossCertificateSubjectAttributeName(String str) {
        this.crossCertificateSubjectAttributeName = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setDeltaRevocationListAttribute(String str) {
        this.deltaRevocationListAttribute = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setDeltaRevocationListIssuerAttributeName(String str) {
        this.deltaRevocationListIssuerAttributeName = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setLdapAACertificateAttributeName(String str) {
        this.ldapAACertificateAttributeName = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setLdapAttributeAuthorityRevocationListAttributeName(String str) {
        this.ldapAttributeAuthorityRevocationListAttributeName = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setLdapAttributeCertificateAttributeAttributeName(String str) {
        this.ldapAttributeCertificateAttributeAttributeName = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setLdapAttributeCertificateRevocationListAttributeName(String str) {
        this.ldapAttributeCertificateRevocationListAttributeName = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setLdapAttributeDescriptorCertificateAttributeName(String str) {
        this.ldapAttributeDescriptorCertificateAttributeName = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setLdapAuthorityRevocationListAttributeName(String str) {
        this.ldapAuthorityRevocationListAttributeName = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setLdapCACertificateAttributeName(String str) {
        this.ldapCACertificateAttributeName = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setLdapCertificateRevocationListAttributeName(String str) {
        this.ldapCertificateRevocationListAttributeName = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setLdapCrossCertificateAttributeName(String str) {
        this.ldapCrossCertificateAttributeName = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setLdapDeltaRevocationListAttributeName(String str) {
        this.ldapDeltaRevocationListAttributeName = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setLdapUserCertificateAttributeName(String str) {
        this.ldapUserCertificateAttributeName = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setSearchForSerialNumberIn(String str) {
        this.searchForSerialNumberIn = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setUserCertificateAttribute(String str) {
        this.userCertificateAttribute = str;
        return this;
    }

    public X509LDAPCertStoreParameters$Builder setUserCertificateSubjectAttributeName(String str) {
        this.userCertificateSubjectAttributeName = str;
        return this;
    }
}
