package im.toss.ads_sdk.ui.activity;

import o.TextFieldKeyInputExternalSyntheticLambda9;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerActivity$onNavigationEvent {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public static final /* synthetic */ int[] onWarmupCompleted;

    static {
        int[] iArr = new int[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.values().length];
        try {
            iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START.ordinal()] = 1;
            int i = onExtraCallback + 39;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_STOP.ordinal()] = 2;
            int i4 = IAuthTabCallback + 87;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        onWarmupCompleted = iArr;
    }
}
