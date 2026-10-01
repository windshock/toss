package o;

import im.toss.di.TossPayApiModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DefaultFragmentManager implements captureStartValues<GriverManifest54> {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final createAnimators<zzad> onExtraCallbackWithResult;
    private final createAnimators<g1> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        GriverManifest54 griverManifest54OnExtraCallback = onExtraCallback();
        int i4 = onExtraCallback + 33;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return griverManifest54OnExtraCallback;
        }
        throw null;
    }

    public GriverManifest54 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onWarmupCompleted((g1) this.onWarmupCompleted.get(), (zzad) this.onExtraCallbackWithResult.get());
            obj.hashCode();
            throw null;
        }
        GriverManifest54 griverManifest54OnWarmupCompleted = onWarmupCompleted((g1) this.onWarmupCompleted.get(), (zzad) this.onExtraCallbackWithResult.get());
        int i3 = onNavigationEvent + 75;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return griverManifest54OnWarmupCompleted;
        }
        throw null;
    }

    public static GriverManifest54 onWarmupCompleted(g1 g1Var, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        GriverManifest54 griverManifest54OnExtraCallback = TossPayApiModule.onExtraCallback.onExtraCallback(g1Var, zzadVar);
        if (i3 == 0) {
            return (GriverManifest54) createAnimator.onNavigationEvent(griverManifest54OnExtraCallback);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
