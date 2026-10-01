package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaUiV0jkbunOuDx2q2MQJdQIihhJc<T> {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final Function0<T> onExtraCallbackWithResult;
    private volatile T onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public r8lambdaUiV0jkbunOuDx2q2MQJdQIihhJc(@NotNull Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.onExtraCallbackWithResult = function0;
    }

    public final T onNavigationEvent() {
        T t;
        T t2 = this.onNavigationEvent;
        if (t2 != null) {
            return t2;
        }
        synchronized (this) {
            t = this.onNavigationEvent;
            if (t == null) {
                t = (T) this.onExtraCallbackWithResult.invoke();
                this.onNavigationEvent = t;
            }
        }
        return t;
    }

    public final T onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        T t = this.onNavigationEvent;
        int i4 = onWarmupCompleted + 93;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return t;
        }
        throw null;
    }

    public final void onExtraCallback() {
        synchronized (this) {
            this.onNavigationEvent = null;
            Unit unit = Unit.INSTANCE;
        }
    }
}
