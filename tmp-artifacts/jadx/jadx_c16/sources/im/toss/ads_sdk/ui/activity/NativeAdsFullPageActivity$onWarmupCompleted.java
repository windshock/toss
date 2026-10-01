package im.toss.ads_sdk.ui.activity;

import o.TextFieldKeyInputExternalSyntheticLambda9;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageActivity$onWarmupCompleted {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public static final /* synthetic */ int[] onNavigationEvent;

    static {
        int[] iArr = new int[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.values().length];
        try {
            iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START.ordinal()] = 1;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_STOP.ordinal()] = 2;
            int i2 = onExtraCallbackWithResult + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        onNavigationEvent = iArr;
        int i5 = onExtraCallback + 97;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }
}
