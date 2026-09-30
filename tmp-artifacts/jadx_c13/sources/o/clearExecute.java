package o;

import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class clearExecute {
    private static final Object IAuthTabCallback;

    public static final <T, R> R onNavigationEvent(@NotNull clearOffset<T, R> clearoffset, T t) {
        Intrinsics.checkNotNullParameter(clearoffset, "");
        return (R) new setEndAddress(clearoffset.onWarmupCompleted(), t).onExtraCallback();
    }

    static {
        Result.Companion companion = Result.Companion;
        IAuthTabCallback = Result.m31constructorimpl(access14100.onExtraCallback());
    }
}
