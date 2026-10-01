package o;

import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ThreadFactory;
import o.MapConverter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getDeallocationBacktraceOrBuilder extends MapConverter {
    private static final RxThreadFactory onNavigationEvent = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    final ThreadFactory onExtraCallback;

    public getDeallocationBacktraceOrBuilder() {
        this(onNavigationEvent);
    }

    public getDeallocationBacktraceOrBuilder(ThreadFactory threadFactory) {
        this.onExtraCallback = threadFactory;
    }

    @Override // o.MapConverter
    public MapConverter.onNavigationEvent onExtraCallbackWithResult() {
        return new getDeallocationBacktraceOrBuilderList(this.onExtraCallback);
    }
}
