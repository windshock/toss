package com.bytedance.sdk.component.adexpress.lt;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class tn extends FrameLayout {
    private float dj;
    private float fby;
    private Drawable lt;
    private Drawable lud;
    private float sya;
    private double ul;
    LinearLayout ycx;
    LinearLayout zb;
    private static final int jw = (com.bytedance.sdk.component.adexpress.dynamic.lud.ea.zb("", 0.0f, true)[1] / 2) + 1;
    private static final int jc = (com.bytedance.sdk.component.adexpress.dynamic.lud.ea.zb("", 0.0f, true)[1] / 2) + 3;

    public tn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ycx = new LinearLayout(getContext());
        this.zb = new LinearLayout(getContext());
        this.ycx.setOrientation(0);
        this.ycx.setGravity(8388611);
        this.zb.setOrientation(0);
        this.zb.setGravity(8388611);
        this.lud = com.bytedance.sdk.component.utils.wwx.sya(context, "tt_star_thick");
        this.lt = com.bytedance.sdk.component.utils.wwx.sya(context, "tt_star");
    }

    public Drawable getStarEmptyDrawable() {
        return this.lud;
    }

    public Drawable getStarFillDrawable() {
        return this.lt;
    }

    public void ycx(double d, int i2, int i3, int i4) {
        float f = i3;
        this.sya = (int) com.bytedance.sdk.component.adexpress.dj.ul.sya(getContext(), f);
        this.dj = (int) com.bytedance.sdk.component.adexpress.dj.ul.sya(getContext(), f);
        this.ul = d;
        this.fby = i4;
        removeAllViews();
        for (int i5 = 0; i5 < 5; i5++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i2, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.zb.addView(starImageView);
        }
        for (int i6 = 0; i6 < 5; i6++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.ycx.addView(starImageView2);
        }
        addView(this.ycx);
        addView(this.zb);
        requestLayout();
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.sya, (int) this.dj));
        imageView.setPadding(1, jw, 1, jc);
        return imageView;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.ycx.measure(i2, i3);
        double d = this.ul;
        float f = this.sya;
        this.zb.measure(View.MeasureSpec.makeMeasureSpec((int) ((r0 * f) + 1.0f + ((f - 2.0f) * (d - ((int) d)))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.ycx.getMeasuredHeight(), 1073741824));
        if (this.fby > 0.0f) {
            this.ycx.setPadding(0, ((int) (r8.getMeasuredHeight() - this.fby)) / 2, 0, 0);
            this.zb.setPadding(0, ((int) (this.ycx.getMeasuredHeight() - this.fby)) / 2, 0, 0);
        }
    }
}
