package com.bytedance.adsdk.zb.lt;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class ycx extends ValueAnimator {
    private final Set<ValueAnimator.AnimatorUpdateListener> ycx = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorListener> zb = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorPauseListener> sya = new CopyOnWriteArraySet();

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.ycx.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.ycx.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.ycx.clear();
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.zb.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.zb.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.zb.clear();
    }

    void ycx(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.zb) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.sya.add(animatorPauseListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.sya.remove(animatorPauseListener);
    }

    void ycx() {
        Iterator<Animator.AnimatorListener> it = this.zb.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    void zb(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.zb) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    void zb() {
        Iterator<Animator.AnimatorListener> it = this.zb.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    void sya() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.ycx.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    void dj() {
        Iterator<Animator.AnimatorPauseListener> it = this.sya.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    void lud() {
        Iterator<Animator.AnimatorPauseListener> it = this.sya.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }
}
