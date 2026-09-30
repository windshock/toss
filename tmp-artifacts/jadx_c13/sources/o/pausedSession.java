package o;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface pausedSession extends addMetadataDouble, clearMetadataTab, Closeable {
    extractTombstoneThreads onExtraCallback();

    void onExtraCallbackWithResult(addMetadataOpaque addmetadataopaque);

    @Override // o.clearMetadataTab
    default modifyCallback getDefaultAggregation(getDataTrimmed getdatatrimmed) {
        return modifyCallback.onExtraCallbackWithResult();
    }

    default getSpanId onExtraCallbackWithResult() {
        return getSpanId.IMMUTABLE_DATA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() throws InterruptedException, IOException {
        onExtraCallback().onNavigationEvent(10L, TimeUnit.SECONDS);
    }
}
