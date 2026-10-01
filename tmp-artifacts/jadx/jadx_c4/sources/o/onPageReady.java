package o;

import im.toss.di.TossPayApiModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onPageReady implements captureStartValues<GriverManifest44> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final createAnimators<g1> onNavigationEvent;
    private final createAnimators<zzad> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback();
        }
        IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public GriverManifest44 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        g1 g1Var = (g1) this.onNavigationEvent.get();
        if (i3 == 0) {
            return onNavigationEvent(g1Var, (zzad) this.onWarmupCompleted.get());
        }
        onNavigationEvent(g1Var, (zzad) this.onWarmupCompleted.get());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static GriverManifest44 onNavigationEvent(g1 g1Var, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        GriverManifest44 griverManifest44 = (GriverManifest44) createAnimator.onNavigationEvent(TossPayApiModule.onExtraCallback.IAuthTabCallbackStubProxy(g1Var, zzadVar));
        int i4 = onExtraCallback + 13;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
        return griverManifest44;
    }
}
