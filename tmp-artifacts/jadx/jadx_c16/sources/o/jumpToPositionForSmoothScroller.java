package o;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class jumpToPositionForSmoothScroller {
    private final onExtraCallbackWithResult IAuthTabCallback;
    final OrientationEventListener onNavigationEvent;
    private boolean onTransact;
    private final Context onWarmupCompleted;
    private final Handler asBinder = new Handler(Looper.getMainLooper());
    private int onExtraCallbackWithResult = -1;
    private int asInterface = -1;
    final DisplayManager.DisplayListener onExtraCallback = new DisplayManager.DisplayListener() { // from class: o.jumpToPositionForSmoothScroller.5
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            int i2 = jumpToPositionForSmoothScroller.this.asInterface;
            int iIAuthTabCallback = jumpToPositionForSmoothScroller.this.IAuthTabCallback();
            if (iIAuthTabCallback != i2) {
                jumpToPositionForSmoothScroller.this.asInterface = iIAuthTabCallback;
                jumpToPositionForSmoothScroller.this.IAuthTabCallback.onTransact();
            }
        }
    };

    public interface onExtraCallbackWithResult {
        void onNavigationEvent(int i);

        void onTransact();
    }

    public jumpToPositionForSmoothScroller(@NonNull Context context, @NonNull onExtraCallbackWithResult onextracallbackwithresult) {
        this.onWarmupCompleted = context;
        this.IAuthTabCallback = onextracallbackwithresult;
        this.onNavigationEvent = new OrientationEventListener(context.getApplicationContext(), 3) { // from class: o.jumpToPositionForSmoothScroller.2
            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int i) {
                int i2 = 0;
                if (i == -1) {
                    if (jumpToPositionForSmoothScroller.this.onExtraCallbackWithResult != -1) {
                        i2 = jumpToPositionForSmoothScroller.this.onExtraCallbackWithResult;
                    }
                } else if (i < 315 && i >= 45) {
                    if (i >= 45 && i < 135) {
                        i2 = 90;
                    } else if (i >= 135 && i < 225) {
                        i2 = 180;
                    } else if (i >= 225 && i < 315) {
                        i2 = 270;
                    }
                }
                if (i2 != jumpToPositionForSmoothScroller.this.onExtraCallbackWithResult) {
                    jumpToPositionForSmoothScroller.this.onExtraCallbackWithResult = i2;
                    jumpToPositionForSmoothScroller.this.IAuthTabCallback.onNavigationEvent(jumpToPositionForSmoothScroller.this.onExtraCallbackWithResult);
                }
            }
        };
    }

    public void onExtraCallbackWithResult() {
        if (this.onTransact) {
            return;
        }
        this.onTransact = true;
        this.asInterface = IAuthTabCallback();
        ((DisplayManager) this.onWarmupCompleted.getSystemService("display")).registerDisplayListener(this.onExtraCallback, this.asBinder);
        this.onNavigationEvent.enable();
    }

    public void onWarmupCompleted() {
        if (this.onTransact) {
            this.onTransact = false;
            this.onNavigationEvent.disable();
            ((DisplayManager) this.onWarmupCompleted.getSystemService("display")).unregisterDisplayListener(this.onExtraCallback);
            this.asInterface = -1;
            this.onExtraCallbackWithResult = -1;
        }
    }

    public int onNavigationEvent() {
        return this.asInterface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int IAuthTabCallback() {
        int rotation = ((WindowManager) this.onWarmupCompleted.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }
}
