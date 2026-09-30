package o;

import im.toss.features.benefit.ui.GlobalBenefitTabFragment;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class processSystemContactCallback implements setSize<GlobalBenefitTabFragment> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static void onWarmupCompleted(GlobalBenefitTabFragment globalBenefitTabFragment, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        globalBenefitTabFragment.router = sessionTrackerb;
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void onWarmupCompleted(GlobalBenefitTabFragment globalBenefitTabFragment, getPricingPhaseList getpricingphaselist) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        globalBenefitTabFragment.tossRegion = getpricingphaselist;
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
