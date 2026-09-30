package org.bouncycastle.cms;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.bsi.BSIObjectIdentifiers;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.eac.EACObjectIdentifiers;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.gm.GMObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;
import org.bouncycastle.pqc.jcajce.spec.SPHINCS256KeyGenParameterSpec;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class DefaultCMSSignatureAlgorithmNameGenerator implements CMSSignatureAlgorithmNameGenerator {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 1445;
    private static int IAuthTabCallbackStub = 1;
    private static char onExtraCallback = 2159;
    private static char onExtraCallbackWithResult = 2769;
    private static char onNavigationEvent = 25085;
    private static int onWarmupCompleted;
    private final Map digestAlgs;
    private final Map encryptionAlgs;

    public DefaultCMSSignatureAlgorithmNameGenerator() throws Throwable {
        Object[] objArr = new Object[1];
        a(new char[]{53781, 49116, 7499, 31607}, 3 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        HashMap map = new HashMap();
        this.encryptionAlgs = map;
        HashMap map2 = new HashMap();
        this.digestAlgs = map2;
        addEntries(NISTObjectIdentifiers.dsa_with_sha224, "SHA224", "DSA");
        addEntries(NISTObjectIdentifiers.dsa_with_sha256, "SHA256", "DSA");
        addEntries(NISTObjectIdentifiers.dsa_with_sha384, "SHA384", "DSA");
        addEntries(NISTObjectIdentifiers.dsa_with_sha512, "SHA512", "DSA");
        addEntries(NISTObjectIdentifiers.id_dsa_with_sha3_224, "SHA3-224", "DSA");
        addEntries(NISTObjectIdentifiers.id_dsa_with_sha3_256, SPHINCS256KeyGenParameterSpec.SHA3_256, "DSA");
        addEntries(NISTObjectIdentifiers.id_dsa_with_sha3_384, "SHA3-384", "DSA");
        addEntries(NISTObjectIdentifiers.id_dsa_with_sha3_512, "SHA3-512", "DSA");
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_224;
        addEntries(aSN1ObjectIdentifier, "SHA3-224", strIntern);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_256;
        addEntries(aSN1ObjectIdentifier2, SPHINCS256KeyGenParameterSpec.SHA3_256, strIntern);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_384;
        addEntries(aSN1ObjectIdentifier3, "SHA3-384", strIntern);
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_512;
        addEntries(aSN1ObjectIdentifier4, "SHA3-512", strIntern);
        addEntries(NISTObjectIdentifiers.id_ecdsa_with_sha3_224, "SHA3-224", "ECDSA");
        addEntries(NISTObjectIdentifiers.id_ecdsa_with_sha3_256, SPHINCS256KeyGenParameterSpec.SHA3_256, "ECDSA");
        addEntries(NISTObjectIdentifiers.id_ecdsa_with_sha3_384, "SHA3-384", "ECDSA");
        addEntries(NISTObjectIdentifiers.id_ecdsa_with_sha3_512, "SHA3-512", "ECDSA");
        addEntries(OIWObjectIdentifiers.dsaWithSHA1, "SHA1", "DSA");
        addEntries(OIWObjectIdentifiers.md4WithRSA, "MD4", strIntern);
        addEntries(OIWObjectIdentifiers.md4WithRSAEncryption, "MD4", strIntern);
        addEntries(OIWObjectIdentifiers.md5WithRSA, "MD5", strIntern);
        addEntries(OIWObjectIdentifiers.sha1WithRSA, "SHA1", strIntern);
        addEntries(PKCSObjectIdentifiers.md2WithRSAEncryption, "MD2", strIntern);
        addEntries(PKCSObjectIdentifiers.md4WithRSAEncryption, "MD4", strIntern);
        addEntries(PKCSObjectIdentifiers.md5WithRSAEncryption, "MD5", strIntern);
        addEntries(PKCSObjectIdentifiers.sha1WithRSAEncryption, "SHA1", strIntern);
        addEntries(PKCSObjectIdentifiers.sha224WithRSAEncryption, "SHA224", strIntern);
        addEntries(PKCSObjectIdentifiers.sha256WithRSAEncryption, "SHA256", strIntern);
        addEntries(PKCSObjectIdentifiers.sha384WithRSAEncryption, "SHA384", strIntern);
        addEntries(PKCSObjectIdentifiers.sha512WithRSAEncryption, "SHA512", strIntern);
        addEntries(PKCSObjectIdentifiers.sha512_224WithRSAEncryption, "SHA512(224)", strIntern);
        addEntries(PKCSObjectIdentifiers.sha512_256WithRSAEncryption, "SHA512(256)", strIntern);
        addEntries(aSN1ObjectIdentifier, "SHA3-224", strIntern);
        addEntries(aSN1ObjectIdentifier2, SPHINCS256KeyGenParameterSpec.SHA3_256, strIntern);
        addEntries(aSN1ObjectIdentifier3, "SHA3-384", strIntern);
        addEntries(aSN1ObjectIdentifier4, "SHA3-512", strIntern);
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = CMSObjectIdentifiers.id_RSASSA_PSS_SHAKE128;
        Object[] objArr2 = new Object[1];
        a(new char[]{53781, 49116, 48725, 46796, 7727, 47027}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6, objArr2);
        addEntries(aSN1ObjectIdentifier5, "SHAKE128", ((String) objArr2[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = CMSObjectIdentifiers.id_RSASSA_PSS_SHAKE256;
        Object[] objArr3 = new Object[1];
        a(new char[]{53781, 49116, 48725, 46796, 7727, 47027}, (ViewConfiguration.getTouchSlop() >> 8) + 6, objArr3);
        addEntries(aSN1ObjectIdentifier6, "SHAKE256", ((String) objArr3[0]).intern());
        addEntries(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128, "RIPEMD128", strIntern);
        addEntries(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160, "RIPEMD160", strIntern);
        addEntries(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256, "RIPEMD256", strIntern);
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA1, "SHA1", "ECDSA");
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA224, "SHA224", "ECDSA");
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA256, "SHA256", "ECDSA");
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA384, "SHA384", "ECDSA");
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA512, "SHA512", "ECDSA");
        addEntries(CMSObjectIdentifiers.id_ecdsa_with_shake128, "SHAKE128", "ECDSA");
        addEntries(CMSObjectIdentifiers.id_ecdsa_with_shake256, "SHAKE256", "ECDSA");
        addEntries(X9ObjectIdentifiers.id_dsa_with_sha1, "SHA1", "DSA");
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_1, "SHA1", "ECDSA");
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_224, "SHA224", "ECDSA");
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_256, "SHA256", "ECDSA");
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_384, "SHA384", "ECDSA");
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_512, "SHA512", "ECDSA");
        addEntries(EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_1, "SHA1", strIntern);
        addEntries(EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_256, "SHA256", strIntern);
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = EACObjectIdentifiers.id_TA_RSA_PSS_SHA_1;
        Object[] objArr4 = new Object[1];
        a(new char[]{53781, 49116, 45172, 37774, 22325, 60386, 55210, 18823, 17277, 31157}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10, objArr4);
        addEntries(aSN1ObjectIdentifier7, "SHA1", ((String) objArr4[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = EACObjectIdentifiers.id_TA_RSA_PSS_SHA_256;
        Object[] objArr5 = new Object[1];
        a(new char[]{53781, 49116, 45172, 37774, 22325, 60386, 55210, 18823, 17277, 31157}, 10 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), objArr5);
        addEntries(aSN1ObjectIdentifier8, "SHA256", ((String) objArr5[0]).intern());
        addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA1, "SHA1", "PLAIN-ECDSA");
        addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA224, "SHA224", "PLAIN-ECDSA");
        addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA256, "SHA256", "PLAIN-ECDSA");
        addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA384, "SHA384", "PLAIN-ECDSA");
        addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA512, "SHA512", "PLAIN-ECDSA");
        addEntries(BSIObjectIdentifiers.ecdsa_plain_RIPEMD160, "RIPEMD160", "PLAIN-ECDSA");
        addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA3_224, "SHA3-224", "PLAIN-ECDSA");
        addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA3_256, SPHINCS256KeyGenParameterSpec.SHA3_256, "PLAIN-ECDSA");
        addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA3_384, "SHA3-384", "PLAIN-ECDSA");
        addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA3_512, "SHA3-512", "PLAIN-ECDSA");
        addEntries(GMObjectIdentifiers.sm2sign_with_sha256, "SHA256", "SM2");
        addEntries(GMObjectIdentifiers.sm2sign_with_sm3, "SM3", "SM2");
        addEntries(BCObjectIdentifiers.sphincs256_with_SHA512, "SHA512", "SPHINCS256");
        addEntries(BCObjectIdentifiers.sphincs256_with_SHA3_512, "SHA3-512", "SPHINCS256");
        map.put(X9ObjectIdentifiers.id_dsa, "DSA");
        map.put(PKCSObjectIdentifiers.rsaEncryption, strIntern);
        map.put(TeleTrusTObjectIdentifiers.teleTrusTRSAsignatureAlgorithm, strIntern);
        map.put(X509ObjectIdentifiers.id_ea_rsa, strIntern);
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = PKCSObjectIdentifiers.id_RSASSA_PSS;
        Object[] objArr6 = new Object[1];
        a(new char[]{53781, 49116, 45172, 37774, 22325, 60386, 55210, 18823, 17277, 31157}, 10 - (ViewConfiguration.getTouchSlop() >> 8), objArr6);
        map.put(aSN1ObjectIdentifier9, ((String) objArr6[0]).intern());
        map.put(CryptoProObjectIdentifiers.gostR3410_94, "GOST3410");
        map.put(CryptoProObjectIdentifiers.gostR3410_2001, "ECGOST3410");
        map.put(new ASN1ObjectIdentifier("1.3.6.1.4.1.5849.1.6.2"), "ECGOST3410");
        map.put(new ASN1ObjectIdentifier("1.3.6.1.4.1.5849.1.1.5"), "GOST3410");
        map.put(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256, "ECGOST3410-2012-256");
        map.put(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512, "ECGOST3410-2012-512");
        map.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001, "ECGOST3410");
        map.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94, "GOST3410");
        map.put(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_256, "ECGOST3410-2012-256");
        map.put(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_512, "ECGOST3410-2012-512");
        map2.put(PKCSObjectIdentifiers.md2, "MD2");
        map2.put(PKCSObjectIdentifiers.md4, "MD4");
        map2.put(PKCSObjectIdentifiers.md5, "MD5");
        map2.put(OIWObjectIdentifiers.idSHA1, "SHA1");
        map2.put(NISTObjectIdentifiers.id_sha224, "SHA224");
        map2.put(NISTObjectIdentifiers.id_sha256, "SHA256");
        map2.put(NISTObjectIdentifiers.id_sha384, "SHA384");
        map2.put(NISTObjectIdentifiers.id_sha512, "SHA512");
        map2.put(NISTObjectIdentifiers.id_sha512_224, "SHA512(224)");
        map2.put(NISTObjectIdentifiers.id_sha512_256, "SHA512(256)");
        map2.put(NISTObjectIdentifiers.id_shake128, "SHAKE128");
        map2.put(NISTObjectIdentifiers.id_shake256, "SHAKE256");
        map2.put(NISTObjectIdentifiers.id_sha3_224, "SHA3-224");
        map2.put(NISTObjectIdentifiers.id_sha3_256, SPHINCS256KeyGenParameterSpec.SHA3_256);
        map2.put(NISTObjectIdentifiers.id_sha3_384, "SHA3-384");
        map2.put(NISTObjectIdentifiers.id_sha3_512, "SHA3-512");
        map2.put(TeleTrusTObjectIdentifiers.ripemd128, "RIPEMD128");
        map2.put(TeleTrusTObjectIdentifiers.ripemd160, "RIPEMD160");
        map2.put(TeleTrusTObjectIdentifiers.ripemd256, "RIPEMD256");
        map2.put(CryptoProObjectIdentifiers.gostR3411, "GOST3411");
        map2.put(new ASN1ObjectIdentifier("1.3.6.1.4.1.5849.1.2.1"), "GOST3411");
        map2.put(RosstandartObjectIdentifiers.id_tc26_gost_3411_12_256, "GOST3411-2012-256");
        map2.put(RosstandartObjectIdentifiers.id_tc26_gost_3411_12_512, "GOST3411-2012-512");
        map2.put(GMObjectIdentifiers.sm3, "SM3");
    }

    private void addEntries(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        this.digestAlgs.put(aSN1ObjectIdentifier, str);
        if (i3 == 0) {
            this.encryptionAlgs.put(aSN1ObjectIdentifier, str2);
        } else {
            this.encryptionAlgs.put(aSN1ObjectIdentifier, str2);
            throw null;
        }
    }

    private String getDigestAlgName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 2 % 2;
        String str = (String) this.digestAlgs.get(aSN1ObjectIdentifier);
        if (str == null) {
            String id = aSN1ObjectIdentifier.getId();
            int i2 = onWarmupCompleted + 15;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 53 / 0;
            }
            return id;
        }
        int i4 = onWarmupCompleted + 109;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private String getEncryptionAlgName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.encryptionAlgs.get(aSN1ObjectIdentifier);
        if (str == null) {
            return aSN1ObjectIdentifier.getId();
        }
        int i4 = IAuthTabCallbackStub + 9;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    @Override // org.bouncycastle.cms.CMSSignatureAlgorithmNameGenerator
    public String getSignatureName(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2) {
        int i = 2 % 2;
        ASN1ObjectIdentifier algorithm = algorithmIdentifier2.getAlgorithm();
        if (EdECObjectIdentifiers.id_Ed25519.equals(algorithm)) {
            int i2 = IAuthTabCallbackStub + 89;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return EdDSAParameterSpec.Ed25519;
            }
            throw null;
        }
        if (EdECObjectIdentifiers.id_Ed448.equals(algorithm)) {
            return EdDSAParameterSpec.Ed448;
        }
        if (PKCSObjectIdentifiers.id_alg_hss_lms_hashsig.equals(algorithm)) {
            int i3 = onWarmupCompleted + 87;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                return "LMS";
            }
            throw null;
        }
        String digestAlgName = getDigestAlgName(algorithm);
        if (digestAlgName.equals(algorithm.getId())) {
            return getDigestAlgName(algorithmIdentifier.getAlgorithm()) + "with" + getEncryptionAlgName(algorithm);
        }
        String str = digestAlgName + "with" + getEncryptionAlgName(algorithm);
        int i4 = IAuthTabCallbackStub + 25;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    protected void setSigningDigestAlgorithmMapping(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            this.digestAlgs.put(aSN1ObjectIdentifier, str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.digestAlgs.put(aSN1ObjectIdentifier, str);
        int i3 = onWarmupCompleted + 115;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    protected void setSigningEncryptionAlgorithmMapping(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        this.encryptionAlgs.put(aSN1ObjectIdentifier, str);
        int i4 = IAuthTabCallbackStub + 67;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 49;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i6 = $11 + 87;
            $10 = i6 % 128;
            int i7 = 58224;
            if (i6 % 2 != 0) {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            } else {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i8 = i3;
            while (i8 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                char[] cArr4 = cArr3;
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i7) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 9 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12433, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), Color.green(0) + 10, 12435 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    int i9 = $11 + 71;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 16014), TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 14, 19901 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
