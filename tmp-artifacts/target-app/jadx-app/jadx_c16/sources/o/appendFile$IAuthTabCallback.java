package o;

import viva.republica.toss.network.model.electronicdocument.wallet.submit.DocumentWalletSubmittedDoc;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class appendFile$IAuthTabCallback {
    private static int IAuthTabCallback = 0;
    public static final /* synthetic */ int[] onNavigationEvent;
    private static int onWarmupCompleted = 1;

    static {
        int[] iArr = new int[DocumentWalletSubmittedDoc.onExtraCallback.values().length];
        try {
            iArr[DocumentWalletSubmittedDoc.onExtraCallback.NOT_OPENED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DocumentWalletSubmittedDoc.onExtraCallback.OPENED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DocumentWalletSubmittedDoc.onExtraCallback.SUBMIT_CANCELED.ordinal()] = 3;
            int i = onWarmupCompleted + 25;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DocumentWalletSubmittedDoc.onExtraCallback.REJECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        onNavigationEvent = iArr;
        int i4 = onWarmupCompleted + 27;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
