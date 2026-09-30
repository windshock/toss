package im.toss.ads_sdk.ui.v2.activity;

import o.TextFieldKeyInputExternalSyntheticLambda9;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageV2Activity$onExtraCallback {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public static final /* synthetic */ int[] onNavigationEvent;

    static {
        int[] iArr = new int[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.values().length];
        try {
            iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_STOP.ordinal()] = 2;
            int i = onExtraCallback + 3;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        onNavigationEvent = iArr;
        int i3 = IAuthTabCallback + 105;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }
}
