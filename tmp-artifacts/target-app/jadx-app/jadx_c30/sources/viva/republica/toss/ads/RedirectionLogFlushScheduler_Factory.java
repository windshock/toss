package viva.republica.toss.ads;

import android.content.Context;
import o.captureStartValues;
import o.createAnimators;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RedirectionLogFlushScheduler_Factory implements captureStartValues<RedirectionLogFlushScheduler> {
    private final createAnimators<Context> IAuthTabCallback;
    private final createAnimators<RedirectionLogFlusher> onNavigationEvent;

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public RedirectionLogFlushScheduler get() {
        return onExtraCallbackWithResult((Context) this.IAuthTabCallback.get(), (RedirectionLogFlusher) this.onNavigationEvent.get());
    }

    public static RedirectionLogFlushScheduler onExtraCallbackWithResult(Context context, RedirectionLogFlusher redirectionLogFlusher) {
        return new RedirectionLogFlushScheduler(context, redirectionLogFlusher);
    }
}
