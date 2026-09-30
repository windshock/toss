package com.bytedance.adsdk.ugeno.ul.ycx;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb extends ycx {
    public zb(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ul.ycx.ycx
    public Drawable zb(int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i2);
        return gradientDrawable;
    }
}
