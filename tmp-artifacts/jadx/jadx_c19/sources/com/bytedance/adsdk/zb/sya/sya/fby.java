package com.bytedance.adsdk.zb.sya.sya;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class fby extends ycx {
    private final lud ea;
    private final Paint fby;
    private final Path jc;
    private final float[] jw;
    private com.bytedance.adsdk.zb.ycx.zb.ycx<ColorFilter, ColorFilter> ok;
    private final RectF ul;

    fby(com.bytedance.adsdk.zb.jw jwVar, lud ludVar) {
        super(jwVar, ludVar);
        this.ul = new RectF();
        com.bytedance.adsdk.zb.ycx.ycx ycxVar = new com.bytedance.adsdk.zb.ycx.ycx();
        this.fby = ycxVar;
        this.jw = new float[8];
        this.jc = new Path();
        this.ea = ludVar;
        ycxVar.setAlpha(0);
        ycxVar.setStyle(Paint.Style.FILL);
        ycxVar.setColor(ludVar.dy());
    }

    @Override // com.bytedance.adsdk.zb.sya.sya.ycx
    public void zb(Canvas canvas, Matrix matrix, int i2) {
        super.zb(canvas, matrix, i2);
        int iAlpha = Color.alpha(this.ea.dy());
        if (iAlpha != 0) {
            int iIntValue = (int) ((i2 / 255.0f) * (((iAlpha / 255.0f) * (this.dj.ycx() == null ? 100 : this.dj.ycx().ul().intValue())) / 100.0f) * 255.0f);
            this.fby.setAlpha(iIntValue);
            com.bytedance.adsdk.zb.ycx.zb.ycx<ColorFilter, ColorFilter> ycxVar = this.ok;
            if (ycxVar != null) {
                this.fby.setColorFilter(ycxVar.ul());
            }
            if (iIntValue > 0) {
                float[] fArr = this.jw;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = this.ea.pmi();
                float[] fArr2 = this.jw;
                fArr2[3] = 0.0f;
                fArr2[4] = this.ea.pmi();
                this.jw[5] = this.ea.wie();
                float[] fArr3 = this.jw;
                fArr3[6] = 0.0f;
                fArr3[7] = this.ea.wie();
                matrix.mapPoints(this.jw);
                this.jc.reset();
                Path path = this.jc;
                float[] fArr4 = this.jw;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.jc;
                float[] fArr5 = this.jw;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.jc;
                float[] fArr6 = this.jw;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.jc;
                float[] fArr7 = this.jw;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.jc;
                float[] fArr8 = this.jw;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.jc.close();
                canvas.drawPath(this.jc, this.fby);
            }
        }
    }

    @Override // com.bytedance.adsdk.zb.sya.sya.ycx, com.bytedance.adsdk.zb.ycx.ycx.lud
    public void ycx(RectF rectF, Matrix matrix, boolean z) {
        super.ycx(rectF, matrix, z);
        this.ul.set(0.0f, 0.0f, this.ea.pmi(), this.ea.wie());
        this.ycx.mapRect(this.ul);
        rectF.set(this.ul);
    }
}
