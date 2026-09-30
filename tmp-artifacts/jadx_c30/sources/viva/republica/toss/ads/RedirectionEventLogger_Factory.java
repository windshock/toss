package viva.republica.toss.ads;

import o.captureStartValues;
import o.createAnimators;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RedirectionEventLogger_Factory implements captureStartValues<RedirectionEventLogger> {
    private final createAnimators<RedirectionLogFlushScheduler> IAuthTabCallback;
    private final createAnimators<RedirectionLogStore> onExtraCallback;

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public RedirectionEventLogger get() {
        return onNavigationEvent((RedirectionLogStore) this.onExtraCallback.get(), (RedirectionLogFlushScheduler) this.IAuthTabCallback.get());
    }

    public static RedirectionEventLogger onNavigationEvent(RedirectionLogStore redirectionLogStore, RedirectionLogFlushScheduler redirectionLogFlushScheduler) {
        return new RedirectionEventLogger(redirectionLogStore, redirectionLogFlushScheduler);
    }
}
