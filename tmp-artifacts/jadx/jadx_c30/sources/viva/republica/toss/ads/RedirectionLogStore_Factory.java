package viva.republica.toss.ads;

import android.content.Context;
import o.captureStartValues;
import o.createAnimators;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RedirectionLogStore_Factory implements captureStartValues<RedirectionLogStore> {
    private final createAnimators<Context> onWarmupCompleted;

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public RedirectionLogStore get() {
        return onExtraCallbackWithResult((Context) this.onWarmupCompleted.get());
    }

    public static RedirectionLogStore onExtraCallbackWithResult(Context context) {
        return new RedirectionLogStore(context);
    }
}
