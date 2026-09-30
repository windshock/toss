package im.toss.extensions;

import android.animation.ValueAnimator;
import android.view.View;
import o.transparentBackground;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ViewsKt$$ExternalSyntheticLambda17 implements ValueAnimator.AnimatorUpdateListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ View f$0;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            transparentBackground.onNavigationEvent(this.f$0, valueAnimator);
            int i3 = 46 / 0;
        } else {
            transparentBackground.onNavigationEvent(this.f$0, valueAnimator);
        }
        int i4 = IAuthTabCallback + 91;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
