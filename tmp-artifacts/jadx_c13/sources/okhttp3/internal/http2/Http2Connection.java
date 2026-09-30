package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.TTAppOpenAdTransActivity;
import o.TTBaseActivity;
import o.TTBaseLandingPageActivity;
import okhttp3.Headers;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.BufferedSocket;
import okhttp3.internal.http2.FlowControlListener;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.flowcontrol.WindowCounter;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Http2Connection implements Closeable, Lockable {
    public static final int AWAIT_PING = 3;
    public static final Companion Companion = new Companion(null);
    private static final Settings DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;
    private final String connectionName;
    private final Set<Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private final FlowControlListener flowControlListener;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;
    private final Listener listener;
    private int nextStreamId;
    private final Settings okHttpSettings;
    private Settings peerSettings;
    private final PushObserver pushObserver;
    private final TaskQueue pushQueue;
    private final WindowCounter readBytes;
    private final ReaderRunnable readerRunnable;
    private final TaskQueue settingsListenerQueue;
    private final BufferedSocket socket;
    private final Map<Integer, Http2Stream> streams;
    private final TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final Http2Writer writer;
    private final TaskQueue writerQueue;

    public final boolean pushedStream$okhttp(int i) {
        return i != 0 && (i & 1) == 0;
    }

    public final void start() throws IOException {
        start$default(this, false, 1, null);
    }

    public Http2Connection(@NotNull Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "");
        boolean client$okhttp = builder.getClient$okhttp();
        this.client = client$okhttp;
        this.listener = builder.getListener$okhttp();
        this.streams = new LinkedHashMap();
        String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        this.nextStreamId = builder.getClient$okhttp() ? 3 : 2;
        TaskRunner taskRunner$okhttp = builder.getTaskRunner$okhttp();
        this.taskRunner = taskRunner$okhttp;
        TaskQueue taskQueueNewQueue = taskRunner$okhttp.newQueue();
        this.writerQueue = taskQueueNewQueue;
        this.pushQueue = taskRunner$okhttp.newQueue();
        this.settingsListenerQueue = taskRunner$okhttp.newQueue();
        this.pushObserver = builder.getPushObserver$okhttp();
        this.flowControlListener = builder.getFlowControlListener$okhttp();
        Settings settings = new Settings();
        if (builder.getClient$okhttp()) {
            settings.set(4, OKHTTP_CLIENT_WINDOW_SIZE);
        }
        this.okHttpSettings = settings;
        this.peerSettings = DEFAULT_SETTINGS;
        this.readBytes = new WindowCounter(0);
        this.writeBytesMaximum = this.peerSettings.getInitialWindowSize();
        BufferedSocket socket$okhttp = builder.getSocket$okhttp();
        this.socket = socket$okhttp;
        this.writer = new Http2Writer(socket$okhttp.getSink(), client$okhttp);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(socket$okhttp.getSource(), client$okhttp));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis$okhttp() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis$okhttp());
            taskQueueNewQueue.schedule(connectionName$okhttp + " ping", nanos, new Function0() { // from class: okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Long.valueOf(Http2Connection._init_$lambda$0(this.f$0, nanos));
                }
            });
        }
    }

    public final boolean getClient$okhttp() {
        return this.client;
    }

    public final Listener getListener$okhttp() {
        return this.listener;
    }

    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.streams;
    }

    public final String getConnectionName$okhttp() {
        return this.connectionName;
    }

    public final int getLastGoodStreamId$okhttp() {
        return this.lastGoodStreamId;
    }

    public final void setLastGoodStreamId$okhttp(int i) {
        this.lastGoodStreamId = i;
    }

    public final int getNextStreamId$okhttp() {
        return this.nextStreamId;
    }

    public final void setNextStreamId$okhttp(int i) {
        this.nextStreamId = i;
    }

    public final FlowControlListener getFlowControlListener$okhttp() {
        return this.flowControlListener;
    }

    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final void setPeerSettings(@NotNull Settings settings) {
        Intrinsics.checkNotNullParameter(settings, "");
        this.peerSettings = settings;
    }

    public final WindowCounter getReadBytes() {
        return this.readBytes;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final BufferedSocket getSocket$okhttp() {
        return this.socket;
    }

    public final Http2Writer getWriter() {
        return this.writer;
    }

    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    public final Http2Stream pushStream(int i, @NotNull List<Header> list, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(list, "");
        if (this.client) {
            throw new IllegalStateException("Client cannot push requests.");
        }
        return newStream(i, list, z);
    }

    public final Http2Stream newStream(@NotNull List<Header> list, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(list, "");
        return newStream(0, list, z);
    }

    private final Http2Stream newStream(int i, List<Header> list, boolean z) throws IOException {
        int i2;
        Http2Stream http2Stream;
        boolean z2;
        boolean z3 = !z;
        synchronized (this.writer) {
            synchronized (this) {
                try {
                    if (this.nextStreamId > 1073741823) {
                        shutdown(ErrorCode.REFUSED_STREAM);
                    }
                    if (this.isShutdown) {
                        throw new ConnectionShutdownException();
                    }
                    i2 = this.nextStreamId;
                    this.nextStreamId = i2 + 2;
                    http2Stream = new Http2Stream(i2, this, z3, false, null);
                    z2 = !z || this.writeBytesTotal >= this.writeBytesMaximum || http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum();
                    if (http2Stream.isOpen()) {
                        this.streams.put(Integer.valueOf(i2), http2Stream);
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                }
            }
            if (i == 0) {
                this.writer.headers(z3, i2, list);
            } else {
                if (this.client) {
                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                }
                this.writer.pushPromise(i, i2, list);
            }
        }
        if (z2) {
            this.writer.flush();
        }
        return http2Stream;
    }

    public final void writeHeaders$okhttp(int i, boolean z, @NotNull List<Header> list) throws IOException {
        Intrinsics.checkNotNullParameter(list, "");
        this.writer.headers(z, i, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.writer.maxDataLength());
        r6 = r2;
        r8.writeBytesTotal += r6;
        r4 = kotlin.Unit.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeData(int i, boolean z, @Nullable TTBaseActivity tTBaseActivity, long j) throws IOException {
        int iMin;
        long j2;
        if (j == 0) {
            this.writer.data(z, i, tTBaseActivity, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        long j3 = this.writeBytesTotal;
                        long j4 = this.writeBytesMaximum;
                        if (j3 < j4) {
                            break;
                        }
                        if (!this.streams.containsKey(Integer.valueOf(i))) {
                            throw new IOException("stream closed");
                        }
                        Intrinsics.checkNotNull(this, "");
                        wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
            }
            j -= j2;
            this.writer.data(z && j == 0, i, tTBaseActivity, iMin);
        }
    }

    public final void writeSynResetLater$okhttp(final int i, @NotNull final ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "");
        TaskQueue.execute$default(this.writerQueue, this.connectionName + '[' + i + "] writeSynReset", 0L, false, new Function0() { // from class: okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Http2Connection.writeSynResetLater$lambda$0(this.f$0, i, errorCode);
            }
        }, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeSynResetLater$lambda$0(Http2Connection http2Connection, int i, ErrorCode errorCode) {
        try {
            http2Connection.writeSynReset$okhttp(i, errorCode);
        } catch (IOException e) {
            http2Connection.failConnection(e);
        }
        return Unit.INSTANCE;
    }

    public final void writeSynReset$okhttp(int i, @NotNull ErrorCode errorCode) throws IOException {
        Intrinsics.checkNotNullParameter(errorCode, "");
        this.writer.rstStream(i, errorCode);
    }

    public final void writeWindowUpdateLater$okhttp(final int i, final long j) {
        TaskQueue.execute$default(this.writerQueue, this.connectionName + '[' + i + "] windowUpdate", 0L, false, new Function0() { // from class: okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Http2Connection.writeWindowUpdateLater$lambda$0(this.f$0, i, j);
            }
        }, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeWindowUpdateLater$lambda$0(Http2Connection http2Connection, int i, long j) {
        try {
            http2Connection.writer.windowUpdate(i, j);
        } catch (IOException e) {
            http2Connection.failConnection(e);
        }
        return Unit.INSTANCE;
    }

    public final void writePing(boolean z, int i, int i2) {
        try {
            this.writer.ping(z, i, i2);
        } catch (IOException e) {
            failConnection(e);
        }
    }

    public final void writePingAndAwaitPong() throws InterruptedException {
        writePing();
        awaitPong();
    }

    public final void flush() throws IOException {
        this.writer.flush();
    }

    public final void shutdown(@NotNull ErrorCode errorCode) throws IOException {
        Intrinsics.checkNotNullParameter(errorCode, "");
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                int i = this.lastGoodStreamId;
                Unit unit = Unit.INSTANCE;
                this.writer.goAway(i, errorCode, _UtilCommonKt.EMPTY_BYTE_ARRAY);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void failConnection(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        close$okhttp(errorCode, errorCode, iOException);
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            z = true;
        }
        http2Connection.start(z);
    }

    public final void start(boolean z) throws IOException {
        if (z) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            if (this.okHttpSettings.getInitialWindowSize() != 65535) {
                this.writer.windowUpdate(0, r9 - Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }
        }
        TaskQueue.execute$default(this.taskRunner.newQueue(), this.connectionName, 0L, false, this.readerRunnable, 6, null);
    }

    public final void setSettings(@NotNull Settings settings) throws IOException {
        Intrinsics.checkNotNullParameter(settings, "");
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    throw new ConnectionShutdownException();
                }
                this.okHttpSettings.merge(settings);
                Unit unit = Unit.INSTANCE;
            }
            this.writer.settings(settings);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendDegradedPingLater$lambda$1(Http2Connection http2Connection) {
        http2Connection.writePing(false, 2, 0);
        return Unit.INSTANCE;
    }

    public static final class Builder {
        private boolean client;
        public String connectionName;
        private FlowControlListener flowControlListener;
        private Listener listener;
        private int pingIntervalMillis;
        private PushObserver pushObserver;
        public BufferedSocket socket;
        private final TaskRunner taskRunner;

        public Builder(boolean z, @NotNull TaskRunner taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "");
            this.client = z;
            this.taskRunner = taskRunner;
            this.listener = Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = PushObserver.CANCEL;
            this.flowControlListener = FlowControlListener.None.INSTANCE;
        }

        public final boolean getClient$okhttp() {
            return this.client;
        }

        public final void setClient$okhttp(boolean z) {
            this.client = z;
        }

        public final TaskRunner getTaskRunner$okhttp() {
            return this.taskRunner;
        }

        public final BufferedSocket getSocket$okhttp() {
            BufferedSocket bufferedSocket = this.socket;
            if (bufferedSocket != null) {
                return bufferedSocket;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            return null;
        }

        public final void setSocket$okhttp(@NotNull BufferedSocket bufferedSocket) {
            Intrinsics.checkNotNullParameter(bufferedSocket, "");
            this.socket = bufferedSocket;
        }

        public final String getConnectionName$okhttp() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            return null;
        }

        public final void setConnectionName$okhttp(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.connectionName = str;
        }

        public final Listener getListener$okhttp() {
            return this.listener;
        }

        public final void setListener$okhttp(@NotNull Listener listener) {
            Intrinsics.checkNotNullParameter(listener, "");
            this.listener = listener;
        }

        public final PushObserver getPushObserver$okhttp() {
            return this.pushObserver;
        }

        public final void setPushObserver$okhttp(@NotNull PushObserver pushObserver) {
            Intrinsics.checkNotNullParameter(pushObserver, "");
            this.pushObserver = pushObserver;
        }

        public final int getPingIntervalMillis$okhttp() {
            return this.pingIntervalMillis;
        }

        public final void setPingIntervalMillis$okhttp(int i) {
            this.pingIntervalMillis = i;
        }

        public final FlowControlListener getFlowControlListener$okhttp() {
            return this.flowControlListener;
        }

        public final void setFlowControlListener$okhttp(@NotNull FlowControlListener flowControlListener) {
            Intrinsics.checkNotNullParameter(flowControlListener, "");
            this.flowControlListener = flowControlListener;
        }

        public final Builder socket(@NotNull BufferedSocket bufferedSocket, @NotNull String str) throws IOException {
            String str2;
            Intrinsics.checkNotNullParameter(bufferedSocket, "");
            Intrinsics.checkNotNullParameter(str, "");
            setSocket$okhttp(bufferedSocket);
            if (this.client) {
                str2 = _UtilJvmKt.okHttpName + ' ' + str;
            } else {
                str2 = "MockWebServer " + str;
            }
            setConnectionName$okhttp(str2);
            return this;
        }

        public final Builder listener(@NotNull Listener listener) {
            Intrinsics.checkNotNullParameter(listener, "");
            this.listener = listener;
            return this;
        }

        public final Builder pushObserver(@NotNull PushObserver pushObserver) {
            Intrinsics.checkNotNullParameter(pushObserver, "");
            this.pushObserver = pushObserver;
            return this;
        }

        public final Builder pingIntervalMillis(int i) {
            this.pingIntervalMillis = i;
            return this;
        }

        public final Builder flowControlListener(@NotNull FlowControlListener flowControlListener) {
            Intrinsics.checkNotNullParameter(flowControlListener, "");
            this.flowControlListener = flowControlListener;
            return this;
        }

        public final Http2Connection build() {
            return new Http2Connection(this);
        }
    }

    public final class ReaderRunnable implements Http2Reader.Handler, Function0<Unit> {
        private final Http2Reader reader;
        final /* synthetic */ Http2Connection this$0;

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int i, @NotNull String str, @NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, @NotNull String str2, int i2, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
            Intrinsics.checkNotNullParameter(str2, "");
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int i, int i2, int i3, boolean z) {
        }

        public ReaderRunnable(@NotNull Http2Connection http2Connection, Http2Reader http2Reader) {
            Intrinsics.checkNotNullParameter(http2Reader, "");
            this.this$0 = http2Connection;
            this.reader = http2Reader;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws Throwable {
            invoke2();
            return Unit.INSTANCE;
        }

        public final Http2Reader getReader$okhttp() {
            return this.reader;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, okhttp3.internal.http2.Http2Reader] */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2() throws Throwable {
            Throwable th;
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            IOException e = null;
            try {
                try {
                    this.reader.readConnectionPreface(this);
                    while (this.reader.nextFrame(false, this)) {
                    }
                    ErrorCode errorCode3 = ErrorCode.NO_ERROR;
                    try {
                        this.this$0.close$okhttp(errorCode3, ErrorCode.CANCEL, null);
                        errorCode = errorCode3;
                    } catch (IOException e2) {
                        e = e2;
                        ErrorCode errorCode4 = ErrorCode.PROTOCOL_ERROR;
                        Http2Connection http2Connection = this.this$0;
                        http2Connection.close$okhttp(errorCode4, errorCode4, e);
                        errorCode = http2Connection;
                        errorCode2 = this.reader;
                        _UtilCommonKt.closeQuietly(errorCode2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.this$0.close$okhttp(errorCode, errorCode2, e);
                    _UtilCommonKt.closeQuietly(this.reader);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th3) {
                th = th3;
                errorCode = errorCode2;
                this.this$0.close$okhttp(errorCode, errorCode2, e);
                _UtilCommonKt.closeQuietly(this.reader);
                throw th;
            }
            errorCode2 = this.reader;
            _UtilCommonKt.closeQuietly(errorCode2);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean z, int i, @NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity, int i2) throws IOException {
            Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
            if (this.this$0.pushedStream$okhttp(i)) {
                this.this$0.pushDataLater$okhttp(i, tTAppOpenAdTransActivity, i2, z);
                return;
            }
            Http2Stream stream = this.this$0.getStream(i);
            if (stream == null) {
                this.this$0.writeSynResetLater$okhttp(i, ErrorCode.PROTOCOL_ERROR);
                long j = i2;
                this.this$0.updateConnectionFlowControl$okhttp(j);
                tTAppOpenAdTransActivity.IAuthTabCallbackDefault(j);
                return;
            }
            stream.receiveData(tTAppOpenAdTransActivity, i2);
            if (z) {
                stream.receiveHeaders(Headers.EMPTY, true);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void headers(boolean z, int i, int i2, @NotNull List<Header> list) {
            Intrinsics.checkNotNullParameter(list, "");
            if (this.this$0.pushedStream$okhttp(i)) {
                this.this$0.pushHeadersLater$okhttp(i, list, z);
                return;
            }
            final Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                Http2Stream stream = http2Connection.getStream(i);
                if (stream != null) {
                    Unit unit = Unit.INSTANCE;
                    stream.receiveHeaders(_UtilJvmKt.toHeaders(list), z);
                    return;
                }
                if (http2Connection.isShutdown) {
                    return;
                }
                if (i <= http2Connection.getLastGoodStreamId$okhttp()) {
                    return;
                }
                if (i % 2 == http2Connection.getNextStreamId$okhttp() % 2) {
                    return;
                }
                final Http2Stream http2Stream = new Http2Stream(i, http2Connection, false, z, _UtilJvmKt.toHeaders(list));
                http2Connection.setLastGoodStreamId$okhttp(i);
                http2Connection.getStreams$okhttp().put(Integer.valueOf(i), http2Stream);
                TaskQueue.execute$default(http2Connection.taskRunner.newQueue(), http2Connection.getConnectionName$okhttp() + '[' + i + "] onStream", 0L, false, new Function0() { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Http2Connection.ReaderRunnable.headers$lambda$0$0(http2Connection, http2Stream);
                    }
                }, 6, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit headers$lambda$0$0(Http2Connection http2Connection, Http2Stream http2Stream) {
            try {
                http2Connection.getListener$okhttp().onStream(http2Stream);
            } catch (IOException e) {
                Platform.Companion.get().log("Http2Connection.Listener failure for " + http2Connection.getConnectionName$okhttp(), 4, e);
                try {
                    http2Stream.close(ErrorCode.PROTOCOL_ERROR, e);
                } catch (IOException unused) {
                }
            }
            return Unit.INSTANCE;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int i, @NotNull ErrorCode errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "");
            if (this.this$0.pushedStream$okhttp(i)) {
                this.this$0.pushResetLater$okhttp(i, errorCode);
                return;
            }
            Http2Stream http2StreamRemoveStream$okhttp = this.this$0.removeStream$okhttp(i);
            if (http2StreamRemoveStream$okhttp != null) {
                http2StreamRemoveStream$okhttp.receiveRstStream(errorCode);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(final boolean z, @NotNull final Settings settings) {
            Intrinsics.checkNotNullParameter(settings, "");
            TaskQueue.execute$default(this.this$0.writerQueue, this.this$0.getConnectionName$okhttp() + " applyAndAckSettings", 0L, false, new Function0() { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Http2Connection.ReaderRunnable.settings$lambda$0(this.f$0, z, settings);
                }
            }, 6, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit settings$lambda$0(ReaderRunnable readerRunnable, boolean z, Settings settings) {
            readerRunnable.applyAndAckSettings(z, settings);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v24 */
        /* JADX WARN: Type inference failed for: r0v25 */
        /* JADX WARN: Type inference failed for: r0v3, types: [T, okhttp3.internal.http2.Settings] */
        public final void applyAndAckSettings(boolean z, @NotNull Settings settings) {
            long initialWindowSize;
            int i;
            Http2Stream[] http2StreamArr;
            Settings settings2 = settings;
            Intrinsics.checkNotNullParameter(settings2, "");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Http2Writer writer = this.this$0.getWriter();
            final Http2Connection http2Connection = this.this$0;
            synchronized (writer) {
                synchronized (http2Connection) {
                    Settings peerSettings = http2Connection.getPeerSettings();
                    ?? r0 = settings2;
                    if (!z) {
                        Settings settings3 = new Settings();
                        settings3.merge(peerSettings);
                        settings3.merge(settings2);
                        r0 = settings3;
                    }
                    objectRef.element = r0;
                    initialWindowSize = r0.getInitialWindowSize() - peerSettings.getInitialWindowSize();
                    http2StreamArr = (initialWindowSize == 0 || http2Connection.getStreams$okhttp().isEmpty()) ? null : (Http2Stream[]) http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                    http2Connection.setPeerSettings((Settings) objectRef.element);
                    TaskQueue.execute$default(http2Connection.settingsListenerQueue, http2Connection.getConnectionName$okhttp() + " onSettings", 0L, false, new Function0() { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Http2Connection.ReaderRunnable.applyAndAckSettings$lambda$0$0$1(http2Connection, objectRef);
                        }
                    }, 6, null);
                    Unit unit = Unit.INSTANCE;
                }
                try {
                    http2Connection.getWriter().applyAndAckSettings((Settings) objectRef.element);
                } catch (IOException e) {
                    http2Connection.failConnection(e);
                }
                Unit unit2 = Unit.INSTANCE;
            }
            if (http2StreamArr != null) {
                for (Http2Stream http2Stream : http2StreamArr) {
                    synchronized (http2Stream) {
                        http2Stream.addBytesToWriteWindow(initialWindowSize);
                        Unit unit3 = Unit.INSTANCE;
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit applyAndAckSettings$lambda$0$0$1(Http2Connection http2Connection, Ref.ObjectRef objectRef) {
            http2Connection.getListener$okhttp().onSettings(http2Connection, (Settings) objectRef.element);
            return Unit.INSTANCE;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean z, final int i, final int i2) {
            if (!z) {
                TaskQueue taskQueue = this.this$0.writerQueue;
                String str = this.this$0.getConnectionName$okhttp() + " ping";
                final Http2Connection http2Connection = this.this$0;
                TaskQueue.execute$default(taskQueue, str, 0L, false, new Function0() { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Http2Connection.ReaderRunnable.ping$lambda$1(http2Connection, i, i2);
                    }
                }, 6, null);
                return;
            }
            Http2Connection http2Connection2 = this.this$0;
            synchronized (http2Connection2) {
                if (i == 1) {
                    http2Connection2.intervalPongsReceived++;
                } else if (i != 2) {
                    if (i == 3) {
                        http2Connection2.awaitPongsReceived++;
                        Intrinsics.checkNotNull(http2Connection2, "");
                        http2Connection2.notifyAll();
                    }
                    Unit unit = Unit.INSTANCE;
                } else {
                    http2Connection2.degradedPongsReceived++;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit ping$lambda$1(Http2Connection http2Connection, int i, int i2) {
            http2Connection.writePing(true, i, i2);
            return Unit.INSTANCE;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int i, @NotNull ErrorCode errorCode, @NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) {
            int i2;
            Object[] array;
            Intrinsics.checkNotNullParameter(errorCode, "");
            Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
            tTBaseLandingPageActivity.access100();
            Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                array = http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                http2Connection.isShutdown = true;
                Unit unit = Unit.INSTANCE;
            }
            for (Http2Stream http2Stream : (Http2Stream[]) array) {
                if (http2Stream.getId() > i && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.this$0.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int i, long j) {
            if (i == 0) {
                Http2Connection http2Connection = this.this$0;
                synchronized (http2Connection) {
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + j;
                    Intrinsics.checkNotNull(http2Connection, "");
                    http2Connection.notifyAll();
                    Unit unit = Unit.INSTANCE;
                }
                return;
            }
            Http2Stream stream = this.this$0.getStream(i);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(j);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int i, int i2, @NotNull List<Header> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.this$0.pushRequestLater$okhttp(i2, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pushRequestLater$lambda$1(Http2Connection http2Connection, int i, List list) {
        if (http2Connection.pushObserver.onRequest(i, list)) {
            try {
                http2Connection.writer.rstStream(i, ErrorCode.CANCEL);
                synchronized (http2Connection) {
                    http2Connection.currentPushRequests.remove(Integer.valueOf(i));
                    Unit unit = Unit.INSTANCE;
                }
            } catch (IOException unused) {
            }
        }
        return Unit.INSTANCE;
    }

    public final void pushHeadersLater$okhttp(final int i, @NotNull final List<Header> list, final boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        TaskQueue.execute$default(this.pushQueue, this.connectionName + '[' + i + "] onHeaders", 0L, false, new Function0() { // from class: okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Http2Connection.pushHeadersLater$lambda$0(this.f$0, i, list, z);
            }
        }, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pushHeadersLater$lambda$0(Http2Connection http2Connection, int i, List list, boolean z) {
        boolean zOnHeaders = http2Connection.pushObserver.onHeaders(i, list, z);
        if (zOnHeaders) {
            try {
                http2Connection.writer.rstStream(i, ErrorCode.CANCEL);
            } catch (IOException unused) {
            }
        }
        if (zOnHeaders || z) {
            synchronized (http2Connection) {
                http2Connection.currentPushRequests.remove(Integer.valueOf(i));
                Unit unit = Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    public final void pushDataLater$okhttp(final int i, @NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity, final int i2, final boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
        final TTBaseActivity tTBaseActivity = new TTBaseActivity();
        long j = i2;
        tTAppOpenAdTransActivity.IAuthTabCallbackStub(j);
        tTAppOpenAdTransActivity.read(tTBaseActivity, j);
        TaskQueue.execute$default(this.pushQueue, this.connectionName + '[' + i + "] onData", 0L, false, new Function0() { // from class: okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Http2Connection.pushDataLater$lambda$0(this.f$0, i, tTBaseActivity, i2, z);
            }
        }, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pushDataLater$lambda$0(Http2Connection http2Connection, int i, TTBaseActivity tTBaseActivity, int i2, boolean z) {
        try {
            boolean zOnData = http2Connection.pushObserver.onData(i, tTBaseActivity, i2, z);
            if (zOnData) {
                http2Connection.writer.rstStream(i, ErrorCode.CANCEL);
            }
            if (zOnData || z) {
                synchronized (http2Connection) {
                    http2Connection.currentPushRequests.remove(Integer.valueOf(i));
                    Unit unit = Unit.INSTANCE;
                }
            }
        } catch (IOException unused) {
        }
        return Unit.INSTANCE;
    }

    public final void pushResetLater$okhttp(final int i, @NotNull final ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "");
        TaskQueue.execute$default(this.pushQueue, this.connectionName + '[' + i + "] onReset", 0L, false, new Function0() { // from class: okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Http2Connection.pushResetLater$lambda$0(this.f$0, i, errorCode);
            }
        }, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pushResetLater$lambda$0(Http2Connection http2Connection, int i, ErrorCode errorCode) {
        Unit unit;
        http2Connection.pushObserver.onReset(i, errorCode);
        synchronized (http2Connection) {
            http2Connection.currentPushRequests.remove(Integer.valueOf(i));
            unit = Unit.INSTANCE;
        }
        return unit;
    }

    public static abstract class Listener {
        public static final Companion Companion = new Companion(null);
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public void onStream(Http2Stream http2Stream) throws IOException {
                Intrinsics.checkNotNullParameter(http2Stream, "");
                http2Stream.close(ErrorCode.REFUSED_STREAM, null);
            }
        };

        public void onSettings(@NotNull Http2Connection http2Connection, @NotNull Settings settings) {
            Intrinsics.checkNotNullParameter(http2Connection, "");
            Intrinsics.checkNotNullParameter(settings, "");
        }

        public abstract void onStream(@NotNull Http2Stream http2Stream) throws IOException;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.DEFAULT_SETTINGS;
        }
    }

    static {
        Settings settings = new Settings();
        settings.set(4, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        settings.set(5, Http2.INITIAL_MAX_FRAME_SIZE);
        DEFAULT_SETTINGS = settings;
    }

    public final int openStreamCount() {
        int size;
        synchronized (this) {
            size = this.streams.size();
        }
        return size;
    }

    public final Http2Stream getStream(int i) {
        Http2Stream http2Stream;
        synchronized (this) {
            http2Stream = this.streams.get(Integer.valueOf(i));
        }
        return http2Stream;
    }

    public final Http2Stream removeStream$okhttp(int i) {
        Http2Stream http2StreamRemove;
        synchronized (this) {
            http2StreamRemove = this.streams.remove(Integer.valueOf(i));
            Intrinsics.checkNotNull(this, "");
            notifyAll();
        }
        return http2StreamRemove;
    }

    public final void updateConnectionFlowControl$okhttp(long j) {
        synchronized (this) {
            WindowCounter.update$default(this.readBytes, j, 0L, 2, null);
            long unacknowledged = this.readBytes.getUnacknowledged();
            if (unacknowledged >= this.okHttpSettings.getInitialWindowSize() / 2) {
                writeWindowUpdateLater$okhttp(0, unacknowledged);
                WindowCounter.update$default(this.readBytes, 0L, unacknowledged, 1, null);
            }
            this.flowControlListener.receivingConnectionWindowChanged(this.readBytes);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void writePing() throws InterruptedException {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }

    public final void awaitPong() throws InterruptedException {
        synchronized (this) {
            while (this.awaitPongsReceived < this.awaitPingsSent) {
                Intrinsics.checkNotNull(this, "");
                wait();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void close$okhttp(@NotNull ErrorCode errorCode, @NotNull ErrorCode errorCode2, @Nullable IOException iOException) {
        int i;
        Object[] array;
        Intrinsics.checkNotNullParameter(errorCode, "");
        Intrinsics.checkNotNullParameter(errorCode2, "");
        if (!_UtilJvmKt.assertionsEnabled || !Thread.holdsLock(this)) {
            try {
                shutdown(errorCode);
            } catch (IOException unused) {
            }
            synchronized (this) {
                if (this.streams.isEmpty()) {
                    array = null;
                } else {
                    array = this.streams.values().toArray(new Http2Stream[0]);
                    this.streams.clear();
                }
                Unit unit = Unit.INSTANCE;
            }
            Http2Stream[] http2StreamArr = (Http2Stream[]) array;
            if (http2StreamArr != null) {
                for (Http2Stream http2Stream : http2StreamArr) {
                    try {
                        http2Stream.close(errorCode2, iOException);
                    } catch (IOException unused2) {
                    }
                }
            }
            try {
                this.writer.close();
            } catch (IOException unused3) {
            }
            try {
                this.socket.cancel();
            } catch (IOException unused4) {
            }
            this.writerQueue.shutdown();
            this.pushQueue.shutdown();
            this.settingsListenerQueue.shutdown();
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final boolean isHealthy(long j) {
        synchronized (this) {
            if (this.isShutdown) {
                return false;
            }
            if (this.degradedPongsReceived < this.degradedPingsSent) {
                if (j >= this.degradedPongDeadlineNs) {
                    return false;
                }
            }
            return true;
        }
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j = this.degradedPongsReceived;
            long j2 = this.degradedPingsSent;
            if (j < j2) {
                return;
            }
            this.degradedPingsSent = j2 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + 1000000000;
            Unit unit = Unit.INSTANCE;
            TaskQueue.execute$default(this.writerQueue, this.connectionName + " ping", 0L, false, new Function0() { // from class: okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Http2Connection.sendDegradedPingLater$lambda$1(this.f$0);
                }
            }, 6, null);
        }
    }

    public final void pushRequestLater$okhttp(final int i, @NotNull final List<Header> list) {
        Intrinsics.checkNotNullParameter(list, "");
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(i))) {
                writeSynResetLater$okhttp(i, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(i));
            TaskQueue.execute$default(this.pushQueue, this.connectionName + '[' + i + "] onRequest", 0L, false, new Function0() { // from class: okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Http2Connection.pushRequestLater$lambda$1(this.f$0, i, list);
                }
            }, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long _init_$lambda$0(Http2Connection http2Connection, long j) {
        boolean z;
        synchronized (http2Connection) {
            long j2 = http2Connection.intervalPongsReceived;
            long j3 = http2Connection.intervalPingsSent;
            if (j2 < j3) {
                z = true;
            } else {
                http2Connection.intervalPingsSent = j3 + 1;
                z = false;
            }
        }
        if (z) {
            http2Connection.failConnection(null);
            return -1L;
        }
        http2Connection.writePing(false, 1, 0);
        return j;
    }
}
