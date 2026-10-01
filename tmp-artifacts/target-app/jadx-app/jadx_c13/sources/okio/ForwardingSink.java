package okio;

import java.io.IOException;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import o.TTBaseActivity;
import o.TTHistoryActivity41;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class ForwardingSink implements TTHistoryActivity41 {
    private final TTHistoryActivity41 onWarmupCompleted;

    public ForwardingSink(@NotNull TTHistoryActivity41 tTHistoryActivity41) {
        Intrinsics.checkNotNullParameter(tTHistoryActivity41, "");
        this.onWarmupCompleted = tTHistoryActivity41;
    }

    public final TTHistoryActivity41 delegate() {
        return this.onWarmupCompleted;
    }

    @Override // o.TTHistoryActivity41
    public void write(@NotNull TTBaseActivity tTBaseActivity, long j) throws IOException {
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        this.onWarmupCompleted.write(tTBaseActivity, j);
    }

    @Override // o.TTHistoryActivity41, java.io.Flushable
    public void flush() throws IOException {
        this.onWarmupCompleted.flush();
    }

    @Override // o.TTHistoryActivity41
    public Timeout timeout() {
        return this.onWarmupCompleted.timeout();
    }

    @Override // o.TTHistoryActivity41, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws IOException {
        this.onWarmupCompleted.close();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.onWarmupCompleted + ')';
    }

    @Deprecated
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final TTHistoryActivity41 m323deprecated_delegate() {
        return this.onWarmupCompleted;
    }
}
