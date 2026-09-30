package org.bouncycastle.x509;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.x509.AccessDescription;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AuthorityInformationAccess;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.GeneralSubtree;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.NameConstraints;
import org.bouncycastle.asn1.x509.PolicyInformation;
import org.bouncycastle.asn1.x509.qualified.ETSIQCObjectIdentifiers;
import org.bouncycastle.asn1.x509.qualified.MonetaryValue;
import org.bouncycastle.asn1.x509.qualified.QCStatement;
import org.bouncycastle.asn1.x509.qualified.RFC3739QCObjectIdentifiers;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.LocaleString;
import org.bouncycastle.i18n.filter.TrustedInput;
import org.bouncycastle.i18n.filter.UntrustedInput;
import org.bouncycastle.i18n.filter.UntrustedUrlInput;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidator;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException;
import org.bouncycastle.jce.provider.PKIXPolicyNode;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Objects;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class PKIXCertPathReviewer extends CertPathValidatorUtilities {
    private static final String RESOURCE_NAME = "org.bouncycastle.x509.CertPathReviewerMessages";
    protected CertPath certPath;
    protected List certs;
    protected Date currentDate;
    protected List[] errors;
    private boolean initialized;
    protected int n;
    protected List[] notifications;
    protected PKIXParameters pkixParams;
    protected PolicyNode policyTree;
    protected PublicKey subjectPublicKey;
    protected TrustAnchor trustAnchor;
    protected Date validDate;
    private static final String QC_STATEMENT = Extension.qCStatements.getId();
    private static final String CRL_DIST_POINTS = Extension.cRLDistributionPoints.getId();
    private static final String AUTH_INFO_ACCESS = Extension.authorityInfoAccess.getId();

    public PKIXCertPathReviewer() {
    }

    public PKIXCertPathReviewer(CertPath certPath, PKIXParameters pKIXParameters) throws CertPathReviewerException {
        init(certPath, pKIXParameters);
    }

    private String IPtoString(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr).getHostAddress();
        } catch (Exception unused) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i != bArr.length; i++) {
                stringBuffer.append(Integer.toHexString(bArr[i] & 255));
                stringBuffer.append(' ');
            }
            return stringBuffer.toString();
        }
    }

    private void checkCriticalExtensions() throws CertPathReviewerException, CertPathValidatorException {
        List<PKIXCertPathChecker> certPathCheckers = this.pkixParams.getCertPathCheckers();
        Iterator<PKIXCertPathChecker> it = certPathCheckers.iterator();
        while (it.hasNext()) {
            try {
                try {
                    it.next().init(false);
                } catch (CertPathValidatorException e) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certPathCheckerError", new Object[]{e.getMessage(), e, e.getClass().getName()}), e);
                }
            } catch (CertPathReviewerException e2) {
                addError(e2.getErrorMessage(), e2.getIndex());
                return;
            }
        }
        for (int size = this.certs.size() - 1; size >= 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty()) {
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.KEY_USAGE);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.POLICY_MAPPINGS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.INHIBIT_ANY_POLICY);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.DELTA_CRL_INDICATOR);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.POLICY_CONSTRAINTS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.BASIC_CONSTRAINTS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.SUBJECT_ALTERNATIVE_NAME);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.NAME_CONSTRAINTS);
                if (size == 0) {
                    criticalExtensionOIDs.remove(Extension.extendedKeyUsage.getId());
                }
                String str = QC_STATEMENT;
                if (criticalExtensionOIDs.contains(str) && processQcStatements(x509Certificate, size)) {
                    criticalExtensionOIDs.remove(str);
                }
                Iterator<PKIXCertPathChecker> it2 = certPathCheckers.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().check(x509Certificate, criticalExtensionOIDs);
                    } catch (CertPathValidatorException e3) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.criticalExtensionError", new Object[]{e3.getMessage(), e3, e3.getClass().getName()}), e3.getCause(), this.certPath, size);
                    }
                }
                if (!criticalExtensionOIDs.isEmpty()) {
                    Iterator<String> it3 = criticalExtensionOIDs.iterator();
                    while (it3.hasNext()) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.unknownCriticalExt", new Object[]{new ASN1ObjectIdentifier(it3.next())}), size);
                    }
                }
            }
        }
    }

    private void checkNameConstraints() throws CertPathReviewerException {
        PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
        try {
            for (int size = this.certs.size() - 1; size > 0; size--) {
                X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
                if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate)) {
                    X500Principal subjectPrincipal = CertPathValidatorUtilities.getSubjectPrincipal(x509Certificate);
                    try {
                        ASN1Sequence object = new ASN1InputStream(new ByteArrayInputStream(subjectPrincipal.getEncoded())).readObject();
                        try {
                            pKIXNameConstraintValidator.checkPermittedDN(object);
                            try {
                                pKIXNameConstraintValidator.checkExcludedDN(object);
                                try {
                                    ASN1Sequence extensionValue = CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.SUBJECT_ALTERNATIVE_NAME);
                                    if (extensionValue != null) {
                                        for (int i = 0; i < extensionValue.size(); i++) {
                                            GeneralName generalName = GeneralName.getInstance(extensionValue.getObjectAt(i));
                                            try {
                                                pKIXNameConstraintValidator.checkPermitted(generalName);
                                                pKIXNameConstraintValidator.checkExcluded(generalName);
                                            } catch (PKIXNameConstraintValidatorException e) {
                                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notPermittedEmail", new Object[]{new UntrustedInput(generalName)}), e, this.certPath, size);
                                            }
                                        }
                                    }
                                } catch (AnnotatedException e2) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.subjAltNameExtError"), e2, this.certPath, size);
                                }
                            } catch (PKIXNameConstraintValidatorException e3) {
                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.excludedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e3, this.certPath, size);
                            }
                        } catch (PKIXNameConstraintValidatorException e4) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notPermittedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e4, this.certPath, size);
                        }
                    } catch (IOException e5) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ncSubjectNameError", new Object[]{new UntrustedInput(subjectPrincipal)}), e5, this.certPath, size);
                    }
                }
                try {
                    ASN1Sequence extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.NAME_CONSTRAINTS);
                    if (extensionValue2 != null) {
                        NameConstraints nameConstraints = NameConstraints.getInstance(extensionValue2);
                        GeneralSubtree[] permittedSubtrees = nameConstraints.getPermittedSubtrees();
                        if (permittedSubtrees != null) {
                            pKIXNameConstraintValidator.intersectPermittedSubtree(permittedSubtrees);
                        }
                        GeneralSubtree[] excludedSubtrees = nameConstraints.getExcludedSubtrees();
                        if (excludedSubtrees != null) {
                            for (int i2 = 0; i2 != excludedSubtrees.length; i2++) {
                                pKIXNameConstraintValidator.addExcludedSubtree(excludedSubtrees[i2]);
                            }
                        }
                    }
                } catch (AnnotatedException e6) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ncExtError"), e6, this.certPath, size);
                }
            }
        } catch (CertPathReviewerException e7) {
            addError(e7.getErrorMessage(), e7.getIndex());
        }
    }

    private void checkPathLength() {
        BasicConstraints basicConstraints;
        BigInteger pathLenConstraint;
        int iIntValue;
        int i = this.n;
        int i2 = 0;
        for (int size = this.certs.size() - 1; size > 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate)) {
                if (i <= 0) {
                    addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.pathLengthExtended"));
                }
                i--;
                i2++;
            }
            try {
                basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
            } catch (AnnotatedException unused) {
                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.processLengthConstError"), size);
                basicConstraints = null;
            }
            if (basicConstraints != null && (pathLenConstraint = basicConstraints.getPathLenConstraint()) != null && (iIntValue = pathLenConstraint.intValue()) < i) {
                i = iIntValue;
            }
        }
        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.totalPathLength", new Object[]{Integers.valueOf(i2)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x023a A[Catch: CertPathReviewerException -> 0x05f0, TryCatch #9 {CertPathReviewerException -> 0x05f0, blocks: (B:17:0x006f, B:21:0x007f, B:23:0x008c, B:27:0x009c, B:28:0x00a7, B:30:0x00ad, B:32:0x00ce, B:33:0x00d6, B:35:0x00dc, B:37:0x00e1, B:38:0x00ed, B:42:0x00f9, B:45:0x0100, B:46:0x0109, B:48:0x010f, B:50:0x0119, B:53:0x0120, B:55:0x0124, B:94:0x020b, B:96:0x0211, B:97:0x0214, B:99:0x021a, B:101:0x0226, B:104:0x022e, B:105:0x0231, B:106:0x0234, B:108:0x023a, B:109:0x0243, B:111:0x0249, B:119:0x026c, B:120:0x0278, B:121:0x0279, B:123:0x027d, B:125:0x0285, B:126:0x0289, B:128:0x028f, B:131:0x02b1, B:133:0x02bb, B:134:0x02c0, B:135:0x02cc, B:136:0x02cd, B:137:0x02d9, B:139:0x02dc, B:140:0x02e9, B:142:0x02ef, B:144:0x0315, B:146:0x032d, B:145:0x0324, B:147:0x0334, B:148:0x033a, B:150:0x0340, B:152:0x0348, B:163:0x0372, B:156:0x0350, B:157:0x035c, B:159:0x035e, B:160:0x036d, B:166:0x037b, B:177:0x039a, B:179:0x03a4, B:180:0x03a8, B:182:0x03ae, B:186:0x03bd, B:189:0x03ca, B:192:0x03d7, B:194:0x03e1, B:205:0x041f, B:197:0x03e9, B:198:0x03f7, B:199:0x03f8, B:200:0x0406, B:202:0x0408, B:203:0x0416, B:59:0x0133, B:60:0x0137, B:62:0x013d, B:64:0x0153, B:66:0x015d, B:67:0x0162, B:69:0x0168, B:70:0x0176, B:72:0x017c, B:74:0x0188, B:78:0x0195, B:79:0x019b, B:81:0x01a1, B:86:0x01ba, B:75:0x018b, B:77:0x018f, B:89:0x01ee, B:92:0x01fe, B:93:0x020a, B:207:0x042e, B:208:0x043b, B:209:0x043c, B:213:0x044d, B:215:0x0457, B:216:0x045c, B:218:0x0462, B:221:0x0470, B:228:0x0485, B:305:0x05d5, B:306:0x05e1, B:231:0x0490, B:232:0x049c, B:233:0x049d, B:235:0x04a3, B:237:0x04ab, B:239:0x04b1, B:241:0x04bb, B:242:0x04be, B:244:0x04c4, B:246:0x04d4, B:247:0x04d8, B:249:0x04de, B:250:0x04e6, B:251:0x04e9, B:252:0x04ec, B:253:0x04f0, B:255:0x04f6, B:256:0x0504, B:258:0x050c, B:259:0x050f, B:261:0x0515, B:263:0x0521, B:264:0x0525, B:265:0x0528, B:266:0x052b, B:267:0x0537, B:269:0x053c, B:271:0x0546, B:272:0x0549, B:274:0x054f, B:276:0x055f, B:277:0x0563, B:279:0x0569, B:281:0x0579, B:282:0x057d, B:283:0x0580, B:284:0x0583, B:285:0x0589, B:287:0x058f, B:289:0x05a1, B:292:0x05ab, B:294:0x05b1, B:295:0x05b4, B:297:0x05ba, B:299:0x05c6, B:300:0x05ca, B:301:0x05cd, B:308:0x05e3, B:309:0x05ef), top: B:327:0x006f, inners: #0, #1, #2, #4, #6, #7, #8, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0211 A[Catch: CertPathReviewerException -> 0x05f0, TryCatch #9 {CertPathReviewerException -> 0x05f0, blocks: (B:17:0x006f, B:21:0x007f, B:23:0x008c, B:27:0x009c, B:28:0x00a7, B:30:0x00ad, B:32:0x00ce, B:33:0x00d6, B:35:0x00dc, B:37:0x00e1, B:38:0x00ed, B:42:0x00f9, B:45:0x0100, B:46:0x0109, B:48:0x010f, B:50:0x0119, B:53:0x0120, B:55:0x0124, B:94:0x020b, B:96:0x0211, B:97:0x0214, B:99:0x021a, B:101:0x0226, B:104:0x022e, B:105:0x0231, B:106:0x0234, B:108:0x023a, B:109:0x0243, B:111:0x0249, B:119:0x026c, B:120:0x0278, B:121:0x0279, B:123:0x027d, B:125:0x0285, B:126:0x0289, B:128:0x028f, B:131:0x02b1, B:133:0x02bb, B:134:0x02c0, B:135:0x02cc, B:136:0x02cd, B:137:0x02d9, B:139:0x02dc, B:140:0x02e9, B:142:0x02ef, B:144:0x0315, B:146:0x032d, B:145:0x0324, B:147:0x0334, B:148:0x033a, B:150:0x0340, B:152:0x0348, B:163:0x0372, B:156:0x0350, B:157:0x035c, B:159:0x035e, B:160:0x036d, B:166:0x037b, B:177:0x039a, B:179:0x03a4, B:180:0x03a8, B:182:0x03ae, B:186:0x03bd, B:189:0x03ca, B:192:0x03d7, B:194:0x03e1, B:205:0x041f, B:197:0x03e9, B:198:0x03f7, B:199:0x03f8, B:200:0x0406, B:202:0x0408, B:203:0x0416, B:59:0x0133, B:60:0x0137, B:62:0x013d, B:64:0x0153, B:66:0x015d, B:67:0x0162, B:69:0x0168, B:70:0x0176, B:72:0x017c, B:74:0x0188, B:78:0x0195, B:79:0x019b, B:81:0x01a1, B:86:0x01ba, B:75:0x018b, B:77:0x018f, B:89:0x01ee, B:92:0x01fe, B:93:0x020a, B:207:0x042e, B:208:0x043b, B:209:0x043c, B:213:0x044d, B:215:0x0457, B:216:0x045c, B:218:0x0462, B:221:0x0470, B:228:0x0485, B:305:0x05d5, B:306:0x05e1, B:231:0x0490, B:232:0x049c, B:233:0x049d, B:235:0x04a3, B:237:0x04ab, B:239:0x04b1, B:241:0x04bb, B:242:0x04be, B:244:0x04c4, B:246:0x04d4, B:247:0x04d8, B:249:0x04de, B:250:0x04e6, B:251:0x04e9, B:252:0x04ec, B:253:0x04f0, B:255:0x04f6, B:256:0x0504, B:258:0x050c, B:259:0x050f, B:261:0x0515, B:263:0x0521, B:264:0x0525, B:265:0x0528, B:266:0x052b, B:267:0x0537, B:269:0x053c, B:271:0x0546, B:272:0x0549, B:274:0x054f, B:276:0x055f, B:277:0x0563, B:279:0x0569, B:281:0x0579, B:282:0x057d, B:283:0x0580, B:284:0x0583, B:285:0x0589, B:287:0x058f, B:289:0x05a1, B:292:0x05ab, B:294:0x05b1, B:295:0x05b4, B:297:0x05ba, B:299:0x05c6, B:300:0x05ca, B:301:0x05cd, B:308:0x05e3, B:309:0x05ef), top: B:327:0x006f, inners: #0, #1, #2, #4, #6, #7, #8, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void checkPolicy() throws CertPathReviewerException, ExtCertPathValidatorException {
        int i;
        int i2;
        int i3;
        PKIXPolicyNode pKIXPolicyNodeRemovePolicyNode;
        Set<String> set;
        String str;
        int i4;
        int i5;
        HashSet hashSet;
        String str2;
        int i6;
        int iIntValueExact;
        int iIntValueExact2;
        String str3;
        HashSet hashSet2;
        HashSet hashSet3;
        String id;
        int i7;
        int i8;
        Set<String> criticalExtensionOIDs;
        String str4 = "CertPathReviewer.policyExtError";
        Set<String> initialPolicies = this.pkixParams.getInitialPolicies();
        int i9 = this.n + 1;
        ArrayList[] arrayListArr = new ArrayList[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            arrayListArr[i10] = new ArrayList();
        }
        HashSet hashSet4 = new HashSet();
        hashSet4.add("2.5.29.32.0");
        PKIXPolicyNode pKIXPolicyNode = new PKIXPolicyNode(new ArrayList(), 0, hashSet4, (PolicyNode) null, new HashSet(), "2.5.29.32.0", false);
        arrayListArr[0].add(pKIXPolicyNode);
        if (this.pkixParams.isExplicitPolicyRequired()) {
            i2 = 0;
            i = 1;
        } else {
            i = 1;
            i2 = this.n + 1;
        }
        int i11 = this.pkixParams.isAnyPolicyInhibited() ? 0 : this.n + i;
        int i12 = this.pkixParams.isPolicyMappingInhibited() ? 0 : this.n + i;
        try {
            int size = this.certs.size() - i;
            PKIXPolicyNode pKIXPolicyNodePrepareNextCertB2 = pKIXPolicyNode;
            X509Certificate x509Certificate = null;
            HashSet hashSet5 = null;
            while (size >= 0) {
                int i13 = this.n - size;
                X509Certificate x509Certificate2 = (X509Certificate) this.certs.get(size);
                int i14 = i9;
                try {
                    ASN1Sequence extensionValue = CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                    if (extensionValue == null || pKIXPolicyNodePrepareNextCertB2 == null) {
                        set = initialPolicies;
                        str = str4;
                        i4 = i11;
                        i5 = i12;
                        pKIXPolicyNodePrepareNextCertB2 = pKIXPolicyNodePrepareNextCertB2;
                    } else {
                        Enumeration objects = extensionValue.getObjects();
                        set = initialPolicies;
                        HashSet hashSet6 = new HashSet();
                        while (objects.hasMoreElements()) {
                            PolicyInformation policyInformation = PolicyInformation.getInstance(objects.nextElement());
                            PKIXPolicyNode pKIXPolicyNode2 = pKIXPolicyNodePrepareNextCertB2;
                            ASN1ObjectIdentifier policyIdentifier = policyInformation.getPolicyIdentifier();
                            String str5 = str4;
                            hashSet6.add(policyIdentifier.getId());
                            if (!"2.5.29.32.0".equals(policyIdentifier.getId())) {
                                try {
                                    Set qualifierSet = CertPathValidatorUtilities.getQualifierSet(policyInformation.getPolicyQualifiers());
                                    if (!CertPathValidatorUtilities.processCertD1i(i13, arrayListArr, policyIdentifier, qualifierSet)) {
                                        CertPathValidatorUtilities.processCertD1ii(i13, arrayListArr, policyIdentifier, qualifierSet);
                                    }
                                } catch (CertPathValidatorException e) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyQualifierError"), e, this.certPath, size);
                                }
                            }
                            pKIXPolicyNodePrepareNextCertB2 = pKIXPolicyNode2;
                            str4 = str5;
                        }
                        str = str4;
                        PKIXPolicyNode pKIXPolicyNode3 = pKIXPolicyNodePrepareNextCertB2;
                        if (hashSet5 == null || hashSet5.contains("2.5.29.32.0")) {
                            hashSet2 = hashSet6;
                        } else {
                            hashSet2 = new HashSet();
                            for (Object obj : hashSet5) {
                                if (hashSet6.contains(obj)) {
                                    hashSet2.add(obj);
                                }
                            }
                        }
                        if (i11 > 0 || (i13 < this.n && CertPathValidatorUtilities.isSelfIssued(x509Certificate2))) {
                            Enumeration objects2 = extensionValue.getObjects();
                            while (objects2.hasMoreElements()) {
                                PolicyInformation policyInformation2 = PolicyInformation.getInstance(objects2.nextElement());
                                if ("2.5.29.32.0".equals(policyInformation2.getPolicyIdentifier().getId())) {
                                    try {
                                        Set qualifierSet2 = CertPathValidatorUtilities.getQualifierSet(policyInformation2.getPolicyQualifiers());
                                        ArrayList arrayList = arrayListArr[i13 - 1];
                                        hashSet3 = hashSet2;
                                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                            PKIXPolicyNode pKIXPolicyNode4 = (PKIXPolicyNode) arrayList.get(i15);
                                            for (Object obj2 : pKIXPolicyNode4.getExpectedPolicies()) {
                                                ArrayList arrayList2 = arrayList;
                                                int i16 = i11;
                                                if (obj2 instanceof String) {
                                                    id = (String) obj2;
                                                } else {
                                                    if (obj2 instanceof ASN1ObjectIdentifier) {
                                                        id = ((ASN1ObjectIdentifier) obj2).getId();
                                                    }
                                                    i7 = i12;
                                                    arrayList = arrayList2;
                                                    i11 = i16;
                                                    i12 = i7;
                                                }
                                                Iterator children = pKIXPolicyNode4.getChildren();
                                                boolean z = false;
                                                while (children.hasNext()) {
                                                    Iterator it = children;
                                                    if (id.equals(((PKIXPolicyNode) children.next()).getValidPolicy())) {
                                                        z = true;
                                                    }
                                                    children = it;
                                                }
                                                if (z) {
                                                    i7 = i12;
                                                } else {
                                                    HashSet hashSet7 = new HashSet();
                                                    hashSet7.add(id);
                                                    i7 = i12;
                                                    PKIXPolicyNode pKIXPolicyNode5 = new PKIXPolicyNode(new ArrayList(), i13, hashSet7, pKIXPolicyNode4, qualifierSet2, id, false);
                                                    pKIXPolicyNode4.addChild(pKIXPolicyNode5);
                                                    arrayListArr[i13].add(pKIXPolicyNode5);
                                                }
                                                arrayList = arrayList2;
                                                i11 = i16;
                                                i12 = i7;
                                            }
                                        }
                                        i4 = i11;
                                        i5 = i12;
                                        pKIXPolicyNodePrepareNextCertB2 = pKIXPolicyNode3;
                                        for (i8 = i13 - 1; i8 >= 0; i8--) {
                                            ArrayList arrayList3 = arrayListArr[i8];
                                            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                                PKIXPolicyNode pKIXPolicyNode6 = (PKIXPolicyNode) arrayList3.get(i17);
                                                if (!pKIXPolicyNode6.hasChildren()) {
                                                    PKIXPolicyNode pKIXPolicyNodeRemovePolicyNode2 = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNodePrepareNextCertB2, arrayListArr, pKIXPolicyNode6);
                                                    pKIXPolicyNodePrepareNextCertB2 = pKIXPolicyNodeRemovePolicyNode2;
                                                    if (pKIXPolicyNodeRemovePolicyNode2 == null) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                                        if (criticalExtensionOIDs != null) {
                                            boolean zContains = criticalExtensionOIDs.contains(CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                                            ArrayList arrayList4 = arrayListArr[i13];
                                            for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                                                ((PKIXPolicyNode) arrayList4.get(i18)).setCritical(zContains);
                                            }
                                        }
                                        hashSet5 = hashSet3;
                                    } catch (CertPathValidatorException e2) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyQualifierError"), e2, this.certPath, size);
                                    }
                                }
                            }
                            i4 = i11;
                            i5 = i12;
                            hashSet3 = hashSet2;
                            pKIXPolicyNodePrepareNextCertB2 = pKIXPolicyNode3;
                            while (i8 >= 0) {
                            }
                            criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                            if (criticalExtensionOIDs != null) {
                            }
                            hashSet5 = hashSet3;
                        } else {
                            i4 = i11;
                            i5 = i12;
                            hashSet3 = hashSet2;
                            pKIXPolicyNodePrepareNextCertB2 = pKIXPolicyNode3;
                            while (i8 >= 0) {
                            }
                            criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                            if (criticalExtensionOIDs != null) {
                            }
                            hashSet5 = hashSet3;
                        }
                    }
                    if (extensionValue == null) {
                        pKIXPolicyNodePrepareNextCertB2 = null;
                    }
                    if (i2 <= 0 && pKIXPolicyNodePrepareNextCertB2 == null) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noValidPolicyTree"));
                    }
                    if (i13 != this.n) {
                        try {
                            ASN1Sequence extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.POLICY_MAPPINGS);
                            if (extensionValue2 != null) {
                                ASN1Sequence aSN1Sequence = extensionValue2;
                                int i19 = 0;
                                while (i19 < aSN1Sequence.size()) {
                                    ASN1Sequence objectAt = aSN1Sequence.getObjectAt(i19);
                                    ASN1ObjectIdentifier objectAt2 = objectAt.getObjectAt(0);
                                    ASN1ObjectIdentifier objectAt3 = objectAt.getObjectAt(1);
                                    boolean zEquals = "2.5.29.32.0".equals(objectAt2.getId());
                                    ASN1Sequence aSN1Sequence2 = aSN1Sequence;
                                    if (zEquals) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.invalidPolicyMapping"), this.certPath, size);
                                    }
                                    if ("2.5.29.32.0".equals(objectAt3.getId())) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.invalidPolicyMapping"), this.certPath, size);
                                    }
                                    i19++;
                                    aSN1Sequence = aSN1Sequence2;
                                }
                            }
                            if (extensionValue2 != null) {
                                ASN1Sequence aSN1Sequence3 = extensionValue2;
                                HashMap map = new HashMap();
                                HashSet<String> hashSet8 = new HashSet();
                                int i20 = 0;
                                while (i20 < aSN1Sequence3.size()) {
                                    ASN1Sequence objectAt4 = aSN1Sequence3.getObjectAt(i20);
                                    ASN1Sequence aSN1Sequence4 = aSN1Sequence3;
                                    String id2 = objectAt4.getObjectAt(0).getId();
                                    HashSet hashSet9 = hashSet5;
                                    String id3 = objectAt4.getObjectAt(1).getId();
                                    if (map.containsKey(id2)) {
                                        ((Set) map.get(id2)).add(id3);
                                    } else {
                                        HashSet hashSet10 = new HashSet();
                                        hashSet10.add(id3);
                                        map.put(id2, hashSet10);
                                        hashSet8.add(id2);
                                    }
                                    i20++;
                                    aSN1Sequence3 = aSN1Sequence4;
                                    hashSet5 = hashSet9;
                                }
                                hashSet = hashSet5;
                                for (String str6 : hashSet8) {
                                    if (i5 > 0) {
                                        try {
                                            CertPathValidatorUtilities.prepareNextCertB1(i13, arrayListArr, str6, map, x509Certificate2);
                                            str3 = str;
                                        } catch (CertPathValidatorException e3) {
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyQualifierError"), e3, this.certPath, size);
                                        } catch (AnnotatedException e4) {
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, str), e4, this.certPath, size);
                                        }
                                    } else {
                                        str3 = str;
                                        if (i5 <= 0) {
                                            pKIXPolicyNodePrepareNextCertB2 = CertPathValidatorUtilities.prepareNextCertB2(i13, arrayListArr, str6, pKIXPolicyNodePrepareNextCertB2);
                                        }
                                    }
                                    str = str3;
                                }
                            } else {
                                hashSet = hashSet5;
                            }
                            str2 = str;
                            if (CertPathValidatorUtilities.isSelfIssued(x509Certificate2)) {
                                i6 = i4;
                                i12 = i5;
                            } else {
                                if (i2 != 0) {
                                    i2--;
                                }
                                i12 = i5 != 0 ? i5 - 1 : i5;
                                i6 = i4 != 0 ? i4 - 1 : i4;
                            }
                            try {
                                ASN1Sequence extensionValue3 = CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.POLICY_CONSTRAINTS);
                                if (extensionValue3 != null) {
                                    Enumeration objects3 = extensionValue3.getObjects();
                                    while (objects3.hasMoreElements()) {
                                        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects3.nextElement();
                                        int tagNo = aSN1TaggedObject.getTagNo();
                                        if (tagNo == 0) {
                                            int iIntValueExact3 = ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact();
                                            if (iIntValueExact3 < i2) {
                                                i2 = iIntValueExact3;
                                            }
                                        } else if (tagNo == 1 && (iIntValueExact2 = ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact()) < i12) {
                                            i12 = iIntValueExact2;
                                        }
                                    }
                                }
                                try {
                                    ASN1Integer extensionValue4 = CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.INHIBIT_ANY_POLICY);
                                    if (extensionValue4 != null && (iIntValueExact = extensionValue4.intValueExact()) < i6) {
                                        i6 = iIntValueExact;
                                    }
                                } catch (AnnotatedException unused) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyInhibitExtError"), this.certPath, size);
                                }
                            } catch (AnnotatedException unused2) {
                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyConstExtError"), this.certPath, size);
                            }
                        } catch (AnnotatedException e5) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyMapExtError"), e5, this.certPath, size);
                        }
                    } else {
                        hashSet = hashSet5;
                        str2 = str;
                        i6 = i4;
                        i12 = i5;
                    }
                    size--;
                    x509Certificate = x509Certificate2;
                    str4 = str2;
                    hashSet5 = hashSet;
                    i9 = i14;
                    i11 = i6;
                    initialPolicies = set;
                } catch (AnnotatedException e6) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, str4), e6, this.certPath, size);
                }
            }
            Set<String> set2 = initialPolicies;
            int i21 = i9;
            PKIXPolicyNode pKIXPolicyNode7 = pKIXPolicyNodePrepareNextCertB2;
            if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate) && i2 > 0) {
                i2--;
            }
            try {
                ASN1Sequence extensionValue5 = CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.POLICY_CONSTRAINTS);
                if (extensionValue5 != null) {
                    Enumeration objects4 = extensionValue5.getObjects();
                    int i22 = i2;
                    while (objects4.hasMoreElements()) {
                        ASN1TaggedObject aSN1TaggedObject2 = (ASN1TaggedObject) objects4.nextElement();
                        if (aSN1TaggedObject2.getTagNo() == 0 && ASN1Integer.getInstance(aSN1TaggedObject2, false).intValueExact() == 0) {
                            i22 = 0;
                        }
                    }
                    i3 = 0;
                    i2 = i22;
                } else {
                    i3 = 0;
                }
                if (pKIXPolicyNode7 == null) {
                    if (this.pkixParams.isExplicitPolicyRequired()) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.explicitPolicy"), this.certPath, size);
                    }
                    pKIXPolicyNodeRemovePolicyNode = null;
                } else if (!CertPathValidatorUtilities.isAnyPolicy(set2)) {
                    HashSet<PKIXPolicyNode> hashSet11 = new HashSet();
                    for (int i23 = i3; i23 < i21; i23++) {
                        ArrayList arrayList5 = arrayListArr[i23];
                        for (int i24 = i3; i24 < arrayList5.size(); i24++) {
                            PKIXPolicyNode pKIXPolicyNode8 = (PKIXPolicyNode) arrayList5.get(i24);
                            if ("2.5.29.32.0".equals(pKIXPolicyNode8.getValidPolicy())) {
                                Iterator children2 = pKIXPolicyNode8.getChildren();
                                while (children2.hasNext()) {
                                    PKIXPolicyNode pKIXPolicyNode9 = (PKIXPolicyNode) children2.next();
                                    if (!"2.5.29.32.0".equals(pKIXPolicyNode9.getValidPolicy())) {
                                        hashSet11.add(pKIXPolicyNode9);
                                    }
                                }
                            }
                        }
                    }
                    pKIXPolicyNodeRemovePolicyNode = pKIXPolicyNode7;
                    for (PKIXPolicyNode pKIXPolicyNode10 : hashSet11) {
                        Set<String> set3 = set2;
                        if (!set3.contains(pKIXPolicyNode10.getValidPolicy())) {
                            pKIXPolicyNodeRemovePolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNodeRemovePolicyNode, arrayListArr, pKIXPolicyNode10);
                        }
                        set2 = set3;
                    }
                    if (pKIXPolicyNodeRemovePolicyNode != null) {
                        for (int i25 = this.n - 1; i25 >= 0; i25--) {
                            ArrayList arrayList6 = arrayListArr[i25];
                            for (int i26 = i3; i26 < arrayList6.size(); i26++) {
                                PKIXPolicyNode pKIXPolicyNode11 = (PKIXPolicyNode) arrayList6.get(i26);
                                if (!pKIXPolicyNode11.hasChildren()) {
                                    pKIXPolicyNodeRemovePolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNodeRemovePolicyNode, arrayListArr, pKIXPolicyNode11);
                                }
                            }
                        }
                    }
                } else if (!this.pkixParams.isExplicitPolicyRequired()) {
                    pKIXPolicyNodeRemovePolicyNode = pKIXPolicyNode7;
                } else {
                    if (hashSet5.isEmpty()) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.explicitPolicy"), this.certPath, size);
                    }
                    HashSet hashSet12 = new HashSet();
                    for (int i27 = i3; i27 < i21; i27++) {
                        ArrayList arrayList7 = arrayListArr[i27];
                        for (int i28 = i3; i28 < arrayList7.size(); i28++) {
                            PKIXPolicyNode pKIXPolicyNode12 = (PKIXPolicyNode) arrayList7.get(i28);
                            if ("2.5.29.32.0".equals(pKIXPolicyNode12.getValidPolicy())) {
                                Iterator children3 = pKIXPolicyNode12.getChildren();
                                while (children3.hasNext()) {
                                    hashSet12.add(children3.next());
                                }
                            }
                        }
                    }
                    Iterator it2 = hashSet12.iterator();
                    while (it2.hasNext()) {
                        hashSet5.contains(((PKIXPolicyNode) it2.next()).getValidPolicy());
                    }
                    pKIXPolicyNodeRemovePolicyNode = pKIXPolicyNode7;
                    for (int i29 = this.n - 1; i29 >= 0; i29--) {
                        ArrayList arrayList8 = arrayListArr[i29];
                        for (int i30 = i3; i30 < arrayList8.size(); i30++) {
                            PKIXPolicyNode pKIXPolicyNode13 = (PKIXPolicyNode) arrayList8.get(i30);
                            if (!pKIXPolicyNode13.hasChildren()) {
                                pKIXPolicyNodeRemovePolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNodeRemovePolicyNode, arrayListArr, pKIXPolicyNode13);
                            }
                        }
                    }
                }
                if (i2 <= 0 && pKIXPolicyNodeRemovePolicyNode == null) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.invalidPolicy"));
                }
            } catch (AnnotatedException unused3) {
                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyConstExtError"), this.certPath, size);
            }
        } catch (CertPathReviewerException e7) {
            addError(e7.getErrorMessage(), e7.getIndex());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:58|(2:176|60)(2:64|(2:159|66)(3:71|(2:75|(1:77))|78))|(2:181|79)|84|(17:172|86|(1:88)(1:91)|157|92|(1:94)(1:97)|98|(2:101|99)|188|102|(2:105|103)|163|106|107|155|108|109)(1:115)|(1:119)|120|(14:122|(1:126)|170|127|(2:129|(1:131))(1:132)|135|(2:137|(1:141))|144|174|145|178|146|187|150)(1:142)|143|144|174|145|178|146|187|150) */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03b8, code lost:
    
        r8 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03ba, code lost:
    
        addError(new org.bouncycastle.i18n.ErrorBundle(org.bouncycastle.x509.PKIXCertPathReviewer.RESOURCE_NAME, "CertPathReviewer.pubKeyError"), r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0265 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void checkSignatures() throws Exception {
        TrustAnchor trustAnchor;
        TrustAnchor trustAnchor2;
        X500Principal subjectPrincipal;
        X509Certificate trustedCert;
        PublicKey publicKey;
        int size;
        ErrorBundle errorBundle;
        ErrorBundle errorBundle2;
        X509Certificate x509Certificate;
        int i;
        int i2;
        PublicKey publicKey2;
        X500Principal x500Principal;
        int i3;
        ASN1Primitive extensionValue;
        ASN1Primitive extensionValue2;
        X509Certificate x509Certificate2;
        char c;
        AuthorityKeyIdentifier authorityKeyIdentifier;
        GeneralNames authorityCertIssuer;
        boolean[] keyUsage;
        X509Certificate x509Certificate3;
        Collection trustAnchors;
        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certPathValidDate", new Object[]{new TrustedInput(this.validDate), new TrustedInput(this.currentDate)}));
        try {
            List list = this.certs;
            x509Certificate3 = (X509Certificate) list.get(list.size() - 1);
            trustAnchors = getTrustAnchors(x509Certificate3, this.pkixParams.getTrustAnchors());
        } catch (CertPathReviewerException e) {
            e = e;
            trustAnchor = null;
        } catch (Throwable th) {
            th = th;
            trustAnchor = null;
        }
        if (trustAnchors.size() > 1) {
            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.conflictingTrustAnchors", new Object[]{Integers.valueOf(trustAnchors.size()), new UntrustedInput(x509Certificate3.getIssuerX500Principal())}));
        } else {
            if (!trustAnchors.isEmpty()) {
                trustAnchor = (TrustAnchor) trustAnchors.iterator().next();
                try {
                    try {
                        try {
                            CertPathValidatorUtilities.verifyX509Certificate(x509Certificate3, trustAnchor.getTrustedCert() != null ? trustAnchor.getTrustedCert().getPublicKey() : trustAnchor.getCAPublicKey(), this.pkixParams.getSigProvider());
                        } catch (SignatureException unused) {
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustButInvalidCert"));
                        } catch (Exception unused2) {
                        }
                    } catch (CertPathReviewerException e2) {
                        e = e2;
                        addError(e.getErrorMessage());
                        trustAnchor2 = trustAnchor;
                        if (trustAnchor2 == null) {
                        }
                        if (trustAnchor2 == null) {
                        }
                        X509Certificate x509Certificate4 = trustedCert;
                        X500Principal subjectX500Principal = subjectPrincipal;
                        PublicKey nextWorkingKey = publicKey;
                        size = this.certs.size() - 1;
                        while (size >= 0) {
                        }
                        this.trustAnchor = trustAnchor2;
                        this.subjectPublicKey = nextWorkingKey;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.unknown", new Object[]{new UntrustedInput(th.getMessage()), new UntrustedInput(th)}));
                    trustAnchor2 = trustAnchor;
                    if (trustAnchor2 == null) {
                    }
                    if (trustAnchor2 == null) {
                    }
                    X509Certificate x509Certificate42 = trustedCert;
                    X500Principal subjectX500Principal2 = subjectPrincipal;
                    PublicKey nextWorkingKey2 = publicKey;
                    size = this.certs.size() - 1;
                    while (size >= 0) {
                    }
                    this.trustAnchor = trustAnchor2;
                    this.subjectPublicKey = nextWorkingKey2;
                }
                trustAnchor2 = trustAnchor;
                if (trustAnchor2 == null) {
                    X509Certificate trustedCert2 = trustAnchor2.getTrustedCert();
                    try {
                        subjectPrincipal = trustedCert2 != null ? CertPathValidatorUtilities.getSubjectPrincipal(trustedCert2) : new X500Principal(trustAnchor2.getCAName());
                    } catch (IllegalArgumentException unused3) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustDNInvalid", new Object[]{new UntrustedInput(trustAnchor2.getCAName())}));
                        subjectPrincipal = null;
                    }
                    if (trustedCert2 != null && (keyUsage = trustedCert2.getKeyUsage()) != null && (keyUsage.length <= 5 || !keyUsage[5])) {
                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustKeyUsage"));
                    }
                } else {
                    subjectPrincipal = null;
                }
                if (trustAnchor2 == null) {
                    trustedCert = trustAnchor2.getTrustedCert();
                    publicKey = trustedCert != null ? trustedCert.getPublicKey() : trustAnchor2.getCAPublicKey();
                    try {
                        AlgorithmIdentifier algorithmIdentifier = CertPathValidatorUtilities.getAlgorithmIdentifier(publicKey);
                        algorithmIdentifier.getAlgorithm();
                        algorithmIdentifier.getParameters();
                    } catch (CertPathValidatorException unused4) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustPubKeyError"));
                    }
                } else {
                    trustedCert = null;
                    publicKey = null;
                }
                X509Certificate x509Certificate422 = trustedCert;
                X500Principal subjectX500Principal22 = subjectPrincipal;
                PublicKey nextWorkingKey22 = publicKey;
                size = this.certs.size() - 1;
                while (size >= 0) {
                    int i4 = this.n - size;
                    X509Certificate x509Certificate5 = (X509Certificate) this.certs.get(size);
                    if (nextWorkingKey22 != null) {
                        try {
                            CertPathValidatorUtilities.verifyX509Certificate(x509Certificate5, nextWorkingKey22, this.pkixParams.getSigProvider());
                        } catch (GeneralSecurityException e3) {
                            errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.signatureNotVerified", new Object[]{e3.getMessage(), e3, e3.getClass().getName()});
                            addError(errorBundle, size);
                            x509Certificate5.checkValidity(this.validDate);
                            if (this.pkixParams.isRevocationEnabled()) {
                            }
                            if (x500Principal != null) {
                            }
                            if (i == this.n) {
                            }
                            c = 5;
                            subjectX500Principal22 = x509Certificate2.getSubjectX500Principal();
                            nextWorkingKey22 = CertPathValidatorUtilities.getNextWorkingKey(this.certs, i3);
                            AlgorithmIdentifier algorithmIdentifier2 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey22);
                            algorithmIdentifier2.getAlgorithm();
                            algorithmIdentifier2.getParameters();
                            size = i3 - 1;
                            x509Certificate422 = x509Certificate2;
                        }
                    } else if (CertPathValidatorUtilities.isSelfIssued(x509Certificate5)) {
                        try {
                            CertPathValidatorUtilities.verifyX509Certificate(x509Certificate5, x509Certificate5.getPublicKey(), this.pkixParams.getSigProvider());
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.rootKeyIsValidButNotATrustAnchor"), size);
                        } catch (GeneralSecurityException e4) {
                            errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.signatureNotVerified", new Object[]{e4.getMessage(), e4, e4.getClass().getName()});
                            addError(errorBundle, size);
                            x509Certificate5.checkValidity(this.validDate);
                            if (this.pkixParams.isRevocationEnabled()) {
                            }
                            if (x500Principal != null) {
                            }
                            if (i == this.n) {
                            }
                            c = 5;
                            subjectX500Principal22 = x509Certificate2.getSubjectX500Principal();
                            nextWorkingKey22 = CertPathValidatorUtilities.getNextWorkingKey(this.certs, i3);
                            AlgorithmIdentifier algorithmIdentifier22 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey22);
                            algorithmIdentifier22.getAlgorithm();
                            algorithmIdentifier22.getParameters();
                            size = i3 - 1;
                            x509Certificate422 = x509Certificate2;
                        }
                    } else {
                        ErrorBundle errorBundle3 = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.NoIssuerPublicKey");
                        byte[] extensionValue3 = x509Certificate5.getExtensionValue(Extension.authorityKeyIdentifier.getId());
                        if (extensionValue3 != null && (authorityCertIssuer = (authorityKeyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1OctetString.getInstance(extensionValue3).getOctets())).getAuthorityCertIssuer()) != null) {
                            GeneralName generalName = authorityCertIssuer.getNames()[0];
                            BigInteger authorityCertSerialNumber = authorityKeyIdentifier.getAuthorityCertSerialNumber();
                            if (authorityCertSerialNumber != null) {
                                errorBundle3.setExtraArguments(new Object[]{new LocaleString(RESOURCE_NAME, "missingIssuer"), " \"", generalName, "\" ", new LocaleString(RESOURCE_NAME, "missingSerial"), " ", authorityCertSerialNumber});
                            }
                        }
                        addError(errorBundle3, size);
                    }
                    try {
                        x509Certificate5.checkValidity(this.validDate);
                    } catch (CertificateExpiredException unused5) {
                        errorBundle2 = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certificateExpired", new Object[]{new TrustedInput(x509Certificate5.getNotAfter())});
                        addError(errorBundle2, size);
                        if (this.pkixParams.isRevocationEnabled()) {
                        }
                        if (x500Principal != null) {
                        }
                        if (i == this.n) {
                        }
                        c = 5;
                        subjectX500Principal22 = x509Certificate2.getSubjectX500Principal();
                        nextWorkingKey22 = CertPathValidatorUtilities.getNextWorkingKey(this.certs, i3);
                        AlgorithmIdentifier algorithmIdentifier222 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey22);
                        algorithmIdentifier222.getAlgorithm();
                        algorithmIdentifier222.getParameters();
                        size = i3 - 1;
                        x509Certificate422 = x509Certificate2;
                    } catch (CertificateNotYetValidException unused6) {
                        errorBundle2 = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certificateNotYetValid", new Object[]{new TrustedInput(x509Certificate5.getNotBefore())});
                        addError(errorBundle2, size);
                        if (this.pkixParams.isRevocationEnabled()) {
                        }
                        if (x500Principal != null) {
                        }
                        if (i == this.n) {
                        }
                        c = 5;
                        subjectX500Principal22 = x509Certificate2.getSubjectX500Principal();
                        nextWorkingKey22 = CertPathValidatorUtilities.getNextWorkingKey(this.certs, i3);
                        AlgorithmIdentifier algorithmIdentifier2222 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey22);
                        algorithmIdentifier2222.getAlgorithm();
                        algorithmIdentifier2222.getParameters();
                        size = i3 - 1;
                        x509Certificate422 = x509Certificate2;
                    }
                    if (this.pkixParams.isRevocationEnabled()) {
                        try {
                            extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509Certificate5, CRL_DIST_POINTS);
                        } catch (AnnotatedException unused7) {
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlDistPtExtError"), size);
                        }
                        CRLDistPoint cRLDistPoint = extensionValue2 != null ? CRLDistPoint.getInstance(extensionValue2) : null;
                        try {
                            extensionValue = CertPathValidatorUtilities.getExtensionValue(x509Certificate5, AUTH_INFO_ACCESS);
                        } catch (AnnotatedException unused8) {
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlAuthInfoAccError"), size);
                        }
                        AuthorityInformationAccess authorityInformationAccess = extensionValue != null ? AuthorityInformationAccess.getInstance(extensionValue) : null;
                        Vector cRLDistUrls = getCRLDistUrls(cRLDistPoint);
                        Vector oCSPUrls = getOCSPUrls(authorityInformationAccess);
                        Iterator it = cRLDistUrls.iterator();
                        while (it.hasNext()) {
                            addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlDistPoint", new Object[]{new UntrustedUrlInput(it.next())}), size);
                        }
                        Iterator it2 = oCSPUrls.iterator();
                        while (it2.hasNext()) {
                            addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ocspLocation", new Object[]{new UntrustedUrlInput(it2.next())}), size);
                        }
                        try {
                            x509Certificate = x509Certificate5;
                            i = i4;
                            i2 = size;
                            publicKey2 = nextWorkingKey22;
                            x500Principal = subjectX500Principal22;
                            try {
                                checkRevocation(this.pkixParams, x509Certificate5, this.validDate, x509Certificate422, nextWorkingKey22, cRLDistUrls, oCSPUrls, i2);
                                i3 = i2;
                            } catch (CertPathReviewerException e5) {
                                e = e5;
                                i3 = i2;
                                addError(e.getErrorMessage(), i3);
                                if (x500Principal != null) {
                                    addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certWrongIssuer", new Object[]{x500Principal.getName(), x509Certificate.getIssuerX500Principal().getName()}), i3);
                                }
                                if (i == this.n) {
                                }
                                c = 5;
                                subjectX500Principal22 = x509Certificate2.getSubjectX500Principal();
                                nextWorkingKey22 = CertPathValidatorUtilities.getNextWorkingKey(this.certs, i3);
                                AlgorithmIdentifier algorithmIdentifier22222 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey22);
                                algorithmIdentifier22222.getAlgorithm();
                                algorithmIdentifier22222.getParameters();
                                size = i3 - 1;
                                x509Certificate422 = x509Certificate2;
                            }
                        } catch (CertPathReviewerException e6) {
                            e = e6;
                            x509Certificate = x509Certificate5;
                            i = i4;
                            i2 = size;
                            publicKey2 = nextWorkingKey22;
                            x500Principal = subjectX500Principal22;
                        }
                    } else {
                        x509Certificate = x509Certificate5;
                        i = i4;
                        i3 = size;
                        publicKey2 = nextWorkingKey22;
                        x500Principal = subjectX500Principal22;
                    }
                    if (x500Principal != null && !x509Certificate.getIssuerX500Principal().equals(x500Principal)) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certWrongIssuer", new Object[]{x500Principal.getName(), x509Certificate.getIssuerX500Principal().getName()}), i3);
                    }
                    if (i == this.n) {
                        x509Certificate2 = x509Certificate;
                        if (x509Certificate2 != null && x509Certificate2.getVersion() == 1) {
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCACert"), i3);
                        }
                        try {
                            BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
                            if (basicConstraints == null) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noBasicConstraints"), i3);
                            } else if (!basicConstraints.isCA()) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCACert"), i3);
                            }
                        } catch (AnnotatedException unused9) {
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.errorProcesingBC"), i3);
                        }
                        boolean[] keyUsage2 = x509Certificate2.getKeyUsage();
                        if (keyUsage2 != null) {
                            c = 5;
                            if (keyUsage2.length <= 5 || !keyUsage2[5]) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCertSign"), i3);
                            }
                        }
                        subjectX500Principal22 = x509Certificate2.getSubjectX500Principal();
                        nextWorkingKey22 = CertPathValidatorUtilities.getNextWorkingKey(this.certs, i3);
                        AlgorithmIdentifier algorithmIdentifier222222 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey22);
                        algorithmIdentifier222222.getAlgorithm();
                        algorithmIdentifier222222.getParameters();
                        size = i3 - 1;
                        x509Certificate422 = x509Certificate2;
                    } else {
                        x509Certificate2 = x509Certificate;
                    }
                    c = 5;
                    subjectX500Principal22 = x509Certificate2.getSubjectX500Principal();
                    nextWorkingKey22 = CertPathValidatorUtilities.getNextWorkingKey(this.certs, i3);
                    AlgorithmIdentifier algorithmIdentifier2222222 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey22);
                    algorithmIdentifier2222222.getAlgorithm();
                    algorithmIdentifier2222222.getParameters();
                    size = i3 - 1;
                    x509Certificate422 = x509Certificate2;
                }
                this.trustAnchor = trustAnchor2;
                this.subjectPublicKey = nextWorkingKey22;
            }
            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noTrustAnchorFound", new Object[]{new UntrustedInput(x509Certificate3.getIssuerX500Principal()), Integers.valueOf(this.pkixParams.getTrustAnchors().size())}));
        }
        trustAnchor2 = null;
        if (trustAnchor2 == null) {
        }
        if (trustAnchor2 == null) {
        }
        X509Certificate x509Certificate4222 = trustedCert;
        X500Principal subjectX500Principal222 = subjectPrincipal;
        PublicKey nextWorkingKey222 = publicKey;
        size = this.certs.size() - 1;
        while (size >= 0) {
        }
        this.trustAnchor = trustAnchor2;
        this.subjectPublicKey = nextWorkingKey222;
    }

    private X509CRL getCRL(String str) throws Exception {
        try {
            URL url = new URL(str);
            if (!url.getProtocol().equals("http") && !url.getProtocol().equals("https")) {
                return null;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                return (X509CRL) CertificateFactory.getInstance("X.509", "BC").generateCRL(httpURLConnection.getInputStream());
            }
            throw new Exception(httpURLConnection.getResponseMessage());
        } catch (Exception e) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.loadCrlDistPointError", new Object[]{new UntrustedInput(str), e.getMessage(), e, e.getClass().getName()}));
        }
    }

    private boolean processQcStatements(X509Certificate x509Certificate, int i) {
        ErrorBundle errorBundle;
        try {
            ASN1Sequence extensionValue = CertPathValidatorUtilities.getExtensionValue(x509Certificate, QC_STATEMENT);
            boolean z = false;
            for (int i2 = 0; i2 < extensionValue.size(); i2++) {
                QCStatement qCStatement = QCStatement.getInstance(extensionValue.getObjectAt(i2));
                if (ETSIQCObjectIdentifiers.id_etsi_qcs_QcCompliance.equals(qCStatement.getStatementId())) {
                    errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcEuCompliance");
                } else {
                    if (!RFC3739QCObjectIdentifiers.id_qcs_pkixQCSyntax_v1.equals(qCStatement.getStatementId())) {
                        if (ETSIQCObjectIdentifiers.id_etsi_qcs_QcSSCD.equals(qCStatement.getStatementId())) {
                            errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcSSCD");
                        } else if (ETSIQCObjectIdentifiers.id_etsi_qcs_LimiteValue.equals(qCStatement.getStatementId())) {
                            MonetaryValue monetaryValue = MonetaryValue.getInstance(qCStatement.getStatementInfo());
                            monetaryValue.getCurrency();
                            double dDoubleValue = monetaryValue.getAmount().doubleValue() * Math.pow(10.0d, monetaryValue.getExponent().doubleValue());
                            addNotification(monetaryValue.getCurrency().isAlphabetic() ? new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcLimitValueAlpha", new Object[]{monetaryValue.getCurrency().getAlphabetic(), new TrustedInput(new Double(dDoubleValue)), monetaryValue}) : new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcLimitValueNum", new Object[]{Integers.valueOf(monetaryValue.getCurrency().getNumeric()), new TrustedInput(new Double(dDoubleValue)), monetaryValue}), i);
                        } else {
                            addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcUnknownStatement", new Object[]{qCStatement.getStatementId(), new UntrustedInput(qCStatement)}), i);
                            z = true;
                        }
                    }
                }
                addNotification(errorBundle, i);
            }
            return !z;
        } catch (AnnotatedException unused) {
            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcStatementExtError"), i);
            return false;
        }
    }

    protected void addError(ErrorBundle errorBundle) {
        this.errors[0].add(errorBundle);
    }

    protected void addError(ErrorBundle errorBundle, int i) {
        if (i < -1 || i >= this.n) {
            throw new IndexOutOfBoundsException();
        }
        this.errors[i + 1].add(errorBundle);
    }

    protected void addNotification(ErrorBundle errorBundle) {
        this.notifications[0].add(errorBundle);
    }

    protected void addNotification(ErrorBundle errorBundle, int i) {
        if (i < -1 || i >= this.n) {
            throw new IndexOutOfBoundsException();
        }
        this.notifications[i + 1].add(errorBundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0221  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void checkCRLs(PKIXParameters pKIXParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, Vector vector, int i) throws Exception {
        Iterator it;
        X509CRL x509crl;
        boolean z;
        boolean z2;
        boolean[] keyUsage;
        X509CRL x509crl2;
        Iterator it2;
        boolean z3;
        ErrorBundle errorBundle;
        X509CRLStoreSelector x509CRLStoreSelector = new X509CRLStoreSelector();
        try {
            x509CRLStoreSelector.addIssuerName(CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).getEncoded());
            x509CRLStoreSelector.setCertificateChecking(x509Certificate);
            try {
                Set setFindCRLs = PKIXCRLUtil.findCRLs(x509CRLStoreSelector, pKIXParameters);
                it = setFindCRLs.iterator();
                if (setFindCRLs.isEmpty()) {
                    Iterator it3 = PKIXCRLUtil.findCRLs(new X509CRLStoreSelector(), pKIXParameters).iterator();
                    ArrayList arrayList = new ArrayList();
                    while (it3.hasNext()) {
                        arrayList.add(((X509CRL) it3.next()).getIssuerX500Principal());
                    }
                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCrlInCertstore", new Object[]{new UntrustedInput(x509CRLStoreSelector.getIssuerNames()), new UntrustedInput(arrayList), Integers.valueOf(arrayList.size())}), i);
                }
            } catch (AnnotatedException e) {
                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlExtractionError", new Object[]{e.getCause().getMessage(), e.getCause(), e.getCause().getClass().getName()}), i);
                it = new ArrayList().iterator();
            }
            X509CRL x509crl3 = null;
            while (it.hasNext()) {
                x509crl3 = (X509CRL) it.next();
                Date thisUpdate = x509crl3.getThisUpdate();
                Date nextUpdate = x509crl3.getNextUpdate();
                Object[] objArr = {new TrustedInput(thisUpdate), new TrustedInput(nextUpdate)};
                if (nextUpdate == null || date.before(nextUpdate)) {
                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.localValidCRL", objArr), i);
                    x509crl = x509crl3;
                    z = true;
                    break;
                }
                addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.localInvalidCRL", objArr), i);
            }
            x509crl = x509crl3;
            z = false;
            if (!z) {
                X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
                Iterator it4 = vector.iterator();
                boolean z4 = z;
                while (true) {
                    if (!it4.hasNext()) {
                        z2 = z4;
                        break;
                    }
                    try {
                        String str = (String) it4.next();
                        X509CRL crl = getCRL(str);
                        if (crl != null) {
                            X500Principal issuerX500Principal2 = crl.getIssuerX500Principal();
                            if (issuerX500Principal.equals(issuerX500Principal2)) {
                                x509crl2 = x509crl;
                                it2 = it4;
                                z3 = z4;
                                Date thisUpdate2 = crl.getThisUpdate();
                                Date nextUpdate2 = crl.getNextUpdate();
                                Object[] objArr2 = {new TrustedInput(thisUpdate2), new TrustedInput(nextUpdate2), new UntrustedUrlInput(str)};
                                if (nextUpdate2 != null && !date.before(nextUpdate2)) {
                                    errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.onlineInvalidCRL", objArr2);
                                }
                                try {
                                    addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.onlineValidCRL", objArr2), i);
                                    x509crl = crl;
                                    z2 = true;
                                    break;
                                } catch (CertPathReviewerException e2) {
                                    e = e2;
                                    z4 = true;
                                    addNotification(e.getErrorMessage(), i);
                                    it4 = it2;
                                    x509crl = x509crl2;
                                }
                            } else {
                                x509crl2 = x509crl;
                                try {
                                    it2 = it4;
                                } catch (CertPathReviewerException e3) {
                                    e = e3;
                                    it2 = it4;
                                    z3 = z4;
                                    z4 = z3;
                                    addNotification(e.getErrorMessage(), i);
                                    it4 = it2;
                                    x509crl = x509crl2;
                                }
                                try {
                                    z3 = z4;
                                } catch (CertPathReviewerException e4) {
                                    e = e4;
                                    z3 = z4;
                                    z4 = z3;
                                    addNotification(e.getErrorMessage(), i);
                                    it4 = it2;
                                    x509crl = x509crl2;
                                }
                                try {
                                    errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.onlineCRLWrongCA", new Object[]{new UntrustedInput(issuerX500Principal2.getName()), new UntrustedInput(issuerX500Principal.getName()), new UntrustedUrlInput(str)});
                                } catch (CertPathReviewerException e5) {
                                    e = e5;
                                    z4 = z3;
                                    addNotification(e.getErrorMessage(), i);
                                    it4 = it2;
                                    x509crl = x509crl2;
                                }
                            }
                            addNotification(errorBundle, i);
                        } else {
                            x509crl2 = x509crl;
                            it2 = it4;
                            z3 = z4;
                        }
                        it4 = it2;
                        x509crl = x509crl2;
                        z4 = z3;
                    } catch (CertPathReviewerException e6) {
                        e = e6;
                        x509crl2 = x509crl;
                    }
                }
            } else {
                z2 = z;
            }
            if (x509crl != null) {
                if (x509Certificate2 != null && (keyUsage = x509Certificate2.getKeyUsage()) != null && (keyUsage.length <= 6 || !keyUsage[6])) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noCrlSigningPermited"));
                }
                if (publicKey == null) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlNoIssuerPublicKey"));
                }
                try {
                    x509crl.verify(publicKey, "BC");
                    X509CRLEntry revokedCertificate = x509crl.getRevokedCertificate(x509Certificate.getSerialNumber());
                    if (revokedCertificate == null) {
                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notRevoked"), i);
                    } else if (revokedCertificate.hasExtensions()) {
                        try {
                            ASN1Enumerated aSN1Enumerated = ASN1Enumerated.getInstance(CertPathValidatorUtilities.getExtensionValue(revokedCertificate, Extension.reasonCode.getId()));
                            String str2 = aSN1Enumerated != null ? CertPathValidatorUtilities.crlReasons[aSN1Enumerated.intValueExact()] : null;
                            if (str2 == null) {
                                str2 = CertPathValidatorUtilities.crlReasons[7];
                            }
                            LocaleString localeString = new LocaleString(RESOURCE_NAME, str2);
                            if (!date.before(revokedCertificate.getRevocationDate())) {
                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certRevoked", new Object[]{new TrustedInput(revokedCertificate.getRevocationDate()), localeString}));
                            }
                            addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.revokedAfterValidation", new Object[]{new TrustedInput(revokedCertificate.getRevocationDate()), localeString}), i);
                        } catch (AnnotatedException e7) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlReasonExtError"), e7);
                        }
                    }
                    Date nextUpdate3 = x509crl.getNextUpdate();
                    if (nextUpdate3 != null && !date.before(nextUpdate3)) {
                        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlUpdateAvailable", new Object[]{new TrustedInput(nextUpdate3)}), i);
                    }
                    try {
                        ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl, CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT);
                        try {
                            ASN1Integer extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509crl, CertPathValidatorUtilities.DELTA_CRL_INDICATOR);
                            if (extensionValue2 != null) {
                                X509CRLStoreSelector x509CRLStoreSelector2 = new X509CRLStoreSelector();
                                try {
                                    x509CRLStoreSelector2.addIssuerName(CertPathValidatorUtilities.getIssuerPrincipal(x509crl).getEncoded());
                                    x509CRLStoreSelector2.setMinCRLNumber(extensionValue2.getPositiveValue());
                                    try {
                                        x509CRLStoreSelector2.setMaxCRLNumber(CertPathValidatorUtilities.getExtensionValue(x509crl, CertPathValidatorUtilities.CRL_NUMBER).getPositiveValue().subtract(BigInteger.valueOf(1L)));
                                        try {
                                            Iterator it5 = PKIXCRLUtil.findCRLs(x509CRLStoreSelector2, pKIXParameters).iterator();
                                            while (it5.hasNext()) {
                                                try {
                                                    if (Objects.areEqual(extensionValue, CertPathValidatorUtilities.getExtensionValue((X509CRL) it5.next(), CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT))) {
                                                    }
                                                } catch (AnnotatedException e8) {
                                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.distrPtExtError"), e8);
                                                }
                                            }
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noBaseCRL"));
                                        } catch (AnnotatedException e9) {
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlExtractionError"), e9);
                                        }
                                    } catch (AnnotatedException e10) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlNbrExtError"), e10);
                                    }
                                } catch (IOException e11) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlIssuerException"), e11);
                                }
                            }
                            if (extensionValue != null) {
                                IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(extensionValue);
                                try {
                                    BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
                                    if (issuingDistributionPoint.onlyContainsUserCerts() && basicConstraints != null && basicConstraints.isCA()) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlOnlyUserCert"));
                                    }
                                    if (issuingDistributionPoint.onlyContainsCACerts() && (basicConstraints == null || !basicConstraints.isCA())) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlOnlyCaCert"));
                                    }
                                    if (issuingDistributionPoint.onlyContainsAttributeCerts()) {
                                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlOnlyAttrCert"));
                                    }
                                } catch (AnnotatedException e12) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlBCExtError"), e12);
                                }
                            }
                        } catch (AnnotatedException unused) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.deltaCrlExtError"));
                        }
                    } catch (AnnotatedException unused2) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.distrPtExtError"));
                    }
                } catch (Exception e13) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlVerifyFailed"), e13);
                }
            }
            if (!z2) {
                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.noValidCrlFound"));
            }
        } catch (IOException e14) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.crlIssuerException"), e14);
        }
    }

    protected void checkRevocation(PKIXParameters pKIXParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, Vector vector, Vector vector2, int i) throws Exception {
        checkCRLs(pKIXParameters, x509Certificate, date, x509Certificate2, publicKey, vector, i);
    }

    protected void doChecks() throws Exception {
        if (!this.initialized) {
            throw new IllegalStateException("Object not initialized. Call init() first.");
        }
        if (this.notifications != null) {
            return;
        }
        int i = this.n + 1;
        this.notifications = new List[i];
        this.errors = new List[i];
        int i2 = 0;
        while (true) {
            List[] listArr = this.notifications;
            if (i2 >= listArr.length) {
                checkSignatures();
                checkNameConstraints();
                checkPathLength();
                checkPolicy();
                checkCriticalExtensions();
                return;
            }
            listArr[i2] = new ArrayList();
            this.errors[i2] = new ArrayList();
            i2++;
        }
    }

    protected Vector getCRLDistUrls(CRLDistPoint cRLDistPoint) {
        Vector vector = new Vector();
        if (cRLDistPoint != null) {
            for (DistributionPoint distributionPoint : cRLDistPoint.getDistributionPoints()) {
                DistributionPointName distributionPoint2 = distributionPoint.getDistributionPoint();
                if (distributionPoint2.getType() == 0) {
                    GeneralName[] names = GeneralNames.getInstance(distributionPoint2.getName()).getNames();
                    for (int i = 0; i < names.length; i++) {
                        if (names[i].getTagNo() == 6) {
                            vector.add(names[i].getName().getString());
                        }
                    }
                }
            }
        }
        return vector;
    }

    public CertPath getCertPath() {
        return this.certPath;
    }

    public int getCertPathSize() {
        return this.n;
    }

    public List getErrors(int i) throws Exception {
        doChecks();
        return this.errors[i + 1];
    }

    public List[] getErrors() throws Exception {
        doChecks();
        return this.errors;
    }

    public List getNotifications(int i) throws Exception {
        doChecks();
        return this.notifications[i + 1];
    }

    public List[] getNotifications() throws Exception {
        doChecks();
        return this.notifications;
    }

    protected Vector getOCSPUrls(AuthorityInformationAccess authorityInformationAccess) {
        Vector vector = new Vector();
        if (authorityInformationAccess != null) {
            AccessDescription[] accessDescriptions = authorityInformationAccess.getAccessDescriptions();
            for (int i = 0; i < accessDescriptions.length; i++) {
                if (accessDescriptions[i].getAccessMethod().equals(AccessDescription.id_ad_ocsp)) {
                    GeneralName accessLocation = accessDescriptions[i].getAccessLocation();
                    if (accessLocation.getTagNo() == 6) {
                        vector.add(accessLocation.getName().getString());
                    }
                }
            }
        }
        return vector;
    }

    public PolicyNode getPolicyTree() throws Exception {
        doChecks();
        return this.policyTree;
    }

    public PublicKey getSubjectPublicKey() throws Exception {
        doChecks();
        return this.subjectPublicKey;
    }

    public TrustAnchor getTrustAnchor() throws Exception {
        doChecks();
        return this.trustAnchor;
    }

    protected Collection getTrustAnchors(X509Certificate x509Certificate, Set set) throws CertPathReviewerException, IOException {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).getEncoded());
            byte[] extensionValue = x509Certificate.getExtensionValue(Extension.authorityKeyIdentifier.getId());
            if (extensionValue != null) {
                AuthorityKeyIdentifier authorityKeyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1Primitive.fromByteArray(ASN1Primitive.fromByteArray(extensionValue).getOctets()));
                if (authorityKeyIdentifier.getAuthorityCertSerialNumber() != null) {
                    x509CertSelector.setSerialNumber(authorityKeyIdentifier.getAuthorityCertSerialNumber());
                }
            }
            while (it.hasNext()) {
                TrustAnchor trustAnchor = (TrustAnchor) it.next();
                if (trustAnchor.getTrustedCert() != null) {
                    if (x509CertSelector.match(trustAnchor.getTrustedCert())) {
                        arrayList.add(trustAnchor);
                    }
                } else if (trustAnchor.getCAName() != null && trustAnchor.getCAPublicKey() != null && CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).equals(new X500Principal(trustAnchor.getCAName()))) {
                    arrayList.add(trustAnchor);
                }
            }
            return arrayList;
        } catch (IOException unused) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustAnchorIssuerError"));
        }
    }

    public void init(CertPath certPath, PKIXParameters pKIXParameters) throws CertPathReviewerException {
        if (this.initialized) {
            throw new IllegalStateException("object is already initialized!");
        }
        this.initialized = true;
        if (certPath == null) {
            throw new NullPointerException("certPath was null");
        }
        this.certPath = certPath;
        List<? extends Certificate> certificates = certPath.getCertificates();
        this.certs = certificates;
        this.n = certificates.size();
        if (this.certs.isEmpty()) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.emptyCertPath"));
        }
        this.pkixParams = (PKIXParameters) pKIXParameters.clone();
        Date date = new Date();
        this.currentDate = date;
        this.validDate = CertPathValidatorUtilities.getValidityDate(this.pkixParams, date);
        this.notifications = null;
        this.errors = null;
        this.trustAnchor = null;
        this.subjectPublicKey = null;
        this.policyTree = null;
    }

    public boolean isValidCertPath() throws Exception {
        doChecks();
        int i = 0;
        while (true) {
            List[] listArr = this.errors;
            if (i >= listArr.length) {
                return true;
            }
            if (!listArr[i].isEmpty()) {
                return false;
            }
            i++;
        }
    }
}
