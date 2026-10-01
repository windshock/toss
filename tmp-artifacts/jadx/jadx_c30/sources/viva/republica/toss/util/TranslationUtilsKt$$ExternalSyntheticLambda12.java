package viva.republica.toss.util;

import android.animation.ValueAnimator;
import android.view.View;
import o.enableImagePrefetchingOnUiThreadAndroid;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TranslationUtilsKt$$ExternalSyntheticLambda12 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ TranslationUtilsKt$$ExternalSyntheticLambda12(View view, int i) {
        this.f$0 = view;
        this.f$1 = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        enableImagePrefetchingOnUiThreadAndroid.asBinder(this.f$0, this.f$1, valueAnimator);
    }
}
