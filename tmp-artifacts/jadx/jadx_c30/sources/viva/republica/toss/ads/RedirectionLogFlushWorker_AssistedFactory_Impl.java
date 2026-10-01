package viva.republica.toss.ads;

import android.content.Context;
import androidx.work.WorkerParameters;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RedirectionLogFlushWorker_AssistedFactory_Impl implements RedirectionLogFlushWorker_AssistedFactory {
    private final RedirectionLogFlushWorker_Factory onExtraCallback;

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public RedirectionLogFlushWorker onExtraCallback(Context context, WorkerParameters workerParameters) {
        return this.onExtraCallback.onWarmupCompleted(context, workerParameters);
    }
}
