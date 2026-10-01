package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.p000firebaseauthapi.zziq;
import com.google.android.gms.internal.p000firebaseauthapi.zzux;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import javax.annotation.Nullable;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzin {
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    private static short[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static byte[] onNavigationEvent;
    private static int onWarmupCompleted;
    private static final zzoe<zzij, zzbq> zza;
    private static final zzbt<zzbq> zzb;
    private static final zznp<zziq> zzc;
    private static final zznn<zziq> zzd;
    private static final byte[] $$a = {94, -53, 28, -60};
    private static final int $$b = 227;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asBinder = 1;
    private static int IAuthTabCallbackDefault = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [int] */
    /* JADX WARN: Type inference failed for: r6v8, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    private static String $$c(int i2, short s, short s2) {
        int i3 = 3 - (s * 2);
        int i4 = i2 * 3;
        byte[] bArr = $$a;
        ?? r7 = (s2 * 3) + 115;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        byte b = r7;
        if (bArr == null) {
            i5 = -1;
            b = i3 + r7;
            i3 = i3;
        }
        while (true) {
            int i6 = i5 + 1;
            int i7 = i3 + 1;
            bArr2[i6] = b;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            i5 = i6;
            b = bArr[i7] + b;
            i3 = i7;
        }
    }

    public static /* synthetic */ zzbq zza(zzij zzijVar) throws GeneralSecurityException {
        int i2 = 2 % 2;
        int i3 = onTransact + 107;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        zza(zzijVar.zzc());
        zzbq zzbqVarZza = zzwf.zza(zzijVar);
        int i5 = onTransact + 87;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return zzbqVarZza;
    }

    static zzij zza(zziq zziqVar, @Nullable Integer num) throws GeneralSecurityException {
        int i2 = 2 % 2;
        int i3 = onTransact + 87;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        zza(zziqVar);
        zzij zzijVarZza = zzij.zzb().zza(zziqVar).zza(num).zza(zzxt.zza(zziqVar.zzb())).zza();
        int i5 = onTransact + 123;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 92 / 0;
        }
        return zzijVarZza;
    }

    static {
        IAuthTabCallbackStub = 1;
        onNavigationEvent();
        zza = zzoe.zza(new zzog() { // from class: com.google.android.gms.internal.firebase-auth-api.zzim
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zzog
            public final Object zza(zzbu zzbuVar) {
                return zzin.zza((zzij) zzbuVar);
            }
        }, zzij.class, zzbq.class);
        zzb = zznd.zza("type.googleapis.com/google.crypto.tink.AesSivKey", zzbq.class, zzux.zzb.SYMMETRIC, zztb.zze());
        zzc = new zznp() { // from class: com.google.android.gms.internal.firebase-auth-api.zzip
        };
        zzd = new zznn() { // from class: com.google.android.gms.internal.firebase-auth-api.zzio
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zznn
            public final zzbu zza(zzci zzciVar, Integer num) {
                return zzin.zza((zziq) zzciVar, null);
            }
        };
        int i2 = IAuthTabCallbackDefault + 125;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public static void zza(boolean z) throws Throwable {
        int i2 = 2 % 2;
        zzjb.zza();
        zzns.zza().zza(zza);
        zznt zzntVarZza = zznt.zza();
        HashMap map = new HashMap();
        Object[] objArr = new Object[1];
        a((short) (MotionEvent.axisFromString("") - 95), (byte) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (-1631204865) + (ViewConfiguration.getKeyRepeatDelay() >> 16), View.resolveSize(0, 0) + 1484499012, (-92) - TextUtils.indexOf("", "", 0, 0), objArr);
        map.put(((String) objArr[0]).intern(), zziz.zza);
        zziq zziqVarZza = zziq.zzc().zza(64).zza(zziq.zzb.zzc).zza();
        Object[] objArr2 = new Object[1];
        a((short) (80 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (byte) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getTouchSlop() >> 8) - 1631204856, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1484499012, View.combineMeasuredStates(0, 0) - 88, objArr2);
        map.put(((String) objArr2[0]).intern(), zziqVarZza);
        zzntVarZza.zza(Collections.unmodifiableMap(map));
        zznm.zza().zza(zzc, zziq.class);
        zznk.zza().zza(zzd, zziq.class);
        zzcu.zza((zzbt) zzb, true);
        int i3 = onTransact + 35;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void zza(zziq zziqVar) throws GeneralSecurityException {
        int i2 = 2 % 2;
        int i3 = onTransact + 27;
        asBinder = i3 % 128;
        if (i3 % 2 != 0 ? zziqVar.zzb() != 64 : zziqVar.zzb() != 5) {
            throw new InvalidAlgorithmParameterException("invalid key size: " + zziqVar.zzb() + ". Valid keys must have 64 bytes.");
        }
        int i4 = asBinder + 33;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0089 A[PHI: r4
      0x0089: PHI (r4v10 byte[] A[IMMUTABLE_TYPE]) = (r4v9 byte[]), (r4v25 byte[]) binds: [B:18:0x0087, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i2, int i3, int i4, Object[] objArr) throws Throwable {
        long j;
        int length;
        byte[] bArr;
        byte[] bArr2;
        int i5;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getTouchSlop() >> 8)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42, 22439 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            if (i7 != 0) {
                int i8 = $11 + 63;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    bArr2 = onNavigationEvent;
                    int i9 = 40 / 0;
                    if (bArr2 != null) {
                        int length2 = bArr2.length;
                        byte[] bArr3 = new byte[length2];
                        for (int i10 = 0; i10 < length2; i10++) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i10])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - View.MeasureSpec.getSize(0)), (ViewConfiguration.getScrollBarSize() >> 8) + 55, TextUtils.getCapsMode("", 0, 0) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr3[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        }
                        bArr2 = bArr3;
                    }
                    if (bArr2 != null) {
                        j = -4629411779493505016L;
                        iIntValue = (short) (((short) (onExtraCallback[i2 + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                    } else {
                        int i11 = $11 + 41;
                        $10 = i11 % 128;
                        if (i11 % 2 != 0) {
                            byte[] bArr4 = onNavigationEvent;
                            Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 43425), 42 - TextUtils.getOffsetAfter("", 0), TextUtils.getOffsetAfter("", 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] % (-4629411779493505016L))) >> ((int) (onExtraCallbackWithResult | (-4629411779493505016L)));
                        } else {
                            byte[] bArr5 = onNavigationEvent;
                            Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback)};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 43424), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 41, 22439 - Color.blue(0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (bArr5[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)));
                        }
                        iIntValue = (byte) i5;
                        j = -4629411779493505016L;
                    }
                } else {
                    bArr2 = onNavigationEvent;
                    if (bArr2 != null) {
                    }
                    if (bArr2 != null) {
                    }
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i2 + iIntValue) - 2) + ((int) (IAuthTabCallback ^ j)) + i7;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), View.getDefaultSize(0, 0) + 86, 9567 - View.getDefaultSize(0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr6 = onNavigationEvent;
                if (bArr6 != null) {
                    int i12 = $10 + 21;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        length = bArr6.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr6.length;
                        bArr = new byte[length];
                    }
                    for (int i13 = 0; i13 < length; i13++) {
                        bArr[i13] = (byte) (bArr6[i13] ^ (-4629411779493505016L));
                    }
                    bArr6 = bArr;
                }
                boolean z = bArr6 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                int i14 = $11 + 125;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i16 = $11 + 93;
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (z) {
                        byte[] bArr7 = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void onNavigationEvent() {
        IAuthTabCallback = -981602807;
        onExtraCallbackWithResult = -1538795410;
        onWarmupCompleted = 63148021;
        onNavigationEvent = new byte[]{101, 94, 92, -127, 105, 107, 55, 102, 108, -49, -88, -84, -78, -74, -81, -83, -46, -70, -68, -104, -73, -67, 8, 8};
    }
}
