package com.bytedance.adsdk.ugeno.jc.dj;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.lud;
import com.bytedance.adsdk.ugeno.ycx.fby;
import com.bytedance.adsdk.ugeno.ycx.ul;
import java.util.HashMap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ycx extends ImageView implements IAnimation, ul {
    static final /* synthetic */ boolean zb = true;
    private Bitmap av;
    private Canvas bhi;
    private Path dv;
    private int dy;
    private Drawable ea;
    private float fby;
    private float hf;
    private lud htf;
    private boolean jc;
    private ColorFilter jw;
    private Drawable lt;
    private final float[] lud;
    private boolean ok;
    private Paint oty;
    private Shader.TileMode pmi;
    private final RectF rmf;
    private boolean ry;
    private float sya;
    private int syc;
    private fby thx;
    private float tn;
    private float tru;
    private Shader.TileMode uh;
    private ColorStateList ul;
    private ImageView.ScaleType wie;
    private boolean wwx;
    private boolean xkz;
    public static final Shader.TileMode ycx = Shader.TileMode.CLAMP;
    private static final ImageView.ScaleType[] dj = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    public ycx(Context context) {
        super(context);
        this.lud = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.ul = ColorStateList.valueOf(-16777216);
        this.fby = 0.0f;
        this.jw = null;
        this.jc = false;
        this.ok = false;
        this.ry = false;
        this.xkz = false;
        Shader.TileMode tileMode = ycx;
        this.pmi = tileMode;
        this.uh = tileMode;
        this.wwx = false;
        this.tn = 50.0f;
        this.rmf = new RectF();
        this.thx = new fby(this);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.wie;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!zb && scaleType == null) {
            throw new AssertionError();
        }
        if (this.wie != scaleType) {
            this.wie = scaleType;
            int i2 = AnonymousClass1.ycx[scaleType.ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
                super.setScaleType(scaleType);
            } else {
                super.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            sya();
            ycx(false);
            invalidate();
        }
    }

    /* renamed from: com.bytedance.adsdk.ugeno.jc.dj.ycx$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ycx;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            ycx = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ycx[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ycx[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ycx[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ycx[ImageView.ScaleType.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ycx[ImageView.ScaleType.CENTER_CROP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ycx[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.syc = 0;
        this.ea = zb.ycx(drawable);
        sya();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.syc = 0;
        this.ea = zb.ycx(bitmap);
        sya();
        super.setImageDrawable(this.ea);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        if (this.syc != i2) {
            this.syc = i2;
            this.ea = ycx();
            sya();
            super.setImageDrawable(this.ea);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    private Drawable ycx() throws Resources.NotFoundException {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i2 = this.syc;
        if (i2 != 0) {
            try {
                drawable = resources.getDrawable(i2);
            } catch (Exception unused) {
                this.syc = 0;
            }
        }
        return zb.ycx(drawable);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) throws Resources.NotFoundException {
        if (this.dy != i2) {
            this.dy = i2;
            Drawable drawableZb = zb();
            this.lt = drawableZb;
            setBackgroundDrawable(drawableZb);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        ColorDrawable colorDrawable = new ColorDrawable(i2);
        this.lt = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    private Drawable zb() throws Resources.NotFoundException {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i2 = this.dy;
        if (i2 != 0) {
            try {
                drawable = resources.getDrawable(i2);
            } catch (Exception unused) {
                this.dy = 0;
            }
        }
        return zb.ycx(drawable);
    }

    private void sya() {
        ycx(this.ea, this.wie);
    }

    private void ycx(boolean z) {
        if (this.xkz) {
            if (z) {
                this.lt = zb.ycx(this.lt);
            }
            ycx(this.lt, ImageView.ScaleType.FIT_XY);
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.jw != colorFilter) {
            this.jw = colorFilter;
            this.ok = true;
            this.jc = true;
            dj();
            invalidate();
        }
    }

    private void dj() {
        Drawable drawable = this.ea;
        if (drawable == null || !this.jc) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.ea = drawableMutate;
        if (this.ok) {
            drawableMutate.setColorFilter(this.jw);
        }
    }

    private void ycx(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable != null) {
            if (drawable instanceof zb) {
                zb zbVar = (zb) drawable;
                zbVar.ycx(scaleType).ycx(this.fby).ycx(this.ul).ycx(this.ry).ycx(this.pmi).zb(this.uh);
                float[] fArr = this.lud;
                if (fArr != null) {
                    zbVar.ycx(fArr[0], fArr[1], fArr[2], fArr[3]);
                }
                dj();
                return;
            }
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    ycx(layerDrawable.getDrawable(i2), scaleType);
                }
            }
        }
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.lt = drawable;
        ycx(true);
        super.setBackgroundDrawable(this.lt);
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float fMax = 0.0f;
        for (float f : this.lud) {
            fMax = Math.max(f, fMax);
        }
        return fMax;
    }

    public void setCornerRadiusDimen(int i2) throws Resources.NotFoundException {
        float dimension = getResources().getDimension(i2);
        ycx(dimension, dimension, dimension, dimension);
    }

    public void setCornerRadius(float f) {
        ycx(f, f, f, f);
    }

    public void ycx(float f, float f2, float f3, float f4) {
        float[] fArr = this.lud;
        if (fArr[0] == f && fArr[1] == f2 && fArr[2] == f4 && fArr[3] == f3) {
            return;
        }
        fArr[0] = f;
        fArr[1] = f2;
        fArr[3] = f3;
        fArr[2] = f4;
        sya();
        ycx(false);
        invalidate();
    }

    public float getBorderWidth() {
        return this.fby;
    }

    public void setBorderWidth(int i2) {
        setBorderWidth(getResources().getDimension(i2));
    }

    public void setBorderWidth(float f) {
        if (this.fby == f) {
            return;
        }
        this.fby = f;
        sya();
        ycx(false);
        invalidate();
    }

    public int getBorderColor() {
        return this.ul.getDefaultColor();
    }

    public void setBorderColor(int i2) {
        setBorderColor(ColorStateList.valueOf(i2));
    }

    public ColorStateList getBorderColors() {
        return this.ul;
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.ul.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.ul = colorStateList;
        sya();
        ycx(false);
        if (this.fby > 0.0f) {
            invalidate();
        }
    }

    public void setOval(boolean z) {
        this.ry = z;
        sya();
        ycx(false);
        invalidate();
    }

    public Shader.TileMode getTileModeX() {
        return this.pmi;
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.pmi == tileMode) {
            return;
        }
        this.pmi = tileMode;
        sya();
        ycx(false);
        invalidate();
    }

    public Shader.TileMode getTileModeY() {
        return this.uh;
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.uh == tileMode) {
            return;
        }
        this.uh = tileMode;
        sya();
        ycx(false);
        invalidate();
    }

    public void ycx(lud ludVar) {
        this.htf = ludVar;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i2, int i3) {
        lud ludVar = this.htf;
        if (ludVar != null) {
            int[] iArrYcx = ludVar.ycx(i2, i3);
            super.onMeasure(iArrYcx[0], iArrYcx[1]);
        } else {
            super.onMeasure(i2, i3);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        lud ludVar = this.htf;
        if (ludVar != null) {
            ludVar.ycx(i2, i3, i4, i5);
        }
        super.onLayout(z, i2, i3, i4, i5);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.wwx && (canvas2 = this.bhi) != null && this.av != null) {
            super.onDraw(canvas2);
            this.bhi.drawPath(this.dv, this.oty);
            canvas.drawBitmap(this.av, 0.0f, 0.0f, (Paint) null);
        } else {
            super.onDraw(canvas);
        }
        lud ludVar = this.htf;
        if (ludVar != null) {
            ludVar.ycx(canvas, this);
            this.htf.ycx(canvas);
        }
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        lud ludVar = this.htf;
        if (ludVar != null) {
            ludVar.zb(canvas);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        lud ludVar = this.htf;
        if (ludVar != null) {
            ludVar.zb(i2, i3, i4, i4);
        }
        if (i2 <= 0 || i3 <= 0 || !this.wwx) {
            return;
        }
        this.av = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        this.bhi = new Canvas(this.av);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        lud ludVar = this.htf;
        if (ludVar != null) {
            ludVar.ul();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lud ludVar = this.htf;
        if (ludVar != null) {
            ludVar.fby();
        }
        Canvas canvas = this.bhi;
        if (canvas != null) {
            canvas.setBitmap(null);
        }
        Bitmap bitmap = this.av;
        if (bitmap != null) {
            bitmap.recycle();
            this.bhi = null;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int iWidth;
        if (this.wwx) {
            this.htf.ul();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.dv.moveTo(x, y);
                this.hf = x;
                this.tru = y;
                HashMap map = new HashMap();
                map.put("state", 1);
                this.htf.ycx("eraseState", map);
            } else if (action == 1) {
                this.dv.computeBounds(this.rmf, true);
                try {
                    iWidth = (int) (((this.rmf.width() * this.rmf.height()) / (getWidth() * getHeight())) * 100.0f);
                } catch (Exception unused) {
                    iWidth = 0;
                }
                HashMap map2 = new HashMap();
                map2.put("state", 2);
                map2.put("percent", Integer.valueOf(iWidth));
                this.htf.ycx("eraseState", map2);
            } else if (action == 2 && x > 0.0f && x < getWidth() && y > 0.0f && y < getHeight()) {
                float f = this.hf;
                float f2 = this.tru;
                this.dv.quadTo(f, f2, (f + x) / 2.0f, (f2 + y) / 2.0f);
                this.hf = x;
                this.tru = y;
            }
            postInvalidate();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.ycx.ul
    public float getRipple() {
        return this.sya;
    }

    public void setShine(float f) {
        fby fbyVar = this.thx;
        if (fbyVar != null) {
            fbyVar.sya(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.ul
    public float getShine() {
        return this.thx.getShine();
    }

    public void setStretch(float f) {
        fby fbyVar = this.thx;
        if (fbyVar != null) {
            fbyVar.dj(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.ul
    public float getStretch() {
        return this.thx.getStretch();
    }

    public void setRubIn(float f) {
        fby fbyVar = this.thx;
        if (fbyVar != null) {
            fbyVar.lud(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.ul
    public float getRubIn() {
        return this.thx.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f) {
        this.sya = f;
        fby fbyVar = this.thx;
        if (fbyVar != null) {
            fbyVar.zb(f);
        }
        postInvalidate();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        lud ludVar = this.htf;
        if (ludVar != null) {
            ludVar.ycx(z);
        }
    }

    public void setBorderRadius(float f) {
        fby fbyVar = this.thx;
        if (fbyVar != null) {
            fbyVar.ycx(f);
        }
    }

    public float getBorderRadius() {
        return this.thx.ycx();
    }

    public void setEraseEnabled(boolean z) {
        if (z) {
            this.dv = new Path();
            Paint paint = new Paint();
            this.oty = paint;
            paint.setAntiAlias(true);
            this.oty.setDither(true);
            this.oty.setStyle(Paint.Style.STROKE);
            this.oty.setStrokeWidth(this.tn * 2.0f);
            this.oty.setStrokeCap(Paint.Cap.ROUND);
            this.oty.setStrokeJoin(Paint.Join.ROUND);
            this.oty.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            this.oty.setColor(0);
            this.wwx = true;
        } else {
            this.wwx = false;
        }
        postInvalidate();
    }

    public void setEraseRadius(float f) {
        this.tn = f;
        Paint paint = this.oty;
        if (paint != null) {
            paint.setStrokeWidth(f * 2.0f);
        }
    }
}
