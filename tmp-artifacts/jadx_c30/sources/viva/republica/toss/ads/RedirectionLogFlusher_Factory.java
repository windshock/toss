package viva.republica.toss.ads;

import o.captureStartValues;
import o.createAnimators;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RedirectionLogFlusher_Factory implements captureStartValues<RedirectionLogFlusher> {
    private final createAnimators<RedirectionEventApi> onNavigationEvent;
    private final createAnimators<RedirectionLogStore> onWarmupCompleted;

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public RedirectionLogFlusher get() {
        return onNavigationEvent((RedirectionLogStore) this.onWarmupCompleted.get(), (RedirectionEventApi) this.onNavigationEvent.get());
    }

    public static RedirectionLogFlusher onNavigationEvent(RedirectionLogStore redirectionLogStore, RedirectionEventApi redirectionEventApi) {
        return new RedirectionLogFlusher(redirectionLogStore, redirectionEventApi);
    }
}
