package o;

import im.toss.features.mobileid.impl.view.MobileIdIssueOtherVcFragment;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class readName implements setSize<MobileIdIssueOtherVcFragment> {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public static void onExtraCallback(MobileIdIssueOtherVcFragment mobileIdIssueOtherVcFragment, getBigDecimal getbigdecimal) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        mobileIdIssueOtherVcFragment.walletErrorHandler = getbigdecimal;
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
        int i5 = onExtraCallback + 111;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void onExtraCallbackWithResult$76cff768(MobileIdIssueOtherVcFragment mobileIdIssueOtherVcFragment, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        mobileIdIssueOtherVcFragment.mobileIdManager = obj;
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallback + 93;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
