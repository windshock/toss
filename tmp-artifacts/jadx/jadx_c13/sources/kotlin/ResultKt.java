package kotlin;

import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ResultKt {
    public static final Object createFailure(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return new Result.Failure(th);
    }

    public static final void onNavigationEvent(@NotNull Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
    }
}
