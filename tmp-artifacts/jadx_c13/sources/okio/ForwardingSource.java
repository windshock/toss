package okio;

import java.io.IOException;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import o.TTBaseActivity;
import o.TTHistoryActivity42;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class ForwardingSource implements TTHistoryActivity42 {
    private final TTHistoryActivity42 onExtraCallbackWithResult;

    public ForwardingSource(@NotNull TTHistoryActivity42 tTHistoryActivity42) {
        Intrinsics.checkNotNullParameter(tTHistoryActivity42, "");
        this.onExtraCallbackWithResult = tTHistoryActivity42;
    }

    public final TTHistoryActivity42 delegate() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.TTHistoryActivity42
    public long read(@NotNull TTBaseActivity tTBaseActivity, long j) throws IOException {
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        return this.onExtraCallbackWithResult.read(tTBaseActivity, j);
    }

    @Override // o.TTHistoryActivity42, o.TTHistoryActivity41
    public Timeout timeout() {
        return this.onExtraCallbackWithResult.timeout();
    }

    @Override // o.TTHistoryActivity42, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, o.TTHistoryActivity41
    public void close() throws IOException {
        this.onExtraCallbackWithResult.close();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.onExtraCallbackWithResult + ')';
    }

    @Deprecated
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final TTHistoryActivity42 m324deprecated_delegate() {
        return this.onExtraCallbackWithResult;
    }
}
