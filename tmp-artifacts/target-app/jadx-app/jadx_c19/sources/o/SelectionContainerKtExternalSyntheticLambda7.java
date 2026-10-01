package o;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionContainerKtExternalSyntheticLambda7 {
    private boolean IAuthTabCallback;
    private boolean onExtraCallback;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda16 onExtraCallbackWithResult;
    private final onWarmupCompleted onWarmupCompleted;

    public SelectionContainerKtExternalSyntheticLambda7(Context context, Looper looper, TextFieldDecoratorModifierNodeExternalSyntheticLambda0 textFieldDecoratorModifierNodeExternalSyntheticLambda0) {
        this.onWarmupCompleted = new onWarmupCompleted(context.getApplicationContext());
        this.onExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda0.onWarmupCompleted(looper, (Handler.Callback) null);
    }

    public void onWarmupCompleted(final boolean z) {
        if (this.onExtraCallback == z) {
            return;
        }
        this.onExtraCallback = z;
        final boolean z2 = this.IAuthTabCallback;
        this.onExtraCallbackWithResult.onNavigationEvent(new Runnable() { // from class: androidx.media3.exoplayer.WifiLockManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.onWarmupCompleted.onExtraCallbackWithResult(z, z2);
            }
        });
    }

    public void onExtraCallbackWithResult(final boolean z) {
        if (this.IAuthTabCallback != z) {
            this.IAuthTabCallback = z;
            if (this.onExtraCallback) {
                this.onExtraCallbackWithResult.onNavigationEvent(new Runnable() { // from class: androidx.media3.exoplayer.WifiLockManager$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.onWarmupCompleted.onExtraCallbackWithResult(true, z);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class onWarmupCompleted {
        private WifiManager.WifiLock onNavigationEvent;
        private final Context onWarmupCompleted;

        public onWarmupCompleted(Context context) {
            this.onWarmupCompleted = context;
        }

        public void onExtraCallbackWithResult(boolean z, boolean z2) {
            if (z && this.onNavigationEvent == null) {
                WifiManager wifiManager = (WifiManager) this.onWarmupCompleted.getApplicationContext().getSystemService("wifi");
                if (wifiManager == null) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                    return;
                } else {
                    WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                    this.onNavigationEvent = wifiLockCreateWifiLock;
                    wifiLockCreateWifiLock.setReferenceCounted(false);
                }
            }
            WifiManager.WifiLock wifiLock = this.onNavigationEvent;
            if (wifiLock == null) {
                return;
            }
            if (z && z2) {
                wifiLock.acquire();
            } else {
                wifiLock.release();
            }
        }
    }
}
