package o;

import im.toss.features.credit.ui.plus.gift.receive.CreditPlusGiftTutorialActivity;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ImageMatcher1 implements setSize<CreditPlusGiftTutorialActivity> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static void onExtraCallbackWithResult(CreditPlusGiftTutorialActivity creditPlusGiftTutorialActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        creditPlusGiftTutorialActivity.tossRouter = sessionTrackerb;
        int i4 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
