package com.bytedance.adsdk.zb.sya.zb;

import android.graphics.PointF;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ea implements sya {
    private final com.bytedance.adsdk.zb.sya.ycx.zb dj;
    private final boolean lud;
    private final com.bytedance.adsdk.zb.sya.ycx.ry<PointF, PointF> sya;
    private final String ycx;
    private final com.bytedance.adsdk.zb.sya.ycx.ry<PointF, PointF> zb;

    public ea(String str, com.bytedance.adsdk.zb.sya.ycx.ry<PointF, PointF> ryVar, com.bytedance.adsdk.zb.sya.ycx.ry<PointF, PointF> ryVar2, com.bytedance.adsdk.zb.sya.ycx.zb zbVar, boolean z) {
        this.ycx = str;
        this.zb = ryVar;
        this.sya = ryVar2;
        this.dj = zbVar;
        this.lud = z;
    }

    public String ycx() {
        return this.ycx;
    }

    public com.bytedance.adsdk.zb.sya.ycx.zb zb() {
        return this.dj;
    }

    public com.bytedance.adsdk.zb.sya.ycx.ry<PointF, PointF> sya() {
        return this.sya;
    }

    public com.bytedance.adsdk.zb.sya.ycx.ry<PointF, PointF> dj() {
        return this.zb;
    }

    public boolean lud() {
        return this.lud;
    }

    @Override // com.bytedance.adsdk.zb.sya.zb.sya
    public com.bytedance.adsdk.zb.ycx.ycx.sya ycx(com.bytedance.adsdk.zb.jw jwVar, com.bytedance.adsdk.zb.ul ulVar, com.bytedance.adsdk.zb.sya.sya.ycx ycxVar) {
        return new com.bytedance.adsdk.zb.ycx.ycx.syc(jwVar, ycxVar, this);
    }

    public String toString() {
        return "RectangleShape{position=" + this.zb + ", size=" + this.sya + '}';
    }
}
