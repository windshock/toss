package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ltsya1<T> implements ltlud<T> {
    private final int onExtraCallback;
    private final Integer onExtraCallbackWithResult;
    private final Function1<T, Integer> onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public ltsya1(@NotNull Function1<? super T, Integer> function1, int i, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onNavigationEvent = function1;
        this.onExtraCallback = i;
        this.onExtraCallbackWithResult = num;
        if (i < 0) {
            throw new IllegalArgumentException(("The minimum number of digits (" + i + ") is negative").toString());
        }
        if (i <= 9) {
            return;
        }
        throw new IllegalArgumentException(("The minimum number of digits (" + i + ") exceeds the length of an Int").toString());
    }
}
