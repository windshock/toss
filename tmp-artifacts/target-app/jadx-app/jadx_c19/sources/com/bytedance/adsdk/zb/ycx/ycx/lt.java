package com.bytedance.adsdk.zb.ycx.ycx;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.zb.sya.zb.uh;
import com.bytedance.adsdk.zb.ycx.zb.ycx;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lt implements ea, ry, ycx.InterfaceC0014ycx {
    private final com.bytedance.adsdk.zb.ycx.zb.ycx<?, PointF> dj;
    private boolean fby;
    private final com.bytedance.adsdk.zb.sya.zb.zb lt;
    private final com.bytedance.adsdk.zb.ycx.zb.ycx<?, PointF> lud;
    private final com.bytedance.adsdk.zb.jw sya;
    private final String zb;
    private final Path ycx = new Path();
    private final zb ul = new zb();

    public lt(com.bytedance.adsdk.zb.jw jwVar, com.bytedance.adsdk.zb.sya.sya.ycx ycxVar, com.bytedance.adsdk.zb.sya.zb.zb zbVar) {
        this.zb = zbVar.ycx();
        this.sya = jwVar;
        com.bytedance.adsdk.zb.ycx.zb.ycx<PointF, PointF> ycxVarYcx = zbVar.sya().ycx();
        this.dj = ycxVarYcx;
        com.bytedance.adsdk.zb.ycx.zb.ycx<PointF, PointF> ycxVarYcx2 = zbVar.zb().ycx();
        this.lud = ycxVarYcx2;
        this.lt = zbVar;
        ycxVar.ycx(ycxVarYcx);
        ycxVar.ycx(ycxVarYcx2);
        ycxVarYcx.ycx(this);
        ycxVarYcx2.ycx(this);
    }

    @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.InterfaceC0014ycx
    public void ycx() {
        zb();
    }

    private void zb() {
        this.fby = false;
        this.sya.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.zb.ycx.ycx.sya
    public void ycx(List<sya> list, List<sya> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            sya syaVar = list.get(i2);
            if (syaVar instanceof thx) {
                thx thxVar = (thx) syaVar;
                if (thxVar.zb() == uh.ycx.SIMULTANEOUSLY) {
                    this.ul.ycx(thxVar);
                    thxVar.ycx(this);
                }
            }
        }
    }

    @Override // com.bytedance.adsdk.zb.ycx.ycx.ry
    public Path dj() {
        if (this.fby) {
            return this.ycx;
        }
        this.ycx.reset();
        if (this.lt.lud()) {
            this.fby = true;
            return this.ycx;
        }
        PointF pointFUl = this.dj.ul();
        float f = pointFUl.x / 2.0f;
        float f2 = pointFUl.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.ycx.reset();
        if (this.lt.dj()) {
            float f5 = -f2;
            this.ycx.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.ycx.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.ycx.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.ycx.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.ycx.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.ycx.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.ycx.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.ycx.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.ycx.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.ycx.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointFUl2 = this.lud.ul();
        this.ycx.offset(pointFUl2.x, pointFUl2.y);
        this.ycx.close();
        this.ul.ycx(this.ycx);
        this.fby = true;
        return this.ycx;
    }
}
