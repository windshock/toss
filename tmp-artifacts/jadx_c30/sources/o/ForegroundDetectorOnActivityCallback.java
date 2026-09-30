package o;

import o.setLastExitedForegroundMs;

/* loaded from: /tmp/toss_alldex/classes30.dex */
abstract class ForegroundDetectorOnActivityCallback {

    interface onExtraCallbackWithResult {
        ForegroundDetectorOnActivityCallback IAuthTabCallback();

        onExtraCallbackWithResult onExtraCallback(ImmutableConfig immutableConfig);
    }

    abstract ImmutableConfig IAuthTabCallback();

    abstract getBackgroundSentbugsnag_android_core_release onNavigationEvent();

    ForegroundDetectorOnActivityCallback() {
    }

    static setLastExitedForegroundMs.onNavigationEvent onExtraCallbackWithResult() {
        return new setLastExitedForegroundMs.onNavigationEvent();
    }
}
