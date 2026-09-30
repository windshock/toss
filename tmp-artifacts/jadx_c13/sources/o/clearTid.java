package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class clearTid {
    static final MapConverter IAuthTabCallback = RxJavaPlugins.onExtraCallback(new asBinder());
    static final MapConverter onExtraCallback = RxJavaPlugins.onWarmupCompleted(new onExtraCallbackWithResult());
    static final MapConverter onNavigationEvent = RxJavaPlugins.onExtraCallbackWithResult(new onWarmupCompleted());
    static final MapConverter onWarmupCompleted = access25300.onWarmupCompleted();
    static final MapConverter onExtraCallbackWithResult = RxJavaPlugins.IAuthTabCallback(new IAuthTabCallbackStub());

    static final class IAuthTabCallbackDefault {
        static final MapConverter onExtraCallback = new TombstoneProtosLogBuffer();

        IAuthTabCallbackDefault() {
        }
    }

    static final class onNavigationEvent {
        static final MapConverter IAuthTabCallback = new getAllocationBacktraceOrBuilderList();

        onNavigationEvent() {
        }
    }

    static final class IAuthTabCallback {
        static final MapConverter onWarmupCompleted = new getAllocationTid();

        IAuthTabCallback() {
        }
    }

    static final class onExtraCallback {
        static final MapConverter onWarmupCompleted = new getDeallocationBacktraceOrBuilder();

        onExtraCallback() {
        }
    }

    public static MapConverter onNavigationEvent() {
        return RxJavaPlugins.onExtraCallback(onExtraCallback);
    }

    public static MapConverter onExtraCallback() {
        return RxJavaPlugins.onNavigationEvent(onNavigationEvent);
    }

    public static MapConverter onExtraCallbackWithResult() {
        return RxJavaPlugins.onWarmupCompleted(IAuthTabCallback);
    }

    public static MapConverter onNavigationEvent(Executor executor) {
        return new getDeallocationBacktrace(executor, false);
    }

    static final class onWarmupCompleted implements Callable<MapConverter> {
        onWarmupCompleted() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public MapConverter call() throws Exception {
            return IAuthTabCallback.onWarmupCompleted;
        }
    }

    static final class IAuthTabCallbackStub implements Callable<MapConverter> {
        IAuthTabCallbackStub() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public MapConverter call() throws Exception {
            return onExtraCallback.onWarmupCompleted;
        }
    }

    static final class asBinder implements Callable<MapConverter> {
        asBinder() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public MapConverter call() throws Exception {
            return IAuthTabCallbackDefault.onExtraCallback;
        }
    }

    static final class onExtraCallbackWithResult implements Callable<MapConverter> {
        onExtraCallbackWithResult() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public MapConverter call() throws Exception {
            return onNavigationEvent.IAuthTabCallback;
        }
    }
}
