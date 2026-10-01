package im.toss.ads_sdk.ui.v2.activity;

import o.TextFieldKeyInputExternalSyntheticLambda9;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerV2Activity$onNavigationEvent {
    public static final /* synthetic */ int[] IAuthTabCallback;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    static {
        int[] iArr = new int[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.values().length];
        try {
            iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_STOP.ordinal()] = 2;
            int i = onExtraCallbackWithResult + 31;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        IAuthTabCallback = iArr;
        int i3 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
