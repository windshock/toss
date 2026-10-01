package o;

import io.opentelemetry.api.trace.Span$;
import j$.time.Instant;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface getUnhandled extends getErrorTypesbugsnag_android_core_release {
    getSeverityReasonbugsnag_android_core_release onExtraCallback();

    getUnhandled onExtraCallbackWithResult(String str);

    <T> getUnhandled onNavigationEvent(getLocationStatus<T> getlocationstatus, T t);

    void onNavigationEvent(long j, TimeUnit timeUnit);

    getUnhandled onWarmupCompleted(Throwable th, getScreenDensityDpi getscreendensitydpi);

    getUnhandled onWarmupCompleted(normalizeStackframeErrorTypesbugsnag_android_core_release normalizestackframeerrortypesbugsnag_android_core_release, String str);

    void onWarmupCompleted();

    static getUnhandled onExtraCallbackWithResult() {
        getUnhandled getunhandled = (getUnhandled) trimMetadataStringsTo.onExtraCallback().IAuthTabCallback(getProjectPackagesbugsnag_android_core_release.onWarmupCompleted);
        return getunhandled == null ? onNavigationEvent() : getunhandled;
    }

    static getUnhandled IAuthTabCallback(trimMetadataStringsTo trimmetadatastringsto) {
        if (trimmetadatastringsto == null) {
            getErrorClass.onExtraCallbackWithResult("context is null");
            return onNavigationEvent();
        }
        getUnhandled getunhandled = (getUnhandled) trimmetadatastringsto.IAuthTabCallback(getProjectPackagesbugsnag_android_core_release.onWarmupCompleted);
        return getunhandled == null ? onNavigationEvent() : getunhandled;
    }

    @Nullable
    static getUnhandled onExtraCallback(trimMetadataStringsTo trimmetadatastringsto) {
        if (trimmetadatastringsto == null) {
            getErrorClass.onExtraCallbackWithResult("context is null");
            return null;
        }
        return (getUnhandled) trimmetadatastringsto.IAuthTabCallback(getProjectPackagesbugsnag_android_core_release.onWarmupCompleted);
    }

    static getUnhandled onNavigationEvent() {
        return getErrorTypesFromStackframesbugsnag_android_core_release.onExtraCallbackWithResult;
    }

    static getUnhandled onExtraCallbackWithResult(getSeverityReasonbugsnag_android_core_release getseverityreasonbugsnag_android_core_release) {
        if (getseverityreasonbugsnag_android_core_release == null) {
            getErrorClass.onExtraCallbackWithResult("context is null");
            return onNavigationEvent();
        }
        return getErrorTypesFromStackframesbugsnag_android_core_release.onWarmupCompleted(getseverityreasonbugsnag_android_core_release);
    }

    default getUnhandled onExtraCallback(String str, String str2) {
        return onNavigationEvent((getLocationStatus<getLocationStatus<String>>) getLocationStatus.IAuthTabCallbackDefault(str), (getLocationStatus<String>) str2);
    }

    default getUnhandled IAuthTabCallback(String str, long j) {
        return onNavigationEvent((getLocationStatus<getLocationStatus<Long>>) getLocationStatus.asInterface(str), (getLocationStatus<Long>) Long.valueOf(j));
    }

    default getUnhandled onExtraCallbackWithResult(String str, double d) {
        return onNavigationEvent((getLocationStatus<getLocationStatus<Double>>) getLocationStatus.IAuthTabCallback(str), (getLocationStatus<Double>) Double.valueOf(d));
    }

    default getUnhandled IAuthTabCallback(String str, boolean z) {
        return onNavigationEvent((getLocationStatus<getLocationStatus<Boolean>>) getLocationStatus.onExtraCallbackWithResult(str), (getLocationStatus<Boolean>) Boolean.valueOf(z));
    }

    default getUnhandled onNavigationEvent(getScreenDensityDpi getscreendensitydpi) {
        if (getscreendensitydpi != null && !getscreendensitydpi.isEmpty()) {
            getscreendensitydpi.forEach(new Span$.ExternalSyntheticLambda0(this));
        }
        return this;
    }

    default getUnhandled onWarmupCompleted(normalizeStackframeErrorTypesbugsnag_android_core_release normalizestackframeerrortypesbugsnag_android_core_release) {
        return onWarmupCompleted(normalizestackframeerrortypesbugsnag_android_core_release, _UrlKt.FRAGMENT_ENCODE_SET);
    }

    default getUnhandled onExtraCallback(Throwable th) {
        return onWarmupCompleted(th, getScreenDensityDpi.bB_());
    }

    default void onExtraCallbackWithResult(Instant instant) {
        if (instant == null) {
            onWarmupCompleted();
        } else {
            onNavigationEvent(TimeUnit.SECONDS.toNanos(instant.getEpochSecond()) + instant.getNano(), TimeUnit.NANOSECONDS);
        }
    }

    @Override // o.getErrorTypesbugsnag_android_core_release
    default trimMetadataStringsTo onExtraCallbackWithResult(trimMetadataStringsTo trimmetadatastringsto) {
        return trimmetadatastringsto.onExtraCallbackWithResult((decodedEvent<decodedEvent<getUnhandled>>) getProjectPackagesbugsnag_android_core_release.onWarmupCompleted, (decodedEvent<getUnhandled>) this);
    }
}
