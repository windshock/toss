package o;

import im.toss.di.TossPayApiModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class detachFragment implements captureStartValues<GriverManifest64> {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final createAnimators<g1> IAuthTabCallback;
    private final createAnimators<zzad> onExtraCallbackWithResult;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        GriverManifest64 griverManifest64OnNavigationEvent = onNavigationEvent();
        int i4 = onNavigationEvent + 85;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return griverManifest64OnNavigationEvent;
        }
        throw null;
    }

    public GriverManifest64 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        g1 g1Var = (g1) this.IAuthTabCallback.get();
        if (i3 == 0) {
            return onExtraCallback(g1Var, (zzad) this.onExtraCallbackWithResult.get());
        }
        onExtraCallback(g1Var, (zzad) this.onExtraCallbackWithResult.get());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static GriverManifest64 onExtraCallback(g1 g1Var, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        GriverManifest64 griverManifest64 = (GriverManifest64) createAnimator.onNavigationEvent(TossPayApiModule.onExtraCallback.onTransact(g1Var, zzadVar));
        int i4 = onNavigationEvent + 13;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return griverManifest64;
    }
}
