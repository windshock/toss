package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setWriteAbortCountokhttp {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static long onWarmupCompleted = -6945414078158546991L;

    public static final String IAuthTabCallback(int i, @NotNull String str, boolean z) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = Long.toString((i & 4278190080L) >> 24, CharsKt.IAuthTabCallback(16));
        Intrinsics.checkNotNullExpressionValue(string, "");
        String str2 = String.format("%2s", Arrays.copyOf(new Object[]{string}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        String string2 = Integer.toString(i & 16777215, CharsKt.IAuthTabCallback(16));
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String str3 = String.format("%6s", Arrays.copyOf(new Object[]{string2}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "");
        if (!z) {
            int i5 = onExtraCallbackWithResult;
            int i6 = i5 + 15;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 47;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 5 / 3;
            }
            str2 = "";
        }
        Object[] objArr = new Object[1];
        a(new char[]{54554, 54570, 62238, 34141, 20872}, TextUtils.indexOf("", "", 0) + 1, objArr);
        String strReplace$default = StringsKt.replace$default(str + str2 + str3, " ", ((String) objArr[0]).intern(), false, 4, (Object) null);
        int i10 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i10 % 128;
        int i11 = i10 % 2;
        return strReplace$default;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 55;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 29;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45811 - TextUtils.lastIndexOf("", '0')), 84 - (ViewConfiguration.getScrollDefaultDelay() >> 16), Color.blue(0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getFadingEdgeLength() >> 16)), Drawable.resolveOpacity(0, 0) + 19, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 8807, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
}
