package o;

import im.toss.global.features.leave.test.GlobalLeaveTestActivity;

/* loaded from: classes.dex */
public final class monitorRenderInit implements setSize<GlobalLeaveTestActivity> {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static void onExtraCallback(GlobalLeaveTestActivity globalLeaveTestActivity, whetherAllowAccessFromFileURL whetherallowaccessfromfileurl) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        globalLeaveTestActivity.testApi = whetherallowaccessfromfileurl;
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
        int i5 = onNavigationEvent + 61;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 27 / 0;
        }
    }

    public static void IAuthTabCallback(GlobalLeaveTestActivity globalLeaveTestActivity, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        globalLeaveTestActivity.environments = zzadVar;
        int i4 = onWarmupCompleted + 69;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
