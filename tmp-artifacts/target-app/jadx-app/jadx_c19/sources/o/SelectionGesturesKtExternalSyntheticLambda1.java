package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionGesturesKtExternalSyntheticLambda1 {
    private boolean IAuthTabCallback;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda16 onExtraCallback;
    private final onNavigationEvent onExtraCallbackWithResult;
    private boolean onNavigationEvent;

    public SelectionGesturesKtExternalSyntheticLambda1(Context context, Looper looper, TextFieldDecoratorModifierNodeExternalSyntheticLambda0 textFieldDecoratorModifierNodeExternalSyntheticLambda0) {
        this.onExtraCallbackWithResult = new onNavigationEvent(context.getApplicationContext());
        this.onExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda0.onWarmupCompleted(looper, (Handler.Callback) null);
    }

    public void onNavigationEvent(final boolean z) {
        if (this.IAuthTabCallback == z) {
            return;
        }
        this.IAuthTabCallback = z;
        final boolean z2 = this.onNavigationEvent;
        this.onExtraCallback.onNavigationEvent(new Runnable() { // from class: androidx.media3.exoplayer.WakeLockManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.onExtraCallbackWithResult.onNavigationEvent(z, z2);
            }
        });
    }

    public void onExtraCallback(final boolean z) {
        if (this.onNavigationEvent != z) {
            this.onNavigationEvent = z;
            if (this.IAuthTabCallback) {
                this.onExtraCallback.onNavigationEvent(new Runnable() { // from class: androidx.media3.exoplayer.WakeLockManager$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.onExtraCallbackWithResult.onNavigationEvent(true, z);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class onNavigationEvent {
        private final Context IAuthTabCallback;
        private PowerManager.WakeLock onNavigationEvent;

        public onNavigationEvent(Context context) {
            this.IAuthTabCallback = context;
        }

        public void onNavigationEvent(boolean z, boolean z2) {
            if (z && this.onNavigationEvent == null) {
                PowerManager powerManager = (PowerManager) this.IAuthTabCallback.getSystemService("power");
                if (powerManager == null) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.onNavigationEvent = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = this.onNavigationEvent;
            if (wakeLock == null) {
                return;
            }
            if (z && z2) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }
}
