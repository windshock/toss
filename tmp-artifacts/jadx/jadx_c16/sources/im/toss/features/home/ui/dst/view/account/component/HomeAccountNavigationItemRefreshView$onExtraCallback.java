package im.toss.features.home.ui.dst.view.account.component;

import im.toss.features.home.ui.dst.view.account.component.HomeAccountNavigationItemRefreshView;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAccountNavigationItemRefreshView$onExtraCallback {
    public static final /* synthetic */ int[] IAuthTabCallback;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    static {
        int[] iArr = new int[HomeAccountNavigationItemRefreshView.onWarmupCompleted.values().length];
        try {
            iArr[HomeAccountNavigationItemRefreshView.onWarmupCompleted.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HomeAccountNavigationItemRefreshView.onWarmupCompleted.SUCCESS.ordinal()] = 2;
            int i = onNavigationEvent + 53;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HomeAccountNavigationItemRefreshView.onWarmupCompleted.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        IAuthTabCallback = iArr;
        int i3 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
