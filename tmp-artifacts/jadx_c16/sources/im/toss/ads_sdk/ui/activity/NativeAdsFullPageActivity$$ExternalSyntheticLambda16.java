package im.toss.ads_sdk.ui.activity;

import androidx.lifecycle.LifecycleEventObserver;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageActivity$$ExternalSyntheticLambda16 implements LifecycleEventObserver {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$0;

    public final void onStateChanged(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            NativeAdsFullPageActivity.onWarmupCompleted(this.f$0, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
            int i3 = 37 / 0;
        } else {
            NativeAdsFullPageActivity.onWarmupCompleted(this.f$0, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
        }
        int i4 = onNavigationEvent + 85;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
