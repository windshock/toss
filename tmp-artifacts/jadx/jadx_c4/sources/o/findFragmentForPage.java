package o;

import im.toss.di.TossPayApiModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class findFragmentForPage implements captureStartValues<GriverManifest61> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final createAnimators<zzad> onExtraCallbackWithResult;
    private final createAnimators<g1> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        GriverManifest61 griverManifest61OnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i3 = onExtraCallback + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return griverManifest61OnExtraCallbackWithResult;
    }

    public GriverManifest61 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent((g1) this.onWarmupCompleted.get(), (zzad) this.onExtraCallbackWithResult.get());
            throw null;
        }
        GriverManifest61 griverManifest61OnNavigationEvent = onNavigationEvent((g1) this.onWarmupCompleted.get(), (zzad) this.onExtraCallbackWithResult.get());
        int i3 = onExtraCallback + 89;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return griverManifest61OnNavigationEvent;
        }
        throw null;
    }

    public static GriverManifest61 onNavigationEvent(g1 g1Var, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        GriverManifest61 griverManifest61 = (GriverManifest61) createAnimator.onNavigationEvent(TossPayApiModule.onExtraCallback.asInterface(g1Var, zzadVar));
        int i4 = onExtraCallback + 121;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return griverManifest61;
    }
}
