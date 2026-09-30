package im.toss.ads_sdk.ui.activity;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsShortVideoActivity$$ExternalSyntheticLambda25 implements ValueAnimator.AnimatorUpdateListener {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ View f$0;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsShortVideoActivity.onWarmupCompleted(this.f$0, valueAnimator);
        if (i3 == 0) {
            throw null;
        }
    }
}
