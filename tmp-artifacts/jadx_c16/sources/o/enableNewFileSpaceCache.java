package o;

import im.toss.features.credit.ui.plus.intro.CreditPlusPaymentActivity;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class enableNewFileSpaceCache implements setSize<CreditPlusPaymentActivity> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public static void onNavigationEvent(CreditPlusPaymentActivity creditPlusPaymentActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        creditPlusPaymentActivity.tossRouter = sessionTrackerb;
        int i4 = onExtraCallback + 53;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void onWarmupCompleted(CreditPlusPaymentActivity creditPlusPaymentActivity, OptionMenu optionMenu) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        creditPlusPaymentActivity.tossPayAutoPaymentRegisterLauncher = optionMenu;
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        int i5 = onExtraCallback + 13;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }
}
