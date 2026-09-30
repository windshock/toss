package o;

import java.io.Closeable;
import java.io.IOException;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface TTHistoryActivity42 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, o.TTHistoryActivity41
    void close() throws IOException;

    long read(@NotNull TTBaseActivity tTBaseActivity, long j) throws IOException;

    Timeout timeout();
}
