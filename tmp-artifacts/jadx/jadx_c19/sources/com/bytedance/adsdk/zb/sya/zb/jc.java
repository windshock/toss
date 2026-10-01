package com.bytedance.adsdk.zb.sya.zb;

import android.graphics.PointF;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jc implements sya {
    private final com.bytedance.adsdk.zb.sya.ycx.ry<PointF, PointF> dj;
    private final boolean ea;
    private final com.bytedance.adsdk.zb.sya.ycx.zb fby;
    private final boolean jc;
    private final com.bytedance.adsdk.zb.sya.ycx.zb jw;
    private final com.bytedance.adsdk.zb.sya.ycx.zb lt;
    private final com.bytedance.adsdk.zb.sya.ycx.zb lud;
    private final com.bytedance.adsdk.zb.sya.ycx.zb sya;
    private final com.bytedance.adsdk.zb.sya.ycx.zb ul;
    private final String ycx;
    private final ycx zb;

    public enum ycx {
        STAR(1),
        POLYGON(2);

        private final int sya;

        ycx(int i2) {
            this.sya = i2;
        }

        public static ycx ycx(int i2) {
            for (ycx ycxVar : values()) {
                if (ycxVar.sya == i2) {
                    return ycxVar;
                }
            }
            return null;
        }
    }

    public jc(String str, ycx ycxVar, com.bytedance.adsdk.zb.sya.ycx.zb zbVar, com.bytedance.adsdk.zb.sya.ycx.ry<PointF, PointF> ryVar, com.bytedance.adsdk.zb.sya.ycx.zb zbVar2, com.bytedance.adsdk.zb.sya.ycx.zb zbVar3, com.bytedance.adsdk.zb.sya.ycx.zb zbVar4, com.bytedance.adsdk.zb.sya.ycx.zb zbVar5, com.bytedance.adsdk.zb.sya.ycx.zb zbVar6, boolean z, boolean z2) {
        this.ycx = str;
        this.zb = ycxVar;
        this.sya = zbVar;
        this.dj = ryVar;
        this.lud = zbVar2;
        this.lt = zbVar3;
        this.ul = zbVar4;
        this.fby = zbVar5;
        this.jw = zbVar6;
        this.jc = z;
        this.ea = z2;
    }

    public String ycx() {
        return this.ycx;
    }

    public ycx zb() {
        return this.zb;
    }

    public com.bytedance.adsdk.zb.sya.ycx.zb sya() {
        return this.sya;
    }

    public com.bytedance.adsdk.zb.sya.ycx.ry<PointF, PointF> dj() {
        return this.dj;
    }

    public com.bytedance.adsdk.zb.sya.ycx.zb lud() {
        return this.lud;
    }

    public com.bytedance.adsdk.zb.sya.ycx.zb lt() {
        return this.lt;
    }

    public com.bytedance.adsdk.zb.sya.ycx.zb ul() {
        return this.ul;
    }

    public com.bytedance.adsdk.zb.sya.ycx.zb fby() {
        return this.fby;
    }

    public com.bytedance.adsdk.zb.sya.ycx.zb jw() {
        return this.jw;
    }

    public boolean jc() {
        return this.jc;
    }

    public boolean ea() {
        return this.ea;
    }

    @Override // com.bytedance.adsdk.zb.sya.zb.sya
    public com.bytedance.adsdk.zb.ycx.ycx.sya ycx(com.bytedance.adsdk.zb.jw jwVar, com.bytedance.adsdk.zb.ul ulVar, com.bytedance.adsdk.zb.sya.sya.ycx ycxVar) {
        return new com.bytedance.adsdk.zb.ycx.ycx.xkz(jwVar, ycxVar, this);
    }
}
