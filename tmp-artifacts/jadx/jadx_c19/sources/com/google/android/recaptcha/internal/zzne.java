package com.google.android.recaptcha.internal;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zza' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzne implements zziv {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final zzne zzA;
    public static final zzne zzB;
    public static final zzne zzC;
    private static final zziw zzD;
    private static final /* synthetic */ zzne[] zzE;
    public static final zzne zza;
    public static final zzne zzb;
    public static final zzne zzc;
    public static final zzne zzd;
    public static final zzne zze;
    public static final zzne zzf;
    public static final zzne zzg;
    public static final zzne zzh;
    public static final zzne zzi;
    public static final zzne zzj;
    public static final zzne zzk;
    public static final zzne zzl;
    public static final zzne zzm;
    public static final zzne zzn;
    public static final zzne zzo;
    public static final zzne zzp;
    public static final zzne zzq;
    public static final zzne zzr;
    public static final zzne zzs;
    public static final zzne zzt;
    public static final zzne zzu;
    public static final zzne zzv;
    public static final zzne zzw;
    public static final zzne zzx;
    public static final zzne zzy;
    public static final zzne zzz;
    private final int zzF;

    static {
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(new char[]{54402, 54487, 31070, 44618, 22616, 63143, 39623, 7303, 35237, 19915, 64245}, ViewConfiguration.getEdgeSlop() >> 16, objArr);
        zzne zzneVar = new zzne(((String) objArr[0]).intern(), 0, 0);
        zza = zzneVar;
        zzne zzneVar2 = new zzne("INIT_NATIVE", 1, 1);
        zzb = zzneVar2;
        zzne zzneVar3 = new zzne("INIT_NETWORK", 2, 2);
        zzc = zzneVar3;
        zzne zzneVar4 = new zzne("INIT_NETWORK_MRI_ACTION", 3, 18);
        zzd = zzneVar4;
        zzne zzneVar5 = new zzne("INIT_DOWNLOAD_JS", 4, 19);
        zze = zzneVar5;
        zzne zzneVar6 = new zzne("INIT_JS", 5, 3);
        zzf = zzneVar6;
        zzne zzneVar7 = new zzne("INIT_TOTAL", 6, 4);
        zzg = zzneVar7;
        zzne zzneVar8 = new zzne("VALIDATE_INPUT", 7, 20);
        zzh = zzneVar8;
        zzne zzneVar9 = new zzne("DOWNLOAD_JS", 8, 21);
        zzi = zzneVar9;
        zzne zzneVar10 = new zzne("SAVE_CACHE_JS", 9, 22);
        zzj = zzneVar10;
        zzne zzneVar11 = new zzne("LOAD_CACHE_JS", 10, 23);
        zzk = zzneVar11;
        zzne zzneVar12 = new zzne("LOAD_WEBVIEW", 11, 24);
        zzl = zzneVar12;
        zzne zzneVar13 = new zzne("EXECUTE_NATIVE", 12, 5);
        zzm = zzneVar13;
        zzne zzneVar14 = new zzne("EXECUTE_JS", 13, 6);
        zzn = zzneVar14;
        zzne zzneVar15 = new zzne("EXECUTE_TOTAL", 14, 7);
        zzo = zzneVar15;
        zzne zzneVar16 = new zzne("COLLECT_SIGNALS", 15, 25);
        zzp = zzneVar16;
        zzne zzneVar17 = new zzne("FETCH_TOKEN", 16, 26);
        zzq = zzneVar17;
        zzne zzneVar18 = new zzne("POST_EXECUTE", 17, 27);
        zzr = zzneVar18;
        zzne zzneVar19 = new zzne("CHALLENGE_ACCOUNT_NATIVE", 18, 8);
        zzs = zzneVar19;
        zzne zzneVar20 = new zzne("CHALLENGE_ACCOUNT_JS", 19, 9);
        zzt = zzneVar20;
        zzne zzneVar21 = new zzne("CHALLENGE_ACCOUNT_TOTAL", 20, 10);
        zzu = zzneVar21;
        zzne zzneVar22 = new zzne("VERIFY_PIN_NATIVE", 21, 11);
        zzv = zzneVar22;
        zzne zzneVar23 = new zzne("VERIFY_PIN_JS", 22, 12);
        zzw = zzneVar23;
        zzne zzneVar24 = new zzne("VERIFY_PIN_TOTAL", 23, 13);
        zzx = zzneVar24;
        zzne zzneVar25 = new zzne("RUN_PROGRAM", 24, 14);
        zzy = zzneVar25;
        zzne zzneVar26 = new zzne("FETCH_ALLOWLIST", 25, 15);
        zzz = zzneVar26;
        zzne zzneVar27 = new zzne("JS_LOAD", 26, 16);
        zzA = zzneVar27;
        zzne zzneVar28 = new zzne("WEB_VIEW_RELOAD_JS", 27, 17);
        zzB = zzneVar28;
        zzne zzneVar29 = new zzne("UNRECOGNIZED", 28, -1);
        zzC = zzneVar29;
        zzE = new zzne[]{zzneVar, zzneVar2, zzneVar3, zzneVar4, zzneVar5, zzneVar6, zzneVar7, zzneVar8, zzneVar9, zzneVar10, zzneVar11, zzneVar12, zzneVar13, zzneVar14, zzneVar15, zzneVar16, zzneVar17, zzneVar18, zzneVar19, zzneVar20, zzneVar21, zzneVar22, zzneVar23, zzneVar24, zzneVar25, zzneVar26, zzneVar27, zzneVar28, zzneVar29};
        zzD = new zziw() { // from class: com.google.android.recaptcha.internal.zznd
        };
        int i2 = onNavigationEvent + 91;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private zzne(String str, int i2, int i3) {
        this.zzF = i3;
    }

    public static zzne[] values() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 109;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        zzne[] zzneVarArr = (zzne[]) zzE.clone();
        int i5 = onExtraCallbackWithResult + 79;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return zzneVarArr;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 31;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String string = Integer.toString(zza());
        int i5 = onExtraCallbackWithResult + 85;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    @Override // com.google.android.recaptcha.internal.zziv
    public final int zza() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 81;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == zzC) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        int i5 = this.zzF;
        int i6 = i4 + 23;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i2);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i4 = $11 + 69;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i6 = $11 + 53;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i8 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 45811), 84 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.getDefaultSize(0, 0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), TextUtils.lastIndexOf("", '0') + 20, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8807, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = -5672846309469410218L;
    }
}
