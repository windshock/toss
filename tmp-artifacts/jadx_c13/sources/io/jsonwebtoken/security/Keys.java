package io.jsonwebtoken.security;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.Classes;
import java.lang.reflect.Method;
import java.security.KeyPair;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Keys {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String EC = "io.jsonwebtoken.impl.crypto.EllipticCurveProvider";
    private static int[] IAuthTabCallback = null;
    private static final String MAC = "io.jsonwebtoken.impl.crypto.MacProvider";
    private static final List<SignatureAlgorithm> PREFERRED_HMAC_ALGS;
    private static final String RSA = "io.jsonwebtoken.impl.crypto.RsaProvider";
    private static final Class[] SIG_ARG_TYPES;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        IAuthTabCallback();
        SIG_ARG_TYPES = new Class[]{SignatureAlgorithm.class};
        PREFERRED_HMAC_ALGS = Collections.unmodifiableList(Arrays.asList(SignatureAlgorithm.HS512, SignatureAlgorithm.HS384, SignatureAlgorithm.HS256));
        int i = onWarmupCompleted + 63;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private Keys() {
    }

    public static SecretKey hmacShaKeyFor(byte[] bArr) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 71;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (bArr == null) {
            throw new InvalidKeyException("SecretKey byte array cannot be null.");
        }
        int i4 = i2 + 99;
        onNavigationEvent = i4 % 128;
        int length = i4 % 2 != 0 ? bArr.length >>> 5 : bArr.length << 3;
        for (SignatureAlgorithm signatureAlgorithm : PREFERRED_HMAC_ALGS) {
            int i5 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (length >= signatureAlgorithm.getMinKeyLength()) {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, signatureAlgorithm.getJcaName());
                int i7 = onNavigationEvent + Imgproc.COLOR_YUV2RGBA_YVYU;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                return secretKeySpec;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The specified key byte array is ");
        sb.append(length);
        sb.append(" bits which ");
        sb.append("is not secure enough for any JWT HMAC-SHA algorithm.  The JWT ");
        sb.append("JWA Specification (RFC 7518, Section 3.2) states that keys used with HMAC-SHA algorithms MUST have a ");
        sb.append("size >= 256 bits (the key size must be greater than or equal to the hash ");
        sb.append("output size).  Consider using the ");
        sb.append(Keys.class.getName());
        sb.append("#secretKeyFor(SignatureAlgorithm) method ");
        sb.append("to create a key guaranteed to be secure enough for your preferred HMAC-SHA algorithm.  See ");
        Object[] objArr = new Object[1];
        a(new int[]{-217992645, 1670646996, -956933842, -1916612286, -555284619, -1975437537, -1878692891, 317262035, 1605240441, -358874849, -2132257652, 1710189879, 1335706875, -1308279432, -1486964001, 1592929123, 998546660, 133740454, 960838816, 452241684, -1722591318, 1888299219, -779359926, 913356732, -684404982, 1111459493, 609049286, -351248225, -526872538, 303270648, 1899023119, -1740045270, 1017702679, 1236786178, -451953558, 278841710}, TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET) + 69, objArr);
        sb.append(((String) objArr[0]).intern());
        throw new WeakKeyException(sb.toString());
    }

    /* renamed from: io.jsonwebtoken.security.Keys$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$jsonwebtoken$SignatureAlgorithm;

        static {
            int[] iArr = new int[SignatureAlgorithm.values().length];
            $SwitchMap$io$jsonwebtoken$SignatureAlgorithm = iArr;
            try {
                iArr[SignatureAlgorithm.HS256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.HS384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.HS512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.RS256.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.PS256.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.RS384.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.PS384.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.RS512.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.PS512.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.ES256.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.ES384.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.ES512.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[PHI: r1
      0x002c: PHI (r1v6 int) = (r1v5 int), (r1v13 int) binds: [B:8:0x002a, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SecretKey secretKeyFor(SignatureAlgorithm signatureAlgorithm) throws IllegalArgumentException {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Assert.notNull(signatureAlgorithm, "SignatureAlgorithm cannot be null.");
            i = AnonymousClass1.$SwitchMap$io$jsonwebtoken$SignatureAlgorithm[signatureAlgorithm.ordinal()];
            if (i != 0) {
                if (i != 2 && i != 3) {
                    throw new IllegalArgumentException("The " + signatureAlgorithm.name() + " algorithm does not support shared secret keys.");
                }
            }
        } else {
            Assert.notNull(signatureAlgorithm, "SignatureAlgorithm cannot be null.");
            i = AnonymousClass1.$SwitchMap$io$jsonwebtoken$SignatureAlgorithm[signatureAlgorithm.ordinal()];
            if (i != 1) {
            }
        }
        SecretKey secretKey = (SecretKey) Classes.invokeStatic(MAC, "generateKey", SIG_ARG_TYPES, signatureAlgorithm);
        int i4 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return secretKey;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallback;
        int i3 = -1469660336;
        long j = 0;
        if (iArr2 != null) {
            int i4 = $10 + 23;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), View.resolveSize(0, 0) + 72, 8847 - ExpandableListView.getPackedPositionChild(j), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    i3 = -1469660336;
                    j = 0;
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
        int[] iArr5 = IAuthTabCallback;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i7 = 0; i7 < length3; i7++) {
                int i8 = $11 + 95;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                Object[] objArr3 = {Integer.valueOf(iArr5[i7])};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 72, 8847 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i10 = $11 + 99;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i12 = 0;
            for (int i13 = 16; i12 < i13; i13 = 16) {
                int i14 = $10 + 111;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 39, 10302 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i12++;
            }
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4033), 79 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 7399 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public static KeyPair keyPairFor(SignatureAlgorithm signatureAlgorithm) throws IllegalArgumentException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Assert.notNull(signatureAlgorithm, "SignatureAlgorithm cannot be null.");
        switch (AnonymousClass1.$SwitchMap$io$jsonwebtoken$SignatureAlgorithm[signatureAlgorithm.ordinal()]) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return (KeyPair) Classes.invokeStatic(RSA, "generateKeyPair", SIG_ARG_TYPES, signatureAlgorithm);
            case 10:
            case 11:
            case 12:
                KeyPair keyPair = (KeyPair) Classes.invokeStatic(EC, "generateKeyPair", SIG_ARG_TYPES, signatureAlgorithm);
                int i4 = onNavigationEvent + 101;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return keyPair;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("The ");
                sb.append(signatureAlgorithm.name());
                sb.append(" algorithm does not support Key Pairs.");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = new int[]{-1805072453, -1698468343, -405182081, -1692853582, 1680908601, 582170133, 1713465799, 1882432152, 1748194679, 2144843982, -1914003997, 1574599271, 79580529, 302681242, 1237609010, -1712226819, -233053702, 845205303};
    }
}
