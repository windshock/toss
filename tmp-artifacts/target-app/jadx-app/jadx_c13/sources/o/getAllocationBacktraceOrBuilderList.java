package o;

import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.MapConverter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getAllocationBacktraceOrBuilderList extends MapConverter {
    static final RxThreadFactory IAuthTabCallbackDefault;
    static final int onExtraCallback = onExtraCallback(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());
    static final IAuthTabCallback onExtraCallbackWithResult;
    static final onExtraCallbackWithResult onNavigationEvent;
    final ThreadFactory asInterface;
    final AtomicReference<IAuthTabCallback> onTransact;

    static int onExtraCallback(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    static {
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(new RxThreadFactory("RxComputationShutdown"));
        onNavigationEvent = onextracallbackwithresult;
        onextracallbackwithresult.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        IAuthTabCallbackDefault = rxThreadFactory;
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(0, rxThreadFactory);
        onExtraCallbackWithResult = iAuthTabCallback;
        iAuthTabCallback.IAuthTabCallback();
    }

    static final class IAuthTabCallback {
        final int IAuthTabCallback;
        long onNavigationEvent;
        final onExtraCallbackWithResult[] onWarmupCompleted;

        IAuthTabCallback(int i, ThreadFactory threadFactory) {
            this.IAuthTabCallback = i;
            this.onWarmupCompleted = new onExtraCallbackWithResult[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.onWarmupCompleted[i2] = new onExtraCallbackWithResult(threadFactory);
            }
        }

        public onExtraCallbackWithResult onExtraCallbackWithResult() {
            int i = this.IAuthTabCallback;
            if (i == 0) {
                return getAllocationBacktraceOrBuilderList.onNavigationEvent;
            }
            onExtraCallbackWithResult[] onextracallbackwithresultArr = this.onWarmupCompleted;
            long j = this.onNavigationEvent;
            this.onNavigationEvent = 1 + j;
            return onextracallbackwithresultArr[(int) (j % i)];
        }

        public void IAuthTabCallback() {
            for (onExtraCallbackWithResult onextracallbackwithresult : this.onWarmupCompleted) {
                onextracallbackwithresult.dispose();
            }
        }
    }

    public getAllocationBacktraceOrBuilderList() {
        this(IAuthTabCallbackDefault);
    }

    public getAllocationBacktraceOrBuilderList(ThreadFactory threadFactory) {
        this.asInterface = threadFactory;
        this.onTransact = new AtomicReference<>(onExtraCallbackWithResult);
        onExtraCallback();
    }

    @Override // o.MapConverter
    public MapConverter.onNavigationEvent onExtraCallbackWithResult() {
        return new onNavigationEvent(this.onTransact.get().onExtraCallbackWithResult());
    }

    @Override // o.MapConverter
    public deserializeUriNullableCollection onNavigationEvent(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.onTransact.get().onExtraCallbackWithResult().onExtraCallbackWithResult(runnable, j, timeUnit);
    }

    @Override // o.MapConverter
    public deserializeUriNullableCollection onExtraCallbackWithResult(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.onTransact.get().onExtraCallbackWithResult().onWarmupCompleted(runnable, j, j2, timeUnit);
    }

    @Override // o.MapConverter
    public void onExtraCallback() {
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(onExtraCallback, this.asInterface);
        if (setSupportImageTintList.onNavigationEvent(this.onTransact, onExtraCallbackWithResult, iAuthTabCallback)) {
            return;
        }
        iAuthTabCallback.IAuthTabCallback();
    }

    static final class onNavigationEvent extends MapConverter.onNavigationEvent {
        volatile boolean IAuthTabCallback;
        private final deserializeShortNullableCollection onExtraCallback;
        private final onExtraCallbackWithResult onExtraCallbackWithResult;
        private final deserializeUriCollection onNavigationEvent;
        private final deserializeShortNullableCollection onWarmupCompleted;

        onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult) {
            this.onExtraCallbackWithResult = onextracallbackwithresult;
            deserializeShortNullableCollection deserializeshortnullablecollection = new deserializeShortNullableCollection();
            this.onWarmupCompleted = deserializeshortnullablecollection;
            deserializeUriCollection deserializeuricollection = new deserializeUriCollection();
            this.onNavigationEvent = deserializeuricollection;
            deserializeShortNullableCollection deserializeshortnullablecollection2 = new deserializeShortNullableCollection();
            this.onExtraCallback = deserializeshortnullablecollection2;
            deserializeshortnullablecollection2.onNavigationEvent(deserializeshortnullablecollection);
            deserializeshortnullablecollection2.onNavigationEvent(deserializeuricollection);
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            if (this.IAuthTabCallback) {
                return;
            }
            this.IAuthTabCallback = true;
            this.onExtraCallback.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.IAuthTabCallback;
        }

        @Override // o.MapConverter.onNavigationEvent
        public deserializeUriNullableCollection IAuthTabCallback(Runnable runnable) {
            if (this.IAuthTabCallback) {
                return deserializeShort.INSTANCE;
            }
            return this.onExtraCallbackWithResult.IAuthTabCallback(runnable, 0L, TimeUnit.MILLISECONDS, this.onWarmupCompleted);
        }

        @Override // o.MapConverter.onNavigationEvent
        public deserializeUriNullableCollection onNavigationEvent(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.IAuthTabCallback) {
                return deserializeShort.INSTANCE;
            }
            return this.onExtraCallbackWithResult.IAuthTabCallback(runnable, j, timeUnit, this.onNavigationEvent);
        }
    }

    static final class onExtraCallbackWithResult extends getDeallocationBacktraceOrBuilderList {
        onExtraCallbackWithResult(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }
}
