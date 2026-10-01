package o;

import android.os.Process;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onAdViewAdDisplayFailed<T> {
    public static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 0;
    public static int onExtraCallbackWithResult = 0;
    private static int onTransact = 1;
    private final Function1<T, Unit> onExtraCallback;
    private T onNavigationEvent;
    private final Function1<T, Unit> onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public onAdViewAdDisplayFailed(@NotNull Function1<? super T, Unit> function1, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.onExtraCallback = function1;
        this.onWarmupCompleted = function12;
    }

    public final void onExtraCallbackWithResult(T t) {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            if (!Intrinsics.areEqual(this.onNavigationEvent, t)) {
                this.onNavigationEvent = t;
                this.onExtraCallback.invoke(t);
                return;
            } else {
                int i3 = onTransact + 37;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
        }
        Intrinsics.areEqual(this.onNavigationEvent, t);
        throw null;
    }

    public final void onNavigationEvent(T t) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (Intrinsics.areEqual(this.onNavigationEvent, t)) {
            this.onNavigationEvent = null;
            this.onWarmupCompleted.invoke(t);
            return;
        }
        int i4 = IAuthTabCallbackStub + 83;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 13;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        this.onNavigationEvent = null;
        int i5 = i3 + 47;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public static int onExtraCallbackWithResult() {
        int i = onExtraCallbackWithResult;
        int i2 = i % 5235560;
        onExtraCallbackWithResult = i + 1;
        if (i2 != 0) {
            return IAuthTabCallback;
        }
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        IAuthTabCallback = startElapsedRealtime;
        return startElapsedRealtime;
    }
}
