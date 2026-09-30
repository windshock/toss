package o;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.Matrix;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.otaliastudios.cameraview.preview.RendererCameraPreview;
import com.otaliastudios.cameraview.preview.RendererFrameCallback;
import o.addRecyclerListener;
import o.onChildAttachedToWindow;
import o.onSizeChanged;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class onScrolled extends postAnimationRunner {
    private boolean IAuthTabCallback;
    private markKnownViewsInvalid IAuthTabCallbackDefault;
    private onChildAttachedToWindow IAuthTabCallbackStub;
    private onExitLayoutOrScroll asBinder;
    private RendererCameraPreview asInterface;
    private removeItemDecoration onTransact;

    public onScrolled(@NonNull addRecyclerListener.IAuthTabCallback iAuthTabCallback, @Nullable onSizeChanged.onExtraCallbackWithResult onextracallbackwithresult, @NonNull RendererCameraPreview rendererCameraPreview, @NonNull removeItemDecoration removeitemdecoration, @Nullable onChildAttachedToWindow onchildattachedtowindow) {
        super(iAuthTabCallback, onextracallbackwithresult);
        this.asInterface = rendererCameraPreview;
        this.onTransact = removeitemdecoration;
        this.IAuthTabCallbackStub = onchildattachedtowindow;
        this.IAuthTabCallback = onchildattachedtowindow != null && onchildattachedtowindow.onNavigationEvent(onChildAttachedToWindow.onExtraCallback.PICTURE_SNAPSHOT);
    }

    public void onExtraCallbackWithResult() {
        this.asInterface.onWarmupCompleted(new RendererFrameCallback() { // from class: o.onScrolled.3
            @Override // com.otaliastudios.cameraview.preview.RendererFrameCallback
            public void onExtraCallbackWithResult(int i2) {
                onScrolled.this.onExtraCallbackWithResult(i2);
            }

            @Override // com.otaliastudios.cameraview.preview.RendererFrameCallback
            public void onExtraCallback(@NonNull getEdgeEffectFactory getedgeeffectfactory) {
                onScrolled.this.onNavigationEvent(getedgeeffectfactory);
            }

            @Override // com.otaliastudios.cameraview.preview.RendererFrameCallback
            public void onNavigationEvent(@NonNull SurfaceTexture surfaceTexture, int i2, float f, float f2) {
                onScrolled.this.asInterface.onExtraCallbackWithResult(this);
                onScrolled.this.onWarmupCompleted(surfaceTexture, i2, f, f2);
            }
        });
    }

    protected void onExtraCallbackWithResult(int i2) {
        this.IAuthTabCallbackDefault = new markKnownViewsInvalid(i2);
        Rect rectOnWarmupCompleted = isAccessibilityEnabled.onWarmupCompleted(((onSizeChanged) this).onNavigationEvent.asBinder, this.onTransact);
        ((onSizeChanged) this).onNavigationEvent.asBinder = new removeOnChildAttachStateChangeListener(rectOnWarmupCompleted.width(), rectOnWarmupCompleted.height());
        if (this.IAuthTabCallback) {
            this.asBinder = new onExitLayoutOrScroll(this.IAuthTabCallbackStub, ((onSizeChanged) this).onNavigationEvent.asBinder);
        }
    }

    protected void onNavigationEvent(@NonNull getEdgeEffectFactory getedgeeffectfactory) {
        this.IAuthTabCallbackDefault.IAuthTabCallback(getedgeeffectfactory.onWarmupCompleted());
    }

    protected void onWarmupCompleted(@NonNull final SurfaceTexture surfaceTexture, final int i2, final float f, final float f2) {
        final EGLContext eGLContextEglGetCurrentContext = EGL14.eglGetCurrentContext();
        isNestedScrollingEnabled.onWarmupCompleted(new Runnable() { // from class: o.onScrolled.5
            @Override // java.lang.Runnable
            public void run() throws Surface.OutOfResourcesException, IllegalArgumentException {
                onScrolled.this.onNavigationEvent(surfaceTexture, i2, f, f2, eGLContextEglGetCurrentContext);
            }
        });
    }

    protected void onNavigationEvent(@NonNull SurfaceTexture surfaceTexture, int i2, float f, float f2, @NonNull EGLContext eGLContext) throws Surface.OutOfResourcesException, IllegalArgumentException {
        SurfaceTexture surfaceTexture2 = new SurfaceTexture(9999);
        surfaceTexture2.setDefaultBufferSize(((onSizeChanged) this).onNavigationEvent.asBinder.onExtraCallback(), ((onSizeChanged) this).onNavigationEvent.asBinder.onExtraCallbackWithResult());
        repositionShadowingViews repositionshadowingviews = new repositionShadowingViews(eGLContext, 1);
        smoothScrollBy smoothscrollby = new smoothScrollBy(repositionshadowingviews, surfaceTexture2);
        smoothscrollby.IAuthTabCallback();
        float[] fArrOnExtraCallbackWithResult = this.IAuthTabCallbackDefault.onExtraCallbackWithResult();
        surfaceTexture.getTransformMatrix(fArrOnExtraCallbackWithResult);
        Matrix.translateM(fArrOnExtraCallbackWithResult, 0, (1.0f - f) / 2.0f, (1.0f - f2) / 2.0f, 0.0f);
        Matrix.scaleM(fArrOnExtraCallbackWithResult, 0, f, f2, 1.0f);
        Matrix.translateM(fArrOnExtraCallbackWithResult, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArrOnExtraCallbackWithResult, 0, i2 + ((onSizeChanged) this).onNavigationEvent.asInterface, 0.0f, 0.0f, 1.0f);
        Matrix.scaleM(fArrOnExtraCallbackWithResult, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArrOnExtraCallbackWithResult, 0, -0.5f, -0.5f, 0.0f);
        if (this.IAuthTabCallback) {
            this.asBinder.IAuthTabCallback(onChildAttachedToWindow.onExtraCallback.PICTURE_SNAPSHOT);
            Matrix.translateM(this.asBinder.onExtraCallbackWithResult(), 0, 0.5f, 0.5f, 0.0f);
            Matrix.rotateM(this.asBinder.onExtraCallbackWithResult(), 0, ((onSizeChanged) this).onNavigationEvent.asInterface, 0.0f, 0.0f, 1.0f);
            Matrix.scaleM(this.asBinder.onExtraCallbackWithResult(), 0, 1.0f, -1.0f, 1.0f);
            Matrix.translateM(this.asBinder.onExtraCallbackWithResult(), 0, -0.5f, -0.5f, 0.0f);
        }
        ((onSizeChanged) this).onNavigationEvent.asInterface = 0;
        long timestamp = surfaceTexture.getTimestamp() / 1000;
        postAnimationRunner.onExtraCallback.onExtraCallbackWithResult(new Object[]{"takeFrame:", "timestampUs:", Long.valueOf(timestamp)});
        this.IAuthTabCallbackDefault.onWarmupCompleted(timestamp);
        if (this.IAuthTabCallback) {
            this.asBinder.onExtraCallbackWithResult(timestamp);
        }
        ((onSizeChanged) this).onNavigationEvent.onNavigationEvent = smoothscrollby.IAuthTabCallback(Bitmap.CompressFormat.JPEG);
        smoothscrollby.onExtraCallbackWithResult();
        this.IAuthTabCallbackDefault.onNavigationEvent();
        surfaceTexture2.release();
        if (this.IAuthTabCallback) {
            this.asBinder.onNavigationEvent();
        }
        repositionshadowingviews.onExtraCallback();
        onWarmupCompleted();
    }

    protected void onWarmupCompleted() {
        this.onTransact = null;
        super.onWarmupCompleted();
    }
}
