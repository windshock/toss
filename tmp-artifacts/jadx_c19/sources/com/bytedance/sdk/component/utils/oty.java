package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.oty.sya;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class oty {
    private static volatile String ycx;

    public static String ycx() {
        if (!TextUtils.isEmpty(ycx)) {
            return ycx;
        }
        String str = Build.MODEL;
        ycx = str;
        return str;
    }

    public static int ycx(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getApplicationInfo().icon;
        } catch (Exception e) {
            sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "b9oMhROVZ8GPf8NUgAI=", "XOs5tBOsZc6DS8NUgx+JK1Tg", 36);
            return 0;
        }
    }
}
