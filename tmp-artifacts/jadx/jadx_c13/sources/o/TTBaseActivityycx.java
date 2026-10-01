package o;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class TTBaseActivityycx implements TTHistoryActivity41 {
    @Override // o.TTHistoryActivity41, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    @Override // o.TTHistoryActivity41, java.io.Flushable
    public void flush() {
    }

    @Override // o.TTHistoryActivity41
    public void write(@NotNull TTBaseActivity tTBaseActivity, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        tTBaseActivity.IAuthTabCallbackDefault(j);
    }

    @Override // o.TTHistoryActivity41
    public Timeout timeout() {
        return Timeout.onNavigationEvent;
    }
}
