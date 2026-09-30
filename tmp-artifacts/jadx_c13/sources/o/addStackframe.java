package o;

import j$.time.Instant;
import java.util.concurrent.TimeUnit;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface addStackframe extends getSeverityReasonType {
    @Override // o.getSeverityReasonType
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    addStackframe onNavigationEvent(String str, long j);

    @Override // o.getSeverityReasonType
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    addStackframe onWarmupCompleted();

    @Override // o.getSeverityReasonType
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    <T> addStackframe onExtraCallback(getLocationStatus<T> getlocationstatus, T t);

    @Override // o.getSeverityReasonType
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    addStackframe IAuthTabCallback(long j, TimeUnit timeUnit);

    @Override // o.getSeverityReasonType
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    addStackframe onWarmupCompleted(getUnhandledOverridden getunhandledoverridden);

    @Override // o.getSeverityReasonType
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    addStackframe onExtraCallback(trimMetadataStringsTo trimmetadatastringsto);

    @Override // o.getSeverityReasonType
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    addStackframe onNavigationEvent(String str, String str2);

    @Override // o.getSeverityReasonType
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    default addStackframe IAuthTabCallback(getScreenDensityDpi getscreendensitydpi) {
        return (addStackframe) super.IAuthTabCallback(getscreendensitydpi);
    }

    @Override // o.getSeverityReasonType
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    default addStackframe IAuthTabCallback(Instant instant) {
        return (addStackframe) super.IAuthTabCallback(instant);
    }
}
