package im.toss.features.home.core.remote.model.cashflow.overview.item;

import im.toss.features.home.core.remote.model.cashflow.overview.item.CashflowItemResponse;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowItemResponse$onExtraCallback$onWarmupCompleted {
    private static int onExtraCallback = 1;
    public static final /* synthetic */ int[] onExtraCallbackWithResult;
    private static int onNavigationEvent;

    static {
        int[] iArr = new int[CashflowItemResponse.onExtraCallback.values().length];
        try {
            iArr[CashflowItemResponse.onExtraCallback.TRANSACTION.ordinal()] = 1;
            int i = onExtraCallback + 125;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CashflowItemResponse.onExtraCallback.BANNER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CashflowItemResponse.onExtraCallback.INVENTORY_SDK.ordinal()] = 3;
            int i4 = onNavigationEvent + 13;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        onExtraCallbackWithResult = iArr;
    }
}
