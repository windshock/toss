package io.fincube.creditcard;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Display;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class Preview extends ViewGroup {
    boolean IAuthTabCallback;
    private Context onExtraCallback;
    private int onExtraCallbackWithResult;
    private int onNavigationEvent;
    private TextureView onTransact;
    private int onWarmupCompleted;

    public void setFullScreen(boolean z) {
        this.IAuthTabCallback = z;
    }

    public float IAuthTabCallback() {
        return asInterface();
    }

    private float asInterface() {
        Context context = this.onExtraCallback;
        if (context == null || this.onNavigationEvent <= 0 || this.onWarmupCompleted <= 0) {
            return 1.0f;
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        if (width <= 0 || height <= 0) {
            return 1.0f;
        }
        boolean z = height > width;
        int rotation = defaultDisplay.getRotation();
        int i = this.onExtraCallbackWithResult;
        boolean z2 = i == 0 || i == 2;
        int i2 = this.onNavigationEvent;
        int i3 = this.onWarmupCompleted;
        boolean z3 = (z2 || z || rotation == 0 || rotation == 2) ? z2 == (i2 < i3) : true;
        int i4 = z3 ? i3 : i2;
        if (!z3) {
            i2 = i3;
        }
        float f = width;
        float f2 = i4;
        int iRound = Math.round(f2 * Math.max(f / f2, height / i2));
        if ((width - iRound) / 2 >= 0 || iRound <= width) {
            return 1.0f;
        }
        return f / iRound;
    }

    public Preview(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        this.IAuthTabCallback = false;
        this.onNavigationEvent = i2;
        this.onWarmupCompleted = i;
        if (i3 == 0) {
            this.onNavigationEvent = i;
            this.onWarmupCompleted = i2;
        }
        this.onExtraCallbackWithResult = i3;
        this.onExtraCallback = context;
        TextureView textureView = new TextureView(context);
        this.onTransact = textureView;
        textureView.setAlpha(0.0f);
        setBackgroundColor(-16777216);
        addView(this.onTransact);
    }

    public void setOrientationInfo(int i) {
        this.onExtraCallbackWithResult = i;
    }

    public void onNavigationEvent(int i, int i2) {
        SurfaceTexture surfaceTexture;
        if (this.onExtraCallbackWithResult == 0) {
            this.onNavigationEvent = i;
            this.onWarmupCompleted = i2;
        } else {
            this.onNavigationEvent = i2;
            this.onWarmupCompleted = i;
        }
        TextureView textureView = this.onTransact;
        if (textureView != null && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
        requestLayout();
        onExtraCallbackWithResult();
    }

    public Surface onNavigationEvent() {
        SurfaceTexture surfaceTexture;
        TextureView textureView = this.onTransact;
        if (textureView == null || (surfaceTexture = textureView.getSurfaceTexture()) == null) {
            return null;
        }
        return new Surface(surfaceTexture);
    }

    public SurfaceTexture onWarmupCompleted() {
        TextureView textureView = this.onTransact;
        if (textureView == null) {
            return null;
        }
        return textureView.getSurfaceTexture();
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        TextureView textureView = this.onTransact;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(surfaceTextureListener);
        }
    }

    public boolean onTransact() {
        TextureView textureView = this.onTransact;
        return textureView != null && textureView.isAvailable();
    }

    public void onExtraCallbackWithResult() {
        TextureView textureView = this.onTransact;
        if (textureView == null || this.onExtraCallback == null) {
            return;
        }
        int width = textureView.getWidth();
        int height = this.onTransact.getHeight();
        if (width <= 0 || height <= 0 || this.onNavigationEvent <= 0 || this.onWarmupCompleted <= 0) {
            return;
        }
        int rotation = ((WindowManager) this.onExtraCallback.getSystemService("window")).getDefaultDisplay().getRotation();
        int iMax = Math.max(this.onNavigationEvent, this.onWarmupCompleted);
        int iMin = Math.min(this.onNavigationEvent, this.onWarmupCompleted);
        Matrix matrix = new Matrix();
        float f = width;
        float f2 = height;
        RectF rectF = new RectF(0.0f, 0.0f, f, f2);
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        if (rotation == 1 || rotation == 3) {
            float f3 = iMin;
            float f4 = iMax;
            RectF rectF2 = new RectF(0.0f, 0.0f, f3, f4);
            rectF2.offset(fCenterX - rectF2.centerX(), fCenterY - rectF2.centerY());
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            float fMax = Math.max(f2 / f3, f / f4);
            matrix.postScale(fMax, fMax, fCenterX, fCenterY);
            matrix.postRotate((rotation - 2) * 90, fCenterX, fCenterY);
        } else if (rotation == 2) {
            matrix.postRotate(180.0f, fCenterX, fCenterY);
        }
        this.onTransact.setTransform(matrix);
    }

    public Bitmap IAuthTabCallback(int i, int i2) {
        TextureView textureView = this.onTransact;
        if (textureView == null || !textureView.isAvailable() || i <= 0 || i2 <= 0) {
            return null;
        }
        try {
            return this.onTransact.getBitmap(i, i2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void IAuthTabCallbackStub() {
        TextureView textureView = this.onTransact;
        if (textureView == null || textureView.getAlpha() == 1.0f) {
            return;
        }
        this.onTransact.setAlpha(1.0f);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSize(getSuggestedMinimumWidth(), i), View.resolveSize(getSuggestedMinimumHeight(), i2));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!z || getChildCount() == 0 || this.onTransact == null) {
            return;
        }
        int width = i3 - i;
        int height = i4 - i2;
        Display defaultDisplay = ((WindowManager) this.onExtraCallback.getSystemService("window")).getDefaultDisplay();
        defaultDisplay.getRotation();
        if (this.IAuthTabCallback) {
            width = defaultDisplay.getWidth();
            height = defaultDisplay.getHeight();
        }
        boolean z2 = height > width;
        int rotation = defaultDisplay.getRotation();
        int i5 = this.onExtraCallbackWithResult;
        boolean z3 = i5 == 0 || i5 == 2;
        int i6 = this.onNavigationEvent;
        int i7 = this.onWarmupCompleted;
        boolean z4 = z3 == (i6 < i7);
        if ((z3 || z2 || rotation == 0 || rotation == 2) && !z4) {
            i7 = i6;
            i6 = i7;
        }
        float f = i6;
        float f2 = i7;
        float fMax = Math.max(width / f2, height / f);
        int iRound = Math.round(f2 * fMax);
        int iRound2 = Math.round(f * fMax);
        this.onTransact.layout((width - iRound) / 2, (height - iRound2) / 2, (width + iRound) / 2, (height + iRound2) / 2);
        onExtraCallbackWithResult();
    }

    @Deprecated
    public View onExtraCallback() {
        return this.onTransact;
    }
}
