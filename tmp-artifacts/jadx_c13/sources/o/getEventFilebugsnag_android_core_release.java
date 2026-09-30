package o;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.logging.Logger;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class getEventFilebugsnag_android_core_release {
    private static boolean onNavigationEvent;
    private static final Logger onWarmupCompleted = Logger.getLogger(getEventFilebugsnag_android_core_release.class.getName());
    private static final List<Function<? super updateSeverityReasonInternalbugsnag_android_core_release, ? extends updateSeverityReasonInternalbugsnag_android_core_release>> onExtraCallbackWithResult = new ArrayList();
    private static final Object IAuthTabCallback = new Object();

    static List<Function<? super updateSeverityReasonInternalbugsnag_android_core_release, ? extends updateSeverityReasonInternalbugsnag_android_core_release>> IAuthTabCallback() {
        List<Function<? super updateSeverityReasonInternalbugsnag_android_core_release, ? extends updateSeverityReasonInternalbugsnag_android_core_release>> list;
        synchronized (IAuthTabCallback) {
            list = onExtraCallbackWithResult;
        }
        return list;
    }

    static void onExtraCallbackWithResult() {
        synchronized (IAuthTabCallback) {
            onNavigationEvent = true;
        }
    }

    private getEventFilebugsnag_android_core_release() {
    }
}
