package com.bytedance.adsdk.ugeno.zb.ycx;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class zb extends Drawable {
    private LinearGradient aeu;
    private PorterDuffXfermode av;
    private Paint bhi;
    private final boolean dj;
    private float dv;
    private final RectF dy;
    private final float ea;
    private final int fby;
    private boolean hf;
    private final Matrix htf;
    private Bitmap ifb;
    private final boolean jc;
    private final int jw;
    private float kgy;
    private final float[] lt;
    private final int[] lud;
    private final float ok;
    private ValueAnimator oty;
    private final RectF pmi;
    private LinearGradient rmf;
    private LinearGradient rmy;
    private final int ry;
    private final float[] sya;
    private final float[] syc;
    private final Paint thx;
    private LinearGradient tn;
    private Paint tru;
    private final Path uh;
    private final boolean ul;
    private final Path wie;
    private LinearGradient wwx;
    private final int[] xkz;
    private LinearGradient xz;
    private final Drawable ycx;
    private boolean yzp = true;
    private final float zb;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    zb(Drawable drawable, int[] iArr, float[] fArr, float f, float[] fArr2, boolean z, int i2, int i3, boolean z2, float f2, float f3, int i4, int[] iArr2, float[] fArr3) {
        this.ycx = drawable;
        this.zb = f;
        this.sya = fArr2;
        this.dj = (iArr == null || fArr == null) ? false : true;
        this.lud = iArr;
        this.lt = fArr;
        this.ul = z;
        this.fby = i2 <= 0 ? 2200 : i2;
        this.jw = i3;
        this.jc = z2;
        this.ea = f2;
        this.ok = Math.max(0.0f, Math.min(1.0f, f3));
        this.ry = Math.max(2, Math.min(i4, 50));
        this.xkz = iArr2;
        this.syc = fArr3;
        this.dy = new RectF();
        this.wie = new Path();
        this.pmi = new RectF();
        this.uh = new Path();
        this.htf = new Matrix();
        Paint paint = new Paint(1);
        this.thx = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f);
        if (z2) {
            Paint paint2 = new Paint(1);
            this.tru = paint2;
            Paint.Style style = Paint.Style.FILL;
            paint2.setStyle(style);
            Paint paint3 = new Paint(1);
            this.bhi = paint3;
            paint3.setStyle(style);
            this.av = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.ycx.setBounds(rect);
        float f = this.zb / 2.0f;
        this.dy.set(rect.left + f, rect.top + f, rect.right - f, rect.bottom - f);
        this.wie.reset();
        float[] fArr = this.sya;
        if (fArr != null) {
            this.wie.addRoundRect(this.dy, fArr, Path.Direction.CW);
        } else {
            this.wie.addRect(this.dy, Path.Direction.CW);
        }
        this.pmi.set(rect.left, rect.top, rect.right, rect.bottom);
        this.uh.reset();
        float[] fArr2 = this.sya;
        if (fArr2 != null) {
            this.uh.addRoundRect(this.pmi, fArr2, Path.Direction.CW);
        } else {
            this.uh.addRect(this.pmi, Path.Direction.CW);
        }
        this.dv = this.dy.width();
        if (this.dj) {
            this.wwx = new LinearGradient(0.0f, 0.0f, this.dv, 0.0f, this.lud, this.lt, Shader.TileMode.REPEAT);
            this.htf.reset();
            this.thx.setShader(this.wwx);
        }
        if (this.jc) {
            this.tn = new LinearGradient(0.0f, 0.0f, this.dv, 0.0f, this.xkz, this.syc, Shader.TileMode.REPEAT);
            dj();
            this.yzp = true;
        }
        if (this.hf) {
            lud();
        }
    }

    private void dj() {
        RectF rectF = this.pmi;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        this.kgy = Math.min(this.ea, Math.min(rectF.width(), this.pmi.height()) / 2.0f);
        int i2 = this.ry;
        int[] iArr = new int[i2];
        float[] fArr = new float[i2];
        int i3 = 0;
        while (true) {
            int i4 = this.ry;
            if (i3 < i4) {
                int i5 = i4 - 1;
                float f5 = i3 / i5;
                fArr[i3] = f5;
                if (i3 == i5) {
                    iArr[i3] = 16777215;
                } else {
                    double d = f5;
                    iArr[i3] = (((int) (Math.exp(((-4.0d) * d) * d) * 255.0d)) << 24) | 16777215;
                }
                i3++;
            } else {
                float f6 = this.kgy;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.rmf = new LinearGradient(0.0f, f2, 0.0f, f6 + f2, iArr, fArr, tileMode);
                this.aeu = new LinearGradient(0.0f, f4, 0.0f, f4 - this.kgy, iArr, fArr, tileMode);
                this.xz = new LinearGradient(f, 0.0f, this.kgy + f, 0.0f, iArr, fArr, tileMode);
                this.rmy = new LinearGradient(f3, 0.0f, f3 - this.kgy, 0.0f, iArr, fArr, tileMode);
                this.tru.setShader(this.tn);
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.ycx.draw(canvas);
        if (this.jc && this.tn != null) {
            ycx(canvas);
        }
        if (!this.dj || this.wwx == null) {
            return;
        }
        canvas.drawPath(this.wie, this.thx);
    }

    private void ycx(Canvas canvas) {
        Bitmap bitmap;
        RectF rectF = this.pmi;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        float f5 = this.kgy;
        int i2 = (int) (f3 - f);
        int i3 = (int) (f4 - f2);
        if (i2 <= 0 || i3 <= 0) {
            return;
        }
        if (!this.ul) {
            if (this.yzp || (bitmap = this.ifb) == null || bitmap.getWidth() < i2 || this.ifb.getHeight() < i3) {
                Bitmap bitmap2 = this.ifb;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.ifb = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.ifb);
                canvas2.translate(-f, -f2);
                canvas2.save();
                canvas2.clipPath(this.uh);
                canvas2.saveLayer(f, f2, f3, f4, null);
                ycx(canvas2, f, f2, f3, f4, f5);
                this.tru.setAlpha((int) (this.ok * 255.0f));
                this.tru.setXfermode(this.av);
                canvas2.drawRect(f, f2, f3, f4, this.tru);
                this.tru.setXfermode(null);
                canvas2.restore();
                canvas2.restore();
                this.yzp = false;
            }
            canvas.drawBitmap(this.ifb, f, f2, (Paint) null);
            return;
        }
        canvas.save();
        canvas.clipPath(this.uh);
        canvas.saveLayer(f, f2, f3, f4, null);
        ycx(canvas, f, f2, f3, f4, f5);
        this.tru.setAlpha((int) (this.ok * 255.0f));
        this.tru.setXfermode(this.av);
        canvas.drawRect(f, f2, f3, f4, this.tru);
        this.tru.setXfermode(null);
        canvas.restore();
        canvas.restore();
    }

    private void ycx(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
        this.bhi.setShader(this.rmf);
        canvas.drawRect(f, f2, f3, f2 + f5, this.bhi);
        this.bhi.setShader(this.aeu);
        canvas.drawRect(f, f4 - f5, f3, f4, this.bhi);
        this.bhi.setShader(this.xz);
        canvas.drawRect(f, f2, f + f5, f4, this.bhi);
        this.bhi.setShader(this.rmy);
        canvas.drawRect(f3 - f5, f2, f3, f4, this.bhi);
    }

    void ycx() {
        if (this.ul) {
            this.hf = true;
            if (this.dv > 0.0f) {
                if (this.wwx == null && this.tn == null) {
                    return;
                }
                lud();
            }
        }
    }

    private void lud() {
        zb();
        this.hf = false;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.dv);
        this.oty = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.fby);
        this.oty.setInterpolator(new LinearInterpolator());
        int i2 = this.jw;
        if (i2 == -1) {
            this.oty.setRepeatCount(-1);
        } else {
            this.oty.setRepeatCount(Math.max(0, i2 - 1));
        }
        this.oty.setRepeatMode(1);
        this.oty.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.ugeno.zb.ycx.zb.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                zb.this.htf.setTranslate(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                if (zb.this.wwx != null) {
                    zb.this.wwx.setLocalMatrix(zb.this.htf);
                }
                if (zb.this.tn != null) {
                    zb.this.tn.setLocalMatrix(zb.this.htf);
                }
                zb.this.invalidateSelf();
            }
        });
        this.oty.start();
    }

    void zb() {
        this.hf = false;
        ValueAnimator valueAnimator = this.oty;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.oty = null;
        }
    }

    boolean sya() {
        return this.ul;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.ycx.setAlpha(i2);
        this.thx.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.ycx.setColorFilter(colorFilter);
    }
}
