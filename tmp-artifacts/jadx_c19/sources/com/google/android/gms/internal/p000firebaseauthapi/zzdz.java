package com.google.android.gms.internal.p000firebaseauthapi;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.p000firebaseauthapi.zzea;
import com.google.android.gms.internal.p000firebaseauthapi.zzux;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzdz {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static char onNavigationEvent = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted = 1;
    private static final zzoe<zzdv, zzbh> zza;
    private static final zzbt<zzbh> zzb;
    private static final zznn<zzea> zzc;

    public static /* synthetic */ zzdv zza(zzea zzeaVar, Integer num) throws GeneralSecurityException {
        int i2 = 2 % 2;
        int i3 = onTransact + 55;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0 ? zzeaVar.zzc() == 24 : zzeaVar.zzc() == 23) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        int i4 = IAuthTabCallback + 5;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return zzdv.zzb().zza(zzeaVar).zza(num).zza(zzxt.zza(zzeaVar.zzc())).zza();
        }
        zzdv.zzb().zza(zzeaVar).zza(num).zza(zzxt.zza(zzeaVar.zzc())).zza();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static String zza() {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 91;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 67;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    static {
        onNavigationEvent();
        zza = zzoe.zza(new zzog() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdy
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zzog
            public final Object zza(zzbu zzbuVar) {
                return zzwb.zza((zzdv) zzbuVar);
            }
        }, zzdv.class, zzbh.class);
        zzb = zznd.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", zzbh.class, zzux.zzb.SYMMETRIC, zzso.zzf());
        zzc = new zznn() { // from class: com.google.android.gms.internal.firebase-auth-api.zzeb
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zznn
            public final zzbu zza(zzci zzciVar, Integer num) {
                return zzdz.zza((zzea) zzciVar, null);
            }
        };
        int i2 = onWarmupCompleted + 39;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public static void zza(boolean z) throws Throwable {
        int i2 = 2 % 2;
        zzef.zza();
        zzns.zza().zza(zza);
        zznt zzntVarZza = zznt.zza();
        HashMap map = new HashMap();
        Object[] objArr = new Object[1];
        a(new char[]{'\r', 15, '\t', 15, 14, '\n', 6, 2, '\r', 4}, (byte) (23 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.indexOf("", "", 0) + 10, objArr);
        map.put(((String) objArr[0]).intern(), zzgr.zzc);
        zzea.zza zzaVarZzc = zzea.zze().zza(16).zzb(16).zzc(16);
        zzea.zzb zzbVar = zzea.zzb.zzc;
        zzea zzeaVarZza = zzaVarZzc.zza(zzbVar).zza();
        Object[] objArr2 = new Object[1];
        a(new char[]{'\r', 15, '\t', 15, 14, '\n', 6, 2, '\r', 4, 3, 6, '\r', '\f'}, (byte) (126 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 14, objArr2);
        map.put(((String) objArr2[0]).intern(), zzeaVarZza);
        Object[] objArr3 = new Object[1];
        a(new char[]{'\r', 15, '\b', 11, 0, 1, 6, 2, '\r', 4}, (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 39), KeyEvent.normalizeMetaState(0) + 10, objArr3);
        map.put(((String) objArr3[0]).intern(), zzgr.zzd);
        zzea zzeaVarZza2 = zzea.zze().zza(16).zzb(32).zzc(16).zza(zzbVar).zza();
        Object[] objArr4 = new Object[1];
        a(new char[]{'\r', 15, '\b', 11, 0, 1, 6, 2, '\r', 4, 3, 6, '\r', '\f'}, (byte) (57 - ExpandableListView.getPackedPositionType(0L)), 14 - ((Process.getThreadPriority(0) + 20) >> 6), objArr4);
        map.put(((String) objArr4[0]).intern(), zzeaVarZza2);
        zzntVarZza.zza(Collections.unmodifiableMap(map));
        zznk.zza().zza(zzc, zzea.class);
        zzcu.zza((zzbt) zzb, true);
        int i3 = onTransact + 11;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 63 / 0;
        }
    }

    private static void a(char[] cArr, byte b, int i2, Object[] objArr) throws Throwable {
        int i3;
        Object obj;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onExtraCallbackWithResult;
        int i5 = 13;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + i5;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 26 - Gravity.getAbsoluteGravity(0, 0), View.resolveSize(0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    i5 = 13;
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
            Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 26, 23139 - View.combineMeasuredStates(0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i2];
            if (i2 % 2 != 0) {
                int i9 = $10 + 17;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    i3 = i2 + 81;
                    cArr4[i3] = (char) (cArr[i3] % b);
                } else {
                    i3 = i2 - 1;
                    cArr4[i3] = (char) (cArr[i3] - b);
                }
            } else {
                i3 = i2;
            }
            if (i3 > 1) {
                int i10 = $10 + 65;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                int i12 = $11 + 17;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i3) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        int i14 = $11 + 97;
                        $10 = i14 % 128;
                        if (i14 % 2 != 0) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback >> b);
                        } else {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        }
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - TextUtils.indexOf("", "", 0, 0)), 74 - (KeyEvent.getMaxKeyCode() >> 16), View.combineMeasuredStates(0, 0) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 29, (ViewConfiguration.getScrollBarSize() >> 8) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i16 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i16];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i17];
                            } else {
                                int i18 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i19 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i18];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i19];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            int i20 = 0;
            while (i20 < i2) {
                int i21 = $11 + 93;
                $10 = i21 % 128;
                if (i21 % 2 != 0) {
                    cArr4[i20] = (char) (cArr4[i20] ^ 18791);
                    i20 += 29;
                } else {
                    cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                    i20++;
                }
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = new char[]{64901, 64920, 65004, 64902, 64900, 65003, 64907, 64993, 64903, 64921, 64897, 64992, 65010, 64898, 65014, 64996};
        onNavigationEvent = (char) 51245;
    }
}
