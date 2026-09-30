package o;

import im.toss.di.TossApiServiceModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setJsBridgeReady implements captureStartValues<hasRootStatusPermission> {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final createAnimators<g1> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        hasRootStatusPermission hasrootstatuspermissionOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onExtraCallback + 5;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return hasrootstatuspermissionOnExtraCallbackWithResult;
    }

    public hasRootStatusPermission onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        hasRootStatusPermission hasrootstatuspermissionOnExtraCallback = onExtraCallback((g1) this.onWarmupCompleted.get());
        int i4 = onExtraCallback + 17;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return hasrootstatuspermissionOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static hasRootStatusPermission onExtraCallback(g1 g1Var) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        hasRootStatusPermission hasrootstatuspermission = (hasRootStatusPermission) createAnimator.onNavigationEvent(TossApiServiceModule.IAuthTabCallback.asBinder(g1Var));
        int i4 = onExtraCallback + 61;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return hasrootstatuspermission;
    }
}
