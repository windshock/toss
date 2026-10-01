package com.bytedance.sdk.component.adexpress.dynamic.animation.ycx;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.kgy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class dj implements kgy {
    public View sya;
    com.bytedance.sdk.component.adexpress.dynamic.dj.ycx zb;
    private Set<ScheduledFuture<?>> dj = new HashSet();
    public List<ObjectAnimator> ycx = ycx();

    abstract List<ObjectAnimator> ycx();

    public dj(View view, com.bytedance.sdk.component.adexpress.dynamic.dj.ycx ycxVar) {
        this.sya = view;
        this.zb = ycxVar;
    }

    public void sya() {
        List<ObjectAnimator> list = this.ycx;
        if (list != null) {
            for (final ObjectAnimator objectAnimator : list) {
                objectAnimator.start();
                if (this.zb.wie() > 0.0d) {
                    objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ycx.dj.1
                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationRepeat(Animator animator) {
                            objectAnimator.pause();
                            ycx ycxVar = dj.this.new ycx(objectAnimator);
                            ScheduledFuture<?> scheduledFutureYcx = com.bytedance.sdk.component.adexpress.dj.dj.ycx(ycxVar, (long) (dj.this.zb.wie() * 1000.0d), TimeUnit.MILLISECONDS);
                            ycxVar.ycx(scheduledFutureYcx);
                            dj.this.dj.add(scheduledFutureYcx);
                        }
                    });
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.kgy
    public void zb() {
        List<ObjectAnimator> list = this.ycx;
        if (list != null) {
            for (ObjectAnimator objectAnimator : list) {
                objectAnimator.cancel();
                objectAnimator.removeAllUpdateListeners();
            }
            Iterator<ScheduledFuture<?>> it = this.dj.iterator();
            while (it.hasNext()) {
                it.next().cancel(true);
            }
        }
    }

    ObjectAnimator ycx(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.zb.xkz() * 1000.0d));
        if (this.zb.syc() > 0) {
            objectAnimator.setRepeatCount(this.zb.syc() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!"normal".equals(this.zb.dy())) {
            if ("alternate".equals(this.zb.dy()) || "alternate-reverse".equals(this.zb.dy())) {
                objectAnimator.setRepeatMode(2);
            } else {
                objectAnimator.setRepeatMode(1);
            }
        }
        if ("ease-in-out".equals(this.zb.ry())) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.zb.dy())) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.zb.dy())) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ycx.dj.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    dj.this.sya.setVisibility(0);
                    if (dj.this.sya.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt) {
                        ((View) dj.this.sya.getParent()).setVisibility(0);
                    }
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }

    public class ycx implements Runnable {
        ObjectAnimator ycx;
        ScheduledFuture<?> zb;

        ycx(ObjectAnimator objectAnimator) {
            this.ycx = objectAnimator;
        }

        public void ycx(ScheduledFuture<?> scheduledFuture) {
            this.zb = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bytedance.sdk.component.adexpress.ycx.ycx.ycx.ycx().sya() != null) {
                com.bytedance.sdk.component.adexpress.ycx.ycx.ycx.ycx().sya().sya().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ycx.dj.ycx.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ycx.this.ycx.resume();
                    }
                });
                if (this.zb != null) {
                    dj.this.dj.remove(this.zb);
                }
            }
        }
    }
}
