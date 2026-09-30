package com.bytedance.adsdk.ugeno.fby;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.TypedValue;
import com.bytedance.adsdk.ugeno.lt;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class fby {
    private static TypedValue sya;
    private static final Object zb = new Object();
    public static Handler ycx = new Handler(Looper.getMainLooper());

    public static float ycx(Context context, String str) throws NumberFormatException {
        float f;
        float f2 = context.getResources().getDisplayMetrics().density;
        try {
            f = Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            f = 0.0f;
        }
        return (f * f2) + 0.5f;
    }

    public static float ycx(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static int zb(Context context, float f) {
        float f2 = context.getResources().getDisplayMetrics().density;
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }

    public static Bitmap ycx(Context context, Bitmap bitmap, int i2) {
        try {
            com.bytedance.adsdk.ugeno.ycx ycxVarDj = lt.ycx().dj();
            if (ycxVarDj != null) {
                return ycxVarDj.ycx(context, bitmap, i2);
            }
            if (Build.VERSION.SDK_INT < 26) {
                return null;
            }
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.2f), Math.round(bitmap.getHeight() * 0.2f), false);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
            RenderScript renderScriptCreate = RenderScript.create(context);
            if (renderScriptCreate == null) {
                return null;
            }
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(i2);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Drawable ycx(Context context, int i2) {
        return context.getDrawable(i2);
    }

    public static boolean ycx() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static void ycx(Runnable runnable) {
        if (ycx()) {
            runnable.run();
        } else {
            ycx.post(runnable);
        }
    }
}
