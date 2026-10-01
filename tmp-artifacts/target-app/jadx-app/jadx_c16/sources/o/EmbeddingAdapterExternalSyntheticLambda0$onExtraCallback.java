package o;

import im.toss.appsintoss.iap.model.InAppPurchaseProductAuthorizer;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EmbeddingAdapterExternalSyntheticLambda0$onExtraCallback {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final /* synthetic */ int[] onWarmupCompleted;

    static {
        int[] iArr = new int[InAppPurchaseProductAuthorizer.values().length];
        try {
            iArr[InAppPurchaseProductAuthorizer.TOSS.ordinal()] = 1;
            int i = onExtraCallbackWithResult + 39;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InAppPurchaseProductAuthorizer.PARTNER.ordinal()] = 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        onWarmupCompleted = iArr;
        int i4 = onExtraCallbackWithResult + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
