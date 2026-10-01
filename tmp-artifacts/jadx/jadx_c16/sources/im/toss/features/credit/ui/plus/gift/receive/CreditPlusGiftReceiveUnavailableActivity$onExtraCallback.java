package im.toss.features.credit.ui.plus.gift.receive;

import im.toss.features.credit.data.response.membership.CreditGiftRedeemStatus;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftReceiveUnavailableActivity$onExtraCallback {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final /* synthetic */ int[] onWarmupCompleted;

    static {
        int[] iArr = new int[CreditGiftRedeemStatus.values().length];
        try {
            iArr[CreditGiftRedeemStatus.SENDER.ordinal()] = 1;
            int i = onExtraCallbackWithResult + 101;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CreditGiftRedeemStatus.INVALID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CreditGiftRedeemStatus.REDEEMABLE.ordinal()] = 3;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CreditGiftRedeemStatus.ALREADY_REDEEMED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CreditGiftRedeemStatus.EXPIRED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[CreditGiftRedeemStatus.CANCELLED.ordinal()] = 6;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[CreditGiftRedeemStatus.UNDER_AGE.ordinal()] = 7;
            int i5 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
        } catch (NoSuchFieldError unused7) {
        }
        onWarmupCompleted = iArr;
    }
}
