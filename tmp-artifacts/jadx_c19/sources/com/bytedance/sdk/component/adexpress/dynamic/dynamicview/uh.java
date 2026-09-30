package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class uh extends Drawable {
    private RectF dj;
    private int sya;
    private Paint ycx;
    private int zb;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public uh(int i2, int i3) {
        this.sya = i2;
        this.zb = i3;
        Paint paint = new Paint();
        this.ycx = paint;
        paint.setColor(0);
        this.ycx.setAntiAlias(true);
        this.ycx.setShadowLayer(i3, 0.0f, 0.0f, -16777216);
        this.ycx.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i2, int i3, int i4, int i5) {
        super.setBounds(i2, i3, i4, i5);
        int i6 = this.zb;
        this.dj = new RectF(i2 + i6, i3 + i6, i4 - i6, i5 - i6);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        RectF rectF = this.dj;
        float f = this.sya;
        canvas.drawRoundRect(rectF, f, f, this.ycx);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.ycx.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.ycx.setColorFilter(colorFilter);
    }
}
