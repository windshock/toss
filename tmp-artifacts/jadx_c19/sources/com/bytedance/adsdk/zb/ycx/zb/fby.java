package com.bytedance.adsdk.zb.ycx.zb;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class fby {
    private final List<com.bytedance.adsdk.zb.sya.zb.fby> sya;
    private final List<ycx<com.bytedance.adsdk.zb.sya.zb.xkz, Path>> ycx;
    private final List<ycx<Integer, Integer>> zb;

    public fby(List<com.bytedance.adsdk.zb.sya.zb.fby> list) {
        this.sya = list;
        this.ycx = new ArrayList(list.size());
        this.zb = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.ycx.add(list.get(i2).zb().ycx());
            this.zb.add(list.get(i2).sya().ycx());
        }
    }

    public List<com.bytedance.adsdk.zb.sya.zb.fby> ycx() {
        return this.sya;
    }

    public List<ycx<com.bytedance.adsdk.zb.sya.zb.xkz, Path>> zb() {
        return this.ycx;
    }

    public List<ycx<Integer, Integer>> sya() {
        return this.zb;
    }
}
