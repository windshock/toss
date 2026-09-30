package o;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface TTHistoryActivity41 extends Closeable, Flushable {
    void close() throws IOException;

    void flush() throws IOException;

    Timeout timeout();

    void write(@NotNull TTBaseActivity tTBaseActivity, long j) throws IOException;
}
