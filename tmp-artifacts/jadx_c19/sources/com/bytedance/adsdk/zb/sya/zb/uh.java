package com.bytedance.adsdk.zb.sya.zb;

import com.bytedance.adsdk.zb.ycx.ycx.thx;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class uh implements sya {
    private final com.bytedance.adsdk.zb.sya.ycx.zb dj;
    private final boolean lt;
    private final com.bytedance.adsdk.zb.sya.ycx.zb lud;
    private final com.bytedance.adsdk.zb.sya.ycx.zb sya;
    private final String ycx;
    private final ycx zb;

    public enum ycx {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static ycx ycx(int i2) {
            if (i2 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i2 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i2)));
        }
    }

    public uh(String str, ycx ycxVar, com.bytedance.adsdk.zb.sya.ycx.zb zbVar, com.bytedance.adsdk.zb.sya.ycx.zb zbVar2, com.bytedance.adsdk.zb.sya.ycx.zb zbVar3, boolean z) {
        this.ycx = str;
        this.zb = ycxVar;
        this.sya = zbVar;
        this.dj = zbVar2;
        this.lud = zbVar3;
        this.lt = z;
    }

    public String ycx() {
        return this.ycx;
    }

    public ycx zb() {
        return this.zb;
    }

    public com.bytedance.adsdk.zb.sya.ycx.zb sya() {
        return this.dj;
    }

    public com.bytedance.adsdk.zb.sya.ycx.zb dj() {
        return this.sya;
    }

    public com.bytedance.adsdk.zb.sya.ycx.zb lud() {
        return this.lud;
    }

    public boolean lt() {
        return this.lt;
    }

    @Override // com.bytedance.adsdk.zb.sya.zb.sya
    public com.bytedance.adsdk.zb.ycx.ycx.sya ycx(com.bytedance.adsdk.zb.jw jwVar, com.bytedance.adsdk.zb.ul ulVar, com.bytedance.adsdk.zb.sya.sya.ycx ycxVar) {
        return new thx(ycxVar, this);
    }

    public String toString() {
        return "Trim Path: {start: " + this.sya + ", end: " + this.dj + ", offset: " + this.lud + "}";
    }
}
