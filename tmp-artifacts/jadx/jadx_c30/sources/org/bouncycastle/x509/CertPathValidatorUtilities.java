package org.bouncycastle.x509;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.cert.CRLException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyQualifierInfo;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.PolicyInformation;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509Extension;
import org.bouncycastle.jcajce.PKIXCertStoreSelector;
import org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.jce.provider.PKIXPolicyNode;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.StoreException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class CertPathValidatorUtilities {
    protected static final String ANY_POLICY = "2.5.29.32.0";
    protected static final String BASIC_CONSTRAINTS;
    protected static final String CERTIFICATE_POLICIES;
    protected static final String CRL_NUMBER;
    protected static final int CRL_SIGN = 6;
    protected static final String DELTA_CRL_INDICATOR;
    protected static final String INHIBIT_ANY_POLICY;
    protected static final String ISSUING_DISTRIBUTION_POINT;
    protected static final int KEY_CERT_SIGN = 5;
    protected static final String KEY_USAGE;
    protected static final String NAME_CONSTRAINTS;
    protected static final String POLICY_CONSTRAINTS;
    protected static final String POLICY_MAPPINGS;
    protected static final String SUBJECT_ALTERNATIVE_NAME;
    protected static final String[] crlReasons;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static final byte[] $$a = {102, 12, ISOFileInfo.FCP_BYTE, 84};
    private static final int $$b = 81;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private static int onNavigationEvent = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, int i) {
        int i2;
        int i3 = (i * 4) + 4;
        byte[] bArr = $$a;
        int i4 = 105 - (b * 4);
        int i5 = s * 2;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            i4 = i6;
            int i7 = i3;
            int i8 = 0;
            i3++;
            i4 += -i7;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i3];
            i3++;
            i4 += -i7;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    static {
        onExtraCallback = 1;
        onExtraCallbackWithResult();
        CERTIFICATE_POLICIES = Extension.certificatePolicies.getId();
        BASIC_CONSTRAINTS = Extension.basicConstraints.getId();
        POLICY_MAPPINGS = Extension.policyMappings.getId();
        SUBJECT_ALTERNATIVE_NAME = Extension.subjectAlternativeName.getId();
        NAME_CONSTRAINTS = Extension.nameConstraints.getId();
        KEY_USAGE = Extension.keyUsage.getId();
        INHIBIT_ANY_POLICY = Extension.inhibitAnyPolicy.getId();
        ISSUING_DISTRIBUTION_POINT = Extension.issuingDistributionPoint.getId();
        DELTA_CRL_INDICATOR = Extension.deltaCRLIndicator.getId();
        POLICY_CONSTRAINTS = Extension.policyConstraints.getId();
        CRL_NUMBER = Extension.cRLNumber.getId();
        Object[] objArr = new Object[1];
        a(9 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, new char[]{7, 65530, 5, '\n', '\b', 65529, 65530, 65529, 65530, '\b'}, true, Gravity.getAbsoluteGravity(0, 0) + 115, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(7 - (Process.myTid() >> 22), 4 - ((Process.getThreadPriority(0) + 20) >> 6), new char[]{65534, 65535, 7, 65534, 5, 65534, 65531}, false, 119 - MotionEvent.axisFromString(BuildConfig.FLAVOR), objArr2);
        crlReasons = new String[]{"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", strIntern, "cessationOfOperation", "certificateHold", ((String) objArr2[0]).intern(), "removeFromCRL", "privilegeWithdrawn", "aACompromise"};
        int i = onNavigationEvent + 97;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    CertPathValidatorUtilities() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.jce.provider.AnnotatedException */
    protected static Collection findCertificates(PKIXCertStoreSelector pKIXCertStoreSelector, List list) throws AnnotatedException {
        int i = 2 % 2;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (!(!it.hasNext())) {
            int i2 = IAuthTabCallback + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object next = it.next();
            if (next instanceof Store) {
                try {
                    hashSet.addAll(((Store) next).getMatches(pKIXCertStoreSelector));
                    int i4 = IAuthTabCallback + 15;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                } catch (StoreException e) {
                    throw new AnnotatedException("Problem while picking certificates from X.509 store.", e);
                }
            } else {
                try {
                    hashSet.addAll(PKIXCertStoreSelector.getCertificates(pKIXCertStoreSelector, (CertStore) next));
                } catch (CertStoreException e2) {
                    throw new AnnotatedException("Problem while picking certificates from certificate store.", e2);
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.jce.provider.AnnotatedException */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0050 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static Collection findCertificates(X509AttributeCertStoreSelector x509AttributeCertStoreSelector, List list) throws AnnotatedException {
        Object next;
        int i;
        int i2 = 2 % 2;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i3 = IAuthTabCallback + 27;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                next = it.next();
                int i4 = 39 / 0;
                if (next instanceof X509Store) {
                    i = onWarmupCompleted + 43;
                    IAuthTabCallback = i % 128;
                    X509Store x509Store = (X509Store) next;
                    if (i % 2 == 0) {
                        try {
                            hashSet.addAll(x509Store.getMatches(x509AttributeCertStoreSelector));
                            int i5 = 26 / 0;
                        } catch (StoreException e) {
                            throw new AnnotatedException("Problem while picking certificates from X.509 store.", e);
                        }
                    } else {
                        hashSet.addAll(x509Store.getMatches(x509AttributeCertStoreSelector));
                    }
                } else {
                    continue;
                }
            } else {
                next = it.next();
                if (next instanceof X509Store) {
                    i = onWarmupCompleted + 43;
                    IAuthTabCallback = i % 128;
                    X509Store x509Store2 = (X509Store) next;
                    if (i % 2 == 0) {
                    }
                } else {
                    continue;
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.jce.provider.AnnotatedException */
    protected static Collection findCertificates(X509CertStoreSelector x509CertStoreSelector, List list) throws AnnotatedException {
        int i = 2 % 2;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        CertificateFactory certificateFactory = new CertificateFactory();
        while (!(!it.hasNext())) {
            int i2 = IAuthTabCallback + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object next = it.next();
            if (next instanceof Store) {
                try {
                    Iterator it2 = ((Store) next).getMatches(x509CertStoreSelector).iterator();
                    int i4 = IAuthTabCallback + 121;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    while (it2.hasNext()) {
                        int i6 = IAuthTabCallback + 27;
                        onWarmupCompleted = i6 % 128;
                        if (i6 % 2 == 0) {
                            boolean z = it2.next() instanceof Encodable;
                            throw null;
                        }
                        Object next2 = it2.next();
                        if (next2 instanceof Encodable) {
                            next2 = certificateFactory.engineGenerateCertificate(new ByteArrayInputStream(((Encodable) next2).getEncoded()));
                        } else if (!(next2 instanceof Certificate)) {
                            throw new AnnotatedException("Unknown object found in certificate store.");
                        }
                        hashSet.add(next2);
                    }
                } catch (CertificateException e) {
                    throw new AnnotatedException("Problem while extracting certificates from X.509 store.", e);
                } catch (StoreException e2) {
                    throw new AnnotatedException("Problem while picking certificates from X.509 store.", e2);
                } catch (IOException e3) {
                    throw new AnnotatedException("Problem while extracting certificates from X.509 store.", e3);
                }
            } else {
                try {
                    hashSet.addAll(((CertStore) next).getCertificates(x509CertStoreSelector));
                } catch (CertStoreException e4) {
                    throw new AnnotatedException("Problem while picking certificates from certificate store.", e4);
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.jce.exception.ExtCertPathValidatorException */
    protected static AlgorithmIdentifier getAlgorithmIdentifier(PublicKey publicKey) throws CertPathValidatorException, ExtCertPathValidatorException {
        int i = 2 % 2;
        try {
            AlgorithmIdentifier algorithmId = SubjectPublicKeyInfo.getInstance(new ASN1InputStream(publicKey.getEncoded()).readObject()).getAlgorithmId();
            int i2 = onWarmupCompleted + 75;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return algorithmId;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception e) {
            throw new ExtCertPathValidatorException("Subject public key cannot be decoded.", e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.jce.provider.AnnotatedException */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bf, code lost:
    
        if (r2 != 10) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f A[PHI: r1
      0x005f: PHI (r1v9 java.security.cert.X509CRLEntry) = (r1v7 java.security.cert.X509CRLEntry), (r1v8 java.security.cert.X509CRLEntry), (r1v11 java.security.cert.X509CRLEntry) binds: [B:22:0x005d, B:19:0x0056, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static void getCertStatus(Date date, X509CRL x509crl, Object obj, CertStatus certStatus) throws AnnotatedException {
        X509CRLEntry revokedCertificate;
        ASN1Enumerated aSN1Enumerated;
        int i = 2 % 2;
        try {
            int iIntValueExact = 0;
            if (isIndirectCRL(x509crl)) {
                revokedCertificate = x509crl.getRevokedCertificate(getSerialNumber(obj));
                if (revokedCertificate != null) {
                    X500Principal certificateIssuer = revokedCertificate.getCertificateIssuer();
                    if (certificateIssuer == null) {
                        certificateIssuer = getIssuerPrincipal(x509crl);
                        int i2 = IAuthTabCallback + 35;
                        onWarmupCompleted = i2 % 128;
                        int i3 = i2 % 2;
                    }
                    if (!getEncodedIssuerPrincipal(obj).equals(certificateIssuer)) {
                        return;
                    }
                    if (revokedCertificate.hasExtensions()) {
                        aSN1Enumerated = null;
                    } else {
                        try {
                            aSN1Enumerated = ASN1Enumerated.getInstance(getExtensionValue(revokedCertificate, X509Extension.reasonCode.getId()));
                        } catch (Exception e) {
                            throw new AnnotatedException("Reason code CRL entry extension could not be decoded.", e);
                        }
                    }
                    if (aSN1Enumerated != null) {
                        int i4 = IAuthTabCallback + 45;
                        onWarmupCompleted = i4 % 128;
                        if (i4 % 2 == 0) {
                            iIntValueExact = 1;
                        }
                    } else {
                        iIntValueExact = aSN1Enumerated.intValueExact();
                    }
                    if (date.getTime() < revokedCertificate.getRevocationDate().getTime()) {
                        int i5 = IAuthTabCallback;
                        int i6 = i5 + 13;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                        if (iIntValueExact != 0) {
                            int i8 = i5 + 79;
                            onWarmupCompleted = i8 % 128;
                            if (i8 % 2 != 0 ? iIntValueExact != 1 : iIntValueExact != 1) {
                                if (iIntValueExact != 2) {
                                }
                            }
                        }
                    }
                    certStatus.setCertStatus(iIntValueExact);
                    certStatus.setRevocationDate(revokedCertificate.getRevocationDate());
                    return;
                }
            } else if (getEncodedIssuerPrincipal(obj).equals(getIssuerPrincipal(x509crl))) {
                int i9 = IAuthTabCallback + 101;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                BigInteger serialNumber = getSerialNumber(obj);
                if (i10 == 0) {
                    revokedCertificate = x509crl.getRevokedCertificate(serialNumber);
                    int i11 = 87 / 0;
                    if (revokedCertificate != null) {
                        if (revokedCertificate.hasExtensions()) {
                        }
                        if (aSN1Enumerated != null) {
                        }
                        if (date.getTime() < revokedCertificate.getRevocationDate().getTime()) {
                        }
                        certStatus.setCertStatus(iIntValueExact);
                        certStatus.setRevocationDate(revokedCertificate.getRevocationDate());
                        return;
                    }
                } else {
                    revokedCertificate = x509crl.getRevokedCertificate(serialNumber);
                    if (revokedCertificate != null) {
                    }
                }
            }
            int i12 = IAuthTabCallback + 31;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
        } catch (CRLException e2) {
            throw new AnnotatedException("Failed check for indirect CRL.", e2);
        }
    }

    protected static X500Principal getEncodedIssuerPrincipal(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (!(obj instanceof X509Certificate)) {
            return (X500Principal) ((X509AttributeCertificate) obj).getIssuer().getPrincipals()[0];
        }
        X500Principal issuerX500Principal = ((X509Certificate) obj).getIssuerX500Principal();
        int i4 = IAuthTabCallback + 45;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return issuerX500Principal;
    }

    protected static ASN1Primitive getExtensionValue(java.security.cert.X509Extension x509Extension, String str) throws AnnotatedException {
        int i = 2 % 2;
        byte[] extensionValue = x509Extension.getExtensionValue(str);
        if (extensionValue != null) {
            return getObject(str, extensionValue);
        }
        int i2 = onWarmupCompleted + 77;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 79;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    protected static X500Principal getIssuerPrincipal(X509CRL x509crl) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return x509crl.getIssuerX500Principal();
        }
        x509crl.getIssuerX500Principal();
        throw null;
    }

    protected static PublicKey getNextWorkingKey(List list, int i) throws CertPathValidatorException {
        DSAPublicKey dSAPublicKey;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 67;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        PublicKey publicKey = ((Certificate) list.get(i)).getPublicKey();
        if (!(publicKey instanceof DSAPublicKey)) {
            return publicKey;
        }
        DSAPublicKey dSAPublicKey2 = (DSAPublicKey) publicKey;
        if (dSAPublicKey2.getParams() != null) {
            int i5 = IAuthTabCallback + 55;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 15 / 0;
            }
            return dSAPublicKey2;
        }
        do {
            i++;
            if (i >= list.size()) {
                throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
            }
            int i7 = IAuthTabCallback + 101;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            PublicKey publicKey2 = ((X509Certificate) list.get(i)).getPublicKey();
            if (!(publicKey2 instanceof DSAPublicKey)) {
                throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
            }
            int i9 = onWarmupCompleted + 11;
            IAuthTabCallback = i9 % 128;
            dSAPublicKey = (DSAPublicKey) publicKey2;
            if (i9 % 2 != 0) {
                dSAPublicKey.getParams();
                throw null;
            }
        } while (dSAPublicKey.getParams() == null);
        DSAParams params = dSAPublicKey.getParams();
        try {
            return KeyFactory.getInstance("DSA", "BC").generatePublic(new DSAPublicKeySpec(dSAPublicKey2.getY(), params.getP(), params.getQ(), params.getG()));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.jce.provider.AnnotatedException */
    private static ASN1Primitive getObject(String str, byte[] bArr) throws AnnotatedException {
        int i = 2 % 2;
        try {
            ASN1Primitive object = new ASN1InputStream(new ASN1InputStream(bArr).readObject().getOctets()).readObject();
            int i2 = IAuthTabCallback + 81;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 99 / 0;
            }
            return object;
        } catch (Exception e) {
            throw new AnnotatedException("exception processing extension " + str, e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.jce.exception.ExtCertPathValidatorException */
    protected static final Set getQualifierSet(ASN1Sequence aSN1Sequence) throws CertPathValidatorException, ExtCertPathValidatorException {
        int i = 2 % 2;
        HashSet hashSet = new HashSet();
        if (aSN1Sequence != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ASN1OutputStream aSN1OutputStreamCreate = ASN1OutputStream.create(byteArrayOutputStream);
            Enumeration objects = aSN1Sequence.getObjects();
            while (objects.hasMoreElements()) {
                try {
                    aSN1OutputStreamCreate.writeObject((ASN1Encodable) objects.nextElement());
                    hashSet.add(new PolicyQualifierInfo(byteArrayOutputStream.toByteArray()));
                    byteArrayOutputStream.reset();
                    int i2 = onWarmupCompleted + 103;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 5 % 2;
                    }
                } catch (IOException e) {
                    throw new ExtCertPathValidatorException("Policy qualifier info cannot be decoded.", e);
                }
            }
        }
        return hashSet;
    }

    private static BigInteger getSerialNumber(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (!(obj instanceof X509Certificate)) {
            return ((X509AttributeCertificate) obj).getSerialNumber();
        }
        int i5 = i3 + 89;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        BigInteger serialNumber = ((X509Certificate) obj).getSerialNumber();
        if (i6 != 0) {
            int i7 = 81 / 0;
        }
        return serialNumber;
    }

    protected static X500Principal getSubjectPrincipal(X509Certificate x509Certificate) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            x509Certificate.getSubjectX500Principal();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
        int i3 = onWarmupCompleted + 83;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 3 / 0;
        }
        return subjectX500Principal;
    }

    protected static Date getValidityDate(PKIXParameters pKIXParameters, Date date) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Date date2 = pKIXParameters.getDate();
        if (date2 != null) {
            int i4 = IAuthTabCallback + 27;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return date2;
        }
        int i6 = onWarmupCompleted + 21;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return date;
        }
        throw null;
    }

    protected static boolean isAnyPolicy(Set set) {
        int i = 2 % 2;
        if (set != null && !set.contains(ANY_POLICY)) {
            int i2 = IAuthTabCallback + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (!set.isEmpty()) {
                int i4 = onWarmupCompleted + 121;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
        }
        int i6 = onWarmupCompleted + 69;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static boolean isIndirectCRL(X509CRL x509crl) throws CRLException {
        int i = 2 % 2;
        try {
            byte[] extensionValue = x509crl.getExtensionValue(Extension.issuingDistributionPoint.getId());
            if (extensionValue == null) {
                return false;
            }
            if (!IssuingDistributionPoint.getInstance(ASN1OctetString.getInstance(extensionValue).getOctets()).isIndirectCRL()) {
                return false;
            }
            int i2 = onWarmupCompleted + 55;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 73;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return true;
        } catch (Exception e) {
            throw new CRLException("Exception reading IssuingDistributionPoint: " + e);
        }
    }

    protected static boolean isSelfIssued(X509Certificate x509Certificate) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zEquals = x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN());
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        return zEquals;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.jce.exception.ExtCertPathValidatorException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.jce.provider.AnnotatedException */
    protected static void prepareNextCertB1(int i, List[] listArr, String str, Map map, X509Certificate x509Certificate) throws AnnotatedException, CertPathValidatorException, ExtCertPathValidatorException {
        Object obj;
        Set qualifierSet;
        PKIXPolicyNode pKIXPolicyNode;
        int i2 = 2 % 2;
        Iterator it = listArr[i].iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                int i3 = onWarmupCompleted + 105;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                for (PKIXPolicyNode pKIXPolicyNode2 : listArr[i]) {
                    if (ANY_POLICY.equals(pKIXPolicyNode2.getValidPolicy())) {
                        try {
                            Enumeration objects = ASN1Sequence.getInstance(getExtensionValue(x509Certificate, CERTIFICATE_POLICIES)).getObjects();
                            while (true) {
                                if (!objects.hasMoreElements()) {
                                    qualifierSet = null;
                                    break;
                                }
                                try {
                                    PolicyInformation policyInformation = PolicyInformation.getInstance(objects.nextElement());
                                    if (!(!ANY_POLICY.equals(policyInformation.getPolicyIdentifier().getId()))) {
                                        try {
                                            qualifierSet = getQualifierSet(policyInformation.getPolicyQualifiers());
                                            break;
                                        } catch (CertPathValidatorException e) {
                                            throw new ExtCertPathValidatorException("Policy qualifier info set could not be built.", e);
                                        }
                                    }
                                } catch (Exception e2) {
                                    throw new AnnotatedException("Policy information cannot be decoded.", e2);
                                }
                            }
                            boolean zContains = x509Certificate.getCriticalExtensionOIDs() != null ? x509Certificate.getCriticalExtensionOIDs().contains(CERTIFICATE_POLICIES) : false;
                            PKIXPolicyNode parent = pKIXPolicyNode2.getParent();
                            if (ANY_POLICY.equals(parent.getValidPolicy())) {
                                PKIXPolicyNode pKIXPolicyNode3 = new PKIXPolicyNode(new ArrayList(), i, (Set) map.get(str), parent, qualifierSet, str, zContains);
                                parent.addChild(pKIXPolicyNode3);
                                listArr[i].add(pKIXPolicyNode3);
                                int i5 = onWarmupCompleted + 23;
                                IAuthTabCallback = i5 % 128;
                                if (i5 % 2 != 0) {
                                    throw null;
                                }
                                return;
                            }
                            return;
                        } catch (Exception e3) {
                            throw new AnnotatedException("Certificate policies cannot be decoded.", e3);
                        }
                    }
                }
                return;
            }
            pKIXPolicyNode = (PKIXPolicyNode) it.next();
        } while (!pKIXPolicyNode.getValidPolicy().equals(str));
        int i6 = IAuthTabCallback + 97;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        pKIXPolicyNode.setExpectedPolicies((Set) map.get(str));
        if (i7 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    protected static PKIXPolicyNode prepareNextCertB2(int i, List[] listArr, String str, PKIXPolicyNode pKIXPolicyNode) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 111;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            listArr[i].iterator();
            throw null;
        }
        Iterator it = listArr[i].iterator();
        while (it.hasNext()) {
            int i4 = IAuthTabCallback + 27;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) it.next();
            if (pKIXPolicyNode2.getValidPolicy().equals(str)) {
                int i6 = onWarmupCompleted + 15;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                pKIXPolicyNode2.getParent().removeChild(pKIXPolicyNode2);
                it.remove();
                for (int i8 = i - 1; i8 >= 0; i8--) {
                    List list = listArr[i8];
                    for (int i9 = 0; i9 < list.size(); i9++) {
                        PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) list.get(i9);
                        if ((!pKIXPolicyNode3.hasChildren()) && (pKIXPolicyNode = removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode3)) == null) {
                            break;
                        }
                    }
                }
            }
        }
        return pKIXPolicyNode;
    }

    protected static boolean processCertD1i(int i, List[] listArr, ASN1ObjectIdentifier aSN1ObjectIdentifier, Set set) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 115;
        onWarmupCompleted = i3 % 128;
        List list = i3 % 2 == 0 ? listArr[i - 1] : listArr[i - 1];
        int i4 = 0;
        while (true) {
            Object obj = null;
            if (i4 >= list.size()) {
                int i5 = IAuthTabCallback + 99;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return false;
                }
                obj.hashCode();
                throw null;
            }
            int i6 = IAuthTabCallback + 79;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                ((PKIXPolicyNode) list.get(i4)).getExpectedPolicies().contains(aSN1ObjectIdentifier.getId());
                throw null;
            }
            PKIXPolicyNode pKIXPolicyNode = (PKIXPolicyNode) list.get(i4);
            if (pKIXPolicyNode.getExpectedPolicies().contains(aSN1ObjectIdentifier.getId())) {
                HashSet hashSet = new HashSet();
                hashSet.add(aSN1ObjectIdentifier.getId());
                PKIXPolicyNode pKIXPolicyNode2 = new PKIXPolicyNode(new ArrayList(), i, hashSet, pKIXPolicyNode, set, aSN1ObjectIdentifier.getId(), false);
                pKIXPolicyNode.addChild(pKIXPolicyNode2);
                listArr[i].add(pKIXPolicyNode2);
                return true;
            }
            i4++;
            int i7 = IAuthTabCallback + 69;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    protected static void processCertD1ii(int i, List[] listArr, ASN1ObjectIdentifier aSN1ObjectIdentifier, Set set) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 45;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        List list = listArr[i - 1];
        int i6 = i4 + 55;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        for (int i8 = 0; i8 < list.size(); i8++) {
            PKIXPolicyNode pKIXPolicyNode = (PKIXPolicyNode) list.get(i8);
            if (ANY_POLICY.equals(pKIXPolicyNode.getValidPolicy())) {
                HashSet hashSet = new HashSet();
                hashSet.add(aSN1ObjectIdentifier.getId());
                PKIXPolicyNode pKIXPolicyNode2 = new PKIXPolicyNode(new ArrayList(), i, hashSet, pKIXPolicyNode, set, aSN1ObjectIdentifier.getId(), false);
                pKIXPolicyNode.addChild(pKIXPolicyNode2);
                listArr[i].add(pKIXPolicyNode2);
                return;
            }
        }
    }

    protected static PKIXPolicyNode removePolicyNode(PKIXPolicyNode pKIXPolicyNode, List[] listArr, PKIXPolicyNode pKIXPolicyNode2) {
        int i = 2 % 2;
        PKIXPolicyNode parent = pKIXPolicyNode2.getParent();
        Object obj = null;
        if (pKIXPolicyNode == null) {
            return null;
        }
        if (parent != null) {
            parent.removeChild(pKIXPolicyNode2);
            removePolicyNodeRecurse(listArr, pKIXPolicyNode2);
            return pKIXPolicyNode;
        }
        int i2 = 0;
        while (i2 < listArr.length) {
            listArr[i2] = new ArrayList();
            i2++;
            int i3 = onWarmupCompleted + 53;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = onWarmupCompleted + 59;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static void removePolicyNodeRecurse(List[] listArr, PKIXPolicyNode pKIXPolicyNode) {
        int i = 2 % 2;
        listArr[pKIXPolicyNode.getDepth()].remove(pKIXPolicyNode);
        if (pKIXPolicyNode.hasChildren()) {
            int i2 = onWarmupCompleted + 107;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Iterator children = pKIXPolicyNode.getChildren();
            int i4 = IAuthTabCallback + 61;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            while (!(!children.hasNext())) {
                int i6 = IAuthTabCallback + 105;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                removePolicyNodeRecurse(listArr, (PKIXPolicyNode) children.next());
            }
        }
    }

    protected static void verifyX509Certificate(X509Certificate x509Certificate, PublicKey publicKey, String str) throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (str != null) {
            x509Certificate.verify(publicKey, str);
            return;
        }
        int i5 = i3 + 75;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        x509Certificate.verify(publicKey);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Object obj;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            obj = null;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $10 + 57;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 35125), 24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 10278 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - Drawable.resolveOpacity(0, 0)), 54 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), 2167 - (ViewConfiguration.getEdgeSlop() >> 16), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i9 = $11 + 1;
                $10 = i9 % 128;
                int i10 = i9 % 2;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            int i11 = $11 + 83;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i13 = $10 + 27;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i15 = $11 + 85;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[i >> simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getPressedStateDuration() >> 16)), MotionEvent.axisFromString(BuildConfig.FLAVOR) + 56, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(obj, objArr4);
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 12843), 54 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), KeyEvent.normalizeMetaState(0) + 2167, 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    obj = null;
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                i4 = 2083011369;
            }
            int i16 = $11 + 21;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = 478308897;
    }
}
