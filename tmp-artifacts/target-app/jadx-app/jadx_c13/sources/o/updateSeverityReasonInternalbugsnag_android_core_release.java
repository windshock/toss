package o;

import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface updateSeverityReasonInternalbugsnag_android_core_release {
    accessgetDelegatep attach(trimMetadataStringsTo trimmetadatastringsto);

    @Nullable
    trimMetadataStringsTo current();

    static updateSeverityReasonInternalbugsnag_android_core_release onExtraCallbackWithResult() {
        return rebuildPayloadCachebugsnag_android_core_release.onExtraCallback();
    }

    static updateSeverityReasonInternalbugsnag_android_core_release onExtraCallback() {
        return setEventbugsnag_android_core_release.INSTANCE;
    }

    default trimMetadataStringsTo onWarmupCompleted() {
        return EventPayload.onNavigationEvent();
    }
}
