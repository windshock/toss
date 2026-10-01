package com.bytedance.adsdk.zb.ycx.ycx;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.adsdk.zb.sya.zb.uh;
import com.bytedance.adsdk.zb.ycx.zb.ycx;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class syc implements ea, ry, ycx.InterfaceC0014ycx {
    private final boolean dj;
    private boolean ea;
    private final com.bytedance.adsdk.zb.ycx.zb.ycx<?, Float> fby;
    private final com.bytedance.adsdk.zb.ycx.zb.ycx<?, PointF> lt;
    private final com.bytedance.adsdk.zb.jw lud;
    private final String sya;
    private final com.bytedance.adsdk.zb.ycx.zb.ycx<?, PointF> ul;
    private final Path ycx = new Path();
    private final RectF zb = new RectF();
    private final zb jw = new zb();
    private com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> jc = null;

    public syc(com.bytedance.adsdk.zb.jw jwVar, com.bytedance.adsdk.zb.sya.sya.ycx ycxVar, com.bytedance.adsdk.zb.sya.zb.ea eaVar) {
        this.sya = eaVar.ycx();
        this.dj = eaVar.lud();
        this.lud = jwVar;
        com.bytedance.adsdk.zb.ycx.zb.ycx<PointF, PointF> ycxVarYcx = eaVar.dj().ycx();
        this.lt = ycxVarYcx;
        com.bytedance.adsdk.zb.ycx.zb.ycx<PointF, PointF> ycxVarYcx2 = eaVar.sya().ycx();
        this.ul = ycxVarYcx2;
        com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ycxVarYcx3 = eaVar.zb().ycx();
        this.fby = ycxVarYcx3;
        ycxVar.ycx(ycxVarYcx);
        ycxVar.ycx(ycxVarYcx2);
        ycxVar.ycx(ycxVarYcx3);
        ycxVarYcx.ycx(this);
        ycxVarYcx2.ycx(this);
        ycxVarYcx3.ycx(this);
    }

    @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.InterfaceC0014ycx
    public void ycx() {
        zb();
    }

    private void zb() {
        this.ea = false;
        this.lud.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    @Override // com.bytedance.adsdk.zb.ycx.ycx.sya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ycx(List<sya> list, List<sya> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            sya syaVar = list.get(i2);
            if (syaVar instanceof thx) {
                thx thxVar = (thx) syaVar;
                if (thxVar.zb() == uh.ycx.SIMULTANEOUSLY) {
                    this.jw.ycx(thxVar);
                    thxVar.ycx(this);
                } else if (syaVar instanceof wie) {
                    this.jc = ((wie) syaVar).zb();
                }
            }
        }
    }

    @Override // com.bytedance.adsdk.zb.ycx.ycx.ry
    public Path dj() {
        com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ycxVar;
        if (this.ea) {
            return this.ycx;
        }
        this.ycx.reset();
        if (this.dj) {
            this.ea = true;
            return this.ycx;
        }
        PointF pointFUl = this.ul.ul();
        float f = pointFUl.x / 2.0f;
        float f2 = pointFUl.y / 2.0f;
        com.bytedance.adsdk.zb.ycx.zb.ycx<?, Float> ycxVar2 = this.fby;
        float fJw = ycxVar2 == null ? 0.0f : ((com.bytedance.adsdk.zb.ycx.zb.dj) ycxVar2).jw();
        if (fJw == 0.0f && (ycxVar = this.jc) != null) {
            fJw = Math.min(ycxVar.ul().floatValue(), Math.min(f, f2));
        }
        float fMin = Math.min(f, f2);
        if (fJw > fMin) {
            fJw = fMin;
        }
        PointF pointFUl2 = this.lt.ul();
        this.ycx.moveTo(pointFUl2.x + f, (pointFUl2.y - f2) + fJw);
        this.ycx.lineTo(pointFUl2.x + f, (pointFUl2.y + f2) - fJw);
        if (fJw > 0.0f) {
            RectF rectF = this.zb;
            float f3 = fJw * 2.0f;
            float f4 = pointFUl2.x + f;
            float f5 = pointFUl2.y + f2;
            rectF.set(f4 - f3, f5 - f3, f4, f5);
            this.ycx.arcTo(this.zb, 0.0f, 90.0f, false);
        }
        this.ycx.lineTo((pointFUl2.x - f) + fJw, pointFUl2.y + f2);
        if (fJw > 0.0f) {
            RectF rectF2 = this.zb;
            float f6 = fJw * 2.0f;
            float f7 = pointFUl2.x - f;
            float f8 = pointFUl2.y + f2;
            rectF2.set(f7, f8 - f6, f6 + f7, f8);
            this.ycx.arcTo(this.zb, 90.0f, 90.0f, false);
        }
        this.ycx.lineTo(pointFUl2.x - f, (pointFUl2.y - f2) + fJw);
        if (fJw > 0.0f) {
            RectF rectF3 = this.zb;
            float f9 = fJw * 2.0f;
            float f10 = pointFUl2.x - f;
            float f11 = pointFUl2.y - f2;
            rectF3.set(f10, f11, f10 + f9, f9 + f11);
            this.ycx.arcTo(this.zb, 180.0f, 90.0f, false);
        }
        this.ycx.lineTo((pointFUl2.x + f) - fJw, pointFUl2.y - f2);
        if (fJw > 0.0f) {
            RectF rectF4 = this.zb;
            float f12 = fJw * 2.0f;
            float f13 = pointFUl2.x + f;
            float f14 = pointFUl2.y - f2;
            rectF4.set(f13 - f12, f14, f13, f12 + f14);
            this.ycx.arcTo(this.zb, 270.0f, 90.0f, false);
        }
        this.ycx.close();
        this.jw.ycx(this.ycx);
        this.ea = true;
        return this.ycx;
    }
}
