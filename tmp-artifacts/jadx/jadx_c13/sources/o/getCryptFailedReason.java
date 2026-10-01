package o;

import android.content.Context;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class getCryptFailedReason {
    public static int onExtraCallback;
    public static int onNavigationEvent;

    public static int onWarmupCompleted() {
        int i = onExtraCallback;
        int i2 = i % 8082218;
        onExtraCallback = i + 1;
        if (i2 != 0) {
            return onNavigationEvent;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
        onNavigationEvent = i3;
        return i3;
    }
}
