package o;

import im.toss.di.TossApiServiceModule;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class isUseForEmbed implements captureStartValues<BidderTokenProvider> {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final createAnimators<g1> onNavigationEvent;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted();
        }
        onWarmupCompleted();
        throw null;
    }

    public BidderTokenProvider onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        g1 g1Var = (g1) this.onNavigationEvent.get();
        if (i3 == 0) {
            return IAuthTabCallback(g1Var);
        }
        IAuthTabCallback(g1Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static BidderTokenProvider IAuthTabCallback(g1 g1Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        BidderTokenProvider bidderTokenProvider = (BidderTokenProvider) createAnimator.onNavigationEvent(TossApiServiceModule.IAuthTabCallback.onNavigationEvent(g1Var));
        int i4 = IAuthTabCallback + 103;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return bidderTokenProvider;
    }
}
