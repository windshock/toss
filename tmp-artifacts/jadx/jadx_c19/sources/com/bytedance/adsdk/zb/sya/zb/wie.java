package com.bytedance.adsdk.zb.sya.zb;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class wie implements sya {
    private final boolean dj;
    private final com.bytedance.adsdk.zb.sya.ycx.fby sya;
    private final String ycx;
    private final int zb;

    public wie(String str, int i2, com.bytedance.adsdk.zb.sya.ycx.fby fbyVar, boolean z) {
        this.ycx = str;
        this.zb = i2;
        this.sya = fbyVar;
        this.dj = z;
    }

    public String ycx() {
        return this.ycx;
    }

    public com.bytedance.adsdk.zb.sya.ycx.fby zb() {
        return this.sya;
    }

    @Override // com.bytedance.adsdk.zb.sya.zb.sya
    public com.bytedance.adsdk.zb.ycx.ycx.sya ycx(com.bytedance.adsdk.zb.jw jwVar, com.bytedance.adsdk.zb.ul ulVar, com.bytedance.adsdk.zb.sya.sya.ycx ycxVar) {
        return new com.bytedance.adsdk.zb.ycx.ycx.pmi(jwVar, ycxVar, this);
    }

    public boolean sya() {
        return this.dj;
    }

    public String toString() {
        return "ShapePath{name=" + this.ycx + ", index=" + this.zb + '}';
    }
}
