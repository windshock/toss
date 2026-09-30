package com.bytedance.adsdk.zb.ycx.zb;

import android.graphics.PointF;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ea extends ul<PointF> {
    private final PointF dj;

    public ea(List<com.bytedance.adsdk.zb.ul.ycx<PointF>> list) {
        super(list);
        this.dj = new PointF();
    }

    @Override // com.bytedance.adsdk.zb.ycx.zb.ycx
    /* renamed from: zb, reason: merged with bridge method [inline-methods] */
    public PointF ycx(com.bytedance.adsdk.zb.ul.ycx<PointF> ycxVar, float f) {
        return ycx(ycxVar, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.adsdk.zb.ycx.zb.ycx
    /* renamed from: zb, reason: merged with bridge method [inline-methods] */
    public PointF ycx(com.bytedance.adsdk.zb.ul.ycx<PointF> ycxVar, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2 = ycxVar.ycx;
        if (pointF2 == null || (pointF = ycxVar.zb) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = pointF2;
        PointF pointF4 = pointF;
        if (this.sya != null) {
            Float f4 = ycxVar.ul;
            dj();
            fby();
            throw null;
        }
        PointF pointF5 = this.dj;
        float f5 = pointF3.x;
        float f6 = pointF4.x;
        float f7 = pointF3.y;
        pointF5.set(f5 + (f2 * (f6 - f5)), f7 + (f3 * (pointF4.y - f7)));
        return this.dj;
    }
}
