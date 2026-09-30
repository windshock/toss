package o;

import kotlin.jvm.functions.Function0;
import kotlin.properties.ReadOnlyProperty;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setAppLaunchParams {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ ReadOnlyProperty onWarmupCompleted(long j, Function0 function0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ReadOnlyProperty readOnlyPropertyIAuthTabCallback = IAuthTabCallback(j, function0);
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
        int i5 = onNavigationEvent + 95;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 30 / 0;
        }
        return readOnlyPropertyIAuthTabCallback;
    }

    private static final <T> ReadOnlyProperty<Object, T> IAuthTabCallback(long j, Function0<? extends T> function0) {
        int i = 2 % 2;
        setIncludeFiles setincludefiles = new setIncludeFiles(j, function0);
        int i2 = onWarmupCompleted + 37;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return setincludefiles;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
