package o;

import android.os.Process;
import android.view.ViewConfiguration;
import im.toss.devtool.sharedpref.presentation.SharedPrefEditViewModel;
import o.s5a;

/* loaded from: classes.dex */
public final class getTabBar {
    private static int $10 = 0;
    private static int $11 = 1;
    public static String IAuthTabCallback = null;
    static SharedPrefEditViewModel keepFieldType = null;
    private static long onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static char[] onWarmupCompleted;

    static {
        onExtraCallback();
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, (Process.myPid() >> 22) + 63, (char) (16640 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr);
        IAuthTabCallback = ((String) objArr[0]).intern();
        int i = onExtraCallbackWithResult + 13;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $11 + 15;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                jArr[i5] = s5a.onExtraCallbackWithResult.b(getPageByNodeId.c(onWarmupCompleted[i + i5]), i5, onExtraCallback, c);
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                jArr[i6] = s5a.onExtraCallbackWithResult.b(getPageByNodeId.c(onWarmupCompleted[i + i6]), i6, onExtraCallback, c);
            }
            HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $10 + 31;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
                int i8 = 44 / 0;
            } else {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
            }
        }
        objArr[0] = new String(cArr);
    }

    static void onExtraCallback() {
        onWarmupCompleted = new char[]{44221, 15719, 36678, 6458, 60355, 30193, 51091, 20968, 8768, 35967, 7694, 59434, 31443, 50429, 22172, 8440, 45383, 770, 60713, 32732, 51689, 23430, 9648, 46676, 'a', 37404, 31862, 52942, 22766, 10903, 46243, 1363, 38778, 24894, 62409, 24058, 12165, 47533, 2638, 37928, 26167, 61490, 17113, 11500, 48793, 2230, 39264, 27492, 62737, 18380, 53709, 41866, 3493, 40534, 26710, 64015, 17441, 54989, 41173, 12945, 40120, 27991, 65404};
        onExtraCallback = 6587475846729726986L;
    }
}
