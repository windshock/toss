package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface getSeverityReasonbugsnag_android_core_release {
    String IAuthTabCallback();

    getUserImplbugsnag_android_core_release onExtraCallback();

    String onExtraCallbackWithResult();

    boolean onNavigationEvent();

    isAnr onWarmupCompleted();

    static getSeverityReasonbugsnag_android_core_release IAuthTabCallbackStub() {
        return getDescbugsnag_android_core_release.onNavigationEvent;
    }

    static getSeverityReasonbugsnag_android_core_release onNavigationEvent(String str, String str2, isAnr isanr, getUserImplbugsnag_android_core_release getuserimplbugsnag_android_core_release) {
        return getDescbugsnag_android_core_release.onExtraCallbackWithResult(str, str2, isanr, getuserimplbugsnag_android_core_release, false, false);
    }

    static getSeverityReasonbugsnag_android_core_release IAuthTabCallback(String str, String str2, isAnr isanr, getUserImplbugsnag_android_core_release getuserimplbugsnag_android_core_release) {
        return getDescbugsnag_android_core_release.onExtraCallbackWithResult(str, str2, isanr, getuserimplbugsnag_android_core_release, true, false);
    }

    default boolean IAuthTabCallbackDefault() {
        return onWarmupCompleted().IAuthTabCallback();
    }

    default boolean onTransact() {
        return setErrors.IAuthTabCallback(onExtraCallbackWithResult()) && getTraceCorrelation.onWarmupCompleted(IAuthTabCallback());
    }
}
