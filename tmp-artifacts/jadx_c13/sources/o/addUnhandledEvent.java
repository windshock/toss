package o;

import java.io.Closeable;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface addUnhandledEvent extends addMetadataDouble, clearMetadataTab, Closeable {
    extractTombstoneThreads IAuthTabCallback(Collection<addBreadcrumb> collection);

    extractTombstoneThreads onExtraCallbackWithResult();

    extractTombstoneThreads onNavigationEvent();

    @Override // o.clearMetadataTab
    default modifyCallback getDefaultAggregation(getDataTrimmed getdatatrimmed) {
        return modifyCallback.onExtraCallbackWithResult();
    }

    default getSpanId bC_() {
        return getSpanId.IMMUTABLE_DATA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() throws InterruptedException {
        onNavigationEvent().onNavigationEvent(10L, TimeUnit.SECONDS);
    }
}
