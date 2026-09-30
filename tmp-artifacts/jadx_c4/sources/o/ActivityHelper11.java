package o;

import im.toss.di.TossPayApiModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ActivityHelper11 implements captureStartValues<GriverManifest46> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final createAnimators<zzad> onExtraCallbackWithResult;
    private final createAnimators<g1> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent();
        }
        onNavigationEvent();
        throw null;
    }

    public GriverManifest46 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        GriverManifest46 griverManifest46OnExtraCallbackWithResult = onExtraCallbackWithResult((g1) this.onWarmupCompleted.get(), (zzad) this.onExtraCallbackWithResult.get());
        int i4 = IAuthTabCallback + 17;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return griverManifest46OnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static GriverManifest46 onExtraCallbackWithResult(g1 g1Var, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        GriverManifest46 griverManifest46 = (GriverManifest46) createAnimator.onNavigationEvent(TossPayApiModule.onExtraCallback.IAuthTabCallback(g1Var, zzadVar));
        if (i3 == 0) {
            return griverManifest46;
        }
        throw null;
    }
}
