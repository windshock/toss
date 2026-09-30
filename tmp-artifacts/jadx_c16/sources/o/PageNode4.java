package o;

import im.toss.di.TossApiServiceModule;
import im.toss.features.home.core.local.model.TransactionFilterLocal;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PageNode4 implements captureStartValues<FullScreenAd> {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final createAnimators<g1> onExtraCallbackWithResult;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        FullScreenAd fullScreenAdOnNavigationEvent = onNavigationEvent();
        int i4 = onExtraCallback + 119;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return fullScreenAdOnNavigationEvent;
    }

    public FullScreenAd onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult((g1) this.onExtraCallbackWithResult.get());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        FullScreenAd fullScreenAdOnExtraCallbackWithResult = onExtraCallbackWithResult((g1) this.onExtraCallbackWithResult.get());
        int i3 = onNavigationEvent + 93;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return fullScreenAdOnExtraCallbackWithResult;
    }

    public static FullScreenAd onExtraCallbackWithResult(g1 g1Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        FullScreenAd fullScreenAd = (FullScreenAd) createAnimator.onNavigationEvent((FullScreenAd) TossApiServiceModule.onExtraCallbackWithResult(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 1167137314, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -1167137314, new Object[]{TossApiServiceModule.IAuthTabCallback, g1Var}));
        int i4 = onNavigationEvent + 111;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return fullScreenAd;
    }
}
