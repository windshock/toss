package o;

import android.content.Context;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class excludeView {
    public static Object onExtraCallback(Context context) {
        matchNames matchnamesIAuthTabCallback = FragmentTransitionSupport.IAuthTabCallback(context.getApplicationContext());
        runAnimator.onExtraCallback(matchnamesIAuthTabCallback instanceof matchNames, "Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: %s", new Object[]{matchnamesIAuthTabCallback.getClass()});
        return matchnamesIAuthTabCallback.generatedComponent();
    }
}
