package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jw extends View {
    private static final int[] ycx = {Color.parseColor("#1AFFFFFF"), Color.parseColor("#4DFFFFFF"), Color.parseColor("#99FFFFFF")};
    private final ArrayList<ycx> dj;
    private int fby;
    private int jw;
    private final Paint lt;
    private final Paint lud;
    private final RectF sya;
    private int ul;
    private final RectF zb;

    public jw(Context context) {
        super(context);
        this.zb = new RectF();
        this.sya = new RectF();
        this.dj = new ArrayList<>();
        this.lt = new Paint();
        Paint paint = new Paint();
        this.lud = paint;
        paint.setColor(Color.parseColor("#D9D9D9"));
    }

    public void setProgress(int i2) {
        int i3 = this.fby;
        if (i3 != i2) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 > 100) {
                i2 = 100;
            }
            if (i3 == i2) {
                return;
            }
            this.fby = i2;
            ycx();
        }
    }

    private void ycx() {
        if (this.ul <= 0) {
            return;
        }
        int width = (int) ((this.fby / 100.0f) * getWidth());
        this.sya.right = Math.max(this.jw, width);
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        int i6 = i3 / 2;
        this.ul = i6;
        this.jw = i6 * 5;
        float f = i2;
        float f2 = i3;
        this.zb.set(0.0f, 0.0f, f, f2);
        this.sya.set(0.0f, 0.0f, 0.0f, f2);
        this.lt.setShader(new LinearGradient(0.0f, 0.0f, f, f2, new int[]{Color.parseColor("#90C0FF"), Color.parseColor("#196BE4")}, (float[]) null, Shader.TileMode.CLAMP));
        this.dj.clear();
        float f3 = this.ul / 4.0f;
        for (int i7 : ycx) {
            Paint paint = new Paint();
            paint.setColor(i7);
            this.dj.add(new ycx(paint, this.ul / 2.0f, f3, f2 / 2.0f));
            f3 += (this.ul / 2.0f) * 3.0f;
        }
        ycx();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.zb;
        float f = this.ul;
        canvas.drawRoundRect(rectF, f, f, this.lud);
        RectF rectF2 = this.sya;
        float f2 = this.ul;
        canvas.drawRoundRect(rectF2, f2, f2, this.lt);
        int iSave = canvas.save();
        canvas.translate(this.sya.right - this.jw, 0.0f);
        Iterator<ycx> it = this.dj.iterator();
        while (it.hasNext()) {
            ycx next = it.next();
            canvas.drawCircle(next.sya, next.dj, next.zb, next.ycx);
        }
        canvas.restoreToCount(iSave);
    }

    static final class ycx {
        float dj;
        float sya;
        public Paint ycx;
        public float zb;

        public ycx(Paint paint, float f, float f2, float f3) {
            this.ycx = paint;
            this.zb = f;
            this.sya = f2;
            this.dj = f3;
        }
    }
}
