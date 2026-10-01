package im.toss.ads_sdk.ui.v2.activity;

import androidx.lifecycle.LifecycleEventObserver;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerV2Activity$$ExternalSyntheticLambda11 implements LifecycleEventObserver {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$0;

    public final void onStateChanged(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {this.f$0, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult};
            int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            NativeAdsFullBannerV2Activity.onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -1321231162, iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 1321231168);
            throw null;
        }
        Object[] objArr2 = {this.f$0, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult};
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        NativeAdsFullBannerV2Activity.onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr2, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -1321231162, iOnExtraCallbackWithResult2, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 1321231168);
        int i3 = onNavigationEvent + 67;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }
}
