package com.bytedance.sdk.component.adexpress.lt;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import o.CompositionLocalKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dv extends ImageView {
    private Matrix dj;
    private int sya;
    private Paint ycx;
    private int zb;

    public dv(Context context) {
        this(context, null);
    }

    public dv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public dv(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.zb = 25;
        this.sya = 25;
        Paint paint = new Paint();
        this.ycx = paint;
        paint.setAntiAlias(true);
        this.ycx.setFilterBitmap(true);
        this.dj = new Matrix();
    }

    public void setXRound(int i2) {
        this.zb = i2;
        postInvalidate();
    }

    public void setYRound(int i2) {
        this.sya = i2;
        postInvalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && CompositionLocalKtExternalSyntheticLambda0.onWarmupCompleted(drawable)) {
            super.onDraw(canvas);
            return;
        }
        if (drawable != null) {
            Bitmap bitmapYcx = ycx(drawable);
            if (bitmapYcx != null) {
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                BitmapShader bitmapShader = new BitmapShader(bitmapYcx, tileMode, tileMode);
                float fMax = (bitmapYcx.getWidth() == getWidth() && bitmapYcx.getHeight() == getHeight()) ? 1.0f : Math.max(getWidth() / bitmapYcx.getWidth(), getHeight() / bitmapYcx.getHeight());
                this.dj.setScale(fMax, fMax);
                bitmapShader.setLocalMatrix(this.dj);
                this.ycx.setShader(bitmapShader);
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.zb, this.sya, this.ycx);
                return;
            }
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
    }

    private Bitmap ycx(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int width = drawable.getIntrinsicWidth() <= 0 ? getWidth() : drawable.getIntrinsicWidth();
        int height = drawable.getIntrinsicHeight() <= 0 ? getHeight() : drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }
}
