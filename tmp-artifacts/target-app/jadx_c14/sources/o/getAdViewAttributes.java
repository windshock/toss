package o;

import viva.republica.toss.network.impl.di.NetworkApiModule;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getAdViewAttributes implements captureStartValues<MediaViewVideoRenderer> {
    private final createAnimators<g1> onNavigationEvent;

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public MediaViewVideoRenderer get() {
        return onNavigationEvent((g1) this.onNavigationEvent.get());
    }

    public static MediaViewVideoRenderer onNavigationEvent(g1 g1Var) {
        return (MediaViewVideoRenderer) createAnimator.onNavigationEvent(NetworkApiModule.onExtraCallback.ICustomTabsCallbackStub(g1Var));
    }
}
