package im.toss.ads_sdk.ui.activity;

import androidx.lifecycle.LifecycleEventObserver;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerActivity$$ExternalSyntheticLambda5 implements LifecycleEventObserver {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$0;

    public final void onStateChanged(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            NativeAdsFullBannerActivity.onExtraCallbackWithResult(this.f$0, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
            throw null;
        }
        NativeAdsFullBannerActivity.onExtraCallbackWithResult(this.f$0, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
        int i3 = onWarmupCompleted + 93;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }
}
