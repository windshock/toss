package o;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ltzb<T> implements ltlud<T> {
    private final int onExtraCallback;
    private final List<Integer> onExtraCallbackWithResult;
    private final Function1<T, invalidateSelf> onNavigationEvent;
    private final int onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public ltzb(@NotNull Function1<? super T, invalidateSelf> function1, int i, int i2, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(function1, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        this.onNavigationEvent = function1;
        this.onWarmupCompleted = i;
        this.onExtraCallback = i2;
        this.onExtraCallbackWithResult = list;
        if (i <= 0 || i >= 10) {
            throw new IllegalArgumentException(("The minimum number of digits (" + i + ") is not in range 1..9").toString());
        }
        if (i > i2 || i2 >= 10) {
            throw new IllegalArgumentException(("The maximum number of digits (" + i2 + ") is not in range " + i + "..9").toString());
        }
    }
}
