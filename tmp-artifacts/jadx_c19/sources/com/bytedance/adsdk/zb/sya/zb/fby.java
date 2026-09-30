package com.bytedance.adsdk.zb.sya.zb;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class fby {
    private final boolean dj;
    private final com.bytedance.adsdk.zb.sya.ycx.dj sya;
    private final ycx ycx;
    private final com.bytedance.adsdk.zb.sya.ycx.fby zb;

    public enum ycx {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public fby(ycx ycxVar, com.bytedance.adsdk.zb.sya.ycx.fby fbyVar, com.bytedance.adsdk.zb.sya.ycx.dj djVar, boolean z) {
        this.ycx = ycxVar;
        this.zb = fbyVar;
        this.sya = djVar;
        this.dj = z;
    }

    public ycx ycx() {
        return this.ycx;
    }

    public com.bytedance.adsdk.zb.sya.ycx.fby zb() {
        return this.zb;
    }

    public com.bytedance.adsdk.zb.sya.ycx.dj sya() {
        return this.sya;
    }

    public boolean dj() {
        return this.dj;
    }
}
