package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class BaseRoundCornerProgressBarSavedState extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseRoundCornerProgressBarSavedState(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseRoundCornerProgressBarSavedState(@NotNull Throwable th) {
        super(th);
        Intrinsics.checkNotNullParameter(th, "");
    }
}
