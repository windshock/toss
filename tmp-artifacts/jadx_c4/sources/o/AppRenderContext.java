package o;

import im.toss.di.TossPayThirdPartyModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppRenderContext implements captureStartValues<GriverManifest22> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private final createAnimators<getLastOpenTimestamp> onExtraCallback;
    private final createAnimators<GeckoHubImp> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        GriverManifest22 griverManifest22OnWarmupCompleted = onWarmupCompleted();
        int i4 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return griverManifest22OnWarmupCompleted;
    }

    public GriverManifest22 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getLastOpenTimestamp getlastopentimestamp = (getLastOpenTimestamp) this.onExtraCallback.get();
        if (i3 == 0) {
            return onWarmupCompleted(getlastopentimestamp, (GeckoHubImp) this.onWarmupCompleted.get());
        }
        int i4 = 52 / 0;
        return onWarmupCompleted(getlastopentimestamp, (GeckoHubImp) this.onWarmupCompleted.get());
    }

    public static GriverManifest22 onWarmupCompleted(getLastOpenTimestamp getlastopentimestamp, GeckoHubImp geckoHubImp) {
        GriverManifest22 griverManifest22;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            griverManifest22 = (GriverManifest22) createAnimator.onNavigationEvent(TossPayThirdPartyModule.IAuthTabCallback.IAuthTabCallback(getlastopentimestamp, geckoHubImp));
            int i3 = 52 / 0;
        } else {
            griverManifest22 = (GriverManifest22) createAnimator.onNavigationEvent(TossPayThirdPartyModule.IAuthTabCallback.IAuthTabCallback(getlastopentimestamp, geckoHubImp));
        }
        int i4 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return griverManifest22;
    }
}
