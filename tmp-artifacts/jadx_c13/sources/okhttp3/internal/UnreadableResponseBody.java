package okhttp3.internal;

import kotlin.jvm.internal.Intrinsics;
import o.TTAppOpenAdTransActivity;
import o.TTBaseActivity;
import o.TTCeilingLandingPageActivity5;
import o.TTHistoryActivity42;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class UnreadableResponseBody extends ResponseBody implements TTHistoryActivity42 {
    private final long contentLength;
    private final MediaType mediaType;

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public UnreadableResponseBody(@Nullable MediaType mediaType, long j) {
        this.mediaType = mediaType;
        this.contentLength = j;
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        return this.mediaType;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    public TTAppOpenAdTransActivity source() {
        return TTCeilingLandingPageActivity5.onExtraCallback(this);
    }

    @Override // o.TTHistoryActivity42
    public long read(@NotNull TTBaseActivity tTBaseActivity, long j) {
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // o.TTHistoryActivity42, o.TTHistoryActivity41
    public Timeout timeout() {
        return Timeout.onNavigationEvent;
    }
}
