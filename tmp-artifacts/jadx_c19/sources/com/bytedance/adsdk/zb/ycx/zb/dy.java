package com.bytedance.adsdk.zb.ycx.zb;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.bytedance.adsdk.zb.ycx.zb.ycx;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dy {
    private final Matrix dj;
    private dj ea;
    private ycx<com.bytedance.adsdk.zb.ul.sya, com.bytedance.adsdk.zb.ul.sya> fby;
    private ycx<Integer, Integer> jc;
    private ycx<Float, Float> jw;
    private ycx<PointF, PointF> lt;
    private final float[] lud;
    private dj ok;
    private ycx<?, Float> ry;
    private final Matrix sya;
    private ycx<?, PointF> ul;
    private ycx<?, Float> xkz;
    private final Matrix ycx = new Matrix();
    private final Matrix zb;

    public dy(com.bytedance.adsdk.zb.sya.ycx.ok okVar) {
        this.lt = okVar.ycx() == null ? null : okVar.ycx().ycx();
        this.ul = okVar.zb() == null ? null : okVar.zb().ycx();
        this.fby = okVar.sya() == null ? null : okVar.sya().ycx();
        this.jw = okVar.dj() == null ? null : okVar.dj().ycx();
        dj djVar = okVar.fby() == null ? null : (dj) okVar.fby().ycx();
        this.ea = djVar;
        if (djVar != null) {
            this.zb = new Matrix();
            this.sya = new Matrix();
            this.dj = new Matrix();
            this.lud = new float[9];
        } else {
            this.zb = null;
            this.sya = null;
            this.dj = null;
            this.lud = null;
        }
        this.ok = okVar.jw() == null ? null : (dj) okVar.jw().ycx();
        if (okVar.lud() != null) {
            this.jc = okVar.lud().ycx();
        }
        if (okVar.lt() != null) {
            this.ry = okVar.lt().ycx();
        } else {
            this.ry = null;
        }
        if (okVar.ul() != null) {
            this.xkz = okVar.ul().ycx();
        } else {
            this.xkz = null;
        }
    }

    public void ycx(com.bytedance.adsdk.zb.sya.sya.ycx ycxVar) {
        ycxVar.ycx(this.jc);
        ycxVar.ycx(this.ry);
        ycxVar.ycx(this.xkz);
        ycxVar.ycx(this.lt);
        ycxVar.ycx(this.ul);
        ycxVar.ycx(this.fby);
        ycxVar.ycx(this.jw);
        ycxVar.ycx(this.ea);
        ycxVar.ycx(this.ok);
    }

    public void ycx(ycx.InterfaceC0014ycx interfaceC0014ycx) {
        ycx<Integer, Integer> ycxVar = this.jc;
        if (ycxVar != null) {
            ycxVar.ycx(interfaceC0014ycx);
        }
        ycx<?, Float> ycxVar2 = this.ry;
        if (ycxVar2 != null) {
            ycxVar2.ycx(interfaceC0014ycx);
        }
        ycx<?, Float> ycxVar3 = this.xkz;
        if (ycxVar3 != null) {
            ycxVar3.ycx(interfaceC0014ycx);
        }
        ycx<PointF, PointF> ycxVar4 = this.lt;
        if (ycxVar4 != null) {
            ycxVar4.ycx(interfaceC0014ycx);
        }
        ycx<?, PointF> ycxVar5 = this.ul;
        if (ycxVar5 != null) {
            ycxVar5.ycx(interfaceC0014ycx);
        }
        ycx<com.bytedance.adsdk.zb.ul.sya, com.bytedance.adsdk.zb.ul.sya> ycxVar6 = this.fby;
        if (ycxVar6 != null) {
            ycxVar6.ycx(interfaceC0014ycx);
        }
        ycx<Float, Float> ycxVar7 = this.jw;
        if (ycxVar7 != null) {
            ycxVar7.ycx(interfaceC0014ycx);
        }
        dj djVar = this.ea;
        if (djVar != null) {
            djVar.ycx(interfaceC0014ycx);
        }
        dj djVar2 = this.ok;
        if (djVar2 != null) {
            djVar2.ycx(interfaceC0014ycx);
        }
    }

    public void ycx(float f) {
        ycx<Integer, Integer> ycxVar = this.jc;
        if (ycxVar != null) {
            ycxVar.ycx(f);
        }
        ycx<?, Float> ycxVar2 = this.ry;
        if (ycxVar2 != null) {
            ycxVar2.ycx(f);
        }
        ycx<?, Float> ycxVar3 = this.xkz;
        if (ycxVar3 != null) {
            ycxVar3.ycx(f);
        }
        ycx<PointF, PointF> ycxVar4 = this.lt;
        if (ycxVar4 != null) {
            ycxVar4.ycx(f);
        }
        ycx<?, PointF> ycxVar5 = this.ul;
        if (ycxVar5 != null) {
            ycxVar5.ycx(f);
        }
        ycx<com.bytedance.adsdk.zb.ul.sya, com.bytedance.adsdk.zb.ul.sya> ycxVar6 = this.fby;
        if (ycxVar6 != null) {
            ycxVar6.ycx(f);
        }
        ycx<Float, Float> ycxVar7 = this.jw;
        if (ycxVar7 != null) {
            ycxVar7.ycx(f);
        }
        dj djVar = this.ea;
        if (djVar != null) {
            djVar.ycx(f);
        }
        dj djVar2 = this.ok;
        if (djVar2 != null) {
            djVar2.ycx(f);
        }
    }

    public ycx<?, Integer> ycx() {
        return this.jc;
    }

    public ycx<?, Float> zb() {
        return this.ry;
    }

    public ycx<?, Float> sya() {
        return this.xkz;
    }

    public Matrix dj() {
        PointF pointFUl;
        float fJw;
        PointF pointFUl2;
        this.ycx.reset();
        ycx<?, PointF> ycxVar = this.ul;
        if (ycxVar != null && (pointFUl2 = ycxVar.ul()) != null) {
            float f = pointFUl2.x;
            if (f != 0.0f || pointFUl2.y != 0.0f) {
                this.ycx.preTranslate(f, pointFUl2.y);
            }
        }
        ycx<Float, Float> ycxVar2 = this.jw;
        if (ycxVar2 != null) {
            if (ycxVar2 instanceof wie) {
                fJw = ycxVar2.ul().floatValue();
            } else {
                fJw = ((dj) ycxVar2).jw();
            }
            if (fJw != 0.0f) {
                this.ycx.preRotate(fJw);
            }
        }
        if (this.ea != null) {
            float fCos = this.ok == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.jw()) + 90.0f));
            float fSin = this.ok == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.jw()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r0.jw()));
            lud();
            float[] fArr = this.lud;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f2 = -fSin;
            fArr[3] = f2;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.zb.setValues(fArr);
            lud();
            float[] fArr2 = this.lud;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.sya.setValues(fArr2);
            lud();
            float[] fArr3 = this.lud;
            fArr3[0] = fCos;
            fArr3[1] = f2;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.dj.setValues(fArr3);
            this.sya.preConcat(this.zb);
            this.dj.preConcat(this.sya);
            this.ycx.preConcat(this.dj);
        }
        ycx<com.bytedance.adsdk.zb.ul.sya, com.bytedance.adsdk.zb.ul.sya> ycxVar3 = this.fby;
        if (ycxVar3 != null) {
            com.bytedance.adsdk.zb.ul.sya syaVarUl = ycxVar3.ul();
            if (syaVarUl.ycx() != 1.0f || syaVarUl.zb() != 1.0f) {
                this.ycx.preScale(syaVarUl.ycx(), syaVarUl.zb());
            }
        }
        ycx<PointF, PointF> ycxVar4 = this.lt;
        if (ycxVar4 != null && (((pointFUl = ycxVar4.ul()) != null && pointFUl.x != 0.0f) || pointFUl.y != 0.0f)) {
            this.ycx.preTranslate(-pointFUl.x, -pointFUl.y);
        }
        return this.ycx;
    }

    private void lud() {
        for (int i2 = 0; i2 < 9; i2++) {
            this.lud[i2] = 0.0f;
        }
    }

    public Matrix zb(float f) {
        ycx<?, PointF> ycxVar = this.ul;
        PointF pointFUl = ycxVar == null ? null : ycxVar.ul();
        ycx<com.bytedance.adsdk.zb.ul.sya, com.bytedance.adsdk.zb.ul.sya> ycxVar2 = this.fby;
        com.bytedance.adsdk.zb.ul.sya syaVarUl = ycxVar2 == null ? null : ycxVar2.ul();
        this.ycx.reset();
        if (pointFUl != null) {
            this.ycx.preTranslate(pointFUl.x * f, pointFUl.y * f);
        }
        if (syaVarUl != null) {
            double d = f;
            this.ycx.preScale((float) Math.pow(syaVarUl.ycx(), d), (float) Math.pow(syaVarUl.zb(), d));
        }
        ycx<Float, Float> ycxVar3 = this.jw;
        if (ycxVar3 != null) {
            float fFloatValue = ycxVar3.ul().floatValue();
            ycx<PointF, PointF> ycxVar4 = this.lt;
            PointF pointFUl2 = ycxVar4 != null ? ycxVar4.ul() : null;
            this.ycx.preRotate(fFloatValue * f, pointFUl2 == null ? 0.0f : pointFUl2.x, pointFUl2 != null ? pointFUl2.y : 0.0f);
        }
        return this.ycx;
    }
}
