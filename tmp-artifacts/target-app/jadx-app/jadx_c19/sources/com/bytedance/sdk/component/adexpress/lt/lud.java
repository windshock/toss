package com.bytedance.sdk.component.adexpress.lt;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lud extends FrameLayout {
    private ImageView ycx;
    private AnimatorSet zb;

    public lud(Context context) {
        super(context);
        sya();
        dj();
    }

    private void sya() {
        ImageView imageView = new ImageView(getContext());
        this.ycx = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.wwx.dj(getContext(), "tt_white_hand"));
        int iYcx = (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(getContext(), 20.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iYcx, iYcx);
        layoutParams.gravity = 17;
        addView(this.ycx, layoutParams);
    }

    private void dj() {
        this.zb = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.ycx, "scaleX", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(2000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.ycx, "scaleY", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(2000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.zb.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void ycx() {
        AnimatorSet animatorSet = this.zb;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    public void zb() {
        AnimatorSet animatorSet = this.zb;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
