package org.bouncycastle.cms.bc;

import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSAlgorithm;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.engines.DESEngine;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.engines.RC2Engine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.util.AlgorithmIdentifierFactory;
import org.bouncycastle.crypto.util.CipherFactory;
import org.bouncycastle.crypto.util.CipherKeyGeneratorFactory;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.bc.BcDigestProvider;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class EnvelopedDataHelper {
    private static int $10 = 0;
    private static int $11 = 1;
    protected static final Map BASE_CIPHER_NAMES;
    private static int IAuthTabCallback = 0;
    protected static final Map MAC_ALG_NAMES;
    private static final Set authEnvelopedAlgorithms;
    private static int onExtraCallback = 1;
    private static int[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private static final Map prfs;

    static {
        IAuthTabCallback();
        HashMap map = new HashMap();
        BASE_CIPHER_NAMES = map;
        HashMap map2 = new HashMap();
        MAC_ALG_NAMES = map2;
        HashSet hashSet = new HashSet();
        authEnvelopedAlgorithms = hashSet;
        prfs = createTable();
        ASN1ObjectIdentifier aSN1ObjectIdentifier = CMSAlgorithm.DES_EDE3_CBC;
        map.put(aSN1ObjectIdentifier, "DESEDE");
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = CMSAlgorithm.AES128_CBC;
        Object[] objArr = new Object[1];
        a(new int[]{-2014731618, 693337783}, TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 3, objArr);
        map.put(aSN1ObjectIdentifier2, ((String) objArr[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = CMSAlgorithm.AES192_CBC;
        Object[] objArr2 = new Object[1];
        a(new int[]{-2014731618, 693337783}, 3 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
        map.put(aSN1ObjectIdentifier3, ((String) objArr2[0]).intern());
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = CMSAlgorithm.AES256_CBC;
        Object[] objArr3 = new Object[1];
        a(new int[]{-2014731618, 693337783}, 3 - (Process.myTid() >> 22), objArr3);
        map.put(aSN1ObjectIdentifier4, ((String) objArr3[0]).intern());
        map2.put(aSN1ObjectIdentifier, "DESEDEMac");
        Object[] objArr4 = new Object[1];
        a(new int[]{-1738819554, -1663273012, -2073688901, 104488759}, '6' - AndroidCharacter.getMirror('0'), objArr4);
        map2.put(aSN1ObjectIdentifier2, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        a(new int[]{-1738819554, -1663273012, -2073688901, 104488759}, (ViewConfiguration.getPressedStateDuration() >> 16) + 6, objArr5);
        map2.put(aSN1ObjectIdentifier3, ((String) objArr5[0]).intern());
        Object[] objArr6 = new Object[1];
        a(new int[]{-1738819554, -1663273012, -2073688901, 104488759}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6, objArr6);
        map2.put(aSN1ObjectIdentifier4, ((String) objArr6[0]).intern());
        map2.put(CMSAlgorithm.RC2_CBC, "RC2Mac");
        hashSet.add(NISTObjectIdentifiers.id_aes128_GCM);
        hashSet.add(NISTObjectIdentifiers.id_aes192_GCM);
        hashSet.add(NISTObjectIdentifiers.id_aes256_GCM);
        hashSet.add(NISTObjectIdentifiers.id_aes128_CCM);
        hashSet.add(NISTObjectIdentifiers.id_aes192_CCM);
        hashSet.add(NISTObjectIdentifiers.id_aes256_CCM);
        int i = onNavigationEvent + 57;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    EnvelopedDataHelper() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.cms.CMSException */
    static Object createContentCipher(boolean z, CipherParameters cipherParameters, AlgorithmIdentifier algorithmIdentifier) throws CMSException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        try {
            Object objCreateContentCipher = CipherFactory.createContentCipher(z, cipherParameters, algorithmIdentifier);
            int i4 = onWarmupCompleted + 47;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objCreateContentCipher;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (IllegalArgumentException e) {
            throw new CMSException(e.getMessage(), e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.cms.CMSException */
    static Wrapper createRFC3211Wrapper(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (NISTObjectIdentifiers.id_aes128_CBC.equals(aSN1ObjectIdentifier) || NISTObjectIdentifiers.id_aes192_CBC.equals(aSN1ObjectIdentifier) || !(!NISTObjectIdentifiers.id_aes256_CBC.equals(aSN1ObjectIdentifier))) {
            return new RFC3211WrapEngine(new AESEngine());
        }
        int i4 = IAuthTabCallback + 29;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        if (PKCSObjectIdentifiers.des_EDE3_CBC.equals(aSN1ObjectIdentifier)) {
            RFC3211WrapEngine rFC3211WrapEngine = new RFC3211WrapEngine(new DESedeEngine());
            int i6 = IAuthTabCallback + 5;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                return rFC3211WrapEngine;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (OIWObjectIdentifiers.desCBC.equals(aSN1ObjectIdentifier)) {
            return new RFC3211WrapEngine(new DESEngine());
        }
        if (PKCSObjectIdentifiers.RC2_CBC.equals(aSN1ObjectIdentifier)) {
            return new RFC3211WrapEngine(new RC2Engine());
        }
        throw new CMSException("cannot recognise wrapper: " + aSN1ObjectIdentifier);
    }

    private static Map createTable() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(PKCSObjectIdentifiers.id_hmacWithSHA1, new BcDigestProvider() { // from class: org.bouncycastle.cms.bc.EnvelopedDataHelper.1
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public ExtendedDigest get(AlgorithmIdentifier algorithmIdentifier) {
                return new SHA1Digest();
            }
        });
        map.put(PKCSObjectIdentifiers.id_hmacWithSHA224, new BcDigestProvider() { // from class: org.bouncycastle.cms.bc.EnvelopedDataHelper.2
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public ExtendedDigest get(AlgorithmIdentifier algorithmIdentifier) {
                return new SHA224Digest();
            }
        });
        map.put(PKCSObjectIdentifiers.id_hmacWithSHA256, new BcDigestProvider() { // from class: org.bouncycastle.cms.bc.EnvelopedDataHelper.3
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public ExtendedDigest get(AlgorithmIdentifier algorithmIdentifier) {
                return new SHA256Digest();
            }
        });
        map.put(PKCSObjectIdentifiers.id_hmacWithSHA384, new BcDigestProvider() { // from class: org.bouncycastle.cms.bc.EnvelopedDataHelper.4
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public ExtendedDigest get(AlgorithmIdentifier algorithmIdentifier) {
                return new SHA384Digest();
            }
        });
        map.put(PKCSObjectIdentifiers.id_hmacWithSHA512, new BcDigestProvider() { // from class: org.bouncycastle.cms.bc.EnvelopedDataHelper.5
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public ExtendedDigest get(AlgorithmIdentifier algorithmIdentifier) {
                return new SHA512Digest();
            }
        });
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        int i2 = onWarmupCompleted + 119;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return mapUnmodifiableMap;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static ExtendedDigest getPRF(AlgorithmIdentifier algorithmIdentifier) throws OperatorCreationException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        ExtendedDigest extendedDigest = ((BcDigestProvider) prfs.get(algorithmIdentifier.getAlgorithm())).get(null);
        int i4 = onWarmupCompleted + 97;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return extendedDigest;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.cms.CMSException */
    CipherKeyGenerator createKeyGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i, SecureRandom secureRandom) throws CMSException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 47;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        try {
            CipherKeyGenerator cipherKeyGeneratorCreateKeyGenerator = CipherKeyGeneratorFactory.createKeyGenerator(aSN1ObjectIdentifier, secureRandom);
            int i5 = IAuthTabCallback + 19;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return cipherKeyGeneratorCreateKeyGenerator;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (IllegalArgumentException e) {
            throw new CMSException(e.getMessage(), e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.cms.CMSException */
    AlgorithmIdentifier generateEncryptionAlgID(ASN1ObjectIdentifier aSN1ObjectIdentifier, KeyParameter keyParameter, SecureRandom secureRandom) throws CMSException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onWarmupCompleted = i2 % 128;
        try {
            AlgorithmIdentifier algorithmIdentifierGenerateEncryptionAlgID = i2 % 2 == 0 ? AlgorithmIdentifierFactory.generateEncryptionAlgID(aSN1ObjectIdentifier, keyParameter.getKey().length - 2, secureRandom) : AlgorithmIdentifierFactory.generateEncryptionAlgID(aSN1ObjectIdentifier, keyParameter.getKey().length << 3, secureRandom);
            int i3 = IAuthTabCallback + 77;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return algorithmIdentifierGenerateEncryptionAlgID;
        } catch (IllegalArgumentException e) {
            throw new CMSException(e.getMessage(), e);
        }
    }

    boolean isAuthEnveloped(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            authEnvelopedAlgorithms.contains(aSN1ObjectIdentifier);
            throw null;
        }
        boolean zContains = authEnvelopedAlgorithms.contains(aSN1ObjectIdentifier);
        int i3 = onWarmupCompleted + 23;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return zContains;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallbackWithResult;
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 41;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), View.MeasureSpec.getMode(0) + 72, (KeyEvent.getMaxKeyCode() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    i5 = -1469660336;
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
            int i10 = $11 + 17;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                int i13 = $10 + 63;
                $11 = i13 % 128;
                if (i13 % i3 == 0) {
                    try {
                        Object[] objArr3 = new Object[1];
                        objArr3[i6] = Integer.valueOf(iArr5[i12]);
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.resolveSize(i6, i6) + 72, 8848 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i12] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    try {
                        Object[] objArr4 = {Integer.valueOf(iArr5[i12])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), AndroidCharacter.getMirror('0') + 24, ImageFormat.getBitsPerPixel(0) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i12] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        i12++;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                i3 = 2;
                i6 = 0;
            }
            i2 = i6;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i14 = $10 + 101;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            for (int i16 = 0; i16 < 16; i16++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i16];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - ExpandableListView.getPackedPositionGroup(0L)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 39, TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
            }
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i17;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 4034), 77 - Process.getGidForName(BuildConfig.FLAVOR), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7397, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            int i20 = $10 + 87;
            $11 = i20 % 128;
            if (i20 % 2 == 0) {
                int i21 = 2 % 5;
            }
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = new int[]{-380905321, -865995995, 470389837, 61461339, 794099601, -87657609, 1893070291, -375075795, -1264186888, 1958261282, -2002609143, -1847803429, 1367883109, -338421676, -1319124755, 1090011376, -728755369, 1076154487};
    }
}
