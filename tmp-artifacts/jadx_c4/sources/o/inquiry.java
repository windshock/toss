package o;

import im.toss.di.OnboardingNetworkModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class inquiry implements captureStartValues<FullScreenAdShowAdConfig> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final createAnimators<zzad> onExtraCallbackWithResult;
    private final createAnimators<g1> onNavigationEvent;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        FullScreenAdShowAdConfig fullScreenAdShowAdConfigOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onExtraCallback + 85;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return fullScreenAdShowAdConfigOnExtraCallbackWithResult;
    }

    public FullScreenAdShowAdConfig onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        FullScreenAdShowAdConfig fullScreenAdShowAdConfigOnExtraCallbackWithResult = onExtraCallbackWithResult((g1) this.onNavigationEvent.get(), (zzad) this.onExtraCallbackWithResult.get());
        int i4 = IAuthTabCallback + 71;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return fullScreenAdShowAdConfigOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static FullScreenAdShowAdConfig onExtraCallbackWithResult(g1 g1Var, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        FullScreenAdShowAdConfig fullScreenAdShowAdConfigOnWarmupCompleted = OnboardingNetworkModule.onExtraCallbackWithResult.onWarmupCompleted(g1Var, zzadVar);
        if (i3 == 0) {
            return (FullScreenAdShowAdConfig) createAnimator.onNavigationEvent(fullScreenAdShowAdConfigOnWarmupCompleted);
        }
        throw null;
    }
}
