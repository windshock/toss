package o;

import java.util.concurrent.TimeUnit;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class TraceEventEnhancer implements extractTombstoneLogBuffers {
    private static final TraceEventEnhancer onExtraCallbackWithResult = new TraceEventEnhancer();

    private TraceEventEnhancer() {
    }

    static extractTombstoneLogBuffers onExtraCallback() {
        return onExtraCallbackWithResult;
    }

    @Override // o.extractTombstoneLogBuffers
    public long onNavigationEvent() {
        return onExtraCallback(true);
    }

    @Override // o.extractTombstoneLogBuffers
    public long onExtraCallback(boolean z) {
        if (z) {
            return component20.onExtraCallbackWithResult().onNavigationEvent();
        }
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    @Override // o.extractTombstoneLogBuffers
    public long IAuthTabCallback() {
        return System.nanoTime();
    }

    public String toString() {
        return "SystemClock{}";
    }
}
