package org.bouncycastle.jcajce.provider.keystore.pkcs12;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.onVideoError;
import org.bouncycastle.asn1.ASN1BMPString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DERBMPString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.GOST28147Parameters;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.AuthenticatedSafe;
import org.bouncycastle.asn1.pkcs.CertBag;
import org.bouncycastle.asn1.pkcs.ContentInfo;
import org.bouncycastle.asn1.pkcs.EncryptedData;
import org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.MacData;
import org.bouncycastle.asn1.pkcs.PBES2Parameters;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.pkcs.PKCS12PBEParams;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.Pfx;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.SafeBag;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.SubjectKeyIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.cms.CMSEnvelopedGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.jcajce.BCLoadStoreParameter;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jcajce.PKCS12StoreParameter;
import org.bouncycastle.jcajce.provider.keystore.util.AdaptingKeyStoreSpi;
import org.bouncycastle.jcajce.provider.keystore.util.ParameterUtil;
import org.bouncycastle.jcajce.spec.GOST28147ParameterSpec;
import org.bouncycastle.jcajce.spec.PBKDF2KeySpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.interfaces.BCKeyStore;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.provider.JDKPKCS12StoreParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Properties;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class PKCS12KeyStoreSpi extends KeyStoreSpi implements PKCSObjectIdentifiers, X509ObjectIdentifiers, BCKeyStore {
    private static int $10 = 0;
    private static int $11 = 1;
    static final int CERTIFICATE = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    static final int KEY = 2;
    static final int KEY_PRIVATE = 0;
    static final int KEY_PUBLIC = 1;
    static final int KEY_SECRET = 2;
    private static final int MIN_ITERATIONS = 51200;
    static final int NULL = 0;
    static final String PKCS12_MAX_IT_COUNT_PROPERTY = "org.bouncycastle.pkcs12.max_it_count";
    private static final int SALT_SIZE = 20;
    static final int SEALED = 4;
    static final int SECRET = 3;
    private static int asInterface = 1;
    private static final DefaultSecretKeyProvider keySizeProvider;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;
    private ASN1ObjectIdentifier certAlgorithm;
    private CertificateFactory certFact;
    private IgnoresCaseHashtable certs;
    private ASN1ObjectIdentifier keyAlgorithm;
    private IgnoresCaseHashtable keys;
    private IgnoresCaseHashtable localIds;
    private final JcaJceHelper helper = new BCJcaJceHelper();
    private Hashtable chainCerts = new Hashtable();
    private Hashtable keyCerts = new Hashtable();
    protected SecureRandom random = CryptoServicesRegistrar.getSecureRandom();
    private AlgorithmIdentifier macAlgorithm = new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, DERNull.INSTANCE);
    private int itCount = 102400;
    private int saltLength = 20;

    public static class BCPKCS12KeyStore extends AdaptingKeyStoreSpi {
        public BCPKCS12KeyStore() {
            super(new BCJcaJceHelper(), new PKCS12KeyStoreSpi(new BCJcaJceHelper(), PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC, PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC));
        }
    }

    public static class BCPKCS12KeyStore3DES extends AdaptingKeyStoreSpi {
        public BCPKCS12KeyStore3DES() {
            BCJcaJceHelper bCJcaJceHelper = new BCJcaJceHelper();
            BCJcaJceHelper bCJcaJceHelper2 = new BCJcaJceHelper();
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC;
            super(bCJcaJceHelper, new PKCS12KeyStoreSpi(bCJcaJceHelper2, aSN1ObjectIdentifier, aSN1ObjectIdentifier));
        }
    }

    class CertId {
        byte[] id;

        CertId(PublicKey publicKey) {
            this.id = PKCS12KeyStoreSpi.access$100(PKCS12KeyStoreSpi.this, publicKey).getKeyIdentifier();
        }

        CertId(byte[] bArr) {
            this.id = bArr;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof CertId) {
                return Arrays.areEqual(this.id, ((CertId) obj).id);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.id);
        }
    }

    public static class DefPKCS12KeyStore extends AdaptingKeyStoreSpi {
        public DefPKCS12KeyStore() {
            super(new DefaultJcaJceHelper(), new PKCS12KeyStoreSpi(new DefaultJcaJceHelper(), PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC, PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC));
        }
    }

    public static class DefPKCS12KeyStore3DES extends AdaptingKeyStoreSpi {
        public DefPKCS12KeyStore3DES() {
            DefaultJcaJceHelper defaultJcaJceHelper = new DefaultJcaJceHelper();
            DefaultJcaJceHelper defaultJcaJceHelper2 = new DefaultJcaJceHelper();
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC;
            super(defaultJcaJceHelper, new PKCS12KeyStoreSpi(defaultJcaJceHelper2, aSN1ObjectIdentifier, aSN1ObjectIdentifier));
        }
    }

    static class DefaultSecretKeyProvider {
        private final Map KEY_SIZES;

        DefaultSecretKeyProvider() {
            HashMap map = new HashMap();
            map.put(new ASN1ObjectIdentifier(CMSEnvelopedGenerator.CAST5_CBC), Integers.valueOf(128));
            map.put(PKCSObjectIdentifiers.des_EDE3_CBC, Integers.valueOf(CertificateHolderAuthorization.CVCA));
            map.put(NISTObjectIdentifiers.id_aes128_CBC, Integers.valueOf(128));
            map.put(NISTObjectIdentifiers.id_aes192_CBC, Integers.valueOf(CertificateHolderAuthorization.CVCA));
            map.put(NISTObjectIdentifiers.id_aes256_CBC, Integers.valueOf(256));
            map.put(NTTObjectIdentifiers.id_camellia128_cbc, Integers.valueOf(128));
            map.put(NTTObjectIdentifiers.id_camellia192_cbc, Integers.valueOf(CertificateHolderAuthorization.CVCA));
            map.put(NTTObjectIdentifiers.id_camellia256_cbc, Integers.valueOf(256));
            map.put(CryptoProObjectIdentifiers.gostR28147_gcfb, Integers.valueOf(256));
            this.KEY_SIZES = Collections.unmodifiableMap(map);
        }

        public int getKeySize(AlgorithmIdentifier algorithmIdentifier) {
            Integer num = (Integer) this.KEY_SIZES.get(algorithmIdentifier.getAlgorithm());
            if (num != null) {
                return num.intValue();
            }
            return -1;
        }
    }

    static class IgnoresCaseHashtable {
        private Hashtable keys;
        private Hashtable orig;

        private IgnoresCaseHashtable() {
            this.orig = new Hashtable();
            this.keys = new Hashtable();
        }

        public Enumeration elements() {
            return this.orig.elements();
        }

        public Object get(String str) {
            String str2 = (String) this.keys.get(str == null ? null : Strings.toLowerCase(str));
            if (str2 == null) {
                return null;
            }
            return this.orig.get(str2);
        }

        public Enumeration keys() {
            return this.orig.keys();
        }

        public void put(String str, Object obj) {
            String lowerCase = str == null ? null : Strings.toLowerCase(str);
            String str2 = (String) this.keys.get(lowerCase);
            if (str2 != null) {
                this.orig.remove(str2);
            }
            this.keys.put(lowerCase, str);
            this.orig.put(str, obj);
        }

        public Object remove(String str) {
            String str2 = (String) this.keys.remove(str == null ? null : Strings.toLowerCase(str));
            if (str2 == null) {
                return null;
            }
            return this.orig.remove(str2);
        }

        public int size() {
            return this.orig.size();
        }
    }

    static {
        onExtraCallbackWithResult();
        keySizeProvider = new DefaultSecretKeyProvider();
        int i = IAuthTabCallbackDefault + 125;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public PKCS12KeyStoreSpi(JcaJceHelper jcaJceHelper, ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1ObjectIdentifier aSN1ObjectIdentifier2) {
        this.keys = new IgnoresCaseHashtable();
        this.localIds = new IgnoresCaseHashtable();
        this.certs = new IgnoresCaseHashtable();
        this.keyAlgorithm = aSN1ObjectIdentifier;
        this.certAlgorithm = aSN1ObjectIdentifier2;
        try {
            this.certFact = jcaJceHelper.createCertificateFactory("X.509");
        } catch (Exception e) {
            throw new IllegalArgumentException("can't create cert factory - " + e.toString());
        }
    }

    static /* synthetic */ SubjectKeyIdentifier access$100(PKCS12KeyStoreSpi pKCS12KeyStoreSpi, PublicKey publicKey) {
        int i = 2 % 2;
        int i2 = onTransact + 109;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        SubjectKeyIdentifier subjectKeyIdentifierCreateSubjectKeyId = pKCS12KeyStoreSpi.createSubjectKeyId(publicKey);
        int i4 = asInterface + 121;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return subjectKeyIdentifierCreateSubjectKeyId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private byte[] calculatePbeMac(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr, int i, char[] cArr, boolean z, byte[] bArr2) throws Exception {
        int i2 = 2 % 2;
        PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, i);
        Mac macCreateMac = this.helper.createMac(aSN1ObjectIdentifier.getId());
        macCreateMac.init(new PKCS12Key(cArr, z), pBEParameterSpec);
        macCreateMac.update(bArr2);
        byte[] bArrDoFinal = macCreateMac.doFinal();
        int i3 = onTransact + 121;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return bArrDoFinal;
    }

    private Cipher createCipher(int i, char[] cArr, AlgorithmIdentifier algorithmIdentifier) throws InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeySpec pBKDF2KeySpec;
        AlgorithmParameterSpec gOST28147ParameterSpec;
        int i2 = 2 % 2;
        PBES2Parameters pBES2Parameters = PBES2Parameters.getInstance(algorithmIdentifier.getParameters());
        PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(pBES2Parameters.getKeyDerivationFunc().getParameters());
        AlgorithmIdentifier algorithmIdentifier2 = AlgorithmIdentifier.getInstance(pBES2Parameters.getEncryptionScheme());
        SecretKeyFactory secretKeyFactoryCreateSecretKeyFactory = this.helper.createSecretKeyFactory(pBES2Parameters.getKeyDerivationFunc().getAlgorithm().getId());
        if (pBKDF2Params.isDefaultPrf()) {
            pBKDF2KeySpec = new PBEKeySpec(cArr, pBKDF2Params.getSalt(), validateIterationCount(pBKDF2Params.getIterationCount()), keySizeProvider.getKeySize(algorithmIdentifier2));
        } else {
            pBKDF2KeySpec = new PBKDF2KeySpec(cArr, pBKDF2Params.getSalt(), validateIterationCount(pBKDF2Params.getIterationCount()), keySizeProvider.getKeySize(algorithmIdentifier2), pBKDF2Params.getPrf());
            int i3 = onTransact + 77;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        }
        SecretKey secretKeyGenerateSecret = secretKeyFactoryCreateSecretKeyFactory.generateSecret(pBKDF2KeySpec);
        Cipher cipherCreateCipher = this.helper.createCipher(pBES2Parameters.getEncryptionScheme().getAlgorithm().getId());
        ASN1Encodable parameters = pBES2Parameters.getEncryptionScheme().getParameters();
        if (parameters instanceof ASN1OctetString) {
            gOST28147ParameterSpec = new IvParameterSpec(ASN1OctetString.getInstance(parameters).getOctets());
            int i5 = onTransact + 103;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
        } else {
            GOST28147Parameters gOST28147Parameters = GOST28147Parameters.getInstance(parameters);
            gOST28147ParameterSpec = new GOST28147ParameterSpec(gOST28147Parameters.getEncryptionParamSet(), gOST28147Parameters.getIV());
        }
        cipherCreateCipher.init(i, secretKeyGenerateSecret, gOST28147ParameterSpec);
        return cipherCreateCipher;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private SafeBag createSafeBag(String str, Certificate certificate) throws CertificateEncodingException {
        Enumeration bagAttributeKeys;
        int i = 2 % 2;
        CertBag certBag = new CertBag(PKCSObjectIdentifiers.x509Certificate, new DEROctetString(certificate.getEncoded()));
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        if (!(certificate instanceof PKCS12BagAttributeCarrier)) {
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            aSN1EncodableVector2.add(PKCSObjectIdentifiers.pkcs_9_at_friendlyName);
            aSN1EncodableVector2.add(new DERSet(new DERBMPString(str)));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        } else {
            int i2 = asInterface + 27;
            onTransact = i2 % 128;
            PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier = (PKCS12BagAttributeCarrier) certificate;
            if (i2 % 2 != 0) {
                pKCS12BagAttributeCarrier.getBagAttribute(PKCSObjectIdentifiers.pkcs_9_at_friendlyName);
                throw null;
            }
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.pkcs_9_at_friendlyName;
            ASN1BMPString bagAttribute = pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier);
            boolean z = false;
            if (bagAttribute != null) {
                int i3 = asInterface + 105;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                boolean zEquals = bagAttribute.getString().equals(str);
                if (i4 != 0) {
                    int i5 = 91 / 0;
                    if (!zEquals) {
                        if (str != null) {
                            pKCS12BagAttributeCarrier.setBagAttribute(aSN1ObjectIdentifier, new DERBMPString(str));
                            int i6 = onTransact + 7;
                            asInterface = i6 % 128;
                            int i7 = i6 % 2;
                        }
                    }
                    bagAttributeKeys = pKCS12BagAttributeCarrier.getBagAttributeKeys();
                    while (bagAttributeKeys.hasMoreElements()) {
                        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = (ASN1ObjectIdentifier) bagAttributeKeys.nextElement();
                        if (!aSN1ObjectIdentifier2.equals(PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                            ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
                            aSN1EncodableVector3.add(aSN1ObjectIdentifier2);
                            aSN1EncodableVector3.add(new DERSet(pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier2)));
                            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector3));
                            z = true;
                        }
                    }
                    if (!z) {
                    }
                } else {
                    if (!zEquals) {
                    }
                    bagAttributeKeys = pKCS12BagAttributeCarrier.getBagAttributeKeys();
                    while (bagAttributeKeys.hasMoreElements()) {
                    }
                    if (!z) {
                    }
                }
            }
        }
        return new SafeBag(PKCSObjectIdentifiers.certBag, certBag.toASN1Primitive(), new DERSet(aSN1EncodableVector));
    }

    private SubjectKeyIdentifier createSubjectKeyId(PublicKey publicKey) {
        int i = 2 % 2;
        try {
            SubjectKeyIdentifier subjectKeyIdentifier = new SubjectKeyIdentifier(getDigest(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded())));
            int i2 = onTransact + 71;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return subjectKeyIdentifier;
        } catch (Exception unused) {
            throw new RuntimeException("error creating key");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void doStore(OutputStream outputStream, char[] cArr, boolean z) throws BadPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String str;
        Hashtable hashtable;
        String str2;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = asInterface + 57;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int size = this.keys.size();
        String str3 = ASN1Encoding.BER;
        Object obj = null;
        if (size == 0) {
            if (cArr == null) {
                Enumeration enumerationKeys = this.certs.keys();
                ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                while (enumerationKeys.hasMoreElements()) {
                    int i5 = onTransact + 59;
                    asInterface = i5 % 128;
                    if (i5 % 2 == 0) {
                        String str4 = (String) enumerationKeys.nextElement();
                        aSN1EncodableVector.add(createSafeBag(str4, (Certificate) this.certs.get(str4)));
                        obj.hashCode();
                        throw null;
                    }
                    try {
                        String str5 = (String) enumerationKeys.nextElement();
                        aSN1EncodableVector.add(createSafeBag(str5, (Certificate) this.certs.get(str5)));
                    } catch (CertificateEncodingException e) {
                        throw new IOException("Error encoding certificate: " + e.toString());
                    }
                    throw new IOException("Error encoding certificate: " + e.toString());
                }
                ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.data;
                if (z) {
                    new Pfx(new ContentInfo(aSN1ObjectIdentifier, new DEROctetString(new DERSequence(new ContentInfo(aSN1ObjectIdentifier, new DEROctetString(new DERSequence(aSN1EncodableVector).getEncoded()))).getEncoded())), null).encodeTo(outputStream, ASN1Encoding.DER);
                    return;
                } else {
                    new Pfx(new ContentInfo(aSN1ObjectIdentifier, new BEROctetString(new BERSequence(new ContentInfo(aSN1ObjectIdentifier, new BEROctetString(new BERSequence(aSN1EncodableVector).getEncoded()))).getEncoded())), null).encodeTo(outputStream, ASN1Encoding.BER);
                    return;
                }
            }
        } else if (cArr == null) {
            throw new NullPointerException("no password supplied for PKCS#12 KeyStore");
        }
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        Enumeration enumerationKeys2 = this.keys.keys();
        int i6 = asInterface + 25;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        while (enumerationKeys2.hasMoreElements()) {
            byte[] bArr = new byte[20];
            this.random.nextBytes(bArr);
            String str6 = (String) enumerationKeys2.nextElement();
            PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier = (PrivateKey) this.keys.get(str6);
            PKCS12PBEParams pKCS12PBEParams = new PKCS12PBEParams(bArr, MIN_ITERATIONS);
            EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = new EncryptedPrivateKeyInfo(new AlgorithmIdentifier(this.keyAlgorithm, pKCS12PBEParams.toASN1Primitive()), wrapKey(this.keyAlgorithm.getId(), pKCS12BagAttributeCarrier, pKCS12PBEParams, cArr));
            ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
            if (pKCS12BagAttributeCarrier instanceof PKCS12BagAttributeCarrier) {
                PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier2 = pKCS12BagAttributeCarrier;
                ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.pkcs_9_at_friendlyName;
                ASN1BMPString bagAttribute = pKCS12BagAttributeCarrier2.getBagAttribute(aSN1ObjectIdentifier2);
                if (bagAttribute == null || !bagAttribute.getString().equals(str6)) {
                    pKCS12BagAttributeCarrier2.setBagAttribute(aSN1ObjectIdentifier2, new DERBMPString(str6));
                }
                ASN1ObjectIdentifier aSN1ObjectIdentifier3 = PKCSObjectIdentifiers.pkcs_9_at_localKeyId;
                if (pKCS12BagAttributeCarrier2.getBagAttribute(aSN1ObjectIdentifier3) == null) {
                    int i8 = asInterface + 11;
                    onTransact = i8 % 128;
                    int i9 = i8 % i;
                    pKCS12BagAttributeCarrier2.setBagAttribute(aSN1ObjectIdentifier3, createSubjectKeyId(engineGetCertificate(str6).getPublicKey()));
                }
                Enumeration bagAttributeKeys = pKCS12BagAttributeCarrier2.getBagAttributeKeys();
                boolean z2 = false;
                while (bagAttributeKeys.hasMoreElements()) {
                    ASN1ObjectIdentifier aSN1ObjectIdentifier4 = (ASN1ObjectIdentifier) bagAttributeKeys.nextElement();
                    ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
                    aSN1EncodableVector4.add(aSN1ObjectIdentifier4);
                    aSN1EncodableVector4.add(new DERSet(pKCS12BagAttributeCarrier2.getBagAttribute(aSN1ObjectIdentifier4)));
                    aSN1EncodableVector3.add(new DERSequence(aSN1EncodableVector4));
                    z2 = true;
                }
                if (!z2) {
                }
            } else {
                ASN1EncodableVector aSN1EncodableVector5 = new ASN1EncodableVector();
                Certificate certificateEngineGetCertificate = engineGetCertificate(str6);
                aSN1EncodableVector5.add(PKCSObjectIdentifiers.pkcs_9_at_localKeyId);
                aSN1EncodableVector5.add(new DERSet(createSubjectKeyId(certificateEngineGetCertificate.getPublicKey())));
                aSN1EncodableVector3.add(new DERSequence(aSN1EncodableVector5));
                ASN1EncodableVector aSN1EncodableVector6 = new ASN1EncodableVector();
                aSN1EncodableVector6.add(PKCSObjectIdentifiers.pkcs_9_at_friendlyName);
                aSN1EncodableVector6.add(new DERSet(new DERBMPString(str6)));
                aSN1EncodableVector3.add(new DERSequence(aSN1EncodableVector6));
            }
            aSN1EncodableVector2.add(new SafeBag(PKCSObjectIdentifiers.pkcs8ShroudedKeyBag, encryptedPrivateKeyInfo.toASN1Primitive(), new DERSet(aSN1EncodableVector3)));
            i = 2;
        }
        BEROctetString bEROctetString = new BEROctetString(new DERSequence(aSN1EncodableVector2).getEncoded(ASN1Encoding.DER));
        byte[] bArr2 = new byte[20];
        this.random.nextBytes(bArr2);
        ASN1EncodableVector aSN1EncodableVector7 = new ASN1EncodableVector();
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(this.certAlgorithm, new PKCS12PBEParams(bArr2, MIN_ITERATIONS).toASN1Primitive());
        Hashtable hashtable2 = new Hashtable();
        Enumeration enumerationKeys3 = this.keys.keys();
        while (enumerationKeys3.hasMoreElements()) {
            try {
                String str7 = (String) enumerationKeys3.nextElement();
                PKCS12BagAttributeCarrier pKCS12BagAttributeCarrierEngineGetCertificate = engineGetCertificate(str7);
                Enumeration enumeration = enumerationKeys3;
                CertBag certBag = new CertBag(PKCSObjectIdentifiers.x509Certificate, new DEROctetString(pKCS12BagAttributeCarrierEngineGetCertificate.getEncoded()));
                ASN1EncodableVector aSN1EncodableVector8 = new ASN1EncodableVector();
                if (pKCS12BagAttributeCarrierEngineGetCertificate instanceof PKCS12BagAttributeCarrier) {
                    PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier3 = pKCS12BagAttributeCarrierEngineGetCertificate;
                    ASN1ObjectIdentifier aSN1ObjectIdentifier5 = PKCSObjectIdentifiers.pkcs_9_at_friendlyName;
                    ASN1BMPString bagAttribute2 = pKCS12BagAttributeCarrier3.getBagAttribute(aSN1ObjectIdentifier5);
                    if (bagAttribute2 == null || !bagAttribute2.getString().equals(str7)) {
                        pKCS12BagAttributeCarrier3.setBagAttribute(aSN1ObjectIdentifier5, new DERBMPString(str7));
                    }
                    ASN1ObjectIdentifier aSN1ObjectIdentifier6 = PKCSObjectIdentifiers.pkcs_9_at_localKeyId;
                    if (pKCS12BagAttributeCarrier3.getBagAttribute(aSN1ObjectIdentifier6) == null) {
                        pKCS12BagAttributeCarrier3.setBagAttribute(aSN1ObjectIdentifier6, createSubjectKeyId(pKCS12BagAttributeCarrierEngineGetCertificate.getPublicKey()));
                    }
                    Enumeration bagAttributeKeys2 = pKCS12BagAttributeCarrier3.getBagAttributeKeys();
                    boolean z3 = false;
                    while (bagAttributeKeys2.hasMoreElements()) {
                        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = (ASN1ObjectIdentifier) bagAttributeKeys2.nextElement();
                        Enumeration enumeration2 = bagAttributeKeys2;
                        ASN1EncodableVector aSN1EncodableVector9 = new ASN1EncodableVector();
                        aSN1EncodableVector9.add(aSN1ObjectIdentifier7);
                        aSN1EncodableVector9.add(new DERSet(pKCS12BagAttributeCarrier3.getBagAttribute(aSN1ObjectIdentifier7)));
                        aSN1EncodableVector8.add(new DERSequence(aSN1EncodableVector9));
                        bagAttributeKeys2 = enumeration2;
                        str3 = str3;
                        z3 = true;
                    }
                    str2 = str3;
                    if (!z3) {
                    }
                    aSN1EncodableVector7.add(new SafeBag(PKCSObjectIdentifiers.certBag, certBag.toASN1Primitive(), new DERSet(aSN1EncodableVector8)));
                    hashtable2.put(pKCS12BagAttributeCarrierEngineGetCertificate, pKCS12BagAttributeCarrierEngineGetCertificate);
                    enumerationKeys3 = enumeration;
                    str3 = str2;
                } else {
                    str2 = str3;
                }
                ASN1EncodableVector aSN1EncodableVector10 = new ASN1EncodableVector();
                aSN1EncodableVector10.add(PKCSObjectIdentifiers.pkcs_9_at_localKeyId);
                aSN1EncodableVector10.add(new DERSet(createSubjectKeyId(pKCS12BagAttributeCarrierEngineGetCertificate.getPublicKey())));
                aSN1EncodableVector8.add(new DERSequence(aSN1EncodableVector10));
                ASN1EncodableVector aSN1EncodableVector11 = new ASN1EncodableVector();
                aSN1EncodableVector11.add(PKCSObjectIdentifiers.pkcs_9_at_friendlyName);
                aSN1EncodableVector11.add(new DERSet(new DERBMPString(str7)));
                aSN1EncodableVector8.add(new DERSequence(aSN1EncodableVector11));
                aSN1EncodableVector7.add(new SafeBag(PKCSObjectIdentifiers.certBag, certBag.toASN1Primitive(), new DERSet(aSN1EncodableVector8)));
                hashtable2.put(pKCS12BagAttributeCarrierEngineGetCertificate, pKCS12BagAttributeCarrierEngineGetCertificate);
                enumerationKeys3 = enumeration;
                str3 = str2;
            } catch (CertificateEncodingException e2) {
                throw new IOException("Error encoding certificate: " + e2.toString());
            }
        }
        String str8 = str3;
        Enumeration enumerationKeys4 = this.certs.keys();
        while (enumerationKeys4.hasMoreElements()) {
            try {
                String str9 = (String) enumerationKeys4.nextElement();
                Certificate certificate = (Certificate) this.certs.get(str9);
                if (this.keys.get(str9) == null) {
                    aSN1EncodableVector7.add(createSafeBag(str9, certificate));
                    hashtable2.put(certificate, certificate);
                }
            } catch (CertificateEncodingException e3) {
                throw new IOException("Error encoding certificate: " + e3.toString());
            }
        }
        Set usedCertificateSet = getUsedCertificateSet();
        Enumeration enumerationKeys5 = this.chainCerts.keys();
        while (enumerationKeys5.hasMoreElements()) {
            int i10 = asInterface + 31;
            onTransact = i10 % 128;
            if (i10 % 2 != 0) {
                usedCertificateSet.contains((Certificate) this.chainCerts.get((CertId) enumerationKeys5.nextElement()));
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            try {
                PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier4 = (Certificate) this.chainCerts.get((CertId) enumerationKeys5.nextElement());
                if (usedCertificateSet.contains(pKCS12BagAttributeCarrier4) && hashtable2.get(pKCS12BagAttributeCarrier4) == null) {
                    CertBag certBag2 = new CertBag(PKCSObjectIdentifiers.x509Certificate, new DEROctetString(pKCS12BagAttributeCarrier4.getEncoded()));
                    ASN1EncodableVector aSN1EncodableVector12 = new ASN1EncodableVector();
                    if (pKCS12BagAttributeCarrier4 instanceof PKCS12BagAttributeCarrier) {
                        int i11 = onTransact + 83;
                        asInterface = i11 % 128;
                        if (i11 % 2 == 0) {
                            pKCS12BagAttributeCarrier4.getBagAttributeKeys();
                            throw null;
                        }
                        PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier5 = pKCS12BagAttributeCarrier4;
                        Enumeration bagAttributeKeys3 = pKCS12BagAttributeCarrier5.getBagAttributeKeys();
                        while (bagAttributeKeys3.hasMoreElements()) {
                            ASN1ObjectIdentifier aSN1ObjectIdentifier8 = (ASN1ObjectIdentifier) bagAttributeKeys3.nextElement();
                            if (aSN1ObjectIdentifier8.equals(PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                hashtable = hashtable2;
                            } else {
                                ASN1EncodableVector aSN1EncodableVector13 = new ASN1EncodableVector();
                                aSN1EncodableVector13.add(aSN1ObjectIdentifier8);
                                hashtable = hashtable2;
                                aSN1EncodableVector13.add(new DERSet(pKCS12BagAttributeCarrier5.getBagAttribute(aSN1ObjectIdentifier8)));
                                aSN1EncodableVector12.add(new DERSequence(aSN1EncodableVector13));
                            }
                            hashtable2 = hashtable;
                        }
                    }
                    Hashtable hashtable3 = hashtable2;
                    aSN1EncodableVector7.add(new SafeBag(PKCSObjectIdentifiers.certBag, certBag2.toASN1Primitive(), new DERSet(aSN1EncodableVector12)));
                    hashtable2 = hashtable3;
                }
            } catch (CertificateEncodingException e4) {
                throw new IOException("Error encoding certificate: " + e4.toString());
            }
        }
        byte[] bArrCryptData = cryptData(true, algorithmIdentifier, cArr, false, new DERSequence(aSN1EncodableVector7).getEncoded(ASN1Encoding.DER));
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = PKCSObjectIdentifiers.data;
        ContentInfo contentInfo = new ContentInfo(aSN1ObjectIdentifier9, new BEROctetString(new AuthenticatedSafe(new ContentInfo[]{new ContentInfo(aSN1ObjectIdentifier9, bEROctetString), new ContentInfo(PKCSObjectIdentifiers.encryptedData, new EncryptedData(aSN1ObjectIdentifier9, algorithmIdentifier, new BEROctetString(bArrCryptData)).toASN1Primitive())}).getEncoded(z ? ASN1Encoding.DER : str8)));
        byte[] bArr3 = new byte[this.saltLength];
        this.random.nextBytes(bArr3);
        try {
            Pfx pfx = new Pfx(contentInfo, new MacData(new DigestInfo(this.macAlgorithm, calculatePbeMac(this.macAlgorithm.getAlgorithm(), bArr3, this.itCount, cArr, false, contentInfo.getContent().getOctets())), bArr3, this.itCount));
            if (z) {
                int i12 = onTransact + 109;
                asInterface = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 25 / 0;
                }
                str = ASN1Encoding.DER;
            } else {
                str = str8;
            }
            pfx.encodeTo(outputStream, str);
        } catch (Exception e5) {
            throw new IOException("error constructing MAC: " + e5.toString());
        }
    }

    private static byte[] getDigest(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Digest digestCreateSHA1 = DigestFactory.createSHA1();
        byte[] bArr = new byte[digestCreateSHA1.getDigestSize()];
        byte[] bytes = subjectPublicKeyInfo.getPublicKeyData().getBytes();
        digestCreateSHA1.update(bytes, 0, bytes.length);
        digestCreateSHA1.doFinal(bArr, 0);
        int i4 = onTransact + 29;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return bArr;
    }

    private Set getUsedCertificateSet() throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        int i = 2 % 2;
        HashSet hashSet = new HashSet();
        Enumeration enumerationKeys = this.keys.keys();
        while (enumerationKeys.hasMoreElements()) {
            Certificate[] certificateArrEngineGetCertificateChain = engineGetCertificateChain((String) enumerationKeys.nextElement());
            for (int i2 = 0; i2 != certificateArrEngineGetCertificateChain.length; i2++) {
                hashSet.add(certificateArrEngineGetCertificateChain[i2]);
            }
        }
        Enumeration enumerationKeys2 = this.certs.keys();
        while (enumerationKeys2.hasMoreElements()) {
            int i3 = onTransact + 77;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            hashSet.add(engineGetCertificate((String) enumerationKeys2.nextElement()));
            int i5 = onTransact + 65;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
        }
        return hashSet;
    }

    private int validateIterationCount(BigInteger bigInteger) {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            bigInteger.intValue();
            obj.hashCode();
            throw null;
        }
        int iIntValue = bigInteger.intValue();
        if (iIntValue < 0) {
            throw new IllegalStateException("negative iteration count found");
        }
        BigInteger bigIntegerAsBigInteger = Properties.asBigInteger(PKCS12_MAX_IT_COUNT_PROPERTY);
        if (bigIntegerAsBigInteger == null || bigIntegerAsBigInteger.intValue() >= iIntValue) {
            int i3 = onTransact + 49;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                return iIntValue;
            }
            obj.hashCode();
            throw null;
        }
        throw new IllegalStateException("iteration count " + iIntValue + " greater than " + bigIntegerAsBigInteger.intValue());
    }

    protected byte[] cryptData(boolean z, AlgorithmIdentifier algorithmIdentifier, char[] cArr, boolean z2, byte[] bArr) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, IOException, InvalidAlgorithmParameterException {
        int i = 2 % 2;
        ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        int i2 = 1;
        if (!z) {
            int i3 = onTransact + 49;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            i2 = 2;
        }
        if (algorithm.on(PKCSObjectIdentifiers.pkcs_12PbeIds)) {
            PKCS12PBEParams pKCS12PBEParams = PKCS12PBEParams.getInstance(algorithmIdentifier.getParameters());
            try {
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(pKCS12PBEParams.getIV(), pKCS12PBEParams.getIterations().intValue());
                PKCS12Key pKCS12Key = new PKCS12Key(cArr, z2);
                Cipher cipherCreateCipher = this.helper.createCipher(algorithm.getId());
                cipherCreateCipher.init(i2, pKCS12Key, pBEParameterSpec);
                return cipherCreateCipher.doFinal(bArr);
            } catch (Exception e) {
                throw new IOException("exception decrypting data - " + e.toString());
            }
        }
        if (!algorithm.equals(PKCSObjectIdentifiers.id_PBES2)) {
            throw new IOException("unknown PBE algorithm: " + algorithm);
        }
        int i5 = asInterface + 21;
        onTransact = i5 % 128;
        try {
            if (i5 % 2 == 0) {
                return createCipher(i2, cArr, algorithmIdentifier).doFinal(bArr);
            }
            createCipher(i2, cArr, algorithmIdentifier).doFinal(bArr);
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception e2) {
            throw new IOException("exception decrypting data - " + e2.toString());
        }
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration engineAliases() throws Throwable {
        Object obj;
        int i = 2 % 2;
        Hashtable hashtable = new Hashtable();
        Enumeration enumerationKeys = this.certs.keys();
        while (enumerationKeys.hasMoreElements()) {
            hashtable.put(enumerationKeys.nextElement(), "cert");
        }
        Enumeration enumerationKeys2 = this.keys.keys();
        while (enumerationKeys2.hasMoreElements()) {
            int i2 = onTransact + 99;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            String str = (String) enumerationKeys2.nextElement();
            if (hashtable.get(str) == null) {
                int i4 = asInterface + 9;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    Object[] objArr = new Object[1];
                    a(new char[]{26325, 40105, 37495, 11131}, ExpandableListView.getPackedPositionChild(1L) * 5, objArr);
                    obj = objArr[0];
                } else {
                    Object[] objArr2 = new Object[1];
                    a(new char[]{26325, 40105, 37495, 11131}, ExpandableListView.getPackedPositionChild(0L) + 4, objArr2);
                    obj = objArr2[0];
                }
                hashtable.put(str, ((String) obj).intern());
            }
        }
        return hashtable.keys();
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (this.certs.get(str) != null || this.keys.get(str) != null) {
            return true;
        }
        int i4 = asInterface + 19;
        int i5 = i4 % 128;
        onTransact = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 91;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) throws KeyStoreException {
        int i = 2 % 2;
        Key key = (Key) this.keys.remove(str);
        Certificate certificate = (Certificate) this.certs.remove(str);
        if (certificate != null) {
            this.chainCerts.remove(new CertId(certificate.getPublicKey()));
            int i2 = asInterface + 11;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
        }
        if (key != null) {
            int i4 = onTransact + 119;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            String str2 = (String) this.localIds.remove(str);
            if (i5 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (str2 != null) {
                certificate = (Certificate) this.keyCerts.remove(str2);
            }
            if (certificate != null) {
                this.chainCerts.remove(new CertId(certificate.getPublicKey()));
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (str == null) {
            throw new IllegalArgumentException("null alias passed to getCertificate.");
        }
        Certificate certificate = (Certificate) this.certs.get(str);
        if (certificate == null) {
            String str2 = (String) this.localIds.get(str);
            return (Certificate) (str2 != null ? this.keyCerts.get(str2) : this.keyCerts.get(str));
        }
        int i3 = asInterface + 15;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return certificate;
        }
        throw null;
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Enumeration enumerationElements = this.certs.elements();
        Enumeration enumerationKeys = this.certs.keys();
        while (!(!enumerationElements.hasMoreElements())) {
            Certificate certificate2 = (Certificate) enumerationElements.nextElement();
            String str = (String) enumerationKeys.nextElement();
            if (certificate2.equals(certificate)) {
                return str;
            }
        }
        Enumeration enumerationElements2 = this.keyCerts.elements();
        Enumeration enumerationKeys2 = this.keyCerts.keys();
        while (enumerationElements2.hasMoreElements()) {
            Certificate certificate3 = (Certificate) enumerationElements2.nextElement();
            String str2 = (String) enumerationKeys2.nextElement();
            if (!(!certificate3.equals(certificate))) {
                return str2;
            }
        }
        int i4 = onTransact + 73;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        Certificate certificateEngineGetCertificate;
        Certificate certificate;
        byte[] keyIdentifier;
        int i = 2 % 2;
        if (str == null) {
            throw new IllegalArgumentException("null alias passed to getCertificateChain.");
        }
        Certificate[] certificateArr = null;
        if (!(!engineIsKeyEntry(str)) && (certificateEngineGetCertificate = engineGetCertificate(str)) != null) {
            Vector vector = new Vector();
            while (certificateEngineGetCertificate != null) {
                X509Certificate x509Certificate = (X509Certificate) certificateEngineGetCertificate;
                byte[] extensionValue = x509Certificate.getExtensionValue(Extension.authorityKeyIdentifier.getId());
                if (extensionValue == null || (keyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1OctetString.getInstance(extensionValue).getOctets()).getKeyIdentifier()) == null) {
                    int i2 = asInterface + 25;
                    onTransact = i2 % 128;
                    int i3 = i2 % 2;
                    certificate = null;
                } else {
                    certificate = (Certificate) this.chainCerts.get(new CertId(keyIdentifier));
                }
                if (certificate == null) {
                    Principal issuerDN = x509Certificate.getIssuerDN();
                    if (!issuerDN.equals(x509Certificate.getSubjectDN())) {
                        int i4 = asInterface + 121;
                        onTransact = i4 % 128;
                        if (i4 % 2 != 0) {
                            this.chainCerts.keys();
                            throw null;
                        }
                        Enumeration enumerationKeys = this.chainCerts.keys();
                        while (true) {
                            if (!enumerationKeys.hasMoreElements()) {
                                break;
                            }
                            X509Certificate x509Certificate2 = (X509Certificate) this.chainCerts.get(enumerationKeys.nextElement());
                            if (x509Certificate2.getSubjectDN().equals(issuerDN)) {
                                try {
                                    x509Certificate.verify(x509Certificate2.getPublicKey());
                                    int i5 = asInterface + 115;
                                    onTransact = i5 % 128;
                                    int i6 = i5 % 2;
                                    certificate = x509Certificate2;
                                    break;
                                } catch (Exception unused) {
                                    continue;
                                }
                            }
                        }
                    }
                }
                if (!vector.contains(certificateEngineGetCertificate)) {
                    vector.addElement(certificateEngineGetCertificate);
                    if (certificate != certificateEngineGetCertificate) {
                        certificateEngineGetCertificate = certificate;
                    }
                }
                certificateEngineGetCertificate = null;
            }
            int size = vector.size();
            certificateArr = new Certificate[size];
            int i7 = 0;
            while (i7 != size) {
                int i8 = asInterface + 31;
                onTransact = i8 % 128;
                if (i8 % 2 != 0) {
                    certificateArr[i7] = (Certificate) vector.elementAt(i7);
                    i7 += 105;
                } else {
                    certificateArr[i7] = (Certificate) vector.elementAt(i7);
                    i7++;
                }
            }
        }
        return certificateArr;
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        if (str == null) {
            throw new NullPointerException("alias == null");
        }
        int i5 = i3 + 15;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        if (this.keys.get(str) == null) {
            int i7 = onTransact + 95;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            if (this.certs.get(str) == null) {
                return null;
            }
        }
        return new Date();
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (str == null) {
            throw new IllegalArgumentException("null alias passed to getKey.");
        }
        Key key = (Key) this.keys.get(str);
        int i4 = onTransact + 17;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return key;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r4.keys.get(r5) == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r4.keys.get(r5) == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        r5 = org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.onTransact + 111;
        org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.asInterface = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // java.security.KeyStoreSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean engineIsCertificateEntry(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 97 / 0;
            if (this.certs.get(str) != null) {
                int i4 = asInterface + 101;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 / 0;
                }
            }
        } else if (this.certs.get(str) != null) {
        }
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (this.keys.get(str) == null) {
            return false;
        }
        int i4 = onTransact + 85;
        asInterface = i4 % 128;
        return i4 % 2 != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x061a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0612 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130  */
    @Override // java.security.KeyStoreSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void engineLoad(InputStream inputStream, char[] cArr) throws IOException, InvalidKeyException, CertificateException, InvalidAlgorithmParameterException {
        boolean z;
        boolean z2;
        int i;
        ASN1OctetString aSN1OctetString;
        String string;
        boolean z3;
        int i2;
        boolean z4;
        ASN1Sequence aSN1Sequence;
        ASN1Primitive objectAt;
        ASN1Sequence aSN1Sequence2;
        String string2;
        ASN1OctetString aSN1OctetString2;
        ASN1Primitive objectAt2;
        int i3 = 2;
        int i4 = 2 % 2;
        if (inputStream != null) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedInputStream.mark(10);
            int i5 = bufferedInputStream.read();
            if (i5 < 0) {
                throw new EOFException("no data in keystore stream");
            }
            if (i5 != 48) {
                throw new IOException("stream does not represent a PKCS12 key store");
            }
            bufferedInputStream.reset();
            try {
                Pfx pfx = Pfx.getInstance(new ASN1InputStream(bufferedInputStream).readObject());
                ContentInfo authSafe = pfx.getAuthSafe();
                Vector vector = new Vector();
                if (pfx.getMacData() != null) {
                    int i6 = onTransact + 13;
                    asInterface = i6 % 128;
                    if (i6 % 2 == 0) {
                        throw null;
                    }
                    if (cArr == null) {
                        throw new NullPointerException("no password supplied when one expected");
                    }
                    MacData macData = pfx.getMacData();
                    DigestInfo mac = macData.getMac();
                    this.macAlgorithm = mac.getAlgorithmId();
                    byte[] salt = macData.getSalt();
                    this.itCount = validateIterationCount(macData.getIterationCount());
                    this.saltLength = salt.length;
                    byte[] octets = authSafe.getContent().getOctets();
                    try {
                        byte[] bArrCalculatePbeMac = calculatePbeMac(this.macAlgorithm.getAlgorithm(), salt, this.itCount, cArr, false, octets);
                        byte[] digest = mac.getDigest();
                        if (!Arrays.constantTimeAreEqual(bArrCalculatePbeMac, digest)) {
                            int i7 = onTransact + 53;
                            asInterface = i7 % 128;
                            if (i7 % 2 == 0) {
                                int length = cArr.length;
                                throw null;
                            }
                            if (cArr.length > 0) {
                                throw new IOException("PKCS12 key store mac invalid - wrong password or corrupted file.");
                            }
                            if (!Arrays.constantTimeAreEqual(calculatePbeMac(this.macAlgorithm.getAlgorithm(), salt, this.itCount, cArr, true, octets), digest)) {
                                throw new IOException("PKCS12 key store mac invalid - wrong password or corrupted file.");
                            }
                            z = true;
                        }
                        this.keys = new IgnoresCaseHashtable();
                        this.localIds = new IgnoresCaseHashtable();
                        if (authSafe.getContentType().equals(PKCSObjectIdentifiers.data)) {
                            z2 = false;
                        } else {
                            int i8 = onTransact + 75;
                            asInterface = i8 % 128;
                            int i9 = i8 % 2;
                            ContentInfo[] contentInfo = AuthenticatedSafe.getInstance(ASN1OctetString.getInstance(authSafe.getContent()).getOctets()).getContentInfo();
                            int i10 = 0;
                            z2 = false;
                            while (i10 != contentInfo.length) {
                                if (contentInfo[i10].getContentType().equals(PKCSObjectIdentifiers.data)) {
                                    ASN1Sequence aSN1Sequence3 = ASN1Sequence.getInstance(ASN1OctetString.getInstance(contentInfo[i10].getContent()).getOctets());
                                    int i11 = 0;
                                    while (i11 != aSN1Sequence3.size()) {
                                        SafeBag safeBag = SafeBag.getInstance(aSN1Sequence3.getObjectAt(i11));
                                        if (safeBag.getBagId().equals(PKCSObjectIdentifiers.pkcs8ShroudedKeyBag)) {
                                            EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = EncryptedPrivateKeyInfo.getInstance(safeBag.getBagValue());
                                            PKCS12BagAttributeCarrier pKCS12BagAttributeCarrierUnwrapKey = unwrapKey(encryptedPrivateKeyInfo.getEncryptionAlgorithm(), encryptedPrivateKeyInfo.getEncryptedData(), cArr, z);
                                            if (safeBag.getBagAttributes() != null) {
                                                int i12 = onTransact + 119;
                                                asInterface = i12 % 128;
                                                if (i12 % i3 == 0) {
                                                    safeBag.getBagAttributes().getObjects();
                                                    throw null;
                                                }
                                                Enumeration objects = safeBag.getBagAttributes().getObjects();
                                                string2 = null;
                                                aSN1OctetString2 = null;
                                                while (objects.hasMoreElements()) {
                                                    int i13 = asInterface + 81;
                                                    ASN1Sequence aSN1Sequence4 = aSN1Sequence3;
                                                    onTransact = i13 % 128;
                                                    int i14 = i13 % 2;
                                                    ASN1Sequence aSN1Sequence5 = (ASN1Sequence) objects.nextElement();
                                                    ASN1ObjectIdentifier objectAt3 = aSN1Sequence5.getObjectAt(0);
                                                    Enumeration enumeration = objects;
                                                    ASN1Set objectAt4 = aSN1Sequence5.getObjectAt(1);
                                                    if (objectAt4.size() > 0) {
                                                        objectAt2 = objectAt4.getObjectAt(0);
                                                        if (pKCS12BagAttributeCarrierUnwrapKey instanceof PKCS12BagAttributeCarrier) {
                                                            PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier = pKCS12BagAttributeCarrierUnwrapKey;
                                                            if (pKCS12BagAttributeCarrier.getBagAttribute(objectAt3) == null) {
                                                                pKCS12BagAttributeCarrier.setBagAttribute(objectAt3, objectAt2);
                                                            } else if (!r19.toASN1Primitive().equals(objectAt2)) {
                                                                throw new IOException("attempt to add existing attribute with different value");
                                                            }
                                                        }
                                                    } else {
                                                        objectAt2 = null;
                                                    }
                                                    if (objectAt3.equals(PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                                                        string2 = ((ASN1BMPString) objectAt2).getString();
                                                        this.keys.put(string2, pKCS12BagAttributeCarrierUnwrapKey);
                                                    } else if (objectAt3.equals(PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                                        aSN1OctetString2 = (ASN1OctetString) objectAt2;
                                                    }
                                                    aSN1Sequence3 = aSN1Sequence4;
                                                    objects = enumeration;
                                                }
                                                aSN1Sequence2 = aSN1Sequence3;
                                            } else {
                                                aSN1Sequence2 = aSN1Sequence3;
                                                string2 = null;
                                                aSN1OctetString2 = null;
                                            }
                                            int i15 = onTransact + 111;
                                            asInterface = i15 % 128;
                                            int i16 = i15 % 2;
                                            if (aSN1OctetString2 != null) {
                                                String str = new String(Hex.encode(aSN1OctetString2.getOctets()));
                                                if (string2 == null) {
                                                    this.keys.put(str, pKCS12BagAttributeCarrierUnwrapKey);
                                                } else {
                                                    this.localIds.put(string2, str);
                                                }
                                            } else {
                                                this.keys.put("unmarked", pKCS12BagAttributeCarrierUnwrapKey);
                                                z2 = true;
                                            }
                                        } else {
                                            aSN1Sequence2 = aSN1Sequence3;
                                            if (safeBag.getBagId().equals(PKCSObjectIdentifiers.certBag)) {
                                                int i17 = asInterface + 37;
                                                onTransact = i17 % 128;
                                                int i18 = i17 % 2;
                                                vector.addElement(safeBag);
                                                if (i18 != 0) {
                                                    throw null;
                                                }
                                            } else {
                                                System.out.println("extra in data " + safeBag.getBagId());
                                                System.out.println(ASN1Dump.dumpAsString(safeBag));
                                            }
                                        }
                                        i11++;
                                        aSN1Sequence3 = aSN1Sequence2;
                                        i3 = 2;
                                    }
                                    z3 = z;
                                    i2 = i10;
                                } else if (contentInfo[i10].getContentType().equals(PKCSObjectIdentifiers.encryptedData)) {
                                    EncryptedData encryptedData = EncryptedData.getInstance(contentInfo[i10].getContent());
                                    i2 = i10;
                                    ASN1Sequence aSN1Sequence6 = ASN1Sequence.getInstance(cryptData(false, encryptedData.getEncryptionAlgorithm(), cArr, z, encryptedData.getContent().getOctets()));
                                    int i19 = 0;
                                    while (i19 != aSN1Sequence6.size()) {
                                        SafeBag safeBag2 = SafeBag.getInstance(aSN1Sequence6.getObjectAt(i19));
                                        if (safeBag2.getBagId().equals(PKCSObjectIdentifiers.certBag)) {
                                            vector.addElement(safeBag2);
                                            z4 = z;
                                            aSN1Sequence = aSN1Sequence6;
                                        } else if (safeBag2.getBagId().equals(PKCSObjectIdentifiers.pkcs8ShroudedKeyBag)) {
                                            int i20 = asInterface + 37;
                                            onTransact = i20 % 128;
                                            int i21 = i20 % 2;
                                            EncryptedPrivateKeyInfo encryptedPrivateKeyInfo2 = EncryptedPrivateKeyInfo.getInstance(safeBag2.getBagValue());
                                            PKCS12BagAttributeCarrier pKCS12BagAttributeCarrierUnwrapKey2 = unwrapKey(encryptedPrivateKeyInfo2.getEncryptionAlgorithm(), encryptedPrivateKeyInfo2.getEncryptedData(), cArr, z);
                                            PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier2 = pKCS12BagAttributeCarrierUnwrapKey2;
                                            Enumeration objects2 = safeBag2.getBagAttributes().getObjects();
                                            ASN1OctetString aSN1OctetString3 = null;
                                            String str2 = null;
                                            while (objects2.hasMoreElements()) {
                                                boolean z5 = z;
                                                ASN1Sequence aSN1Sequence7 = (ASN1Sequence) objects2.nextElement();
                                                ASN1Sequence aSN1Sequence8 = aSN1Sequence6;
                                                ASN1ObjectIdentifier objectAt5 = aSN1Sequence7.getObjectAt(0);
                                                Enumeration enumeration2 = objects2;
                                                ASN1Set objectAt6 = aSN1Sequence7.getObjectAt(1);
                                                if (objectAt6.size() > 0) {
                                                    objectAt = objectAt6.getObjectAt(0);
                                                    ASN1Encodable bagAttribute = pKCS12BagAttributeCarrier2.getBagAttribute(objectAt5);
                                                    if (bagAttribute == null) {
                                                        pKCS12BagAttributeCarrier2.setBagAttribute(objectAt5, objectAt);
                                                    } else if (!bagAttribute.toASN1Primitive().equals(objectAt)) {
                                                        throw new IOException("attempt to add existing attribute with different value");
                                                    }
                                                } else {
                                                    objectAt = null;
                                                }
                                                if (objectAt5.equals(PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                                                    String string3 = ((ASN1BMPString) objectAt).getString();
                                                    this.keys.put(string3, pKCS12BagAttributeCarrierUnwrapKey2);
                                                    str2 = string3;
                                                } else if (!(!objectAt5.equals(PKCSObjectIdentifiers.pkcs_9_at_localKeyId))) {
                                                    aSN1OctetString3 = (ASN1OctetString) objectAt;
                                                }
                                                aSN1Sequence6 = aSN1Sequence8;
                                                z = z5;
                                                objects2 = enumeration2;
                                            }
                                            z4 = z;
                                            aSN1Sequence = aSN1Sequence6;
                                            String str3 = new String(Hex.encode(aSN1OctetString3.getOctets()));
                                            if (str2 == null) {
                                                this.keys.put(str3, pKCS12BagAttributeCarrierUnwrapKey2);
                                            } else {
                                                this.localIds.put(str2, str3);
                                            }
                                        } else {
                                            z4 = z;
                                            aSN1Sequence = aSN1Sequence6;
                                            if (safeBag2.getBagId().equals(PKCSObjectIdentifiers.keyBag)) {
                                                PKCS12BagAttributeCarrier privateKey = BouncyCastleProvider.getPrivateKey(PrivateKeyInfo.getInstance(safeBag2.getBagValue()));
                                                PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier3 = privateKey;
                                                Enumeration objects3 = safeBag2.getBagAttributes().getObjects();
                                                ASN1OctetString aSN1OctetString4 = null;
                                                String str4 = null;
                                                while (objects3.hasMoreElements()) {
                                                    ASN1Sequence aSN1Sequence9 = ASN1Sequence.getInstance(objects3.nextElement());
                                                    ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(aSN1Sequence9.getObjectAt(0));
                                                    Enumeration enumeration3 = objects3;
                                                    ASN1Set aSN1Set = ASN1Set.getInstance(aSN1Sequence9.getObjectAt(1));
                                                    if (aSN1Set.size() > 0) {
                                                        ASN1BMPString aSN1BMPString = (ASN1Primitive) aSN1Set.getObjectAt(0);
                                                        ASN1Encodable bagAttribute2 = pKCS12BagAttributeCarrier3.getBagAttribute(aSN1ObjectIdentifier);
                                                        if (bagAttribute2 == null) {
                                                            pKCS12BagAttributeCarrier3.setBagAttribute(aSN1ObjectIdentifier, aSN1BMPString);
                                                        } else if (!bagAttribute2.toASN1Primitive().equals(aSN1BMPString)) {
                                                            throw new IOException("attempt to add existing attribute with different value");
                                                        }
                                                        if (aSN1ObjectIdentifier.equals(PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                                                            String string4 = aSN1BMPString.getString();
                                                            this.keys.put(string4, privateKey);
                                                            str4 = string4;
                                                        } else if (aSN1ObjectIdentifier.equals(PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                                            aSN1OctetString4 = (ASN1OctetString) aSN1BMPString;
                                                        }
                                                    }
                                                    objects3 = enumeration3;
                                                }
                                                String str5 = new String(Hex.encode(aSN1OctetString4.getOctets()));
                                                if (str4 == null) {
                                                    this.keys.put(str5, privateKey);
                                                } else {
                                                    this.localIds.put(str4, str5);
                                                }
                                            } else {
                                                System.out.println("extra in encryptedData " + safeBag2.getBagId());
                                                System.out.println(ASN1Dump.dumpAsString(safeBag2));
                                            }
                                        }
                                        i19++;
                                        aSN1Sequence6 = aSN1Sequence;
                                        z = z4;
                                    }
                                    z3 = z;
                                } else {
                                    z3 = z;
                                    i2 = i10;
                                    System.out.println("extra " + contentInfo[i2].getContentType().getId());
                                    System.out.println("extra " + ASN1Dump.dumpAsString(contentInfo[i2].getContent()));
                                }
                                i10 = i2 + 1;
                                z = z3;
                                i3 = 2;
                            }
                        }
                        this.certs = new IgnoresCaseHashtable();
                        this.chainCerts = new Hashtable();
                        this.keyCerts = new Hashtable();
                        for (i = 0; i != vector.size(); i++) {
                            SafeBag safeBag3 = (SafeBag) vector.elementAt(i);
                            CertBag certBag = CertBag.getInstance(safeBag3.getBagValue());
                            if (!certBag.getCertId().equals(PKCSObjectIdentifiers.x509Certificate)) {
                                throw new RuntimeException("Unsupported certificate type: " + certBag.getCertId());
                            }
                            try {
                                PKCS12BagAttributeCarrier pKCS12BagAttributeCarrierGenerateCertificate = this.certFact.generateCertificate(new ByteArrayInputStream(certBag.getCertValue().getOctets()));
                                if (safeBag3.getBagAttributes() != null) {
                                    Enumeration objects4 = safeBag3.getBagAttributes().getObjects();
                                    string = null;
                                    ASN1OctetString aSN1OctetString5 = null;
                                    while (objects4.hasMoreElements()) {
                                        ASN1Sequence aSN1Sequence10 = ASN1Sequence.getInstance(objects4.nextElement());
                                        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = ASN1ObjectIdentifier.getInstance(aSN1Sequence10.getObjectAt(0));
                                        ASN1Set aSN1Set2 = ASN1Set.getInstance(aSN1Sequence10.getObjectAt(1));
                                        if (aSN1Set2.size() > 0) {
                                            ASN1OctetString aSN1OctetString6 = (ASN1Primitive) aSN1Set2.getObjectAt(0);
                                            if (pKCS12BagAttributeCarrierGenerateCertificate instanceof PKCS12BagAttributeCarrier) {
                                                PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier4 = pKCS12BagAttributeCarrierGenerateCertificate;
                                                ASN1Encodable bagAttribute3 = pKCS12BagAttributeCarrier4.getBagAttribute(aSN1ObjectIdentifier2);
                                                if (bagAttribute3 != null) {
                                                    int i22 = asInterface + 121;
                                                    onTransact = i22 % 128;
                                                    if (i22 % 2 != 0) {
                                                        aSN1ObjectIdentifier2.equals(PKCSObjectIdentifiers.pkcs_9_at_localKeyId);
                                                        Object obj = null;
                                                        obj.hashCode();
                                                        throw null;
                                                    }
                                                    if (aSN1ObjectIdentifier2.equals(PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                                        String hexString = Hex.toHexString(aSN1OctetString6.getOctets());
                                                        if (this.keys.keys.containsKey(hexString) || this.localIds.keys.containsKey(hexString)) {
                                                        }
                                                    }
                                                    if (!bagAttribute3.toASN1Primitive().equals(aSN1OctetString6)) {
                                                        throw new IOException("attempt to add existing attribute with different value");
                                                    }
                                                } else {
                                                    pKCS12BagAttributeCarrier4.setBagAttribute(aSN1ObjectIdentifier2, aSN1OctetString6);
                                                    if (!aSN1ObjectIdentifier2.equals(PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                                                        string = ((ASN1BMPString) aSN1OctetString6).getString();
                                                    } else if (aSN1ObjectIdentifier2.equals(PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                                        aSN1OctetString5 = aSN1OctetString6;
                                                    }
                                                }
                                            }
                                            if (!aSN1ObjectIdentifier2.equals(PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                                            }
                                        }
                                    }
                                    aSN1OctetString = aSN1OctetString5;
                                } else {
                                    aSN1OctetString = null;
                                    string = null;
                                }
                                this.chainCerts.put(new CertId(pKCS12BagAttributeCarrierGenerateCertificate.getPublicKey()), pKCS12BagAttributeCarrierGenerateCertificate);
                                if (!z2) {
                                    if (aSN1OctetString != null) {
                                        this.keyCerts.put(new String(Hex.encode(aSN1OctetString.getOctets())), pKCS12BagAttributeCarrierGenerateCertificate);
                                    }
                                    if (string != null) {
                                        int i23 = onTransact + 109;
                                        asInterface = i23 % 128;
                                        int i24 = i23 % 2;
                                        this.certs.put(string, pKCS12BagAttributeCarrierGenerateCertificate);
                                    }
                                } else if (this.keyCerts.isEmpty()) {
                                    String str6 = new String(Hex.encode(createSubjectKeyId(pKCS12BagAttributeCarrierGenerateCertificate.getPublicKey()).getKeyIdentifier()));
                                    this.keyCerts.put(str6, pKCS12BagAttributeCarrierGenerateCertificate);
                                    IgnoresCaseHashtable ignoresCaseHashtable = this.keys;
                                    ignoresCaseHashtable.put(str6, ignoresCaseHashtable.remove("unmarked"));
                                }
                            } catch (Exception e) {
                                throw new RuntimeException(e.toString());
                            }
                        }
                    } catch (IOException e2) {
                        throw e2;
                    } catch (Exception e3) {
                        throw new IOException("error constructing MAC: " + e3.toString());
                    }
                }
                if (cArr != null && cArr.length != 0 && !Properties.isOverrideSet("org.bouncycastle.pkcs12.ignore_useless_passwd")) {
                    throw new IOException("password supplied for keystore that does not require one");
                }
                z = false;
                this.keys = new IgnoresCaseHashtable();
                this.localIds = new IgnoresCaseHashtable();
                if (authSafe.getContentType().equals(PKCSObjectIdentifiers.data)) {
                }
                this.certs = new IgnoresCaseHashtable();
                this.chainCerts = new Hashtable();
                this.keyCerts = new Hashtable();
                while (i != vector.size()) {
                }
            } catch (Exception e4) {
                throw new IOException(e4.getMessage());
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException, InvalidAlgorithmParameterException {
        int i = 2 % 2;
        if (loadStoreParameter != null) {
            if (loadStoreParameter instanceof BCLoadStoreParameter) {
                engineLoad(((BCLoadStoreParameter) loadStoreParameter).getInputStream(), ParameterUtil.extractPassword(loadStoreParameter));
                return;
            }
            throw new IllegalArgumentException("no support for 'param' of type " + loadStoreParameter.getClass().getName());
        }
        int i2 = onTransact + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        engineLoad(null, null);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onTransact + 37;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 77 / 0;
        }
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineProbe(InputStream inputStream) throws IOException {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 115;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 89;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (this.keys.get(str) != null) {
            throw new KeyStoreException("There is a key entry with the name " + str + onVideoError.onExtraCallbackWithResult);
        }
        this.certs.put(str, certificate);
        this.chainCerts.put(new CertId(certificate.getPublicKey()), certificate);
        int i4 = asInterface + 5;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        int i = 2 % 2;
        if (!(key instanceof PrivateKey)) {
            throw new KeyStoreException("PKCS12 does not support non-PrivateKeys");
        }
        int i2 = onTransact + 111;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (certificateArr == null) {
            throw new KeyStoreException("no certificate chain for private key");
        }
        if (this.keys.get(str) != null) {
            int i3 = asInterface + 13;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            engineDeleteEntry(str);
            int i5 = asInterface + 77;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }
        this.keys.put(str, key);
        if (certificateArr != null) {
            int i7 = asInterface + 65;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            this.certs.put(str, certificateArr[0]);
            for (int i9 = 0; i9 != certificateArr.length; i9++) {
                this.chainCerts.put(new CertId(certificateArr[i9].getPublicKey()), certificateArr[i9]);
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
        int i = 2 % 2;
        throw new RuntimeException("operation not supported");
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() throws Throwable {
        int i = 2 % 2;
        Hashtable hashtable = new Hashtable();
        Enumeration enumerationKeys = this.certs.keys();
        int i2 = asInterface + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        while (enumerationKeys.hasMoreElements()) {
            hashtable.put(enumerationKeys.nextElement(), "cert");
        }
        Enumeration enumerationKeys2 = this.keys.keys();
        while (!(!enumerationKeys2.hasMoreElements())) {
            String str = (String) enumerationKeys2.nextElement();
            if (hashtable.get(str) == null) {
                Object[] objArr = new Object[1];
                a(new char[]{26325, 40105, 37495, 11131}, Drawable.resolveOpacity(0, 0) + 3, objArr);
                hashtable.put(str, ((String) objArr[0]).intern());
            }
        }
        int size = hashtable.size();
        int i4 = onTransact + 29;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return size;
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws BadPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        int i = 2 % 2;
        int i2 = onTransact + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        doStore(outputStream, cArr, false);
        int i4 = asInterface + 5;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws BadPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        PKCS12StoreParameter pKCS12StoreParameter;
        int i;
        int i2 = 2 % 2;
        if (loadStoreParameter == null) {
            throw new IllegalArgumentException("'param' arg cannot be null");
        }
        boolean z = loadStoreParameter instanceof PKCS12StoreParameter;
        if ((!z) && !(loadStoreParameter instanceof JDKPKCS12StoreParameter)) {
            throw new IllegalArgumentException("No support for 'param' of type " + loadStoreParameter.getClass().getName());
        }
        char[] password = null;
        if (!(!z)) {
            int i3 = onTransact + 43;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            pKCS12StoreParameter = (PKCS12StoreParameter) loadStoreParameter;
        } else {
            JDKPKCS12StoreParameter jDKPKCS12StoreParameter = (JDKPKCS12StoreParameter) loadStoreParameter;
            pKCS12StoreParameter = new PKCS12StoreParameter(jDKPKCS12StoreParameter.getOutputStream(), loadStoreParameter.getProtectionParameter(), jDKPKCS12StoreParameter.isUseDEREncoding());
        }
        KeyStore.ProtectionParameter protectionParameter = loadStoreParameter.getProtectionParameter();
        if (protectionParameter == null) {
            i = asInterface + 75;
            onTransact = i % 128;
        } else {
            if (!(protectionParameter instanceof KeyStore.PasswordProtection)) {
                throw new IllegalArgumentException("No support for protection parameter of type " + protectionParameter.getClass().getName());
            }
            int i4 = onTransact + 81;
            asInterface = i4 % 128;
            KeyStore.PasswordProtection passwordProtection = (KeyStore.PasswordProtection) protectionParameter;
            if (i4 % 2 == 0) {
                passwordProtection.getPassword();
                password.hashCode();
                throw null;
            }
            password = passwordProtection.getPassword();
            i = onTransact + 81;
            asInterface = i % 128;
        }
        int i5 = i % 2;
        doStore(pKCS12StoreParameter.getOutputStream(), password, pKCS12StoreParameter.isForDEREncoding());
    }

    @Override // org.bouncycastle.jce.interfaces.BCKeyStore
    public void setRandom(SecureRandom secureRandom) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 39;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.random = secureRandom;
        int i5 = i2 + 17;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    protected PrivateKey unwrapKey(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, char[] cArr, boolean z) throws InvalidKeyException, IOException, InvalidAlgorithmParameterException {
        Cipher cipherCreateCipher;
        int i = 2 % 2;
        int i2 = asInterface + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        try {
            if (algorithm.on(PKCSObjectIdentifiers.pkcs_12PbeIds)) {
                PKCS12PBEParams pKCS12PBEParams = PKCS12PBEParams.getInstance(algorithmIdentifier.getParameters());
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(pKCS12PBEParams.getIV(), validateIterationCount(pKCS12PBEParams.getIterations()));
                cipherCreateCipher = this.helper.createCipher(algorithm.getId());
                cipherCreateCipher.init(4, new PKCS12Key(cArr, z), pBEParameterSpec);
                int i4 = onTransact + 23;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
            } else {
                if (!algorithm.equals(PKCSObjectIdentifiers.id_PBES2)) {
                    throw new IOException("exception unwrapping private key - cannot recognise: " + algorithm);
                }
                int i6 = asInterface + 105;
                onTransact = i6 % 128;
                cipherCreateCipher = i6 % 2 != 0 ? createCipher(3, cArr, algorithmIdentifier) : createCipher(4, cArr, algorithmIdentifier);
            }
            return (PrivateKey) cipherCreateCipher.unwrap(bArr, BuildConfig.FLAVOR, 2);
        } catch (Exception e) {
            throw new IOException("exception unwrapping private key - " + e.toString());
        }
    }

    protected byte[] wrapKey(String str, Key key, PKCS12PBEParams pKCS12PBEParams, char[] cArr) throws IllegalBlockSizeException, InvalidKeyException, IOException, InvalidAlgorithmParameterException {
        int i = 2 % 2;
        PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr);
        try {
            SecretKeyFactory secretKeyFactoryCreateSecretKeyFactory = this.helper.createSecretKeyFactory(str);
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(pKCS12PBEParams.getIV(), pKCS12PBEParams.getIterations().intValue());
            Cipher cipherCreateCipher = this.helper.createCipher(str);
            cipherCreateCipher.init(3, secretKeyFactoryCreateSecretKeyFactory.generateSecret(pBEKeySpec), pBEParameterSpec);
            byte[] bArrWrap = cipherCreateCipher.wrap(key);
            int i2 = onTransact + 31;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return bArrWrap;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception e) {
            throw new IOException("exception encrypting data - " + e.toString());
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $11 + 95;
            $10 = i5 % 128;
            int i6 = 58224;
            if (i5 % 2 != 0) {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i4;
            }
            while (i2 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i7 = (c2 + i6) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i8 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i8);
                    objArr2[1] = Integer.valueOf(i7);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(i4);
                        int i9 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9;
                        int i10 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12433;
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cNormalizeMetaState, i9, i10, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 10 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i2++;
                    int i11 = $10 + 117;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr3 = cArr4;
                    i4 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16013), (ViewConfiguration.getFadingEdgeLength() >> 16) + 14, TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = (char) 42278;
        onExtraCallback = (char) 61031;
        onExtraCallbackWithResult = (char) 57352;
        onNavigationEvent = (char) 9800;
    }
}
