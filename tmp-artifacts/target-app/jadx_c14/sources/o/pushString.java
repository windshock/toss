package o;

import viva.republica.toss.send.SendActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class pushString implements setSize<SendActivity> {
    public static void onWarmupCompleted(SendActivity sendActivity, SessionTrackerb sessionTrackerb) {
        sendActivity.tossRouter = sessionTrackerb;
    }

    public static void onExtraCallbackWithResult(SendActivity sendActivity, Type type) {
        sendActivity.mydataHelper = type;
    }
}
