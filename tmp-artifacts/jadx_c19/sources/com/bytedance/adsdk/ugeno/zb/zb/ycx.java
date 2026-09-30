package com.bytedance.adsdk.ugeno.zb.zb;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Choreographer;
import com.bytedance.adsdk.ugeno.zb.zb.zb;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ycx extends Drawable {
    private boolean lt;
    private Choreographer lud;
    private final Paint sya;
    private final lud ycx;
    private final zb.dj[] zb;
    private final Path dj = new Path();
    private final Choreographer.FrameCallback ul = new Choreographer.FrameCallback() { // from class: com.bytedance.adsdk.ugeno.zb.zb.ycx.1
        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            if (ycx.this.lt) {
                ycx.this.invalidateSelf();
                if (!ycx.this.lt || ycx.this.lud == null) {
                    return;
                }
                ycx.this.lud.postFrameCallback(this);
            }
        }
    };

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    ycx(lud ludVar) {
        this.ycx = ludVar;
        this.zb = ludVar.sya();
        Paint paint = new Paint(1);
        this.sya = paint;
        paint.setStyle(Paint.Style.FILL);
        if (ludVar.zb().ycx().lt == 1) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.ADD));
        }
    }

    void ycx() {
        if (this.lt) {
            return;
        }
        this.lt = true;
        try {
            Choreographer choreographer = Choreographer.getInstance();
            this.lud = choreographer;
            choreographer.postFrameCallback(this.ul);
        } catch (Throwable unused) {
            this.lt = false;
        }
    }

    void zb() {
        this.lt = false;
        Choreographer choreographer = this.lud;
        if (choreographer != null) {
            choreographer.removeFrameCallback(this.ul);
            this.lud = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.ycx.ycx(rect.width(), rect.height());
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        lt ltVarYcx;
        int i2;
        Rect bounds = getBounds();
        if (bounds.width() <= 0 || bounds.height() <= 0 || (i2 = (ltVarYcx = this.ycx.ycx()).ycx) <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(bounds.left, bounds.top);
        try {
            ycx(canvas, ltVarYcx, i2);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void ycx(Canvas canvas, lt ltVar, int i2) {
        int i3;
        zb.ycx ycxVar;
        int i4;
        int i5 = i2;
        int[] iArrYcx = ycx(ltVar, i5);
        float[] fArr = ltVar.sya;
        float[] fArr2 = ltVar.dj;
        float[] fArr3 = ltVar.lud;
        float[] fArr4 = ltVar.lt;
        int[] iArr = ltVar.fby;
        zb.dj[] djVarArr = this.zb;
        int i6 = 0;
        while (i6 < i5) {
            int i7 = iArrYcx[i6];
            int i8 = iArr[i7];
            if (i8 < 0 || i8 >= djVarArr.length || (ycxVar = djVarArr[i8].ok) == null) {
                i3 = i6;
            } else {
                float f = fArr3[i7];
                float f2 = ycxVar.sya * f;
                float f3 = ycxVar.dj * f;
                if (f2 > 0.0f && f3 > 0.0f && (i4 = (int) ((fArr4[i7] * 255.0f) + 0.5f)) > 0) {
                    i3 = i6;
                    if (i4 > 255) {
                        i4 = 255;
                    }
                    this.sya.setColor(ycxVar.lud);
                    this.sya.setAlpha(i4);
                    float f4 = fArr[i7];
                    float f5 = fArr2[i7];
                    int i9 = ycxVar.zb;
                    if (i9 == 1) {
                        float f6 = f2 / 2.0f;
                        float f7 = f3 / 2.0f;
                        canvas.drawRect(f4 - f6, f5 - f7, f6 + f4, f7 + f5, this.sya);
                    } else if (i9 == 2) {
                        ycx(canvas, f4, f5, Math.min(f2, f3) / 2.0f);
                    } else {
                        canvas.drawCircle(f4, f5, Math.min(f2, f3) / 2.0f, this.sya);
                    }
                }
            }
            i6 = i3 + 1;
            i5 = i2;
        }
    }

    private int[] ycx(lt ltVar, int i2) {
        int[] iArr = ltVar.jw;
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = i3;
        }
        int i4 = ltVar.zb;
        if (i4 != 0 && i4 != 1 && i2 > 1) {
            ycx(iArr, ltVar.ul, i2, i4 == 4);
        }
        return iArr;
    }

    private static void ycx(int[] iArr, float[] fArr, int i2, boolean z) {
        for (int i3 = 1; i3 < i2; i3++) {
            int i4 = iArr[i3];
            float f = fArr[i4];
            int i5 = i3 - 1;
            if (z) {
                while (i5 >= 0) {
                    int i6 = iArr[i5];
                    if (fArr[i6] > f) {
                        iArr[i5 + 1] = i6;
                        i5--;
                    }
                }
            } else {
                while (i5 >= 0) {
                    int i7 = iArr[i5];
                    if (fArr[i7] < f) {
                        iArr[i5 + 1] = i7;
                        i5--;
                    }
                }
            }
            iArr[i5 + 1] = i4;
        }
    }

    private void ycx(Canvas canvas, float f, float f2, float f3) {
        Path path = this.dj;
        path.rewind();
        float f4 = -1.5707964f;
        for (int i2 = 0; i2 < 10; i2++) {
            float f5 = i2 % 2 == 0 ? f3 : 0.5f * f3;
            double d = f4;
            float fCos = (((float) Math.cos(d)) * f5) + f;
            float fSin = (((float) Math.sin(d)) * f5) + f2;
            if (i2 == 0) {
                path.moveTo(fCos, fSin);
            } else {
                path.lineTo(fCos, fSin);
            }
            f4 += 0.62831855f;
        }
        path.close();
        canvas.drawPath(path, this.sya);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.sya.setColorFilter(colorFilter);
    }
}
