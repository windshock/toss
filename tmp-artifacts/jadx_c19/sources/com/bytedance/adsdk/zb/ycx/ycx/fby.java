package com.bytedance.adsdk.zb.ycx.ycx;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;
import com.bytedance.adsdk.zb.ycx.zb.ycx;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class fby implements ea, lud, ycx.InterfaceC0014ycx {
    private final com.bytedance.adsdk.zb.sya.sya.ycx dj;
    private com.bytedance.adsdk.zb.ycx.zb.ycx<ColorFilter, ColorFilter> dy;
    private final com.bytedance.adsdk.zb.sya.zb.ul ea;
    private final Paint fby;
    private com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> htf;
    private final List<ry> jc;
    private final RectF jw;
    private final com.bytedance.adsdk.zb.ycx.zb.ycx<com.bytedance.adsdk.zb.sya.zb.dj, com.bytedance.adsdk.zb.sya.zb.dj> ok;
    private final com.bytedance.adsdk.zb.jw pmi;
    private final com.bytedance.adsdk.zb.ycx.zb.ycx<Integer, Integer> ry;
    private final boolean sya;
    private final com.bytedance.adsdk.zb.ycx.zb.ycx<PointF, PointF> syc;
    private com.bytedance.adsdk.zb.ycx.zb.sya thx;
    private final int uh;
    private final Path ul;
    private com.bytedance.adsdk.zb.ycx.zb.wie wie;
    private final com.bytedance.adsdk.zb.ycx.zb.ycx<PointF, PointF> xkz;
    float ycx;
    private final String zb;
    private final LongSparseArray<LinearGradient> lud = new LongSparseArray<>();
    private final LongSparseArray<RadialGradient> lt = new LongSparseArray<>();

    public fby(com.bytedance.adsdk.zb.jw jwVar, com.bytedance.adsdk.zb.ul ulVar, com.bytedance.adsdk.zb.sya.sya.ycx ycxVar, com.bytedance.adsdk.zb.sya.zb.lud ludVar) {
        Path path = new Path();
        this.ul = path;
        this.fby = new com.bytedance.adsdk.zb.ycx.ycx(1);
        this.jw = new RectF();
        this.jc = new ArrayList();
        this.ycx = 0.0f;
        this.dj = ycxVar;
        this.zb = ludVar.ycx();
        this.sya = ludVar.fby();
        this.pmi = jwVar;
        this.ea = ludVar.zb();
        path.setFillType(ludVar.sya());
        this.uh = (int) (ulVar.lud() / 32.0f);
        com.bytedance.adsdk.zb.ycx.zb.ycx<com.bytedance.adsdk.zb.sya.zb.dj, com.bytedance.adsdk.zb.sya.zb.dj> ycxVarYcx = ludVar.dj().ycx();
        this.ok = ycxVarYcx;
        ycxVarYcx.ycx(this);
        ycxVar.ycx(ycxVarYcx);
        com.bytedance.adsdk.zb.ycx.zb.ycx<Integer, Integer> ycxVarYcx2 = ludVar.lud().ycx();
        this.ry = ycxVarYcx2;
        ycxVarYcx2.ycx(this);
        ycxVar.ycx(ycxVarYcx2);
        com.bytedance.adsdk.zb.ycx.zb.ycx<PointF, PointF> ycxVarYcx3 = ludVar.lt().ycx();
        this.xkz = ycxVarYcx3;
        ycxVarYcx3.ycx(this);
        ycxVar.ycx(ycxVarYcx3);
        com.bytedance.adsdk.zb.ycx.zb.ycx<PointF, PointF> ycxVarYcx4 = ludVar.ul().ycx();
        this.syc = ycxVarYcx4;
        ycxVarYcx4.ycx(this);
        ycxVar.ycx(ycxVarYcx4);
        if (ycxVar.jc() != null) {
            com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ycxVarYcx5 = ycxVar.jc().ycx().ycx();
            this.htf = ycxVarYcx5;
            ycxVarYcx5.ycx(this);
            ycxVar.ycx(this.htf);
        }
        if (ycxVar.ea() != null) {
            this.thx = new com.bytedance.adsdk.zb.ycx.zb.sya(this, ycxVar, ycxVar.ea());
        }
    }

    @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.InterfaceC0014ycx
    public void ycx() {
        this.pmi.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.zb.ycx.ycx.sya
    public void ycx(List<sya> list, List<sya> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            sya syaVar = list2.get(i2);
            if (syaVar instanceof ry) {
                this.jc.add((ry) syaVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.zb.ycx.ycx.lud
    public void ycx(Canvas canvas, Matrix matrix, int i2) {
        Shader shaderSya;
        if (this.sya) {
            return;
        }
        com.bytedance.adsdk.zb.lud.ycx("GradientFillContent#draw");
        this.ul.reset();
        for (int i3 = 0; i3 < this.jc.size(); i3++) {
            this.ul.addPath(this.jc.get(i3).dj(), matrix);
        }
        this.ul.computeBounds(this.jw, false);
        if (this.ea == com.bytedance.adsdk.zb.sya.zb.ul.LINEAR) {
            shaderSya = zb();
        } else {
            shaderSya = sya();
        }
        shaderSya.setLocalMatrix(matrix);
        this.fby.setShader(shaderSya);
        com.bytedance.adsdk.zb.ycx.zb.ycx<ColorFilter, ColorFilter> ycxVar = this.dy;
        if (ycxVar != null) {
            this.fby.setColorFilter(ycxVar.ul());
        }
        com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ycxVar2 = this.htf;
        if (ycxVar2 != null) {
            float fFloatValue = ycxVar2.ul().floatValue();
            if (fFloatValue == 0.0f) {
                this.fby.setMaskFilter(null);
            } else if (fFloatValue != this.ycx) {
                this.fby.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.ycx = fFloatValue;
        }
        com.bytedance.adsdk.zb.ycx.zb.sya syaVar = this.thx;
        if (syaVar != null) {
            syaVar.ycx(this.fby);
        }
        this.fby.setAlpha(com.bytedance.adsdk.zb.lt.lud.ycx((int) ((((i2 / 255.0f) * this.ry.ul().intValue()) / 100.0f) * 255.0f), 0, OggPageHeader.MAX_SEGMENT_COUNT));
        canvas.drawPath(this.ul, this.fby);
        com.bytedance.adsdk.zb.lud.zb("GradientFillContent#draw");
    }

    @Override // com.bytedance.adsdk.zb.ycx.ycx.lud
    public void ycx(RectF rectF, Matrix matrix, boolean z) {
        this.ul.reset();
        for (int i2 = 0; i2 < this.jc.size(); i2++) {
            this.ul.addPath(this.jc.get(i2).dj(), matrix);
        }
        this.ul.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    private LinearGradient zb() {
        long jDj = dj();
        LinearGradient linearGradient = this.lud.get(jDj);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointFUl = this.xkz.ul();
        PointF pointFUl2 = this.syc.ul();
        com.bytedance.adsdk.zb.sya.zb.dj djVarUl = this.ok.ul();
        LinearGradient linearGradient2 = new LinearGradient(pointFUl.x, pointFUl.y, pointFUl2.x, pointFUl2.y, ycx(djVarUl.zb()), djVarUl.ycx(), Shader.TileMode.CLAMP);
        this.lud.put(jDj, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient sya() {
        long jDj = dj();
        RadialGradient radialGradient = this.lt.get(jDj);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointFUl = this.xkz.ul();
        PointF pointFUl2 = this.syc.ul();
        com.bytedance.adsdk.zb.sya.zb.dj djVarUl = this.ok.ul();
        int[] iArrYcx = ycx(djVarUl.zb());
        float[] fArrYcx = djVarUl.ycx();
        float f = pointFUl.x;
        float f2 = pointFUl.y;
        float fHypot = (float) Math.hypot(pointFUl2.x - f, pointFUl2.y - f2);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f, f2, fHypot, iArrYcx, fArrYcx, Shader.TileMode.CLAMP);
        this.lt.put(jDj, radialGradient2);
        return radialGradient2;
    }

    private int dj() {
        int iRound = Math.round(this.xkz.fby() * this.uh);
        int iRound2 = Math.round(this.syc.fby() * this.uh);
        int iRound3 = Math.round(this.ok.fby() * this.uh);
        int i2 = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i2 = i2 * 31 * iRound2;
        }
        return iRound3 != 0 ? i2 * 31 * iRound3 : i2;
    }

    private int[] ycx(int[] iArr) {
        if (this.wie == null) {
            return iArr;
        }
        throw null;
    }
}
