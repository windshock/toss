package im.toss.ads_sdk.ui.v2.activity;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsShortVideoV2Activity$$ExternalSyntheticLambda8 implements ValueAnimator.AnimatorUpdateListener {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ View f$0;
    public final /* synthetic */ float f$1;

    public /* synthetic */ NativeAdsShortVideoV2Activity$$ExternalSyntheticLambda8(View view, float f) {
        this.f$0 = view;
        this.f$1 = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsShortVideoV2Activity.onExtraCallback(this.f$0, this.f$1, valueAnimator);
        int i4 = onExtraCallbackWithResult + 91;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
