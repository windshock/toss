package org.bouncycastle.openssl.bc;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.engines.BlowfishEngine;
import org.bouncycastle.crypto.engines.DESEngine;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.engines.RC2Engine;
import org.bouncycastle.crypto.generators.OpenSSLPBEParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.crypto.paddings.BlockCipherPadding;
import org.bouncycastle.crypto.paddings.PKCS7Padding;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.RC2Parameters;
import org.bouncycastle.openssl.EncryptionException;
import org.bouncycastle.openssl.PEMException;
import org.bouncycastle.util.Integers;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class PEMUtilities {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static final Map KEYSIZES;
    private static final Set PKCS5_SCHEME_1;
    private static final Set PKCS5_SCHEME_2;
    private static int onExtraCallback = 1;
    private static long onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        onExtraCallback();
        HashMap map = new HashMap();
        KEYSIZES = map;
        HashSet hashSet = new HashSet();
        PKCS5_SCHEME_1 = hashSet;
        HashSet hashSet2 = new HashSet();
        PKCS5_SCHEME_2 = hashSet2;
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
        int i = IAuthTabCallback + 97;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    PEMUtilities() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021f A[Catch: Exception -> 0x0263, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0263, blocks: (B:72:0x021f, B:77:0x0237, B:79:0x0243, B:82:0x025d, B:78:0x023b, B:74:0x022f), top: B:89:0x021d }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022f A[Catch: Exception -> 0x0263, TRY_ENTER, TryCatch #0 {Exception -> 0x0263, blocks: (B:72:0x021f, B:77:0x0237, B:79:0x0243, B:82:0x025d, B:78:0x023b, B:74:0x022f), top: B:89:0x021d }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0237 A[Catch: Exception -> 0x0263, TryCatch #0 {Exception -> 0x0263, blocks: (B:72:0x021f, B:77:0x0237, B:79:0x0243, B:82:0x025d, B:78:0x023b, B:74:0x022f), top: B:89:0x021d }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x023b A[Catch: Exception -> 0x0263, TryCatch #0 {Exception -> 0x0263, blocks: (B:72:0x021f, B:77:0x0237, B:79:0x0243, B:82:0x025d, B:78:0x023b, B:74:0x022f), top: B:89:0x021d }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x025d A[Catch: Exception -> 0x0263, TRY_LEAVE, TryCatch #0 {Exception -> 0x0263, blocks: (B:72:0x021f, B:77:0x0237, B:79:0x0243, B:82:0x025d, B:78:0x023b, B:74:0x022f), top: B:89:0x021d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static byte[] crypt(boolean z, byte[] bArr, char[] cArr, String str, byte[] bArr2) throws Throwable {
        String str2;
        byte[] bArr3;
        KeyParameter key;
        CBCBlockCipher aESEngine;
        CBCBlockCipher oFBBlockCipher;
        BufferedBlockCipher paddedBufferedBlockCipher;
        int outputSize;
        int iDoFinal;
        byte[] bArr4 = bArr2;
        int i = 2 % 2;
        BlockCipherPadding pKCS7Padding = new PKCS7Padding();
        if (!str.endsWith("-CFB")) {
            str2 = "CBC";
        } else {
            str2 = "CFB";
            pKCS7Padding = null;
        }
        if (!str.endsWith("-ECB")) {
            int i2 = onWarmupCompleted + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if ("DES-EDE".equals(str) || "DES-EDE3".equals(str)) {
                str2 = "ECB";
                bArr3 = null;
            } else {
                bArr3 = bArr4;
            }
        }
        if (str.endsWith("-OFB")) {
            str2 = "OFB";
            pKCS7Padding = null;
        }
        if (str.startsWith("DES-EDE")) {
            key = getKey(cArr, 24, bArr4, !str.startsWith("DES-EDE3"));
            aESEngine = new DESedeEngine();
        } else if (str.startsWith("DES-")) {
            key = getKey(cArr, 8, bArr4);
            aESEngine = new DESEngine();
        } else if (str.startsWith("BF-")) {
            key = getKey(cArr, 16, bArr4);
            aESEngine = new BlowfishEngine();
        } else {
            int i4 = 128;
            if (str.startsWith("RC2-")) {
                int i5 = onWarmupCompleted + 113;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                if (str.startsWith("RC2-40-")) {
                    int i7 = onWarmupCompleted + 89;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    i4 = 40;
                } else if (str.startsWith("RC2-64-")) {
                    int i9 = onNavigationEvent + 47;
                    onWarmupCompleted = i9 % 128;
                    i4 = i9 % 2 != 0 ? 35 : 64;
                }
                int i10 = i4;
                RC2Parameters rC2Parameters = new RC2Parameters(getKey(cArr, i10 / 8, bArr4).getKey(), i10);
                aESEngine = new RC2Engine();
                key = rC2Parameters;
            } else {
                a(new char[]{43506, 43443, 12917, 42021, 60163, 51066, 31104, 48018}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new Object[1]);
                if (!str.startsWith(((String) r5[0]).intern())) {
                    throw new EncryptionException("unknown encryption with private key: " + str);
                }
                int i11 = onNavigationEvent + 1;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                if (bArr4.length > 8) {
                    byte[] bArr5 = new byte[8];
                    System.arraycopy(bArr4, 0, bArr5, 0, 8);
                    bArr4 = bArr5;
                }
                Object[] objArr = new Object[1];
                a(new char[]{50031, 49966, 44250, 14986, 43024, 33897, 25731, 39690, 17025, 42641, 11350, 48175}, '1' - AndroidCharacter.getMirror('0'), objArr);
                if (!str.startsWith(((String) objArr[0]).intern())) {
                    int i13 = onNavigationEvent + 87;
                    onWarmupCompleted = i13 % 128;
                    if (i13 % 2 != 0) {
                        Object[] objArr2 = new Object[1];
                        a(new char[]{8374, 8439, 25136, 62560, 23679, 28678, 58887, 30931, 35936, 9237, 55347, 16043}, 1 << (ExpandableListView.getPackedPositionForGroup(1) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 0L ? 0 : -1)), objArr2);
                        if (str.startsWith(((String) objArr2[0]).intern())) {
                            i4 = CertificateHolderAuthorization.CVCA;
                        } else {
                            Object[] objArr3 = new Object[1];
                            a(new char[]{27940, 28005, 13798, 41910, 25372, 20325, 50089, 13634, 56250, 443, 59220, 6917}, Color.argb(0, 0, 0, 0) + 1, objArr3);
                            if (!str.startsWith(((String) objArr3[0]).intern())) {
                                throw new EncryptionException("unknown AES encryption with private key: " + str);
                            }
                            i4 = 256;
                        }
                    } else {
                        Object[] objArr4 = new Object[1];
                        a(new char[]{8374, 8439, 25136, 62560, 23679, 28678, 58887, 30931, 35936, 9237, 55347, 16043}, 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr4);
                        if (!str.startsWith(((String) objArr4[0]).intern())) {
                        }
                    }
                }
                key = getKey(cArr, i4 / 8, bArr4);
                aESEngine = new AESEngine();
            }
        }
        try {
            if (str2.equals("CBC")) {
                oFBBlockCipher = new CBCBlockCipher(aESEngine);
            } else {
                if (!str2.equals("CFB")) {
                    if (str2.equals("OFB")) {
                        oFBBlockCipher = new OFBBlockCipher(aESEngine, aESEngine.getBlockSize() << 3);
                        int i14 = onWarmupCompleted + 103;
                        onNavigationEvent = i14 % 128;
                        int i15 = i14 % 2;
                    }
                    if (pKCS7Padding != null) {
                        paddedBufferedBlockCipher = new BufferedBlockCipher(aESEngine);
                        int i16 = onNavigationEvent + 105;
                        onWarmupCompleted = i16 % 128;
                        int i17 = i16 % 2;
                    } else {
                        paddedBufferedBlockCipher = new PaddedBufferedBlockCipher(aESEngine, pKCS7Padding);
                    }
                    BufferedBlockCipher bufferedBlockCipher = paddedBufferedBlockCipher;
                    if (bArr3 != null) {
                        bufferedBlockCipher.init(z, key);
                    } else {
                        bufferedBlockCipher.init(z, new ParametersWithIV(key, bArr3));
                    }
                    outputSize = bufferedBlockCipher.getOutputSize(bArr.length);
                    byte[] bArr6 = new byte[outputSize];
                    int iProcessBytes = bufferedBlockCipher.processBytes(bArr, 0, bArr.length, bArr6, 0);
                    iDoFinal = iProcessBytes + bufferedBlockCipher.doFinal(bArr6, iProcessBytes);
                    if (iDoFinal != outputSize) {
                        return bArr6;
                    }
                    byte[] bArr7 = new byte[iDoFinal];
                    System.arraycopy(bArr6, 0, bArr7, 0, iDoFinal);
                    return bArr7;
                }
                oFBBlockCipher = new CFBBlockCipher(aESEngine, aESEngine.getBlockSize() << 3);
            }
            if (pKCS7Padding != null) {
            }
            BufferedBlockCipher bufferedBlockCipher2 = paddedBufferedBlockCipher;
            if (bArr3 != null) {
            }
            outputSize = bufferedBlockCipher2.getOutputSize(bArr.length);
            byte[] bArr62 = new byte[outputSize];
            int iProcessBytes2 = bufferedBlockCipher2.processBytes(bArr, 0, bArr.length, bArr62, 0);
            iDoFinal = iProcessBytes2 + bufferedBlockCipher2.doFinal(bArr62, iProcessBytes2);
            if (iDoFinal != outputSize) {
            }
        } catch (Exception e) {
            throw new EncryptionException("exception using cipher - please check password and data.", e);
        }
        aESEngine = oFBBlockCipher;
    }

    public static KeyParameter generateSecretKeyForPKCS5Scheme2(String str, char[] cArr, byte[] bArr, int i) {
        int i2 = 2 % 2;
        PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator = new PKCS5S2ParametersGenerator(new SHA1Digest());
        pKCS5S2ParametersGenerator.init(PBEParametersGenerator.PKCS5PasswordToBytes(cArr), bArr, i);
        KeyParameter keyParameter = (KeyParameter) pKCS5S2ParametersGenerator.generateDerivedParameters(getKeySize(str));
        int i3 = onWarmupCompleted + 105;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 20 / 0;
        }
        return keyParameter;
    }

    private static KeyParameter getKey(char[] cArr, int i, byte[] bArr) throws PEMException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 41;
        onNavigationEvent = i3 % 128;
        return getKey(cArr, i, bArr, i3 % 2 == 0);
    }

    private static KeyParameter getKey(char[] cArr, int i, byte[] bArr, boolean z) throws PEMException {
        int i2 = 2 % 2;
        OpenSSLPBEParametersGenerator openSSLPBEParametersGenerator = new OpenSSLPBEParametersGenerator();
        openSSLPBEParametersGenerator.init(PBEParametersGenerator.PKCS5PasswordToBytes(cArr), bArr, 1);
        KeyParameter keyParameter = (KeyParameter) openSSLPBEParametersGenerator.generateDerivedParameters(i << 3);
        if (!(!z)) {
            int i3 = onWarmupCompleted + 67;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (keyParameter.getKey().length == 24) {
                byte[] key = keyParameter.getKey();
                System.arraycopy(key, 0, key, 16, 8);
                return new KeyParameter(key);
            }
        }
        int i5 = onNavigationEvent + 57;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return keyParameter;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        throw new java.lang.IllegalStateException("no key size for algorithm: " + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r1.containsKey(r4) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r1.containsKey(r4) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r4 = ((java.lang.Integer) r1.get(r4)).intValue();
        r1 = org.bouncycastle.openssl.bc.PEMUtilities.onWarmupCompleted + 87;
        org.bouncycastle.openssl.bc.PEMUtilities.onNavigationEvent = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int getKeySize(String str) {
        Map map;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            map = KEYSIZES;
            int i3 = 37 / 0;
        } else {
            map = KEYSIZES;
        }
    }

    public static boolean isPKCS12(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String id = aSN1ObjectIdentifier.getId();
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.pkcs_12PbeIds;
        if (i3 != 0) {
            return id.startsWith(aSN1ObjectIdentifier2.getId());
        }
        id.startsWith(aSN1ObjectIdentifier2.getId());
        throw null;
    }

    static boolean isPKCS5Scheme1(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Set set = PKCS5_SCHEME_1;
        if (i3 == 0) {
            return set.contains(aSN1ObjectIdentifier);
        }
        set.contains(aSN1ObjectIdentifier);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static boolean isPKCS5Scheme2(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        boolean zContains;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            zContains = PKCS5_SCHEME_2.contains(aSN1ObjectIdentifier);
            int i3 = 6 / 0;
        } else {
            zContains = PKCS5_SCHEME_2.contains(aSN1ObjectIdentifier);
        }
        int i4 = onWarmupCompleted + 103;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zContains;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 63;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - View.MeasureSpec.makeMeasureSpec(0, 0)), 84 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 21234 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 14185), 19 - View.resolveSizeAndState(0, 0, 0), 8808 - (ViewConfiguration.getJumpTapTimeout() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $10 + 111;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = 8625481403090267417L;
    }
}
