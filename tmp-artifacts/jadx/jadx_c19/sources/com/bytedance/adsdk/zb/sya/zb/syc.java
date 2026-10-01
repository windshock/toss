package com.bytedance.adsdk.zb.sya.zb;

import android.graphics.Path;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class syc implements sya {
    private final com.bytedance.adsdk.zb.sya.ycx.ycx dj;
    private final boolean lt;
    private final com.bytedance.adsdk.zb.sya.ycx.dj lud;
    private final String sya;
    private final boolean ycx;
    private final Path.FillType zb;

    public syc(String str, boolean z, Path.FillType fillType, com.bytedance.adsdk.zb.sya.ycx.ycx ycxVar, com.bytedance.adsdk.zb.sya.ycx.dj djVar, boolean z2) {
        this.sya = str;
        this.ycx = z;
        this.zb = fillType;
        this.dj = ycxVar;
        this.lud = djVar;
        this.lt = z2;
    }

    public String ycx() {
        return this.sya;
    }

    public com.bytedance.adsdk.zb.sya.ycx.ycx zb() {
        return this.dj;
    }

    public com.bytedance.adsdk.zb.sya.ycx.dj sya() {
        return this.lud;
    }

    public Path.FillType dj() {
        return this.zb;
    }

    public boolean lud() {
        return this.lt;
    }

    @Override // com.bytedance.adsdk.zb.sya.zb.sya
    public com.bytedance.adsdk.zb.ycx.ycx.sya ycx(com.bytedance.adsdk.zb.jw jwVar, com.bytedance.adsdk.zb.ul ulVar, com.bytedance.adsdk.zb.sya.sya.ycx ycxVar) {
        return new com.bytedance.adsdk.zb.ycx.ycx.ul(jwVar, ycxVar, this);
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.ycx + '}';
    }
}
