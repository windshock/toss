package im.toss.features.benefit.test;

import o.stopHCEInner;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitTestActivity$onExtraCallback {
    public static final /* synthetic */ int[] IAuthTabCallback;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    static {
        int[] iArr = new int[stopHCEInner.onExtraCallbackWithResult.values().length];
        try {
            iArr[stopHCEInner.onExtraCallbackWithResult.NO_TOSSBANK_ACCOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[stopHCEInner.onExtraCallbackWithResult.TOSSBANK_ACCOUNT.ordinal()] = 2;
            int i = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                int i2 = 4 / 5;
            } else {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        IAuthTabCallback = iArr;
        int i4 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
    }
}
