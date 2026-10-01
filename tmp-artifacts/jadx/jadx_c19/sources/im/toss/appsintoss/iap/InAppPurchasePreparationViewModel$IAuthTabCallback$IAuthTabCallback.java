package im.toss.appsintoss.iap;

import o.WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchasePreparationViewModel$IAuthTabCallback$IAuthTabCallback {
    private static int IAuthTabCallback = 1;
    public static final /* synthetic */ int[] onExtraCallback;
    private static int onNavigationEvent;

    static {
        int[] iArr = new int[WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0.values().length];
        try {
            iArr[WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0.CatalogNotFoundError.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0.UnableToHandleError.ordinal()] = 2;
            int i2 = onNavigationEvent + 19;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        onExtraCallback = iArr;
        int i4 = onNavigationEvent + 123;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
    }
}
