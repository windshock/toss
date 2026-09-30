package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class rvInitOpt {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static int onWarmupCompleted = 1;
    public static final rvInitOpt onExtraCallbackWithResult = new rvInitOpt();
    private static int onNavigationEvent = -1;
    public static final int onExtraCallback = 8;

    private rvInitOpt() {
    }

    static {
        int i = onWarmupCompleted + 1;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 44 / 0;
        }
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int i4 = onNavigationEvent;
        if (i3 == 0) {
            int i5 = 36 / 0;
        }
        return i4;
    }

    public final void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 69;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent = i;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i3 + 23;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    public final boolean onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return Intrinsics.areEqual(str, "credit_main");
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.areEqual(str, "credit_main");
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
