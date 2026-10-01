package com.bytedance.adsdk.zb.sya;

import com.bytedance.adsdk.zb.sya.zb.dy;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dj {
    private final double dj;
    private final String lt;
    private final String lud;
    private final double sya;
    private final List<dy> ycx;
    private final char zb;

    public static int ycx(char c, String str, String str2) {
        return (((c * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public dj(List<dy> list, char c, double d, double d2, String str, String str2) {
        this.ycx = list;
        this.zb = c;
        this.sya = d;
        this.dj = d2;
        this.lud = str;
        this.lt = str2;
    }

    public List<dy> ycx() {
        return this.ycx;
    }

    public double zb() {
        return this.dj;
    }

    public int hashCode() {
        return ycx(this.zb, this.lt, this.lud);
    }
}
