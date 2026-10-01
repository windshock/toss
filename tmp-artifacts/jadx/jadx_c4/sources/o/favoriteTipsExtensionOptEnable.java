package o;

import im.toss.feature.credit.ui.history.list.CreditHistoryActivity;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class favoriteTipsExtensionOptEnable implements setSize<CreditHistoryActivity> {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static void IAuthTabCallback(CreditHistoryActivity creditHistoryActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        creditHistoryActivity.tossRouter = sessionTrackerb;
        if (i3 == 0) {
            throw null;
        }
    }

    public static void onExtraCallbackWithResult(CreditHistoryActivity creditHistoryActivity, getDummyAd getdummyad) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        creditHistoryActivity.standardTermsV2Intent = getdummyad;
        int i4 = onExtraCallback + 75;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
