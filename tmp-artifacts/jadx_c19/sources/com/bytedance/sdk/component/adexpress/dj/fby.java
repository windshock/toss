package com.bytedance.sdk.component.adexpress.dj;

import android.graphics.drawable.GradientDrawable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class fby {
    public static GradientDrawable ycx(int i2, Integer num, int[] iArr, int[] iArr2, Integer num2, Integer num3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(i2);
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        int length = iArr != null ? iArr.length : 0;
        if (length == 1) {
            gradientDrawable.setCornerRadius(iArr[0]);
        } else if (length == 4) {
            float f = iArr[0];
            float f2 = iArr[1];
            float f3 = iArr[2];
            float f4 = iArr[3];
            gradientDrawable.setCornerRadii(new float[]{f, f, f2, f2, f3, f3, f4, f4});
        }
        if (iArr2 != null && iArr2.length == 2) {
            gradientDrawable.setSize(iArr2[0], iArr2[1]);
        }
        if (num2 != null && num3 != null) {
            gradientDrawable.setStroke(num2.intValue(), num3.intValue());
        }
        return gradientDrawable;
    }
}
