package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.p000firebaseauthapi.zzer;
import com.google.android.gms.internal.p000firebaseauthapi.zzic;
import com.google.android.gms.internal.p000firebaseauthapi.zzux;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzeo {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char onWarmupCompleted;
    private static final zzoe<zzek, zzbh> zza;
    private static final zzbt<zzbh> zzb;
    private static final zznp<zzer> zzc;
    private static final zznn<zzer> zzd;

    public static /* synthetic */ zzek zza(zzer zzerVar, Integer num) throws GeneralSecurityException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 11;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (zzerVar.zzc() != 24) {
            int i5 = IAuthTabCallbackStub + 13;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                return zzek.zzb().zza(zzerVar).zza(num).zza(zzxt.zza(zzerVar.zzc())).zza();
            }
            zzek.zzb().zza(zzerVar).zza(num).zza(zzxt.zza(zzerVar.zzc())).zza();
            throw null;
        }
        throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
    }

    static String zza() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 113;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 67;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return "type.googleapis.com/google.crypto.tink.AesGcmKey";
        }
        throw null;
    }

    static {
        onExtraCallback();
        zza = zzoe.zza(new zzog() { // from class: com.google.android.gms.internal.firebase-auth-api.zzen
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zzog
            public final Object zza(zzbu zzbuVar) {
                return zzwg.zza((zzek) zzbuVar);
            }
        }, zzek.class, zzbh.class);
        zzb = zznd.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", zzbh.class, zzux.zzb.SYMMETRIC, zzst.zze());
        zzc = new zznp() { // from class: com.google.android.gms.internal.firebase-auth-api.zzeq
        };
        zzd = new zznn() { // from class: com.google.android.gms.internal.firebase-auth-api.zzep
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zznn
            public final zzbu zza(zzci zzciVar, Integer num) {
                return zzeo.zza((zzer) zzciVar, null);
            }
        };
        int i2 = onExtraCallback + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    public static void zza(boolean z) throws Throwable {
        int i2 = 2 % 2;
        zzhf.zza();
        zzns.zza().zza(zza);
        zznt zzntVarZza = zznt.zza();
        HashMap map = new HashMap();
        Object[] objArr = new Object[1];
        a(new char[]{58975, 38093, 10592, 1549, 34310, 51325, 34920, 14893, 36613, 18898}, (Process.myTid() >> 22) + 10, objArr);
        map.put(((String) objArr[0]).intern(), zzgr.zza);
        zzer.zza zzaVarZzc = zzer.zze().zza(12).zzb(16).zzc(16);
        zzer.zzb zzbVar = zzer.zzb.zzc;
        zzer zzerVarZza = zzaVarZzc.zza(zzbVar).zza();
        Object[] objArr2 = new Object[1];
        a(new char[]{58975, 38093, 10592, 1549, 34310, 51325, 34920, 14893, 36613, 18898, 42585, 31588, 45279, 25468}, 14 - ExpandableListView.getPackedPositionType(0L), objArr2);
        map.put(((String) objArr2[0]).intern(), zzerVarZza);
        Object[] objArr3 = new Object[1];
        a(new char[]{58975, 38093, 1837, 3631, 34316, 21286, 34920, 14893, 36613, 18898}, Color.red(0) + 10, objArr3);
        map.put(((String) objArr3[0]).intern(), zzgr.zzb);
        zzer zzerVarZza2 = zzer.zze().zza(12).zzb(32).zzc(16).zza(zzbVar).zza();
        Object[] objArr4 = new Object[1];
        a(new char[]{58975, 38093, 1837, 3631, 34316, 21286, 34920, 14893, 36613, 18898, 42585, 31588, 45279, 25468}, Color.argb(0, 0, 0, 0) + 14, objArr4);
        map.put(((String) objArr4[0]).intern(), zzerVarZza2);
        zzntVarZza.zza(Collections.unmodifiableMap(map));
        zznm.zza().zza(zzc, zzer.class);
        zznk.zza().zza(zzd, zzer.class);
        zzmn.zza().zza(zzb, zzic.zza.zzb, true);
        int i3 = IAuthTabCallbackDefault + 111;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $10 + 65;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i7 = $10 + 15;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 58224;
            int i10 = i4;
            while (i10 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i11 = (c2 + i9) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i12 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                        int touchSlop = 10 - (ViewConfiguration.getTouchSlop() >> 8);
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(i4) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(scrollBarSize, touchSlop, iNormalizeMetaState, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), Color.blue(0) + 10, TextUtils.indexOf("", "", 0, 0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i9 -= 40503;
                    i10++;
                    cArr3 = cArr4;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter("", 0) + 16014), 14 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.lastIndexOf("", '0', 0) + 19902, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void onExtraCallback() {
        onNavigationEvent = (char) 43846;
        IAuthTabCallback = (char) 43995;
        onExtraCallbackWithResult = (char) 54046;
        onWarmupCompleted = (char) 20527;
    }
}
