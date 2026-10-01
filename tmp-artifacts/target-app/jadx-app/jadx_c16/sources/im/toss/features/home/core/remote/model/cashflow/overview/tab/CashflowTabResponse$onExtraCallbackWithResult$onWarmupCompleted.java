package im.toss.features.home.core.remote.model.cashflow.overview.tab;

import im.toss.features.home.core.remote.model.cashflow.overview.tab.CashflowTabResponse;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowTabResponse$onExtraCallbackWithResult$onWarmupCompleted {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public static final /* synthetic */ int[] onNavigationEvent;

    static {
        int[] iArr = new int[CashflowTabResponse.onExtraCallbackWithResult.values().length];
        try {
            iArr[CashflowTabResponse.onExtraCallbackWithResult.PRESENCE.ordinal()] = 1;
            int i = onExtraCallback + 13;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CashflowTabResponse.onExtraCallbackWithResult.ABSENCE.ordinal()] = 2;
            int i3 = IAuthTabCallback + 73;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        onNavigationEvent = iArr;
    }
}
