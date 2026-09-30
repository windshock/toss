package com.bytedance.sdk.openadsdk.wwx;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lud {
    protected static int dj = 30;
    public static int ea = 16;
    public static int fby = 2;
    public static int jc = 8;
    public static int jw = 4;
    public static int lt = 0;
    protected static long lud = 15360;
    public static int ok = 32;
    protected static int sya = 1;
    public static int ul = 1;
    protected static String ycx = "images";
    protected static String zb;

    protected static boolean ycx(Context context, String str) {
        return false;
    }

    protected static Bitmap ycx(String str) {
        byte[] bArrDecode = Base64.decode(str, 2);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static boolean ycx(Context context, int i2) {
        boolean zYcx;
        boolean zYcx2;
        if (lt == 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                zYcx = ycx(context, "android.permission.READ_MEDIA_IMAGES");
                zYcx2 = true;
            } else {
                zYcx = ycx(context, "android.permission.READ_EXTERNAL_STORAGE");
                zYcx2 = ycx(context, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            boolean zYcx3 = ycx(context, "android.permission.CAMERA");
            boolean zYcx4 = ycx(context, "android.permission.RECORD_AUDIO");
            PackageManager packageManager = context.getPackageManager();
            if (zYcx && zYcx2) {
                lt |= ul;
            }
            if (zYcx3 && packageManager.hasSystemFeature("android.hardware.camera")) {
                lt |= fby;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.gyroscope")) {
                lt |= jw;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.accelerometer")) {
                lt |= jc;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.compass")) {
                lt |= ea;
            }
            if (zYcx4 && packageManager.hasSystemFeature("android.hardware.microphone")) {
                lt |= ok;
            }
        }
        return (lt & i2) != 0;
    }

    public static boolean ycx(Context context) {
        boolean z;
        boolean z2;
        if (Build.VERSION.SDK_INT >= 33) {
            z = context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0;
        } else {
            z = context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
            if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                z2 = false;
            }
            return !z2 && z;
        }
        z2 = true;
        if (z2) {
        }
    }

    public static boolean zb(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }

    public static float zb(Context context) {
        if (context == null) {
            return 0.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }
}
