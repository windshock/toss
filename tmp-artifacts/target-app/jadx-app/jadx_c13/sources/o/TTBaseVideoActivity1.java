package o;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.jvm.internal.Intrinsics;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class TTBaseVideoActivity1 extends Timeout {
    private Timeout onExtraCallback;

    public TTBaseVideoActivity1(@NotNull Timeout timeout) {
        Intrinsics.checkNotNullParameter(timeout, "");
        this.onExtraCallback = timeout;
    }

    public final Timeout onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public final TTBaseVideoActivity1 onExtraCallbackWithResult(@NotNull Timeout timeout) {
        Intrinsics.checkNotNullParameter(timeout, "");
        this.onExtraCallback = timeout;
        return this;
    }

    @Override // okio.Timeout
    public Timeout timeout(long j, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "");
        return this.onExtraCallback.timeout(j, timeUnit);
    }

    @Override // okio.Timeout
    public long timeoutNanos() {
        return this.onExtraCallback.timeoutNanos();
    }

    @Override // okio.Timeout
    public boolean hasDeadline() {
        return this.onExtraCallback.hasDeadline();
    }

    @Override // okio.Timeout
    public long deadlineNanoTime() {
        return this.onExtraCallback.deadlineNanoTime();
    }

    @Override // okio.Timeout
    public Timeout deadlineNanoTime(long j) {
        return this.onExtraCallback.deadlineNanoTime(j);
    }

    @Override // okio.Timeout
    public Timeout clearTimeout() {
        return this.onExtraCallback.clearTimeout();
    }

    @Override // okio.Timeout
    public Timeout clearDeadline() {
        return this.onExtraCallback.clearDeadline();
    }

    @Override // okio.Timeout
    public void throwIfReached() throws IOException {
        this.onExtraCallback.throwIfReached();
    }

    @Override // okio.Timeout
    public void cancel() {
        this.onExtraCallback.cancel();
    }

    @Override // okio.Timeout
    public void awaitSignal(@NotNull Condition condition) throws Throwable {
        Intrinsics.checkNotNullParameter(condition, "");
        this.onExtraCallback.awaitSignal(condition);
    }

    @Override // okio.Timeout
    public void waitUntilNotified(@NotNull Object obj) throws Throwable {
        Intrinsics.checkNotNullParameter(obj, "");
        this.onExtraCallback.waitUntilNotified(obj);
    }
}
