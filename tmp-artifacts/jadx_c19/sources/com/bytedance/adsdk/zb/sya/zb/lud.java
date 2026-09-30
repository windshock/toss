package com.bytedance.adsdk.zb.sya.zb;

import android.graphics.Path;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lud implements sya {
    private final com.bytedance.adsdk.zb.sya.ycx.dj dj;
    private final com.bytedance.adsdk.zb.sya.ycx.zb fby;
    private final boolean jc;
    private final com.bytedance.adsdk.zb.sya.ycx.zb jw;
    private final com.bytedance.adsdk.zb.sya.ycx.lt lt;
    private final com.bytedance.adsdk.zb.sya.ycx.lt lud;
    private final com.bytedance.adsdk.zb.sya.ycx.sya sya;
    private final String ul;
    private final ul ycx;
    private final Path.FillType zb;

    public lud(String str, ul ulVar, Path.FillType fillType, com.bytedance.adsdk.zb.sya.ycx.sya syaVar, com.bytedance.adsdk.zb.sya.ycx.dj djVar, com.bytedance.adsdk.zb.sya.ycx.lt ltVar, com.bytedance.adsdk.zb.sya.ycx.lt ltVar2, com.bytedance.adsdk.zb.sya.ycx.zb zbVar, com.bytedance.adsdk.zb.sya.ycx.zb zbVar2, boolean z) {
        this.ycx = ulVar;
        this.zb = fillType;
        this.sya = syaVar;
        this.dj = djVar;
        this.lud = ltVar;
        this.lt = ltVar2;
        this.ul = str;
        this.fby = zbVar;
        this.jw = zbVar2;
        this.jc = z;
    }

    public String ycx() {
        return this.ul;
    }

    public ul zb() {
        return this.ycx;
    }

    public Path.FillType sya() {
        return this.zb;
    }

    public com.bytedance.adsdk.zb.sya.ycx.sya dj() {
        return this.sya;
    }

    public com.bytedance.adsdk.zb.sya.ycx.dj lud() {
        return this.dj;
    }

    public com.bytedance.adsdk.zb.sya.ycx.lt lt() {
        return this.lud;
    }

    public com.bytedance.adsdk.zb.sya.ycx.lt ul() {
        return this.lt;
    }

    public boolean fby() {
        return this.jc;
    }

    @Override // com.bytedance.adsdk.zb.sya.zb.sya
    public com.bytedance.adsdk.zb.ycx.ycx.sya ycx(com.bytedance.adsdk.zb.jw jwVar, com.bytedance.adsdk.zb.ul ulVar, com.bytedance.adsdk.zb.sya.sya.ycx ycxVar) {
        return new com.bytedance.adsdk.zb.ycx.ycx.fby(jwVar, ulVar, ycxVar, this);
    }
}
