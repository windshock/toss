package o;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class TTCeilingLandingPageActivity2 implements TTHistoryActivity42 {
    private final Timeout onExtraCallback;
    private final InputStream onNavigationEvent;

    public TTCeilingLandingPageActivity2(@NotNull InputStream inputStream, @NotNull Timeout timeout) {
        Intrinsics.checkNotNullParameter(inputStream, "");
        Intrinsics.checkNotNullParameter(timeout, "");
        this.onNavigationEvent = inputStream;
        this.onExtraCallback = timeout;
    }

    @Override // o.TTHistoryActivity42
    public long read(@NotNull TTBaseActivity tTBaseActivity, long j) throws IOException {
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        try {
            this.onExtraCallback.throwIfReached();
            TTHistoryActivity2 tTHistoryActivity2OnNavigationEvent = tTBaseActivity.onNavigationEvent(1);
            int i = this.onNavigationEvent.read(tTHistoryActivity2OnNavigationEvent.data, tTHistoryActivity2OnNavigationEvent.limit, (int) Math.min(j, 8192 - tTHistoryActivity2OnNavigationEvent.limit));
            if (i == -1) {
                if (tTHistoryActivity2OnNavigationEvent.pos != tTHistoryActivity2OnNavigationEvent.limit) {
                    return -1L;
                }
                tTBaseActivity.head = tTHistoryActivity2OnNavigationEvent.onExtraCallback();
                TTHistoryActivity.onExtraCallback(tTHistoryActivity2OnNavigationEvent);
                return -1L;
            }
            tTHistoryActivity2OnNavigationEvent.limit += i;
            long j2 = i;
            tTBaseActivity.asInterface(tTBaseActivity.ICustomTabsCallbackDefault() + j2);
            return j2;
        } catch (AssertionError e) {
            if (TTHistoryLandingPageActivity5.onNavigationEvent(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // o.TTHistoryActivity42, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, o.TTHistoryActivity41
    public void close() throws IOException {
        this.onNavigationEvent.close();
    }

    @Override // o.TTHistoryActivity42, o.TTHistoryActivity41
    public Timeout timeout() {
        return this.onExtraCallback;
    }

    public String toString() {
        return "source(" + this.onNavigationEvent + ')';
    }
}
