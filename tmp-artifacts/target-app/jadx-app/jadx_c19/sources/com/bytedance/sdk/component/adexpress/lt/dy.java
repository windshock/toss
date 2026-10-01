package com.bytedance.sdk.component.adexpress.lt;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dy extends View {
    private float dj;
    private int lt;
    private ValueAnimator lud;
    private RectF sya;
    private boolean ul;
    private Context ycx;
    private Paint zb;

    public dy(Context context) {
        super(context);
        this.lt = 1500;
        this.ycx = context;
        Paint paint = new Paint();
        this.zb = paint;
        paint.setAntiAlias(true);
        this.zb.setStyle(Paint.Style.STROKE);
        this.zb.setStrokeWidth(10.0f);
        this.zb.setColor(Color.parseColor("#80FFFFFF"));
        this.sya = new RectF();
    }

    public void ycx() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.lud = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.lt);
        this.lud.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.lt.dy.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                dy.this.dj = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dy.this.requestLayout();
            }
        });
        this.lud.start();
    }

    public void zb() {
        ValueAnimator valueAnimator = this.lud;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void sya() {
        this.ul = true;
        invalidate();
    }

    public void setDuration(int i2) {
        this.lt = i2;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.ul) {
            return;
        }
        canvas.drawArc(this.sya, 270.0f, this.dj, false, this.zb);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.sya.set(5.0f, 5.0f, i2 - 5, i3 - 5);
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }
}
