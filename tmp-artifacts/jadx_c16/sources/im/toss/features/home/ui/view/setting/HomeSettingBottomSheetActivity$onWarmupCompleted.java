package im.toss.features.home.ui.view.setting;

import o.checkAppNgSupport;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeSettingBottomSheetActivity$onWarmupCompleted {
    private static int IAuthTabCallback = 1;
    public static final /* synthetic */ int[] onExtraCallbackWithResult;
    private static int onNavigationEvent;

    static {
        int[] iArr = new int[checkAppNgSupport.values().length];
        try {
            iArr[checkAppNgSupport.ASSET_EDIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[checkAppNgSupport.ASSET_REGISTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[checkAppNgSupport.HIDE_AMOUNT.ordinal()] = 3;
            int i = onNavigationEvent + 47;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[checkAppNgSupport.USE_PASSWORD.ordinal()] = 4;
            int i4 = onNavigationEvent + 81;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused4) {
        }
        onExtraCallbackWithResult = iArr;
    }
}
