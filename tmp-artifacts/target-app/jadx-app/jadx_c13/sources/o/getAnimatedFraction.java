package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getAnimatedFraction<T> implements ltlud<T> {
    private final Function1<T, Boolean> onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final ltlud<T> onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public getAnimatedFraction(@NotNull ltlud<? super T> ltludVar, @NotNull Function1<? super T, Boolean> function1, boolean z) {
        Intrinsics.checkNotNullParameter(ltludVar, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.onNavigationEvent = ltludVar;
        this.onExtraCallback = function1;
        this.onExtraCallbackWithResult = z;
    }
}
