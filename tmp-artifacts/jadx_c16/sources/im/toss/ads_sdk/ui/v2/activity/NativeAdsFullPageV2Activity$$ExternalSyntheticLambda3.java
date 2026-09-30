package im.toss.ads_sdk.ui.v2.activity;

import androidx.lifecycle.LifecycleEventObserver;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageV2Activity$$ExternalSyntheticLambda3 implements LifecycleEventObserver {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$0;

    public final void onStateChanged(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsFullPageV2Activity.onNavigationEvent(this.f$0, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
        int i4 = onNavigationEvent + 25;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
