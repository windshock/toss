package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getAnimatedValue<T> implements ltlud<T> {
    private final Function1<T, String> onExtraCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public getAnimatedValue(@NotNull Function1<? super T, String> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onExtraCallback = function1;
    }
}
