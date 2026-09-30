package com.bytedance.sdk.component.adexpress.dj;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dj;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lt {
    public static boolean ycx(String str) {
        return TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video");
    }

    public static boolean zb(String str) {
        return dj.zb() && ycx(str);
    }
}
