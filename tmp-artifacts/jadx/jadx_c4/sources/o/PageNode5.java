package o;

import im.toss.di.TossApiServiceModule;
import im.toss.features.home.core.local.model.TransactionFilterLocal;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PageNode5 implements captureStartValues<InterstitialAdInterstitialAdShowConfigBuilder> {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final createAnimators<g1> onExtraCallback;

    public /* synthetic */ Object get() {
        InterstitialAdInterstitialAdShowConfigBuilder interstitialAdInterstitialAdShowConfigBuilderOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            interstitialAdInterstitialAdShowConfigBuilderOnNavigationEvent = onNavigationEvent();
            int i3 = 20 / 0;
        } else {
            interstitialAdInterstitialAdShowConfigBuilderOnNavigationEvent = onNavigationEvent();
        }
        int i4 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return interstitialAdInterstitialAdShowConfigBuilderOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public InterstitialAdInterstitialAdShowConfigBuilder onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = this.onExtraCallback.get();
        if (i3 == 0) {
            return IAuthTabCallback((g1) obj);
        }
        IAuthTabCallback((g1) obj);
        throw null;
    }

    public static InterstitialAdInterstitialAdShowConfigBuilder IAuthTabCallback(g1 g1Var) {
        InterstitialAdInterstitialAdShowConfigBuilder interstitialAdInterstitialAdShowConfigBuilder;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            interstitialAdInterstitialAdShowConfigBuilder = (InterstitialAdInterstitialAdShowConfigBuilder) createAnimator.onNavigationEvent((InterstitialAdInterstitialAdShowConfigBuilder) TossApiServiceModule.onExtraCallbackWithResult(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -1160867494, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 1160867498, new Object[]{TossApiServiceModule.IAuthTabCallback, g1Var}));
            int i3 = 46 / 0;
        } else {
            interstitialAdInterstitialAdShowConfigBuilder = (InterstitialAdInterstitialAdShowConfigBuilder) createAnimator.onNavigationEvent((InterstitialAdInterstitialAdShowConfigBuilder) TossApiServiceModule.onExtraCallbackWithResult(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -1160867494, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 1160867498, new Object[]{TossApiServiceModule.IAuthTabCallback, g1Var}));
        }
        int i4 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return interstitialAdInterstitialAdShowConfigBuilder;
        }
        throw null;
    }
}
