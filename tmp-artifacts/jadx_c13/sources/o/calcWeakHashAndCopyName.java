package o;

import io.opentelemetry.sdk.trace.ReadWriteSpan;
import io.opentelemetry.sdk.trace.ReadableSpan;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface calcWeakHashAndCopyName extends Closeable {
    boolean IAuthTabCallback();

    void onExtraCallbackWithResult(ReadableSpan readableSpan);

    void onNavigationEvent(trimMetadataStringsTo trimmetadatastringsto, ReadWriteSpan readWriteSpan);

    boolean onNavigationEvent();

    static calcWeakHashAndCopyName onExtraCallbackWithResult(Iterable<calcWeakHashAndCopyName> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<calcWeakHashAndCopyName> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        if (arrayList.isEmpty()) {
            return biggestPowerTen.onExtraCallbackWithResult();
        }
        if (arrayList.size() == 1) {
            return (calcWeakHashAndCopyName) arrayList.get(0);
        }
        return normalizedBoundaries.onExtraCallbackWithResult(arrayList);
    }

    default extractTombstoneThreads onExtraCallback() {
        return bh_();
    }

    default extractTombstoneThreads bh_() {
        return extractTombstoneThreads.IAuthTabCallback();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() throws InterruptedException {
        onExtraCallback().onNavigationEvent(10L, TimeUnit.SECONDS);
    }
}
