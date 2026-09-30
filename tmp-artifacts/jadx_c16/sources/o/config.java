package o;

import android.content.Context;
import android.content.Intent;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class config extends GlanceAppWidgetReceiver {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private volatile boolean onExtraCallbackWithResult = false;
    private final Object IAuthTabCallback = new Object();

    public void onReceive(Context context, Intent intent) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(context);
        super.onReceive(context, intent);
        int i4 = onNavigationEvent + 27;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    protected void IAuthTabCallback(Context context) {
        if (this.onExtraCallbackWithResult) {
            return;
        }
        synchronized (this.IAuthTabCallback) {
            if (!this.onExtraCallbackWithResult) {
                excludeView.onExtraCallback(context);
                animate.onExtraCallbackWithResult(this);
                this.onExtraCallbackWithResult = true;
            }
        }
    }
}
