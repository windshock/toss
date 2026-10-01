package o;

import im.toss.di.ApiServiceProviderModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class BaseAppContextExternalSyntheticApiModelOutline0 implements captureStartValues<g1> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final createAnimators<a2> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        g1 g1VarIAuthTabCallback = IAuthTabCallback();
        int i4 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return g1VarIAuthTabCallback;
    }

    public g1 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        g1 g1VarOnExtraCallbackWithResult = onExtraCallbackWithResult((a2) this.onWarmupCompleted.get());
        int i4 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return g1VarOnExtraCallbackWithResult;
    }

    public static g1 onExtraCallbackWithResult(a2 a2Var) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        g1 g1Var = (g1) createAnimator.onNavigationEvent(ApiServiceProviderModule.IAuthTabCallback.onWarmupCompleted(a2Var));
        int i3 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return g1Var;
        }
        obj.hashCode();
        throw null;
    }
}
