package o;

import android.graphics.Color;
import im.toss.devtool.action.presentation.DevToolActionListViewModel;
import im.toss.security.impl.malware.MalwareDetectActivity$IAuthTabCallback;

/* loaded from: classes.dex */
public final class sendNetworkChangeEvent {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 0;
    static DevToolActionListViewModel keepFieldType = null;
    public static String onExtraCallback = null;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a(new char[]{63497, 44953, 63584, 17976, 63516, 41859, 11178, 7827, 24406, 16150, 33447, 51001, 46605, 38864, 55698, 43059, 3574, 28842, 12632, 4441, 25768, 10614, 34864, 63950, 48022, 33355, 61370, 41639, 4955, 31504, 18135, 2914, 27191, 54257, 40341, 60483, 49632, 36026, 62826, 21833, 6397, 25984, 19490, 15811, 32646, 56922, 41736, 59014, 55162, 46897, 64221, 20376, 11815, 28633, 20909, 12372, 34061, 51443, 43389, 39218, 56542, 41400, 'K', 16867, 13244, 6761}, Color.argb(0, 0, 0, 0), objArr);
        onExtraCallback = ((String) objArr[0]).intern();
        int i = onNavigationEvent + 67;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 9;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] = MalwareDetectActivity$IAuthTabCallback.onExtraCallback.e(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4], timelineExternalSyntheticLambda0.onExtraCallbackWithResult, IAuthTabCallback);
            tryTriggerOnStart.d(timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0);
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i5 = $10 + 59;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = -3302443750409530688L;
    }
}
