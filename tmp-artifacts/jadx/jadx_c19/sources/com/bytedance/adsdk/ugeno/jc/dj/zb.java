package com.bytedance.adsdk.ugeno.jc.dj;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.widget.ImageView;
import java.util.HashSet;
import o.CompositionLocalKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb extends Drawable {
    private final Bitmap dj;
    private final boolean[] dy;
    private final RectF ea;
    private final RectF fby;
    private ImageView.ScaleType htf;
    private final Matrix jc;
    private final Paint jw;
    private final int lt;
    private final Paint lud;
    private Shader.TileMode ok;
    private float pmi;
    private Shader.TileMode ry;
    private final RectF sya;
    private float syc;
    private ColorStateList uh;
    private final int ul;
    private boolean wie;
    private boolean xkz;
    private final RectF ycx = new RectF();
    private final RectF zb = new RectF();

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public zb(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.sya = rectF;
        this.fby = new RectF();
        this.jc = new Matrix();
        this.ea = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.ok = tileMode;
        this.ry = tileMode;
        this.xkz = true;
        this.syc = 0.0f;
        this.dy = new boolean[]{true, true, true, true};
        this.wie = false;
        this.pmi = 0.0f;
        this.uh = ColorStateList.valueOf(-16777216);
        this.htf = ImageView.ScaleType.FIT_CENTER;
        this.dj = bitmap;
        int width = bitmap.getWidth();
        this.lt = width;
        int height = bitmap.getHeight();
        this.ul = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.lud = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.jw = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.uh.getColorForState(getState(), -16777216));
        paint2.setStrokeWidth(this.pmi);
    }

    public static zb ycx(Bitmap bitmap) {
        if (bitmap != null) {
            return new zb(bitmap);
        }
        return null;
    }

    public static Drawable ycx(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof zb) {
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && CompositionLocalKtExternalSyntheticLambda0.onWarmupCompleted(drawable)) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                Drawable.ConstantState constantState = drawable.mutate().getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i2), ycx(layerDrawable.getDrawable(i2)));
                }
                return layerDrawable;
            }
        }
        Bitmap bitmapZb = zb(drawable);
        return bitmapZb != null ? new zb(bitmapZb) : drawable;
    }

    public static Bitmap zb(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.uh.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState = this.uh.getColorForState(iArr, 0);
        if (this.jw.getColor() != colorForState) {
            this.jw.setColor(colorForState);
            return true;
        }
        return super.onStateChange(iArr);
    }

    /* renamed from: com.bytedance.adsdk.ugeno.jc.dj.zb$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ycx;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            ycx = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ycx[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ycx[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ycx[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ycx[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ycx[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ycx[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private void ycx() {
        float fWidth;
        float fHeight;
        int i2 = AnonymousClass1.ycx[this.htf.ordinal()];
        if (i2 == 1) {
            this.fby.set(this.ycx);
            RectF rectF = this.fby;
            float f = this.pmi / 2.0f;
            rectF.inset(f, f);
            this.jc.reset();
            this.jc.setTranslate((int) (((this.fby.width() - this.lt) * 0.5f) + 0.5f), (int) (((this.fby.height() - this.ul) * 0.5f) + 0.5f));
        } else if (i2 == 2) {
            this.fby.set(this.ycx);
            RectF rectF2 = this.fby;
            float f2 = this.pmi / 2.0f;
            rectF2.inset(f2, f2);
            this.jc.reset();
            float fWidth2 = 0.0f;
            if (this.lt * this.fby.height() > this.fby.width() * this.ul) {
                fWidth = this.fby.height() / this.ul;
                fHeight = 0.0f;
                fWidth2 = (this.fby.width() - (this.lt * fWidth)) * 0.5f;
            } else {
                fWidth = this.fby.width() / this.lt;
                fHeight = (this.fby.height() - (this.ul * fWidth)) * 0.5f;
            }
            this.jc.setScale(fWidth, fWidth);
            Matrix matrix = this.jc;
            float f3 = this.pmi / 2.0f;
            matrix.postTranslate(((int) (fWidth2 + 0.5f)) + f3, ((int) (fHeight + 0.5f)) + f3);
        } else if (i2 == 3) {
            this.jc.reset();
            float fMin = (((float) this.lt) > this.ycx.width() || ((float) this.ul) > this.ycx.height()) ? Math.min(this.ycx.width() / this.lt, this.ycx.height() / this.ul) : 1.0f;
            float fWidth3 = (int) (((this.ycx.width() - (this.lt * fMin)) * 0.5f) + 0.5f);
            float fHeight2 = (int) (((this.ycx.height() - (this.ul * fMin)) * 0.5f) + 0.5f);
            this.jc.setScale(fMin, fMin);
            this.jc.postTranslate(fWidth3, fHeight2);
            this.fby.set(this.sya);
            this.jc.mapRect(this.fby);
            RectF rectF3 = this.fby;
            float f4 = this.pmi / 2.0f;
            rectF3.inset(f4, f4);
            this.jc.setRectToRect(this.sya, this.fby, Matrix.ScaleToFit.FILL);
        } else if (i2 == 5) {
            this.fby.set(this.sya);
            this.jc.setRectToRect(this.sya, this.ycx, Matrix.ScaleToFit.END);
            this.jc.mapRect(this.fby);
            RectF rectF4 = this.fby;
            float f5 = this.pmi / 2.0f;
            rectF4.inset(f5, f5);
            this.jc.setRectToRect(this.sya, this.fby, Matrix.ScaleToFit.FILL);
        } else if (i2 == 6) {
            this.fby.set(this.sya);
            this.jc.setRectToRect(this.sya, this.ycx, Matrix.ScaleToFit.START);
            this.jc.mapRect(this.fby);
            RectF rectF5 = this.fby;
            float f6 = this.pmi / 2.0f;
            rectF5.inset(f6, f6);
            this.jc.setRectToRect(this.sya, this.fby, Matrix.ScaleToFit.FILL);
        } else if (i2 != 7) {
            this.fby.set(this.sya);
            this.jc.setRectToRect(this.sya, this.ycx, Matrix.ScaleToFit.CENTER);
            this.jc.mapRect(this.fby);
            RectF rectF6 = this.fby;
            float f7 = this.pmi / 2.0f;
            rectF6.inset(f7, f7);
            this.jc.setRectToRect(this.sya, this.fby, Matrix.ScaleToFit.FILL);
        } else {
            this.fby.set(this.ycx);
            RectF rectF7 = this.fby;
            float f8 = this.pmi / 2.0f;
            rectF7.inset(f8, f8);
            this.jc.reset();
            this.jc.setRectToRect(this.sya, this.fby, Matrix.ScaleToFit.FILL);
        }
        this.zb.set(this.fby);
        this.xkz = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.ycx.set(rect);
        ycx();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.xkz) {
            BitmapShader bitmapShader = new BitmapShader(this.dj, this.ok, this.ry);
            Shader.TileMode tileMode = this.ok;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.ry == tileMode2) {
                bitmapShader.setLocalMatrix(this.jc);
            }
            this.lud.setShader(bitmapShader);
            this.xkz = false;
        }
        if (this.wie) {
            if (this.pmi > 0.0f) {
                canvas.drawOval(this.zb, this.lud);
                canvas.drawOval(this.fby, this.jw);
                return;
            } else {
                canvas.drawOval(this.zb, this.lud);
                return;
            }
        }
        if (ycx(this.dy)) {
            float f = this.syc;
            if (this.pmi > 0.0f) {
                canvas.drawRoundRect(this.zb, f, f, this.lud);
                canvas.drawRoundRect(this.fby, f, f, this.jw);
                ycx(canvas);
                zb(canvas);
                return;
            }
            canvas.drawRoundRect(this.zb, f, f, this.lud);
            ycx(canvas);
            return;
        }
        canvas.drawRect(this.zb, this.lud);
        if (this.pmi > 0.0f) {
            canvas.drawRect(this.fby, this.jw);
        }
    }

    private void ycx(Canvas canvas) {
        if (zb(this.dy) || this.syc == 0.0f) {
            return;
        }
        RectF rectF = this.zb;
        float f = rectF.left;
        float f2 = rectF.top;
        float fWidth = rectF.width() + f;
        float fHeight = this.zb.height() + f2;
        float f3 = this.syc;
        if (!this.dy[0]) {
            this.ea.set(f, f2, f + f3, f2 + f3);
            canvas.drawRect(this.ea, this.lud);
        }
        if (!this.dy[1]) {
            this.ea.set(fWidth - f3, f2, fWidth, f3);
            canvas.drawRect(this.ea, this.lud);
        }
        if (!this.dy[2]) {
            this.ea.set(fWidth - f3, fHeight - f3, fWidth, fHeight);
            canvas.drawRect(this.ea, this.lud);
        }
        if (this.dy[3]) {
            return;
        }
        this.ea.set(f, fHeight - f3, f3 + f, fHeight);
        canvas.drawRect(this.ea, this.lud);
    }

    private void zb(Canvas canvas) {
        float f;
        if (zb(this.dy) || this.syc == 0.0f) {
            return;
        }
        RectF rectF = this.zb;
        float f2 = rectF.left;
        float f3 = rectF.top;
        float fWidth = rectF.width() + f2;
        float fHeight = f3 + this.zb.height();
        float f4 = this.syc;
        float f5 = this.pmi / 2.0f;
        if (!this.dy[0]) {
            canvas.drawLine(f2 - f5, f3, f2 + f4, f3, this.jw);
            canvas.drawLine(f2, f3 - f5, f2, f3 + f4, this.jw);
        }
        if (!this.dy[1]) {
            canvas.drawLine((fWidth - f4) - f5, f3, fWidth, f3, this.jw);
            canvas.drawLine(fWidth, f3 - f5, fWidth, f3 + f4, this.jw);
        }
        if (this.dy[2]) {
            f = f4;
        } else {
            f = f4;
            canvas.drawLine((fWidth - f4) - f5, fHeight, fWidth + f5, fHeight, this.jw);
            canvas.drawLine(fWidth, fHeight - f, fWidth, fHeight, this.jw);
        }
        if (this.dy[3]) {
            return;
        }
        canvas.drawLine(f2 - f5, fHeight, f2 + f, fHeight, this.jw);
        canvas.drawLine(f2, fHeight - f, f2, fHeight, this.jw);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.lud.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.lud.setAlpha(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.lud.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.lud.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.lud.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.lud.setFilterBitmap(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.lt;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.ul;
    }

    public zb ycx(float f, float f2, float f3, float f4) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f));
        hashSet.add(Float.valueOf(f2));
        hashSet.add(Float.valueOf(f3));
        hashSet.add(Float.valueOf(f4));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
        }
        if (!hashSet.isEmpty()) {
            float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
            if (Float.isInfinite(fFloatValue) || Float.isNaN(fFloatValue) || fFloatValue < 0.0f) {
                throw new IllegalArgumentException("Invalid radius value: ".concat(String.valueOf(fFloatValue)));
            }
            this.syc = fFloatValue;
        } else {
            this.syc = 0.0f;
        }
        boolean[] zArr = this.dy;
        zArr[0] = f > 0.0f;
        zArr[1] = f2 > 0.0f;
        zArr[2] = f3 > 0.0f;
        zArr[3] = f4 > 0.0f;
        return this;
    }

    public zb ycx(float f) {
        this.pmi = f;
        this.jw.setStrokeWidth(f);
        return this;
    }

    public zb ycx(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.uh = colorStateList;
        this.jw.setColor(colorStateList.getColorForState(getState(), -16777216));
        return this;
    }

    public zb ycx(boolean z) {
        this.wie = z;
        return this;
    }

    public zb ycx(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.htf != scaleType) {
            this.htf = scaleType;
            ycx();
        }
        return this;
    }

    public zb ycx(Shader.TileMode tileMode) {
        if (this.ok != tileMode) {
            this.ok = tileMode;
            this.xkz = true;
            invalidateSelf();
        }
        return this;
    }

    public zb zb(Shader.TileMode tileMode) {
        if (this.ry != tileMode) {
            this.ry = tileMode;
            this.xkz = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean ycx(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    private static boolean zb(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }
}
