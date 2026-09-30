package com.bytedance.sdk.component.adexpress.lt;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dj extends View {
    private int dj;
    private Paint ea;
    private List<Integer> fby;
    private Paint jc;
    private List<Integer> jw;
    private int lt;
    private float lud;
    private float ok;
    private float ry;
    private float sya;
    private boolean ul;
    private int xkz;
    private int ycx;
    private int zb;

    public dj(Context context) {
        this(context, null);
    }

    public dj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public dj(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.ycx = -1;
        this.zb = -65536;
        this.sya = 18.0f;
        this.dj = 3;
        this.lud = 50.0f;
        this.lt = 2;
        this.ul = false;
        this.fby = new ArrayList();
        this.jw = new ArrayList();
        this.xkz = 24;
        sya();
    }

    private void sya() {
        Paint paint = new Paint();
        this.jc = paint;
        paint.setAntiAlias(true);
        this.jc.setStrokeWidth(this.xkz);
        this.fby.add(Integer.valueOf(OggPageHeader.MAX_SEGMENT_COUNT));
        this.jw.add(0);
        Paint paint2 = new Paint();
        this.ea = paint2;
        paint2.setAntiAlias(true);
        this.ea.setColor(Color.parseColor("#0FFFFFFF"));
        this.ea.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        float f = i2 / 2.0f;
        this.ok = f;
        this.ry = i3 / 2.0f;
        float f2 = f - (this.xkz / 2.0f);
        this.lud = f2;
        this.sya = f2 / 4.0f;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.jc.setShader(new LinearGradient(this.ok, 0.0f, this.ry, getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        int i2 = 0;
        while (true) {
            if (i2 >= this.fby.size()) {
                break;
            }
            Integer num = this.fby.get(i2);
            this.jc.setAlpha(num.intValue());
            Integer num2 = this.jw.get(i2);
            if (this.sya + num2.intValue() < this.lud) {
                canvas.drawCircle(this.ok, this.ry, this.sya + num2.intValue(), this.jc);
            }
            if (num.intValue() > 0 && num2.intValue() < this.lud) {
                this.fby.set(i2, Integer.valueOf(num.intValue() - this.lt > 0 ? num.intValue() - (this.lt * 3) : 1));
                this.jw.set(i2, Integer.valueOf(num2.intValue() + this.lt));
            }
            i2++;
        }
        List<Integer> list = this.jw;
        if (list.get(list.size() - 1).intValue() >= this.lud / this.dj) {
            this.fby.add(Integer.valueOf(OggPageHeader.MAX_SEGMENT_COUNT));
            this.jw.add(0);
        }
        if (this.jw.size() >= 3) {
            this.jw.remove(0);
            this.fby.remove(0);
        }
        this.jc.setAlpha(OggPageHeader.MAX_SEGMENT_COUNT);
        this.jc.setColor(this.zb);
        canvas.drawCircle(this.ok, this.ry, this.sya, this.ea);
        if (this.ul) {
            invalidate();
        }
    }

    public void ycx() {
        this.ul = true;
        invalidate();
    }

    public void zb() {
        this.ul = false;
        this.jw.clear();
        this.fby.clear();
        this.fby.add(Integer.valueOf(OggPageHeader.MAX_SEGMENT_COUNT));
        this.jw.add(0);
        invalidate();
    }

    public void setColor(int i2) {
        this.ycx = i2;
    }

    public void setCoreColor(int i2) {
        this.zb = i2;
    }

    public void setCoreRadius(int i2) {
        this.sya = i2;
    }

    public void setDiffuseWidth(int i2) {
        this.dj = i2;
    }

    public void setMaxWidth(int i2) {
        this.lud = i2;
    }

    public void setDiffuseSpeed(int i2) {
        this.lt = i2;
    }
}
