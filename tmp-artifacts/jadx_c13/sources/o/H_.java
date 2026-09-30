package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class H_ {
    private final Function0<Long> IAuthTabCallback;
    private long onExtraCallback;
    private int onNavigationEvent;

    public H_(@NotNull Function0<Long> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.IAuthTabCallback = function0;
    }

    public final long IAuthTabCallback() {
        long jLongValue;
        long j;
        synchronized (this) {
            jLongValue = this.IAuthTabCallback.invoke().longValue() / 100;
            if (jLongValue == this.onExtraCallback) {
                int i = this.onNavigationEvent;
                if (i < 99) {
                    this.onNavigationEvent = i + 1;
                }
            } else {
                this.onNavigationEvent = 0;
                this.onExtraCallback = jLongValue;
            }
            j = this.onNavigationEvent;
        }
        return (jLongValue * 100) + j;
    }
}
