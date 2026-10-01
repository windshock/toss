package o;

import im.toss.di.ApplicationModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class BaseAppContextExternalSyntheticApiModelOutline1 implements captureStartValues<Object> {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult$128544c1 = onExtraCallbackWithResult$128544c1();
        int i4 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnExtraCallbackWithResult$128544c1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Object onExtraCallbackWithResult$128544c1() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback$128544c1();
        }
        onExtraCallback$128544c1();
        throw null;
    }

    public static Object onExtraCallback$128544c1() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            createAnimator.onNavigationEvent(ApplicationModule.onExtraCallbackWithResult.IAuthTabCallback$128544c1());
            throw null;
        }
        Object objOnNavigationEvent = createAnimator.onNavigationEvent(ApplicationModule.onExtraCallbackWithResult.IAuthTabCallback$128544c1());
        int i3 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return objOnNavigationEvent;
        }
        throw null;
    }
}
