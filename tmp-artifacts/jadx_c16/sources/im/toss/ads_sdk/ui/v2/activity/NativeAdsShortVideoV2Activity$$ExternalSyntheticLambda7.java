package im.toss.ads_sdk.ui.v2.activity;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsShortVideoV2Activity$$ExternalSyntheticLambda7 implements ValueAnimator.AnimatorUpdateListener {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ View f$0;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsShortVideoV2Activity.onWarmupCompleted(this.f$0, valueAnimator);
        int i4 = onNavigationEvent + 15;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
    }
}
