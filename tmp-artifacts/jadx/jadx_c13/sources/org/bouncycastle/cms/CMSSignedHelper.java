package org.bouncycastle.cms;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import okhttp3.internal.url._UrlKt;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cms.OtherRevocationInfoFormat;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.eac.EACObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AttributeCertificate;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.cert.X509AttributeCertificateHolder;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;
import org.bouncycastle.util.CollectionStore;
import org.bouncycastle.util.Store;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class CMSSignedHelper {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 0;
    static final CMSSignedHelper INSTANCE;
    private static final Map encryptionAlgs;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(new char[]{47087, 47037, 17878, 55036, 50303, 46090, 58060}, -TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        INSTANCE = new CMSSignedHelper();
        encryptionAlgs = new HashMap();
        addEntries(NISTObjectIdentifiers.dsa_with_sha224, "DSA");
        addEntries(NISTObjectIdentifiers.dsa_with_sha256, "DSA");
        addEntries(NISTObjectIdentifiers.dsa_with_sha384, "DSA");
        addEntries(NISTObjectIdentifiers.dsa_with_sha512, "DSA");
        addEntries(NISTObjectIdentifiers.id_dsa_with_sha3_224, "DSA");
        addEntries(NISTObjectIdentifiers.id_dsa_with_sha3_256, "DSA");
        addEntries(NISTObjectIdentifiers.id_dsa_with_sha3_384, "DSA");
        addEntries(NISTObjectIdentifiers.id_dsa_with_sha3_512, "DSA");
        addEntries(OIWObjectIdentifiers.dsaWithSHA1, "DSA");
        addEntries(OIWObjectIdentifiers.md4WithRSA, strIntern);
        addEntries(OIWObjectIdentifiers.md4WithRSAEncryption, strIntern);
        addEntries(OIWObjectIdentifiers.md5WithRSA, strIntern);
        addEntries(OIWObjectIdentifiers.sha1WithRSA, strIntern);
        addEntries(PKCSObjectIdentifiers.md2WithRSAEncryption, strIntern);
        addEntries(PKCSObjectIdentifiers.md4WithRSAEncryption, strIntern);
        addEntries(PKCSObjectIdentifiers.md5WithRSAEncryption, strIntern);
        addEntries(PKCSObjectIdentifiers.sha1WithRSAEncryption, strIntern);
        addEntries(PKCSObjectIdentifiers.sha224WithRSAEncryption, strIntern);
        addEntries(PKCSObjectIdentifiers.sha256WithRSAEncryption, strIntern);
        addEntries(PKCSObjectIdentifiers.sha384WithRSAEncryption, strIntern);
        addEntries(PKCSObjectIdentifiers.sha512WithRSAEncryption, strIntern);
        addEntries(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_224, strIntern);
        addEntries(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_256, strIntern);
        addEntries(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_384, strIntern);
        addEntries(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_512, strIntern);
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA1, "ECDSA");
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA224, "ECDSA");
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA256, "ECDSA");
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA384, "ECDSA");
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA512, "ECDSA");
        addEntries(NISTObjectIdentifiers.id_ecdsa_with_sha3_224, "ECDSA");
        addEntries(NISTObjectIdentifiers.id_ecdsa_with_sha3_256, "ECDSA");
        addEntries(NISTObjectIdentifiers.id_ecdsa_with_sha3_384, "ECDSA");
        addEntries(NISTObjectIdentifiers.id_ecdsa_with_sha3_512, "ECDSA");
        addEntries(X9ObjectIdentifiers.id_dsa_with_sha1, "DSA");
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_1, "ECDSA");
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_224, "ECDSA");
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_256, "ECDSA");
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_384, "ECDSA");
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_512, "ECDSA");
        addEntries(EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_1, strIntern);
        addEntries(EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_256, strIntern);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = EACObjectIdentifiers.id_TA_RSA_PSS_SHA_1;
        Object[] objArr2 = new Object[1];
        a(new char[]{816, 866, 44250, 16368, 41724, 23427, 33871, 57737, 20154, 57033, 54887, 21387, 39102, 4224}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, objArr2);
        addEntries(aSN1ObjectIdentifier, ((String) objArr2[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = EACObjectIdentifiers.id_TA_RSA_PSS_SHA_256;
        Object[] objArr3 = new Object[1];
        a(new char[]{816, 866, 44250, 16368, 41724, 23427, 33871, 57737, 20154, 57033, 54887, 21387, 39102, 4224}, 1 - View.getDefaultSize(0, 0), objArr3);
        addEntries(aSN1ObjectIdentifier2, ((String) objArr3[0]).intern());
        addEntries(X9ObjectIdentifiers.id_dsa, "DSA");
        addEntries(PKCSObjectIdentifiers.rsaEncryption, strIntern);
        addEntries(TeleTrusTObjectIdentifiers.teleTrusTRSAsignatureAlgorithm, strIntern);
        addEntries(X509ObjectIdentifiers.id_ea_rsa, strIntern);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = PKCSObjectIdentifiers.id_RSASSA_PSS;
        Object[] objArr4 = new Object[1];
        a(new char[]{816, 866, 44250, 16368, 41724, 23427, 33871, 57737, 20154, 57033, 54887, 21387, 39102, 4224}, Color.alpha(0) + 1, objArr4);
        addEntries(aSN1ObjectIdentifier3, ((String) objArr4[0]).intern());
        addEntries(CryptoProObjectIdentifiers.gostR3410_94, "GOST3410");
        addEntries(CryptoProObjectIdentifiers.gostR3410_2001, "ECGOST3410");
        addEntries(new ASN1ObjectIdentifier("1.3.6.1.4.1.5849.1.6.2"), "ECGOST3410");
        addEntries(new ASN1ObjectIdentifier("1.3.6.1.4.1.5849.1.1.5"), "GOST3410");
        addEntries(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256, "ECGOST3410-2012-256");
        addEntries(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512, "ECGOST3410-2012-512");
        addEntries(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001, "ECGOST3410");
        addEntries(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94, "GOST3410");
        addEntries(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_256, "ECGOST3410-2012-256");
        addEntries(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_512, "ECGOST3410-2012-512");
        int i = onExtraCallback + 79;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    CMSSignedHelper() {
    }

    private static void addEntries(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            encryptionAlgs.put(aSN1ObjectIdentifier.getId(), str);
            throw null;
        }
        encryptionAlgs.put(aSN1ObjectIdentifier.getId(), str);
        int i3 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 98 / 0;
        }
    }

    AlgorithmIdentifier fixDigestAlgID(AlgorithmIdentifier algorithmIdentifier, DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder) {
        int i = 2 % 2;
        ASN1Encodable parameters = algorithmIdentifier.getParameters();
        if (parameters == null || DERNull.INSTANCE.equals(parameters)) {
            return digestAlgorithmIdentifierFinder.find(algorithmIdentifier.getAlgorithm());
        }
        int i2 = onWarmupCompleted + 113;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            int i4 = 65 / 0;
        }
        int i5 = i3 + 65;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return algorithmIdentifier;
    }

    Store getAttributeCertificates(ASN1Set aSN1Set) {
        ASN1Primitive aSN1Primitive;
        int i = 2 % 2;
        if (aSN1Set == null) {
            CollectionStore collectionStore = new CollectionStore(new ArrayList());
            int i2 = onExtraCallbackWithResult + 7;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return collectionStore;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ArrayList arrayList = new ArrayList(aSN1Set.size());
        Enumeration objects = aSN1Set.getObjects();
        while (objects.hasMoreElements()) {
            int i3 = onExtraCallbackWithResult + 23;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                aSN1Primitive = ((ASN1Encodable) objects.nextElement()).toASN1Primitive();
                int i4 = 55 / 0;
                if (aSN1Primitive instanceof ASN1TaggedObject) {
                    arrayList.add(new X509AttributeCertificateHolder(AttributeCertificate.getInstance(((ASN1TaggedObject) aSN1Primitive).getObject())));
                }
            } else {
                aSN1Primitive = ((ASN1Encodable) objects.nextElement()).toASN1Primitive();
                if (aSN1Primitive instanceof ASN1TaggedObject) {
                    arrayList.add(new X509AttributeCertificateHolder(AttributeCertificate.getInstance(((ASN1TaggedObject) aSN1Primitive).getObject())));
                }
            }
        }
        return new CollectionStore(arrayList);
    }

    Store getCRLs(ASN1Set aSN1Set) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (aSN1Set == null) {
            CollectionStore collectionStore = new CollectionStore(new ArrayList());
            int i4 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return collectionStore;
        }
        ArrayList arrayList = new ArrayList(aSN1Set.size());
        Enumeration objects = aSN1Set.getObjects();
        while (objects.hasMoreElements()) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) objects.nextElement()).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1Sequence) {
                arrayList.add(new X509CRLHolder(CertificateList.getInstance(aSN1Primitive)));
            }
        }
        return new CollectionStore(arrayList);
    }

    Store getCertificates(ASN1Set aSN1Set) {
        int i = 2 % 2;
        if (aSN1Set == null) {
            CollectionStore collectionStore = new CollectionStore(new ArrayList());
            int i2 = onWarmupCompleted + 9;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return collectionStore;
            }
            throw null;
        }
        ArrayList arrayList = new ArrayList(aSN1Set.size());
        Enumeration objects = aSN1Set.getObjects();
        while (!(!objects.hasMoreElements())) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) objects.nextElement()).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1Sequence) {
                arrayList.add(new X509CertificateHolder(Certificate.getInstance(aSN1Primitive)));
            }
        }
        CollectionStore collectionStore2 = new CollectionStore(arrayList);
        int i3 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return collectionStore2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        r1 = org.bouncycastle.cms.CMSSignedHelper.onWarmupCompleted + 77;
        org.bouncycastle.cms.CMSSignedHelper.onExtraCallbackWithResult = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    String getEncryptionAlgName(String str) {
        String str2;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            str2 = (String) encryptionAlgs.get(str);
            int i3 = 97 / 0;
        } else {
            str2 = (String) encryptionAlgs.get(str);
        }
    }

    Store getOtherRevocationInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Set aSN1Set) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (aSN1Set == null) {
            return new CollectionStore(new ArrayList());
        }
        ArrayList arrayList = new ArrayList(aSN1Set.size());
        Enumeration objects = aSN1Set.getObjects();
        while (objects.hasMoreElements()) {
            int i4 = onWarmupCompleted + 101;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) objects.nextElement()).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1TaggedObject) {
                ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Primitive);
                if (aSN1TaggedObject.getTagNo() == 1) {
                    OtherRevocationInfoFormat otherRevocationInfoFormat = OtherRevocationInfoFormat.getInstance(aSN1TaggedObject, false);
                    if (!(!aSN1ObjectIdentifier.equals((ASN1Primitive) otherRevocationInfoFormat.getInfoFormat()))) {
                        int i6 = onExtraCallbackWithResult + 53;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                        arrayList.add(otherRevocationInfoFormat.getInfo());
                    }
                }
            }
        }
        return new CollectionStore(arrayList);
    }

    void setSigningEncryptionAlgorithmMapping(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        addEntries(aSN1ObjectIdentifier, str);
        int i4 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 71;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 3;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 45813), 84 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - KeyEvent.normalizeMetaState(0)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19, Drawable.resolveOpacity(0, 0) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = -6469847990361724811L;
    }
}
