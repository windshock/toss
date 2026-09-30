package com.bytedance.adsdk.zb.sya;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lt {
    private final String sya;
    public final float ycx;
    public final float zb;

    public lt(String str, float f, float f2) {
        this.sya = str;
        this.zb = f2;
        this.ycx = f;
    }

    public boolean ycx(String str) {
        if (this.sya.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.sya.endsWith("\r")) {
            String str2 = this.sya;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
