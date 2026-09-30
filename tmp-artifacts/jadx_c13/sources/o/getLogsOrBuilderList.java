package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getLogsOrBuilderList {
    public static void onNavigationEvent() {
        if (RxJavaPlugins.onNavigationEvent()) {
            if ((Thread.currentThread() instanceof TombstoneProtosHeapObjectBuilder) || RxJavaPlugins.onWarmupCompleted()) {
                throw new IllegalStateException("Attempt to block on a Scheduler " + Thread.currentThread().getName() + " that doesn't support blocking operators as they may lead to deadlock");
            }
        }
    }
}
