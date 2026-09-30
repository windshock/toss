package com.bytedance.sdk.component.adexpress.lt;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb extends FrameLayout {
    private View dj;
    private int fby;
    private Context jc;
    private int jw;
    private View lt;
    private View lud;
    private boolean sya;
    private ImageView ul;
    private AnimatorSet ycx;
    private ObjectAnimator zb;

    public zb(Context context, int i2, int i3) {
        super(context);
        this.sya = false;
        this.ycx = new AnimatorSet();
        this.fby = i2;
        this.jw = i3;
        this.jc = context;
        sya();
        dj();
    }

    private void sya() {
        View view = new View(this.jc);
        this.dj = view;
        view.setBackground(ycx("#1A7BBEFF", "#337BBEFF"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (this.fby * 0.45d), (int) (this.jw * 0.45d));
        layoutParams.gravity = 17;
        this.dj.setLayoutParams(layoutParams);
        addView(this.dj);
        View view2 = new View(this.jc);
        this.lud = view2;
        view2.setBackground(ycx("#337BBEFF", "#807BBEFF"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (this.fby * 0.25d), (int) (this.jw * 0.25d));
        layoutParams2.gravity = 17;
        this.lud.setLayoutParams(layoutParams2);
        addView(this.lud);
        View view3 = new View(this.jc);
        this.lt = view3;
        view3.setBackground(ycx("#807BBEFF", "#FF7BBEFF"));
        int i2 = (int) (this.fby * 0.25d);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i2, i2);
        layoutParams3.gravity = 17;
        this.lt.setLayoutParams(layoutParams3);
        addView(this.lt);
        ImageView imageView = new ImageView(this.jc);
        this.ul = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.wwx.dj(getContext(), "tt_blue_hand"));
        this.ul.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) (this.fby * 0.62d), (int) (this.jw * 0.53d));
        layoutParams4.gravity = 17;
        layoutParams4.topMargin = (layoutParams4.width / 2) - 5;
        layoutParams4.leftMargin = (layoutParams4.height / 2) - 5;
        this.ul.setLayoutParams(layoutParams4);
        addView(this.ul);
    }

    private void dj() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.dj, "scaleX", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.dj, "scaleY", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.lud, "scaleX", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.lud, "scaleY", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.lt, "scaleX", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.lt, "scaleY", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.ul, "rotation", 0.0f, -20.0f, 0.0f);
        this.zb = objectAnimatorOfFloat7;
        objectAnimatorOfFloat7.setDuration(1000L);
        this.ycx.setDuration(1500L);
        this.ycx.setInterpolator(new AccelerateDecelerateInterpolator());
        this.ycx.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
        this.ycx.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.lt.zb.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (zb.this.sya) {
                    return;
                }
                zb.this.zb.start();
                zb.this.ycx.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                zb.this.sya = true;
            }
        });
    }

    private GradientDrawable ycx(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setStroke(1, Color.parseColor(str2));
        return gradientDrawable;
    }

    public void ycx() {
        this.sya = false;
        ObjectAnimator objectAnimator = this.zb;
        if (objectAnimator == null || this.ycx == null) {
            return;
        }
        objectAnimator.start();
        this.ycx.start();
    }

    public void zb() {
        this.sya = true;
        ObjectAnimator objectAnimator = this.zb;
        if (objectAnimator == null || this.ycx == null) {
            return;
        }
        objectAnimator.cancel();
        this.ycx.cancel();
    }
}
