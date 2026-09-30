package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.R;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.DrawingDelegate;
import java.util.List;
import o.SearchBarKtExternalSyntheticLambda21;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class IndeterminateDrawable<S extends BaseProgressIndicatorSpec> extends DrawableWithAnimatedVisibilityChange {
    private IndeterminateAnimatorDelegate<ObjectAnimator> animatorDelegate;
    private DrawingDelegate<S> drawingDelegate;
    private Drawable staticDummyDrawable;

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean hideNow() {
        return super.hideNow();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isHiding() {
        return super.isHiding();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isShowing() {
        return super.isShowing();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        super.registerAnimationCallback(animationCallback);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i2) {
        super.setAlpha(i2);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@Nullable ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2, boolean z3) {
        return super.setVisible(z, z2, z3);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        return super.unregisterAnimationCallback(animationCallback);
    }

    IndeterminateDrawable(@NonNull Context context, @NonNull BaseProgressIndicatorSpec baseProgressIndicatorSpec, @NonNull DrawingDelegate<S> drawingDelegate, @NonNull IndeterminateAnimatorDelegate<ObjectAnimator> indeterminateAnimatorDelegate) {
        super(context, baseProgressIndicatorSpec);
        setDrawingDelegate(drawingDelegate);
        setAnimatorDelegate(indeterminateAnimatorDelegate);
    }

    public static IndeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return createLinearDrawable(context, linearProgressIndicatorSpec, new LinearDrawingDelegate(linearProgressIndicatorSpec));
    }

    static IndeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec, @NonNull LinearDrawingDelegate linearDrawingDelegate) {
        LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate;
        if (linearProgressIndicatorSpec.indeterminateAnimationType == 0) {
            linearIndeterminateDisjointAnimatorDelegate = new LinearIndeterminateContiguousAnimatorDelegate(linearProgressIndicatorSpec);
        } else {
            linearIndeterminateDisjointAnimatorDelegate = new LinearIndeterminateDisjointAnimatorDelegate(context, linearProgressIndicatorSpec);
        }
        return new IndeterminateDrawable<>(context, linearProgressIndicatorSpec, linearDrawingDelegate, linearIndeterminateDisjointAnimatorDelegate);
    }

    public static IndeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(@NonNull Context context, @NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return createCircularDrawable(context, circularProgressIndicatorSpec, new CircularDrawingDelegate(circularProgressIndicatorSpec));
    }

    static IndeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(@NonNull Context context, @NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec, @NonNull CircularDrawingDelegate circularDrawingDelegate) {
        CircularIndeterminateRetreatAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate;
        if (circularProgressIndicatorSpec.indeterminateAnimationType == 1) {
            circularIndeterminateAdvanceAnimatorDelegate = new CircularIndeterminateRetreatAnimatorDelegate(context, circularProgressIndicatorSpec);
        } else {
            circularIndeterminateAdvanceAnimatorDelegate = new CircularIndeterminateAdvanceAnimatorDelegate(circularProgressIndicatorSpec);
        }
        IndeterminateDrawable<CircularProgressIndicatorSpec> indeterminateDrawable = new IndeterminateDrawable<>(context, circularProgressIndicatorSpec, circularDrawingDelegate, circularIndeterminateAdvanceAnimatorDelegate);
        indeterminateDrawable.setStaticDummyDrawable(SearchBarKtExternalSyntheticLambda21.onNavigationEvent(context.getResources(), R.drawable.ic_mtrl_arrow_circle, (Resources.Theme) null));
        return indeterminateDrawable;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    boolean setVisibleInternal(boolean z, boolean z2, boolean z3) {
        Drawable drawable;
        boolean visibleInternal = super.setVisibleInternal(z, z2, z3);
        if (isSystemAnimatorDisabled() && (drawable = this.staticDummyDrawable) != null) {
            return drawable.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.animatorDelegate.cancelAnimatorImmediately();
        }
        if (!z || !z3) {
            return visibleInternal;
        }
        this.animatorDelegate.startAnimator();
        return visibleInternal;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.drawingDelegate.getPreferredWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.drawingDelegate.getPreferredHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Drawable drawable;
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.clipBounds)) {
            if (isSystemAnimatorDisabled() && (drawable = this.staticDummyDrawable) != null) {
                drawable.setBounds(getBounds());
                this.staticDummyDrawable.setTint(this.baseSpec.indicatorColors[0]);
                this.staticDummyDrawable.draw(canvas);
                return;
            }
            canvas.save();
            this.drawingDelegate.validateSpecAndAdjustCanvas(canvas, getBounds(), getGrowFraction(), isShowing(), isHiding());
            int i2 = this.baseSpec.indicatorTrackGapSize;
            int alpha = getAlpha();
            BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.baseSpec;
            boolean z = (baseProgressIndicatorSpec instanceof LinearProgressIndicatorSpec) || ((baseProgressIndicatorSpec instanceof CircularProgressIndicatorSpec) && ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indeterminateTrackVisible);
            boolean z2 = z && i2 == 0 && !baseProgressIndicatorSpec.hasWavyEffect(false);
            if (z2) {
                this.drawingDelegate.fillTrack(canvas, this.paint, 0.0f, 1.0f, this.baseSpec.trackColor, alpha, 0);
            } else if (z) {
                DrawingDelegate.ActiveIndicator activeIndicator = this.animatorDelegate.activeIndicators.get(0);
                List<DrawingDelegate.ActiveIndicator> list = this.animatorDelegate.activeIndicators;
                DrawingDelegate.ActiveIndicator activeIndicator2 = list.get(list.size() - 1);
                DrawingDelegate<S> drawingDelegate = this.drawingDelegate;
                if (drawingDelegate instanceof LinearDrawingDelegate) {
                    drawingDelegate.fillTrack(canvas, this.paint, 0.0f, activeIndicator.startFraction, this.baseSpec.trackColor, alpha, i2);
                    this.drawingDelegate.fillTrack(canvas, this.paint, activeIndicator2.endFraction, 1.0f, this.baseSpec.trackColor, alpha, i2);
                } else {
                    canvas.save();
                    canvas.rotate(activeIndicator2.rotationDegree);
                    this.drawingDelegate.fillTrack(canvas, this.paint, activeIndicator2.endFraction, 1.0f + activeIndicator.startFraction, this.baseSpec.trackColor, alpha, i2);
                    canvas.restore();
                }
            }
            for (int i3 = 0; i3 < this.animatorDelegate.activeIndicators.size(); i3++) {
                DrawingDelegate.ActiveIndicator activeIndicator3 = this.animatorDelegate.activeIndicators.get(i3);
                activeIndicator3.phaseFraction = getPhaseFraction();
                this.drawingDelegate.fillIndicator(canvas, this.paint, activeIndicator3, getAlpha());
                if (i3 > 0 && !z2 && z) {
                    this.drawingDelegate.fillTrack(canvas, this.paint, this.animatorDelegate.activeIndicators.get(i3 - 1).endFraction, activeIndicator3.startFraction, this.baseSpec.trackColor, alpha, i2);
                }
            }
            canvas.restore();
        }
    }

    private boolean isSystemAnimatorDisabled() {
        AnimatorDurationScaleProvider animatorDurationScaleProvider = this.animatorDurationScaleProvider;
        return animatorDurationScaleProvider != null && animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.context.getContentResolver()) == 0.0f;
    }

    public Drawable getStaticDummyDrawable() {
        return this.staticDummyDrawable;
    }

    public void setStaticDummyDrawable(@Nullable Drawable drawable) {
        this.staticDummyDrawable = drawable;
    }

    IndeterminateAnimatorDelegate<ObjectAnimator> getAnimatorDelegate() {
        return this.animatorDelegate;
    }

    void setAnimatorDelegate(@NonNull IndeterminateAnimatorDelegate<ObjectAnimator> indeterminateAnimatorDelegate) {
        this.animatorDelegate = indeterminateAnimatorDelegate;
        indeterminateAnimatorDelegate.registerDrawable(this);
    }

    DrawingDelegate<S> getDrawingDelegate() {
        return this.drawingDelegate;
    }

    void setDrawingDelegate(@NonNull DrawingDelegate<S> drawingDelegate) {
        this.drawingDelegate = drawingDelegate;
    }
}
