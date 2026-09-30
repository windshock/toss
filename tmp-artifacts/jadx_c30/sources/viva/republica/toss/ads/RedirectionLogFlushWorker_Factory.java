package viva.republica.toss.ads;

import android.content.Context;
import androidx.work.WorkerParameters;
import o.createAnimators;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RedirectionLogFlushWorker_Factory {
    private final createAnimators<RedirectionLogFlusher> IAuthTabCallback;

    public RedirectionLogFlushWorker onWarmupCompleted(Context context, WorkerParameters workerParameters) {
        return onExtraCallback(context, workerParameters, (RedirectionLogFlusher) this.IAuthTabCallback.get());
    }

    public static RedirectionLogFlushWorker onExtraCallback(Context context, WorkerParameters workerParameters, RedirectionLogFlusher redirectionLogFlusher) {
        return new RedirectionLogFlushWorker(context, workerParameters, redirectionLogFlusher);
    }
}
