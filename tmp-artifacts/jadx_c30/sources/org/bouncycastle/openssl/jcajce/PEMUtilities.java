package org.bouncycastle.openssl.jcajce;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.openssl.EncryptionException;
import org.bouncycastle.openssl.PEMException;
import org.bouncycastle.util.Integers;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class PEMUtilities {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static final Map KEYSIZES;
    private static final Set PKCS5_SCHEME_1;
    private static final Set PKCS5_SCHEME_2;
    private static final Map PRFS;
    private static final Map PRFS_SALT;
    private static int onExtraCallback = 1;
    private static int[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        IAuthTabCallback();
        HashMap map = new HashMap();
        KEYSIZES = map;
        HashSet hashSet = new HashSet();
        PKCS5_SCHEME_1 = hashSet;
        HashSet hashSet2 = new HashSet();
        PKCS5_SCHEME_2 = hashSet2;
        HashMap map2 = new HashMap();
        PRFS = map2;
        HashMap map3 = new HashMap();
        PRFS_SALT = map3;
        hashSet.add(PKCSObjectIdentifiers.pbeWithMD2AndDES_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithMD2AndRC2_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithMD5AndDES_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithMD5AndRC2_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithSHA1AndDES_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithSHA1AndRC2_CBC);
        hashSet2.add(PKCSObjectIdentifiers.id_PBES2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.des_EDE3_CBC;
        hashSet2.add(aSN1ObjectIdentifier);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes128_CBC;
        hashSet2.add(aSN1ObjectIdentifier2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_aes192_CBC;
        hashSet2.add(aSN1ObjectIdentifier3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_aes256_CBC;
        hashSet2.add(aSN1ObjectIdentifier4);
        map.put(aSN1ObjectIdentifier.getId(), Integers.valueOf(CertificateHolderAuthorization.CVCA));
        map.put(aSN1ObjectIdentifier2.getId(), Integers.valueOf(128));
        map.put(aSN1ObjectIdentifier3.getId(), Integers.valueOf(CertificateHolderAuthorization.CVCA));
        map.put(aSN1ObjectIdentifier4.getId(), Integers.valueOf(256));
        map.put(PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC4.getId(), Integers.valueOf(128));
        map.put(PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC4, Integers.valueOf(40));
        map.put(PKCSObjectIdentifiers.pbeWithSHAAnd2_KeyTripleDES_CBC, Integers.valueOf(128));
        map.put(PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC, Integers.valueOf(CertificateHolderAuthorization.CVCA));
        map.put(PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC2_CBC, Integers.valueOf(128));
        map.put(PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC, Integers.valueOf(40));
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = PKCSObjectIdentifiers.id_hmacWithSHA1;
        map2.put(aSN1ObjectIdentifier5, "PBKDF2withHMACSHA1");
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = PKCSObjectIdentifiers.id_hmacWithSHA256;
        map2.put(aSN1ObjectIdentifier6, "PBKDF2withHMACSHA256");
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = PKCSObjectIdentifiers.id_hmacWithSHA512;
        map2.put(aSN1ObjectIdentifier7, "PBKDF2withHMACSHA512");
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = PKCSObjectIdentifiers.id_hmacWithSHA224;
        map2.put(aSN1ObjectIdentifier8, "PBKDF2withHMACSHA224");
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = PKCSObjectIdentifiers.id_hmacWithSHA384;
        map2.put(aSN1ObjectIdentifier9, "PBKDF2withHMACSHA384");
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = NISTObjectIdentifiers.id_hmacWithSHA3_224;
        map2.put(aSN1ObjectIdentifier10, "PBKDF2withHMACSHA3-224");
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = NISTObjectIdentifiers.id_hmacWithSHA3_256;
        map2.put(aSN1ObjectIdentifier11, "PBKDF2withHMACSHA3-256");
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = NISTObjectIdentifiers.id_hmacWithSHA3_384;
        map2.put(aSN1ObjectIdentifier12, "PBKDF2withHMACSHA3-384");
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = NISTObjectIdentifiers.id_hmacWithSHA3_512;
        map2.put(aSN1ObjectIdentifier13, "PBKDF2withHMACSHA3-512");
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = CryptoProObjectIdentifiers.gostR3411Hmac;
        map2.put(aSN1ObjectIdentifier14, "PBKDF2withHMACGOST3411");
        map3.put(aSN1ObjectIdentifier5, Integers.valueOf(20));
        map3.put(aSN1ObjectIdentifier6, Integers.valueOf(32));
        map3.put(aSN1ObjectIdentifier7, Integers.valueOf(64));
        map3.put(aSN1ObjectIdentifier8, Integers.valueOf(28));
        map3.put(aSN1ObjectIdentifier9, Integers.valueOf(48));
        map3.put(aSN1ObjectIdentifier10, Integers.valueOf(28));
        map3.put(aSN1ObjectIdentifier11, Integers.valueOf(32));
        map3.put(aSN1ObjectIdentifier12, Integers.valueOf(48));
        map3.put(aSN1ObjectIdentifier13, Integers.valueOf(64));
        map3.put(aSN1ObjectIdentifier14, Integers.valueOf(32));
        int i = onNavigationEvent + 45;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 19 / 0;
        }
    }

    PEMUtilities() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Type inference failed for: r2v16, types: [javax.crypto.spec.RC2ParameterSpec] */
    /* JADX WARN: Type inference failed for: r2v17, types: [javax.crypto.spec.RC2ParameterSpec] */
    /* JADX WARN: Type inference failed for: r2v2, types: [javax.crypto.spec.RC2ParameterSpec] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static byte[] crypt(boolean z, JcaJceHelper jcaJceHelper, byte[] bArr, char[] cArr, String str, byte[] bArr2) throws Throwable {
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        int i2;
        SecretKey key;
        String str6;
        int i3;
        String str7;
        int i4;
        byte[] bArr3 = bArr2;
        int i5 = 2 % 2;
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        if (str.endsWith("-CFB")) {
            str2 = "CFB";
            str3 = "NoPadding";
        } else {
            str2 = "CBC";
            str3 = "PKCS5Padding";
        }
        if (!str.endsWith("-ECB")) {
            int i6 = onWarmupCompleted + 31;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            if (!"DES-EDE".equals(str)) {
                int i8 = onWarmupCompleted + 85;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                if ("DES-EDE3".equals(str)) {
                    str2 = "ECB";
                    ivParameterSpec = null;
                }
            }
        }
        IvParameterSpec rC2ParameterSpec = ivParameterSpec;
        int i10 = 1;
        if (!(!str.endsWith("-OFB"))) {
            str5 = "OFB";
            str4 = "NoPadding";
        } else {
            str4 = str3;
            str5 = str2;
        }
        if (str.startsWith("DES-EDE")) {
            key = getKey(jcaJceHelper, cArr, "DESede", 24, bArr2, !str.startsWith("DES-EDE3"));
            str6 = "DESede";
        } else if (str.startsWith("DES-")) {
            int i11 = IAuthTabCallback + 13;
            onWarmupCompleted = i11 % 128;
            str7 = "DES";
            if (i11 % 2 != 0) {
                i4 = 112;
                key = getKey(jcaJceHelper, cArr, str7, i4, bArr3);
                str6 = str7;
            } else {
                key = getKey(jcaJceHelper, cArr, "DES", 8, bArr3);
                str6 = str7;
            }
        } else if (str.startsWith("BF-")) {
            i4 = 16;
            str7 = "Blowfish";
            key = getKey(jcaJceHelper, cArr, str7, i4, bArr3);
            str6 = str7;
        } else if (str.startsWith("RC2-")) {
            if (str.startsWith("RC2-40-")) {
                int i12 = onWarmupCompleted + 17;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                i3 = 40;
            } else {
                i3 = str.startsWith("RC2-64-") ^ true ? 128 : 64;
            }
            str7 = "RC2";
            key = getKey(jcaJceHelper, cArr, "RC2", i3 / 8, bArr3);
            rC2ParameterSpec = rC2ParameterSpec == null ? new RC2ParameterSpec(i3) : new RC2ParameterSpec(i3, bArr3);
            str6 = str7;
        } else {
            Object[] objArr = new Object[1];
            a(new int[]{359783065, 626237265}, 4 - Gravity.getAbsoluteGravity(0, 0), objArr);
            if (!str.startsWith(((String) objArr[0]).intern())) {
                throw new EncryptionException("unknown encryption with private key");
            }
            if (bArr3.length > 8) {
                byte[] bArr4 = new byte[8];
                System.arraycopy(bArr3, 0, bArr4, 0, 8);
                bArr3 = bArr4;
            }
            Object[] objArr2 = new Object[1];
            a(new int[]{359783065, 626237265, -455730022, -1885868766}, 8 - Color.blue(0), objArr2);
            if (str.startsWith(((String) objArr2[0]).intern())) {
                i = 8;
                i2 = 128;
            } else {
                Object[] objArr3 = new Object[1];
                a(new int[]{359783065, 626237265, -1805537796, 848477204}, TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 8, objArr3);
                if (str.startsWith(((String) objArr3[0]).intern())) {
                    int i14 = IAuthTabCallback + 37;
                    onWarmupCompleted = i14 % 128;
                    int i15 = i14 % 2;
                    i2 = CertificateHolderAuthorization.CVCA;
                } else {
                    Object[] objArr4 = new Object[1];
                    a(new int[]{359783065, 626237265, 1169964252, -922139729}, TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 8, objArr4);
                    if (!str.startsWith(((String) objArr4[0]).intern())) {
                        throw new EncryptionException("unknown AES encryption with private key");
                    }
                    int i16 = IAuthTabCallback + 73;
                    onWarmupCompleted = i16 % 128;
                    i2 = i16 % 2 != 0 ? 2959 : 256;
                }
                i = 8;
            }
            Object[] objArr5 = new Object[1];
            a(new int[]{1692513988, -1593335071}, AndroidCharacter.getMirror('0') - '-', objArr5);
            String strIntern = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            a(new int[]{1692513988, -1593335071}, 3 - ((Process.getThreadPriority(0) + 20) >> 6), objArr6);
            key = getKey(jcaJceHelper, cArr, ((String) objArr6[0]).intern(), i2 / i, bArr3);
            str6 = strIntern;
        }
        try {
            Cipher cipherCreateCipher = jcaJceHelper.createCipher(str6 + "/" + str5 + "/" + str4);
            if (z) {
                int i17 = IAuthTabCallback + 75;
                onWarmupCompleted = i17 % 128;
                int i18 = i17 % 2;
            } else {
                i10 = 2;
            }
            if (rC2ParameterSpec == null) {
                cipherCreateCipher.init(i10, key);
                int i19 = IAuthTabCallback + 123;
                onWarmupCompleted = i19 % 128;
                int i20 = i19 % 2;
            } else {
                cipherCreateCipher.init(i10, key, rC2ParameterSpec);
            }
            return cipherCreateCipher.doFinal(bArr);
        } catch (Exception e) {
            throw new EncryptionException("exception using cipher - please check password and data.", e);
        }
    }

    public static SecretKey generateSecretKeyForPKCS5Scheme2(JcaJceHelper jcaJceHelper, String str, char[] cArr, byte[] bArr, int i) throws InvalidKeySpecException, NoSuchAlgorithmException, NoSuchProviderException {
        int i2 = 2 % 2;
        SecretKeySpec secretKeySpec = new SecretKeySpec(jcaJceHelper.createSecretKeyFactory("PBKDF2with8BIT").generateSecret(new PBEKeySpec(cArr, bArr, i, getKeySize(str))).getEncoded(), str);
        int i3 = IAuthTabCallback + 71;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return secretKeySpec;
    }

    public static SecretKey generateSecretKeyForPKCS5Scheme2(JcaJceHelper jcaJceHelper, String str, char[] cArr, byte[] bArr, int i, AlgorithmIdentifier algorithmIdentifier) throws InvalidKeySpecException, NoSuchAlgorithmException, NoSuchProviderException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 31;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str2 = (String) PRFS.get(algorithmIdentifier.getAlgorithm());
        if (str2 == null) {
            throw new NoSuchAlgorithmException("unknown PRF in PKCS#2: " + algorithmIdentifier.getAlgorithm());
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(jcaJceHelper.createSecretKeyFactory(str2).generateSecret(new PBEKeySpec(cArr, bArr, i, getKeySize(str))).getEncoded(), str);
        int i5 = onWarmupCompleted + 7;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return secretKeySpec;
    }

    private static SecretKey getKey(JcaJceHelper jcaJceHelper, char[] cArr, String str, int i, byte[] bArr) throws PEMException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 11;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SecretKey key = getKey(jcaJceHelper, cArr, str, i, bArr, false);
        int i5 = onWarmupCompleted + 19;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return key;
    }

    private static SecretKey getKey(JcaJceHelper jcaJceHelper, char[] cArr, String str, int i, byte[] bArr, boolean z) throws PEMException {
        int i2 = 2 % 2;
        try {
            byte[] encoded = jcaJceHelper.createSecretKeyFactory("PBKDF-OpenSSL").generateSecret(new PBEKeySpec(cArr, bArr, 1, i << 3)).getEncoded();
            if (z) {
                int i3 = IAuthTabCallback;
                int i4 = i3 + 33;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                if (encoded.length >= 24) {
                    int i6 = i3 + 105;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 != 0) {
                        System.arraycopy(encoded, 0, encoded, 21, 114);
                    } else {
                        System.arraycopy(encoded, 0, encoded, 16, 8);
                    }
                }
            }
            return new SecretKeySpec(encoded, str);
        } catch (GeneralSecurityException e) {
            throw new PEMException("Unable to create OpenSSL PBDKF: " + e.getMessage(), e);
        }
    }

    static int getKeySize(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Map map = KEYSIZES;
        if (!map.containsKey(str)) {
            throw new IllegalStateException("no key size for algorithm: " + str);
        }
        int iIntValue = ((Integer) map.get(str)).intValue();
        int i4 = IAuthTabCallback + 81;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return iIntValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static int getSaltSize(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Map map = PRFS_SALT;
        if (!map.containsKey(aSN1ObjectIdentifier)) {
            throw new IllegalStateException("no salt size for algorithm: " + aSN1ObjectIdentifier);
        }
        int iIntValue = ((Integer) map.get(aSN1ObjectIdentifier)).intValue();
        int i4 = onWarmupCompleted + 109;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    static boolean isHmacSHA1(AlgorithmIdentifier algorithmIdentifier) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (algorithmIdentifier != null) {
            int i4 = i3 + 103;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (!algorithmIdentifier.getAlgorithm().equals(PKCSObjectIdentifiers.id_hmacWithSHA1)) {
                int i6 = IAuthTabCallback + 125;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
        }
        int i8 = onWarmupCompleted + 25;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public static boolean isPKCS12(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zStartsWith = aSN1ObjectIdentifier.getId().startsWith(PKCSObjectIdentifiers.pkcs_12PbeIds.getId());
        int i4 = onWarmupCompleted + 125;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zStartsWith;
    }

    static boolean isPKCS5Scheme1(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Set set = PKCS5_SCHEME_1;
        if (i3 == 0) {
            return set.contains(aSN1ObjectIdentifier);
        }
        set.contains(aSN1ObjectIdentifier);
        throw null;
    }

    static boolean isPKCS5Scheme2(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zContains = PKCS5_SCHEME_2.contains(aSN1ObjectIdentifier);
        int i4 = onWarmupCompleted + 75;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zContains;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallbackWithResult;
        int i3 = -1469660336;
        int i4 = 16;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 75;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> i4), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 72, TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    i3 = -1469660336;
                    i4 = 16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallbackWithResult;
        if (iArr5 != null) {
            int i9 = $11;
            int i10 = i9 + 89;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = i9 + 87;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 0;
            while (i14 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i5] = Integer.valueOf(iArr5[i14]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(i5), 72 - View.getDefaultSize(i5, i5), MotionEvent.axisFromString(BuildConfig.FLAVOR) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i14] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i14++;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        int i15 = i5;
        System.arraycopy(iArr5, i15, iArr4, i15, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i15;
        int i16 = $10 + 105;
        $11 = i16 % 128;
        int i17 = i16 % 2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i18 = 0;
            for (int i19 = 16; i18 < i19; i19 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i18];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22252), 39 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), View.combineMeasuredStates(0, 0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i18++;
            }
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i20;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i22 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 4034), 78 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = new int[]{-2107730208, 886316800, -617395890, -1078428075, 88875425, 1267733101, 1896031908, 1315878020, 1922946747, -1952176341, 310068918, -1302235517, 156311472, 712981139, -2108173945, 597095691, -1019741032, -1141851950};
    }
}
