package o;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setMargin {
    private static final Executor onWarmupCompleted = new Executor() { // from class: o.setMargin.3
        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            applyConstraintsFromLayoutParams.onExtraCallbackWithResult(runnable);
        }
    };
    private static final Executor onExtraCallbackWithResult = new Executor() { // from class: o.setMargin.5
        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    };

    public static Executor onNavigationEvent() {
        return onWarmupCompleted;
    }

    public static Executor onWarmupCompleted() {
        return onExtraCallbackWithResult;
    }
}
