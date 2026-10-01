package im.toss.features.credit.ui.legacy.detail;

import o.connectWithOverlayPermission;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditStatusItemDetailActivity$IAuthTabCallback {
    public static final /* synthetic */ int[] onExtraCallback;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    static {
        int[] iArr = new int[connectWithOverlayPermission.values().length];
        try {
            iArr[connectWithOverlayPermission.LOAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[connectWithOverlayPermission.CARD.ordinal()] = 2;
            int i = onExtraCallbackWithResult + 3;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        onExtraCallback = iArr;
        int i3 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 61 / 0;
        }
    }
}
