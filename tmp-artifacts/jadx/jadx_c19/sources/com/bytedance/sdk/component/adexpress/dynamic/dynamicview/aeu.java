package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class aeu extends lt {
    private int htf;
    private boolean thx;
    private Runnable wwx;
    ObjectAnimator ycx;
    ObjectAnimator zb;

    public aeu(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar) {
        super(context, dynamicRootView, fbyVar);
        this.htf = 0;
        this.thx = false;
        this.wwx = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.aeu.1
            @Override // java.lang.Runnable
            public void run() {
                aeu.this.ycx();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ycx() {
        View childAt;
        final View childAt2;
        final View childAt3 = getChildAt(this.htf);
        int i2 = this.htf;
        if (i2 == 0) {
            this.thx = false;
        }
        boolean z = i2 + 1 >= getChildCount() || ((ViewGroup) getChildAt(this.htf + 1)).getChildCount() <= 0;
        if (!this.ry.jc().lud().ycx() && z) {
            this.thx = true;
            childAt2 = getChildAt(this.htf - 1);
            this.ycx = ObjectAnimator.ofFloat(childAt3, "translationY", 0.0f, (this.fby + getChildAt(this.htf).getHeight()) / 2);
        } else {
            if (z) {
                childAt = getChildAt((this.htf + 2) % getChildCount());
            } else {
                childAt = getChildAt((this.htf + 1) % getChildCount());
            }
            this.ycx = ObjectAnimator.ofFloat(childAt3, "translationY", 0.0f, (-(this.fby + getChildAt(this.htf).getHeight())) / 2);
            if (z) {
                this.htf++;
            }
            childAt2 = childAt;
        }
        this.ycx.setInterpolator(new LinearInterpolator());
        this.ycx.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.aeu.2
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
                childAt3.setVisibility(8);
            }
        });
        if (this.thx) {
            this.zb = ObjectAnimator.ofFloat(childAt2, "translationY", (-(this.fby + childAt2.getHeight())) / 2, 0.0f);
        } else {
            this.zb = ObjectAnimator.ofFloat(childAt2, "translationY", (this.fby + childAt2.getHeight()) / 2, 0.0f);
        }
        this.zb.setInterpolator(new LinearInterpolator());
        this.zb.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.aeu.3
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
        if (this.thx) {
            this.htf--;
        } else {
            int i3 = this.htf + 1;
            this.htf = i3;
            this.htf = i3 % getChildCount();
        }
        postDelayed(this.wwx, 3000L);
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
        postDelayed(this.wwx, 2500L);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.kgy
    public void zb() {
        removeCallbacks(this.wwx);
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
