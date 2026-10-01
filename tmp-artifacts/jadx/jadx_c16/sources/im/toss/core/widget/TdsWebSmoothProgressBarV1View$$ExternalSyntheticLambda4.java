package im.toss.core.widget;

import android.animation.ValueAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TdsWebSmoothProgressBarV1View$$ExternalSyntheticLambda4 implements ValueAnimator.AnimatorUpdateListener {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ TdsWebSmoothProgressBarV1View f$0;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TdsWebSmoothProgressBarV1View.onWarmupCompleted(this.f$0, valueAnimator);
        if (i3 == 0) {
            throw null;
        }
    }
}
