package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class pmiycx {
    private final Function0<String> onExtraCallback;
    private final int onExtraCallbackWithResult;

    public pmiycx(int i, @NotNull Function0<String> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.onExtraCallbackWithResult = i;
        this.onExtraCallback = function0;
    }

    public final int onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public final Function0<String> onNavigationEvent() {
        return this.onExtraCallback;
    }
}
