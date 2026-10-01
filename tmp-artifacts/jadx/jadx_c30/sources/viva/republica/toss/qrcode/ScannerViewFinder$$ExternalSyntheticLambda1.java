package viva.republica.toss.qrcode;

import android.animation.ValueAnimator;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ScannerViewFinder$$ExternalSyntheticLambda1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ScannerViewFinder f$0;
    public final /* synthetic */ float f$1;

    public /* synthetic */ ScannerViewFinder$$ExternalSyntheticLambda1(ScannerViewFinder scannerViewFinder, float f) {
        this.f$0 = scannerViewFinder;
        this.f$1 = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ScannerViewFinder.onExtraCallbackWithResult(this.f$0, this.f$1, valueAnimator);
    }
}
