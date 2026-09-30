package com.bytedance.adsdk.ugeno.fby;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class dj {
    private static Context sya;
    private static String ycx;
    private static Resources zb;

    public static void ycx(String str) {
        ycx = str;
    }

    private static String ycx(Context context) {
        if (ycx == null) {
            ycx = context.getPackageName();
        }
        return ycx;
    }

    private static int ycx(Context context, String str, String str2) {
        if (zb == null) {
            zb = context.getResources();
        }
        return zb.getIdentifier(str, str2, ycx(context));
    }

    public static int ycx(Context context, String str) {
        return ycx(context, str, "raw");
    }

    public static int zb(Context context, String str) {
        return ycx(context, str, "drawable");
    }
}
