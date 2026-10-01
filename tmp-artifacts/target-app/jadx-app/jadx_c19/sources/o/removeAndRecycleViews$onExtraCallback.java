package o;

import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import com.otaliastudios.cameraview.preview.RendererFrameCallback;
import java.util.Iterator;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class removeAndRecycleViews$onExtraCallback implements GLSurfaceView.Renderer {
    final /* synthetic */ removeAndRecycleViews onWarmupCompleted;

    public removeAndRecycleViews$onExtraCallback(removeAndRecycleViews removeandrecycleviews) {
        this.onWarmupCompleted = removeandrecycleviews;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        if (removeAndRecycleViews.onExtraCallbackWithResult(this.onWarmupCompleted) == null) {
            removeAndRecycleViews.onWarmupCompleted(this.onWarmupCompleted, new getMaxFlingVelocity());
        }
        removeAndRecycleViews.onWarmupCompleted(this.onWarmupCompleted, new markKnownViewsInvalid());
        removeAndRecycleViews.onExtraCallback(this.onWarmupCompleted).IAuthTabCallback(removeAndRecycleViews.onExtraCallbackWithResult(this.onWarmupCompleted));
        final int iOnExtraCallbackWithResult = removeAndRecycleViews.onExtraCallback(this.onWarmupCompleted).onExtraCallback().onExtraCallbackWithResult();
        removeAndRecycleViews.onExtraCallback(this.onWarmupCompleted, new SurfaceTexture(iOnExtraCallbackWithResult));
        ((GLSurfaceView) this.onWarmupCompleted.onTransact()).queueEvent(new Runnable() { // from class: o.removeAndRecycleViews$onExtraCallback.2
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = removeAndRecycleViews.onWarmupCompleted(removeAndRecycleViews$onExtraCallback.this.onWarmupCompleted).iterator();
                while (it.hasNext()) {
                    ((RendererFrameCallback) it.next()).onExtraCallbackWithResult(iOnExtraCallbackWithResult);
                }
            }
        });
        removeAndRecycleViews.onNavigationEvent(this.onWarmupCompleted).setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: o.removeAndRecycleViews$onExtraCallback.1
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                ((GLSurfaceView) removeAndRecycleViews$onExtraCallback.this.onWarmupCompleted.onTransact()).requestRender();
            }
        });
    }

    public void onExtraCallbackWithResult() {
        if (removeAndRecycleViews.onNavigationEvent(this.onWarmupCompleted) != null) {
            removeAndRecycleViews.onNavigationEvent(this.onWarmupCompleted).setOnFrameAvailableListener(null);
            removeAndRecycleViews.onNavigationEvent(this.onWarmupCompleted).release();
            removeAndRecycleViews.onExtraCallback(this.onWarmupCompleted, (SurfaceTexture) null);
        }
        if (removeAndRecycleViews.onExtraCallback(this.onWarmupCompleted) != null) {
            removeAndRecycleViews.onExtraCallback(this.onWarmupCompleted).onNavigationEvent();
            removeAndRecycleViews.onWarmupCompleted(this.onWarmupCompleted, (markKnownViewsInvalid) null);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i2, int i3) {
        gl10.glViewport(0, 0, i2, i3);
        removeAndRecycleViews.onExtraCallbackWithResult(this.onWarmupCompleted).onNavigationEvent(i2, i3);
        if (!removeAndRecycleViews.IAuthTabCallback(this.onWarmupCompleted)) {
            this.onWarmupCompleted.onExtraCallbackWithResult(i2, i3);
            removeAndRecycleViews.IAuthTabCallback(this.onWarmupCompleted, true);
            return;
        }
        removeAndRecycleViews removeandrecycleviews = this.onWarmupCompleted;
        if (i2 == ((removeAnimatingView) removeandrecycleviews).IAuthTabCallbackDefault && i3 == ((removeAnimatingView) removeandrecycleviews).asInterface) {
            return;
        }
        removeandrecycleviews.onWarmupCompleted(i2, i3);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        if (removeAndRecycleViews.onNavigationEvent(this.onWarmupCompleted) != null) {
            removeAndRecycleViews removeandrecycleviews = this.onWarmupCompleted;
            if (((removeAnimatingView) removeandrecycleviews).onTransact <= 0 || ((removeAnimatingView) removeandrecycleviews).onNavigationEvent <= 0) {
                return;
            }
            float[] fArrOnExtraCallbackWithResult = removeAndRecycleViews.onExtraCallback(removeandrecycleviews).onExtraCallbackWithResult();
            removeAndRecycleViews.onNavigationEvent(this.onWarmupCompleted).updateTexImage();
            removeAndRecycleViews.onNavigationEvent(this.onWarmupCompleted).getTransformMatrix(fArrOnExtraCallbackWithResult);
            if (((removeAnimatingView) this.onWarmupCompleted).onExtraCallback != 0) {
                Matrix.translateM(fArrOnExtraCallbackWithResult, 0, 0.5f, 0.5f, 0.0f);
                Matrix.rotateM(fArrOnExtraCallbackWithResult, 0, ((removeAnimatingView) this.onWarmupCompleted).onExtraCallback, 0.0f, 0.0f, 1.0f);
                Matrix.translateM(fArrOnExtraCallbackWithResult, 0, -0.5f, -0.5f, 0.0f);
            }
            if (this.onWarmupCompleted.IAuthTabCallbackStub()) {
                removeAndRecycleViews removeandrecycleviews2 = this.onWarmupCompleted;
                Matrix.translateM(fArrOnExtraCallbackWithResult, 0, (1.0f - removeandrecycleviews2.asBinder) / 2.0f, (1.0f - removeandrecycleviews2.IAuthTabCallbackStub) / 2.0f, 0.0f);
                removeAndRecycleViews removeandrecycleviews3 = this.onWarmupCompleted;
                Matrix.scaleM(fArrOnExtraCallbackWithResult, 0, removeandrecycleviews3.asBinder, removeandrecycleviews3.IAuthTabCallbackStub, 1.0f);
            }
            removeAndRecycleViews.onExtraCallback(this.onWarmupCompleted).onWarmupCompleted(removeAndRecycleViews.onNavigationEvent(this.onWarmupCompleted).getTimestamp() / 1000);
            for (RendererFrameCallback rendererFrameCallback : removeAndRecycleViews.onWarmupCompleted(this.onWarmupCompleted)) {
                SurfaceTexture surfaceTextureOnNavigationEvent = removeAndRecycleViews.onNavigationEvent(this.onWarmupCompleted);
                removeAndRecycleViews removeandrecycleviews4 = this.onWarmupCompleted;
                rendererFrameCallback.onNavigationEvent(surfaceTextureOnNavigationEvent, ((removeAnimatingView) removeandrecycleviews4).onExtraCallback, removeandrecycleviews4.asBinder, removeandrecycleviews4.IAuthTabCallbackStub);
            }
        }
    }
}
