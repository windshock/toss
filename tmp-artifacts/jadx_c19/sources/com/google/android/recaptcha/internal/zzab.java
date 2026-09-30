package com.google.android.recaptcha.internal;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzab {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 23579;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 38741;
    private static char onNavigationEvent = 17536;
    private static char onWarmupCompleted = 15569;
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzab() throws Throwable {
        Object[] objArr = new Object[1];
        a(new char[]{49034, 8997, 16076, 53370, 58859, 46547, 50953, 61798, 52024, 51698, 50847, 38733, 44600, 37296, 25016, 61780, 15538, 35568, 1394, 61574, 18036, 48317, 33636, 38466, 42187, 22382, 44600, 37296, 25016, 61780, 15538, 35568, 1394, 61574, 2939, 58485, 15008, 3907, 41595, 60248}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40, objArr);
        this(((String) objArr[0]).intern());
    }

    public zzab(@NotNull String str) throws Throwable {
        Object[] objArr = new Object[1];
        a(new char[]{49034, 8997, 16076, 53370, 58859, 46547, 50953, 61798, 52024, 51698, 50847, 38733, 44600, 37296, 25016, 61780, 15538, 35568, 1394, 61574, 18036, 48317, 33636, 38466, 42187, 22382, 44600, 37296, 25016, 61780, 15538, 35568, 1394, 61574, 2939, 58485, 15008, 3907, 41595, 60248}, 40 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        this.zza = strIntern;
        this.zzb = strIntern.concat("/mri");
        this.zzc = strIntern.concat("/mlg");
        this.zzd = strIntern.concat("/mal");
        this.zze = strIntern.concat("/mrr");
    }

    public final String zza() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 75;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return this.zza;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String zzb() {
        int i2 = 2 % 2;
        int i3 = asInterface + 69;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        String str = this.zzb;
        int i6 = i4 + 51;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String zzc() {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 99;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        String str = this.zzc;
        int i6 = i3 + 87;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String zzd() {
        int i2 = 2 % 2;
        int i3 = asInterface + 91;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return this.zze;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $11 + 19;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i7 = 58224;
            int i8 = i4;
            while (i8 < 16) {
                int i9 = $10 + 117;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i11 = (c2 + i7) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i12 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                    objArr2[2] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int iArgb = 10 - Color.argb(i4, i4, i4, i4);
                        int i13 = 12435 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(keyRepeatTimeout, iArgb, i13, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 1), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9, MotionEvent.axisFromString("") + 12435, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16013 - TextUtils.lastIndexOf("", '0', 0, 0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 13, View.getDefaultSize(0, 0) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }
}
