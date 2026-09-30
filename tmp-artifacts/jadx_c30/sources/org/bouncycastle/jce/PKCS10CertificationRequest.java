package org.bouncycastle.jce;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import net.sf.scuba.smartcards.BuildConfig;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.CertificationRequest;
import org.bouncycastle.asn1.pkcs.CertificationRequestInfo;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509Name;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.util.Strings;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class PKCS10CertificationRequest extends CertificationRequest {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static Hashtable algorithms = null;
    private static Hashtable keyAlgorithms = null;
    private static Set noParams = null;
    private static Hashtable oids = null;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static long onWarmupCompleted;
    private static Hashtable params;

    static {
        onExtraCallbackWithResult();
        algorithms = new Hashtable();
        params = new Hashtable();
        keyAlgorithms = new Hashtable();
        oids = new Hashtable();
        noParams = new HashSet();
        algorithms.put("MD2WITHRSAENCRYPTION", new ASN1ObjectIdentifier("1.2.840.113549.1.1.2"));
        algorithms.put("MD2WITHRSA", new ASN1ObjectIdentifier("1.2.840.113549.1.1.2"));
        algorithms.put("MD5WITHRSAENCRYPTION", new ASN1ObjectIdentifier("1.2.840.113549.1.1.4"));
        algorithms.put("MD5WITHRSA", new ASN1ObjectIdentifier("1.2.840.113549.1.1.4"));
        Hashtable hashtable = algorithms;
        Object[] objArr = new Object[1];
        a(new char[]{59001, 27941, 61648, 17515, 51990, 24238, 41549, 10733, 48263, '['}, 35676 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), objArr);
        hashtable.put(((String) objArr[0]).intern(), new ASN1ObjectIdentifier("1.2.840.113549.1.1.4"));
        algorithms.put("SHA1WITHRSAENCRYPTION", new ASN1ObjectIdentifier("1.2.840.113549.1.1.5"));
        algorithms.put("SHA1WITHRSA", new ASN1ObjectIdentifier("1.2.840.113549.1.1.5"));
        Hashtable hashtable2 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.sha224WithRSAEncryption;
        hashtable2.put("SHA224WITHRSAENCRYPTION", aSN1ObjectIdentifier);
        algorithms.put("SHA224WITHRSA", aSN1ObjectIdentifier);
        Hashtable hashtable3 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.sha256WithRSAEncryption;
        hashtable3.put("SHA256WITHRSAENCRYPTION", aSN1ObjectIdentifier2);
        algorithms.put("SHA256WITHRSA", aSN1ObjectIdentifier2);
        Hashtable hashtable4 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = PKCSObjectIdentifiers.sha384WithRSAEncryption;
        hashtable4.put("SHA384WITHRSAENCRYPTION", aSN1ObjectIdentifier3);
        algorithms.put("SHA384WITHRSA", aSN1ObjectIdentifier3);
        Hashtable hashtable5 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = PKCSObjectIdentifiers.sha512WithRSAEncryption;
        hashtable5.put("SHA512WITHRSAENCRYPTION", aSN1ObjectIdentifier4);
        algorithms.put("SHA512WITHRSA", aSN1ObjectIdentifier4);
        Hashtable hashtable6 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = PKCSObjectIdentifiers.id_RSASSA_PSS;
        hashtable6.put("SHA1WITHRSAANDMGF1", aSN1ObjectIdentifier5);
        algorithms.put("SHA224WITHRSAANDMGF1", aSN1ObjectIdentifier5);
        algorithms.put("SHA256WITHRSAANDMGF1", aSN1ObjectIdentifier5);
        algorithms.put("SHA384WITHRSAANDMGF1", aSN1ObjectIdentifier5);
        algorithms.put("SHA512WITHRSAANDMGF1", aSN1ObjectIdentifier5);
        Hashtable hashtable7 = algorithms;
        Object[] objArr2 = new Object[1];
        a(new char[]{59001, 45983, 19876, 59337, 45566, 19452, 58633, 48937, 18779, 58229, 48412}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 21991, objArr2);
        hashtable7.put(((String) objArr2[0]).intern(), new ASN1ObjectIdentifier("1.2.840.113549.1.1.5"));
        Hashtable hashtable8 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128;
        hashtable8.put("RIPEMD128WITHRSAENCRYPTION", aSN1ObjectIdentifier6);
        algorithms.put("RIPEMD128WITHRSA", aSN1ObjectIdentifier6);
        Hashtable hashtable9 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160;
        hashtable9.put("RIPEMD160WITHRSAENCRYPTION", aSN1ObjectIdentifier7);
        algorithms.put("RIPEMD160WITHRSA", aSN1ObjectIdentifier7);
        Hashtable hashtable10 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256;
        hashtable10.put("RIPEMD256WITHRSAENCRYPTION", aSN1ObjectIdentifier8);
        algorithms.put("RIPEMD256WITHRSA", aSN1ObjectIdentifier8);
        algorithms.put("SHA1WITHDSA", new ASN1ObjectIdentifier("1.2.840.10040.4.3"));
        algorithms.put("DSAWITHSHA1", new ASN1ObjectIdentifier("1.2.840.10040.4.3"));
        Hashtable hashtable11 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = NISTObjectIdentifiers.dsa_with_sha224;
        hashtable11.put("SHA224WITHDSA", aSN1ObjectIdentifier9);
        Hashtable hashtable12 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = NISTObjectIdentifiers.dsa_with_sha256;
        hashtable12.put("SHA256WITHDSA", aSN1ObjectIdentifier10);
        algorithms.put("SHA384WITHDSA", NISTObjectIdentifiers.dsa_with_sha384);
        algorithms.put("SHA512WITHDSA", NISTObjectIdentifiers.dsa_with_sha512);
        Hashtable hashtable13 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = X9ObjectIdentifiers.ecdsa_with_SHA1;
        hashtable13.put("SHA1WITHECDSA", aSN1ObjectIdentifier11);
        Hashtable hashtable14 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = X9ObjectIdentifiers.ecdsa_with_SHA224;
        hashtable14.put("SHA224WITHECDSA", aSN1ObjectIdentifier12);
        Hashtable hashtable15 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = X9ObjectIdentifiers.ecdsa_with_SHA256;
        hashtable15.put("SHA256WITHECDSA", aSN1ObjectIdentifier13);
        Hashtable hashtable16 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = X9ObjectIdentifiers.ecdsa_with_SHA384;
        hashtable16.put("SHA384WITHECDSA", aSN1ObjectIdentifier14);
        Hashtable hashtable17 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = X9ObjectIdentifiers.ecdsa_with_SHA512;
        hashtable17.put("SHA512WITHECDSA", aSN1ObjectIdentifier15);
        algorithms.put("ECDSAWITHSHA1", aSN1ObjectIdentifier11);
        Hashtable hashtable18 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier16 = CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94;
        hashtable18.put("GOST3411WITHGOST3410", aSN1ObjectIdentifier16);
        algorithms.put("GOST3410WITHGOST3411", aSN1ObjectIdentifier16);
        Hashtable hashtable19 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier17 = CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001;
        hashtable19.put("GOST3411WITHECGOST3410", aSN1ObjectIdentifier17);
        algorithms.put("GOST3411WITHECGOST3410-2001", aSN1ObjectIdentifier17);
        algorithms.put("GOST3411WITHGOST3410-2001", aSN1ObjectIdentifier17);
        oids.put(new ASN1ObjectIdentifier("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        oids.put(aSN1ObjectIdentifier, "SHA224WITHRSA");
        oids.put(aSN1ObjectIdentifier2, "SHA256WITHRSA");
        oids.put(aSN1ObjectIdentifier3, "SHA384WITHRSA");
        oids.put(aSN1ObjectIdentifier4, "SHA512WITHRSA");
        oids.put(aSN1ObjectIdentifier16, "GOST3411WITHGOST3410");
        oids.put(aSN1ObjectIdentifier17, "GOST3411WITHECGOST3410");
        oids.put(new ASN1ObjectIdentifier("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        oids.put(new ASN1ObjectIdentifier("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        oids.put(new ASN1ObjectIdentifier("1.2.840.10040.4.3"), "SHA1WITHDSA");
        oids.put(aSN1ObjectIdentifier11, "SHA1WITHECDSA");
        oids.put(aSN1ObjectIdentifier12, "SHA224WITHECDSA");
        oids.put(aSN1ObjectIdentifier13, "SHA256WITHECDSA");
        oids.put(aSN1ObjectIdentifier14, "SHA384WITHECDSA");
        oids.put(aSN1ObjectIdentifier15, "SHA512WITHECDSA");
        oids.put(OIWObjectIdentifiers.sha1WithRSA, "SHA1WITHRSA");
        Hashtable hashtable20 = oids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier18 = OIWObjectIdentifiers.dsaWithSHA1;
        hashtable20.put(aSN1ObjectIdentifier18, "SHA1WITHDSA");
        oids.put(aSN1ObjectIdentifier9, "SHA224WITHDSA");
        oids.put(aSN1ObjectIdentifier10, "SHA256WITHDSA");
        Hashtable hashtable21 = keyAlgorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier19 = PKCSObjectIdentifiers.rsaEncryption;
        Object[] objArr3 = new Object[1];
        a(new char[]{59001, 18709, 47280}, 44909 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), objArr3);
        hashtable21.put(aSN1ObjectIdentifier19, ((String) objArr3[0]).intern());
        keyAlgorithms.put(X9ObjectIdentifiers.id_dsa, "DSA");
        noParams.add(aSN1ObjectIdentifier11);
        noParams.add(aSN1ObjectIdentifier12);
        noParams.add(aSN1ObjectIdentifier13);
        noParams.add(aSN1ObjectIdentifier14);
        noParams.add(aSN1ObjectIdentifier15);
        noParams.add(X9ObjectIdentifiers.id_dsa_with_sha1);
        noParams.add(aSN1ObjectIdentifier18);
        noParams.add(aSN1ObjectIdentifier9);
        noParams.add(aSN1ObjectIdentifier10);
        noParams.add(aSN1ObjectIdentifier16);
        noParams.add(aSN1ObjectIdentifier17);
        ASN1ObjectIdentifier aSN1ObjectIdentifier20 = OIWObjectIdentifiers.idSHA1;
        DERNull dERNull = DERNull.INSTANCE;
        params.put("SHA1WITHRSAANDMGF1", creatPSSParams(new AlgorithmIdentifier(aSN1ObjectIdentifier20, dERNull), 20));
        params.put("SHA224WITHRSAANDMGF1", creatPSSParams(new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha224, dERNull), 28));
        params.put("SHA256WITHRSAANDMGF1", creatPSSParams(new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256, dERNull), 32));
        params.put("SHA384WITHRSAANDMGF1", creatPSSParams(new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384, dERNull), 48));
        params.put("SHA512WITHRSAANDMGF1", creatPSSParams(new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512, dERNull), 64));
        int i = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public PKCS10CertificationRequest(String str, X500Principal x500Principal, PublicKey publicKey, ASN1Set aSN1Set, PrivateKey privateKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException {
        this(str, convertName(x500Principal), publicKey, aSN1Set, privateKey, "BC");
    }

    public PKCS10CertificationRequest(String str, X500Principal x500Principal, PublicKey publicKey, ASN1Set aSN1Set, PrivateKey privateKey, String str2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException {
        this(str, convertName(x500Principal), publicKey, aSN1Set, privateKey, str2);
    }

    public PKCS10CertificationRequest(String str, X509Name x509Name, PublicKey publicKey, ASN1Set aSN1Set, PrivateKey privateKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException {
        this(str, x509Name, publicKey, aSN1Set, privateKey, "BC");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PKCS10CertificationRequest(String str, X509Name x509Name, PublicKey publicKey, ASN1Set aSN1Set, PrivateKey privateKey, String str2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException {
        AlgorithmIdentifier algorithmIdentifier;
        int i;
        Signature signature;
        String upperCase = Strings.toUpperCase(str);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) algorithms.get(upperCase);
        if (aSN1ObjectIdentifier == null) {
            try {
                aSN1ObjectIdentifier = new ASN1ObjectIdentifier(upperCase);
            } catch (Exception unused) {
                throw new IllegalArgumentException("Unknown signature type requested");
            }
        }
        if (x509Name == null) {
            throw new IllegalArgumentException("subject must not be null");
        }
        int i2 = onExtraCallback;
        int i3 = i2 + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (publicKey == null) {
            throw new IllegalArgumentException("public key must not be null");
        }
        int i5 = i2 + 41;
        onNavigationEvent = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            noParams.contains(aSN1ObjectIdentifier);
            obj.hashCode();
            throw null;
        }
        try {
            try {
                if (noParams.contains(aSN1ObjectIdentifier)) {
                    algorithmIdentifier = new AlgorithmIdentifier(aSN1ObjectIdentifier);
                } else {
                    if (params.containsKey(upperCase)) {
                        ((CertificationRequest) this).sigAlgId = new AlgorithmIdentifier(aSN1ObjectIdentifier, (ASN1Encodable) params.get(upperCase));
                        i = onNavigationEvent + 9;
                        onExtraCallback = i % 128;
                        int i6 = i % 2;
                        int i7 = 2 % 2;
                        ((CertificationRequest) this).reqInfo = new CertificationRequestInfo(x509Name, SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(publicKey.getEncoded())), aSN1Set);
                        if (str2 != null) {
                            int i8 = onNavigationEvent + 115;
                            onExtraCallback = i8 % 128;
                            if (i8 % 2 == 0) {
                                Signature.getInstance(str);
                                obj.hashCode();
                                throw null;
                            }
                            signature = Signature.getInstance(str);
                        } else {
                            signature = Signature.getInstance(str, str2);
                        }
                        signature.initSign(privateKey);
                        signature.update(((CertificationRequest) this).reqInfo.getEncoded(ASN1Encoding.DER));
                        ((CertificationRequest) this).sigBits = new DERBitString(signature.sign());
                        return;
                    }
                    algorithmIdentifier = new AlgorithmIdentifier(aSN1ObjectIdentifier, DERNull.INSTANCE);
                }
                signature.update(((CertificationRequest) this).reqInfo.getEncoded(ASN1Encoding.DER));
                ((CertificationRequest) this).sigBits = new DERBitString(signature.sign());
                return;
            } catch (Exception e) {
                throw new IllegalArgumentException("exception encoding TBS cert request - " + e);
            }
            ((CertificationRequest) this).reqInfo = new CertificationRequestInfo(x509Name, SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(publicKey.getEncoded())), aSN1Set);
            if (str2 != null) {
            }
            signature.initSign(privateKey);
        } catch (IOException unused2) {
            throw new IllegalArgumentException("can't encode public key");
        }
        ((CertificationRequest) this).sigAlgId = algorithmIdentifier;
        i = onNavigationEvent + 35;
        onExtraCallback = i % 128;
        int i62 = i % 2;
        int i72 = 2 % 2;
    }

    public PKCS10CertificationRequest(ASN1Sequence aSN1Sequence) {
        super(aSN1Sequence);
    }

    public PKCS10CertificationRequest(byte[] bArr) {
        super(toDERSequence(bArr));
    }

    private static X509Name convertName(X500Principal x500Principal) {
        int i = 2 % 2;
        try {
            X509Principal x509Principal = new X509Principal(x500Principal.getEncoded());
            int i2 = onExtraCallback + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return x509Principal;
        } catch (IOException unused) {
            throw new IllegalArgumentException("can't convert name");
        }
    }

    private static RSASSAPSSparams creatPSSParams(AlgorithmIdentifier algorithmIdentifier, int i) {
        int i2 = 2 % 2;
        RSASSAPSSparams rSASSAPSSparams = new RSASSAPSSparams(algorithmIdentifier, new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, algorithmIdentifier), new ASN1Integer(i), new ASN1Integer(1L));
        int i3 = onNavigationEvent + 87;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return rSASSAPSSparams;
    }

    private static String getDigestAlgName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 2 % 2;
        if (!(!PKCSObjectIdentifiers.md5.equals(aSN1ObjectIdentifier))) {
            int i2 = onNavigationEvent + 79;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return "MD5";
        }
        if (OIWObjectIdentifiers.idSHA1.equals(aSN1ObjectIdentifier)) {
            return "SHA1";
        }
        if (NISTObjectIdentifiers.id_sha224.equals(aSN1ObjectIdentifier)) {
            return "SHA224";
        }
        if (!(!NISTObjectIdentifiers.id_sha256.equals(aSN1ObjectIdentifier))) {
            int i4 = onExtraCallback + 39;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return "SHA256";
        }
        if (!(!NISTObjectIdentifiers.id_sha384.equals(aSN1ObjectIdentifier))) {
            int i6 = onNavigationEvent + 19;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return "SHA384";
        }
        if (NISTObjectIdentifiers.id_sha512.equals(aSN1ObjectIdentifier)) {
            return "SHA512";
        }
        if (TeleTrusTObjectIdentifiers.ripemd128.equals(aSN1ObjectIdentifier)) {
            int i8 = onExtraCallback + 37;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 7 / 0;
            }
            return "RIPEMD128";
        }
        if (TeleTrusTObjectIdentifiers.ripemd160.equals(aSN1ObjectIdentifier)) {
            return "RIPEMD160";
        }
        if (TeleTrusTObjectIdentifiers.ripemd256.equals(aSN1ObjectIdentifier)) {
            return "RIPEMD256";
        }
        if (!CryptoProObjectIdentifiers.gostR3411.equals(aSN1ObjectIdentifier)) {
            return aSN1ObjectIdentifier.getId();
        }
        int i10 = onNavigationEvent + 53;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        return "GOST3411";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static String getSignatureName(AlgorithmIdentifier algorithmIdentifier) {
        int i = 2 % 2;
        ASN1Encodable parameters = algorithmIdentifier.getParameters();
        if (parameters != null) {
            int i2 = onExtraCallback + 97;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 61 / 0;
                if (!DERNull.INSTANCE.equals(parameters)) {
                    if (algorithmIdentifier.getAlgorithm().equals(PKCSObjectIdentifiers.id_RSASSA_PSS)) {
                        String str = getDigestAlgName(RSASSAPSSparams.getInstance(parameters).getHashAlgorithm().getAlgorithm()) + "withRSAandMGF1";
                        int i4 = onNavigationEvent + 95;
                        onExtraCallback = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i5 = 49 / 0;
                        }
                        return str;
                    }
                }
            } else if (!DERNull.INSTANCE.equals(parameters)) {
            }
        }
        return algorithmIdentifier.getAlgorithm().getId();
    }

    private void setSignatureParameters(Signature signature, ASN1Encodable aSN1Encodable) throws NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (aSN1Encodable != null) {
            int i5 = i3 + 117;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            if (!(!DERNull.INSTANCE.equals(aSN1Encodable))) {
                return;
            }
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
            try {
                algorithmParameters.init(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER));
                if (signature.getAlgorithm().endsWith("MGF1")) {
                    try {
                        signature.setParameter(algorithmParameters.getParameterSpec(PSSParameterSpec.class));
                        int i7 = onNavigationEvent + 69;
                        onExtraCallback = i7 % 128;
                        if (i7 % 2 == 0) {
                            throw null;
                        }
                    } catch (GeneralSecurityException e) {
                        throw new SignatureException("Exception extracting parameters: " + e.getMessage());
                    }
                }
            } catch (IOException e2) {
                throw new SignatureException("IOException decoding parameters: " + e2.getMessage());
            }
        }
    }

    private static ASN1Sequence toDERSequence(byte[] bArr) {
        int i = 2 % 2;
        try {
            ASN1Sequence object = new ASN1InputStream(bArr).readObject();
            int i2 = onNavigationEvent + 11;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return object;
            }
            throw null;
        } catch (Exception unused) {
            throw new IllegalArgumentException("badly encoded request");
        }
    }

    public byte[] getEncoded() {
        byte[] encoded;
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onNavigationEvent = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                encoded = getEncoded(ASN1Encoding.DER);
                int i3 = 71 / 0;
            } else {
                encoded = getEncoded(ASN1Encoding.DER);
            }
            int i4 = onExtraCallback + 19;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return encoded;
            }
            throw null;
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }

    public PublicKey getPublicKey() throws InvalidKeySpecException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        PublicKey publicKey = getPublicKey("BC");
        if (i3 != 0) {
            int i4 = 74 / 0;
        }
        return publicKey;
    }

    public PublicKey getPublicKey(String str) throws InvalidKeySpecException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException {
        int i = 2 % 2;
        SubjectPublicKeyInfo subjectPublicKeyInfo = ((CertificationRequest) this).reqInfo.getSubjectPublicKeyInfo();
        try {
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(new DERBitString(subjectPublicKeyInfo).getOctets());
            AlgorithmIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm();
            try {
                return (str == null ? KeyFactory.getInstance(algorithm.getAlgorithm().getId()) : KeyFactory.getInstance(algorithm.getAlgorithm().getId(), str)).generatePublic(x509EncodedKeySpec);
            } catch (NoSuchAlgorithmException e) {
                if (keyAlgorithms.get(algorithm.getAlgorithm()) == null) {
                    throw e;
                }
                int i2 = onExtraCallback + 33;
                onNavigationEvent = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    throw null;
                }
                String str2 = (String) keyAlgorithms.get(algorithm.getAlgorithm());
                if (str == null) {
                    return KeyFactory.getInstance(str2).generatePublic(x509EncodedKeySpec);
                }
                PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str2, str).generatePublic(x509EncodedKeySpec);
                int i3 = onNavigationEvent + 11;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return publicKeyGeneratePublic;
                }
                obj.hashCode();
                throw null;
            }
        } catch (IOException unused) {
            throw new InvalidKeyException("error decoding public key");
        } catch (InvalidKeySpecException unused2) {
            throw new InvalidKeyException("error decoding public key");
        }
    }

    public boolean verify() throws NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zVerify = verify("BC");
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
        return zVerify;
    }

    public boolean verify(String str) throws NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        boolean zVerify;
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            zVerify = verify(getPublicKey(str), str);
            int i3 = 26 / 0;
        } else {
            zVerify = verify(getPublicKey(str), str);
        }
        int i4 = onNavigationEvent + 117;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return zVerify;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [org.bouncycastle.asn1.pkcs.CertificationRequest, org.bouncycastle.jce.PKCS10CertificationRequest] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.security.Signature] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.security.Signature] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.security.Signature] */
    public boolean verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        int i = 2 % 2;
        try {
            str = str == 0 ? Signature.getInstance(getSignatureName(((CertificationRequest) this).sigAlgId)) : Signature.getInstance(getSignatureName(((CertificationRequest) this).sigAlgId), (String) str);
        } catch (NoSuchAlgorithmException e) {
            if (oids.get(((CertificationRequest) this).sigAlgId.getAlgorithm()) == null) {
                throw e;
            }
            String str2 = (String) oids.get(((CertificationRequest) this).sigAlgId.getAlgorithm());
            if (str == 0) {
                int i2 = onExtraCallback + 113;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                str = Signature.getInstance(str2);
            } else {
                str = Signature.getInstance(str2, (String) str);
                int i4 = onExtraCallback + 115;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        setSignatureParameters(str, ((CertificationRequest) this).sigAlgId.getParameters());
        str.initVerify(publicKey);
        try {
            str.update(((CertificationRequest) this).reqInfo.getEncoded(ASN1Encoding.DER));
            return str.verify(((CertificationRequest) this).sigBits.getOctets());
        } catch (Exception e2) {
            throw new SignatureException("exception encoding TBS cert request - " + e2);
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 15;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 24, 19626 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() * (onWarmupCompleted - 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString(BuildConfig.FLAVOR)), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 60, Color.rgb(0, 0, 0) + 16783599, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23, 19627 - Drawable.resolveOpacity(0, 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onWarmupCompleted ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 59, 6383 - Color.argb(0, 0, 0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i6 = $10 + 39;
        while (true) {
            $11 = i6 % 128;
            int i7 = i6 % 2;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                objArr[0] = new String(cArr2);
                return;
            }
            int i8 = $11 + 21;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getTouchSlop() >> 8) + 59, 6383 - (ViewConfiguration.getEdgeSlop() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                int i9 = 67 / 0;
            } else {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr7 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 58, 6383 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
            i6 = $10 + 95;
        }
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = -7375151937410276580L;
    }
}
