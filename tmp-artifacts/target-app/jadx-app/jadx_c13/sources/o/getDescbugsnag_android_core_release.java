package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class getDescbugsnag_android_core_release implements getSeverityReasonbugsnag_android_core_release {
    public static final getSeverityReasonbugsnag_android_core_release onNavigationEvent = onExtraCallback(setErrors.onNavigationEvent(), getTraceCorrelation.IAuthTabCallback(), isAnr.onExtraCallback(), getUserImplbugsnag_android_core_release.onExtraCallback(), false, false);

    @Override // o.getSeverityReasonbugsnag_android_core_release
    public abstract boolean onTransact();

    private static ErrorInternal onExtraCallback(String str, String str2, isAnr isanr, getUserImplbugsnag_android_core_release getuserimplbugsnag_android_core_release, boolean z, boolean z2) {
        return new ErrorInternal(str, str2, isanr, getuserimplbugsnag_android_core_release, z, z2);
    }

    public static getSeverityReasonbugsnag_android_core_release onExtraCallbackWithResult(String str, String str2, isAnr isanr, getUserImplbugsnag_android_core_release getuserimplbugsnag_android_core_release, boolean z, boolean z2) {
        if (z2 || (getTraceCorrelation.onWarmupCompleted(str2) && setErrors.IAuthTabCallback(str))) {
            return onExtraCallback(str, str2, isanr, getuserimplbugsnag_android_core_release, z, true);
        }
        return onExtraCallback(setErrors.onNavigationEvent(), getTraceCorrelation.IAuthTabCallback(), isanr, getuserimplbugsnag_android_core_release, z, false);
    }
}
