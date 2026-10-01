package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class getSignPriKeyIndexOfUUID implements Executor {
    private final Handler onExtraCallback = new Handler(Looper.getMainLooper());

    getSignPriKeyIndexOfUUID() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.onExtraCallback.post(runnable);
    }
}
