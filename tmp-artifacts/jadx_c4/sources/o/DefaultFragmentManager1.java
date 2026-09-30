package o;

import im.toss.di.TossPayApiModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DefaultFragmentManager1 implements captureStartValues<GriverManifest56> {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final createAnimators<g1> IAuthTabCallback;
    private final createAnimators<zzad> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        GriverManifest56 griverManifest56IAuthTabCallback = IAuthTabCallback();
        int i4 = onExtraCallback + 109;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return griverManifest56IAuthTabCallback;
    }

    public GriverManifest56 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        GriverManifest56 griverManifest56IAuthTabCallback = IAuthTabCallback((g1) this.IAuthTabCallback.get(), (zzad) this.onWarmupCompleted.get());
        int i4 = onExtraCallback + 85;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return griverManifest56IAuthTabCallback;
    }

    public static GriverManifest56 IAuthTabCallback(g1 g1Var, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        GriverManifest56 griverManifest56ExtraCallback = TossPayApiModule.onExtraCallback.extraCallback(g1Var, zzadVar);
        if (i3 == 0) {
            return (GriverManifest56) createAnimator.onNavigationEvent(griverManifest56ExtraCallback);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
