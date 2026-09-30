package com.google.android.recaptcha.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.MissingResourceException;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbf {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    private static boolean onExtraCallback;
    private static boolean onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onTransact;
    private static char[] onWarmupCompleted;
    public static final zzbe zza;
    private static zzmo zzb;
    private final String zzc;
    private final zzac zzd;
    private final zznc zze;
    private final long zzf;

    static {
        onWarmupCompleted();
        zza = new zzbe(null);
        int i2 = IAuthTabCallback + 109;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public zzbf(@NotNull zzbb zzbbVar, @NotNull String str, @NotNull zzac zzacVar) {
        this.zzc = str;
        this.zzd = zzacVar;
        zznc zzncVarZzi = zznf.zzi();
        this.zze = zzncVarZzi;
        this.zzf = System.currentTimeMillis();
        zzncVarZzi.zzp(zzbbVar.zza());
        zzncVarZzi.zzd(zzbbVar.zzb());
        zzncVarZzi.zzr(zzbbVar.zzc());
        if (zzbbVar.zzd() != null) {
            zzncVarZzi.zzu(zzbbVar.zzd());
            int i2 = IAuthTabCallbackStub + 29;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        zzncVarZzi.zzt(zzmg.zzc(zzmg.zzb(System.currentTimeMillis())));
        int i4 = onTransact + 89;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zznf zza(@NotNull int i2, @Nullable zzmr zzmrVar, @NotNull Context context) {
        String iSO3Language;
        String iSO3Country = "";
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 69;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.zzf;
            zznc zzncVar = this.zze;
            zzncVar.zze(jCurrentTimeMillis - j);
            zzncVar.zzv(i2);
            if (zzmrVar != null) {
                this.zze.zzq(zzmrVar);
            }
        } else {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            long j2 = this.zzf;
            zznc zzncVar2 = this.zze;
            zzncVar2.zze(jCurrentTimeMillis2 - j2);
            zzncVar2.zzv(i2);
            if (zzmrVar != null) {
            }
        }
        if (zzb == null) {
            zzb = zzb(context);
        }
        try {
            iSO3Language = Locale.getDefault().getISO3Language();
        } catch (MissingResourceException unused) {
            iSO3Language = "";
        }
        try {
            iSO3Country = Locale.getDefault().getISO3Country();
        } catch (MissingResourceException unused2) {
        }
        zznc zzncVar3 = this.zze;
        String str = this.zzc;
        zznq zznqVarZzf = zznr.zzf();
        zznqVarZzf.zzq(str);
        zzmo zzmoVarZzb = zzb;
        Object obj = null;
        if (zzmoVarZzb == null) {
            int i5 = IAuthTabCallbackStub + 45;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                zzb(context);
                obj.hashCode();
                throw null;
            }
            zzmoVarZzb = zzb(context);
        }
        zznqVarZzf.zzd(zzmoVarZzb);
        zznqVarZzf.zzp(iSO3Language);
        zznqVarZzf.zze(iSO3Country);
        zzncVar3.zzs((zznr) zznqVarZzf.zzj());
        zznf zznfVar = (zznf) this.zze.zzj();
        int i6 = onTransact + 109;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            return zznfVar;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057 A[Catch: NameNotFoundException -> 0x0092, PHI: r1
      0x0057: PHI (r1v14 int) = (r1v25 int), (r1v26 int) binds: [B:11:0x0055, B:7:0x0036] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {NameNotFoundException -> 0x0092, blocks: (B:5:0x0032, B:16:0x0077, B:18:0x008d, B:12:0x0057, B:15:0x0072, B:10:0x0053), top: B:33:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077 A[Catch: NameNotFoundException -> 0x0092, PHI: r1
      0x0077: PHI (r1v15 int) = (r1v20 int), (r1v21 int) binds: [B:11:0x0055, B:7:0x0036] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {NameNotFoundException -> 0x0092, blocks: (B:5:0x0032, B:16:0x0077, B:18:0x008d, B:12:0x0057, B:15:0x0072, B:10:0x0053), top: B:33:0x0015 }] */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.google.android.recaptcha.internal.zzin, com.google.android.recaptcha.internal.zzmn] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final zzmo zzb(Context context) throws Throwable {
        String strIntern;
        ?? ValueOf;
        int i2 = 2 % 2;
        int i3 = onTransact + 41;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (i4 == 0) {
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-126, -123, -124, -126, -125, -126, -127}, 50 / (Process.myTid() / 8), objArr);
            ?? Intern = ((String) objArr[0]).intern();
            i4 = Intern;
            i4 = Intern;
            if (Build.VERSION.SDK_INT >= 94) {
                int i5 = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)).metaData.getInt("com.google.android.gms.version", -1);
                if (i5 == -1) {
                    Object[] objArr2 = new Object[1];
                    a(null, null, new byte[]{-126, -123, -124, -126, -125, -126, -127}, View.MeasureSpec.makeMeasureSpec(0, 0) + 127, objArr2);
                    strIntern = ((String) objArr2[0]).intern();
                    ValueOf = i4;
                } else {
                    strIntern = String.valueOf(i5);
                    ValueOf = i4;
                }
            } else {
                int i6 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getInt("com.google.android.gms.version", -1);
                if (i6 != -1) {
                    strIntern = String.valueOf(i6);
                    ValueOf = i4;
                } else {
                    Object[] objArr22 = new Object[1];
                    a(null, null, new byte[]{-126, -123, -124, -126, -125, -126, -127}, View.MeasureSpec.makeMeasureSpec(0, 0) + 127, objArr22);
                    strIntern = ((String) objArr22[0]).intern();
                    ValueOf = i4;
                }
            }
        } else {
            Object[] objArr3 = new Object[1];
            a(null, null, new byte[]{-126, -123, -124, -126, -125, -126, -127}, (Process.myTid() >> 22) + 127, objArr3);
            ?? Intern2 = ((String) objArr3[0]).intern();
            i4 = Intern2;
            i4 = Intern2;
            if (Build.VERSION.SDK_INT >= 33) {
            }
        }
        try {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 33) {
                int i8 = onTransact + 23;
                IAuthTabCallbackStub = i8 % 128;
                int i9 = i8 % 2;
                ValueOf = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)).getLongVersionCode());
            } else {
                ValueOf = i7 >= 28 ? String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode()) : String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        ?? Zzf = zzmo.zzf();
        Zzf.zzd(Build.VERSION.SDK_INT);
        Zzf.zzq(strIntern);
        Zzf.zzs("18.4.0");
        Zzf.zzp(Build.MODEL);
        Zzf.zzr(Build.MANUFACTURER);
        Zzf.zze(ValueOf);
        return (zzmo) Zzf.zzj();
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onWarmupCompleted;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 95;
                $10 = i6 % 128;
                int i7 = i6 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 77 - (KeyEvent.getMaxKeyCode() >> 16), 20952 - ExpandableListView.getPackedPositionType(j), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    i3 = 2;
                    j = 0;
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
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 75 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i8 = 1052772399;
            if (onExtraCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i9 = $11 + 59;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i2] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i8);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 63 - Color.argb(0, 0, 0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i11 = $10 + 15;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    i8 = 1052772399;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onExtraCallbackWithResult) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 63 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 12214 - (ViewConfiguration.getWindowTouchSlop() >> 8), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i13 = $11 + 75;
                $10 = i13 % 128;
                int i14 = i13 % 2;
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = new char[]{32271, 32278, 32273, 32277, 32269};
        onNavigationEvent = -1184334204;
        onExtraCallbackWithResult = true;
        onExtraCallback = true;
    }
}
