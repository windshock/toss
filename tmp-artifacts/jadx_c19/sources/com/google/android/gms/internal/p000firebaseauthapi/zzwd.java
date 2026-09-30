package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzwd extends ThreadLocal<Cipher> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int[] onExtraCallbackWithResult = {-1094249516, 1934872721, 943151878, 754217637, -365031042, 1148505876, -10498949, 1422613815, -936269845, 1040925398, -1333190687, 1108503997, 1208544303, -104588646, -1640060607, 561889835, 1223646034, 1711267424};
    private static int onNavigationEvent = 1;

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Cipher initialValue() throws Throwable {
        Cipher cipherZza;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 29;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            cipherZza = zza();
            int i4 = 49 / 0;
        } else {
            cipherZza = zza();
        }
        int i5 = onExtraCallback + 81;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return cipherZza;
    }

    private static Cipher zza() throws Throwable {
        Cipher cipherZza;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 121;
        onNavigationEvent = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                zzwr<zzxc, Cipher> zzwrVar = zzwr.zza;
                Object[] objArr = new Object[1];
                a(new int[]{155003670, 1216748361, 1038758795, -1426730446, 505113703, -1713497146, 84308062, -1062655489, -1693201585, -884003444}, 33 >> Color.argb(1, 1, 0, 0), objArr);
                cipherZza = zzwrVar.zza(((String) objArr[0]).intern());
            } else {
                zzwr<zzxc, Cipher> zzwrVar2 = zzwr.zza;
                Object[] objArr2 = new Object[1];
                a(new int[]{155003670, 1216748361, 1038758795, -1426730446, 505113703, -1713497146, 84308062, -1062655489, -1693201585, -884003444}, Color.argb(0, 0, 0, 0) + 17, objArr2);
                cipherZza = zzwrVar2.zza(((String) objArr2[0]).intern());
            }
            return cipherZza;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    zzwd() {
    }

    private static void a(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3;
        int length2;
        int[] iArr3;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = onExtraCallbackWithResult;
        long j = 0;
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr4 != null) {
            int i7 = $11 + 115;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length2 = iArr4.length;
                iArr3 = new int[length2];
            } else {
                length2 = iArr4.length;
                iArr3 = new int[length2];
            }
            int i8 = 0;
            while (i8 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr4[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 73 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)), 8848 - (KeyEvent.getMaxKeyCode() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i8++;
                    j = 0;
                    i5 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr4 = iArr3;
        }
        int length3 = iArr4.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = onExtraCallbackWithResult;
        if (iArr6 != null) {
            int i9 = $11 + 27;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr3 = new Object[1];
                    objArr3[i6] = Integer.valueOf(iArr6[i3]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", i6), Color.green(i6) + 72, 8848 - TextUtils.getTrimmedLength(""), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i3] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i3++;
                    i6 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr6 = iArr2;
        }
        int i10 = i6;
        System.arraycopy(iArr6, i10, iArr5, i10, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i10;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i10] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i11 = 0;
            for (int i12 = 16; i11 < i12; i12 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i11];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22252), 40 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10300, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i11++;
            }
            int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i13;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 4033), 78 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 7398 - (ViewConfiguration.getPressedStateDuration() >> 16), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i10 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }
}
