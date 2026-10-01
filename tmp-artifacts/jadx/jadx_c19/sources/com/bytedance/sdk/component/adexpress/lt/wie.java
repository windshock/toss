package com.bytedance.sdk.component.adexpress.lt;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class wie extends View {
    private ValueAnimator dj;
    private float fby;
    private int jc;
    private Animator.AnimatorListener jw;
    private long lt;
    private Paint lud;
    private ValueAnimator sya;
    private float ul;
    private float ycx;
    private float zb;

    public wie(Context context, int i2) {
        super(context);
        this.lt = 300L;
        this.ul = 0.0f;
        this.jc = i2;
        ycx();
    }

    public void ycx() {
        Paint paint = new Paint(1);
        this.lud = paint;
        paint.setStyle(Paint.Style.FILL);
        this.lud.setColor(this.jc);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.ycx = i2 / 2.0f;
        this.zb = i3 / 2.0f;
        this.fby = (float) (Math.hypot(i2, i3) / 2.0d);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.ycx, this.zb, this.ul, this.lud);
    }

    public void zb() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.fby);
        this.sya = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.lt);
        this.sya.setInterpolator(new LinearInterpolator());
        this.sya.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.lt.wie.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                wie.this.ul = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wie.this.invalidate();
            }
        });
        this.sya.start();
    }

    public void sya() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.fby, 0.0f);
        this.dj = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.lt);
        this.dj.setInterpolator(new LinearInterpolator());
        this.dj.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.lt.wie.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                wie.this.ul = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wie.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.jw;
        if (animatorListener != null) {
            this.dj.addListener(animatorListener);
        }
        this.dj.start();
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.jw = animatorListener;
    }
}
