package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ycxlud<Output> implements setTextLocales<Output> {
    private final Function1<Output, Unit> onExtraCallbackWithResult;

    /* JADX WARN: Multi-variable type inference failed */
    public ycxlud(@NotNull Function1<? super Output, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onExtraCallbackWithResult = function1;
    }

    @Override // o.setTextLocales
    public Object onExtraCallback(Output output, @NotNull CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.onExtraCallbackWithResult.invoke(output);
        return fbyycx.Companion.onExtraCallbackWithResult(i);
    }
}
