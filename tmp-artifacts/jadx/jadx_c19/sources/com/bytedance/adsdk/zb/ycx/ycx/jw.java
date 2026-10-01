package com.bytedance.adsdk.zb.ycx.ycx;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jw extends ycx {
    private final String dj;
    private final com.bytedance.adsdk.zb.ycx.zb.ycx<com.bytedance.adsdk.zb.sya.zb.dj, com.bytedance.adsdk.zb.sya.zb.dj> ea;
    private final RectF fby;
    private final int jc;
    private final com.bytedance.adsdk.zb.sya.zb.ul jw;
    private final LongSparseArray<LinearGradient> lt;
    private final boolean lud;
    private final com.bytedance.adsdk.zb.ycx.zb.ycx<PointF, PointF> ok;
    private final com.bytedance.adsdk.zb.ycx.zb.ycx<PointF, PointF> ry;
    private final LongSparseArray<RadialGradient> ul;
    private com.bytedance.adsdk.zb.ycx.zb.wie xkz;

    public jw(com.bytedance.adsdk.zb.jw jwVar, com.bytedance.adsdk.zb.sya.sya.ycx ycxVar, com.bytedance.adsdk.zb.sya.zb.lt ltVar) {
        super(jwVar, ycxVar, ltVar.fby().ycx(), ltVar.jw().ycx(), ltVar.ok(), ltVar.dj(), ltVar.ul(), ltVar.jc(), ltVar.ea());
        this.lt = new LongSparseArray<>();
        this.ul = new LongSparseArray<>();
        this.fby = new RectF();
        this.dj = ltVar.ycx();
        this.jw = ltVar.zb();
        this.lud = ltVar.ry();
        this.jc = (int) (jwVar.hf().lud() / 32.0f);
        com.bytedance.adsdk.zb.ycx.zb.ycx<com.bytedance.adsdk.zb.sya.zb.dj, com.bytedance.adsdk.zb.sya.zb.dj> ycxVarYcx = ltVar.sya().ycx();
        this.ea = ycxVarYcx;
        ycxVarYcx.ycx(this);
        ycxVar.ycx(ycxVarYcx);
        com.bytedance.adsdk.zb.ycx.zb.ycx<PointF, PointF> ycxVarYcx2 = ltVar.lud().ycx();
        this.ok = ycxVarYcx2;
        ycxVarYcx2.ycx(this);
        ycxVar.ycx(ycxVarYcx2);
        com.bytedance.adsdk.zb.ycx.zb.ycx<PointF, PointF> ycxVarYcx3 = ltVar.lt().ycx();
        this.ry = ycxVarYcx3;
        ycxVarYcx3.ycx(this);
        ycxVar.ycx(ycxVarYcx3);
    }

    @Override // com.bytedance.adsdk.zb.ycx.ycx.ycx, com.bytedance.adsdk.zb.ycx.ycx.lud
    public void ycx(Canvas canvas, Matrix matrix, int i2) {
        Shader shaderSya;
        if (this.lud) {
            return;
        }
        ycx(this.fby, matrix, false);
        if (this.jw == com.bytedance.adsdk.zb.sya.zb.ul.LINEAR) {
            shaderSya = zb();
        } else {
            shaderSya = sya();
        }
        shaderSya.setLocalMatrix(matrix);
        this.zb.setShader(shaderSya);
        super.ycx(canvas, matrix, i2);
    }

    private LinearGradient zb() {
        long jDj = dj();
        LinearGradient linearGradient = this.lt.get(jDj);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointFUl = this.ok.ul();
        PointF pointFUl2 = this.ry.ul();
        com.bytedance.adsdk.zb.sya.zb.dj djVarUl = this.ea.ul();
        LinearGradient linearGradient2 = new LinearGradient(pointFUl.x, pointFUl.y, pointFUl2.x, pointFUl2.y, ycx(djVarUl.zb()), djVarUl.ycx(), Shader.TileMode.CLAMP);
        this.lt.put(jDj, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient sya() {
        long jDj = dj();
        RadialGradient radialGradient = this.ul.get(jDj);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointFUl = this.ok.ul();
        PointF pointFUl2 = this.ry.ul();
        com.bytedance.adsdk.zb.sya.zb.dj djVarUl = this.ea.ul();
        int[] iArrYcx = ycx(djVarUl.zb());
        float[] fArrYcx = djVarUl.ycx();
        RadialGradient radialGradient2 = new RadialGradient(pointFUl.x, pointFUl.y, (float) Math.hypot(pointFUl2.x - r7, pointFUl2.y - r8), iArrYcx, fArrYcx, Shader.TileMode.CLAMP);
        this.ul.put(jDj, radialGradient2);
        return radialGradient2;
    }

    private int dj() {
        int iRound = Math.round(this.ok.fby() * this.jc);
        int iRound2 = Math.round(this.ry.fby() * this.jc);
        int iRound3 = Math.round(this.ea.fby() * this.jc);
        int i2 = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i2 = i2 * 31 * iRound2;
        }
        return iRound3 != 0 ? i2 * 31 * iRound3 : i2;
    }

    private int[] ycx(int[] iArr) {
        if (this.xkz == null) {
            return iArr;
        }
        throw null;
    }
}
