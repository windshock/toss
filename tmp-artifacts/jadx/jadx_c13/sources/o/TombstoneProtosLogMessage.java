package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtosLogMessage {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, T t, AtomicInteger atomicInteger, getLogsOrBuilder getlogsorbuilder) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            ycxexternalsyntheticlambda0.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thOnExtraCallback = getlogsorbuilder.onExtraCallback();
                if (thOnExtraCallback != null) {
                    ycxexternalsyntheticlambda0.onWarmupCompleted(thOnExtraCallback);
                } else {
                    ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
                }
            }
        }
    }

    public static void onNavigationEvent(ycxExternalSyntheticLambda0<?> ycxexternalsyntheticlambda0, Throwable th, AtomicInteger atomicInteger, getLogsOrBuilder getlogsorbuilder) {
        if (getlogsorbuilder.IAuthTabCallback(th)) {
            if (atomicInteger.getAndIncrement() == 0) {
                ycxexternalsyntheticlambda0.onWarmupCompleted(getlogsorbuilder.onExtraCallback());
                return;
            }
            return;
        }
        RxJavaPlugins.onExtraCallbackWithResult(th);
    }

    public static void onNavigationEvent(ycxExternalSyntheticLambda0<?> ycxexternalsyntheticlambda0, AtomicInteger atomicInteger, getLogsOrBuilder getlogsorbuilder) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thOnExtraCallback = getlogsorbuilder.onExtraCallback();
            if (thOnExtraCallback != null) {
                ycxexternalsyntheticlambda0.onWarmupCompleted(thOnExtraCallback);
            } else {
                ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void onNavigationEvent(writeQuoted<? super T> writequoted, T t, AtomicInteger atomicInteger, getLogsOrBuilder getlogsorbuilder) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            writequoted.onExtraCallback(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thOnExtraCallback = getlogsorbuilder.onExtraCallback();
                if (thOnExtraCallback != null) {
                    writequoted.onExtraCallbackWithResult(thOnExtraCallback);
                } else {
                    writequoted.onExtraCallback();
                }
            }
        }
    }

    public static void onExtraCallbackWithResult(writeQuoted<?> writequoted, Throwable th, AtomicInteger atomicInteger, getLogsOrBuilder getlogsorbuilder) {
        if (getlogsorbuilder.IAuthTabCallback(th)) {
            if (atomicInteger.getAndIncrement() == 0) {
                writequoted.onExtraCallbackWithResult(getlogsorbuilder.onExtraCallback());
                return;
            }
            return;
        }
        RxJavaPlugins.onExtraCallbackWithResult(th);
    }

    public static void onExtraCallback(writeQuoted<?> writequoted, AtomicInteger atomicInteger, getLogsOrBuilder getlogsorbuilder) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thOnExtraCallback = getlogsorbuilder.onExtraCallback();
            if (thOnExtraCallback != null) {
                writequoted.onExtraCallbackWithResult(thOnExtraCallback);
            } else {
                writequoted.onExtraCallback();
            }
        }
    }
}
