package o;

import android.view.SurfaceHolder;
import java.lang.ref.WeakReference;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getDesignInformation implements SurfaceHolder.Callback {
    private final WeakReference<SurfaceHolder.Callback> onWarmupCompleted;

    public getDesignInformation(SurfaceHolder.Callback callback) {
        this.onWarmupCompleted = new WeakReference<>(callback);
    }

    public SurfaceHolder.Callback IAuthTabCallback() {
        return this.onWarmupCompleted.get();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.onWarmupCompleted.get();
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        SurfaceHolder.Callback callback = this.onWarmupCompleted.get();
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i2, i3, i4);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.onWarmupCompleted.get();
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }
}
