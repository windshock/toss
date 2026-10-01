package im.toss.features.home.presentation.widget;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateInterpolator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionCalendarView$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ ConsumptionCalendarView f$1;
    public final /* synthetic */ AccelerateInterpolator f$2;

    public /* synthetic */ ConsumptionCalendarView$$ExternalSyntheticLambda0(int i, ConsumptionCalendarView consumptionCalendarView, AccelerateInterpolator accelerateInterpolator) {
        this.f$0 = i;
        this.f$1 = consumptionCalendarView;
        this.f$2 = accelerateInterpolator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ConsumptionCalendarView.onExtraCallback(this.f$0, this.f$1, this.f$2, valueAnimator);
        int i4 = onWarmupCompleted + 15;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
