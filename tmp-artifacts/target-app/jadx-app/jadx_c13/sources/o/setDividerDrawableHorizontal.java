package o;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setDividerDrawableHorizontal implements findResAndMsg {
    private final CoroutineContext IAuthTabCallback;

    public setDividerDrawableHorizontal(@NotNull CoroutineContext coroutineContext) {
        this.IAuthTabCallback = coroutineContext;
    }

    @Override // o.findResAndMsg
    public CoroutineContext getCoroutineContext() {
        return this.IAuthTabCallback;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
