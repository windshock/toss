package o;

import im.toss.di.SecurityModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getOriginalURI implements captureStartValues<s5c> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final SecurityModule onExtraCallbackWithResult;
    private final createAnimators<g1> onNavigationEvent;
    private final createAnimators<zzad> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent();
        }
        onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public s5c onNavigationEvent() {
        s5c s5cVarOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            s5cVarOnNavigationEvent = onNavigationEvent(this.onExtraCallbackWithResult, (g1) this.onNavigationEvent.get(), (zzad) this.onWarmupCompleted.get());
            int i3 = 4 / 0;
        } else {
            s5cVarOnNavigationEvent = onNavigationEvent(this.onExtraCallbackWithResult, (g1) this.onNavigationEvent.get(), (zzad) this.onWarmupCompleted.get());
        }
        int i4 = IAuthTabCallback + 53;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return s5cVarOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static s5c onNavigationEvent(SecurityModule securityModule, g1 g1Var, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        s5c s5cVar = (s5c) createAnimator.onNavigationEvent(securityModule.onWarmupCompleted(g1Var, zzadVar));
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallback + 15;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return s5cVar;
    }
}
