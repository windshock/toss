package im.toss.deeplink.ksp.registry;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17 implements Function0 {
    public static int IAuthTabCallback = 0;
    public static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Class cls$r8$lambda$sXsLFovwjRzfl4kh2jO3VzlsksY = FeaturesMydataKspDeepLinkRegistry.$r8$lambda$sXsLFovwjRzfl4kh2jO3VzlsksY();
        int i4 = onWarmupCompleted + 41;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return cls$r8$lambda$sXsLFovwjRzfl4kh2jO3VzlsksY;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int onNavigationEvent() {
        int i = IAuthTabCallback;
        int i2 = i % 7535878;
        IAuthTabCallback = i + 1;
        if (i2 != 0) {
            return onExtraCallbackWithResult;
        }
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        onExtraCallbackWithResult = iMaxMemory;
        return iMaxMemory;
    }
}
