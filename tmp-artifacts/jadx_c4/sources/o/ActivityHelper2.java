package o;

import im.toss.di.TossPayApiModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ActivityHelper2 implements captureStartValues<GriverManifest51> {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final createAnimators<zzad> IAuthTabCallback;
    private final createAnimators<g1> onExtraCallbackWithResult;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onNavigationEvent();
            throw null;
        }
        GriverManifest51 griverManifest51OnNavigationEvent = onNavigationEvent();
        int i3 = onNavigationEvent + 101;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return griverManifest51OnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public GriverManifest51 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = this.onExtraCallbackWithResult.get();
        if (i3 != 0) {
            return onExtraCallback((g1) obj, (zzad) this.IAuthTabCallback.get());
        }
        int i4 = 52 / 0;
        return onExtraCallback((g1) obj, (zzad) this.IAuthTabCallback.get());
    }

    public static GriverManifest51 onExtraCallback(g1 g1Var, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        GriverManifest51 griverManifest51 = (GriverManifest51) createAnimator.onNavigationEvent(TossPayApiModule.onExtraCallback.onWarmupCompleted(g1Var, zzadVar));
        int i4 = onNavigationEvent + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return griverManifest51;
    }
}
