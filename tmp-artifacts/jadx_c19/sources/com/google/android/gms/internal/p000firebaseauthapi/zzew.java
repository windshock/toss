package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.p000firebaseauthapi.zzfa;
import com.google.android.gms.internal.p000firebaseauthapi.zzux;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzew {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char onWarmupCompleted;
    private static final zzoe<zzet, zzbh> zza;
    private static final zznn<zzfa> zzb;
    private static final zznp<zzfa> zzc;
    private static final zzbt<zzbh> zzd;

    public static /* synthetic */ zzet zza(zzfa zzfaVar, Integer num) throws GeneralSecurityException {
        int i2 = 2 % 2;
        int i3 = asBinder + 107;
        IAuthTabCallbackDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            zzet.zzb().zza(zzfaVar).zza(num).zza(zzxt.zza(zzfaVar.zzb())).zza();
            obj.hashCode();
            throw null;
        }
        zzet zzetVarZza = zzet.zzb().zza(zzfaVar).zza(num).zza(zzxt.zza(zzfaVar.zzb())).zza();
        int i4 = asBinder + 15;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return zzetVarZza;
        }
        obj.hashCode();
        throw null;
    }

    static {
        onExtraCallback();
        zza = zzoe.zza(new zzog() { // from class: com.google.android.gms.internal.firebase-auth-api.zzez
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zzog
            public final Object zza(zzbu zzbuVar) {
                return zzia.zza((zzet) zzbuVar);
            }
        }, zzet.class, zzbh.class);
        zzb = new zznn() { // from class: com.google.android.gms.internal.firebase-auth-api.zzey
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zznn
            public final zzbu zza(zzci zzciVar, Integer num) {
                return zzew.zza((zzfa) zzciVar, null);
            }
        };
        zzc = new zznp() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfb
        };
        zzd = zznd.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzbh.class, zzux.zzb.SYMMETRIC, zzsx.zze());
        int i2 = onNavigationEvent + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    public static void zza(boolean z) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder + 33;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            zzff.zza();
            if (zza()) {
                zzns.zza().zza(zza);
                zznt zzntVarZza = zznt.zza();
                HashMap map = new HashMap();
                zzfa.zza zzaVarZza = zzfa.zzc().zza(16);
                zzfa.zzb zzbVar = zzfa.zzb.zza;
                zzfa zzfaVarZza = zzaVarZza.zza(zzbVar).zza();
                Object[] objArr = new Object[1];
                a(new char[]{33578, 49217, 7019, 56722, 37305, 35626, 24174, 25915, 60023, 12904, 23672, 31706, 9064, 36538}, 14 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
                map.put(((String) objArr[0]).intern(), zzfaVarZza);
                zzfa.zza zzaVarZza2 = zzfa.zzc().zza(16);
                zzfa.zzb zzbVar2 = zzfa.zzb.zzc;
                zzfa zzfaVarZza2 = zzaVarZza2.zza(zzbVar2).zza();
                Object[] objArr2 = new Object[1];
                a(new char[]{33578, 49217, 7019, 56722, 37305, 35626, 24174, 25915, 60023, 12904, 23672, 31706, 9064, 36538, 44421, 6841, 11432, 3757}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18, objArr2);
                map.put(((String) objArr2[0]).intern(), zzfaVarZza2);
                zzfa zzfaVarZza3 = zzfa.zzc().zza(32).zza(zzbVar).zza();
                Object[] objArr3 = new Object[1];
                a(new char[]{33578, 49217, 62643, 30733, 55715, 20228, 24174, 25915, 60023, 12904, 23672, 31706, 9064, 36538}, 14 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr3);
                map.put(((String) objArr3[0]).intern(), zzfaVarZza3);
                zzfa zzfaVarZza4 = zzfa.zzc().zza(32).zza(zzbVar2).zza();
                Object[] objArr4 = new Object[1];
                a(new char[]{33578, 49217, 62643, 30733, 55715, 20228, 24174, 25915, 60023, 12904, 23672, 31706, 9064, 36538, 44421, 6841, 11432, 3757}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 18, objArr4);
                map.put(((String) objArr4[0]).intern(), zzfaVarZza4);
                zzntVarZza.zza(Collections.unmodifiableMap(map));
                zznm.zza().zza(zzc, zzfa.class);
                zznk.zza().zza(zzb, zzfa.class);
                zzcu.zza((zzbt) zzd, true);
                int i4 = asBinder + 77;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            return;
        }
        zzff.zza();
        zza();
        throw null;
    }

    private static boolean zza() throws NoSuchPaddingException, NoSuchAlgorithmException {
        String str;
        int i2 = 2 % 2;
        int i3 = asBinder + 123;
        IAuthTabCallbackDefault = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                Object[] objArr = new Object[1];
                a(new char[]{33578, 49217, 55772, 48156, 26145, 21347, 9423, 37509, 30577, 13735, 46590, 42523, 38208, 2655, 23951, 28384, 49922, 2254, 45456, 15418, 31423, 63297}, 23 >> (Process.myTid() << 25), objArr);
                str = (String) objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a(new char[]{33578, 49217, 55772, 48156, 26145, 21347, 9423, 37509, 30577, 13735, 46590, 42523, 38208, 2655, 23951, 28384, 49922, 2254, 45456, 15418, 31423, 63297}, (Process.myTid() >> 22) + 21, objArr2);
                str = (String) objArr2[0];
            }
            Cipher.getInstance(str.intern());
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i5 = 58224;
            int i6 = i4;
            while (i6 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i7 = (c2 + i5) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i8 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallback);
                    objArr2[2] = Integer.valueOf(i8);
                    objArr2[1] = Integer.valueOf(i7);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char size = (char) View.MeasureSpec.getSize(i4);
                        int i9 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9;
                        int iLastIndexOf = 12433 - TextUtils.lastIndexOf("", '0');
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(size, i9, iLastIndexOf, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9, 12434 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    int i10 = $10 + 45;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16793230), 13 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i12 = $10 + 125;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void onExtraCallback() {
        onExtraCallback = (char) 43305;
        onWarmupCompleted = (char) 58380;
        onExtraCallbackWithResult = (char) 16287;
        IAuthTabCallback = (char) 25176;
    }
}
