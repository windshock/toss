package com.bytedance.sdk.component.adexpress.lt;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class fby extends thx {
    private ImageView dj;
    private AnimatorSet lt;
    private int lud;
    private ImageView sya;
    private TextView ycx;
    private ImageView zb;

    @Override // com.bytedance.sdk.component.adexpress.lt.thx
    protected void ycx(Context context) {
    }

    public fby(Context context) {
        super(context);
        this.lt = new AnimatorSet();
        zb(context);
    }

    private void zb(Context context) {
        addView(com.bytedance.sdk.component.adexpress.sya.ycx.zb(context));
        this.zb = (ImageView) findViewById(2097610751);
        this.sya = (ImageView) findViewById(2097610750);
        this.dj = (ImageView) findViewById(2097610749);
        this.ycx = (TextView) findViewById(2097610748);
    }

    public void setButtonText(String str) {
        if (this.ycx == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.ycx.setText(str);
    }

    private void dj() {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "alphaColor", 0, 60);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.setDuration(2000L);
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.start();
    }

    public float getAlphaColor() {
        return this.lud;
    }

    public void setAlphaColor(int i2) {
        if (i2 < 0 || i2 > 60) {
            return;
        }
        int i3 = i2 + 195;
        ImageView imageView = this.dj;
        int iRgb = Color.rgb(i3, i3, i3);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(iRgb, mode);
        int i4 = ((i2 + 20) % 60) + 195;
        this.sya.setColorFilter(Color.rgb(i4, i4, i4), mode);
        int i5 = ((i2 + 40) % 60) + 195;
        this.zb.setColorFilter(Color.rgb(i5, i5, i5), mode);
    }

    @Override // com.bytedance.sdk.component.adexpress.lt.thx
    public void ycx() {
        dj();
    }

    @Override // com.bytedance.sdk.component.adexpress.lt.thx
    public void zb() {
        this.lt.cancel();
    }
}
