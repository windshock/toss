package o;

import androidx.annotation.NonNull;
import java.lang.Thread;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class dispatchChildDetached$onWarmupCompleted implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ dispatchChildDetached onExtraCallbackWithResult;

    private dispatchChildDetached$onWarmupCompleted(dispatchChildDetached dispatchchilddetached) {
        this.onExtraCallbackWithResult = dispatchchilddetached;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th) {
        dispatchChildDetached.onExtraCallback(this.onExtraCallbackWithResult, th, true);
    }
}
