package o;

import viva.republica.toss.network.impl.di.NetworkApiModule;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getAdChoicesLinkUrl implements captureStartValues<InterstitialAdExtendedListener> {
    private final createAnimators<g1> onWarmupCompleted;

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public InterstitialAdExtendedListener get() {
        return onExtraCallbackWithResult((g1) this.onWarmupCompleted.get());
    }

    public static InterstitialAdExtendedListener onExtraCallbackWithResult(g1 g1Var) {
        return (InterstitialAdExtendedListener) createAnimator.onNavigationEvent(NetworkApiModule.onExtraCallback.extraCallbackWithResult(g1Var));
    }
}
