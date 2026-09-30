package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface extractTombstoneLogBuffers {
    long IAuthTabCallback();

    long onNavigationEvent();

    static extractTombstoneLogBuffers onExtraCallbackWithResult() {
        return TraceEventEnhancer.onExtraCallback();
    }

    default long onExtraCallback(boolean z) {
        return onNavigationEvent();
    }
}
