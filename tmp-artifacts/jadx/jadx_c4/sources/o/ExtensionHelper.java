package o;

import im.toss.di.DevToolRegistryModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ExtensionHelper implements captureStartValues<Object> {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult$1ddead5a();
        }
        onExtraCallbackWithResult$1ddead5a();
        throw null;
    }

    public Object onExtraCallbackWithResult$1ddead5a() {
        Object objIAuthTabCallback$1ddead5a;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            objIAuthTabCallback$1ddead5a = IAuthTabCallback$1ddead5a();
            int i3 = 72 / 0;
        } else {
            objIAuthTabCallback$1ddead5a = IAuthTabCallback$1ddead5a();
        }
        int i4 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback$1ddead5a;
    }

    public static Object IAuthTabCallback$1ddead5a() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = createAnimator.onNavigationEvent(DevToolRegistryModule.onExtraCallback.onExtraCallbackWithResult$1ddead5a());
        int i4 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
        return objOnNavigationEvent;
    }
}
