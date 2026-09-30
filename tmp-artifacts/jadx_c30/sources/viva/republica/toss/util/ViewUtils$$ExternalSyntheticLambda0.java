package viva.republica.toss.util;

import android.animation.ValueAnimator;
import android.widget.TextView;
import o.enableIOSViewClipToPaddingBox;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ViewUtils$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ TextView f$0;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        enableIOSViewClipToPaddingBox.onExtraCallbackWithResult(this.f$0, valueAnimator);
    }
}
