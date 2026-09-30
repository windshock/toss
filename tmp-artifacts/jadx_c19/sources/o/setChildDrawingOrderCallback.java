package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setChildDrawingOrderCallback {
    public static final void onNavigationEvent(@NotNull scrollStep scrollstep, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(scrollstep, "");
        Intrinsics.checkNotNullParameter(function0, "");
        scrollstep.onExtraCallback();
        function0.invoke();
        scrollstep.onWarmupCompleted();
    }
}
