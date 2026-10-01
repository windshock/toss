package o;

import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionContainerKtExternalSyntheticLambda12 {
    private final Object IAuthTabCallback;
    private HandlerThread onExtraCallbackWithResult;
    private int onNavigationEvent;
    private Looper onWarmupCompleted;

    public SelectionContainerKtExternalSyntheticLambda12() {
        this(null);
    }

    public SelectionContainerKtExternalSyntheticLambda12(@Nullable Looper looper) {
        this.IAuthTabCallback = new Object();
        this.onWarmupCompleted = looper;
        this.onExtraCallbackWithResult = null;
        this.onNavigationEvent = 0;
    }

    public Looper onNavigationEvent() {
        Looper looper;
        synchronized (this.IAuthTabCallback) {
            if (this.onWarmupCompleted == null) {
                RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent == 0 && this.onExtraCallbackWithResult == null);
                HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                this.onExtraCallbackWithResult = handlerThread;
                handlerThread.start();
                this.onWarmupCompleted = this.onExtraCallbackWithResult.getLooper();
            }
            this.onNavigationEvent++;
            looper = this.onWarmupCompleted;
        }
        return looper;
    }

    public void onExtraCallback() {
        HandlerThread handlerThread;
        synchronized (this.IAuthTabCallback) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent > 0);
            int i2 = this.onNavigationEvent - 1;
            this.onNavigationEvent = i2;
            if (i2 == 0 && (handlerThread = this.onExtraCallbackWithResult) != null) {
                handlerThread.quit();
                this.onExtraCallbackWithResult = null;
                this.onWarmupCompleted = null;
            }
        }
    }
}
