package im.toss.features.account.impl.model;

import o.queryTabBarInfo;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BankAccount$onExtraCallback {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    static {
        int[] iArr = new int[queryTabBarInfo.values().length];
        try {
            iArr[queryTabBarInfo.TOSS_FAMILY.ordinal()] = 1;
            int i = onNavigationEvent + 109;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        $EnumSwitchMapping$0 = iArr;
        int i4 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
