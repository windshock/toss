package com.bytedance.adsdk.zb.sya.ycx;

import android.graphics.PointF;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jw implements ry<PointF, PointF> {
    private final zb ycx;
    private final zb zb;

    public jw(zb zbVar, zb zbVar2) {
        this.ycx = zbVar;
        this.zb = zbVar2;
    }

    @Override // com.bytedance.adsdk.zb.sya.ycx.ry
    public List<com.bytedance.adsdk.zb.ul.ycx<PointF>> sya() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.bytedance.adsdk.zb.sya.ycx.ry
    public boolean zb() {
        return this.ycx.zb() && this.zb.zb();
    }

    @Override // com.bytedance.adsdk.zb.sya.ycx.ry
    public com.bytedance.adsdk.zb.ycx.zb.ycx<PointF, PointF> ycx() {
        return new com.bytedance.adsdk.zb.ycx.zb.xkz(this.ycx.ycx(), this.zb.ycx());
    }
}
