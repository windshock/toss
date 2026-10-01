package o;

import im.toss.base.BaseActivity;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DistinctElementSidecarCallback implements setSize<BaseActivity> {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static void onWarmupCompleted(BaseActivity baseActivity, BaseActivity.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        baseActivity.deps = iAuthTabCallback;
        int i4 = onWarmupCompleted + 111;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
    }
}
