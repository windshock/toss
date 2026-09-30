package org.bouncycastle.jcajce.provider.keystore.bcfks;

import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAKey;
import java.security.interfaces.RSAKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.text.ParseException;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.callback.UnsupportedCallbackException;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import o.onVideoError;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.bc.EncryptedObjectStoreData;
import org.bouncycastle.asn1.bc.EncryptedPrivateKeyData;
import org.bouncycastle.asn1.bc.EncryptedSecretKeyData;
import org.bouncycastle.asn1.bc.ObjectData;
import org.bouncycastle.asn1.bc.ObjectDataSequence;
import org.bouncycastle.asn1.bc.ObjectStore;
import org.bouncycastle.asn1.bc.ObjectStoreData;
import org.bouncycastle.asn1.bc.ObjectStoreIntegrityCheck;
import org.bouncycastle.asn1.bc.PbkdMacIntegrityCheck;
import org.bouncycastle.asn1.bc.SecretKeyData;
import org.bouncycastle.asn1.bc.SignatureCheck;
import org.bouncycastle.asn1.kisa.KISAObjectIdentifiers;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.misc.ScryptParams;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers;
import org.bouncycastle.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.EncryptionScheme;
import org.bouncycastle.asn1.pkcs.KeyDerivationFunc;
import org.bouncycastle.asn1.pkcs.PBES2Parameters;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.bouncycastle.crypto.generators.SCrypt;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.util.PBKDF2Config;
import org.bouncycastle.crypto.util.PBKDFConfig;
import org.bouncycastle.crypto.util.ScryptConfig;
import org.bouncycastle.internal.asn1.cms.CCMParameters;
import org.bouncycastle.jcajce.BCFKSLoadStoreParameter;
import org.bouncycastle.jcajce.BCFKSStoreParameter;
import org.bouncycastle.jcajce.BCLoadStoreParameter;
import org.bouncycastle.jcajce.provider.keystore.util.AdaptingKeyStoreSpi;
import org.bouncycastle.jcajce.provider.keystore.util.ParameterUtil;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.interfaces.ECKey;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class BcFKSKeyStoreSpi extends KeyStoreSpi {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final BigInteger CERTIFICATE;
    private static int IAuthTabCallback = 0;
    private static final BigInteger PRIVATE_KEY;
    private static final BigInteger PROTECTED_PRIVATE_KEY;
    private static final BigInteger PROTECTED_SECRET_KEY;
    private static final BigInteger SECRET_KEY;
    private static final Map<String, ASN1ObjectIdentifier> oidMap;
    private static char[] onExtraCallback = null;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private static final Map<ASN1ObjectIdentifier, String> publicAlgMap;
    private Date creationDate;
    private final JcaJceHelper helper;
    private AlgorithmIdentifier hmacAlgorithm;
    private KeyDerivationFunc hmacPkbdAlgorithm;
    private Date lastModifiedDate;
    private AlgorithmIdentifier signatureAlgorithm;
    private BCFKSLoadStoreParameter.CertChainValidator validator;
    private PublicKey verificationKey;
    private final Map<String, ObjectData> entries = new HashMap();
    private final Map<String, PrivateKey> privateKeyCache = new HashMap();
    private ASN1ObjectIdentifier storeEncryptionAlgorithm = NISTObjectIdentifiers.id_aes256_CCM;

    public static class Def extends BcFKSKeyStoreSpi {
        public Def() {
            super(new DefaultJcaJceHelper());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws NoSuchAlgorithmException, IOException, CertificateException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, UnsupportedCallbackException, IOException, CertificateException {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws Throwable {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws Throwable {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws Throwable {
            super.engineStore(loadStoreParameter);
        }
    }

    public static class DefCompat extends AdaptingKeyStoreSpi {
        public DefCompat() {
            super(new DefaultJcaJceHelper(), new BcFKSKeyStoreSpi(new DefaultJcaJceHelper()));
        }
    }

    public static class DefShared extends SharedKeyStoreSpi {
        public DefShared() {
            super(new DefaultJcaJceHelper());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws NoSuchAlgorithmException, IOException, CertificateException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, UnsupportedCallbackException, IOException, CertificateException {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws Throwable {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws Throwable {
            super.engineStore(loadStoreParameter);
        }
    }

    public static class DefSharedCompat extends AdaptingKeyStoreSpi {
        public DefSharedCompat() {
            super(new DefaultJcaJceHelper(), new BcFKSKeyStoreSpi(new DefaultJcaJceHelper()));
        }
    }

    static class ExtKeyStoreException extends KeyStoreException {
        private final Throwable cause;

        ExtKeyStoreException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    static class SharedKeyStoreSpi extends BcFKSKeyStoreSpi implements PKCSObjectIdentifiers, X509ObjectIdentifiers {
        private final Map<String, byte[]> cache;
        private final byte[] seedKey;

        public SharedKeyStoreSpi(JcaJceHelper jcaJceHelper) {
            super(jcaJceHelper);
            try {
                byte[] bArr = new byte[32];
                this.seedKey = bArr;
                jcaJceHelper.createSecureRandom("DEFAULT").nextBytes(bArr);
                this.cache = new HashMap();
            } catch (GeneralSecurityException e) {
                throw new IllegalArgumentException("can't create random - " + e.toString());
            }
        }

        private byte[] calculateMac(String str, char[] cArr) throws NoSuchAlgorithmException, InvalidKeyException {
            return SCrypt.generate(cArr != null ? Arrays.concatenate(Strings.toUTF8ByteArray(cArr), Strings.toUTF8ByteArray(str)) : Arrays.concatenate(this.seedKey, Strings.toUTF8ByteArray(str)), this.seedKey, 16384, 8, 1, 32);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineDeleteEntry(String str) throws KeyStoreException {
            throw new KeyStoreException("delete operation not supported in shared mode");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public Key engineGetKey(String str, char[] cArr) throws InvalidKeySpecException, NoSuchAlgorithmException, UnrecoverableKeyException {
            try {
                byte[] bArrCalculateMac = calculateMac(str, cArr);
                if (!this.cache.containsKey(str) || Arrays.constantTimeAreEqual(this.cache.get(str), bArrCalculateMac)) {
                    Key keyEngineGetKey = super.engineGetKey(str, cArr);
                    if (keyEngineGetKey != null && !this.cache.containsKey(str)) {
                        this.cache.put(str, bArrCalculateMac);
                    }
                    return keyEngineGetKey;
                }
                throw new UnrecoverableKeyException("unable to recover key (" + str + ")");
            } catch (InvalidKeyException e) {
                throw new UnrecoverableKeyException("unable to recover key (" + str + "): " + e.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            throw new KeyStoreException("set operation not supported in shared mode");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            throw new KeyStoreException("set operation not supported in shared mode");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            throw new KeyStoreException("set operation not supported in shared mode");
        }
    }

    public static class Std extends BcFKSKeyStoreSpi {
        public Std() {
            super(new BCJcaJceHelper());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws NoSuchAlgorithmException, IOException, CertificateException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, UnsupportedCallbackException, IOException, CertificateException {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws Throwable {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws Throwable {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws Throwable {
            super.engineStore(loadStoreParameter);
        }
    }

    public static class StdCompat extends AdaptingKeyStoreSpi {
        public StdCompat() {
            super(new DefaultJcaJceHelper(), new BcFKSKeyStoreSpi(new BCJcaJceHelper()));
        }
    }

    public static class StdShared extends SharedKeyStoreSpi {
        public StdShared() {
            super(new BCJcaJceHelper());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws NoSuchAlgorithmException, IOException, CertificateException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, UnsupportedCallbackException, IOException, CertificateException {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws Throwable {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws Throwable {
            super.engineStore(loadStoreParameter);
        }
    }

    public static class StdSharedCompat extends AdaptingKeyStoreSpi {
        public StdSharedCompat() {
            super(new BCJcaJceHelper(), new BcFKSKeyStoreSpi(new BCJcaJceHelper()));
        }
    }

    static {
        IAuthTabCallback();
        HashMap map = new HashMap();
        oidMap = map;
        HashMap map2 = new HashMap();
        publicAlgMap = map2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = OIWObjectIdentifiers.desEDE;
        map.put("DESEDE", aSN1ObjectIdentifier);
        map.put("TRIPLEDES", aSN1ObjectIdentifier);
        map.put("TDEA", aSN1ObjectIdentifier);
        map.put("HMACSHA1", PKCSObjectIdentifiers.id_hmacWithSHA1);
        map.put("HMACSHA224", PKCSObjectIdentifiers.id_hmacWithSHA224);
        map.put("HMACSHA256", PKCSObjectIdentifiers.id_hmacWithSHA256);
        map.put("HMACSHA384", PKCSObjectIdentifiers.id_hmacWithSHA384);
        map.put("HMACSHA512", PKCSObjectIdentifiers.id_hmacWithSHA512);
        map.put("SEED", KISAObjectIdentifiers.id_seedCBC);
        map.put("CAMELLIA.128", NTTObjectIdentifiers.id_camellia128_cbc);
        map.put("CAMELLIA.192", NTTObjectIdentifiers.id_camellia192_cbc);
        map.put("CAMELLIA.256", NTTObjectIdentifiers.id_camellia256_cbc);
        map.put("ARIA.128", NSRIObjectIdentifiers.id_aria128_cbc);
        map.put("ARIA.192", NSRIObjectIdentifiers.id_aria192_cbc);
        map.put("ARIA.256", NSRIObjectIdentifiers.id_aria256_cbc);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.rsaEncryption;
        Object[] objArr = new Object[1];
        a(new int[]{0, 3, 0, 1}, false, new byte[]{1, 1, 1}, objArr);
        map2.put(aSN1ObjectIdentifier2, ((String) objArr[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = X9ObjectIdentifiers.id_ecPublicKey;
        Object[] objArr2 = new Object[1];
        a(new int[]{3, 2, 0, 1}, true, new byte[]{1, 0}, objArr2);
        map2.put(aSN1ObjectIdentifier3, ((String) objArr2[0]).intern());
        map2.put(OIWObjectIdentifiers.elGamalAlgorithm, "DH");
        map2.put(PKCSObjectIdentifiers.dhKeyAgreement, "DH");
        map2.put(X9ObjectIdentifiers.id_dsa, "DSA");
        CERTIFICATE = BigInteger.valueOf(0L);
        PRIVATE_KEY = BigInteger.valueOf(1L);
        SECRET_KEY = BigInteger.valueOf(2L);
        PROTECTED_PRIVATE_KEY = BigInteger.valueOf(3L);
        PROTECTED_SECRET_KEY = BigInteger.valueOf(4L);
        int i = onNavigationEvent + 5;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    BcFKSKeyStoreSpi(JcaJceHelper jcaJceHelper) {
        this.helper = jcaJceHelper;
    }

    private byte[] calculateMac(byte[] bArr, AlgorithmIdentifier algorithmIdentifier, KeyDerivationFunc keyDerivationFunc, char[] cArr) throws NoSuchAlgorithmException, InvalidKeyException, IOException, NoSuchProviderException {
        int i = 2 % 2;
        String id = algorithmIdentifier.getAlgorithm().getId();
        Mac macCreateMac = this.helper.createMac(id);
        try {
            if (cArr == null) {
                cArr = new char[0];
            }
            macCreateMac.init(new SecretKeySpec(generateKey(keyDerivationFunc, "INTEGRITY_CHECK", cArr, -1), id));
            return macCreateMac.doFinal(bArr);
        } catch (InvalidKeyException e) {
            throw new IOException("Cannot set up MAC calculation: " + e.getMessage());
        }
    }

    private Cipher createCipher(String str, byte[] bArr) throws Throwable {
        int i = 2 % 2;
        Cipher cipherCreateCipher = this.helper.createCipher(str);
        Object[] objArr = new Object[1];
        a(new int[]{5, 3, 166, 0}, true, new byte[]{1, 0, 0}, objArr);
        cipherCreateCipher.init(1, new SecretKeySpec(bArr, ((String) objArr[0]).intern()));
        int i2 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return cipherCreateCipher;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private EncryptedPrivateKeyData createPrivateKeySequence(EncryptedPrivateKeyInfo encryptedPrivateKeyInfo, Certificate[] certificateArr) throws CertificateEncodingException {
        int i = 2 % 2;
        org.bouncycastle.asn1.x509.Certificate[] certificateArr2 = new org.bouncycastle.asn1.x509.Certificate[certificateArr.length];
        int i2 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 % 4;
        }
        int i4 = 0;
        while (i4 != certificateArr.length) {
            certificateArr2[i4] = org.bouncycastle.asn1.x509.Certificate.getInstance(certificateArr[i4].getEncoded());
            i4++;
            int i5 = onExtraCallbackWithResult + 7;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }
        EncryptedPrivateKeyData encryptedPrivateKeyData = new EncryptedPrivateKeyData(encryptedPrivateKeyInfo, certificateArr2);
        int i7 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return encryptedPrivateKeyData;
        }
        throw null;
    }

    private Certificate decodeCertificate(Object obj) throws CertificateException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        JcaJceHelper jcaJceHelper = this.helper;
        if (jcaJceHelper == null) {
            try {
                return CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(org.bouncycastle.asn1.x509.Certificate.getInstance(obj).getEncoded()));
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            Certificate certificateGenerateCertificate = jcaJceHelper.createCertificateFactory("X.509").generateCertificate(new ByteArrayInputStream(org.bouncycastle.asn1.x509.Certificate.getInstance(obj).getEncoded()));
            int i3 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return certificateGenerateCertificate;
        } catch (Exception unused2) {
            return null;
        }
    }

    private byte[] decryptData(String str, AlgorithmIdentifier algorithmIdentifier, char[] cArr, byte[] bArr) throws Throwable {
        AlgorithmParameters algorithmParametersCreateAlgorithmParameters;
        JcaJceHelper jcaJceHelper;
        String strIntern;
        Cipher cipherCreateCipher;
        int i = 2 % 2;
        if (!algorithmIdentifier.getAlgorithm().equals(PKCSObjectIdentifiers.id_PBES2)) {
            throw new IOException("BCFKS KeyStore cannot recognize protection algorithm.");
        }
        int i2 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        PBES2Parameters pBES2Parameters = PBES2Parameters.getInstance(algorithmIdentifier.getParameters());
        EncryptionScheme encryptionScheme = pBES2Parameters.getEncryptionScheme();
        try {
            if (encryptionScheme.getAlgorithm().equals(NISTObjectIdentifiers.id_aes256_CCM)) {
                JcaJceHelper jcaJceHelper2 = this.helper;
                Object[] objArr = new Object[1];
                a(new int[]{8, 17, 169, 0}, true, new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0}, objArr);
                cipherCreateCipher = jcaJceHelper2.createCipher(((String) objArr[0]).intern());
                algorithmParametersCreateAlgorithmParameters = this.helper.createAlgorithmParameters("CCM");
                algorithmParametersCreateAlgorithmParameters.init(CCMParameters.getInstance(encryptionScheme.getParameters()).getEncoded());
            } else {
                if (!encryptionScheme.getAlgorithm().equals(NISTObjectIdentifiers.id_aes256_wrap_pad)) {
                    throw new IOException("BCFKS KeyStore cannot recognize protection encryption algorithm.");
                }
                int i4 = onWarmupCompleted + 95;
                onExtraCallbackWithResult = i4 % 128;
                algorithmParametersCreateAlgorithmParameters = null;
                if (i4 % 2 != 0) {
                    jcaJceHelper = this.helper;
                    Object[] objArr2 = new Object[1];
                    a(new int[]{25, 6, 0, 0}, true, new byte[]{1, 0, 0, 0, 0, 1}, objArr2);
                    strIntern = ((String) objArr2[0]).intern();
                } else {
                    jcaJceHelper = this.helper;
                    Object[] objArr3 = new Object[1];
                    a(new int[]{25, 6, 0, 0}, false, new byte[]{1, 0, 0, 0, 0, 1}, objArr3);
                    strIntern = ((String) objArr3[0]).intern();
                }
                cipherCreateCipher = jcaJceHelper.createCipher(strIntern);
            }
            KeyDerivationFunc keyDerivationFunc = pBES2Parameters.getKeyDerivationFunc();
            if (cArr == null) {
                int i5 = onWarmupCompleted + 81;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                cArr = new char[0];
            }
            byte[] bArrGenerateKey = generateKey(keyDerivationFunc, str, cArr, 32);
            Object[] objArr4 = new Object[1];
            a(new int[]{5, 3, 166, 0}, true, new byte[]{1, 0, 0}, objArr4);
            cipherCreateCipher.init(2, new SecretKeySpec(bArrGenerateKey, ((String) objArr4[0]).intern()), algorithmParametersCreateAlgorithmParameters);
            byte[] bArrDoFinal = cipherCreateCipher.doFinal(bArr);
            int i7 = onWarmupCompleted + 97;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return bArrDoFinal;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2.toString());
        }
    }

    private Date extractCreationDate(ObjectData objectData, Date date) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        try {
            Date date2 = objectData.getCreationDate().getDate();
            int i4 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 31 / 0;
            }
            return date2;
        } catch (ParseException unused) {
            return date;
        }
    }

    private byte[] generateKey(KeyDerivationFunc keyDerivationFunc, String str, char[] cArr, int i) throws IOException {
        int i2 = 2 % 2;
        byte[] bArrPKCS12PasswordToBytes = PBEParametersGenerator.PKCS12PasswordToBytes(cArr);
        byte[] bArrPKCS12PasswordToBytes2 = PBEParametersGenerator.PKCS12PasswordToBytes(str.toCharArray());
        if (MiscObjectIdentifiers.id_scrypt.equals(keyDerivationFunc.getAlgorithm())) {
            ScryptParams scryptParams = ScryptParams.getInstance(keyDerivationFunc.getParameters());
            if (scryptParams.getKeyLength() != null) {
                i = scryptParams.getKeyLength().intValue();
            } else if (i == -1) {
                throw new IOException("no keyLength found in ScryptParams");
            }
            return SCrypt.generate(Arrays.concatenate(bArrPKCS12PasswordToBytes, bArrPKCS12PasswordToBytes2), scryptParams.getSalt(), scryptParams.getCostParameter().intValue(), scryptParams.getBlockSize().intValue(), scryptParams.getBlockSize().intValue(), i);
        }
        if (!keyDerivationFunc.getAlgorithm().equals(PKCSObjectIdentifiers.id_PBKDF2)) {
            throw new IOException("BCFKS KeyStore: unrecognized MAC PBKD.");
        }
        int i3 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(keyDerivationFunc.getParameters());
        if (pBKDF2Params.getKeyLength() != null) {
            int i5 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                pBKDF2Params.getKeyLength().intValue();
                throw null;
            }
            i = pBKDF2Params.getKeyLength().intValue();
        } else if (i == -1) {
            throw new IOException("no keyLength found in PBKDF2Params");
        }
        if (pBKDF2Params.getPrf().getAlgorithm().equals(PKCSObjectIdentifiers.id_hmacWithSHA512)) {
            PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator = new PKCS5S2ParametersGenerator(new SHA512Digest());
            pKCS5S2ParametersGenerator.init(Arrays.concatenate(bArrPKCS12PasswordToBytes, bArrPKCS12PasswordToBytes2), pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue());
            return ((KeyParameter) pKCS5S2ParametersGenerator.generateDerivedParameters(i << 3)).getKey();
        }
        if (pBKDF2Params.getPrf().getAlgorithm().equals(NISTObjectIdentifiers.id_hmacWithSHA3_512)) {
            PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator2 = new PKCS5S2ParametersGenerator(new SHA3Digest(512));
            pKCS5S2ParametersGenerator2.init(Arrays.concatenate(bArrPKCS12PasswordToBytes, bArrPKCS12PasswordToBytes2), pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue());
            return ((KeyParameter) pKCS5S2ParametersGenerator2.generateDerivedParameters(i << 3)).getKey();
        }
        throw new IOException("BCFKS KeyStore: unrecognized MAC PBKD PRF: " + pBKDF2Params.getPrf().getAlgorithm());
    }

    private KeyDerivationFunc generatePkbdAlgorithmIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = new byte[64];
        getDefaultSecureRandom().nextBytes(bArr);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.id_PBKDF2;
        if (!aSN1ObjectIdentifier2.equals(aSN1ObjectIdentifier)) {
            throw new IllegalStateException("unknown derivation algorithm: " + aSN1ObjectIdentifier);
        }
        KeyDerivationFunc keyDerivationFunc = new KeyDerivationFunc(aSN1ObjectIdentifier2, new PBKDF2Params(bArr, 51200, i, new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA512, DERNull.INSTANCE)));
        int i5 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return keyDerivationFunc;
    }

    private KeyDerivationFunc generatePkbdAlgorithmIdentifier(KeyDerivationFunc keyDerivationFunc, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            MiscObjectIdentifiers.id_scrypt.equals(keyDerivationFunc.getAlgorithm());
            keyDerivationFunc.getParameters();
            throw null;
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier = MiscObjectIdentifiers.id_scrypt;
        boolean zEquals = aSN1ObjectIdentifier.equals(keyDerivationFunc.getAlgorithm());
        ASN1Encodable parameters = keyDerivationFunc.getParameters();
        if (zEquals) {
            ScryptParams scryptParams = ScryptParams.getInstance(parameters);
            byte[] bArr = new byte[scryptParams.getSalt().length];
            getDefaultSecureRandom().nextBytes(bArr);
            KeyDerivationFunc keyDerivationFunc2 = new KeyDerivationFunc(aSN1ObjectIdentifier, new ScryptParams(bArr, scryptParams.getCostParameter(), scryptParams.getBlockSize(), scryptParams.getParallelizationParameter(), BigInteger.valueOf(i)));
            int i4 = onWarmupCompleted + 105;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return keyDerivationFunc2;
            }
            obj.hashCode();
            throw null;
        }
        PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(parameters);
        byte[] bArr2 = new byte[pBKDF2Params.getSalt().length];
        getDefaultSecureRandom().nextBytes(bArr2);
        KeyDerivationFunc keyDerivationFunc3 = new KeyDerivationFunc(PKCSObjectIdentifiers.id_PBKDF2, new PBKDF2Params(bArr2, pBKDF2Params.getIterationCount().intValue(), i, pBKDF2Params.getPrf()));
        int i5 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return keyDerivationFunc3;
        }
        throw null;
    }

    private KeyDerivationFunc generatePkbdAlgorithmIdentifier(PBKDFConfig pBKDFConfig, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            MiscObjectIdentifiers.id_scrypt.equals(pBKDFConfig.getAlgorithm());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier = MiscObjectIdentifiers.id_scrypt;
        if (aSN1ObjectIdentifier.equals(pBKDFConfig.getAlgorithm())) {
            ScryptConfig scryptConfig = (ScryptConfig) pBKDFConfig;
            byte[] bArr = new byte[scryptConfig.getSaltLength()];
            getDefaultSecureRandom().nextBytes(bArr);
            return new KeyDerivationFunc(aSN1ObjectIdentifier, new ScryptParams(bArr, scryptConfig.getCostParameter(), scryptConfig.getBlockSize(), scryptConfig.getParallelizationParameter(), i));
        }
        PBKDF2Config pBKDF2Config = (PBKDF2Config) pBKDFConfig;
        byte[] bArr2 = new byte[pBKDF2Config.getSaltLength()];
        getDefaultSecureRandom().nextBytes(bArr2);
        KeyDerivationFunc keyDerivationFunc = new KeyDerivationFunc(PKCSObjectIdentifiers.id_PBKDF2, new PBKDF2Params(bArr2, pBKDF2Config.getIterationCount(), i, pBKDF2Config.getPRF()));
        int i4 = onWarmupCompleted + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return keyDerivationFunc;
    }

    private AlgorithmIdentifier generateSignatureAlgId(Key key, BCFKSLoadStoreParameter.SignatureAlgorithm signatureAlgorithm) throws IOException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (key == null) {
            return null;
        }
        if (!(!(key instanceof ECKey))) {
            if (signatureAlgorithm == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA512withECDSA) {
                return new AlgorithmIdentifier(X9ObjectIdentifiers.ecdsa_with_SHA512);
            }
            if (signatureAlgorithm == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA3_512withECDSA) {
                return new AlgorithmIdentifier(NISTObjectIdentifiers.id_ecdsa_with_sha3_512);
            }
        }
        if (key instanceof DSAKey) {
            int i4 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (signatureAlgorithm == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA512withDSA) {
                return new AlgorithmIdentifier(NISTObjectIdentifiers.dsa_with_sha512);
            }
            if (signatureAlgorithm == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA3_512withDSA) {
                return new AlgorithmIdentifier(NISTObjectIdentifiers.id_dsa_with_sha3_512);
            }
        }
        if (key instanceof RSAKey) {
            if (signatureAlgorithm == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA512withRSA) {
                return new AlgorithmIdentifier(PKCSObjectIdentifiers.sha512WithRSAEncryption, DERNull.INSTANCE);
            }
            if (signatureAlgorithm == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA3_512withRSA) {
                return new AlgorithmIdentifier(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_512, DERNull.INSTANCE);
            }
        }
        throw new IOException("unknown signature algorithm");
    }

    private SecureRandom getDefaultSecureRandom() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            CryptoServicesRegistrar.getSecureRandom();
            throw null;
        }
        SecureRandom secureRandom = CryptoServicesRegistrar.getSecureRandom();
        int i3 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return secureRandom;
    }

    private EncryptedObjectStoreData getEncryptedObjectStoreData(AlgorithmIdentifier algorithmIdentifier, char[] cArr) throws Throwable {
        int i = 2 % 2;
        ObjectData[] objectDataArr = (ObjectData[]) this.entries.values().toArray(new ObjectData[this.entries.size()]);
        KeyDerivationFunc keyDerivationFuncGeneratePkbdAlgorithmIdentifier = generatePkbdAlgorithmIdentifier(this.hmacPkbdAlgorithm, 32);
        if (cArr == null) {
            int i2 = onWarmupCompleted + 95;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            cArr = new char[0];
        }
        byte[] bArrGenerateKey = generateKey(keyDerivationFuncGeneratePkbdAlgorithmIdentifier, "STORE_ENCRYPTION", cArr, 32);
        ObjectStoreData objectStoreData = new ObjectStoreData(algorithmIdentifier, this.creationDate, this.lastModifiedDate, new ObjectDataSequence(objectDataArr), null);
        try {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = this.storeEncryptionAlgorithm;
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes256_CCM;
            if (aSN1ObjectIdentifier.equals(aSN1ObjectIdentifier2)) {
                Object[] objArr = new Object[1];
                a(new int[]{8, 17, 169, 0}, true, new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0}, objArr);
                Cipher cipherCreateCipher = createCipher(((String) objArr[0]).intern(), bArrGenerateKey);
                return new EncryptedObjectStoreData(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, new PBES2Parameters(keyDerivationFuncGeneratePkbdAlgorithmIdentifier, new EncryptionScheme(aSN1ObjectIdentifier2, CCMParameters.getInstance(cipherCreateCipher.getParameters().getEncoded())))), cipherCreateCipher.doFinal(objectStoreData.getEncoded()));
            }
            Object[] objArr2 = new Object[1];
            a(new int[]{25, 6, 0, 0}, false, new byte[]{1, 0, 0, 0, 0, 1}, objArr2);
            EncryptedObjectStoreData encryptedObjectStoreData = new EncryptedObjectStoreData(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, new PBES2Parameters(keyDerivationFuncGeneratePkbdAlgorithmIdentifier, new EncryptionScheme(NISTObjectIdentifiers.id_aes256_wrap_pad))), createCipher(((String) objArr2[0]).intern(), bArrGenerateKey).doFinal(objectStoreData.getEncoded()));
            int i4 = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 28 / 0;
            }
            return encryptedObjectStoreData;
        } catch (InvalidKeyException e) {
            throw new IOException(e.toString());
        } catch (NoSuchProviderException e2) {
            throw new IOException(e2.toString());
        } catch (BadPaddingException e3) {
            throw new IOException(e3.toString());
        } catch (IllegalBlockSizeException e4) {
            throw new IOException(e4.toString());
        } catch (NoSuchPaddingException e5) {
            throw new NoSuchAlgorithmException(e5.toString());
        }
    }

    private static String getPublicKeyAlg(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = publicAlgMap.get(aSN1ObjectIdentifier);
        if (str == null) {
            return aSN1ObjectIdentifier.getId();
        }
        int i4 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private boolean isSimilarHmacPbkd(PBKDFConfig pBKDFConfig, KeyDerivationFunc keyDerivationFunc) {
        int i = 2 % 2;
        if (!pBKDFConfig.getAlgorithm().equals(keyDerivationFunc.getAlgorithm())) {
            return false;
        }
        if (!MiscObjectIdentifiers.id_scrypt.equals(keyDerivationFunc.getAlgorithm())) {
            if (pBKDFConfig instanceof PBKDF2Config) {
                PBKDF2Config pBKDF2Config = (PBKDF2Config) pBKDFConfig;
                PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(keyDerivationFunc.getParameters());
                return pBKDF2Config.getSaltLength() == pBKDF2Params.getSalt().length && pBKDF2Config.getIterationCount() == pBKDF2Params.getIterationCount().intValue();
            }
            int i2 = onExtraCallbackWithResult + 5;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!(pBKDFConfig instanceof ScryptConfig)) {
            int i4 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        ScryptConfig scryptConfig = (ScryptConfig) pBKDFConfig;
        ScryptParams scryptParams = ScryptParams.getInstance(keyDerivationFunc.getParameters());
        if (scryptConfig.getSaltLength() == scryptParams.getSalt().length && scryptConfig.getBlockSize() == scryptParams.getBlockSize().intValue()) {
            int i6 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                scryptConfig.getCostParameter();
                scryptParams.getCostParameter().intValue();
                throw null;
            }
            if (scryptConfig.getCostParameter() == scryptParams.getCostParameter().intValue() && scryptConfig.getParallelizationParameter() == scryptParams.getParallelizationParameter().intValue()) {
                return true;
            }
        }
        return false;
    }

    private void verifyMac(byte[] bArr, PbkdMacIntegrityCheck pbkdMacIntegrityCheck, char[] cArr) throws NoSuchAlgorithmException, IOException, NoSuchProviderException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (!Arrays.constantTimeAreEqual(calculateMac(bArr, pbkdMacIntegrityCheck.getMacAlgorithm(), pbkdMacIntegrityCheck.getPbkdAlgorithm(), cArr), pbkdMacIntegrityCheck.getMac())) {
            throw new IOException("BCFKS KeyStore corrupted: MAC calculation failed");
        }
        int i4 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private void verifySig(ASN1Encodable aSN1Encodable, SignatureCheck signatureCheck, PublicKey publicKey) throws GeneralSecurityException, IOException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Signature signatureCreateSignature = this.helper.createSignature(signatureCheck.getSignatureAlgorithm().getAlgorithm().getId());
        signatureCreateSignature.initVerify(publicKey);
        signatureCreateSignature.update(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER));
        if (!signatureCreateSignature.verify(signatureCheck.getSignature().getOctets())) {
            throw new IOException("BCFKS KeyStore corrupted: signature calculation failed");
        }
        int i4 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration<String> engineAliases() {
        int i = 2 % 2;
        final Iterator it = new HashSet(this.entries.keySet()).iterator();
        Enumeration<String> enumeration = new Enumeration() { // from class: org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.1
            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return it.hasNext();
            }

            @Override // java.util.Enumeration
            public Object nextElement() {
                return it.next();
            }
        };
        int i2 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return enumeration;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 15;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (str == null) {
            throw new NullPointerException("alias value is null");
        }
        int i4 = i2 + 65;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Map<String, ObjectData> map = this.entries;
        if (i5 != 0) {
            return map.containsKey(str);
        }
        map.containsKey(str);
        throw null;
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) throws KeyStoreException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (this.entries.get(str) != null) {
            this.privateKeyCache.remove(str);
            this.entries.remove(str);
            this.lastModifiedDate = new Date();
        } else {
            int i4 = onWarmupCompleted + 43;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        int i = 2 % 2;
        ObjectData objectData = this.entries.get(str);
        Object obj = null;
        if (objectData != null) {
            int i2 = onWarmupCompleted + 27;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                objectData.getType().equals(PRIVATE_KEY);
                obj.hashCode();
                throw null;
            }
            if (objectData.getType().equals(PRIVATE_KEY) || objectData.getType().equals(PROTECTED_PRIVATE_KEY)) {
                return decodeCertificate(EncryptedPrivateKeyData.getInstance(objectData.getData()).getCertificateChain()[0]);
            }
            int i3 = onWarmupCompleted + 3;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                objectData.getType().equals(CERTIFICATE);
                throw null;
            }
            if (objectData.getType().equals(CERTIFICATE)) {
                return decodeCertificate(objectData.getData());
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) throws CertificateEncodingException {
        int i = 2 % 2;
        if (certificate == null) {
            return null;
        }
        try {
            byte[] encoded = certificate.getEncoded();
            for (String str : this.entries.keySet()) {
                ObjectData objectData = this.entries.get(str);
                if (objectData.getType().equals(CERTIFICATE)) {
                    int i2 = onWarmupCompleted + 69;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    if (Arrays.areEqual(objectData.getData(), encoded)) {
                        int i4 = onExtraCallbackWithResult + 89;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        return str;
                    }
                } else if (objectData.getType().equals(PRIVATE_KEY) || objectData.getType().equals(PROTECTED_PRIVATE_KEY)) {
                    try {
                        if (Arrays.areEqual(EncryptedPrivateKeyData.getInstance(objectData.getData()).getCertificateChain()[0].toASN1Primitive().getEncoded(), encoded)) {
                            return str;
                        }
                    } catch (IOException unused) {
                        continue;
                    }
                }
            }
        } catch (CertificateEncodingException unused2) {
        }
        int i6 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ObjectData objectData = this.entries.get(str);
        if (objectData == null) {
            return null;
        }
        if (!objectData.getType().equals(PRIVATE_KEY)) {
            int i4 = onWarmupCompleted + 63;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (!objectData.getType().equals(PROTECTED_PRIVATE_KEY)) {
                return null;
            }
        }
        org.bouncycastle.asn1.x509.Certificate[] certificateChain = EncryptedPrivateKeyData.getInstance(objectData.getData()).getCertificateChain();
        int length = certificateChain.length;
        X509Certificate[] x509CertificateArr = new X509Certificate[length];
        int i6 = 0;
        while (i6 != length) {
            int i7 = onWarmupCompleted + 19;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                x509CertificateArr[i6] = decodeCertificate(certificateChain[i6]);
                i6 += 78;
            } else {
                x509CertificateArr[i6] = decodeCertificate(certificateChain[i6]);
                i6++;
            }
        }
        return x509CertificateArr;
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ObjectData objectData = this.entries.get(str);
        if (objectData == null) {
            int i4 = onExtraCallbackWithResult + 3;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 21 / 0;
            }
            return null;
        }
        int i6 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i6 % 128;
        try {
            if (i6 % 2 == 0) {
                return objectData.getLastModifiedDate().getDate();
            }
            objectData.getLastModifiedDate().getDate();
            throw null;
        } catch (ParseException unused) {
            return new Date();
        }
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) throws InvalidKeySpecException, UnrecoverableKeyException, NoSuchAlgorithmException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ObjectData objectData = this.entries.get(str);
        if (objectData == null) {
            return null;
        }
        if (objectData.getType().equals(PRIVATE_KEY) || objectData.getType().equals(PROTECTED_PRIVATE_KEY)) {
            PrivateKey privateKey = this.privateKeyCache.get(str);
            if (privateKey != null) {
                int i4 = onExtraCallbackWithResult;
                int i5 = i4 + 99;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 5;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                return privateKey;
            }
            EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = EncryptedPrivateKeyInfo.getInstance(EncryptedPrivateKeyData.getInstance(objectData.getData()).getEncryptedPrivateKeyInfo());
            try {
                PrivateKeyInfo privateKeyInfo = PrivateKeyInfo.getInstance(decryptData("PRIVATE_KEY_ENCRYPTION", encryptedPrivateKeyInfo.getEncryptionAlgorithm(), cArr, encryptedPrivateKeyInfo.getEncryptedData()));
                PrivateKey privateKeyGeneratePrivate = this.helper.createKeyFactory(getPublicKeyAlg(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm())).generatePrivate(new PKCS8EncodedKeySpec(privateKeyInfo.getEncoded()));
                this.privateKeyCache.put(str, privateKeyGeneratePrivate);
                return privateKeyGeneratePrivate;
            } catch (Exception e) {
                throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover private key (" + str + "): " + e.getMessage());
            }
        }
        int i9 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i9 % 128;
        if (i9 % 2 != 0) {
            objectData.getType().equals(SECRET_KEY);
            throw null;
        }
        if (!objectData.getType().equals(SECRET_KEY) && !objectData.getType().equals(PROTECTED_SECRET_KEY)) {
            throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover secret key (" + str + "): type not recognized");
        }
        EncryptedSecretKeyData encryptedSecretKeyData = EncryptedSecretKeyData.getInstance(objectData.getData());
        try {
            SecretKeyData secretKeyData = SecretKeyData.getInstance(decryptData("SECRET_KEY_ENCRYPTION", encryptedSecretKeyData.getKeyEncryptionAlgorithm(), cArr, encryptedSecretKeyData.getEncryptedKeyData()));
            return this.helper.createSecretKeyFactory(secretKeyData.getKeyAlgorithm().getId()).generateSecret(new SecretKeySpec(secretKeyData.getKeyBytes(), secretKeyData.getKeyAlgorithm().getId()));
        } catch (Exception e2) {
            throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover secret key (" + str + "): " + e2.getMessage());
        }
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            this.entries.get(str);
            throw null;
        }
        ObjectData objectData = this.entries.get(str);
        if (objectData == null) {
            int i3 = onWarmupCompleted + 63;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        BigInteger type = objectData.getType();
        BigInteger bigInteger = CERTIFICATE;
        if (i6 != 0) {
            return type.equals(bigInteger);
        }
        type.equals(bigInteger);
        throw null;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ObjectData objectData = this.entries.get(str);
        if (objectData == null) {
            return false;
        }
        int i4 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        BigInteger type = objectData.getType();
        if (type.equals(PRIVATE_KEY) || type.equals(SECRET_KEY) || type.equals(PROTECTED_PRIVATE_KEY)) {
            return true;
        }
        int i6 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            type.equals(PROTECTED_SECRET_KEY);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (type.equals(PROTECTED_SECRET_KEY)) {
            return true;
        }
        int i7 = onExtraCallbackWithResult + 17;
        int i8 = i7 % 128;
        onWarmupCompleted = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 65;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) throws NoSuchAlgorithmException, IOException, CertificateException {
        AlgorithmIdentifier signatureAlgorithm;
        ASN1Encodable storeData;
        PublicKey publicKey;
        X509Certificate x509Certificate;
        ObjectStoreData objectStoreData;
        int i = 2 % 2;
        this.entries.clear();
        this.privateKeyCache.clear();
        this.creationDate = null;
        this.lastModifiedDate = null;
        this.hmacAlgorithm = null;
        if (inputStream == null) {
            Date date = new Date();
            this.creationDate = date;
            this.lastModifiedDate = date;
            this.verificationKey = null;
            this.validator = null;
            this.hmacAlgorithm = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA512, DERNull.INSTANCE);
            this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(PKCSObjectIdentifiers.id_PBKDF2, 64);
            return;
        }
        try {
            ObjectStore objectStore = ObjectStore.getInstance(new ASN1InputStream(inputStream).readObject());
            ObjectStoreIntegrityCheck integrityCheck = objectStore.getIntegrityCheck();
            if (integrityCheck.getType() == 0) {
                PbkdMacIntegrityCheck pbkdMacIntegrityCheck = PbkdMacIntegrityCheck.getInstance(integrityCheck.getIntegrityCheck());
                this.hmacAlgorithm = pbkdMacIntegrityCheck.getMacAlgorithm();
                this.hmacPkbdAlgorithm = pbkdMacIntegrityCheck.getPbkdAlgorithm();
                signatureAlgorithm = this.hmacAlgorithm;
                try {
                    verifyMac(objectStore.getStoreData().toASN1Primitive().getEncoded(), pbkdMacIntegrityCheck, cArr);
                } catch (NoSuchProviderException e) {
                    throw new IOException(e.getMessage());
                }
            } else {
                if (integrityCheck.getType() != 1) {
                    throw new IOException("BCFKS KeyStore unable to recognize integrity check.");
                }
                SignatureCheck signatureCheck = SignatureCheck.getInstance(integrityCheck.getIntegrityCheck());
                signatureAlgorithm = signatureCheck.getSignatureAlgorithm();
                try {
                    ASN1Object[] certificates = signatureCheck.getCertificates();
                    if (this.validator == null) {
                        storeData = objectStore.getStoreData();
                        publicKey = this.verificationKey;
                    } else {
                        if (certificates == null) {
                            throw new IOException("validator specified but no certifcates in store");
                        }
                        int i2 = onWarmupCompleted + 23;
                        onExtraCallbackWithResult = i2 % 128;
                        int i3 = i2 % 2;
                        CertificateFactory certificateFactoryCreateCertificateFactory = this.helper.createCertificateFactory("X.509");
                        int length = certificates.length;
                        X509Certificate[] x509CertificateArr = new X509Certificate[length];
                        for (int i4 = 0; i4 != length; i4++) {
                            x509CertificateArr[i4] = (X509Certificate) certificateFactoryCreateCertificateFactory.generateCertificate(new ByteArrayInputStream(certificates[i4].getEncoded()));
                        }
                        if (!this.validator.isValid(x509CertificateArr)) {
                            throw new IOException("certificate chain in key store signature not valid");
                        }
                        int i5 = onWarmupCompleted + 95;
                        onExtraCallbackWithResult = i5 % 128;
                        if (i5 % 2 != 0) {
                            storeData = objectStore.getStoreData();
                            x509Certificate = x509CertificateArr[1];
                        } else {
                            storeData = objectStore.getStoreData();
                            x509Certificate = x509CertificateArr[0];
                        }
                        publicKey = x509Certificate.getPublicKey();
                    }
                    verifySig(storeData, signatureCheck, publicKey);
                    int i6 = onExtraCallbackWithResult + 63;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                } catch (GeneralSecurityException e2) {
                    throw new IOException("error verifying signature: " + e2.getMessage(), e2);
                }
            }
            EncryptedObjectStoreData storeData2 = objectStore.getStoreData();
            if (storeData2 instanceof EncryptedObjectStoreData) {
                int i8 = onWarmupCompleted + 9;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                EncryptedObjectStoreData encryptedObjectStoreData = storeData2;
                objectStoreData = ObjectStoreData.getInstance(decryptData("STORE_ENCRYPTION", encryptedObjectStoreData.getEncryptionAlgorithm(), cArr, encryptedObjectStoreData.getEncryptedContent().getOctets()));
            } else {
                objectStoreData = ObjectStoreData.getInstance(storeData2);
            }
            try {
                this.creationDate = objectStoreData.getCreationDate().getDate();
                this.lastModifiedDate = objectStoreData.getLastModifiedDate().getDate();
                if (!objectStoreData.getIntegrityAlgorithm().equals(signatureAlgorithm)) {
                    throw new IOException("BCFKS KeyStore storeData integrity algorithm does not match store integrity algorithm.");
                }
                int i10 = onWarmupCompleted + 37;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                ObjectDataSequence objectDataSequence = objectStoreData.getObjectDataSequence();
                if (i11 != 0) {
                    objectDataSequence.iterator();
                    throw null;
                }
                Iterator<ASN1Encodable> it = objectDataSequence.iterator();
                while (it.hasNext()) {
                    int i12 = onWarmupCompleted + 33;
                    onExtraCallbackWithResult = i12 % 128;
                    if (i12 % 2 != 0) {
                        ObjectData objectData = ObjectData.getInstance(it.next());
                        this.entries.put(objectData.getIdentifier(), objectData);
                        int i13 = 73 / 0;
                    } else {
                        ObjectData objectData2 = ObjectData.getInstance(it.next());
                        this.entries.put(objectData2.getIdentifier(), objectData2);
                    }
                }
            } catch (ParseException unused) {
                throw new IOException("BCFKS KeyStore unable to parse store data information.");
            }
        } catch (Exception e3) {
            throw new IOException(e3.getMessage());
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, UnsupportedCallbackException, IOException, CertificateException {
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        AlgorithmIdentifier algorithmIdentifier;
        int i = 2 % 2;
        Object obj = null;
        if (loadStoreParameter == null) {
            engineLoad(null, null);
            return;
        }
        if (!(loadStoreParameter instanceof BCFKSLoadStoreParameter)) {
            if (loadStoreParameter instanceof BCLoadStoreParameter) {
                engineLoad(((BCLoadStoreParameter) loadStoreParameter).getInputStream(), ParameterUtil.extractPassword(loadStoreParameter));
                return;
            }
            throw new IllegalArgumentException("no support for 'parameter' of type " + loadStoreParameter.getClass().getName());
        }
        BCFKSLoadStoreParameter bCFKSLoadStoreParameter = (BCFKSLoadStoreParameter) loadStoreParameter;
        char[] cArrExtractPassword = ParameterUtil.extractPassword(bCFKSLoadStoreParameter);
        this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(bCFKSLoadStoreParameter.getStorePBKDFConfig(), 64);
        if (bCFKSLoadStoreParameter.getStoreEncryptionAlgorithm() == BCFKSLoadStoreParameter.EncryptionAlgorithm.AES256_CCM) {
            int i2 = onExtraCallbackWithResult + 79;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes256_CCM;
                obj.hashCode();
                throw null;
            }
            aSN1ObjectIdentifier = NISTObjectIdentifiers.id_aes256_CCM;
        } else {
            aSN1ObjectIdentifier = NISTObjectIdentifiers.id_aes256_wrap_pad;
        }
        this.storeEncryptionAlgorithm = aSN1ObjectIdentifier;
        if (bCFKSLoadStoreParameter.getStoreMacAlgorithm() == BCFKSLoadStoreParameter.MacAlgorithm.HmacSHA512) {
            algorithmIdentifier = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA512, DERNull.INSTANCE);
        } else {
            algorithmIdentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.id_hmacWithSHA3_512, DERNull.INSTANCE);
            int i3 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
        this.hmacAlgorithm = algorithmIdentifier;
        this.verificationKey = (PublicKey) bCFKSLoadStoreParameter.getStoreSignatureKey();
        this.validator = bCFKSLoadStoreParameter.getCertChainValidator();
        this.signatureAlgorithm = generateSignatureAlgId(this.verificationKey, bCFKSLoadStoreParameter.getStoreSignatureAlgorithm());
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = this.storeEncryptionAlgorithm;
        InputStream inputStream = bCFKSLoadStoreParameter.getInputStream();
        engineLoad(inputStream, cArrExtractPassword);
        if (inputStream != null) {
            if (!(!isSimilarHmacPbkd(bCFKSLoadStoreParameter.getStorePBKDFConfig(), this.hmacPkbdAlgorithm))) {
                int i5 = onWarmupCompleted + 69;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    aSN1ObjectIdentifier3.equals(this.storeEncryptionAlgorithm);
                    throw null;
                }
                if (aSN1ObjectIdentifier3.equals(this.storeEncryptionAlgorithm)) {
                    return;
                }
            }
            throw new IOException("configuration parameters do not match existing store");
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        Date date;
        int i = 2 % 2;
        ObjectData objectData = this.entries.get(str);
        Date date2 = new Date();
        if (objectData == null) {
            date = date2;
        } else {
            if (!objectData.getType().equals(CERTIFICATE)) {
                throw new KeyStoreException("BCFKS KeyStore already has a key entry with alias " + str);
            }
            int i2 = onWarmupCompleted + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Date dateExtractCreationDate = extractCreationDate(objectData, date2);
            int i4 = onExtraCallbackWithResult + 33;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            date = dateExtractCreationDate;
        }
        try {
            this.entries.put(str, new ObjectData(CERTIFICATE, str, date, date2, certificate.getEncoded(), null));
            this.lastModifiedDate = date2;
        } catch (CertificateEncodingException e) {
            throw new ExtKeyStoreException("BCFKS KeyStore unable to handle certificate: " + e.getMessage(), e);
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws Throwable {
        char[] cArr2;
        SecretKeyData secretKeyData;
        EncryptedSecretKeyData encryptedSecretKeyData;
        EncryptedPrivateKeyInfo encryptedPrivateKeyInfo;
        int i = 2 % 2;
        Date date = new Date();
        ObjectData objectData = this.entries.get(str);
        Date dateExtractCreationDate = objectData != null ? extractCreationDate(objectData, date) : date;
        this.privateKeyCache.remove(str);
        if (key instanceof PrivateKey) {
            int i2 = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (certificateArr == null) {
                throw new KeyStoreException("BCFKS KeyStore requires a certificate chain for private key storage.");
            }
            try {
                byte[] encoded = key.getEncoded();
                KeyDerivationFunc keyDerivationFuncGeneratePkbdAlgorithmIdentifier = generatePkbdAlgorithmIdentifier(PKCSObjectIdentifiers.id_PBKDF2, 32);
                byte[] bArrGenerateKey = generateKey(keyDerivationFuncGeneratePkbdAlgorithmIdentifier, "PRIVATE_KEY_ENCRYPTION", cArr == null ? new char[0] : cArr, 32);
                ASN1ObjectIdentifier aSN1ObjectIdentifier = this.storeEncryptionAlgorithm;
                ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes256_CCM;
                if (aSN1ObjectIdentifier.equals(aSN1ObjectIdentifier2)) {
                    Object[] objArr = new Object[1];
                    a(new int[]{8, 17, 169, 0}, true, new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0}, objArr);
                    Cipher cipherCreateCipher = createCipher(((String) objArr[0]).intern(), bArrGenerateKey);
                    encryptedPrivateKeyInfo = new EncryptedPrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, new PBES2Parameters(keyDerivationFuncGeneratePkbdAlgorithmIdentifier, new EncryptionScheme(aSN1ObjectIdentifier2, CCMParameters.getInstance(cipherCreateCipher.getParameters().getEncoded())))), cipherCreateCipher.doFinal(encoded));
                } else {
                    Object[] objArr2 = new Object[1];
                    a(new int[]{25, 6, 0, 0}, false, new byte[]{1, 0, 0, 0, 0, 1}, objArr2);
                    encryptedPrivateKeyInfo = new EncryptedPrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, new PBES2Parameters(keyDerivationFuncGeneratePkbdAlgorithmIdentifier, new EncryptionScheme(NISTObjectIdentifiers.id_aes256_wrap_pad))), createCipher(((String) objArr2[0]).intern(), bArrGenerateKey).doFinal(encoded));
                }
                this.entries.put(str, new ObjectData(PRIVATE_KEY, str, dateExtractCreationDate, date, createPrivateKeySequence(encryptedPrivateKeyInfo, certificateArr).getEncoded(), null));
            } catch (Exception e) {
                throw new ExtKeyStoreException("BCFKS KeyStore exception storing private key: " + e.toString(), e);
            }
        } else {
            if (!(key instanceof SecretKey)) {
                throw new KeyStoreException("BCFKS KeyStore unable to recognize key.");
            }
            int i3 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (certificateArr != null) {
                throw new KeyStoreException("BCFKS KeyStore cannot store certificate chain with secret key.");
            }
            try {
                byte[] encoded2 = key.getEncoded();
                KeyDerivationFunc keyDerivationFuncGeneratePkbdAlgorithmIdentifier2 = generatePkbdAlgorithmIdentifier(PKCSObjectIdentifiers.id_PBKDF2, 32);
                if (cArr == null) {
                    int i4 = onExtraCallbackWithResult + 53;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    cArr2 = new char[0];
                } else {
                    cArr2 = cArr;
                }
                byte[] bArrGenerateKey2 = generateKey(keyDerivationFuncGeneratePkbdAlgorithmIdentifier2, "SECRET_KEY_ENCRYPTION", cArr2, 32);
                String upperCase = Strings.toUpperCase(key.getAlgorithm());
                Object[] objArr3 = new Object[1];
                a(new int[]{5, 3, 166, 0}, true, new byte[]{1, 0, 0}, objArr3);
                if (upperCase.indexOf(((String) objArr3[0]).intern()) >= 0) {
                    secretKeyData = new SecretKeyData(NISTObjectIdentifiers.aes, encoded2);
                } else {
                    Map<String, ASN1ObjectIdentifier> map = oidMap;
                    ASN1ObjectIdentifier aSN1ObjectIdentifier3 = map.get(upperCase);
                    if (aSN1ObjectIdentifier3 != null) {
                        secretKeyData = new SecretKeyData(aSN1ObjectIdentifier3, encoded2);
                    } else {
                        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = map.get(upperCase + onVideoError.onExtraCallbackWithResult + (encoded2.length << 3));
                        if (aSN1ObjectIdentifier4 == null) {
                            throw new KeyStoreException("BCFKS KeyStore cannot recognize secret key (" + upperCase + ") for storage.");
                        }
                        secretKeyData = new SecretKeyData(aSN1ObjectIdentifier4, encoded2);
                    }
                }
                ASN1ObjectIdentifier aSN1ObjectIdentifier5 = this.storeEncryptionAlgorithm;
                ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NISTObjectIdentifiers.id_aes256_CCM;
                if (aSN1ObjectIdentifier5.equals(aSN1ObjectIdentifier6)) {
                    Object[] objArr4 = new Object[1];
                    a(new int[]{8, 17, 169, 0}, true, new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0}, objArr4);
                    Cipher cipherCreateCipher2 = createCipher(((String) objArr4[0]).intern(), bArrGenerateKey2);
                    encryptedSecretKeyData = new EncryptedSecretKeyData(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, new PBES2Parameters(keyDerivationFuncGeneratePkbdAlgorithmIdentifier2, new EncryptionScheme(aSN1ObjectIdentifier6, CCMParameters.getInstance(cipherCreateCipher2.getParameters().getEncoded())))), cipherCreateCipher2.doFinal(secretKeyData.getEncoded()));
                } else {
                    Object[] objArr5 = new Object[1];
                    a(new int[]{25, 6, 0, 0}, false, new byte[]{1, 0, 0, 0, 0, 1}, objArr5);
                    encryptedSecretKeyData = new EncryptedSecretKeyData(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, new PBES2Parameters(keyDerivationFuncGeneratePkbdAlgorithmIdentifier2, new EncryptionScheme(NISTObjectIdentifiers.id_aes256_wrap_pad))), createCipher(((String) objArr5[0]).intern(), bArrGenerateKey2).doFinal(secretKeyData.getEncoded()));
                }
                this.entries.put(str, new ObjectData(SECRET_KEY, str, dateExtractCreationDate, date, encryptedSecretKeyData.getEncoded(), null));
            } catch (Exception e2) {
                throw new ExtKeyStoreException("BCFKS KeyStore exception storing private key: " + e2.toString(), e2);
            }
        }
        this.lastModifiedDate = date;
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
        Date date;
        int i = 2 % 2;
        Date date2 = new Date();
        ObjectData objectData = this.entries.get(str);
        if (objectData != null) {
            Date dateExtractCreationDate = extractCreationDate(objectData, date2);
            int i2 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            date = dateExtractCreationDate;
        } else {
            date = date2;
        }
        if (certificateArr != null) {
            try {
                EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = EncryptedPrivateKeyInfo.getInstance(bArr);
                try {
                    this.privateKeyCache.remove(str);
                    this.entries.put(str, new ObjectData(PROTECTED_PRIVATE_KEY, str, date, date2, createPrivateKeySequence(encryptedPrivateKeyInfo, certificateArr).getEncoded(), null));
                } catch (Exception e) {
                    throw new ExtKeyStoreException("BCFKS KeyStore exception storing protected private key: " + e.toString(), e);
                }
            } catch (Exception e2) {
                throw new ExtKeyStoreException("BCFKS KeyStore private key encoding must be an EncryptedPrivateKeyInfo.", e2);
            }
        } else {
            try {
                this.entries.put(str, new ObjectData(PROTECTED_SECRET_KEY, str, date, date2, bArr, null));
                int i4 = onWarmupCompleted + 119;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            } catch (Exception e3) {
                throw new ExtKeyStoreException("BCFKS KeyStore exception storing protected private key: " + e3.toString(), e3);
            }
        }
        this.lastModifiedDate = date2;
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int size = this.entries.size();
        int i4 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return size;
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws Throwable {
        KeyDerivationFunc keyDerivationFunc;
        BigInteger keyLength;
        int i = 2 % 2;
        if (this.creationDate == null) {
            throw new IOException("KeyStore not initialized");
        }
        int i2 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            getEncryptedObjectStoreData(this.hmacAlgorithm, cArr);
            MiscObjectIdentifiers.id_scrypt.equals(this.hmacPkbdAlgorithm.getAlgorithm());
            throw null;
        }
        EncryptedObjectStoreData encryptedObjectStoreData = getEncryptedObjectStoreData(this.hmacAlgorithm, cArr);
        if (MiscObjectIdentifiers.id_scrypt.equals(this.hmacPkbdAlgorithm.getAlgorithm())) {
            int i3 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            ScryptParams scryptParams = ScryptParams.getInstance(this.hmacPkbdAlgorithm.getParameters());
            keyDerivationFunc = this.hmacPkbdAlgorithm;
            keyLength = scryptParams.getKeyLength();
        } else {
            PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(this.hmacPkbdAlgorithm.getParameters());
            keyDerivationFunc = this.hmacPkbdAlgorithm;
            keyLength = pBKDF2Params.getKeyLength();
        }
        this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(keyDerivationFunc, keyLength.intValue());
        try {
            outputStream.write(new ObjectStore(encryptedObjectStoreData, new ObjectStoreIntegrityCheck(new PbkdMacIntegrityCheck(this.hmacAlgorithm, this.hmacPkbdAlgorithm, calculateMac(encryptedObjectStoreData.getEncoded(), this.hmacAlgorithm, this.hmacPkbdAlgorithm, cArr)))).getEncoded());
            outputStream.flush();
        } catch (NoSuchProviderException e) {
            throw new IOException("cannot calculate mac: " + e.getMessage());
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws Throwable {
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        SignatureCheck signatureCheck;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (loadStoreParameter == null) {
            throw new IllegalArgumentException("'parameter' arg cannot be null");
        }
        if (loadStoreParameter instanceof BCFKSStoreParameter) {
            BCFKSStoreParameter bCFKSStoreParameter = (BCFKSStoreParameter) loadStoreParameter;
            char[] cArrExtractPassword = ParameterUtil.extractPassword(loadStoreParameter);
            this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(bCFKSStoreParameter.getStorePBKDFConfig(), 64);
            engineStore(bCFKSStoreParameter.getOutputStream(), cArrExtractPassword);
            return;
        }
        if (!(loadStoreParameter instanceof BCFKSLoadStoreParameter)) {
            if (loadStoreParameter instanceof BCLoadStoreParameter) {
                engineStore(((BCLoadStoreParameter) loadStoreParameter).getOutputStream(), ParameterUtil.extractPassword(loadStoreParameter));
                return;
            }
            throw new IllegalArgumentException("no support for 'parameter' of type " + loadStoreParameter.getClass().getName());
        }
        BCFKSLoadStoreParameter bCFKSLoadStoreParameter = (BCFKSLoadStoreParameter) loadStoreParameter;
        if (bCFKSLoadStoreParameter.getStoreSignatureKey() == null) {
            char[] cArrExtractPassword2 = ParameterUtil.extractPassword(bCFKSLoadStoreParameter);
            this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(bCFKSLoadStoreParameter.getStorePBKDFConfig(), 64);
            this.storeEncryptionAlgorithm = bCFKSLoadStoreParameter.getStoreEncryptionAlgorithm() == BCFKSLoadStoreParameter.EncryptionAlgorithm.AES256_CCM ? NISTObjectIdentifiers.id_aes256_CCM : NISTObjectIdentifiers.id_aes256_wrap_pad;
            this.hmacAlgorithm = bCFKSLoadStoreParameter.getStoreMacAlgorithm() == BCFKSLoadStoreParameter.MacAlgorithm.HmacSHA512 ? new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA512, DERNull.INSTANCE) : new AlgorithmIdentifier(NISTObjectIdentifiers.id_hmacWithSHA3_512, DERNull.INSTANCE);
            engineStore(bCFKSLoadStoreParameter.getOutputStream(), cArrExtractPassword2);
            return;
        }
        this.signatureAlgorithm = generateSignatureAlgId(bCFKSLoadStoreParameter.getStoreSignatureKey(), bCFKSLoadStoreParameter.getStoreSignatureAlgorithm());
        this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(bCFKSLoadStoreParameter.getStorePBKDFConfig(), 64);
        if (bCFKSLoadStoreParameter.getStoreEncryptionAlgorithm() == BCFKSLoadStoreParameter.EncryptionAlgorithm.AES256_CCM) {
            int i4 = onWarmupCompleted + 93;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes256_CCM;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            aSN1ObjectIdentifier = NISTObjectIdentifiers.id_aes256_CCM;
        } else {
            aSN1ObjectIdentifier = NISTObjectIdentifiers.id_aes256_wrap_pad;
        }
        this.storeEncryptionAlgorithm = aSN1ObjectIdentifier;
        int i5 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        this.hmacAlgorithm = bCFKSLoadStoreParameter.getStoreMacAlgorithm() == BCFKSLoadStoreParameter.MacAlgorithm.HmacSHA512 ? new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA512, DERNull.INSTANCE) : new AlgorithmIdentifier(NISTObjectIdentifiers.id_hmacWithSHA3_512, DERNull.INSTANCE);
        int i7 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        EncryptedObjectStoreData encryptedObjectStoreData = getEncryptedObjectStoreData(this.signatureAlgorithm, ParameterUtil.extractPassword(bCFKSLoadStoreParameter));
        try {
            Signature signatureCreateSignature = this.helper.createSignature(this.signatureAlgorithm.getAlgorithm().getId());
            signatureCreateSignature.initSign((PrivateKey) bCFKSLoadStoreParameter.getStoreSignatureKey());
            signatureCreateSignature.update(encryptedObjectStoreData.getEncoded());
            X509Certificate[] storeCertificates = bCFKSLoadStoreParameter.getStoreCertificates();
            if (storeCertificates != null) {
                int length = storeCertificates.length;
                org.bouncycastle.asn1.x509.Certificate[] certificateArr = new org.bouncycastle.asn1.x509.Certificate[length];
                for (int i9 = 0; i9 != length; i9++) {
                    int i10 = onWarmupCompleted + 43;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    certificateArr[i9] = org.bouncycastle.asn1.x509.Certificate.getInstance(storeCertificates[i9].getEncoded());
                }
                signatureCheck = new SignatureCheck(this.signatureAlgorithm, certificateArr, signatureCreateSignature.sign());
            } else {
                signatureCheck = new SignatureCheck(this.signatureAlgorithm, signatureCreateSignature.sign());
            }
            bCFKSLoadStoreParameter.getOutputStream().write(new ObjectStore(encryptedObjectStoreData, new ObjectStoreIntegrityCheck(signatureCheck)).getEncoded());
            bCFKSLoadStoreParameter.getOutputStream().flush();
        } catch (GeneralSecurityException e) {
            throw new IOException("error creating signature: " + e.getMessage(), e);
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = onExtraCallback;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 35283), (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 34, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i7 = $11 + 35;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i3];
        System.arraycopy(cArr2, i2, cArr4, 0, i3);
        if (bArr != null) {
            int i9 = $10 + 3;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i10 = $10 + 103;
                $11 = i10 % 128;
                if (i10 % 2 != 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), 29 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString(BuildConfig.FLAVOR) + 10936), 65 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 16718 - KeyEvent.normalizeMetaState(0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - ExpandableListView.getPackedPositionGroup(0L)), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 70, View.combineMeasuredStates(0, 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            int i13 = $11 + 81;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr4, 0, cArr5, 1, i3);
                System.arraycopy(cArr5, 1, cArr4, i3 / i5, i5);
                System.arraycopy(cArr5, i5, cArr4, 1, i3 + i5);
            } else {
                char[] cArr6 = new char[i3];
                System.arraycopy(cArr4, 0, cArr6, 0, i3);
                int i14 = i3 - i5;
                System.arraycopy(cArr6, 0, cArr4, i14, i5);
                System.arraycopy(cArr6, i5, cArr4, 0, i14);
            }
        }
        if (z) {
            char[] cArr7 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr4 = cArr7;
        }
        if (i4 > 0) {
            int i15 = $11 + 45;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static void IAuthTabCallback() {
        onExtraCallback = new char[]{27246, 27143, 27164, 27244, 27146, 27186, 27324, 27303, 27334, 27485, 27482, 27457, 27459, 27461, 27471, 27462, 27465, 27305, 27305, 27327, 27298, 27308, 27300, 27323, 27298, 27246, 27149, 27138, 27137, 27167, 27165};
    }
}
