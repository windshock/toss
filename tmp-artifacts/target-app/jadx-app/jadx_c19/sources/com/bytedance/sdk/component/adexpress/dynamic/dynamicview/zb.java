package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb extends GradientDrawable {
    protected Path ycx;
    private final Paint zb;

    public zb() {
        this.ycx = new Path();
        Paint paint = new Paint(1);
        this.zb = paint;
        paint.setColor(-1);
    }

    public zb(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.ycx = new Path();
        Paint paint = new Paint(1);
        this.zb = paint;
        paint.setColor(-1);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Path path = this.ycx;
        if (path == null || path.isEmpty()) {
            ycx(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.zb, 31);
        ycx(canvas);
        this.zb.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.ycx, this.zb);
        this.zb.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    protected void ycx(Canvas canvas) {
        super.draw(canvas);
    }

    public void ycx(int i2, int i3, int i4, int i5) {
        this.ycx.addRect(i2, i3, i4, i5, Path.Direction.CW);
        invalidateSelf();
    }
}
