package o;

import android.opengl.GLSurfaceView;
import android.view.SurfaceHolder;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class removeAndRecycleViews$3 implements SurfaceHolder.Callback {
    final /* synthetic */ removeAndRecycleViews$onExtraCallback IAuthTabCallback;
    final /* synthetic */ GLSurfaceView onExtraCallbackWithResult;
    final /* synthetic */ removeAndRecycleViews onNavigationEvent;

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    removeAndRecycleViews$3(removeAndRecycleViews removeandrecycleviews, GLSurfaceView gLSurfaceView, removeAndRecycleViews$onExtraCallback removeandrecycleviews_onextracallback) {
        this.onNavigationEvent = removeandrecycleviews;
        this.onExtraCallbackWithResult = gLSurfaceView;
        this.IAuthTabCallback = removeandrecycleviews_onextracallback;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.onNavigationEvent.onNavigationEvent();
        this.onExtraCallbackWithResult.queueEvent(new Runnable() { // from class: o.removeAndRecycleViews$3.5
            @Override // java.lang.Runnable
            public void run() {
                removeAndRecycleViews$3.this.IAuthTabCallback.onExtraCallbackWithResult();
            }
        });
        removeAndRecycleViews.IAuthTabCallback(this.onNavigationEvent, false);
    }
}
