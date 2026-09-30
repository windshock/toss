package com.bytedance.sdk.component.adexpress.lt;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.av;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class sya extends FrameLayout {
    private TextView dj;
    private AnimatorSet lt;
    private dy lud;
    private ImageView sya;
    private Context ycx;
    private ImageView zb;

    public sya(@NonNull Context context) {
        super(context);
        this.lt = new AnimatorSet();
        this.ycx = context;
        lud();
        lt();
    }

    private void lud() {
        FrameLayout frameLayout = new FrameLayout(this.ycx);
        this.lud = new dy(this.ycx);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ycx, 95.0f), (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ycx, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.lud, layoutParams);
        this.zb = new ImageView(this.ycx);
        int iYcx = av.ycx(this.ycx, 60.0f);
        this.zb.setImageDrawable(com.bytedance.sdk.component.adexpress.dj.fby.ycx(1, null, null, new int[]{iYcx, iYcx}, Integer.valueOf(av.ycx(this.ycx, 1.0f)), Integer.valueOf(Color.parseColor("#80FFFFFF"))));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ycx, 75.0f), (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ycx, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.zb, layoutParams2);
        this.sya = new ImageView(this.ycx);
        int iYcx2 = av.ycx(this.ycx, 50.0f);
        this.sya.setImageDrawable(com.bytedance.sdk.component.adexpress.dj.fby.ycx(1, Integer.valueOf(Color.parseColor("#80FFFFFF")), null, new int[]{iYcx2, iYcx2}, null, null));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ycx, 63.0f), (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ycx, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.sya, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.ycx);
        this.dj = textView;
        textView.setTextColor(-1);
        this.dj.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.dj, layoutParams4);
    }

    private void lt() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.sya, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.setRepeatMode(2);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.sya, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.lt.setDuration(800L);
        this.lt.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void setGuideText(String str) {
        this.dj.setText(str);
    }

    public void ycx() {
        this.lt.start();
    }

    public void zb() {
        this.lt.cancel();
    }

    public void sya() {
        this.lud.ycx();
    }

    public void dj() {
        this.lud.zb();
        this.lud.sya();
    }
}
