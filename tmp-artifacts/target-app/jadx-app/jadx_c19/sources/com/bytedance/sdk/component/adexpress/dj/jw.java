package com.bytedance.sdk.component.adexpress.dj;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jw {
    public static ycx ycx(String str) {
        ycx ycxVar = ycx.dj;
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = Uri.parse(str).getPath();
                if (path != null) {
                    if (path.endsWith(".css")) {
                        return ycx.zb;
                    }
                    if (path.endsWith(".js")) {
                        return ycx.sya;
                    }
                    if (!path.endsWith(".jpg") && !path.endsWith(".gif") && !path.endsWith(".png") && !path.endsWith(".jpeg") && !path.endsWith(".webp") && !path.endsWith(".bmp") && !path.endsWith(".ico")) {
                        if (path.endsWith(".html")) {
                            return ycx.ycx;
                        }
                        if (path.endsWith(".mp4")) {
                            return ycx.lud;
                        }
                    }
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ804lGxA==", "bvwhoBe1ZdQ=", "XOs5uAqxbA==", 42);
            }
        }
        return ycxVar;
    }
}
