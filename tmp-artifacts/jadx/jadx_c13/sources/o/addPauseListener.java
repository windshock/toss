package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class addPauseListener<T> implements ltlud<T> {
    private final Function1<T, Integer> onExtraCallback;
    private final int onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public addPauseListener(@NotNull Function1<? super T, Integer> function1, int i) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onExtraCallback = function1;
        this.onWarmupCompleted = i;
        if (i < 0) {
            throw new IllegalArgumentException(("The minimum number of digits (" + i + ") is negative").toString());
        }
        if (i <= 9) {
            return;
        }
        throw new IllegalArgumentException(("The minimum number of digits (" + i + ") exceeds the length of an Int").toString());
    }
}
