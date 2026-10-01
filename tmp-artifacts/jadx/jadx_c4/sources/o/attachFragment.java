package o;

import im.toss.di.TossPayApiModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class attachFragment implements captureStartValues<GriverManifest57> {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final createAnimators<g1> IAuthTabCallback;
    private final createAnimators<zzad> onExtraCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public GriverManifest57 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        GriverManifest57 griverManifest57OnExtraCallback = onExtraCallback((g1) this.IAuthTabCallback.get(), (zzad) this.onExtraCallback.get());
        int i4 = onNavigationEvent + 13;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return griverManifest57OnExtraCallback;
        }
        throw null;
    }

    public static GriverManifest57 onExtraCallback(g1 g1Var, zzad zzadVar) {
        GriverManifest57 griverManifest57;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            griverManifest57 = (GriverManifest57) createAnimator.onNavigationEvent(TossPayApiModule.onExtraCallback.IAuthTabCallbackStub(g1Var, zzadVar));
            int i3 = 26 / 0;
        } else {
            griverManifest57 = (GriverManifest57) createAnimator.onNavigationEvent(TossPayApiModule.onExtraCallback.IAuthTabCallbackStub(g1Var, zzadVar));
        }
        int i4 = onNavigationEvent + 97;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return griverManifest57;
    }
}
