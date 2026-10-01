package o;

import im.toss.features.credit.ui.plus.gift.send.CreditPlusGiftLinkActivity;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ImageMatcher9 implements setSize<CreditPlusGiftLinkActivity> {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static void IAuthTabCallback(CreditPlusGiftLinkActivity creditPlusGiftLinkActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        creditPlusGiftLinkActivity.tossRouter = sessionTrackerb;
        int i4 = onNavigationEvent + 65;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
    }

    public static void onExtraCallbackWithResult(CreditPlusGiftLinkActivity creditPlusGiftLinkActivity, hasRootStatusPermission hasrootstatuspermission) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        creditPlusGiftLinkActivity.creditPlusApi = hasrootstatuspermission;
        int i4 = onNavigationEvent + 31;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
