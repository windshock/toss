package com.bytedance.sdk.component.adexpress.lt;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jw extends View {
    private Paint dj;
    private int fby;
    private int lt;
    private Paint lud;
    private final RectF sya;
    private Paint ul;
    private int ycx;
    private int zb;

    public jw(Context context) {
        super(context);
        this.sya = new RectF();
        ycx();
    }

    private void ycx() {
        Paint paint = new Paint();
        this.dj = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.ul = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.lud = paint3;
        paint3.setAntiAlias(true);
    }

    public void setRadius(int i2) {
        this.lt = i2;
    }

    public void setDislikeColor(int i2) {
        this.ul.setColor(i2);
    }

    public void setDislikeWidth(int i2) {
        this.ul.setStrokeWidth(i2);
    }

    public void setStrokeColor(int i2) {
        this.dj.setStyle(Paint.Style.STROKE);
        this.dj.setColor(i2);
    }

    public void setStrokeWidth(int i2) {
        this.dj.setStrokeWidth(i2);
        this.fby = i2;
    }

    public void setBgColor(int i2) {
        this.lud.setStyle(Paint.Style.FILL);
        this.lud.setColor(i2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.sya;
        float f = this.lt;
        canvas.drawRoundRect(rectF, f, f, this.lud);
        RectF rectF2 = this.sya;
        float f2 = this.lt;
        canvas.drawRoundRect(rectF2, f2, f2, this.dj);
        float f3 = this.ycx;
        float f4 = this.zb;
        canvas.drawLine(f3 * 0.3f, f4 * 0.3f, f3 * 0.7f, f4 * 0.7f, this.ul);
        float f5 = this.ycx;
        float f6 = this.zb;
        canvas.drawLine(f5 * 0.7f, f6 * 0.3f, f5 * 0.3f, f6 * 0.7f, this.ul);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.ycx = i2;
        this.zb = i3;
        RectF rectF = this.sya;
        float f = this.fby;
        rectF.set(f, f, i2 - r5, i3 - r5);
    }
}
