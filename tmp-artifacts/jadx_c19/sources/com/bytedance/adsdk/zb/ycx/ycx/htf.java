package com.bytedance.adsdk.zb.ycx.ycx;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class htf extends ycx {
    private final com.bytedance.adsdk.zb.sya.sya.ycx dj;
    private com.bytedance.adsdk.zb.ycx.zb.ycx<ColorFilter, ColorFilter> fby;
    private final boolean lt;
    private final String lud;
    private final com.bytedance.adsdk.zb.ycx.zb.ycx<Integer, Integer> ul;

    public htf(com.bytedance.adsdk.zb.jw jwVar, com.bytedance.adsdk.zb.sya.sya.ycx ycxVar, com.bytedance.adsdk.zb.sya.zb.pmi pmiVar) {
        super(jwVar, ycxVar, pmiVar.ul().ycx(), pmiVar.fby().ycx(), pmiVar.jw(), pmiVar.sya(), pmiVar.dj(), pmiVar.lud(), pmiVar.lt());
        this.dj = ycxVar;
        this.lud = pmiVar.ycx();
        this.lt = pmiVar.jc();
        com.bytedance.adsdk.zb.ycx.zb.ycx<Integer, Integer> ycxVarYcx = pmiVar.zb().ycx();
        this.ul = ycxVarYcx;
        ycxVarYcx.ycx(this);
        ycxVar.ycx(ycxVarYcx);
    }

    @Override // com.bytedance.adsdk.zb.ycx.ycx.ycx, com.bytedance.adsdk.zb.ycx.ycx.lud
    public void ycx(Canvas canvas, Matrix matrix, int i2) {
        if (this.lt) {
            return;
        }
        this.zb.setColor(((com.bytedance.adsdk.zb.ycx.zb.zb) this.ul).jw());
        com.bytedance.adsdk.zb.ycx.zb.ycx<ColorFilter, ColorFilter> ycxVar = this.fby;
        if (ycxVar != null) {
            this.zb.setColorFilter(ycxVar.ul());
        }
        super.ycx(canvas, matrix, i2);
    }
}
