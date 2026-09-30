package okhttp3.internal.http1;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import o.TTAppOpenAdActivity9;
import o.TTBaseActivity;
import o.TTBaseVideoActivity1;
import o.TTHistoryActivity41;
import o.TTHistoryActivity42;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.BufferedSocket;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    private final ExchangeCodec.Carrier carrier;
    private final OkHttpClient client;
    private final HeadersReader headersReader;
    private final BufferedSocket socket;
    private int state;
    private Headers trailers;
    public static final Companion Companion = new Companion(null);
    private static final Headers TRAILERS_RESPONSE_BODY_TRUNCATED = Headers.Companion.of("OkHttp-Response-Body", "Truncated");

    public Http1ExchangeCodec(@Nullable OkHttpClient okHttpClient, @NotNull ExchangeCodec.Carrier carrier, @NotNull BufferedSocket bufferedSocket) {
        Intrinsics.checkNotNullParameter(carrier, "");
        Intrinsics.checkNotNullParameter(bufferedSocket, "");
        this.client = okHttpClient;
        this.carrier = carrier;
        this.socket = bufferedSocket;
        this.headersReader = new HeadersReader(getSocket().getSource());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public ExchangeCodec.Carrier getCarrier() {
        return this.carrier;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public BufferedSocket getSocket() {
        return this.socket;
    }

    private final boolean isChunked(Response response) {
        return StringsKt__StringsJVMKt.equals("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true);
    }

    private final boolean isChunked(Request request) {
        return StringsKt__StringsJVMKt.equals("chunked", request.header("Transfer-Encoding"), true);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public boolean isResponseComplete() {
        return this.state == 6;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public TTHistoryActivity41 createRequestBody(@NotNull Request request, long j) throws ProtocolException {
        Intrinsics.checkNotNullParameter(request, "");
        RequestBody requestBodyBody = request.body();
        if (requestBodyBody != null && requestBodyBody.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (isChunked(request)) {
            return newChunkedSink();
        }
        if (j != NO_CHUNK_YET) {
            return newKnownLengthSink();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        getCarrier().mo308cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(@NotNull Request request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "");
        RequestLine requestLine = RequestLine.INSTANCE;
        Proxy.Type type = getCarrier().getRoute().proxy().type();
        Intrinsics.checkNotNullExpressionValue(type, "");
        writeRequest(request.headers(), requestLine.get(request, type));
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "");
        if (HttpHeaders.promisesBody(response)) {
            return isChunked(response) ? NO_CHUNK_YET : _UtilJvmKt.headersContentLength(response);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public TTHistoryActivity42 openResponseBodySource(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "");
        if (!HttpHeaders.promisesBody(response)) {
            return newFixedLengthSource(response.request().url(), 0L);
        }
        if (isChunked(response)) {
            return newChunkedSource(response.request().url());
        }
        long jHeadersContentLength = _UtilJvmKt.headersContentLength(response);
        if (jHeadersContentLength != NO_CHUNK_YET) {
            return newFixedLengthSource(response.request().url(), jHeadersContentLength);
        }
        return newUnknownLengthSource(response.request().url());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Headers peekTrailers() throws IOException {
        Headers headers = this.trailers;
        if (headers == TRAILERS_RESPONSE_BODY_TRUNCATED) {
            throw new IOException("Trailers cannot be read because the response body was truncated");
        }
        int i = this.state;
        if (i == 5 || i == 6) {
            return headers;
        }
        throw new IllegalStateException(("Trailers cannot be read because the state is " + this.state).toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() throws IOException {
        getSocket().getSink().flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() throws IOException {
        getSocket().getSink().flush();
    }

    public final void writeRequest(@NotNull Headers headers, @NotNull String str) throws IOException {
        Intrinsics.checkNotNullParameter(headers, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (this.state != 0) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        getSocket().getSink().onExtraCallback(str).onExtraCallback("\r\n");
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            getSocket().getSink().onExtraCallback(headers.name(i)).onExtraCallback(": ").onExtraCallback(headers.value(i)).onExtraCallback("\r\n");
        }
        getSocket().getSink().onExtraCallback("\r\n");
        this.state = 1;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean z) throws IOException {
        int i = this.state;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        try {
            StatusLine statusLine = StatusLine.Companion.parse(this.headersReader.readLine());
            Response.Builder builderHeaders = new Response.Builder().protocol(statusLine.protocol).code(statusLine.code).message(statusLine.message).headers(this.headersReader.readHeaders());
            if (z && statusLine.code == 100) {
                return null;
            }
            int i2 = statusLine.code;
            if (i2 == 100) {
                this.state = 3;
                return builderHeaders;
            }
            if (102 <= i2 && i2 < 200) {
                this.state = 3;
                return builderHeaders;
            }
            this.state = 4;
            return builderHeaders;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on " + getCarrier().getRoute().address().url().redact(), e);
        }
    }

    private final TTHistoryActivity41 newChunkedSink() {
        if (this.state != 1) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.state = 2;
        return new ChunkedSink();
    }

    private final TTHistoryActivity41 newKnownLengthSink() {
        if (this.state != 1) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.state = 2;
        return new KnownLengthSink();
    }

    private final TTHistoryActivity42 newFixedLengthSource(HttpUrl httpUrl, long j) {
        if (this.state != 4) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.state = 5;
        return new FixedLengthSource(this, httpUrl, j);
    }

    private final TTHistoryActivity42 newChunkedSource(HttpUrl httpUrl) {
        if (this.state != 4) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.state = 5;
        return new ChunkedSource(this, httpUrl);
    }

    private final TTHistoryActivity42 newUnknownLengthSource(HttpUrl httpUrl) {
        if (this.state != 4) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.state = 5;
        getCarrier().noNewExchanges();
        return new UnknownLengthSource(this, httpUrl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachTimeout(TTBaseVideoActivity1 tTBaseVideoActivity1) {
        Timeout timeoutOnExtraCallbackWithResult = tTBaseVideoActivity1.onExtraCallbackWithResult();
        tTBaseVideoActivity1.onExtraCallbackWithResult(Timeout.onNavigationEvent);
        timeoutOnExtraCallbackWithResult.clearDeadline();
        timeoutOnExtraCallbackWithResult.clearTimeout();
    }

    public final void skipConnectBody(@NotNull Response response) throws IOException {
        Intrinsics.checkNotNullParameter(response, "");
        long jHeadersContentLength = _UtilJvmKt.headersContentLength(response);
        if (jHeadersContentLength == NO_CHUNK_YET) {
            return;
        }
        TTHistoryActivity42 tTHistoryActivity42NewFixedLengthSource = newFixedLengthSource(response.request().url(), jHeadersContentLength);
        _UtilJvmKt.skipAll(tTHistoryActivity42NewFixedLengthSource, IntCompanionObject.MAX_VALUE, TimeUnit.MILLISECONDS);
        tTHistoryActivity42NewFixedLengthSource.close();
    }

    final class KnownLengthSink implements TTHistoryActivity41 {
        private boolean closed;
        private final TTBaseVideoActivity1 timeout;

        public KnownLengthSink() {
            this.timeout = new TTBaseVideoActivity1(Http1ExchangeCodec.this.getSocket().getSink().timeout());
        }

        @Override // o.TTHistoryActivity41
        public Timeout timeout() {
            return this.timeout;
        }

        @Override // o.TTHistoryActivity41
        public void write(@NotNull TTBaseActivity tTBaseActivity, long j) throws IOException {
            Intrinsics.checkNotNullParameter(tTBaseActivity, "");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            _UtilCommonKt.checkOffsetAndCount(tTBaseActivity.ICustomTabsCallbackDefault(), 0L, j);
            Http1ExchangeCodec.this.getSocket().getSink().write(tTBaseActivity, j);
        }

        @Override // o.TTHistoryActivity41, java.io.Flushable
        public void flush() throws IOException {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.getSocket().getSink().flush();
        }

        @Override // o.TTHistoryActivity41, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }
    }

    final class ChunkedSink implements TTHistoryActivity41 {
        private boolean closed;
        private final TTBaseVideoActivity1 timeout;

        public ChunkedSink() {
            this.timeout = new TTBaseVideoActivity1(Http1ExchangeCodec.this.getSocket().getSink().timeout());
        }

        @Override // o.TTHistoryActivity41
        public Timeout timeout() {
            return this.timeout;
        }

        @Override // o.TTHistoryActivity41
        public void write(@NotNull TTBaseActivity tTBaseActivity, long j) throws IOException {
            Intrinsics.checkNotNullParameter(tTBaseActivity, "");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            TTAppOpenAdActivity9 sink = Http1ExchangeCodec.this.getSocket().getSink();
            sink.access000(j);
            sink.onExtraCallback("\r\n");
            sink.write(tTBaseActivity, j);
            sink.onExtraCallback("\r\n");
        }

        @Override // o.TTHistoryActivity41, java.io.Flushable
        public void flush() {
            synchronized (this) {
                if (this.closed) {
                    return;
                }
                Http1ExchangeCodec.this.getSocket().getSink().flush();
            }
        }

        @Override // o.TTHistoryActivity41, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() {
            synchronized (this) {
                if (this.closed) {
                    return;
                }
                this.closed = true;
                Http1ExchangeCodec.this.getSocket().getSink().onExtraCallback("0\r\n\r\n");
                Http1ExchangeCodec.this.detachTimeout(this.timeout);
                Http1ExchangeCodec.this.state = 3;
            }
        }
    }

    abstract class AbstractSource implements TTHistoryActivity42 {
        private boolean closed;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final TTBaseVideoActivity1 timeout;
        private final HttpUrl url;

        public AbstractSource(@NotNull Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            Intrinsics.checkNotNullParameter(httpUrl, "");
            this.this$0 = http1ExchangeCodec;
            this.url = httpUrl;
            this.timeout = new TTBaseVideoActivity1(http1ExchangeCodec.getSocket().getSource().timeout());
        }

        public final HttpUrl getUrl() {
            return this.url;
        }

        protected final TTBaseVideoActivity1 getTimeout() {
            return this.timeout;
        }

        protected final boolean getClosed() {
            return this.closed;
        }

        protected final void setClosed(boolean z) {
            this.closed = z;
        }

        @Override // o.TTHistoryActivity42, o.TTHistoryActivity41
        public Timeout timeout() {
            return this.timeout;
        }

        @Override // o.TTHistoryActivity42
        public long read(@NotNull TTBaseActivity tTBaseActivity, long j) throws IOException {
            Intrinsics.checkNotNullParameter(tTBaseActivity, "");
            try {
                return this.this$0.getSocket().getSource().read(tTBaseActivity, j);
            } catch (IOException e) {
                this.this$0.getCarrier().noNewExchanges();
                responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
                throw e;
            }
        }

        public final void responseBodyComplete(@NotNull Headers headers) {
            OkHttpClient okHttpClient;
            CookieJar cookieJar;
            Intrinsics.checkNotNullParameter(headers, "");
            if (this.this$0.state != 6) {
                if (this.this$0.state == 5) {
                    this.this$0.detachTimeout(this.timeout);
                    this.this$0.trailers = headers;
                    this.this$0.state = 6;
                    if (headers.size() <= 0 || (okHttpClient = this.this$0.client) == null || (cookieJar = okHttpClient.cookieJar()) == null) {
                        return;
                    }
                    HttpHeaders.receiveHeaders(cookieJar, this.url, headers);
                    return;
                }
                throw new IllegalStateException("state: " + this.this$0.state);
            }
        }
    }

    final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;
        final /* synthetic */ Http1ExchangeCodec this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FixedLengthSource(@NotNull Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl, long j) {
            super(http1ExchangeCodec, httpUrl);
            Intrinsics.checkNotNullParameter(httpUrl, "");
            this.this$0 = http1ExchangeCodec;
            this.bytesRemaining = j;
            if (j == 0) {
                responseBodyComplete(Headers.EMPTY);
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, o.TTHistoryActivity42
        public long read(@NotNull TTBaseActivity tTBaseActivity, long j) throws IOException {
            Intrinsics.checkNotNullParameter(tTBaseActivity, "");
            if (j < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.bytesRemaining;
            if (j2 == 0) {
                return Http1ExchangeCodec.NO_CHUNK_YET;
            }
            long j3 = super.read(tTBaseActivity, Math.min(j2, j));
            if (j3 == Http1ExchangeCodec.NO_CHUNK_YET) {
                this.this$0.getCarrier().noNewExchanges();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
                throw protocolException;
            }
            long j4 = this.bytesRemaining - j3;
            this.bytesRemaining = j4;
            if (j4 == 0) {
                responseBodyComplete(Headers.EMPTY);
            }
            return j3;
        }

        @Override // o.TTHistoryActivity42, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, o.TTHistoryActivity41
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !_UtilJvmKt.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getCarrier().noNewExchanges();
                responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
            }
            setClosed(true);
        }
    }

    final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        final /* synthetic */ Http1ExchangeCodec this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(@NotNull Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super(http1ExchangeCodec, httpUrl);
            Intrinsics.checkNotNullParameter(httpUrl, "");
            this.this$0 = http1ExchangeCodec;
            this.bytesRemainingInChunk = Http1ExchangeCodec.NO_CHUNK_YET;
            this.hasMoreChunks = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, o.TTHistoryActivity42
        public long read(@NotNull TTBaseActivity tTBaseActivity, long j) throws IOException {
            Intrinsics.checkNotNullParameter(tTBaseActivity, "");
            if (j < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            if (!this.hasMoreChunks) {
                return Http1ExchangeCodec.NO_CHUNK_YET;
            }
            long j2 = this.bytesRemainingInChunk;
            if (j2 == 0 || j2 == Http1ExchangeCodec.NO_CHUNK_YET) {
                readChunkSize();
                if (!this.hasMoreChunks) {
                    return Http1ExchangeCodec.NO_CHUNK_YET;
                }
            }
            long j3 = super.read(tTBaseActivity, Math.min(j, this.bytesRemainingInChunk));
            if (j3 == Http1ExchangeCodec.NO_CHUNK_YET) {
                this.this$0.getCarrier().noNewExchanges();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
                throw protocolException;
            }
            this.bytesRemainingInChunk -= j3;
            return j3;
        }

        private final void readChunkSize() throws IOException {
            if (this.bytesRemainingInChunk != Http1ExchangeCodec.NO_CHUNK_YET) {
                this.this$0.getSocket().getSource().onUnminimized();
            }
            try {
                this.bytesRemainingInChunk = this.this$0.getSocket().getSource().extraCallbackWithResult();
                String string = StringsKt__StringsKt.trim((CharSequence) this.this$0.getSocket().getSource().onUnminimized()).toString();
                if (this.bytesRemainingInChunk >= 0 && (string.length() <= 0 || StringsKt__StringsJVMKt.startsWith$default(string, ";", false, 2, null))) {
                    if (this.bytesRemainingInChunk == 0) {
                        this.hasMoreChunks = false;
                        responseBodyComplete(this.this$0.headersReader.readHeaders());
                        return;
                    }
                    return;
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + string + '\"');
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // o.TTHistoryActivity42, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, o.TTHistoryActivity41
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !_UtilJvmKt.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getCarrier().noNewExchanges();
                responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
            }
            setClosed(true);
        }
    }

    final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;
        final /* synthetic */ Http1ExchangeCodec this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownLengthSource(@NotNull Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super(http1ExchangeCodec, httpUrl);
            Intrinsics.checkNotNullParameter(httpUrl, "");
            this.this$0 = http1ExchangeCodec;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, o.TTHistoryActivity42
        public long read(@NotNull TTBaseActivity tTBaseActivity, long j) throws IOException {
            Intrinsics.checkNotNullParameter(tTBaseActivity, "");
            if (j < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            if (this.inputExhausted) {
                return Http1ExchangeCodec.NO_CHUNK_YET;
            }
            long j2 = super.read(tTBaseActivity, j);
            if (j2 != Http1ExchangeCodec.NO_CHUNK_YET) {
                return j2;
            }
            this.inputExhausted = true;
            responseBodyComplete(Headers.EMPTY);
            return Http1ExchangeCodec.NO_CHUNK_YET;
        }

        @Override // o.TTHistoryActivity42, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, o.TTHistoryActivity41
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
            }
            setClosed(true);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
