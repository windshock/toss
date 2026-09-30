package com.bytedance.adsdk.zb.sya.sya;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jc extends dj {
    private Path fby;
    private int jc;
    private int jw;

    public jc(com.bytedance.adsdk.zb.jw jwVar, lud ludVar, Context context) {
        super(jwVar, ludVar);
        this.fby = null;
        this.jw = -1;
        this.jc = -1;
        if (((dj) this).ul != null) {
            float fYcx = com.bytedance.adsdk.zb.lt.lt.ycx();
            this.jw = (int) (((dj) this).ul.ycx() * fYcx);
            this.jc = (int) (((dj) this).ul.zb() * fYcx);
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, this.jw, this.jc);
            Path path = new Path();
            this.fby = path;
            float f = fYcx * 40.0f;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        }
    }

    @Override // com.bytedance.adsdk.zb.sya.sya.dj, com.bytedance.adsdk.zb.sya.sya.ycx
    public void zb(Canvas canvas, Matrix matrix, int i2) {
        View viewYcx = this.zb.ycx();
        if (this.jw <= 0 || viewYcx == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        ycx(i2);
        float fLt = lt();
        ycx(viewYcx, this.jw, this.jc);
        viewYcx.setAlpha(fLt);
        canvas.clipPath(this.fby);
        viewYcx.draw(canvas);
        canvas.restore();
    }

    private static void ycx(View view, int i2, int i3) {
        view.layout(0, 0, i2, i3);
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}
