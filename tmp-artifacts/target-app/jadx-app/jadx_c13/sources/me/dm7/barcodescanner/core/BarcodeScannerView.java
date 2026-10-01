package me.dm7.barcodescanner.core;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.io.IOException;
import o.ApmHelper1;
import o.ApmHelperzb;
import o.isIsInit;
import o.reportPvFromBackGround;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class BarcodeScannerView extends FrameLayout implements Camera.PreviewCallback {
    private Boolean IAuthTabCallback;
    private CameraPreview IAuthTabCallbackDefault;
    private boolean asBinder;
    private Rect onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private ApmHelper1 onNavigationEvent;
    private ApmHelperzb onTransact;
    private reportPvFromBackGround onWarmupCompleted;

    public BarcodeScannerView(Context context) {
        super(context);
        this.onExtraCallbackWithResult = true;
        this.asBinder = true;
    }

    public BarcodeScannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onExtraCallbackWithResult = true;
        this.asBinder = true;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.BarcodeScannerView, 0, 0);
        try {
            onExtraCallbackWithResult(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BarcodeScannerView_shouldScaleToFill, true));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onExtraCallbackWithResult(reportPvFromBackGround reportpvfrombackground) {
        removeAllViews();
        CameraPreview cameraPreview = new CameraPreview(getContext(), reportpvfrombackground, this);
        this.IAuthTabCallbackDefault = cameraPreview;
        cameraPreview.setShouldScaleToFill(this.asBinder);
        if (!this.asBinder) {
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setGravity(17);
            relativeLayout.setBackgroundColor(-16777216);
            relativeLayout.addView(this.IAuthTabCallbackDefault);
            addView(relativeLayout);
        } else {
            addView(this.IAuthTabCallbackDefault);
        }
        ApmHelperzb apmHelperzbOnExtraCallback = onExtraCallback(getContext());
        this.onTransact = apmHelperzbOnExtraCallback;
        if (apmHelperzbOnExtraCallback instanceof View) {
            addView((View) apmHelperzbOnExtraCallback);
            return;
        }
        throw new IllegalArgumentException("IViewFinder object returned by 'createViewFinderView()' should be instance of android.view.View");
    }

    protected ApmHelperzb onExtraCallback(Context context) {
        return new ViewFinderView(context);
    }

    public void onWarmupCompleted(int i) {
        if (this.onNavigationEvent == null) {
            this.onNavigationEvent = new ApmHelper1(this);
        }
        this.onNavigationEvent.IAuthTabCallback(i);
    }

    public void setupCameraPreview(reportPvFromBackGround reportpvfrombackground) {
        this.onWarmupCompleted = reportpvfrombackground;
        if (reportpvfrombackground != null) {
            onExtraCallbackWithResult(reportpvfrombackground);
            this.onTransact.setupViewFinder();
            Boolean bool = this.IAuthTabCallback;
            if (bool != null) {
                onNavigationEvent(bool.booleanValue());
            }
            IAuthTabCallback(this.onExtraCallbackWithResult);
        }
    }

    public void onNavigationEvent() {
        onWarmupCompleted(isIsInit.onWarmupCompleted());
    }

    public void onWarmupCompleted() {
        if (this.onWarmupCompleted != null) {
            this.IAuthTabCallbackDefault.IAuthTabCallback();
            this.IAuthTabCallbackDefault.setCamera(null, null);
            this.onWarmupCompleted.IAuthTabCallback.release();
            this.onWarmupCompleted = null;
        }
        ApmHelper1 apmHelper1 = this.onNavigationEvent;
        if (apmHelper1 != null) {
            apmHelper1.quit();
            this.onNavigationEvent = null;
        }
    }

    public void onExtraCallback() {
        CameraPreview cameraPreview = this.IAuthTabCallbackDefault;
        if (cameraPreview != null) {
            cameraPreview.IAuthTabCallback();
        }
    }

    public void IAuthTabCallbackStub() throws IOException {
        CameraPreview cameraPreview = this.IAuthTabCallbackDefault;
        if (cameraPreview != null) {
            cameraPreview.onNavigationEvent();
        }
    }

    public Rect IAuthTabCallback(int i, int i2) {
        synchronized (this) {
            if (this.onExtraCallback == null) {
                Rect rectOnExtraCallbackWithResult = this.onTransact.onExtraCallbackWithResult();
                int width = this.onTransact.getWidth();
                int height = this.onTransact.getHeight();
                if (rectOnExtraCallbackWithResult == null || width == 0 || height == 0) {
                    return null;
                }
                Rect rect = new Rect(rectOnExtraCallbackWithResult);
                if (i < width) {
                    rect.left = (rect.left * i) / width;
                    rect.right = (rect.right * i) / width;
                }
                if (i2 < height) {
                    rect.top = (rect.top * i2) / height;
                    rect.bottom = (rect.bottom * i2) / height;
                }
                this.onExtraCallback = rect;
            }
            return this.onExtraCallback;
        }
    }

    public void onNavigationEvent(boolean z) {
        this.IAuthTabCallback = Boolean.valueOf(z);
        reportPvFromBackGround reportpvfrombackground = this.onWarmupCompleted;
        if (reportpvfrombackground == null || !isIsInit.onExtraCallback(reportpvfrombackground.IAuthTabCallback)) {
            return;
        }
        Camera.Parameters parameters = this.onWarmupCompleted.IAuthTabCallback.getParameters();
        if (z) {
            if (parameters.getFlashMode().equals("torch")) {
                return;
            } else {
                parameters.setFlashMode("torch");
            }
        } else if (parameters.getFlashMode().equals("off")) {
            return;
        } else {
            parameters.setFlashMode("off");
        }
        this.onWarmupCompleted.IAuthTabCallback.setParameters(parameters);
    }

    public boolean IAuthTabCallback() {
        reportPvFromBackGround reportpvfrombackground = this.onWarmupCompleted;
        return reportpvfrombackground != null && isIsInit.onExtraCallback(reportpvfrombackground.IAuthTabCallback) && this.onWarmupCompleted.IAuthTabCallback.getParameters().getFlashMode().equals("torch");
    }

    public void onTransact() {
        reportPvFromBackGround reportpvfrombackground = this.onWarmupCompleted;
        if (reportpvfrombackground == null || !isIsInit.onExtraCallback(reportpvfrombackground.IAuthTabCallback)) {
            return;
        }
        Camera.Parameters parameters = this.onWarmupCompleted.IAuthTabCallback.getParameters();
        if (parameters.getFlashMode().equals("torch")) {
            parameters.setFlashMode("off");
        } else {
            parameters.setFlashMode("torch");
        }
        this.onWarmupCompleted.IAuthTabCallback.setParameters(parameters);
    }

    public void IAuthTabCallback(boolean z) {
        this.onExtraCallbackWithResult = z;
        CameraPreview cameraPreview = this.IAuthTabCallbackDefault;
        if (cameraPreview != null) {
            cameraPreview.setAutoFocus(z);
        }
    }

    public void onExtraCallbackWithResult(boolean z) {
        this.asBinder = z;
    }
}
