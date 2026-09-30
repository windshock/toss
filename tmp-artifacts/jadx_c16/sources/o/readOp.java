package o;

import im.toss.features.mobileid.impl.view.MobileIdIssueNoIcNationalFragment;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class readOp implements setSize<MobileIdIssueNoIcNationalFragment> {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static void onExtraCallbackWithResult(MobileIdIssueNoIcNationalFragment mobileIdIssueNoIcNationalFragment, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        mobileIdIssueNoIcNationalFragment.tossRouter = sessionTrackerb;
        int i4 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
