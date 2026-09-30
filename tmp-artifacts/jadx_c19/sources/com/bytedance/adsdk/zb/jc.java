package com.bytedance.adsdk.zb;

import android.graphics.Bitmap;
import java.util.List;
import org.json.JSONArray;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jc {
    private final String dj;
    private Bitmap ea;
    private final String fby;
    private final JSONArray jc;
    private final int[][] jw;
    private final String lt;
    private final String lud;
    private final String sya;
    private final List<ycx> ul;
    private final int ycx;
    private final int zb;

    public static class ycx {
        public String dj;
        public int lt;
        public int lud;
        public String sya;
        public String ul;
        public int ycx;
        public int zb;
    }

    public jc(int i2, int i3, String str, String str2, String str3, String str4, List<ycx> list, String str5, int[][] iArr, JSONArray jSONArray) {
        this.ycx = i2;
        this.zb = i3;
        this.sya = str;
        this.dj = str2;
        this.lud = str3;
        this.lt = str4;
        this.ul = list;
        this.fby = str5;
        this.jw = iArr;
        this.jc = jSONArray;
    }

    public int ycx() {
        return this.ycx;
    }

    public int zb() {
        return this.zb;
    }

    public List<ycx> sya() {
        return this.ul;
    }

    public String dj() {
        return this.lt;
    }

    public String lud() {
        return this.fby;
    }

    public int[][] lt() {
        return this.jw;
    }

    public JSONArray ul() {
        return this.jc;
    }

    public String fby() {
        return this.sya;
    }

    public String jw() {
        return this.dj;
    }

    public String jc() {
        return this.lud;
    }

    public Bitmap ea() {
        return this.ea;
    }

    public void ycx(Bitmap bitmap) {
        this.ea = bitmap;
    }
}
