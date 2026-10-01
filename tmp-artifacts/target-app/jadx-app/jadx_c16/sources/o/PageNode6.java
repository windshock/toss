package o;

import im.toss.di.TossApiServiceModule;
import im.toss.features.home.core.local.model.TransactionFilterLocal;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PageNode6 implements captureStartValues<FullScreenAdShowConfigBuilder> {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final createAnimators<g1> onNavigationEvent;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        FullScreenAdShowConfigBuilder fullScreenAdShowConfigBuilderOnExtraCallback = onExtraCallback();
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        return fullScreenAdShowConfigBuilderOnExtraCallback;
    }

    public FullScreenAdShowConfigBuilder onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        FullScreenAdShowConfigBuilder fullScreenAdShowConfigBuilderOnWarmupCompleted = onWarmupCompleted((g1) this.onNavigationEvent.get());
        int i4 = onExtraCallback + 47;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return fullScreenAdShowConfigBuilderOnWarmupCompleted;
    }

    public static FullScreenAdShowConfigBuilder onWarmupCompleted(g1 g1Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        FullScreenAdShowConfigBuilder fullScreenAdShowConfigBuilder = (FullScreenAdShowConfigBuilder) createAnimator.onNavigationEvent((FullScreenAdShowConfigBuilder) TossApiServiceModule.onExtraCallbackWithResult(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -1720799176, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 1720799178, new Object[]{TossApiServiceModule.IAuthTabCallback, g1Var}));
        int i4 = onExtraCallback + 123;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return fullScreenAdShowConfigBuilder;
    }
}
