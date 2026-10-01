package com.bytedance.adsdk.zb.sya.zb;

import android.graphics.PointF;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb implements sya {
    private final boolean dj;
    private final boolean lud;
    private final com.bytedance.adsdk.zb.sya.ycx.lt sya;
    private final String ycx;
    private final com.bytedance.adsdk.zb.sya.ycx.ry<PointF, PointF> zb;

    public zb(String str, com.bytedance.adsdk.zb.sya.ycx.ry<PointF, PointF> ryVar, com.bytedance.adsdk.zb.sya.ycx.lt ltVar, boolean z, boolean z2) {
        this.ycx = str;
        this.zb = ryVar;
        this.sya = ltVar;
        this.dj = z;
        this.lud = z2;
    }

    @Override // com.bytedance.adsdk.zb.sya.zb.sya
    public com.bytedance.adsdk.zb.ycx.ycx.sya ycx(com.bytedance.adsdk.zb.jw jwVar, com.bytedance.adsdk.zb.ul ulVar, com.bytedance.adsdk.zb.sya.sya.ycx ycxVar) {
        return new com.bytedance.adsdk.zb.ycx.ycx.lt(jwVar, ycxVar, this);
    }

    public String ycx() {
        return this.ycx;
    }

    public com.bytedance.adsdk.zb.sya.ycx.ry<PointF, PointF> zb() {
        return this.zb;
    }

    public com.bytedance.adsdk.zb.sya.ycx.lt sya() {
        return this.sya;
    }

    public boolean dj() {
        return this.dj;
    }

    public boolean lud() {
        return this.lud;
    }
}
