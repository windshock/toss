package o;

import java.util.concurrent.TimeUnit;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class getErrorTypesFromStackframesbugsnag_android_core_release implements getUnhandled {
    static final getErrorTypesFromStackframesbugsnag_android_core_release onExtraCallbackWithResult = new getErrorTypesFromStackframesbugsnag_android_core_release(getSeverityReasonbugsnag_android_core_release.IAuthTabCallbackStub());
    private final getSeverityReasonbugsnag_android_core_release onWarmupCompleted;

    @Override // o.getUnhandled
    public getUnhandled IAuthTabCallback(String str, long j) {
        return this;
    }

    @Override // o.getUnhandled
    public getUnhandled IAuthTabCallback(String str, boolean z) {
        return this;
    }

    @Override // o.getUnhandled
    public getUnhandled onExtraCallback(String str, String str2) {
        return this;
    }

    @Override // o.getUnhandled
    public getUnhandled onExtraCallback(Throwable th) {
        return this;
    }

    @Override // o.getUnhandled
    public getUnhandled onExtraCallbackWithResult(String str) {
        return this;
    }

    @Override // o.getUnhandled
    public getUnhandled onExtraCallbackWithResult(String str, double d) {
        return this;
    }

    @Override // o.getUnhandled
    public <T> getUnhandled onNavigationEvent(getLocationStatus<T> getlocationstatus, T t) {
        return this;
    }

    @Override // o.getUnhandled
    public getUnhandled onNavigationEvent(getScreenDensityDpi getscreendensitydpi) {
        return this;
    }

    @Override // o.getUnhandled
    public void onNavigationEvent(long j, TimeUnit timeUnit) {
    }

    @Override // o.getUnhandled
    public getUnhandled onWarmupCompleted(Throwable th, getScreenDensityDpi getscreendensitydpi) {
        return this;
    }

    @Override // o.getUnhandled
    public getUnhandled onWarmupCompleted(normalizeStackframeErrorTypesbugsnag_android_core_release normalizestackframeerrortypesbugsnag_android_core_release) {
        return this;
    }

    @Override // o.getUnhandled
    public getUnhandled onWarmupCompleted(normalizeStackframeErrorTypesbugsnag_android_core_release normalizestackframeerrortypesbugsnag_android_core_release, String str) {
        return this;
    }

    @Override // o.getUnhandled
    public void onWarmupCompleted() {
    }

    static getUnhandled onWarmupCompleted(getSeverityReasonbugsnag_android_core_release getseverityreasonbugsnag_android_core_release) {
        return new getErrorTypesFromStackframesbugsnag_android_core_release(getseverityreasonbugsnag_android_core_release);
    }

    private getErrorTypesFromStackframesbugsnag_android_core_release(getSeverityReasonbugsnag_android_core_release getseverityreasonbugsnag_android_core_release) {
        this.onWarmupCompleted = getseverityreasonbugsnag_android_core_release;
    }

    @Override // o.getUnhandled
    public getSeverityReasonbugsnag_android_core_release onExtraCallback() {
        return this.onWarmupCompleted;
    }

    public String toString() {
        return "PropagatedSpan{" + this.onWarmupCompleted + '}';
    }
}
