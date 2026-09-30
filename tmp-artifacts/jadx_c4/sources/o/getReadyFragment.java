package o;

import im.toss.di.TossPayApiModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getReadyFragment implements captureStartValues<GriverManifest27> {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final createAnimators<g1> onExtraCallback;
    private final createAnimators<zzad> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        GriverManifest27 griverManifest27OnExtraCallback = onExtraCallback();
        int i4 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return griverManifest27OnExtraCallback;
    }

    public GriverManifest27 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        GriverManifest27 griverManifest27OnNavigationEvent = onNavigationEvent((g1) this.onExtraCallback.get(), (zzad) this.onWarmupCompleted.get());
        int i4 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return griverManifest27OnNavigationEvent;
    }

    public static GriverManifest27 onNavigationEvent(g1 g1Var, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        GriverManifest27 griverManifest27 = (GriverManifest27) createAnimator.onNavigationEvent(TossPayApiModule.onExtraCallback.IAuthTabCallback_Parcel(g1Var, zzadVar));
        int i4 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return griverManifest27;
    }
}
