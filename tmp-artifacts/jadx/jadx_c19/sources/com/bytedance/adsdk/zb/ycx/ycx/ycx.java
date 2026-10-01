package com.bytedance.adsdk.zb.ycx.ycx;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.bytedance.adsdk.zb.sya.zb.uh;
import com.bytedance.adsdk.zb.ycx.zb.ycx;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class ycx implements ea, lud, ycx.InterfaceC0014ycx {
    private com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> dy;
    private final com.bytedance.adsdk.zb.ycx.zb.ycx<?, Float> ea;
    private final com.bytedance.adsdk.zb.jw fby;
    private final float[] jc;
    private final com.bytedance.adsdk.zb.ycx.zb.ycx<?, Integer> ok;
    private final List<com.bytedance.adsdk.zb.ycx.zb.ycx<?, Float>> ry;
    float sya;
    private com.bytedance.adsdk.zb.ycx.zb.ycx<ColorFilter, ColorFilter> syc;
    private com.bytedance.adsdk.zb.ycx.zb.sya wie;
    private final com.bytedance.adsdk.zb.ycx.zb.ycx<?, Float> xkz;
    protected final com.bytedance.adsdk.zb.sya.sya.ycx ycx;
    final Paint zb;
    private final PathMeasure dj = new PathMeasure();
    private final Path lud = new Path();
    private final Path lt = new Path();
    private final RectF ul = new RectF();
    private final List<C0013ycx> jw = new ArrayList();

    ycx(com.bytedance.adsdk.zb.jw jwVar, com.bytedance.adsdk.zb.sya.sya.ycx ycxVar, Paint.Cap cap, Paint.Join join, float f, com.bytedance.adsdk.zb.sya.ycx.dj djVar, com.bytedance.adsdk.zb.sya.ycx.zb zbVar, List<com.bytedance.adsdk.zb.sya.ycx.zb> list, com.bytedance.adsdk.zb.sya.ycx.zb zbVar2) {
        com.bytedance.adsdk.zb.ycx.ycx ycxVar2 = new com.bytedance.adsdk.zb.ycx.ycx(1);
        this.zb = ycxVar2;
        this.sya = 0.0f;
        this.fby = jwVar;
        this.ycx = ycxVar;
        ycxVar2.setStyle(Paint.Style.STROKE);
        ycxVar2.setStrokeCap(cap);
        ycxVar2.setStrokeJoin(join);
        ycxVar2.setStrokeMiter(f);
        this.ok = djVar.ycx();
        this.ea = zbVar.ycx();
        if (zbVar2 == null) {
            this.xkz = null;
        } else {
            this.xkz = zbVar2.ycx();
        }
        this.ry = new ArrayList(list.size());
        this.jc = new float[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.ry.add(list.get(i2).ycx());
        }
        ycxVar.ycx(this.ok);
        ycxVar.ycx(this.ea);
        for (int i3 = 0; i3 < this.ry.size(); i3++) {
            ycxVar.ycx(this.ry.get(i3));
        }
        com.bytedance.adsdk.zb.ycx.zb.ycx<?, Float> ycxVar3 = this.xkz;
        if (ycxVar3 != null) {
            ycxVar.ycx(ycxVar3);
        }
        this.ok.ycx(this);
        this.ea.ycx(this);
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.ry.get(i4).ycx(this);
        }
        com.bytedance.adsdk.zb.ycx.zb.ycx<?, Float> ycxVar4 = this.xkz;
        if (ycxVar4 != null) {
            ycxVar4.ycx(this);
        }
        if (ycxVar.jc() != null) {
            com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ycxVarYcx = ycxVar.jc().ycx().ycx();
            this.dy = ycxVarYcx;
            ycxVarYcx.ycx(this);
            ycxVar.ycx(this.dy);
        }
        if (ycxVar.ea() != null) {
            this.wie = new com.bytedance.adsdk.zb.ycx.zb.sya(this, ycxVar, ycxVar.ea());
        }
    }

    @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.InterfaceC0014ycx
    public void ycx() {
        this.fby.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // com.bytedance.adsdk.zb.ycx.ycx.sya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ycx(List<sya> list, List<sya> list2) {
        thx thxVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            sya syaVar = list.get(size);
            if (syaVar instanceof thx) {
                thx thxVar2 = (thx) syaVar;
                if (thxVar2.zb() == uh.ycx.INDIVIDUALLY) {
                    thxVar = thxVar2;
                }
            }
        }
        if (thxVar != null) {
            thxVar.ycx(this);
        }
        C0013ycx c0013ycx = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            sya syaVar2 = list2.get(size2);
            if (syaVar2 instanceof thx) {
                thx thxVar3 = (thx) syaVar2;
                if (thxVar3.zb() == uh.ycx.INDIVIDUALLY) {
                    if (c0013ycx != null) {
                        this.jw.add(c0013ycx);
                    }
                    c0013ycx = new C0013ycx(thxVar3);
                    thxVar3.ycx(this);
                } else if (syaVar2 instanceof ry) {
                    if (c0013ycx == null) {
                        c0013ycx = new C0013ycx(thxVar);
                    }
                    c0013ycx.ycx.add((ry) syaVar2);
                }
            }
        }
        if (c0013ycx != null) {
            this.jw.add(c0013ycx);
        }
    }

    public void ycx(Canvas canvas, Matrix matrix, int i2) {
        com.bytedance.adsdk.zb.lud.ycx("StrokeContent#draw");
        if (com.bytedance.adsdk.zb.lt.lt.zb(matrix)) {
            com.bytedance.adsdk.zb.lud.zb("StrokeContent#draw");
            return;
        }
        this.zb.setAlpha(com.bytedance.adsdk.zb.lt.lud.ycx((int) ((((i2 / 255.0f) * ((com.bytedance.adsdk.zb.ycx.zb.lt) this.ok).jw()) / 100.0f) * 255.0f), 0, OggPageHeader.MAX_SEGMENT_COUNT));
        this.zb.setStrokeWidth(((com.bytedance.adsdk.zb.ycx.zb.dj) this.ea).jw() * com.bytedance.adsdk.zb.lt.lt.ycx(matrix));
        if (this.zb.getStrokeWidth() <= 0.0f) {
            com.bytedance.adsdk.zb.lud.zb("StrokeContent#draw");
            return;
        }
        ycx(matrix);
        com.bytedance.adsdk.zb.ycx.zb.ycx<ColorFilter, ColorFilter> ycxVar = this.syc;
        if (ycxVar != null) {
            this.zb.setColorFilter(ycxVar.ul());
        }
        com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ycxVar2 = this.dy;
        if (ycxVar2 != null) {
            float fFloatValue = ycxVar2.ul().floatValue();
            if (fFloatValue == 0.0f) {
                this.zb.setMaskFilter(null);
            } else if (fFloatValue != this.sya) {
                this.zb.setMaskFilter(this.ycx.zb(fFloatValue));
            }
            this.sya = fFloatValue;
        }
        com.bytedance.adsdk.zb.ycx.zb.sya syaVar = this.wie;
        if (syaVar != null) {
            syaVar.ycx(this.zb);
        }
        for (int i3 = 0; i3 < this.jw.size(); i3++) {
            C0013ycx c0013ycx = this.jw.get(i3);
            if (c0013ycx.zb != null) {
                ycx(canvas, c0013ycx, matrix);
            } else {
                com.bytedance.adsdk.zb.lud.ycx("StrokeContent#buildPath");
                this.lud.reset();
                for (int size = c0013ycx.ycx.size() - 1; size >= 0; size--) {
                    this.lud.addPath(((ry) c0013ycx.ycx.get(size)).dj(), matrix);
                }
                com.bytedance.adsdk.zb.lud.zb("StrokeContent#buildPath");
                com.bytedance.adsdk.zb.lud.ycx("StrokeContent#drawPath");
                canvas.drawPath(this.lud, this.zb);
                com.bytedance.adsdk.zb.lud.zb("StrokeContent#drawPath");
            }
        }
        com.bytedance.adsdk.zb.lud.zb("StrokeContent#draw");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void ycx(Canvas canvas, C0013ycx c0013ycx, Matrix matrix) {
        float f;
        float fMin;
        com.bytedance.adsdk.zb.lud.ycx("StrokeContent#applyTrimPath");
        if (c0013ycx.zb == null) {
            com.bytedance.adsdk.zb.lud.zb("StrokeContent#applyTrimPath");
            return;
        }
        this.lud.reset();
        for (int size = c0013ycx.ycx.size() - 1; size >= 0; size--) {
            this.lud.addPath(((ry) c0013ycx.ycx.get(size)).dj(), matrix);
        }
        float fFloatValue = c0013ycx.zb.sya().ul().floatValue() / 100.0f;
        float fFloatValue2 = c0013ycx.zb.dj().ul().floatValue() / 100.0f;
        float fFloatValue3 = c0013ycx.zb.lud().ul().floatValue() / 360.0f;
        if (fFloatValue < 0.01f && fFloatValue2 > 0.99f) {
            canvas.drawPath(this.lud, this.zb);
            com.bytedance.adsdk.zb.lud.zb("StrokeContent#applyTrimPath");
            return;
        }
        this.dj.setPath(this.lud, false);
        float length = this.dj.getLength();
        while (this.dj.nextContour()) {
            length += this.dj.getLength();
        }
        float f2 = fFloatValue3 * length;
        float f3 = (fFloatValue * length) + f2;
        float fMin2 = Math.min((fFloatValue2 * length) + f2, (f3 + length) - 1.0f);
        float f4 = 0.0f;
        for (int size2 = c0013ycx.ycx.size() - 1; size2 >= 0; size2--) {
            this.lt.set(((ry) c0013ycx.ycx.get(size2)).dj());
            this.lt.transform(matrix);
            this.dj.setPath(this.lt, false);
            float length2 = this.dj.getLength();
            if (fMin2 > length) {
                float f5 = fMin2 - length;
                if (f5 >= f4 + length2 || f4 >= f5) {
                    float f6 = f4 + length2;
                    if (f6 >= f3 && f4 <= fMin2) {
                        if (f6 > fMin2 || f3 >= f4) {
                            f = f3 < f4 ? 0.0f : (f3 - f4) / length2;
                            fMin = fMin2 > f6 ? 1.0f : (fMin2 - f4) / length2;
                        } else {
                            canvas.drawPath(this.lt, this.zb);
                        }
                    }
                } else {
                    f = f3 > length ? (f3 - length) / length2 : 0.0f;
                    fMin = Math.min(f5 / length2, 1.0f);
                }
                com.bytedance.adsdk.zb.lt.lt.ycx(this.lt, f, fMin, 0.0f);
                canvas.drawPath(this.lt, this.zb);
            }
            f4 += length2;
        }
        com.bytedance.adsdk.zb.lud.zb("StrokeContent#applyTrimPath");
    }

    @Override // com.bytedance.adsdk.zb.ycx.ycx.lud
    public void ycx(RectF rectF, Matrix matrix, boolean z) {
        com.bytedance.adsdk.zb.lud.ycx("StrokeContent#getBounds");
        this.lud.reset();
        for (int i2 = 0; i2 < this.jw.size(); i2++) {
            C0013ycx c0013ycx = this.jw.get(i2);
            for (int i3 = 0; i3 < c0013ycx.ycx.size(); i3++) {
                this.lud.addPath(((ry) c0013ycx.ycx.get(i3)).dj(), matrix);
            }
        }
        this.lud.computeBounds(this.ul, false);
        float fJw = ((com.bytedance.adsdk.zb.ycx.zb.dj) this.ea).jw();
        RectF rectF2 = this.ul;
        float f = fJw / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.ul);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.bytedance.adsdk.zb.lud.zb("StrokeContent#getBounds");
    }

    private void ycx(Matrix matrix) {
        com.bytedance.adsdk.zb.lud.ycx("StrokeContent#applyDashPattern");
        if (this.ry.isEmpty()) {
            com.bytedance.adsdk.zb.lud.zb("StrokeContent#applyDashPattern");
            return;
        }
        float fYcx = com.bytedance.adsdk.zb.lt.lt.ycx(matrix);
        for (int i2 = 0; i2 < this.ry.size(); i2++) {
            this.jc[i2] = this.ry.get(i2).ul().floatValue();
            if (i2 % 2 == 0) {
                float[] fArr = this.jc;
                if (fArr[i2] < 1.0f) {
                    fArr[i2] = 1.0f;
                }
            } else {
                float[] fArr2 = this.jc;
                if (fArr2[i2] < 0.1f) {
                    fArr2[i2] = 0.1f;
                }
            }
            float[] fArr3 = this.jc;
            fArr3[i2] = fArr3[i2] * fYcx;
        }
        com.bytedance.adsdk.zb.ycx.zb.ycx<?, Float> ycxVar = this.xkz;
        this.zb.setPathEffect(new DashPathEffect(this.jc, ycxVar == null ? 0.0f : fYcx * ycxVar.ul().floatValue()));
        com.bytedance.adsdk.zb.lud.zb("StrokeContent#applyDashPattern");
    }

    /* renamed from: com.bytedance.adsdk.zb.ycx.ycx.ycx$ycx, reason: collision with other inner class name */
    static final class C0013ycx {
        private final List<ry> ycx;
        private final thx zb;

        private C0013ycx(thx thxVar) {
            this.ycx = new ArrayList();
            this.zb = thxVar;
        }
    }
}
