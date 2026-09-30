package o;

import im.toss.di.TossPayKycModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppPopParams implements captureStartValues<GriverOpenAuthExtensionRevokeCallback> {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final createAnimators<getEnableJsT2> IAuthTabCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        GriverOpenAuthExtensionRevokeCallback griverOpenAuthExtensionRevokeCallbackIAuthTabCallback = IAuthTabCallback();
        int i4 = onExtraCallback + 85;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return griverOpenAuthExtensionRevokeCallbackIAuthTabCallback;
    }

    public GriverOpenAuthExtensionRevokeCallback IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getEnableJsT2 getenablejst2 = (getEnableJsT2) this.IAuthTabCallback.get();
        if (i3 == 0) {
            return onExtraCallbackWithResult(getenablejst2);
        }
        onExtraCallbackWithResult(getenablejst2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static GriverOpenAuthExtensionRevokeCallback onExtraCallbackWithResult(getEnableJsT2 getenablejst2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        GriverOpenAuthExtensionRevokeCallback griverOpenAuthExtensionRevokeCallback = (GriverOpenAuthExtensionRevokeCallback) createAnimator.onNavigationEvent(TossPayKycModule.onExtraCallbackWithResult.onWarmupCompleted(getenablejst2));
        int i4 = onExtraCallbackWithResult + 49;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return griverOpenAuthExtensionRevokeCallback;
    }
}
