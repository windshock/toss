package me.dm7.barcodescanner.core;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.io.IOException;
import java.util.List;
import o.BusMonitorDependWrapper;
import o.reportPvFromBackGround;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class CameraPreview extends SurfaceView implements SurfaceHolder.Callback {
    private Runnable IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private boolean asBinder;
    private Camera.PreviewCallback asInterface;
    private Handler onExtraCallback;
    Camera.AutoFocusCallback onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private reportPvFromBackGround onWarmupCompleted;

    public CameraPreview(Context context, reportPvFromBackGround reportpvfrombackground, Camera.PreviewCallback previewCallback) {
        super(context);
        this.asBinder = true;
        this.onNavigationEvent = true;
        this.IAuthTabCallbackDefault = false;
        this.IAuthTabCallbackStub = true;
        this.IAuthTabCallback = new Runnable() { // from class: me.dm7.barcodescanner.core.CameraPreview.4
            @Override // java.lang.Runnable
            public void run() {
                if (CameraPreview.this.onWarmupCompleted != null && CameraPreview.this.asBinder && CameraPreview.this.onNavigationEvent && CameraPreview.this.IAuthTabCallbackDefault) {
                    CameraPreview.this.onExtraCallbackWithResult();
                }
            }
        };
        this.onExtraCallbackWithResult = new Camera.AutoFocusCallback() { // from class: me.dm7.barcodescanner.core.CameraPreview.1
            @Override // android.hardware.Camera.AutoFocusCallback
            public void onAutoFocus(boolean z, Camera camera) {
                CameraPreview.this.IAuthTabCallbackDefault();
            }
        };
        onExtraCallback(reportpvfrombackground, previewCallback);
    }

    public void onExtraCallback(reportPvFromBackGround reportpvfrombackground, Camera.PreviewCallback previewCallback) {
        setCamera(reportpvfrombackground, previewCallback);
        this.onExtraCallback = new Handler();
        getHolder().addCallback(this);
        getHolder().setType(3);
    }

    public void setCamera(reportPvFromBackGround reportpvfrombackground, Camera.PreviewCallback previewCallback) {
        this.onWarmupCompleted = reportpvfrombackground;
        this.asInterface = previewCallback;
    }

    public void setShouldScaleToFill(boolean z) {
        this.IAuthTabCallbackStub = z;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.IAuthTabCallbackDefault = true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) throws IOException {
        if (surfaceHolder.getSurface() == null) {
            return;
        }
        IAuthTabCallback();
        onNavigationEvent();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.IAuthTabCallbackDefault = false;
        IAuthTabCallback();
    }

    public void onNavigationEvent() throws IOException {
        if (this.onWarmupCompleted != null) {
            try {
                getHolder().addCallback(this);
                this.asBinder = true;
                setupCameraParameters();
                this.onWarmupCompleted.IAuthTabCallback.setPreviewDisplay(getHolder());
                this.onWarmupCompleted.IAuthTabCallback.setDisplayOrientation(onExtraCallback());
                this.onWarmupCompleted.IAuthTabCallback.setOneShotPreviewCallback(this.asInterface);
                this.onWarmupCompleted.IAuthTabCallback.startPreview();
                if (this.onNavigationEvent) {
                    if (this.IAuthTabCallbackDefault) {
                        onExtraCallbackWithResult();
                    } else {
                        IAuthTabCallbackDefault();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public void onExtraCallbackWithResult() {
        try {
            this.onWarmupCompleted.IAuthTabCallback.autoFocus(this.onExtraCallbackWithResult);
        } catch (RuntimeException unused) {
            IAuthTabCallbackDefault();
        }
    }

    public void IAuthTabCallback() {
        if (this.onWarmupCompleted != null) {
            try {
                this.asBinder = false;
                getHolder().removeCallback(this);
                this.onWarmupCompleted.IAuthTabCallback.cancelAutoFocus();
                this.onWarmupCompleted.IAuthTabCallback.setOneShotPreviewCallback(null);
                this.onWarmupCompleted.IAuthTabCallback.stopPreview();
            } catch (Exception unused) {
            }
        }
    }

    public void setupCameraParameters() {
        Camera.Size sizeOnWarmupCompleted = onWarmupCompleted();
        Camera.Parameters parameters = this.onWarmupCompleted.IAuthTabCallback.getParameters();
        parameters.setPreviewSize(sizeOnWarmupCompleted.width, sizeOnWarmupCompleted.height);
        this.onWarmupCompleted.IAuthTabCallback.setParameters(parameters);
        IAuthTabCallback(sizeOnWarmupCompleted);
    }

    private void IAuthTabCallback(Camera.Size size) {
        Point pointOnExtraCallback = onExtraCallback(new Point(getWidth(), getHeight()));
        float f = size.width / size.height;
        int i = pointOnExtraCallback.x;
        float f2 = i;
        int i2 = pointOnExtraCallback.y;
        float f3 = i2;
        if (f2 / f3 > f) {
            onExtraCallback((int) (f3 * f), i2);
        } else {
            onExtraCallback(i, (int) (f2 / f));
        }
    }

    private Point onExtraCallback(Point point) {
        return onExtraCallback() % 180 == 0 ? point : new Point(point.y, point.x);
    }

    private void onExtraCallback(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (onExtraCallback() % 180 != 0) {
            i2 = i;
            i = i2;
        }
        if (this.IAuthTabCallbackStub) {
            float f = i;
            float width = ((View) getParent()).getWidth() / f;
            float f2 = i2;
            float height = ((View) getParent()).getHeight() / f2;
            if (width <= height) {
                width = height;
            }
            i = Math.round(f * width);
            i2 = Math.round(f2 * width);
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        setLayoutParams(layoutParams);
    }

    public int onExtraCallback() {
        int i = 0;
        if (this.onWarmupCompleted == null) {
            return 0;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i2 = this.onWarmupCompleted.onExtraCallback;
        if (i2 == -1) {
            Camera.getCameraInfo(0, cameraInfo);
        } else {
            Camera.getCameraInfo(i2, cameraInfo);
        }
        int rotation = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation != 0) {
            if (rotation == 1) {
                i = 90;
            } else if (rotation == 2) {
                i = 180;
            } else if (rotation == 3) {
                i = 270;
            }
        }
        if (cameraInfo.facing == 1) {
            return (360 - ((cameraInfo.orientation + i) % 360)) % 360;
        }
        return ((cameraInfo.orientation - i) + 360) % 360;
    }

    private Camera.Size onWarmupCompleted() {
        reportPvFromBackGround reportpvfrombackground = this.onWarmupCompleted;
        Camera.Size size = null;
        if (reportpvfrombackground == null) {
            return null;
        }
        List<Camera.Size> supportedPreviewSizes = reportpvfrombackground.IAuthTabCallback.getParameters().getSupportedPreviewSizes();
        int width = getWidth();
        int height = getHeight();
        if (BusMonitorDependWrapper.IAuthTabCallback(getContext()) == 1) {
            height = width;
            width = height;
        }
        double d = width / height;
        if (supportedPreviewSizes == null) {
            return null;
        }
        double dAbs = Double.MAX_VALUE;
        double dAbs2 = Double.MAX_VALUE;
        for (Camera.Size size2 : supportedPreviewSizes) {
            if (Math.abs((size2.width / size2.height) - d) <= 0.1d && Math.abs(size2.height - height) < dAbs2) {
                dAbs2 = Math.abs(size2.height - height);
                size = size2;
            }
        }
        if (size == null) {
            for (Camera.Size size3 : supportedPreviewSizes) {
                if (Math.abs(size3.height - height) < dAbs) {
                    dAbs = Math.abs(size3.height - height);
                    size = size3;
                }
            }
        }
        return size;
    }

    public void setAutoFocus(boolean z) {
        reportPvFromBackGround reportpvfrombackground = this.onWarmupCompleted;
        if (reportpvfrombackground == null || !this.asBinder || z == this.onNavigationEvent) {
            return;
        }
        this.onNavigationEvent = z;
        if (z) {
            if (this.IAuthTabCallbackDefault) {
                onExtraCallbackWithResult();
                return;
            } else {
                IAuthTabCallbackDefault();
                return;
            }
        }
        reportpvfrombackground.IAuthTabCallback.cancelAutoFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IAuthTabCallbackDefault() {
        this.onExtraCallback.postDelayed(this.IAuthTabCallback, 1000L);
    }
}
