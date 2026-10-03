package viva.republica.toss.ads;

import o.captureStartValues;
import o.createAnimator;
import o.createAnimators;
import o.g1;
import o.zzad;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RedirectionEventApiModule_ProvideRedirectionEventApiFactory implements captureStartValues<RedirectionEventApi> {
    private final createAnimators<g1> IAuthTabCallback;
    private final createAnimators<zzad> onExtraCallbackWithResult;

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public RedirectionEventApi get() {
        return IAuthTabCallback((g1) this.IAuthTabCallback.get(), (zzad) this.onExtraCallbackWithResult.get());
    }

    public static RedirectionEventApi IAuthTabCallback(g1 g1Var, zzad zzadVar) {
        return (RedirectionEventApi) createAnimator.onNavigationEvent(RedirectionEventApiModule.onExtraCallback.IAuthTabCallback(g1Var, zzadVar));
    }
}
