package im.toss.ads_sdk.playable;

import android.animation.ValueAnimator;
import android.view.View;
import o.nSetPosition;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsPlayableAdActivity$$ExternalSyntheticLambda13 implements ValueAnimator.AnimatorUpdateListener {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ View f$0;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {this.f$0, valueAnimator};
            NativeAdsPlayableAdActivity.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 809699335, -809699301, objArr);
            int i3 = 41 / 0;
        } else {
            Object[] objArr2 = {this.f$0, valueAnimator};
            NativeAdsPlayableAdActivity.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 809699335, -809699301, objArr2);
        }
        int i4 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
