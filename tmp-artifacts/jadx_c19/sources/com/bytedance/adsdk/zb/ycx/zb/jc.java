package com.bytedance.adsdk.zb.ycx.zb;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jc extends ul<PointF> {
    private final PointF dj;
    private final PathMeasure lt;
    private final float[] lud;
    private jw ul;

    public jc(List<? extends com.bytedance.adsdk.zb.ul.ycx<PointF>> list) {
        super(list);
        this.dj = new PointF();
        this.lud = new float[2];
        this.lt = new PathMeasure();
    }

    @Override // com.bytedance.adsdk.zb.ycx.zb.ycx
    /* renamed from: zb, reason: merged with bridge method [inline-methods] */
    public PointF ycx(com.bytedance.adsdk.zb.ul.ycx<PointF> ycxVar, float f) {
        jw jwVar = (jw) ycxVar;
        Path pathZb = jwVar.zb();
        if (pathZb == null) {
            return ycxVar.ycx;
        }
        if (this.sya != null) {
            Float f2 = jwVar.ul;
            dj();
            fby();
            throw null;
        }
        if (this.ul != jwVar) {
            this.lt.setPath(pathZb, false);
            this.ul = jwVar;
        }
        PathMeasure pathMeasure = this.lt;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.lud, null);
        PointF pointF = this.dj;
        float[] fArr = this.lud;
        pointF.set(fArr[0], fArr[1]);
        return this.dj;
    }
}
