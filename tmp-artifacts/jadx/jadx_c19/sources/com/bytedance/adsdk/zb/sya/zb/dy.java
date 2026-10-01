package com.bytedance.adsdk.zb.sya.zb;

import java.util.Arrays;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dy implements sya {
    private final boolean sya;
    private final String ycx;
    private final List<sya> zb;

    public dy(String str, List<sya> list, boolean z) {
        this.ycx = str;
        this.zb = list;
        this.sya = z;
    }

    public String ycx() {
        return this.ycx;
    }

    public List<sya> zb() {
        return this.zb;
    }

    public boolean sya() {
        return this.sya;
    }

    @Override // com.bytedance.adsdk.zb.sya.zb.sya
    public com.bytedance.adsdk.zb.ycx.ycx.sya ycx(com.bytedance.adsdk.zb.jw jwVar, com.bytedance.adsdk.zb.ul ulVar, com.bytedance.adsdk.zb.sya.sya.ycx ycxVar) {
        return new com.bytedance.adsdk.zb.ycx.ycx.dj(jwVar, ycxVar, this, ulVar);
    }

    public String toString() {
        return "ShapeGroup{name='" + this.ycx + "' Shapes: " + Arrays.toString(this.zb.toArray()) + '}';
    }
}
