package org.bouncycastle.operator.jcajce;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import okhttp3.internal.url._UrlKt;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.kisa.KISAObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.jcajce.util.AlgorithmParametersUtils;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.MessageDigestUtils;
import org.bouncycastle.operator.DefaultSignatureNameFinder;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Integers;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class OperatorHelper {
    private static int $10 = 0;
    private static int $11 = 1;
    private static boolean IAuthTabCallback = false;
    private static int asBinder = 1;
    private static int asInterface = 0;
    private static final Map asymmetricWrapperAlgNames;
    private static final Map oids;
    private static int onExtraCallback = 0;
    private static boolean onExtraCallbackWithResult = false;
    private static char[] onNavigationEvent = null;
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    private static DefaultSignatureNameFinder sigFinder;
    private static final Map symmetricKeyAlgNames;
    private static final Map symmetricWrapperAlgNames;
    private static final Map symmetricWrapperKeySizes;
    private JcaJceHelper helper;

    static {
        onWarmupCompleted();
        HashMap map = new HashMap();
        oids = map;
        HashMap map2 = new HashMap();
        asymmetricWrapperAlgNames = map2;
        HashMap map3 = new HashMap();
        symmetricWrapperAlgNames = map3;
        HashMap map4 = new HashMap();
        symmetricKeyAlgNames = map4;
        HashMap map5 = new HashMap();
        symmetricWrapperKeySizes = map5;
        sigFinder = new DefaultSignatureNameFinder();
        map.put(OIWObjectIdentifiers.idSHA1, "SHA1");
        map.put(NISTObjectIdentifiers.id_sha224, "SHA224");
        map.put(NISTObjectIdentifiers.id_sha256, "SHA256");
        map.put(NISTObjectIdentifiers.id_sha384, "SHA384");
        map.put(NISTObjectIdentifiers.id_sha512, "SHA512");
        map.put(TeleTrusTObjectIdentifiers.ripemd128, "RIPEMD128");
        map.put(TeleTrusTObjectIdentifiers.ripemd160, "RIPEMD160");
        map.put(TeleTrusTObjectIdentifiers.ripemd256, "RIPEMD256");
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.rsaEncryption;
        Object[] objArr = new Object[1];
        Object obj = null;
        a(null, null, new byte[]{-113, -114, -115, -116, -116, -117, -120, -118, -126, -122, -119, -120, -124, -121, -122, -123, -124, -125, -126, -127}, 127 - KeyEvent.getDeadChar(0, 0), objArr);
        map2.put(aSN1ObjectIdentifier, ((String) objArr[0]).intern());
        map2.put(CryptoProObjectIdentifiers.gostR3410_2001, "ECGOST3410");
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.id_alg_CMS3DESwrap;
        map3.put(aSN1ObjectIdentifier2, "DESEDEWrap");
        map3.put(PKCSObjectIdentifiers.id_alg_CMSRC2wrap, "RC2Wrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_aes128_wrap;
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-110, -117, -111, -112, -126, -123, -125}, 126 - ExpandableListView.getPackedPositionChild(0L), objArr2);
        map3.put(aSN1ObjectIdentifier3, ((String) objArr2[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_aes192_wrap;
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-110, -117, -111, -112, -126, -123, -125}, (ViewConfiguration.getTouchSlop() >> 8) + 127, objArr3);
        map3.put(aSN1ObjectIdentifier4, ((String) objArr3[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NISTObjectIdentifiers.id_aes256_wrap;
        Object[] objArr4 = new Object[1];
        a(null, null, new byte[]{-110, -117, -111, -112, -126, -123, -125}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 127, objArr4);
        map3.put(aSN1ObjectIdentifier5, ((String) objArr4[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NTTObjectIdentifiers.id_camellia128_wrap;
        map3.put(aSN1ObjectIdentifier6, "CamelliaWrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = NTTObjectIdentifiers.id_camellia192_wrap;
        map3.put(aSN1ObjectIdentifier7, "CamelliaWrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = NTTObjectIdentifiers.id_camellia256_wrap;
        map3.put(aSN1ObjectIdentifier8, "CamelliaWrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap;
        map3.put(aSN1ObjectIdentifier9, "SEEDWrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = PKCSObjectIdentifiers.des_EDE3_CBC;
        map3.put(aSN1ObjectIdentifier10, "DESede");
        map5.put(aSN1ObjectIdentifier2, Integers.valueOf(BERTags.PRIVATE));
        map5.put(aSN1ObjectIdentifier3, Integers.valueOf(128));
        map5.put(aSN1ObjectIdentifier4, Integers.valueOf(BERTags.PRIVATE));
        map5.put(aSN1ObjectIdentifier5, Integers.valueOf(256));
        map5.put(aSN1ObjectIdentifier6, Integers.valueOf(128));
        map5.put(aSN1ObjectIdentifier7, Integers.valueOf(BERTags.PRIVATE));
        map5.put(aSN1ObjectIdentifier8, Integers.valueOf(256));
        map5.put(aSN1ObjectIdentifier9, Integers.valueOf(128));
        map5.put(aSN1ObjectIdentifier10, Integers.valueOf(BERTags.PRIVATE));
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = NISTObjectIdentifiers.aes;
        Object[] objArr5 = new Object[1];
        a(null, null, new byte[]{-126, -123, -125}, Color.argb(0, 0, 0, 0) + 127, objArr5);
        map4.put(aSN1ObjectIdentifier11, ((String) objArr5[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = NISTObjectIdentifiers.id_aes128_CBC;
        Object[] objArr6 = new Object[1];
        a(null, null, new byte[]{-126, -123, -125}, TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 127, objArr6);
        map4.put(aSN1ObjectIdentifier12, ((String) objArr6[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = NISTObjectIdentifiers.id_aes192_CBC;
        Object[] objArr7 = new Object[1];
        a(null, null, new byte[]{-126, -123, -125}, 126 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0), objArr7);
        map4.put(aSN1ObjectIdentifier13, ((String) objArr7[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = NISTObjectIdentifiers.id_aes256_CBC;
        Object[] objArr8 = new Object[1];
        a(null, null, new byte[]{-126, -123, -125}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, objArr8);
        map4.put(aSN1ObjectIdentifier14, ((String) objArr8[0]).intern());
        map4.put(aSN1ObjectIdentifier10, "DESede");
        map4.put(PKCSObjectIdentifiers.RC2_CBC, "RC2");
        int i = onWarmupCompleted + 89;
        onTransact = i % 128;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    OperatorHelper(JcaJceHelper jcaJceHelper) {
        this.helper = jcaJceHelper;
    }

    static String getDigestName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String digestName = MessageDigestUtils.getDigestName(aSN1ObjectIdentifier);
        int iIndexOf = digestName.indexOf(45);
        if (iIndexOf <= 0) {
            return digestName;
        }
        int i4 = asBinder + 113;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            digestName.startsWith("SHA3");
            throw null;
        }
        if (digestName.startsWith("SHA3")) {
            return digestName;
        }
        String str = digestName.substring(0, iIndexOf) + digestName.substring(iIndexOf + 1);
        int i5 = asBinder + 41;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static String getSignatureName(AlgorithmIdentifier algorithmIdentifier) {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String algorithmName = sigFinder.getAlgorithmName(algorithmIdentifier);
        int i4 = asInterface + 123;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return algorithmName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private boolean notDefaultPSSParams(ASN1Sequence aSN1Sequence) throws GeneralSecurityException {
        int i = 2 % 2;
        if (aSN1Sequence == null) {
            return false;
        }
        int i2 = asBinder + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (aSN1Sequence.size() == 0) {
            return false;
        }
        RSASSAPSSparams rSASSAPSSparams = RSASSAPSSparams.getInstance(aSN1Sequence);
        if (!rSASSAPSSparams.getMaskGenAlgorithm().getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_mgf1)) {
            int i4 = asInterface + 81;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (rSASSAPSSparams.getHashAlgorithm().equals(AlgorithmIdentifier.getInstance(rSASSAPSSparams.getMaskGenAlgorithm().getParameters()))) {
            if (rSASSAPSSparams.getSaltLength().intValue() == createDigest(rSASSAPSSparams.getHashAlgorithm()).getDigestLength()) {
                return false;
            }
            int i6 = asInterface + 85;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        int i8 = asBinder + 115;
        asInterface = i8 % 128;
        if (i8 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.operator.jcajce.OperatorHelper$OpCertificateException */
    public X509Certificate convertCertificate(X509CertificateHolder x509CertificateHolder) throws OpCertificateException, CertificateException {
        int i = 2 % 2;
        try {
            X509Certificate x509Certificate = (X509Certificate) this.helper.createCertificateFactory("X.509").generateCertificate(new ByteArrayInputStream(x509CertificateHolder.getEncoded()));
            int i2 = asInterface + 11;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return x509Certificate;
        } catch (IOException e) {
            throw new OpCertificateException("cannot get encoded form of certificate: " + e.getMessage(), e);
        } catch (NoSuchProviderException e2) {
            throw new OpCertificateException("cannot find factory provider: " + e2.getMessage(), e2);
        }
    }

    public PublicKey convertPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws InvalidKeySpecException, OperatorCreationException {
        int i = 2 % 2;
        try {
            PublicKey publicKeyGeneratePublic = this.helper.createKeyFactory(subjectPublicKeyInfo.getAlgorithm().getAlgorithm().getId()).generatePublic(new X509EncodedKeySpec(subjectPublicKeyInfo.getEncoded()));
            int i2 = asBinder + 35;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                return publicKeyGeneratePublic;
            }
            throw null;
        } catch (IOException e) {
            throw new OperatorCreationException("cannot get encoded form of key: " + e.getMessage(), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new OperatorCreationException("cannot create key factory: " + e2.getMessage(), e2);
        } catch (NoSuchProviderException e3) {
            throw new OperatorCreationException("cannot find factory provider: " + e3.getMessage(), e3);
        } catch (InvalidKeySpecException e4) {
            throw new OperatorCreationException("cannot create key factory: " + e4.getMessage(), e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        r1 = r4.helper.createAlgorithmParameters(r5.getAlgorithm().getId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r1.init(r5.getParameters().toASN1Primitive().getEncoded());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        r5 = org.bouncycastle.operator.jcajce.OperatorHelper.asBinder + 111;
        org.bouncycastle.operator.jcajce.OperatorHelper.asInterface = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if ((r5 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        r5 = 88 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        throw new org.bouncycastle.operator.OperatorCreationException("cannot initialise algorithm parameters: " + r5.getMessage(), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        throw new org.bouncycastle.operator.OperatorCreationException("cannot create algorithm parameters: " + r5.getMessage(), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r5.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r5.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    AlgorithmParameters createAlgorithmParameters(AlgorithmIdentifier algorithmIdentifier) throws OperatorCreationException, IOException {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 82 / 0;
        }
    }

    Cipher createAsymmetricWrapper(ASN1ObjectIdentifier aSN1ObjectIdentifier, Map map) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        try {
            String str = !map.isEmpty() ? (String) map.get(aSN1ObjectIdentifier) : null;
            if (str == null) {
                str = (String) asymmetricWrapperAlgNames.get(aSN1ObjectIdentifier);
                int i4 = asBinder + 55;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
            }
            if (str != null) {
                try {
                    Cipher cipherCreateCipher = this.helper.createCipher(str);
                    int i6 = asBinder + 17;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                    return cipherCreateCipher;
                } catch (NoSuchAlgorithmException unused) {
                    Object[] objArr = new Object[1];
                    a(null, null, new byte[]{-113, -114, -115, -116, -116, -117, -120, -118, -126, -122, -119, -120, -124, -121, -122, -123, -124, -125, -126, -127}, 127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
                    if (str.equals(((String) objArr[0]).intern())) {
                        try {
                            JcaJceHelper jcaJceHelper = this.helper;
                            Object[] objArr2 = new Object[1];
                            a(null, null, new byte[]{-113, -114, -115, -116, -116, -117, -120, -118, -126, -122, -119, -120, -124, -123, -109, -108, -109, -124, -125, -126, -127}, 127 - Color.blue(0), objArr2);
                            Cipher cipherCreateCipher2 = jcaJceHelper.createCipher(((String) objArr2[0]).intern());
                            int i8 = asBinder + 19;
                            asInterface = i8 % 128;
                            if (i8 % 2 != 0) {
                                int i9 = 94 / 0;
                            }
                            return cipherCreateCipher2;
                        } catch (NoSuchAlgorithmException unused2) {
                        }
                    }
                }
            }
            return this.helper.createCipher(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e) {
            throw new OperatorCreationException("cannot create cipher: " + e.getMessage(), e);
        }
    }

    Cipher createCipher(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws OperatorCreationException {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        try {
            Cipher cipherCreateCipher = this.helper.createCipher(aSN1ObjectIdentifier.getId());
            int i4 = asBinder + 93;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return cipherCreateCipher;
        } catch (GeneralSecurityException e) {
            throw new OperatorCreationException("cannot create cipher: " + e.getMessage(), e);
        }
    }

    MessageDigest createDigest(AlgorithmIdentifier algorithmIdentifier) throws GeneralSecurityException {
        JcaJceHelper jcaJceHelper;
        String digestName;
        StringBuilder sb;
        BigInteger value;
        int i = 2 % 2;
        int i2 = asInterface + 125;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) NISTObjectIdentifiers.id_shake256_len)) {
                jcaJceHelper = this.helper;
                sb = new StringBuilder();
                sb.append("SHAKE256-");
                value = ASN1Integer.getInstance(algorithmIdentifier.getParameters()).getValue();
            } else {
                if (!algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) NISTObjectIdentifiers.id_shake128_len)) {
                    jcaJceHelper = this.helper;
                    digestName = MessageDigestUtils.getDigestName(algorithmIdentifier.getAlgorithm());
                    int i4 = asInterface + 79;
                    asBinder = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 2 % 5;
                    }
                    MessageDigest messageDigestCreateMessageDigest = jcaJceHelper.createMessageDigest(digestName);
                    int i6 = asBinder + 79;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                    return messageDigestCreateMessageDigest;
                }
                jcaJceHelper = this.helper;
                sb = new StringBuilder();
                sb.append("SHAKE128-");
                value = ASN1Integer.getInstance(algorithmIdentifier.getParameters()).getValue();
            }
            sb.append(value);
            digestName = sb.toString();
            MessageDigest messageDigestCreateMessageDigest2 = jcaJceHelper.createMessageDigest(digestName);
            int i62 = asBinder + 79;
            asInterface = i62 % 128;
            int i72 = i62 % 2;
            return messageDigestCreateMessageDigest2;
        } catch (NoSuchAlgorithmException e) {
            Map map = oids;
            if (map.get(algorithmIdentifier.getAlgorithm()) == null) {
                throw e;
            }
            int i8 = asBinder + 91;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
            MessageDigest messageDigestCreateMessageDigest3 = this.helper.createMessageDigest((String) map.get(algorithmIdentifier.getAlgorithm()));
            int i10 = asInterface + 47;
            asBinder = i10 % 128;
            int i11 = i10 % 2;
            return messageDigestCreateMessageDigest3;
        }
    }

    KeyAgreement createKeyAgreement(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws OperatorCreationException {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        asBinder = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.helper.createKeyAgreement(aSN1ObjectIdentifier.getId());
                throw null;
            }
            KeyAgreement keyAgreementCreateKeyAgreement = this.helper.createKeyAgreement(aSN1ObjectIdentifier.getId());
            int i3 = asBinder + 41;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 4 / 0;
            }
            return keyAgreementCreateKeyAgreement;
        } catch (GeneralSecurityException e) {
            throw new OperatorCreationException("cannot create key agreement: " + e.getMessage(), e);
        }
    }

    KeyPairGenerator createKeyPairGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        try {
            KeyPairGenerator keyPairGeneratorCreateKeyPairGenerator = this.helper.createKeyPairGenerator(aSN1ObjectIdentifier.getId());
            int i4 = asInterface + 109;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                return keyPairGeneratorCreateKeyPairGenerator;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (GeneralSecurityException e) {
            throw new CMSException("cannot create key agreement: " + e.getMessage(), e);
        }
    }

    Signature createRawSignature(AlgorithmIdentifier algorithmIdentifier) throws InvalidAlgorithmParameterException {
        int i = 2 % 2;
        try {
            String signatureName = getSignatureName(algorithmIdentifier);
            String str = "NONE" + signatureName.substring(signatureName.indexOf("WITH"));
            Signature signatureCreateSignature = this.helper.createSignature(str);
            if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_RSASSA_PSS)) {
                int i2 = asInterface + 99;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                AlgorithmParameters algorithmParametersCreateAlgorithmParameters = this.helper.createAlgorithmParameters(str);
                AlgorithmParametersUtils.loadParameters(algorithmParametersCreateAlgorithmParameters, algorithmIdentifier.getParameters());
                signatureCreateSignature.setParameter((PSSParameterSpec) algorithmParametersCreateAlgorithmParameters.getParameterSpec(PSSParameterSpec.class));
            }
            int i4 = asBinder + 125;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return signatureCreateSignature;
        } catch (Exception unused) {
            return null;
        }
    }

    Signature createSignature(AlgorithmIdentifier algorithmIdentifier) throws GeneralSecurityException, IOException {
        Signature signatureCreateSignature;
        int i = 2 % 2;
        int i2 = asInterface + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String signatureName = getSignatureName(algorithmIdentifier);
        try {
            signatureCreateSignature = this.helper.createSignature(signatureName);
        } catch (NoSuchAlgorithmException e) {
            if (!signatureName.endsWith("WITHRSAANDMGF1")) {
                throw e;
            }
            signatureCreateSignature = this.helper.createSignature(signatureName.substring(0, signatureName.indexOf(87)) + "WITHRSASSA-PSS");
            int i4 = asInterface + 59;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }
        if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_RSASSA_PSS)) {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(algorithmIdentifier.getParameters());
            if (notDefaultPSSParams(aSN1Sequence)) {
                int i6 = asInterface + 45;
                asBinder = i6 % 128;
                try {
                    if (i6 % 2 == 0) {
                        AlgorithmParameters algorithmParametersCreateAlgorithmParameters = this.helper.createAlgorithmParameters("PSS");
                        algorithmParametersCreateAlgorithmParameters.init(aSN1Sequence.getEncoded());
                        signatureCreateSignature.setParameter(algorithmParametersCreateAlgorithmParameters.getParameterSpec(PSSParameterSpec.class));
                        int i7 = 50 / 0;
                    } else {
                        AlgorithmParameters algorithmParametersCreateAlgorithmParameters2 = this.helper.createAlgorithmParameters("PSS");
                        algorithmParametersCreateAlgorithmParameters2.init(aSN1Sequence.getEncoded());
                        signatureCreateSignature.setParameter(algorithmParametersCreateAlgorithmParameters2.getParameterSpec(PSSParameterSpec.class));
                    }
                } catch (IOException e2) {
                    throw new GeneralSecurityException("unable to process PSS parameters: " + e2.getMessage());
                }
            }
        }
        return signatureCreateSignature;
    }

    Cipher createSymmetricWrapper(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws OperatorCreationException {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        try {
            String str = (String) symmetricWrapperAlgNames.get(aSN1ObjectIdentifier);
            if (str != null) {
                int i4 = asBinder + 49;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                try {
                    return this.helper.createCipher(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createCipher(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e) {
            throw new OperatorCreationException("cannot create cipher: " + e.getMessage(), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        return r4.getId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r4 = org.bouncycastle.operator.jcajce.OperatorHelper.asBinder + 109;
        org.bouncycastle.operator.jcajce.OperatorHelper.asInterface = r4 % 128;
        r4 = r4 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    String getKeyAlgorithmName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str;
        int i = 2 % 2;
        int i2 = asInterface + 49;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            str = (String) symmetricKeyAlgNames.get(aSN1ObjectIdentifier);
            int i3 = 77 / 0;
        } else {
            str = (String) symmetricKeyAlgNames.get(aSN1ObjectIdentifier);
        }
    }

    int getKeySizeInBits(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Integer) symmetricWrapperKeySizes.get(aSN1ObjectIdentifier)).intValue();
        int i4 = asInterface + 105;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    String getWrappingAlgorithmName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = (String) symmetricWrapperAlgNames.get(aSN1ObjectIdentifier);
        int i3 = asBinder + 17;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 19 / 0;
        }
        return str;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onNavigationEvent;
        if (cArr3 != null) {
            int i4 = $11 + 9;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i2])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 78, 20952 - (Process.myTid() >> 22), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr2[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i2++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 75, 16037 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i5 = 1052772399;
        if (IAuthTabCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 63 - Color.blue(0), 12214 - View.MeasureSpec.makeMeasureSpec(0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i5 = 1052772399;
            }
            String str = new String(cArr4);
            int i6 = $11 + 101;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            objArr[0] = str;
            return;
        }
        if (!onExtraCallbackWithResult) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i8 = $11 + 33;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            String str2 = new String(cArr5);
            int i10 = $10 + 59;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            objArr[0] = str2;
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i12 = $11 + 113;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            try {
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 63, 12214 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i14 = $10 + 105;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 4 / 5;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void onWarmupCompleted() {
        onNavigationEvent = new char[]{32623, 32622, 32632, 32586, 32636, 32638, 32639, 32617, 32630, 32584, 32408, 32413, 32400, 32395, 32402, 32610, 32399, 32393, 32619, 32618};
        onExtraCallback = -1184334023;
        onExtraCallbackWithResult = true;
        IAuthTabCallback = true;
    }
}
