package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import viva.republica.toss.pedometer.AppUpdateReceiver;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class DynamicNativeCompanion extends BroadcastReceiver {
    private volatile boolean onExtraCallback = false;
    private final Object onNavigationEvent = new Object();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        onNavigationEvent(context);
    }

    protected void onNavigationEvent(Context context) {
        if (this.onExtraCallback) {
            return;
        }
        synchronized (this.onNavigationEvent) {
            if (!this.onExtraCallback) {
                ((DynamicFromMapCompanionpool1) excludeView.onExtraCallback(context)).onWarmupCompleted((AppUpdateReceiver) animate.onExtraCallbackWithResult(this));
                this.onExtraCallback = true;
            }
        }
    }
}
