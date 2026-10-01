package com.bytedance.adsdk.ugeno.ycx;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class fby implements ul {
    private float dj;
    private float lt;
    private float lud;
    private float sya;
    private View ycx;
    private float zb;

    public fby(View view) {
        this.ycx = view;
    }

    public void ycx(float f) {
        View view = this.ycx;
        if (view != null) {
            this.zb = f;
            Drawable background = view.getBackground();
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setCornerRadius(f);
            }
        }
    }

    public float ycx() {
        return this.zb;
    }

    public void zb(float f) {
        View view = this.ycx;
        if (view == null) {
            return;
        }
        this.sya = f;
        view.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.ul
    public float getRipple() {
        return this.sya;
    }

    public void sya(float f) {
        View view = this.ycx;
        if (view == null) {
            return;
        }
        this.dj = f;
        view.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.ul
    public float getShine() {
        return this.dj;
    }

    public void dj(float f) {
        this.lud = f;
        this.ycx.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.ul
    public float getStretch() {
        return this.lud;
    }

    public void lud(float f) {
        this.lt = f;
        this.ycx.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.ul
    public float getRubIn() {
        return this.lt;
    }

    public void ycx(int i2) {
        View view = this.ycx;
        if (view != null) {
            Drawable background = view.getBackground();
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setColor(i2);
            } else if (background instanceof ColorDrawable) {
                ((ColorDrawable) background.mutate()).setColor(i2);
            }
        }
    }
}
