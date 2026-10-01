package o;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class TTFullScreenVideoActivity implements TTHistoryActivity41 {
    private final Timeout onExtraCallbackWithResult;
    private final OutputStream onNavigationEvent;

    public TTFullScreenVideoActivity(@NotNull OutputStream outputStream, @NotNull Timeout timeout) {
        Intrinsics.checkNotNullParameter(outputStream, "");
        Intrinsics.checkNotNullParameter(timeout, "");
        this.onNavigationEvent = outputStream;
        this.onExtraCallbackWithResult = timeout;
    }

    @Override // o.TTHistoryActivity41
    public void write(@NotNull TTBaseActivity tTBaseActivity, long j) throws IOException {
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        TTAppOpenAdActivity6.onExtraCallbackWithResult(tTBaseActivity.ICustomTabsCallbackDefault(), 0L, j);
        while (j > 0) {
            this.onExtraCallbackWithResult.throwIfReached();
            TTHistoryActivity2 tTHistoryActivity2 = tTBaseActivity.head;
            Intrinsics.checkNotNull(tTHistoryActivity2);
            int iMin = (int) Math.min(j, tTHistoryActivity2.limit - tTHistoryActivity2.pos);
            this.onNavigationEvent.write(tTHistoryActivity2.data, tTHistoryActivity2.pos, iMin);
            tTHistoryActivity2.pos += iMin;
            long j2 = iMin;
            j -= j2;
            tTBaseActivity.asInterface(tTBaseActivity.ICustomTabsCallbackDefault() - j2);
            if (tTHistoryActivity2.pos == tTHistoryActivity2.limit) {
                tTBaseActivity.head = tTHistoryActivity2.onExtraCallback();
                TTHistoryActivity.onExtraCallback(tTHistoryActivity2);
            }
        }
    }

    @Override // o.TTHistoryActivity41, java.io.Flushable
    public void flush() throws IOException {
        this.onNavigationEvent.flush();
    }

    @Override // o.TTHistoryActivity41, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws IOException {
        this.onNavigationEvent.close();
    }

    @Override // o.TTHistoryActivity41
    public Timeout timeout() {
        return this.onExtraCallbackWithResult;
    }

    public String toString() {
        return "sink(" + this.onNavigationEvent + ')';
    }
}
