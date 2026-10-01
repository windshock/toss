package o;

import im.toss.di.TossPayApiModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class createFragment implements captureStartValues<GriverManifest25> {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final createAnimators<zzad> IAuthTabCallback;
    private final createAnimators<g1> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        GriverManifest25 griverManifest25OnNavigationEvent = onNavigationEvent();
        int i4 = onNavigationEvent + 7;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return griverManifest25OnNavigationEvent;
    }

    public GriverManifest25 onNavigationEvent() {
        GriverManifest25 griverManifest25OnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            griverManifest25OnExtraCallbackWithResult = onExtraCallbackWithResult((g1) this.onWarmupCompleted.get(), (zzad) this.IAuthTabCallback.get());
            int i3 = 48 / 0;
        } else {
            griverManifest25OnExtraCallbackWithResult = onExtraCallbackWithResult((g1) this.onWarmupCompleted.get(), (zzad) this.IAuthTabCallback.get());
        }
        int i4 = onExtraCallback + 111;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return griverManifest25OnExtraCallbackWithResult;
    }

    public static GriverManifest25 onExtraCallbackWithResult(g1 g1Var, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        GriverManifest25 griverManifest25 = (GriverManifest25) createAnimator.onNavigationEvent(TossPayApiModule.onExtraCallback.asBinder(g1Var, zzadVar));
        int i3 = onNavigationEvent + 65;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return griverManifest25;
        }
        throw null;
    }
}
