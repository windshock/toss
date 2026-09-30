package o;

import im.toss.rn.toss.core.TossReactNativeFragment;
import im.toss.rn.toss.core.observability.ReactNativeRouteLcpSessionManager;
import im.toss.rn.toss.core.observability.RnPhaseObserver;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaMRL_hRFH2H775XxZRdXB9Gu_ZTU implements setSize<TossReactNativeFragment> {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public static void onExtraCallback(TossReactNativeFragment tossReactNativeFragment, r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE r8lambdausr520ceu4yijcrtwho1uywjge) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossReactNativeFragment.tossReactMessageHandlerManager = r8lambdausr520ceu4yijcrtwho1uywjge;
        if (i3 == 0) {
            throw null;
        }
    }

    public static void onExtraCallback(TossReactNativeFragment tossReactNativeFragment, ReactNativeRouteLcpSessionManager reactNativeRouteLcpSessionManager) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossReactNativeFragment.reactNativeRouteLcpSessions = reactNativeRouteLcpSessionManager;
        int i4 = onExtraCallbackWithResult + 65;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void onWarmupCompleted(TossReactNativeFragment tossReactNativeFragment, RnPhaseObserver rnPhaseObserver) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tossReactNativeFragment.rnPhaseObserver = rnPhaseObserver;
        int i4 = onExtraCallback + 105;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
