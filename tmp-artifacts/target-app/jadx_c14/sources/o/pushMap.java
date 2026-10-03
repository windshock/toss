package o;

import viva.republica.toss.send.AbsCompactSendActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class pushMap implements setSize<AbsCompactSendActivity> {
    public static void onExtraCallback(AbsCompactSendActivity absCompactSendActivity, getJSMessageQueueThread getjsmessagequeuethread) {
        absCompactSendActivity.transferKycHelper = getjsmessagequeuethread;
    }

    public static void onExtraCallbackWithResult(AbsCompactSendActivity absCompactSendActivity, SessionTrackerb sessionTrackerb) {
        absCompactSendActivity.tossRouter = sessionTrackerb;
    }
}
