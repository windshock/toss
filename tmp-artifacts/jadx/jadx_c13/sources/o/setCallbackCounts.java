package o;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface setCallbackCounts extends Closeable {
    extractTombstoneThreads IAuthTabCallback();

    extractTombstoneThreads onExtraCallbackWithResult();

    extractTombstoneThreads onWarmupCompleted(Collection<setBreadcrumbTrimMetrics> collection);

    static setCallbackCounts onExtraCallbackWithResult(Iterable<setCallbackCounts> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<setCallbackCounts> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        if (arrayList.isEmpty()) {
            return toJsonableMap.onExtraCallback();
        }
        if (arrayList.size() == 1) {
            return (setCallbackCounts) arrayList.get(0);
        }
        return setConfigDifferences.onNavigationEvent(arrayList);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() throws InterruptedException {
        onExtraCallbackWithResult().onNavigationEvent(10L, TimeUnit.SECONDS);
    }
}
