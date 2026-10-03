package o;

import viva.republica.toss.network.impl.di.NetworkApiModule;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class MediaViewVideoRendererWithBackgroundPlayback implements captureStartValues<ExtraHints> {
    private final createAnimators<g1> onExtraCallback;

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public ExtraHints get() {
        return IAuthTabCallback((g1) this.onExtraCallback.get());
    }

    public static ExtraHints IAuthTabCallback(g1 g1Var) {
        return (ExtraHints) createAnimator.onNavigationEvent(NetworkApiModule.onExtraCallback.onExtraCallback(g1Var));
    }
}
