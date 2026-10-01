package o;

import im.toss.di.TossApiServiceModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class handleStartParams implements captureStartValues<AppContext> {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final createAnimators<wie2> IAuthTabCallback;
    private final createAnimators<zzad> onExtraCallbackWithResult;
    private final createAnimators<access1002> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AppContext appContextOnNavigationEvent = onNavigationEvent();
        int i4 = onNavigationEvent + 3;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return appContextOnNavigationEvent;
        }
        throw null;
    }

    public AppContext onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = this.onWarmupCompleted.get();
        if (i3 == 0) {
            return onExtraCallback((access1002) obj, (wie2) this.IAuthTabCallback.get(), (zzad) this.onExtraCallbackWithResult.get());
        }
        onExtraCallback((access1002) obj, (wie2) this.IAuthTabCallback.get(), (zzad) this.onExtraCallbackWithResult.get());
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static AppContext onExtraCallback(access1002 access1002Var, wie2 wie2Var, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AppContext appContext = (AppContext) createAnimator.onNavigationEvent(TossApiServiceModule.IAuthTabCallback.IAuthTabCallback(access1002Var, wie2Var, zzadVar));
        int i4 = onExtraCallback + 119;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return appContext;
    }
}
