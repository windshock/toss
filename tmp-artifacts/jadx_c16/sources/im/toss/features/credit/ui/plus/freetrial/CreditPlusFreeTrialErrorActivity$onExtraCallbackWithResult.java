package im.toss.features.credit.ui.plus.freetrial;

import im.toss.features.credit.ui.plus.freetrial.CreditPlusFreeTrialErrorActivity;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusFreeTrialErrorActivity$onExtraCallbackWithResult {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public static final /* synthetic */ int[] onWarmupCompleted;

    static {
        int[] iArr = new int[CreditPlusFreeTrialErrorActivity.onWarmupCompleted.values().length];
        try {
            iArr[CreditPlusFreeTrialErrorActivity.onWarmupCompleted.EXPIRED.ordinal()] = 1;
            int i = IAuthTabCallback + 1;
            onExtraCallback = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CreditPlusFreeTrialErrorActivity.onWarmupCompleted.ALREADY_REDEEMED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CreditPlusFreeTrialErrorActivity.onWarmupCompleted.CURRENTLY_SUBSCRIBED.ordinal()] = 3;
            int i4 = onExtraCallback + 73;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        onWarmupCompleted = iArr;
    }
}
