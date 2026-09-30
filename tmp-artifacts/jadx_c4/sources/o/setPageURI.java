package o;

import im.toss.di.TossApiServiceModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setPageURI implements captureStartValues<isNativeCaller> {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final createAnimators<g1> onExtraCallback;

    public /* synthetic */ Object get() {
        isNativeCaller isnativecallerOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            isnativecallerOnNavigationEvent = onNavigationEvent();
            int i3 = 83 / 0;
        } else {
            isnativecallerOnNavigationEvent = onNavigationEvent();
        }
        int i4 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return isnativecallerOnNavigationEvent;
    }

    public isNativeCaller onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        g1 g1Var = (g1) this.onExtraCallback.get();
        if (i3 == 0) {
            return IAuthTabCallback(g1Var);
        }
        IAuthTabCallback(g1Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static isNativeCaller IAuthTabCallback(g1 g1Var) {
        isNativeCaller isnativecaller;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            isnativecaller = (isNativeCaller) createAnimator.onNavigationEvent(TossApiServiceModule.IAuthTabCallback.getInterfaceDescriptor(g1Var));
            int i3 = 80 / 0;
        } else {
            isnativecaller = (isNativeCaller) createAnimator.onNavigationEvent(TossApiServiceModule.IAuthTabCallback.getInterfaceDescriptor(g1Var));
        }
        int i4 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return isnativecaller;
    }
}
