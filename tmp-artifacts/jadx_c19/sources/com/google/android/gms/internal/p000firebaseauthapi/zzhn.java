package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.p000firebaseauthapi.zzic;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzhn {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int[] onExtraCallback = null;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private static final zzic.zza zza;
    private static final ThreadLocal<Cipher> zzb;
    private final SecretKey zzc;
    private final boolean zzd;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r1 r3
      0x0021: PHI (r1v5 int) = (r1v4 int), (r1v8 int) binds: [B:8:0x001f, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
      0x0021: PHI (r3v1 java.lang.Integer) = (r3v0 java.lang.Integer), (r3v4 java.lang.Integer) binds: [B:8:0x001f, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static AlgorithmParameterSpec zza(byte[] bArr) throws GeneralSecurityException {
        int length;
        Integer numZzb;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            length = bArr.length;
            numZzb = zzpg.zzb();
            int i4 = 59 / 0;
            if (numZzb != null) {
                if (numZzb.intValue() <= 19) {
                    return new IvParameterSpec(bArr, 0, length);
                }
            }
        } else {
            length = bArr.length;
            numZzb = zzpg.zzb();
            if (numZzb != null) {
            }
        }
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, length);
        int i5 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return gCMParameterSpec;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onWarmupCompleted();
        zza = zzic.zza.zzb;
        zzb = new zzhm();
        int i2 = onWarmupCompleted + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public zzhn(byte[] bArr, boolean z) throws Throwable {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzxq.zza(bArr.length);
        Object[] objArr = new Object[1];
        a(new int[]{964349651, 772122783}, TextUtils.indexOf("", "", 0) + 3, objArr);
        this.zzc = new SecretKeySpec(bArr, ((String) objArr[0]).intern());
        this.zzd = z;
        int i2 = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020 A[PHI: r3
      0x0020: PHI (r3v3 boolean) = (r3v2 boolean), (r3v11 boolean) binds: [B:10:0x001e, B:7:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[PHI: r3
      0x0023: PHI (r3v10 boolean) = (r3v2 boolean), (r3v11 boolean) binds: [B:10:0x001e, B:7:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        int i4 = onExtraCallbackWithResult;
        int i5 = i4 + 53;
        IAuthTabCallback = i5 % 128;
        int i6 = 0;
        if (i5 % 2 != 0) {
            z = this.zzd;
            int i7 = 12 / 0;
            i2 = z ? 28 : 16;
        } else {
            z = this.zzd;
            if (z) {
            }
        }
        if (bArr2.length < i2) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int i8 = i4 + 41;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 == 0 ? z : z) {
            if (!ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
                throw new GeneralSecurityException("iv does not match prepended iv");
            }
        }
        AlgorithmParameterSpec algorithmParameterSpecZza = zza(bArr);
        ThreadLocal<Cipher> threadLocal = zzb;
        threadLocal.get().init(2, this.zzc, algorithmParameterSpecZza);
        if (bArr3 != null && bArr3.length != 0) {
            int i9 = onExtraCallbackWithResult + 97;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            threadLocal.get().updateAAD(bArr3);
        }
        boolean z2 = this.zzd;
        if (z2) {
            int i11 = IAuthTabCallback + 87;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            i6 = 12;
        }
        return threadLocal.get().doFinal(bArr2, i6, z2 ? bArr2.length - 12 : bArr2.length);
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int length;
        int i2;
        int i3 = 2 % 2;
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr2.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        boolean z = this.zzd;
        if (z) {
            int i4 = onExtraCallbackWithResult;
            int i5 = i4 + 49;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            length = bArr2.length + 28;
            int i7 = i4 + 51;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        } else {
            length = bArr2.length + 16;
        }
        byte[] bArr4 = new byte[length];
        if (z) {
            System.arraycopy(bArr, 0, bArr4, 0, 12);
        }
        AlgorithmParameterSpec algorithmParameterSpecZza = zza(bArr);
        ThreadLocal<Cipher> threadLocal = zzb;
        threadLocal.get().init(1, this.zzc, algorithmParameterSpecZza);
        if (bArr3 != null && bArr3.length != 0) {
            int i9 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 != 0) {
                threadLocal.get().updateAAD(bArr3);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            threadLocal.get().updateAAD(bArr3);
        }
        if (!this.zzd) {
            i2 = 0;
        } else {
            int i10 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i10 % 128;
            i2 = i10 % 2 != 0 ? 52 : 12;
        }
        int iDoFinal = threadLocal.get().doFinal(bArr2, 0, bArr2.length, bArr4, i2);
        if (iDoFinal == bArr2.length + 16) {
            return bArr4;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - bArr2.length)));
    }

    private static void a(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallback;
        char c = '0';
        int i4 = -1469660336;
        long j = 0;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = $10 + 35;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 / 2;
            }
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror(c) - '0'), 72 - ExpandableListView.getPackedPositionGroup(j), 8849 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i8++;
                    c = '0';
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i9 = $11 + 49;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallback;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                try {
                    Object[] objArr3 = new Object[1];
                    objArr3[i5] = Integer.valueOf(iArr5[i11]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', i5, i5) + 1), 72 - TextUtils.getCapsMode("", i5, i5), 8848 - TextUtils.getTrimmedLength(""), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i11++;
                    i4 = -1469660336;
                    i5 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        int i12 = i5;
        System.arraycopy(iArr5, i12, iArr4, i12, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i12;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i12] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            for (int i13 = 0; i13 < 16; i13++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 39 - TextUtils.indexOf("", "", 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10300, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 4033), (ViewConfiguration.getScrollBarSize() >> 8) + 78, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i12 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void onWarmupCompleted() {
        onExtraCallback = new int[]{2130754867, -665542289, -1880101893, -1423762299, -846912664, -944001119, -1402283592, -205892151, 117462146, -1897069863, 861300200, -1482619500, -1945468055, -159411671, 1269034945, -356699534, -1149541274, -477986723};
    }
}
