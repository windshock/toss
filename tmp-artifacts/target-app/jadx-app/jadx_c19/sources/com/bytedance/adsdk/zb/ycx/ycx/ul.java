package com.bytedance.adsdk.zb.ycx.ycx;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.zb.ycx.zb.ycx;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ul implements ea, lud, ycx.InterfaceC0014ycx {
    private final com.bytedance.adsdk.zb.sya.sya.ycx dj;
    private final com.bytedance.adsdk.zb.jw ea;
    private final com.bytedance.adsdk.zb.ycx.zb.ycx<Integer, Integer> fby;
    private com.bytedance.adsdk.zb.ycx.zb.ycx<ColorFilter, ColorFilter> jc;
    private final com.bytedance.adsdk.zb.ycx.zb.ycx<Integer, Integer> jw;
    private final boolean lt;
    private final String lud;
    private com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ok;
    private com.bytedance.adsdk.zb.ycx.zb.sya ry;
    private final Paint sya;
    private final List<ry> ul;
    float ycx;
    private final Path zb;

    public ul(com.bytedance.adsdk.zb.jw jwVar, com.bytedance.adsdk.zb.sya.sya.ycx ycxVar, com.bytedance.adsdk.zb.sya.zb.syc sycVar) {
        Path path = new Path();
        this.zb = path;
        this.sya = new com.bytedance.adsdk.zb.ycx.ycx(1);
        this.ul = new ArrayList();
        this.dj = ycxVar;
        this.lud = sycVar.ycx();
        this.lt = sycVar.lud();
        this.ea = jwVar;
        if (ycxVar.jc() != null) {
            com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ycxVarYcx = ycxVar.jc().ycx().ycx();
            this.ok = ycxVarYcx;
            ycxVarYcx.ycx(this);
            ycxVar.ycx(this.ok);
        }
        if (ycxVar.ea() != null) {
            this.ry = new com.bytedance.adsdk.zb.ycx.zb.sya(this, ycxVar, ycxVar.ea());
        }
        if (sycVar.zb() == null || sycVar.sya() == null) {
            this.fby = null;
            this.jw = null;
            return;
        }
        path.setFillType(sycVar.dj());
        com.bytedance.adsdk.zb.ycx.zb.ycx<Integer, Integer> ycxVarYcx2 = sycVar.zb().ycx();
        this.fby = ycxVarYcx2;
        ycxVarYcx2.ycx(this);
        ycxVar.ycx(ycxVarYcx2);
        com.bytedance.adsdk.zb.ycx.zb.ycx<Integer, Integer> ycxVarYcx3 = sycVar.sya().ycx();
        this.jw = ycxVarYcx3;
        ycxVarYcx3.ycx(this);
        ycxVar.ycx(ycxVarYcx3);
    }

    @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.InterfaceC0014ycx
    public void ycx() {
        this.ea.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.zb.ycx.ycx.sya
    public void ycx(List<sya> list, List<sya> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            sya syaVar = list2.get(i2);
            if (syaVar instanceof ry) {
                this.ul.add((ry) syaVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.zb.ycx.ycx.lud
    public void ycx(Canvas canvas, Matrix matrix, int i2) {
        if (this.lt) {
            return;
        }
        com.bytedance.adsdk.zb.lud.ycx("FillContent#draw");
        this.sya.setColor((com.bytedance.adsdk.zb.lt.lud.ycx((int) ((((i2 / 255.0f) * this.jw.ul().intValue()) / 100.0f) * 255.0f), 0, OggPageHeader.MAX_SEGMENT_COUNT) << 24) | (((com.bytedance.adsdk.zb.ycx.zb.zb) this.fby).jw() & 16777215));
        com.bytedance.adsdk.zb.ycx.zb.ycx<ColorFilter, ColorFilter> ycxVar = this.jc;
        if (ycxVar != null) {
            this.sya.setColorFilter(ycxVar.ul());
        }
        com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ycxVar2 = this.ok;
        if (ycxVar2 != null) {
            float fFloatValue = ycxVar2.ul().floatValue();
            if (fFloatValue == 0.0f) {
                this.sya.setMaskFilter(null);
            } else if (fFloatValue != this.ycx) {
                this.sya.setMaskFilter(this.dj.zb(fFloatValue));
            }
            this.ycx = fFloatValue;
        }
        com.bytedance.adsdk.zb.ycx.zb.sya syaVar = this.ry;
        if (syaVar != null) {
            syaVar.ycx(this.sya);
        }
        this.zb.reset();
        for (int i3 = 0; i3 < this.ul.size(); i3++) {
            this.zb.addPath(this.ul.get(i3).dj(), matrix);
        }
        canvas.drawPath(this.zb, this.sya);
        com.bytedance.adsdk.zb.lud.zb("FillContent#draw");
    }

    @Override // com.bytedance.adsdk.zb.ycx.ycx.lud
    public void ycx(RectF rectF, Matrix matrix, boolean z) {
        this.zb.reset();
        for (int i2 = 0; i2 < this.ul.size(); i2++) {
            this.zb.addPath(this.ul.get(i2).dj(), matrix);
        }
        this.zb.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
}
