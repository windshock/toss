package im.toss.core.widget;

import android.animation.ValueAnimator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TdsWebSmoothProgressBarV1View$$ExternalSyntheticLambda2 implements ValueAnimator.AnimatorUpdateListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ TdsWebSmoothProgressBarV1View f$0;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TdsWebSmoothProgressBarV1View.onExtraCallbackWithResult(this.f$0, valueAnimator);
        int i4 = onExtraCallback + 111;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
