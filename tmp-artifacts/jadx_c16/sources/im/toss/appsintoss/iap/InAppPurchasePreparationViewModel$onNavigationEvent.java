package im.toss.appsintoss.iap;

import im.toss.appsintoss.iap.model.InAppPurchaseProductAuthorizer;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class InAppPurchasePreparationViewModel$onNavigationEvent {
    public static final /* synthetic */ int[] IAuthTabCallback;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    static {
        int[] iArr = new int[InAppPurchaseProductAuthorizer.values().length];
        try {
            iArr[InAppPurchaseProductAuthorizer.TOSS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InAppPurchaseProductAuthorizer.PARTNER.ordinal()] = 2;
            int i = onNavigationEvent + 119;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        IAuthTabCallback = iArr;
        int i4 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
    }
}
