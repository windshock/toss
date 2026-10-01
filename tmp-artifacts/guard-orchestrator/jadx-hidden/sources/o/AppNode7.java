package o;

import im.toss.devtool.runtime.ui.scheme.history.SchemeHistoryActivity;

/* loaded from: classes.dex */
public final class AppNode7 implements setSize<SchemeHistoryActivity> {
    static int onExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(AppNode7.class);

    public static void IAuthTabCallback(SchemeHistoryActivity schemeHistoryActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4780);
        int i3 = i2 & iOnWarmupCompleted;
        int i4 = ((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 13) & 1;
        Object obj = null;
        schemeHistoryActivity.tossRouter = sessionTrackerb;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = onExtraCallback;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2717);
        if (((((i5 | iOnWarmupCompleted2) & (~(i5 & iOnWarmupCompleted2))) >> 25) & 1) != 0) {
            throw null;
        }
    }
}
