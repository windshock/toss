package o;

import io.opentelemetry.api.trace.SpanBuilder$;
import j$.time.Instant;
import java.util.concurrent.TimeUnit;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface getSeverityReasonType {
    getSeverityReasonType IAuthTabCallback(long j, TimeUnit timeUnit);

    getUnhandled IAuthTabCallback();

    <T> getSeverityReasonType onExtraCallback(getLocationStatus<T> getlocationstatus, T t);

    getSeverityReasonType onExtraCallback(trimMetadataStringsTo trimmetadatastringsto);

    getSeverityReasonType onNavigationEvent(String str, long j);

    getSeverityReasonType onNavigationEvent(String str, String str2);

    getSeverityReasonType onWarmupCompleted();

    getSeverityReasonType onWarmupCompleted(getUnhandledOverridden getunhandledoverridden);

    default getSeverityReasonType IAuthTabCallback(getScreenDensityDpi getscreendensitydpi) {
        if (getscreendensitydpi != null && !getscreendensitydpi.isEmpty()) {
            getscreendensitydpi.forEach(new SpanBuilder$.ExternalSyntheticLambda0(this));
        }
        return this;
    }

    default getSeverityReasonType IAuthTabCallback(Instant instant) {
        if (instant == null) {
            return this;
        }
        return IAuthTabCallback(TimeUnit.SECONDS.toNanos(instant.getEpochSecond()) + instant.getNano(), TimeUnit.NANOSECONDS);
    }
}
