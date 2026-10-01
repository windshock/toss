package org.bouncycastle.jcajce.provider.asymmetric.util;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;
import org.bouncycastle.asn1.gnu.GNUObjectIdentifiers;
import org.bouncycastle.asn1.kisa.KISAObjectIdentifiers;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.agreement.kdf.DHKDFParameters;
import org.bouncycastle.crypto.agreement.kdf.DHKEKGenerator;
import org.bouncycastle.crypto.params.DESParameters;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Strings;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class BaseAgreementSpi extends KeyAgreementSpi {
    private static int $10 = 0;
    private static int $11 = 1;
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static final Map<String, ASN1ObjectIdentifier> defaultOids;
    private static final Hashtable des;
    private static final Map<String, Integer> keySizes;
    private static final Map<String, String> nameTable;
    private static final Hashtable oids;
    private static int onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static boolean onNavigationEvent = false;
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    public final String kaAlgorithm;
    public final DerivationFunction kdf;
    public byte[] ukmParameters;

    static {
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{ISOFileInfo.FILE_IDENTIFIER, -126, ISOFileInfo.DATA_BYTES2}, 127 - (Process.myTid() >> 22), objArr);
        String strIntern = ((String) objArr[0]).intern();
        HashMap map = new HashMap();
        defaultOids = map;
        HashMap map2 = new HashMap();
        keySizes = map2;
        HashMap map3 = new HashMap();
        nameTable = map3;
        Hashtable hashtable = new Hashtable();
        oids = hashtable;
        Hashtable hashtable2 = new Hashtable();
        des = hashtable2;
        Integer numValueOf = Integers.valueOf(64);
        Integer numValueOf2 = Integers.valueOf(128);
        Integer numValueOf3 = Integers.valueOf(CertificateHolderAuthorization.CVCA);
        Integer numValueOf4 = Integers.valueOf(256);
        map2.put("DES", numValueOf);
        map2.put("DESEDE", numValueOf3);
        map2.put("BLOWFISH", numValueOf2);
        map2.put(strIntern, numValueOf4);
        map2.put(NISTObjectIdentifiers.id_aes128_ECB.getId(), numValueOf2);
        map2.put(NISTObjectIdentifiers.id_aes192_ECB.getId(), numValueOf3);
        map2.put(NISTObjectIdentifiers.id_aes256_ECB.getId(), numValueOf4);
        map2.put(NISTObjectIdentifiers.id_aes128_CBC.getId(), numValueOf2);
        map2.put(NISTObjectIdentifiers.id_aes192_CBC.getId(), numValueOf3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_aes256_CBC;
        map2.put(aSN1ObjectIdentifier.getId(), numValueOf4);
        map2.put(NISTObjectIdentifiers.id_aes128_CFB.getId(), numValueOf2);
        map2.put(NISTObjectIdentifiers.id_aes192_CFB.getId(), numValueOf3);
        map2.put(NISTObjectIdentifiers.id_aes256_CFB.getId(), numValueOf4);
        map2.put(NISTObjectIdentifiers.id_aes128_OFB.getId(), numValueOf2);
        map2.put(NISTObjectIdentifiers.id_aes192_OFB.getId(), numValueOf3);
        map2.put(NISTObjectIdentifiers.id_aes256_OFB.getId(), numValueOf4);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes128_wrap;
        map2.put(aSN1ObjectIdentifier2.getId(), numValueOf2);
        map2.put(NISTObjectIdentifiers.id_aes192_wrap.getId(), numValueOf3);
        map2.put(NISTObjectIdentifiers.id_aes256_wrap.getId(), numValueOf4);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_aes128_CCM;
        map2.put(aSN1ObjectIdentifier3.getId(), numValueOf2);
        map2.put(NISTObjectIdentifiers.id_aes192_CCM.getId(), numValueOf3);
        map2.put(NISTObjectIdentifiers.id_aes256_CCM.getId(), numValueOf4);
        map2.put(NISTObjectIdentifiers.id_aes128_GCM.getId(), numValueOf2);
        map2.put(NISTObjectIdentifiers.id_aes192_GCM.getId(), numValueOf3);
        map2.put(NISTObjectIdentifiers.id_aes256_GCM.getId(), numValueOf4);
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NTTObjectIdentifiers.id_camellia128_wrap;
        map2.put(aSN1ObjectIdentifier4.getId(), numValueOf2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NTTObjectIdentifiers.id_camellia192_wrap;
        map2.put(aSN1ObjectIdentifier5.getId(), numValueOf3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NTTObjectIdentifiers.id_camellia256_wrap;
        map2.put(aSN1ObjectIdentifier6.getId(), numValueOf4);
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap;
        map2.put(aSN1ObjectIdentifier7.getId(), numValueOf2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = PKCSObjectIdentifiers.id_alg_CMS3DESwrap;
        map2.put(aSN1ObjectIdentifier8.getId(), numValueOf3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = PKCSObjectIdentifiers.des_EDE3_CBC;
        map2.put(aSN1ObjectIdentifier9.getId(), numValueOf3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = OIWObjectIdentifiers.desCBC;
        map2.put(aSN1ObjectIdentifier10.getId(), numValueOf);
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = CryptoProObjectIdentifiers.gostR28147_gcfb;
        map2.put(aSN1ObjectIdentifier11.getId(), numValueOf4);
        map2.put(CryptoProObjectIdentifiers.id_Gost28147_89_None_KeyWrap.getId(), numValueOf4);
        map2.put(CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_KeyWrap.getId(), numValueOf4);
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = PKCSObjectIdentifiers.id_hmacWithSHA1;
        map2.put(aSN1ObjectIdentifier12.getId(), Integers.valueOf(160));
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = PKCSObjectIdentifiers.id_hmacWithSHA256;
        map2.put(aSN1ObjectIdentifier13.getId(), numValueOf4);
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = PKCSObjectIdentifiers.id_hmacWithSHA384;
        map2.put(aSN1ObjectIdentifier14.getId(), Integers.valueOf(384));
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = PKCSObjectIdentifiers.id_hmacWithSHA512;
        map2.put(aSN1ObjectIdentifier15.getId(), Integers.valueOf(512));
        map.put("DESEDE", aSN1ObjectIdentifier9);
        map.put(strIntern, aSN1ObjectIdentifier);
        ASN1ObjectIdentifier aSN1ObjectIdentifier16 = NTTObjectIdentifiers.id_camellia256_cbc;
        map.put("CAMELLIA", aSN1ObjectIdentifier16);
        ASN1ObjectIdentifier aSN1ObjectIdentifier17 = KISAObjectIdentifiers.id_seedCBC;
        map.put("SEED", aSN1ObjectIdentifier17);
        map.put("DES", aSN1ObjectIdentifier10);
        map3.put(MiscObjectIdentifiers.cast5CBC.getId(), "CAST5");
        map3.put(MiscObjectIdentifiers.as_sys_sec_alg_ideaCBC.getId(), "IDEA");
        map3.put(MiscObjectIdentifiers.cryptlib_algorithm_blowfish_ECB.getId(), "Blowfish");
        map3.put(MiscObjectIdentifiers.cryptlib_algorithm_blowfish_CBC.getId(), "Blowfish");
        map3.put(MiscObjectIdentifiers.cryptlib_algorithm_blowfish_CFB.getId(), "Blowfish");
        map3.put(MiscObjectIdentifiers.cryptlib_algorithm_blowfish_OFB.getId(), "Blowfish");
        map3.put(OIWObjectIdentifiers.desECB.getId(), "DES");
        map3.put(aSN1ObjectIdentifier10.getId(), "DES");
        map3.put(OIWObjectIdentifiers.desCFB.getId(), "DES");
        map3.put(OIWObjectIdentifiers.desOFB.getId(), "DES");
        map3.put(OIWObjectIdentifiers.desEDE.getId(), "DESede");
        map3.put(aSN1ObjectIdentifier9.getId(), "DESede");
        map3.put(aSN1ObjectIdentifier8.getId(), "DESede");
        map3.put(PKCSObjectIdentifiers.id_alg_CMSRC2wrap.getId(), "RC2");
        map3.put(aSN1ObjectIdentifier12.getId(), "HmacSHA1");
        map3.put(PKCSObjectIdentifiers.id_hmacWithSHA224.getId(), "HmacSHA224");
        map3.put(aSN1ObjectIdentifier13.getId(), "HmacSHA256");
        map3.put(aSN1ObjectIdentifier14.getId(), "HmacSHA384");
        map3.put(aSN1ObjectIdentifier15.getId(), "HmacSHA512");
        map3.put(NTTObjectIdentifiers.id_camellia128_cbc.getId(), "Camellia");
        map3.put(NTTObjectIdentifiers.id_camellia192_cbc.getId(), "Camellia");
        map3.put(aSN1ObjectIdentifier16.getId(), "Camellia");
        map3.put(aSN1ObjectIdentifier4.getId(), "Camellia");
        map3.put(aSN1ObjectIdentifier5.getId(), "Camellia");
        map3.put(aSN1ObjectIdentifier6.getId(), "Camellia");
        map3.put(aSN1ObjectIdentifier7.getId(), "SEED");
        map3.put(aSN1ObjectIdentifier17.getId(), "SEED");
        map3.put(KISAObjectIdentifiers.id_seedMAC.getId(), "SEED");
        map3.put(aSN1ObjectIdentifier11.getId(), "GOST28147");
        map3.put(aSN1ObjectIdentifier2.getId(), strIntern);
        map3.put(aSN1ObjectIdentifier3.getId(), strIntern);
        map3.put(aSN1ObjectIdentifier3.getId(), strIntern);
        hashtable.put("DESEDE", aSN1ObjectIdentifier9);
        hashtable.put(strIntern, aSN1ObjectIdentifier);
        hashtable.put("DES", aSN1ObjectIdentifier10);
        hashtable2.put("DES", "DES");
        hashtable2.put("DESEDE", "DES");
        hashtable2.put(aSN1ObjectIdentifier10.getId(), "DES");
        hashtable2.put(aSN1ObjectIdentifier9.getId(), "DES");
        hashtable2.put(aSN1ObjectIdentifier8.getId(), "DES");
        int i = onWarmupCompleted + 1;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public BaseAgreementSpi(String str, DerivationFunction derivationFunction) {
        this.kaAlgorithm = str;
        this.kdf = derivationFunction;
    }

    protected static String getAlgorithm(String str) throws Throwable {
        int i = 2 % 2;
        if (str.indexOf(91) > 0) {
            int i2 = onTransact + 13;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return str.substring(0, str.indexOf(91));
        }
        if (!str.startsWith(NISTObjectIdentifiers.aes.getId())) {
            if (!str.startsWith(GNUObjectIdentifiers.Serpent.getId())) {
                String str2 = nameTable.get(Strings.toUpperCase(str));
                return str2 != null ? str2 : str;
            }
            int i4 = IAuthTabCallbackDefault + 27;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return "Serpent";
        }
        int i6 = onTransact + 31;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{ISOFileInfo.FILE_IDENTIFIER, -126, ISOFileInfo.DATA_BYTES2}, 10621 - ImageFormat.getBitsPerPixel(0), objArr);
            return ((String) objArr[0]).intern();
        }
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{ISOFileInfo.FILE_IDENTIFIER, -126, ISOFileInfo.DATA_BYTES2}, ImageFormat.getBitsPerPixel(0) + 128, objArr2);
        return ((String) objArr2[0]).intern();
    }

    protected static int getKeySize(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        onTransact = i2 % 128;
        if (i2 % 2 != 0 ? str.indexOf(91) > 0 : str.indexOf(20) > 0) {
            return Integer.parseInt(str.substring(str.indexOf(91) + 1, str.indexOf(93)));
        }
        String upperCase = Strings.toUpperCase(str);
        Map<String, Integer> map = keySizes;
        if (!map.containsKey(upperCase)) {
            return -1;
        }
        int iIntValue = map.get(upperCase).intValue();
        int i3 = onTransact + 87;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 45 / 0;
        }
        return iIntValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f A[PHI: r1 r4
      0x002f: PHI (r1v5 int) = (r1v4 int), (r1v8 int) binds: [B:13:0x002d, B:10:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x002f: PHI (r4v2 byte[]) = (r4v1 byte[]), (r4v5 byte[]) binds: [B:13:0x002d, B:10:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[PHI: r1 r4
      0x005d: PHI (r1v7 int) = (r1v4 int), (r1v8 int) binds: [B:13:0x002d, B:10:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r4v4 byte[]) = (r4v1 byte[]), (r4v5 byte[]) binds: [B:13:0x002d, B:10:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private byte[] getSharedSecretBytes(byte[] bArr, String str, int i) throws DataLengthException, NoSuchAlgorithmException, IllegalArgumentException {
        int i2;
        byte[] bArr2;
        DerivationParameters dHKDFParameters;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault;
        int i5 = i4 + 7;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DerivationFunction derivationFunction = this.kdf;
        if (derivationFunction == null) {
            if (i <= 0) {
                return bArr;
            }
            int i6 = i / 8;
            byte[] bArr3 = new byte[i6];
            System.arraycopy(bArr, 0, bArr3, 0, i6);
            Arrays.clear(bArr);
            return bArr3;
        }
        if (i < 0) {
            throw new NoSuchAlgorithmException("unknown algorithm encountered: " + str);
        }
        int i7 = i4 + 55;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            i2 = i % 120;
            bArr2 = new byte[i2];
            if (!(derivationFunction instanceof DHKEKGenerator)) {
                dHKDFParameters = new KDFParameters(bArr, this.ukmParameters);
            } else {
                if (str == null) {
                    throw new NoSuchAlgorithmException("algorithm OID is null");
                }
                try {
                    dHKDFParameters = new DHKDFParameters(new ASN1ObjectIdentifier(str), i, bArr, this.ukmParameters);
                } catch (IllegalArgumentException unused) {
                    throw new NoSuchAlgorithmException("no OID for algorithm: " + str);
                }
            }
        } else {
            i2 = i / 8;
            bArr2 = new byte[i2];
            if (derivationFunction instanceof DHKEKGenerator) {
            }
        }
        this.kdf.init(dHKDFParameters);
        int i8 = IAuthTabCallbackDefault + 51;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
        this.kdf.generateBytes(bArr2, 0, i2);
        Arrays.clear(bArr);
        return bArr2;
    }

    public static byte[] trimZeroes(byte[] bArr) {
        int i = 2 % 2;
        if (bArr[0] != 0) {
            return bArr;
        }
        int i2 = 0;
        while (i2 < bArr.length) {
            int i3 = IAuthTabCallbackDefault;
            int i4 = i3 + 13;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                byte b = bArr[i2];
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (bArr[i2] != 0) {
                break;
            }
            i2++;
            int i5 = i3 + 75;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }
        int length = bArr.length - i2;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, i2, bArr2, 0, length);
        int i7 = IAuthTabCallbackDefault + 1;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return bArr2;
    }

    protected abstract byte[] calcSecret();

    @Override // javax.crypto.KeyAgreementSpi
    public int engineGenerateSecret(byte[] bArr, int i) throws IllegalStateException, DataLengthException, IllegalArgumentException, ShortBufferException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 17;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArrEngineGenerateSecret = engineGenerateSecret();
        if (bArr.length - i >= bArrEngineGenerateSecret.length) {
            System.arraycopy(bArrEngineGenerateSecret, 0, bArr, i, bArrEngineGenerateSecret.length);
            int length = bArrEngineGenerateSecret.length;
            int i5 = onTransact + 97;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return length;
        }
        throw new ShortBufferException(this.kaAlgorithm + " key agreement: need " + bArrEngineGenerateSecret.length + " bytes");
    }

    @Override // javax.crypto.KeyAgreementSpi
    public SecretKey engineGenerateSecret(String str) throws Throwable {
        String id;
        int i = 2 % 2;
        String upperCase = Strings.toUpperCase(str);
        Hashtable hashtable = oids;
        if (!hashtable.containsKey(upperCase)) {
            id = str;
        } else {
            int i2 = onTransact + 85;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                ((ASN1ObjectIdentifier) hashtable.get(upperCase)).getId();
                throw null;
            }
            id = ((ASN1ObjectIdentifier) hashtable.get(upperCase)).getId();
        }
        byte[] sharedSecretBytes = getSharedSecretBytes(calcSecret(), id, getKeySize(id));
        String algorithm = getAlgorithm(str);
        if (des.containsKey(algorithm)) {
            int i3 = IAuthTabCallbackDefault + 45;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            DESParameters.setOddParity(sharedSecretBytes);
            if (i4 == 0) {
                throw null;
            }
            int i5 = onTransact + 39;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
        }
        return new SecretKeySpec(sharedSecretBytes, algorithm);
    }

    @Override // javax.crypto.KeyAgreementSpi
    public byte[] engineGenerateSecret() throws IllegalStateException, DataLengthException, IllegalArgumentException {
        byte[] sharedSecretBytes;
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 45;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (this.kdf == null) {
            return calcSecret();
        }
        int i5 = i2 + 23;
        IAuthTabCallbackDefault = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                byte[] bArrCalcSecret = calcSecret();
                sharedSecretBytes = getSharedSecretBytes(bArrCalcSecret, null, bArrCalcSecret.length % 2);
            } else {
                byte[] bArrCalcSecret2 = calcSecret();
                sharedSecretBytes = getSharedSecretBytes(bArrCalcSecret2, null, bArrCalcSecret2.length << 3);
            }
            return sharedSecretBytes;
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallbackWithResult;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 125;
                $10 = i5 % 128;
                int i6 = i5 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(BuildConfig.FLAVOR), Color.red(0) + 77, View.combineMeasuredStates(0, 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 75, TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i7 = 1052772399;
            if (!(!onNavigationEvent)) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 63 - View.MeasureSpec.getMode(0), 12214 - (ViewConfiguration.getScrollBarSize() >> 8), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!IAuthTabCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                    int i8 = $11 + 39;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i10 = $10 + 7;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i12 = $10 + 101;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i7);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), KeyEvent.normalizeMetaState(0) + 63, Drawable.resolveOpacity(0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                i7 = 1052772399;
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = new char[]{32724, 32712, 32762};
        onExtraCallback = -1184333931;
        IAuthTabCallback = true;
        onNavigationEvent = true;
    }
}
