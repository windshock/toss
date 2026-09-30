package com.alibaba.griver.base.common.utils;

import android.content.Context;
import android.view.View;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class DensityUtil {
    public static float a;
    public static float b;

    public static void a(Context context) {
        try {
            if (a == 0.0f) {
                a = context.getResources().getDisplayMetrics().density;
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(Context context) {
        try {
            if (b == 0.0f) {
                b = context.getResources().getDisplayMetrics().scaledDensity;
            }
        } catch (Throwable unused) {
        }
    }

    public static int dip2px(Context context, float f) {
        a(context);
        return (int) ((f * a) + 0.5f);
    }

    public static float getFontSize(float f) {
        if (f == 0.875f) {
            return 14.0f;
        }
        if (f == 1.0f) {
            return 16.0f;
        }
        if (f == 1.125f) {
            return 18.0f;
        }
        if (f == 1.25f) {
            return 20.0f;
        }
        return f == 1.375f ? 22.0f : 16.0f;
    }

    public static int getRelativeLeft(View view) {
        return view.getId() == 16908290 ? view.getLeft() : view.getLeft() + getRelativeLeft((View) view.getParent());
    }

    public static int getRelativeTop(View view) {
        return view.getId() == 16908290 ? view.getTop() : view.getTop() + getRelativeTop((View) view.getParent());
    }

    public static float getScale(int i2) {
        if (i2 == 0) {
            return 0.875f;
        }
        if (i2 == 1) {
            return 1.0f;
        }
        if (i2 == 2) {
            return 1.125f;
        }
        if (i2 != 3) {
            return i2 != 4 ? 1.0f : 1.375f;
        }
        return 1.25f;
    }

    public static float getTextSize(float f, int i2) {
        return getScale(i2) * f;
    }

    public static boolean isValueEqule(float f, float f2) {
        return ((int) f) == ((int) f2);
    }

    public static int px2dip(Context context, float f) {
        a(context);
        return (int) ((f / a) + 0.5f);
    }

    public static float px2sp(Context context, float f) {
        b(context);
        return f / b;
    }

    public static int sp2px(Context context, float f) {
        b(context);
        return (int) ((f * b) + 0.5f);
    }
}
