package com.bytedance.adsdk.zb.sya.sya;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lt extends ycx {
    lt(com.bytedance.adsdk.zb.jw jwVar, lud ludVar) {
        super(jwVar, ludVar);
    }

    @Override // com.bytedance.adsdk.zb.sya.sya.ycx
    public void zb(Canvas canvas, Matrix matrix, int i2) {
        super.zb(canvas, matrix, i2);
    }

    @Override // com.bytedance.adsdk.zb.sya.sya.ycx, com.bytedance.adsdk.zb.ycx.ycx.lud
    public void ycx(RectF rectF, Matrix matrix, boolean z) {
        super.ycx(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
