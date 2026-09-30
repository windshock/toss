package o;

import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.di.SplitTargetModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class hide implements captureStartValues<DeepLinkBaseRegistry> {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        DeepLinkBaseRegistry deepLinkBaseRegistryOnExtraCallback = onExtraCallback();
        int i4 = onNavigationEvent + 107;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return deepLinkBaseRegistryOnExtraCallback;
        }
        throw null;
    }

    public DeepLinkBaseRegistry onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        DeepLinkBaseRegistry deepLinkBaseRegistryOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 125;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return deepLinkBaseRegistryOnExtraCallbackWithResult;
    }

    public static DeepLinkBaseRegistry onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        DeepLinkBaseRegistry deepLinkBaseRegistry = (DeepLinkBaseRegistry) createAnimator.onNavigationEvent(SplitTargetModule.Companion.IAuthTabCallback());
        int i4 = onExtraCallback + 53;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return deepLinkBaseRegistry;
    }
}
