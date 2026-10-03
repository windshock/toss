package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class pushNull {
    private long onExtraCallbackWithResult;
    private final long onNavigationEvent;

    public pushNull() {
        this(0L, 1, null);
    }

    public pushNull(long j) {
        this.onNavigationEvent = j;
    }

    public /* synthetic */ pushNull(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 500L : j);
    }

    public final void IAuthTabCallback(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.onExtraCallbackWithResult >= this.onNavigationEvent) {
            function0.invoke();
        }
        this.onExtraCallbackWithResult = jCurrentTimeMillis;
    }
}
