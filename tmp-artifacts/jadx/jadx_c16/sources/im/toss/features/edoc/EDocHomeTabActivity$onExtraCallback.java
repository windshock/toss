package im.toss.features.edoc;

import viva.republica.toss.network.model.electronicdocument.wallet.EDocStatus;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocHomeTabActivity$onExtraCallback {
    public static final /* synthetic */ int[] onExtraCallback;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    static {
        int[] iArr = new int[EDocStatus.values().length];
        try {
            iArr[EDocStatus.APPLY_AWAIT.ordinal()] = 1;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EDocStatus.ISSUE_SUCCESS.ordinal()] = 2;
            int i2 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 / 5;
            } else {
                int i4 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EDocStatus.ISSUE_FAILURE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        onExtraCallback = iArr;
        int i5 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }
}
