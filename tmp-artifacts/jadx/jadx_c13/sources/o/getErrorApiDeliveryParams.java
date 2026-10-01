package o;

import io.opentelemetry.sdk.logs.ReadWriteLogRecord;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface getErrorApiDeliveryParams extends Closeable {
    void onNavigationEvent(trimMetadataStringsTo trimmetadatastringsto, ReadWriteLogRecord readWriteLogRecord);

    static getErrorApiDeliveryParams onNavigationEvent(Iterable<getErrorApiDeliveryParams> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<getErrorApiDeliveryParams> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        if (arrayList.isEmpty()) {
            return shouldDiscardByErrorClassbugsnag_android_core_release.onWarmupCompleted();
        }
        if (arrayList.size() == 1) {
            return (getErrorApiDeliveryParams) arrayList.get(0);
        }
        return component33.onExtraCallbackWithResult(arrayList);
    }

    default extractTombstoneThreads onNavigationEvent() {
        return onExtraCallbackWithResult();
    }

    default extractTombstoneThreads onExtraCallbackWithResult() {
        return extractTombstoneThreads.IAuthTabCallback();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() throws InterruptedException {
        onNavigationEvent().onNavigationEvent(10L, TimeUnit.SECONDS);
    }
}
