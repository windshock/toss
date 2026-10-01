package im.toss.features.credit.ui.plus.freetrial;

import o.AOMPFileTinyAppUtils;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusFreeTrialSchemeActivity$onExtraCallbackWithResult {
    private static int IAuthTabCallback = 0;
    public static final /* synthetic */ int[] onNavigationEvent;
    private static int onWarmupCompleted = 1;

    static {
        int[] iArr = new int[AOMPFileTinyAppUtils.values().length];
        try {
            iArr[AOMPFileTinyAppUtils.REDEEMABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AOMPFileTinyAppUtils.EXPIRED.ordinal()] = 2;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AOMPFileTinyAppUtils.ALREADY_REDEEMED.ordinal()] = 3;
            int i2 = IAuthTabCallback + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AOMPFileTinyAppUtils.CURRENTLY_SUBSCRIBED.ordinal()] = 4;
            int i5 = IAuthTabCallback + 59;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
        } catch (NoSuchFieldError unused4) {
        }
        onNavigationEvent = iArr;
    }
}
