package o;

import viva.republica.toss.network.impl.di.NetworkApiModule;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeAdBase implements captureStartValues<InterstitialAd> {
    private final createAnimators<g1> onNavigationEvent;

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public InterstitialAd get() {
        return onExtraCallback((g1) this.onNavigationEvent.get());
    }

    public static InterstitialAd onExtraCallback(g1 g1Var) {
        return (InterstitialAd) createAnimator.onNavigationEvent(NetworkApiModule.onExtraCallback.access000(g1Var));
    }
}
