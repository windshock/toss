package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.p000firebaseauthapi.zzdm;
import com.google.android.gms.internal.p000firebaseauthapi.zzic;
import com.google.android.gms.internal.p000firebaseauthapi.zzux;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import javax.annotation.Nullable;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzdj {
    private static int IAuthTabCallback;
    private static int onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static long onWarmupCompleted;
    private static final zzoe<zzdf, zzbh> zza;
    private static final zzbt<zzbh> zzb;
    private static final zznp<zzdm> zzc;
    private static final zznn<zzdm> zzd;
    private static final byte[] $$a = {79, 9, 94, -7};
    private static final int $$b = 83;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onNavigationEvent = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, short s) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = 1 - (b2 * 3);
        int i5 = 110 - b;
        int i6 = 4 - (s * 4);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            i5 = (-i5) + i6;
            i6 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            i3 = i2 + 1;
            if (i3 == i4) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i6];
            int i9 = i6;
            i6 = i5;
            i5 = b3;
            i8 = i3;
            i7 = i9;
            i5 = (-i5) + i6;
            i6 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            i3 = i2 + 1;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i3 = i2 + 1;
            if (i3 == i4) {
            }
        }
    }

    static zzdf zza(zzdm zzdmVar, @Nullable Integer num) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder + 33;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0 ? zzdmVar.zzb() != 16 : zzdmVar.zzb() != 86) {
            int i4 = IAuthTabCallbackDefault + 3;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            if (zzdmVar.zzb() != 32) {
                Object[] objArr = new Object[1];
                a((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 973229484 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{35291, 40359, 50511, 31443, 23004, 48306, 38057, 56788, 39002, 33916, 16117, 15963, 30744, 56014, 31347, 32872, 52046, 14735, 48527, 46014, 52428, 63310, 46541, 51496, 30803, 16730, 37366, 64370, 44192, 2077, 6253, 4197, 58916, 58576, 48056}, new char[]{7965, 4878, 12762, 41998}, new char[]{44233, 589, 13882, 59936}, objArr);
                throw new GeneralSecurityException(((String) objArr[0]).intern());
            }
        }
        return zzdf.zzb().zza(zzdmVar).zza(num).zza(zzxt.zza(zzdmVar.zzb())).zzb(zzxt.zza(zzdmVar.zzc())).zza();
    }

    static String zza() {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 113;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 33;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    static {
        onExtraCallback = 1;
        onExtraCallback();
        zza = zzoe.zza(new zzog() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdi
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zzog
            public final Object zza(zzbu zzbuVar) {
                return zzws.zza((zzdf) zzbuVar);
            }
        }, zzdf.class, zzbh.class);
        zzb = zznd.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzbh.class, zzux.zzb.SYMMETRIC, zzsd.zzf());
        zzc = new zznp() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdl
        };
        zzd = new zznn() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdk
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zznn
            public final zzbu zza(zzci zzciVar, Integer num) {
                return zzdj.zza((zzdm) zzciVar, null);
            }
        };
        int i2 = onNavigationEvent + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public static void zza(boolean z) throws Throwable {
        int i2 = 2 % 2;
        zzdq.zza();
        zzns.zza().zza(zza);
        zznt zzntVarZza = zznt.zza();
        HashMap map = new HashMap();
        Object[] objArr = new Object[1];
        a((char) TextUtils.indexOf("", ""), 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{28146, 8662, 49959, 713, 789, 1516, 51247, 59283, 32323, 63766, 28361, 46943, 28292, 42151, 60334, 10585, 26105, 50025, 30922, 8416, 39446, 10885}, new char[]{7965, 4878, 12762, 41998}, new char[]{37397, 38266, 27040, 19361}, objArr);
        map.put(((String) objArr[0]).intern(), zzgr.zze);
        zzdm.zza zzaVarZzc = zzdm.zzf().zza(16).zzb(32).zzd(16).zzc(16);
        zzdm.zzb zzbVar = zzdm.zzb.zzc;
        zzdm.zza zzaVarZza = zzaVarZzc.zza(zzbVar);
        zzdm.zzc zzcVar = zzdm.zzc.zzc;
        zzdm zzdmVarZza = zzaVarZza.zza(zzcVar).zza();
        Object[] objArr2 = new Object[1];
        a((char) (Process.getGidForName("") + 16952), ViewConfiguration.getTapTimeout() >> 16, new char[]{16807, 34386, 25767, 36988, 39782, 42720, 35089, 14075, 50329, 44974, 53260, 54652, 32374, 18268, 56935, 33233, 32658, 19584, 7480, 47861, 34371, 42287, 1873, 51629, 17854, 15277}, new char[]{7965, 4878, 12762, 41998}, new char[]{51732, 55851, 14274, 37186}, objArr2);
        map.put(((String) objArr2[0]).intern(), zzdmVarZza);
        Object[] objArr3 = new Object[1];
        a((char) ExpandableListView.getPackedPositionType(0L), (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{1759, 53653, 50606, 52568, 55925, 42346, 10833, 56570, 64020, 32798, 38882, 24450, 3124, 6180, 23221, 39705, 45543, 7141, 62299, 49720, 17699, 11393}, new char[]{7965, 4878, 12762, 41998}, new char[]{63013, 33492, 33926, 13791}, objArr3);
        map.put(((String) objArr3[0]).intern(), zzgr.zzf);
        zzdm zzdmVarZza2 = zzdm.zzf().zza(32).zzb(32).zzd(32).zzc(16).zza(zzbVar).zza(zzcVar).zza();
        Object[] objArr4 = new Object[1];
        a((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43703), KeyEvent.getMaxKeyCode() >> 16, new char[]{18533, 22493, 49687, 41770, 51508, 49537, 22106, 6320, 20637, 22525, 63969, 43941, 59947, 4213, 14494, 25839, 62634, 54707, 33498, 26683, 7478, 7958, 16789, 64153, 45307, 13603}, new char[]{7965, 4878, 12762, 41998}, new char[]{19776, 13132, 47116, 26538}, objArr4);
        map.put(((String) objArr4[0]).intern(), zzdmVarZza2);
        zzntVarZza.zza(Collections.unmodifiableMap(map));
        zznm.zza().zza(zzc, zzdm.class);
        zznk.zza().zza(zzd, zzdm.class);
        zzmn.zza().zza(zzb, zzic.zza.zzb, true);
        int i3 = asBinder + 5;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void a(char c, int i2, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i2));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i5 = $10 + 41;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i7 = $11 + 33;
            $10 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0') + 44, TextUtils.indexOf((CharSequence) "", '0') + 1452, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char cArgb = (char) (49123 - Color.argb(0, 0, 0, 0));
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44;
                        int i9 = 1495 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        byte b3 = (byte) ($$b & 5);
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cArgb, doubleTapTimeout, i9, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - TextUtils.indexOf((CharSequence) "", '0')), 51 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 22939 - TextUtils.getOffsetAfter("", 0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 45848), (ViewConfiguration.getLongPressTimeout() >> 16) + 29, 12577 - ((Process.getThreadPriority(0) + 20) >> 6), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            i3 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr6);
        int i10 = $11 + 29;
        $10 = i10 % 128;
        if (i10 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i11 = 42 / 0;
            objArr[0] = str;
        }
    }

    static void onExtraCallback() {
        onWarmupCompleted = -4020520481278954266L;
        IAuthTabCallback = -1776194565;
        onExtraCallbackWithResult = (char) 27643;
    }
}
