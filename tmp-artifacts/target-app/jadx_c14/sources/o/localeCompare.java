package o;

import viva.republica.toss.network.model.init.v2.InitDataProviderModule;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class localeCompare implements captureStartValues<nativeFree> {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        nativeFree nativefreeIAuthTabCallback = IAuthTabCallback();
        int i3 = onWarmupCompleted + 63;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return nativefreeIAuthTabCallback;
    }

    public nativeFree IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        nativeFree nativefreeOnExtraCallback = onExtraCallback();
        int i3 = IAuthTabCallback + 113;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return nativefreeOnExtraCallback;
    }

    public static nativeFree onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        nativeFree nativefree = (nativeFree) createAnimator.onNavigationEvent(InitDataProviderModule.INSTANCE.IAuthTabCallback());
        int i4 = onWarmupCompleted + 97;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return nativefree;
    }
}
