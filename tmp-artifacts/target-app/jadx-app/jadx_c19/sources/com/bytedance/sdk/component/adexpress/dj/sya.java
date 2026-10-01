package com.bytedance.sdk.component.adexpress.dj;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.sdk.component.adexpress.dynamic.dj.ul;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class sya {
    public static Drawable ycx(Context context, ul ulVar) {
        if (context == null || ulVar == null) {
            return null;
        }
        return ycx(context, (int) ul.ycx(context, ulVar.wie()), ulVar.dy(), ulVar.bhi());
    }

    public static Drawable ycx(Context context, int i2, int i3, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        if (context != null) {
            gradientDrawable.setStroke(i2, i3);
        }
        gradientDrawable.setColor(i4);
        return gradientDrawable;
    }
}
