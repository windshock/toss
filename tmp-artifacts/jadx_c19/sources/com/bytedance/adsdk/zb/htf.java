package com.bytedance.adsdk.zb;

import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class htf {
    private final Map<String, String> ycx;
    private boolean zb;

    public String ycx(String str) {
        return str;
    }

    public String ycx(String str, String str2) {
        return ycx(str2);
    }

    public final String zb(String str, String str2) {
        if (this.zb && this.ycx.containsKey(str2)) {
            return this.ycx.get(str2);
        }
        String strYcx = ycx(str, str2);
        if (this.zb) {
            this.ycx.put(str2, strYcx);
        }
        return strYcx;
    }
}
