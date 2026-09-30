package o;

import im.toss.di.TossPayApiModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getFragments implements captureStartValues<GriverManifest63> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final createAnimators<g1> onNavigationEvent;
    private final createAnimators<zzad> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        GriverManifest63 griverManifest63OnNavigationEvent = onNavigationEvent();
        int i4 = onExtraCallback + 93;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return griverManifest63OnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public GriverManifest63 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        GriverManifest63 griverManifest63IAuthTabCallback = IAuthTabCallback((g1) this.onNavigationEvent.get(), (zzad) this.onWarmupCompleted.get());
        int i4 = IAuthTabCallback + 115;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return griverManifest63IAuthTabCallback;
        }
        throw null;
    }

    public static GriverManifest63 IAuthTabCallback(g1 g1Var, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        GriverManifest63 griverManifest63 = (GriverManifest63) createAnimator.onNavigationEvent(TossPayApiModule.onExtraCallback.access100(g1Var, zzadVar));
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
        return griverManifest63;
    }
}
