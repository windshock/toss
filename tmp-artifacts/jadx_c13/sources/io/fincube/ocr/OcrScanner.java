package io.fincube.ocr;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import io.fincube.creditcard.DetectionInfo;
import io.fincube.creditcard.Preview;
import io.fincube.ocr.CardScanner;
import o.addAllExitInfoAtFirstRun;
import o.safeGetActivityManager;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class OcrScanner extends FrameLayout {
    protected int IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private safeGetActivityManager IAuthTabCallbackStubProxy;
    private int asBinder;
    private int asInterface;
    protected OcrConfig onExtraCallback;
    protected CardScanner onExtraCallbackWithResult;
    protected Context onNavigationEvent;
    protected Preview onTransact;
    protected OverlayView onWarmupCompleted;

    public OcrScanner(Context context) {
        super(context);
        this.IAuthTabCallback = -1;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    public OcrScanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.IAuthTabCallback = -1;
    }

    public OcrScanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.IAuthTabCallback = -1;
    }

    public void setFullScreen(boolean z) {
        OcrConfig ocrConfig = this.onExtraCallback;
        this.asBinder = ocrConfig.guide_x;
        this.IAuthTabCallbackStub = ocrConfig.guide_y;
        this.IAuthTabCallbackDefault = ocrConfig.guide_w;
        this.asInterface = ocrConfig.guide_h;
        this.onTransact.setFullScreen(z);
    }

    public int IAuthTabCallback(float f, float f2, float f3, int i) {
        if (this.onExtraCallbackWithResult == null) {
            return -3;
        }
        OcrConfig ocrConfig = this.onExtraCallback;
        int i2 = ocrConfig.guide_w;
        int i3 = this.IAuthTabCallbackDefault;
        if ((i2 == i3 && ocrConfig.guide_h == this.asInterface) || (i2 == this.asInterface && ocrConfig.guide_h == i3)) {
            float fIAuthTabCallback = this.onTransact.IAuthTabCallback();
            if (fIAuthTabCallback > 0.0f) {
                f3 *= fIAuthTabCallback;
            }
        }
        int iChangeGuideRect = this.onExtraCallbackWithResult.changeGuideRect(f, f2, f3, CardScanner.IAuthTabCallback.values()[i]);
        onExtraCallback(this.onTransact.onExtraCallback());
        return iChangeGuideRect;
    }

    public void onExtraCallbackWithResult(Context context, OcrConfig ocrConfig, OverlayView overlayView) {
        this.onExtraCallback = ocrConfig;
        this.onNavigationEvent = context;
        boolean z = true;
        boolean z2 = ocrConfig.orientation == 1;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i = context.getResources().getConfiguration().orientation;
        if (rotation == 0 || rotation == 2 ? i != 2 : i != 1) {
            z = false;
        }
        if (z2 && z) {
            ocrConfig.orientation = 0;
        }
        CardScanner cardScanner = new CardScanner(context, ocrConfig);
        this.onExtraCallbackWithResult = cardScanner;
        cardScanner.hardwareSupported(ocrConfig);
        setViewOrientation(context, ocrConfig.orientation);
        addView(this.onTransact);
        if (overlayView != null) {
            this.onWarmupCompleted = overlayView;
        } else {
            this.onWarmupCompleted = new OverlayView(context, null, ocrConfig);
        }
        this.onWarmupCompleted.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.onWarmupCompleted);
        this.onExtraCallbackWithResult.cardScannerStartListener(new addAllExitInfoAtFirstRun() { // from class: io.fincube.ocr.OcrScanner.3
            @Override // o.addAllExitInfoAtFirstRun
            public void IAuthTabCallback(int i2) {
                if (OcrScanner.this.IAuthTabCallbackStubProxy != null) {
                    OcrScanner.this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(i2);
                }
            }

            @Override // o.addAllExitInfoAtFirstRun
            public void onWarmupCompleted() {
                OcrScanner ocrScanner = OcrScanner.this;
                ocrScanner.onExtraCallback(ocrScanner.onTransact.onExtraCallback());
            }

            @Override // o.addAllExitInfoAtFirstRun
            public void onWarmupCompleted(DetectionInfo detectionInfo) {
                OverlayView overlayView2;
                OcrScanner ocrScanner = OcrScanner.this;
                if (!ocrScanner.onExtraCallback.changeOverlayColor || (overlayView2 = ocrScanner.onWarmupCompleted) == null) {
                    return;
                }
                overlayView2.setDetectionInfo(detectionInfo);
            }

            @Override // o.addAllExitInfoAtFirstRun
            public void onNavigationEvent() {
                if (OcrScanner.this.IAuthTabCallbackStubProxy != null) {
                    OcrScanner.this.IAuthTabCallbackStubProxy.onWarmupCompleted();
                }
            }

            @Override // o.addAllExitInfoAtFirstRun
            public void onExtraCallbackWithResult() {
                if (OcrScanner.this.IAuthTabCallbackStubProxy != null) {
                    OcrScanner.this.IAuthTabCallbackStubProxy.onNavigationEvent();
                }
            }

            @Override // o.addAllExitInfoAtFirstRun
            public void onExtraCallbackWithResult(DetectionInfo detectionInfo) {
                if (OcrScanner.this.IAuthTabCallbackStubProxy != null) {
                    OcrScanner.this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(detectionInfo);
                }
            }

            @Override // o.addAllExitInfoAtFirstRun
            public void onExtraCallback() {
                if (OcrScanner.this.IAuthTabCallbackStubProxy != null) {
                    OcrScanner.this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult();
                }
            }
        });
        this.onExtraCallbackWithResult.setActualSizeListener(new CardScanner.onWarmupCompleted() { // from class: io.fincube.ocr.OcrScanner.2
            @Override // io.fincube.ocr.CardScanner.onWarmupCompleted
            public void onWarmupCompleted(int i2, int i3) {
                Preview preview = OcrScanner.this.onTransact;
                if (preview != null) {
                    preview.onNavigationEvent(i2, i3);
                }
            }
        });
        this.onExtraCallbackWithResult.setSurfaceProvider(new CardScanner.onExtraCallback() { // from class: io.fincube.ocr.OcrScanner.4
            @Override // io.fincube.ocr.CardScanner.onExtraCallback
            public SurfaceTexture onExtraCallback() {
                Preview preview = OcrScanner.this.onTransact;
                if (preview != null) {
                    return preview.onWarmupCompleted();
                }
                return null;
            }

            @Override // io.fincube.ocr.CardScanner.onExtraCallback
            public Surface IAuthTabCallback() {
                Preview preview = OcrScanner.this.onTransact;
                if (preview != null) {
                    return preview.onNavigationEvent();
                }
                return null;
            }

            @Override // io.fincube.ocr.CardScanner.onExtraCallback
            public boolean onNavigationEvent() {
                Preview preview = OcrScanner.this.onTransact;
                return preview != null && preview.onTransact();
            }

            @Override // io.fincube.ocr.CardScanner.onExtraCallback
            public void onNavigationEvent(TextureView.SurfaceTextureListener surfaceTextureListener) {
                Preview preview = OcrScanner.this.onTransact;
                if (preview != null) {
                    preview.setSurfaceTextureListener(surfaceTextureListener);
                }
            }

            @Override // io.fincube.ocr.CardScanner.onExtraCallback
            public void onWarmupCompleted() {
                Preview preview = OcrScanner.this.onTransact;
                if (preview != null) {
                    preview.IAuthTabCallbackStub();
                }
            }

            @Override // io.fincube.ocr.CardScanner.onExtraCallback
            public Bitmap onWarmupCompleted(int i2, int i3) {
                Preview preview = OcrScanner.this.onTransact;
                if (preview != null) {
                    return preview.IAuthTabCallback(i2, i3);
                }
                return null;
            }
        });
    }

    public void setViewOrientation(Context context, int i) {
        if (i != this.IAuthTabCallback) {
            this.IAuthTabCallback = i;
            OcrConfig ocrConfig = this.onExtraCallback;
            Preview preview = new Preview(context, null, ocrConfig.cameraPreviewWidth, ocrConfig.cameraPreviewHeight, i);
            this.onTransact = preview;
            preview.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 48));
        }
    }

    public void setOcrScannerListener(safeGetActivityManager safegetactivitymanager) {
        this.IAuthTabCallbackStubProxy = safegetactivitymanager;
    }

    public boolean onExtraCallback() throws RuntimeException {
        this.onTransact.setOrientationInfo(this.onExtraCallback.orientation);
        return this.onExtraCallbackWithResult.resumeScanning();
    }

    public boolean IAuthTabCallback() throws InterruptedException, RuntimeException {
        this.onExtraCallbackWithResult.pauseScanning();
        return true;
    }

    public boolean onNavigationEvent() throws InterruptedException, RuntimeException {
        this.onExtraCallbackWithResult.endScanning();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExtraCallback(final View view) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            view.post(new Runnable() { // from class: io.fincube.ocr.OcrScanner.1
                @Override // java.lang.Runnable
                public void run() {
                    if (view.getWidth() <= 0 || view.getHeight() <= 0) {
                        return;
                    }
                    OcrScanner.this.onExtraCallback(view);
                }
            });
            return;
        }
        int rotation = ((WindowManager) this.onNavigationEvent.getSystemService("window")).getDefaultDisplay().getRotation();
        if (this.onNavigationEvent.getResources().getConfiguration().orientation == 1 && (rotation == 1 || rotation == 3)) {
            height = width;
            width = height;
        }
        Rect guideFrame = this.onExtraCallbackWithResult.getGuideFrame(this.onExtraCallback.orientation, width, height);
        guideFrame.top += view.getTop();
        guideFrame.bottom += view.getTop();
        guideFrame.left += view.getLeft();
        guideFrame.right += view.getLeft();
        this.onWarmupCompleted.setCameraPreviewRect(new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        this.onWarmupCompleted.setGuideAndRotation(guideFrame, 0);
    }
}
