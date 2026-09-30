package im.toss.uikit.widget.underlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.VideoEncoderInfoImplExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class PulseRingView extends View {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub;
    private final ValueAnimator IAuthTabCallback;
    private final int onExtraCallback;
    private final float onExtraCallbackWithResult;
    private final Paint onNavigationEvent;
    private float onWarmupCompleted;

    public static /* synthetic */ void onWarmupCompleted(PulseRingView pulseRingView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 105;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(pulseRingView, valueAnimator);
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PulseRingView(@NotNull Context context, int i) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = i;
        this.onExtraCallbackWithResult = getResources().getDisplayMetrics().density;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        this.onNavigationEvent = paint;
        setVisibility(8);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(3000L);
        valueAnimatorOfFloat.setStartDelay(1300L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.underlay.PulseRingView$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 19;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                PulseRingView.onWarmupCompleted(this.f$0, valueAnimator);
                if (i4 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        valueAnimatorOfFloat.addListener(new IAuthTabCallback());
        this.IAuthTabCallback = valueAnimatorOfFloat;
    }

    private static final void onNavigationEvent(PulseRingView pulseRingView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        pulseRingView.onWarmupCompleted = valueAnimator.getAnimatedFraction();
        pulseRingView.invalidate();
        int i4 = IAuthTabCallbackDefault + 87;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class IAuthTabCallback extends AnimatorListenerAdapter {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        IAuthTabCallback() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            PulseRingView.this.setVisibility(0);
            int i4 = onNavigationEvent + 97;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 89;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (this.IAuthTabCallback.isRunning()) {
            return;
        }
        this.onWarmupCompleted = 0.0f;
        this.IAuthTabCallback.start();
        int i4 = IAuthTabCallbackStub + 95;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback.cancel();
        setVisibility(8);
        this.onWarmupCompleted = 0.0f;
        invalidate();
        int i4 = IAuthTabCallbackDefault + 67;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 49;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback();
            super.onDetachedFromWindow();
            int i3 = IAuthTabCallbackStub + 25;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        onExtraCallback();
        super.onDetachedFromWindow();
        throw null;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 15;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        if (getWidth() > 0) {
            int i4 = IAuthTabCallbackDefault + 9;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                getHeight();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (getHeight() > 0) {
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                IAuthTabCallback(canvas, width, height, this.onWarmupCompleted, 0.35f, this.onExtraCallbackWithResult * 1.5f);
                IAuthTabCallback(canvas, width, height, (this.onWarmupCompleted + 0.5f) % 1.0f, 0.25f, this.onExtraCallbackWithResult);
            }
        }
    }

    private final void IAuthTabCallback(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        float f6 = 1.0f - f3;
        float f7 = 1.0f - (f6 * f6);
        this.onNavigationEvent.setColor(VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(this.onExtraCallback, RangesKt___RangesKt.coerceIn((int) ((1.0f - f7) * f4 * 255.0f), 0, 255)));
        this.onNavigationEvent.setStrokeWidth(f5);
        canvas.drawCircle(f, f2, this.onExtraCallbackWithResult * 100.0f * ((f7 * 1.4f) + 0.1f), this.onNavigationEvent);
        int i4 = IAuthTabCallbackStub + 63;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
