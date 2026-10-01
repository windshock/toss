package o;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import androidx.annotation.NonNull;
import o.onChildAttachedToWindow;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class onExitLayoutOrScroll {
    private static final addFocusables onNavigationEvent = addFocusables.onExtraCallback(onExitLayoutOrScroll.class.getSimpleName());
    private isLayoutSuppressed IAuthTabCallback;
    private SurfaceTexture IAuthTabCallbackDefault;
    private Surface IAuthTabCallbackStub;
    private onChildAttachedToWindow onWarmupCompleted;
    private final Object onExtraCallbackWithResult = new Object();
    markKnownViewsInvalid onExtraCallback = new markKnownViewsInvalid();

    public onExitLayoutOrScroll(@NonNull onChildAttachedToWindow onchildattachedtowindow, @NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener) {
        this.onWarmupCompleted = onchildattachedtowindow;
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.onExtraCallback.onExtraCallback().onExtraCallbackWithResult());
        this.IAuthTabCallbackDefault = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(removeonchildattachstatechangelistener.onExtraCallback(), removeonchildattachstatechangelistener.onExtraCallbackWithResult());
        this.IAuthTabCallbackStub = new Surface(this.IAuthTabCallbackDefault);
        this.IAuthTabCallback = new isLayoutSuppressed(this.onExtraCallback.onExtraCallback().onExtraCallbackWithResult());
    }

    public void IAuthTabCallback(@NonNull onChildAttachedToWindow.onExtraCallback onextracallback) throws Surface.OutOfResourcesException, IllegalArgumentException {
        Canvas canvasLockCanvas;
        try {
            if (this.onWarmupCompleted.onExtraCallbackWithResult()) {
                canvasLockCanvas = this.IAuthTabCallbackStub.lockHardwareCanvas();
            } else {
                canvasLockCanvas = this.IAuthTabCallbackStub.lockCanvas(null);
            }
            canvasLockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            this.onWarmupCompleted.onExtraCallbackWithResult(onextracallback, canvasLockCanvas);
            this.IAuthTabCallbackStub.unlockCanvasAndPost(canvasLockCanvas);
        } catch (Surface.OutOfResourcesException e) {
            onNavigationEvent.onWarmupCompleted(new Object[]{"Got Surface.OutOfResourcesException while drawing video overlays", e});
        }
        synchronized (this.onExtraCallbackWithResult) {
            this.IAuthTabCallback.onExtraCallbackWithResult();
            this.IAuthTabCallbackDefault.updateTexImage();
        }
        this.IAuthTabCallbackDefault.getTransformMatrix(this.onExtraCallback.onExtraCallbackWithResult());
    }

    public float[] onExtraCallbackWithResult() {
        return this.onExtraCallback.onExtraCallbackWithResult();
    }

    public void onExtraCallbackWithResult(long j) {
        GLES20.glDisable(2884);
        GLES20.glDisable(2929);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        synchronized (this.onExtraCallbackWithResult) {
            this.onExtraCallback.onWarmupCompleted(j);
        }
    }

    public void onNavigationEvent() {
        isLayoutSuppressed islayoutsuppressed = this.IAuthTabCallback;
        if (islayoutsuppressed != null) {
            islayoutsuppressed.onWarmupCompleted();
            this.IAuthTabCallback = null;
        }
        SurfaceTexture surfaceTexture = this.IAuthTabCallbackDefault;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.IAuthTabCallbackDefault = null;
        }
        Surface surface = this.IAuthTabCallbackStub;
        if (surface != null) {
            surface.release();
            this.IAuthTabCallbackStub = null;
        }
        markKnownViewsInvalid markknownviewsinvalid = this.onExtraCallback;
        if (markknownviewsinvalid != null) {
            markknownviewsinvalid.onNavigationEvent();
            this.onExtraCallback = null;
        }
    }
}
