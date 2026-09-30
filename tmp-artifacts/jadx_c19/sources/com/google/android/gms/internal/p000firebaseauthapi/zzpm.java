package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.p000firebaseauthapi.zzpp;
import com.google.android.gms.internal.p000firebaseauthapi.zzux;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzpm {
    private static int $10 = 0;
    private static int $11 = 1;
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private static boolean onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char[] onWarmupCompleted;
    private static final zznn<zzpp> zza;
    private static final zzoe<zzpi, zzpx> zzb;
    private static final zzoe<zzpi, zzcf> zzc;
    private static final zzbt<zzcf> zzd;

    public static /* synthetic */ zzcf zza(zzpi zzpiVar) throws GeneralSecurityException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 93;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            zza((zzpp) zzpiVar.zzc());
            return zzxo.zza(zzpiVar);
        }
        zza((zzpp) zzpiVar.zzc());
        int i4 = 45 / 0;
        return zzxo.zza(zzpiVar);
    }

    public static /* synthetic */ zzpi zza(zzpp zzppVar, Integer num) throws GeneralSecurityException {
        int i2 = 2 % 2;
        int i3 = asBinder + 33;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            zza(zzppVar);
            zzpi zzpiVarZza = zzpi.zzb().zza(zzppVar).zza(zzxt.zza(zzppVar.zzc())).zza(num).zza();
            int i4 = asBinder + 3;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 43 / 0;
            }
            return zzpiVarZza;
        }
        zza(zzppVar);
        zzpi.zzb().zza(zzppVar).zza(zzxt.zza(zzppVar.zzc())).zza(num).zza();
        throw null;
    }

    public static /* synthetic */ zzpx zzb(zzpi zzpiVar) throws GeneralSecurityException {
        int i2 = 2 % 2;
        zza((zzpp) zzpiVar.zzc());
        zzre zzreVar = new zzre(zzpiVar);
        int i3 = asBinder + 25;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 42 / 0;
        }
        return zzreVar;
    }

    static {
        onNavigationEvent();
        zza = new zznn() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpl
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zznn
            public final zzbu zza(zzci zzciVar, Integer num) {
                return zzpm.zza((zzpp) zzciVar, null);
            }
        };
        zzb = zzoe.zza(new zzog() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpo
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zzog
            public final Object zza(zzbu zzbuVar) {
                return zzpm.zzb((zzpi) zzbuVar);
            }
        }, zzpi.class, zzpx.class);
        zzc = zzoe.zza(new zzog() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpn
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zzog
            public final Object zza(zzbu zzbuVar) {
                return zzpm.zza((zzpi) zzbuVar);
            }
        }, zzpi.class, zzcf.class);
        zzd = zznd.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", zzcf.class, zzux.zzb.SYMMETRIC, zzry.zzf());
        int i2 = IAuthTabCallbackStub + 43;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void zza(boolean z) throws Throwable {
        int i2 = 2 % 2;
        zzpr.zza();
        zznk.zza().zza(zza, zzpp.class);
        zzns.zza().zza(zzb);
        zzns.zza().zza(zzc);
        zznt zzntVarZza = zznt.zza();
        HashMap map = new HashMap();
        zzpp zzppVar = zzqv.zzc;
        Object[] objArr = new Object[1];
        Object obj = null;
        a(null, null, new byte[]{-123, -127, -122, -123, -124, -125, -126, -127}, 126 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr);
        map.put(((String) objArr[0]).intern(), zzppVar);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-123, -127, -122, -123, -124, -119, -120, -121, -125, -126, -127}, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
        map.put(((String) objArr2[0]).intern(), zzppVar);
        zzpp zzppVarZza = zzpp.zzd().zza(32).zzb(16).zza(zzpp.zzb.zzd).zza();
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-117, -127, -118, -124, -123, -127, -122, -123, -124, -119, -120, -121, -125, -126, -127}, 127 - Color.red(0), objArr3);
        map.put(((String) objArr3[0]).intern(), zzppVarZza);
        zzntVarZza.zza(Collections.unmodifiableMap(map));
        zzcu.zza((zzbt) zzd, true);
        int i3 = asBinder + 73;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static void zza(zzpp zzppVar) throws GeneralSecurityException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 35;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (zzppVar.zzc() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
        int i5 = IAuthTabCallbackDefault + 101;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i2, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onWarmupCompleted;
        if (cArr3 != null) {
            int i4 = $10 + 7;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 77 - TextUtils.getOffsetBefore("", 0), TextUtils.getOffsetBefore("", 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        long j = 0;
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 75, (ViewConfiguration.getTapTimeout() >> 16) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i6 = 1052772399;
        if (IAuthTabCallback) {
            int i7 = $11 + 33;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i2] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) - 1), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 63, 12214 - (ViewConfiguration.getTapTimeout() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                j = 0;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onExtraCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i9 = $11 + 5;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 4;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i11 = $10 + 115;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback + defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >>> i2] + iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 63 - TextUtils.indexOf("", "", 0), 12214 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), 64 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            i6 = 1052772399;
        }
        objArr[0] = new String(cArr6);
    }

    static void onNavigationEvent() {
        onWarmupCompleted = new char[]{32584, 32588, 32638, 32618, 32590, 32580, 32607, 32604, 32595, 32639, 32626};
        onExtraCallbackWithResult = -1184334071;
        onExtraCallback = true;
        IAuthTabCallback = true;
    }
}
