package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class sya extends lt {
    private int htf;
    private boolean thx;
    private Runnable wwx;
    ObjectAnimator ycx;
    ObjectAnimator zb;

    public sya(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar) {
        super(context, dynamicRootView, fbyVar);
        this.htf = 0;
        this.thx = false;
        this.wwx = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sya.1
            @Override // java.lang.Runnable
            public void run() {
                sya.this.ycx();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ycx() {
        final View childAt;
        final View childAt2 = getChildAt(this.htf);
        if (childAt2 != null) {
            int i2 = this.htf;
            if (i2 == 0) {
                this.thx = false;
            }
            if (i2 + 1 >= getChildCount() || ((ViewGroup) getChildAt(this.htf + 1)).getChildCount() <= 0) {
                this.thx = true;
                childAt = getChildAt(this.htf - 1);
                this.ycx = ObjectAnimator.ofFloat(childAt2, "translationX", 0.0f, (this.ul + getChildAt(this.htf).getWidth()) / 2);
            } else {
                childAt = getChildAt(this.htf + 1);
                this.ycx = ObjectAnimator.ofFloat(childAt2, "translationX", 0.0f, (-(this.ul + getChildAt(this.htf).getWidth())) / 2);
            }
            if (childAt == null) {
                return;
            }
            this.ycx.setInterpolator(new LinearInterpolator());
            this.ycx.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sya.2
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
                    childAt2.setVisibility(8);
                }
            });
            if (this.thx) {
                this.zb = ObjectAnimator.ofFloat(childAt, "translationX", (-(this.ul + childAt.getWidth())) / 2, 0.0f);
            } else {
                this.zb = ObjectAnimator.ofFloat(childAt, "translationX", (this.ul + childAt.getWidth()) / 2, 0.0f);
            }
            this.zb.setInterpolator(new LinearInterpolator());
            this.zb.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sya.3
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
                    childAt.setVisibility(0);
                }
            });
            this.ycx.setDuration(500L);
            this.zb.setDuration(500L);
            this.ycx.start();
            this.zb.start();
            if (this.thx) {
                this.htf--;
            } else {
                this.htf++;
            }
            postDelayed(this.wwx, 2000L);
        }
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
