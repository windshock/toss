package com.bytedance.adsdk.ugeno.fby;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class sya {
    public static float ycx(String str, float f) {
        if (str == null) {
            return f;
        }
        try {
            return Float.parseFloat(str);
        } catch (Throwable unused) {
            return f;
        }
    }

    public static int ycx(String str, int i2) {
        if (str == null) {
            return i2;
        }
        try {
            return (int) Float.parseFloat(str);
        } catch (Throwable unused) {
            return i2;
        }
    }

    public static long ycx(String str, long j) {
        if (str == null) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return j;
        }
    }

    public static double ycx(String str, double d) {
        if (str == null) {
            return d;
        }
        try {
            return Double.parseDouble(str);
        } catch (Throwable unused) {
            return d;
        }
    }

    public static boolean ycx(String str, boolean z) {
        if (str == null) {
            return z;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Throwable unused) {
            return z;
        }
    }
}
