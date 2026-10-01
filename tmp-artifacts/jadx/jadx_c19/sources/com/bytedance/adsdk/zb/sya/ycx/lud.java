package com.bytedance.adsdk.zb.sya.ycx;

import android.graphics.PointF;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lud implements ry<PointF, PointF> {
    private final List<com.bytedance.adsdk.zb.ul.ycx<PointF>> ycx;

    public lud(List<com.bytedance.adsdk.zb.ul.ycx<PointF>> list) {
        this.ycx = list;
    }

    @Override // com.bytedance.adsdk.zb.sya.ycx.ry
    public List<com.bytedance.adsdk.zb.ul.ycx<PointF>> sya() {
        return this.ycx;
    }

    @Override // com.bytedance.adsdk.zb.sya.ycx.ry
    public boolean zb() {
        return this.ycx.size() == 1 && this.ycx.get(0).lud();
    }

    @Override // com.bytedance.adsdk.zb.sya.ycx.ry
    public com.bytedance.adsdk.zb.ycx.zb.ycx<PointF, PointF> ycx() {
        if (this.ycx.get(0).lud()) {
            return new com.bytedance.adsdk.zb.ycx.zb.ea(this.ycx);
        }
        return new com.bytedance.adsdk.zb.ycx.zb.jc(this.ycx);
    }
}
