package o;

import androidx.annotation.NonNull;
import java.lang.Thread;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class dispatchChildDetached$onNavigationEvent implements Thread.UncaughtExceptionHandler {
    private dispatchChildDetached$onNavigationEvent() {
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th) {
        dispatchChildDetached.extraCommand.onWarmupCompleted(new Object[]{"EXCEPTION:", "In the NoOpExceptionHandler, probably while destroying.", "Thread:", thread, "Error:", th});
    }
}
