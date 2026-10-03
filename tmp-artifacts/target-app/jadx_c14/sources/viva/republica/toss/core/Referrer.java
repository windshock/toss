package viva.republica.toss.core;

import android.content.Intent;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class Referrer {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final Referrer onExtraCallback;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onTransact = 1;
    private static long onWarmupCompleted;

    static {
        onWarmupCompleted();
        onExtraCallback = new Referrer();
        int i = IAuthTabCallback + 123;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private Referrer() {
    }

    public final Intent onExtraCallbackWithResult(@NotNull Intent intent, @NotNull String str) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(intent, "");
            Intrinsics.checkNotNullParameter(str, "");
            Object[] objArr = new Object[1];
            a(new char[]{2351, 2397, 10950, 21033, '~', 62013, 58227, 27429, 35265, 51545, 61602, 26081}, ViewConfiguration.getMaximumDrawingCacheSize() >> 66, objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(intent, "");
            Intrinsics.checkNotNullParameter(str, "");
            Object[] objArr2 = new Object[1];
            a(new char[]{2351, 2397, 10950, 21033, '~', 62013, 58227, 27429, 35265, 51545, 61602, 26081}, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr2);
            obj = objArr2[0];
        }
        Intent intentPutExtra = intent.putExtra(((String) obj).intern(), str);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
        int i3 = onExtraCallbackWithResult + 65;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return intentPutExtra;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 13;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 83 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14184), 19 - TextUtils.indexOf("", ""), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8807, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $10 + 35;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = -6145503625892420718L;
    }
}
