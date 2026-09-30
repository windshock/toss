package com.bytedance.adsdk.zb.sya.sya;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dj extends ycx {
    private com.bytedance.adsdk.zb.ycx.zb.ycx<ColorFilter, ColorFilter> ea;
    private final Paint fby;
    private final Rect jc;
    private final Rect jw;
    private com.bytedance.adsdk.zb.ycx.zb.ycx<Bitmap, Bitmap> ok;
    protected final com.bytedance.adsdk.zb.jc ul;

    dj(com.bytedance.adsdk.zb.jw jwVar, lud ludVar) {
        super(jwVar, ludVar);
        this.fby = new com.bytedance.adsdk.zb.ycx.ycx(3);
        this.jw = new Rect();
        this.jc = new Rect();
        this.ul = jwVar.lt(ludVar.ul());
    }

    @Override // com.bytedance.adsdk.zb.sya.sya.ycx
    public void zb(Canvas canvas, Matrix matrix, int i2) {
        super.zb(canvas, matrix, i2);
        Bitmap bitmapOk = ok();
        if (bitmapOk == null || bitmapOk.isRecycled() || this.ul == null) {
            return;
        }
        float fYcx = com.bytedance.adsdk.zb.lt.lt.ycx();
        this.fby.setAlpha(i2);
        com.bytedance.adsdk.zb.ycx.zb.ycx<ColorFilter, ColorFilter> ycxVar = this.ea;
        if (ycxVar != null) {
            this.fby.setColorFilter(ycxVar.ul());
        }
        canvas.save();
        canvas.concat(matrix);
        this.jw.set(0, 0, bitmapOk.getWidth(), bitmapOk.getHeight());
        if (this.zb.lud()) {
            this.jc.set(0, 0, (int) (this.ul.ycx() * fYcx), (int) (this.ul.zb() * fYcx));
        } else {
            this.jc.set(0, 0, (int) (bitmapOk.getWidth() * fYcx), (int) (bitmapOk.getHeight() * fYcx));
        }
        canvas.drawBitmap(bitmapOk, this.jw, this.jc, this.fby);
        canvas.restore();
    }

    @Override // com.bytedance.adsdk.zb.sya.sya.ycx, com.bytedance.adsdk.zb.ycx.ycx.lud
    public void ycx(RectF rectF, Matrix matrix, boolean z) {
        super.ycx(rectF, matrix, z);
        if (this.ul != null) {
            float fYcx = com.bytedance.adsdk.zb.lt.lt.ycx();
            rectF.set(0.0f, 0.0f, this.ul.ycx() * fYcx, this.ul.zb() * fYcx);
            this.ycx.mapRect(rectF);
        }
    }

    private Bitmap ok() {
        Bitmap bitmapUl;
        com.bytedance.adsdk.zb.ycx.zb.ycx<Bitmap, Bitmap> ycxVar = this.ok;
        if (ycxVar != null && (bitmapUl = ycxVar.ul()) != null) {
            return bitmapUl;
        }
        Bitmap bitmapLud = this.zb.lud(this.sya.ul());
        if (bitmapLud != null) {
            return bitmapLud;
        }
        com.bytedance.adsdk.zb.jc jcVar = this.ul;
        if (jcVar != null) {
            return jcVar.ea();
        }
        return null;
    }
}
