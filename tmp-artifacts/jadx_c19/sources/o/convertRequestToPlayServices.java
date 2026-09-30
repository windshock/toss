package o;

import kotlin.jvm.JvmStatic;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class convertRequestToPlayServices {
    private static boolean onExtraCallbackWithResult;
    public static final convertRequestToPlayServices onNavigationEvent = new convertRequestToPlayServices();
    private static final String IAuthTabCallback = convertRequestToPlayServices.class.getCanonicalName();

    private convertRequestToPlayServices() {
    }

    @JvmStatic
    public static final void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = true;
    }
}
