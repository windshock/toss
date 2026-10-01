package okhttp3;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.TTAppOpenAdTransActivity;
import o.TTBaseActivity;
import o.TTBaseLandingPageActivity;
import o.TTCeilingLandingPageActivity5;
import o.TTFullScreenVideoActivity1;
import o.TTHistoryActivity42;
import okhttp3.internal.http1.HeadersReader;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class MultipartReader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final TTFullScreenVideoActivity1 afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final TTBaseLandingPageActivity crlfDashDashBoundary;
    private PartSource currentPart;
    private final TTBaseLandingPageActivity dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final TTAppOpenAdTransActivity source;

    public MultipartReader(@NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity, @NotNull String str) throws IOException {
        Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.source = tTAppOpenAdTransActivity;
        this.boundary = str;
        this.dashDashBoundary = new TTBaseActivity().onNavigationEvent("--").onNavigationEvent(str).writeTypedObject();
        this.crlfDashDashBoundary = new TTBaseActivity().onNavigationEvent("\r\n--").onNavigationEvent(str).writeTypedObject();
    }

    public final String boundary() {
        return this.boundary;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MultipartReader(@NotNull ResponseBody responseBody) throws IOException {
        String strParameter;
        Intrinsics.checkNotNullParameter(responseBody, BuildConfig.FLAVOR);
        TTAppOpenAdTransActivity tTAppOpenAdTransActivitySource = responseBody.source();
        MediaType mediaTypeContentType = responseBody.contentType();
        if (mediaTypeContentType != null && (strParameter = mediaTypeContentType.parameter("boundary")) != null) {
            this(tTAppOpenAdTransActivitySource, strParameter);
            return;
        }
        throw new ProtocolException("expected the Content-Type to have a boundary parameter");
    }

    public final Part nextPart() throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.noMoreParts) {
            return null;
        }
        if (this.partCount == 0 && this.source.onNavigationEvent(0L, this.dashDashBoundary)) {
            this.source.IAuthTabCallbackDefault(this.dashDashBoundary.access100());
        } else {
            while (true) {
                long jCurrentPartBytesRemaining = currentPartBytesRemaining(8192L);
                if (jCurrentPartBytesRemaining == 0) {
                    break;
                }
                this.source.IAuthTabCallbackDefault(jCurrentPartBytesRemaining);
            }
            this.source.IAuthTabCallbackDefault(this.crlfDashDashBoundary.access100());
        }
        boolean z = false;
        while (true) {
            int iIAuthTabCallback = this.source.IAuthTabCallback(afterBoundaryOptions);
            if (iIAuthTabCallback == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (iIAuthTabCallback == 0) {
                this.partCount++;
                Headers headers = new HeadersReader(this.source).readHeaders();
                PartSource partSource = new PartSource();
                this.currentPart = partSource;
                return new Part(headers, TTCeilingLandingPageActivity5.onExtraCallback(partSource));
            }
            if (iIAuthTabCallback == 1) {
                if (z) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.partCount == 0) {
                    throw new ProtocolException("expected at least 1 part");
                }
                this.noMoreParts = true;
                return null;
            }
            if (iIAuthTabCallback == 2 || iIAuthTabCallback == 3) {
                z = true;
            }
        }
    }

    final class PartSource implements TTHistoryActivity42 {
        private final Timeout timeout = new Timeout();

        public PartSource() {
        }

        public void close() {
            if (Intrinsics.areEqual(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        public long read(@NotNull TTBaseActivity tTBaseActivity, long j) {
            Intrinsics.checkNotNullParameter(tTBaseActivity, BuildConfig.FLAVOR);
            if (j >= 0) {
                if (Intrinsics.areEqual(MultipartReader.this.currentPart, this)) {
                    Timeout timeout = MultipartReader.this.source.timeout();
                    Timeout timeout2 = this.timeout;
                    MultipartReader multipartReader = MultipartReader.this;
                    long jTimeoutNanos = timeout.timeoutNanos();
                    long jOnExtraCallbackWithResult = Timeout.Companion.onExtraCallbackWithResult(timeout2.timeoutNanos(), timeout.timeoutNanos());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    timeout.timeout(jOnExtraCallbackWithResult, timeUnit);
                    if (timeout.hasDeadline()) {
                        long jDeadlineNanoTime = timeout.deadlineNanoTime();
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                        }
                        try {
                            long jCurrentPartBytesRemaining = multipartReader.currentPartBytesRemaining(j);
                            long j2 = jCurrentPartBytesRemaining == 0 ? -1L : multipartReader.source.read(tTBaseActivity, jCurrentPartBytesRemaining);
                            timeout.timeout(jTimeoutNanos, timeUnit);
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(jDeadlineNanoTime);
                            }
                            return j2;
                        } catch (Throwable th) {
                            timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(jDeadlineNanoTime);
                            }
                            throw th;
                        }
                    }
                    if (timeout2.hasDeadline()) {
                        timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                    }
                    try {
                        long jCurrentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(j);
                        long j3 = jCurrentPartBytesRemaining2 == 0 ? -1L : multipartReader.source.read(tTBaseActivity, jCurrentPartBytesRemaining2);
                        timeout.timeout(jTimeoutNanos, timeUnit);
                        if (timeout2.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                        return j3;
                    } catch (Throwable th2) {
                        timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                        if (timeout2.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                        throw th2;
                    }
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }

        public Timeout timeout() {
            return this.timeout;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long j) throws EOFException {
        long jMin = Math.min(this.source.access100().ICustomTabsCallbackDefault(), j) + 1;
        long jOnNavigationEvent = this.source.onNavigationEvent(this.crlfDashDashBoundary, 0L, jMin);
        if (jOnNavigationEvent != -1) {
            return jOnNavigationEvent;
        }
        if (this.source.access100().ICustomTabsCallbackDefault() >= jMin) {
            return Math.min(jMin, j);
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    public static final class Part implements Closeable {
        private final TTAppOpenAdTransActivity body;
        private final Headers headers;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }

        public Part(@NotNull Headers headers, @NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity) {
            Intrinsics.checkNotNullParameter(headers, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, BuildConfig.FLAVOR);
            this.headers = headers;
            this.body = tTAppOpenAdTransActivity;
        }

        public final Headers headers() {
            return this.headers;
        }

        public final TTAppOpenAdTransActivity body() {
            return this.body;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TTFullScreenVideoActivity1 getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }
    }

    static {
        TTFullScreenVideoActivity1.onExtraCallback onextracallback = TTFullScreenVideoActivity1.Companion;
        TTBaseLandingPageActivity.IAuthTabCallback iAuthTabCallback = TTBaseLandingPageActivity.Companion;
        afterBoundaryOptions = onextracallback.onWarmupCompleted(new TTBaseLandingPageActivity[]{iAuthTabCallback.IAuthTabCallback("\r\n"), iAuthTabCallback.IAuthTabCallback("--"), iAuthTabCallback.IAuthTabCallback(" "), iAuthTabCallback.IAuthTabCallback("\t")});
    }
}
