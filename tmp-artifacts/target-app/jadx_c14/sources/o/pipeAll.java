package o;

import viva.republica.toss.guest.DevSupportSuperLoginActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class pipeAll implements setSize<DevSupportSuperLoginActivity> {
    public static void onExtraCallbackWithResult(DevSupportSuperLoginActivity devSupportSuperLoginActivity, SessionTrackerb sessionTrackerb) {
        devSupportSuperLoginActivity.tossRouter = sessionTrackerb;
    }

    public static void onNavigationEvent(DevSupportSuperLoginActivity devSupportSuperLoginActivity, notifyVerticalEdgeReached notifyverticaledgereached) {
        devSupportSuperLoginActivity.guestLoginManager = notifyverticaledgereached;
    }

    public static void onWarmupCompleted(DevSupportSuperLoginActivity devSupportSuperLoginActivity, calcThumbnailOptions calcthumbnailoptions) {
        devSupportSuperLoginActivity.userOnboardingLogManager = calcthumbnailoptions;
    }
}
