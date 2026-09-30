package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ycxsya implements CoroutineContext.onExtraCallback<djExternalSyntheticApiModelOutline4<?>> {
    private final ThreadLocal<?> onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ycxsya) && Intrinsics.areEqual(this.onNavigationEvent, ((ycxsya) obj).onNavigationEvent);
    }

    public int hashCode() {
        return this.onNavigationEvent.hashCode();
    }

    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.onNavigationEvent + ')';
    }

    public ycxsya(@NotNull ThreadLocal<?> threadLocal) {
        this.onNavigationEvent = threadLocal;
    }
}
