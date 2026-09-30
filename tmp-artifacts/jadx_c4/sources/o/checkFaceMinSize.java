package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class checkFaceMinSize {
    private static volatile boolean IAuthTabCallback = false;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final checkFaceMinSize onWarmupCompleted = new checkFaceMinSize();
    private static final Object onNavigationEvent = new Object();

    private checkFaceMinSize() {
    }

    static {
        int i = onExtraCallbackWithResult + 19;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final void onExtraCallback() {
        synchronized (onNavigationEvent) {
            IAuthTabCallback = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void onNavigationEvent() {
        synchronized (onNavigationEvent) {
            IAuthTabCallback = false;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final <T> T onExtraCallbackWithResult(@NotNull Function0<? extends T> function0) {
        T t;
        Intrinsics.checkNotNullParameter(function0, "");
        synchronized (onNavigationEvent) {
            t = IAuthTabCallback ? (T) function0.invoke() : null;
        }
        return t;
    }
}
