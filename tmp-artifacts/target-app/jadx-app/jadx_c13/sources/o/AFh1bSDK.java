package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFh1bSDK<T> {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private T onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + 59;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public AFh1bSDK(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        this.onWarmupCompleted = t;
    }

    public final T onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onWarmupCompleted;
        }
        throw null;
    }

    public final void onWarmupCompleted(@NotNull T t) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(t, "");
        this.onWarmupCompleted = t;
        int i4 = IAuthTabCallback + 29;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }
}
