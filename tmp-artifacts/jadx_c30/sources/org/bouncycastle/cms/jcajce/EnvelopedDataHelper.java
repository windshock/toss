package org.bouncycastle.cms.jcajce;

import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.sf.scuba.smartcards.BuildConfig;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RC2CBCParameter;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSAlgorithm;
import org.bouncycastle.cms.CMSEnvelopedGenerator;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.PasswordRecipient;
import org.bouncycastle.operator.DefaultSecretKeySizeProvider;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.SecretKeySizeProvider;
import org.bouncycastle.operator.SymmetricKeyUnwrapper;
import org.bouncycastle.operator.jcajce.JceAsymmetricKeyUnwrapper;
import org.bouncycastle.operator.jcajce.JceKTSKeyUnwrapper;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class EnvelopedDataHelper {
    private static int $10 = 0;
    private static int $11 = 1;
    protected static final Map BASE_CIPHER_NAMES;
    protected static final Map CIPHER_ALG_NAMES;
    private static int IAuthTabCallback = 1;
    protected static final SecretKeySizeProvider KEY_SIZE_PROVIDER;
    protected static final Map MAC_ALG_NAMES;
    private static final Map PBKDF2_ALG_NAMES;
    private static final Set authEnvelopedAlgorithms;
    private static long onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private static final short[] rc2Ekb;
    private static final short[] rc2Table;
    private JcaJceExtHelper helper;

    interface JCECallback {
        Object doInJCE() throws NoSuchPaddingException, CMSException, NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException;
    }

    static {
        onExtraCallbackWithResult();
        KEY_SIZE_PROVIDER = DefaultSecretKeySizeProvider.INSTANCE;
        HashSet hashSet = new HashSet();
        authEnvelopedAlgorithms = hashSet;
        HashMap map = new HashMap();
        BASE_CIPHER_NAMES = map;
        HashMap map2 = new HashMap();
        CIPHER_ALG_NAMES = map2;
        HashMap map3 = new HashMap();
        MAC_ALG_NAMES = map3;
        HashMap map4 = new HashMap();
        PBKDF2_ALG_NAMES = map4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = CMSAlgorithm.DES_CBC;
        map.put(aSN1ObjectIdentifier, "DES");
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = CMSAlgorithm.DES_EDE3_CBC;
        map.put(aSN1ObjectIdentifier2, "DESEDE");
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = CMSAlgorithm.AES128_CBC;
        Object[] objArr = new Object[1];
        a(new char[]{35748, 3649, 32884}, TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 34273, objArr);
        map.put(aSN1ObjectIdentifier3, ((String) objArr[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = CMSAlgorithm.AES192_CBC;
        Object[] objArr2 = new Object[1];
        a(new char[]{35748, 3649, 32884}, 34273 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), objArr2);
        map.put(aSN1ObjectIdentifier4, ((String) objArr2[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = CMSAlgorithm.AES256_CBC;
        Object[] objArr3 = new Object[1];
        a(new char[]{35748, 3649, 32884}, (ViewConfiguration.getEdgeSlop() >> 16) + 34273, objArr3);
        map.put(aSN1ObjectIdentifier5, ((String) objArr3[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = CMSAlgorithm.RC2_CBC;
        map.put(aSN1ObjectIdentifier6, "RC2");
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = CMSAlgorithm.CAST5_CBC;
        map.put(aSN1ObjectIdentifier7, "CAST5");
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = CMSAlgorithm.CAMELLIA128_CBC;
        map.put(aSN1ObjectIdentifier8, "Camellia");
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = CMSAlgorithm.CAMELLIA192_CBC;
        map.put(aSN1ObjectIdentifier9, "Camellia");
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = CMSAlgorithm.CAMELLIA256_CBC;
        map.put(aSN1ObjectIdentifier10, "Camellia");
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = CMSAlgorithm.SEED_CBC;
        map.put(aSN1ObjectIdentifier11, "SEED");
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = PKCSObjectIdentifiers.rc4;
        map.put(aSN1ObjectIdentifier12, "RC4");
        map.put(CryptoProObjectIdentifiers.gostR28147_gcfb, "GOST28147");
        map2.put(aSN1ObjectIdentifier, "DES/CBC/PKCS5Padding");
        map2.put(aSN1ObjectIdentifier6, "RC2/CBC/PKCS5Padding");
        map2.put(aSN1ObjectIdentifier2, "DESEDE/CBC/PKCS5Padding");
        Object[] objArr4 = new Object[1];
        a(new char[]{35748, 25467, 23040, 12635, 10442, 2016, 65156, 54839, 52589, 42013, 37672, 35551, 24980, 22698, 12414, 12116, 1585, 64775, 54509, 50115}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 59611, objArr4);
        map2.put(aSN1ObjectIdentifier3, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        a(new char[]{35748, 25467, 23040, 12635, 10442, 2016, 65156, 54839, 52589, 42013, 37672, 35551, 24980, 22698, 12414, 12116, 1585, 64775, 54509, 50115}, 59611 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), objArr5);
        map2.put(aSN1ObjectIdentifier4, ((String) objArr5[0]).intern());
        Object[] objArr6 = new Object[1];
        a(new char[]{35748, 25467, 23040, 12635, 10442, 2016, 65156, 54839, 52589, 42013, 37672, 35551, 24980, 22698, 12414, 12116, 1585, 64775, 54509, 50115}, 59612 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr6);
        map2.put(aSN1ObjectIdentifier5, ((String) objArr6[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = PKCSObjectIdentifiers.rsaEncryption;
        Object[] objArr7 = new Object[1];
        a(new char[]{35767, 58413, 21650, 50459, 13772, 42401, 5637, 34551, 63341, 26589, 55208, 16415, 45200, 8554, 37374, 404, 29233, 58055, 21357, 49923}, MotionEvent.axisFromString(BuildConfig.FLAVOR) + 28572, objArr7);
        map2.put(aSN1ObjectIdentifier13, ((String) objArr7[0]).intern());
        map2.put(aSN1ObjectIdentifier7, "CAST5/CBC/PKCS5Padding");
        map2.put(aSN1ObjectIdentifier8, "Camellia/CBC/PKCS5Padding");
        map2.put(aSN1ObjectIdentifier9, "Camellia/CBC/PKCS5Padding");
        map2.put(aSN1ObjectIdentifier10, "Camellia/CBC/PKCS5Padding");
        map2.put(aSN1ObjectIdentifier11, "SEED/CBC/PKCS5Padding");
        map2.put(aSN1ObjectIdentifier12, "RC4");
        map3.put(aSN1ObjectIdentifier2, "DESEDEMac");
        Object[] objArr8 = new Object[1];
        a(new char[]{35748, 4311, 48472, 22989, 58968, 33493}, 39798 - ImageFormat.getBitsPerPixel(0), objArr8);
        map3.put(aSN1ObjectIdentifier3, ((String) objArr8[0]).intern());
        Object[] objArr9 = new Object[1];
        a(new char[]{35748, 4311, 48472, 22989, 58968, 33493}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 39798, objArr9);
        map3.put(aSN1ObjectIdentifier4, ((String) objArr9[0]).intern());
        Object[] objArr10 = new Object[1];
        a(new char[]{35748, 4311, 48472, 22989, 58968, 33493}, (ViewConfiguration.getLongPressTimeout() >> 16) + 39799, objArr10);
        map3.put(aSN1ObjectIdentifier5, ((String) objArr10[0]).intern());
        map3.put(aSN1ObjectIdentifier6, "RC2Mac");
        map4.put(PasswordRecipient.PRF.HMacSHA1.getAlgorithmID(), "PBKDF2WITHHMACSHA1");
        map4.put(PasswordRecipient.PRF.HMacSHA224.getAlgorithmID(), "PBKDF2WITHHMACSHA224");
        map4.put(PasswordRecipient.PRF.HMacSHA256.getAlgorithmID(), "PBKDF2WITHHMACSHA256");
        map4.put(PasswordRecipient.PRF.HMacSHA384.getAlgorithmID(), "PBKDF2WITHHMACSHA384");
        map4.put(PasswordRecipient.PRF.HMacSHA512.getAlgorithmID(), "PBKDF2WITHHMACSHA512");
        hashSet.add(NISTObjectIdentifiers.id_aes128_GCM);
        hashSet.add(NISTObjectIdentifiers.id_aes192_GCM);
        hashSet.add(NISTObjectIdentifiers.id_aes256_GCM);
        hashSet.add(NISTObjectIdentifiers.id_aes128_CCM);
        hashSet.add(NISTObjectIdentifiers.id_aes192_CCM);
        hashSet.add(NISTObjectIdentifiers.id_aes256_CCM);
        rc2Table = new short[]{189, 86, 234, 242, 162, 241, 172, 42, 176, 147, 209, 156, 27, 51, 253, 208, 48, 4, 182, 220, 125, 223, 50, 75, 247, 203, 69, 155, 49, 187, 33, 90, 65, 159, 225, 217, 74, 77, 158, 218, 160, 104, 44, 195, 39, 95, 128, 54, 62, 238, 251, 149, 26, 254, 206, 168, 52, 169, 19, 240, 166, 63, 216, 12, 120, 36, 175, 35, 82, 193, 103, 23, 245, 102, 144, 231, 232, 7, 184, 96, 72, 230, 30, 83, 243, 146, 164, 114, 140, 8, 21, 110, 134, 0, 132, 250, 244, 127, 138, 66, 25, 246, 219, 205, 20, 141, 80, 18, 186, 60, 6, 78, 236, 179, 53, 17, 161, 136, 142, 43, 148, 153, 183, 113, 116, 211, 228, 191, 58, 222, 150, 14, 188, 10, 237, 119, 252, 55, 107, 3, 121, 137, 98, 198, 215, 192, 210, 124, 106, 139, 34, 163, 91, 5, 93, 2, 117, 213, 97, 227, 24, 143, 85, 81, 173, 31, 11, 94, 133, 229, 194, 87, 99, 202, 61, 108, 180, 197, 204, 112, 178, 145, 89, 13, 71, 32, 200, 79, 88, 224, 1, 226, 22, 56, 196, 111, 59, 15, 101, 70, 190, 126, 45, 123, 130, 249, 64, 181, 29, 115, 248, 235, 38, 199, 135, 151, 37, 84, 177, 40, 170, 152, 157, 165, 100, 109, 122, 212, 16, 129, 68, 239, 73, 214, 174, 46, 221, 118, 92, 47, 167, 28, 201, 9, 105, 154, 131, 207, 41, 57, 185, 233, 76, 255, 67, 171};
        rc2Ekb = new short[]{93, 190, 155, 139, 17, 153, 110, 77, 89, 243, 133, 166, 63, 183, 131, 197, 228, 115, 107, 58, 104, 90, 192, 71, 160, 100, 52, 12, 241, 208, 82, 165, 185, 30, 150, 67, 65, 216, 212, 44, 219, 248, 7, 119, 42, 202, 235, 239, 16, 28, 22, 13, 56, 114, 47, 137, 193, 249, 128, 196, 109, 174, 48, 61, 206, 32, 99, 254, 230, 26, 199, 184, 80, 232, 36, 23, 252, 37, 111, 187, 106, 163, 68, 83, 217, 162, 1, 171, 188, 182, 31, 152, 238, 154, 167, 45, 79, 158, 142, 172, 224, 198, 73, 70, 41, 244, 148, 138, 175, 225, 91, 195, 179, 123, 87, 209, 124, 156, 237, 135, 64, 140, 226, 203, 147, 20, 201, 97, 46, 229, 204, 246, 94, 168, 92, 214, 117, 141, 98, 149, 88, 105, 118, 161, 74, 181, 85, 9, 120, 51, 130, 215, 221, 121, 245, 27, 11, 222, 38, 33, 40, 116, 4, 151, 86, 223, 60, 240, 55, 57, 220, 255, 6, 164, 234, 66, 8, 218, 180, 113, 176, 207, 18, 122, 78, 250, 108, 29, 132, 0, 200, 127, 145, 69, 170, 43, 194, 177, 143, 213, 186, 242, 173, 25, 178, 103, 54, 247, 15, 10, 146, 125, 227, 157, 233, 144, 62, 35, 39, 102, 19, 236, 129, 21, 189, 34, 191, 159, 126, 169, 81, 75, 76, 251, 2, 211, 112, 134, 49, 231, 59, 5, 3, 84, 96, 72, 101, 24, 210, 205, 95, 50, 136, 14, 53, 253};
        int i = IAuthTabCallback + 57;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    EnvelopedDataHelper(JcaJceExtHelper jcaJceExtHelper) {
        this.helper = jcaJceExtHelper;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.cms.CMSException */
    static Object execute(JCECallback jCECallback) throws CMSException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        try {
            Object objDoInJCE = jCECallback.doInJCE();
            int i4 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objDoInJCE;
        } catch (InvalidAlgorithmParameterException e) {
            throw new CMSException("algorithm parameters invalid.", e);
        } catch (InvalidKeyException e2) {
            throw new CMSException("key invalid in message.", e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new CMSException("can't find algorithm.", e3);
        } catch (NoSuchProviderException e4) {
            throw new CMSException("can't find provider.", e4);
        } catch (InvalidParameterSpecException e5) {
            throw new CMSException("MAC algorithm parameter spec invalid.", e5);
        } catch (NoSuchPaddingException e6) {
            throw new CMSException("required padding not supported.", e6);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.cms.CMSException */
    byte[] calculateDerivedKey(int i, char[] cArr, AlgorithmIdentifier algorithmIdentifier, int i2) throws CMSException {
        JcaJceExtHelper jcaJceExtHelper;
        String str;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(algorithmIdentifier.getParameters());
        try {
            if (i == 0) {
                int i6 = onExtraCallbackWithResult + 41;
                int i7 = i6 % 128;
                onNavigationEvent = i7;
                int i8 = i6 % 2;
                jcaJceExtHelper = this.helper;
                int i9 = i7 + 95;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 3 / 5;
                }
                str = "PBKDF2with8BIT";
            } else {
                jcaJceExtHelper = this.helper;
                str = (String) PBKDF2_ALG_NAMES.get(pBKDF2Params.getPrf());
            }
            return jcaJceExtHelper.createSecretKeyFactory(str).generateSecret(new PBEKeySpec(cArr, pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue(), i2)).getEncoded();
        } catch (GeneralSecurityException e) {
            throw new CMSException("Unable to calculate derived key from password: " + e.getMessage(), e);
        }
    }

    AlgorithmParameterGenerator createAlgorithmParameterGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws GeneralSecurityException {
        int i = 2 % 2;
        String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
        if (str != null) {
            int i2 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            try {
                AlgorithmParameterGenerator algorithmParameterGeneratorCreateAlgorithmParameterGenerator = this.helper.createAlgorithmParameterGenerator(str);
                int i4 = onExtraCallbackWithResult + 103;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return algorithmParameterGeneratorCreateAlgorithmParameterGenerator;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        AlgorithmParameterGenerator algorithmParameterGeneratorCreateAlgorithmParameterGenerator2 = this.helper.createAlgorithmParameterGenerator(aSN1ObjectIdentifier.getId());
        int i6 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return algorithmParameterGeneratorCreateAlgorithmParameterGenerator2;
        }
        throw null;
    }

    AlgorithmParameters createAlgorithmParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws NoSuchAlgorithmException, NoSuchProviderException {
        int i = 2 % 2;
        String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
        if (str != null) {
            try {
                AlgorithmParameters algorithmParametersCreateAlgorithmParameters = this.helper.createAlgorithmParameters(str);
                int i2 = onNavigationEvent + 3;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return algorithmParametersCreateAlgorithmParameters;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        AlgorithmParameters algorithmParametersCreateAlgorithmParameters2 = this.helper.createAlgorithmParameters(aSN1ObjectIdentifier.getId());
        int i4 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return algorithmParametersCreateAlgorithmParameters2;
    }

    public JceAsymmetricKeyUnwrapper createAsymmetricUnwrapper(AlgorithmIdentifier algorithmIdentifier, PrivateKey privateKey) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        JceAsymmetricKeyUnwrapper jceAsymmetricKeyUnwrapperCreateAsymmetricUnwrapper = this.helper.createAsymmetricUnwrapper(algorithmIdentifier, CMSUtils.cleanPrivateKey(privateKey));
        int i4 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return jceAsymmetricKeyUnwrapperCreateAsymmetricUnwrapper;
    }

    public JceKTSKeyUnwrapper createAsymmetricUnwrapper(AlgorithmIdentifier algorithmIdentifier, PrivateKey privateKey, byte[] bArr, byte[] bArr2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        JceKTSKeyUnwrapper jceKTSKeyUnwrapperCreateAsymmetricUnwrapper = this.helper.createAsymmetricUnwrapper(algorithmIdentifier, CMSUtils.cleanPrivateKey(privateKey), bArr, bArr2);
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        return jceKTSKeyUnwrapperCreateAsymmetricUnwrapper;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.cms.CMSException */
    Cipher createCipher(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = (String) CIPHER_ALG_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                int i3 = onExtraCallbackWithResult + 65;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                try {
                    return this.helper.createCipher(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createCipher(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e) {
            throw new CMSException("cannot create cipher: " + e.getMessage(), e);
        }
    }

    public Cipher createContentCipher(final Key key, final AlgorithmIdentifier algorithmIdentifier) throws CMSException {
        int i = 2 % 2;
        Cipher cipher = (Cipher) execute(new JCECallback() { // from class: org.bouncycastle.cms.jcajce.EnvelopedDataHelper.1
            @Override // org.bouncycastle.cms.jcajce.EnvelopedDataHelper.JCECallback
            public Object doInJCE() throws NoSuchPaddingException, CMSException, NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
                Cipher cipherCreateCipher = EnvelopedDataHelper.this.createCipher(algorithmIdentifier.getAlgorithm());
                ASN1Encodable parameters = algorithmIdentifier.getParameters();
                String id = algorithmIdentifier.getAlgorithm().getId();
                if (parameters == null || (parameters instanceof ASN1Null)) {
                    if (id.equals(CMSAlgorithm.DES_CBC.getId()) || id.equals(CMSEnvelopedGenerator.DES_EDE3_CBC) || id.equals(CMSEnvelopedGenerator.IDEA_CBC) || id.equals(CMSEnvelopedGenerator.CAST5_CBC)) {
                        cipherCreateCipher.init(2, key, new IvParameterSpec(new byte[8]));
                        return cipherCreateCipher;
                    }
                    cipherCreateCipher.init(2, key);
                    return cipherCreateCipher;
                }
                try {
                    AlgorithmParameters algorithmParametersCreateAlgorithmParameters = EnvelopedDataHelper.this.createAlgorithmParameters(algorithmIdentifier.getAlgorithm());
                    CMSUtils.loadParameters(algorithmParametersCreateAlgorithmParameters, parameters);
                    cipherCreateCipher.init(2, key, algorithmParametersCreateAlgorithmParameters);
                    return cipherCreateCipher;
                } catch (NoSuchAlgorithmException e) {
                    if (!id.equals(CMSAlgorithm.DES_CBC.getId()) && !id.equals(CMSEnvelopedGenerator.DES_EDE3_CBC) && !id.equals(CMSEnvelopedGenerator.IDEA_CBC) && !id.equals(CMSEnvelopedGenerator.AES128_CBC) && !id.equals(CMSEnvelopedGenerator.AES192_CBC) && !id.equals(CMSEnvelopedGenerator.AES256_CBC)) {
                        throw e;
                    }
                    cipherCreateCipher.init(2, key, new IvParameterSpec(ASN1OctetString.getInstance(parameters).getOctets()));
                    return cipherCreateCipher;
                }
            }
        });
        int i2 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return cipher;
    }

    Mac createContentMac(final Key key, final AlgorithmIdentifier algorithmIdentifier) throws CMSException {
        int i = 2 % 2;
        Mac mac = (Mac) execute(new JCECallback() { // from class: org.bouncycastle.cms.jcajce.EnvelopedDataHelper.2
            @Override // org.bouncycastle.cms.jcajce.EnvelopedDataHelper.JCECallback
            public Object doInJCE() throws NoSuchPaddingException, CMSException, NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
                Mac macCreateMac = EnvelopedDataHelper.this.createMac(algorithmIdentifier.getAlgorithm());
                ASN1Encodable parameters = algorithmIdentifier.getParameters();
                algorithmIdentifier.getAlgorithm().getId();
                if (parameters == null || (parameters instanceof ASN1Null)) {
                    macCreateMac.init(key);
                    return macCreateMac;
                }
                AlgorithmParameters algorithmParametersCreateAlgorithmParameters = EnvelopedDataHelper.this.createAlgorithmParameters(algorithmIdentifier.getAlgorithm());
                CMSUtils.loadParameters(algorithmParametersCreateAlgorithmParameters, parameters);
                macCreateMac.init(key, algorithmParametersCreateAlgorithmParameters.getParameterSpec(AlgorithmParameterSpec.class));
                return macCreateMac;
            }
        });
        int i2 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return mac;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.cms.CMSException */
    KeyAgreement createKeyAgreement(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        try {
            String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                int i4 = onNavigationEvent + 3;
                onExtraCallbackWithResult = i4 % 128;
                try {
                    if (i4 % 2 == 0) {
                        return this.helper.createKeyAgreement(str);
                    }
                    this.helper.createKeyAgreement(str);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createKeyAgreement(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e) {
            throw new CMSException("cannot create key agreement: " + e.getMessage(), e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.cms.CMSException */
    public KeyFactory createKeyFactory(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        int i = 2 % 2;
        try {
            String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
            Object obj = null;
            if (str != null) {
                try {
                    KeyFactory keyFactoryCreateKeyFactory = this.helper.createKeyFactory(str);
                    int i2 = onExtraCallbackWithResult + 9;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        return keyFactoryCreateKeyFactory;
                    }
                    obj.hashCode();
                    throw null;
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            KeyFactory keyFactoryCreateKeyFactory2 = this.helper.createKeyFactory(aSN1ObjectIdentifier.getId());
            int i3 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return keyFactoryCreateKeyFactory2;
            }
            obj.hashCode();
            throw null;
        } catch (GeneralSecurityException e) {
            throw new CMSException("cannot create key factory: " + e.getMessage(), e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.cms.CMSException */
    public KeyGenerator createKeyGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        try {
            String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                int i4 = onNavigationEvent + 53;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                try {
                    KeyGenerator keyGeneratorCreateKeyGenerator = this.helper.createKeyGenerator(str);
                    int i6 = onNavigationEvent + 3;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    return keyGeneratorCreateKeyGenerator;
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createKeyGenerator(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e) {
            throw new CMSException("cannot create key generator: " + e.getMessage(), e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.cms.CMSException */
    KeyPairGenerator createKeyPairGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        try {
            String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                int i4 = onNavigationEvent + 25;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                try {
                    return this.helper.createKeyPairGenerator(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            KeyPairGenerator keyPairGeneratorCreateKeyPairGenerator = this.helper.createKeyPairGenerator(aSN1ObjectIdentifier.getId());
            int i6 = onNavigationEvent + 87;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return keyPairGeneratorCreateKeyPairGenerator;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (GeneralSecurityException e) {
            throw new CMSException("cannot create key pair generator: " + e.getMessage(), e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.cms.CMSException */
    Mac createMac(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        try {
            String str = (String) MAC_ALG_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.helper.createMac(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            Mac macCreateMac = this.helper.createMac(aSN1ObjectIdentifier.getId());
            int i4 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 98 / 0;
            }
            return macCreateMac;
        } catch (GeneralSecurityException e) {
            throw new CMSException("cannot create mac: " + e.getMessage(), e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.cms.CMSException */
    Cipher createRFC3211Wrapper(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
        if (str == null) {
            throw new CMSException("no name for " + aSN1ObjectIdentifier);
        }
        try {
            Cipher cipherCreateCipher = this.helper.createCipher(str + "RFC3211Wrap");
            int i3 = onNavigationEvent + 97;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return cipherCreateCipher;
            }
            throw null;
        } catch (GeneralSecurityException e) {
            throw new CMSException("cannot create cipher: " + e.getMessage(), e);
        }
    }

    SecretKeyFactory createSecretKeyFactory(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        SecretKeyFactory secretKeyFactoryCreateSecretKeyFactory = this.helper.createSecretKeyFactory(str);
        int i4 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return secretKeyFactoryCreateSecretKeyFactory;
    }

    public SymmetricKeyUnwrapper createSymmetricUnwrapper(AlgorithmIdentifier algorithmIdentifier, SecretKey secretKey) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        JcaJceExtHelper jcaJceExtHelper = this.helper;
        if (i3 == 0) {
            return jcaJceExtHelper.createSymmetricUnwrapper(algorithmIdentifier, secretKey);
        }
        jcaJceExtHelper.createSymmetricUnwrapper(algorithmIdentifier, secretKey);
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.cms.CMSException */
    AlgorithmParameters generateParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, SecretKey secretKey, SecureRandom secureRandom) throws CMSException, InvalidAlgorithmParameterException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        try {
            AlgorithmParameterGenerator algorithmParameterGeneratorCreateAlgorithmParameterGenerator = createAlgorithmParameterGenerator(aSN1ObjectIdentifier);
            if (aSN1ObjectIdentifier.equals(CMSAlgorithm.RC2_CBC)) {
                byte[] bArr = new byte[8];
                secureRandom.nextBytes(bArr);
                try {
                    algorithmParameterGeneratorCreateAlgorithmParameterGenerator.init(new RC2ParameterSpec(secretKey.getEncoded().length << 3, bArr), secureRandom);
                    int i4 = onNavigationEvent + 105;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                } catch (InvalidAlgorithmParameterException e) {
                    throw new CMSException("parameters generation error: " + e, e);
                }
            }
            return algorithmParameterGeneratorCreateAlgorithmParameterGenerator.generateParameters();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        } catch (GeneralSecurityException e2) {
            throw new CMSException("exception creating algorithm parameter generator: " + e2, e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    AlgorithmIdentifier getAlgorithmIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier, AlgorithmParameters algorithmParameters) throws CMSException {
        DERNull dERNullExtractParameters;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 5 / 0;
            if (algorithmParameters != null) {
                dERNullExtractParameters = CMSUtils.extractParameters(algorithmParameters);
            } else {
                dERNullExtractParameters = DERNull.INSTANCE;
                int i4 = onNavigationEvent + 81;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
        } else if (algorithmParameters != null) {
        }
        return new AlgorithmIdentifier(aSN1ObjectIdentifier, dERNullExtractParameters);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AlgorithmIdentifier getAlgorithmIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier, AlgorithmParameterSpec algorithmParameterSpec) {
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            return new AlgorithmIdentifier(aSN1ObjectIdentifier, new DEROctetString(((IvParameterSpec) algorithmParameterSpec).getIV()));
        }
        if (!(algorithmParameterSpec instanceof RC2ParameterSpec)) {
            throw new IllegalStateException("unknown parameter spec: " + algorithmParameterSpec);
        }
        RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
        int effectiveKeyBits = rC2ParameterSpec.getEffectiveKeyBits();
        if (effectiveKeyBits == -1) {
            return new AlgorithmIdentifier(aSN1ObjectIdentifier, new RC2CBCParameter(rC2ParameterSpec.getIV()));
        }
        int i5 = onExtraCallbackWithResult;
        int i6 = i5 + 95;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            i = effectiveKeyBits;
            if (effectiveKeyBits < 24240) {
                short s = rc2Table[effectiveKeyBits];
                int i7 = i5 + 113;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                i = s;
            }
        } else {
            i = effectiveKeyBits;
            if (effectiveKeyBits < 256) {
            }
        }
        return new AlgorithmIdentifier(aSN1ObjectIdentifier, new RC2CBCParameter(i, rC2ParameterSpec.getIV()));
    }

    String getBaseCipherName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
        if (str == null) {
            return aSN1ObjectIdentifier.getId();
        }
        int i4 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
        return str;
    }

    public Key getJceKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, GenericKey genericKey) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (!(!(genericKey.getRepresentation() instanceof Key))) {
            int i4 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return (Key) genericKey.getRepresentation();
            }
            throw null;
        }
        if (!(genericKey.getRepresentation() instanceof byte[])) {
            throw new IllegalArgumentException("unknown generic key type");
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec((byte[]) genericKey.getRepresentation(), getBaseCipherName(aSN1ObjectIdentifier));
        int i5 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return secretKeySpec;
        }
        obj.hashCode();
        throw null;
    }

    Key getJceKey(GenericKey genericKey) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z = genericKey.getRepresentation() instanceof Key;
            throw null;
        }
        if (genericKey.getRepresentation() instanceof Key) {
            int i3 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Key key = (Key) genericKey.getRepresentation();
            if (i4 != 0) {
                return key;
            }
            obj.hashCode();
            throw null;
        }
        if (!(genericKey.getRepresentation() instanceof byte[])) {
            throw new IllegalArgumentException("unknown generic key type");
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec((byte[]) genericKey.getRepresentation(), "ENC");
        int i5 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return secretKeySpec;
        }
        throw null;
    }

    boolean isAuthEnveloped(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Set set = authEnvelopedAlgorithms;
        if (i3 != 0) {
            return set.contains(aSN1ObjectIdentifier);
        }
        set.contains(aSN1ObjectIdentifier);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.cms.CMSException */
    public void keySizeCheck(AlgorithmIdentifier algorithmIdentifier, Key key) throws CMSException {
        byte[] encoded;
        int i = 2 % 2;
        int keySize = KEY_SIZE_PROVIDER.getKeySize(algorithmIdentifier);
        if (keySize > 0) {
            int i2 = onNavigationEvent + 75;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            try {
                encoded = key.getEncoded();
            } catch (Exception unused) {
                encoded = null;
            }
            if (encoded != null) {
                int i4 = onNavigationEvent + 95;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                if ((encoded.length << 3) != keySize) {
                    throw new CMSException("Expected key size for algorithm OID not found in recipient.");
                }
            }
        }
        int i6 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $11 + 17;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.MeasureSpec.getMode(0) + 24, TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 19628, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 59, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 59;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                try {
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 59 - (ViewConfiguration.getJumpTapTimeout() >> 16), 6383 - KeyEvent.getDeadChar(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i7 = 45 / 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                try {
                    Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), 59 - ExpandableListView.getPackedPositionType(0L), 6383 - (ViewConfiguration.getLongPressTimeout() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
        }
        String str = new String(cArr2);
        int i8 = $10 + 49;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = 5571935027922341586L;
    }
}
