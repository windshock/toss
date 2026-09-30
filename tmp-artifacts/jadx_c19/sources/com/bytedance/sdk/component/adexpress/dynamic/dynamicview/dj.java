package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dj extends lt {
    private int htf;
    private Runnable thx;
    ObjectAnimator ycx;
    ObjectAnimator zb;

    /* JADX INFO: Access modifiers changed from: private */
    public void ycx() {
        final View childAt = getChildAt(this.htf);
        final View childAt2 = getChildAt((this.htf + 1) % getChildCount());
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt, "translationY", 0.0f, (-(this.fby + getChildAt(this.htf).getHeight())) / 2);
        this.ycx = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.ycx.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dj.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt.setVisibility(8);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(childAt2, "translationY", (this.fby + childAt2.getHeight()) / 2, 0.0f);
        this.zb = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        this.zb.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dj.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                childAt2.setVisibility(0);
            }
        });
        this.ycx.setDuration(500L);
        this.zb.setDuration(500L);
        this.ycx.start();
        this.zb.start();
        int i2 = this.htf + 1;
        this.htf = i2;
        this.htf = i2 % getChildCount();
        postDelayed(this.thx, 2000L);
    }

    public dj(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar) {
        super(context, dynamicRootView, fbyVar);
        this.htf = 0;
        this.thx = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dj.1
            @Override // java.lang.Runnable
            public void run() {
                dj.this.ycx();
            }
        };
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin = (this.fby - layoutParams.height) / 2;
            childAt.setLayoutParams(layoutParams);
            if (i2 != 0) {
                childAt.setVisibility(8);
            }
        }
        postDelayed(this.thx, 2500L);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.kgy
    public void zb() {
        removeCallbacks(this.thx);
        ObjectAnimator objectAnimator = this.ycx;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.ycx.cancel();
        }
        ObjectAnimator objectAnimator2 = this.zb;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.zb.cancel();
        }
        super.zb();
    }
}
