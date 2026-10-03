package o;

import viva.republica.toss.main.service.HappyTalkActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AdSDKNotificationListenerSDKEventKey implements setSize<HappyTalkActivity> {
    public static void onExtraCallback(HappyTalkActivity happyTalkActivity, ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0) {
        happyTalkActivity.unique = constraintsSizeResolverExternalSyntheticLambda0;
    }

    public static void onWarmupCompleted(HappyTalkActivity happyTalkActivity, SessionTrackerb sessionTrackerb) {
        happyTalkActivity.tossRouter = sessionTrackerb;
    }
}
