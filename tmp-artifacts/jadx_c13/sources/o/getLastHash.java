package o;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface getLastHash extends Closeable {
    extractTombstoneThreads onExtraCallback(Collection<comma> collection);

    extractTombstoneThreads onExtraCallbackWithResult();

    extractTombstoneThreads onWarmupCompleted();

    static getLastHash onNavigationEvent(Iterable<getLastHash> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<getLastHash> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        if (arrayList.isEmpty()) {
            return getLastName.IAuthTabCallback();
        }
        if (arrayList.size() == 1) {
            return (getLastHash) arrayList.get(0);
        }
        return checkObjectEnd.onWarmupCompleted(arrayList);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() throws InterruptedException {
        onExtraCallbackWithResult().onNavigationEvent(10L, TimeUnit.SECONDS);
    }
}
