package o;

import im.toss.di.TossPayApiModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isFinishing implements captureStartValues<GriverManifest401> {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final createAnimators<zzad> onExtraCallbackWithResult;
    private final createAnimators<g1> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        GriverManifest401 griverManifest401OnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onExtraCallback + 73;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return griverManifest401OnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public GriverManifest401 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent((g1) this.onWarmupCompleted.get(), (zzad) this.onExtraCallbackWithResult.get());
            throw null;
        }
        GriverManifest401 griverManifest401OnNavigationEvent = onNavigationEvent((g1) this.onWarmupCompleted.get(), (zzad) this.onExtraCallbackWithResult.get());
        int i3 = onNavigationEvent + 11;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return griverManifest401OnNavigationEvent;
        }
        throw null;
    }

    public static GriverManifest401 onNavigationEvent(g1 g1Var, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        GriverManifest401 griverManifest401 = (GriverManifest401) createAnimator.onNavigationEvent(TossPayApiModule.onExtraCallback.onNavigationEvent(g1Var, zzadVar));
        int i4 = onExtraCallback + 99;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return griverManifest401;
        }
        throw null;
    }
}
