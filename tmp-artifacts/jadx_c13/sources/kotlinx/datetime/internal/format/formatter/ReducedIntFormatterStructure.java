package kotlinx.datetime.internal.format.formatter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ltlud;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ReducedIntFormatterStructure<T> implements ltlud<T> {
    private final int IAuthTabCallback;
    private final Function1<T, Integer> onExtraCallbackWithResult;
    private final int onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public ReducedIntFormatterStructure(@NotNull Function1<? super T, Integer> function1, int i, int i2) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onExtraCallbackWithResult = function1;
        this.IAuthTabCallback = i;
        this.onWarmupCompleted = i2;
    }
}
