package com.bytedance.adsdk.zb.ycx.zb;

import android.graphics.Path;
import android.graphics.PointF;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jw extends com.bytedance.adsdk.zb.ul.ycx<PointF> {
    private final com.bytedance.adsdk.zb.ul.ycx<PointF> ea;
    private Path jc;

    public jw(com.bytedance.adsdk.zb.ul ulVar, com.bytedance.adsdk.zb.ul.ycx<PointF> ycxVar) {
        super(ulVar, ycxVar.ycx, ycxVar.zb, ycxVar.sya, ycxVar.dj, ycxVar.lud, ycxVar.lt, ycxVar.ul);
        this.ea = ycxVar;
        ycx();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ycx() {
        boolean z;
        T t;
        T t2;
        T t3 = this.zb;
        if (t3 == 0 || (t2 = this.ycx) == 0) {
            z = false;
        } else {
            PointF pointF = (PointF) t3;
            if (((PointF) t2).equals(pointF.x, pointF.y)) {
                z = true;
            }
        }
        T t4 = this.ycx;
        if (t4 == 0 || (t = this.zb) == 0 || z) {
            return;
        }
        com.bytedance.adsdk.zb.ul.ycx<PointF> ycxVar = this.ea;
        this.jc = com.bytedance.adsdk.zb.lt.lt.ycx((PointF) t4, (PointF) t, ycxVar.fby, ycxVar.jw);
    }

    Path zb() {
        return this.jc;
    }
}
