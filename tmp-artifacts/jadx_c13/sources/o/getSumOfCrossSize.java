package o;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getSumOfCrossSize extends RuntimeException {
    private final transient CoroutineContext onExtraCallback;

    public getSumOfCrossSize(@NotNull CoroutineContext coroutineContext) {
        this.onExtraCallback = coroutineContext;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return String.valueOf(this.onExtraCallback);
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
